package cfl;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f23748a;

    public r(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f23748a = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f23748a, ((r) obj2).f23748a);
    }

    public final int hashCode() {
        return this.f23748a.hashCode() * 31;
    }
}
