package u7k;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ PaymentLinkDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PaymentLinkDetailsScreen paymentLinkDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = paymentLinkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) this.u.R2();
        bVar.getClass();
        bVar.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
        return Unit.f186387a;
    }
}
