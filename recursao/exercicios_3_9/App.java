public class App{

    //pre: exp >=0
    public static int potencia(int base, int exp){
        if(exp == 0){
            return 1;
        }
        if(exp == 1){
            return base;
        }
        else{
            return base*potencia(base,exp-1);
        }
    }
    public static void inverte(int[] v){
        inverte(v, 0, v.length-1);
    }
    private static void inverte(int[] v, int start, int end){
        if(start>=end){
            return;
        }
        int aux = v[start];
        v[start] = v[end];
        v[end] = aux;
        start++;
        end--;
        inverte(v, start, end);
    }
    private static void escreveArray(int[] v){
        for(int i: v){
            System.out.print(i + ", ");
        }
        System.out.println();   
    }
    public static int soma(int[] v){
        return soma(v, v.length-1, 0);
    }
    
    private static int soma(int[] v, int idx, int soma){
        if(idx == 0){
            return v[idx];
        }
        soma += v[idx];
        return v[idx] + soma(v, idx-1, soma);
    }
    

    /////////////////////////////////////////////
    public static boolean isPalindromo(String s){
        s = retiraEspaco(s);
        return isPalindromo(s, 0, s.length()-1);
    }

    private static String retiraEspaco(String s){
        String newString = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                newString = newString+s.charAt(i);
            }
        }
        return newString;
    }
    private static boolean isPalindromo(String s, int start, int end){
        if(start > end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        start++;
        end--;
        return isPalindromo(s, start, end);
    }

    public static void main(String[] args){
       /*  System.out.println(" 3 ^4 = " + potencia(3,4));
        System.out.println("2 ^ 5 = " + potencia(2,5));*/
        int[] v = new int[]{1,3,5,7,9,11};
        escreveArray(v);
        inverte(v);
        escreveArray(v);
        int soma = soma(v);
        System.out.print(soma);
        String s = "renn    er";
        System.out.println(isPalindromo(s));

}}