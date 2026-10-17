package jhk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.PlanSelectionCoreFlowContract$PlanSelectionParams;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ PricingPlanOffer A;
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f174311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hha.d f174312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ hha.d f174313y;
    public final /* synthetic */ hha.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar, m mVar, hha.d dVar, hha.d dVar2, hha.i iVar, PricingPlanOffer pricingPlanOffer, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f174311w = mVar;
        this.f174312x = dVar;
        this.f174313y = dVar2;
        this.z = iVar;
        this.A = pricingPlanOffer;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, this.f174311w, this.f174312x, this.f174313y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s sVar = new s(bVar, null);
            this.u = 1;
            obj2 = bVar.p2(this, sVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState.RequiredForUpgrade requiredForUpgrade = (SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState.RequiredForUpgrade) obj2;
        m mVar = this.f174311w;
        if (requiredForUpgrade == null) {
            mVar.invoke();
            return Unit.f186387a;
        }
        bVar.f103093s.b3(this.f174312x, new PlanSelectionCoreFlowContract$PlanSelectionParams(this.f174313y, this.z, this.A), requiredForUpgrade.f103101a, new je2.d(mVar, bVar, 15));
        return Unit.f186387a;
    }
}
