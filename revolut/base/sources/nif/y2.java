package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f216079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f216080b;

    public y2(x2 x2Var, jo3.b total) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.f216079a = x2Var;
        this.f216080b = total;
    }

    public final x2 a() {
        return this.f216079a;
    }

    public final jo3.b b() {
        return this.f216080b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj2;
        return Intrinsics.f(this.f216079a, y2Var.f216079a) && Intrinsics.f(this.f216080b, y2Var.f216080b);
    }

    public final int hashCode() {
        x2 x2Var = this.f216079a;
        return this.f216080b.hashCode() + ((x2Var == null ? 0 : x2Var.f216069a.hashCode()) * 31);
    }
}
