class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        int i=0;
        int j=0;

        while(i < word.length() && j < abbr.length() ){
            char w_c=word.charAt(i);
            char a_c=abbr.charAt(j);

            if(Character.isLetter(a_c)){
                if(w_c != a_c){
                    return false;
                }
                 i++;
                 j++;
            }
            else{
                if(a_c=='0') return false;
                
                int num=0;

                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){

                    num=num*10+ (abbr.charAt(j)-'0');
                    j++;

                }
                i=i+num;
            }     
                  

            
    }   return i==word.length() && j==abbr.length();

       

        }
    }
