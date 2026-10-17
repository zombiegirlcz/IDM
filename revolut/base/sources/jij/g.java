package jij;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.EsimPlanSelectionScreen;
import fij.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimPlanSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(EsimPlanSelectionScreen esimPlanSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimPlanSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            case 2:
                return new g(this.v, continuation, 2);
            default:
                return new g(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimPlanSelectionScreen esimPlanSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) esimPlanSelectionScreen.d()).L2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) esimPlanSelectionScreen.d()).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) esimPlanSelectionScreen.d()).M2();
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) esimPlanSelectionScreen.d();
                p pVarE = ((EsimGetPlanScreenContract$DomainState) ((j2) fVar.B.f22677a).getValue()).e();
                EsimDataPlan mobilePlan = pVarE != null ? pVarE.f135452b : null;
                if (mobilePlan != null) {
                    Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
                    oki.h.v2(fVar.C, new EsimGetPlanScreenContract$ModalStep.MobilePlanSummary(mobilePlan, fVar.o.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f.K2("Can't open see all features bottom sheet, selected plan is null");
                }
                break;
        }
        return Unit.f186387a;
    }
}
