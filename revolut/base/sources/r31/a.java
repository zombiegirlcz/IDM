package r31;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import koi.b;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import r2d.d;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f251139a = new Rect();

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        j jVar;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = parent.findContainingViewHolder(view);
        b bVar = viewHolderFindContainingViewHolder instanceof b ? (b) viewHolderFindContainingViewHolder : null;
        if (bVar == null || (jVar = bVar.e) == null || !(jVar instanceof ryl.a)) {
            return;
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
        Rect rect = this.f251139a;
        rect.set(paddingLeft, paddingTop, width, height);
        canvas.clipRect(rect);
        n31.a.a(parent, new d(7));
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
        Rect rect = this.f251139a;
        rect.set(paddingLeft, paddingTop, width, height);
        canvas.clipRect(rect);
        n31.a.a(parent, new d(6));
        canvas.restore();
    }
}
