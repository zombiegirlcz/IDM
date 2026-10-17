package dgj;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.EsimMobilePlanCheckoutFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.EsimMobilePlanCheckoutFlowContract$Step;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njj.d0;
import njj.e0;
import njj.f0;
import njj.g0;
import njj.i0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.b f114710b;

    public /* synthetic */ i(com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.b bVar, int i) {
        this.f114709a = i;
        this.f114710b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f114709a;
        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.b bVar = this.f114710b;
        switch (i) {
            case 0:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                oki.h.u2(bVar, bVar.f100720q, EsimMobilePlanCheckoutFlowContract$Step.Checkout.f100718a, null, 6);
                return Boolean.FALSE;
            default:
                i0 result = (i0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, f0.f216559a)) {
                    bVar.C2(e.f114705a);
                } else if (Intrinsics.f(result, d0.f216553a)) {
                    bVar.C2(c.f114701a);
                } else if (result instanceof g0) {
                    bVar.C2(new f(((g0) result).f216561a));
                } else if (result instanceof njj.h0) {
                    bVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, ((njj.h0) result).f216563a, null, null, 30)));
                } else {
                    if (!(result instanceof e0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimMobilePlanCheckoutFlowContract$InputData esimMobilePlanCheckoutFlowContract$InputData = bVar.o;
                    if (!(esimMobilePlanCheckoutFlowContract$InputData instanceof EsimMobilePlanCheckoutFlowContract$InputData.PurchaseNewPlan)) {
                        esimMobilePlanCheckoutFlowContract$InputData = null;
                    }
                    EsimMobilePlanCheckoutFlowContract$InputData.PurchaseNewPlan purchaseNewPlan = (EsimMobilePlanCheckoutFlowContract$InputData.PurchaseNewPlan) esimMobilePlanCheckoutFlowContract$InputData;
                    e0 e0Var = (e0) result;
                    bVar.C2(new d(e0Var.f216555a, e0Var.f216556b, e0Var.f216557c, purchaseNewPlan != null ? purchaseNewPlan.d : null));
                }
                return Unit.f186387a;
        }
    }
}
