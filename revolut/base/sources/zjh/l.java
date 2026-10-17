package zjh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f322841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f322842b;

    public l(kel.b cashHolding, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f322841a = cashHolding;
        this.f322842b = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f322841a, lVar.f322841a) && Intrinsics.f(this.f322842b, lVar.f322842b);
    }

    public final int hashCode() {
        return this.f322842b.hashCode() + (this.f322841a.hashCode() * 31);
    }
}
