package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p2 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f173538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f173539c;

    public p2(String placeholder, t2 t2Var, BigDecimal value) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173537a = placeholder;
        this.f173538b = t2Var;
        this.f173539c = value;
    }

    @Override // jel.s2
    public final String a() {
        return this.f173537a;
    }

    @Override // jel.s2
    public final t2 b() {
        return this.f173538b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f173537a, p2Var.f173537a) && this.f173538b == p2Var.f173538b && Intrinsics.f(this.f173539c, p2Var.f173539c);
    }

    public final int hashCode() {
        int iHashCode = this.f173537a.hashCode() * 31;
        t2 t2Var = this.f173538b;
        return this.f173539c.hashCode() + ((iHashCode + (t2Var == null ? 0 : t2Var.hashCode())) * 31);
    }
}
