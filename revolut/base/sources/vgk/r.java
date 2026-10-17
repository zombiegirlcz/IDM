package vgk;

import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.v, continuation, 0);
            case 1:
                return new r(this.v, continuation, 1);
            default:
                return new r(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar = com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d.Companion;
                TransitionAnimation.SLIDE_END_TO_START slide_end_to_start = TransitionAnimation.SLIDE_END_TO_START.f98395a;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar = this.v;
                yki.i iVar2 = dVar.z;
                oki.h.r2(iVar2);
                oki.h.t2(dVar, iVar2, FamilyPlanFlowContract$Step.PlanManagement.f102987a, false, slide_end_to_start, false, 8);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(this.v.z);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar3 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d.Companion;
                TransitionAnimation.SLIDE_END_TO_START slide_end_to_start2 = TransitionAnimation.SLIDE_END_TO_START.f98395a;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar2 = this.v;
                yki.i iVar4 = dVar2.z;
                oki.h.r2(iVar4);
                oki.h.t2(dVar2, iVar4, FamilyPlanFlowContract$Step.PlanManagement.f102987a, false, slide_end_to_start2, false, 8);
                break;
        }
        return Unit.f186387a;
    }
}
