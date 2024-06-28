import java.io.*; //import java input output
import java.util.*; //import java util
public class BankingSimulator
{
    public static int savings = 3000; //inital savings amount
    public static int checking = 650; //initial checking amount
    
    public static void depositSavings() //adds amount to savings depending on the amount inputed to deposit. Then tells the total savings amount to user.
    {
        Scanner kbReader = new Scanner(System.in); 
        
        System.out.print("You chose to make a deposit to savings. How much would you like to deposit? ");
        int savingDeposit = kbReader.nextInt();
        savings = savings + savingDeposit;
        
        System.out.println("Your total in savings is $" + savings);
    }
    
    public static void depositChecking() //adds amount to checking depending on the amount inputed to deposit. Then tells the total checking amount to user.
    {
        Scanner kbReader = new Scanner(System.in);
        
        System.out.print("You chose to make a deposit to savings. How much would you like to deposit? ");
        int checkingDeposit = kbReader.nextInt();
        checking = checking + checkingDeposit;
        
        System.out.println("Your total in checking is $" + checking);
    }
    
    public static void withdrawalSavings() //removes amount from savings depending on the amount inputed to withdrawal. Then tells the total savings amount to user.
    {
        Scanner kbReader = new Scanner(System.in);
        
        System.out.print("You chose to make a withdrawal from savings. How much would you like to withdrawal? ");
        int savingWithdrawal = kbReader.nextInt();
        savings = savings - savingWithdrawal;
        
        System.out.println("Your total in savings is $" + savings);
    }
    
    public static void withdrawalChecking() //removes amount from checking depending on the amount inputed to withdrawal. Then tells the total checkign amount to user.
    {
        Scanner kbReader = new Scanner(System.in);
        
        System.out.print("You chose to make a withdrawal from checking. How much would you like to withdrawal? ");
        int checkingWithdrawal = kbReader.nextInt();
        checking = checking - checkingWithdrawal;
        
        System.out.println("Your total in checking is $" + checking);
    }
    
    public static void transferSavingsToChecking() //transfers money from savings to checking based on the amount to transfer entered by user. Then tells the total amount in checking and savings.
    {
        Scanner kbReader = new Scanner(System.in);
        
        System.out.print("Your current balance in savings is $" + savings + ". How much do you want to transfer? ");
        int savingTransfer = kbReader.nextInt();
        savings = savings - savingTransfer;
        checking = checking + savingTransfer;
        
        System.out.println("Your total in savings is $" + savings);
        System.out.println("Your total in checking is $" + checking);
    }
    
    public static void main(String args[]) 
    {
        
        Scanner kbReader = new Scanner(System.in); //creates a new scanner
        
        char anotherTransaction = 'Y'; //initial choice is yes
        do
        {
        System.out.println("What do wish to do today?"); //asks what to do
        System.out.println("1 for deposit to savings\n2 for deposit to checking\n3 for withdraw from savings\n4 for withdraw from checking\n5 for transfer funds from savings to checking"); //instructions
        int choice = kbReader.nextInt(); //choice is next char
        
        if (choice == 1) //if choice is 1
        {
            depositSavings(); //go to method
    
            System.out.print("Would you like another transaction?"); //would they like to repeat
            anotherTransaction = kbReader.next().charAt(0); //next char is choice
        }
        else if (choice == 2) //if choice is 2
        {
            depositChecking(); //go to method
            
            System.out.print("Would you like another transaction?"); //would they like to repeat
            anotherTransaction = kbReader.next().charAt(0); //next char is choice
        }
        else if (choice == 3) //if choice is 3
        {
            withdrawalSavings(); //go to method
            
            System.out.print("Would you like another transaction?"); //would they like to repeat
            anotherTransaction = kbReader.next().charAt(0); //next char is choice
        }
        else if (choice == 4) //if choice is 4
        {
            withdrawalChecking(); //go to method
            
            System.out.print("Would you like another transaction?"); //would they like to repeat
            anotherTransaction = kbReader.next().charAt(0); //next char is choice
        }
        else if (choice == 5) //if choice is 5
        {
            transferSavingsToChecking(); //go to method
            
            System.out.print("Would you like another transaction?"); //would they like to repeat
            anotherTransaction = kbReader.next().charAt(0); //next char is choice
        }
        else //if choice isn't an option
        {
            System.out.println("That isn't an option. Please try again. "); //not a number choice
            System.out.print("Would you like another transaction?"); //would they like to repeat
            anotherTransaction = kbReader.next().charAt(0); //next char is choice
        }
    } while (anotherTransaction == 'Y'); //repeat while choice is Y
    }
}
/* Sample Output
What do wish to do today?
1 for deposit to savings
2 for deposit to checking
3 for withdraw from savings
4 for withdraw from checking
5 for transfer funds from savings to checking
1
You chose to make a deposit to savings. How much would you like to deposit? 1000
Your total in savings is $4000
Would you like another transaction?Y
What do wish to do today?
1 for deposit to savings
2 for deposit to checking
3 for withdraw from savings
4 for withdraw from checking
5 for transfer funds from savings to checking
1
You chose to make a deposit to savings. How much would you like to deposit? 400
Your total in savings is $4400
Would you like another transaction?Y
What do wish to do today?
1 for deposit to savings
2 for deposit to checking
3 for withdraw from savings
4 for withdraw from checking
5 for transfer funds from savings to checking
5
Your current balance in savings is $4400. How much do you want to transfer? 1400
Your total in savings is $3000
Your total in checking is $2050
Would you like another transaction?N
 */
