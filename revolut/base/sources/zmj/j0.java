package zmj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f323559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f323560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a f323561y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i, com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f323561y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                j0 j0Var = new j0(0, this.f323561y, continuation);
                j0Var.f323559w = flowCollector;
                j0Var.f323560x = obj3;
                return j0Var.invokeSuspend(Unit.f186387a);
            case 1:
                j0 j0Var2 = new j0(1, this.f323561y, continuation);
                j0Var2.f323559w = flowCollector;
                j0Var2.f323560x = obj3;
                return j0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                j0 j0Var3 = new j0(2, this.f323561y, continuation);
                j0Var3.f323559w = flowCollector;
                j0Var3.f323560x = obj3;
                return j0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                j0 j0Var4 = new j0(3, this.f323561y, continuation);
                j0Var4.f323559w = flowCollector;
                j0Var4.f323560x = obj3;
                return j0Var4.invokeSuspend(Unit.f186387a);
            default:
                j0 j0Var5 = new j0(4, this.f323561y, continuation);
                j0Var5.f323559w = flowCollector;
                j0Var5.f323560x = obj3;
                return j0Var5.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f323559w;
                    t38.e eVarB = this.f323561y.f101428q.b(w4l.i.f294643c);
                    this.f323559w = null;
                    this.f323560x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, eVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f323559w;
                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar3 = this.f323561y;
                    j23.b bVarD = yh5.b.d(new vkm.q0(aVar3.f101428q.a(aVar3.o.f101418a, w4l.i.f294643c), new k0(1, aVar3, null), 1), aVar3.f101427p.a(null, null, null, (7 & 8) != 0 ? w4l.h.f294642c : w4l.i.f294643c));
                    this.f323559w = null;
                    this.f323560x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarD, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f323559w;
                    vkm.d dVarG = this.f323561y.z.g(w4l.h.f294642c);
                    this.f323559w = null;
                    this.f323560x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarG, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f323559w;
                    w4l.k kVar = (w4l.k) this.f323560x;
                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar6 = this.f323561y;
                    Flow flowA = aVar6.C.a(aVar6.o.f101418a, kVar);
                    this.f323559w = null;
                    this.f323560x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowA, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f323559w;
                    vkm.d dVarB = rd0.e.b(this.f323561y.B.j0(((w4l.k) this.f323560x) instanceof w4l.i, true));
                    this.f323559w = null;
                    this.f323560x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarB, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
