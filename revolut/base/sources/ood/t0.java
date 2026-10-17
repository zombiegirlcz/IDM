package ood;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f227082b;

    public t0(List allTrips, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(allTrips, "allTrips");
        this.f227081a = allTrips;
        this.f227082b = bVar;
    }

    public static t0 b(t0 t0Var, List allTrips, wi0.b bVar, int i) {
        if ((i & 1) != 0) {
            allTrips = t0Var.f227081a;
        }
        if ((i & 2) != 0) {
            bVar = t0Var.f227082b;
        }
        Intrinsics.checkNotNullParameter(allTrips, "allTrips");
        return new t0(allTrips, bVar);
    }

    @Override // ood.w0
    public final List a() {
        return this.f227081a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f227081a, t0Var.f227081a) && Intrinsics.f(this.f227082b, t0Var.f227082b);
    }

    public final int hashCode() {
        int iHashCode = this.f227081a.hashCode() * 31;
        wi0.b bVar = this.f227082b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
