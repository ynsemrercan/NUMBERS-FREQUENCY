public class NumbersFrequency {

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        frekanslariBul(dizi);
    }

    public static void frekanslariBul(int[] dizi) {
        int[] tekrarSayilari = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            int frekans = 1;

            // Daha önce zaten saydığımız elemanları tekrar saymamak için kontrol ediyoruz.
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] == eleman) {
                    frekans++;
                }
            }

            // Eğer eleman daha önce sayılmadıysa, frekansını tekrar sayıları dizisine ekliyoruz.
            if (tekrarSayilari[i] == 0) {
                tekrarSayilari[i] = frekans;
                System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
            }
        }
    }
}
