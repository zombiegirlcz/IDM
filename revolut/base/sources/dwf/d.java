package dwf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TicketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TicketDetailsScreen ticketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = ticketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.R2();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transactions.models.Transaction");
        a3 transaction = (a3) obj3;
        com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar = (com.revolut.feature.transport.impl.ui.hub.ticket_details.b) hVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        bVar.C1(u0.c(new TransactionsFeatureConfig.Details(q.P(transaction), null, null, null, 126)));
        return Unit.f186387a;
    }
}
