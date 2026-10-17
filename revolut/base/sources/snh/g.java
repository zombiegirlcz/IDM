package snh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f264623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f264624b;

    public g(kel.b cashHolding, xi0.b alternativeCashHoldingCurrency) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(alternativeCashHoldingCurrency, "alternativeCashHoldingCurrency");
        this.f264623a = cashHolding;
        this.f264624b = alternativeCashHoldingCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f264623a, gVar.f264623a) && Intrinsics.f(this.f264624b, gVar.f264624b);
    }

    public final int hashCode() {
        return this.f264624b.hashCode() + (this.f264623a.hashCode() * 31);
    }
}
