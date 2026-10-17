package m9d;

import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ g1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(g1 g1Var, Continuation continuation) {
        super(1, continuation);
        this.v = g1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g1 g1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (((rf3.d) g1Var.u).b() != j30.b.PARTIALLY_ENABLED) {
                g1Var.C1(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, new TicketCreationContext(f7d.i.CATEGORY_HELP_CENTER.a(), (List) null, (List) null, g1Var.N, 22), 3), v30.t.HELP_SCREEN, null, 4), true));
                return Unit.f186387a;
            }
            jhi.b bVarG = mo3.a.g(new lfg.d0(g1Var.q2(), 8), null, new m56.g(24), 1);
            this.u = 1;
            obj2 = vkm.q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Iterator it8 = ((List) obj2).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((v30.y) next).f285834b == v30.c0.SUPPORT) {
                break;
            }
        }
        v30.y yVar = (v30.y) next;
        if (yVar != null) {
            g1Var.C1(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, yVar.f285833a, new TicketCreationContext((String) null, (List) null, (List) null, g1Var.N, 23), 1), v30.t.HELP_SCREEN, null, 4), true));
        } else {
            g1.y2(g1Var, new IllegalStateException("SUPPORT feed not found"));
        }
        return Unit.f186387a;
    }
}
