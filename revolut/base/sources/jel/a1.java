package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f173403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173404b;

    public a1(z0 z0Var, BigDecimal bigDecimal) {
        this.f173403a = z0Var;
        this.f173404b = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f173403a == a1Var.f173403a && Intrinsics.f(this.f173404b, a1Var.f173404b);
    }

    public final int hashCode() {
        z0 z0Var = this.f173403a;
        int iHashCode = (z0Var == null ? 0 : z0Var.hashCode()) * 31;
        BigDecimal bigDecimal = this.f173404b;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
