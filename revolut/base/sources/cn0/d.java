package cn0;

import bu7.t0;
import cni.q;
import cnk.m;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.revolutpay.impl.external.RevolutPayKompotLauncherActivity;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import cuc.t;
import cuc.z;
import cv7.o;
import cw6.l;
import gim.i;
import igk.v;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import k4l.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qtc.k;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f25332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f25333x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25332w = obj2;
        this.f25333x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((e) this.f25333x, continuation, 0);
            case 1:
                return new d((com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e) this.f25332w, (EasyBankTransferDescriptor$PreselectedInstitutionInfo) this.f25333x, continuation, 1);
            case 2:
                return new d((cnh.f) this.f25332w, (Set) this.f25333x, continuation, 2);
            case 3:
                d dVar = new d((q) this.f25333x, continuation, 3);
                dVar.f25332w = obj2;
                return dVar;
            case 4:
                return new d((m) this.f25332w, (ty0.a) this.f25333x, continuation, 4);
            case 5:
                d dVar2 = new d((o64.d) this.f25333x, continuation, 5);
                dVar2.f25332w = obj2;
                return dVar2;
            case 6:
                return new d((com.revolut.feature.credit.impl.notifications.data.i) this.f25332w, (pp3.a) this.f25333x, continuation, 6);
            case 7:
                return new d((RevolutPayKompotLauncherActivity) this.f25333x, continuation, 7);
            case 8:
                return new d((cr5.e) this.f25332w, (f5j.a) this.f25333x, continuation, 8);
            case 9:
                return new d((com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b) this.f25332w, (v) this.f25333x, continuation, 9);
            case 10:
                return new d((t) this.f25332w, (qtc.e) this.f25333x, continuation, 10);
            case 11:
                return new d((z) this.f25332w, (ytc.a) this.f25333x, continuation, 11);
            case 12:
                return new d((z) this.f25332w, (k) this.f25333x, continuation, 12);
            case 13:
                return new d((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) this.f25332w, (HyperTextTarget) this.f25333x, continuation, 13);
            case 14:
                return new d((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f25332w, (Amount) this.f25333x, continuation, 14);
            case 15:
                return new d((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f25332w, (String) this.f25333x, continuation, 15);
            case 16:
                return new d((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f25332w, (r0) this.f25333x, continuation, 16);
            case 17:
                return new d((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f25332w, (BigDecimal) this.f25333x, continuation, 17);
            case 18:
                return new d((o) this.f25332w, (t0) this.f25333x, continuation, 18);
            case 19:
                return new d((o) this.f25332w, (f9i.c) this.f25333x, continuation, 19);
            case 20:
                return new d((l) this.f25332w, (FreelancerInvoiceNumberData) this.f25333x, continuation, 20);
            case 21:
                return new d((com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a) this.f25332w, (String) this.f25333x, continuation, 21);
            case 22:
                d dVar3 = new d((cw9.d) this.f25333x, continuation, 22);
                dVar3.f25332w = obj2;
                return dVar3;
            case 23:
                d dVar4 = new d((com.revolut.retail.feature.impl.userauth.flow.f) this.f25333x, continuation, 23);
                dVar4.f25332w = obj2;
                return dVar4;
            case 24:
                return new d((cx3.a) this.f25332w, (BackendFlow) this.f25333x, continuation, 24);
            case 25:
                return new d((com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.f25332w, (cxe.h) this.f25333x, continuation, 25);
            case 26:
                return new d((cya.f) this.f25332w, (String) this.f25333x, continuation, 26);
            case 27:
                return new d((cza.g) this.f25332w, (ty0.a) this.f25333x, continuation, 27);
            case 28:
                return new d((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) this.f25332w, (OrderInitiationPage) this.f25333x, continuation, 28);
            default:
                return new d((List) this.f25332w, this.v, (d2d.c) this.f25333x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:477:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25333x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, int i, d2d.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = 29;
        this.f25332w = list;
        this.v = i;
        this.f25333x = cVar;
    }
}
