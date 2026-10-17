package sq0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f264974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f264975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f264976c;

    public c(int i, int i2) {
        this.f264974a = i;
        this.f264975b = i2;
        this.f264976c = new Rect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        koi.j jVar;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = parent.findContainingViewHolder(view);
        koi.b bVar = viewHolderFindContainingViewHolder instanceof koi.b ? (koi.b) viewHolderFindContainingViewHolder : null;
        if (bVar == null || (jVar = bVar.e) == null) {
            return;
        }
        o31.c cVar = jVar instanceof o31.c ? (o31.c) jVar : null;
        if (cVar != null) {
            p31.c f53390r = cVar.getF52409s();
            if (f53390r != null) {
                f53390r.h(outRect, view, parent, state);
            }
            p31.c f53391s = cVar.getF52410t();
            if (f53391s != null) {
                f53391s.j(outRect, view, parent, state);
            }
            p31.c f53392t = cVar.getU();
            if (f53392t != null) {
                f53392t.l(outRect, view, parent, state);
            }
            p31.c u = cVar.getV();
            if (u != null) {
                u.g(outRect, view, parent, state);
            }
            if (view.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
                Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
                int spanCount = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
                if (layoutParams2.isFullSpan()) {
                    return;
                }
                boolean z = layoutParams2.getSpanIndex() == 0;
                boolean z3 = layoutParams2.getSpanIndex() == spanCount - 1;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iW = kli.a.w(this.f264974a, context);
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iW2 = kli.a.w(this.f264975b, context2);
                outRect.top += iW;
                outRect.bottom += iW;
                outRect.left += z ? iW2 : iW;
                int i = outRect.right;
                if (z3) {
                    iW = iW2;
                }
                outRect.right = i + iW;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        canvas.save();
        int paddingLeft = parent.getPaddingLeft();
        int paddingTop = parent.getPaddingTop();
        int width = parent.getWidth() - parent.getPaddingRight();
        int height = parent.getHeight() - parent.getPaddingBottom();
        Rect rect = this.f264976c;
        rect.set(paddingLeft, paddingTop, width, height);
        canvas.clipRect(rect);
        d.a(parent, new o31.a(canvas, parent, state, 2));
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        canvas.save();
        int paddingLeft = parent.getPaddingLeft();
        int paddingTop = parent.getPaddingTop();
        int width = parent.getWidth() - parent.getPaddingRight();
        int height = parent.getHeight() - parent.getPaddingBottom();
        Rect rect = this.f264976c;
        rect.set(paddingLeft, paddingTop, width, height);
        canvas.clipRect(rect);
        d.a(parent, new o31.a(canvas, parent, state, 3));
        canvas.restore();
    }

    public c() {
        this(R$attr.uikit_dp4, R$attr.uikit_dp16);
    }
}
