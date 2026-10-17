package pih;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f236520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f236521b;

    public g(kel.b cashHolding, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f236520a = cashHolding;
        this.f236521b = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f236520a, gVar.f236520a) && Intrinsics.f(this.f236521b, gVar.f236521b);
    }

    public final int hashCode() {
        return this.f236521b.hashCode() + (this.f236520a.hashCode() * 31);
    }
}
