package kj4;

import android.net.Uri;
import android.os.Parcelable;
import aqd.e0;
import aqd.f0;
import aqd.g0;
import aw0.e;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import bmj.e;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import com.revolut.biometric_verification.api.models.FaceDetectionResource;
import com.revolut.biometric_verification.api.models.FaceQualityResource;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationSelfieStepFlowProvider$InputData;
import com.revolut.biometric_verification.common.api.factory.BiometricVerificationSelfieIntroScreenFactory$InputData;
import com.revolut.biometric_verification.common.impl.selfie.intro.BiometricVerificationSelfieIntroScreen;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.digits_selfie_intro.BiometricVerificationActiveLivenessDigitsSelfieIntroScreen;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.digits_selfie_intro.BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.submit_confirmation.SubmitConfirmationScreen;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.submit_confirmation.SubmitConfirmationScreenContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.intro.BiometricVerificationActiveLivenessIntroScreen;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.intro.BiometricVerificationActiveLivenessIntroScreenContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation.BiometricVerificationActiveLivenessVideoConfirmationScreen;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation.BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.selfie.flow.BiometricVerificationSelfieStepFlowContract$Step;
import com.revolut.camerakit.client.api.models.AnimationType;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.client.api.models.HintMessage;
import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlow;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.R$color;
import com.revolut.camerakit.validators.config.FaceQualityValidatorConfig;
import com.revolut.camerakit.validators.config.ObjectPositionValidatorConfig;
import com.revolut.camerakit.validators.config.ValidatorConfig;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.BrebQrRequestAddDetailsScreen;
import com.revolut.feature.card_management.impl.ui.kompot.replace.dialog.CardReplaceTerminateDialogController;
import com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.CardReplaceExpectationsContract$ModalStep;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.SelfieIntroFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.SelfieIntroRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow.RecommendedValuatorsFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.modal_flow.RecommendedValuatorsModalFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.AdditionalCardsCardholderDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.AdditionalCardsCardholderDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreen;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.CreditCardTransactionsFlow;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.CreditCardTransactionsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import com.revolut.feature.credit.health.api.models.CreditScore;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreDetails;
import com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationContract$Step;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.CurrencyChooserFlow;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.kyc.impl.external.ExternalKycPromptConfiguration;
import com.revolut.feature.kyc.impl.external.app.flow.ExternalAppKycProviderFlowContract$Step;
import com.revolut.feature.kyc.impl.incode.flow.IncodeFlowContract$InputData;
import com.revolut.feature.kyc.impl.incode.flow.IncodeFlowContract$Step;
import com.revolut.feature.kyc.impl.incode.screen.IncodeScreen;
import com.revolut.feature.kyc.impl.incode.screen.IncodeScreenContract$InputData;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlow;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlowContract$InputData;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pay_later.impl.ui.repayamount.PayLaterRepayAmountScreen;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$InputData;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$Step;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreenContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations_execution.IncomeSorterDestinationsExecutionContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations_execution.IncomeSorterDestinationsExecutionController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer.IncomeSorterTransferDestinationsFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.list.IncomeSortersListController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.IncomeSorterCreationScenario;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlow;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$InputData;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlow;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract$ModalStep;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.cash_deposit.CashDepositTopupFlowContract$Step;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreenContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$ModalStep;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.close_connections_bottom_sheet.CloseConnectionsBottomSheet;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreenContract$ModalStep;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions.ReviewClosureConditionsBottomSheetController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreenContract$ModalStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowControllerDescriptor$InputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsFlowContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsFlowContract$Step;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.ConnectedClientScreen;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.ConnectedClientScreenContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.ConnectedClientDisconnectBottomSheet;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.ConnectedClientDisconnectBottomSheetContract$InputData;
import com.revolut.tracking.v3.CameraCaptureContext;
import com.revolut.tracking.v3.VisionVerificationContext;
import eii.j;
import eii.k;
import grl.f1;
import grl.j1;
import grl.k9;
import grl.r2;
import ix0.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kjd.n;
import kl.c0;
import koe.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kp0.q;
import kv7.g;
import kze.i;
import lmj.c;
import nq.t;
import oi9.m;
import oki.h;
import org.jmrtd.lds.LDSFile;
import pu.d;
import rp0.k1;
import tw8.f;
import vc.s;
import vkm.j2;
import yki.l;
import zh9.u0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f184289b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f184288a = i;
        this.f184289b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        Object next;
        Object next2;
        Object cVar;
        ViewController viewControllerE1;
        com.revolut.biometric_verification.impl.ui.step.selfie.flow.c cVar2 = (com.revolut.biometric_verification.impl.ui.step.selfie.flow.c) this.f184289b;
        BiometricVerificationSelfieStepFlowProvider$InputData inputData = cVar2.v;
        l FlowCoordinator = (l) obj2;
        BiometricVerificationSelfieStepFlowContract$Step step = (BiometricVerificationSelfieStepFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BiometricVerificationSelfieStepFlowContract$Step.Intro) {
            BiometricVerificationSelfieStepFlowContract$Step.Intro intro = (BiometricVerificationSelfieStepFlowContract$Step.Intro) step;
            i5j.a aVar = cVar2.f50656s;
            pu.a aVar2 = inputData.f50460b;
            if (aVar2 instanceof nv3.a) {
                l24.c cVar3 = aVar.f158845a;
                nv3.a biometricPayload = (nv3.a) aVar2;
                Intrinsics.checkNotNullParameter(biometricPayload, "biometricPayload");
                cVar = new d(aVar2, new SelfieIntroRootFlow(new SelfieIntroFlowContract$InputData(new CreditApplicationPluginFlowContract$Configuration("", biometricPayload.f219454a, r2.UNRECOGNIZED, biometricPayload.f219455b, biometricPayload.f219456c, biometricPayload.d, ks3.b.SELFIE_CHECK, null, true, true, null, false, null, null, null, null))));
            } else {
                aVar.getClass();
                cVar = aVar2 instanceof sd9.a ? new pu.c(new sd9.b(((sd9.a) aVar2).f261834a)) : pu.b.f239781a;
            }
            if (cVar instanceof pu.b) {
                uq.a aVar3 = cVar2.f50654q;
                BiometricVerificationSelfieIntroScreenFactory$InputData inputData2 = new BiometricVerificationSelfieIntroScreenFactory$InputData(intro.f50652a, new AnalyticsContext(inputData.d), AnalyticsProduct.Shared.Vision.f);
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                viewControllerE1 = new BiometricVerificationSelfieIntroScreen(inputData2);
            } else if (cVar instanceof d) {
                viewControllerE1 = ((d) cVar).f239784b;
            } else {
                if (!(cVar instanceof pu.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                viewControllerE1 = cVar2.e1(((pu.c) cVar).f239782a);
            }
            com.revolut.biometric_verification.impl.ui.step.selfie.flow.b block = new com.revolut.biometric_verification.impl.ui.step.selfie.flow.b(1, 0, com.revolut.biometric_verification.impl.ui.step.selfie.flow.c.class, cVar2, "handleIntroScreenResult", "handleIntroScreenResult(Lcom/revolut/biometric_verification/models/BiometricVerificationSelfieIntroResult$OutputData;)V");
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof BiometricVerificationSelfieStepFlowContract$Step.Camera)) {
            throw new NoWhenBranchMatchedException();
        }
        BiometricVerificationSelfieStepFlowContract$Step.Camera camera = (BiometricVerificationSelfieStepFlowContract$Step.Camera) step;
        boolean zA = cVar2.u.a(px.a.f240493g);
        CameraKitFlowContract$FlowType.Selfie selfie = new CameraKitFlowContract$FlowType.Selfie(0);
        CameraKitUiSettings cameraKitUiSettings = new CameraKitUiSettings(zA ? new Mask.FaceZebra(R$color.camera_kit_zebra_accent, R$color.camera_kit_white, R$color.camera_kit_black, 17) : new Mask.Face(R$color.camera_kit_lightBlue, R$color.camera_kit_white, R$color.camera_kit_black, 17), HintMessage.Face.f50725a, (AnimationType) null, 10);
        BiometricVerificationStep.Selfie selfie2 = inputData.f50459a;
        CameraKitClientSettings cameraKitClientSettings = new CameraKitClientSettings(selfie2.f50410c, selfie2.f50409b, true);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.autocapture_selfie_title, null, null, 14);
        cVar2.f50657t.getClass();
        lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.camera_capture_tips_selfie_title, null, null, 14), null, null, null, false, 30);
        ProgressStyle progressStyle = null;
        List listK = v.k(new RowDelegate.Model("FACE_LIGHTNING_FAQ_ROW_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, progressStyle, false, null, false, 60), new TextLocalisedClause(R$string.camera_capture_tips_selfie_lighting_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.camera_capture_tips_selfie_lighting_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("FACE_POSITION_FAQ_ROW_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, progressStyle, false, null, false, 60), new TextLocalisedClause(R$string.camera_capture_tips_selfie_place_right_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.camera_capture_tips_selfie_place_right_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("CLEAR_FACE_FAQ_ROW_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_20_keyboard_emoji, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, progressStyle, false, null, false, 60), new TextLocalisedClause(R$string.camera_capture_tips_selfie_dont_cover_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.camera_capture_tips_selfie_dont_cover_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R$string.camera_capture_tips_dismiss, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        AnalyticsProduct.Shared.Vision vision = AnalyticsProduct.Shared.Vision.f;
        ry.a aVar5 = new ry.a(textLocalisedClause, null, new ty.c(aVar4, eVar, listK, vision), false, false, false, false, 122);
        w0 w0Var = inputData.d;
        CameraCaptureSettings cameraCaptureSettings = selfie2.f50410c;
        List list = selfie2.f50408a;
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
        CameraCaptureContext.a aVarNewBuilder = CameraCaptureContext.newBuilder();
        aVarNewBuilder.h(f1.AUTOCAPTURE);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setFlowType(...)");
        cs.b.a(aVarNewBuilder, cameraCaptureSettings);
        aVarNewBuilder.i(j1.SELFIE);
        CameraCaptureContext cameraCaptureContext = (CameraCaptureContext) aVarNewBuilder.a();
        w0 w0VarA = cameraCaptureContext;
        if (w0Var instanceof VisionVerificationContext) {
            VisionVerificationContext.a aVar6 = (VisionVerificationContext.a) ((VisionVerificationContext) w0Var).toBuilder();
            VisionVerificationContext.Inner_context.a aVarNewBuilder2 = VisionVerificationContext.Inner_context.newBuilder();
            aVarNewBuilder2.h(cameraCaptureContext);
            aVar6.h((VisionVerificationContext.Inner_context) aVarNewBuilder2.a());
            w0VarA = aVar6.a();
        }
        AnalyticsContext.INSTANCE.getClass();
        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
        cVar2.f50655r.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof FaceQualityResource) {
                break;
            }
        }
        FaceQualityResource faceQualityResource = (FaceQualityResource) next;
        if (faceQualityResource == null) {
            throw new CameraKitException("Face quality model should be available", (Throwable) null, 6);
        }
        String str = faceQualityResource.f50445b;
        String str2 = faceQualityResource.f50446c;
        FaceQualityResource.Thresholds thresholds = faceQualityResource.d;
        ValidatorConfig[] elements = {new FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig(str, str2, new FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig.Thresholds(thresholds.f50447a, thresholds.f50448b, thresholds.f50449c, thresholds.d, thresholds.e, thresholds.f, thresholds.f50450g, thresholds.f50451h, thresholds.i, thresholds.f50452j, thresholds.k)), new ObjectPositionValidatorConfig(0.7f)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        boolean z = camera.f50651a;
        BiometricVerificationFeatures biometricVerificationFeatures = selfie2.d;
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (next2 instanceof FaceDetectionResource) {
                break;
            }
        }
        CameraKitFlow cameraKitFlow = new CameraKitFlow(new ly.c(selfie, cameraKitUiSettings, cameraKitClientSettings, aVar5, setY0, vision, w0VarA2, z, biometricVerificationFeatures, (FaceDetectionResource) next2, inputData.e), null, 6);
        com.revolut.biometric_verification.impl.ui.step.selfie.flow.a block2 = new com.revolut.biometric_verification.impl.ui.step.selfie.flow.a(1, 0, com.revolut.biometric_verification.impl.ui.step.selfie.flow.c.class, cVar2, "handleCameraFlowOutput", "handleCameraFlowOutput(Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$OutputData;)V");
        Intrinsics.checkNotNullParameter(block2, "block");
        cameraKitFlow.H = block2;
        return cameraKitFlow;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    private final Object b(Object obj2, Object obj3) {
        CreditCardTopupScreen creditCardTopupScreen = (CreditCardTopupScreen) this.f184289b;
        AmountEditDelegate.Model data = (AmountEditDelegate.Model) obj2;
        AmountEditView field = (AmountEditView) obj3;
        KProperty[] kPropertyArr = CreditCardTopupScreen.X;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = data.f51629j;
        xi0.b bVar = obj4 instanceof xi0.b ? (xi0.b) obj4 : null;
        if (bVar == null) {
            return null;
        }
        return new zp0.d(field.getEditText(), bVar, (u80.d) creditCardTopupScreen.R.getValue(), null, new c0(creditCardTopupScreen, 1), false, false, 0, false, null, 1928);
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.kyc.impl.incode.flow.a aVar = (com.revolut.feature.kyc.impl.incode.flow.a) this.f184289b;
        l FlowCoordinator = (l) obj2;
        IncodeFlowContract$Step step = (IncodeFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, IncodeFlowContract$Step.InstallFeature.f77813a)) {
            OnDemandFeatureInstallFlow onDemandFeatureInstallFlow = new OnDemandFeatureInstallFlow(new OnDemandFeatureInstallFlowContract$InputData(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_close, null, null, 14), "feature_incode_sdk"));
            final int i = 0;
            Function1 block = new Function1() { // from class: kw8.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            f result = (f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, tw8.e.f274950a);
                            com.revolut.feature.kyc.impl.incode.flow.a aVar2 = aVar;
                            if (zF) {
                                h.t2(aVar2, aVar2.f77814p, IncodeFlowContract$Step.IncodeScreen.f77812a, false, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result, tw8.d.f274949a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.B2();
                            }
                            return Unit.f186387a;
                        default:
                            ly8.b result2 = (ly8.b) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            aVar.C2(result2);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            onDemandFeatureInstallFlow.H = block;
            return onDemandFeatureInstallFlow;
        }
        if (!Intrinsics.f(step, IncodeFlowContract$Step.IncodeScreen.f77812a)) {
            throw new NoWhenBranchMatchedException();
        }
        IncodeFlowContract$InputData incodeFlowContract$InputData = aVar.o;
        IncodeScreen incodeScreen = new IncodeScreen(new IncodeScreenContract$InputData(incodeFlowContract$InputData.f77809a, incodeFlowContract$InputData.f77810b, incodeFlowContract$InputData.f77811c, incodeFlowContract$InputData.d, incodeFlowContract$InputData.e, incodeFlowContract$InputData.f));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: kw8.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        f result = (f) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean zF = Intrinsics.f(result, tw8.e.f274950a);
                        com.revolut.feature.kyc.impl.incode.flow.a aVar2 = aVar;
                        if (zF) {
                            h.t2(aVar2, aVar2.f77814p, IncodeFlowContract$Step.IncodeScreen.f77812a, false, null, false, 12);
                        } else {
                            if (!Intrinsics.f(result, tw8.d.f274949a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.B2();
                        }
                        return Unit.f186387a;
                    default:
                        ly8.b result2 = (ly8.b) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        aVar.C2(result2);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        incodeScreen.H = block2;
        return incodeScreen;
    }

    private final Object d(Object obj2, Object obj3) {
        SelectedMethod.StoredMethod.Card card = (SelectedMethod.StoredMethod.Card) this.f184289b;
        if (!((Boolean) obj2).booleanValue()) {
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Null content for external card details, while card ", card.f90903a, " selected as method"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return null;
    }

    private final Object e(Object obj2, Object obj3) {
        i iVar = (i) this.f184289b;
        l FlowCoordinator = (l) obj2;
        CashDepositTopupFlowContract$Step it8 = (CashDepositTopupFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        PermissionsFlow permissionsFlow = new PermissionsFlow(u.c(new PermissionsFlowContract$Permission("android.permission.ACCESS_FINE_LOCATION", iVar.f191111r.a(), 10)));
        kze.e eVar = new kze.e(iVar, 0);
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        permissionsFlow.J = eVar;
        return permissionsFlow;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a aVar = (com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a) this.f184289b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CardReplaceExpectationsContract$ModalStep step = (CardReplaceExpectationsContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, CardReplaceExpectationsContract$ModalStep.TerminateAndReorder.f64881a)) {
            throw new NoWhenBranchMatchedException();
        }
        CardReplaceTerminateDialogController cardReplaceTerminateDialogController = new CardReplaceTerminateDialogController();
        g block = new g(aVar, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        cardReplaceTerminateDialogController.H = block;
        return cardReplaceTerminateDialogController;
    }

    private final Object h(Object obj2, Object obj3) {
        l05.c cVar = (l05.c) this.f184289b;
        CreditScoreDetails domain = (CreditScoreDetails) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(domain, "domain");
        cVar.f191175b.f("credit-score-details-data", domain);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v169, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str;
        AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen;
        ViewController incomeSorterTransferDestinationsFlow;
        ViewController viewControllerE1;
        IncomeSorterDestinationsContract$InputData.SelectionMode remainingBalanceDestinationSelection;
        ViewController submitConfirmationScreen;
        Object next;
        Object next2;
        int i = this.f184288a;
        final int i2 = 3;
        int i3 = 14;
        final int i5 = 0;
        final int i6 = 1;
        Object obj4 = this.f184289b;
        switch (i) {
            case 0:
                com.revolut.feature.credit.application.plugins.impl.ui.valuators.modal_flow.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.valuators.modal_flow.a) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                RecommendedValuatorsModalFlowContract$Step step = (RecommendedValuatorsModalFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof RecommendedValuatorsModalFlowContract$Step.Valuators)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecommendedValuatorsFlow recommendedValuatorsFlow = new RecommendedValuatorsFlow();
                recommendedValuatorsFlow.l2(new dld.c(aVar, LazyFlowCoordinator, 5));
                return recommendedValuatorsFlow;
            case 1:
                final com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) obj4;
                l FlowCoordinator = (l) obj2;
                final CryptoReceiveWidgetCustomizationContract$Step step2 = (CryptoReceiveWidgetCustomizationContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, CryptoReceiveWidgetCustomizationContract$Step.InitialEmpty.f70909a)) {
                    return cVar.f70924x;
                }
                if (Intrinsics.f(step2, CryptoReceiveWidgetCustomizationContract$Step.CryptoOnboarded.f70908a)) {
                    CurrencyChooserFlow currencyChooserFlow = cVar.z;
                    if (currencyChooserFlow == null) {
                        Intrinsics.r("onboardedController");
                        throw null;
                    }
                    k65.d block = new k65.d(1, cVar, com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.class, "handleCurrencyChooserResult", "handleCurrencyChooserResult(Lcom/revolut/kompot/common/IOData$Output;)V", 0, 14);
                    Intrinsics.checkNotNullParameter(block, "block");
                    currencyChooserFlow.H = block;
                    return currencyChooserFlow;
                }
                if (step2 instanceof CryptoReceiveWidgetCustomizationContract$Step.SelectNetwork) {
                    com.revolut.feature.crypto.receive_widget.impl.ui.customize.e eVar = cVar.f70921s;
                    CryptoReceiveWidgetCustomizationContract$Step.SelectNetwork step3 = (CryptoReceiveWidgetCustomizationContract$Step.SelectNetwork) step2;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(step3, "step");
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(eVar.f70927a.a(step3.f70914b, null));
                    final int i21 = 0;
                    cVar.a(rowActionsBottomSheetController, new Function2() { // from class: kj5.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            oki.g onResult = (oki.g) obj5;
                            k output = (k) obj6;
                            switch (i21) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    CryptoReceiveWidgetCustomizationContract$Step.SelectNetwork selectNetwork = (CryptoReceiveWidgetCustomizationContract$Step.SelectNetwork) step2;
                                    boolean z = output instanceof eii.i;
                                    com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar2 = cVar;
                                    if (z) {
                                        Object obj7 = ((eii.i) output).f126655a;
                                        wk5.a aVar2 = obj7 instanceof wk5.a ? (wk5.a) obj7 : null;
                                        if (aVar2 == null) {
                                            onResult.pop();
                                        } else {
                                            onResult.pop();
                                            cVar2.n2(new i4g.d(27, cVar2, selectNetwork.f70913a, aVar2, selectNetwork.f70914b, null), new whi.b(6));
                                        }
                                    } else if ((output instanceof eii.e) && Intrinsics.f(((eii.e) output).f126651a.f275445a, "SELECT_NETWORK_LEARN_MORE_ID")) {
                                        cVar2.v.getClass();
                                        cVar2.C1(u0.c(new FaqFeatureConfig.Starter("question.what-is-the-cryptocurrency-network", 2)));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork mindfulOfNetwork = (CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork) step2;
                                    boolean z3 = output instanceof eii.e;
                                    com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar3 = cVar;
                                    if (z3) {
                                        if (Intrinsics.f(((eii.e) output).f126651a.f275445a, "MINDFUL_OF_NETWORK_LEARN_MORE")) {
                                            cVar3.v.getClass();
                                            cVar3.C1(u0.c(new FaqFeatureConfig.Starter("question.what-is-the-cryptocurrency-network", 2)));
                                        }
                                    } else if (output instanceof eii.g) {
                                        onResult.pop();
                                        cVar3.C2(new vj5.c(mindfulOfNetwork.f70910a, mindfulOfNetwork.f70912c, mindfulOfNetwork.f70911b));
                                    } else if (output instanceof j) {
                                        cVar3.n2(new com.revolut.feature.crypto.receive_widget.impl.ui.customize.a(cVar3, onResult, mindfulOfNetwork, null), new whi.b(6));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return rowActionsBottomSheetController;
                }
                if (!(step2 instanceof CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.crypto.receive_widget.impl.ui.customize.d dVar = cVar.f70922t;
                CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork step4 = (CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork) step2;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(step4, "step");
                mj5.b bVar = dVar.f70926a;
                Intrinsics.checkNotNullParameter(step4, "step");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.crypto.receive_widget.impl.R$string.crypto_home_widget_receive_crypto_network_modal_title, null, null, 14);
                String str2 = step4.f70910a;
                wk5.a aVar2 = step4.f70911b;
                int i22 = com.revolut.feature.crypto.receive_widget.impl.R$string.crypto_home_widget_receive_crypto_network_modal_subtitle;
                xi0.b.Companion.getClass();
                CurrencyClause currencyClauseA = d0.a(xi0.a.a(str2), null);
                ik5.a aVar3 = (ik5.a) bVar.f205924a;
                lw0.a aVar4 = new lw0.a(textLocalisedClause, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(i22, v.k(currencyClauseA, new TextLocalisedClause(aVar3.d(aVar2), null, null, 14)), null, 12), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "MINDFUL_OF_NETWORK_LEARN_MORE", false), 10))), null, null, false, 28);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(aVar3.d(aVar2), null, null, 14);
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int iC = aVar3.c(aVar2);
                int i32 = R$attr.uikit_colorAccentNeutral;
                List listC = u.c(new eii.l((Clause) textLocalisedClause2, (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.a(companion, iC, new Color.Solid(i32), new Color.ModifiedColor(new Color.Solid(i32), 0.1f), 8.0f, Float.valueOf(24.0f), 32), null, null, false, null, false, 62), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                m6 m6Var = n6.Companion;
                aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.crypto.receive_widget.impl.R$string.crypto_home_widget_receive_crypto_network_modal_secondary_action, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                k9 value = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar4, hVar, listC, new AnalyticsProduct.Retail(value), null));
                final int i33 = 1;
                cVar.a(rowActionsBottomSheetController2, new Function2() { // from class: kj5.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        oki.g onResult = (oki.g) obj5;
                        k output = (k) obj6;
                        switch (i33) {
                            case 0:
                                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                                Intrinsics.checkNotNullParameter(output, "output");
                                CryptoReceiveWidgetCustomizationContract$Step.SelectNetwork selectNetwork = (CryptoReceiveWidgetCustomizationContract$Step.SelectNetwork) step2;
                                boolean z = output instanceof eii.i;
                                com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar2 = cVar;
                                if (z) {
                                    Object obj7 = ((eii.i) output).f126655a;
                                    wk5.a aVar22 = obj7 instanceof wk5.a ? (wk5.a) obj7 : null;
                                    if (aVar22 == null) {
                                        onResult.pop();
                                    } else {
                                        onResult.pop();
                                        cVar2.n2(new i4g.d(27, cVar2, selectNetwork.f70913a, aVar22, selectNetwork.f70914b, null), new whi.b(6));
                                    }
                                } else if ((output instanceof eii.e) && Intrinsics.f(((eii.e) output).f126651a.f275445a, "SELECT_NETWORK_LEARN_MORE_ID")) {
                                    cVar2.v.getClass();
                                    cVar2.C1(u0.c(new FaqFeatureConfig.Starter("question.what-is-the-cryptocurrency-network", 2)));
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                                Intrinsics.checkNotNullParameter(output, "output");
                                CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork mindfulOfNetwork = (CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork) step2;
                                boolean z3 = output instanceof eii.e;
                                com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar3 = cVar;
                                if (z3) {
                                    if (Intrinsics.f(((eii.e) output).f126651a.f275445a, "MINDFUL_OF_NETWORK_LEARN_MORE")) {
                                        cVar3.v.getClass();
                                        cVar3.C1(u0.c(new FaqFeatureConfig.Starter("question.what-is-the-cryptocurrency-network", 2)));
                                    }
                                } else if (output instanceof eii.g) {
                                    onResult.pop();
                                    cVar3.C2(new vj5.c(mindfulOfNetwork.f70910a, mindfulOfNetwork.f70912c, mindfulOfNetwork.f70911b));
                                } else if (output instanceof j) {
                                    cVar3.n2(new com.revolut.feature.crypto.receive_widget.impl.ui.customize.a(cVar3, onResult, mindfulOfNetwork, null), new whi.b(6));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return rowActionsBottomSheetController2;
            case 2:
                com.revolut.feature.product.lifecycle.flow.a aVar5 = (com.revolut.feature.product.lifecycle.flow.a) obj4;
                ProductLifecycleFlowContract$Step step5 = (ProductLifecycleFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof ProductLifecycleFlowContract$Step.Workflow)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductLifecycleFlowContract$Step.Workflow workflow = (ProductLifecycleFlowContract$Step.Workflow) step5;
                String str3 = workflow.f81208b;
                ProductLifecycleFlowContract$InputData productLifecycleFlowContract$InputData = aVar5.o;
                ViewController viewControllerE12 = aVar5.e1(new til.c(new WorkflowControllerDescriptor$InputData(new WorkflowConfiguration.Workflow(str3, productLifecycleFlowContract$InputData.f, (NaviCommand) null, productLifecycleFlowContract$InputData.e, productLifecycleFlowContract$InputData.d, (WorkflowConfiguration.Extras) null, 36), WorkflowFlowType.Onboarding.f105818a, null, 56)));
                k79.b block2 = new k79.b(aVar5, workflow, 18);
                Intrinsics.checkNotNullParameter(block2, "block");
                viewControllerE12.H = block2;
                return viewControllerE12;
            case 3:
                com.revolut.feature.shops.impl.ui.map_view.e eVar2 = (com.revolut.feature.shops.impl.ui.map_view.e) obj4;
                l FlowCoordinator2 = (l) obj2;
                ShopsMapViewScreenContract$Step step6 = (ShopsMapViewScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof ShopsMapViewScreenContract$Step.LocationPermissions)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, null, true, 6))));
                n block3 = new n(eVar2, 1);
                Intrinsics.checkNotNullParameter(block3, "block");
                permissionsController.H = block3;
                return permissionsController;
            case 4:
                PayLaterRepayAmountScreen payLaterRepayAmountScreen = (PayLaterRepayAmountScreen) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = PayLaterRepayAmountScreen.f0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = model.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.repayamount.PayLaterRepayAmountScreenContract.InputAmountParcel");
                xi0.b bVar2 = ((kk9.i) obj5).f184538a;
                qd0.b bVarN = ((m) payLaterRepayAmountScreen.f78906b0.getValue()).f225538a.o.n();
                s.j(bVarN);
                return new zp0.d(editText, bVar2, new u80.d(((s80.b) bVarN).b()), null, new f4h.a(payLaterRepayAmountScreen, 29), false, false, 0, false, null, 1960);
            case 5:
                final com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar6 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanMyNumbersScreenContract$ModalStep step7 = (EsimMobilePlanMyNumbersScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.PhoneNumberActions) {
                    EsimMobilePlanPhoneNumberActionScreen esimMobilePlanPhoneNumberActionScreen = new EsimMobilePlanPhoneNumberActionScreen(new EsimMobilePlanPhoneNumberActionScreenContract$InputData(((EsimMobilePlanMyNumbersScreenContract$ModalStep.PhoneNumberActions) step7).f101243a));
                    kkj.n block4 = new kkj.n(aVar6, esimMobilePlanPhoneNumberActionScreen);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    esimMobilePlanPhoneNumberActionScreen.H = block4;
                    return esimMobilePlanPhoneNumberActionScreen;
                }
                if (step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.EditLabel) {
                    EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen = new EsimMobilePlanPhoneNumberLabelEditScreen(new EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData(aVar6.o.f101236a, ((EsimMobilePlanMyNumbersScreenContract$ModalStep.EditLabel) step7).f101240a));
                    kkj.n block5 = new kkj.n(aVar6, 0);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    esimMobilePlanPhoneNumberLabelEditScreen.H = block5;
                    return esimMobilePlanPhoneNumberLabelEditScreen;
                }
                if (step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.CancelPortIn) {
                    final EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = ((EsimMobilePlanMyNumbersScreenContract$ModalStep.CancelPortIn) step7).f101238a;
                    EsimMobilePlanPortingCancellationScreen esimMobilePlanPortingCancellationScreen = new EsimMobilePlanPortingCancellationScreen(new EsimMobilePlanPortingCancellationScreenContract$InputData(esimSubscriptionPhoneNumber.f100472c, EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant.PortInCancellation.f101397a));
                    final int i43 = 1;
                    Function1 block6 = new Function1() { // from class: kkj.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i43) {
                                case 0:
                                    bmj.e result = (bmj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof e.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar7 = aVar6;
                                    aVar7.l2(new p(aVar7, aVar7.o.f101236a, esimSubscriptionPhoneNumber.f100470a, null, 0), new n(aVar7, 2));
                                    return Unit.f186387a;
                                case 1:
                                    lmj.c result2 = (lmj.c) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, c.a.f197091a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber2 = esimSubscriptionPhoneNumber;
                                    String str4 = esimSubscriptionPhoneNumber2.f100470a;
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar8 = aVar6;
                                    String str5 = aVar8.o.f101236a;
                                    EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = esimSubscriptionPhoneNumber2.i;
                                    String str6 = esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100488a : null;
                                    if (str6 == null) {
                                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a.J2("Can't cancel phone number porting, portingId is null for phoneNumberId:" + str4 + " subscriptionId:" + str5);
                                    } else {
                                        aVar8.l2(new i4g.d(29, aVar8, str5, str4, str6, null), new n(aVar8, 4));
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result3 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (Intrinsics.f(result3, dii.e.f115068a)) {
                                        String str7 = esimSubscriptionPhoneNumber.f100470a;
                                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar9 = aVar6;
                                        aVar9.l2(new p(aVar9, aVar9.o.f101236a, str7, null, 1), new n(aVar9, 3));
                                    } else if (!Intrinsics.f(result3, dii.f.f115069a) && !(result3 instanceof dii.b) && !(result3 instanceof dii.c) && !(result3 instanceof dii.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    esimMobilePlanPortingCancellationScreen.H = block6;
                    return esimMobilePlanPortingCancellationScreen;
                }
                if (step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.CancelPortOut) {
                    final EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber2 = ((EsimMobilePlanMyNumbersScreenContract$ModalStep.CancelPortOut) step7).f101239a;
                    EsimMobilePlanPortingCancellationScreen esimMobilePlanPortingCancellationScreen2 = new EsimMobilePlanPortingCancellationScreen(new EsimMobilePlanPortingCancellationScreenContract$InputData(esimSubscriptionPhoneNumber2.f100472c, EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant.PortOutCancellation.f101398a));
                    final int i59 = 1;
                    Function1 block7 = new Function1() { // from class: kkj.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i59) {
                                case 0:
                                    bmj.e result = (bmj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof e.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar7 = aVar6;
                                    aVar7.l2(new p(aVar7, aVar7.o.f101236a, esimSubscriptionPhoneNumber2.f100470a, null, 0), new n(aVar7, 2));
                                    return Unit.f186387a;
                                case 1:
                                    lmj.c result2 = (lmj.c) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, c.a.f197091a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber22 = esimSubscriptionPhoneNumber2;
                                    String str4 = esimSubscriptionPhoneNumber22.f100470a;
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar8 = aVar6;
                                    String str5 = aVar8.o.f101236a;
                                    EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = esimSubscriptionPhoneNumber22.i;
                                    String str6 = esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100488a : null;
                                    if (str6 == null) {
                                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a.J2("Can't cancel phone number porting, portingId is null for phoneNumberId:" + str4 + " subscriptionId:" + str5);
                                    } else {
                                        aVar8.l2(new i4g.d(29, aVar8, str5, str4, str6, null), new n(aVar8, 4));
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result3 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (Intrinsics.f(result3, dii.e.f115068a)) {
                                        String str7 = esimSubscriptionPhoneNumber2.f100470a;
                                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar9 = aVar6;
                                        aVar9.l2(new p(aVar9, aVar9.o.f101236a, str7, null, 1), new n(aVar9, 3));
                                    } else if (!Intrinsics.f(result3, dii.f.f115069a) && !(result3 instanceof dii.b) && !(result3 instanceof dii.c) && !(result3 instanceof dii.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    esimMobilePlanPortingCancellationScreen2.H = block7;
                    return esimMobilePlanPortingCancellationScreen2;
                }
                if (step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.TerminatePhoneNumber) {
                    final EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber3 = ((EsimMobilePlanMyNumbersScreenContract$ModalStep.TerminatePhoneNumber) step7).f101247a;
                    EsimMobilePlanPhoneNumberCancellationPreviewScreen esimMobilePlanPhoneNumberCancellationPreviewScreen = new EsimMobilePlanPhoneNumberCancellationPreviewScreen(new EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData(esimSubscriptionPhoneNumber3));
                    final int i66 = 0;
                    Function1 block8 = new Function1() { // from class: kkj.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i66) {
                                case 0:
                                    bmj.e result = (bmj.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof e.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar7 = aVar6;
                                    aVar7.l2(new p(aVar7, aVar7.o.f101236a, esimSubscriptionPhoneNumber3.f100470a, null, 0), new n(aVar7, 2));
                                    return Unit.f186387a;
                                case 1:
                                    lmj.c result2 = (lmj.c) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, c.a.f197091a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber22 = esimSubscriptionPhoneNumber3;
                                    String str4 = esimSubscriptionPhoneNumber22.f100470a;
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar8 = aVar6;
                                    String str5 = aVar8.o.f101236a;
                                    EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = esimSubscriptionPhoneNumber22.i;
                                    String str6 = esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100488a : null;
                                    if (str6 == null) {
                                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a.J2("Can't cancel phone number porting, portingId is null for phoneNumberId:" + str4 + " subscriptionId:" + str5);
                                    } else {
                                        aVar8.l2(new i4g.d(29, aVar8, str5, str4, str6, null), new n(aVar8, 4));
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result3 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (Intrinsics.f(result3, dii.e.f115068a)) {
                                        String str7 = esimSubscriptionPhoneNumber3.f100470a;
                                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar9 = aVar6;
                                        aVar9.l2(new p(aVar9, aVar9.o.f101236a, str7, null, 1), new n(aVar9, 3));
                                    } else if (!Intrinsics.f(result3, dii.f.f115069a) && !(result3 instanceof dii.b) && !(result3 instanceof dii.c) && !(result3 instanceof dii.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    esimMobilePlanPhoneNumberCancellationPreviewScreen.H = block8;
                    return esimMobilePlanPhoneNumberCancellationPreviewScreen;
                }
                if (step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.GetPacCode) {
                    return new EsimMobilePlanGetPortOutCredentialsScreen(new EsimMobilePlanGetPortOutCredentialsScreenContract$InputData(((EsimMobilePlanMyNumbersScreenContract$ModalStep.GetPacCode) step7).f101241a, pfj.c.PAC));
                }
                if (step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.GetStacCode) {
                    return new EsimMobilePlanGetPortOutCredentialsScreen(new EsimMobilePlanGetPortOutCredentialsScreenContract$InputData(((EsimMobilePlanMyNumbersScreenContract$ModalStep.GetStacCode) step7).f101242a, pfj.c.STAC));
                }
                if (step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.PortInStatus) {
                    EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress = ((EsimMobilePlanMyNumbersScreenContract$ModalStep.PortInStatus) step7).f101245b;
                    return new EsimCompleteNumberTransferBottomSheetScreen(new EsimCompleteNumberTransferBottomSheetScreenContract$InputData(new TextClause(esimPhoneNumberPortingProgress.f100383a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), esimPhoneNumberPortingProgress.f100384b, null, null, null, null, 60));
                }
                if (!(step7 instanceof EsimMobilePlanMyNumbersScreenContract$ModalStep.ReleasePhoneNumber)) {
                    throw new NoWhenBranchMatchedException();
                }
                lkj.a aVar7 = aVar6.f101252t;
                final EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber4 = ((EsimMobilePlanMyNumbersScreenContract$ModalStep.ReleasePhoneNumber) step7).f101246a;
                String phoneNumber = esimSubscriptionPhoneNumber4.f100472c;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_plan_details_my_numbers_release_number_title, u.c(z80.b.b(aVar7.f196475a, phoneNumber, null, null, 6)), null, 12), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_plan_details_my_numbers_release_number_subtitle, null, null, 14), null, null, false, 28);
                k9 value2 = k9.ESim;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                m6 m6Var2 = n6.Companion;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar8, new aw0.h(false, m6.c(m6Var2, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), new AnalyticsProduct.Retail(value2), null, null, 24));
                final int i74 = 2;
                Function1 block9 = new Function1() { // from class: kkj.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i74) {
                            case 0:
                                bmj.e result = (bmj.e) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof e.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar72 = aVar6;
                                aVar72.l2(new p(aVar72, aVar72.o.f101236a, esimSubscriptionPhoneNumber4.f100470a, null, 0), new n(aVar72, 2));
                                return Unit.f186387a;
                            case 1:
                                lmj.c result2 = (lmj.c) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (!Intrinsics.f(result2, c.a.f197091a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber22 = esimSubscriptionPhoneNumber4;
                                String str4 = esimSubscriptionPhoneNumber22.f100470a;
                                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar82 = aVar6;
                                String str5 = aVar82.o.f101236a;
                                EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = esimSubscriptionPhoneNumber22.i;
                                String str6 = esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100488a : null;
                                if (str6 == null) {
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a.J2("Can't cancel phone number porting, portingId is null for phoneNumberId:" + str4 + " subscriptionId:" + str5);
                                } else {
                                    aVar82.l2(new i4g.d(29, aVar82, str5, str4, str6, null), new n(aVar82, 4));
                                }
                                return Unit.f186387a;
                            default:
                                dii.g result3 = (dii.g) obj6;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (Intrinsics.f(result3, dii.e.f115068a)) {
                                    String str7 = esimSubscriptionPhoneNumber4.f100470a;
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar9 = aVar6;
                                    aVar9.l2(new p(aVar9, aVar9.o.f101236a, str7, null, 1), new n(aVar9, 3));
                                } else if (!Intrinsics.f(result3, dii.f.f115069a) && !(result3 instanceof dii.b) && !(result3 instanceof dii.c) && !(result3 instanceof dii.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block9, "block");
                actionsBottomSheetController.H = block9;
                return actionsBottomSheetController;
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                yp0.b.k(list, 0, 0, 0, 0, 31);
                return new kkj.m(list, kkj.s.a(null, ((kkj.f) obj4).f185072c));
            case 7:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a aVar9 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep step8 = (EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep.PortabilitySpecificDatePicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep.PortabilitySpecificDatePicker portabilitySpecificDatePicker = (EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep.PortabilitySpecificDatePicker) step8;
                EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen = new EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen(new EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData(portabilitySpecificDatePicker.f101333a, portabilitySpecificDatePicker.f101334b, ((klj.i) ((j2) aVar9.f101336p.f22677a).getValue()).f185637a, portabilitySpecificDatePicker.f101335c, aVar9.o.f));
                ke7.v block10 = new ke7.v(aVar9, 20);
                Intrinsics.checkNotNullParameter(block10, "block");
                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.H = block10;
                return esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen;
            case 8:
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a aVar10 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PlanSingleOfferScreenContract$ModalStep step9 = (PlanSingleOfferScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof PlanSingleOfferScreenContract$ModalStep.BottomSheet) {
                    return new PlanPageBottomSheetScreen(new PlanPageBottomSheetContract$InputData(((PlanSingleOfferScreenContract$ModalStep.BottomSheet) step9).f103629a, aVar10.f103633s.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c), null));
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar11 = (com.revolut.feature.tax_residency.impl.screens.list.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TaxResidencyListScreenContract$ModalStep step10 = (TaxResidencyListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof TaxResidencyListScreenContract$ModalStep.WhatIsTaxResidency) {
                    return new ActionsBottomSheetController(((dpe.a) aVar11.f90092p).a(((TaxResidencyListScreenContract$ModalStep.WhatIsTaxResidency) step10).f90091a, aVar11.o.i));
                }
                if (!(step10 instanceof TaxResidencyListScreenContract$ModalStep.RationaleFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxResidencyListScreenContract$ModalStep.RationaleFlow rationaleFlow = (TaxResidencyListScreenContract$ModalStep.RationaleFlow) step10;
                wi0.b bVar3 = rationaleFlow.f90088a;
                zme.l lVar = rationaleFlow.f90089b;
                wi0.b bVar4 = lVar.f323500a;
                zme.g gVar = lVar.d;
                if (gVar == null || (str = gVar.e) == null) {
                    str = "";
                }
                TaxMissingRationaleFlow taxMissingRationaleFlow = new TaxMissingRationaleFlow(new TaxMissingRationaleFlowContract$InputData(bVar3, bVar4, str, true, rationaleFlow.f90090c, rationaleFlow.d));
                r rVar = new r(aVar11, 0);
                Intrinsics.checkNotNullParameter(rVar, "<set-?>");
                taxMissingRationaleFlow.J = rVar;
                return taxMissingRationaleFlow;
            case 10:
                com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b bVar5 = (com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PersonsListScreenContract$ModalStep step11 = (PersonsListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof PersonsListScreenContract$ModalStep.Profile)) {
                    if (Intrinsics.f(step11, PersonsListScreenContract$ModalStep.CloseConnectionsDescription.f94666a)) {
                        return new CloseConnectionsBottomSheet();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                PersonsListScreenContract$ModalStep.Profile profile = (PersonsListScreenContract$ModalStep.Profile) step11;
                PepFormScreen pepFormScreen = new PepFormScreen(new PepFormScreenContract$InputData(profile.f94667a, profile.f94668b));
                kog.k block11 = new kog.k(bVar5, 0);
                Intrinsics.checkNotNullParameter(block11, "block");
                pepFormScreen.H = block11;
                return pepFormScreen;
            case 11:
                com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.a aVar12 = (com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.a) obj4;
                AdditionalCardsCardholderDetailsFlowContract$InputData additionalCardsCardholderDetailsFlowContract$InputData = aVar12.o;
                l FlowCoordinator3 = (l) obj2;
                AdditionalCardsCardholderDetailsFlowContract$Step step12 = (AdditionalCardsCardholderDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof AdditionalCardsCardholderDetailsFlowContract$Step.CardholderDetails) {
                    AdditionalCardsCardholderDetailsFlowContract$Step.CardholderDetails cardholderDetails = (AdditionalCardsCardholderDetailsFlowContract$Step.CardholderDetails) step12;
                    AdditionalCardsCardholderDetailsScreen additionalCardsCardholderDetailsScreen = new AdditionalCardsCardholderDetailsScreen(new AdditionalCardsCardholderDetailsScreenContract$InputData(cardholderDetails.f69011a, additionalCardsCardholderDetailsFlowContract$InputData.f69008a, cardholderDetails.f69012b));
                    kog.k block12 = new kog.k(aVar12, 8);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    additionalCardsCardholderDetailsScreen.H = block12;
                    return additionalCardsCardholderDetailsScreen;
                }
                if (step12 instanceof AdditionalCardsCardholderDetailsFlowContract$Step.SetUpMonthlySpendingLimit) {
                    AdditionalCardsCardholderDetailsFlowContract$Step.SetUpMonthlySpendingLimit setUpMonthlySpendingLimit = (AdditionalCardsCardholderDetailsFlowContract$Step.SetUpMonthlySpendingLimit) step12;
                    additionalCardsChangeLimitScreen = new AdditionalCardsChangeLimitScreen(new AdditionalCardsChangeLimitScreenContract$InputData(additionalCardsCardholderDetailsFlowContract$InputData.f69008a, setUpMonthlySpendingLimit.f69013a, setUpMonthlySpendingLimit.f69014b, setUpMonthlySpendingLimit.f69015c, setUpMonthlySpendingLimit.d, setUpMonthlySpendingLimit.e, np4.e.MONTHLY_SPENDING_LIMIT));
                } else {
                    if (!(step12 instanceof AdditionalCardsCardholderDetailsFlowContract$Step.SetUpSinglePurchaseSpendingLimit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AdditionalCardsCardholderDetailsFlowContract$Step.SetUpSinglePurchaseSpendingLimit setUpSinglePurchaseSpendingLimit = (AdditionalCardsCardholderDetailsFlowContract$Step.SetUpSinglePurchaseSpendingLimit) step12;
                    additionalCardsChangeLimitScreen = new AdditionalCardsChangeLimitScreen(new AdditionalCardsChangeLimitScreenContract$InputData(additionalCardsCardholderDetailsFlowContract$InputData.f69008a, setUpSinglePurchaseSpendingLimit.f69016a, setUpSinglePurchaseSpendingLimit.f69017b, setUpSinglePurchaseSpendingLimit.f69018c, setUpSinglePurchaseSpendingLimit.d, setUpSinglePurchaseSpendingLimit.e, np4.e.SINGLE_PURCHASE_LIMIT));
                }
                return additionalCardsChangeLimitScreen;
            case 12:
                final com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.a aVar13 = (com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.a) obj4;
                ConnectedClientDetailsFlowContract$InputData connectedClientDetailsFlowContract$InputData = aVar13.o;
                l FlowCoordinator4 = (l) obj2;
                ConnectedClientDetailsFlowContract$Step step13 = (ConnectedClientDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (Intrinsics.f(step13, ConnectedClientDetailsFlowContract$Step.Details.f106728a)) {
                    ConnectedClientScreen connectedClientScreen = new ConnectedClientScreen(new ConnectedClientScreenContract$InputData(connectedClientDetailsFlowContract$InputData.f106726a, connectedClientDetailsFlowContract$InputData.f106727b));
                    final int i92 = 0;
                    Function1 block13 = new Function1() { // from class: kpl.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i92) {
                                case 0:
                                    lpl.e result = (lpl.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, lpl.e.f199150a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(aVar13.f106731q, ConnectedClientDetailsFlowContract$Step.Disconnect.f106729a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    return Unit.f186387a;
                                default:
                                    opl.b result2 = (opl.b) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, opl.b.f227689a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.a aVar14 = aVar13;
                                    ((k1) aVar14.f106730p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "OAUTH_ACCESS_REVOKED_SUCCESSFULLY", new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_connected_apps_revoke_success, null, null, 14), null, null, null, 60));
                                    h.D2(aVar14.f106731q);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    connectedClientScreen.H = block13;
                    return connectedClientScreen;
                }
                if (!Intrinsics.f(step13, ConnectedClientDetailsFlowContract$Step.Disconnect.f106729a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConnectedClientDisconnectBottomSheet connectedClientDisconnectBottomSheet = new ConnectedClientDisconnectBottomSheet(new ConnectedClientDisconnectBottomSheetContract$InputData(connectedClientDetailsFlowContract$InputData.f106726a));
                final int i96 = 1;
                Function1 block14 = new Function1() { // from class: kpl.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i96) {
                            case 0:
                                lpl.e result = (lpl.e) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!Intrinsics.f(result, lpl.e.f199150a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar13.f106731q, ConnectedClientDetailsFlowContract$Step.Disconnect.f106729a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                return Unit.f186387a;
                            default:
                                opl.b result2 = (opl.b) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (!Intrinsics.f(result2, opl.b.f227689a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.a aVar14 = aVar13;
                                ((k1) aVar14.f106730p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "OAUTH_ACCESS_REVOKED_SUCCESSFULLY", new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_connected_apps_revoke_success, null, null, 14), null, null, null, 60));
                                h.D2(aVar14.f106731q);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block14, "block");
                connectedClientDisconnectBottomSheet.H = block14;
                return connectedClientDisconnectBottomSheet;
            case 13:
                final com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e) obj4;
                final yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                IncomeSorterFlowContract$Step step14 = (IncomeSorterFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof IncomeSorterFlowContract$Step.IncomeSortersList) {
                    return new IncomeSortersListController();
                }
                if (!(step14 instanceof IncomeSorterFlowContract$Step.IncomeSorterDetails)) {
                    if (step14 instanceof IncomeSorterFlowContract$Step.IncomeSorterDestinations) {
                        IncomeSorterFlowContract$Step.IncomeSorterDestinations incomeSorterDestinations = (IncomeSorterFlowContract$Step.IncomeSorterDestinations) step14;
                        IncomeSorterFlowContract$SelectionMode incomeSorterFlowContract$SelectionMode = incomeSorterDestinations.f87799a;
                        xi0.b bVar6 = incomeSorterDestinations.f87800b;
                        if (incomeSorterFlowContract$SelectionMode instanceof IncomeSorterFlowContract$SelectionMode.DestinationsSelection) {
                            IncomeSorterFlowContract$SelectionMode.DestinationsSelection destinationsSelection = (IncomeSorterFlowContract$SelectionMode.DestinationsSelection) incomeSorterFlowContract$SelectionMode;
                            remainingBalanceDestinationSelection = new IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection(destinationsSelection.f87785b, destinationsSelection.f87784a);
                        } else {
                            if (!(incomeSorterFlowContract$SelectionMode instanceof IncomeSorterFlowContract$SelectionMode.RemainingBalanceDestinationSelection)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            IncomeSorterFlowContract$SelectionMode.RemainingBalanceDestinationSelection remainingBalanceDestinationSelection2 = (IncomeSorterFlowContract$SelectionMode.RemainingBalanceDestinationSelection) incomeSorterFlowContract$SelectionMode;
                            remainingBalanceDestinationSelection = new IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection(remainingBalanceDestinationSelection2.f87786a, remainingBalanceDestinationSelection2.f87787b);
                        }
                        incomeSorterTransferDestinationsFlow = new IncomeSorterDestinationsController(new IncomeSorterDestinationsContract$InputData(remainingBalanceDestinationSelection, bVar6));
                        Function1 block15 = new Function1() { // from class: kqd.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                switch (i2) {
                                    case 0:
                                        sqd.j outputData = (sqd.j) obj6;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean zF = Intrinsics.f(outputData, sqd.h.f265063a);
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar4 = eVar3;
                                        if (zF || Intrinsics.f(outputData, sqd.i.f265065a)) {
                                            eVar4.L2(new mii.k("update", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_updated, null, null, 14), null, null, null, 28));
                                            eVar4.K2();
                                        } else if (Intrinsics.f(outputData, sqd.g.f265060a)) {
                                            eVar4.L2(new mii.k("activate", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_resumed, null, null, 14), null, null, null, 28));
                                            eVar4.K2();
                                        } else {
                                            if (!(outputData instanceof sqd.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            sqd.f fVar = (sqd.f) outputData;
                                            oki.h.t2(eVar4, eVar4.f87824t, new IncomeSorterFlowContract$Step.DestinationsExecution(fVar.f265056a, fVar.f265057b, fVar.f265058c, fVar.d), false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        ypd.b it8 = (ypd.b) obj6;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        MainScreenTab mainScreenTab = ibb.c.f160140a;
                                        ProductId productId = ProductId.CURRENCY;
                                        uy5.e.Companion.getClass();
                                        eVar3.C1(u0.b(jbb.a.a(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(uy5.d.f284077b, null), productId), new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_execution_animation_confirmation, zhm.u.c(otd.f.c(3, null, null, it8.f315831a)), null, 12), null))), null, null, 12)));
                                        return Unit.f186387a;
                                    case 2:
                                        aqd.h0 outputData2 = (aqd.h0) obj6;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        boolean zF2 = Intrinsics.f(outputData2, g0.f8342a);
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar5 = eVar3;
                                        if (zF2) {
                                            eVar5.L2(new mii.f("pause", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_paused, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_pause, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                            eVar5.K2();
                                        } else if (Intrinsics.f(outputData2, f0.f8339a)) {
                                            eVar5.L2(new mii.k("delete", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_deleted, null, null, 14), null, null, null, 28));
                                            eVar5.K2();
                                        } else {
                                            if (!Intrinsics.f(outputData2, e0.f8333a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar5.C1(u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_manual_execution_deffer_confirmation, null, null, 14), null))), null, null, 12)));
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        vpd.i outputData3 = (vpd.i) obj6;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar6 = eVar3;
                                        eVar6.n2(new kq5.d(outputData3, eVar6, null, 1), new whi.b(6));
                                        eVar6.f87824t.e(true);
                                        return Unit.f186387a;
                                    default:
                                        ard.h outputData4 = (ard.h) obj6;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        if (outputData4 instanceof ard.g) {
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar7 = eVar3;
                                            oki.h.t2(eVar7, eVar7.f87824t, new IncomeSorterFlowContract$Step.IncomeSorterDetails(new IncomeSortersDetailsContract$InputData(new IncomeSortersDetailsContract$InputData.Mode.Create(((ard.g) outputData4).f8650a.f272581b, IncomeSorterCreationScenario.RecurringSetup.f87834a))), false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block15, "block");
                        incomeSorterTransferDestinationsFlow.H = block15;
                    } else {
                        if (step14 instanceof IncomeSorterFlowContract$Step.CreateSubaccount) {
                            IncomeSorterFlowContract$Step.CreateSubaccount createSubaccount = (IncomeSorterFlowContract$Step.CreateSubaccount) step14;
                            final Set set = createSubaccount.f87792c;
                            v6e.a aVar14 = eVar3.f87821q;
                            Set set2 = createSubaccount.f87790a;
                            String str4 = createSubaccount.f87791b;
                            aVar14.getClass();
                            CreateSubaccountFlow createSubaccountFlow = new CreateSubaccountFlow(new CreateSubaccountFlowContract$InputData(set2, (CreateSubaccountProductArticleConfig) null, str4, 2));
                            final int i99 = 0;
                            Function1 block16 = new Function1() { // from class: kqd.p
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    switch (i99) {
                                        case 0:
                                            j6e.a outputData = (j6e.a) obj6;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            Set set3 = set;
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar4 = eVar3;
                                            eVar4.n2(new km2.n(2, set3, eVar4, outputData, LazyFlowCoordinator2, (Continuation) null), new whi.b(6));
                                            break;
                                        default:
                                            zib.a result = (zib.a) obj6;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            Set set4 = set;
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar5 = eVar3;
                                            eVar5.n2(new km2.n(3, set4, eVar5, result, LazyFlowCoordinator2, (Continuation) null), new whi.b(6));
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block16, "block");
                            createSubaccountFlow.H = block16;
                            return createSubaccountFlow;
                        }
                        if (step14 instanceof IncomeSorterFlowContract$Step.CreateSavings) {
                            IncomeSorterFlowContract$Step.CreateSavings createSavings = (IncomeSorterFlowContract$Step.CreateSavings) step14;
                            final Set set3 = createSavings.f87789b;
                            final int i100 = 1;
                            viewControllerE1 = eVar3.e1(new com.revolut.feature.retail.savings.api.creation.navigation.a(SavingsAccountCreationFlow$Filter.All.f83128a, createSavings.f87788a, true));
                            Function1 block17 = new Function1() { // from class: kqd.p
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    switch (i100) {
                                        case 0:
                                            j6e.a outputData = (j6e.a) obj6;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            Set set32 = set3;
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar4 = eVar3;
                                            eVar4.n2(new km2.n(2, set32, eVar4, outputData, LazyFlowCoordinator2, (Continuation) null), new whi.b(6));
                                            break;
                                        default:
                                            zib.a result = (zib.a) obj6;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            Set set4 = set3;
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar5 = eVar3;
                                            eVar5.n2(new km2.n(3, set4, eVar5, result, LazyFlowCoordinator2, (Continuation) null), new whi.b(6));
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block17, "block");
                            viewControllerE1.H = block17;
                        } else {
                            if (step14 instanceof IncomeSorterFlowContract$Step.SelectIncome) {
                                IncomeSorterFlowContract$Step.SelectIncome selectIncome = (IncomeSorterFlowContract$Step.SelectIncome) step14;
                                SelectTransactionController selectTransactionController = new SelectTransactionController(new SelectTransactionContract$InputData(selectIncome.f87808a, selectIncome.f87809b, new SelectTransactionContract$SelectionMode.Single(true), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_select_income_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_select_income_subtitle, null, null, 14), 32));
                                final int i101 = 4;
                                Function1 block18 = new Function1() { // from class: kqd.q
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        switch (i101) {
                                            case 0:
                                                sqd.j outputData = (sqd.j) obj6;
                                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                                boolean zF = Intrinsics.f(outputData, sqd.h.f265063a);
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar4 = eVar3;
                                                if (zF || Intrinsics.f(outputData, sqd.i.f265065a)) {
                                                    eVar4.L2(new mii.k("update", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_updated, null, null, 14), null, null, null, 28));
                                                    eVar4.K2();
                                                } else if (Intrinsics.f(outputData, sqd.g.f265060a)) {
                                                    eVar4.L2(new mii.k("activate", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_resumed, null, null, 14), null, null, null, 28));
                                                    eVar4.K2();
                                                } else {
                                                    if (!(outputData instanceof sqd.f)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    sqd.f fVar = (sqd.f) outputData;
                                                    oki.h.t2(eVar4, eVar4.f87824t, new IncomeSorterFlowContract$Step.DestinationsExecution(fVar.f265056a, fVar.f265057b, fVar.f265058c, fVar.d), false, null, false, 12);
                                                }
                                                return Unit.f186387a;
                                            case 1:
                                                ypd.b it8 = (ypd.b) obj6;
                                                Intrinsics.checkNotNullParameter(it8, "it");
                                                MainScreenTab mainScreenTab = ibb.c.f160140a;
                                                ProductId productId = ProductId.CURRENCY;
                                                uy5.e.Companion.getClass();
                                                eVar3.C1(u0.b(jbb.a.a(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(uy5.d.f284077b, null), productId), new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_execution_animation_confirmation, zhm.u.c(otd.f.c(3, null, null, it8.f315831a)), null, 12), null))), null, null, 12)));
                                                return Unit.f186387a;
                                            case 2:
                                                aqd.h0 outputData2 = (aqd.h0) obj6;
                                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                                boolean zF2 = Intrinsics.f(outputData2, g0.f8342a);
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar5 = eVar3;
                                                if (zF2) {
                                                    eVar5.L2(new mii.f("pause", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_paused, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_pause, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                                    eVar5.K2();
                                                } else if (Intrinsics.f(outputData2, f0.f8339a)) {
                                                    eVar5.L2(new mii.k("delete", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_deleted, null, null, 14), null, null, null, 28));
                                                    eVar5.K2();
                                                } else {
                                                    if (!Intrinsics.f(outputData2, e0.f8333a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    eVar5.C1(u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_manual_execution_deffer_confirmation, null, null, 14), null))), null, null, 12)));
                                                }
                                                return Unit.f186387a;
                                            case 3:
                                                vpd.i outputData3 = (vpd.i) obj6;
                                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar6 = eVar3;
                                                eVar6.n2(new kq5.d(outputData3, eVar6, null, 1), new whi.b(6));
                                                eVar6.f87824t.e(true);
                                                return Unit.f186387a;
                                            default:
                                                ard.h outputData4 = (ard.h) obj6;
                                                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                                if (outputData4 instanceof ard.g) {
                                                    com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar7 = eVar3;
                                                    oki.h.t2(eVar7, eVar7.f87824t, new IncomeSorterFlowContract$Step.IncomeSorterDetails(new IncomeSortersDetailsContract$InputData(new IncomeSortersDetailsContract$InputData.Mode.Create(((ard.g) outputData4).f8650a.f272581b, IncomeSorterCreationScenario.RecurringSetup.f87834a))), false, null, false, 12);
                                                }
                                                return Unit.f186387a;
                                        }
                                    }
                                };
                                Intrinsics.checkNotNullParameter(block18, "block");
                                selectTransactionController.H = block18;
                                return selectTransactionController;
                            }
                            if (step14 instanceof IncomeSorterFlowContract$Step.DestinationsExecution) {
                                IncomeSorterFlowContract$Step.DestinationsExecution destinationsExecution = (IncomeSorterFlowContract$Step.DestinationsExecution) step14;
                                IncomeSorterDestinationsExecutionController incomeSorterDestinationsExecutionController = new IncomeSorterDestinationsExecutionController(new IncomeSorterDestinationsExecutionContract$InputData(destinationsExecution.f87796a, destinationsExecution.f87797b, destinationsExecution.f87798c, destinationsExecution.d));
                                final int i102 = 1;
                                Function1 block19 = new Function1() { // from class: kqd.q
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        switch (i102) {
                                            case 0:
                                                sqd.j outputData = (sqd.j) obj6;
                                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                                boolean zF = Intrinsics.f(outputData, sqd.h.f265063a);
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar4 = eVar3;
                                                if (zF || Intrinsics.f(outputData, sqd.i.f265065a)) {
                                                    eVar4.L2(new mii.k("update", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_updated, null, null, 14), null, null, null, 28));
                                                    eVar4.K2();
                                                } else if (Intrinsics.f(outputData, sqd.g.f265060a)) {
                                                    eVar4.L2(new mii.k("activate", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_resumed, null, null, 14), null, null, null, 28));
                                                    eVar4.K2();
                                                } else {
                                                    if (!(outputData instanceof sqd.f)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    sqd.f fVar = (sqd.f) outputData;
                                                    oki.h.t2(eVar4, eVar4.f87824t, new IncomeSorterFlowContract$Step.DestinationsExecution(fVar.f265056a, fVar.f265057b, fVar.f265058c, fVar.d), false, null, false, 12);
                                                }
                                                return Unit.f186387a;
                                            case 1:
                                                ypd.b it8 = (ypd.b) obj6;
                                                Intrinsics.checkNotNullParameter(it8, "it");
                                                MainScreenTab mainScreenTab = ibb.c.f160140a;
                                                ProductId productId = ProductId.CURRENCY;
                                                uy5.e.Companion.getClass();
                                                eVar3.C1(u0.b(jbb.a.a(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(uy5.d.f284077b, null), productId), new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_execution_animation_confirmation, zhm.u.c(otd.f.c(3, null, null, it8.f315831a)), null, 12), null))), null, null, 12)));
                                                return Unit.f186387a;
                                            case 2:
                                                aqd.h0 outputData2 = (aqd.h0) obj6;
                                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                                boolean zF2 = Intrinsics.f(outputData2, g0.f8342a);
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar5 = eVar3;
                                                if (zF2) {
                                                    eVar5.L2(new mii.f("pause", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_paused, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_pause, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                                    eVar5.K2();
                                                } else if (Intrinsics.f(outputData2, f0.f8339a)) {
                                                    eVar5.L2(new mii.k("delete", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_deleted, null, null, 14), null, null, null, 28));
                                                    eVar5.K2();
                                                } else {
                                                    if (!Intrinsics.f(outputData2, e0.f8333a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    eVar5.C1(u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_manual_execution_deffer_confirmation, null, null, 14), null))), null, null, 12)));
                                                }
                                                return Unit.f186387a;
                                            case 3:
                                                vpd.i outputData3 = (vpd.i) obj6;
                                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar6 = eVar3;
                                                eVar6.n2(new kq5.d(outputData3, eVar6, null, 1), new whi.b(6));
                                                eVar6.f87824t.e(true);
                                                return Unit.f186387a;
                                            default:
                                                ard.h outputData4 = (ard.h) obj6;
                                                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                                if (outputData4 instanceof ard.g) {
                                                    com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar7 = eVar3;
                                                    oki.h.t2(eVar7, eVar7.f87824t, new IncomeSorterFlowContract$Step.IncomeSorterDetails(new IncomeSortersDetailsContract$InputData(new IncomeSortersDetailsContract$InputData.Mode.Create(((ard.g) outputData4).f8650a.f272581b, IncomeSorterCreationScenario.RecurringSetup.f87834a))), false, null, false, 12);
                                                }
                                                return Unit.f186387a;
                                        }
                                    }
                                };
                                Intrinsics.checkNotNullParameter(block19, "block");
                                incomeSorterDestinationsExecutionController.H = block19;
                                return incomeSorterDestinationsExecutionController;
                            }
                            if (step14 instanceof IncomeSorterFlowContract$Step.IncomeSorterExecution) {
                                return new IncomeSorterExecutionController(new IncomeSorterExecutionContract$InputData(((IncomeSorterFlowContract$Step.IncomeSorterExecution) step14).f87802a));
                            }
                            if (!(step14 instanceof IncomeSorterFlowContract$Step.CreateTransfer)) {
                                if (!(step14 instanceof IncomeSorterFlowContract$Step.Review)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IncomeSorterFlowContract$Step.Review review = (IncomeSorterFlowContract$Step.Review) step14;
                                IncomeSorterReviewController incomeSorterReviewController = new IncomeSorterReviewController(new sqd.d(review.f87804a, review.f87805b, review.f87806c, review.d, review.e, review.f, review.f87807g));
                                final int i103 = 0;
                                Function1 block20 = new Function1() { // from class: kqd.q
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        switch (i103) {
                                            case 0:
                                                sqd.j outputData = (sqd.j) obj6;
                                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                                boolean zF = Intrinsics.f(outputData, sqd.h.f265063a);
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar4 = eVar3;
                                                if (zF || Intrinsics.f(outputData, sqd.i.f265065a)) {
                                                    eVar4.L2(new mii.k("update", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_updated, null, null, 14), null, null, null, 28));
                                                    eVar4.K2();
                                                } else if (Intrinsics.f(outputData, sqd.g.f265060a)) {
                                                    eVar4.L2(new mii.k("activate", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_resumed, null, null, 14), null, null, null, 28));
                                                    eVar4.K2();
                                                } else {
                                                    if (!(outputData instanceof sqd.f)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    sqd.f fVar = (sqd.f) outputData;
                                                    oki.h.t2(eVar4, eVar4.f87824t, new IncomeSorterFlowContract$Step.DestinationsExecution(fVar.f265056a, fVar.f265057b, fVar.f265058c, fVar.d), false, null, false, 12);
                                                }
                                                return Unit.f186387a;
                                            case 1:
                                                ypd.b it8 = (ypd.b) obj6;
                                                Intrinsics.checkNotNullParameter(it8, "it");
                                                MainScreenTab mainScreenTab = ibb.c.f160140a;
                                                ProductId productId = ProductId.CURRENCY;
                                                uy5.e.Companion.getClass();
                                                eVar3.C1(u0.b(jbb.a.a(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(uy5.d.f284077b, null), productId), new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_execution_animation_confirmation, zhm.u.c(otd.f.c(3, null, null, it8.f315831a)), null, 12), null))), null, null, 12)));
                                                return Unit.f186387a;
                                            case 2:
                                                aqd.h0 outputData2 = (aqd.h0) obj6;
                                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                                boolean zF2 = Intrinsics.f(outputData2, g0.f8342a);
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar5 = eVar3;
                                                if (zF2) {
                                                    eVar5.L2(new mii.f("pause", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_paused, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_pause, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                                    eVar5.K2();
                                                } else if (Intrinsics.f(outputData2, f0.f8339a)) {
                                                    eVar5.L2(new mii.k("delete", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_deleted, null, null, 14), null, null, null, 28));
                                                    eVar5.K2();
                                                } else {
                                                    if (!Intrinsics.f(outputData2, e0.f8333a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    eVar5.C1(u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_manual_execution_deffer_confirmation, null, null, 14), null))), null, null, 12)));
                                                }
                                                return Unit.f186387a;
                                            case 3:
                                                vpd.i outputData3 = (vpd.i) obj6;
                                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar6 = eVar3;
                                                eVar6.n2(new kq5.d(outputData3, eVar6, null, 1), new whi.b(6));
                                                eVar6.f87824t.e(true);
                                                return Unit.f186387a;
                                            default:
                                                ard.h outputData4 = (ard.h) obj6;
                                                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                                if (outputData4 instanceof ard.g) {
                                                    com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar7 = eVar3;
                                                    oki.h.t2(eVar7, eVar7.f87824t, new IncomeSorterFlowContract$Step.IncomeSorterDetails(new IncomeSortersDetailsContract$InputData(new IncomeSortersDetailsContract$InputData.Mode.Create(((ard.g) outputData4).f8650a.f272581b, IncomeSorterCreationScenario.RecurringSetup.f87834a))), false, null, false, 12);
                                                }
                                                return Unit.f186387a;
                                        }
                                    }
                                };
                                Intrinsics.checkNotNullParameter(block20, "block");
                                incomeSorterReviewController.H = block20;
                                return incomeSorterReviewController;
                            }
                            IncomeSorterFlowContract$Step.CreateTransfer createTransfer = (IncomeSorterFlowContract$Step.CreateTransfer) step14;
                            Set set4 = createTransfer.f87795c;
                            incomeSorterTransferDestinationsFlow = new IncomeSorterTransferDestinationsFlow(new jqd.d(createTransfer.f87793a, createTransfer.f87794b));
                            q block21 = new q(eVar3, set4, i2);
                            Intrinsics.checkNotNullParameter(block21, "block");
                            incomeSorterTransferDestinationsFlow.H = block21;
                        }
                    }
                    return incomeSorterTransferDestinationsFlow;
                }
                viewControllerE1 = new IncomeSortersDetailsController(((IncomeSorterFlowContract$Step.IncomeSorterDetails) step14).f87801a);
                final int i104 = 2;
                Function1 block22 = new Function1() { // from class: kqd.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i104) {
                            case 0:
                                sqd.j outputData = (sqd.j) obj6;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean zF = Intrinsics.f(outputData, sqd.h.f265063a);
                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar4 = eVar3;
                                if (zF || Intrinsics.f(outputData, sqd.i.f265065a)) {
                                    eVar4.L2(new mii.k("update", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_updated, null, null, 14), null, null, null, 28));
                                    eVar4.K2();
                                } else if (Intrinsics.f(outputData, sqd.g.f265060a)) {
                                    eVar4.L2(new mii.k("activate", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_resumed, null, null, 14), null, null, null, 28));
                                    eVar4.K2();
                                } else {
                                    if (!(outputData instanceof sqd.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    sqd.f fVar = (sqd.f) outputData;
                                    oki.h.t2(eVar4, eVar4.f87824t, new IncomeSorterFlowContract$Step.DestinationsExecution(fVar.f265056a, fVar.f265057b, fVar.f265058c, fVar.d), false, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 1:
                                ypd.b it8 = (ypd.b) obj6;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                MainScreenTab mainScreenTab = ibb.c.f160140a;
                                ProductId productId = ProductId.CURRENCY;
                                uy5.e.Companion.getClass();
                                eVar3.C1(u0.b(jbb.a.a(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(uy5.d.f284077b, null), productId), new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_execution_animation_confirmation, zhm.u.c(otd.f.c(3, null, null, it8.f315831a)), null, 12), null))), null, null, 12)));
                                return Unit.f186387a;
                            case 2:
                                aqd.h0 outputData2 = (aqd.h0) obj6;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean zF2 = Intrinsics.f(outputData2, g0.f8342a);
                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar5 = eVar3;
                                if (zF2) {
                                    eVar5.L2(new mii.f("pause", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_paused, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_pause, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                    eVar5.K2();
                                } else if (Intrinsics.f(outputData2, f0.f8339a)) {
                                    eVar5.L2(new mii.k("delete", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_confirmation_deleted, null, null, 14), null, null, null, 28));
                                    eVar5.K2();
                                } else {
                                    if (!Intrinsics.f(outputData2, e0.f8333a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar5.C1(u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_manual_execution_deffer_confirmation, null, null, 14), null))), null, null, 12)));
                                }
                                return Unit.f186387a;
                            case 3:
                                vpd.i outputData3 = (vpd.i) obj6;
                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar6 = eVar3;
                                eVar6.n2(new kq5.d(outputData3, eVar6, null, 1), new whi.b(6));
                                eVar6.f87824t.e(true);
                                return Unit.f186387a;
                            default:
                                ard.h outputData4 = (ard.h) obj6;
                                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                if (outputData4 instanceof ard.g) {
                                    com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar7 = eVar3;
                                    oki.h.t2(eVar7, eVar7.f87824t, new IncomeSorterFlowContract$Step.IncomeSorterDetails(new IncomeSortersDetailsContract$InputData(new IncomeSortersDetailsContract$InputData.Mode.Create(((ard.g) outputData4).f8650a.f272581b, IncomeSorterCreationScenario.RecurringSetup.f87834a))), false, null, false, 12);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block22, "block");
                viewControllerE1.H = block22;
                return viewControllerE1;
            case 14:
                final com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar2 = (com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c) obj4;
                onh.b bVar7 = cVar2.v;
                iy.b bVar8 = cVar2.f50511y;
                BiometricVerificationActiveLivenessStepFlowContract$InputData inputData = cVar2.o;
                l FlowCoordinator5 = (l) obj2;
                BiometricVerificationActiveLivenessStepFlowContract$Step step15 = (BiometricVerificationActiveLivenessStepFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof BiometricVerificationActiveLivenessStepFlowContract$Step.Intro) {
                    boolean z = ((BiometricVerificationActiveLivenessStepFlowContract$Step.Intro) step15).f50501a;
                    AnalyticsContext analyticsContext = new AnalyticsContext(inputData.d);
                    BiometricVerificationActiveLivenessIntroScreenContract$InputData biometricVerificationActiveLivenessIntroScreenContract$InputData = new BiometricVerificationActiveLivenessIntroScreenContract$InputData(z, analyticsContext);
                    if (bVar8.a(px.a.f240494h)) {
                        BiometricVerificationActiveLivenessDigitsSelfieIntroScreen biometricVerificationActiveLivenessDigitsSelfieIntroScreen = new BiometricVerificationActiveLivenessDigitsSelfieIntroScreen(new BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData(z, analyticsContext));
                        com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.a block23 = new com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.a(1, 0, com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c.class, cVar2, "handleDigitsSelfieIntroScreenResult", "handleDigitsSelfieIntroScreenResult(Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/digits_selfie_intro/BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$OutputData;)V");
                        Intrinsics.checkNotNullParameter(block23, "block");
                        biometricVerificationActiveLivenessDigitsSelfieIntroScreen.H = block23;
                        return biometricVerificationActiveLivenessDigitsSelfieIntroScreen;
                    }
                    submitConfirmationScreen = new BiometricVerificationActiveLivenessIntroScreen(biometricVerificationActiveLivenessIntroScreenContract$InputData);
                    Function1 block24 = new Function1() { // from class: ks.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i105 = i2;
                            com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar3 = cVar2;
                            switch (i105) {
                                case 0:
                                    rs.l outputData = (rs.l) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (Intrinsics.f(outputData, rs.k.f256894a)) {
                                        cVar3.n2(new i(false, cVar3, null, 1), new whi.b(6));
                                    } else {
                                        if (!Intrinsics.f(outputData, rs.j.f256893a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar3.N2(false);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ms.k outputData2 = (ms.k) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof ms.j) {
                                        cVar3.n2(new i(false, cVar3, null, 1), new whi.b(6));
                                    } else {
                                        if (!(outputData2 instanceof ms.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar3.N2(false);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    dii.g outputData3 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (Intrinsics.f(outputData3, dii.f.f115069a)) {
                                        cVar3.n2(new i(true, cVar3, null, 1), new whi.b(6));
                                    } else if (Intrinsics.f(outputData3, dii.e.f115068a)) {
                                        cVar3.N2(true);
                                    } else {
                                        int i106 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    os.h outputData4 = (os.h) obj6;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    outputData4.getClass();
                                    cVar3.M2("BiometricVerificationActiveLivenessIntroScreenContract_BUTTON_TAG", false);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    submitConfirmationScreen.H = block24;
                } else {
                    if (step15 instanceof BiometricVerificationActiveLivenessStepFlowContract$Step.Camera) {
                        BiometricVerificationActiveLivenessStepFlowContract$Step.Camera camera = (BiometricVerificationActiveLivenessStepFlowContract$Step.Camera) step15;
                        boolean zA = bVar8.a(px.a.f240494h);
                        Mask.ActiveLiveness activeLiveness = new Mask.ActiveLiveness(R$color.camera_kit_lightBlue, R$color.camera_kit_white, R$color.camera_kit_black, 17);
                        f01.a aVar15 = cVar2.f50508t;
                        String str5 = camera.f50499a.f50467a;
                        bVar7.getClass();
                        CameraKitUiSettings cameraKitUiSettings = new CameraKitUiSettings(activeLiveness, new HintMessage.ActiveLiveness(aVar15.b(onh.b.f(str5)).toString()), AnimationType.None.f50690a, 2);
                        BiometricVerificationStep.ActiveLiveness activeLiveness2 = inputData.f50495a;
                        CameraKitClientSettings cameraKitClientSettings = new CameraKitClientSettings(activeLiveness2.f50401c, activeLiveness2.f50400b, false);
                        ry.a aVar16 = new ry.a(new TextLocalisedClause(R$string.selfie_active_liveness_title, null, null, 14), null, null, !zA, camera.f50500b, zA, zA, 6);
                        AnalyticsProduct.Shared.Vision vision = AnalyticsProduct.Shared.Vision.f;
                        w0 w0Var = inputData.d;
                        CameraCaptureSettings cameraCaptureSettings = activeLiveness2.f50401c;
                        ArrayList arrayList = activeLiveness2.f50399a;
                        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
                        CameraCaptureContext.a aVarNewBuilder = CameraCaptureContext.newBuilder();
                        aVarNewBuilder.h(f1.ACTIVE_LIVENESS);
                        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setFlowType(...)");
                        cs.b.a(aVarNewBuilder, cameraCaptureSettings);
                        aVarNewBuilder.i(j1.SELFIE);
                        CameraCaptureContext cameraCaptureContext = (CameraCaptureContext) aVarNewBuilder.a();
                        w0 w0VarA = cameraCaptureContext;
                        if (w0Var instanceof VisionVerificationContext) {
                            VisionVerificationContext.a aVar17 = (VisionVerificationContext.a) ((VisionVerificationContext) w0Var).toBuilder();
                            VisionVerificationContext.Inner_context.a aVarNewBuilder2 = VisionVerificationContext.Inner_context.newBuilder();
                            aVarNewBuilder2.h(cameraCaptureContext);
                            aVar17.h((VisionVerificationContext.Inner_context) aVarNewBuilder2.a());
                            w0VarA = aVar17.a();
                        }
                        AnalyticsContext.INSTANCE.getClass();
                        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
                        cVar2.u.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Iterator it8 = arrayList.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof FaceQualityResource) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        FaceQualityResource faceQualityResource = (FaceQualityResource) next;
                        if (faceQualityResource == null) {
                            throw new CameraKitException("Face quality model not available", (Throwable) null, 6);
                        }
                        String str6 = faceQualityResource.f50445b;
                        String str7 = faceQualityResource.f50446c;
                        FaceQualityResource.Thresholds thresholds = faceQualityResource.d;
                        ValidatorConfig[] elements = {new FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig(str6, str7, new FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig.Thresholds(thresholds.f50447a, thresholds.f50448b, thresholds.f50449c, thresholds.d, thresholds.e, thresholds.f, thresholds.f50450g, thresholds.f50451h, thresholds.i, thresholds.f50452j, thresholds.k)), new ObjectPositionValidatorConfig(0.7f)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        Set setY0 = kotlin.collections.d.y0(elements);
                        BiometricVerificationFeatures biometricVerificationFeatures = activeLiveness2.d;
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next2 = it9.next();
                                if (next2 instanceof FaceDetectionResource) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        CameraKitFlow cameraKitFlow = new CameraKitFlow(new ly.c((CameraKitFlowContract$FlowType) CameraKitFlowContract$FlowType.ActiveLiveness.f50792a, cameraKitUiSettings, cameraKitClientSettings, aVar16, setY0, (AnalyticsProduct) vision, w0VarA2, true, biometricVerificationFeatures, (FaceDetectionResource) next2, inputData.e), null, 6);
                        q block25 = new q(cVar2, camera, 6);
                        Intrinsics.checkNotNullParameter(block25, "block");
                        cameraKitFlow.H = block25;
                        return cameraKitFlow;
                    }
                    if (!(step15 instanceof BiometricVerificationActiveLivenessStepFlowContract$Step.VideoQualityConfirmation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String code = ((BiometricVerificationActiveLivenessStepFlowContract$Step.VideoQualityConfirmation) step15).f50502a;
                    if (bVar8.a(px.a.f240494h)) {
                        t tVarA = cVar2.f50504p.a("ACTIVE_LIVENESS_MEDIA_KEY_VIDEO");
                        nq.r rVar2 = tVarA instanceof nq.r ? (nq.r) tVarA : null;
                        if (rVar2 == null) {
                            throw new IllegalStateException("Active liveness video is missing for confirmation");
                        }
                        Uri uriG = rVar2.f218328b.g();
                        bVar7.getClass();
                        submitConfirmationScreen = new BiometricVerificationActiveLivenessVideoConfirmationScreen(new BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData(uriG, onh.b.f(code), inputData.f50496b, new AnalyticsContext(inputData.d), rVar2.f218327a.f218315j));
                        Function1 block26 = new Function1() { // from class: ks.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i105 = i5;
                                com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar3 = cVar2;
                                switch (i105) {
                                    case 0:
                                        rs.l outputData = (rs.l) obj6;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (Intrinsics.f(outputData, rs.k.f256894a)) {
                                            cVar3.n2(new i(false, cVar3, null, 1), new whi.b(6));
                                        } else {
                                            if (!Intrinsics.f(outputData, rs.j.f256893a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar3.N2(false);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        ms.k outputData2 = (ms.k) obj6;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        if (outputData2 instanceof ms.j) {
                                            cVar3.n2(new i(false, cVar3, null, 1), new whi.b(6));
                                        } else {
                                            if (!(outputData2 instanceof ms.i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar3.N2(false);
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g outputData3 = (dii.g) obj6;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (Intrinsics.f(outputData3, dii.f.f115069a)) {
                                            cVar3.n2(new i(true, cVar3, null, 1), new whi.b(6));
                                        } else if (Intrinsics.f(outputData3, dii.e.f115068a)) {
                                            cVar3.N2(true);
                                        } else {
                                            int i106 = jli.h.f175850a;
                                        }
                                        return Unit.f186387a;
                                    default:
                                        os.h outputData4 = (os.h) obj6;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        outputData4.getClass();
                                        cVar3.M2("BiometricVerificationActiveLivenessIntroScreenContract_BUTTON_TAG", false);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block26, "block");
                        submitConfirmationScreen.H = block26;
                    } else {
                        if (!inputData.e) {
                            ks.a aVar18 = cVar2.f50506r;
                            bVar7.getClass();
                            CompositeClause codeClause = onh.b.f(code);
                            aVar18.getClass();
                            Intrinsics.checkNotNullParameter(codeClause, "codeClause");
                            lw0.a aVar19 = new lw0.a(new TextLocalisedClause(R$string.selfie_active_liveness_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.selfie_active_liveness_confirmation_description, u.c(codeClause), null, 12), null, null, false, 28);
                            m6 m6Var3 = n6.Companion;
                            ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar19, new aw0.g(m6.c(m6Var3, new TextLocalisedClause(R$string.selfie_active_liveness_confirmation_secondary_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "RETAKE_BUTTON_LOADING_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), m6.c(m6Var3, new TextLocalisedClause(R$string.selfie_active_liveness_confirmation_primary_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "SUBMIT_BUTTON_LOADING_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), (Clause) null, (aw0.f) null, 25), AnalyticsProduct.Shared.Vision.f, null, null, 24));
                            final int i105 = 2;
                            Function1 block27 = new Function1() { // from class: ks.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    int i1052 = i105;
                                    com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar3 = cVar2;
                                    switch (i1052) {
                                        case 0:
                                            rs.l outputData = (rs.l) obj6;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            if (Intrinsics.f(outputData, rs.k.f256894a)) {
                                                cVar3.n2(new i(false, cVar3, null, 1), new whi.b(6));
                                            } else {
                                                if (!Intrinsics.f(outputData, rs.j.f256893a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                cVar3.N2(false);
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            ms.k outputData2 = (ms.k) obj6;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            if (outputData2 instanceof ms.j) {
                                                cVar3.n2(new i(false, cVar3, null, 1), new whi.b(6));
                                            } else {
                                                if (!(outputData2 instanceof ms.i)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                cVar3.N2(false);
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            dii.g outputData3 = (dii.g) obj6;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            if (Intrinsics.f(outputData3, dii.f.f115069a)) {
                                                cVar3.n2(new i(true, cVar3, null, 1), new whi.b(6));
                                            } else if (Intrinsics.f(outputData3, dii.e.f115068a)) {
                                                cVar3.N2(true);
                                            } else {
                                                int i106 = jli.h.f175850a;
                                            }
                                            return Unit.f186387a;
                                        default:
                                            os.h outputData4 = (os.h) obj6;
                                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                            outputData4.getClass();
                                            cVar3.M2("BiometricVerificationActiveLivenessIntroScreenContract_BUTTON_TAG", false);
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block27, "block");
                            actionsBottomSheetController2.H = block27;
                            return actionsBottomSheetController2;
                        }
                        bVar7.getClass();
                        Intrinsics.checkNotNullParameter(code, "code");
                        submitConfirmationScreen = new SubmitConfirmationScreen(new SubmitConfirmationScreenContract$InputData(((f01.a) bVar7.f226950b).b(onh.b.f(code)).toString()));
                        Function1 block28 = new Function1() { // from class: ks.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i1052 = i6;
                                com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar3 = cVar2;
                                switch (i1052) {
                                    case 0:
                                        rs.l outputData = (rs.l) obj6;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (Intrinsics.f(outputData, rs.k.f256894a)) {
                                            cVar3.n2(new i(false, cVar3, null, 1), new whi.b(6));
                                        } else {
                                            if (!Intrinsics.f(outputData, rs.j.f256893a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar3.N2(false);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        ms.k outputData2 = (ms.k) obj6;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        if (outputData2 instanceof ms.j) {
                                            cVar3.n2(new i(false, cVar3, null, 1), new whi.b(6));
                                        } else {
                                            if (!(outputData2 instanceof ms.i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar3.N2(false);
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g outputData3 = (dii.g) obj6;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (Intrinsics.f(outputData3, dii.f.f115069a)) {
                                            cVar3.n2(new i(true, cVar3, null, 1), new whi.b(6));
                                        } else if (Intrinsics.f(outputData3, dii.e.f115068a)) {
                                            cVar3.N2(true);
                                        } else {
                                            int i106 = jli.h.f175850a;
                                        }
                                        return Unit.f186387a;
                                    default:
                                        os.h outputData4 = (os.h) obj6;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        outputData4.getClass();
                                        cVar3.M2("BiometricVerificationActiveLivenessIntroScreenContract_BUTTON_TAG", false);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block28, "block");
                        submitConfirmationScreen.H = block28;
                    }
                }
                return submitConfirmationScreen;
            case 15:
                return a(obj2, obj3);
            case 16:
                com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b bVar9 = (com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ConsentPromptPreconditionScreenContract$ModalStep step16 = (ConsentPromptPreconditionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof ConsentPromptPreconditionScreenContract$ModalStep.ReviewClosureConditions)) {
                    throw new NoWhenBranchMatchedException();
                }
                ReviewClosureConditionsBottomSheetController reviewClosureConditionsBottomSheetController = new ReviewClosureConditionsBottomSheetController(new xug.h(((ConsentPromptPreconditionScreenContract$ModalStep.ReviewClosureConditions) step16).f94932a));
                q block29 = new q(bVar9, step16, i3);
                Intrinsics.checkNotNullParameter(block29, "block");
                reviewClosureConditionsBottomSheetController.H = block29;
                return reviewClosureConditionsBottomSheetController;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return (List) ((com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.c) obj4).f94945c.getValue();
            case 18:
                final com.revolut.feature.credit.card.impl.ui.statement.details.flow.a aVar20 = (com.revolut.feature.credit.card.impl.ui.statement.details.flow.a) obj4;
                CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData = aVar20.o;
                final l FlowCoordinator6 = (l) obj2;
                CreditCardStatementDetailsFlowContract$Step step17 = (CreditCardStatementDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof CreditCardStatementDetailsFlowContract$Step.Details) {
                    CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = new CreditCardStatementDetailsScreen(new CreditCardStatementDetailsScreenContract$InputData(creditCardStatementDetailsFlowContract$InputData.f69674a, creditCardStatementDetailsFlowContract$InputData.f69675b));
                    Function1 block30 = new Function1() { // from class: kv4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    com.revolut.feature.credit.card.impl.ui.statement.details.flow.a aVar21 = aVar20;
                                    CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData2 = aVar21.o;
                                    yki.a aVar22 = aVar21.f69689q;
                                    fv4.m result = (fv4.m) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof fv4.i;
                                    l lVar2 = FlowCoordinator6;
                                    if (z3) {
                                        h.t2(aVar21, lVar2, new CreditCardStatementDetailsFlowContract$Step.ExportStatement(((fv4.i) result).f138332a), true, null, false, 12);
                                    } else {
                                        boolean z4 = result instanceof fv4.h;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z4) {
                                            h.w2(aVar22, new CreditCardStatementDetailsFlowContract$Step.Transactions(creditCardStatementDetailsFlowContract$InputData2.f69674a, ((fv4.h) result).f138331a), popup);
                                        } else if (result instanceof fv4.j) {
                                            h.t2(aVar21, lVar2, CreditCardStatementDetailsFlowContract$Step.Pay.f69681a, true, null, false, 12);
                                        } else if (result instanceof fv4.l) {
                                            h.w2(aVar22, new CreditCardStatementDetailsFlowContract$Step.StatementFinancing(creditCardStatementDetailsFlowContract$InputData2.f69674a, ((fv4.l) result).f138335a), popup);
                                        } else if (result instanceof fv4.k) {
                                            h.w2(aVar22, new CreditCardStatementDetailsFlowContract$Step.PrePurchaseInstalment(creditCardStatementDetailsFlowContract$InputData2.f69674a, ((fv4.k) result).f138334a), popup);
                                        } else {
                                            if (!(result instanceof fv4.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            fv4.g gVar2 = (fv4.g) result;
                                            h.w2(lVar2, new CreditCardStatementDetailsFlowContract$Step.AccruedInterests(gVar2.f138328a, gVar2.f138329b, gVar2.f138330c), popup);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    gv4.g output = (gv4.g) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof gv4.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar20, FlowCoordinator6, CreditCardStatementDetailsFlowContract$Step.Pay.f69681a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block30, "block");
                    creditCardStatementDetailsScreen.H = block30;
                    return creditCardStatementDetailsScreen;
                }
                if (step17 instanceof CreditCardStatementDetailsFlowContract$Step.ExportStatement) {
                    return new CreditCardStatementExportScreen(new CreditCardStatementExportScreenContract$InputData(creditCardStatementDetailsFlowContract$InputData.f69674a, ((CreditCardStatementDetailsFlowContract$Step.ExportStatement) step17).f69680a));
                }
                if (step17 instanceof CreditCardStatementDetailsFlowContract$Step.Pay) {
                    CreditCardRepayFlow creditCardRepayFlow = new CreditCardRepayFlow(new CreditCardRepayFlowContract$InputData(null, creditCardStatementDetailsFlowContract$InputData.f69674a));
                    kog.k block31 = new kog.k(aVar20, 28);
                    Intrinsics.checkNotNullParameter(block31, "block");
                    creditCardRepayFlow.H = block31;
                    return creditCardRepayFlow;
                }
                if (step17 instanceof CreditCardStatementDetailsFlowContract$Step.AccruedInterests) {
                    CreditCardStatementDetailsFlowContract$Step.AccruedInterests accruedInterests = (CreditCardStatementDetailsFlowContract$Step.AccruedInterests) step17;
                    CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen = new CreditCardAccruedInterestsScreen(new CreditCardAccruedInterestsScreenContract$InputData(accruedInterests.f69676a, accruedInterests.f69677b, accruedInterests.f69678c));
                    Function1 block32 = new Function1() { // from class: kv4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    com.revolut.feature.credit.card.impl.ui.statement.details.flow.a aVar21 = aVar20;
                                    CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData2 = aVar21.o;
                                    yki.a aVar22 = aVar21.f69689q;
                                    fv4.m result = (fv4.m) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof fv4.i;
                                    l lVar2 = FlowCoordinator6;
                                    if (z3) {
                                        h.t2(aVar21, lVar2, new CreditCardStatementDetailsFlowContract$Step.ExportStatement(((fv4.i) result).f138332a), true, null, false, 12);
                                    } else {
                                        boolean z4 = result instanceof fv4.h;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z4) {
                                            h.w2(aVar22, new CreditCardStatementDetailsFlowContract$Step.Transactions(creditCardStatementDetailsFlowContract$InputData2.f69674a, ((fv4.h) result).f138331a), popup);
                                        } else if (result instanceof fv4.j) {
                                            h.t2(aVar21, lVar2, CreditCardStatementDetailsFlowContract$Step.Pay.f69681a, true, null, false, 12);
                                        } else if (result instanceof fv4.l) {
                                            h.w2(aVar22, new CreditCardStatementDetailsFlowContract$Step.StatementFinancing(creditCardStatementDetailsFlowContract$InputData2.f69674a, ((fv4.l) result).f138335a), popup);
                                        } else if (result instanceof fv4.k) {
                                            h.w2(aVar22, new CreditCardStatementDetailsFlowContract$Step.PrePurchaseInstalment(creditCardStatementDetailsFlowContract$InputData2.f69674a, ((fv4.k) result).f138334a), popup);
                                        } else {
                                            if (!(result instanceof fv4.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            fv4.g gVar2 = (fv4.g) result;
                                            h.w2(lVar2, new CreditCardStatementDetailsFlowContract$Step.AccruedInterests(gVar2.f138328a, gVar2.f138329b, gVar2.f138330c), popup);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    gv4.g output = (gv4.g) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof gv4.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar20, FlowCoordinator6, CreditCardStatementDetailsFlowContract$Step.Pay.f69681a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block32, "block");
                    creditCardAccruedInterestsScreen.H = block32;
                    return creditCardAccruedInterestsScreen;
                }
                if (step17 instanceof CreditCardStatementDetailsFlowContract$Step.StatementFinancing) {
                    CreditCardStatementDetailsFlowContract$Step.StatementFinancing statementFinancing = (CreditCardStatementDetailsFlowContract$Step.StatementFinancing) step17;
                    return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.StatementFinancing(statementFinancing.f69684a, statementFinancing.f69685b));
                }
                if (step17 instanceof CreditCardStatementDetailsFlowContract$Step.Transactions) {
                    CreditCardStatementDetailsFlowContract$Step.Transactions transactions = (CreditCardStatementDetailsFlowContract$Step.Transactions) step17;
                    return new CreditCardTransactionsFlow(new CreditCardTransactionsFlowContract$InputData(transactions.f69686a, transactions.f69687b));
                }
                if (!(step17 instanceof CreditCardStatementDetailsFlowContract$Step.PrePurchaseInstalment)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardStatementDetailsFlowContract$Step.PrePurchaseInstalment prePurchaseInstalment = (CreditCardStatementDetailsFlowContract$Step.PrePurchaseInstalment) step17;
                return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.PrePurchase(prePurchaseInstalment.f69682a, prePurchaseInstalment.f69683b));
            case 19:
                com.revolut.feature.kyc.impl.external.app.flow.a aVar21 = (com.revolut.feature.kyc.impl.external.app.flow.a) obj4;
                ExternalAppKycProviderFlowContract$Step step18 = (ExternalAppKycProviderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (!Intrinsics.f(step18, ExternalAppKycProviderFlowContract$Step.Prompt.f77654a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iv8.c cVar3 = aVar21.f77657r;
                ExternalKycPromptConfiguration externalKycPromptConfiguration = aVar21.o.d;
                cVar3.getClass();
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(iv8.c.a(externalKycPromptConfiguration));
                g block33 = new g(aVar21, i6);
                Intrinsics.checkNotNullParameter(block33, "block");
                promptMarketingScreen.H = block33;
                return promptMarketingScreen;
            case 20:
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = BrebQrRequestAddDetailsScreen.T;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText2 = field2.getEditText();
                xi0.b.Companion.getClass();
                return new zp0.d(editText2, xi0.b.F, (u80.d) ((BrebQrRequestAddDetailsScreen) obj4).P.getValue(), null, null, false, false, 0, false, null, 1944);
            case 21:
                return b(obj2, obj3);
            case 22:
                return c(obj2, obj3);
            case 23:
                kxj.b bVar10 = (kxj.b) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return bVar10.f190584b;
            case 24:
                List value3 = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(value3, "value");
                ((kya.b) obj4).f190639c.f("REF_TROUBLESHOOTER_KEY", value3);
                return Unit.f186387a;
            case 25:
                return d(obj2, obj3);
            case 26:
                return e(obj2, obj3);
            case 27:
                return g(obj2, obj3);
            case 28:
                return h(obj2, obj3);
            default:
                CreditScore domain = (CreditScore) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((l05.i) obj4).f191185b.f("credit-score-data", domain);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ c(kkj.s sVar, kkj.f fVar) {
        this.f184288a = 6;
        this.f184289b = fVar;
    }
}
