package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o2 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f173528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f173529c;

    public o2(String placeholder, t2 t2Var, BigDecimal value) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173527a = placeholder;
        this.f173528b = t2Var;
        this.f173529c = value;
    }

    @Override // jel.s2
    public final String a() {
        return this.f173527a;
    }

    @Override // jel.s2
    public final t2 b() {
        return this.f173528b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.f173527a, o2Var.f173527a) && this.f173528b == o2Var.f173528b && Intrinsics.f(this.f173529c, o2Var.f173529c);
    }

    public final int hashCode() {
        int iHashCode = this.f173527a.hashCode() * 31;
        t2 t2Var = this.f173528b;
        return this.f173529c.hashCode() + ((iHashCode + (t2Var == null ? 0 : t2Var.hashCode())) * 31);
    }
}
