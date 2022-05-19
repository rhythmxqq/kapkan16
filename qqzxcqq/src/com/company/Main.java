package com.company;

public class Main {
    /*
    Задание на 16 работу. Создать первый класс вычисляющий значение выражения a * b^c.
Создать второй класс с аналогичной структурой, что и у первого.
Создать объект первого класса.
Переконвертировать объект первого класса в объект второго класса.
Через переконвертированный объект получить значение выражения.
     */
    static class Pervich{
    int a;
    int b;
    int c;
    public Pervich(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void virazh(){
        int resault = (int) (Math.pow(b,c) * a);
    }
}
@FunctionalInterface
interface  Converter <T>{
   Vtorich convert (T zxc);
}
static class Vtorich{
    int a;
    int b;
    int c;
    public Vtorich(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int virazh(){
        int resault = (int) (Math.pow(b,c) * a);
        return resault;
    }
}
    public static void main(String[] args) {
      Pervich qq = new Pervich(6,7,8);
      Converter <Pervich> convertertt = x ->  new Vtorich(x.a,x.b,x.c);
      Vtorich clown = convertertt.convert(qq);
      System.out.println(clown.virazh());
    }
}
