package fjj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f135670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f135671x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a f135672y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f135672y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                t tVar = new t(0, this.f135672y, continuation);
                tVar.f135670w = flowCollector;
                tVar.f135671x = obj3;
                return tVar.invokeSuspend(Unit.f186387a);
            case 1:
                t tVar2 = new t(1, this.f135672y, continuation);
                tVar2.f135670w = flowCollector;
                tVar2.f135671x = obj3;
                return tVar2.invokeSuspend(Unit.f186387a);
            case 2:
                t tVar3 = new t(2, this.f135672y, continuation);
                tVar3.f135670w = flowCollector;
                tVar3.f135671x = obj3;
                return tVar3.invokeSuspend(Unit.f186387a);
            default:
                t tVar4 = new t(3, this.f135672y, continuation);
                tVar4.f135670w = flowCollector;
                tVar4.f135671x = obj3;
                return tVar4.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f135670w;
                    w4l.k kVar = (w4l.k) this.f135671x;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar2 = this.f135672y;
                    Flow flowA = aVar2.u.a(aVar2.o.f101093a, kVar);
                    this.f135670w = null;
                    this.f135671x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowA, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f135670w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar4 = this.f135672y;
                    Flow flowH = xam.a.h(new x(aVar4, null), com.revolut.data.database.models.openbanking.d.x("EsimMobilePlanBillingScreenModel", "loadPocketTillFinish", nim.a.v(aVar4.A.B(v.f135674a), w.f135675a)));
                    this.f135670w = null;
                    this.f135671x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowH, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f135670w;
                    vkm.d dVarB = rd0.e.b(this.f135672y.f101102t.c(false));
                    this.f135670w = null;
                    this.f135671x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f135670w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar7 = this.f135672y;
                    vkm.d dVarA = aVar7.f101100r.a(aVar7.o.f101093a, w4l.i.f294643c);
                    this.f135670w = null;
                    this.f135671x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarA, this) == aVar6) {
                        return aVar6;
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
