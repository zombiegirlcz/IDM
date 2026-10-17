package goi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.UIKitRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145167a = ((Boolean) jo0.g.f176833q.getValue()).booleanValue();

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        koi.j jVar;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f145167a && (parent instanceof UIKitRecyclerView) && (viewHolderFindContainingViewHolder = parent.findContainingViewHolder(view)) != null) {
            koi.b bVar = viewHolderFindContainingViewHolder instanceof koi.b ? (koi.b) viewHolderFindContainingViewHolder : null;
            if (bVar == null || (jVar = bVar.e) == null || !(jVar instanceof ny0.h) || ((ny0.h) jVar).getF57232a()) {
                return;
            }
            int i = outRect.left;
            int i2 = ((UIKitRecyclerView) parent).f98533b.f220609g;
            outRect.left = i - (i2 == Integer.MIN_VALUE ? 0 : i2);
            int i3 = outRect.right;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            outRect.right = i3 - i2;
        }
    }
}
