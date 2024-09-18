class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start filling nums1 from the last index
        int i = m - 1;  // Pointer for the last element in the valid part of nums1
        int j = n - 1;  // Pointer for the last element in nums2
        int k = m + n - 1;  // Pointer for the last position in nums1
        
        // While there are elements in both nums1 and nums2
        while (i >= 0 && j >= 0) {
            // Place the larger element at the end of nums1
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
        // No need to copy nums1's remaining elements, since they are already in place
    }
}
