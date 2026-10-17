package nhg;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f215463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f215464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f f215465y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f215465y = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(0, this.f215465y, continuation);
                c0Var.f215463w = flowCollector;
                c0Var.f215464x = obj3;
                return c0Var.invokeSuspend(Unit.f186387a);
            default:
                c0 c0Var2 = new c0(1, this.f215465y, continuation);
                c0Var2.f215463w = flowCollector;
                c0Var2.f215464x = obj3;
                return c0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowB;
        Flow flowB2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f215463w;
                    Pair pair = (Pair) this.f215464x;
                    boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                    hfg.i request = (hfg.i) pair.f186386b;
                    if (zBooleanValue) {
                        vfg.r rVar = this.f215465y.f94331q;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        w4l.h loadingStrategy = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        lfg.g0 g0Var = rVar.f288635a;
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        flowB = rd0.e.b(g0Var.o.e(request, loadingStrategy));
                    } else {
                        flowB = vkm.i.f290039a;
                    }
                    this.f215463w = null;
                    this.f215464x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f215463w;
                    Pair pair2 = (Pair) this.f215464x;
                    boolean zBooleanValue2 = ((Boolean) pair2.f186385a).booleanValue();
                    hfg.i request2 = (hfg.i) pair2.f186386b;
                    if (zBooleanValue2) {
                        vfg.r rVar2 = this.f215465y.f94331q;
                        rVar2.getClass();
                        Intrinsics.checkNotNullParameter(request2, "request");
                        w4l.h loadingStrategy2 = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                        lfg.g0 g0Var2 = rVar2.f288635a;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                        flowB2 = rd0.e.b(g0Var2.f194893n.e(request2, loadingStrategy2));
                    } else {
                        flowB2 = vkm.i.f290039a;
                    }
                    this.f215463w = null;
                    this.f215464x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowB2, this) == aVar2) {
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
