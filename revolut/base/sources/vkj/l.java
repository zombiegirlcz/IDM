package vkj;

import android.os.Parcelable;
import aw0.o9;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreenModel$StatusViewSuccessPayload;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.staking.api.R$plurals;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.l0;
import nii.m0;
import nii.t1;
import nii.u1;
import nii.y0;
import vkm.j2;
import wba.e0;
import wba.v;
import wwf.o;
import zhm.u;
import zs9.z;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f289977b;

    public /* synthetic */ l(Object obj2, int i) {
        this.f289976a = i;
        this.f289977b = obj2;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        dj0.d dVar;
        y0 y0Var;
        switch (this.f289976a) {
            case 0:
                skj.a aVar = ((n) this.f289977b).f289983s;
                pfj.a aVar2 = ((pfj.b) obj2).f235602b;
                aVar.getClass();
                return skj.a.b(aVar2);
            case 1:
                e0 e0Var = (e0) this.f289977b;
                y yVar = e0Var.f296072t;
                v vVar = e0Var.f296071s;
                if (((wba.h) ((j2) yVar.f22677a).getValue()).f296075c.f != null) {
                    vVar.getClass();
                    return new j0((Clause) new TextLocalisedClause(R$string.pix_transaction_payment_review_success_dialog_withdrawal_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
                }
                String beneficiaryName = e0Var.o.d;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
                return new g0(new TextLocalisedClause(R$string.pix_transaction_review_payment_success_dialog_title, u.c(beneficiaryName), null, 12), new TextLocalisedClause(R$string.pix_transaction_review_success_dialog_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
            case 2:
                wqf.d dVar2 = (wqf.d) this.f289977b;
                dVar2.v = true;
                j60.a.v(dVar2.f299449q, false, null, 3);
                dVar2.f299452t.getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.bank_transfer_troubleshooting_cancel_transaction_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) u1.b.f216225a, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4078);
            case 3:
                o oVar = (o) this.f289977b;
                wwf.j jVar = (wwf.j) obj2;
                if (jVar instanceof wwf.g) {
                    return new g0(new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_purchase_pending_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_purchase_pending_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
                }
                if (!(jVar instanceof wwf.h) && !(jVar instanceof wwf.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                return o.Z2(oVar);
            case 4:
                skj.a aVar3 = ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) this.f289977b).f101281r;
                pfj.a aVar4 = ((pfj.b) obj2).f235602b;
                aVar3.getClass();
                return skj.a.b(aVar4);
            case 5:
                CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails repayDetails = ((com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c) this.f289977b).o.f69480c;
                if (repayDetails instanceof CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.FutureInstalments) {
                    dVar = ((CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.FutureInstalments) repayDetails).f69483a.d;
                } else {
                    if (!(repayDetails instanceof CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.CustomAmount)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = ((CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.CustomAmount) repayDetails).f69481a;
                }
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_success, u.c(sx4.f.b(3, null, null, dVar)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 6:
                com.revolut.feature.staking.impl.unstake.v2.a aVar5 = (com.revolut.feature.staking.impl.unstake.v2.a) this.f289977b;
                dj0.d amount = (dj0.d) ((Pair) obj2).f186385a;
                rud.a aVar6 = aVar5.f88166t;
                int i = aVar5.o.f88082b.f88087b.f88062c;
                if (i > 0) {
                    ((rud.b) aVar6).getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    y0Var = new y0("STAKING_STATUS_DIALOG_ID", new g0(new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_unstake_successful_lockup, u.c(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), o9.SENSITIVE)), null, 12), new TextLocalisedQuantityClause(R$plurals.staking_unstake_locked_description, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24), null, null, null, null, null, null, true, null, false, null, 16124), false, 4);
                } else {
                    ((rud.b) aVar6).getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    y0Var = new y0("STAKING_STATUS_DIALOG_ID", new j0((Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_unstake_successful, u.c(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), o9.SENSITIVE)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4062), false, 4);
                }
                return y0Var.f216244b;
            case 7:
                ((xxh.e) this.f289977b).f309531p.getClass();
                return txh.c.c();
            case 8:
                ((yxh.e) this.f289977b).f317699p.getClass();
                return txh.c.c();
            case 9:
                return (j0) this.f289977b;
            default:
                z zVar = (z) this.f289977b;
                PaymentGroup paymentGroup = (PaymentGroup) obj2;
                List list = paymentGroup.d;
                String str = paymentGroup.f79286b;
                return list.size() + (-1) < zVar.f324848p.f79401b.size() ? new l0(new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_create_group_warning_partial_members_added_title, u.c(str), null, 12), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_create_group_warning_partial_members_added_subtitle, null, null, 14), null, null, null, new GroupCustomizationScreenModel$StatusViewSuccessPayload(paymentGroup), false, null, 988) : new j0((Clause) new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_customisation_create_success_title, u.c(str), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) new GroupCustomizationScreenModel$StatusViewSuccessPayload(paymentGroup), (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4086);
        }
    }
}
