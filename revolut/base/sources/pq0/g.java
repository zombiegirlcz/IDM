package pq0;

import ip0.lb0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f238646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb0 f238647b;

    public g(boolean z, lb0 lb0Var) {
        this.f238646a = z;
        this.f238647b = lb0Var;
    }

    public final lb0 a() {
        return this.f238647b;
    }

    public final boolean b() {
        return this.f238646a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f238646a == gVar.f238646a && Intrinsics.f(this.f238647b, gVar.f238647b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f238646a) * 31;
        lb0 lb0Var = this.f238647b;
        return iHashCode + (lb0Var == null ? 0 : lb0Var.hashCode());
    }
}
