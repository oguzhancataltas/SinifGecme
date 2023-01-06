import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double average;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = scan.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = scan.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = scan.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = scan.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = scan.nextInt();

        mat = (mat < 0 || mat > 100) ? 0: mat;
        fizik = (fizik < 0 || fizik > 100) ? 0: fizik;
        turkce = (turkce < 0 || turkce > 100) ? 0: turkce;
        kimya = (kimya < 0 || kimya > 100) ? 0: kimya;
        muzik = (muzik < 0 || muzik > 100) ? 0: muzik;

        average = (mat + fizik + turkce + kimya + muzik) / 5;

        if (average >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz!");
        }
        else {
            System.out.println("Not ortalamanız Düşük!!! Sınıfta Kaldınız!!!");
        }
        System.out.println("Not Ortalamanız : " + average);

    }
}
