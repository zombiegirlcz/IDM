package lbc;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(OrderDetailsScreen orderDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.R2();
        Object obj3 = model.o;
        com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar2 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) sVarE3;
        aVar2.getClass();
        if (obj3 instanceof t) {
            aVar2.H2(aVar2.f84630y, new l3d.a(((t) obj3).f193646a, 8));
        }
        return Unit.f186387a;
    }
}
