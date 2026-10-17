package ble;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f16587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f16588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Flow f16589y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(int i, Continuation continuation, Flow flow) {
        super(3, continuation);
        this.u = i;
        this.f16589y = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o1 o1Var = new o1(0, continuation, this.f16589y);
                o1Var.f16587w = flowCollector;
                o1Var.f16588x = obj3;
                return o1Var.invokeSuspend(Unit.f186387a);
            case 1:
                o1 o1Var2 = new o1(1, continuation, this.f16589y);
                o1Var2.f16587w = flowCollector;
                o1Var2.f16588x = obj3;
                return o1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                o1 o1Var3 = new o1(2, continuation, this.f16589y);
                o1Var3.f16587w = flowCollector;
                o1Var3.f16588x = obj3;
                return o1Var3.invokeSuspend(Unit.f186387a);
            default:
                o1 o1Var4 = new o1(3, continuation, this.f16589y);
                o1Var4.f16587w = flowCollector;
                o1Var4.f16588x = obj3;
                return o1Var4.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f16587w;
                    Flow flow = ((p) this.f16588x) == p.STANDARD ? this.f16589y : vkm.i.f290039a;
                    this.f16587w = null;
                    this.f16588x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flow, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f16587w;
                    this.f16587w = null;
                    this.f16588x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, this.f16589y, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f16587w;
                    Flow d0Var = yoj.b.k((yoj.a) this.f16588x) ? new lfg.d0(this.f16589y, 29) : new go.g(ocb.y.f224204a, 2);
                    this.f16587w = null;
                    this.f16588x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, d0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f16587w;
                    Data data = (Data) this.f16588x;
                    Flow gVar = (data.getContent() != null || data.getError() == null) ? new go.g(data, 2) : this.f16589y;
                    this.f16587w = null;
                    this.f16588x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, gVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
