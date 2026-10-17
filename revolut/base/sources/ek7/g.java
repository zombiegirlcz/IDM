package ek7;

import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.shared.CFACInsuranceAddExpensesItemMapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CFACInsuranceReviewClaimScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cFACInsuranceReviewClaimScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CFACInsuranceAddExpensesItemMapper.AddExpenses) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.u.T2();
        pVar.getClass();
        pVar.v2(new k(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(true)));
        return Unit.f186387a;
    }
}
