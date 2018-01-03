public class Operator{
    public static void main (String[] args){

        System.out.println("Penjumlahan");

        // tambah langsung
        Integer value = 10 + 2;
        System.out.println("Jumlah 10 + 2 = " +value);

        // antar var
        Integer value1 = 5;
        Integer value2 = 6;        
        System.out.println("Jumlah 5 + 6 = " + (value1  + value2));

        System.out.println("Pengurangan");

        // kurang langsung
        Integer val = 5 - 2;
        System.out.println("Hasil 5 - 2 adalah = " +val);

        // antar var
        Integer val1 = 90;
        Integer val2 = 87;        
        System.out.println("Hasil " +val1+ " - " +val2+ " = " + (val1  - val2));

        System.out.println("Perkalian");

        // kali langsung
        Integer ValKali = 5 * 2;
        System.out.println("Hasil 5 x 2 adalah = " +ValKali);

        // antar var
        Integer ValKali1 = 5;
        Integer ValKali2 = 2;        
        System.out.println("Hasil " +ValKali1+ " * " +ValKali2+ " = " + (ValKali1  * ValKali2));

        System.out.println("Pembagian");

        // bagi langsung
        Integer ValBagi = 5 * 2;
        System.out.println("Hasil 5 x 2 adalah = " +ValBagi);

        // antar var
        Integer ValBagi1 = 10;
        Integer ValBagi2 = 2;        
        System.out.println("Hasil " +ValBagi1+ " / " +ValBagi2+ " = " + (ValBagi1  / ValBagi2));

        System.out.println("Perbandingan");
        
        // Perbandingan
        Integer test = 10 - 20;        
        System.out.println("Apakah 10 - 20 = -10 ? " + (test == -10));
    }
}