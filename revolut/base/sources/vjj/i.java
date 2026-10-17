package vjj;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$ModalStep;
import dej.i3;
import dej.t1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ EsimMobilePlanDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = esimMobilePlanDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        i3 i3Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) this.u.R2();
        t1 t1Var = (t1) ((j) ((j2) cVar.I.f22677a).getValue()).f289765a.getContent();
        List f100208a = (t1Var == null || (list = t1Var.o) == null || (i3Var = (i3) zhm.d0.d0(list)) == null) ? null : i3Var.f113563h.getF100208a();
        List list2 = f100208a;
        if (list2 == null || list2.isEmpty()) {
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c.L2("Coverage countries is null or empty, can't display coverage countries modal");
        } else {
            oki.h.v2(cVar.J, new EsimMobilePlanDetailsScreenContract$ModalStep.CoverageCountries(f100208a), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
