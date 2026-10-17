package q2h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f241654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f241655b;

    public e(TradingAccount tradingAccount, n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f241654a = instrument;
        this.f241655b = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f241654a, eVar.f241654a) && Intrinsics.f(this.f241655b, eVar.f241655b);
    }

    public final int hashCode() {
        return this.f241655b.hashCode() + (this.f241654a.hashCode() * 31);
    }
}
