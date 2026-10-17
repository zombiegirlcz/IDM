package uyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f284362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeContract$MoneyDetails.BalanceIdentifier f284363b;

    public d1(xi0.b currency, CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balanceIdentifier, "balanceIdentifier");
        this.f284362a = currency;
        this.f284363b = balanceIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f284362a, d1Var.f284362a) && Intrinsics.f(this.f284363b, d1Var.f284363b);
    }

    public final int hashCode() {
        return this.f284363b.hashCode() + (this.f284362a.hashCode() * 31);
    }
}
