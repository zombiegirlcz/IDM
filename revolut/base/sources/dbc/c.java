package dbc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayOrderDetails;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.deliveries.DeliveriesScreen;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryWithOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeliveriesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeliveriesScreen deliveriesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deliveriesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.Q.getValue();
        Object obj3 = model.u;
        k kVar = (k) eVar;
        kVar.getClass();
        if (obj3 instanceof DeliveryWithOrder) {
            kVar.C1(new RevolutPayFeatureConfig$RevolutPayOrderDetails(((DeliveryWithOrder) obj3).f84660b.f84664a));
        }
        return Unit.f186387a;
    }
}
