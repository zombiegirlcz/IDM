package y66;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f311188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f311189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f311190y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Continuation continuation, o oVar) {
        super(3, continuation);
        this.u = i;
        this.f311190y = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(0, continuation, this.f311190y);
                iVar.f311188w = flowCollector;
                iVar.f311189x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(1, continuation, this.f311190y);
                iVar2.f311188w = flowCollector;
                iVar2.f311189x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                boolean z = true;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f311188w;
                    k18.c cVar = this.f311190y.f311197p;
                    akg.n nVarV = nim.a.v(vkm.q.Q(rd0.e.b(xv5.c.b((xv5.c) cVar.f180141c)), new q16.b(null, cVar, z, 0)), k.f311191a);
                    this.f311188w = null;
                    this.f311189x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarV, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f311188w;
                    Flow flowB = this.f311190y.v.B(m.f311193a);
                    this.f311188w = null;
                    this.f311189x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowB, this) == aVar2) {
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
