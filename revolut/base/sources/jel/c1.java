package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f173425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173426b;

    public c1(b1 b1Var, BigDecimal bigDecimal) {
        this.f173425a = b1Var;
        this.f173426b = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return this.f173425a == c1Var.f173425a && Intrinsics.f(this.f173426b, c1Var.f173426b);
    }

    public final int hashCode() {
        b1 b1Var = this.f173425a;
        int iHashCode = (b1Var == null ? 0 : b1Var.hashCode()) * 31;
        BigDecimal bigDecimal = this.f173426b;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
