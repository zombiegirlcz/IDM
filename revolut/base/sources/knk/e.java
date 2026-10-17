package knk;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreenContract$ModalStep;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanSingleOfferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlanSingleOfferScreen planSingleOfferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planSingleOfferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SplitColumnCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SplitColumnCellDelegate.Model model = (SplitColumnCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        String id10 = model.f53450a;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        ggk.f fVarL2 = aVar2.L2();
        if (fVarL2 != null) {
            ArrayList arrayList = fVarL2.f143714g;
            aVar2.f103631q.getClass();
            PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheetC = dnk.d.c(id10, arrayList, null);
            if (plansDashboardLayout$PlanPageLayout$BottomSheetC == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanSingleOfferScreenModel", "unable to find bottom sheet on benefit item click", null, h0Var);
            } else {
                oki.h.v2(aVar2.v, new PlanSingleOfferScreenContract$ModalStep.BottomSheet(plansDashboardLayout$PlanPageLayout$BottomSheetC), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
