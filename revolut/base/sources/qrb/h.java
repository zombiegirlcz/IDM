package qrb;

import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import jel.h1;
import k4l.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SourcePocket f248692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f248693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingAccount f248694c;
    public final nel.n d;
    public final InstrumentTicker e;
    public final h1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f248695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f248696h;

    public h(SourcePocket sourcePocket, TradingLegalEntityInformation tradingLegalEntityInformation, TradingAccount tradingAccount, nel.n instrument, InstrumentTicker instrumentTicker, h1 instrumentDetails, e0 orderLimits, a availableToInvest) {
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        this.f248692a = sourcePocket;
        this.f248693b = tradingLegalEntityInformation;
        this.f248694c = tradingAccount;
        this.d = instrument;
        this.e = instrumentTicker;
        this.f = instrumentDetails;
        this.f248695g = orderLimits;
        this.f248696h = availableToInvest;
    }

    @Override // qrb.k
    public final TradingAccount N() {
        return this.f248694c;
    }

    @Override // qrb.k
    public final a a() {
        return this.f248696h;
    }

    @Override // qrb.k
    public final e0 b() {
        return this.f248695g;
    }

    @Override // qrb.k
    public final InstrumentTicker c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f248692a, hVar.f248692a) && Intrinsics.f(this.f248693b, hVar.f248693b) && Intrinsics.f(this.f248694c, hVar.f248694c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f248695g, hVar.f248695g) && Intrinsics.f(this.f248696h, hVar.f248696h);
    }

    public final int hashCode() {
        return this.f248696h.hashCode() + ((this.f248695g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + a10.b.d(this.d, prk.o.b(this.f248694c, (this.f248693b.hashCode() + (this.f248692a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    @Override // qrb.k
    public final nel.n n() {
        return this.d;
    }
}
