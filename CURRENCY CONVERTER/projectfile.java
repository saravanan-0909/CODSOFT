import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double USD = 1.0;
        double INR = 83.0;
        double EUR = 0.92;
        double GBP = 0.79;

        System.out.println("----- CURRENCY CONVERTER -----");
        System.out.println("Available Currencies:");
        System.out.println("1. USD");
        System.out.println("2. INR");
        System.out.println("3. EUR");
        System.out.println("4. GBP");

        System.out.print("Choose Base Currency (1-4): ");
        int baseChoice = sc.nextInt();

        System.out.print("Choose Target Currency (1-4): ");
        int targetChoice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double baseRate = 0, targetRate = 0;
        switch (baseChoice) {
            case 1: baseRate = USD; break;
            case 2: baseRate = INR; break;
            case 3: baseRate = EUR; break;
            case 4: baseRate = GBP; break;
            default:
                System.out.println("Invalid Base Currency!");
                return;
        }

        switch (targetChoice) {
            case 1: targetRate = USD; break;
            case 2: targetRate = INR; break;
            case 3: targetRate = EUR; break;
            case 4: targetRate = GBP; break;
            default:
                System.out.println("Invalid Target Currency!");
                return;
        }

        double convertedAmount = (amount / baseRate) * targetRate;

        String symbol = "";
        if (targetChoice == 1) symbol = "$";
        else if (targetChoice == 2) symbol = "₹";
        else if (targetChoice == 3) symbol = "€";
        else if (targetChoice == 4) symbol = "£";

        System.out.println("-------------------------------");
        System.out.println("Converted Amount: " + symbol + " " + convertedAmount);
        System.out.println("-------------------------------");

        sc.close();
    }
}
