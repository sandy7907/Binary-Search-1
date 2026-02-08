class RotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid;
        while(low <= high) {
            mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid;

            if(nums[low] <= nums[mid]) { // LSA
                if(nums[low] <= target && target < nums[mid]) { // Target lies in left side of array
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // RSA
                if(nums[mid] < target && target <= nums[high]) { // Target lies in right side of array
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}