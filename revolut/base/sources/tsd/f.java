package tsd;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount.GIA f274083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f274084c;
    public final dj0.d d;
    public final TradingLegalEntityInformation e;

    public f(String portfolioId, TradingAccount.GIA tradingAccount, int i, dj0.d total, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f274082a = portfolioId;
        this.f274083b = tradingAccount;
        this.f274084c = i;
        this.d = total;
        this.e = tradingLegalEntityInformation;
        a aVar = a.STOCKS;
    }

    @Override // tsd.h
    public final dj0.d a() {
        return this.d;
    }

    @Override // tsd.h
    public final int b() {
        return this.f274084c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f274082a, fVar.f274082a) && Intrinsics.f(this.f274083b, fVar.f274083b) && this.f274084c == fVar.f274084c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(j6.a.b(this.f274084c, (this.f274083b.hashCode() + (this.f274082a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
