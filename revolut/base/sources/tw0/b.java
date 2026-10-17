package tw0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f274790c;

    public /* synthetic */ b(int i, int i2, int i3) {
        this(i, i2, (i3 & 8) != 0 ? null : 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int spanCount;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Integer num = this.f274790c;
        if (num != null) {
            spanCount = num.intValue();
        } else {
            RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
            Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            childAdapterPosition = parent.getChildLayoutPosition(view);
        }
        int i = childAdapterPosition % spanCount;
        boolean z = parent.getLayoutDirection() == 1;
        float f = spanCount;
        int i2 = (int) ((i * r2) / f);
        int i3 = (int) (this.f274788a - (((i + 1) * r2) / f));
        if (childAdapterPosition >= spanCount) {
            outRect.top = this.f274789b;
        }
        if (z) {
            outRect.left = i3;
            outRect.right = i2;
        } else {
            outRect.left = i2;
            outRect.right = i3;
        }
    }

    public b(int i, int i2, Integer num) {
        this.f274788a = i;
        this.f274789b = i2;
        this.f274790c = num;
    }
}
