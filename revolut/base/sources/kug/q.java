package kug;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f189804a;

    public q(TradingAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f189804a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f189804a, ((q) obj2).f189804a);
    }

    public final int hashCode() {
        return this.f189804a.hashCode();
    }
}
