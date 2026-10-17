package m1c;

import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f201452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsOptInSource f201453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f201454c;

    public s0(v0 type, RevPointsOptInSource optInSource, t0 t0Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(optInSource, "optInSource");
        this.f201452a = type;
        this.f201453b = optInSource;
        this.f201454c = t0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f201452a, s0Var.f201452a) && Intrinsics.f(this.f201453b, s0Var.f201453b) && Intrinsics.f(this.f201454c, s0Var.f201454c);
    }

    public final int hashCode() {
        int iHashCode = (this.f201453b.hashCode() + (this.f201452a.hashCode() * 31)) * 31;
        t0 t0Var = this.f201454c;
        return iHashCode + (t0Var == null ? 0 : t0Var.hashCode());
    }
}
