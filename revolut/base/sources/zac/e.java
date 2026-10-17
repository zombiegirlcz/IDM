package zac;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddShippingTrackingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AddShippingTrackingScreen addShippingTrackingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addShippingTrackingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b bVar = (com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b) kVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "CARRIER_INPUT_LIST_ID")) {
            oki.h.v2(bVar.f84610r, AddShippingTrackingScreenContract$ModalStep.SelectCarrier.f84603a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        }
        return Unit.f186387a;
    }
}
