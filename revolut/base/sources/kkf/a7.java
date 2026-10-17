package kkf;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class a7 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f184599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f184600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e7 f184601y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(Continuation continuation, e7 e7Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f184601y = e7Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a7 a7Var = new a7(continuation, this.f184601y, 0);
                a7Var.f184599w = flowCollector;
                a7Var.f184600x = obj3;
                return a7Var.invokeSuspend(Unit.f186387a);
            default:
                a7 a7Var2 = new a7(continuation, this.f184601y, 1);
                a7Var2.f184599w = flowCollector;
                a7Var2.f184600x = obj3;
                return a7Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f184599w;
                    Continuation continuation = null;
                    if (((Boolean) this.f184600x).booleanValue()) {
                        e7 e7Var = this.f184601y;
                        gVar = vkm.q.Q(yh5.b.e(e7Var.f184660l.d(), new x5(e7Var.o.a(), 4), rd0.e.b(ue0.e.H(cl3.a.a(e7Var.f184666s), zhm.h0.f322473a, b7.f184615a))), new a7(continuation, e7Var, 1));
                    } else {
                        gVar = new go.g(zhm.f0.f322471a, 2);
                    }
                    this.f184599w = null;
                    this.f184600x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f184599w;
                    yhm.r rVar = (yhm.r) this.f184600x;
                    tof.a3 a3Var = (tof.a3) rVar.f314201a;
                    boolean zBooleanValue = ((Boolean) rVar.f314202b).booleanValue();
                    Map map = (Map) rVar.f314203c;
                    Intrinsics.h(map);
                    e7 e7Var2 = this.f184601y;
                    e7Var2.getClass();
                    Flow gVar2 = (k71.k.q0(a3Var) || k71.k.T(a3Var) || zBooleanValue) ? new go.g(zhm.f0.f322471a, 2) : new ard.c0((SharedFlow) e7Var2.f184662n.f185540g.getValue(), e7Var2, a3Var, map, 14);
                    this.f184599w = null;
                    this.f184600x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar2, this) == aVar2) {
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
