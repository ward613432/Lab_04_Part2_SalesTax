import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double taxedPrice;
        int price;

        System.out.println("What is the price of your purchase?");
        price = scanner.nextInt();
        taxedPrice = price + ((double) price * .05f);
        System.out.printf("Your new sales price is: $%.2f%n", taxedPrice);
    }
}