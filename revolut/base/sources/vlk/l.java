package vlk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.PlanContextualSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanContextualSelectionScreen f290487w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(PlanContextualSelectionScreen planContextualSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f290487w = planContextualSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f290487w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f290487w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PricingPlanAction pricingPlanAction;
        int i = this.u;
        PlanContextualSelectionScreen planContextualSelectionScreen = this.f290487w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = planContextualSelectionScreen.e3();
                Intrinsics.h(clickData);
                sVarE3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                pricingPlanAction = obj3 instanceof PricingPlanAction ? (PricingPlanAction) obj3 : null;
                if (pricingPlanAction != null) {
                    sVarE3.C2(new n(pricingPlanAction));
                }
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE32 = planContextualSelectionScreen.e3();
                Intrinsics.h(clickData2);
                sVarE32.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj4 = clickData2.d;
                pricingPlanAction = obj4 instanceof PricingPlanAction ? (PricingPlanAction) obj4 : null;
                if (pricingPlanAction != null) {
                    sVarE32.C2(new n(pricingPlanAction));
                }
                break;
        }
        return Unit.f186387a;
    }
}
