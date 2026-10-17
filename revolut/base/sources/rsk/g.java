package rsk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nel.n;
import vkm.q;
import vkm.q0;
import vkm.v1;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f257107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f257108x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f257109y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Continuation continuation, j jVar, n nVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f257109y = jVar;
        this.z = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(continuation, this.f257109y, this.z, 0);
                gVar.f257107w = flowCollector;
                gVar.f257108x = obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                g gVar2 = new g(continuation, this.f257109y, this.z, 1);
                gVar2.f257107w = flowCollector;
                gVar2.f257108x = obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow v1Var;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f257107w;
                    boolean zBooleanValue = ((Boolean) this.f257108x).booleanValue();
                    j jVar = this.f257109y;
                    Flow gVar = zBooleanValue ? new go.g(jVar.f257118r, 2) : new r7b.e(rd0.e.b(jVar.f257114m.a(this.z.f214596b, false)), 16);
                    this.f257107w = null;
                    this.f257108x = null;
                    this.v = 1;
                    if (q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f257107w;
                    boolean zBooleanValue2 = ((Boolean) this.f257108x).booleanValue();
                    j jVar2 = this.f257109y;
                    Continuation continuation = null;
                    if (zBooleanValue2) {
                        qrk.d dVar = jVar2.f257115n;
                        tqk.a aVar3 = tqk.a.CALL_DATE;
                        n nVar = this.z;
                        v1Var = new q0(q.Q(dVar.a(aVar3, nVar.f214596b), new g(continuation, jVar2, nVar, 0)), new rk9.d(jVar2, continuation, 27), 1);
                    } else {
                        v1Var = new v1(new rlh.c(jVar2, continuation, 15));
                    }
                    this.f257107w = null;
                    this.f257108x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, v1Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
