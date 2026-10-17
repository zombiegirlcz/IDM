package ymk;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreenContract$ModalStep;
import ggk.g1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanPageScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PlanPageScreen planPageScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planPageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SplitColumnCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SplitColumnCellDelegate.Model model = (SplitColumnCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        String id10 = model.f53450a;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) oVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        g1 layout = (g1) ((l) ((j2) aVar2.f103614x.f22677a).getValue()).f315035b.getContent();
        if (layout != null) {
            aVar2.v.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(layout, "layout");
            PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheetC = dnk.d.c(id10, layout.f143722h, layout.i);
            if (plansDashboardLayout$PlanPageLayout$BottomSheetC == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanPageScreenModel", "unable to find bottom sheet on benefit item click", null, h0Var);
            } else {
                oki.h.v2(aVar2.f103615y, new PlanPageScreenContract$ModalStep.PlanPagerBottomSheet(plansDashboardLayout$PlanPageLayout$BottomSheetC), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
