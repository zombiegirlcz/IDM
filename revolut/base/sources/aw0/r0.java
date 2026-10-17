package aw0;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f10502c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f10503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f10504h;
    public final boolean i;

    public r0(long j2, long j3, BigDecimal open, BigDecimal close, BigDecimal high, BigDecimal low, BigDecimal volume, xi0.b currency) {
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(volume, "volume");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f10500a = j2;
        this.f10501b = j3;
        this.f10502c = open;
        this.d = close;
        this.e = high;
        this.f = low;
        this.f10503g = volume;
        this.f10504h = currency;
        this.i = open.compareTo(close) == 0 && close.compareTo(high) == 0 && high.compareTo(low) == 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return this.f10500a == r0Var.f10500a && this.f10501b == r0Var.f10501b && Intrinsics.f(this.f10502c, r0Var.f10502c) && Intrinsics.f(this.d, r0Var.d) && Intrinsics.f(this.e, r0Var.e) && Intrinsics.f(this.f, r0Var.f) && Intrinsics.f(this.f10503g, r0Var.f10503g) && Intrinsics.f(this.f10504h, r0Var.f10504h);
    }

    public final int hashCode() {
        return this.f10504h.hashCode() + t61.a.d(this.f10503g, t61.a.d(this.f, t61.a.d(this.e, t61.a.d(this.d, t61.a.d(this.f10502c, a0.d.c(Long.hashCode(this.f10500a) * 31, 31, this.f10501b), 31), 31), 31), 31), 31);
    }
}
