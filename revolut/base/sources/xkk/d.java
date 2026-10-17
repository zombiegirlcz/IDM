package xkk;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.PlanBenefitsToLoseScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.PlanBenefitsToLoseScreenContract$ModalStep;
import ggk.y;
import ggk.z;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanBenefitsToLoseScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PlanBenefitsToLoseScreen planBenefitsToLoseScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planBenefitsToLoseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SplitColumnCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z layout;
        SplitColumnCellDelegate.Model model = (SplitColumnCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String id10 = model.f53450a;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        y yVar = (y) ((f) ((j2) aVar2.f103476w.f22677a).getValue()).f306848b.getContent();
        if (yVar != null && (layout = yVar.f143800c) != null) {
            aVar2.o.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(layout, "layout");
            PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheetC = dnk.d.c(id10, layout.f143805b, layout.f143806c);
            if (plansDashboardLayout$PlanPageLayout$BottomSheetC == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanBenefitsToLoseScreenModel", "unable to find bottom sheet on benefit item click", null, h0Var);
            } else {
                oki.h.v2(aVar2.v, new PlanBenefitsToLoseScreenContract$ModalStep.PlanPagerBottomSheet(plansDashboardLayout$PlanPageLayout$BottomSheetC), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
