package o31;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import koi.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f221677a = new Rect();

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        j jVar;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = parent.findContainingViewHolder(view);
        koi.b bVar = viewHolderFindContainingViewHolder instanceof koi.b ? (koi.b) viewHolderFindContainingViewHolder : null;
        if (bVar == null || (jVar = bVar.e) == null) {
            return;
        }
        c cVar = jVar instanceof c ? (c) jVar : null;
        if (cVar != null) {
            p31.c f51843r = cVar.getF53461r();
            if (f51843r != null) {
                f51843r.h(outRect, view, parent, state);
            }
            p31.c f51844s = cVar.getF53462s();
            if (f51844s != null) {
                f51844s.j(outRect, view, parent, state);
            }
            p31.c f51845t = cVar.getF53463t();
            if (f51845t != null) {
                f51845t.l(outRect, view, parent, state);
            }
            p31.c u = cVar.getU();
            if (u != null) {
                u.g(outRect, view, parent, state);
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
        Rect rect = this.f221677a;
        rect.set(paddingLeft, paddingTop, width, height);
        canvas.clipRect(rect);
        n31.a.a(parent, new a(canvas, parent, state, 1));
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
        Rect rect = this.f221677a;
        rect.set(paddingLeft, paddingTop, width, height);
        canvas.clipRect(rect);
        n31.a.a(parent, new a(canvas, parent, state, 0));
        canvas.restore();
    }
}
