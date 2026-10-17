package as0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends RecyclerView.ItemDecoration {

    @NotNull
    public static final C0072a Companion = new C0072a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f8735a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8736b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8737c = -1;

    /* JADX INFO: renamed from: as0.a$a, reason: collision with other inner class name */
    public static final class C0072a {
        private C0072a() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        j jVar;
        RecyclerView.Adapter adapter;
        p31.c f52111l;
        p31.c k;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = parent.findContainingViewHolder(view);
        koi.b bVar = viewHolderFindContainingViewHolder instanceof koi.b ? (koi.b) viewHolderFindContainingViewHolder : null;
        if (bVar == null || (jVar = bVar.e) == null || (adapter = parent.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        int bindingAdapterPosition = bVar.getBindingAdapterPosition();
        boolean z = false;
        boolean z3 = bindingAdapterPosition == 0;
        boolean z4 = bindingAdapterPosition == itemCount - 1;
        boolean z6 = z3 && this.f8736b >= 0;
        if (z4 && this.f8737c >= 0) {
            z = true;
        }
        if (z6) {
            outRect.top = this.f8736b;
        }
        if (z) {
            outRect.bottom = this.f8737c;
        }
        if (jVar instanceof o31.c) {
            if (!z6 && (k = ((o31.c) jVar).getK()) != null) {
                k.h(outRect, view, parent, state);
            }
            if (!z && (f52111l = ((o31.c) jVar).getF52111l()) != null) {
                f52111l.j(outRect, view, parent, state);
            }
            o31.c cVar = (o31.c) jVar;
            p31.c f52112m = cVar.getF52112m();
            if (f52112m != null) {
                f52112m.l(outRect, view, parent, state);
            }
            p31.c f52113n = cVar.getF52113n();
            if (f52113n != null) {
                f52113n.g(outRect, view, parent, state);
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
        Rect rect = this.f8735a;
        rect.set(paddingLeft, paddingTop, width, height);
        canvas.clipRect(rect);
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = parent.getChildViewHolder(parent.getChildAt(i));
            koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
            j jVar = bVar != null ? bVar.e : null;
            o31.c cVar = jVar instanceof o31.c ? (o31.c) jVar : null;
            if (cVar != null) {
                p31.c k = cVar.getK();
                if (k != null) {
                    View itemView = bVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    k.c(canvas, itemView, parent, state);
                }
                p31.c f52111l = cVar.getF52111l();
                if (f52111l != null) {
                    View itemView2 = bVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    f52111l.b(canvas, itemView2, parent, state);
                }
                p31.c f52112m = cVar.getF52112m();
                if (f52112m != null) {
                    View itemView3 = bVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                    f52112m.f(canvas, itemView3, parent, state);
                }
                p31.c f52113n = cVar.getF52113n();
                if (f52113n != null) {
                    View itemView4 = bVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                    f52113n.a(canvas, itemView4, parent, state);
                }
            }
        }
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
        Rect rect = this.f8735a;
        rect.set(paddingLeft, paddingTop, width, height);
        canvas.clipRect(rect);
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = parent.getChildViewHolder(parent.getChildAt(i));
            koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
            j jVar = bVar != null ? bVar.e : null;
            o31.c cVar = jVar instanceof o31.c ? (o31.c) jVar : null;
            if (cVar != null) {
                p31.c k = cVar.getK();
                if (k != null) {
                    View itemView = bVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    k.k(canvas, itemView, parent, state);
                }
                p31.c f52111l = cVar.getF52111l();
                if (f52111l != null) {
                    View itemView2 = bVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    f52111l.d(canvas, itemView2, parent, state);
                }
                p31.c f52112m = cVar.getF52112m();
                if (f52112m != null) {
                    View itemView3 = bVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                    f52112m.i(canvas, itemView3, parent, state);
                }
                p31.c f52113n = cVar.getF52113n();
                if (f52113n != null) {
                    View itemView4 = bVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                    f52113n.e(canvas, itemView4, parent, state);
                }
            }
        }
        canvas.restore();
    }
}
