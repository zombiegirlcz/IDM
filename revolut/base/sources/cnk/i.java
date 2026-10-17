package cnk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$InfoBottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PricingPlanInfoBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PricingPlanInfoBottomSheetScreen pricingPlanInfoBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pricingPlanInfoBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action action = (PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((m) ((j) this.v.P.getValue())).I2(action);
        return Unit.f186387a;
    }
}
