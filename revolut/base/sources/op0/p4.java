package op0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p4 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f227383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f227384b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f227385c = 3;

    public p4(int i) {
        this.f227383a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || (adapter = parent.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        int i = this.f227384b;
        int i2 = childAdapterPosition % i;
        int i3 = this.f227383a;
        if (i2 != 0) {
            outRect.top = i3;
        }
        int i5 = childAdapterPosition / i;
        int i6 = this.f227385c;
        int i21 = i5 % i6;
        boolean z = i5 == (((itemCount + i) - 1) / i) - 1;
        if (parent.getLayoutDirection() == 1) {
            if (i21 != 0) {
                outRect.right = i3;
            }
            if (i21 != i6 - 1 || z) {
                return;
            }
            outRect.left = i3;
            return;
        }
        if (i21 != 0) {
            outRect.left = i3;
        }
        if (i21 != i6 - 1 || z) {
            return;
        }
        outRect.right = i3;
    }
}
