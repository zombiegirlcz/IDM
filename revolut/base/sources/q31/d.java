package q31;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends p31.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f241768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f241769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f241770c;
    public int d;
    public boolean e;

    public d(int i, c background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f241768a = i;
        this.f241769b = background;
    }

    public static d p(d dVar, b background) {
        int i = dVar.f241768a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(background, "background");
        return new d(i, background);
    }

    @Override // p31.c
    public final void a(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        r(parent);
        Intrinsics.checkNotNullParameter(view, "<this>");
        int translationX = (int) (view.getTranslationX() + view.getRight());
        int iO = (int) p31.a.o(view);
        Intrinsics.checkNotNullParameter(view, "<this>");
        q(parent, view, canvas, translationX, iO, ((int) (view.getTranslationX() + view.getRight())) + this.f241770c, (int) p31.a.n(view));
    }

    @Override // p31.c
    public final void b(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        r(parent);
        q(parent, view, canvas, layoutManager.getDecoratedLeft(view), (int) p31.a.n(view), layoutManager.getDecoratedRight(view), ((int) p31.a.n(view)) + this.f241770c);
    }

    @Override // p31.c
    public final void c(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        r(parent);
        q(parent, view, canvas, layoutManager.getDecoratedLeft(view), ((int) p31.a.o(view)) - this.f241770c, layoutManager.getDecoratedRight(view), (int) p31.a.o(view));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!d.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.decorations.dividers.delegates.paddings.PaddingDecorationDelegate");
        d dVar = (d) obj2;
        return this.f241768a == dVar.f241768a && Intrinsics.f(this.f241769b, dVar.f241769b);
    }

    @Override // p31.c
    public final void f(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        r(parent);
        Intrinsics.checkNotNullParameter(view, "<this>");
        int translationX = ((int) (view.getTranslationX() + view.getLeft())) - this.f241770c;
        int iO = (int) p31.a.o(view);
        Intrinsics.checkNotNullParameter(view, "<this>");
        q(parent, view, canvas, translationX, iO, (int) (view.getTranslationX() + view.getLeft()), (int) p31.a.n(view));
    }

    @Override // p31.a, p31.c
    public final void g(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        r(parent);
        outRect.right += this.f241770c;
    }

    @Override // p31.a, p31.c
    public final void h(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        r(parent);
        outRect.top += this.f241770c;
    }

    public final int hashCode() {
        return this.f241769b.hashCode() + (this.f241768a * 31);
    }

    @Override // p31.a, p31.c
    public final void j(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        r(parent);
        outRect.bottom += this.f241770c;
    }

    @Override // p31.a, p31.c
    public final void l(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        r(parent);
        outRect.left += this.f241770c;
    }

    public final void q(RecyclerView recyclerView, View view, Canvas canvas, int i, int i2, int i3, int i5) {
        if (view.getVisibility() == 4 || Color.alpha(this.d) == 0) {
            return;
        }
        Paint paint = (Paint) p31.a.m(recyclerView).f.getValue();
        paint.setColor(this.d);
        paint.setAlpha((int) (view.getAlpha() * 255));
        canvas.drawRect(i, i2, i3, i5, paint);
    }

    public final void r(RecyclerView recyclerView) {
        int iValueAt;
        int iS;
        int iValueAt2;
        if (this.e) {
            return;
        }
        o31.d dVarM = p31.a.m(recyclerView);
        Context context = dVarM.f221678a;
        SparseIntArray sparseIntArray = dVarM.e;
        int i = this.f241768a;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        } else {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            sparseIntArray.put(i, dimensionPixelSize);
            iValueAt = dimensionPixelSize;
        }
        this.f241770c = iValueAt;
        c cVar = this.f241769b;
        if (cVar instanceof b) {
            SparseIntArray sparseIntArray2 = dVarM.f221680c;
            int iIndexOfKey2 = sparseIntArray2.indexOfKey(R.color.transparent);
            if (iIndexOfKey2 >= 0) {
                iValueAt2 = sparseIntArray2.valueAt(iIndexOfKey2);
            } else {
                iS = ResourcesCompat.getColor(context.getResources(), R.color.transparent, context.getTheme());
                sparseIntArray2.put(R.color.transparent, iS);
                iValueAt2 = iS;
            }
        } else {
            if (!(cVar instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = ((a) cVar).f241767a;
            SparseIntArray sparseIntArray3 = dVarM.f221679b;
            int iIndexOfKey3 = sparseIntArray3.indexOfKey(i2);
            if (iIndexOfKey3 >= 0) {
                iValueAt2 = sparseIntArray3.valueAt(iIndexOfKey3);
            } else {
                iS = kli.a.s(i2, context);
                sparseIntArray3.put(i2, iS);
                iValueAt2 = iS;
            }
        }
        this.d = iValueAt2;
        this.e = true;
    }
}
