package pih;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f236513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f236514b;

    public c(kel.b cashHolding, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f236513a = cashHolding;
        this.f236514b = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f236513a, cVar.f236513a) && Intrinsics.f(this.f236514b, cVar.f236514b);
    }

    public final int hashCode() {
        return this.f236514b.hashCode() + (this.f236513a.hashCode() * 31);
    }
}
