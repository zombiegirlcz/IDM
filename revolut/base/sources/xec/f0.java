package xec;

import k7c.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f304585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f304586x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b f304587y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Continuation continuation, com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f304587y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                f0 f0Var = new f0(continuation, this.f304587y, 0);
                f0Var.f304585w = flowCollector;
                f0Var.f304586x = obj3;
                return f0Var.invokeSuspend(Unit.f186387a);
            default:
                f0 f0Var2 = new f0(continuation, this.f304587y, 1);
                f0Var2.f304585w = flowCollector;
                f0Var2.f304586x = obj3;
                return f0Var2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f304585w;
                    q7c.s sVar = this.f304587y.o;
                    sVar.getClass();
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    y0 y0Var = sVar.f242835a;
                    y0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = y0Var.d.b(Unit.f186387a, loadingStrategy);
                    this.f304585w = null;
                    this.f304586x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f304585w;
                    akg.n nVarV = nim.a.v(rd0.e.b(this.f304587y.o.f242836b.k(false)), new q75.n(12));
                    this.f304585w = null;
                    this.f304586x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar2) {
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
