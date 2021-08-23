import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner sc= new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz: ");
        mat = sc.nextInt();
        System.out.print("Fizik Notunu Giriniz: ");
        fizik = sc.nextInt();
        System.out.print("Türkçe Notunu Giriniz: ");
        turkce = sc.nextInt();
        System.out.print("Kimya Notunu Giriniz: ");
        kimya = sc.nextInt();
        System.out.print("Müzik Notunu Giriniz: ");
        muzik = sc.nextInt();
        int [] notlar = new int[5];
        notlar[0]= mat;
        notlar[1]= fizik;
        notlar[2]= turkce;
        notlar[3]= kimya;
        notlar[4]= muzik;
        int total=0,sayac=0;
        for (int nots : notlar){
            if (nots>=0 && nots<=100){
                total = total + nots;
                sayac=sayac+1;
            }else{
                System.out.println("Geçersiz not girişi ortalamaya dahil edilmemiştir.");
            }
        }
        double ort = total/sayac;
        if (ort<55){
            System.out.println("Sınıfta Kaldınız!");
        }else {
            System.out.println("Tebrikler Sınıfı Geçtiniz.");
        }
        System.out.println("Ortalamanız: " + ort);
    }
}
