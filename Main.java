public class Main {
    public static void main(String[] args){
        Account account=new Account( "Om Prakash Pant", 100000);
        double finalAmount=account.depositAmountToAccount(10000);
        System.out.println("Your total balance after deposit:: "+finalAmount);
        double finalAmount1=account.withdrawAmountFromAccount(20000);
        System.out.println("Your total balance after withdraw:: "+finalAmount1);
        account.displayAccountNameAndAmount();
    }
}
