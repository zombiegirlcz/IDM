package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2 f208224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f208225b;

    public d3(t2 t2Var, Throwable th10) {
        this.f208224a = t2Var;
        this.f208225b = th10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f208224a, d3Var.f208224a) && Intrinsics.f(this.f208225b, d3Var.f208225b);
    }

    public final int hashCode() {
        t2 t2Var = this.f208224a;
        int iHashCode = (t2Var == null ? 0 : t2Var.hashCode()) * 31;
        Throwable th10 = this.f208225b;
        return iHashCode + (th10 != null ? th10.hashCode() : 0);
    }

    @Override // ms0.h3
    public final t2 n() {
        return this.f208224a;
    }

    @Override // ms0.h3
    public final h3 q(t2 model, u2 sharedState) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sharedState, "sharedState");
        return e3.f208238a.q(model, sharedState);
    }
}
