
public class Account {

    private int accountNumber; // account number
    private int pin; // PIN for authentication
    private double availableBalance; // funds available for withdrawal
    private double totalBalance; // funds available & pending deposits
    private boolean blocked;
    private boolean admin;

    // Account constructor initializes attributes
    public Account(int theAccountNumber, int thePIN,
            double theAvailableBalance, double theTotalBalance, boolean admin) {
        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
        if (admin) {
            blocked = false;
        } else {
            blocked = true;
        }

        this.admin = admin;

    }

    // determines whether a user-specified PIN matches PIN in Account
    public boolean validatePIN(int userPIN) {
        if (userPIN == pin) {
            return true;
        } else {
            return false;
        }
    }

    // returns available balance
    public double getAvailableBalance() {
        return availableBalance;
    }

    // returns the total balance
    public double getTotalBalance() {
        return totalBalance;
    }

    public void credit(double amount) {
        availableBalance -= amount;
        totalBalance -= amount;
    }

    public void debit(double amount) {
        totalBalance += amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void unblock() {
        blocked = false;
    }

    public void add() {
        
    }
}
