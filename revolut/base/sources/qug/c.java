package qug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedback;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qug.g;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountClosureFeedbackScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AccountClosureFeedbackScreen accountClosureFeedbackScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountClosureFeedbackScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountClosureFeedbackScreen accountClosureFeedbackScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((h) accountClosureFeedbackScreen.Q.getValue())).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((h) accountClosureFeedbackScreen.Q.getValue());
                AccountClosureFeedbackScreenContract$InputData accountClosureFeedbackScreenContract$InputData = jVar.o;
                AccountClosureFeedbackChoice accountClosureFeedbackChoice = ((e) ((j2) jVar.f249451p.f22677a).getValue()).f249444b;
                if (accountClosureFeedbackChoice == null) {
                    throw new IllegalStateException("Feedback item not selected");
                }
                if (accountClosureFeedbackChoice.equals(AccountClosureFeedbackChoice.AnotherPlatform.f94860b)) {
                    TradingAccount tradingAccount = accountClosureFeedbackScreenContract$InputData.f94953a;
                    if (!(tradingAccount instanceof TradingAccount.GIA) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.Margin)) {
                        if (!(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException((accountClosureFeedbackScreenContract$InputData.f94953a.getF105262a() + " account closure not supported in account closure feedback.").toString());
                    }
                    jVar.C2(g.a.f249446a);
                } else if (accountClosureFeedbackChoice.equals(AccountClosureFeedbackChoice.FeaturesDontWork.f94862b)) {
                    TradingAccount tradingAccount2 = accountClosureFeedbackScreenContract$InputData.f94953a;
                    if ((tradingAccount2 instanceof TradingAccount.GIA) || (tradingAccount2 instanceof TradingAccount.TaxAdvantage.Pea) || (tradingAccount2 instanceof TradingAccount.TaxAdvantage.JIsa) || (tradingAccount2 instanceof TradingAccount.TaxAdvantage.Isa)) {
                        jVar.C2(g.b.f249447a);
                    } else {
                        if (!(tradingAccount2 instanceof TradingAccount.Robo) && !(tradingAccount2 instanceof TradingAccount.Margin)) {
                            if (!(tradingAccount2 instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount2 instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount2 instanceof TradingAccount.PaperTrading) && !(tradingAccount2 instanceof TradingAccount.Unknown)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException((accountClosureFeedbackScreenContract$InputData.f94953a.getF105262a() + " account closure not supported in account closure feedback.").toString());
                        }
                        jVar.C2(new f(new AccountClosureFeedback(accountClosureFeedbackChoice, null)));
                    }
                } else {
                    if (!accountClosureFeedbackChoice.equals(AccountClosureFeedbackChoice.EeaRemediationOptOut.f94861b) && !accountClosureFeedbackChoice.equals(AccountClosureFeedbackChoice.NotInterested.f94863b) && !accountClosureFeedbackChoice.equals(AccountClosureFeedbackChoice.PoorPerformance.f94865b) && !accountClosureFeedbackChoice.equals(AccountClosureFeedbackChoice.TooExpensive.f94866b) && !accountClosureFeedbackChoice.equals(AccountClosureFeedbackChoice.UnhappyCustomerSupport.f94867b) && !(accountClosureFeedbackChoice instanceof AccountClosureFeedbackChoice.Other)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TradingAccount tradingAccount3 = accountClosureFeedbackScreenContract$InputData.f94953a;
                    if (!(tradingAccount3 instanceof TradingAccount.GIA) && !(tradingAccount3 instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount3 instanceof TradingAccount.TaxAdvantage.JIsa) && !(tradingAccount3 instanceof TradingAccount.TaxAdvantage.Isa) && !(tradingAccount3 instanceof TradingAccount.Robo) && !(tradingAccount3 instanceof TradingAccount.Margin)) {
                        if (!(tradingAccount3 instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount3 instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount3 instanceof TradingAccount.PaperTrading) && !(tradingAccount3 instanceof TradingAccount.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException((accountClosureFeedbackScreenContract$InputData.f94953a.getF105262a() + " account closure not supported in account closure feedback.").toString());
                    }
                    jVar.C2(new f(new AccountClosureFeedback(accountClosureFeedbackChoice, null)));
                }
                return Unit.f186387a;
        }
    }
}
