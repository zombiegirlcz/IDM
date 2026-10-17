package tsd;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage.JIsa f274089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f274090b;

    public j(TradingAccount.TaxAdvantage.JIsa tradingAccount, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f274089a = tradingAccount;
        this.f274090b = tradingLegalEntityInformation;
        a aVar = a.STOCKS;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f274089a.equals(jVar.f274089a) && Intrinsics.f(this.f274090b, jVar.f274090b);
    }

    public final int hashCode() {
        return this.f274090b.hashCode() + (this.f274089a.hashCode() * 31);
    }
}
