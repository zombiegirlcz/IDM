package w3c;

import kl.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f294287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f294288x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolut_shop.ui.screen.checkout.a f294289y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f294289y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f294289y, continuation);
                oVar.f294287w = flowCollector;
                oVar.f294288x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            case 1:
                o oVar2 = new o(1, this.f294289y, continuation);
                oVar2.f294287w = flowCollector;
                oVar2.f294288x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
            default:
                o oVar3 = new o(2, this.f294289y, continuation);
                oVar3.f294287w = flowCollector;
                oVar3.f294288x = obj3;
                return oVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f294287w;
                    w4l.k loadingStrategy = (w4l.k) this.f294288x;
                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar2 = this.f294289y;
                    n3c.a aVar3 = aVar2.f84228r;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    k3c.p pVar = (k3c.p) aVar3.f211978a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = pVar.e.b(Unit.f186387a, loadingStrategy);
                    b0 b0Var = aVar2.o;
                    b0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    j23.b bVarD = yh5.b.d(dVarB, nim.a.v(((wsg.b) b0Var.f185144b).e(loadingStrategy), new kpj.a(b0Var, 0)));
                    this.f294287w = null;
                    this.f294288x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, bVarD, this) == aVar) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f294287w;
                    akg.n nVarB = this.f294289y.f84226p.b(Intrinsics.f((w4l.k) this.f294288x, w4l.i.f294643c));
                    this.f294287w = null;
                    this.f294288x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarB, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f294287w;
                    t38.e eVarL = this.f294289y.f84229s.l((w4l.k) this.f294288x, null);
                    this.f294287w = null;
                    this.f294288x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, eVarL, this) == aVar5) {
                        return aVar5;
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
