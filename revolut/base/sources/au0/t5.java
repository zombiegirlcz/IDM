package au0;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f9375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9377c;

    public t5(Drawable drawable, int i, int i2) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f9375a = drawable;
        this.f9376b = i;
        this.f9377c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj2;
        return Intrinsics.f(this.f9375a, t5Var.f9375a) && this.f9376b == t5Var.f9376b && this.f9377c == t5Var.f9377c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9377c) + j6.a.b(this.f9376b, this.f9375a.hashCode() * 31, 31);
    }
}
