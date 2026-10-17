package cik;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanAction.ClaimPlanReferral f24561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar, PricingPlanAction.ClaimPlanReferral claimPlanReferral, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f24561w = claimPlanReferral;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f24561w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            PricingPlanAction.ClaimPlanReferral claimPlanReferral = this.f24561w;
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar = this.v;
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.a aVar2 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.a(cVar, claimPlanReferral, null);
            this.u = 1;
            if (cVar.p2(this, aVar2) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
