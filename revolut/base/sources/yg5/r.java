package yg5;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode;
import h93.f0;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import yra.x;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f313535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f313536x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f313535w = obj2;
        this.f313536x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r((u) this.f313535w, (ArrayList) this.f313536x, continuation, 0);
            case 1:
                return new r((yg6.p) this.f313535w, (String) this.f313536x, continuation, 1);
            case 2:
                return new r((com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) this.f313535w, (ArrayList) this.f313536x, continuation, 2);
            case 3:
                return new r((yi4.g) this.f313535w, (String) this.f313536x, continuation, 3);
            case 4:
                return new r((yjk.c) this.f313536x, continuation, 4);
            case 5:
                return new r((ymf.k) this.f313535w, (File) this.f313536x, continuation, 5);
            case 6:
                return new r((do3.q) this.f313535w, (ynb.c) this.f313536x, continuation, 6);
            case 7:
                return new r((com.revolut.feature.tax_residency.impl.v2.ui.tin_input.a) this.f313535w, (String) this.f313536x, continuation, 7);
            case 8:
                return new r((yof.b) this.f313535w, (x) this.f313536x, continuation, 8);
            case 9:
                return new r((yrb.s) this.f313535w, (yrb.u) this.f313536x, continuation, 9);
            case 10:
                return new r((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) this.f313535w, (String) this.f313536x, continuation, 10);
            case 11:
                return new r((yuc.u) this.f313535w, (Boolean) this.f313536x, continuation, 11);
            case 12:
                return new r((yuc.u) this.f313535w, (f0) this.f313536x, continuation, 12);
            case 13:
                return new r((yv1.l) this.f313535w, (Alias) this.f313536x, continuation, 13);
            case 14:
                return new r((com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f313535w, (SignInMode) this.f313536x, continuation, 14);
            case 15:
                return new r((yxh.e) this.f313535w, (yxh.d) this.f313536x, continuation, 15);
            case 16:
                return new r((com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) this.f313535w, (String) this.f313536x, continuation, 16);
            case 17:
                return new r((com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) this.f313535w, (CoroutineScope) this.f313536x, continuation, 17);
            case 18:
                return new r((z20.j) this.f313536x, continuation, 18);
            case 19:
                return new r((com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f313535w, (ux4.d) this.f313536x, continuation, 19);
            case 20:
                return new r((yof.b) this.f313535w, (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f313536x, continuation, 20);
            case 21:
                return new r((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f313536x, continuation, 21);
            case 22:
                return new r((z9j.e) this.f313535w, (String) this.f313536x, continuation, 22);
            case 23:
                return new r((com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b) this.f313535w, (DeliveryCarrier) this.f313536x, continuation, 23);
            case 24:
                return new r((com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d) this.f313535w, (String) this.f313536x, continuation, 24);
            case 25:
                return new r((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.a) this.f313535w, (af4.p) this.f313536x, continuation, 25);
            case 26:
                return new r((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a) this.f313535w, (dh4.j) this.f313536x, continuation, 26);
            case 27:
                return new r((com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b) this.f313535w, (CoroutineScope) this.f313536x, continuation, 27);
            case 28:
                return new r((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a) this.f313535w, (hha.d) this.f313536x, continuation, 28);
            default:
                return new r((com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f313535w, (String) this.f313536x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:305:0x062d  */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg5.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f313536x = obj2;
    }
}
