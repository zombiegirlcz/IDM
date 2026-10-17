package rbc;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShippingTrackingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ShippingTrackingScreen shippingTrackingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shippingTrackingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Object obj3 = model.f51787l;
        com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a aVar2 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a) oVarE3;
        aVar2.getClass();
        if (obj3 instanceof f) {
            aVar2.f84637r.c(null, ((f) obj3).f253010a, false, new r1a.a(aVar2, 8));
        }
        return Unit.f186387a;
    }
}
