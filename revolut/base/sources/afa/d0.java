package afa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f3981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f3982b;

    public d0(io3.d pocket, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f3981a = pocket;
        this.f3982b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f3981a, d0Var.f3981a) && Intrinsics.f(this.f3982b, d0Var.f3982b);
    }

    public final int hashCode() {
        int iHashCode = this.f3981a.hashCode() * 31;
        wi0.b bVar = this.f3982b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
