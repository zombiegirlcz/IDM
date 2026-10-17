package njj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f216584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f216585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a f216586y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f216586y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o0 o0Var = new o0(0, this.f216586y, continuation);
                o0Var.f216584w = flowCollector;
                o0Var.f216585x = obj3;
                return o0Var.invokeSuspend(Unit.f186387a);
            case 1:
                o0 o0Var2 = new o0(1, this.f216586y, continuation);
                o0Var2.f216584w = flowCollector;
                o0Var2.f216585x = obj3;
                return o0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                o0 o0Var3 = new o0(2, this.f216586y, continuation);
                o0Var3.f216584w = flowCollector;
                o0Var3.f216585x = obj3;
                return o0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                o0 o0Var4 = new o0(3, this.f216586y, continuation);
                o0Var4.f216584w = flowCollector;
                o0Var4.f216585x = obj3;
                return o0Var4.invokeSuspend(Unit.f186387a);
            default:
                o0 o0Var5 = new o0(4, this.f216586y, continuation);
                o0Var5.f216584w = flowCollector;
                o0Var5.f216585x = obj3;
                return o0Var5.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strN;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f216584w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar2 = this.f216586y;
                    Flow flowH = xam.a.h(new s0(aVar2, null), xam.a.h(new r0(aVar2, null), c8g.a.D(aVar2.G.B(p0.f216588a))));
                    this.f216584w = null;
                    this.f216585x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowH, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f216584w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar4 = this.f216586y;
                    v1 v1VarD = c8g.a.D(xam.a.h(new v0(aVar4, null), aVar4.G.B(u0.f216592a)));
                    this.f216584w = null;
                    this.f216585x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, v1VarD, this) == aVar3) {
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
                    FlowCollector flowCollector3 = this.f216584w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar6 = this.f216586y;
                    Flow flowQ = vkm.q.q(xam.a.h(new t0(1, aVar6, null), c8g.a.D(aVar6.G.B(x0.f216593a))));
                    this.f216584w = null;
                    this.f216585x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowQ, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar7 = this.f216586y;
                EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData = aVar7.f101171p;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f216584w;
                    dfj.w wVar = aVar7.f101173r;
                    String f101150a = esimMobilePlanCheckoutScreenContract$InputData.getF101150a();
                    if (!(esimMobilePlanCheckoutScreenContract$InputData instanceof EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan)) {
                        esimMobilePlanCheckoutScreenContract$InputData = null;
                    }
                    EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan purchaseNewPlan = (EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan) esimMobilePlanCheckoutScreenContract$InputData;
                    EsimGiftRecipient esimGiftRecipient = purchaseNewPlan != null ? purchaseNewPlan.d : null;
                    if (esimGiftRecipient != null) {
                        aVar7.E.getClass();
                        strN = ugc.a.n(esimGiftRecipient);
                    } else {
                        strN = null;
                    }
                    akg.n nVarC = wVar.c(f101150a, strN);
                    this.f216584w = null;
                    this.f216585x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, nVarC, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f216584w;
                    vkm.d dVarB = rd0.e.b(this.f216586y.u.c(true));
                    this.f216584w = null;
                    this.f216585x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarB, this) == aVar9) {
                        return aVar9;
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
