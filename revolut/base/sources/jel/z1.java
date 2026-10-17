package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f173616b;

    public z1(int i, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173615a = value;
        this.f173616b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.f173615a, z1Var.f173615a) && this.f173616b == z1Var.f173616b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173616b) + (this.f173615a.hashCode() * 31);
    }
}
