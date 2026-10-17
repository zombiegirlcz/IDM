package f40;

import aw0.n6;
import com.revolut.chat.ui.agent_offline.AgentOfflineScreen;
import f40.d;
import f40.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AgentOfflineScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AgentOfflineScreen agentOfflineScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = agentOfflineScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f.b bVar = f.b.f131994a;
        AgentOfflineScreen agentOfflineScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) ((g) agentOfflineScreen.T.getValue());
                d dVar = iVar.o;
                boolean z = dVar instanceof d.b;
                f.a aVar2 = f.a.f131993a;
                if (z) {
                    iVar.C2(aVar2);
                } else if (dVar instanceof d.a) {
                    iVar.C2(bVar);
                } else if (dVar instanceof c) {
                    iVar.C2(aVar2);
                } else {
                    if (!(dVar instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.C2(bVar);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) ((g) agentOfflineScreen.T.getValue());
                d dVar2 = iVar2.o;
                if ((dVar2 instanceof d.b) || (dVar2 instanceof d.a)) {
                    iVar2.B2();
                } else if (dVar2 instanceof c) {
                    iVar2.C2(bVar);
                } else {
                    if (!(dVar2 instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar2.B2();
                }
                return Unit.f186387a;
        }
    }
}
