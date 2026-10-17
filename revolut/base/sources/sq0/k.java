package sq0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f264988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f264989b;

    public k(int i, int i2) {
        this.f264988a = i;
        this.f264989b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            boolean z = childAdapterPosition == 0;
            boolean z3 = childAdapterPosition == itemCount + (-1);
            int i = this.f264988a;
            if (z) {
                outRect.left = i;
                return;
            }
            int i2 = this.f264989b;
            if (z3 && itemCount > 1) {
                outRect.left = i2;
                outRect.right = i;
            } else if (z3) {
                outRect.right = i;
            } else {
                outRect.left = i2;
            }
        }
    }
}
