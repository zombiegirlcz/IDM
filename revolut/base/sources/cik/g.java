package cik;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanAction.ClaimPlanReferral f24562w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar, PricingPlanAction.ClaimPlanReferral claimPlanReferral, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f24562w = claimPlanReferral;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f24562w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        PricingPlanAction.ClaimPlanReferral claimPlanReferral = this.f24562w;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar = this.v;
        f fVar = new f(cVar, claimPlanReferral, null);
        this.u = 1;
        Object objB = pu7.a.B(cVar.k, "referral_subscribe_info", fVar, this);
        return objB == aVar ? aVar : objB;
    }
}
