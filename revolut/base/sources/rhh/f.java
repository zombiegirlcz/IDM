package rhh;

import ael.f1;
import ael.y;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f254475w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f254475w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, this.f254475w, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        TradingAccount tradingAccount = (TradingAccount) iVar.f224257a;
        boolean z = tradingAccount instanceof TradingAccount.TaxAdvantage.Pea;
        String str = this.f254475w;
        if (z || (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa)) {
            return nim.a.v(((y) this.v.f254476a).e(str, w4l.h.f294642c), new f1(tradingAccount, 1));
        }
        if ((tradingAccount instanceof TradingAccount.GIA) || (tradingAccount instanceof TradingAccount.Margin) || (tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.Robo) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.Unknown) || tradingAccount == null) {
            throw new IllegalStateException(a10.b.s("Account with portfolio ", str, " is not tax advantage account"));
        }
        throw new NoWhenBranchMatchedException();
    }
}
