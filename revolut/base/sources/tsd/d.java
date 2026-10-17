package tsd;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f274077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingLegalEntityInformation f274078c;

    public d(int i, dj0.d total, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f274076a = i;
        this.f274077b = total;
        this.f274078c = tradingLegalEntityInformation;
        a aVar = a.STOCKS;
    }

    @Override // tsd.h
    public final dj0.d a() {
        return this.f274077b;
    }

    @Override // tsd.h
    public final int b() {
        return this.f274076a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f274076a == dVar.f274076a && Intrinsics.f(this.f274077b, dVar.f274077b) && Intrinsics.f(this.f274078c, dVar.f274078c);
    }

    public final int hashCode() {
        return this.f274078c.hashCode() + v7.c(Integer.hashCode(this.f274076a) * 31, 31, this.f274077b);
    }
}
