package dcf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f112925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f112926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f112927y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, i0 i0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f112927y = i0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(0, this.f112927y, continuation);
                e0Var.f112925w = flowCollector;
                e0Var.f112926x = obj3;
                return e0Var.invokeSuspend(Unit.f186387a);
            case 1:
                e0 e0Var2 = new e0(1, this.f112927y, continuation);
                e0Var2.f112925w = flowCollector;
                e0Var2.f112926x = obj3;
                return e0Var2.invokeSuspend(Unit.f186387a);
            default:
                e0 e0Var3 = new e0(2, this.f112927y, continuation);
                e0Var3.f112925w = flowCollector;
                e0Var3.f112926x = obj3;
                return e0Var3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f112925w;
                    wbf.g gVar = (wbf.g) this.f112927y.u;
                    Flow flowE = boh.f.e(ybl.k.g(gVar.f296147a, new w6h.f(20)), new w3c.n(gVar, 23));
                    this.f112925w = null;
                    this.f112926x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowE, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f112925w;
                    Flow flowW0 = this.f112927y.f112948w.f2828l.w0();
                    this.f112925w = null;
                    this.f112926x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowW0, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f112925w;
                    wbf.c cVar = this.f112927y.C;
                    vkm.d dVarB = rd0.e.b(pd.b.r(((wbf.n) cVar.f296144a).b(lbf.f.TRADING_PRO, false), new w3c.n(cVar, 22)));
                    this.f112925w = null;
                    this.f112926x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar3) {
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
