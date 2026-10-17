package wc2;

import adb.j;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.sso.impl.domain.models.Claim;
import g8i.u;
import gim.i;
import h93.l0;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wm3.l;
import wx6.h;
import x8j.g0;
import y5g.k;
import yji.n;
import ynb.r;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f296314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f296315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f296316y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f296314w = obj2;
        this.f296315x = obj3;
        this.f296316y = obj4;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((e) this.f296315x, (Alias) this.f296316y, continuation, 0);
            case 1:
                return new b((String) this.f296314w, (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) this.f296315x, (String) this.f296316y, continuation, 1);
            case 2:
                return new b((wll.c) this.f296314w, (String) this.f296315x, (Claim) this.f296316y, continuation, 2);
            case 3:
                return new b((l) this.f296314w, (String) this.f296315x, (String) this.f296316y, continuation, 3);
            case 4:
                return new b((com.revolut.feature.workflow.engine.sdk_flow.f) this.f296316y, continuation, 4);
            case 5:
                return new b((wx2.e) this.f296314w, (l0) this.f296315x, (Function1) this.f296316y, continuation, 5);
            case 6:
                return new b((g0) this.f296315x, (xi0.b) this.f296316y, continuation, 6);
            case 7:
                return new b((xd2.f) this.f296314w, (Alias) this.f296316y, (Function1) this.f296315x, continuation, 7);
            case 8:
                return new b((xd2.f) this.f296314w, (Alias) this.f296316y, (Function1) this.f296315x, continuation, 8);
            case 9:
                return new b((xkl.i) this.f296314w, (String) this.f296315x, (oa2.b) this.f296316y, continuation, 9);
            case 10:
                return new b((com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a) this.f296314w, (VoucherProduct) this.f296315x, (String) this.f296316y, continuation, 10);
            case 11:
                return new b((y3j.b) this.f296314w, (BeneficiaryInfoState) this.f296315x, (z3j.a) this.f296316y, continuation, 11);
            case 12:
                return new b((k) this.f296314w, (String) this.f296315x, (n7g.c) this.f296316y, continuation, 12);
            case 13:
                return new b((com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.f296314w, (LoanDetails) this.f296315x, (dj0.d) this.f296316y, continuation, 13);
            case 14:
                return new b((com.revolut.feature_move_money.impl.flow.e) this.f296316y, continuation, 14);
            case 15:
                return new b((com.revolut.feature_move_money.impl.flow.e) this.f296314w, (u) this.f296315x, (MoveMoneyFlowContract$MoveMoneyProcessState) this.f296316y, continuation, 15);
            case 16:
                return new b((j) this.f296314w, (com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b) this.f296315x, (yki.b) this.f296316y, continuation, 16);
            case 17:
                return new b((r) this.f296314w, (String) this.f296315x, (String) this.f296316y, continuation, 17);
            case 18:
                return new b((com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) this.f296314w, (String) this.f296315x, (String) this.f296316y, continuation, 18);
            case 19:
                return new b((yx6.b) this.f296314w, (FreelancerInvoiceSettings) this.f296315x, (h) this.f296316y, continuation, 19);
            case 20:
                return new b((com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c) this.f296314w, (v44.j) this.f296315x, (yki.b) this.f296316y, continuation, 20);
            case 21:
                return new b((z20.j) this.f296314w, (UUID) this.f296315x, (UUID) this.f296316y, continuation, 21);
            case 22:
                return new b((z20.j) this.f296314w, (v20.c) this.f296315x, (ArrayList) this.f296316y, continuation, 22);
            case 23:
                return new b((com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) this.f296314w, (zg6.a) this.f296315x, (String) this.f296316y, continuation, 23);
            default:
                return new b((com.revolut.feature.topup_screen.impl.google_pay.flow.b) this.f296314w, (xze.d) this.f296315x, (GooglePayFee) this.f296316y, continuation, 24);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0820  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v15 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc2.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f296316y = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(xd2.f fVar, Alias alias, Function1 function1, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f296314w = fVar;
        this.f296316y = alias;
        this.f296315x = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(n nVar, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f296315x = nVar;
        this.f296316y = obj2;
    }
}
