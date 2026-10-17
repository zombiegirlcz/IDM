package tsd;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f274080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingLegalEntityInformation f274081c;

    public e(int i, dj0.d total, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f274079a = i;
        this.f274080b = total;
        this.f274081c = tradingLegalEntityInformation;
        a aVar = a.STOCKS;
    }

    @Override // tsd.h
    public final dj0.d a() {
        return this.f274080b;
    }

    @Override // tsd.h
    public final int b() {
        return this.f274079a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f274079a == eVar.f274079a && Intrinsics.f(this.f274080b, eVar.f274080b) && Intrinsics.f(this.f274081c, eVar.f274081c);
    }

    public final int hashCode() {
        return this.f274081c.hashCode() + v7.c(Integer.hashCode(this.f274079a) * 31, 31, this.f274080b);
    }
}
