package oa4;

import aii.e0;
import aii.q;
import android.os.Parcelable;
import android.view.View;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import bai.j;
import c12.j0;
import cli.y;
import com.google.android.material.internal.ViewUtils;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.kd;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.ManageTaxRatesFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreenContract$ModalStep;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.select_tax_rate.SelectTaxRateScreen;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import com.revolut.feature.apm.wero.impl.common.WeroArticles;
import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlowContract$Step;
import com.revolut.feature.apm.wero.impl.ui.registration.confirmation.WeroRegistrationConfirmationScreen;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendEntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlowEntitiesPage;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreen;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.api.models.WaitingListPromptContent;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreenContract$InputData;
import com.revolut.feature.external_accounts.api.navigation.BrazilInboundMandateConfirmationDescriptor$InputData;
import com.revolut.feature.external_accounts.api.navigation.BrazilInboundOpenbankingDescriptor$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.BrazilInboundMandateConfirmationFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.BrazilInstitutionInfoScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.BrazilInstitutionInfoScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.BrazilInboundMandatePreviewScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$OutputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.CreateSecretPhraseFlowContract$Step;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase.CreateSecretPhraseScreen;
import com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.a;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.DriverNumberInputScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.DriverNumberInputScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driving_number_prompt.DrivingNumberPromptScreen;
import com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.JuniorPostOnboardingFlowContract$Step;
import com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlowContract$Step;
import com.revolut.feature.junior_progression.impl.ui.prompt.steps.prompt.JuniorProgressionPromptScreen;
import com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.JuniorAddPhoneNumberFlow;
import com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.JuniorAddPhoneNumberFlowContract$InputData;
import com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.JuniorCreatePhoneNumberFlowContract$Step;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsConfiguration;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsFlowInputData;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.impl.onboarding.plan_selection.OnboardingPlanSelectionFlowContract$Step;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlowContract$Step;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreenContract$InputData;
import com.revolut.feature.onboarding.impl.qes_terms.data.QesTermsOtpTask;
import com.revolut.feature.passcode.PasscodeScreen;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.RightToCancelFlowContract$InputData;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.RightToCancelFlowContract$Step;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.intro.IntroController;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.intro.IntroControllerContract$InputData;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryController;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutContract$ModalStep;
import com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.EmployerDetailsScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details.ReviewDetailsScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details.ReviewDetailsScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.SalaryRequestsScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreenContract$InputData;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import com.revolut.feature.user_declarations.shared.flows.name.screen.NameScreen;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreenContract$ModalStep;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlow;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlowContract$Step;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsControllerDescriptor;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$Configuration;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.gender.GenderScreen;
import com.revolut.feature_retail_user_declarations.gender.GenderScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowContract$StepResult;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsStep;
import com.revolut.feature_retail_user_declarations.occupation.OccupationChooserFlowInputData;
import com.revolut.feature_retail_user_declarations.personal_code.PersonalCodeContract$InputData;
import com.revolut.feature_retail_user_declarations.personal_code.PersonalCodeController;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.flow.PurposeOfAccountFlow;
import com.revolut.feature_retail_user_declarations.purpose.model.PurposeOfAccountProductType;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.PlanSwitchToAnnualFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.PlanSwitchToAnnualFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.cancel_downgrade.CancelDowngradeScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.flow.PlanManagementFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.screen.PlanManagementScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.termsandconditions.screen.TermsAndConditionsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.PlanSwitchToAnnualScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.user_declarations.api.R$string;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowInputData;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowOutputData;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$OutputData;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$OutputData;
import com.revolut.shared.feature.user_declarations.api.navigation.PlaceOfBirthControllerDescriptor;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$AccessRecovery;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import fy4.s;
import fy4.t;
import gi1.p;
import grl.k9;
import grl.q6;
import igk.b0;
import igk.d0;
import igk.k0;
import igk.l0;
import igk.m0;
import igk.n0;
import igk.q0;
import igk.w;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import lnk.f;
import nii.g0;
import nii.y0;
import nya.i0;
import nzj.n;
import oki.h;
import ood.o0;
import op7.d;
import org.jmrtd.lds.LDSFile;
import pk9.g;
import pk9.i;
import q90.u;
import qb7.e;
import rk9.j;
import rk9.k;
import rk9.m;
import s7a.a0;
import s7a.c0;
import s7a.v;
import s7a.x;
import s7a.z;
import skm.p0;
import sx2.r;
import uj6.o;
import vkm.j2;
import yki.l;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f223517b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f223516a = i;
        this.f223517b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.a aVar = (com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.a) this.f223517b;
        RightToCancelFlowContract$InputData rightToCancelFlowContract$InputData = aVar.o;
        l FlowCoordinator = (l) obj2;
        RightToCancelFlowContract$Step step = (RightToCancelFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof RightToCancelFlowContract$Step.Intro) {
            IntroController introController = new IntroController(new IntroControllerContract$InputData(rightToCancelFlowContract$InputData.f78922a));
            final int i = 0;
            Function1 block = new Function1() { // from class: ok9.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            i output = (i) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof g;
                            com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.a aVar2 = aVar;
                            if (z) {
                                h.t2(aVar2, aVar2.f78926q, RightToCancelFlowContract$Step.Summary.f78924a, false, null, false, 14);
                            } else {
                                if (!(output instanceof pk9.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.D2(aVar2.f78926q);
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.a aVar3 = aVar;
                            yki.a aVar4 = aVar3.f78926q;
                            m output2 = (m) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if ((output2 instanceof j) || (output2 instanceof k)) {
                                h.D2(aVar4);
                            } else {
                                if (!(output2 instanceof rk9.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.r2(aVar4);
                                aVar3.C1(new e0(new PayLaterKompotFeatureConfig.RepayAmount(0).f98274b, null, false, 2));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            introController.H = block;
            return introController;
        }
        if (!(step instanceof RightToCancelFlowContract$Step.Summary)) {
            throw new NoWhenBranchMatchedException();
        }
        SummaryController summaryController = new SummaryController(new SummaryControllerContract$InputData(rightToCancelFlowContract$InputData.f78922a));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: ok9.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        i output = (i) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof g;
                        com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.a aVar2 = aVar;
                        if (z) {
                            h.t2(aVar2, aVar2.f78926q, RightToCancelFlowContract$Step.Summary.f78924a, false, null, false, 14);
                        } else {
                            if (!(output instanceof pk9.h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h.D2(aVar2.f78926q);
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.a aVar3 = aVar;
                        yki.a aVar4 = aVar3.f78926q;
                        m output2 = (m) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if ((output2 instanceof j) || (output2 instanceof k)) {
                            h.D2(aVar4);
                        } else {
                            if (!(output2 instanceof rk9.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h.r2(aVar4);
                            aVar3.C1(new e0(new PayLaterKompotFeatureConfig.RepayAmount(0).f98274b, null, false, 2));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        summaryController.H = block2;
        return summaryController;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.b bVar = (com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.b) this.f223517b;
        l FlowCoordinator = (l) obj2;
        JuniorCreatePhoneNumberFlowContract$Step step = (JuniorCreatePhoneNumberFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof JuniorCreatePhoneNumberFlowContract$Step.AddPhoneNumber) {
            JuniorAddPhoneNumberFlow juniorAddPhoneNumberFlow = new JuniorAddPhoneNumberFlow(new JuniorAddPhoneNumberFlowContract$InputData(bVar.o.f77227a));
            ol8.d block = new ol8.d(1, 0, com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.b.class, bVar, "handleJuniorAddPhoneNumberResult", "handleJuniorAddPhoneNumberResult(Lcom/revolut/feature/junior_remote_login/navigation/JuniorAddPhoneNumberFlowPublicContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(block, "block");
            juniorAddPhoneNumberFlow.H = block;
            return juniorAddPhoneNumberFlow;
        }
        if (!(step instanceof JuniorCreatePhoneNumberFlowContract$Step.InvitationSuccessPrompt)) {
            throw new NoWhenBranchMatchedException();
        }
        JuniorCreatePhoneNumberFlowContract$Step.InvitationSuccessPrompt invitationSuccessPrompt = (JuniorCreatePhoneNumberFlowContract$Step.InvitationSuccessPrompt) step;
        return ((tl8.b) bVar.f77184r).a(invitationSuccessPrompt.f77179a, invitationSuccessPrompt.f77180b, new ofg.a(bVar, step, 19));
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.b bVar = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.b) this.f223517b;
        l FlowCoordinator = (l) obj2;
        ProofOfDrivingNumberFlowContract$Step step = (ProofOfDrivingNumberFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ProofOfDrivingNumberFlowContract$Step.Prompt) {
            DrivingNumberPromptScreen drivingNumberPromptScreen = new DrivingNumberPromptScreen();
            final int i = 0;
            Function1 block = new Function1() { // from class: om7.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            d it8 = (d) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.b bVar2 = bVar;
                            h.t2(bVar2, bVar2.f75441p, new ProofOfDrivingNumberFlowContract$Step.DrivingNumberInput(bVar2.o.f75437a), true, null, false, 12);
                            break;
                        default:
                            mp7.i it9 = (mp7.i) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            bVar.C2(a.C0503a.f75440a);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            drivingNumberPromptScreen.H = block;
            return drivingNumberPromptScreen;
        }
        if (!(step instanceof ProofOfDrivingNumberFlowContract$Step.DrivingNumberInput)) {
            throw new NoWhenBranchMatchedException();
        }
        DriverNumberInputScreen driverNumberInputScreen = new DriverNumberInputScreen(new DriverNumberInputScreenContract$InputData(bVar.o.f75437a));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: om7.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        d it8 = (d) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.b bVar2 = bVar;
                        h.t2(bVar2, bVar2.f75441p, new ProofOfDrivingNumberFlowContract$Step.DrivingNumberInput(bVar2.o.f75437a), true, null, false, 12);
                        break;
                    default:
                        mp7.i it9 = (mp7.i) obj4;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        bVar.C2(a.C0503a.f75440a);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        driverNumberInputScreen.H = block2;
        return driverNumberInputScreen;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.flow.a aVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.flow.a) this.f223517b;
        l FlowCoordinator = (l) obj2;
        PlanManagementFlowContract$Step step = (PlanManagementFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, PlanManagementFlowContract$Step.PlanManagement.f103580a)) {
            PlanManagementScreen planManagementScreen = new PlanManagementScreen();
            ofg.a aVar2 = new ofg.a(aVar, FlowCoordinator, 29);
            Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
            planManagementScreen.H = aVar2;
            return planManagementScreen;
        }
        if (Intrinsics.f(step, PlanManagementFlowContract$Step.TermsAndConditions.f103583a)) {
            return new TermsAndConditionsScreen();
        }
        if (Intrinsics.f(step, PlanManagementFlowContract$Step.CancelDowngrade.f103579a)) {
            return new CancelDowngradeScreen();
        }
        if (!(step instanceof PlanManagementFlowContract$Step.SwitchToAnnual)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanManagementFlowContract$Step.SwitchToAnnual switchToAnnual = (PlanManagementFlowContract$Step.SwitchToAnnual) step;
        return new PlanSwitchToAnnualFlow(new oik.c(switchToAnnual.f103581a, switchToAnnual.f103582b, false));
    }

    private final Object e(Object obj2, Object obj3) {
        ona.j jVar = (ona.j) this.f223517b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return jVar.b();
    }

    private final Object g(Object obj2, Object obj3) {
        final com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a aVar = (com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a) this.f223517b;
        y yVar = aVar.u;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PlaceOfBirthScreenContract$ModalStep step = (PlaceOfBirthScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, PlaceOfBirthScreenContract$ModalStep.CountryPicker.f94676a)) {
            wi0.b bVar = (wi0.b) ((oog.g) ((j2) yVar.f22677a).getValue()).f227102a.getContent();
            x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(R$string.user_migration_place_of_birth_country_search_hint, null, null, 14), null, null, false, null, bVar != null ? bVar.f297794a : null, null, null, true, null, null, null, null, null, 2138963450);
            Object obj4 = aVar.f94679r.get();
            Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
            PickerController pickerController = new PickerController(xVar, (x7a.d) obj4);
            final int i = 1;
            Function1 block = new Function1() { // from class: oog.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    int i2 = i;
                    com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a aVar2 = aVar;
                    switch (i2) {
                        case 0:
                            y yVar2 = aVar2.u;
                            a0 output = (a0) obj5;
                            Intrinsics.checkNotNullParameter(output, "output");
                            c0 c0Var = output.f260599a;
                            if (c0Var instanceof jbl.a) {
                                aVar2.H2(yVar2, new p(c0Var, 4));
                            } else if (c0Var instanceof z) {
                                aVar2.H2(yVar2, new o0(5));
                            } else {
                                int i3 = jli.h.f175850a;
                            }
                            break;
                        default:
                            a0 output2 = (a0) obj5;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            wi0.a aVar3 = wi0.b.Companion;
                            c0 c0Var2 = output2.f260599a;
                            Intrinsics.i(c0Var2, "null cannot be cast to non-null type com.revolut.feature.picker.result.CountryPickerControllerResult");
                            String str = ((c8a.a) c0Var2).f22154a;
                            aVar3.getClass();
                            aVar2.H2(aVar2.u, new ood.k(wi0.a.a(str), aVar2, 3));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            pickerController.H = block;
            return pickerController;
        }
        if (!Intrinsics.f(step, PlaceOfBirthScreenContract$ModalStep.CityPicker.f94675a)) {
            throw new NoWhenBranchMatchedException();
        }
        x xVar2 = new x(null, (wi0.b) ((oog.g) ((j2) yVar.f22677a).getValue()).f227102a.getContent(), null, null, false, null, new TextLocalisedClause(R$string.user_migration_place_of_birth_city_picker_search_city, null, null, 14), null, null, false, null, ((oog.g) ((j2) yVar.f22677a).getValue()).f227103b, null, null, true, null, null, new v(new TextLocalisedClause(R$string.user_migration_place_of_birth_city_picker_no_results, null, null, 14), Integer.valueOf(R$string.user_migration_place_of_birth_city_picker_no_results_subtitle), new TextLocalisedClause(R$string.user_migration_place_of_birth_city_picker_add_manually, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_16_plus)), null, null, 2004729336);
        Object obj5 = aVar.f94680s.get();
        Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
        PickerController pickerController2 = new PickerController(xVar2, (x7a.d) obj5);
        final int i2 = 0;
        Function1 block2 = new Function1() { // from class: oog.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj52) {
                int i22 = i2;
                com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a aVar2 = aVar;
                switch (i22) {
                    case 0:
                        y yVar2 = aVar2.u;
                        a0 output = (a0) obj52;
                        Intrinsics.checkNotNullParameter(output, "output");
                        c0 c0Var = output.f260599a;
                        if (c0Var instanceof jbl.a) {
                            aVar2.H2(yVar2, new p(c0Var, 4));
                        } else if (c0Var instanceof z) {
                            aVar2.H2(yVar2, new o0(5));
                        } else {
                            int i3 = jli.h.f175850a;
                        }
                        break;
                    default:
                        a0 output2 = (a0) obj52;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        wi0.a aVar3 = wi0.b.Companion;
                        c0 c0Var2 = output2.f260599a;
                        Intrinsics.i(c0Var2, "null cannot be cast to non-null type com.revolut.feature.picker.result.CountryPickerControllerResult");
                        String str = ((c8a.a) c0Var2).f22154a;
                        aVar3.getClass();
                        aVar2.H2(aVar2.u, new ood.k(wi0.a.a(str), aVar2, 3));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        pickerController2.H = block2;
        return pickerController2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object brazilInstitutionInfoScreen;
        int i = this.f223516a;
        final int i2 = 2;
        final int i3 = 3;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        boolean z54 = false;
        boolean z74 = false;
        boolean z83 = false;
        boolean z89 = false;
        boolean z96 = false;
        boolean z100 = false;
        final int i5 = 1;
        Object obj4 = this.f223517b;
        switch (i) {
            case 0:
                e eVar = (e) obj4;
                DropOutFormFlowContract$Step step = (DropOutFormFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                BackendFlowInput.Source.Session session = new BackendFlowInput.Source.Session(step.f67620a);
                BackendFlowApiEndpoints.Companion companion = BackendFlowApiEndpoints.INSTANCE;
                String str = step.f67621b;
                companion.getClass();
                ViewController viewControllerE1 = eVar.e1(new n90.a(new BackendFlowInput(session, null, null, BackendFlowNavigationIcon.Cross.f63286a, false, BackendFlowApiEndpoints.Companion.a(str), 54)));
                o54.a block = new o54.a(eVar, step, 15);
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            case 1:
                com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar = (com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a) obj4;
                oah.d dVar = aVar.o;
                l FlowCoordinator = (l) obj2;
                DualAddMoneyFlowContract$Step step2 = (DualAddMoneyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof DualAddMoneyFlowContract$Step.CreateOneOffDeposit) {
                    dj0.d dVar2 = dVar.f223638c;
                    long j2 = dVar2 != null ? dVar2.f115082a : 0L;
                    j0h.a aVar2 = dVar.f223639g ? j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT : j0h.a.REQUIRE_ONE_OFF_DEPOSIT;
                    n block2 = new n(1, aVar, com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a.class, "handleOneOffDepositOutput", "handleOneOffDepositOutput(Lcom/revolut/feature/wealth/impl/ui/flows/create_add_money_request/CollectDepositInfoFlowContract$Output;)V", 0, 21);
                    CollectDepositInfoFlow collectDepositInfoFlow = new CollectDepositInfoFlow(new CollectDepositInfoFlowContract$Input(dVar.f223636a, dVar.f223637b, j2, null, aVar2, null, null, 64));
                    Intrinsics.checkNotNullParameter(block2, "block");
                    collectDepositInfoFlow.H = block2;
                    return collectDepositInfoFlow;
                }
                if (step2 instanceof DualAddMoneyFlowContract$Step.CreateOrUpdateRecurringDeposit) {
                    dj0.d dVar3 = dVar.d;
                    long j3 = dVar3 != null ? dVar3.f115082a : 0L;
                    j0h.a aVar3 = j0h.a.REQUIRE_RECURRING_DEPOSIT;
                    RecurringDepositSchedule recurringDepositSchedule = dVar.e;
                    String str2 = dVar.f;
                    n block3 = new n(1, aVar, com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a.class, "handleRecurrentDepositOutput", "handleRecurrentDepositOutput(Lcom/revolut/feature/wealth/impl/ui/flows/create_add_money_request/CollectDepositInfoFlowContract$Output;)V", 0, 22);
                    CollectDepositInfoFlow collectDepositInfoFlow2 = new CollectDepositInfoFlow(new CollectDepositInfoFlowContract$Input(dVar.f223636a, dVar.f223637b, j3, recurringDepositSchedule, aVar3, str2, null, 64));
                    Intrinsics.checkNotNullParameter(block3, "block");
                    collectDepositInfoFlow2.H = block3;
                    return collectDepositInfoFlow2;
                }
                if (!(step2 instanceof DualAddMoneyFlowContract$Step.OfferSetupRecurringDepositDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.f95558p.getClass();
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_onboarding_add_money_offer_recurring_deposit_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_onboarding_add_money_offer_recurring_deposit_dialog_description, null, null, 14), null, null, false, 28);
                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_onboarding_add_money_add_recurring_deposit_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var = k9.RoboAdvisor;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar4, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                o9h.b block4 = new o9h.b(aVar, i3);
                Intrinsics.checkNotNullParameter(block4, "block");
                actionsBottomSheetController.H = block4;
                return actionsBottomSheetController;
            case 2:
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.a aVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EvidenceTypeSelectionScreenContract$ModalStep step3 = (EvidenceTypeSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof EvidenceTypeSelectionScreenContract$ModalStep.Info) {
                    return aVar5.e1(new s(new t(((EvidenceTypeSelectionScreenContract$ModalStep.Info) step3).f67707a)));
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                final com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c cVar = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                CreateSecretPhraseFlowContract$Step step4 = (CreateSecretPhraseFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof CreateSecretPhraseFlowContract$Step.ProductArticle) {
                    ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(HiddenAccountProductArticleKey.SECRET_ACCOUNTS));
                    k9 k9Var2 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    ViewController viewControllerE12 = cVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, false, 52));
                    o54.a block5 = new o54.a(cVar, LazyFlowCoordinator, 18);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE12.H = block5;
                    return viewControllerE12;
                }
                if (step4 instanceof CreateSecretPhraseFlowContract$Step.CreateSecretPhrase) {
                    CreateSecretPhraseScreen createSecretPhraseScreen = new CreateSecretPhraseScreen();
                    final boolean z101 = z6 ? 1 : 0;
                    Function1 block6 = new Function1() { // from class: ob7.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (z101) {
                                case 0:
                                    e outputData = (e) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (!Intrinsics.f(outputData, e.f244128a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c cVar2 = cVar;
                                    cVar2.n2(new com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.a(cVar2, null), new whi.b(6));
                                    return Unit.f186387a;
                                default:
                                    dii.g result = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if ((result instanceof dii.c) && Intrinsics.f(((dii.c) result).f115066a.f275445a, "HIDDEN_ACCOUNTS_FROM_VIEW_CLICK_ID")) {
                                        cVar.C1(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.HiddenAccountsAndTransactions.f85375a, false, (String) null, true, 22));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    createSecretPhraseScreen.H = block6;
                    return createSecretPhraseScreen;
                }
                if (!(step4 instanceof CreateSecretPhraseFlowContract$Step.AccountMadeSecret)) {
                    throw new NoWhenBranchMatchedException();
                }
                LayoutViewerScreen layoutViewerScreen = new LayoutViewerScreen(R$layout.screen_transparent);
                ActionsBottomSheetController actionsBottomSheetControllerA = cVar.f74685q.a();
                actionsBottomSheetControllerA.k2(new dld.c(cVar, LazyFlowCoordinator, 6));
                cVar.f2(actionsBottomSheetControllerA, ModalDestination.Style.BOTTOM_DIALOG.f98301a, new Function1() { // from class: ob7.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i5) {
                            case 0:
                                e outputData = (e) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (!Intrinsics.f(outputData, e.f244128a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c cVar2 = cVar;
                                cVar2.n2(new com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.a(cVar2, null), new whi.b(6));
                                return Unit.f186387a;
                            default:
                                dii.g result = (dii.g) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if ((result instanceof dii.c) && Intrinsics.f(((dii.c) result).f115066a.f275445a, "HIDDEN_ACCOUNTS_FROM_VIEW_CLICK_ID")) {
                                    cVar.C1(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.HiddenAccountsAndTransactions.f85375a, false, (String) null, true, 22));
                                }
                                return Unit.f186387a;
                        }
                    }
                });
                return layoutViewerScreen;
            case 4:
                final com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar6 = (com.revolut.feature.onboarding.impl.onboarding.plan_selection.a) obj4;
                OnboardingPlanSelectionFlowContract$Step step5 = (OnboardingPlanSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof OnboardingPlanSelectionFlowContract$Step.SelectPlan) {
                    OnboardingPlanSelectionFlowContract$Step.SelectPlan selectPlan = (OnboardingPlanSelectionFlowContract$Step.SelectPlan) step5;
                    ViewController viewControllerE13 = aVar6.e1(new w(new igk.x(selectPlan.f78473a, (k0) null, new l0(1, null, selectPlan.f78474b ? Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow) : null), (xfa.a) null, 22)));
                    final boolean z102 = z11 ? 1 : 0;
                    Function1 block7 = new Function1() { // from class: ob9.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            Continuation continuation = null;
                            switch (z102) {
                                case 0:
                                    d0 result = (d0) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z103 = result instanceof igk.a0;
                                    com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar7 = aVar6;
                                    if (z103) {
                                        igk.a0 a0Var = (igk.a0) result;
                                        hha.d dVar4 = a0Var.f161232a;
                                        hha.i iVar = a0Var.f161233b;
                                        PricingPlanOffer pricingPlanOffer = a0Var.f161234c;
                                        tfk.a aVar8 = aVar7.f78477r;
                                        String planId = dVar4.f152287a;
                                        aVar8.getClass();
                                        Intrinsics.checkNotNullParameter(planId, "planId");
                                        CoroutineScope coroutineScope = aVar8.f270326a;
                                        p0 p0Var = p0.f264001a;
                                        skm.e0.C(coroutineScope, elm.f.f127540b, null, new r(aVar8, planId, null, 28), 2);
                                        aVar7.A1(new mp6.j(9, aVar7, dVar4, iVar, pricingPlanOffer, (Continuation) null), new yi5.b(25));
                                    } else if (result instanceof igk.y) {
                                        aVar7.A1(new nyd.j(aVar7, (igk.y) result, continuation, 9), new yi5.b(25));
                                    } else if (result instanceof igk.z) {
                                        aVar7.A1(new nyd.j(aVar7, (igk.z) result, continuation, 8), new yi5.b(25));
                                    } else {
                                        if (!(result instanceof b0) && !(result instanceof igk.c0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar7.n2(new i0(aVar7, (Continuation) null, 19), new whi.b(6));
                                    }
                                    return Unit.f186387a;
                                default:
                                    q0 result2 = (q0) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z104 = result2 instanceof n0;
                                    com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar9 = aVar6;
                                    if (z104) {
                                        n0 n0Var = (n0) result2;
                                        hha.d dVar5 = n0Var.f161262a;
                                        hha.i iVar2 = n0Var.f161263b;
                                        PricingPlanOffer pricingPlanOffer2 = n0Var.f161264c;
                                        tfk.a aVar10 = aVar9.f78477r;
                                        String planId2 = dVar5.f152287a;
                                        aVar10.getClass();
                                        Intrinsics.checkNotNullParameter(planId2, "planId");
                                        CoroutineScope coroutineScope2 = aVar10.f270326a;
                                        p0 p0Var2 = p0.f264001a;
                                        skm.e0.C(coroutineScope2, elm.f.f127540b, null, new r(aVar10, planId2, null, 28), 2);
                                        aVar9.A1(new mp6.j(9, aVar9, dVar5, iVar2, pricingPlanOffer2, (Continuation) null), new yi5.b(25));
                                    } else if (result2 instanceof igk.p0) {
                                        aVar9.n2(new i0(aVar9, (Continuation) null, 19), new whi.b(6));
                                    } else {
                                        if (!(result2 instanceof igk.o0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar9, aVar9.v, new OnboardingPlanSelectionFlowContract$Step.SelectPlan(xfa.b.ONBOARDING_FREE_TRIAL_OFFER, true), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    viewControllerE13.H = block7;
                    return viewControllerE13;
                }
                if (!(step5 instanceof OnboardingPlanSelectionFlowContract$Step.PlanOffer)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE14 = aVar6.e1(new m0(xfa.b.ONBOARDING_FREE_TRIAL_OFFER));
                Function1 block8 = new Function1() { // from class: ob9.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        Continuation continuation = null;
                        switch (i5) {
                            case 0:
                                d0 result = (d0) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z103 = result instanceof igk.a0;
                                com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar7 = aVar6;
                                if (z103) {
                                    igk.a0 a0Var = (igk.a0) result;
                                    hha.d dVar4 = a0Var.f161232a;
                                    hha.i iVar = a0Var.f161233b;
                                    PricingPlanOffer pricingPlanOffer = a0Var.f161234c;
                                    tfk.a aVar8 = aVar7.f78477r;
                                    String planId = dVar4.f152287a;
                                    aVar8.getClass();
                                    Intrinsics.checkNotNullParameter(planId, "planId");
                                    CoroutineScope coroutineScope = aVar8.f270326a;
                                    p0 p0Var = p0.f264001a;
                                    skm.e0.C(coroutineScope, elm.f.f127540b, null, new r(aVar8, planId, null, 28), 2);
                                    aVar7.A1(new mp6.j(9, aVar7, dVar4, iVar, pricingPlanOffer, (Continuation) null), new yi5.b(25));
                                } else if (result instanceof igk.y) {
                                    aVar7.A1(new nyd.j(aVar7, (igk.y) result, continuation, 9), new yi5.b(25));
                                } else if (result instanceof igk.z) {
                                    aVar7.A1(new nyd.j(aVar7, (igk.z) result, continuation, 8), new yi5.b(25));
                                } else {
                                    if (!(result instanceof b0) && !(result instanceof igk.c0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar7.n2(new i0(aVar7, (Continuation) null, 19), new whi.b(6));
                                }
                                return Unit.f186387a;
                            default:
                                q0 result2 = (q0) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean z104 = result2 instanceof n0;
                                com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar9 = aVar6;
                                if (z104) {
                                    n0 n0Var = (n0) result2;
                                    hha.d dVar5 = n0Var.f161262a;
                                    hha.i iVar2 = n0Var.f161263b;
                                    PricingPlanOffer pricingPlanOffer2 = n0Var.f161264c;
                                    tfk.a aVar10 = aVar9.f78477r;
                                    String planId2 = dVar5.f152287a;
                                    aVar10.getClass();
                                    Intrinsics.checkNotNullParameter(planId2, "planId");
                                    CoroutineScope coroutineScope2 = aVar10.f270326a;
                                    p0 p0Var2 = p0.f264001a;
                                    skm.e0.C(coroutineScope2, elm.f.f127540b, null, new r(aVar10, planId2, null, 28), 2);
                                    aVar9.A1(new mp6.j(9, aVar9, dVar5, iVar2, pricingPlanOffer2, (Continuation) null), new yi5.b(25));
                                } else if (result2 instanceof igk.p0) {
                                    aVar9.n2(new i0(aVar9, (Continuation) null, 19), new whi.b(6));
                                } else {
                                    if (!(result2 instanceof igk.o0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar9, aVar9.v, new OnboardingPlanSelectionFlowContract$Step.SelectPlan(xfa.b.ONBOARDING_FREE_TRIAL_OFFER, true), true, null, false, 12);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block8, "block");
                viewControllerE14.H = block8;
                return viewControllerE14;
            case 5:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsCampaignsHubScreenContract$ModalStep step6 = (TravelHotelsCampaignsHubScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof TravelHotelsCampaignsHubScreenContract$ModalStep.DatesSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen = new TravelHotelsDatesPickerScreen(((TravelHotelsCampaignsHubScreenContract$ModalStep.DatesSelection) step6).f93861a);
                o54.a block9 = new o54.a(bVar, step6, 19);
                Intrinsics.checkNotNullParameter(block9, "block");
                travelHotelsDatesPickerScreen.H = block9;
                return travelHotelsDatesPickerScreen;
            case 6:
                final com.revolut.feature_retail_user_declarations.identity_declarations.a aVar7 = (com.revolut.feature_retail_user_declarations.identity_declarations.a) obj4;
                l FlowCoordinator2 = (l) obj2;
                final IdentityDeclarationsStep step7 = (IdentityDeclarationsStep) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof IdentityDeclarationsStep.Name) {
                    IdentityDeclarationsStep.Name name = (IdentityDeclarationsStep.Name) step7;
                    NameScreen nameScreen = new NameScreen(new NameControllerDescriptor$InputData(name.f97678a, name.f97679b, name.f97680c, name.f, aVar7.I2(name), name.d, null, name.e, name.f97681g, 64));
                    final boolean z103 = z12 ? 1 : 0;
                    Function1 block10 = new Function1() { // from class: obi.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (z103) {
                                case 0:
                                    NameControllerDescriptor$OutputData data = (NameControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Name(data.f105059a, data.f105060b, data.f105061c, data.d, data.e, data.f, data.f105062g));
                                    return Unit.f186387a;
                                case 1:
                                    DateOfBirthControllerDescriptor$OutputData data2 = (DateOfBirthControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data2, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.DateOfBirth(data2.f105052a));
                                    return Unit.f186387a;
                                case 2:
                                    rbi.c data3 = (rbi.c) obj5;
                                    Intrinsics.checkNotNullParameter(data3, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Occupation(data3.f253120a));
                                    return Unit.f186387a;
                                case 3:
                                    mbi.i data4 = (mbi.i) obj5;
                                    Intrinsics.checkNotNullParameter(data4, "data");
                                    boolean z104 = data4 instanceof mbi.g;
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar8 = aVar7;
                                    if (z104) {
                                        aVar8.B2();
                                    } else {
                                        if (!(data4 instanceof mbi.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Gender(((mbi.h) data4).f204224a));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    PlaceOfBirthFlowOutputData data5 = (PlaceOfBirthFlowOutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data5, "data");
                                    boolean zF = Intrinsics.f(data5, PlaceOfBirthFlowOutputData.Cancel.f105027a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar9 = aVar7;
                                    if (zF) {
                                        aVar9.B2();
                                    } else if (data5 instanceof PlaceOfBirthFlowOutputData.Success) {
                                        aVar9.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) data5));
                                    } else if (!Intrinsics.f(data5, PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    ybi.b output = (ybi.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount(output.f312372a));
                                    return Unit.f186387a;
                                case 6:
                                    bai.j result = (bai.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, j.a.f14102a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar10 = aVar7;
                                    if (zF2) {
                                        aVar10.B2();
                                    } else {
                                        if (!(result instanceof bai.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        List list = ((bai.k) result).f14103a;
                                        IdentityDeclarationsStep identityDeclarationsStep = step7;
                                        aVar10.J2(identityDeclarationsStep, new IdentityDeclarationsFlowContract$StepResult.AcceptedTerms(list, ((IdentityDeclarationsStep.AcceptedTerms) identityDeclarationsStep).f97674c));
                                    }
                                    return Unit.f186387a;
                                default:
                                    wbi.d result2 = (wbi.d) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF3 = Intrinsics.f(result2, wbi.b.f296221a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar11 = aVar7;
                                    if (zF3) {
                                        aVar11.B2();
                                    } else {
                                        if (!(result2 instanceof wbi.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IdentityDeclarationsStep identityDeclarationsStep2 = step7;
                                        aVar11.J2(identityDeclarationsStep2, new IdentityDeclarationsFlowContract$StepResult.PersonalCode(((IdentityDeclarationsStep.PersonalCode) identityDeclarationsStep2).f97684a, ((wbi.c) result2).f296222a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    nameScreen.H = block10;
                    return nameScreen;
                }
                if (step7 instanceof IdentityDeclarationsStep.DateOfBirth) {
                    IdentityDeclarationsStep.DateOfBirth dateOfBirth = (IdentityDeclarationsStep.DateOfBirth) step7;
                    ViewController viewControllerE15 = aVar7.e1(new qbl.e(new DateOfBirthControllerDescriptor$InputData(null, dateOfBirth.f97675a, aVar7.I2(dateOfBirth))));
                    Function1 block11 = new Function1() { // from class: obi.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    NameControllerDescriptor$OutputData data = (NameControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Name(data.f105059a, data.f105060b, data.f105061c, data.d, data.e, data.f, data.f105062g));
                                    return Unit.f186387a;
                                case 1:
                                    DateOfBirthControllerDescriptor$OutputData data2 = (DateOfBirthControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data2, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.DateOfBirth(data2.f105052a));
                                    return Unit.f186387a;
                                case 2:
                                    rbi.c data3 = (rbi.c) obj5;
                                    Intrinsics.checkNotNullParameter(data3, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Occupation(data3.f253120a));
                                    return Unit.f186387a;
                                case 3:
                                    mbi.i data4 = (mbi.i) obj5;
                                    Intrinsics.checkNotNullParameter(data4, "data");
                                    boolean z104 = data4 instanceof mbi.g;
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar8 = aVar7;
                                    if (z104) {
                                        aVar8.B2();
                                    } else {
                                        if (!(data4 instanceof mbi.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Gender(((mbi.h) data4).f204224a));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    PlaceOfBirthFlowOutputData data5 = (PlaceOfBirthFlowOutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data5, "data");
                                    boolean zF = Intrinsics.f(data5, PlaceOfBirthFlowOutputData.Cancel.f105027a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar9 = aVar7;
                                    if (zF) {
                                        aVar9.B2();
                                    } else if (data5 instanceof PlaceOfBirthFlowOutputData.Success) {
                                        aVar9.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) data5));
                                    } else if (!Intrinsics.f(data5, PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    ybi.b output = (ybi.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount(output.f312372a));
                                    return Unit.f186387a;
                                case 6:
                                    bai.j result = (bai.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, j.a.f14102a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar10 = aVar7;
                                    if (zF2) {
                                        aVar10.B2();
                                    } else {
                                        if (!(result instanceof bai.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        List list = ((bai.k) result).f14103a;
                                        IdentityDeclarationsStep identityDeclarationsStep = step7;
                                        aVar10.J2(identityDeclarationsStep, new IdentityDeclarationsFlowContract$StepResult.AcceptedTerms(list, ((IdentityDeclarationsStep.AcceptedTerms) identityDeclarationsStep).f97674c));
                                    }
                                    return Unit.f186387a;
                                default:
                                    wbi.d result2 = (wbi.d) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF3 = Intrinsics.f(result2, wbi.b.f296221a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar11 = aVar7;
                                    if (zF3) {
                                        aVar11.B2();
                                    } else {
                                        if (!(result2 instanceof wbi.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IdentityDeclarationsStep identityDeclarationsStep2 = step7;
                                        aVar11.J2(identityDeclarationsStep2, new IdentityDeclarationsFlowContract$StepResult.PersonalCode(((IdentityDeclarationsStep.PersonalCode) identityDeclarationsStep2).f97684a, ((wbi.c) result2).f296222a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    viewControllerE15.H = block11;
                    return viewControllerE15;
                }
                if (step7 instanceof IdentityDeclarationsStep.Occupation) {
                    IdentityDeclarationsStep.Occupation occupation = (IdentityDeclarationsStep.Occupation) step7;
                    wi0.b bVar2 = occupation.f97682a;
                    Integer numA = aVar7.I2(occupation).a();
                    ResourceImage resourceImage = numA != null ? new ResourceImage(numA.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
                    wi0.b bVar3 = occupation.f97682a;
                    wi0.b.Companion.getClass();
                    List list = Intrinsics.f(bVar3, wi0.b.T0) ? (List) rbi.a.e.getValue() : f0.f322471a;
                    WorkflowScreenConfiguration workflowScreenConfiguration = occupation.f97683b;
                    ViewController viewControllerE16 = aVar7.e1(new rbi.b(new OccupationChooserFlowInputData(bVar2, resourceImage, list, workflowScreenConfiguration != null ? workflowScreenConfiguration.f105668a : null, workflowScreenConfiguration != null ? workflowScreenConfiguration.f105669b : null)));
                    Function1 block12 = new Function1() { // from class: obi.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i2) {
                                case 0:
                                    NameControllerDescriptor$OutputData data = (NameControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Name(data.f105059a, data.f105060b, data.f105061c, data.d, data.e, data.f, data.f105062g));
                                    return Unit.f186387a;
                                case 1:
                                    DateOfBirthControllerDescriptor$OutputData data2 = (DateOfBirthControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data2, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.DateOfBirth(data2.f105052a));
                                    return Unit.f186387a;
                                case 2:
                                    rbi.c data3 = (rbi.c) obj5;
                                    Intrinsics.checkNotNullParameter(data3, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Occupation(data3.f253120a));
                                    return Unit.f186387a;
                                case 3:
                                    mbi.i data4 = (mbi.i) obj5;
                                    Intrinsics.checkNotNullParameter(data4, "data");
                                    boolean z104 = data4 instanceof mbi.g;
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar8 = aVar7;
                                    if (z104) {
                                        aVar8.B2();
                                    } else {
                                        if (!(data4 instanceof mbi.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Gender(((mbi.h) data4).f204224a));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    PlaceOfBirthFlowOutputData data5 = (PlaceOfBirthFlowOutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data5, "data");
                                    boolean zF = Intrinsics.f(data5, PlaceOfBirthFlowOutputData.Cancel.f105027a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar9 = aVar7;
                                    if (zF) {
                                        aVar9.B2();
                                    } else if (data5 instanceof PlaceOfBirthFlowOutputData.Success) {
                                        aVar9.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) data5));
                                    } else if (!Intrinsics.f(data5, PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    ybi.b output = (ybi.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount(output.f312372a));
                                    return Unit.f186387a;
                                case 6:
                                    bai.j result = (bai.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, j.a.f14102a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar10 = aVar7;
                                    if (zF2) {
                                        aVar10.B2();
                                    } else {
                                        if (!(result instanceof bai.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        List list2 = ((bai.k) result).f14103a;
                                        IdentityDeclarationsStep identityDeclarationsStep = step7;
                                        aVar10.J2(identityDeclarationsStep, new IdentityDeclarationsFlowContract$StepResult.AcceptedTerms(list2, ((IdentityDeclarationsStep.AcceptedTerms) identityDeclarationsStep).f97674c));
                                    }
                                    return Unit.f186387a;
                                default:
                                    wbi.d result2 = (wbi.d) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF3 = Intrinsics.f(result2, wbi.b.f296221a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar11 = aVar7;
                                    if (zF3) {
                                        aVar11.B2();
                                    } else {
                                        if (!(result2 instanceof wbi.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IdentityDeclarationsStep identityDeclarationsStep2 = step7;
                                        aVar11.J2(identityDeclarationsStep2, new IdentityDeclarationsFlowContract$StepResult.PersonalCode(((IdentityDeclarationsStep.PersonalCode) identityDeclarationsStep2).f97684a, ((wbi.c) result2).f296222a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE16.H = block12;
                    return viewControllerE16;
                }
                if (step7 instanceof IdentityDeclarationsStep.Gender) {
                    IdentityDeclarationsStep.Gender gender = (IdentityDeclarationsStep.Gender) step7;
                    GenderScreen genderScreen = new GenderScreen(new GenderScreenContract$InputData(gender.f97676a, gender.f97677b, aVar7.I2(gender)));
                    Function1 block13 = new Function1() { // from class: obi.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    NameControllerDescriptor$OutputData data = (NameControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Name(data.f105059a, data.f105060b, data.f105061c, data.d, data.e, data.f, data.f105062g));
                                    return Unit.f186387a;
                                case 1:
                                    DateOfBirthControllerDescriptor$OutputData data2 = (DateOfBirthControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data2, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.DateOfBirth(data2.f105052a));
                                    return Unit.f186387a;
                                case 2:
                                    rbi.c data3 = (rbi.c) obj5;
                                    Intrinsics.checkNotNullParameter(data3, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Occupation(data3.f253120a));
                                    return Unit.f186387a;
                                case 3:
                                    mbi.i data4 = (mbi.i) obj5;
                                    Intrinsics.checkNotNullParameter(data4, "data");
                                    boolean z104 = data4 instanceof mbi.g;
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar8 = aVar7;
                                    if (z104) {
                                        aVar8.B2();
                                    } else {
                                        if (!(data4 instanceof mbi.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Gender(((mbi.h) data4).f204224a));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    PlaceOfBirthFlowOutputData data5 = (PlaceOfBirthFlowOutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data5, "data");
                                    boolean zF = Intrinsics.f(data5, PlaceOfBirthFlowOutputData.Cancel.f105027a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar9 = aVar7;
                                    if (zF) {
                                        aVar9.B2();
                                    } else if (data5 instanceof PlaceOfBirthFlowOutputData.Success) {
                                        aVar9.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) data5));
                                    } else if (!Intrinsics.f(data5, PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    ybi.b output = (ybi.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount(output.f312372a));
                                    return Unit.f186387a;
                                case 6:
                                    bai.j result = (bai.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, j.a.f14102a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar10 = aVar7;
                                    if (zF2) {
                                        aVar10.B2();
                                    } else {
                                        if (!(result instanceof bai.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        List list2 = ((bai.k) result).f14103a;
                                        IdentityDeclarationsStep identityDeclarationsStep = step7;
                                        aVar10.J2(identityDeclarationsStep, new IdentityDeclarationsFlowContract$StepResult.AcceptedTerms(list2, ((IdentityDeclarationsStep.AcceptedTerms) identityDeclarationsStep).f97674c));
                                    }
                                    return Unit.f186387a;
                                default:
                                    wbi.d result2 = (wbi.d) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF3 = Intrinsics.f(result2, wbi.b.f296221a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar11 = aVar7;
                                    if (zF3) {
                                        aVar11.B2();
                                    } else {
                                        if (!(result2 instanceof wbi.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IdentityDeclarationsStep identityDeclarationsStep2 = step7;
                                        aVar11.J2(identityDeclarationsStep2, new IdentityDeclarationsFlowContract$StepResult.PersonalCode(((IdentityDeclarationsStep.PersonalCode) identityDeclarationsStep2).f97684a, ((wbi.c) result2).f296222a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    genderScreen.H = block13;
                    return genderScreen;
                }
                if (step7 instanceof IdentityDeclarationsStep.PlaceOfBirth) {
                    IdentityDeclarationsStep.PlaceOfBirth placeOfBirth = (IdentityDeclarationsStep.PlaceOfBirth) step7;
                    wi0.b bVar4 = placeOfBirth.f97685a;
                    Integer numA2 = aVar7.I2(placeOfBirth).a();
                    ViewController viewControllerE17 = aVar7.e1(new PlaceOfBirthControllerDescriptor(new PlaceOfBirthFlowInputData(null, null, bVar4, numA2 != null ? new ResourceImage(numA2.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, 107)));
                    final int i6 = 4;
                    Function1 block14 = new Function1() { // from class: obi.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    NameControllerDescriptor$OutputData data = (NameControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Name(data.f105059a, data.f105060b, data.f105061c, data.d, data.e, data.f, data.f105062g));
                                    return Unit.f186387a;
                                case 1:
                                    DateOfBirthControllerDescriptor$OutputData data2 = (DateOfBirthControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data2, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.DateOfBirth(data2.f105052a));
                                    return Unit.f186387a;
                                case 2:
                                    rbi.c data3 = (rbi.c) obj5;
                                    Intrinsics.checkNotNullParameter(data3, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Occupation(data3.f253120a));
                                    return Unit.f186387a;
                                case 3:
                                    mbi.i data4 = (mbi.i) obj5;
                                    Intrinsics.checkNotNullParameter(data4, "data");
                                    boolean z104 = data4 instanceof mbi.g;
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar8 = aVar7;
                                    if (z104) {
                                        aVar8.B2();
                                    } else {
                                        if (!(data4 instanceof mbi.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Gender(((mbi.h) data4).f204224a));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    PlaceOfBirthFlowOutputData data5 = (PlaceOfBirthFlowOutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data5, "data");
                                    boolean zF = Intrinsics.f(data5, PlaceOfBirthFlowOutputData.Cancel.f105027a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar9 = aVar7;
                                    if (zF) {
                                        aVar9.B2();
                                    } else if (data5 instanceof PlaceOfBirthFlowOutputData.Success) {
                                        aVar9.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) data5));
                                    } else if (!Intrinsics.f(data5, PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    ybi.b output = (ybi.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount(output.f312372a));
                                    return Unit.f186387a;
                                case 6:
                                    bai.j result = (bai.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, j.a.f14102a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar10 = aVar7;
                                    if (zF2) {
                                        aVar10.B2();
                                    } else {
                                        if (!(result instanceof bai.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        List list2 = ((bai.k) result).f14103a;
                                        IdentityDeclarationsStep identityDeclarationsStep = step7;
                                        aVar10.J2(identityDeclarationsStep, new IdentityDeclarationsFlowContract$StepResult.AcceptedTerms(list2, ((IdentityDeclarationsStep.AcceptedTerms) identityDeclarationsStep).f97674c));
                                    }
                                    return Unit.f186387a;
                                default:
                                    wbi.d result2 = (wbi.d) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF3 = Intrinsics.f(result2, wbi.b.f296221a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar11 = aVar7;
                                    if (zF3) {
                                        aVar11.B2();
                                    } else {
                                        if (!(result2 instanceof wbi.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IdentityDeclarationsStep identityDeclarationsStep2 = step7;
                                        aVar11.J2(identityDeclarationsStep2, new IdentityDeclarationsFlowContract$StepResult.PersonalCode(((IdentityDeclarationsStep.PersonalCode) identityDeclarationsStep2).f97684a, ((wbi.c) result2).f296222a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    viewControllerE17.H = block14;
                    return viewControllerE17;
                }
                if (step7 instanceof IdentityDeclarationsStep.PurposeOfAccount) {
                    IdentityDeclarationsStep.PurposeOfAccount purposeOfAccount = (IdentityDeclarationsStep.PurposeOfAccount) step7;
                    PurposeOfAccountFlow purposeOfAccountFlow = new PurposeOfAccountFlow(new PurposeOfAccountFlowInputData(purposeOfAccount.f97686a, Intrinsics.f(purposeOfAccount.d, Boolean.TRUE) ? PurposeOfAccountProductType.Joint.f97716a : PurposeOfAccountProductType.Personal.f97718a, null, aVar7.I2(purposeOfAccount), purposeOfAccount.f97687b, purposeOfAccount.f97688c, 4));
                    final int i21 = 5;
                    Function1 block15 = new Function1() { // from class: obi.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    NameControllerDescriptor$OutputData data = (NameControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Name(data.f105059a, data.f105060b, data.f105061c, data.d, data.e, data.f, data.f105062g));
                                    return Unit.f186387a;
                                case 1:
                                    DateOfBirthControllerDescriptor$OutputData data2 = (DateOfBirthControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data2, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.DateOfBirth(data2.f105052a));
                                    return Unit.f186387a;
                                case 2:
                                    rbi.c data3 = (rbi.c) obj5;
                                    Intrinsics.checkNotNullParameter(data3, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Occupation(data3.f253120a));
                                    return Unit.f186387a;
                                case 3:
                                    mbi.i data4 = (mbi.i) obj5;
                                    Intrinsics.checkNotNullParameter(data4, "data");
                                    boolean z104 = data4 instanceof mbi.g;
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar8 = aVar7;
                                    if (z104) {
                                        aVar8.B2();
                                    } else {
                                        if (!(data4 instanceof mbi.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Gender(((mbi.h) data4).f204224a));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    PlaceOfBirthFlowOutputData data5 = (PlaceOfBirthFlowOutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data5, "data");
                                    boolean zF = Intrinsics.f(data5, PlaceOfBirthFlowOutputData.Cancel.f105027a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar9 = aVar7;
                                    if (zF) {
                                        aVar9.B2();
                                    } else if (data5 instanceof PlaceOfBirthFlowOutputData.Success) {
                                        aVar9.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) data5));
                                    } else if (!Intrinsics.f(data5, PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    ybi.b output = (ybi.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount(output.f312372a));
                                    return Unit.f186387a;
                                case 6:
                                    bai.j result = (bai.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, j.a.f14102a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar10 = aVar7;
                                    if (zF2) {
                                        aVar10.B2();
                                    } else {
                                        if (!(result instanceof bai.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        List list2 = ((bai.k) result).f14103a;
                                        IdentityDeclarationsStep identityDeclarationsStep = step7;
                                        aVar10.J2(identityDeclarationsStep, new IdentityDeclarationsFlowContract$StepResult.AcceptedTerms(list2, ((IdentityDeclarationsStep.AcceptedTerms) identityDeclarationsStep).f97674c));
                                    }
                                    return Unit.f186387a;
                                default:
                                    wbi.d result2 = (wbi.d) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF3 = Intrinsics.f(result2, wbi.b.f296221a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar11 = aVar7;
                                    if (zF3) {
                                        aVar11.B2();
                                    } else {
                                        if (!(result2 instanceof wbi.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IdentityDeclarationsStep identityDeclarationsStep2 = step7;
                                        aVar11.J2(identityDeclarationsStep2, new IdentityDeclarationsFlowContract$StepResult.PersonalCode(((IdentityDeclarationsStep.PersonalCode) identityDeclarationsStep2).f97684a, ((wbi.c) result2).f296222a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    purposeOfAccountFlow.H = block15;
                    return purposeOfAccountFlow;
                }
                if (step7 instanceof IdentityDeclarationsStep.AcceptedTerms) {
                    IdentityDeclarationsStep.AcceptedTerms acceptedTerms = (IdentityDeclarationsStep.AcceptedTerms) step7;
                    ViewController viewControllerE18 = aVar7.e1(new AcceptBankTermsControllerDescriptor(new AcceptBankTermsScreenContract$InputData(new AcceptBankTermsScreenContract$Configuration.TermsScopes(acceptedTerms.d, acceptedTerms.f97674c, acceptedTerms.f97673b, acceptedTerms.f97672a))));
                    final int i22 = 6;
                    Function1 block16 = new Function1() { // from class: obi.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    NameControllerDescriptor$OutputData data = (NameControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Name(data.f105059a, data.f105060b, data.f105061c, data.d, data.e, data.f, data.f105062g));
                                    return Unit.f186387a;
                                case 1:
                                    DateOfBirthControllerDescriptor$OutputData data2 = (DateOfBirthControllerDescriptor$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data2, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.DateOfBirth(data2.f105052a));
                                    return Unit.f186387a;
                                case 2:
                                    rbi.c data3 = (rbi.c) obj5;
                                    Intrinsics.checkNotNullParameter(data3, "data");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Occupation(data3.f253120a));
                                    return Unit.f186387a;
                                case 3:
                                    mbi.i data4 = (mbi.i) obj5;
                                    Intrinsics.checkNotNullParameter(data4, "data");
                                    boolean z104 = data4 instanceof mbi.g;
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar8 = aVar7;
                                    if (z104) {
                                        aVar8.B2();
                                    } else {
                                        if (!(data4 instanceof mbi.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Gender(((mbi.h) data4).f204224a));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    PlaceOfBirthFlowOutputData data5 = (PlaceOfBirthFlowOutputData) obj5;
                                    Intrinsics.checkNotNullParameter(data5, "data");
                                    boolean zF = Intrinsics.f(data5, PlaceOfBirthFlowOutputData.Cancel.f105027a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar9 = aVar7;
                                    if (zF) {
                                        aVar9.B2();
                                    } else if (data5 instanceof PlaceOfBirthFlowOutputData.Success) {
                                        aVar9.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) data5));
                                    } else if (!Intrinsics.f(data5, PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    ybi.b output = (ybi.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount(output.f312372a));
                                    return Unit.f186387a;
                                case 6:
                                    bai.j result = (bai.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, j.a.f14102a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar10 = aVar7;
                                    if (zF2) {
                                        aVar10.B2();
                                    } else {
                                        if (!(result instanceof bai.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        List list2 = ((bai.k) result).f14103a;
                                        IdentityDeclarationsStep identityDeclarationsStep = step7;
                                        aVar10.J2(identityDeclarationsStep, new IdentityDeclarationsFlowContract$StepResult.AcceptedTerms(list2, ((IdentityDeclarationsStep.AcceptedTerms) identityDeclarationsStep).f97674c));
                                    }
                                    return Unit.f186387a;
                                default:
                                    wbi.d result2 = (wbi.d) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF3 = Intrinsics.f(result2, wbi.b.f296221a);
                                    com.revolut.feature_retail_user_declarations.identity_declarations.a aVar11 = aVar7;
                                    if (zF3) {
                                        aVar11.B2();
                                    } else {
                                        if (!(result2 instanceof wbi.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IdentityDeclarationsStep identityDeclarationsStep2 = step7;
                                        aVar11.J2(identityDeclarationsStep2, new IdentityDeclarationsFlowContract$StepResult.PersonalCode(((IdentityDeclarationsStep.PersonalCode) identityDeclarationsStep2).f97684a, ((wbi.c) result2).f296222a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    viewControllerE18.H = block16;
                    return viewControllerE18;
                }
                if (!(step7 instanceof IdentityDeclarationsStep.PersonalCode)) {
                    throw new NoWhenBranchMatchedException();
                }
                PersonalCodeController personalCodeController = new PersonalCodeController(new PersonalCodeContract$InputData("^[A-Z]{4}[0-9]{6}[MH][A-Z]{5}[0-9A-Z][0-9]$", "CURP", "AAAA######AAAAAA##"));
                final int i32 = 7;
                Function1 block17 = new Function1() { // from class: obi.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i32) {
                            case 0:
                                NameControllerDescriptor$OutputData data = (NameControllerDescriptor$OutputData) obj5;
                                Intrinsics.checkNotNullParameter(data, "data");
                                aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Name(data.f105059a, data.f105060b, data.f105061c, data.d, data.e, data.f, data.f105062g));
                                return Unit.f186387a;
                            case 1:
                                DateOfBirthControllerDescriptor$OutputData data2 = (DateOfBirthControllerDescriptor$OutputData) obj5;
                                Intrinsics.checkNotNullParameter(data2, "data");
                                aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.DateOfBirth(data2.f105052a));
                                return Unit.f186387a;
                            case 2:
                                rbi.c data3 = (rbi.c) obj5;
                                Intrinsics.checkNotNullParameter(data3, "data");
                                aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Occupation(data3.f253120a));
                                return Unit.f186387a;
                            case 3:
                                mbi.i data4 = (mbi.i) obj5;
                                Intrinsics.checkNotNullParameter(data4, "data");
                                boolean z104 = data4 instanceof mbi.g;
                                com.revolut.feature_retail_user_declarations.identity_declarations.a aVar8 = aVar7;
                                if (z104) {
                                    aVar8.B2();
                                } else {
                                    if (!(data4 instanceof mbi.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar8.J2(step7, new IdentityDeclarationsFlowContract$StepResult.Gender(((mbi.h) data4).f204224a));
                                }
                                return Unit.f186387a;
                            case 4:
                                PlaceOfBirthFlowOutputData data5 = (PlaceOfBirthFlowOutputData) obj5;
                                Intrinsics.checkNotNullParameter(data5, "data");
                                boolean zF = Intrinsics.f(data5, PlaceOfBirthFlowOutputData.Cancel.f105027a);
                                com.revolut.feature_retail_user_declarations.identity_declarations.a aVar9 = aVar7;
                                if (zF) {
                                    aVar9.B2();
                                } else if (data5 instanceof PlaceOfBirthFlowOutputData.Success) {
                                    aVar9.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) data5));
                                } else if (!Intrinsics.f(data5, PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 5:
                                ybi.b output = (ybi.b) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                aVar7.J2(step7, new IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount(output.f312372a));
                                return Unit.f186387a;
                            case 6:
                                bai.j result = (bai.j) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF2 = Intrinsics.f(result, j.a.f14102a);
                                com.revolut.feature_retail_user_declarations.identity_declarations.a aVar10 = aVar7;
                                if (zF2) {
                                    aVar10.B2();
                                } else {
                                    if (!(result instanceof bai.k)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    List list2 = ((bai.k) result).f14103a;
                                    IdentityDeclarationsStep identityDeclarationsStep = step7;
                                    aVar10.J2(identityDeclarationsStep, new IdentityDeclarationsFlowContract$StepResult.AcceptedTerms(list2, ((IdentityDeclarationsStep.AcceptedTerms) identityDeclarationsStep).f97674c));
                                }
                                return Unit.f186387a;
                            default:
                                wbi.d result2 = (wbi.d) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean zF3 = Intrinsics.f(result2, wbi.b.f296221a);
                                com.revolut.feature_retail_user_declarations.identity_declarations.a aVar11 = aVar7;
                                if (zF3) {
                                    aVar11.B2();
                                } else {
                                    if (!(result2 instanceof wbi.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    IdentityDeclarationsStep identityDeclarationsStep2 = step7;
                                    aVar11.J2(identityDeclarationsStep2, new IdentityDeclarationsFlowContract$StepResult.PersonalCode(((IdentityDeclarationsStep.PersonalCode) identityDeclarationsStep2).f97684a, ((wbi.c) result2).f296222a));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block17, "block");
                personalCodeController.H = block17;
                return personalCodeController;
            case 7:
                oc0.h params = (oc0.h) obj2;
                BackendFlowEntitiesPage entities = (BackendFlowEntitiesPage) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(entities, "entities");
                ((oc0.i) obj4).f224035b.f(params.a(), entities);
                return Unit.f186387a;
            case 8:
                oc0.j params2 = (oc0.j) obj2;
                BackendEntitiesSummaryItem entities2 = (BackendEntitiesSummaryItem) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(entities2, "entities");
                ((oc0.k) obj4).f224040a.f(params2.a(), entities2);
                return Unit.f186387a;
            case 9:
                String ticketId = (String) obj2;
                u dto = (u) obj3;
                Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                Intrinsics.checkNotNullParameter(dto, "dto");
                ((oc0.m) obj4).f224043a.f(oc0.m.b(ticketId), dto);
                return Unit.f186387a;
            case 10:
                com.revolut.feature.onboarding.impl.qes_terms.h hVar2 = (com.revolut.feature.onboarding.impl.qes_terms.h) obj4;
                QesTermsFlowContract$Step step8 = (QesTermsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                QesTermsFlowInputData qesTermsFlowInputData = hVar2.f78563q;
                if (step8 instanceof QesTermsFlowContract$Step.QesTerms) {
                    QesTermsConfiguration qesTermsConfiguration = qesTermsFlowInputData.f78201a;
                    QesTermsScreen qesTermsScreen = new QesTermsScreen(new QesTermsScreenContract$InputData(qesTermsConfiguration, qesTermsFlowInputData.f78202b, qesTermsConfiguration.f, hVar2.M2()));
                    oc9.e block18 = new oc9.e(hVar2, i3);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    qesTermsScreen.H = block18;
                    return qesTermsScreen;
                }
                if (step8 instanceof QesTermsFlowContract$Step.QesOtp) {
                    QesTermsFlowContract$Step.QesOtp qesOtp = (QesTermsFlowContract$Step.QesOtp) step8;
                    ESignOtpScreen eSignOtpScreen = new ESignOtpScreen(new ESignOtpScreenContract$InputData(new ESignOtpScreenContract$InputData.Mode.Asynchronous(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.qes_validating_otp_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.qes_error_dialog_title, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.qes_validating_otp_failed_title, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14)), new QesTermsOtpTask(qesOtp.f78546b.f78144a.f78147a), qesOtp.f78545a, qesTermsFlowInputData.f != y89.d.NONE, qesOtp.f78547c, new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.qes_otp_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.qes_otp_subtitle, zhm.u.c(qesOtp.f78545a), null, 12), hVar2.M2(), (AnalyticsProduct.Retail) null, ViewUtils.EDGE_TO_EDGE_FLAGS));
                    o54.a block19 = new o54.a(hVar2, qesOtp, 23);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    eSignOtpScreen.H = block19;
                    return eSignOtpScreen;
                }
                if (!(step8 instanceof QesTermsFlowContract$Step.Passcode)) {
                    if (!(step8 instanceof QesTermsFlowContract$Step.AccountRecovery)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    AuthenticationFlow authenticationFlowA = djl.a.a(hVar2.u, new RevolutSsoApi$InputData$AccessRecovery(RevolutSsoApi$InputData$AccessRecovery.Origin.ForgotPasscode.f105845a), new kp0.b(ref$ObjectRef, hVar2, 23));
                    o54.a block20 = new o54.a(hVar2, ref$ObjectRef, 22);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    authenticationFlowA.H = block20;
                    return authenticationFlowA;
                }
                QesTermsFlowContract$Step.Passcode passcode = (QesTermsFlowContract$Step.Passcode) step8;
                Integer num = passcode.f78543b;
                PinCodeView.Mode placeholder = num != null ? new PinCodeView.Mode.Placeholder(num.intValue()) : PinCodeView.Mode.Dynamic.f59608a;
                boolean z104 = passcode.f78544c == rl0.d.PASSCODE;
                PasscodeScreen passcodeScreen = new PasscodeScreen(PasscodeScreenContract$InputData.Companion.d(PasscodeScreenContract$InputData.INSTANCE, new PinCodeView.Header.Title(6, (Clause) new TextLocalisedClause(com.revolut.feature.passcode.R$string.passcode_title_enter_passcode, null, null, 14), (TextLocalisedClause) (z ? 1 : 0)), placeholder, new PasscodeScreenContract$VerificationMode.Default(z104), qesTermsFlowInputData.f78204g, null, null, 488));
                l1.e eVar2 = new l1.e(hVar2, z104, passcode, 23);
                Intrinsics.checkNotNullParameter(eVar2, "<set-?>");
                passcodeScreen.H = eVar2;
                return passcodeScreen;
            case 11:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                QesTermsConfiguration qesTermsConfiguration2 = ((oc9.e0) obj4).f224142a.f78549a;
                return new oc9.y(qesTermsConfiguration2.f78154a, qesTermsConfiguration2.f78155b, qesTermsConfiguration2.f78160l, qesTermsConfiguration2.f78161m, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false, false);
            case 12:
                com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a aVar8 = (com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PromotedMerchantCheckoutContract$ModalStep step9 = (PromotedMerchantCheckoutContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof PromotedMerchantCheckoutContract$ModalStep.OptIn) {
                    return aVar8.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.RevPay.f84002a, false, 6)));
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                Function1 getErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return new cii.b(null, iii.c.b(null, "ERROR_ITEM_ID", 4, true), new lw0.a(new TextClause(((occ.a) obj4).f224206a.f84690a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30));
            case 14:
                AmountEditDelegate.Model model = (AmountEditDelegate.Model) obj2;
                AmountEditView field = (AmountEditView) obj3;
                KProperty[] kPropertyArr = EditCustomProductScreen.S;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.f51629j;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.domain.model.AmountParcel");
                od1.a aVar9 = (od1.a) obj5;
                return new zp0.d(field.getEditText(), aVar9.f224260b, new u80.d(aVar9.f224259a), null, new kl.b0((EditCustomProductScreen) obj4, 29), false, false, 0, false, null, 1960);
            case 15:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar10 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EditCustomProductScreenContract$ModalStep it8 = (EditCustomProductScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8, EditCustomProductScreenContract$ModalStep.DeleteConfirmation.f60801a)) {
                    ActionsBottomSheetController actionsBottomSheetControllerB = aVar10.f60806r.b();
                    o9h.b block21 = new o9h.b(aVar10, 16);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    actionsBottomSheetControllerB.H = block21;
                    return actionsBottomSheetControllerB;
                }
                if (!Intrinsics.f(it8, EditCustomProductScreenContract$ModalStep.SelectTaxRate.f60803a)) {
                    if (Intrinsics.f(it8, EditCustomProductScreenContract$ModalStep.ManageTaxRates.f60802a)) {
                        return new ManageTaxRatesFlow();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                SelectTaxRateScreen selectTaxRateScreen = new SelectTaxRateScreen(new SelectTaxRateScreenProvider$InputData(((oe1.g) ((j2) aVar10.f60807s.f22677a).getValue()).e, true, true));
                o54.a block22 = new o54.a(aVar10, ModalCoordinator4, 27);
                Intrinsics.checkNotNullParameter(block22, "block");
                selectTaxRateScreen.H = block22;
                return selectTaxRateScreen;
            case 16:
                String consentId = (String) obj2;
                so6.a details = (so6.a) obj3;
                Intrinsics.checkNotNullParameter(consentId, "consentId");
                Intrinsics.checkNotNullParameter(details, "details");
                ((of6.b) obj4).f224740b.f("BRAZIL_INBOUND_CONSENT_DETAILS_MEMORY_CACHE_KEY" + consentId, details);
                return Unit.f186387a;
            case 17:
                final com.revolut.feature.apm.wero.impl.ui.registration.a aVar11 = (com.revolut.feature.apm.wero.impl.ui.registration.a) obj4;
                WeroRegistrationFlowContract$InputData weroRegistrationFlowContract$InputData = aVar11.o;
                l FlowCoordinator3 = (l) obj2;
                WeroRegistrationFlowContract$Step step10 = (WeroRegistrationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof WeroRegistrationFlowContract$Step.Intro) {
                    ViewController viewControllerE19 = aVar11.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(WeroArticles.ONBOARDING)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    Function1 block23 = new Function1() { // from class: oi2.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    c12.n0 outputData = (c12.n0) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, c12.k0.f20338a);
                                    com.revolut.feature.apm.wero.impl.ui.registration.a aVar12 = aVar11;
                                    WeroRegistrationFlowContract$Step.Confirmation confirmation = WeroRegistrationFlowContract$Step.Confirmation.f63103a;
                                    if (zF) {
                                        oki.h.t2(aVar12, aVar12.f63108r, confirmation, true, null, false, 12);
                                    } else if (Intrinsics.f(outputData, c12.m0.f20343a)) {
                                        oki.h.t2(aVar12, aVar12.f63108r, confirmation, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, c12.l0.f20341a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar12.f63108r);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    yja.b outputData2 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    int i33 = h.f225419a[outputData2.ordinal()];
                                    com.revolut.feature.apm.wero.impl.ui.registration.a aVar13 = aVar11;
                                    if (i33 == 1 || i33 == 2 || i33 == 3) {
                                        oki.h.t2(aVar13, aVar13.f63108r, WeroRegistrationFlowContract$Step.Terms.f63105a, false, null, false, 12);
                                    } else {
                                        if (i33 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar13.C2(c.f225414a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.apm.wero.impl.ui.registration.a aVar14 = aVar11;
                                    yki.a aVar15 = aVar14.f63108r;
                                    pi2.d outputData3 = (pi2.d) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 instanceof pi2.b) {
                                        aVar14.l2(new nt4.f(aVar14, null, 22), new yi5.b(26));
                                    } else {
                                        if (!(outputData3 instanceof pi2.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (aVar15.c()) {
                                            aVar15.e(false);
                                        } else {
                                            aVar14.C2(c.f225414a);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    viewControllerE19.H = block23;
                    return viewControllerE19;
                }
                if (step10 instanceof WeroRegistrationFlowContract$Step.Terms) {
                    ViewController viewControllerE110 = aVar11.e1(new j0(new ApmRegistrationTermsScope$InputData(weroRegistrationFlowContract$InputData.f63102a.getTerms())));
                    final boolean z105 = z29 ? 1 : 0;
                    Function1 block24 = new Function1() { // from class: oi2.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (z105) {
                                case 0:
                                    c12.n0 outputData = (c12.n0) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, c12.k0.f20338a);
                                    com.revolut.feature.apm.wero.impl.ui.registration.a aVar12 = aVar11;
                                    WeroRegistrationFlowContract$Step.Confirmation confirmation = WeroRegistrationFlowContract$Step.Confirmation.f63103a;
                                    if (zF) {
                                        oki.h.t2(aVar12, aVar12.f63108r, confirmation, true, null, false, 12);
                                    } else if (Intrinsics.f(outputData, c12.m0.f20343a)) {
                                        oki.h.t2(aVar12, aVar12.f63108r, confirmation, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, c12.l0.f20341a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar12.f63108r);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    yja.b outputData2 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    int i33 = h.f225419a[outputData2.ordinal()];
                                    com.revolut.feature.apm.wero.impl.ui.registration.a aVar13 = aVar11;
                                    if (i33 == 1 || i33 == 2 || i33 == 3) {
                                        oki.h.t2(aVar13, aVar13.f63108r, WeroRegistrationFlowContract$Step.Terms.f63105a, false, null, false, 12);
                                    } else {
                                        if (i33 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar13.C2(c.f225414a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.apm.wero.impl.ui.registration.a aVar14 = aVar11;
                                    yki.a aVar15 = aVar14.f63108r;
                                    pi2.d outputData3 = (pi2.d) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 instanceof pi2.b) {
                                        aVar14.l2(new nt4.f(aVar14, null, 22), new yi5.b(26));
                                    } else {
                                        if (!(outputData3 instanceof pi2.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (aVar15.c()) {
                                            aVar15.e(false);
                                        } else {
                                            aVar14.C2(c.f225414a);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    viewControllerE110.H = block24;
                    return viewControllerE110;
                }
                if (!(step10 instanceof WeroRegistrationFlowContract$Step.Confirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                WeroRegistrationConfirmationScreen weroRegistrationConfirmationScreen = new WeroRegistrationConfirmationScreen(weroRegistrationFlowContract$InputData);
                Function1 block25 = new Function1() { // from class: oi2.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i2) {
                            case 0:
                                c12.n0 outputData = (c12.n0) obj6;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean zF = Intrinsics.f(outputData, c12.k0.f20338a);
                                com.revolut.feature.apm.wero.impl.ui.registration.a aVar12 = aVar11;
                                WeroRegistrationFlowContract$Step.Confirmation confirmation = WeroRegistrationFlowContract$Step.Confirmation.f63103a;
                                if (zF) {
                                    oki.h.t2(aVar12, aVar12.f63108r, confirmation, true, null, false, 12);
                                } else if (Intrinsics.f(outputData, c12.m0.f20343a)) {
                                    oki.h.t2(aVar12, aVar12.f63108r, confirmation, false, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(outputData, c12.l0.f20341a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(aVar12.f63108r);
                                }
                                return Unit.f186387a;
                            case 1:
                                yja.b outputData2 = (yja.b) obj6;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                int i33 = h.f225419a[outputData2.ordinal()];
                                com.revolut.feature.apm.wero.impl.ui.registration.a aVar13 = aVar11;
                                if (i33 == 1 || i33 == 2 || i33 == 3) {
                                    oki.h.t2(aVar13, aVar13.f63108r, WeroRegistrationFlowContract$Step.Terms.f63105a, false, null, false, 12);
                                } else {
                                    if (i33 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar13.C2(c.f225414a);
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.apm.wero.impl.ui.registration.a aVar14 = aVar11;
                                yki.a aVar15 = aVar14.f63108r;
                                pi2.d outputData3 = (pi2.d) obj6;
                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                if (outputData3 instanceof pi2.b) {
                                    aVar14.l2(new nt4.f(aVar14, null, 22), new yi5.b(26));
                                } else {
                                    if (!(outputData3 instanceof pi2.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (aVar15.c()) {
                                        aVar15.e(false);
                                    } else {
                                        aVar14.C2(c.f225414a);
                                    }
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block25, "block");
                weroRegistrationConfirmationScreen.H = block25;
                return weroRegistrationConfirmationScreen;
            case 18:
                final com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar12 = (com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a) obj4;
                JuniorPostOnboardingFlowContract$Step step11 = (JuniorPostOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof JuniorPostOnboardingFlowContract$Step.ArtificialFirstStep) {
                    final JuniorPostOnboardingFlowContract$Step.ArtificialFirstStep artificialFirstStep = (JuniorPostOnboardingFlowContract$Step.ArtificialFirstStep) step11;
                    return new SimpleViewController<q>(aVar12, artificialFirstStep) { // from class: com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.JuniorPostOnboardingFlowModel$ArtificalFirstStepTransparentController
                        public final JuniorPostOnboardingFlowContract$Step.ArtificialFirstStep N;
                        public boolean O;
                        public final /* synthetic */ a P;

                        {
                            Intrinsics.checkNotNullParameter(artificialFirstStep, "step");
                            this.N = artificialFirstStep;
                        }

                        @Override // com.revolut.kompot.navigable.vc.ViewController
                        public final void b3(View view) {
                            Intrinsics.checkNotNullParameter(view, "view");
                            Intrinsics.checkNotNullParameter(view, "view");
                            if (this.O) {
                                return;
                            }
                            this.O = true;
                            a aVar13 = this.P;
                            h.t2(aVar13, aVar13.f77072t, this.N.f77066a, true, null, false, 12);
                        }

                        @Override // yji.o, yki.f
                        /* JADX INFO: renamed from: getLayoutId */
                        public final int getL() {
                            return R$layout.screen_transparent;
                        }
                    };
                }
                if (!(step11 instanceof JuniorPostOnboardingFlowContract$Step.Workflow)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str3 = ((JuniorPostOnboardingFlowContract$Step.Workflow) step11).f77067a;
                til.m mVar = aVar12.f77068p;
                q6 value = q6.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Junior> creator3 = AnalyticsProduct.Junior.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                WorkflowFlow workflowFlowB = til.m.b(mVar, new WorkflowConfiguration.Workflow(str3, (wi0.b) null, (NaviCommand) null, (String) null, new AnalyticsProduct.Junior(value), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 56);
                oi8.d block26 = new oi8.d(aVar12, i5);
                Intrinsics.checkNotNullParameter(block26, "block");
                workflowFlowB.H = block26;
                workflowFlowB.l2(new o10.c(aVar12, 18));
                return workflowFlowB;
            case 19:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a aVar13 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a) obj4;
                l FlowCoordinator4 = (l) obj2;
                PlanSwitchToAnnualFlowContract$Step step12 = (PlanSwitchToAnnualFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof PlanSwitchToAnnualFlowContract$Step.SwitchToAnnual)) {
                    throw new NoWhenBranchMatchedException();
                }
                oik.c cVar2 = aVar13.o;
                PlanSwitchToAnnualScreen planSwitchToAnnualScreen = new PlanSwitchToAnnualScreen(new f(cVar2.f225703a, cVar2.f225704b));
                ofg.a block27 = new ofg.a(aVar13, FlowCoordinator4, 11);
                Intrinsics.checkNotNullParameter(block27, "block");
                planSwitchToAnnualScreen.H = block27;
                return planSwitchToAnnualScreen;
            case 20:
                com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c cVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c) obj4;
                WaitingListV3FlowContract$Step step13 = (WaitingListV3FlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof WaitingListV3FlowContract$Step.Prompt) {
                    WaitingListPromptContent waitingListPromptContent = ((WaitingListV3FlowContract$Step.Prompt) step13).f68525a;
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("waiting list v3 prompt", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_waiting_list_intro_title, zhm.u.c(waitingListPromptContent.f66287b), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_waiting_list_intro_subtitle, zhm.u.c(waitingListPromptContent.f66288c), null, 12), new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlImage(waitingListPromptContent.f66286a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), z4 ? 1 : 0, z3 ? 1 : 0, 6), false ? 1 : 0, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ld.CAPTION, kd.HIGH_CONTRAST, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_waiting_list_intro_button_title, zhm.u.c(waitingListPromptContent.d), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096176), null, false, false, null, 30));
                    oj4.b block28 = new oj4.b(cVar3, i5);
                    Intrinsics.checkNotNullParameter(block28, "block");
                    promptMarketingScreen.H = block28;
                    return promptMarketingScreen;
                }
                if (step13 instanceof WaitingListV3FlowContract$Step.Dashboard) {
                    WaitingListV3DashboardScreen waitingListV3DashboardScreen = new WaitingListV3DashboardScreen(new WaitingListV3DashboardScreenContract$InputData(cVar3.o.f68523a));
                    oj4.b block29 = new oj4.b(cVar3, i2);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    waitingListV3DashboardScreen.H = block29;
                    return waitingListV3DashboardScreen;
                }
                if (!(step13 instanceof WaitingListV3FlowContract$Step.RequestPermission)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(zhm.u.c(new PermissionsControllerContract$Permission("android.permission.POST_NOTIFICATIONS", null, null, false, 6))));
                oj4.b block30 = new oj4.b(cVar3, i3);
                Intrinsics.checkNotNullParameter(block30, "block");
                permissionsController.H = block30;
                return permissionsController;
            case 21:
                final com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar4 = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c) obj4;
                final l FlowCoordinator5 = (l) obj2;
                final BrazilInboundMandateConfirmationFlowContract$Step step14 = (BrazilInboundMandateConfirmationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (Intrinsics.f(step14, BrazilInboundMandateConfirmationFlowContract$Step.MandatePreview.f72577a)) {
                    BrazilInboundMandateConfirmationDescriptor$InputData brazilInboundMandateConfirmationDescriptor$InputData = cVar4.o;
                    BrazilInboundMandatePreviewScreen brazilInboundMandatePreviewScreen = new BrazilInboundMandatePreviewScreen(new uj6.l(brazilInboundMandateConfirmationDescriptor$InputData.f72246a, brazilInboundMandateConfirmationDescriptor$InputData.f72247b, brazilInboundMandateConfirmationDescriptor$InputData.f72248c, brazilInboundMandateConfirmationDescriptor$InputData.d, brazilInboundMandateConfirmationDescriptor$InputData.e, brazilInboundMandateConfirmationDescriptor$InputData.f));
                    final boolean z106 = z96 ? 1 : 0;
                    Function1 block31 = new Function1() { // from class: oj6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (z106) {
                                case 0:
                                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a result = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z107 = result instanceof uj6.m;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar5 = cVar4;
                                    if (z107) {
                                        uj6.m mVar2 = (uj6.m) result;
                                        yji.l.a1(cVar5, cVar5.X1(new y0(null, new g0(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_safe_redirect_title, zhm.u.c(mVar2.f280502b), null, 12), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_safe_redirect_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, null, new e(cVar5, mVar2.f280501a, null), 3);
                                    } else {
                                        boolean z108 = result instanceof o;
                                        l lVar = FlowCoordinator5;
                                        if (z108) {
                                            o oVar = (o) result;
                                            h.t2(cVar5, lVar, new BrazilInboundMandateConfirmationFlowContract$Step.LimitUpdate(oVar.f280506a, oVar.f280507b, oVar.f280508c), true, null, false, 12);
                                        } else if (result instanceof uj6.n) {
                                            uj6.n nVar = (uj6.n) result;
                                            h.t2(cVar5, lVar, new BrazilInboundMandateConfirmationFlowContract$Step.ExpiryDateUpdate(nVar.f280503a, nVar.f280505c, nVar.f280504b), true, null, false, 12);
                                        } else if (result instanceof uj6.p) {
                                            h.t2(cVar5, lVar, new BrazilInboundMandateConfirmationFlowContract$Step.InstitutionInfo(((uj6.p) result).f280509a), true, null, false, 12);
                                        } else if (Intrinsics.f(result, a.C0483a.f72607a)) {
                                            h.w2(lVar, BrazilInboundMandateConfirmationFlowContract$Step.SteeringInfoSheet.f72579a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else if (Intrinsics.f(result, a.b.f72608a)) {
                                            h.t2(cVar5, lVar, BrazilInboundMandateConfirmationFlowContract$Step.SteeringChangeBank.f72578a, true, null, false, 12);
                                        } else {
                                            if (!Intrinsics.f(result, a.c.f72609a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar5.C2(we6.b.f296628a);
                                            h.D2(lVar);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    we6.i result2 = (we6.i) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z109 = result2 instanceof we6.f;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar6 = cVar4;
                                    if (z109) {
                                        cVar6.l2(new oh4.i(cVar6, result2, (Continuation) null, 4), new yi5.b(26));
                                    } else {
                                        boolean z110 = result2 instanceof we6.g;
                                        l lVar2 = FlowCoordinator5;
                                        if (z110) {
                                            cVar6.C2(we6.a.f296626a);
                                            h.D2(lVar2);
                                        } else {
                                            if (!(result2 instanceof we6.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar6.C2(we6.c.f296632a);
                                            h.D2(lVar2);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block31, "block");
                    brazilInboundMandatePreviewScreen.H = block31;
                    return brazilInboundMandatePreviewScreen;
                }
                if (step14 instanceof BrazilInboundMandateConfirmationFlowContract$Step.InstitutionInfo) {
                    brazilInstitutionInfoScreen = new BrazilInstitutionInfoScreen(new BrazilInstitutionInfoScreenContract$InputData(((BrazilInboundMandateConfirmationFlowContract$Step.InstitutionInfo) step14).f72573a));
                } else if (step14 instanceof BrazilInboundMandateConfirmationFlowContract$Step.LimitUpdate) {
                    BrazilInboundMandateConfirmationFlowContract$Step.LimitUpdate limitUpdate = (BrazilInboundMandateConfirmationFlowContract$Step.LimitUpdate) step14;
                    BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = new BrPaymentLimitsUpdateScreen(new BrPaymentLimitsUpdateScreenContract$InputData(limitUpdate.f72575b, limitUpdate.f72576c, false));
                    final boolean z107 = z89 ? 1 : 0;
                    Function1 block32 = new Function1() { // from class: oj6.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (z107) {
                                case 0:
                                    BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar5 = cVar4;
                                    cVar5.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.a(result, cVar5, step14, null), new yi5.b(26));
                                    break;
                                default:
                                    BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar6 = cVar4;
                                    cVar6.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.b(result2, cVar6, step14, null), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block32, "block");
                    brPaymentLimitsUpdateScreen.H = block32;
                    brazilInstitutionInfoScreen = brPaymentLimitsUpdateScreen;
                } else {
                    if (!(step14 instanceof BrazilInboundMandateConfirmationFlowContract$Step.ExpiryDateUpdate)) {
                        if (!Intrinsics.f(step14, BrazilInboundMandateConfirmationFlowContract$Step.SteeringInfoSheet.f72579a)) {
                            if (!Intrinsics.f(step14, BrazilInboundMandateConfirmationFlowContract$Step.SteeringChangeBank.f72578a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ViewController viewControllerE111 = cVar4.e1(new we6.j(new BrazilInboundOpenbankingDescriptor$InputData(true)));
                            Function1 block33 = new Function1() { // from class: oj6.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    switch (i5) {
                                        case 0:
                                            com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a result = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a) obj6;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z1072 = result instanceof uj6.m;
                                            com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar5 = cVar4;
                                            if (z1072) {
                                                uj6.m mVar2 = (uj6.m) result;
                                                yji.l.a1(cVar5, cVar5.X1(new y0(null, new g0(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_safe_redirect_title, zhm.u.c(mVar2.f280502b), null, 12), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_safe_redirect_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, null, new e(cVar5, mVar2.f280501a, null), 3);
                                            } else {
                                                boolean z108 = result instanceof o;
                                                l lVar = FlowCoordinator5;
                                                if (z108) {
                                                    o oVar = (o) result;
                                                    h.t2(cVar5, lVar, new BrazilInboundMandateConfirmationFlowContract$Step.LimitUpdate(oVar.f280506a, oVar.f280507b, oVar.f280508c), true, null, false, 12);
                                                } else if (result instanceof uj6.n) {
                                                    uj6.n nVar = (uj6.n) result;
                                                    h.t2(cVar5, lVar, new BrazilInboundMandateConfirmationFlowContract$Step.ExpiryDateUpdate(nVar.f280503a, nVar.f280505c, nVar.f280504b), true, null, false, 12);
                                                } else if (result instanceof uj6.p) {
                                                    h.t2(cVar5, lVar, new BrazilInboundMandateConfirmationFlowContract$Step.InstitutionInfo(((uj6.p) result).f280509a), true, null, false, 12);
                                                } else if (Intrinsics.f(result, a.C0483a.f72607a)) {
                                                    h.w2(lVar, BrazilInboundMandateConfirmationFlowContract$Step.SteeringInfoSheet.f72579a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                                } else if (Intrinsics.f(result, a.b.f72608a)) {
                                                    h.t2(cVar5, lVar, BrazilInboundMandateConfirmationFlowContract$Step.SteeringChangeBank.f72578a, true, null, false, 12);
                                                } else {
                                                    if (!Intrinsics.f(result, a.c.f72609a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    cVar5.C2(we6.b.f296628a);
                                                    h.D2(lVar);
                                                }
                                            }
                                            return Unit.f186387a;
                                        default:
                                            we6.i result2 = (we6.i) obj6;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            boolean z109 = result2 instanceof we6.f;
                                            com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar6 = cVar4;
                                            if (z109) {
                                                cVar6.l2(new oh4.i(cVar6, result2, (Continuation) null, 4), new yi5.b(26));
                                            } else {
                                                boolean z110 = result2 instanceof we6.g;
                                                l lVar2 = FlowCoordinator5;
                                                if (z110) {
                                                    cVar6.C2(we6.a.f296626a);
                                                    h.D2(lVar2);
                                                } else {
                                                    if (!(result2 instanceof we6.h)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    cVar6.C2(we6.c.f296632a);
                                                    h.D2(lVar2);
                                                }
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block33, "block");
                            viewControllerE111.H = block33;
                            return viewControllerE111;
                        }
                        pj6.a aVar14 = cVar4.f72587s;
                        k9 value2 = k9.OpenBanking;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value2, "value");
                        AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value2);
                        aVar14.getClass();
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        RowDelegate.Model.c cVar5 = null;
                        Object obj6 = null;
                        return new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_steering_info_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_steering_info_sheet_subtitle, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), zhm.v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_steering_info_sheet_item1_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_steering_info_sheet_item1_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cash_income, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z83 ? 1 : 0, z74 ? 1 : 0, 4), false, false, cVar5, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_steering_info_sheet_item2_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_steering_info_sheet_item2_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z54 ? 1 : 0, z49 ? 1 : 0, 4), false, false, cVar5, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_steering_info_sheet_item3_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_steering_info_sheet_item3_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lock_closed, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z41 ? 1 : 0, z31 ? 1 : 0, 4), false, false, cVar5, obj6, 488)), analyticsProduct, null));
                    }
                    BrazilInboundMandateConfirmationFlowContract$Step.ExpiryDateUpdate expiryDateUpdate = (BrazilInboundMandateConfirmationFlowContract$Step.ExpiryDateUpdate) step14;
                    BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen = new BrPaymentExpiryDateUpdateScreen(new BrPaymentExpiryDateUpdateScreenContract$InputData(expiryDateUpdate.f72571b, expiryDateUpdate.f72572c));
                    Function1 block34 = new Function1() { // from class: oj6.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj62) {
                            switch (i5) {
                                case 0:
                                    BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj62;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar52 = cVar4;
                                    cVar52.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.a(result, cVar52, step14, null), new yi5.b(26));
                                    break;
                                default:
                                    BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj62;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar6 = cVar4;
                                    cVar6.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.b(result2, cVar6, step14, null), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block34, "block");
                    brPaymentExpiryDateUpdateScreen.H = block34;
                    brazilInstitutionInfoScreen = brPaymentExpiryDateUpdateScreen;
                }
                return brazilInstitutionInfoScreen;
            case 22:
                ok8.m mVar2 = (ok8.m) obj4;
                JuniorProgressionFlowContract$Step step15 = (JuniorProgressionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof JuniorProgressionFlowContract$Step.Prompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorProgressionPromptScreen juniorProgressionPromptScreen = new JuniorProgressionPromptScreen();
                ok8.c block35 = new ok8.c(mVar2, i5);
                Intrinsics.checkNotNullParameter(block35, "block");
                juniorProgressionPromptScreen.H = block35;
                return juniorProgressionPromptScreen;
            case 23:
                return a(obj2, obj3);
            case 24:
                return b(obj2, obj3);
            case 25:
                return c(obj2, obj3);
            case 26:
                return d(obj2, obj3);
            case 27:
                return e(obj2, obj3);
            case 28:
                return g(obj2, obj3);
            default:
                final com.revolut.feature.salary_switch.impl.ui.brazil.flow.b bVar5 = (com.revolut.feature.salary_switch.impl.ui.brazil.flow.b) obj4;
                final yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                SalarySwitchBrFlowContract$Step step16 = (SalarySwitchBrFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof SalarySwitchBrFlowContract$Step.BankList) {
                    BankListScreen bankListScreen = new BankListScreen(((SalarySwitchBrFlowContract$Step.BankList) step16).f85267a);
                    final boolean z108 = z100 ? 1 : 0;
                    Function1 block36 = new Function1() { // from class: oqc.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (z108) {
                                case 0:
                                    pqc.h result = (pqc.h) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, new SalarySwitchBrFlowContract$Step.ReviewDetails(new ReviewDetailsScreenContract$InputData(result.f238721a, result.f238722b, result.f238723c)), false, null, false, 14);
                                    return Unit.f186387a;
                                case 1:
                                    vqc.i result2 = (vqc.i) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, new SalarySwitchBrFlowContract$Step.BankList(new BankListScreenContract$InputData(result2.f291376a, result2.f291377b)), false, null, false, 14);
                                    return Unit.f186387a;
                                case 2:
                                    brc.m result3 = (brc.m) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!Intrinsics.f(result3, brc.m.f17988a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a, false, null, false, 14);
                                    return Unit.f186387a;
                                default:
                                    zqc.g result4 = (zqc.g) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!Intrinsics.f(result4, zqc.g.f324453a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a, false, null, false, 14);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block36, "block");
                    bankListScreen.H = block36;
                    return bankListScreen;
                }
                if (step16 instanceof SalarySwitchBrFlowContract$Step.EnterEmployerDetails) {
                    EmployerDetailsScreen employerDetailsScreen = new EmployerDetailsScreen();
                    Function1 block37 = new Function1() { // from class: oqc.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i5) {
                                case 0:
                                    pqc.h result = (pqc.h) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, new SalarySwitchBrFlowContract$Step.ReviewDetails(new ReviewDetailsScreenContract$InputData(result.f238721a, result.f238722b, result.f238723c)), false, null, false, 14);
                                    return Unit.f186387a;
                                case 1:
                                    vqc.i result2 = (vqc.i) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, new SalarySwitchBrFlowContract$Step.BankList(new BankListScreenContract$InputData(result2.f291376a, result2.f291377b)), false, null, false, 14);
                                    return Unit.f186387a;
                                case 2:
                                    brc.m result3 = (brc.m) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!Intrinsics.f(result3, brc.m.f17988a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a, false, null, false, 14);
                                    return Unit.f186387a;
                                default:
                                    zqc.g result4 = (zqc.g) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!Intrinsics.f(result4, zqc.g.f324453a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a, false, null, false, 14);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block37, "block");
                    employerDetailsScreen.H = block37;
                    return employerDetailsScreen;
                }
                if (step16 instanceof SalarySwitchBrFlowContract$Step.ReviewDetails) {
                    ReviewDetailsScreen reviewDetailsScreen = new ReviewDetailsScreen(((SalarySwitchBrFlowContract$Step.ReviewDetails) step16).f85271a);
                    oqc.c block38 = new oqc.c(bVar5, i5);
                    Intrinsics.checkNotNullParameter(block38, "block");
                    reviewDetailsScreen.H = block38;
                    return reviewDetailsScreen;
                }
                if (step16 instanceof SalarySwitchBrFlowContract$Step.SalaryStatus) {
                    SalaryStatusScreen salaryStatusScreen = new SalaryStatusScreen(new SalaryStatusScreenContract$InputData(((SalarySwitchBrFlowContract$Step.SalaryStatus) step16).f85272a));
                    Function1 block39 = new Function1() { // from class: oqc.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i2) {
                                case 0:
                                    pqc.h result = (pqc.h) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, new SalarySwitchBrFlowContract$Step.ReviewDetails(new ReviewDetailsScreenContract$InputData(result.f238721a, result.f238722b, result.f238723c)), false, null, false, 14);
                                    return Unit.f186387a;
                                case 1:
                                    vqc.i result2 = (vqc.i) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, new SalarySwitchBrFlowContract$Step.BankList(new BankListScreenContract$InputData(result2.f291376a, result2.f291377b)), false, null, false, 14);
                                    return Unit.f186387a;
                                case 2:
                                    brc.m result3 = (brc.m) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!Intrinsics.f(result3, brc.m.f17988a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a, false, null, false, 14);
                                    return Unit.f186387a;
                                default:
                                    zqc.g result4 = (zqc.g) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!Intrinsics.f(result4, zqc.g.f324453a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a, false, null, false, 14);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block39, "block");
                    salaryStatusScreen.H = block39;
                    return salaryStatusScreen;
                }
                if (step16 instanceof SalarySwitchBrFlowContract$Step.RequestsList) {
                    SalaryRequestsScreen salaryRequestsScreen = new SalaryRequestsScreen();
                    Function1 block40 = new Function1() { // from class: oqc.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    pqc.h result = (pqc.h) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, new SalarySwitchBrFlowContract$Step.ReviewDetails(new ReviewDetailsScreenContract$InputData(result.f238721a, result.f238722b, result.f238723c)), false, null, false, 14);
                                    return Unit.f186387a;
                                case 1:
                                    vqc.i result2 = (vqc.i) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, new SalarySwitchBrFlowContract$Step.BankList(new BankListScreenContract$InputData(result2.f291376a, result2.f291377b)), false, null, false, 14);
                                    return Unit.f186387a;
                                case 2:
                                    brc.m result3 = (brc.m) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!Intrinsics.f(result3, brc.m.f17988a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a, false, null, false, 14);
                                    return Unit.f186387a;
                                default:
                                    zqc.g result4 = (zqc.g) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!Intrinsics.f(result4, zqc.g.f324453a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar5, LazyFlowCoordinator2, SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a, false, null, false, 14);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block40, "block");
                    salaryRequestsScreen.H = block40;
                    return salaryRequestsScreen;
                }
                if (!(step16 instanceof SalarySwitchBrFlowContract$Step.Promo)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(qrc.a.f248705a, "<this>");
                ViewController viewControllerE112 = bVar5.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("br-salary-transfer-onboarding")), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                om4.l0 block41 = new om4.l0(bVar5, 10, LazyFlowCoordinator2, step16);
                Intrinsics.checkNotNullParameter(block41, "block");
                viewControllerE112.H = block41;
                return viewControllerE112;
        }
    }

    public /* synthetic */ c(occ.p pVar, occ.a aVar) {
        this.f223516a = 13;
        this.f223517b = aVar;
    }
}
