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
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountClosureFeedbackCompetitorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountClosureFeedbackCompetitorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(model);
        k kVar = (k) iVarE3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52519a;
        Object other = null;
        if (a0.H(str, "FEEDBACK_COMPETITOR_COMPANY_ITEM_", false)) {
            Object obj3 = model.i;
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str2 = (String) obj3;
            if (str2 != null && kVar.o.f94956a.contains(str2)) {
                other = new AccountClosureCompetitorCompanyChoice.Company(str2);
            }
        } else if (a0.H(str, "FEEDBACK_OTHER_COMPANY_ITEM", false)) {
            other = new AccountClosureCompetitorCompanyChoice.Other(0);
        }
        kVar.H2(kVar.f265765p, new sl5.a(other, 22));
        return Unit.f186387a;
    }
}
