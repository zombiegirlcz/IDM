package zul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f325517w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f325518x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.screens.investment_plan.projection.a f325519y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f325519y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(0, this.f325519y, continuation);
                a0Var.f325517w = flowCollector;
                a0Var.f325518x = obj3;
                return a0Var.invokeSuspend(Unit.f186387a);
            default:
                a0 a0Var2 = new a0(1, this.f325519y, continuation);
                a0Var2.f325517w = flowCollector;
                a0Var2.f325518x = obj3;
                return a0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar = this.f325519y;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f325517w;
                    Flow flowA = aVar.f107038q.a(aVar.o.f107031a, null, com.revolut.trading.orders.ui.screens.investment_plan.projection.a.D, new yrb.n(aVar, 8), (w4l.k) this.f325518x);
                    this.f325517w = null;
                    this.f325518x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowA, this) == aVar2) {
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
                    FlowCollector flowCollector2 = this.f325517w;
                    w4l.k kVar = (w4l.k) this.f325518x;
                    x xVar = com.revolut.trading.orders.ui.screens.investment_plan.projection.a.Companion;
                    vkm.d dVarB = aVar.f107039r.b(new dil.a(aVar.o.f107031a, null, com.revolut.trading.orders.ui.screens.investment_plan.projection.a.D), kVar);
                    this.f325517w = null;
                    this.f325518x = null;
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
