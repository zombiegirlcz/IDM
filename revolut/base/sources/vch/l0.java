package vch;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f287717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f287718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x0 f287719y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i, Continuation continuation, x0 x0Var) {
        super(3, continuation);
        this.u = i;
        this.f287719y = x0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(0, continuation, this.f287719y);
                l0Var.f287717w = flowCollector;
                l0Var.f287718x = obj3;
                return l0Var.invokeSuspend(Unit.f186387a);
            default:
                l0 l0Var2 = new l0(1, continuation, this.f287719y);
                l0Var2.f287717w = flowCollector;
                l0Var2.f287718x = obj3;
                return l0Var2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f287717w;
                    x0 x0Var = this.f287719y;
                    Flow flowC = x0Var.u.c(x0Var.f287743q.f95653b, ((k) x0Var.t2()).f287708a);
                    this.f287717w = null;
                    this.f287718x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowC, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f287717w;
                    Pair pair = (Pair) this.f287718x;
                    dj0.d dVar = (dj0.d) pair.f186385a;
                    f0h.a aVar3 = (f0h.a) pair.f186386b;
                    if (aVar3 == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Flow flowA = this.f287719y.E.a(dVar.f115083b, aVar3.f131122a, dVar, n1h.a.FROM);
                    this.f287717w = null;
                    this.f287718x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = flowA.collect(new u0(flowCollector2, dVar, 0), this);
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
