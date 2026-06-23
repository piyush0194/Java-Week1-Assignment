import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the table number");
        int number = sc.nextInt();
        for (int i =0;i<=10;i++) {
            int multiply = number*i;
             System.out.println(number + "*" +"i" + "="+ multiply  );
        }
        sc.close();
       
    }
}
