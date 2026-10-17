package a3i;

import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsController;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OrderDetailsController orderDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = orderDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        String listId = yVar.f167226b.f58316a;
        com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar = (com.revolut.feature_exchange.impl.ui.order_details_kompot.b) nVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "CANCEL_ACTION")) {
            oki.h.v2(bVar.u, new OrderDetailsScreenContract$ModalStep.CancelConfirmation(bVar.o.f96968a.getF72134a().f72139c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown listId=", listId)));
        }
        return Unit.f186387a;
    }
}
