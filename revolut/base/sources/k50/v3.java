package k50;

import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.ui.agentinfo.AgentInfoContract$InputData;
import com.revolut.chat.ui.agentinfo.AgentInfoScreen;
import com.revolut.kompot.common.ModalDestination;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v3 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UUID f181262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(j4 j4Var, UUID uuid, Continuation continuation) {
        super(1, continuation);
        this.v = j4Var;
        this.f181262w = uuid;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v3(this.v, this.f181262w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v3) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j4 j4Var = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                efm.d0 d0VarD = j4Var.f181136t.d(this.f181262w);
                this.u = 1;
                obj2 = nim.a.b(d0VarD, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            AgentInfo agentInfo = (AgentInfo) obj2;
            Intrinsics.h(agentInfo);
            return yji.l.g2(j4Var, new AgentInfoScreen(new AgentInfoContract$InputData(agentInfo)), ModalDestination.Style.POPUP.f98311a, null, 2);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
            return Unit.f186387a;
        }
    }
}
