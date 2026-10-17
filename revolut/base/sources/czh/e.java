package czh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f110239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeContract$MoneyDetails.BalanceIdentifier f110240b;

    public e(xi0.b currency, CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balanceIdentifier, "balanceIdentifier");
        this.f110239a = currency;
        this.f110240b = balanceIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f110239a, eVar.f110239a) && Intrinsics.f(this.f110240b, eVar.f110240b);
    }

    public final int hashCode() {
        return this.f110240b.hashCode() + (this.f110239a.hashCode() * 31);
    }
}
