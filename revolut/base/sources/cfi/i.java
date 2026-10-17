package cfi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f23712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f23713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f23714c;
    public final h d;

    public i(dj0.d overallPrice, dj0.d priceInRequestedCurrency, f cashback, h hVar) {
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        Intrinsics.checkNotNullParameter(priceInRequestedCurrency, "priceInRequestedCurrency");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        this.f23712a = overallPrice;
        this.f23713b = priceInRequestedCurrency;
        this.f23714c = cashback;
        this.d = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f23712a, iVar.f23712a) && Intrinsics.f(this.f23713b, iVar.f23713b) && Intrinsics.f(this.f23714c, iVar.f23714c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f23714c.hashCode() + v7.c(this.f23712a.hashCode() * 31, 31, this.f23713b)) * 31;
        h hVar = this.d;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
