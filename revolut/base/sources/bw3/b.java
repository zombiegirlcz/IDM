package bw3;

import aii.e;
import aii.g;
import com.revolut.feature.confirmation_code.toggles.ESignOtpToggles$SmsOtpExtraction;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$BoundedAgreementWebView;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CoBorrowerConsentInitiatorRevTags;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CreditDropoutForm;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CreditWaitingListV3;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$ESignatureV2Configuration;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$FinancialEvidenceV2Configuration;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$MortgageOfferV5;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$NewAgreementSigningBehavior;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$PayLaterOnboardingImprovements;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$RolleeV4;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$RecommendedValuators$NavigationDestination;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$SpousalConsentPartner$NavigationDestination;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.api.navigation.prompt.CreditPromptInputData;
import com.revolut.feature.credit.application.plugins.impl.ui.address.flow.CreditAddressFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.address.flow.CreditAddressRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2Flow;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.CreditApplicationAgreementsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.CreditApplicationAgreementsRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2RootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.banner.BannerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.banner.BannerRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.CoBorrowerConsentPartnerFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.CoBorrowerConsentPartnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.CongratulationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.CongratulationRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.ConsentsV1FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.ConsentsV1RootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$CreditOfferConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.CreditInsuranceOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.CreditInsuranceOfferRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.CreditPostActivationWaitingFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.DocumentsRemediationFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.DocumentsRemediationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.DocumentsUploadPluginFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.DocumentsUploadPluginFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.DownPaymentSourceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.DownPaymentSourceFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow.EmergencyPaymentFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow.EmergencyPaymentRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow.FamilyCreditCardSettingsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow.FamilyCreditCardSettingsFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.FinancialSituationConfirmationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.FinancialSituationConfirmationFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2RootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3Controller;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.LoanSelectionFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.LoanSelectionFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.MortgageValuationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.MortgageValuationFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2RootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreenContract$OfferContentPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.PaymentFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.PaymentFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.PersonalDetailsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.PersonalDetailsRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.CreditPlanSelectionFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.CreditPlanSelectionFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.product_articles.ProductArticlesFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.product_articles.ProductArticlesRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.RefinancingAccountDetailsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.RefinancingAccountDetailsRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.SepaDirectDebitFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.SepaDirectDebitFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.UserSelectionFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.UserSelectionFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.modal_flow.RecommendedValuatorsModalFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.VisiblePrequalificationFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.VisiblePrequalificationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting.WaitingPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting.WaitingPopupScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowFlow;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import ft3.a1;
import ft3.d1;
import ft3.j1;
import hs3.k0;
import hs3.m0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yp3.f;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f19193a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f19193a = featureToggleInteractor;
    }

    public static final void a(qii.b bVar, b bVar2, NaviCommand naviCommand) {
        if (naviCommand == null) {
            bVar.J2();
            return;
        }
        if (!((jte.d) bVar2.f19193a).c(CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation.f66284c)) {
            knm.b.j(bVar.l1(), new BridgeDestination(r6.b.g(null, null, null, 7, naviCommand)));
        } else {
            knm.b.j(bVar.l1(), new BridgeDestination(naviCommand));
            bVar.J2();
        }
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof rv3.a) {
            rv3.a aVar = (rv3.a) descriptor;
            CreditPromptInputData creditPromptInputData = aVar.f257689a;
            return aVar.a(new CreditPromptFlow(new CreditPromptFlowContract$InputData(creditPromptInputData.f66901a, creditPromptInputData.f66902b, creditPromptInputData.f66903c, creditPromptInputData.d)));
        }
        if (!(descriptor instanceof yp3.a)) {
            return null;
        }
        yp3.a aVar2 = (yp3.a) descriptor;
        j1 j1Var = aVar2.f315767a;
        int i = a.f19192a[j1Var.ordinal()];
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return aVar2.a(new CreditApplicationFlow(new CreditApplicationFlowContract$InputData(new d1(j1Var, null, null), aVar2.f315768b, aVar2.f315769c, aVar2.d, null, aVar2.e, aVar2.f, aVar2.f315770g, aVar2.f315771h, null, null, null)));
    }

    @Override // nte.a
    public final List e() {
        return d0.E0(u.c(ESignOtpToggles$SmsOtpExtraction.f65950c), d0.E0(u.c(CreditApplicationApi$Toggles.BalanceTransferAlwaysEntryPoints.f66179c), v.k(CreditApplicationPluginsApi$Toggles$NewAgreementSigningBehavior.f66281c, CreditApplicationPluginsApi$Toggles$FinancialEvidenceV2Configuration.f66279c, CreditApplicationPluginsApi$Toggles$ESignatureV2Configuration.f66278c, CreditApplicationPluginsApi$Toggles$CoBorrowerConsentInitiatorRevTags.f66275c, CreditApplicationPluginsApi$Toggles$MortgageOfferV5.f66280c, CreditApplicationPluginsApi$Toggles$CreditDropoutForm.f66276c, CreditApplicationPluginsApi$Toggles$CreditWaitingListV3.f66277c, CreditApplicationPluginsApi$Toggles$RolleeV4.f66283c, CreditApplicationPluginsApi$Toggles$BoundedAgreementWebView.f66274c, CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation.f66284c, CreditApplicationPluginsApi$Toggles$PayLaterOnboardingImprovements.f66282c)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        CreditAddressV2FlowContract$Config addressSelection;
        CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData;
        OutstandingDebtsV2FlowContract$InputData debtsHub;
        CreditCardOfferFlowContract$CreditOfferConfig promoOffer;
        OfferV2FlowContract$InputData.Config summary;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CreditApplicationKompotFeatureConfig.Confirmation.ConfirmationNavigationDestination) {
            CreditApplicationKompotFeatureConfig.Confirmation.ConfirmationNavigationDestination confirmationNavigationDestination = (CreditApplicationKompotFeatureConfig.Confirmation.ConfirmationNavigationDestination) destination;
            return new ConfirmationRootFlow(new ConfirmationFlowContract$InputData(confirmationNavigationDestination.f66579a, confirmationNavigationDestination.f66580b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Congratulations.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.Congratulations.NavigationDestination navigationDestination = (CreditApplicationKompotFeatureConfig.Congratulations.NavigationDestination) destination;
            return new CongratulationRootFlow(new CongratulationFlowContract$InputData(navigationDestination.f66583a, navigationDestination.f66584b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.HowItWorks.HowItWorksNavigationDestination) {
            return new HowItWorksRootFlow(new HowItWorksFlowContract$InputData(((CreditApplicationKompotFeatureConfig.HowItWorks.HowItWorksNavigationDestination) destination).f66690a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ESignature.ESignatureNavigationDestination) {
            CreditApplicationKompotFeatureConfig.ESignature.ESignatureNavigationDestination eSignatureNavigationDestination = (CreditApplicationKompotFeatureConfig.ESignature.ESignatureNavigationDestination) destination;
            return new ESignatureRootFlow(new ESignatureFlowContract$InputData(eSignatureNavigationDestination.f66651a, eSignatureNavigationDestination.f66652b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.MortgageSignature.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.MortgageSignature.NavigationDestination navigationDestination2 = (CreditApplicationKompotFeatureConfig.MortgageSignature.NavigationDestination) destination;
            return new MortgageSignatureFlow(new MortgageSignatureFlowContract$InputData(navigationDestination2.f66739a, navigationDestination2.f66740b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.MortgageSignatureSigned.NavigationDestination) {
            return new MortgageSignatureSignedFlow(new MortgageSignatureSignedFlowContract$InputData(((CreditApplicationKompotFeatureConfig.MortgageSignatureSigned.NavigationDestination) destination).f66743a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.CardOrdering.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.CardOrdering.NavigationDestination navigationDestination3 = (CreditApplicationKompotFeatureConfig.CardOrdering.NavigationDestination) destination;
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = navigationDestination3.f66563a;
            CreditApplicationKompotFeatureConfig.CardOrdering.Config config = navigationDestination3.f66564b;
            if (config instanceof CreditApplicationKompotFeatureConfig.CardOrdering.Config.CardOrdered) {
                CreditApplicationKompotFeatureConfig.CardOrdering.Config.CardOrdered cardOrdered = (CreditApplicationKompotFeatureConfig.CardOrdering.Config.CardOrdered) config;
                return new CardOrderingRootFlow(new CardOrderingFlowContract$InputData.CardOrdered(cardOrdered.f66553a, cardOrdered.f66554b, cardOrdered.f66555c, creditApplicationPluginFlowContract$Configuration));
            }
            if (config instanceof CreditApplicationKompotFeatureConfig.CardOrdering.Config.PhysicalAndVirtualCard) {
                CreditApplicationKompotFeatureConfig.CardOrdering.Config.PhysicalAndVirtualCard physicalAndVirtualCard = (CreditApplicationKompotFeatureConfig.CardOrdering.Config.PhysicalAndVirtualCard) config;
                return new CardOrderingRootFlow(new CardOrderingFlowContract$InputData.PhysicalAndVirtualCard(physicalAndVirtualCard.f66557a, physicalAndVirtualCard.f66558b, creditApplicationPluginFlowContract$Configuration, physicalAndVirtualCard.f66559c, physicalAndVirtualCard.d, physicalAndVirtualCard.e));
            }
            if (config instanceof CreditApplicationKompotFeatureConfig.CardOrdering.Config.VirtualCard) {
                CreditApplicationKompotFeatureConfig.CardOrdering.Config.VirtualCard virtualCard = (CreditApplicationKompotFeatureConfig.CardOrdering.Config.VirtualCard) config;
                return new CardOrderingRootFlow(new CardOrderingFlowContract$InputData.VirtualCard(virtualCard.f66560a, virtualCard.f66561b, creditApplicationPluginFlowContract$Configuration, virtualCard.f66562c, virtualCard.d, virtualCard.e));
            }
            if (config instanceof CreditApplicationKompotFeatureConfig.CardOrdering.Config.FromPayload) {
                return new CardOrderingRootFlow(new CardOrderingFlowContract$InputData.FromPayload(((CreditApplicationKompotFeatureConfig.CardOrdering.Config.FromPayload) config).f66556a, creditApplicationPluginFlowContract$Configuration));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ComboCardOrdering.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.ComboCardOrdering.NavigationDestination navigationDestination4 = (CreditApplicationKompotFeatureConfig.ComboCardOrdering.NavigationDestination) destination;
            return new ComboCardOrderingRootFlow(new ComboCardOrderingFlowContract$InputData(navigationDestination4.f66574a, navigationDestination4.f66576c, navigationDestination4.f66575b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Agreements.AgreementsNavigationDestination) {
            CreditApplicationKompotFeatureConfig.Agreements.AgreementsNavigationDestination agreementsNavigationDestination = (CreditApplicationKompotFeatureConfig.Agreements.AgreementsNavigationDestination) destination;
            return new CreditApplicationAgreementsRootFlow(new CreditApplicationAgreementsFlowContract$InputData(agreementsNavigationDestination.f66519a, agreementsNavigationDestination.f66520b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.AgreementsV2.AgreementsV2NavigationDestination) {
            CreditApplicationKompotFeatureConfig.AgreementsV2.AgreementsV2NavigationDestination agreementsV2NavigationDestination = (CreditApplicationKompotFeatureConfig.AgreementsV2.AgreementsV2NavigationDestination) destination;
            return new CreditAgreementsV2RootFlow(new CreditAgreementsV2FlowContract$InputData(agreementsV2NavigationDestination.f66523a, agreementsV2NavigationDestination.f66524b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Workflow.WorkflowNavigationDestination) {
            CreditApplicationKompotFeatureConfig.Workflow.WorkflowNavigationDestination workflowNavigationDestination = (CreditApplicationKompotFeatureConfig.Workflow.WorkflowNavigationDestination) destination;
            return new CreditWorkflowFlow(new CreditWorkflowContract$InputData(workflowNavigationDestination.f66887b, workflowNavigationDestination.f66886a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Form.FormNavigationDestination) {
            return new FormRootFlow(new FormFlowContract$InputData(((CreditApplicationKompotFeatureConfig.Form.FormNavigationDestination) destination).f66684a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.EmergencyPayment.EmergencyPaymentNavigationDestination) {
            CreditApplicationKompotFeatureConfig.EmergencyPayment.EmergencyPaymentNavigationDestination emergencyPaymentNavigationDestination = (CreditApplicationKompotFeatureConfig.EmergencyPayment.EmergencyPaymentNavigationDestination) destination;
            return new EmergencyPaymentRootFlow(new EmergencyPaymentFlowContract$InputData(emergencyPaymentNavigationDestination.f66664b, emergencyPaymentNavigationDestination.f66663a, emergencyPaymentNavigationDestination.f66665c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Offer.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.Offer.NavigationDestination navigationDestination5 = (CreditApplicationKompotFeatureConfig.Offer.NavigationDestination) destination;
            return new OfferRootFlow(new OfferFlowContract$InputData(navigationDestination5.f66750a, navigationDestination5.f66751b, navigationDestination5.f66752c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Rollee.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.Rollee.NavigationDestination navigationDestination6 = (CreditApplicationKompotFeatureConfig.Rollee.NavigationDestination) destination;
            return new RolleeRootFlow(new RolleeFlowContract$InputData(navigationDestination6.f66818a, navigationDestination6.f66820c, navigationDestination6.f66819b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Akahu.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.Akahu.NavigationDestination navigationDestination7 = (CreditApplicationKompotFeatureConfig.Akahu.NavigationDestination) destination;
            return new AkahuRootFlow(new AkahuFlowContract$InputData(navigationDestination7.f66528a, navigationDestination7.f66529b, navigationDestination7.f66530c, navigationDestination7.d));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.OfferV2.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.OfferV2.NavigationDestination navigationDestination8 = (CreditApplicationKompotFeatureConfig.OfferV2.NavigationDestination) destination;
            CreditApplicationKompotFeatureConfig.OfferV2.Config config2 = navigationDestination8.f66758a;
            if (config2 instanceof CreditApplicationKompotFeatureConfig.OfferV2.Config.Intro) {
                m0 m0Var = ((CreditApplicationKompotFeatureConfig.OfferV2.Config.Intro) config2).f66756a;
                summary = new OfferV2FlowContract$InputData.Config.Intro(m0Var.f154909a, m0Var.f154910b);
            } else if (config2 instanceof CreditApplicationKompotFeatureConfig.OfferV2.Config.Insurance) {
                summary = OfferV2FlowContract$InputData.Config.Insurance.f68091a;
            } else {
                if (!(config2 instanceof CreditApplicationKompotFeatureConfig.OfferV2.Config.Summary)) {
                    throw new NoWhenBranchMatchedException();
                }
                k0 k0Var = ((CreditApplicationKompotFeatureConfig.OfferV2.Config.Summary) config2).f66757a;
                summary = new OfferV2FlowContract$InputData.Config.Summary(k0Var.f154902b, k0Var.f154901a);
            }
            return new OfferV2RootFlow(new OfferV2FlowContract$InputData(summary, navigationDestination8.f66759b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.CreditCardOffer.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.CreditCardOffer.NavigationDestination navigationDestination9 = (CreditApplicationKompotFeatureConfig.CreditCardOffer.NavigationDestination) destination;
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration2 = navigationDestination9.f66608b;
            CreditApplicationKompotFeatureConfig.CreditCardOffer.CreditOfferConfig creditOfferConfig = navigationDestination9.f66607a;
            if (creditOfferConfig instanceof CreditApplicationKompotFeatureConfig.CreditCardOffer.CreditOfferConfig.RegularOffer) {
                promoOffer = new CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer(new TopItemOfferContentScreenContract$OfferContentPayload(((CreditApplicationKompotFeatureConfig.CreditCardOffer.CreditOfferConfig.RegularOffer) creditOfferConfig).f66606a));
            } else {
                if (!(creditOfferConfig instanceof CreditApplicationKompotFeatureConfig.CreditCardOffer.CreditOfferConfig.PromoOffer)) {
                    throw new NoWhenBranchMatchedException();
                }
                promoOffer = new CreditCardOfferFlowContract$CreditOfferConfig.PromoOffer(((CreditApplicationKompotFeatureConfig.CreditCardOffer.CreditOfferConfig.PromoOffer) creditOfferConfig).f66605a);
            }
            return new CreditCardOfferFlow(new CreditCardOfferFlowContract$InputData(promoOffer, creditApplicationPluginFlowContract$Configuration2));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.MortgageOffer.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.MortgageOffer.NavigationDestination navigationDestination10 = (CreditApplicationKompotFeatureConfig.MortgageOffer.NavigationDestination) destination;
            return new MortgageOfferFlow(new MortgageOfferFlowContract$InputData(navigationDestination10.f66731a, navigationDestination10.f66732b, navigationDestination10.f66733c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.MortgageRefinancingDetailsV2.NavigationDestination) {
            return new MortgageRefinancingDetailsV2FlowController(new MortgageRefinancingDetailsV2FlowContract$InputData(((CreditApplicationKompotFeatureConfig.MortgageRefinancingDetailsV2.NavigationDestination) destination).f66736a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.RefinancingOffer.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.RefinancingOffer.NavigationDestination navigationDestination11 = (CreditApplicationKompotFeatureConfig.RefinancingOffer.NavigationDestination) destination;
            return new RefinancingOfferRootFlow(new RefinancingOfferFlowContract$InputData(navigationDestination11.f66807a, navigationDestination11.f66808b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.RefinancingAccountDetails.NavigationDestination) {
            return new RefinancingAccountDetailsRootFlow(new RefinancingAccountDetailsFlowContract$InputData(((CreditApplicationKompotFeatureConfig.RefinancingAccountDetails.NavigationDestination) destination).f66802a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Consents.NavigationDestination) {
            return new ConsentsRootFlow(new ConsentsFlowContract$InputData(((CreditApplicationKompotFeatureConfig.Consents.NavigationDestination) destination).f66587a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.SpousalConsentInitiator.SpousalConsentInitiatorNavigationDestination) {
            CreditApplicationKompotFeatureConfig.SpousalConsentInitiator.SpousalConsentInitiatorNavigationDestination spousalConsentInitiatorNavigationDestination = (CreditApplicationKompotFeatureConfig.SpousalConsentInitiator.SpousalConsentInitiatorNavigationDestination) destination;
            return new SpousalConsentInitiatorRootFlow(new SpousalConsentInitiatorFlowContract$InputData(spousalConsentInitiatorNavigationDestination.f66841a, new SpousalConsentInitiatorFlowContract$InputData.Config.Intro(spousalConsentInitiatorNavigationDestination.f66842b)));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig$SpousalConsentPartner$NavigationDestination) {
            return new SpousalConsentPartnerRootFlow(new SpousalConsentPartnerFlowContract$InputData(((CreditApplicationKompotFeatureConfig$SpousalConsentPartner$NavigationDestination) destination).f66849a, SpousalConsentPartnerFlowContract$InputData.Config.GiveConsent.f68461a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ManualUnderwriting.ManualUnderwritingNavigationDestination) {
            CreditApplicationKompotFeatureConfig.ManualUnderwriting.ManualUnderwritingNavigationDestination manualUnderwritingNavigationDestination = (CreditApplicationKompotFeatureConfig.ManualUnderwriting.ManualUnderwritingNavigationDestination) destination;
            return new ManualUnderwritingRootFlow(new ManualUnderwritingContract$InputData(new ManualUnderwritingContract$InputData.Config.Intro(manualUnderwritingNavigationDestination.f66713a, manualUnderwritingNavigationDestination.f66715c, ju3.g.BOTTOM_SHEET), manualUnderwritingNavigationDestination.f66714b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ManualUnderwritingTicketor.ManualUnderwritingNavigationDestination) {
            CreditApplicationKompotFeatureConfig.ManualUnderwritingTicketor.ManualUnderwritingNavigationDestination manualUnderwritingNavigationDestination2 = (CreditApplicationKompotFeatureConfig.ManualUnderwritingTicketor.ManualUnderwritingNavigationDestination) destination;
            return new ManualUnderwritingRootFlow(new ManualUnderwritingContract$InputData(new ManualUnderwritingContract$InputData.Config.TicketorProgress(manualUnderwritingNavigationDestination2.f66725a, manualUnderwritingNavigationDestination2.f66727c, ju3.g.BOTTOM_SHEET), manualUnderwritingNavigationDestination2.f66726b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ManualUnderwritingPopup.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.ManualUnderwritingPopup.NavigationDestination navigationDestination12 = (CreditApplicationKompotFeatureConfig.ManualUnderwritingPopup.NavigationDestination) destination;
            return new ManualUnderwritingRootFlow(new ManualUnderwritingContract$InputData(new ManualUnderwritingContract$InputData.Config.AdditionalInfoRequired(navigationDestination12.f66719a, navigationDestination12.f66721c, ju3.g.BOTTOM_SHEET), navigationDestination12.f66720b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Calculator.CalculatorNavigationDestination) {
            return new CalculatorRootFlow(new CalculatorFlowContract$InputData(((CreditApplicationKompotFeatureConfig.Calculator.CalculatorNavigationDestination) destination).f66544a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Address.AddressNavigationDestination) {
            return new CreditAddressRootFlow(new CreditAddressFlowContract$InputData(((CreditApplicationKompotFeatureConfig.Address.AddressNavigationDestination) destination).f66506a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.LinkedAccountsV2.NavigationDestination) {
            return new CreditLinkedAccountsV2RootFlow(new CreditLinkedAccountsV2FlowContract$InputData(((CreditApplicationKompotFeatureConfig.LinkedAccountsV2.NavigationDestination) destination).f66701a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.LinkedAccountsV3.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.LinkedAccountsV3.NavigationDestination navigationDestination13 = (CreditApplicationKompotFeatureConfig.LinkedAccountsV3.NavigationDestination) destination;
            return new CreditLinkedAccountsV3Controller(new CreditLinkedAccountsV3FlowContract$InputData(navigationDestination13.f66704a, navigationDestination13.f66705b, navigationDestination13.f66706c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ConsentsV1.ConsentsV1NavigationDestination) {
            CreditApplicationKompotFeatureConfig.ConsentsV1.ConsentsV1NavigationDestination consentsV1NavigationDestination = (CreditApplicationKompotFeatureConfig.ConsentsV1.ConsentsV1NavigationDestination) destination;
            return new ConsentsV1RootFlow(new ConsentsV1FlowContract$InputData(consentsV1NavigationDestination.f66591a, consentsV1NavigationDestination.f66592b, consentsV1NavigationDestination.f66593c, consentsV1NavigationDestination.d));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Banner.BannerNavigationDestination) {
            CreditApplicationKompotFeatureConfig.Banner.BannerNavigationDestination bannerNavigationDestination = (CreditApplicationKompotFeatureConfig.Banner.BannerNavigationDestination) destination;
            return new BannerRootFlow(new BannerFlowContract$InputData(bannerNavigationDestination.f66537a, bannerNavigationDestination.f66538b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ExpiredPopup.NavigationDestination) {
            return new ExpiredApplicationRootFlow(new ExpiredApplicationRootFlowContract$InputData(((CreditApplicationKompotFeatureConfig.ExpiredPopup.NavigationDestination) destination).f66668a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.DeclineInvitationPopup.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.DeclineInvitationPopup.NavigationDestination navigationDestination14 = (CreditApplicationKompotFeatureConfig.DeclineInvitationPopup.NavigationDestination) destination;
            return gc0.c.b(new DeclineInvitationPopupScreen(new DeclineInvitationPopupScreenContract$InputData(navigationDestination14.f66617a, navigationDestination14.f66618b)), new aab.b(5));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Spinner.SpinnerNavigationDestination) {
            CreditApplicationKompotFeatureConfig.Spinner.SpinnerNavigationDestination spinnerNavigationDestination = (CreditApplicationKompotFeatureConfig.Spinner.SpinnerNavigationDestination) destination;
            return new SpinnerRootFlow(new SpinnerFlowContract$InputData(spinnerNavigationDestination.f66836a, spinnerNavigationDestination.f66837b, spinnerNavigationDestination.f66838c, spinnerNavigationDestination.d));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.OutstandingDebts.OutstandingDebtsNavigationDestination) {
            return new OutstandingDebtsFlowController(new OutstandingDebtsFlowContract$InputData(((CreditApplicationKompotFeatureConfig.OutstandingDebts.OutstandingDebtsNavigationDestination) destination).f66762a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.OutstandingDebtsV2.OutstandingDebtsV2NavigationDestination) {
            CreditApplicationKompotFeatureConfig.OutstandingDebtsV2.OutstandingDebtsV2NavigationDestination outstandingDebtsV2NavigationDestination = (CreditApplicationKompotFeatureConfig.OutstandingDebtsV2.OutstandingDebtsV2NavigationDestination) destination;
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration3 = outstandingDebtsV2NavigationDestination.f66767a;
            CreditApplicationKompotFeatureConfig.OutstandingDebtsV2.Config config3 = outstandingDebtsV2NavigationDestination.f66768b;
            if (config3 instanceof CreditApplicationKompotFeatureConfig.OutstandingDebtsV2.Config.Intro) {
                debtsHub = new OutstandingDebtsV2FlowContract$InputData.Intro(creditApplicationPluginFlowContract$Configuration3);
            } else {
                if (!(config3 instanceof CreditApplicationKompotFeatureConfig.OutstandingDebtsV2.Config.DebtsHub)) {
                    throw new NoWhenBranchMatchedException();
                }
                debtsHub = new OutstandingDebtsV2FlowContract$InputData.DebtsHub(creditApplicationPluginFlowContract$Configuration3);
            }
            return new OutstandingDebtsV2FlowController(debtsHub);
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.OutstandingDebtsV3.NavigationDestination) {
            return new OutstandingDebtsV3FlowController(new OutstandingDebtsV3FlowContract$InputData(((CreditApplicationKompotFeatureConfig.OutstandingDebtsV3.NavigationDestination) destination).f66770a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.DirectDebitAccountConfirmation.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.DirectDebitAccountConfirmation.NavigationDestination navigationDestination15 = (CreditApplicationKompotFeatureConfig.DirectDebitAccountConfirmation.NavigationDestination) destination;
            return new DirectDebitRootFlow(new DirectDebitContract$InputData(new DirectDebitContract$InputData.Config.Passed(navigationDestination15.f66621a), navigationDestination15.f66622b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.DirectDebitAccountSelection.NavigationDestination) {
            return new DirectDebitRootFlow(new DirectDebitContract$InputData(DirectDebitContract$InputData.Config.Started.f67528a, ((CreditApplicationKompotFeatureConfig.DirectDebitAccountSelection.NavigationDestination) destination).f66625a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.DirectDebitFailed.NavigationDestination) {
            return new DirectDebitFailedRootFlow(new DirectDebitFailedContract$InputData(((CreditApplicationKompotFeatureConfig.DirectDebitFailed.NavigationDestination) destination).f66628a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Rejected.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.Rejected.NavigationDestination navigationDestination16 = (CreditApplicationKompotFeatureConfig.Rejected.NavigationDestination) destination;
            return new RejectedRootFlow(new RejectedRootFlowContract$InputData(navigationDestination16.f66812a, navigationDestination16.f66813b, navigationDestination16.f66814c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.AutoPay.AutoPayDestination) {
            return new AutopayRootFlow(new AutopayFlowContract$InputData(((CreditApplicationKompotFeatureConfig.AutoPay.AutoPayDestination) destination).f66534b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.CreditCardAutoPay.AutoPayDestination) {
            CreditApplicationKompotFeatureConfig.CreditCardAutoPay.AutoPayDestination autoPayDestination = (CreditApplicationKompotFeatureConfig.CreditCardAutoPay.AutoPayDestination) destination;
            return new CreditCardApplicationAutopayRootFlow(new CreditCardApplicationAutopayFlowContract$InputData(autoPayDestination.f66600a, autoPayDestination.f66601b, autoPayDestination.f66602c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.WaitingPopup.NavigationDestination) {
            return new WaitingPopupScreen(new WaitingPopupScreenContract$InputData(((CreditApplicationKompotFeatureConfig.WaitingPopup.NavigationDestination) destination).f66883a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.SpousalConsentInitiatorPopup.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.SpousalConsentInitiatorPopup.NavigationDestination navigationDestination17 = (CreditApplicationKompotFeatureConfig.SpousalConsentInitiatorPopup.NavigationDestination) destination;
            return new SpousalConsentInitiatorRootFlow(new SpousalConsentInitiatorFlowContract$InputData(navigationDestination17.f66848c, new SpousalConsentInitiatorFlowContract$InputData.Config.Popup(navigationDestination17.f66846a, navigationDestination17.f66847b)));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.SpousalConsentPartnerPopup.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.SpousalConsentPartnerPopup.NavigationDestination navigationDestination18 = (CreditApplicationKompotFeatureConfig.SpousalConsentPartnerPopup.NavigationDestination) destination;
            return new SpousalConsentPartnerRootFlow(new SpousalConsentPartnerFlowContract$InputData(navigationDestination18.f66853b, new SpousalConsentPartnerFlowContract$InputData.Config.Popup(navigationDestination18.f66852a)));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.EmailVerification.NavigationDestination) {
            return new EmailVerificationRootFlow(new EmailVerificationFlowContract$InputData(((CreditApplicationKompotFeatureConfig.EmailVerification.NavigationDestination) destination).f66655a, null));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.EmailVerificationContinue.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.EmailVerificationContinue.NavigationDestination navigationDestination19 = (CreditApplicationKompotFeatureConfig.EmailVerificationContinue.NavigationDestination) destination;
            return new EmailVerificationRootFlow(new EmailVerificationFlowContract$InputData(navigationDestination19.f66659b, navigationDestination19.f66658a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.BirthPlace.NavigationDestination) {
            return new BirthPlaceRootFlow(new BirthPlaceRootFlowContract$InputData(((CreditApplicationKompotFeatureConfig.BirthPlace.NavigationDestination) destination).f66541a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.StatusDialog.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.StatusDialog.NavigationDestination navigationDestination20 = (CreditApplicationKompotFeatureConfig.StatusDialog.NavigationDestination) destination;
            return new StatusDialogRootFlow(new StatusDialogFlowContract$InputData(navigationDestination20.f66873a, navigationDestination20.f66874b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.DocumentsRemediation.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.DocumentsRemediation.NavigationDestination navigationDestination21 = (CreditApplicationKompotFeatureConfig.DocumentsRemediation.NavigationDestination) destination;
            return new DocumentsRemediationFlow(new DocumentsRemediationFlowContract$InputData(navigationDestination21.f66631a, navigationDestination21.f66632b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.StartApplication.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.StartApplication.NavigationDestination navigationDestination22 = (CreditApplicationKompotFeatureConfig.StartApplication.NavigationDestination) destination;
            j1 j1Var = navigationDestination22.f66863a;
            int i = a.f19192a[j1Var.ordinal()];
            if (i == 1 || i == 2) {
                CreditApplicationFlowContract$InputData.Companion companion = CreditApplicationFlowContract$InputData.INSTANCE;
                j1 productType = navigationDestination22.f66863a;
                a1 entryPointPayload = navigationDestination22.f66865c;
                wp3.a activeApplicationStrategy = navigationDestination22.d;
                f productIntroStrategy = navigationDestination22.f66866g;
                String originalFacilityId = navigationDestination22.k;
                if (originalFacilityId == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str = navigationDestination22.f66870m;
                companion.getClass();
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
                Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
                Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
                Intrinsics.checkNotNullParameter(originalFacilityId, "originalFacilityId");
                creditApplicationFlowContract$InputData = new CreditApplicationFlowContract$InputData(new d1(productType, null, null), entryPointPayload, activeApplicationStrategy, yp3.d.DEFAULT, null, productIntroStrategy, yp3.c.DEFAULT, yp3.e.SKIP_ON_TOGGLE_DISABLED, yp3.b.DEFAULT, originalFacilityId, null, str);
            } else {
                creditApplicationFlowContract$InputData = new CreditApplicationFlowContract$InputData(new d1(j1Var, navigationDestination22.f66864b, null), navigationDestination22.f66865c, navigationDestination22.d, navigationDestination22.e, navigationDestination22.f, navigationDestination22.f66866g, navigationDestination22.f66867h, navigationDestination22.i, navigationDestination22.f66868j, navigationDestination22.k, navigationDestination22.f66869l, navigationDestination22.f66870m);
            }
            return gc0.c.b(new CreditApplicationFlow(creditApplicationFlowContract$InputData), new an4.b(this, 1));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.CancelApplication.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.CancelApplication.NavigationDestination navigationDestination23 = (CreditApplicationKompotFeatureConfig.CancelApplication.NavigationDestination) destination;
            return gc0.c.b(new CreditApplicationCloseFlow(new CreditApplicationCloseFlowContract$InputData(navigationDestination23.f66548a, navigationDestination23.f66549b, navigationDestination23.f66550c, navigationDestination23.d)), new aab.b(6));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination) {
            CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination creditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination = (CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination) destination;
            return new CreditCardPostRetailOnboardingFlow(new CreditCardPostRetailOnboardingFlowContract$InputData(creditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination.f66609a, creditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination.f66610b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination) {
            return new CreditPostActivationWaitingFlow();
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.CoBorrowerConsentInitiator.NavigationDestination) {
            return new CoBorrowerConsentInitiatorFlow(new CoBorrowerConsentInitiatorFlowContract$InputData(((CreditApplicationKompotFeatureConfig.CoBorrowerConsentInitiator.NavigationDestination) destination).f66567a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.CoBorrowerConsentPartner.NavigationDestination) {
            return new CoBorrowerConsentPartnerFlow(new CoBorrowerConsentPartnerFlowContract$InputData(((CreditApplicationKompotFeatureConfig.CoBorrowerConsentPartner.NavigationDestination) destination).f66570a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.PersonalDetails.NavigationDestination) {
            return new PersonalDetailsRootFlow(new PersonalDetailsFlowContract$InputData(((CreditApplicationKompotFeatureConfig.PersonalDetails.NavigationDestination) destination).f66779a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig$RecommendedValuators$NavigationDestination) {
            return new RecommendedValuatorsModalFlow();
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.FinancialEvidence.NavigationDestination) {
            return new FinancialEvidenceFlow(new FinancialEvidenceFlowContract$InputData(((CreditApplicationKompotFeatureConfig.FinancialEvidence.NavigationDestination) destination).f66678a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.IllionBankStatement.NavigationDestination) {
            return new IllionBankStatementFlowController(new IllionBankStatementFlowContract$InputData(((CreditApplicationKompotFeatureConfig.IllionBankStatement.NavigationDestination) destination).f66693a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.DocumentsUpload.NavigationDestination) {
            return new DocumentsUploadPluginFlowController(new DocumentsUploadPluginFlowContract$InputData(((CreditApplicationKompotFeatureConfig.DocumentsUpload.NavigationDestination) destination).f66635a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.HomeInsurance.NavigationDestination) {
            return new HomeInsuranceFlowController(new HomeInsuranceFlowContract$InputData(((CreditApplicationKompotFeatureConfig.HomeInsurance.NavigationDestination) destination).f66687a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ConveyancingAppointmentScheduling.NavigationDestination) {
            return new ConveyancingAppointmentSchedulingFlowController(new ConveyancingAppointmentSchedulingFlowContract$InputData(((CreditApplicationKompotFeatureConfig.ConveyancingAppointmentScheduling.NavigationDestination) destination).f66596a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.KontomatikIncomeCheck.KontomatikIncomeCheckDestination) {
            CreditApplicationKompotFeatureConfig.KontomatikIncomeCheck.KontomatikIncomeCheckDestination kontomatikIncomeCheckDestination = (CreditApplicationKompotFeatureConfig.KontomatikIncomeCheck.KontomatikIncomeCheckDestination) destination;
            return new KontomatikIncomeCheckFlow(new KontomatikIncomeCheckFlowContract$InputData(kontomatikIncomeCheckDestination.f66697a, kontomatikIncomeCheckDestination.f66698b, kontomatikIncomeCheckDestination.f66699c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.FinancialSituationConfirmation.NavigationDestination) {
            return new FinancialSituationConfirmationFlowController(new FinancialSituationConfirmationFlowContract$InputData(((CreditApplicationKompotFeatureConfig.FinancialSituationConfirmation.NavigationDestination) destination).f66681a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.PhotosUpload.NavigationDestination) {
            return new PhotosUploadFlowController(new PhotosUploadFlowContract$InputData(((CreditApplicationKompotFeatureConfig.PhotosUpload.NavigationDestination) destination).f66782a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.SecurityDeposit.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.SecurityDeposit.NavigationDestination navigationDestination24 = (CreditApplicationKompotFeatureConfig.SecurityDeposit.NavigationDestination) destination;
            return new SecurityDepositRootFlow(new SecurityDepositFlowContract$InputData(navigationDestination24.f66824a, navigationDestination24.f66825b, navigationDestination24.f66826c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.ProductArticles.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.ProductArticles.NavigationDestination navigationDestination25 = (CreditApplicationKompotFeatureConfig.ProductArticles.NavigationDestination) destination;
            return new ProductArticlesRootFlow(new ProductArticlesFlowContract$InputData(navigationDestination25.f66796a, navigationDestination25.f66797b, navigationDestination25.f66798c, navigationDestination25.d));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.PlanSelection.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.PlanSelection.NavigationDestination navigationDestination26 = (CreditApplicationKompotFeatureConfig.PlanSelection.NavigationDestination) destination;
            return new CreditPlanSelectionFlow(new CreditPlanSelectionFlowContract$InputData(navigationDestination26.f66786a, navigationDestination26.f66787b, navigationDestination26.f66788c));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.PlanSubscribe.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.PlanSubscribe.NavigationDestination navigationDestination27 = (CreditApplicationKompotFeatureConfig.PlanSubscribe.NavigationDestination) destination;
            return new PlanSubscribeFlow(new PlanSubscribeFlowContract$InputData(navigationDestination27.f66791a, navigationDestination27.f66792b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.VisiblePrequalification.NavigationDestination) {
            return new VisiblePrequalificationFlow(new VisiblePrequalificationFlowContract$InputData(((CreditApplicationKompotFeatureConfig.VisiblePrequalification.NavigationDestination) destination).f66880a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.AddressV2.NavigationDestination) {
            CreditApplicationKompotFeatureConfig.AddressV2.NavigationDestination navigationDestination28 = (CreditApplicationKompotFeatureConfig.AddressV2.NavigationDestination) destination;
            CreditApplicationKompotFeatureConfig.AddressV2.Config config4 = navigationDestination28.f66515a;
            if (config4 instanceof CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressInput) {
                CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressInput addressInput = (CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressInput) config4;
                addressSelection = new CreditAddressV2FlowContract$Config.AddressInput(addressInput.f66509a, addressInput.f66510b, addressInput.f66511c, addressInput.d);
            } else {
                if (!(config4 instanceof CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressSelection addressSelection2 = (CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressSelection) config4;
                addressSelection = new CreditAddressV2FlowContract$Config.AddressSelection(addressSelection2.f66512a, addressSelection2.f66513b, addressSelection2.f66514c, addressSelection2.d);
            }
            return new CreditAddressV2Flow(new CreditAddressV2FlowContract$InputData(addressSelection, navigationDestination28.f66516b));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.OverdraftOffer.NavigationDestination) {
            return new OverdraftOfferFlow(new OverdraftOfferFlowContract$InputData(((CreditApplicationKompotFeatureConfig.OverdraftOffer.NavigationDestination) destination).f66773a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Addon.NavigationDestination) {
            return new CreditAddonFlowController(new CreditAddonFlowContract$InputData(((CreditApplicationKompotFeatureConfig.Addon.NavigationDestination) destination).f66503a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.FamilyCreditCardSettings.NavigationDestination) {
            return new FamilyCreditCardSettingsFlowController(new FamilyCreditCardSettingsFlowContract$InputData(((CreditApplicationKompotFeatureConfig.FamilyCreditCardSettings.NavigationDestination) destination).f66675a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.UserSelection.NavigationDestination) {
            return new UserSelectionFlowController(new UserSelectionFlowContract$InputData(((CreditApplicationKompotFeatureConfig.UserSelection.NavigationDestination) destination).f66877a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.SolicitorSelection.NavigationDestination) {
            return new SolicitorSelectionFlowController(new SolicitorSelectionFlowContract$InputData(((CreditApplicationKompotFeatureConfig.SolicitorSelection.NavigationDestination) destination).f66832a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.SepaDirectDebit.NavigationDestination) {
            return new SepaDirectDebitFlowController(new SepaDirectDebitFlowContract$InputData(((CreditApplicationKompotFeatureConfig.SepaDirectDebit.NavigationDestination) destination).f66829a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.MortgageValuation.NavigationDestination) {
            return new MortgageValuationFlowController(new MortgageValuationFlowContract$InputData(((CreditApplicationKompotFeatureConfig.MortgageValuation.NavigationDestination) destination).f66746a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.Payment.NavigationDestination) {
            return new PaymentFlowController(new PaymentFlowContract$InputData(((CreditApplicationKompotFeatureConfig.Payment.NavigationDestination) destination).f66776a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.DownPaymentSource.NavigationDestination) {
            return new DownPaymentSourceFlowController(new DownPaymentSourceFlowContract$InputData(((CreditApplicationKompotFeatureConfig.DownPaymentSource.NavigationDestination) destination).f66638a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.CreditInsuranceOffer.NavigationDestination) {
            return new CreditInsuranceOfferRootFlow(new CreditInsuranceOfferFlowContract$InputData(((CreditApplicationKompotFeatureConfig.CreditInsuranceOffer.NavigationDestination) destination).f66613a));
        }
        if (destination instanceof CreditApplicationKompotFeatureConfig.LoanSelection.NavigationDestination) {
            return new LoanSelectionFlowController(new LoanSelectionFlowContract$InputData(((CreditApplicationKompotFeatureConfig.LoanSelection.NavigationDestination) destination).f66709a));
        }
        if (!(destination instanceof CreditApplicationKompotFeatureConfig.DropOutForm.NavigationDestination)) {
            return null;
        }
        CreditApplicationKompotFeatureConfig.DropOutForm.NavigationDestination navigationDestination29 = (CreditApplicationKompotFeatureConfig.DropOutForm.NavigationDestination) destination;
        return new DropOutFormFlow(new DropOutFormFlowContract$InputData(navigationDestination29.f66642a, navigationDestination29.f66643b, navigationDestination29.f66644c));
    }
}
