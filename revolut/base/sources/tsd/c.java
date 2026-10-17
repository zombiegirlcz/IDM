package tsd;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f274074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f274075c;
    public final dj0.d d;

    public c(String portfolioId, TradingLegalEntityInformation tradingLegalEntityInformation, int i, dj0.d total) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f274073a = portfolioId;
        this.f274074b = tradingLegalEntityInformation;
        this.f274075c = i;
        this.d = total;
        a aVar = a.STOCKS;
    }

    @Override // tsd.h
    public final dj0.d a() {
        return this.d;
    }

    @Override // tsd.h
    public final int b() {
        return this.f274075c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f274073a, cVar.f274073a) && Intrinsics.f(this.f274074b, cVar.f274074b) && this.f274075c == cVar.f274075c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f274075c, (this.f274074b.hashCode() + (this.f274073a.hashCode() * 31)) * 31, 31);
    }
}
