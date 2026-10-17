package ojk;

import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BasePricingPlanBEDrivenViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BasePricingPlanBEDrivenViewController basePricingPlanBEDrivenViewController, Continuation continuation) {
        super(2, continuation);
        this.v = basePricingPlanBEDrivenViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((PlanScreenElementView.FeaturedActionWidget) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlanScreenElementView.FeaturedActionWidget widget = (PlanScreenElementView.FeaturedActionWidget) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0VarD3 = this.v.d3();
        Intrinsics.h(widget);
        q qVar = (q) c0VarD3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(widget, "widget");
        PlanScreenElementView.Action action = widget.f81049h;
        if (action != null) {
            qVar.J2(action.f81005a);
        }
        return Unit.f186387a;
    }
}
