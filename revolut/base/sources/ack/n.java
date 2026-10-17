package ack;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t1;
import nii.u1;
import nii.w1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3180a;

    public /* synthetic */ n(int i) {
        this.f3180a = i;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f3180a) {
            case 0:
                return null;
            case 1:
                ah9.f it8 = (ah9.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return null;
            case 2:
                return new j0((Clause) new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_dialog_confirm_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_dialog_confirm_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 3:
                return new j0((Clause) new TextLocalisedClause(R$string.credit_application_offer_document_loading_ready_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (h0) null, (ResourceImage) null, 3582);
            case 4:
                return null;
            case 5:
                return new j0((Clause) new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_bottom_sheet_success_direct_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 6:
                return new j0((Clause) new TextLocalisedClause(R$string.cardholder_account_info_cancel_credit_card_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 7:
                qs7.a aVar = (qs7.a) obj2;
                TextLocalisedClause textLocalisedClauseS = l9.l.s(R$string.credit_loan_insurance_cancellation_success_popup_title, aVar.f248753a);
                String str = aVar.f248754b;
                return new j0((Clause) textLocalisedClauseS, (Clause) (str != null ? l9.l.s(R$string.credit_loan_insurance_cancellation_success_popup_description, str) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            case 8:
                return null;
            case 9:
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_creation_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_creation_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 10:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new j0((Clause) new TextLocalisedClause(R.string.transfer_action_revert_success_message_no_details, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 11:
                return null;
            case 12:
                return null;
            case 13:
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_action_refresh_disposable_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_action_refresh_disposable_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            case 14:
                return new j0((Clause) new TextLocalisedClause(R$string.credit_card_ordering_dialog_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 15:
                return null;
            case 16:
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_completion_status_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4062);
            case 17:
                ((Boolean) obj2).getClass();
                return null;
            case 18:
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_secure_account_screen_dialog_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 19:
                return null;
            case 20:
                return null;
            case 21:
                return null;
            case 22:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return null;
            case 23:
                return new g0(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_change_template_success_title, null, null, 14), null, null, null, null, null, null, null, false, null, false, null, 16382);
            case 24:
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature_autoinvest_api.R$string.auto_invest_status_spare_change_deactivated, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 25:
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature_autoinvest_api.R$string.auto_invest_status_spare_change_activated, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 26:
                return new j0((Clause) new TextLocalisedClause(R$string.credit_autopay_setup_success_message_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 27:
                return new j0((Clause) new TextLocalisedClause(R.string.transaction_threeds_cancelled, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4078);
            case 28:
                NaviCommand it11 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return null;
            default:
                d12.d it12 = (d12.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return null;
        }
    }
}
