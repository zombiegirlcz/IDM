package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173419c;
    public final c2 d;

    public b2(BigDecimal x3, BigDecimal y2, boolean z, c2 c2Var) {
        Intrinsics.checkNotNullParameter(x3, "x");
        Intrinsics.checkNotNullParameter(y2, "y");
        this.f173417a = x3;
        this.f173418b = y2;
        this.f173419c = z;
        this.d = c2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f173417a, b2Var.f173417a) && Intrinsics.f(this.f173418b, b2Var.f173418b) && this.f173419c == b2Var.f173419c && this.d == b2Var.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.d(this.f173418b, this.f173417a.hashCode() * 31, 31), 31, this.f173419c);
        c2 c2Var = this.d;
        return iC + (c2Var == null ? 0 : c2Var.hashCode());
    }
}
