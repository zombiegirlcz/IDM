package zac;

import cli.y;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddShippingTrackingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AddShippingTrackingScreen addShippingTrackingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addShippingTrackingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddShippingTrackingScreen addShippingTrackingScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b) addShippingTrackingScreen.d()).C2(h.f320652a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b bVar = (com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b) addShippingTrackingScreen.d();
                y yVar = bVar.f84609q;
                DeliveryCarrier deliveryCarrier = ((f) ((j2) yVar.f22677a).getValue()).f320649b;
                if (d0.W(((f) ((j2) yVar.f22677a).getValue()).f320648a) || deliveryCarrier == null) {
                    bVar.H2(yVar, new z8h.b(18));
                } else {
                    bVar.l2(new yv1.k(bVar, deliveryCarrier, null, 28), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
