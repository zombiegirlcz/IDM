package ojk;

import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BasePricingPlanBEDrivenViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BasePricingPlanBEDrivenViewController basePricingPlanBEDrivenViewController, Continuation continuation) {
        super(2, continuation);
        this.v = basePricingPlanBEDrivenViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((PlanScreenElementView.ActionWidget) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlanScreenElementView.ActionWidget action = (PlanScreenElementView.ActionWidget) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = (q) this.v.d3();
        qVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        PlanScreenElementView.ActionButton actionButton = action.f;
        if (actionButton != null) {
            qVar.J2(actionButton.f81007b.f81005a);
        }
        return Unit.f186387a;
    }
}
