package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f173564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173565b;

    public t0(e0 e0Var, BigDecimal bigDecimal) {
        this.f173564a = e0Var;
        this.f173565b = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return this.f173564a == t0Var.f173564a && Intrinsics.f(this.f173565b, t0Var.f173565b);
    }

    public final int hashCode() {
        e0 e0Var = this.f173564a;
        int iHashCode = (e0Var == null ? 0 : e0Var.hashCode()) * 31;
        BigDecimal bigDecimal = this.f173565b;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
