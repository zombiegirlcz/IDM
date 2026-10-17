package xif;

import android.os.Parcelable;
import at.n;
import aw0.n6;
import aw0.o9;
import bvb.g;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.BiometricVerificationMyNumberCardDetailsEditFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.BiometricVerificationMyNumberDateOfBirthEditScreen;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.BiometricVerificationMyNumberDetailsEditScreen;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.BiometricVerificationMyNumberDetailsEditScreenContract$InputData;
import com.revolut.camerakit.client.api.models.AnimationType;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.client.api.models.CaptureMode;
import com.revolut.camerakit.client.api.models.HintMessage;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlow;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.alipay.impl.ui.qr.scanner.AlipayPlusQrScannerFlowContract$Step;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardInstalmentDetailsRedesign;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$Step;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreen;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreen;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.lei.LegalEntityIdScreen;
import com.revolut.feature.crypto.tfr.validation.impl.lei.LegalEntityIdScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreen;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.provide_details.ProvideDetailsScreen;
import com.revolut.feature.crypto.tfr.validation.impl.provide_details.ProvideDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlowContract$Step;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreen;
import com.revolut.feature.junior_transfer.impl.ui.add_money.JuniorAddMoneyFlowContract$Step;
import com.revolut.feature.kyc.impl.hyperverge.govauth.HypervergeDigilockerFlowContract$InputData;
import com.revolut.feature.kyc.impl.hyperverge.govauth.HypervergeDigilockerFlowContract$Step;
import com.revolut.feature.kyc.impl.hyperverge.portal.HypervergePortalScreen;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData;
import com.revolut.feature.pockets.api.ui.add_new.ExtendedAccountId;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.SavingsChallengeSetUpScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.SavingsOptionSelectionContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.SavingsOptionSelectionController;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp.SavingsOptionSelectionScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsRevampScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreenContract$ChallengeInfo;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.SavingsAccountCreationFlow;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.SavingsTermSelectionScreen;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsContract$InputData;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsScreen;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreenContract$Step;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlowContract$FlowState;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlowContract$Step;
import com.revolut.feature.rev_points.buying.impl.ui.screen.info.RevPointsBuyingInfoControllerScreen;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreen;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreenContract$InputData;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.CrsFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.DirectTinFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.FatcaFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$Step;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$ModalStep;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.AdditionalInfoDisclosureScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.AdditionalInfoDisclosureScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.AdditionalInfoDropdownSelectionScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.AdditionalInfoDropdownSelectionScreenContract$InputData;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreen;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreenContract$ModalStep;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.with_result_navigation.WithdrawMoneyWithResultNavigationFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreenContract$NavBarConfig;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.LaunchMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.PlanBenefitsToLoseScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetScreen;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.consent.app.AppConsentFlowContract$Step;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreen;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreenContract$InputData;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreen;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreenContract$InputData;
import com.revolut.sso.impl.ui.passcode.change_flow.ChangePasscodeFlowContract$State;
import com.revolut.sso.impl.ui.passcode.change_flow.ChangePasscodeFlowContract$Step;
import com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlow;
import com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$InputData;
import ft3.d1;
import grl.k9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import mm5.f;
import mm5.g;
import mm5.h;
import mm5.i;
import mm5.j;
import nii.y0;
import nii.z;
import ql4.v;
import vkm.j2;
import we6.l0;
import xka.b0;
import yji.l;
import ys.s;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f306363b;

    public /* synthetic */ k(aim.e eVar, xpl.n nVar) {
        this.f306362a = 18;
        this.f306363b = eVar;
    }

    private final Object a(Object obj2, Object obj3) {
        zu6.a aVar = ((com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.a) this.f306363b).o;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        FreelancerAcquiringPaymentFeesScreenContract$ModalStep step = (FreelancerAcquiringPaymentFeesScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, FreelancerAcquiringPaymentFeesScreenContract$ModalStep.ExchangeFees.f73714a)) {
            aVar.getClass();
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_exchange_rate_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_exchange_rate_subtitle, null, null, 14), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var = k9.Freelancer;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        }
        if (Intrinsics.f(step, FreelancerAcquiringPaymentFeesScreenContract$ModalStep.ProcessingFees.f73715a)) {
            return new FreelancerPaymentProcessingFeesScreen(new FreelancerPaymentProcessingFeesContract$InputData(0));
        }
        if (!Intrinsics.f(step, FreelancerAcquiringPaymentFeesScreenContract$ModalStep.PromotionFees.f73716a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.getClass();
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_promotion_fee_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_promotion_fee_subtitle, null, null, 14), null, null, false, 28);
        aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var2 = k9.Freelancer;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar3, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.kyc.impl.hyperverge.govauth.a aVar = (com.revolut.feature.kyc.impl.hyperverge.govauth.a) this.f306363b;
        yki.l FlowCoordinator = (yki.l) obj2;
        HypervergeDigilockerFlowContract$Step step = (HypervergeDigilockerFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof HypervergeDigilockerFlowContract$Step.Portal)) {
            throw new NoWhenBranchMatchedException();
        }
        HypervergeDigilockerFlowContract$InputData hypervergeDigilockerFlowContract$InputData = aVar.o;
        HypervergePortalScreen hypervergePortalScreen = new HypervergePortalScreen(new yv8.e(hypervergeDigilockerFlowContract$InputData.f77768a, hypervergeDigilockerFlowContract$InputData.f77769b, false, true));
        xng.l block = new xng.l(aVar, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        hypervergePortalScreen.H = block;
        return hypervergePortalScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f306363b
            com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a r0 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a) r0
            com.revolut.kompot.navigable.vc.modal.a r6 = (com.revolut.kompot.navigable.vc.modal.a) r6
            com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreenContract$Step r7 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreenContract$Step) r7
            java.lang.String r1 = "$this$ModalCoordinator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r6 = "step"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            boolean r6 = r7 instanceof com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreenContract$Step.EditLocationDialog
            if (r6 == 0) goto L68
            com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreenContract$Step$EditLocationDialog r7 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreenContract$Step.EditLocationDialog) r7
            com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation r6 = r7.f85695a
            com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.EditTrustedLocationController r7 = new com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.EditTrustedLocationController
            mvc.d r1 = new mvc.d
            cli.y r2 = r0.f85697q
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            xvc.f r2 = (xvc.f) r2
            com.revolut.data.model.Data r2 = r2.f309232a
            java.lang.Object r2 = r2.getContent()
            if (r2 == 0) goto L60
            com.revolut.feature.security_hub.api.models.StreetModeInfo r2 = (com.revolut.feature.security_hub.api.models.StreetModeInfo) r2
            java.util.ArrayList r3 = r2.d
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L4a
            java.util.List r2 = r2.e
            if (r2 == 0) goto L46
            boolean r2 = r2.isEmpty()
            goto L47
        L46:
            r2 = r4
        L47:
            if (r2 == 0) goto L4a
            goto L4b
        L4a:
            r4 = 0
        L4b:
            r1.<init>(r6, r4)
            r7.<init>(r1)
            xng.l r6 = new xng.l
            r1 = 28
            r6.<init>(r0, r1)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r7.H = r6
            return r7
        L60:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Street mode info can't be null"
            r6.<init>(r7)
            throw r6
        L68:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xif.k.c(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v151, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SavingsChallenge savingsChallenge;
        List list;
        Object obj4;
        ViewController reviewProductDetailsScreen;
        int i = this.f306362a;
        final int i2 = 1;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        final int i3 = 0;
        Object obj5 = this.f306363b;
        switch (i) {
            case 0:
                wif.b bVar = (wif.b) obj2;
                List details = (List) obj3;
                Intrinsics.checkNotNullParameter(bVar, "<destruct>");
                Intrinsics.checkNotNullParameter(details, "details");
                ((o) obj5).f306368a.f(bVar.a(), details);
                return Unit.f186387a;
            case 1:
                y params = (y) obj2;
                qjf.b value = (qjf.b) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(value, "value");
                ((z) obj5).f306393b.f(params.a(), value);
                return Unit.f186387a;
            case 2:
                com.revolut.feature.alipay.impl.ui.qr.scanner.a aVar = (com.revolut.feature.alipay.impl.ui.qr.scanner.a) obj5;
                yki.l FlowCoordinator = (yki.l) obj2;
                AlipayPlusQrScannerFlowContract$Step step = (AlipayPlusQrScannerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, AlipayPlusQrScannerFlowContract$Step.Camera.f61075a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CameraKitFlowContract$FlowType.QrCode qrCode = new CameraKitFlowContract$FlowType.QrCode(new MsBarcodeDetectorSettings(bh0.a.QR_CODE));
                CameraKitUiSettings cameraKitUiSettings = new CameraKitUiSettings((Mask) new Mask.Empty(false), (HintMessage) (z ? 1 : 0), (AnimationType) AnimationType.None.f50690a, 2);
                CameraCaptureSettings.Photo.INSTANCE.getClass();
                CameraKitClientSettings cameraKitClientSettings = new CameraKitClientSettings(CameraCaptureSettings.Photo.f50697g, new CaptureMode.AutoCapture(3), false);
                ry.a aVar2 = new ry.a(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, false, false, false, 126);
                k9 value2 = k9.ProductUnspecified;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                AnalyticsContext.INSTANCE.getClass();
                CameraKitFlow cameraKitFlow = new CameraKitFlow(new ly.c((CameraKitFlowContract$FlowType) qrCode, cameraKitUiSettings, cameraKitClientSettings, aVar2, (Set) h0.f322473a, (AnalyticsProduct) new AnalyticsProduct.Retail(value2), AnalyticsContext.Companion.a(null), false, BiometricVerificationFeatures.Companion.a(BiometricVerificationFeatures.INSTANCE), false, 1536), null, 6);
                wma.e block = new wma.e(1, aVar, com.revolut.feature.alipay.impl.ui.qr.scanner.a.class, "onCameraKitResult", "onCameraKitResult(Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$OutputData;)V", 0, 29);
                Intrinsics.checkNotNullParameter(block, "block");
                cameraKitFlow.H = block;
                return cameraKitFlow;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return b0.a((xka.r) obj5);
            case 4:
                final com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) obj5;
                cli.y yVar = bVar2.f101285x;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep step2 = (EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.ContractTypePicker) {
                    EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen = new EsimMobilePlanNumberTransferContractTypePickerScreen(new EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData(((xkj.g) ((j2) yVar.f22677a).getValue()).f306820b, ((EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.ContractTypePicker) step2).f101266a));
                    Function1 block2 = new Function1() { // from class: xkj.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i3) {
                                case 0:
                                    tkj.e result = (tkj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar3 = bVar2;
                                    bVar3.H2(bVar3.f101285x, new xf0.j(result, bVar3, 12));
                                    break;
                                case 1:
                                    ilj.e result2 = (ilj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar4 = bVar2;
                                    bVar4.H2(bVar4.f101285x, new plj.m(result2, 1));
                                    break;
                                case 2:
                                    klj.k result3 = (klj.k) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar5 = bVar2;
                                    bVar5.H2(bVar5.f101285x, new elj.l(result3, 2));
                                    break;
                                default:
                                    glj.e result4 = (glj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar6 = bVar2;
                                    bVar6.H2(bVar6.f101285x, new plj.l(result4, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    esimMobilePlanNumberTransferContractTypePickerScreen.H = block2;
                    return esimMobilePlanNumberTransferContractTypePickerScreen;
                }
                if (step2 instanceof EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.ServiceProviderPicker) {
                    EsimPickerScreen esimPickerScreen = new EsimPickerScreen(new EsimPickerScreenContract$InputData(((EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.ServiceProviderPicker) step2).f101274a, new EsimPickerScreenContract$NavBarConfig(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_number_transfer_confirmation_service_provider_picker_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_number_transfer_confirmation_service_provider_picker_hint, null, null, 14)), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_number_transfer_confirmation_service_provider_picker_search_empty, null, null, 14)));
                    Function1 block3 = new Function1() { // from class: xkj.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i2) {
                                case 0:
                                    tkj.e result = (tkj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar3 = bVar2;
                                    bVar3.H2(bVar3.f101285x, new xf0.j(result, bVar3, 12));
                                    break;
                                case 1:
                                    ilj.e result2 = (ilj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar4 = bVar2;
                                    bVar4.H2(bVar4.f101285x, new plj.m(result2, 1));
                                    break;
                                case 2:
                                    klj.k result3 = (klj.k) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar5 = bVar2;
                                    bVar5.H2(bVar5.f101285x, new elj.l(result3, 2));
                                    break;
                                default:
                                    glj.e result4 = (glj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar6 = bVar2;
                                    bVar6.H2(bVar6.f101285x, new plj.l(result4, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    esimPickerScreen.H = block3;
                    return esimPickerScreen;
                }
                if (step2 instanceof EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker) {
                    EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker portingPreferredSchedulePicker = (EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker) step2;
                    EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen = new EsimMobilePlanNumberTransferPortabilityDatePickerScreen(new EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData(portingPreferredSchedulePicker.f101272b, portingPreferredSchedulePicker.f101273c, ((xkj.g) ((j2) yVar.f22677a).getValue()).d, ((xkj.g) ((j2) yVar.f22677a).getValue()).f306821c, portingPreferredSchedulePicker.d, null));
                    final int i5 = 2;
                    Function1 block4 = new Function1() { // from class: xkj.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    tkj.e result = (tkj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar3 = bVar2;
                                    bVar3.H2(bVar3.f101285x, new xf0.j(result, bVar3, 12));
                                    break;
                                case 1:
                                    ilj.e result2 = (ilj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar4 = bVar2;
                                    bVar4.H2(bVar4.f101285x, new plj.m(result2, 1));
                                    break;
                                case 2:
                                    klj.k result3 = (klj.k) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar5 = bVar2;
                                    bVar5.H2(bVar5.f101285x, new elj.l(result3, 2));
                                    break;
                                default:
                                    glj.e result4 = (glj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar6 = bVar2;
                                    bVar6.H2(bVar6.f101285x, new plj.l(result4, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    esimMobilePlanNumberTransferPortabilityDatePickerScreen.H = block4;
                    return esimMobilePlanNumberTransferPortabilityDatePickerScreen;
                }
                if (step2 instanceof EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PhoneNumberTypePicker) {
                    EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PhoneNumberTypePicker phoneNumberTypePicker = (EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PhoneNumberTypePicker) step2;
                    EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen esimMobilePlanNumberTransferPhoneNumberTypePickerScreen = new EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen(new EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData(phoneNumberTypePicker.f101267a, phoneNumberTypePicker.f101268b));
                    final int i6 = 3;
                    Function1 block5 = new Function1() { // from class: xkj.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    tkj.e result = (tkj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar3 = bVar2;
                                    bVar3.H2(bVar3.f101285x, new xf0.j(result, bVar3, 12));
                                    break;
                                case 1:
                                    ilj.e result2 = (ilj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar4 = bVar2;
                                    bVar4.H2(bVar4.f101285x, new plj.m(result2, 1));
                                    break;
                                case 2:
                                    klj.k result3 = (klj.k) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar5 = bVar2;
                                    bVar5.H2(bVar5.f101285x, new elj.l(result3, 2));
                                    break;
                                default:
                                    glj.e result4 = (glj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar6 = bVar2;
                                    bVar6.H2(bVar6.f101285x, new plj.l(result4, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.H = block5;
                    return esimMobilePlanNumberTransferPhoneNumberTypePickerScreen;
                }
                if (step2 instanceof EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus) {
                    EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus trackPortabilityStatus = (EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus) step2;
                    return new EsimCompleteNumberTransferBottomSheetScreen(new EsimCompleteNumberTransferBottomSheetScreenContract$InputData(trackPortabilityStatus.f101275a, trackPortabilityStatus.f101277c, trackPortabilityStatus.f101276b, null, null, bVar2.o.f, 24));
                }
                if (!(step2 instanceof EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PortabilityForm)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PortabilityForm portabilityForm = (EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PortabilityForm) step2;
                String str = portabilityForm.f101269a;
                BackendFlowInput.Source.Remote remote = new BackendFlowInput.Source.Remote(str, portabilityForm.f101270b);
                BackendFlowApiEndpoints.INSTANCE.getClass();
                return bVar2.e1(new n90.a(new BackendFlowInput(remote, null, null, BackendFlowNavigationIcon.Cross.f63286a, false, BackendFlowApiEndpoints.Companion.a(str), 54)));
            case 5:
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PlanBenefitsToLoseScreenContract$ModalStep step3 = (PlanBenefitsToLoseScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof PlanBenefitsToLoseScreenContract$ModalStep.PlanPagerBottomSheet) {
                    return new PlanPageBottomSheetScreen(new PlanPageBottomSheetContract$InputData(((PlanBenefitsToLoseScreenContract$ModalStep.PlanPagerBottomSheet) step3).f103470a, aVar3.f103475t.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c), null));
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) obj5;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                SavingsOnboardingFlowContract$Step step4 = (SavingsOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof SavingsOnboardingFlowContract$Step.OptionSelection) {
                    if (eVar.S2()) {
                        SavingsOptionSelectionScreen savingsOptionSelectionScreen = new SavingsOptionSelectionScreen();
                        xlb.k block6 = new xlb.k(eVar, 4);
                        Intrinsics.checkNotNullParameter(block6, "block");
                        savingsOptionSelectionScreen.H = block6;
                        return savingsOptionSelectionScreen;
                    }
                    SavingsOptionSelectionController savingsOptionSelectionController = new SavingsOptionSelectionController(new SavingsOptionSelectionContract$InputData(null));
                    xlb.k block7 = new xlb.k(eVar, 5);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    savingsOptionSelectionController.H = block7;
                    return savingsOptionSelectionController;
                }
                if (step4 instanceof SavingsOnboardingFlowContract$Step.ProductDetailsReview) {
                    if (eVar.S2()) {
                        SavingsProductData savingsProductData = ((SavingsOnboardingFlowContract$Step.ProductDetailsReview) step4).f83259a;
                        reviewProductDetailsScreen = new ReviewProductDetailsRevampScreen(new ReviewProductDetailsScreenContract$InputData(savingsProductData, eVar.O2(savingsProductData), true, null));
                    } else {
                        reviewProductDetailsScreen = new ReviewProductDetailsScreen(new ReviewProductDetailsScreenContract$InputData(((SavingsOnboardingFlowContract$Step.ProductDetailsReview) step4).f83259a, f0.f322471a, false, null));
                    }
                    xlb.o block8 = new xlb.o(1, eVar, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.class, "handleReviewDetailsResult", "handleReviewDetailsResult(Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/review_product/ReviewProductDetailsScreenContract$Output;)V", 0, 0);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    reviewProductDetailsScreen.H = block8;
                    return reviewProductDetailsScreen;
                }
                if (step4 instanceof SavingsOnboardingFlowContract$Step.SelectCurrency) {
                    SavingsCurrencySelectionScreen savingsCurrencySelectionScreen = new SavingsCurrencySelectionScreen(new SavingsCurrencySelectionContract$InputData(((SavingsOnboardingFlowContract$Step.SelectCurrency) step4).f83261a));
                    xlb.o block9 = new xlb.o(1, eVar, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.class, "handleSelectCurrencyResult", "handleSelectCurrencyResult(Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_currency_selection/SavingsCurrencySelectionContract$Output;)V", 0, 1);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    savingsCurrencySelectionScreen.H = block9;
                    return savingsCurrencySelectionScreen;
                }
                if (step4 instanceof SavingsOnboardingFlowContract$Step.SelectTerm) {
                    SavingsTermSelectionScreen savingsTermSelectionScreen = new SavingsTermSelectionScreen();
                    xlb.o block10 = new xlb.o(1, eVar, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.class, "handleSelectTermResult", "handleSelectTermResult(Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_term_selection/SavingsTermSelectionContract$Output;)V", 0, 2);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    savingsTermSelectionScreen.H = block10;
                    return savingsTermSelectionScreen;
                }
                if (step4 instanceof SavingsOnboardingFlowContract$Step.Upsell) {
                    SavingsOnboardingFlowContract$Step.Upsell upsell = (SavingsOnboardingFlowContract$Step.Upsell) step4;
                    ncd.g gVar = upsell.f83265b;
                    if (upsell.f83264a) {
                        SavingsProductSelectionScreen savingsProductSelectionScreen = new SavingsProductSelectionScreen(new SavingsProductSelectionContract$InputData(gVar));
                        xlb.o block11 = new xlb.o(1, eVar, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.class, "handleUpsellResult", "handleUpsellResult(Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_product_selection/SavingsProductSelectionContract$Output;)V", 0, 3);
                        Intrinsics.checkNotNullParameter(block11, "block");
                        savingsProductSelectionScreen.H = block11;
                        obj4 = savingsProductSelectionScreen;
                    } else {
                        PickYourRateScreen pickYourRateScreen = new PickYourRateScreen(new PickYourRateScreenContract$InputData(gVar));
                        xlb.o block12 = new xlb.o(1, eVar, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.class, "handleUpsellResult", "handleUpsellResult(Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/pick_your_rate/PickYourRateScreenContract$Output;)V", 0, 4);
                        Intrinsics.checkNotNullParameter(block12, "block");
                        pickYourRateScreen.H = block12;
                        obj4 = pickYourRateScreen;
                    }
                } else {
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.Article) {
                        SavingsOnboardingFlowContract$Step.Article article = (SavingsOnboardingFlowContract$Step.Article) step4;
                        ViewController viewControllerE1 = eVar.e1(new ProductArticleDescriptor(article.getF83245b(), article.getF83246c() ? SkipShownArticleBehaviour.AlwaysShow.f81285a : SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, !(eVar.o.f83238b instanceof SavingAccountType.Junior) && article.getD() == null, null, null, false, 56));
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        viewControllerE1.l2(new qg7.k(eVar, 21, ref$ObjectRef, article));
                        b79.i block13 = new b79.i(ref$ObjectRef, 16);
                        Intrinsics.checkNotNullParameter(block13, "block");
                        viewControllerE1.H = block13;
                        return viewControllerE1;
                    }
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.Documents) {
                        SavingsOnboardingFlowContract$Step.Documents documents = (SavingsOnboardingFlowContract$Step.Documents) step4;
                        return new ProductDocumentsScreen(new ProductDocumentsContract$InputData(documents.f83253a.f86683a.f86617a, documents.f83254b, 4));
                    }
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.ProtectionAndSafety) {
                        return eVar.e1(new ljb.c(((SavingsOnboardingFlowContract$Step.ProtectionAndSafety) step4).f83260a));
                    }
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.FundInfo) {
                        return eVar.e1(new ljb.a(((SavingsOnboardingFlowContract$Step.FundInfo) step4).f83255a));
                    }
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.InterestAndFees) {
                        return eVar.e1(new ljb.b(((SavingsOnboardingFlowContract$Step.InterestAndFees) step4).f83256a));
                    }
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.AccountCreation) {
                        return new SavingsAccountCreationFlow(((SavingsOnboardingFlowContract$Step.AccountCreation) step4).f83240a);
                    }
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.TieredLimits) {
                        return eVar.e1(new mlb.a(((SavingsOnboardingFlowContract$Step.TieredLimits) step4).f83263a));
                    }
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.ChallengeSetup) {
                        SavingsChallengeSetUpScreen savingsChallengeSetUpScreen = new SavingsChallengeSetUpScreen();
                        xlb.o block14 = new xlb.o(1, eVar, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.class, "handleChallengeSetupResult", "handleChallengeSetupResult(Lcom/revolut/feature/retail/savings/impl/challenge/presentation/onboarding/setup/SavingsChallengeSetUpScreenContract$Output;)V", 0, 5);
                        Intrinsics.checkNotNullParameter(block14, "block");
                        savingsChallengeSetUpScreen.H = block14;
                        return savingsChallengeSetUpScreen;
                    }
                    if (step4 instanceof SavingsOnboardingFlowContract$Step.ChallengeReview) {
                        SavingsOnboardingFlowContract$Step.ChallengeReview challengeReview = (SavingsOnboardingFlowContract$Step.ChallengeReview) step4;
                        SavingsProductData savingsProductData2 = challengeReview.f83249a;
                        ArrayList arrayListO2 = eVar.O2(savingsProductData2);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : arrayListO2) {
                            SavingsProductData savingsProductData3 = (SavingsProductData) obj6;
                            SavingsChallengeOnboarding savingsChallengeOnboarding = ((xlb.d) ((j2) eVar.B.f22677a).getValue()).f306981c;
                            if (savingsChallengeOnboarding != null && (savingsChallenge = savingsChallengeOnboarding.f83099a) != null && (list = savingsChallenge.f83088b) != null && list.contains(savingsProductData3.f86683a.f86617a)) {
                                arrayList.add(obj6);
                            }
                        }
                        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = new ReviewProductDetailsRevampScreen(new ReviewProductDetailsScreenContract$InputData(savingsProductData2, arrayList, true, new ReviewProductDetailsScreenContract$ChallengeInfo(challengeReview.f83250b, challengeReview.f83251c)));
                        xlb.o block15 = new xlb.o(1, eVar, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.class, "handleReviewDetailsResult", "handleReviewDetailsResult(Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/review_product/ReviewProductDetailsScreenContract$Output;)V", 0, 6);
                        Intrinsics.checkNotNullParameter(block15, "block");
                        reviewProductDetailsRevampScreen.H = block15;
                        return reviewProductDetailsRevampScreen;
                    }
                    if (!(step4 instanceof SavingsOnboardingFlowContract$Step.PendingJointAccount)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActionsBottomSheetController actionsBottomSheetControllerA = eVar.A.a(h38.d.JOINT_SAVINGS);
                    actionsBottomSheetControllerA.l2(new dld.c(eVar, LazyFlowCoordinator, 13));
                    obj4 = actionsBottomSheetControllerA;
                }
                return obj4;
            case 7:
                com.revolut.sso.impl.ui.consent.app.b bVar3 = (com.revolut.sso.impl.ui.consent.app.b) obj5;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                AppConsentFlowContract$Step step5 = (AppConsentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof AppConsentFlowContract$Step.Confirmation) {
                    ConsentChallenge.App app = ((AppConsentFlowContract$Step.Confirmation) step5).f106445a;
                    ConsentScreen consentScreen = new ConsentScreen(new ConsentScreenContract$InputData(app));
                    xf0.j block16 = new xf0.j(app, bVar3, 15);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    consentScreen.H = block16;
                    return consentScreen;
                }
                if (!(step5 instanceof AppConsentFlowContract$Step.DelegatedAuthentication)) {
                    if (!(step5 instanceof AppConsentFlowContract$Step.UnexpectedLocationCheck)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ConsentChallenge.App app2 = ((AppConsentFlowContract$Step.UnexpectedLocationCheck) step5).f106447a;
                    UnexpectedLocationScreen unexpectedLocationScreen = new UnexpectedLocationScreen(new UnexpectedLocationScreenContract$InputData(app2, null));
                    xf0.j block17 = new xf0.j(bVar3, app2, 16);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    unexpectedLocationScreen.H = block17;
                    return unexpectedLocationScreen;
                }
                String str2 = ((AppConsentFlowContract$Step.DelegatedAuthentication) step5).f106446a;
                iql.a aVar4 = bVar3.f106453t;
                AuthenticationFlowContract$InputData.OperationBoundAuthentication input = new AuthenticationFlowContract$InputData.OperationBoundAuthentication(cjl.s.GLOBAL, f0.f322471a, null, null, str2, null, AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin.Delegated.f106230a);
                xg6.k codeChallengeGenerator = new xg6.k(bVar3, 28);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
                AuthenticationFlow authenticationFlow = new AuthenticationFlow(input, codeChallengeGenerator, new UICustomization(z4 ? 1 : 0, z3 ? 1 : 0, 31));
                xll.c block18 = new xll.c(bVar3, i3);
                Intrinsics.checkNotNullParameter(block18, "block");
                authenticationFlow.H = block18;
                return authenticationFlow;
            case 8:
                final xm5.d dVar = (xm5.d) obj5;
                TfrValidationFlowContract$InputData tfrValidationFlowContract$InputData = dVar.o;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                TfrValidationFlowContract$Step step6 = (TfrValidationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof TfrValidationFlowContract$Step.ActionRequired) {
                    ActionRequiredScreen actionRequiredScreen = new ActionRequiredScreen(new ActionRequiredScreenContract$InputData(tfrValidationFlowContract$InputData.f71015a));
                    Function1 block19 = new Function1() { // from class: xm5.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            FlowStep flowStep;
                            switch (i3) {
                                case 0:
                                    j result = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, g.f207148a);
                                    d dVar2 = dVar;
                                    if (zF) {
                                        l.a1(dVar2, dVar2.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.crypto.tfr.validation.api.R$string.crypto_tfr_validation_error_popup_title, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5)), null, null, new x0f.g(dVar2, null, 27), 3);
                                    } else if (Intrinsics.f(result, h.f207149a)) {
                                        if (dVar2.o.d != null) {
                                            dVar2.C1(u0.b(new FinishCommand(-1, null, null, 6)));
                                        } else {
                                            dVar2.C2(km5.d.f185720a);
                                        }
                                    } else if (Intrinsics.f(result, f.f207147a)) {
                                        dVar2.B2();
                                    } else if (!Intrinsics.f(result, i.f207150a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    cn5.h result2 = (cn5.h) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF2 = Intrinsics.f(result2, cn5.f.f25352a);
                                    d dVar3 = dVar;
                                    if (zF2) {
                                        dVar3.B2();
                                    } else {
                                        if (!Intrinsics.f(result2, cn5.g.f25353a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yki.a aVar5 = dVar3.f307093p;
                                        int i21 = c.f307092a[dVar3.o.f71016b.ordinal()];
                                        if (i21 == 1) {
                                            throw new IllegalStateException("MESH tfr validation should no lead to ProvideDetailsScreen!");
                                        }
                                        if (i21 == 2) {
                                            flowStep = TfrValidationFlowContract$Step.DateOfBirth.f71019a;
                                        } else {
                                            if (i21 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            flowStep = TfrValidationFlowContract$Step.LegalEntityId.f71020a;
                                        }
                                        oki.h.t2(dVar3, aVar5, flowStep, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    bn5.f it8 = (bn5.f) obj7;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 instanceof bn5.f) {
                                        dVar.I2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    ym5.f it9 = (ym5.f) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof ym5.f) {
                                        dVar.I2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    actionRequiredScreen.H = block19;
                    return actionRequiredScreen;
                }
                if (step6 instanceof TfrValidationFlowContract$Step.ProvideMoreDetails) {
                    String str3 = tfrValidationFlowContract$InputData.f71017c;
                    ProvideDetailsScreen provideDetailsScreen = new ProvideDetailsScreen(new ProvideDetailsScreenContract$InputData(str3 != null ? str3 : ""));
                    Function1 block20 = new Function1() { // from class: xm5.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            FlowStep flowStep;
                            switch (i2) {
                                case 0:
                                    j result = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, g.f207148a);
                                    d dVar2 = dVar;
                                    if (zF) {
                                        l.a1(dVar2, dVar2.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.crypto.tfr.validation.api.R$string.crypto_tfr_validation_error_popup_title, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5)), null, null, new x0f.g(dVar2, null, 27), 3);
                                    } else if (Intrinsics.f(result, h.f207149a)) {
                                        if (dVar2.o.d != null) {
                                            dVar2.C1(u0.b(new FinishCommand(-1, null, null, 6)));
                                        } else {
                                            dVar2.C2(km5.d.f185720a);
                                        }
                                    } else if (Intrinsics.f(result, f.f207147a)) {
                                        dVar2.B2();
                                    } else if (!Intrinsics.f(result, i.f207150a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    cn5.h result2 = (cn5.h) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF2 = Intrinsics.f(result2, cn5.f.f25352a);
                                    d dVar3 = dVar;
                                    if (zF2) {
                                        dVar3.B2();
                                    } else {
                                        if (!Intrinsics.f(result2, cn5.g.f25353a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yki.a aVar5 = dVar3.f307093p;
                                        int i21 = c.f307092a[dVar3.o.f71016b.ordinal()];
                                        if (i21 == 1) {
                                            throw new IllegalStateException("MESH tfr validation should no lead to ProvideDetailsScreen!");
                                        }
                                        if (i21 == 2) {
                                            flowStep = TfrValidationFlowContract$Step.DateOfBirth.f71019a;
                                        } else {
                                            if (i21 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            flowStep = TfrValidationFlowContract$Step.LegalEntityId.f71020a;
                                        }
                                        oki.h.t2(dVar3, aVar5, flowStep, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    bn5.f it8 = (bn5.f) obj7;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 instanceof bn5.f) {
                                        dVar.I2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    ym5.f it9 = (ym5.f) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof ym5.f) {
                                        dVar.I2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    provideDetailsScreen.H = block20;
                    return provideDetailsScreen;
                }
                if (step6 instanceof TfrValidationFlowContract$Step.DateOfBirth) {
                    DateOfBirthScreen dateOfBirthScreen = new DateOfBirthScreen(new DateOfBirthScreenContract$InputData(null));
                    xf0.j block21 = new xf0.j(dVar, FlowCoordinator3, 17);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    dateOfBirthScreen.H = block21;
                    return dateOfBirthScreen;
                }
                if (step6 instanceof TfrValidationFlowContract$Step.PlaceOfBirth) {
                    PlaceOfBirthScreen placeOfBirthScreen = new PlaceOfBirthScreen(new PlaceOfBirthScreenContract$InputData(tfrValidationFlowContract$InputData.f71015a, ((TfrValidationFlowContract$Step.PlaceOfBirth) step6).f71021a));
                    final int i21 = 2;
                    Function1 block22 = new Function1() { // from class: xm5.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            FlowStep flowStep;
                            switch (i21) {
                                case 0:
                                    j result = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, g.f207148a);
                                    d dVar2 = dVar;
                                    if (zF) {
                                        l.a1(dVar2, dVar2.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.crypto.tfr.validation.api.R$string.crypto_tfr_validation_error_popup_title, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5)), null, null, new x0f.g(dVar2, null, 27), 3);
                                    } else if (Intrinsics.f(result, h.f207149a)) {
                                        if (dVar2.o.d != null) {
                                            dVar2.C1(u0.b(new FinishCommand(-1, null, null, 6)));
                                        } else {
                                            dVar2.C2(km5.d.f185720a);
                                        }
                                    } else if (Intrinsics.f(result, f.f207147a)) {
                                        dVar2.B2();
                                    } else if (!Intrinsics.f(result, i.f207150a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    cn5.h result2 = (cn5.h) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF2 = Intrinsics.f(result2, cn5.f.f25352a);
                                    d dVar3 = dVar;
                                    if (zF2) {
                                        dVar3.B2();
                                    } else {
                                        if (!Intrinsics.f(result2, cn5.g.f25353a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yki.a aVar5 = dVar3.f307093p;
                                        int i212 = c.f307092a[dVar3.o.f71016b.ordinal()];
                                        if (i212 == 1) {
                                            throw new IllegalStateException("MESH tfr validation should no lead to ProvideDetailsScreen!");
                                        }
                                        if (i212 == 2) {
                                            flowStep = TfrValidationFlowContract$Step.DateOfBirth.f71019a;
                                        } else {
                                            if (i212 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            flowStep = TfrValidationFlowContract$Step.LegalEntityId.f71020a;
                                        }
                                        oki.h.t2(dVar3, aVar5, flowStep, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    bn5.f it8 = (bn5.f) obj7;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 instanceof bn5.f) {
                                        dVar.I2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    ym5.f it9 = (ym5.f) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof ym5.f) {
                                        dVar.I2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    placeOfBirthScreen.H = block22;
                    return placeOfBirthScreen;
                }
                if (!(step6 instanceof TfrValidationFlowContract$Step.LegalEntityId)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = tfrValidationFlowContract$InputData.f71015a;
                String str5 = tfrValidationFlowContract$InputData.f71017c;
                LegalEntityIdScreen legalEntityIdScreen = new LegalEntityIdScreen(new LegalEntityIdScreenContract$InputData(str4, str5 != null ? str5 : ""));
                final int i22 = 3;
                Function1 block23 = new Function1() { // from class: xm5.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        FlowStep flowStep;
                        switch (i22) {
                            case 0:
                                j result = (j) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF = Intrinsics.f(result, g.f207148a);
                                d dVar2 = dVar;
                                if (zF) {
                                    l.a1(dVar2, dVar2.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.crypto.tfr.validation.api.R$string.crypto_tfr_validation_error_popup_title, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5)), null, null, new x0f.g(dVar2, null, 27), 3);
                                } else if (Intrinsics.f(result, h.f207149a)) {
                                    if (dVar2.o.d != null) {
                                        dVar2.C1(u0.b(new FinishCommand(-1, null, null, 6)));
                                    } else {
                                        dVar2.C2(km5.d.f185720a);
                                    }
                                } else if (Intrinsics.f(result, f.f207147a)) {
                                    dVar2.B2();
                                } else if (!Intrinsics.f(result, i.f207150a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 1:
                                cn5.h result2 = (cn5.h) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean zF2 = Intrinsics.f(result2, cn5.f.f25352a);
                                d dVar3 = dVar;
                                if (zF2) {
                                    dVar3.B2();
                                } else {
                                    if (!Intrinsics.f(result2, cn5.g.f25353a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    yki.a aVar5 = dVar3.f307093p;
                                    int i212 = c.f307092a[dVar3.o.f71016b.ordinal()];
                                    if (i212 == 1) {
                                        throw new IllegalStateException("MESH tfr validation should no lead to ProvideDetailsScreen!");
                                    }
                                    if (i212 == 2) {
                                        flowStep = TfrValidationFlowContract$Step.DateOfBirth.f71019a;
                                    } else {
                                        if (i212 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        flowStep = TfrValidationFlowContract$Step.LegalEntityId.f71020a;
                                    }
                                    oki.h.t2(dVar3, aVar5, flowStep, true, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 2:
                                bn5.f it8 = (bn5.f) obj7;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                if (it8 instanceof bn5.f) {
                                    dVar.I2();
                                }
                                return Unit.f186387a;
                            default:
                                ym5.f it9 = (ym5.f) obj7;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                if (it9 instanceof ym5.f) {
                                    dVar.I2();
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block23, "block");
                legalEntityIdScreen.H = block23;
                return legalEntityIdScreen;
            case 9:
                com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.a aVar5 = (com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.a) obj5;
                JapanEasyBankTransferFlowContract$Step step7 = (JapanEasyBankTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof JapanEasyBankTransferFlowContract$Step.Consent) {
                    com.revolut.feature.external_accounts.impl.ui.link.screens.consent.ConsentScreen consentScreen2 = new com.revolut.feature.external_accounts.impl.ui.link.screens.consent.ConsentScreen(new tn6.g(new ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_consent_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_consent_subtitle, null, null, 14), zhm.v.k(new ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration.ConsentItem(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_consent_account_details_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_consent_account_details_no_budget_info_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration.ConsentItem(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_consent_information_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_consent_information_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_lock_closed, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_consent_footer, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_consent_title, null, null, 14)), ((xg6.j) aVar5.f72957p).a(((JapanEasyBankTransferFlowContract$Step.Consent) step7).f72953a.getF72267a())));
                    xf0.j block24 = new xf0.j(aVar5, step7, 18);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    consentScreen2.H = block24;
                    return consentScreen2;
                }
                if (!(step7 instanceof JapanEasyBankTransferFlowContract$Step.JapanEasyBankAuthorization)) {
                    throw new NoWhenBranchMatchedException();
                }
                JapanEasyBankTransferFlowContract$Step.JapanEasyBankAuthorization japanEasyBankAuthorization = (JapanEasyBankTransferFlowContract$Step.JapanEasyBankAuthorization) step7;
                ViewController viewControllerE12 = aVar5.e1(new l0(japanEasyBankAuthorization.f72954a, japanEasyBankAuthorization.f72955b, japanEasyBankAuthorization.f72956c));
                xe7.a block25 = new xe7.a(aVar5, 16);
                Intrinsics.checkNotNullParameter(block25, "block");
                viewControllerE12.H = block25;
                return viewControllerE12;
            case 10:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new xmd.v((xmd.g) obj5, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), AnimatedBackgroundType.Base.ACCENT);
            case 11:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = IncomeScreen.V;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj7 = data.f51981p;
                Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreenContract.AmountParcel");
                xng.g gVar2 = (xng.g) obj7;
                return new zp0.d(field.getEditText(), gVar2.f307488a, new u80.d(gVar2.f307489b), null, new usc.a((IncomeScreen) obj5, 15), false, false, 0, false, null, 1960);
            case 12:
                com.revolut.feature.user_declarations.shared.flows.income.screen.b bVar4 = (com.revolut.feature.user_declarations.shared.flows.income.screen.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                IncomeScreenContract$ModalStep step8 = (IncomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!Intrinsics.f(step8, IncomeScreenContract$ModalStep.CurrencyPicker.f94630a)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.income_select_currency, null, null, 14);
                xi0.b bVar5 = (xi0.b) ((xng.h) ((j2) bVar4.f94636t.f22677a).getValue()).f.getContent();
                PickerController pickerController = new PickerController(new s7a.x(textLocalisedClause, null, null, null, false, null, null, null, null, false, null, bVar5 != null ? bVar5.f306286a : null, null, null, false, null, null, null, null, null, 2147352574), bVar4.f94634r);
                xe7.a block26 = new xe7.a(bVar4, 29);
                Intrinsics.checkNotNullParameter(block26, "block");
                pickerController.H = block26;
                return pickerController;
            case 13:
                xng.h hVar = (xng.h) obj5;
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new xng.k(hVar.f307490a, hVar.f307491b, hVar.f307492c, hVar.d, hVar.e, false, false, (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)));
            case 14:
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar6 = (com.revolut.sso.impl.ui.passcode.change_flow.a) obj5;
                ChangePasscodeFlowContract$Step step9 = (ChangePasscodeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!Intrinsics.f(step9, ChangePasscodeFlowContract$Step.CreateNewPasscode.f106593a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreatePasscodeFlow createPasscodeFlow = new CreatePasscodeFlow(new CreatePasscodeFlowContract$InputData(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_passcode_change_new_passcode, null, null, 14), new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_passcode_change_confirm_passcode, null, null, 14), ((ChangePasscodeFlowContract$State) ((j2) aVar6.f106600x.f22677a).getValue()).f106592b));
                xng.l block27 = new xng.l(aVar6, 2);
                Intrinsics.checkNotNullParameter(block27, "block");
                createPasscodeFlow.H = block27;
                return createPasscodeFlow;
            case 15:
                com.revolut.feature.retail.savings.impl.ui.details.a aVar7 = (com.revolut.feature.retail.savings.impl.ui.details.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SavingsDetailsScreenContract$Step step10 = (SavingsDetailsScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof SavingsDetailsScreenContract$Step.InterestRateExplanation) {
                    return aVar7.e1(new mlb.a(((SavingsDetailsScreenContract$Step.InterestRateExplanation) step10).f83366a));
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                CenteredAmountDelegate.Model data2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = ChallengeEditRewardScreen.R;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText = field2.getEditText();
                Object obj8 = data2.f51981p;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj8, (u80.d) ((ChallengeEditRewardScreen) obj5).K.getValue(), null, null, false, false, 0, false, null, 1944);
            case 17:
                com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar8 = (com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) obj5;
                TaxResidencyFlowContract$Step step11 = (TaxResidencyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof TaxResidencyFlowContract$Step.Fatca) {
                    TaxResidencyFlowContract$Step.Fatca fatca = (TaxResidencyFlowContract$Step.Fatca) step11;
                    FatcaFlow fatcaFlow = new FatcaFlow(fatca.f90300a);
                    xf0.j block28 = new xf0.j(aVar8, fatca, 29);
                    Intrinsics.checkNotNullParameter(block28, "block");
                    fatcaFlow.H = block28;
                    return fatcaFlow;
                }
                if (step11 instanceof TaxResidencyFlowContract$Step.Crs) {
                    TaxResidencyFlowContract$Step.Crs crs = (TaxResidencyFlowContract$Step.Crs) step11;
                    CrsFlow crsFlow = new CrsFlow(crs.f90295a);
                    xpe.c block29 = new xpe.c(aVar8, crs, i2);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    crsFlow.H = block29;
                    return crsFlow;
                }
                if (step11 instanceof TaxResidencyFlowContract$Step.DirectTin) {
                    TaxResidencyFlowContract$Step.DirectTin directTin = (TaxResidencyFlowContract$Step.DirectTin) step11;
                    DirectTinFlow directTinFlow = new DirectTinFlow(directTin.f90298a);
                    xpe.c block30 = new xpe.c(aVar8, directTin, i3);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    directTinFlow.H = block30;
                    return directTinFlow;
                }
                if (!(step11 instanceof TaxResidencyFlowContract$Step.Declaration)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxResidencyDeclarationFlow taxResidencyDeclarationFlow = new TaxResidencyDeclarationFlow(((TaxResidencyFlowContract$Step.Declaration) step11).f90297a);
                xng.l block31 = new xng.l(aVar8, 9);
                Intrinsics.checkNotNullParameter(block31, "block");
                taxResidencyDeclarationFlow.H = block31;
                return taxResidencyDeclarationFlow;
            case 18:
                aim.e eVar2 = (aim.e) obj5;
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                eVar2.add(xpl.n.d());
                return Boolean.valueOf(eVar2.addAll((Collection) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null))));
            case 19:
                com.revolut.feature.junior_transfer.impl.ui.add_money.c cVar = (com.revolut.feature.junior_transfer.impl.ui.add_money.c) obj5;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                JuniorAddMoneyFlowContract$Step step12 = (JuniorAddMoneyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof JuniorAddMoneyFlowContract$Step.AddMoney) {
                    ViewController viewControllerE13 = cVar.e1(new s8k.e(PeerToPeerTransferInputData.Companion.a(PeerToPeerTransferInputData.INSTANCE, new PeerToPeerRecipient(((JuniorAddMoneyFlowContract$Step.AddMoney) step12).f77427a), hrf.f.OUTGOING, TransferFlowType.Default.f92257b, cVar.o.f77426b, new TransferScheduleData(0L, (jli.c) null, 7), m1l.a.SCHEDULE_ENABLED, false, null, null, null, null, new LaunchMode.AsController(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.SUCCESS_DIALOG), null, null, null, 126912)));
                    xpe.c block32 = new xpe.c(cVar, LazyFlowCoordinator2, 5);
                    Intrinsics.checkNotNullParameter(block32, "block");
                    viewControllerE13.H = block32;
                    return viewControllerE13;
                }
                if (!Intrinsics.f(step12, JuniorAddMoneyFlowContract$Step.AddNewPocket.f77428a)) {
                    throw new NoWhenBranchMatchedException();
                }
                io3.l pocketType = io3.l.CURRENT;
                Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                AccountId.Personal accountId = AccountId.Personal.f51414a;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                ExtendedAccountId.INSTANCE.getClass();
                ViewController viewControllerE14 = cVar.e1(new jda.b(new AddNewPocketContract$InputData(pocketType, ExtendedAccountId.Companion.a(accountId))));
                dph.c block33 = new dph.c(cVar, LazyFlowCoordinator2, 26);
                Intrinsics.checkNotNullParameter(block33, "block");
                viewControllerE14.H = block33;
                return viewControllerE14;
            case 20:
                xqg.e eVar3 = (xqg.e) obj5;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                WithdrawMoneyWithResultNavigationFlowContract$Step it8 = (WithdrawMoneyWithResultNavigationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                MoneyBoxAmountInputScreenContract$InputData.Companion companion = MoneyBoxAmountInputScreenContract$InputData.INSTANCE;
                pcd.s sVar = eVar3.o.f94788a;
                String str6 = sVar.f234881a;
                String currency = sVar.getCurrency();
                k9 value3 = k9.Savings;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value3, "value");
                AnalyticsProduct.Retail retail = new AnalyticsProduct.Retail(value3);
                companion.getClass();
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = new MoneyBoxAmountInputScreen(MoneyBoxAmountInputScreenContract$InputData.Companion.b(str6, currency, retail));
                xpe.c cVar2 = new xpe.c(eVar3, FlowCoordinator4, 6);
                Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
                moneyBoxAmountInputScreen.H = cVar2;
                return moneyBoxAmountInputScreen;
            case 21:
                d1 classification = (d1) obj2;
                Boolean bool = (Boolean) obj3;
                bool.getClass();
                Intrinsics.checkNotNullParameter(classification, "classification");
                ((xr3.w) obj5).f308244b.f(xr3.w.a(classification), bool);
                return Unit.f186387a;
            case 22:
                final com.revolut.feature.credit.card.impl.ui.instalment.details.flow.b bVar6 = (com.revolut.feature.credit.card.impl.ui.instalment.details.flow.b) obj5;
                gte.a aVar9 = bVar6.f69361p;
                CreditCardInstalmentDetailsFlowContract$InputData creditCardInstalmentDetailsFlowContract$InputData = bVar6.o;
                yki.l FlowCoordinator5 = (yki.l) obj2;
                CreditCardInstalmentDetailsFlowContract$Step step13 = (CreditCardInstalmentDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof CreditCardInstalmentDetailsFlowContract$Step.PostPurchase) {
                    return new CreditCardPostPurchaseDetailsFlow(new CreditCardPostPurchaseDetailsFlowContract$InputData(creditCardInstalmentDetailsFlowContract$InputData.getF69353a(), creditCardInstalmentDetailsFlowContract$InputData.getF69354b()));
                }
                if (step13 instanceof CreditCardInstalmentDetailsFlowContract$Step.PrePurchase) {
                    CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen = new CreditCardPrePurchaseDetailsScreen(new CreditCardPrePurchaseDetailsScreenContract$InputData(creditCardInstalmentDetailsFlowContract$InputData.getF69353a(), creditCardInstalmentDetailsFlowContract$InputData.getF69354b(), ((jte.d) aVar9).c(CreditCardApi$Toggles$CreditCardInstalmentDetailsRedesign.f68684c)));
                    Function1 block34 = new Function1() { // from class: xr4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i3) {
                                case 0:
                                    bs4.h result = (bs4.h) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    v vVar = v.PRE_PURCHASE;
                                    List listC = u.c(result.f18048a);
                                    com.revolut.feature.credit.card.impl.ui.instalment.details.flow.b bVar7 = bVar6;
                                    bVar7.n2(new com.revolut.feature.credit.card.impl.ui.instalment.details.flow.a(vVar, listC, bVar7, null), new whi.b(6));
                                    return Unit.f186387a;
                                default:
                                    ew4.i result2 = (ew4.i) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    v vVar2 = v.STATEMENT_DEFERRAL;
                                    ArrayList arrayList2 = result2.f130077a;
                                    com.revolut.feature.credit.card.impl.ui.instalment.details.flow.b bVar8 = bVar6;
                                    bVar8.n2(new com.revolut.feature.credit.card.impl.ui.instalment.details.flow.a(vVar2, arrayList2, bVar8, null), new whi.b(6));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block34, "block");
                    creditCardPrePurchaseDetailsScreen.H = block34;
                    return creditCardPrePurchaseDetailsScreen;
                }
                if (!(step13 instanceof CreditCardInstalmentDetailsFlowContract$Step.StatementFinancing)) {
                    if (!(step13 instanceof CreditCardInstalmentDetailsFlowContract$Step.Repay)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CreditCardInstalmentDetailsFlowContract$Step.Repay repay = (CreditCardInstalmentDetailsFlowContract$Step.Repay) step13;
                    return new CreditCardInstalmentRepayFlow(new CreditCardInstalmentRepayFlowContract$InputData(creditCardInstalmentDetailsFlowContract$InputData.getF69353a(), creditCardInstalmentDetailsFlowContract$InputData.getF69354b(), repay.f69357a, repay.f69358b));
                }
                CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen = new CreditCardStatementFinancingDetailsScreen(new CreditCardStatementFinancingDetailsScreenContract$InputData(creditCardInstalmentDetailsFlowContract$InputData.getF69353a(), creditCardInstalmentDetailsFlowContract$InputData.getF69354b(), ((jte.d) aVar9).c(CreditCardApi$Toggles$CreditCardInstalmentDetailsRedesign.f68684c)));
                Function1 block35 = new Function1() { // from class: xr4.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i2) {
                            case 0:
                                bs4.h result = (bs4.h) obj9;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                v vVar = v.PRE_PURCHASE;
                                List listC = u.c(result.f18048a);
                                com.revolut.feature.credit.card.impl.ui.instalment.details.flow.b bVar7 = bVar6;
                                bVar7.n2(new com.revolut.feature.credit.card.impl.ui.instalment.details.flow.a(vVar, listC, bVar7, null), new whi.b(6));
                                return Unit.f186387a;
                            default:
                                ew4.i result2 = (ew4.i) obj9;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                v vVar2 = v.STATEMENT_DEFERRAL;
                                ArrayList arrayList2 = result2.f130077a;
                                com.revolut.feature.credit.card.impl.ui.instalment.details.flow.b bVar8 = bVar6;
                                bVar8.n2(new com.revolut.feature.credit.card.impl.ui.instalment.details.flow.a(vVar2, arrayList2, bVar8, null), new whi.b(6));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block35, "block");
                creditCardStatementFinancingDetailsScreen.H = block35;
                return creditCardStatementFinancingDetailsScreen;
            case 23:
                final com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.a aVar10 = (com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.a) obj5;
                BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData biometricVerificationMyNumberCardDetailsEditFlowContract$InputData = aVar10.o;
                yki.l FlowCoordinator6 = (yki.l) obj2;
                BiometricVerificationMyNumberCardDetailsEditFlowContract$Step step14 = (BiometricVerificationMyNumberCardDetailsEditFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.DateOfBirth) {
                    BiometricVerificationMyNumberDateOfBirthEditScreen biometricVerificationMyNumberDateOfBirthEditScreen = new BiometricVerificationMyNumberDateOfBirthEditScreen(new BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData(((BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.DateOfBirth) step14).f50527a, biometricVerificationMyNumberCardDetailsEditFlowContract$InputData.f50524c));
                    Function1 block36 = new Function1() { // from class: xs.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i2) {
                                case 0:
                                    n result = (n) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar10.C2(new c(result.f8967a));
                                    return Unit.f186387a;
                                default:
                                    s result2 = (s) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.a aVar11 = aVar10;
                                    oki.h.t2(aVar11, aVar11.f50528p, new BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.CardDetails(result2.f316361a, null), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block36, "block");
                    biometricVerificationMyNumberDateOfBirthEditScreen.H = block36;
                    return biometricVerificationMyNumberDateOfBirthEditScreen;
                }
                if (!(step14 instanceof BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.CardDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.CardDetails cardDetails = (BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.CardDetails) step14;
                BiometricVerificationMyNumberDetailsEditScreen biometricVerificationMyNumberDetailsEditScreen = new BiometricVerificationMyNumberDetailsEditScreen(new BiometricVerificationMyNumberDetailsEditScreenContract$InputData(cardDetails.f50525a, cardDetails.f50526b, biometricVerificationMyNumberCardDetailsEditFlowContract$InputData.f50524c));
                Function1 block37 = new Function1() { // from class: xs.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i3) {
                            case 0:
                                n result = (n) obj9;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar10.C2(new c(result.f8967a));
                                return Unit.f186387a;
                            default:
                                s result2 = (s) obj9;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.a aVar11 = aVar10;
                                oki.h.t2(aVar11, aVar11.f50528p, new BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.CardDetails(result2.f316361a, null), true, null, false, 12);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block37, "block");
                biometricVerificationMyNumberDetailsEditScreen.H = block37;
                return biometricVerificationMyNumberDetailsEditScreen;
            case 24:
                com.revolut.feature.transfer_reasons.impl.ui.additional_info.a aVar11 = (com.revolut.feature.transfer_reasons.impl.ui.additional_info.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TransferReasonsAdditionalInfoScreenContract$ModalStep step15 = (TransferReasonsAdditionalInfoScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDisclosure) {
                    return new AdditionalInfoDisclosureScreen(new AdditionalInfoDisclosureScreenContract$InputData(((TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDisclosure) step15).f92377a));
                }
                if (!(step15 instanceof TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDropdownSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDropdownSelection additionalInfoDropdownSelection = (TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDropdownSelection) step15;
                AdditionalInfoField additionalInfoField = additionalInfoDropdownSelection.f92378a;
                TextClause textClause = new TextClause(additionalInfoField.f92407b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                List list2 = additionalInfoField.f92410h;
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                AdditionalInfoDropdownSelectionScreen additionalInfoDropdownSelectionScreen = new AdditionalInfoDropdownSelectionScreen(new AdditionalInfoDropdownSelectionScreenContract$InputData(textClause, additionalInfoDropdownSelection.f92379b, list2));
                xpe.c block38 = new xpe.c(additionalInfoDropdownSelection, aVar11, 14);
                Intrinsics.checkNotNullParameter(block38, "block");
                additionalInfoDropdownSelectionScreen.H = block38;
                return additionalInfoDropdownSelectionScreen;
            case 25:
                return a(obj2, obj3);
            case 26:
                final com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar12 = (com.revolut.feature.rev_points.buying.impl.ui.flow.a) obj5;
                RevPointsBuyingFlowContract$Step step16 = (RevPointsBuyingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (Intrinsics.f(step16, RevPointsBuyingFlowContract$Step.OneOffBuy.f83561a)) {
                    InputData inputData = aVar12.o;
                    RevPointsBuyingControllerScreen revPointsBuyingControllerScreen = new RevPointsBuyingControllerScreen(new RevPointsBuyingControllerScreenContract$InputData(inputData.f83555c, false, inputData.f83554b));
                    Function1 block39 = new Function1() { // from class: xub.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            bvb.g it9 = (bvb.g) obj9;
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    boolean z6 = it9 instanceof bvb.f;
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar13 = aVar12;
                                    if (z6) {
                                        aVar13.K2((bvb.f) it9);
                                    } else if (it9 instanceof bvb.j) {
                                        aVar13.N2((bvb.j) it9);
                                    } else if (it9 instanceof bvb.i) {
                                        aVar13.M2((bvb.i) it9);
                                    } else if (it9 instanceof bvb.h) {
                                        aVar13.L2((bvb.h) it9);
                                    } else if (!Intrinsics.f(it9, g.a.f18986a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    boolean z11 = it9 instanceof bvb.f;
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar14 = aVar12;
                                    if (z11) {
                                        aVar14.K2((bvb.f) it9);
                                    } else if (it9 instanceof bvb.j) {
                                        aVar14.N2((bvb.j) it9);
                                    } else if (it9 instanceof bvb.i) {
                                        aVar14.M2((bvb.i) it9);
                                    } else if (it9 instanceof bvb.h) {
                                        aVar14.L2((bvb.h) it9);
                                    } else {
                                        if (!Intrinsics.f(it9, g.a.f18986a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar14.H2(aVar14.f83564q, new e(0));
                                        oki.h.w2(aVar14.f83565r, RevPointsBuyingFlowContract$Step.Info.f83560a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block39, "block");
                    revPointsBuyingControllerScreen.H = block39;
                    revPointsBuyingControllerScreen.k2(new Function0() { // from class: xub.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar13 = aVar12;
                                    yki.i iVar = aVar13.f83565r;
                                    if (iVar.d() == null && !((RevPointsBuyingFlowContract$FlowState) ((j2) aVar13.f83564q.f22677a).getValue()).f83558b) {
                                        oki.h.D2(iVar);
                                        Function1 function1 = aVar13.o.d;
                                        if (function1 != null) {
                                            function1.invoke(Boolean.FALSE);
                                        }
                                    }
                                    break;
                                case 1:
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar14 = aVar12;
                                    yki.i iVar2 = aVar14.f83565r;
                                    if (iVar2.d() == null && !((RevPointsBuyingFlowContract$FlowState) ((j2) aVar14.f83564q.f22677a).getValue()).f83558b) {
                                        oki.h.D2(iVar2);
                                        Function1 function12 = aVar14.o.d;
                                        if (function12 != null) {
                                            function12.invoke(Boolean.FALSE);
                                        }
                                    }
                                    break;
                                default:
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar15 = aVar12;
                                    aVar15.H2(aVar15.f83564q, new xrl.a(25));
                                    oki.h.w2(aVar15.f83565r, RevPointsBuyingFlowContract$Step.RecurringBuy.f83562a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return revPointsBuyingControllerScreen;
                }
                if (Intrinsics.f(step16, RevPointsBuyingFlowContract$Step.RecurringBuy.f83562a)) {
                    RevPointsBuyingControllerScreen revPointsBuyingControllerScreen2 = new RevPointsBuyingControllerScreen(new RevPointsBuyingControllerScreenContract$InputData(null, true, false));
                    Function1 block40 = new Function1() { // from class: xub.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            bvb.g it9 = (bvb.g) obj9;
                            switch (i2) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    boolean z6 = it9 instanceof bvb.f;
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar13 = aVar12;
                                    if (z6) {
                                        aVar13.K2((bvb.f) it9);
                                    } else if (it9 instanceof bvb.j) {
                                        aVar13.N2((bvb.j) it9);
                                    } else if (it9 instanceof bvb.i) {
                                        aVar13.M2((bvb.i) it9);
                                    } else if (it9 instanceof bvb.h) {
                                        aVar13.L2((bvb.h) it9);
                                    } else if (!Intrinsics.f(it9, g.a.f18986a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    boolean z11 = it9 instanceof bvb.f;
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar14 = aVar12;
                                    if (z11) {
                                        aVar14.K2((bvb.f) it9);
                                    } else if (it9 instanceof bvb.j) {
                                        aVar14.N2((bvb.j) it9);
                                    } else if (it9 instanceof bvb.i) {
                                        aVar14.M2((bvb.i) it9);
                                    } else if (it9 instanceof bvb.h) {
                                        aVar14.L2((bvb.h) it9);
                                    } else {
                                        if (!Intrinsics.f(it9, g.a.f18986a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar14.H2(aVar14.f83564q, new e(0));
                                        oki.h.w2(aVar14.f83565r, RevPointsBuyingFlowContract$Step.Info.f83560a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block40, "block");
                    revPointsBuyingControllerScreen2.H = block40;
                    revPointsBuyingControllerScreen2.k2(new Function0() { // from class: xub.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar13 = aVar12;
                                    yki.i iVar = aVar13.f83565r;
                                    if (iVar.d() == null && !((RevPointsBuyingFlowContract$FlowState) ((j2) aVar13.f83564q.f22677a).getValue()).f83558b) {
                                        oki.h.D2(iVar);
                                        Function1 function1 = aVar13.o.d;
                                        if (function1 != null) {
                                            function1.invoke(Boolean.FALSE);
                                        }
                                    }
                                    break;
                                case 1:
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar14 = aVar12;
                                    yki.i iVar2 = aVar14.f83565r;
                                    if (iVar2.d() == null && !((RevPointsBuyingFlowContract$FlowState) ((j2) aVar14.f83564q.f22677a).getValue()).f83558b) {
                                        oki.h.D2(iVar2);
                                        Function1 function12 = aVar14.o.d;
                                        if (function12 != null) {
                                            function12.invoke(Boolean.FALSE);
                                        }
                                    }
                                    break;
                                default:
                                    com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar15 = aVar12;
                                    aVar15.H2(aVar15.f83564q, new xrl.a(25));
                                    oki.h.w2(aVar15.f83565r, RevPointsBuyingFlowContract$Step.RecurringBuy.f83562a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return revPointsBuyingControllerScreen2;
                }
                if (!Intrinsics.f(step16, RevPointsBuyingFlowContract$Step.Info.f83560a)) {
                    throw new NoWhenBranchMatchedException();
                }
                RevPointsBuyingInfoControllerScreen revPointsBuyingInfoControllerScreen = new RevPointsBuyingInfoControllerScreen();
                final int i32 = 2;
                revPointsBuyingInfoControllerScreen.k2(new Function0() { // from class: xub.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i32) {
                            case 0:
                                com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar13 = aVar12;
                                yki.i iVar = aVar13.f83565r;
                                if (iVar.d() == null && !((RevPointsBuyingFlowContract$FlowState) ((j2) aVar13.f83564q.f22677a).getValue()).f83558b) {
                                    oki.h.D2(iVar);
                                    Function1 function1 = aVar13.o.d;
                                    if (function1 != null) {
                                        function1.invoke(Boolean.FALSE);
                                    }
                                }
                                break;
                            case 1:
                                com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar14 = aVar12;
                                yki.i iVar2 = aVar14.f83565r;
                                if (iVar2.d() == null && !((RevPointsBuyingFlowContract$FlowState) ((j2) aVar14.f83564q.f22677a).getValue()).f83558b) {
                                    oki.h.D2(iVar2);
                                    Function1 function12 = aVar14.o.d;
                                    if (function12 != null) {
                                        function12.invoke(Boolean.FALSE);
                                    }
                                }
                                break;
                            default:
                                com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar15 = aVar12;
                                aVar15.H2(aVar15.f83564q, new xrl.a(25));
                                oki.h.w2(aVar15.f83565r, RevPointsBuyingFlowContract$Step.RecurringBuy.f83562a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return revPointsBuyingInfoControllerScreen;
            case 27:
                return b(obj2, obj3);
            case 28:
                return c(obj2, obj3);
            default:
                List trips = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(trips, "trips");
                ((xvj.e) obj5).f309288b.f("trips_cache", trips);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f306362a = i;
        this.f306363b = obj2;
    }

    public /* synthetic */ k(b0 b0Var, xka.r rVar) {
        this.f306362a = 3;
        this.f306363b = rVar;
    }
}
