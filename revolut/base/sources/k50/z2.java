package k50;

import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class z2 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f181308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f181309x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j4 f181310y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(int i, j4 j4Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f181310y = j4Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                z2 z2Var = new z2(0, this.f181310y, continuation);
                z2Var.f181308w = flowCollector;
                z2Var.f181309x = obj3;
                return z2Var.invokeSuspend(Unit.f186387a);
            default:
                z2 z2Var2 = new z2(1, this.f181310y, continuation);
                z2Var2.f181308w = flowCollector;
                z2Var2.f181309x = obj3;
                return z2Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowZ2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f181308w;
                    Pair pair = (Pair) this.f181309x;
                    if (pair == null) {
                        flowZ2 = new go.g(Boolean.FALSE, 2);
                    } else {
                        flowZ2 = this.f181310y.T.Z2((UUID) pair.f186386b, (v30.c0) pair.f186385a);
                    }
                    this.f181308w = null;
                    this.f181309x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowZ2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f181308w;
                    vkm.d dVarB = rd0.e.b(this.f181310y.f181131q.a((UUID) this.f181309x));
                    this.f181308w = null;
                    this.f181309x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
