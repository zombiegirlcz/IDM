package d7j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f112045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f112047c;
    public final wd6.e d;

    public r0(xi0.b commodityCurrency, long j2, xi0.b counterCurrency, wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(commodityCurrency, "commodityCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f112045a = commodityCurrency;
        this.f112046b = j2;
        this.f112047c = counterCurrency;
        this.d = exchangeMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f112045a, r0Var.f112045a) && this.f112046b == r0Var.f112046b && Intrinsics.f(this.f112047c, r0Var.f112047c) && this.d == r0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.j(this.f112047c, a0.d.c(this.f112045a.hashCode() * 31, 31, this.f112046b), 31);
    }
}
