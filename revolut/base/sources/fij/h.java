package fij;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimGetPlanScreen f135446w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(EsimGetPlanScreen esimGetPlanScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135446w = esimGetPlanScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f135446w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f135446w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((EsimDataPlan) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimGetPlanScreen esimGetPlanScreen = this.f135446w;
        switch (i) {
            case 0:
                EsimDataPlan mobilePlan = (EsimDataPlan) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE3 = esimGetPlanScreen.e3();
                Intrinsics.h(mobilePlan);
                com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) xVarE3;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
                oki.h.v2(fVar.C, new EsimGetPlanScreenContract$ModalStep.MobilePlanSummary(mobilePlan, fVar.o.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE32 = esimGetPlanScreen.e3();
                Intrinsics.h(str);
                ((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) xVarE32).R2(str);
                break;
        }
        return Unit.f186387a;
    }
}
