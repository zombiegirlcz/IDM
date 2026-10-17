package taf;

import cfl.o;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements i {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.d f269323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f269324q;

    public l(n stateMapper, g inputData, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.o = inputData;
        this.f269323p = portfolioInteractor;
        TradingAccount tradingAccount = inputData.f269316a;
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        this.f269324q = mra.d.b(this, new f(tradingAccount, zi0.c.P(Boolean.valueOf(tradingAccount.z().contains(o.TRANSFER_IN)), false, null, 3), new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) throws Throwable {
        UUID uuid;
        g gVar = this.o;
        TradingAccount tradingAccount = gVar.f269316a;
        boolean z = tradingAccount instanceof TradingAccount.GIA;
        y yVar = this.f269324q;
        if (!z) {
            if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.Robo.Regular) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Isa)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new t9b.a(8));
            return;
        }
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) d0.d0(((TradingAccount.GIA) tradingAccount).f105184g);
        Continuation continuation = null;
        String string = (portfolio == null || (uuid = portfolio.f105210a) == null) ? null : uuid.toString();
        if (string != null) {
            yji.l.b1(this, nim.a.v(rd0.e.n(nim.a.v(((ael.y) this.f269323p).e(string, w4l.j.f294644c), new t9b.a(10)), h0.f322473a), new t5e.m(this, 23)), null, new t9h.b(this, continuation, 6), 3);
            return;
        }
        hx7.e.n(new IllegalStateException("TradingAccount with id " + gVar.f269316a.getF105262a() + " doesn't have any portfolio"));
        H2(yVar, new t9b.a(9));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f269324q;
    }
}
