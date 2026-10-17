package rh8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okl.l1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f254323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f254324x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f254325y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, f fVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f254325y = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(continuation, this.f254325y, 0);
                cVar.f254323w = flowCollector;
                cVar.f254324x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                c cVar2 = new c(continuation, this.f254325y, 1);
                cVar2.f254323w = flowCollector;
                cVar2.f254324x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowQ;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f254323w;
                    Continuation continuation = null;
                    if (((Boolean) this.f254324x).booleanValue()) {
                        f fVar = this.f254325y;
                        flowQ = vkm.q.Q(new l1(rd0.e.n(rd0.e.b(fVar.f254333b.d0(null, w4l.h.f294642c)), zhm.h0.f322473a), 6), new c(continuation, fVar, 1));
                    } else {
                        flowQ = new go.g(Boolean.FALSE, 2);
                    }
                    this.f254323w = null;
                    this.f254324x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowQ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f254323w;
                    Flow gVar = ((Boolean) this.f254324x).booleanValue() ? new go.g(Boolean.FALSE, 2) : new l1(rd0.e.n(rd0.e.b(this.f254325y.f254332a.a()), zhm.h0.f322473a), 7);
                    this.f254323w = null;
                    this.f254324x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
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
