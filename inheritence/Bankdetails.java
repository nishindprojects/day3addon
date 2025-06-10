package day4;
class SbiAcc{
    private String Accholder;
    private int Balance;
    SbiAcc(String Accholder , int Balance){
        this.Accholder=Accholder;
        this.Balance=Balance;
    }
    public String getAccholder() {
        return Accholder;
    }
    public int getBalance() {
        return Balance;
    }
    public void Deposit(int dep){
        if(Balance > 0){
            Balance += dep;
        System.out.println("Deposit Amount:"+dep);
        System.out.println("Now current Balance:"+Balance);
        }
    }
        public void setAccholder(String Accholder) {
            this.Accholder=Accholder;
        } 
        }
        public class Bankdetails{
            public static void main(String args[]) {
            SbiAcc ac=new SbiAcc("jack",3000);
            System.out.println("Account Holder Name"+ac.getAccholder());
            ac.setAccholder("Raj");
            System.out.println("update account:"+ac.getAccholder());
            System.out.println("Balance"+ac.getBalance());
            ac.Deposit(30000);
            }
            }
    