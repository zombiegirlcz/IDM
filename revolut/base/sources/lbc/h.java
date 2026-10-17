package lbc;

import com.revolut.core.ui_kit.delegates.LinearProgressTrackingDelegate;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreenContract$ModalStep;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(OrderDetailsScreen orderDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LinearProgressTrackingDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LinearProgressTrackingDelegate.Model model = (LinearProgressTrackingDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.R2();
        Object obj3 = model.f52664h;
        com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar2 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) sVarE3;
        if (obj3 instanceof Delivery) {
            oki.h.v2(aVar2.f84629x, new OrderDetailsScreenContract$ModalStep.OpenTracking((Delivery) obj3), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
