package pih;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f236518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f236519b;

    public f(kel.b cashHolding, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f236518a = cashHolding;
        this.f236519b = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f236518a, fVar.f236518a) && Intrinsics.f(this.f236519b, fVar.f236519b);
    }

    public final int hashCode() {
        return this.f236519b.hashCode() + (this.f236518a.hashCode() * 31);
    }
}
