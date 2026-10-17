package j24;

import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.ConfirmationPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingDocsSentPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorRequestConsentScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.core.R$string;
import java.util.Map;
import ju3.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements sv3.a {
    public static final SpousalConsentPartnerPopupScreenConfig.Respond A;
    public static final SpousalConsentPartnerPopupScreenConfig.Waiting B;
    public static final DocumentViewerScreenConfig C;
    public static final ManualUnderwritingScreenConfig D;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SpousalConsentInitiatorPopupScreenConfig f170679j;
    public static final SpousalConsentInitiatorPopupScreenConfig k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent f170680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent f170681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks f170682n;
    public static final SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse f170683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse f170684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final SpousalConsentInitiatorPopupScreenConfig f170685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final SpousalConsentInitiatorPopupScreenConfig f170686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline f170687t;
    public static final SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline u;
    public static final SpousalConsentInitiatorPopupScreenConfig v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SpousalConsentInitiatorPopupScreenConfig f170688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SpousalConsentInitiatorPopupScreenConfig f170689x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SpousalConsentInitiatorPopupScreenConfig f170690y;
    public static final SpousalConsentPartnerPopupScreenConfig.Respond z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f170691a;

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConfirmationPromptScreenConfig f170675b = new ConfirmationPromptScreenConfig(new TextLocalisedClause(R$string.credit_application_doc_sign_identity_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_doc_sign_identity_subtitle, null, null, 14));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConfirmationPromptScreenConfig f170676c = new ConfirmationPromptScreenConfig(new TextLocalisedClause(R$string.credit_application_doc_sign_identity_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_doc_sign_identity_subtitle, null, null, 14));
    public static final ConfirmationPromptScreenConfig d = new ConfirmationPromptScreenConfig(new TextLocalisedClause(R$string.credit_application_doc_sign_identity_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_doc_sign_identity_subtitle, null, null, 14));
    public static final AutoPayPromptScreenConfig e = new AutoPayPromptScreenConfig(new TextLocalisedClause(R$string.credit_loan_autopay_prompt_title, null, null, 14), new TextLocalisedClause(R$string.credit_loan_autopay_prompt_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_loan_autopay_prompt_setup_button, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14));
    public static final AutoPayPromptScreenConfig f = new AutoPayPromptScreenConfig(new TextLocalisedClause(R$string.credit_autopay_setup_info_title, null, null, 14), new TextLocalisedClause(R$string.credit_autopay_setup_info_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_autopay_setup_info_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final SpousalConsentPartnerScreenConfig f170677g = new SpousalConsentPartnerScreenConfig(new TextLocalisedClause(R$string.credit_application_family_loan_spouse_consent_consent_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_family_loan_spouse_consent_consent_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_application_family_loan_spouse_consent_consent_button_accept, null, null, 14), new TextLocalisedClause(R$string.credit_application_family_loan_spouse_consent_consent_button_decline, null, null, 14));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SpousalConsentPartnerScreenConfig f170678h = new SpousalConsentPartnerScreenConfig(new TextLocalisedClause(R$string.credit_application_family_credit_card_spouse_consent_consent_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_family_credit_card_spouse_consent_consent_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_application_family_credit_card_spouse_consent_consent_button_accept, null, null, 14), new TextLocalisedClause(R$string.credit_application_family_credit_card_spouse_consent_consent_button_decline, null, null, 14));
    public static final SpousalConsentInitiatorIntroScreenConfig.ApplyForOtherProduct i = new SpousalConsentInitiatorIntroScreenConfig.ApplyForOtherProduct(new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_failed_prompt_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_failed_prompt_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_failed_prompt_primary_button, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_failed_prompt_secondary_button, null, null, 14));

    static {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.spousal_consent_initiator_failed_popup_cc_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.spousal_consent_initiator_failed_popup_cc_description, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.spousal_consent_initiator_failed_popup_cc_primary_button, null, null, 14);
        SpousalConsentInitiatorPopupScreenConfig.Action.ConvertApplication convertApplication = SpousalConsentInitiatorPopupScreenConfig.Action.ConvertApplication.f66407a;
        SpousalConsentInitiatorPopupScreenConfig.Button button = new SpousalConsentInitiatorPopupScreenConfig.Button(textLocalisedClause3, convertApplication);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.spousal_consent_initiator_failed_popup_secondary_button, null, null, 14);
        SpousalConsentInitiatorPopupScreenConfig.Action.CancelApplication cancelApplication = SpousalConsentInitiatorPopupScreenConfig.Action.CancelApplication.f66405a;
        SpousalConsentInitiatorPopupScreenConfig.Button button2 = new SpousalConsentInitiatorPopupScreenConfig.Button(textLocalisedClause4, cancelApplication);
        h hVar = h.ERROR;
        f170679j = new SpousalConsentInitiatorPopupScreenConfig(textLocalisedClause, textLocalisedClause2, button, button2, cancelApplication, hVar);
        k = new SpousalConsentInitiatorPopupScreenConfig(new TextLocalisedClause(R$string.spousal_consent_initiator_failed_popup_ftc_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_failed_popup_ftc_description, null, null, 14), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_failed_popup_ftc_primary_button, null, null, 14), convertApplication), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_failed_popup_secondary_button, null, null, 14), cancelApplication), cancelApplication, hVar);
        f170680l = new SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent(new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_checking_prompt_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_checking_prompt_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_checking_prompt_primary_button, null, null, 14));
        f170681m = new SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent(new TextLocalisedClause(R$string.spousal_consent_initiator_cc_checking_prompt_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_cc_checking_prompt_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_cc_checking_prompt_primary_button, null, null, 14));
        f170682n = new SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks(new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_checking_request_consent_bullet_how_it_works_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_checking_request_consent_bullet_how_it_works_subtitle, null, null, 14), new SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks.ErrorDialog(new TextLocalisedClause(R$string.spousal_consent_initiator_common_checking_request_consent_dialog_request_not_sent_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_consent_request_dialog_error_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_common_checking_request_consent_dialog_request_not_sent_primary_button, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_consent_request_dialog_error_secondary_button, null, null, 14)));
        o = new SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks(new TextLocalisedClause(R$string.spousal_consent_initiator_cc_checking_request_consent_bullet_how_it_works_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_cc_checking_request_consent_bullet_how_it_works_subtitle, null, null, 14), new SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks.ErrorDialog(new TextLocalisedClause(R$string.spousal_consent_initiator_common_checking_request_consent_dialog_request_not_sent_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_cc_consent_request_dialog_error_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_common_checking_request_consent_dialog_request_not_sent_primary_button, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_cc_consent_request_dialog_error_secondary_button, null, null, 14)));
        f170683p = new SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse(new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_waiting_prompt_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_waiting_prompt_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_waiting_prompt_primary_button, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_waiting_prompt_secondary_button, null, null, 14));
        f170684q = new SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse(new TextLocalisedClause(R$string.spousal_consent_initiator_credit_card_waiting_prompt_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_credit_card_waiting_prompt_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_credit_card_waiting_prompt_primaryButton, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_credit_card_waiting_prompt_secondaryButton, null, null, 14));
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_popup_title, null, null, 14);
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_popup_ftc_description, null, null, 14);
        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_popup_primary_button, null, null, 14);
        SpousalConsentInitiatorPopupScreenConfig.Action.CloseScreen closeScreen = SpousalConsentInitiatorPopupScreenConfig.Action.CloseScreen.f66406a;
        SpousalConsentInitiatorPopupScreenConfig.Button button3 = new SpousalConsentInitiatorPopupScreenConfig.Button(textLocalisedClause7, closeScreen);
        TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_popup_secondary_button, null, null, 14);
        TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_cancellation_popup_title, null, null, 14);
        TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_cancellation_popup_ftc_description, null, null, 14);
        SpousalConsentInitiatorPopupScreenConfig.Button button4 = new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_cancellation_popup_primary_button, null, null, 14), cancelApplication);
        SpousalConsentInitiatorPopupScreenConfig.Button button5 = new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_cancellation_popup_ftc_secondary_button, null, null, 14), convertApplication);
        h hVar2 = h.PENDING;
        f170685r = new SpousalConsentInitiatorPopupScreenConfig(textLocalisedClause5, textLocalisedClause6, button3, new SpousalConsentInitiatorPopupScreenConfig.Button(textLocalisedClause8, new SpousalConsentInitiatorPopupScreenConfig.Action.ShowPopup(new SpousalConsentInitiatorPopupScreenConfig(textLocalisedClause9, textLocalisedClause10, button4, button5, closeScreen, hVar2))), closeScreen, hVar2);
        f170686s = new SpousalConsentInitiatorPopupScreenConfig(new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_popup_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_popup_cc_description, null, null, 14), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_popup_primary_button, null, null, 14), closeScreen), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_popup_secondary_button, null, null, 14), new SpousalConsentInitiatorPopupScreenConfig.Action.ShowPopup(new SpousalConsentInitiatorPopupScreenConfig(new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_cancellation_popup_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_cancellation_popup_cc_description, null, null, 14), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_cancellation_popup_primary_button, null, null, 14), cancelApplication), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_waiting_cancellation_popup_cc_secondary_button, null, null, 14), convertApplication), closeScreen, hVar2))), closeScreen, hVar2);
        f170687t = new SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline(new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_partner_declined_prompt_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_partner_declined_prompt_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_partner_declined_prompt_primary_button, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_ftc_partner_declined_prompt_secondary_button, null, null, 14));
        u = new SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline(new TextLocalisedClause(R$string.spousal_consent_initiator_credit_card_partner_declined_prompt_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_credit_card_partner_declined_prompt_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_credit_card_partner_declined_prompt_primaryButton, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_credit_card_partner_declined_prompt_secondaryButton, null, null, 14));
        v = new SpousalConsentInitiatorPopupScreenConfig(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_declined_popup_ftc_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_partner_declined_popup_ftc_description, null, null, 14), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_declined_popup_ftc_primary_button, null, null, 14), convertApplication), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_declined_popup_secondary_button, null, null, 14), cancelApplication), cancelApplication, hVar);
        f170688w = new SpousalConsentInitiatorPopupScreenConfig(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_declined_popup_cc_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_partner_declined_popup_cc_description, null, null, 14), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_declined_popup_cc_primary_button, null, null, 14), convertApplication), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_declined_popup_secondary_button, null, null, 14), cancelApplication), cancelApplication, hVar);
        f170689x = new SpousalConsentInitiatorPopupScreenConfig(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_not_matched_popup_ftc_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_partner_not_matched_popup_ftc_description, null, null, 14), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_not_matched_popup_ftc_primary_button, null, null, 14), convertApplication), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_not_matched_popup_secondary_button, null, null, 14), cancelApplication), cancelApplication, hVar);
        f170690y = new SpousalConsentInitiatorPopupScreenConfig(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_not_matched_popup_cc_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_initiator_partner_not_matched_popup_cc_description, null, null, 14), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_not_matched_popup_cc_primary_button, null, null, 14), convertApplication), new SpousalConsentInitiatorPopupScreenConfig.Button(new TextLocalisedClause(R$string.spousal_consent_initiator_partner_not_matched_popup_secondary_button, null, null, 14), cancelApplication), cancelApplication, hVar);
        z = new SpousalConsentPartnerPopupScreenConfig.Respond(new TextLocalisedClause(R$string.spousal_consent_partner_init_popup_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_partner_init_popup_cc_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_partner_init_popup_primary_button, null, null, 14));
        A = new SpousalConsentPartnerPopupScreenConfig.Respond(new TextLocalisedClause(R$string.spousal_consent_partner_init_popup_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_partner_init_popup_ftc_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_partner_init_popup_primary_button, null, null, 14));
        B = new SpousalConsentPartnerPopupScreenConfig.Waiting(new TextLocalisedClause(R$string.spousal_consent_partner_waiting_popup_title, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_partner_waiting_popup_description, null, null, 14), new TextLocalisedClause(R$string.spousal_consent_partner_waiting_popup_primary_button, null, null, 14));
        ju3.b bVar = ju3.b.QUICK_READ_ACTION_SUPPORT;
        C = new DocumentViewerScreenConfig(false, false, bVar, null, new TextLocalisedClause(R$string.credit_common_accept, null, null, 14), null, 40);
        new DocumentViewerScreenConfig(true, true, bVar, null, new TextLocalisedClause(R$string.credit_common_accept, null, null, 14), null, 40);
        WaitingPopupScreenConfig.INSTANCE.getClass();
        D = new ManualUnderwritingScreenConfig(WaitingPopupScreenConfig.Companion.b(), new ManualUnderwritingDocsSentPopupScreenConfig.DocsInReview(new TextLocalisedClause(R$string.credit_manual_underwriting_pending_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_pending_bottom_sheet_description, null, null, 14)));
    }

    public b(ImmutableMap configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f170691a = configs;
    }
}
