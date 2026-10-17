package m9d;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class e1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ g1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(g1 g1Var, Continuation continuation) {
        super(2, continuation);
        this.v = g1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ChatFlowDestination chatFlowDestination;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g1 g1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            int i2 = m0.f203726b[((rf3.d) g1Var.u).b().ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                chatFlowDestination = new ChatFlowDestination(new ChatTarget.ChatList(new ChatListFilter.Tickets(true, true), (TicketCreationContext) null, (String) null, 12), true);
                return g1Var.C1(chatFlowDestination);
            }
            this.u = 1;
            obj2 = g1Var.B2(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            chatFlowDestination = new ChatFlowDestination(new ChatTarget.ChatList(new ChatListFilter.Tickets(true, true), (TicketCreationContext) null, (String) null, 12), true);
        } else {
            g1Var.G.getClass();
            chatFlowDestination = new ChatFlowDestination(new ChatTarget.ChatList(ChatListFilter.PastRequests.f51037a, (TicketCreationContext) null, (String) null, 12), true);
        }
        return g1Var.C1(chatFlowDestination);
    }
}
