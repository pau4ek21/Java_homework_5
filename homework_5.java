

public class homework_5 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,1}; // 0,0,0,0,0
        int[] nums2 = {3,2,1,4,7}; // 0,0,0,0,0

        Solution solution = new Solution();
        int maxLength = solution.findLength(nums1, nums2);

        System.out.println("Max Length: " + maxLength);
    }
}

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        int max = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max;
    }
}