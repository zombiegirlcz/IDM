package lbc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OrderDetailsScreen orderDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderDetailsScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.R2();
        Object obj3 = model.u;
        com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar2 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) sVarE3;
        aVar2.getClass();
        if (obj3 instanceof a3) {
            aVar2.C1(u0.c(new TransactionsFeatureConfig.Details(ofm.q.P((a3) obj3), null, null, null, 126)));
        } else if (obj3 instanceof RevPointsTransaction) {
            aVar2.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails((RevPointsTransaction) obj3, null, false, null, true, 14)));
        }
        return Unit.f186387a;
    }
}
