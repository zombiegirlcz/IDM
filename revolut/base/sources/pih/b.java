package pih;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f236511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f236512b;

    public b(kel.b cashHolding, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f236511a = cashHolding;
        this.f236512b = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f236511a, bVar.f236511a) && Intrinsics.f(this.f236512b, bVar.f236512b);
    }

    public final int hashCode() {
        return this.f236512b.hashCode() + (this.f236511a.hashCode() * 31);
    }
}
