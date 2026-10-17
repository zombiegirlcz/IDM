package xq0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f308046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f308047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f308048c;
    public final int d;

    public k(int i, int i2, l spaceType, int i3) {
        Intrinsics.checkNotNullParameter(spaceType, "spaceType");
        this.f308046a = i;
        this.f308047b = i2;
        this.f308048c = spaceType;
        this.d = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = parent.getLayoutDirection() == 1;
        int i = j.f308045a[this.f308048c.ordinal()];
        int measuredWidth = this.f308046a;
        int i2 = this.d;
        if (i == 1) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i3 = this.f308047b;
            boolean z3 = childAdapterPosition % i3 == 0;
            RecyclerView.Adapter adapter = parent.getAdapter();
            boolean z4 = (adapter != null ? adapter.getItemCount() : 0) - 1 == childAdapterPosition;
            int i5 = z3 ? i2 : 0;
            if (z4) {
                int i6 = (i3 - ((childAdapterPosition + 1) % i3)) % i3;
                measuredWidth = (i6 != 0 ? ((((((parent.getMeasuredWidth() - parent.getPaddingStart()) - parent.getPaddingEnd()) - (i2 * 2)) - ((i3 - 1) * measuredWidth)) / i3) + measuredWidth) * i6 : 0) + i2;
            }
            if (z) {
                outRect.left = measuredWidth;
                outRect.right = i5;
                return;
            } else {
                outRect.left = i5;
                outRect.right = measuredWidth;
                return;
            }
        }
        if (i == 2) {
            int i21 = measuredWidth / 2;
            outRect.left = i21;
            outRect.right = i21;
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int childAdapterPosition2 = parent.getChildAdapterPosition(view);
        boolean z6 = childAdapterPosition2 == 0;
        RecyclerView.Adapter adapter2 = parent.getAdapter();
        boolean z11 = (adapter2 != null ? adapter2.getItemCount() : 0) - 1 == childAdapterPosition2;
        int i22 = z6 ? i2 : 0;
        if (z11) {
            measuredWidth = i2;
        }
        if (z) {
            outRect.left = measuredWidth;
            outRect.right = i22;
        } else {
            outRect.left = i22;
            outRect.right = measuredWidth;
        }
    }
}
