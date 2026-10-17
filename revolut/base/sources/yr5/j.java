package yr5;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f316139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f316140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f316141y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Continuation continuation, n nVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f316141y = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                j jVar = new j(continuation, this.f316141y, 0);
                jVar.f316139w = flowCollector;
                jVar.f316140x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            case 1:
                j jVar2 = new j(continuation, this.f316141y, 1);
                jVar2.f316139w = flowCollector;
                jVar2.f316140x = obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
            default:
                j jVar3 = new j(continuation, this.f316141y, 2);
                jVar3.f316139w = flowCollector;
                jVar3.f316140x = obj3;
                return jVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f316139w;
                    vkm.d dVarB = rd0.e.b(this.f316141y.o.a());
                    this.f316139w = null;
                    this.f316140x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f316139w;
                    n nVar = this.f316141y;
                    Flow flowQ = vkm.q.q(new ymk.u(nVar.d3().B(new y4b.b(14)), nVar, 2));
                    this.f316139w = null;
                    this.f316140x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowQ, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f316139w;
                    yhm.r rVar = (yhm.r) this.f316140x;
                    xi0.b bVar = (xi0.b) rVar.f314201a;
                    xi0.b bVar2 = (xi0.b) rVar.f314202b;
                    vkm.d dVarB2 = rd0.e.b(f61.a.H(this.f316141y.f316144n, new Pair(bVar, bVar2), (qta.f) rVar.f314203c, 12));
                    this.f316139w = null;
                    this.f316140x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
