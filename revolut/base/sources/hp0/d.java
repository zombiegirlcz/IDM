package hp0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.revolut.core.ui_kit.click.animator.ripple.UIKitRippleDrawable;
import dr0.l;
import fp0.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f154369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f154370b;

    public d() {
        this(null, null, 31);
    }

    @Override // hp0.e
    public final a a(Context context, i surface) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(surface, "surface");
        return l.k(new c(null, this.f154370b).a(context, surface), null, this.f154369a, 48);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f154369a, dVar.f154369a) && Intrinsics.f(this.f154370b, dVar.f154370b);
    }

    public final int hashCode() {
        Drawable drawable = this.f154369a;
        int iHashCode = (drawable == null ? 0 : drawable.hashCode()) * 961;
        Drawable drawable2 = this.f154370b;
        return iHashCode + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public d(UIKitRippleDrawable uIKitRippleDrawable, GradientDrawable gradientDrawable, int i) {
        uIKitRippleDrawable = (i & 4) != 0 ? null : uIKitRippleDrawable;
        gradientDrawable = (i & 16) != 0 ? null : gradientDrawable;
        this.f154369a = uIKitRippleDrawable;
        this.f154370b = gradientDrawable;
    }
}
