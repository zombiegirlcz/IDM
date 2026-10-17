package hp0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import dr0.l;
import fp0.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f154367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f154368b;

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        ColorDrawable colorDrawable = null;
        this(colorDrawable, colorDrawable, 3);
    }

    @Override // hp0.e
    public final a a(Context context, i surface) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(surface, "surface");
        return l.f(context, surface, this.f154367a, null, this.f154368b, 8);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f154367a, cVar.f154367a) && Intrinsics.f(this.f154368b, cVar.f154368b);
    }

    public final int hashCode() {
        Drawable drawable = this.f154367a;
        int iHashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        Drawable drawable2 = this.f154368b;
        return iHashCode + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public /* synthetic */ c(ColorDrawable colorDrawable, Drawable drawable, int i) {
        this((i & 1) != 0 ? null : colorDrawable, (i & 2) != 0 ? null : drawable);
    }

    public c(Drawable drawable, Drawable drawable2) {
        this.f154367a = drawable;
        this.f154368b = drawable2;
    }
}
