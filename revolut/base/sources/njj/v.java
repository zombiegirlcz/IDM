package njj;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPorting;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$ModalStep;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ EsimMobilePlanCheckoutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = esimMobilePlanCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimCheckoutPorting esimCheckoutPorting;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) this.u.d();
        dej.a aVar3 = (dej.a) ((b0) ((j2) aVar2.G.f22677a).getValue()).e.getContent();
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = (aVar3 == null || (esimCheckoutPorting = aVar3.f113476j) == null) ? null : esimCheckoutPorting.f100192a;
        if (esimCheckoutPortingSteps != null) {
            oki.h.v2(aVar2.H, new EsimMobilePlanCheckoutScreenContract$ModalStep.CompleteNumberTransfer(esimCheckoutPortingSteps), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimMobilePlanCheckoutScreenModel", "Can't open CompleteNumberTransfer bottom sheet, transferSteps == null", null, h0Var);
        }
        return Unit.f186387a;
    }
}
