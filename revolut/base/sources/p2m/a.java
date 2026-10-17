package p2m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f232541a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f232542b = (int) TypedValue.applyDimension(1, 10, Resources.getSystem().getDisplayMetrics());

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.f232541a;
        int i2 = childAdapterPosition % i;
        int i3 = this.f232542b;
        outRect.left = i3 - ((i2 * i3) / i);
        outRect.right = ((i2 + 1) * i3) / i;
        if (childAdapterPosition < i) {
            outRect.top = i3;
        }
        outRect.bottom = i3;
    }
}
