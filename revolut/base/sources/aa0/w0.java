package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f2747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2748b;

    public w0(int i, wi0.b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f2747a = country;
        this.f2748b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f2747a, w0Var.f2747a) && this.f2748b == w0Var.f2748b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2748b) + (this.f2747a.f297794a.hashCode() * 31);
    }
}
