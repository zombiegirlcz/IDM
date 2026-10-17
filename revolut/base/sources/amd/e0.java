package amd;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f6316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f6317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f6318c;
    public final long d;
    public final long e;

    public e0(xi0.b currency, xi0.b baseCurrency, BigDecimal bigDecimal, long j2, long j3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f6316a = currency;
        this.f6317b = baseCurrency;
        this.f6318c = bigDecimal;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f6316a, e0Var.f6316a) && Intrinsics.f(this.f6317b, e0Var.f6317b) && Intrinsics.f(this.f6318c, e0Var.f6318c) && this.d == e0Var.d && this.e == e0Var.e;
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f6317b, this.f6316a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f6318c;
        return Long.hashCode(this.e) + a0.d.c((iJ + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.d);
    }
}
