package ek7;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ CFACInsuranceReviewClaimScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cFACInsuranceReviewClaimScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.u.T2();
        pVar.getClass();
        pVar.v2(new k(CFACInsuranceClaimFlowContract$Step.ManageExpenses.f75053a));
        return Unit.f186387a;
    }
}
