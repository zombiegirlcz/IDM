package sq0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class g extends p31.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f264980a;

    public g(f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f264980a = position;
    }

    public static boolean q(RecyclerView recyclerView, View view) {
        return (view.getVisibility() == 4 || recyclerView.getLayoutManager() == null) ? false : true;
    }

    public static void s(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // p31.c
    public final void a(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.RIGHT);
        super.a(canvas, view, parent, state);
        if (q(parent, view)) {
            r(canvas, view, parent, state);
        }
    }

    @Override // p31.c
    public final void b(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.BOTTOM);
        super.b(canvas, view, parent, state);
        if (q(parent, view)) {
            r(canvas, view, parent, state);
        }
    }

    @Override // p31.c
    public final void c(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.TOP);
        super.c(canvas, view, parent, state);
        if (q(parent, view)) {
            r(canvas, view, parent, state);
        }
    }

    @Override // p31.a, p31.c
    public final void d(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.BOTTOM);
        super.d(canvas, view, parent, state);
        if (q(parent, view)) {
            s(canvas, view, parent, state);
        }
    }

    @Override // p31.a, p31.c
    public final void e(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.RIGHT);
        super.e(canvas, view, parent, state);
        if (q(parent, view)) {
            s(canvas, view, parent, state);
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!getClass().equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        g gVar = obj2 instanceof g ? (g) obj2 : null;
        return this.f264980a == (gVar != null ? gVar.f264980a : null);
    }

    @Override // p31.c
    public final void f(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.LEFT);
        super.f(canvas, view, parent, state);
        if (q(parent, view)) {
            r(canvas, view, parent, state);
        }
    }

    @Override // p31.a, p31.c
    public final void g(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.RIGHT);
        super.g(outRect, view, parent, state);
        p(outRect, view, parent, state);
    }

    @Override // p31.a, p31.c
    public final void h(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.TOP);
        super.h(outRect, view, parent, state);
        p(outRect, view, parent, state);
    }

    public int hashCode() {
        return this.f264980a.hashCode() + (super.hashCode() * 31);
    }

    @Override // p31.a, p31.c
    public final void i(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.LEFT);
        super.i(canvas, view, parent, state);
        if (q(parent, view)) {
            s(canvas, view, parent, state);
        }
    }

    @Override // p31.a, p31.c
    public final void j(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.BOTTOM);
        super.j(outRect, view, parent, state);
        p(outRect, view, parent, state);
    }

    @Override // p31.a, p31.c
    public final void k(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.TOP);
        super.k(canvas, view, parent, state);
        if (q(parent, view)) {
            s(canvas, view, parent, state);
        }
    }

    @Override // p31.a, p31.c
    public final void l(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        t(f.LEFT);
        super.l(outRect, view, parent, state);
        p(outRect, view, parent, state);
    }

    public abstract void p(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state);

    public void r(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public final void t(f fVar) {
        if (this.f264980a != fVar) {
            throw new IllegalStateException(j6.a.s("This ", getClass().getName(), " decoration must be used only as ", fVar.name(), " decoration").toString());
        }
    }
}
