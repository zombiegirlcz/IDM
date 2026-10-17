package z9f;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f320333a;

    public c(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f320333a = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f320333a, ((c) obj2).f320333a);
    }

    public final int hashCode() {
        return this.f320333a.hashCode();
    }
}
