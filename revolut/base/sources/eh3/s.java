package eh3;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import c12.v;
import cn3.b;
import com.google.protobuf.w0;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeature;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationSelfieStepFlowProvider$InputData;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlow;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlow;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.selfie.flow.BiometricVerificationSelfieStepFlow;
import com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.BiometricVerificationSelfieSearchFlow;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.revolut.ui.previewless_selfie.PreviewlessSelfieFlow;
import com.revolut.camerakit.revolut.ui.previewless_selfie.PreviewlessSelfieFlowContract$InputData;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.ui.api.navigation.ApmPendingNavigation$InputData;
import com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlowContract$Step;
import com.revolut.feature.apm.wero.impl.ui.p2m.registration.WeroP2MRegistrationFlow;
import com.revolut.feature.apm.wero.impl.ui.p2m.registration.WeroP2MRegistrationFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlow;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetContract$ModalStep;
import com.revolut.feature.bank_account_switching.impl.ui.review_joint.SwitchInJointReviewScreenContract$ModalStep;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreenContract$InputData;
import com.revolut.feature.call_security_info.dependencies.impl.configuration.RetailCallSecurityProductArticleKey;
import com.revolut.feature.call_security_info.impl.ui.call_detection.CallDetectionScreenContract$Step;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$ModalStep;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.UserSelectionFlowContract$Step;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationPrompt;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDialog$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.cancellation.repayment.CreditCardTerminatedRepaymentScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.repayment.CreditCardTerminatedRepaymentScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreenContract$InstalmentFilter;
import com.revolut.feature.credit.card.impl.ui.items.bottom_sheet.CreditCardBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.bottom_sheet.limit_exceeded.CryptoSendLimitExceededBottomSheetController;
import com.revolut.feature.external_accounts.api.MandateApi$Toggles$VrpSetupBottomSheet;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import com.revolut.feature.external_accounts.api.navigation.InstitutionData;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderCountryDepartmentUiModel;
import com.revolut.feature.external_accounts.impl.ui.link.instructions.InstructionsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreen;
import com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.AkahuFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.AkahuProductArticleKey;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.CrossBorderBranchesScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.CrossBorderCountryDepartmentsScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlowContract$Step;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreen;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$InputData;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$PersonalDetails;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreen;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountScreen;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreenContract$ModalStep;
import com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlow;
import com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step;
import com.revolut.feature.salary_switch.impl.ui.mexico.flow.SalarySwitchMxFlow;
import com.revolut.feature.salary_switch.impl.ui.mexico.flow.SalarySwitchMxFlowContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.promo.SalarySwitchArticleKey;
import com.revolut.feature.salary_switch.impl.ui.screen.share_details.ShareSalaryDetailsScreen;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.MerchantRedirectFlowContract$Step;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.MerchantRedirectDialogController;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.MerchantRedirectDialogControllerContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reference.ReferenceScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.main.TravelMilesMainScreenContract$ModalStep;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.NewCollectionScreenContract$ModalStep;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.NewScreenerScreenContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.SaveScreenerCollectionScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanLimitsBottomSheet$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.plan_sharing.PlanSharingBottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_referrals_invite_video.PlanReferralsInviteVideoScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_referrals_invite_video.PlanReferralsInviteVideoScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.tracking.v3.CameraCaptureContext;
import com.revolut.tracking.v3.VisionVerificationContext;
import d12.d;
import ds4.i;
import ds4.j;
import ds4.k;
import ds4.m;
import ds4.n;
import ds4.o;
import ds4.p;
import e8e.w;
import eq5.g0;
import eq5.y0;
import fi2.e;
import fi2.f;
import fo6.k;
import grl.f1;
import grl.j1;
import grl.k9;
import ho6.j;
import ix0.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import m1c.e0;
import oki.h;
import vkm.j2;
import vn6.f;
import we6.g0;
import we6.p;
import we6.q;
import we6.r0;
import wp5.d1;
import yki.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125728b;

    public /* synthetic */ s(Object obj2, int i) {
        this.f125727a = i;
        this.f125728b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        boolean z;
        RowDelegate.Model.c.b bVar;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f125728b;
        g0 g0Var = jVar.f71280s;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CryptoSendAmountInputScreenContract$ModalStep step = (CryptoSendAmountInputScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.NetworkPicker) {
            CryptoSendAmountInputScreenContract$ModalStep.NetworkPicker networkPicker = (CryptoSendAmountInputScreenContract$ModalStep.NetworkPicker) step;
            wk5.a selectedBlockchain = networkPicker.f71253a;
            List availableBlockchainsWithFees = networkPicker.f71254b;
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
            Intrinsics.checkNotNullParameter(availableBlockchainsWithFees, "availableBlockchainsWithFees");
            yp5.f fVar = g0Var.f128269a;
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_change_network_title, null, null, 14), fVar.d(), null, null, false, 28);
            ArrayList<RowDelegate.Model> arrayListE = fVar.e(availableBlockchainsWithFees, selectedBlockchain);
            ArrayList arrayList = new ArrayList(zhm.w.t(arrayListE, 10));
            for (RowDelegate.Model model : arrayListE) {
                Clause clause = model.f53230c;
                Clause clause2 = model.f;
                RowDelegate.Model.MainImage mainImage = model.f53229b;
                int i = model.i;
                boolean z3 = model.f53234l;
                boolean zJ = model.J();
                RowDelegate.Model.c cVar = model.k;
                boolean z4 = cVar instanceof RowDelegate.Model.c.b;
                if (z4) {
                    z = z4;
                    bVar = (RowDelegate.Model.c.b) cVar;
                } else {
                    z = z4;
                    bVar = null;
                }
                Clause clause3 = bVar != null ? bVar.f53272a : null;
                RowDelegate.Model.c.b bVar2 = z ? (RowDelegate.Model.c.b) cVar : null;
                arrayList.add(new eii.l(clause, clause2, mainImage, i, z3, zJ, clause3, bVar2 != null ? bVar2.f53273b : null, model.f53236n, model.u));
            }
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar, null, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
            y0 block = new y0(jVar, 6);
            Intrinsics.checkNotNullParameter(block, "block");
            rowActionsBottomSheetController.H = block;
            return rowActionsBottomSheetController;
        }
        int i2 = 4;
        int i3 = 2;
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.MindTheNetwork) {
            CryptoSendAmountInputScreenContract$ModalStep.MindTheNetwork mindTheNetwork = (CryptoSendAmountInputScreenContract$ModalStep.MindTheNetwork) step;
            wk5.a blockchain = mindTheNetwork.f71252b;
            xi0.b currency = mindTheNetwork.f71251a;
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(blockchain, "blockchain");
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_dialog_confirm_network_sheet_title, zhm.v.k(d0.a(currency, null), ((ik5.a) g0Var.f128271c).b(blockchain, false, null)), null, 12), new TextLocalisedClause(R$string.crypto_withdrawals_dialog_confirm_network_sheet_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.crypto_withdrawals_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.crypto_withdrawals_common_dont_show_again, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), AnalyticsProduct.Shared.Crypto.f, null, null, 24));
            eq4.c block2 = new eq4.c(jVar, blockchain, i2);
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController.H = block2;
            return actionsBottomSheetController;
        }
        int i5 = 1;
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.DualChooser) {
            ViewController viewControllerE1 = jVar.e1(new l1j.d(((CryptoSendAmountInputScreenContract$ModalStep.DualChooser) step).f71248a, jVar.A));
            y0 block3 = new y0(jVar, i3);
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE1.H = block3;
            return viewControllerE1;
        }
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.BalanceChooser) {
            CryptoSendAmountInputScreenContract$ModalStep.BalanceChooser balanceChooser = (CryptoSendAmountInputScreenContract$ModalStep.BalanceChooser) step;
            CurrencyChooserFlow currencyChooserFlowA = jVar.u.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker((String) null, balanceChooser.f71246a, io3.l.CURRENT, balanceChooser.f71247b, (Set) null, zhm.y0.b(k1j.a.CRYPTO), (TextLocalisedClause) null, false, (Integer) null, (Set) null, 1705)));
            y0 y0Var = new y0(jVar, 8);
            Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
            currencyChooserFlowA.J = y0Var;
            return currencyChooserFlowA;
        }
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket) {
            CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket activatePocket = (CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket) step;
            io3.d pocket = activatePocket.f71243a;
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            xi0.a aVar2 = xi0.b.Companion;
            String str = pocket.f163147c;
            aVar2.getClass();
            xi0.b currency2 = xi0.a.a(str);
            yp5.f fVar2 = g0Var.f128269a;
            Intrinsics.checkNotNullParameter(currency2, "currency");
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_activate_pocket_title, zhm.u.c(d0.a(currency2, null)), null, 12), fVar2.a(currency2), null, null, false, 28);
            aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_activate_pocket_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_activate_pocket_activate, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
            k9 k9Var2 = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar3, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
            eq4.c block4 = new eq4.c(jVar, activatePocket, i5);
            Intrinsics.checkNotNullParameter(block4, "block");
            actionsBottomSheetController2.H = block4;
            return actionsBottomSheetController2;
        }
        int i6 = 3;
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.AddressBelongsToYou) {
            op5.c cVar2 = g0Var.f128270b;
            lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_belong_to_you_title, null, null, 14), new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_belong_to_you_description, null, null, 14), null, null, false, 28);
            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_no_someone_else_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var3 = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar4, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
            eq4.c block5 = new eq4.c(jVar, (CryptoSendAmountInputScreenContract$ModalStep.AddressBelongsToYou) step, i6);
            Intrinsics.checkNotNullParameter(block5, "block");
            actionsBottomSheetController3.H = block5;
            return actionsBottomSheetController3;
        }
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.AdditionalInfoRequired) {
            op5.c cVar3 = g0Var.f128270b;
            lw0.a aVar5 = new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_additional_info_title, null, null, 14), new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_belong_to_you_description, null, null, 14), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var4 = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar5, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
            eq4.c block6 = new eq4.c(jVar, (CryptoSendAmountInputScreenContract$ModalStep.AdditionalInfoRequired) step, i3);
            Intrinsics.checkNotNullParameter(block6, "block");
            actionsBottomSheetController4.H = block6;
            return actionsBottomSheetController4;
        }
        if (Intrinsics.f(step, CryptoSendAmountInputScreenContract$ModalStep.ThousandEuroLimitExceeded.f71256a)) {
            lw0.a aVar6 = new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_dialog_regulatory_exceed_limit_title, null, null, 14), g0Var.f128269a.f(), null, null, false, 28);
            aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var5 = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController5 = new ActionsBottomSheetController(new dii.a(aVar6, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
            y0 block7 = new y0(jVar, i2);
            Intrinsics.checkNotNullParameter(block7, "block");
            actionsBottomSheetController5.H = block7;
            return actionsBottomSheetController5;
        }
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.LimitExceeded) {
            CryptoSendLimitExceededBottomSheetController cryptoSendLimitExceededBottomSheetController = new CryptoSendLimitExceededBottomSheetController(((CryptoSendAmountInputScreenContract$ModalStep.LimitExceeded) step).f71249a);
            y0 block8 = new y0(jVar, i6);
            Intrinsics.checkNotNullParameter(block8, "block");
            cryptoSendLimitExceededBottomSheetController.H = block8;
            return cryptoSendLimitExceededBottomSheetController;
        }
        if (step instanceof CryptoSendAmountInputScreenContract$ModalStep.MeshValidation) {
            ViewController viewControllerE12 = jVar.e1(new lm5.a(new TfrValidationFlowContract$InputData(((CryptoSendAmountInputScreenContract$ModalStep.MeshValidation) step).f71250a, km5.f.MESH, null, null)));
            y0 block9 = new y0(jVar, 7);
            Intrinsics.checkNotNullParameter(block9, "block");
            viewControllerE12.H = block9;
            return viewControllerE12;
        }
        if (!(step instanceof CryptoSendAmountInputScreenContract$ModalStep.ScaValidation)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE13 = jVar.e1(new wrc.a(((CryptoSendAmountInputScreenContract$ModalStep.ScaValidation) step).f71255a, null, 14));
        y0 block10 = new y0(jVar, 5);
        Intrinsics.checkNotNullParameter(block10, "block");
        viewControllerE13.H = block10;
        return viewControllerE13;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.salary_switch.impl.ui.flow.a aVar = (com.revolut.feature.salary_switch.impl.ui.flow.a) this.f125728b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        SalarySwitchFlowContract$Step step = (SalarySwitchFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SalarySwitchFlowContract$Step.ShareSalaryDetails) {
            ShareSalaryDetailsScreen shareSalaryDetailsScreen = new ShareSalaryDetailsScreen(new wpc.d(((SalarySwitchFlowContract$Step.ShareSalaryDetails) step).f85313a, wpc.e.FULL_SCREEN));
            dph.c block = new dph.c(aVar, LazyFlowCoordinator, 7);
            Intrinsics.checkNotNullParameter(block, "block");
            shareSalaryDetailsScreen.H = block;
            return shareSalaryDetailsScreen;
        }
        if (step instanceof SalarySwitchFlowContract$Step.SalarySwitchMx) {
            return new SalarySwitchMxFlow(new SalarySwitchMxFlowContract$InputData(((SalarySwitchFlowContract$Step.SalarySwitchMx) step).f85312a));
        }
        if (step instanceof SalarySwitchFlowContract$Step.SalarySwitchBr) {
            return new SalarySwitchBrFlow(new SalarySwitchBrFlowContract$InputData(((SalarySwitchFlowContract$Step.SalarySwitchBr) step).f85311a));
        }
        if (Intrinsics.f(step, SalarySwitchFlowContract$Step.MxSalarySwitchPromo.f85310a)) {
            wi0.b.Companion.getClass();
            String lowerCase = "MX".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            ViewController viewControllerE1 = aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(new SalarySwitchArticleKey(lowerCase, 3))), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
            erc.d block2 = new erc.d(aVar, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        if (!(step instanceof SalarySwitchFlowContract$Step.CurrencySwitch)) {
            throw new NoWhenBranchMatchedException();
        }
        drc.a aVar2 = aVar.f85314p;
        SalarySwitchFlowContract$Step.CurrencySwitch currencySwitch = (SalarySwitchFlowContract$Step.CurrencySwitch) step;
        String salaryAccountCurrencyCode = currencySwitch.f85308a;
        String baseCurrencyCode = currencySwitch.f85309b;
        ((drc.b) aVar2).getClass();
        Intrinsics.checkNotNullParameter(salaryAccountCurrencyCode, "salaryAccountCurrencyCode");
        Intrinsics.checkNotNullParameter(baseCurrencyCode, "baseCurrencyCode");
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_different_salary_prompt_title, zhm.u.c(salaryAccountCurrencyCode), null, 12), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_different_salary_prompt_subtitle, zhm.u.c(baseCurrencyCode), null, 12), null, null, false, 20);
        k9 value = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_different_salary_prompt_continue_action, zhm.u.c(salaryAccountCurrencyCode), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, salaryAccountCurrencyCode, 508), new n6(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_different_salary_prompt_switch_action, zhm.u.c(baseCurrencyCode), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, baseCurrencyCode, 508), null, null, null, 121), new AnalyticsProduct.Retail(value), null, null, 24));
        eq4.c block3 = new eq4.c(aVar, step, 13);
        Intrinsics.checkNotNullParameter(block3, "block");
        actionsBottomSheetController.H = block3;
        actionsBottomSheetController.k2(new e58.e(aVar, 28));
        return actionsBottomSheetController;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = (com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f125728b;
        w0 w0Var = dVar.K;
        BiometricVerificationFlowProvider$InputData biometricVerificationFlowProvider$InputData = dVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        BiometricVerificationLauncherFlowContract$Step step = (BiometricVerificationLauncherFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BiometricVerificationLauncherFlowContract$Step.ActiveLiveness) {
            BiometricVerificationActiveLivenessStepFlow biometricVerificationActiveLivenessStepFlow = new BiometricVerificationActiveLivenessStepFlow(new BiometricVerificationActiveLivenessStepFlowContract$InputData(((BiometricVerificationLauncherFlowContract$Step.ActiveLiveness) step).f50477a, biometricVerificationFlowProvider$InputData.d, biometricVerificationFlowProvider$InputData.f50453a, dVar.K, biometricVerificationFlowProvider$InputData.f50456g));
            com.revolut.biometric_verification.impl.ui.flow.launcher.a block = new com.revolut.biometric_verification.impl.ui.flow.launcher.a(1, 0, com.revolut.biometric_verification.impl.ui.flow.launcher.d.class, dVar, "handleBiometricVerificationStepResult", "handleBiometricVerificationStepResult(Lcom/revolut/biometric_verification/api/models/BiometricVerificationStepResult;)V");
            Intrinsics.checkNotNullParameter(block, "block");
            biometricVerificationActiveLivenessStepFlow.H = block;
            return biometricVerificationActiveLivenessStepFlow;
        }
        if (step instanceof BiometricVerificationLauncherFlowContract$Step.Document) {
            BiometricVerificationDocumentStepFlow biometricVerificationDocumentStepFlow = new BiometricVerificationDocumentStepFlow(new BiometricVerificationDocumentStepFlowContract$InputData(((BiometricVerificationLauncherFlowContract$Step.Document) step).f50478a, biometricVerificationFlowProvider$InputData.d, w0Var, biometricVerificationFlowProvider$InputData.f50456g));
            com.revolut.biometric_verification.impl.ui.flow.launcher.b block2 = new com.revolut.biometric_verification.impl.ui.flow.launcher.b(1, 0, com.revolut.biometric_verification.impl.ui.flow.launcher.d.class, dVar, "handleBiometricVerificationStepResult", "handleBiometricVerificationStepResult(Lcom/revolut/biometric_verification/api/models/BiometricVerificationStepResult;)V");
            Intrinsics.checkNotNullParameter(block2, "block");
            biometricVerificationDocumentStepFlow.H = block2;
            return biometricVerificationDocumentStepFlow;
        }
        if (step instanceof BiometricVerificationLauncherFlowContract$Step.Selfie) {
            BiometricVerificationSelfieStepFlow biometricVerificationSelfieStepFlow = new BiometricVerificationSelfieStepFlow(new BiometricVerificationSelfieStepFlowProvider$InputData(((BiometricVerificationLauncherFlowContract$Step.Selfie) step).f50480a, biometricVerificationFlowProvider$InputData.f50455c, biometricVerificationFlowProvider$InputData.d, dVar.K, biometricVerificationFlowProvider$InputData.f50456g));
            com.revolut.biometric_verification.impl.ui.flow.launcher.c block3 = new com.revolut.biometric_verification.impl.ui.flow.launcher.c(1, 0, com.revolut.biometric_verification.impl.ui.flow.launcher.d.class, dVar, "handleBiometricVerificationStepResult", "handleBiometricVerificationStepResult(Lcom/revolut/biometric_verification/api/models/BiometricVerificationStepResult;)V");
            Intrinsics.checkNotNullParameter(block3, "block");
            biometricVerificationSelfieStepFlow.H = block3;
            return biometricVerificationSelfieStepFlow;
        }
        if (!(step instanceof BiometricVerificationLauncherFlowContract$Step.PreviewlessSelfie)) {
            if (!(step instanceof BiometricVerificationLauncherFlowContract$Step.SelfieSearch)) {
                throw new NoWhenBranchMatchedException();
            }
            BiometricVerificationSelfieSearchFlow biometricVerificationSelfieSearchFlow = new BiometricVerificationSelfieSearchFlow(new mu.c(biometricVerificationFlowProvider$InputData.f50453a));
            eif.c block4 = new eif.c(1, dVar, com.revolut.biometric_verification.impl.ui.flow.launcher.d.class, "handleBiometricVerificationStepResult", "handleBiometricVerificationStepResult(Lcom/revolut/biometric_verification/api/models/BiometricVerificationStepResult;)V", 0, 15);
            Intrinsics.checkNotNullParameter(block4, "block");
            biometricVerificationSelfieSearchFlow.H = block4;
            return biometricVerificationSelfieSearchFlow;
        }
        BiometricVerificationLauncherFlowContract$Step.PreviewlessSelfie previewlessSelfie = (BiometricVerificationLauncherFlowContract$Step.PreviewlessSelfie) step;
        BiometricVerificationStep.PreviewlessSelfie previewlessSelfie2 = previewlessSelfie.f50479a;
        CameraCaptureSettings cameraCaptureSettings = previewlessSelfie2.f50407c;
        int i = previewlessSelfie2.d;
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
        CameraCaptureContext.a aVarNewBuilder = CameraCaptureContext.newBuilder();
        aVarNewBuilder.h(f1.AUTOCAPTURE);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setFlowType(...)");
        cs.b.a(aVarNewBuilder, cameraCaptureSettings);
        aVarNewBuilder.i(j1.SELFIE_WITHOUT_PREVIEW);
        CameraCaptureContext cameraCaptureContext = (CameraCaptureContext) aVarNewBuilder.a();
        w0 w0VarA = cameraCaptureContext;
        if (w0Var instanceof VisionVerificationContext) {
            VisionVerificationContext.a aVar = (VisionVerificationContext.a) ((VisionVerificationContext) w0Var).toBuilder();
            VisionVerificationContext.Inner_context.a aVarNewBuilder2 = VisionVerificationContext.Inner_context.newBuilder();
            aVarNewBuilder2.h(cameraCaptureContext);
            aVar.h((VisionVerificationContext.Inner_context) aVarNewBuilder2.a());
            w0VarA = aVar.a();
        }
        AnalyticsContext.INSTANCE.getClass();
        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
        BiometricVerificationFeature biometricVerificationFeature = previewlessSelfie2.f.f50396j;
        boolean z = false;
        if (biometricVerificationFeature != null && biometricVerificationFeature.f50390a) {
            z = true;
        }
        PreviewlessSelfieFlow previewlessSelfieFlow = new PreviewlessSelfieFlow(new PreviewlessSelfieFlowContract$InputData(cameraCaptureSettings, i, w0VarA2, z));
        eq4.c block5 = new eq4.c(dVar, previewlessSelfie, 14);
        Intrinsics.checkNotNullParameter(block5, "block");
        previewlessSelfieFlow.H = block5;
        return previewlessSelfieFlow;
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.a aVar = (com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.a) this.f125728b;
        CreditCardInstalmentHubFlowContract$InputData creditCardInstalmentHubFlowContract$InputData = aVar.o;
        final yki.l FlowCoordinator = (yki.l) obj2;
        CreditCardInstalmentHubFlowContract$Step step = (CreditCardInstalmentHubFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreditCardInstalmentHubFlowContract$Step.Hub) {
            CreditCardInstalmentHubScreen creditCardInstalmentHubScreen = new CreditCardInstalmentHubScreen(new CreditCardInstalmentHubScreenContract$InputData(creditCardInstalmentHubFlowContract$InputData.f69398a));
            final int i = 0;
            Function1 block = new Function1() { // from class: es4.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            p result = (p) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof n;
                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                            l lVar = FlowCoordinator;
                            if (z) {
                                h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.StatementFinancingDetails(((n) result).f117217a), popup);
                            } else if (result instanceof m) {
                                h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.PrePurchaseDetails(((m) result).f117216a), popup);
                            } else if (result instanceof ds4.l) {
                                h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.PostPurchaseDetails(((ds4.l) result).f117215a), popup);
                            } else {
                                boolean z3 = result instanceof o;
                                com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.a aVar2 = aVar;
                                if (z3) {
                                    h.t2(aVar2, lVar, new CreditCardInstalmentHubFlowContract$Step.Topup(null), true, null, false, 12);
                                } else if (result instanceof i) {
                                    h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.CreatePostPurchaseInstalment.f69399a, true, null, false, 12);
                                } else if (result instanceof k) {
                                    h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.PastInstalments.f69402a, true, null, false, 12);
                                } else {
                                    if (!(result instanceof j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.CurrentInstalments.f69400a, true, null, false, 12);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            hs4.i result2 = (hs4.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            aVar.I2(FlowCoordinator, result2);
                            return Unit.f186387a;
                        default:
                            hs4.i result3 = (hs4.i) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            aVar.I2(FlowCoordinator, result3);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            creditCardInstalmentHubScreen.H = block;
            return creditCardInstalmentHubScreen;
        }
        if (step instanceof CreditCardInstalmentHubFlowContract$Step.Topup) {
            CreditCardRepayFlow creditCardRepayFlow = new CreditCardRepayFlow(new CreditCardRepayFlowContract$InputData(((CreditCardInstalmentHubFlowContract$Step.Topup) step).f69406a, creditCardInstalmentHubFlowContract$InputData.f69398a));
            eq4.g block2 = new eq4.g(aVar, 13);
            Intrinsics.checkNotNullParameter(block2, "block");
            creditCardRepayFlow.H = block2;
            return creditCardRepayFlow;
        }
        if (step instanceof CreditCardInstalmentHubFlowContract$Step.StatementFinancingDetails) {
            return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.StatementFinancing(creditCardInstalmentHubFlowContract$InputData.f69398a, ((CreditCardInstalmentHubFlowContract$Step.StatementFinancingDetails) step).f69405a));
        }
        if (step instanceof CreditCardInstalmentHubFlowContract$Step.PostPurchaseDetails) {
            return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.PostPurchase(creditCardInstalmentHubFlowContract$InputData.f69398a, ((CreditCardInstalmentHubFlowContract$Step.PostPurchaseDetails) step).f69403a));
        }
        if (step instanceof CreditCardInstalmentHubFlowContract$Step.PrePurchaseDetails) {
            return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.PrePurchase(creditCardInstalmentHubFlowContract$InputData.f69398a, ((CreditCardInstalmentHubFlowContract$Step.PrePurchaseDetails) step).f69404a));
        }
        if (step instanceof CreditCardInstalmentHubFlowContract$Step.CreatePostPurchaseInstalment) {
            return new InstalmentFlow(new InstalmentFlowContract$InputData.Create(creditCardInstalmentHubFlowContract$InputData.f69398a, io3.l.CREDIT));
        }
        if (step instanceof CreditCardInstalmentHubFlowContract$Step.PastInstalments) {
            CreditCardInstalmentsScreen creditCardInstalmentsScreen = new CreditCardInstalmentsScreen(new CreditCardInstalmentsScreenContract$InputData(creditCardInstalmentHubFlowContract$InputData.f69398a, CreditCardInstalmentsScreenContract$InstalmentFilter.Past.f69411a));
            final int i2 = 1;
            Function1 block3 = new Function1() { // from class: es4.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            p result = (p) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof n;
                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                            l lVar = FlowCoordinator;
                            if (z) {
                                h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.StatementFinancingDetails(((n) result).f117217a), popup);
                            } else if (result instanceof m) {
                                h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.PrePurchaseDetails(((m) result).f117216a), popup);
                            } else if (result instanceof ds4.l) {
                                h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.PostPurchaseDetails(((ds4.l) result).f117215a), popup);
                            } else {
                                boolean z3 = result instanceof o;
                                com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.a aVar2 = aVar;
                                if (z3) {
                                    h.t2(aVar2, lVar, new CreditCardInstalmentHubFlowContract$Step.Topup(null), true, null, false, 12);
                                } else if (result instanceof i) {
                                    h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.CreatePostPurchaseInstalment.f69399a, true, null, false, 12);
                                } else if (result instanceof k) {
                                    h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.PastInstalments.f69402a, true, null, false, 12);
                                } else {
                                    if (!(result instanceof j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.CurrentInstalments.f69400a, true, null, false, 12);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            hs4.i result2 = (hs4.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            aVar.I2(FlowCoordinator, result2);
                            return Unit.f186387a;
                        default:
                            hs4.i result3 = (hs4.i) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            aVar.I2(FlowCoordinator, result3);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            creditCardInstalmentsScreen.H = block3;
            return creditCardInstalmentsScreen;
        }
        if (!(step instanceof CreditCardInstalmentHubFlowContract$Step.CurrentInstalments)) {
            throw new NoWhenBranchMatchedException();
        }
        CreditCardInstalmentsScreen creditCardInstalmentsScreen2 = new CreditCardInstalmentsScreen(new CreditCardInstalmentsScreenContract$InputData(creditCardInstalmentHubFlowContract$InputData.f69398a, CreditCardInstalmentsScreenContract$InstalmentFilter.Current.f69410a));
        final int i3 = 2;
        Function1 block4 = new Function1() { // from class: es4.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i3) {
                    case 0:
                        p result = (p) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof n;
                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                        l lVar = FlowCoordinator;
                        if (z) {
                            h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.StatementFinancingDetails(((n) result).f117217a), popup);
                        } else if (result instanceof m) {
                            h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.PrePurchaseDetails(((m) result).f117216a), popup);
                        } else if (result instanceof ds4.l) {
                            h.w2(lVar, new CreditCardInstalmentHubFlowContract$Step.PostPurchaseDetails(((ds4.l) result).f117215a), popup);
                        } else {
                            boolean z3 = result instanceof o;
                            com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.a aVar2 = aVar;
                            if (z3) {
                                h.t2(aVar2, lVar, new CreditCardInstalmentHubFlowContract$Step.Topup(null), true, null, false, 12);
                            } else if (result instanceof i) {
                                h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.CreatePostPurchaseInstalment.f69399a, true, null, false, 12);
                            } else if (result instanceof k) {
                                h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.PastInstalments.f69402a, true, null, false, 12);
                            } else {
                                if (!(result instanceof j)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar2, lVar, CreditCardInstalmentHubFlowContract$Step.CurrentInstalments.f69400a, true, null, false, 12);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        hs4.i result2 = (hs4.i) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        aVar.I2(FlowCoordinator, result2);
                        return Unit.f186387a;
                    default:
                        hs4.i result3 = (hs4.i) obj4;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        aVar.I2(FlowCoordinator, result3);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block4, "block");
        creditCardInstalmentsScreen2.H = block4;
        return creditCardInstalmentsScreen2;
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar = (com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a) this.f125728b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CardRecipientDetailsScreenContract$ModalStep step = (CardRecipientDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CardRecipientDetailsScreenContract$ModalStep.DeleteConfirmationDialog)) {
            if (!(step instanceof CardRecipientDetailsScreenContract$ModalStep.EditLabel)) {
                if (Intrinsics.f(step, CardRecipientDetailsScreenContract$ModalStep.ChangeBackgroundDialog.f81602a)) {
                    return aVar.f81608s.Z2(aVar.o.f81601a.f81490a);
                }
                throw new NoWhenBranchMatchedException();
            }
            CardOwner cardOwner = ((CardRecipientDetailsScreenContract$ModalStep.EditLabel) step).f81604a;
            ReferenceScreen referenceScreenC = ((qpf.h) aVar.f81607r).c(cardOwner.d);
            eq4.c cVar = new eq4.c(aVar, cardOwner, 15);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            referenceScreenC.H = cVar;
            return referenceScreenC;
        }
        String name = ((CardRecipientDetailsScreenContract$ModalStep.DeleteConfirmationDialog) step).f81603a;
        aVar.f81606q.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.push_to_card.impl.R$string.push2card_recipient_details_confirmation_dialog_title, zhm.u.c(name), null, 12), null, null, null, false, 30);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        eq4.g block = new eq4.g(aVar, 14);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    /* JADX WARN: Type inference failed for: r1v177, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v154, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController viewControllerE1;
        ViewController planReferralsInviteVideoScreen;
        ActionsBottomSheetController actionsBottomSheetController;
        ActionsBottomSheetController actionsBottomSheetController2;
        int i = this.f125727a;
        ContactType.RevolutContact.Local local = ContactType.RevolutContact.Local.f66038a;
        int i2 = 5;
        final int i3 = 1;
        Object obj4 = this.f125728b;
        switch (i) {
            case 0:
                com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ChecklistCollectionScreenContract$ModalStep step = (ChecklistCollectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof ChecklistCollectionScreenContract$ModalStep.CardLimits) {
                    return aVar.e1(new hx2.d(((ChecklistCollectionScreenContract$ModalStep.CardLimits) step).f65814a, null, aVar.o.f65813b));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                aw0.i iVar = (aw0.i) obj4;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new r(n.f125722a, tj0.a.a((Throwable) obj2) ? kh3.a.a(com.revolut.kompot.common.R$string.common_offline_state_title, R$drawable.uikit_icn_24_communication, Integer.valueOf(com.revolut.kompot.common.R$string.common_offline_state_description)) : kh3.a.a(com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_collection_error_title, R$drawable.uikit_icn_24_exclamation_triangle, null), iVar);
            case 2:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = PaymentAmountScreen.f78771b0;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
                return new zp0.d(editText, ((yof.b) obj5).f315672a, (u80.d) ((PaymentAmountScreen) obj4).P.getValue(), null, null, false, false, 0, false, null, 1944);
            case 3:
                final com.revolut.feature.apm.wero.impl.ui.p2m.b bVar = (com.revolut.feature.apm.wero.impl.ui.p2m.b) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                WeroP2MFlowContract$Step step2 = (WeroP2MFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof WeroP2MFlowContract$Step.Intro) {
                    ViewController viewControllerE12 = bVar.e1(new d12.a(new d12.c(new TextLocalisedClause(com.revolut.feature.apm.wero.api.R$string.wero_entry, null, null, 14)), bVar.f63076p));
                    Function1 block = new Function1() { // from class: ei2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i3) {
                                case 0:
                                    v outputData = (v) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar2 = bVar;
                                    bVar2.l2(new com.revolut.feature.apm.wero.impl.ui.p2m.a(bVar2, outputData, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 1:
                                    d outputData2 = (d) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar3 = bVar;
                                    bVar3.l2(new w(bVar3, (sh2.a) outputData2, null, 22), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    f outputData3 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, fi2.c.f135285a);
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar4 = bVar;
                                    if (zF || Intrinsics.f(outputData3, fi2.d.f135286a)) {
                                        h.D2(bVar4.f63078r);
                                    } else {
                                        if (!Intrinsics.f(outputData3, e.f135287a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(bVar4, bVar4.f63078r, WeroP2MFlowContract$Step.Intro.f63071a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    gi2.c it8 = (gi2.c) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    h.D2(bVar.f63078r);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    viewControllerE12.H = block;
                    return viewControllerE12;
                }
                if (step2 instanceof WeroP2MFlowContract$Step.Pending) {
                    String str = ((WeroP2MFlowContract$Step.Pending) step2).f63073a;
                    ApmWero apmWero = ApmWero.f61829c;
                    ViewController viewControllerE13 = bVar.e1(new c12.k(new ApmPendingNavigation$InputData(str, apmWero.e(), apmWero.F(), CapturePresenter.PASSPORT_OVERLAY_DELAY_MS), bVar.f63077q));
                    final int i5 = 0;
                    Function1 block2 = new Function1() { // from class: ei2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    v outputData = (v) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar2 = bVar;
                                    bVar2.l2(new com.revolut.feature.apm.wero.impl.ui.p2m.a(bVar2, outputData, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 1:
                                    d outputData2 = (d) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar3 = bVar;
                                    bVar3.l2(new w(bVar3, (sh2.a) outputData2, null, 22), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    f outputData3 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, fi2.c.f135285a);
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar4 = bVar;
                                    if (zF || Intrinsics.f(outputData3, fi2.d.f135286a)) {
                                        h.D2(bVar4.f63078r);
                                    } else {
                                        if (!Intrinsics.f(outputData3, e.f135287a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(bVar4, bVar4.f63078r, WeroP2MFlowContract$Step.Intro.f63071a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    gi2.c it8 = (gi2.c) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    h.D2(bVar.f63078r);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE13.H = block2;
                    return viewControllerE13;
                }
                if (step2 instanceof WeroP2MFlowContract$Step.Registration) {
                    WeroP2MRegistrationFlow weroP2MRegistrationFlow = new WeroP2MRegistrationFlow(new WeroP2MRegistrationFlowContract$InputData(((WeroP2MFlowContract$Step.Registration) step2).f63074a));
                    final int i6 = 2;
                    Function1 block3 = new Function1() { // from class: ei2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    v outputData = (v) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar2 = bVar;
                                    bVar2.l2(new com.revolut.feature.apm.wero.impl.ui.p2m.a(bVar2, outputData, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 1:
                                    d outputData2 = (d) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar3 = bVar;
                                    bVar3.l2(new w(bVar3, (sh2.a) outputData2, null, 22), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    f outputData3 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, fi2.c.f135285a);
                                    com.revolut.feature.apm.wero.impl.ui.p2m.b bVar4 = bVar;
                                    if (zF || Intrinsics.f(outputData3, fi2.d.f135286a)) {
                                        h.D2(bVar4.f63078r);
                                    } else {
                                        if (!Intrinsics.f(outputData3, e.f135287a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(bVar4, bVar4.f63078r, WeroP2MFlowContract$Step.Intro.f63071a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    gi2.c it8 = (gi2.c) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    h.D2(bVar.f63078r);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    weroP2MRegistrationFlow.H = block3;
                    return weroP2MRegistrationFlow;
                }
                if (!(step2 instanceof WeroP2MFlowContract$Step.Pay)) {
                    throw new NoWhenBranchMatchedException();
                }
                WeroPayFlow weroPayFlow = new WeroPayFlow(new WeroPayFlowContract$InputData(((WeroP2MFlowContract$Step.Pay) step2).f63072a));
                final int i21 = 3;
                Function1 block4 = new Function1() { // from class: ei2.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i21) {
                            case 0:
                                v outputData = (v) obj6;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                com.revolut.feature.apm.wero.impl.ui.p2m.b bVar2 = bVar;
                                bVar2.l2(new com.revolut.feature.apm.wero.impl.ui.p2m.a(bVar2, outputData, null), new yi5.b(26));
                                return Unit.f186387a;
                            case 1:
                                d outputData2 = (d) obj6;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                com.revolut.feature.apm.wero.impl.ui.p2m.b bVar3 = bVar;
                                bVar3.l2(new w(bVar3, (sh2.a) outputData2, null, 22), new yi5.b(26));
                                return Unit.f186387a;
                            case 2:
                                f outputData3 = (f) obj6;
                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                boolean zF = Intrinsics.f(outputData3, fi2.c.f135285a);
                                com.revolut.feature.apm.wero.impl.ui.p2m.b bVar4 = bVar;
                                if (zF || Intrinsics.f(outputData3, fi2.d.f135286a)) {
                                    h.D2(bVar4.f63078r);
                                } else {
                                    if (!Intrinsics.f(outputData3, e.f135287a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar4, bVar4.f63078r, WeroP2MFlowContract$Step.Intro.f63071a, false, null, false, 12);
                                }
                                return Unit.f186387a;
                            default:
                                gi2.c it8 = (gi2.c) obj6;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                h.D2(bVar.f63078r);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                weroPayFlow.H = block4;
                return weroPayFlow;
            case 4:
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                JuniorPersonalDataCreationFlowContract$Step step3 = (JuniorPersonalDataCreationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (Intrinsics.f(step3, JuniorPersonalDataCreationFlowContract$Step.PersonalDetails.f77012a)) {
                    JuniorPersonalDetailsScreen juniorPersonalDetailsScreen = new JuniorPersonalDetailsScreen();
                    dkm.a block5 = new dkm.a(1, eVar, com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e.class, "onPersonalDetailsResult", "onPersonalDetailsResult(Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$OutputData;)V", 0, 28);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    juniorPersonalDetailsScreen.H = block5;
                    return juniorPersonalDetailsScreen;
                }
                if (step3 instanceof JuniorPersonalDataCreationFlowContract$Step.JuniorMatchPrompt) {
                    JuniorPersonalDataCreationFlowContract$Step.JuniorMatchPrompt juniorMatchPrompt = (JuniorPersonalDataCreationFlowContract$Step.JuniorMatchPrompt) step3;
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(juniorMatchPrompt.f77010b);
                    eed.j block6 = new eed.j(eVar, juniorMatchPrompt, 8);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    promptMarketingScreen.H = block6;
                    return promptMarketingScreen;
                }
                if (step3 instanceof JuniorPersonalDataCreationFlowContract$Step.OverRegistrationAgePrompt) {
                    PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(((JuniorPersonalDataCreationFlowContract$Step.OverRegistrationAgePrompt) step3).f77011a);
                    ei8.d block7 = new ei8.d(eVar, 0);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    promptMarketingScreen2.H = block7;
                    return promptMarketingScreen2;
                }
                if (step3 instanceof JuniorPersonalDataCreationFlowContract$Step.DetailsConfirmation) {
                    JuniorPersonalDataCreationFlowContract$Step.DetailsConfirmation detailsConfirmation = (JuniorPersonalDataCreationFlowContract$Step.DetailsConfirmation) step3;
                    PersonalDetailsForm personalDetailsForm = detailsConfirmation.f77006a;
                    viewControllerE1 = new JuniorDetailsConfirmationScreen(new JuniorDetailsConfirmationScreenContract$InputData(new JuniorDetailsConfirmationScreenContract$PersonalDetails(personalDetailsForm.f77040a, personalDetailsForm.f77041b, personalDetailsForm.f77042c, personalDetailsForm.d, personalDetailsForm.f), detailsConfirmation.f77007b));
                    eed.j block8 = new eed.j(eVar, personalDetailsForm, 6);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    viewControllerE1.H = block8;
                } else {
                    if (step3 instanceof JuniorPersonalDataCreationFlowContract$Step.TermsAndConditions) {
                        ViewController viewControllerE14 = eVar.e1(new s58.b(new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_action_create_account, null, null, 14)));
                        eed.j block9 = new eed.j(eVar, step3, 7);
                        Intrinsics.checkNotNullParameter(block9, "block");
                        viewControllerE14.H = block9;
                        return viewControllerE14;
                    }
                    if (!(step3 instanceof JuniorPersonalDataCreationFlowContract$Step.InviteJunior)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    viewControllerE1 = eVar.e1(new aya.a(0));
                    dph.c block10 = new dph.c(eVar, LazyFlowCoordinator, 2);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    viewControllerE1.H = block10;
                }
                return viewControllerE1;
            case 5:
                com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.main.e) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelMilesMainScreenContract$ModalStep step4 = (TravelMilesMainScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof TravelMilesMainScreenContract$ModalStep.RevPointsBottomSheet) {
                    return eVar2.e1(new hub.c(e0.MILES));
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                final com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) obj4;
                PlanReferralsSenderFlowContract$Step step5 = (PlanReferralsSenderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof PlanReferralsSenderFlowContract$Step.Intro) {
                    PlanReferralsSenderFlowContract$Step.Intro intro = (PlanReferralsSenderFlowContract$Step.Intro) step5;
                    ProductArticleParams productArticleParams = intro.f103223a;
                    k9 k9Var = k9.Premium;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ViewController viewControllerE15 = gVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 48));
                    eed.j block11 = new eed.j(gVar, intro, 11);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    viewControllerE15.H = block11;
                    return viewControllerE15;
                }
                if (step5 instanceof PlanReferralsSenderFlowContract$Step.SelectContacts) {
                    PlanReferralsSenderFlowContract$Step.SelectContacts selectContacts = (PlanReferralsSenderFlowContract$Step.SelectContacts) step5;
                    iik.a aVar2 = gVar.f103235r;
                    Clause referredPlanName = selectContacts.f103228a;
                    int i22 = selectContacts.f103229b;
                    ContactsFilter contactsFilter = selectContacts.f103230c;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(referredPlanName, "referredPlanName");
                    ContactsChooserScreen contactsChooserScreenA = ln3.b.a(new ContactsChooserInputData((Clause) new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_contact_picker_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_contact_picker_search_hint, null, null, 14), zhm.v.k(local, new ContactType.RevolutContact.Remote(zhm.y0.b(zm3.k.INDIVIDUAL))), (List) null, (ContactsChooserMode) ContactsChooserMode.SingleSelect.f66078a, false, false, false, true, contactsFilter, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) null, (Clause) new TextLocalisedQuantityClause(R$plurals.premium_plan_referral_contact_picker_header_subtitle, Integer.valueOf(i22), zhm.v.k(Integer.valueOf(i22), referredPlanName), (Style) null, 24), (Set) null, (ContactsPrimaryButtonClause) new ContactsPrimaryButtonClause.Plain(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_contact_picker_send_invite_button, null, null, 14)), (cn3.h) null, 0, (Set) null, 973832));
                    final int i32 = 0;
                    Function1 block12 = new Function1() { // from class: eik.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i33 = i32;
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar2 = gVar;
                            switch (i33) {
                                case 0:
                                    cn3.b output = (cn3.b) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof cn3.c) {
                                        cn3.e eVar3 = (cn3.e) zhm.d0.M0(((cn3.c) output).f25344a);
                                        if (eVar3 == null) {
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, "PlanReferralsSenderFlowModel", "Expected exactly one contact selected for plan referrals send flow", null, h0Var);
                                        } else {
                                            zm3.a aVar3 = eVar3.f25347a;
                                            zm3.l lVar = aVar3 instanceof zm3.l ? (zm3.l) aVar3 : null;
                                            if (lVar == null) {
                                                h0 h0Var2 = h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, "PlanReferralsSenderFlowModel", "Expected a RevolutContact selected for plan referrals send flow", null, h0Var2);
                                            } else {
                                                gVar2.l2(new eif.j(gVar2, lVar, null, 1), new yi5.b(26));
                                            }
                                        }
                                    } else if (output instanceof b.a) {
                                        oki.h.D2(gVar2.f103240y);
                                    } else if (!(output instanceof cn3.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    d67.u output2 = (d67.u) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, d67.s.f111464a) || Intrinsics.f(output2, d67.q.f111462a)) {
                                        oki.h.D2(gVar2.f103240y);
                                    } else if (!Intrinsics.f(output2, d67.t.f111465a) && !Intrinsics.f(output2, d67.r.f111463a) && !(output2 instanceof d67.p)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    contactsChooserScreenA.H = block12;
                    return contactsChooserScreenA;
                }
                if (step5 instanceof PlanReferralsSenderFlowContract$Step.PlanSharing) {
                    planReferralsInviteVideoScreen = new PlanSharingBottomSheet();
                    x5d.b.n(gVar, planReferralsInviteVideoScreen, new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.c(2, 0, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.class, gVar, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;"), new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.d(gVar, null), new a8a.a(gVar, (PlanReferralsSenderFlowContract$Step.PlanSharing) step5, 26));
                } else {
                    if (!(step5 instanceof PlanReferralsSenderFlowContract$Step.InviteVideo)) {
                        if (!(step5 instanceof PlanReferralsSenderFlowContract$Step.CampaignUnavailable)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_no_active_campaign_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_no_active_campaign_subtitle, null, null, 14);
                        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30);
                        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54);
                        k9 k9Var2 = k9.Premium;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                        PromptMarketingScreen promptMarketingScreen3 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause, textLocalisedClause2, cdnImageC, null, null, resourceImage, null, button, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, 61272));
                        Function1 block13 = new Function1() { // from class: eik.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i33 = i3;
                                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar2 = gVar;
                                switch (i33) {
                                    case 0:
                                        cn3.b output = (cn3.b) obj6;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output instanceof cn3.c) {
                                            cn3.e eVar3 = (cn3.e) zhm.d0.M0(((cn3.c) output).f25344a);
                                            if (eVar3 == null) {
                                                h0 h0Var = h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, "PlanReferralsSenderFlowModel", "Expected exactly one contact selected for plan referrals send flow", null, h0Var);
                                            } else {
                                                zm3.a aVar3 = eVar3.f25347a;
                                                zm3.l lVar = aVar3 instanceof zm3.l ? (zm3.l) aVar3 : null;
                                                if (lVar == null) {
                                                    h0 h0Var2 = h0.f322473a;
                                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                                    rd0.d.a(rd0.c.ERROR, "PlanReferralsSenderFlowModel", "Expected a RevolutContact selected for plan referrals send flow", null, h0Var2);
                                                } else {
                                                    gVar2.l2(new eif.j(gVar2, lVar, null, 1), new yi5.b(26));
                                                }
                                            }
                                        } else if (output instanceof b.a) {
                                            oki.h.D2(gVar2.f103240y);
                                        } else if (!(output instanceof cn3.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        d67.u output2 = (d67.u) obj6;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        if (Intrinsics.f(output2, d67.s.f111464a) || Intrinsics.f(output2, d67.q.f111462a)) {
                                            oki.h.D2(gVar2.f103240y);
                                        } else if (!Intrinsics.f(output2, d67.t.f111465a) && !Intrinsics.f(output2, d67.r.f111463a) && !(output2 instanceof d67.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block13, "block");
                        promptMarketingScreen3.H = block13;
                        return promptMarketingScreen3;
                    }
                    PlanReferralsSenderFlowContract$Step.InviteVideo inviteVideo = (PlanReferralsSenderFlowContract$Step.InviteVideo) step5;
                    planReferralsInviteVideoScreen = new PlanReferralsInviteVideoScreen(new PlanReferralsInviteVideoScreenContract$InputData(inviteVideo.f103225a));
                    x5d.b.n(gVar, planReferralsInviteVideoScreen, new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.a(2, 0, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.class, gVar, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;"), new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.b(gVar, inviteVideo, null), new a8a.a(gVar, inviteVideo, 27));
                }
                return planReferralsInviteVideoScreen;
            case 7:
                com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b) obj4;
                UserSelectionFlowContract$Step step6 = (UserSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof UserSelectionFlowContract$Step.Initial)) {
                    throw new NoWhenBranchMatchedException();
                }
                ln3.b bVar3 = bVar2.f68498r;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.family_credit_card_user_selection_title, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.family_credit_card_user_selection_description, null, null, 14);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.family_credit_card_user_selection_search, null, null, 14);
                ContactsPrimaryButtonClause.Plain plain = new ContactsPrimaryButtonClause.Plain(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.family_credit_card_user_selection_button, null, null, 14));
                zm3.k[] allowedTypes = {zm3.k.INDIVIDUAL};
                Intrinsics.checkNotNullParameter(allowedTypes, "allowedTypes");
                List listK = zhm.v.k(local, new ContactType.RevolutContact.Remote(kotlin.collections.d.y0(allowedTypes)), ContactType.UsernameContact.f66040a);
                ContactsChooserMode multiSelect = ((UserSelectionFlowContract$Step.Initial) step6).f68495a.f139083a ? new ContactsChooserMode.MultiSelect(null) : ContactsChooserMode.SingleSelect.f66078a;
                int i33 = R$drawable.uikit_icn_24_cross;
                k9 value = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ContactsChooserInputData contactsChooserInputData = new ContactsChooserInputData((Clause) textLocalisedClause3, (Clause) textLocalisedClause5, listK, (List) null, multiSelect, false, true, false, true, (ContactsFilter) null, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) new AnalyticsProduct.Retail(value), (Clause) textLocalisedClause4, (Set) null, (ContactsPrimaryButtonClause) plain, (cn3.h) null, i33, (Set) null, 708232);
                bVar3.getClass();
                ContactsChooserScreen contactsChooserScreenA2 = ln3.b.a(contactsChooserInputData);
                ei8.d block14 = new ei8.d(bVar2, i3);
                Intrinsics.checkNotNullParameter(block14, "block");
                contactsChooserScreenA2.H = block14;
                return contactsChooserScreenA2;
            case 8:
                CenteredAmountDelegate.Model data2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = JuniorPaymentLinkCustomAmountScreen.U;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText2 = field2.getEditText();
                Object obj6 = data2.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText2, (xi0.b) obj6, (u80.d) ((JuniorPaymentLinkCustomAmountScreen) obj4).Q.getValue(), null, null, false, false, 0, false, null, 1944);
            case 9:
                com.revolut.feature.atm.impl.ui.redesign.details.a aVar3 = (com.revolut.feature.atm.impl.ui.redesign.details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AtmDetailsBottomSheetContract$ModalStep step7 = (AtmDetailsBottomSheetContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof AtmDetailsBottomSheetContract$ModalStep.ExchangeFee) {
                    return aVar3.e1(tj2.a.f271599a);
                }
                if (step7 instanceof AtmDetailsBottomSheetContract$ModalStep.WithdrawalFee) {
                    return aVar3.e1(tj2.b.f271600a);
                }
                if (step7 instanceof AtmDetailsBottomSheetContract$ModalStep.WeekendMarkup) {
                    return aVar3.e1(tj2.h.f271606a);
                }
                if (step7 instanceof AtmDetailsBottomSheetContract$ModalStep.BackendDrivenBottomSheet) {
                    AtmDetailsBottomSheetContract$ModalStep.BackendDrivenBottomSheet backendDrivenBottomSheet = (AtmDetailsBottomSheetContract$ModalStep.BackendDrivenBottomSheet) step7;
                    return aVar3.e1(new igk.h(new PlanLimitsBottomSheet$InputData(backendDrivenBottomSheet.f63157a, backendDrivenBottomSheet.f63158b)));
                }
                if (!(step7 instanceof AtmDetailsBottomSheetContract$ModalStep.WithdrawalLimits)) {
                    throw new NoWhenBranchMatchedException();
                }
                AtmDetailsBottomSheetContract$ModalStep.WithdrawalLimits withdrawalLimits = (AtmDetailsBottomSheetContract$ModalStep.WithdrawalLimits) step7;
                ViewController viewControllerE16 = aVar3.e1(new tj2.g(withdrawalLimits.f63162a, withdrawalLimits.f63163b));
                ei8.d block15 = new ei8.d(aVar3, 7);
                Intrinsics.checkNotNullParameter(block15, "block");
                viewControllerE16.H = block15;
                return viewControllerE16;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ek7.q.b((ek7.i) obj4);
            case 11:
                o7.b bVar4 = (o7.b) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                bVar4.getClass();
                return zhm.u.c(rdh.b.CASH_BALANCE_GIA);
            case 12:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar5 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) obj4;
                EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData = bVar5.o;
                cli.y yVar = bVar5.u;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep step8 = (EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker)) {
                    if (!(step8 instanceof EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus trackPortabilityStatus = (EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus) step8;
                    return new EsimCompleteNumberTransferBottomSheetScreen(new EsimCompleteNumberTransferBottomSheetScreenContract$InputData(trackPortabilityStatus.f101314a, trackPortabilityStatus.f101316c, trackPortabilityStatus.f101315b, null, null, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f, 24));
                }
                EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker portingPreferredSchedulePicker = (EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker) step8;
                EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen = new EsimMobilePlanNumberTransferPortabilityDatePickerScreen(new EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData(portingPreferredSchedulePicker.f101311a, portingPreferredSchedulePicker.f101312b, ((elj.g) ((j2) yVar.f22677a).getValue()).f127497b, ((elj.g) ((j2) yVar.f22677a).getValue()).f127496a, portingPreferredSchedulePicker.f101313c, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f));
                ei8.d block16 = new ei8.d(bVar5, 17);
                Intrinsics.checkNotNullParameter(block16, "block");
                esimMobilePlanNumberTransferPortabilityDatePickerScreen.H = block16;
                return esimMobilePlanNumberTransferPortabilityDatePickerScreen;
            case 13:
                final com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar3 = (com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e) obj4;
                fm6.a aVar4 = eVar3.f72855t;
                fm6.b bVar6 = eVar3.v;
                CrossBorderEasyBankTransferFlowContract$InputData crossBorderEasyBankTransferFlowContract$InputData = eVar3.o;
                final yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                final CrossBorderEasyBankTransferFlowContract$Step step9 = (CrossBorderEasyBankTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.Institutions) {
                    CrossBorderInstitutionsScreen crossBorderInstitutionsScreen = new CrossBorderInstitutionsScreen(new jo6.l(crossBorderEasyBankTransferFlowContract$InputData.f72814a.f115083b, se6.g.PAYMENT_INITIATION, null));
                    eed.j block17 = new eed.j(eVar3, LazyFlowCoordinator2, 22);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    crossBorderInstitutionsScreen.H = block17;
                    return crossBorderInstitutionsScreen;
                }
                if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments) {
                    CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen = new CrossBorderCountryDepartmentsScreen(new ho6.i(((CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments) step9).f72821a));
                    Function1 block18 = new Function1() { // from class: em6.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    dii.g outputData = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof dii.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                    CrossBorderEasyBankTransferFlowContract$Step crossBorderEasyBankTransferFlowContract$Step = step9;
                                    if (z) {
                                        CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog = (CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog) crossBorderEasyBankTransferFlowContract$Step;
                                        eVar4.L2(takeUserRegionForGlobalBankDialog.d, takeUserRegionForGlobalBankDialog.f72840b, takeUserRegionForGlobalBankDialog.f72841c);
                                    } else if (outputData instanceof dii.f) {
                                        CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog2 = (CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog) crossBorderEasyBankTransferFlowContract$Step;
                                        oki.h.t2(eVar4, LazyFlowCoordinator2, new CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments(takeUserRegionForGlobalBankDialog2.f72839a, takeUserRegionForGlobalBankDialog2.f72840b, takeUserRegionForGlobalBankDialog2.f72841c), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ho6.j result = (ho6.j) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof ho6.k) {
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                        im6.a aVar5 = eVar5.f72856w;
                                        se6.i iVar2 = ((ho6.k) result).f154233a;
                                        aVar5.getClass();
                                        CrossBorderCountryDepartmentUiModel crossBorderCountryDepartmentUiModelA = im6.a.a(iVar2);
                                        CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments countryDepartments = (CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments) step9;
                                        eVar5.L2(crossBorderCountryDepartmentUiModelA, countryDepartments.f72822b, countryDepartments.f72823c);
                                    } else {
                                        if (!(result instanceof j.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(LazyFlowCoordinator2, CrossBorderEasyBankTransferFlowContract$Step.CountryNotListedDialog.f72824a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    fo6.k result2 = (fo6.k) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof fo6.l) {
                                        se6.h hVar = ((fo6.l) result2).f136832a;
                                        CrossBorderEasyBankTransferFlowContract$Step.Branches branches = (CrossBorderEasyBankTransferFlowContract$Step.Branches) step9;
                                        String str2 = branches.f72818a;
                                        String str3 = branches.f72819b;
                                        boolean z3 = branches.f72820c;
                                        eVar3.K2(new CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Branch(hVar.f262133a, hVar.f262134b, hVar.f262135c, branches.d, str2, str3, z3, branches.e));
                                    } else {
                                        if (!(result2 instanceof k.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(LazyFlowCoordinator2, CrossBorderEasyBankTransferFlowContract$Step.BranchNotListedDialog.f72817a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    crossBorderCountryDepartmentsScreen.H = block18;
                    return crossBorderCountryDepartmentsScreen;
                }
                if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.Branches) {
                    CrossBorderBranchesScreen crossBorderBranchesScreen = new CrossBorderBranchesScreen(new fo6.j(((CrossBorderEasyBankTransferFlowContract$Step.Branches) step9).f72818a));
                    final int i43 = 2;
                    Function1 block19 = new Function1() { // from class: em6.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i43) {
                                case 0:
                                    dii.g outputData = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof dii.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                    CrossBorderEasyBankTransferFlowContract$Step crossBorderEasyBankTransferFlowContract$Step = step9;
                                    if (z) {
                                        CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog = (CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog) crossBorderEasyBankTransferFlowContract$Step;
                                        eVar4.L2(takeUserRegionForGlobalBankDialog.d, takeUserRegionForGlobalBankDialog.f72840b, takeUserRegionForGlobalBankDialog.f72841c);
                                    } else if (outputData instanceof dii.f) {
                                        CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog2 = (CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog) crossBorderEasyBankTransferFlowContract$Step;
                                        oki.h.t2(eVar4, LazyFlowCoordinator2, new CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments(takeUserRegionForGlobalBankDialog2.f72839a, takeUserRegionForGlobalBankDialog2.f72840b, takeUserRegionForGlobalBankDialog2.f72841c), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ho6.j result = (ho6.j) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof ho6.k) {
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                        im6.a aVar5 = eVar5.f72856w;
                                        se6.i iVar2 = ((ho6.k) result).f154233a;
                                        aVar5.getClass();
                                        CrossBorderCountryDepartmentUiModel crossBorderCountryDepartmentUiModelA = im6.a.a(iVar2);
                                        CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments countryDepartments = (CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments) step9;
                                        eVar5.L2(crossBorderCountryDepartmentUiModelA, countryDepartments.f72822b, countryDepartments.f72823c);
                                    } else {
                                        if (!(result instanceof j.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(LazyFlowCoordinator2, CrossBorderEasyBankTransferFlowContract$Step.CountryNotListedDialog.f72824a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    fo6.k result2 = (fo6.k) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof fo6.l) {
                                        se6.h hVar = ((fo6.l) result2).f136832a;
                                        CrossBorderEasyBankTransferFlowContract$Step.Branches branches = (CrossBorderEasyBankTransferFlowContract$Step.Branches) step9;
                                        String str2 = branches.f72818a;
                                        String str3 = branches.f72819b;
                                        boolean z3 = branches.f72820c;
                                        eVar3.K2(new CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Branch(hVar.f262133a, hVar.f262134b, hVar.f262135c, branches.d, str2, str3, z3, branches.e));
                                    } else {
                                        if (!(result2 instanceof k.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(LazyFlowCoordinator2, CrossBorderEasyBankTransferFlowContract$Step.BranchNotListedDialog.f72817a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    crossBorderBranchesScreen.H = block19;
                    return crossBorderBranchesScreen;
                }
                if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) {
                    if (((jte.d) eVar3.f72857x).c(MandateApi$Toggles$VrpSetupBottomSheet.f72205c)) {
                        MandateSetupBottomSheetController mandateSetupBottomSheetController = new MandateSetupBottomSheetController(new MandateSetupBottomSheetContract$InputData(new InstitutionData.InstitutionId(((CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9).f72825a), crossBorderEasyBankTransferFlowContract$InputData.f72814a));
                        Function1 block20 = new Function1() { // from class: em6.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i3) {
                                    case 0:
                                        dii.g outputData = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof dii.e) {
                                            eVar3.J2(new q(((CrossBorderEasyBankTransferFlowContract$Step.DifferentCurrencyBottomSheet) step9).f72828a));
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        r0 result = (r0) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (!(result instanceof r0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        CrossBorderEasyBankTransferFlowContract$Step.CreateMandate createMandate = (CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9;
                                        String str2 = createMandate.f72825a;
                                        String str3 = createMandate.f72826b;
                                        boolean z = createMandate.f72827c;
                                        String str4 = createMandate.d;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                        eVar4.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.c(eVar4, str2, str3, z, str4, null), new whi.b(6));
                                        return Unit.f186387a;
                                    case 2:
                                        we6.m result2 = (we6.m) obj7;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (!(result2 instanceof we6.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        CrossBorderEasyBankTransferFlowContract$Step.CreateMandate createMandate2 = (CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9;
                                        String str5 = createMandate2.f72825a;
                                        String str6 = createMandate2.f72826b;
                                        boolean z3 = createMandate2.f72827c;
                                        String str7 = createMandate2.d;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                        eVar5.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.c(eVar5, str5, str6, z3, str7, null), new whi.b(6));
                                        return Unit.f186387a;
                                    default:
                                        vn6.f result3 = (vn6.f) obj7;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        boolean z4 = result3 instanceof vn6.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar6 = eVar3;
                                        if (z4) {
                                            CrossBorderEasyBankTransferFlowContract$Step.Iban iban = (CrossBorderEasyBankTransferFlowContract$Step.Iban) step9;
                                            eVar6.M2(iban.f72829a, iban.f72830b, ((vn6.e) result3).f290761a);
                                        } else {
                                            if (!(result3 instanceof f.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar6.B2();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block20, "block");
                        mandateSetupBottomSheetController.H = block20;
                        return mandateSetupBottomSheetController;
                    }
                    CreateMandateScreen createMandateScreen = new CreateMandateScreen(new CreateMandateScreenContract$InputData(new InstitutionData.InstitutionId(((CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9).f72825a), crossBorderEasyBankTransferFlowContract$InputData.f72814a, true));
                    final int i59 = 2;
                    Function1 block21 = new Function1() { // from class: em6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i59) {
                                case 0:
                                    dii.g outputData = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        eVar3.J2(new q(((CrossBorderEasyBankTransferFlowContract$Step.DifferentCurrencyBottomSheet) step9).f72828a));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    r0 result = (r0) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof r0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CrossBorderEasyBankTransferFlowContract$Step.CreateMandate createMandate = (CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9;
                                    String str2 = createMandate.f72825a;
                                    String str3 = createMandate.f72826b;
                                    boolean z = createMandate.f72827c;
                                    String str4 = createMandate.d;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                    eVar4.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.c(eVar4, str2, str3, z, str4, null), new whi.b(6));
                                    return Unit.f186387a;
                                case 2:
                                    we6.m result2 = (we6.m) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof we6.m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CrossBorderEasyBankTransferFlowContract$Step.CreateMandate createMandate2 = (CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9;
                                    String str5 = createMandate2.f72825a;
                                    String str6 = createMandate2.f72826b;
                                    boolean z3 = createMandate2.f72827c;
                                    String str7 = createMandate2.d;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                    eVar5.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.c(eVar5, str5, str6, z3, str7, null), new whi.b(6));
                                    return Unit.f186387a;
                                default:
                                    vn6.f result3 = (vn6.f) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof vn6.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar6 = eVar3;
                                    if (z4) {
                                        CrossBorderEasyBankTransferFlowContract$Step.Iban iban = (CrossBorderEasyBankTransferFlowContract$Step.Iban) step9;
                                        eVar6.M2(iban.f72829a, iban.f72830b, ((vn6.e) result3).f290761a);
                                    } else {
                                        if (!(result3 instanceof f.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar6.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    createMandateScreen.H = block21;
                    return createMandateScreen;
                }
                if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.Instructions) {
                    CrossBorderEasyBankTransferFlowContract$Step.Instructions instructions = (CrossBorderEasyBankTransferFlowContract$Step.Instructions) step9;
                    InstructionsScreen instructionsScreen = new InstructionsScreen(new gn6.e(instructions.f72838c, instructions.f72836a, new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.a(step9, eVar3, null)));
                    final int i66 = 3;
                    Function1 block22 = new Function1() { // from class: em6.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i66) {
                                case 0:
                                    dii.g outputData = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof dii.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                    if (z) {
                                        eVar4.J2(p.a.f296659a);
                                    } else if (outputData instanceof dii.f) {
                                        eVar4.J2(p.b.f296660a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    dii.g outputData2 = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof dii.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                    if (z3) {
                                        eVar5.J2(p.a.f296659a);
                                    } else if (outputData2 instanceof dii.f) {
                                        eVar5.J2(p.b.f296660a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    dii.g outputData3 = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z4 = outputData3 instanceof dii.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar6 = eVar3;
                                    if (z4) {
                                        eVar6.J2(p.a.f296659a);
                                    } else if (outputData3 instanceof dii.f) {
                                        eVar6.J2(p.b.f296660a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    we6.g0 result = (we6.g0) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z6 = result instanceof g0.a;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar7 = eVar3;
                                    if (z6) {
                                        eVar7.B2();
                                    } else {
                                        if (!(result instanceof we6.h0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar7.C1(new ExternalDestination.Browser(((we6.h0) result).f296645a, null));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    instructionsScreen.H = block22;
                    return instructionsScreen;
                }
                final int i74 = 3;
                if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.Iban) {
                    IbanScreen ibanScreen = new IbanScreen(((CrossBorderEasyBankTransferFlowContract$Step.Iban) step9).f72831c);
                    Function1 block23 = new Function1() { // from class: em6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i74) {
                                case 0:
                                    dii.g outputData = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        eVar3.J2(new q(((CrossBorderEasyBankTransferFlowContract$Step.DifferentCurrencyBottomSheet) step9).f72828a));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    r0 result = (r0) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof r0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CrossBorderEasyBankTransferFlowContract$Step.CreateMandate createMandate = (CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9;
                                    String str2 = createMandate.f72825a;
                                    String str3 = createMandate.f72826b;
                                    boolean z = createMandate.f72827c;
                                    String str4 = createMandate.d;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                    eVar4.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.c(eVar4, str2, str3, z, str4, null), new whi.b(6));
                                    return Unit.f186387a;
                                case 2:
                                    we6.m result2 = (we6.m) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof we6.m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CrossBorderEasyBankTransferFlowContract$Step.CreateMandate createMandate2 = (CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9;
                                    String str5 = createMandate2.f72825a;
                                    String str6 = createMandate2.f72826b;
                                    boolean z3 = createMandate2.f72827c;
                                    String str7 = createMandate2.d;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                    eVar5.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.c(eVar5, str5, str6, z3, str7, null), new whi.b(6));
                                    return Unit.f186387a;
                                default:
                                    vn6.f result3 = (vn6.f) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof vn6.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar6 = eVar3;
                                    if (z4) {
                                        CrossBorderEasyBankTransferFlowContract$Step.Iban iban = (CrossBorderEasyBankTransferFlowContract$Step.Iban) step9;
                                        eVar6.M2(iban.f72829a, iban.f72830b, ((vn6.e) result3).f290761a);
                                    } else {
                                        if (!(result3 instanceof f.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar6.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    ibanScreen.H = block23;
                    return ibanScreen;
                }
                if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.DifferentCurrencyBottomSheet) {
                    CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData = ((CrossBorderEasyBankTransferFlowContract$Step.DifferentCurrencyBottomSheet) step9).f72828a;
                    String institutionName = crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.getF72258b();
                    String institutionCurrencyCode = crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.getD().f306286a;
                    AnalyticsProduct analyticsProduct = crossBorderEasyBankTransferFlowContract$InputData.d;
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(institutionName, "institutionName");
                    Intrinsics.checkNotNullParameter(institutionCurrencyCode, "institutionCurrencyCode");
                    Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_currency_unsupported_title, zhm.v.k(institutionName, institutionCurrencyCode), null, 12), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_currency_unsupported_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_currency_unsupported_change_currency, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct, null, null, 24));
                    final int i92 = 0;
                    Function1 block24 = new Function1() { // from class: em6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i92) {
                                case 0:
                                    dii.g outputData = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        eVar3.J2(new q(((CrossBorderEasyBankTransferFlowContract$Step.DifferentCurrencyBottomSheet) step9).f72828a));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    r0 result = (r0) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof r0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CrossBorderEasyBankTransferFlowContract$Step.CreateMandate createMandate = (CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9;
                                    String str2 = createMandate.f72825a;
                                    String str3 = createMandate.f72826b;
                                    boolean z = createMandate.f72827c;
                                    String str4 = createMandate.d;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                    eVar4.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.c(eVar4, str2, str3, z, str4, null), new whi.b(6));
                                    return Unit.f186387a;
                                case 2:
                                    we6.m result2 = (we6.m) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof we6.m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CrossBorderEasyBankTransferFlowContract$Step.CreateMandate createMandate2 = (CrossBorderEasyBankTransferFlowContract$Step.CreateMandate) step9;
                                    String str5 = createMandate2.f72825a;
                                    String str6 = createMandate2.f72826b;
                                    boolean z3 = createMandate2.f72827c;
                                    String str7 = createMandate2.d;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                    eVar5.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.c(eVar5, str5, str6, z3, str7, null), new whi.b(6));
                                    return Unit.f186387a;
                                default:
                                    vn6.f result3 = (vn6.f) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof vn6.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar6 = eVar3;
                                    if (z4) {
                                        CrossBorderEasyBankTransferFlowContract$Step.Iban iban = (CrossBorderEasyBankTransferFlowContract$Step.Iban) step9;
                                        eVar6.M2(iban.f72829a, iban.f72830b, ((vn6.e) result3).f290761a);
                                    } else {
                                        if (!(result3 instanceof f.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar6.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    actionsBottomSheetController.H = block24;
                } else {
                    if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.InstitutionNotAvailableDialog) {
                        CrossBorderEasyBankTransferFlowContract$Step.InstitutionNotAvailableDialog institutionNotAvailableDialog = (CrossBorderEasyBankTransferFlowContract$Step.InstitutionNotAvailableDialog) step9;
                        return new ActionsBottomSheetController(((fn6.a) eVar3.u).a(crossBorderEasyBankTransferFlowContract$InputData.d, institutionNotAvailableDialog.f72832a, institutionNotAvailableDialog.f72833b));
                    }
                    if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.InstitutionNotListedDialog) {
                        k9 value2 = k9.OpenBanking;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value2, "value");
                        AnalyticsProduct.Retail analyticsProduct2 = new AnalyticsProduct.Retail(value2);
                        bVar6.getClass();
                        Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
                        ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_bank_not_in_list, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_bank_not_in_list_subtitle, null, null, 14), null, null, false, 28), fm6.b.a(), analyticsProduct2, null, null, 24));
                        final int i96 = 0;
                        Function1 block25 = new Function1() { // from class: em6.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i96) {
                                    case 0:
                                        dii.g outputData = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z = outputData instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                        if (z) {
                                            eVar4.J2(p.a.f296659a);
                                        } else if (outputData instanceof dii.f) {
                                            eVar4.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g outputData2 = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        boolean z3 = outputData2 instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                        if (z3) {
                                            eVar5.J2(p.a.f296659a);
                                        } else if (outputData2 instanceof dii.f) {
                                            eVar5.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g outputData3 = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        boolean z4 = outputData3 instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar6 = eVar3;
                                        if (z4) {
                                            eVar6.J2(p.a.f296659a);
                                        } else if (outputData3 instanceof dii.f) {
                                            eVar6.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        we6.g0 result = (we6.g0) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z6 = result instanceof g0.a;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar7 = eVar3;
                                        if (z6) {
                                            eVar7.B2();
                                        } else {
                                            if (!(result instanceof we6.h0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar7.C1(new ExternalDestination.Browser(((we6.h0) result).f296645a, null));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block25, "block");
                        actionsBottomSheetController3.H = block25;
                        return actionsBottomSheetController3;
                    }
                    if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.CountryNotListedDialog) {
                        k9 value3 = k9.OpenBanking;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        AnalyticsProduct.Retail analyticsProduct3 = new AnalyticsProduct.Retail(value3);
                        bVar6.getClass();
                        Intrinsics.checkNotNullParameter(analyticsProduct3, "analyticsProduct");
                        ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_country_selection_country_not_in_list, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_country_selection_country_not_in_list_subtitle, null, null, 14), null, null, false, 28), fm6.b.a(), analyticsProduct3, null, null, 24));
                        Function1 block26 = new Function1() { // from class: em6.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i3) {
                                    case 0:
                                        dii.g outputData = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z = outputData instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                        if (z) {
                                            eVar4.J2(p.a.f296659a);
                                        } else if (outputData instanceof dii.f) {
                                            eVar4.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g outputData2 = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        boolean z3 = outputData2 instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                        if (z3) {
                                            eVar5.J2(p.a.f296659a);
                                        } else if (outputData2 instanceof dii.f) {
                                            eVar5.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g outputData3 = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        boolean z4 = outputData3 instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar6 = eVar3;
                                        if (z4) {
                                            eVar6.J2(p.a.f296659a);
                                        } else if (outputData3 instanceof dii.f) {
                                            eVar6.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        we6.g0 result = (we6.g0) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z6 = result instanceof g0.a;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar7 = eVar3;
                                        if (z6) {
                                            eVar7.B2();
                                        } else {
                                            if (!(result instanceof we6.h0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar7.C1(new ExternalDestination.Browser(((we6.h0) result).f296645a, null));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block26, "block");
                        actionsBottomSheetController4.H = block26;
                        return actionsBottomSheetController4;
                    }
                    if (step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.BranchNotListedDialog) {
                        k9 value4 = k9.OpenBanking;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value4, "value");
                        AnalyticsProduct.Retail analyticsProduct4 = new AnalyticsProduct.Retail(value4);
                        bVar6.getClass();
                        Intrinsics.checkNotNullParameter(analyticsProduct4, "analyticsProduct");
                        ActionsBottomSheetController actionsBottomSheetController5 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_branch_not_in_list, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_branch_not_in_list_subtitle, null, null, 14), null, null, false, 28), fm6.b.a(), analyticsProduct4, null, null, 24));
                        final int i99 = 2;
                        Function1 block27 = new Function1() { // from class: em6.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i99) {
                                    case 0:
                                        dii.g outputData = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z = outputData instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                        if (z) {
                                            eVar4.J2(p.a.f296659a);
                                        } else if (outputData instanceof dii.f) {
                                            eVar4.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g outputData2 = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        boolean z3 = outputData2 instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                        if (z3) {
                                            eVar5.J2(p.a.f296659a);
                                        } else if (outputData2 instanceof dii.f) {
                                            eVar5.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g outputData3 = (dii.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        boolean z4 = outputData3 instanceof dii.e;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar6 = eVar3;
                                        if (z4) {
                                            eVar6.J2(p.a.f296659a);
                                        } else if (outputData3 instanceof dii.f) {
                                            eVar6.J2(p.b.f296660a);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        we6.g0 result = (we6.g0) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z6 = result instanceof g0.a;
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar7 = eVar3;
                                        if (z6) {
                                            eVar7.B2();
                                        } else {
                                            if (!(result instanceof we6.h0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar7.C1(new ExternalDestination.Browser(((we6.h0) result).f296645a, null));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block27, "block");
                        actionsBottomSheetController5.H = block27;
                        return actionsBottomSheetController5;
                    }
                    if (!(step9 instanceof CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CrossBorderCountryDepartmentUiModel crossBorderCountryDepartmentUiModel = ((CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog) step9).d;
                    String str2 = crossBorderCountryDepartmentUiModel.f72903c;
                    String str3 = crossBorderCountryDepartmentUiModel.f72902b;
                    AnalyticsProduct analyticsProduct5 = crossBorderEasyBankTransferFlowContract$InputData.d;
                    aVar4.getClass();
                    actionsBottomSheetController = new ActionsBottomSheetController(fm6.a.a(analyticsProduct5, str2, str3));
                    final int i100 = 0;
                    Function1 block28 = new Function1() { // from class: em6.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i100) {
                                case 0:
                                    dii.g outputData = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof dii.e;
                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar4 = eVar3;
                                    CrossBorderEasyBankTransferFlowContract$Step crossBorderEasyBankTransferFlowContract$Step = step9;
                                    if (z) {
                                        CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog = (CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog) crossBorderEasyBankTransferFlowContract$Step;
                                        eVar4.L2(takeUserRegionForGlobalBankDialog.d, takeUserRegionForGlobalBankDialog.f72840b, takeUserRegionForGlobalBankDialog.f72841c);
                                    } else if (outputData instanceof dii.f) {
                                        CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog2 = (CrossBorderEasyBankTransferFlowContract$Step.TakeUserRegionForGlobalBankDialog) crossBorderEasyBankTransferFlowContract$Step;
                                        oki.h.t2(eVar4, LazyFlowCoordinator2, new CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments(takeUserRegionForGlobalBankDialog2.f72839a, takeUserRegionForGlobalBankDialog2.f72840b, takeUserRegionForGlobalBankDialog2.f72841c), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ho6.j result = (ho6.j) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof ho6.k) {
                                        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar5 = eVar3;
                                        im6.a aVar5 = eVar5.f72856w;
                                        se6.i iVar2 = ((ho6.k) result).f154233a;
                                        aVar5.getClass();
                                        CrossBorderCountryDepartmentUiModel crossBorderCountryDepartmentUiModelA = im6.a.a(iVar2);
                                        CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments countryDepartments = (CrossBorderEasyBankTransferFlowContract$Step.CountryDepartments) step9;
                                        eVar5.L2(crossBorderCountryDepartmentUiModelA, countryDepartments.f72822b, countryDepartments.f72823c);
                                    } else {
                                        if (!(result instanceof j.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(LazyFlowCoordinator2, CrossBorderEasyBankTransferFlowContract$Step.CountryNotListedDialog.f72824a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    fo6.k result2 = (fo6.k) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof fo6.l) {
                                        se6.h hVar = ((fo6.l) result2).f136832a;
                                        CrossBorderEasyBankTransferFlowContract$Step.Branches branches = (CrossBorderEasyBankTransferFlowContract$Step.Branches) step9;
                                        String str22 = branches.f72818a;
                                        String str32 = branches.f72819b;
                                        boolean z3 = branches.f72820c;
                                        eVar3.K2(new CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Branch(hVar.f262133a, hVar.f262134b, hVar.f262135c, branches.d, str22, str32, z3, branches.e));
                                    } else {
                                        if (!(result2 instanceof k.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(LazyFlowCoordinator2, CrossBorderEasyBankTransferFlowContract$Step.BranchNotListedDialog.f72817a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block28, "block");
                    actionsBottomSheetController.H = block28;
                }
                return actionsBottomSheetController;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new en8.i(iii.c.b(null, "ERROR_STATE_ID", 4, true), en8.p.a((JuniorBankingProfile) ((en8.e) obj4).f127764b.getContent()), null, f0.f322471a);
            case 15:
                com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.c cVar = (com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.c) obj4;
                le6.c cVar2 = cVar.f73072q;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                AkahuFlowContract$Step step10 = (AkahuFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (Intrinsics.f(step10, AkahuFlowContract$Step.AkahuProductArticle.f73067a)) {
                    ViewController viewControllerE17 = cVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(AkahuProductArticleKey.ONBOARDING)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 56));
                    eed.j block29 = new eed.j(cVar, LazyFlowCoordinator3, 25);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    viewControllerE17.H = block29;
                    return viewControllerE17;
                }
                if (step10 instanceof AkahuFlowContract$Step.InstitutionAlreadyLinkErrorDialog) {
                    String str4 = ((AkahuFlowContract$Step.InstitutionAlreadyLinkErrorDialog) step10).f73068a;
                    k9 k9Var3 = k9.Topup;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController2 = new ActionsBottomSheetController(((fn6.b) cVar2).a(str4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3)));
                    dph.c block30 = new dph.c(cVar, LazyFlowCoordinator3, 3);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    actionsBottomSheetController2.H = block30;
                } else if (step10 instanceof AkahuFlowContract$Step.InstitutionLinkLimitErrorDialog) {
                    int i101 = ((AkahuFlowContract$Step.InstitutionLinkLimitErrorDialog) step10).f73069a;
                    k9 k9Var4 = k9.Topup;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator8 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController2 = new ActionsBottomSheetController(((fn6.b) cVar2).b(i101, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4)));
                    dph.c block31 = new dph.c(cVar, LazyFlowCoordinator3, 4);
                    Intrinsics.checkNotNullParameter(block31, "block");
                    actionsBottomSheetController2.H = block31;
                } else {
                    if (!(step10 instanceof AkahuFlowContract$Step.InstitutionOffLineErrorDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k9 k9Var5 = k9.Topup;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator9 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController2 = new ActionsBottomSheetController(((fn6.b) cVar2).c(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5)));
                    dph.c block32 = new dph.c(cVar, LazyFlowCoordinator3, i2);
                    Intrinsics.checkNotNullParameter(block32, "block");
                    actionsBottomSheetController2.H = block32;
                }
                return actionsBottomSheetController2;
            case 16:
                com.revolut.feature.bank_account_switching.impl.ui.review_joint.a aVar5 = (com.revolut.feature.bank_account_switching.impl.ui.review_joint.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SwitchInJointReviewScreenContract$ModalStep step11 = (SwitchInJointReviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof SwitchInJointReviewScreenContract$ModalStep.TermsAndConditions)) {
                    throw new NoWhenBranchMatchedException();
                }
                TermsAndConditionsScreen termsAndConditionsScreen = new TermsAndConditionsScreen(new TermsAndConditionsScreenContract$InputData(((SwitchInJointReviewScreenContract$ModalStep.TermsAndConditions) step11).f63979a));
                ei8.d block33 = new ei8.d(aVar5, 25);
                Intrinsics.checkNotNullParameter(block33, "block");
                termsAndConditionsScreen.H = block33;
                return termsAndConditionsScreen;
            case 17:
                com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d) obj4;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                CreditCardWithdrawalFlowContract$Step step12 = (CreditCardWithdrawalFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof CreditCardWithdrawalFlowContract$Step.Prompt) {
                    CreditCardCancellationPrompt creditCardCancellationPrompt = ((CreditCardWithdrawalFlowContract$Step.Prompt) step12).f69154a;
                    TextClause textClause = new TextClause(creditCardCancellationPrompt.f68710a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause2 = new TextClause(creditCardCancellationPrompt.f68711b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    CdnImage cdnImageC2 = com.revolut.core.ui_kit_core.displayers.image.models.b.c(creditCardCancellationPrompt.f68712c, null, null, null, 30);
                    ResourceImage resourceImage2 = null;
                    String str5 = null;
                    ResourceImage resourceImage3 = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    CreditCardLargeButtonModel creditCardLargeButtonModel = creditCardCancellationPrompt.d;
                    boolean z = false;
                    PromptMarketingContentDelegate.Model.Button button2 = new PromptMarketingContentDelegate.Model.Button(new TextClause(creditCardLargeButtonModel.f68844a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), resourceImage2, lt4.g.a(creditCardLargeButtonModel.f68846c), z, str5, 54);
                    CreditCardLargeButtonModel creditCardLargeButtonModel2 = creditCardCancellationPrompt.e;
                    PromptMarketingScreen promptMarketingScreen4 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textClause, textClause2, cdnImageC2, null, null, resourceImage3, null, button2, new PromptMarketingContentDelegate.Model.Button(new TextClause(creditCardLargeButtonModel2.f68844a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), resourceImage2, lt4.g.a(creditCardLargeButtonModel2.f68846c), z, str5, 54), null, null, null, null, null, 65112));
                    eq4.c block34 = new eq4.c(dVar, LazyFlowCoordinator4, 0);
                    Intrinsics.checkNotNullParameter(block34, "block");
                    promptMarketingScreen4.H = block34;
                    return promptMarketingScreen4;
                }
                if (!(step12 instanceof CreditCardWithdrawalFlowContract$Step.Dialog)) {
                    if (!(step12 instanceof CreditCardWithdrawalFlowContract$Step.CancellationDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen = new CreditCardTerminatedRepaymentScreen(new CreditCardTerminatedRepaymentScreenContract$InputData(dVar.f69158s.f69149a, ((CreditCardWithdrawalFlowContract$Step.CancellationDetails) step12).f69152a));
                    dph.c block35 = new dph.c(dVar, LazyFlowCoordinator4, 6);
                    Intrinsics.checkNotNullParameter(block35, "block");
                    creditCardTerminatedRepaymentScreen.H = block35;
                    return creditCardTerminatedRepaymentScreen;
                }
                lt4.d dVar2 = dVar.f69156q;
                CreditCardDialogModel dialogModel = ((CreditCardWithdrawalFlowContract$Step.Dialog) step12).f69153a;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
                CreditCardBottomSheetController creditCardBottomSheetController = new CreditCardBottomSheetController(new CreditCardDialog$InputData.PreLoadedContent(dialogModel));
                ei8.d block36 = new ei8.d(dVar, 29);
                Intrinsics.checkNotNullParameter(block36, "block");
                creditCardBottomSheetController.H = block36;
                return creditCardBottomSheetController;
            case 18:
                eq5.e0 e0Var = (eq5.e0) obj4;
                CenteredAmountDelegate.Model data3 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                Intrinsics.checkNotNullParameter(data3, "data");
                Intrinsics.checkNotNullParameter(field3, "field");
                eq5.d0 d0Var = new eq5.d0(e0Var, data3);
                Object obj7 = data3.f51981p;
                d1 d1Var = obj7 instanceof d1 ? (d1) obj7 : null;
                xi0.b bVar7 = d1Var != null ? d1Var.f299113a : null;
                if (bVar7 != null) {
                    return new zp0.d(field3.getEditText(), bVar7, (u80.d) e0Var.f128265b.getValue(), null, d0Var, false, false, 0, false, null, 1928);
                }
                return null;
            case 19:
                return a(obj2, obj3);
            case 20:
                String productId = (String) obj2;
                pjb.c data4 = (pjb.c) obj3;
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(data4, "data");
                ((eqb.b) obj4).f128418b.f(eqb.b.a(productId), data4);
                return Unit.f186387a;
            case 21:
                com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.a aVar6 = (com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                NewCollectionScreenContract$ModalStep step13 = (NewCollectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof NewCollectionScreenContract$ModalStep.SaveScreener)) {
                    throw new NoWhenBranchMatchedException();
                }
                NewCollectionScreenContract$ModalStep.SaveScreener saveScreener = (NewCollectionScreenContract$ModalStep.SaveScreener) step13;
                SaveScreenerCollectionScreen saveScreenerCollectionScreen = new SaveScreenerCollectionScreen(new NewScreenerScreenContract$Input(saveScreener.f96252a, saveScreener.f96253b, saveScreener.f96254c));
                eq4.g block37 = new eq4.g(aVar6, i2);
                Intrinsics.checkNotNullParameter(block37, "block");
                saveScreenerCollectionScreen.H = block37;
                return saveScreenerCollectionScreen;
            case 22:
                return b(obj2, obj3);
            case 23:
                return c(obj2, obj3);
            case 24:
                return d(obj2, obj3);
            case 25:
                return e(obj2, obj3);
            case 26:
                com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.a aVar7 = (com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.a) obj4;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                MerchantRedirectFlowContract$Step step14 = (MerchantRedirectFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof MerchantRedirectFlowContract$Step.MerchantRedirectDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                MerchantRedirectDialogController merchantRedirectDialogController = new MerchantRedirectDialogController(new MerchantRedirectDialogControllerContract$InputData(((MerchantRedirectFlowContract$Step.MerchantRedirectDialog) step14).f90402a));
                merchantRedirectDialogController.l2(new dld.c(aVar7, LazyFlowCoordinator5, 1));
                eq4.c block38 = new eq4.c(aVar7, LazyFlowCoordinator5, 16);
                Intrinsics.checkNotNullParameter(block38, "block");
                merchantRedirectDialogController.H = block38;
                return merchantRedirectDialogController;
            case 27:
                SetOverallBudgetScreen setOverallBudgetScreen = (SetOverallBudgetScreen) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field4 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr3 = SetOverallBudgetScreen.g0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field4, "field");
                Object obj8 = model.f51981p;
                xi0.b bVar8 = obj8 instanceof xi0.b ? (xi0.b) obj8 : null;
                if (bVar8 == null) {
                    return null;
                }
                MaskedTextInputEditText editText3 = field4.getEditText();
                qd0.b bVarN = ((erj.m) setOverallBudgetScreen.f101561e0.getValue()).f128722b.e.n();
                vc.s.j(bVarN);
                return new zp0.d(editText3, bVar8, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1976);
            case 28:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new esj.x((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), f0.f322471a, false, false, null, ((esj.f0) obj4).b());
            default:
                com.revolut.feature.call_security_info.impl.ui.call_detection.b bVar9 = (com.revolut.feature.call_security_info.impl.ui.call_detection.b) obj4;
                wt2.c cVar3 = bVar9.f64374r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CallDetectionScreenContract$Step step15 = (CallDetectionScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof CallDetectionScreenContract$Step.ProductArticle) {
                    cVar3.getClass();
                    ProductArticleParams productArticleParams2 = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(RetailCallSecurityProductArticleKey.PERMISSIONS));
                    cVar3.getClass();
                    k9 k9Var6 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator10 = AnalyticsProduct.Retail.CREATOR;
                    return bVar9.e1(new ProductArticleDescriptor(productArticleParams2, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, false, 48));
                }
                if (!(step15 instanceof CallDetectionScreenContract$Step.RequestPhonePermission)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(zhm.u.c(new PermissionsControllerContract$Permission("android.permission.READ_PHONE_STATE", null, null, false, 6))));
                eu2.g block39 = new eu2.g(bVar9, i3);
                Intrinsics.checkNotNullParameter(block39, "block");
                permissionsController.H = block39;
                return permissionsController;
        }
    }

    public /* synthetic */ s(Object obj2, Object obj3, int i) {
        this.f125727a = i;
        this.f125728b = obj3;
    }
}
