package wyc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import tof.r9;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f301221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f301222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f301223y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Continuation continuation, t tVar) {
        super(3, continuation);
        this.u = i;
        this.f301223y = tVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                q qVar = new q(0, continuation, this.f301223y);
                qVar.f301221w = flowCollector;
                qVar.f301222x = obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            default:
                q qVar2 = new q(1, continuation, this.f301223y);
                qVar2.f301221w = flowCollector;
                qVar2.f301222x = obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f301221w;
                    t tVar = this.f301223y;
                    vkm.d dVarB = rd0.e.b(nim.a.w(com.revolut.domain.interactors.transactions.a.d(tVar.f301229s, new r9(tVar.o), null, null, null, null, 30), r.f301224a));
                    this.f301221w = null;
                    this.f301222x = null;
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
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f301221w;
                    oyc.c cVar = (oyc.c) this.f301223y.f301228r.f188258b;
                    vkm.d dVarB2 = rd0.e.b(nim.a.w(cVar.f230941g.f(Unit.f186387a, false), new oyc.a(cVar, 7)));
                    this.f301221w = null;
                    this.f301222x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
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
