package o9c;

import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nfj.l1;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class u0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f223239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f223240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.ui.summary_screen.f f223241y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i, com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f223241y = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u0 u0Var = new u0(0, this.f223241y, continuation);
                u0Var.f223239w = flowCollector;
                u0Var.f223240x = obj3;
                return u0Var.invokeSuspend(Unit.f186387a);
            case 1:
                u0 u0Var2 = new u0(1, this.f223241y, continuation);
                u0Var2.f223239w = flowCollector;
                u0Var2.f223240x = obj3;
                return u0Var2.invokeSuspend(Unit.f186387a);
            default:
                u0 u0Var3 = new u0(2, this.f223241y, continuation);
                u0Var3.f223239w = flowCollector;
                u0Var3.f223240x = obj3;
                return u0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow pVar;
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f223239w;
                    String str = (String) this.f223240x;
                    if (str != null) {
                        com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = this.f223241y;
                        fVar.U2();
                        pVar = new vkm.y(((q7c.j) fVar.f84573r).e(str), new l1(fVar, str, (Continuation) null));
                    } else {
                        pVar = new v0f.p(new l6c.b[0], 8);
                    }
                    this.f223239w = null;
                    this.f223240x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, pVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f223239w;
                    com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar2 = this.f223241y;
                    q9c.l lVar = fVar2.J;
                    q9c.c cVarZ = lVar.f243869l.z();
                    Continuation continuation = null;
                    if (cVarZ instanceof q9c.a) {
                        q9c.a aVar3 = (q9c.a) cVarZ;
                        gVar = new go.g(new Data(new q9c.d(aVar3.f243852a, aVar3.f243853b), null, false, 6, null), 2);
                    } else {
                        if (!(cVarZ instanceof q9c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        q9c.f fVar3 = ((q9c.k) ((j2) lVar.f243871n.f22677a).getValue()).f243868a;
                        gVar = fVar3 != null ? new go.g(new Data(fVar3, null, false, 6, null), 2) : new vkm.y(new v1(new prl.k(lVar, (q9c.b) cVarZ, continuation, 27)), new pc2.d(3, 7, null));
                    }
                    Flow flowH = xam.a.h(new q0(1, fVar2, continuation), new vkm.q0(gVar, new q0(3, fVar2, continuation), 1));
                    nt.e eVar = new nt.e(2, fVar2, com.revolut.feature.revolutpay.impl.ui.summary_screen.f.class, "updateFinalAmount", "updateFinalAmount(Lcom/revolut/data/model/Data;)V", 4, 7);
                    this.f223239w = null;
                    this.f223240x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = flowH.collect(new akg.m(flowCollector2, eVar, 5), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f223239w;
                    com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar4 = this.f223241y;
                    Flow flowH2 = xam.a.h(new q0(5, fVar4, null), fVar4.M.B(new o95.b(9)));
                    this.f223239w = null;
                    this.f223240x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowH2, this) == aVar4) {
                        return aVar4;
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
