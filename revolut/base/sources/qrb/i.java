package qrb;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import jel.h1;
import k4l.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f248697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nel.n f248698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstrumentTicker f248699c;
    public final h1 d;
    public final e0 e;
    public final a f;

    public i(TradingAccount tradingAccount, nel.n instrument, InstrumentTicker instrumentTicker, h1 instrumentDetails, e0 e0Var, a availableToInvest) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        this.f248697a = tradingAccount;
        this.f248698b = instrument;
        this.f248699c = instrumentTicker;
        this.d = instrumentDetails;
        this.e = e0Var;
        this.f = availableToInvest;
    }

    @Override // qrb.k
    public final TradingAccount N() {
        return this.f248697a;
    }

    @Override // qrb.k
    public final a a() {
        return this.f;
    }

    @Override // qrb.k
    public final e0 b() {
        return this.e;
    }

    @Override // qrb.k
    public final InstrumentTicker c() {
        return this.f248699c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f248697a, iVar.f248697a) && Intrinsics.f(this.f248698b, iVar.f248698b) && Intrinsics.f(this.f248699c, iVar.f248699c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f248699c.hashCode() + a10.b.d(this.f248698b, this.f248697a.hashCode() * 31, 31)) * 31)) * 31;
        e0 e0Var = this.e;
        return this.f.hashCode() + ((iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31);
    }

    @Override // qrb.k
    public final nel.n n() {
        return this.f248698b;
    }
}
