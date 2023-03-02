import java.util.*;
class ATM{
   public static void main(String[] args) {
       int balance = 20000;
       int withdraw = 0, deposit = 0;
       Scanner obj = new Scanner(System.in);
       while(true)
       {
         System.out.println("\n1. Current Balance");
         System.out.println("2. Withdraw");
         System.out.println("3. Deposit");
         System.out.println("4. Exit");
         System.out.println("Enter your choice: ");
         int a = obj.nextInt();
         switch(a){
                 case 1:
                 System.out.println("Current Balance: "+balance+"\n");
                 break;
                 
                 case 2:
                 System.out.println("Current Balance: "+balance);
                 System.out.println("Enter ammount to withdraw: ");
                 withdraw = obj.nextInt();
                 if(withdraw > balance)
                 {
                     System.out.println("Withdraw ammount greater then current balance.\n");
                 } else
                 {
                 balance -= withdraw;
                 System.out.println("Current Balance: "+balance+"\n");
                 }
                 break;
                 
                 case 3: 
                 System.out.println("Enter ammount to deposit: ");
                 deposit = obj.nextInt();
                 balance += deposit;
                 System.out.println("Current Balance: "+balance);
                 break;
                 
                 case 4:
                 System.out.print("exiting");
                 break;
         }
       }
   }
}
