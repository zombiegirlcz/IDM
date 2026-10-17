package pkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f237156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f237157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f237158y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Continuation continuation, a1 a1Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f237158y = a1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                y0 y0Var = new y0(continuation, this.f237158y, 0);
                y0Var.f237156w = flowCollector;
                y0Var.f237157x = obj3;
                return y0Var.invokeSuspend(Unit.f186387a);
            default:
                y0 y0Var2 = new y0(continuation, this.f237158y, 1);
                y0Var2.f237156w = flowCollector;
                y0Var2.f237157x = obj3;
                return y0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f237156w;
                    a1 a1Var = this.f237158y;
                    wkm.l lVarQ = vkm.q.Q(a1Var.f237015l.d(), new y0(null, a1Var, 1));
                    this.f237156w = null;
                    this.f237157x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarQ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f237156w;
                    a3 a3Var = (a3) this.f237157x;
                    a1 a1Var2 = this.f237158y;
                    Flow flowF = a1Var2.o.f(a3Var, w4l.i.f294643c);
                    this.f237156w = null;
                    this.f237157x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = flowF.collect(new im9.k(flowCollector2, a1Var2, a3Var, 27), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
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
