package kkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class u8 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f184972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f184973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z8 f184974y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Continuation continuation, z8 z8Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f184974y = z8Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u8 u8Var = new u8(continuation, this.f184974y, 0);
                u8Var.f184972w = flowCollector;
                u8Var.f184973x = obj3;
                return u8Var.invokeSuspend(Unit.f186387a);
            default:
                u8 u8Var2 = new u8(continuation, this.f184974y, 1);
                u8Var2.f184972w = flowCollector;
                u8Var2.f184973x = obj3;
                return u8Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow gVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f184972w;
                    Continuation continuation = null;
                    if (((Boolean) this.f184973x).booleanValue()) {
                        gVar = new go.g(zhm.f0.f322471a, 2);
                    } else {
                        z8 z8Var = this.f184974y;
                        gVar = new z7(vkm.q.Q(new ae8.c(bla.b.b(z8Var.f185059a, "security_hub.trusted_merchants"), 14), new m5(continuation, new k98.a(z8Var, 10), 7)), z8Var, 6);
                    }
                    this.f184972w = null;
                    this.f184973x = null;
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
                    FlowCollector flowCollector2 = this.f184972w;
                    if (((Boolean) this.f184973x).booleanValue()) {
                        z8 z8Var2 = this.f184974y;
                        yig.a aVar3 = z8Var2.f185060b;
                        String transactionId = z8Var2.f185061c.f185494j;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        gVar2 = new kge.b(rd0.e.b(((bjg.f) aVar3).f.f(transactionId, true)), 8);
                    } else {
                        gVar2 = new go.g(null, 2);
                    }
                    this.f184972w = null;
                    this.f184973x = null;
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
