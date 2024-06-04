class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> out = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= max){
                out.add(true);
            }else{
                out.add(false);
            }
        }
        return out;
    }
}
