package nnj;

import cli.y;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;
import dej.e3;
import dej.p0;
import dej.w;
import dej.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.f0;
import njj.n0;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimRefundReasonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EsimRefundReasonScreen esimRefundReasonScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimRefundReasonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Object wVar;
        int i = this.u;
        EsimRefundReasonScreen esimRefundReasonScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c) esimRefundReasonScreen.d()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c) esimRefundReasonScreen.d();
                y yVar = cVar.f101474x;
                EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = cVar.o;
                boolean z = esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.CancelMobilePlan;
                if (z) {
                    str = ((EsimRefundReasonScreenContract$InputData.CancelMobilePlan) esimRefundReasonScreenContract$InputData).f101461a;
                } else {
                    if (!(esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimRefundFlowContract$EsimSubscriptionsToRefund esimRefundFlowContract$EsimSubscriptionsToRefund = ((EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription) esimRefundReasonScreenContract$InputData).f101462a;
                    EsimRefundFlowContract$EsimSubscriptionsToRefund.Subscription subscription = esimRefundFlowContract$EsimSubscriptionsToRefund instanceof EsimRefundFlowContract$EsimSubscriptionsToRefund.Subscription ? (EsimRefundFlowContract$EsimSubscriptionsToRefund.Subscription) esimRefundFlowContract$EsimSubscriptionsToRefund : null;
                    str = subscription != null ? subscription.f100867a : null;
                }
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                String str2 = ((k) j2Var.getValue()).f217694c;
                String strU0 = str2 != null ? f0.U0(500, str2) : null;
                j jVar = ((k) j2Var2.getValue()).f217693b;
                if (jVar instanceof h) {
                    wVar = new x(strU0, str, ((h) jVar).f217690a);
                } else {
                    if (!(jVar instanceof i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wVar = new w(((i) jVar).f217691a, strU0, str);
                }
                cVar.l2(new n0(cVar, wVar, , 12), new yi5.b(26));
                if (str == null) {
                    cVar.L2();
                } else if (esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription) {
                    j jVar2 = ((k) j2Var2.getValue()).f217693b;
                    h hVar = (h) (jVar2 instanceof h ? jVar2 : null);
                    if (hVar == null) {
                        com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c.J2("Unable to handle refund reason: expected data plan refund, but was mobile plan cancellation");
                    } else {
                        e3 e3Var = hVar.f217690a;
                        switch (r.f217704a[e3Var.ordinal()]) {
                            case 1:
                            case 2:
                                cVar.I2(e3Var.name(), str);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                cVar.L2();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    if (!z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j jVar3 = ((k) j2Var2.getValue()).f217693b;
                    i iVar = (i) (jVar3 instanceof i ? jVar3 : 0);
                    if (iVar == null) {
                        com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c.J2("Unable to handle refund reason: expected mobile plan cancellation, but was data plan subscription refund");
                    } else {
                        p0 p0Var = iVar.f217691a;
                        switch (r.f217705b[p0Var.ordinal()]) {
                            case 1:
                            case 2:
                                cVar.I2(p0Var.name(), str);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                cVar.L2();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
