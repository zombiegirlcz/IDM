package tsd;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f274085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f274087c;
    public final TradingLegalEntityInformation d;

    public g(TradingAccount.TaxAdvantage tradingAccount, int i, dj0.d total, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f274085a = tradingAccount;
        this.f274086b = i;
        this.f274087c = total;
        this.d = tradingLegalEntityInformation;
        a aVar = a.STOCKS;
    }

    @Override // tsd.h
    public final dj0.d a() {
        return this.f274087c;
    }

    @Override // tsd.h
    public final int b() {
        return this.f274086b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f274085a, gVar.f274085a) && this.f274086b == gVar.f274086b && Intrinsics.f(this.f274087c, gVar.f274087c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(j6.a.b(this.f274086b, this.f274085a.hashCode() * 31, 31), 31, this.f274087c);
    }
}
