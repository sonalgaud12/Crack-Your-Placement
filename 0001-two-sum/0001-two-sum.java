class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int res[] = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(mp.containsKey(target-nums[i])){
                res[0] =i;
                res[1] = mp.get(target-nums[i]);
                
                return res;
            }
            mp.put(nums[i], i);
            
            
        }
        return res;
    }
}