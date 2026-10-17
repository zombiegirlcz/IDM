package com.revolut.feature_crypto_order_flow.api.exchange;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import kotlin.jvm.internal.Intrinsics;
import kyh.f;
import q0i.c;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f96706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f96707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f96708c;
    public final boolean d;
    public final CryptoExchangeContract$MoneyDetails.BalanceIdentifier e;

    public a(b currency, c cVar, f fVar, boolean z, CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balanceIdentifier, "balanceIdentifier");
        this.f96706a = currency;
        this.f96707b = cVar;
        this.f96708c = fVar;
        this.d = z;
        this.e = balanceIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f96706a, aVar.f96706a) && Intrinsics.f(this.f96707b, aVar.f96707b) && this.f96708c == aVar.f96708c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f96706a.hashCode() * 31;
        c cVar = this.f96707b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        f fVar = this.f96708c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31, 31, this.d);
    }
}
