package x1g;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f302440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f302441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c0 f302442y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Continuation continuation, c0 c0Var) {
        super(3, continuation);
        this.u = i;
        this.f302442y = c0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                v vVar = new v(0, continuation, this.f302442y);
                vVar.f302440w = flowCollector;
                vVar.f302441x = obj3;
                return vVar.invokeSuspend(Unit.f186387a);
            default:
                v vVar2 = new v(1, continuation, this.f302442y);
                vVar2.f302440w = flowCollector;
                vVar2.f302441x = obj3;
                return vVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowV;
        int i = this.u;
        c0 c0Var = this.f302442y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f302440w;
                    dj0.d dVar = (dj0.d) this.f302441x;
                    if (pyd.c.E(((i) ((j2) c0Var.I.f22677a).getValue()).f302424l)) {
                        q7c.g gVar = c0Var.z;
                        u6c.n nVar = new u6c.n(null, null, c0Var.F, new Long(dVar.f115082a), dVar.f115083b, false, null, null, 995);
                        k6c.a aVar2 = k6c.b.Companion;
                        flowV = nim.a.v(gVar.b(nVar, w4l.i.f294643c), w.f302443a);
                    } else {
                        flowV = vkm.i.f290039a;
                    }
                    this.f302440w = null;
                    this.f302441x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowV, this) == aVar) {
                        return aVar;
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
                    FlowCollector flowCollector2 = this.f302440w;
                    w4l.k kVar = (w4l.k) this.f302441x;
                    vkm.d dVarB = rd0.e.b(((nyb.o) c0Var.f302408w).f(kVar instanceof w4l.i));
                    this.f302440w = null;
                    this.f302441x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar3) {
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
