class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
        {
            return res;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode cur = q.poll();
                if(i==0)
                {
                    res.add(cur.val);
                }
                if(cur.right!=null)
                {
                    q.offer(cur.right);
                }
                if(cur.left!=null)
                {
                    q.offer(cur.left);
                }
            }
        }
        return res;
    }
}
