package mhe;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4l.j f205552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205553b;

    public f(z4l.j adapter, int i) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f205552a = adapter;
        this.f205553b = i;
    }

    public final boolean a(int i) {
        koi.j jVarA = this.f205552a.a(i);
        SmallStockCardDelegate.Model model = jVarA instanceof SmallStockCardDelegate.Model ? (SmallStockCardDelegate.Model) jVarA : null;
        return (model != null ? model.f53388p : null) instanceof j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) throws Throwable {
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            hx7.e.n(new IllegalArgumentException("GridLayoutManager is expected but instance of " + layoutManager + " is provided"));
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            z4l.j jVar = this.f205552a;
            if (childAdapterPosition < jVar.getItemCount() && a(childAdapterPosition)) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                int spanCount = gridLayoutManager.getSpanCount();
                GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
                int spanIndex = spanSizeLookup.getSpanIndex(childAdapterPosition, spanCount);
                int spanGroupIndex = spanSizeLookup.getSpanGroupIndex(childAdapterPosition, spanCount);
                int spanSize = spanSizeLookup.getSpanSize(childAdapterPosition);
                int width = ((gridLayoutManager.getWidth() - gridLayoutManager.getPaddingLeft()) - gridLayoutManager.getPaddingRight()) / spanCount;
                boolean z = parent.getLayoutDirection() == 1;
                int i2 = this.f205553b;
                float f = spanCount;
                int i3 = (int) (i2 - ((spanIndex * i2) / f));
                int i5 = (int) ((((spanIndex + 1) * i2) / f) + ((spanSize - 1) * width));
                if (z) {
                    outRect.left = i5;
                    outRect.right = i3;
                } else {
                    outRect.left = i3;
                    outRect.right = i5;
                }
                for (int i6 = childAdapterPosition - 1; -1 < i6 && a(i6); i6--) {
                    if (spanSizeLookup.getSpanGroupIndex(i6, spanCount) < spanGroupIndex) {
                        i = i2;
                        break;
                    }
                }
                i = i2 / 2;
                outRect.top = i;
                int itemCount = jVar.getItemCount();
                for (int i21 = childAdapterPosition + 1; i21 < itemCount && a(i21); i21++) {
                    if (spanSizeLookup.getSpanGroupIndex(i21, spanCount) > spanGroupIndex) {
                        return;
                    }
                }
                outRect.bottom = i2 / 2;
            }
        }
    }
}
