package iuf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f168556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f168557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ vrf.h f168558y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Continuation continuation, vrf.h hVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f168558y = hVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(continuation, this.f168558y, 0);
                b0Var.f168556w = flowCollector;
                b0Var.f168557x = obj3;
                return b0Var.invokeSuspend(Unit.f186387a);
            case 1:
                b0 b0Var2 = new b0(continuation, this.f168558y, 1);
                b0Var2.f168556w = flowCollector;
                b0Var2.f168557x = obj3;
                return b0Var2.invokeSuspend(Unit.f186387a);
            default:
                b0 b0Var3 = new b0(continuation, this.f168558y, 2);
                b0Var3.f168556w = flowCollector;
                b0Var3.f168557x = obj3;
                return b0Var3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f168556w;
                    Flow flowC = ((xrf.b) this.f168558y).c((vrf.i) this.f168557x);
                    this.f168556w = null;
                    this.f168557x = null;
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
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f168556w;
                    Flow flowC2 = ((xrf.b) this.f168558y).c((vrf.i) this.f168557x);
                    this.f168556w = null;
                    this.f168557x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowC2, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f168556w;
                    Flow flowC3 = ((xrf.b) this.f168558y).c((vrf.i) this.f168557x);
                    this.f168556w = null;
                    this.f168557x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowC3, this) == aVar3) {
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
