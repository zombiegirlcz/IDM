package gie;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f144145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f144146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f144147y;
    public final /* synthetic */ Flow z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Continuation continuation, s sVar, Flow flow, int i) {
        super(3, continuation);
        this.u = i;
        this.f144147y = sVar;
        this.z = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(continuation, this.f144147y, this.z, 0);
                oVar.f144145w = flowCollector;
                oVar.f144146x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(continuation, this.f144147y, this.z, 1);
                oVar2.f144145w = flowCollector;
                oVar2.f144146x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f144145w;
                    s sVar = this.f144147y;
                    v1 v1Var = new v1(new m(this.z, sVar, sVar.f144149l, null));
                    this.f144145w = null;
                    this.f144146x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, v1Var, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f144145w;
                    s sVar2 = this.f144147y;
                    v1 v1Var2 = new v1(new m(this.z, sVar2, sVar2.f144150m, null));
                    this.f144145w = null;
                    this.f144146x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, v1Var2, this) == aVar2) {
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
