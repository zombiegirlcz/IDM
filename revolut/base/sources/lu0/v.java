package lu0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f200012a;

    public v(int i) {
        this.f200012a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        int spanCount = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.f200012a;
        if (spanIndex == 0) {
            outRect.left = i;
        }
        if (childAdapterPosition < spanCount) {
            outRect.top = i;
        }
        outRect.right = i;
        outRect.bottom = i;
    }
}
