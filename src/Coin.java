import java.util.Scanner;
public class Coin {
    public static void main(String[] args) {
      /*  int coin10 =100,coin5=100,coin1=100;
        int money, remain;
        remain = money = coin10 = coin5 = coin1 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your money:");
        money = scan.nextInt();
        coin10 = money/10;
        remain = money%10;
        coin5=remain/5;
        remain = remain%5;
        coin1=remain/1;
        remain=remain%1;*/
        int money ;
        while(true){
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("welcome to coin exchange program Every Coin have 100 coins");
                System.out.print("Put the money you want to exchange coins,put 0 to stop program : ");
                money=scan.nextInt();
                if (money>0){
                    break;
                }else System.out.println("Stop");
            }
            catch (Exception e){}
        }
        int[] coin = new int[3];
        int[] numcoin=new int[]{10,5,1};
        int[] totalcoin={100,100,100};
        for (int i= 0; i < coin.length; i++) {
            coin[i] = money/numcoin[i];
            money = money%numcoin[i];
        }
        totalcoin[0]-=coin[0];
        totalcoin[1]-=coin[1];
        totalcoin[2]-=coin[2];

        System.out.println("10 is : " + coin[0]);
        System.out.println("5 is : " + coin[1]);
        System.out.println("1 is : " + coin[2]);
        System.out.println("Remain Coin , 10 Still have "+totalcoin[0]+" Coins || 5 Still have "+totalcoin[1]+ " Coins || 1 Still have "+totalcoin[2]+" Coins.");
    }
}
