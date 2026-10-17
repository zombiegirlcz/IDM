package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f173532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173533b;

    public p0(BigDecimal bigDecimal, q0 q0Var) {
        this.f173532a = q0Var;
        this.f173533b = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f173532a == p0Var.f173532a && Intrinsics.f(this.f173533b, p0Var.f173533b);
    }

    public final int hashCode() {
        q0 q0Var = this.f173532a;
        int iHashCode = (q0Var == null ? 0 : q0Var.hashCode()) * 31;
        BigDecimal bigDecimal = this.f173533b;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
