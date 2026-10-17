package f23;

import com.revolut.camerakit.vision_framework.generated.Mat;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import nii.n1;
import nii.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f131423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f131424x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f131423w = obj3;
        this.f131424x = obj4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y((com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a) this.f131423w, (SelectedTab) this.f131424x, continuation, 0);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y((fc0.f) this.f131423w, (w4l.k) this.f131424x, continuation, 1);
                yVar2.v = obj2;
                return yVar2;
            case 2:
                y yVar3 = new y((fc0.i) this.f131423w, (w4l.k) this.f131424x, continuation, 2);
                yVar3.v = obj2;
                return yVar3;
            case 3:
                y yVar4 = new y((com.revolut.feature.shops.impl.ui.home.a) this.f131423w, (fed.a0) this.f131424x, continuation, 3);
                yVar4.v = obj2;
                return yVar4;
            case 4:
                y yVar5 = new y(continuation, (SavingsProductData) this.f131423w, (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) this.f131424x, 4);
                yVar5.v = obj2;
                return yVar5;
            case 5:
                y yVar6 = new y((fnc.d0) this.f131423w, (w4l.k) this.f131424x, continuation, 5);
                yVar6.v = obj2;
                return yVar6;
            case 6:
                y yVar7 = new y((fnc.d0) this.f131423w, (akg.n) this.f131424x, continuation, 6);
                yVar7.v = obj2;
                return yVar7;
            case 7:
                y yVar8 = new y((fui.g) this.f131423w, (w6c.h) this.f131424x, continuation, 7);
                yVar8.v = obj2;
                return yVar8;
            case 8:
                y yVar9 = new y((fuk.t) this.f131423w, (fuk.b) this.f131424x, continuation, 8);
                yVar9.v = obj2;
                return yVar9;
            case 9:
                y yVar10 = new y((com.revolut.feature.security_hub.impl.ui.transactions_limits.a) this.f131423w, (TransactionsLimitsScreenContract$LimitFlowType) this.f131424x, continuation, 9);
                yVar10.v = obj2;
                return yVar10;
            case 10:
                y yVar11 = new y((com.revolut.feature_retail_user_declarations.email_verification.otp_flow.b) this.f131423w, (String) this.f131424x, continuation, 10);
                yVar11.v = obj2;
                return yVar11;
            case 11:
                y yVar12 = new y((com.revolut.feature.junior_graduation.impl.ui.screen.identification.a) this.f131423w, (String) this.f131424x, continuation, 11);
                yVar12.v = obj2;
                return yVar12;
            case 12:
                return new y((String) this.v, (Map) this.f131423w, (gsh.a0) this.f131424x, continuation, 12);
            case 13:
                y yVar13 = new y((com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f131423w, (AccountClosureStatus) this.f131424x, continuation, 13);
                yVar13.v = obj2;
                return yVar13;
            case 14:
                y yVar14 = new y(continuation, (gul.w) this.f131423w, (Amount) this.f131424x, 14);
                yVar14.v = obj2;
                return yVar14;
            case 15:
                y yVar15 = new y((cam.f) this.f131423w, (gul.w) this.f131424x, continuation, 15);
                yVar15.v = obj2;
                return yVar15;
            case 16:
                return new y((gw.u) this.v, (Mat) this.f131423w, (Mat) this.f131424x, continuation, 16);
            case 17:
                y yVar16 = new y((gxi.g) this.f131423w, (w6c.h) this.f131424x, continuation, 17);
                yVar16.v = obj2;
                return yVar16;
            case 18:
                return new y((Ref$ObjectRef) this.v, (List) this.f131423w, (h8f.l) this.f131424x, continuation, 18);
            case 19:
                y yVar17 = new y((hec.a) this.f131423w, (nzj.n) this.f131424x, continuation, 19);
                yVar17.v = obj2;
                return yVar17;
            case 20:
                y yVar18 = new y((com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d) this.f131423w, (String) this.f131424x, continuation, 20);
                yVar18.v = obj2;
                return yVar18;
            case 21:
                y yVar19 = new y((com.revolut.feature.corporate_events.impl.ui.screen.home.b) this.f131423w, (String) this.f131424x, continuation, 21);
                yVar19.v = obj2;
                return yVar19;
            case 22:
                y yVar20 = new y((htf.r) this.f131423w, (TransferReasonCategory) this.f131424x, continuation, 22);
                yVar20.v = obj2;
                return yVar20;
            case 23:
                y yVar21 = new y((com.revolut.feature.staking.impl.confirmation.a) this.f131423w, (LegacyOrderQuoteParams) this.f131424x, continuation, 23);
                yVar21.v = obj2;
                return yVar21;
            case 24:
                y yVar22 = new y((hw1.c) this.f131423w, (hw1.u) this.f131424x, continuation, 24);
                yVar22.v = obj2;
                return yVar22;
            case 25:
                y yVar23 = new y((hxk.b) this.f131423w, (nel.n) this.f131424x, continuation, 25);
                yVar23.v = obj2;
                return yVar23;
            case 26:
                y yVar24 = new y((i0e.q) this.f131423w, (Set) this.f131424x, continuation, 26);
                yVar24.v = obj2;
                return yVar24;
            case 27:
                return new y((i1b.f) this.v, (String) this.f131423w, (Map) this.f131424x, continuation, 27);
            case 28:
                y yVar25 = new y((ic2.b) this.f131423w, (sii.a) this.f131424x, continuation, 28);
                yVar25.v = obj2;
                return yVar25;
            default:
                y yVar26 = new y((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) this.f131423w, (y0) this.f131424x, continuation, 29);
                yVar26.v = obj2;
                return yVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((y) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0a70  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f131423w = obj2;
        this.f131424x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Continuation continuation, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.u = i;
        this.f131423w = obj2;
        this.f131424x = obj3;
    }
}
