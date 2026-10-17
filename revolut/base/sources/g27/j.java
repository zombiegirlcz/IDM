package g27;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ OrderInitPageDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(OrderInitPageDetailsScreen orderInitPageDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = orderInitPageDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVar = (t) this.u.R2();
        tVar.getClass();
        tVar.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
        return Unit.f186387a;
    }
}
