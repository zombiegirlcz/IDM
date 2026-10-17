package sug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureCompetitorCompanyChoice;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedback;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackDetails;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.AccountClosureFeedbackCompetitorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountClosureFeedbackCompetitorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountClosureFeedbackCompetitorScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) accountClosureFeedbackCompetitorScreen.e3()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) accountClosureFeedbackCompetitorScreen.e3();
                AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice = ((f) ((j2) kVar.f265765p.f22677a).getValue()).f265760b;
                if (accountClosureCompetitorCompanyChoice == null) {
                    throw new IllegalStateException("No selected competitor company");
                }
                kVar.C2(new g(new AccountClosureFeedback(AccountClosureFeedbackChoice.AnotherPlatform.f94860b, new AccountClosureFeedbackDetails(accountClosureCompetitorCompanyChoice, r0.g()))));
                return Unit.f186387a;
        }
    }
}
