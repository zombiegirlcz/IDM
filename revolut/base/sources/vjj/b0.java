package vjj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f289757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f289758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c f289759y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f289759y = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(0, this.f289759y, continuation);
                b0Var.f289757w = flowCollector;
                b0Var.f289758x = obj3;
                return b0Var.invokeSuspend(Unit.f186387a);
            case 1:
                b0 b0Var2 = new b0(1, this.f289759y, continuation);
                b0Var2.f289757w = flowCollector;
                b0Var2.f289758x = obj3;
                return b0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                b0 b0Var3 = new b0(2, this.f289759y, continuation);
                b0Var3.f289757w = flowCollector;
                b0Var3.f289758x = obj3;
                return b0Var3.invokeSuspend(Unit.f186387a);
            default:
                b0 b0Var4 = new b0(3, this.f289759y, continuation);
                b0Var4.f289757w = flowCollector;
                b0Var4.f289758x = obj3;
                return b0Var4.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f289757w;
                    vkm.y yVarB = this.f289759y.f101211t.b(w4l.i.f294643c);
                    this.f289757w = null;
                    this.f289758x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f289757w;
                    vkm.d dVarG = this.f289759y.f101208q.g(w4l.h.f294642c);
                    this.f289757w = null;
                    this.f289758x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarG, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f289757w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar = this.f289759y;
                    vkm.d dVarA = cVar.f101213x.a(cVar.o.f101191a, w4l.i.f294643c);
                    this.f289757w = null;
                    this.f289758x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarA, this) == aVar3) {
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
                    FlowCollector flowCollector4 = this.f289757w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar2 = this.f289759y;
                    jhi.k kVarX = hb9.b.x(cVar2.u.a(cVar2.o.f101191a), zhm.f0.f322471a);
                    this.f289757w = null;
                    this.f289758x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, kVarX, this) == aVar4) {
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
