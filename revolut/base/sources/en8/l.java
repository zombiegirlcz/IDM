package en8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f127776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f127777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f127778y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, n nVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f127778y = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l lVar = new l(0, this.f127778y, continuation);
                lVar.f127776w = flowCollector;
                lVar.f127777x = obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l(1, this.f127778y, continuation);
                lVar2.f127776w = flowCollector;
                lVar2.f127777x = obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
            default:
                l lVar3 = new l(2, this.f127778y, continuation);
                lVar3.f127776w = flowCollector;
                lVar3.f127777x = obj3;
                return lVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f127776w;
                    akg.n nVarI2 = n.I2(this.f127778y, (w4l.k) this.f127777x);
                    this.f127776w = null;
                    this.f127777x = null;
                    this.v = 1;
                    if (q.u(flowCollector, nVarI2, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f127776w;
                    w4l.k kVar = (w4l.k) this.f127777x;
                    n nVar = this.f127778y;
                    akg.n nVarA = hj8.a.a(nVar.f127781q, nVar.o.f127766a, kVar);
                    this.f127776w = null;
                    this.f127777x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, nVarA, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f127776w;
                    w4l.k kVar2 = (w4l.k) this.f127777x;
                    n nVar2 = this.f127778y;
                    akg.n nVarV = nim.a.v(u0.m(n.I2(nVar2, kVar2), nVar2.f127783s.a(nVar2.o.f127766a, kVar2)), m.f127779a);
                    this.f127776w = null;
                    this.f127777x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, nVarV, this) == aVar3) {
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
