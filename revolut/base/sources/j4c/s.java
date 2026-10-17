package j4c;

import kl.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f171357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f171358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f171359y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, u uVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f171359y = uVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f171359y, continuation);
                sVar.f171357w = flowCollector;
                sVar.f171358x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            case 1:
                s sVar2 = new s(1, this.f171359y, continuation);
                sVar2.f171357w = flowCollector;
                sVar2.f171358x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
            case 2:
                s sVar3 = new s(2, this.f171359y, continuation);
                sVar3.f171357w = flowCollector;
                sVar3.f171358x = obj3;
                return sVar3.invokeSuspend(Unit.f186387a);
            default:
                s sVar4 = new s(3, this.f171359y, continuation);
                sVar4.f171357w = flowCollector;
                sVar4.f171358x = obj3;
                return sVar4.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f171357w;
                    w4l.k loadingStrategy = (w4l.k) this.f171358x;
                    this.f171359y.f171363r.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    go.g gVarI = zi0.c.i(kpj.e.f188254c);
                    this.f171357w = null;
                    this.f171358x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVarI, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f171357w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f171358x;
                    u uVar = this.f171359y;
                    n3c.a aVar3 = uVar.f171362q;
                    String orderId = uVar.o.f84240a;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    k3c.p pVar = (k3c.p) aVar3.f211978a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB = pVar.f.b(orderId, loadingStrategy2);
                    this.f171357w = null;
                    this.f171358x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f171357w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f171358x;
                    b0 b0Var = this.f171359y.f171364s;
                    b0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    akg.n nVarV = nim.a.v(nim.a.v(((wsg.b) b0Var.f185144b).e(loadingStrategy3), new kpj.a(b0Var, 0)), new kpj.a(1));
                    this.f171357w = null;
                    this.f171358x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, nVarV, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f171357w;
                    akg.n nVarB = this.f171359y.f171361p.b(Intrinsics.f((w4l.k) this.f171358x, w4l.i.f294643c));
                    this.f171357w = null;
                    this.f171358x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, nVarB, this) == aVar5) {
                        return aVar5;
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
