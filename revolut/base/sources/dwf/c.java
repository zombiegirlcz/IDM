package dwf;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TicketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TicketDetailsScreen ticketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = ticketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.R2();
        ActionsView.Item item = yVar.f167226b;
        String actionId = item.f58316a;
        Object obj3 = item.f58324n;
        com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar = (com.revolut.feature.transport.impl.ui.hub.ticket_details.b) hVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        if (Intrinsics.f(actionId, "ACTIVATE_ACTION_ITEM_ID")) {
            PurchasedTransitTicket.ToBeActivated toBeActivated = obj3 instanceof PurchasedTransitTicket.ToBeActivated ? (PurchasedTransitTicket.ToBeActivated) obj3 : null;
            if (toBeActivated != null) {
                ((rvf.i) bVar.f92533q).Z2(toBeActivated);
            }
        } else if (Intrinsics.f(actionId, "EXTEND_ACTION_ITEM_ID")) {
            PurchasedTransitTicket.Activated activated = obj3 instanceof PurchasedTransitTicket.Activated ? (PurchasedTransitTicket.Activated) obj3 : null;
            if (activated != null) {
                bVar.l2(new l(bVar, activated, null), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
