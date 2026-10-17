package raf;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccountAvailableToOnboard f252825a;

    public c(TradingAccountAvailableToOnboard tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f252825a = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f252825a, ((c) obj2).f252825a);
    }

    public final int hashCode() {
        return this.f252825a.hashCode();
    }
}
