package lbc;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(OrderDetailsScreen orderDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.R2();
        Object obj3 = model.f51787l;
        com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar2 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) sVarE3;
        aVar2.getClass();
        c70.a aVar3 = aVar2.v;
        if (obj3 instanceof l) {
            aVar3.c(null, ((l) obj3).f193636a, false, new kob.a(aVar2, 24));
        } else if (obj3 instanceof kac.a) {
            aVar2.C1(new ExternalDestination.Browser(((kac.a) obj3).f182453a, null));
        } else if (obj3 instanceof kac.b) {
            aVar3.c(null, ((kac.b) obj3).f182454a, false, new kob.a(aVar2, 24));
        }
        return Unit.f186387a;
    }
}
