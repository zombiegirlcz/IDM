package mh1;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlowContract$Step;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.pix.api.model.PortabilityRequestArgsModel;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestPosition;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowContract$StepResult;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsStep;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step;
import hd.r;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlinx.coroutines.CoroutineScope;
import mn1.b0;
import nii.t1;
import nx1.u;
import o9k.j0;
import oc3.a0;
import okl.x;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f205348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f205349x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f205350y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Continuation continuation, yji.l lVar) {
        super(1, continuation);
        this.u = i;
        this.f205350y = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r4 == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0145, code lost:
    
        if (r2.collect(r4, r17) != r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.d.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [gim.i, kotlin.jvm.functions.Function2] */
    private final Object c(Object obj2) {
        jkl.i iVar = (jkl.i) this.f205349x;
        com.revolut.sso.impl.ui.auth.n nVar = (com.revolut.sso.impl.ui.auth.n) this.f205348w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            qki.d dVar = nVar.m0;
            if (!(((j2) dVar.f22677a).getValue() instanceof AuthenticationFlowContract$State)) {
                AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) nVar.l0.d();
                String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
                p0 p0Var = o0.f186429a;
                throw new IllegalStateException(m72.b.q(okl.m.p((j2) dVar.f22677a, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
            }
            nVar.H2(dVar, new x(nVar, iVar, 0));
            gu2.e eVar = nVar.v;
            of6.d dVar2 = new of6.d(nVar, iVar, (Function2) this.f205350y, (Continuation) null);
            this.v = 1;
            if (fkl.c.b(eVar, dVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r2v26, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((g1j.b) this.f205349x, (com.revolut.feature.add_money.impl.flow.c) this.f205350y, continuation, 0);
            case 1:
                return new d(1, continuation, (com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f205350y);
            case 2:
                return new d((b0) this.f205349x, (BillSearchBoletoResult) this.f205350y, continuation, 2);
            case 3:
                return new d((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205348w, (Trip) this.f205349x, (iod.b) this.f205350y, continuation, 3);
            case 4:
                return new d((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205348w, (Trip) this.f205349x, (ard.h) this.f205350y, continuation, 4);
            case 5:
                return new d((mv2.o) this.f205348w, (t61.g) this.f205349x, (String) this.f205350y, continuation, 5);
            case 6:
                return new d((com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.b) this.f205349x, (r0a.n) this.f205350y, continuation, 6);
            case 7:
                return new d((n23.k) this.f205348w, (String) this.f205349x, this.f205350y, continuation, 7);
            case 8:
                return new d((CoroutineScope) this.f205348w, (n2d.g) this.f205349x, (AlertItem) this.f205350y, continuation, 8);
            case 9:
                return new d((n3h.c) this.f205349x, (q2h.d) this.f205350y, continuation, 9);
            case 10:
                return new d((n3h.c) this.f205349x, (q2h.e) this.f205350y, continuation, 10);
            case 11:
                return new d((n4d.m) this.f205349x, (Ref$BooleanRef) this.f205350y, continuation, 11);
            case 12:
                return new d((n8a.o) this.f205348w, (AccountId) this.f205349x, (PortabilityRequestArgsModel) this.f205350y, continuation, 12);
            case 13:
                return new d((naf.k) this.f205348w, (TransferRequestPosition) this.f205349x, (ej0.b) this.f205350y, continuation, 13);
            case 14:
                return new d((nh9.d) this.f205348w, (PaymentData) this.f205349x, (TransferScheduleData) this.f205350y, continuation, 14);
            case 15:
                return new d((t1) this.f205348w, this.f205349x, (tji.f) this.f205350y, continuation, 15);
            case 16:
                return new d((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) this.f205348w, (String) this.f205349x, (com.revolut.analytics.ads.model.a) this.f205350y, continuation, 16);
            case 17:
                return new d((com.revolut.analytics.tracking.v3.f) this.f205348w, (Class) this.f205349x, (uo.o0) this.f205350y, continuation, 17);
            case 18:
                return new d((u) this.f205348w, (List) this.f205349x, (n02.b) this.f205350y, continuation, 18);
            case 19:
                return new d((com.revolut.feature.card_design.impl.card_design.d) this.f205348w, (String) this.f205349x, (String) this.f205350y, continuation, 19);
            case 20:
                return new d((com.revolut.feature.referrals.impl.personalized_tracking.a) this.f205348w, (String) this.f205349x, (pwa.n) this.f205350y, continuation, 20);
            case 21:
                return new d((com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) this.f205349x, (FreelancerOrder) this.f205350y, continuation, 21);
            case 22:
                return new d((o65.o) this.f205348w, (String) this.f205349x, (dj0.d) this.f205350y, continuation, 22);
            case 23:
                return new d((j0) this.f205348w, (PeerToPeerTransferData) this.f205349x, (PeerToPeerRecipient) this.f205350y, continuation, 23);
            case 24:
                return new d((m90.a) this.f205348w, (DropOutFormFlowContract$Step) this.f205349x, (oa4.e) this.f205350y, continuation, 24);
            case 25:
                return new d((com.revolut.feature_retail_user_declarations.identity_declarations.a) this.f205348w, (IdentityDeclarationsFlowContract$StepResult) this.f205349x, (IdentityDeclarationsStep) this.f205350y, continuation, 25);
            case 26:
                return new d(26, continuation, (a0) this.f205350y);
            case 27:
                return new d(27, continuation, (og4.d) this.f205350y);
            case 28:
                return new d((com.revolut.sso.impl.ui.auth.n) this.f205348w, (jkl.i) this.f205349x, (Function2) this.f205350y, continuation);
            default:
                return new d((ook.c) this.f205348w, (x4l.c) this.f205349x, (r) this.f205350y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x0672  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(com.revolut.sso.impl.ui.auth.n nVar, jkl.i iVar, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.u = 28;
        this.f205348w = nVar;
        this.f205349x = iVar;
        this.f205350y = (gim.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f205348w = obj2;
        this.f205349x = obj3;
        this.f205350y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f205349x = obj2;
        this.f205350y = obj3;
    }
}
