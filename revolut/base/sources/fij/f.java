package fij;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ EsimGetPlanScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EsimGetPlanScreen esimGetPlanScreen, Continuation continuation) {
        super(2, continuation);
        this.u = esimGetPlanScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) this.u.R2()).C, EsimGetPlanScreenContract$ModalStep.RevPointsBottomSheet.f101007a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
