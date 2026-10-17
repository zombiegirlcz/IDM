package fuk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cel.n f138234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cel.n f138235b;

    public g(cel.n barPoints, cel.n nVar) {
        Intrinsics.checkNotNullParameter(barPoints, "barPoints");
        this.f138234a = barPoints;
        this.f138235b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f138234a, gVar.f138234a) && Intrinsics.f(this.f138235b, gVar.f138235b);
    }

    public final int hashCode() {
        int iHashCode = this.f138234a.hashCode() * 31;
        cel.n nVar = this.f138235b;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
