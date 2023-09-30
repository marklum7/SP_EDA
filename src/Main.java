public class Main {
    public static void main(String[] args) {
        int money = 15;
        int wrap=0;
        int sum=0;
        while (money>0){
            sum+=1;
            money-=1;
            wrap+=1;
            if (wrap==3){
                sum+=1;
                wrap=1;
            }
        }
        System.out.println(sum);


    }
}