package nje;

import efm.r;
import gld.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f216461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f216462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f216463y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Continuation continuation, n nVar) {
        super(3, continuation);
        this.u = i;
        this.f216463y = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(0, continuation, this.f216463y);
                hVar.f216461w = flowCollector;
                hVar.f216462x = obj3;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(1, continuation, this.f216463y);
                hVar2.f216461w = flowCollector;
                hVar2.f216462x = obj3;
                return hVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f216461w;
                    n nVar = this.f216463y;
                    r rVarG = m70.a.g(((ji5.e) nVar.f216472w).f(), null, i.f216464a, 1);
                    j function = j.f216465a;
                    Intrinsics.checkNotNullParameter(function, "function");
                    int i2 = 1;
                    r rVarFilter = rVarG.filter(new nd.n(i2));
                    Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                    wkm.l lVarQ = vkm.q.Q(rd0.e.b(rVarFilter), new h(i2, null, nVar));
                    this.f216461w = null;
                    this.f216462x = null;
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
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f216461w;
                    Flow flowE = ((f0) this.f216463y.f216470s).f144638l.e();
                    this.f216461w = null;
                    this.f216462x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowE, this) == aVar2) {
                        return aVar2;
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
