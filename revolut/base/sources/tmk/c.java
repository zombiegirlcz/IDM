package tmk;

import aw0.n6;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanOfferBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PlanOfferBottomSheetScreen planOfferBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planOfferBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        PricingPlanLayoutButton pricingPlanLayoutButton;
        List list2;
        PricingPlanLayoutButton pricingPlanLayoutButton2;
        int i = this.u;
        PlanOfferBottomSheetScreen planOfferBottomSheetScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) planOfferBottomSheetScreen.L.getValue();
                Intrinsics.i(gVar, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreenContract.ScreenModelApi");
                i iVar = (i) gVar;
                PricingPlanLayoutFooter pricingPlanLayoutFooter = iVar.o.f103589a.f102847a.d;
                if (pricingPlanLayoutFooter != null && (list = pricingPlanLayoutFooter.f102834a) != null && (pricingPlanLayoutButton = (PricingPlanLayoutButton) d0.e0(0, list)) != null) {
                    iVar.C2(new d(pricingPlanLayoutButton.f102833c));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar2 = (g) planOfferBottomSheetScreen.L.getValue();
                Intrinsics.i(gVar2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreenContract.ScreenModelApi");
                i iVar2 = (i) gVar2;
                PricingPlanLayoutFooter pricingPlanLayoutFooter2 = iVar2.o.f103589a.f102847a.d;
                if (pricingPlanLayoutFooter2 != null && (list2 = pricingPlanLayoutFooter2.f102834a) != null && (pricingPlanLayoutButton2 = (PricingPlanLayoutButton) d0.e0(1, list2)) != null) {
                    iVar2.C2(new d(pricingPlanLayoutButton2.f102833c));
                }
                break;
        }
        return Unit.f186387a;
    }
}
