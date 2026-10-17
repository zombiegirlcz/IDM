package raf;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f252829a;

    public f(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f252829a = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f252829a, ((f) obj2).f252829a);
    }

    public final int hashCode() {
        return this.f252829a.hashCode();
    }
}
