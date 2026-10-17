package taf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import taf.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ RowDelegate.Model u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(RowDelegate.Model model, l lVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = this.u.u;
        boolean z = obj3 instanceof d;
        l lVar = this.v;
        if (z) {
            lVar.C2(h.a.f269317a);
        } else if (obj3 instanceof e) {
            g gVar = lVar.o;
            TradingAccount tradingAccount = gVar.f269316a;
            if (tradingAccount instanceof TradingAccount.GIA) {
                lVar.C2(h.b.C1505b.f269319a);
            } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
                lVar.C2(h.b.c.f269320a);
            } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
                lVar.C2(h.b.d.f269321a);
            } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                lVar.C2(h.b.a.f269318a);
            } else {
                if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                hx7.e.n(new IllegalStateException("New Transfer Out flow not supported for " + gVar.f269316a.W()));
            }
        }
        return Unit.f186387a;
    }
}
