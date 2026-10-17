package eaf;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f124233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8f.d f124234b;

    public g(TradingAccount tradingAccount, u8f.d direction) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f124233a = tradingAccount;
        this.f124234b = direction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f124233a, gVar.f124233a) && this.f124234b == gVar.f124234b;
    }

    public final int hashCode() {
        return this.f124234b.hashCode() + (this.f124233a.hashCode() * 31);
    }
}
