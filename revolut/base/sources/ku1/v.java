package ku1;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.t1;
import nii.u1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class v implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189625a;

    public /* synthetic */ v(int i) {
        this.f189625a = i;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f189625a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return new nii.j0((Clause) new TextLocalisedClause(R$string.co_borrower_consent_initiator_request_consent_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.co_borrower_consent_initiator_request_consent_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
            case 5:
                return new nii.j0((Clause) new TextLocalisedClause(R$string.credit_application_offer_document_loading_ready_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (nii.h0) null, (ResourceImage) null, 3582);
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.second_device_login.impl.R$string.second_device_login_its_me_dialog_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.second_device_login.impl.R$string.second_device_login_its_me_dialog_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
            case 9:
                return null;
            case 10:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_authorisation_request_payment_confirmed_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_authorisation_request_payment_confirmed_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
            case 11:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_authorisation_request_mandate_rejection_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
            case 12:
                au3.b subscriptionResult = (au3.b) obj2;
                Intrinsics.checkNotNullParameter(subscriptionResult, "subscriptionResult");
                au3.a aVar = subscriptionResult.f9468b;
                if (aVar == null) {
                    return null;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_waiting_list_success_popup_title, zhm.u.c(new TextClause(aVar.f9465a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                String str = aVar.f9466b;
                return new nii.j0((Clause) textLocalisedClause, (Clause) (str != null ? new TextLocalisedClause(R$string.credit_application_waiting_list_success_popup_description, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
            case 13:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_offboarding_confirmation_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_offboarding_confirmation_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
            case 14:
                return null;
            case 15:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_deactivation_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
            case 16:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_replacement_mexico_mcy_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_replacement_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) u1.b.f216225a, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4076);
            case 17:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.troubleshooting_transfers_status_reverted, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
            case 18:
                return null;
            case 19:
                return null;
            case 20:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.student_plans_cancel_benefits_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.student_plans_cancel_benefits_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
            case 21:
                return null;
            case 22:
                xm4.b bVar = (xm4.b) obj2;
                TextClause textClause = new TextClause(bVar.f307075a.f120860a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = bVar.f307075a.f120861b;
                return new nii.j0((Clause) textClause, (Clause) (str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
            case 23:
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.boleto_finder_offboarding_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.boleto_finder_offboarding_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4060);
            case 24:
                TextLocalisedClause title = new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tax_exemption_limit_order_edit_success, null, null, 14);
                Intrinsics.checkNotNullParameter(title, "title");
                return new nii.j0((Clause) title, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4062);
            case 25:
                return new nii.j0((Clause) new TextLocalisedClause(R$string.credit_card_direct_debit_account_details_dialog_delete_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
            case 26:
                return null;
            case 27:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_recurring_transfer_result_success_title_common, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
            case 28:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_recurring_transfer_result_success_title_common, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
            default:
                return null;
        }
    }

    public /* synthetic */ v(Object obj2, int i) {
        this.f189625a = i;
    }
}
