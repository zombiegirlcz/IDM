package pih;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f236516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f236517b;

    public e(kel.b cashHolding, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f236516a = cashHolding;
        this.f236517b = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f236516a, eVar.f236516a) && Intrinsics.f(this.f236517b, eVar.f236517b);
    }

    public final int hashCode() {
        return this.f236517b.hashCode() + (this.f236516a.hashCode() * 31);
    }
}
