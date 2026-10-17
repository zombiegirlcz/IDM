package o9c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsContract$InputData;
import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsScreen;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ RevolutPaySummaryScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RevolutPaySummaryScreen revolutPaySummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revolutPaySummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.u.R2();
        pec.o oVar = fVar.f84578y;
        pec.e eVar = (pec.e) ((s) ((j2) fVar.M.f22677a).getValue()).f223228g.getContent();
        uec.e eVar2 = (uec.e) oVar;
        eVar2.getClass();
        pec.d dVar = eVar instanceof pec.d ? (pec.d) eVar : null;
        if (dVar != null) {
            eVar2.N2(new DeliveryMethodsScreen(new DeliveryMethodsContract$InputData(eVar2.b3(), dVar.f235362a, dVar.f235363b, false, null)), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new u69.g(eVar2, dVar, 17));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Trying to open delivery selection without selected shipping contact");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
