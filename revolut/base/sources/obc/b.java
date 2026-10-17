package obc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier.SelectTrackingCarrierScreen;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectTrackingCarrierScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SelectTrackingCarrierScreen selectTrackingCarrierScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectTrackingCarrierScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.R2();
        Object obj3 = model.u;
        m mVar = (m) kVarE3;
        mVar.getClass();
        if (obj3 instanceof DeliveryCarrier) {
            mVar.C2(new j((DeliveryCarrier) obj3));
        }
        return Unit.f186387a;
    }
}
