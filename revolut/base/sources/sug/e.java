package sug;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureCompetitorCompanyChoice;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.AccountClosureFeedbackCompetitorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountClosureFeedbackCompetitorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountClosureFeedbackCompetitorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.TextData model = (InputChecklistDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(model);
        k kVar = (k) iVarE3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (a0.H(model.f52532a, "FEEDBACK_OTHER_COMPANY_ITEM", false)) {
            kVar.H2(kVar.f265765p, new sl5.a(new AccountClosureCompetitorCompanyChoice.Other(model.f52533b.toString()), 21));
        }
        return Unit.f186387a;
    }
}
