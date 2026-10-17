package qrb;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import k4l.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wel.e f248688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f248689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nel.n f248690c;
    public final InstrumentTicker d;
    public final jel.n e;
    public final e0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f248691g;

    public g(wel.e portfolio, TradingAccount tradingAccount, nel.n instrument, InstrumentTicker instrumentTicker, jel.n instrumentDetails, e0 orderLimits, a availableToInvest) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        this.f248688a = portfolio;
        this.f248689b = tradingAccount;
        this.f248690c = instrument;
        this.d = instrumentTicker;
        this.e = instrumentDetails;
        this.f = orderLimits;
        this.f248691g = availableToInvest;
    }

    @Override // qrb.k
    public final TradingAccount N() {
        return this.f248689b;
    }

    @Override // qrb.k
    public final a a() {
        return this.f248691g;
    }

    @Override // qrb.k
    public final e0 b() {
        return this.f;
    }

    @Override // qrb.k
    public final InstrumentTicker c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f248688a, gVar.f248688a) && Intrinsics.f(this.f248689b, gVar.f248689b) && Intrinsics.f(this.f248690c, gVar.f248690c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f248691g, gVar.f248691g);
    }

    public final int hashCode() {
        return this.f248691g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + a10.b.d(this.f248690c, prk.o.b(this.f248689b, this.f248688a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    @Override // qrb.k
    public final nel.n n() {
        return this.f248690c;
    }
}
