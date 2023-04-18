public class Result extends Student implements Exam{

    Result(String name, String branch, String batch, String PRN, int S1, int S2, int S3, int S4, int S5)
    {
        super(name, branch, batch, PRN, S1, S2, S3, S4, S5);
    }

    public int calculatePercent(){
        return (Sub1 +Sub2 + Sub3 + Sub4 + Sub5)/5;
    }

    public void show(){
        display();
        System.out.println("Percentage: " + calculatePercent()+"%");
    }

    public static void main(String[] args) {
        Result pr = new Result("Yoginii","AIML","2021","114",80,82,89,75,80);

        pr.show();
    }
}