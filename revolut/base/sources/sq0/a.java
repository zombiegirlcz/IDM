package sq0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends i {
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f264973l;

    public a() {
        this(0, 0);
    }

    @Override // sq0.g
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.k == aVar.k && this.f264973l == aVar.f264973l;
    }

    @Override // sq0.g
    public final int hashCode() {
        return Integer.hashCode(this.f264973l) + (Integer.hashCode(this.k) * 31);
    }

    @Override // sq0.g
    public final void p(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        u(parent);
        outRect.bottom = this.f + this.e + this.f264983g + outRect.bottom;
    }

    @Override // sq0.g
    public final void r(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        u(parent);
        boolean z = parent.getLayoutDirection() == 1;
        int paddingLeft = parent.getPaddingLeft() + (z ? this.i : this.f264984h);
        int width = parent.getWidth() - parent.getPaddingRight();
        int i = z ? this.f264984h : this.i;
        float fN = p31.a.n(view) + this.f;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Paint paint = (Paint) p31.a.m(parent).f.getValue();
        paint.setColor(io0.a.b(view.getAlpha(), this.d));
        canvas.drawRect(paddingLeft, fN, width - i, fN + this.e, paint);
    }

    public a(int i, int i2) {
        super(i, i2, f.BOTTOM);
        this.k = i;
        this.f264973l = i2;
    }
}
