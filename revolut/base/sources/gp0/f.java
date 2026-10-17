package gp0;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f145202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f145203b;

    public f() {
        this((c) null, 3);
    }

    public final void a(View view, Drawable drawable) {
        View view2 = this.f145203b;
        if (view2 != null) {
            view = view2;
        }
        int i = e.f145201a[this.f145202a.ordinal()];
        if (i == 1) {
            view.setBackground(drawable);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            view.setForeground(drawable);
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f145202a == fVar.f145202a && Intrinsics.f(this.f145203b, fVar.f145203b);
    }

    public final int hashCode() {
        int iHashCode = this.f145202a.hashCode() * 31;
        View view = this.f145203b;
        return iHashCode + (view == null ? 0 : view.hashCode());
    }

    public f(c layer, View view) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        this.f145202a = layer;
        this.f145203b = view;
    }

    public /* synthetic */ f(c cVar, int i) {
        this((i & 1) != 0 ? c.BACKGROUND : cVar, (View) null);
    }
}
