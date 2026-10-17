package g75;

import android.os.Parcelable;
import aw0.n6;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressValidationMode;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressVerificationUseCase;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationIdentificationControllerDescriptor;
import com.revolut.feature.junior_graduation.impl.ui.screen.identification.JuniorIdentificationScreenContract$ModalStep;
import com.revolut.feature.kyc.api.KycApi$FeatureToggle;
import com.revolut.feature.kyc.api.navigation.ProofOfAddressFlowDescriptor;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsFlowInputData;
import com.revolut.feature.onboarding.api.user_under_18.UserUnder18Data;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.analytics_tracking_consent.AnalyticsTrackingConsentFlow;
import com.revolut.feature.onboarding.impl.onboarding.analytics_tracking_consent.AnalyticsTrackingConsentFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlow;
import com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.can_not_open_account.CanNotOpenAccountScreen;
import com.revolut.feature.onboarding.impl.onboarding.can_not_open_account.CanNotOpenAccountScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.contact_permission.ContactsPermissionScreen;
import com.revolut.feature.onboarding.impl.onboarding.duplicate_account.DuplicateAccountScreen;
import com.revolut.feature.onboarding.impl.onboarding.kyc.KycWrapperScreen;
import com.revolut.feature.onboarding.impl.onboarding.kyc.KycWrapperScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.passcode.flow.PasscodeFlow;
import com.revolut.feature.onboarding.impl.onboarding.passcode.flow.PasscodeFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.pep.PoliticallyExposedPersonScreen;
import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlow;
import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.risk_check.RiskCheckScreen;
import com.revolut.feature.onboarding.impl.onboarding.risk_check.RiskCheckScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.v;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.activation_ready.WaitingListActivationReadyScreen;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.activation_ready.WaitingListActivationReadyScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreen;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlow;
import com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.workflow.OnboardingWorkflowFlow;
import com.revolut.feature.onboarding.impl.onboarding.workflow.OnboardingWorkflowFlowContract$InputData;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlow;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.TravelMilesFlightDatePickerScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.TravelMilesFlightDatePickerScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsControllerDescriptor;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$Configuration;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipControllerDescriptor;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowInputData;
import com.revolut.feature_retail_user_declarations.occupation.OccupationChooserFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.model.PurposeOfAccountProductType;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingDynamicForm;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.a;
import com.revolut.shared.feature.user_declarations.api.flows.income.IncomeFlowInputData;
import com.revolut.shared.feature.user_declarations.api.models.DateOfBirthScreenConfig;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.IncomeFlowControllerDescriptor;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkj.f;
import vkj.g;
import vkm.j2;
import xkj.h;
import xkj.i;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f141119b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f141118a = i;
        this.f141119b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj2, Object obj3) {
        final v vVar = (v) this.f141119b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        OnboardingFlowContract$Step step = (OnboardingFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof OnboardingFlowContract$Step.Country) {
            OnboardingFlowContract$Step.Country country = (OnboardingFlowContract$Step.Country) step;
            return vVar.O2(country.f78329a, t89.a.NO_TERMS, country.d, country.f78330b);
        }
        final int i = 0;
        if (step instanceof OnboardingFlowContract$Step.RetailAndCreditTerms) {
            OnboardingFlowContract$Step.RetailAndCreditTerms retailAndCreditTerms = (OnboardingFlowContract$Step.RetailAndCreditTerms) step;
            return vVar.O2(retailAndCreditTerms.f78368a, retailAndCreditTerms.f78369b, false, false);
        }
        if (step instanceof OnboardingFlowContract$Step.Name) {
            OnboardingFlowContract$Step.Name name = (OnboardingFlowContract$Step.Name) step;
            wi0.b bVar = name.f78354a;
            ViewController viewControllerE1 = vVar.e1(new qbl.f(new NameControllerDescriptor$InputData(bVar, name.f78355b, com.bumptech.glide.d.t(bVar), null, null, null, null, null, null, 504)));
            ga9.f block = new ga9.f(vVar, 25);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        int i2 = 15;
        final int i3 = 2;
        if (step instanceof OnboardingFlowContract$Step.DateOfBirth) {
            ViewController viewControllerE12 = vVar.e1(new qbl.e(new DateOfBirthControllerDescriptor$InputData(((OnboardingFlowContract$Step.DateOfBirth) step).f78332a, new DateOfBirthScreenConfig(null, null, 15), rbl.a.NONE)));
            ga9.f block2 = new ga9.f(vVar, i3);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE12.H = block2;
            return viewControllerE12;
        }
        int i5 = 14;
        if (step instanceof OnboardingFlowContract$Step.DuplicateAccount) {
            DuplicateAccountScreen duplicateAccountScreen = new DuplicateAccountScreen();
            ga9.f block3 = new ga9.f(vVar, i5);
            Intrinsics.checkNotNullParameter(block3, "block");
            duplicateAccountScreen.H = block3;
            return duplicateAccountScreen;
        }
        if (step instanceof OnboardingFlowContract$Step.Email) {
            OnboardingFlowContract$Step.Email email = (OnboardingFlowContract$Step.Email) step;
            return vVar.P2(email.f78339a, email.f78340b, email.f78341c, false, false, email.d);
        }
        if (step instanceof OnboardingFlowContract$Step.EmailWithMarketingConsent) {
            OnboardingFlowContract$Step.EmailWithMarketingConsent emailWithMarketingConsent = (OnboardingFlowContract$Step.EmailWithMarketingConsent) step;
            return vVar.P2(emailWithMarketingConsent.f78342a, emailWithMarketingConsent.f78343b, emailWithMarketingConsent.f78344c, emailWithMarketingConsent.d, true, emailWithMarketingConsent.e);
        }
        if (step instanceof OnboardingFlowContract$Step.CanNotOpenAccount) {
            OnboardingFlowContract$Step.CanNotOpenAccount canNotOpenAccount = (OnboardingFlowContract$Step.CanNotOpenAccount) step;
            int i6 = canNotOpenAccount.f78324a;
            ka9.c cVar = (i6 != i89.a.CAN_NOT_OPEN_ACCOUNT.a() && i6 == i89.a.CAN_NOT_OPEN_ACCOUNT_FOREIGN_APPLICANT.a()) ? ka9.c.FOREIGN_APPLICANT : ka9.c.DEFAULT;
            CanNotOpenAccountScreen canNotOpenAccountScreen = new CanNotOpenAccountScreen(new CanNotOpenAccountScreenContract$InputData(cVar, canNotOpenAccount.f78325b));
            ga9.f block4 = new ga9.f(vVar, i2);
            Intrinsics.checkNotNullParameter(block4, "block");
            canNotOpenAccountScreen.H = block4;
            return canNotOpenAccountScreen;
        }
        if (step instanceof OnboardingFlowContract$Step.RiskCheck) {
            RiskCheckScreen riskCheckScreen = new RiskCheckScreen(new RiskCheckScreenContract$InputData(((OnboardingFlowContract$Step.RiskCheck) step).f78370a));
            ga9.f block5 = new ga9.f(vVar, 27);
            Intrinsics.checkNotNullParameter(block5, "block");
            riskCheckScreen.H = block5;
            return riskCheckScreen;
        }
        int i21 = 12;
        if (step instanceof OnboardingFlowContract$Step.UserUnder18) {
            eb9.a aVar = vVar.u;
            UserUnder18Data userUnder18Data = ((OnboardingFlowContract$Step.UserUnder18) step).f78372a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(userUnder18Data, "userUnder18Data");
            boolean z = userUnder18Data.f78230a;
            int i22 = userUnder18Data.f78231b;
            PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(z ? new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.signup_junior_self_signup_eligible_prompt_title_dynamic, u.c(Integer.valueOf(i22)), null, 12), new TextLocalisedClause(R$string.signup_junior_self_signup_eligible_prompt_subtitle, null, null, 14), new UrlVideo("https://assets.revolut.com/published-assets/d1ae8135-fbd2-4ec9-aaf1-41b5d16a5966/27bcab2e-4375-4ade-85b3-e8550342deff/2/f9098e47-362c-4761-bf35-4721d8ee2b25.mp4", "https://assets.revolut.com/published-assets/d1ae8135-fbd2-4ec9-aaf1-41b5d16a5966/ad3d38ec-e2d6-45c3-a1b3-a3f36f67035f/4/0958fd6c-bd8f-4206-94ff-eb42dfe5106e.mp4", false, (oz0.b) null, false, (oz0.c) null, 124), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_junior_self_signup_eligible_prompt_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, AnalyticsProduct.Shared.Onboarding.f, null, 61272) : new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.signup_junior_self_signup_not_eligible_prompt_title_dynamic, u.c(Integer.valueOf(i22)), null, 12), new TextLocalisedClause(R$string.signup_junior_self_signup_not_eligible_prompt_subtitle, null, null, 14), new UrlVideo("https://assets.revolut.com/published-assets/d1ae8135-fbd2-4ec9-aaf1-41b5d16a5966/27bcab2e-4375-4ade-85b3-e8550342deff/2/f9098e47-362c-4761-bf35-4721d8ee2b25.mp4", "https://assets.revolut.com/published-assets/d1ae8135-fbd2-4ec9-aaf1-41b5d16a5966/ad3d38ec-e2d6-45c3-a1b3-a3f36f67035f/4/0958fd6c-bd8f-4206-94ff-eb42dfe5106e.mp4", false, (oz0.b) null, false, (oz0.c) null, 124), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_junior_self_signup_not_eligible_prompt_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, AnalyticsProduct.Shared.Onboarding.f, null, 61272));
            ga9.f block6 = new ga9.f(vVar, 7);
            Intrinsics.checkNotNullParameter(block6, "block");
            promptMarketingScreen.H = block6;
            return promptMarketingScreen;
        }
        if (step instanceof OnboardingFlowContract$Step.Occupation) {
            ViewController viewControllerE13 = vVar.e1(new rbi.b(new OccupationChooserFlowInputData(((OnboardingFlowContract$Step.Occupation) step).f78356a, null, 30)));
            ga9.f block7 = new ga9.f(vVar, 23);
            Intrinsics.checkNotNullParameter(block7, "block");
            viewControllerE13.H = block7;
            return viewControllerE13;
        }
        int i32 = 26;
        if (step instanceof OnboardingFlowContract$Step.WaitingList) {
            OnboardingFlowContract$Step.WaitingList waitingList = (OnboardingFlowContract$Step.WaitingList) step;
            WaitingListAwaitingScreen waitingListAwaitingScreen = new WaitingListAwaitingScreen(new WaitingListAwaitingScreenContract$InputData(waitingList.f78373a, waitingList.f78374b ? rbl.a.BACK : rbl.a.NONE));
            g48.j block8 = new g48.j(vVar, waitingList, i32);
            Intrinsics.checkNotNullParameter(block8, "block");
            waitingListAwaitingScreen.H = block8;
            return waitingListAwaitingScreen;
        }
        if (step instanceof OnboardingFlowContract$Step.WaitingListActivationReady) {
            WaitingListActivationReadyScreen waitingListActivationReadyScreen = new WaitingListActivationReadyScreen(new WaitingListActivationReadyScreenContract$InputData(((OnboardingFlowContract$Step.WaitingListActivationReady) step).f78375a));
            ga9.f block9 = new ga9.f(vVar, 10);
            Intrinsics.checkNotNullParameter(block9, "block");
            waitingListActivationReadyScreen.H = block9;
            return waitingListActivationReadyScreen;
        }
        int i33 = 22;
        if (step instanceof OnboardingFlowContract$Step.PurposeOfAccount) {
            ViewController viewControllerE14 = vVar.e1(new ybi.a(new PurposeOfAccountFlowInputData(((OnboardingFlowContract$Step.PurposeOfAccount) step).f78366a, PurposeOfAccountProductType.Personal.f97718a, null, rbl.a.NONE, null, null, 52)));
            g48.j block10 = new g48.j(vVar, viewControllerE14, i33);
            Intrinsics.checkNotNullParameter(block10, "block");
            viewControllerE14.H = block10;
            return viewControllerE14;
        }
        if (step instanceof OnboardingFlowContract$Step.PoliticallyExposedPersonDeclaration) {
            PoliticallyExposedPersonScreen politicallyExposedPersonScreen = new PoliticallyExposedPersonScreen();
            Function1 block11 = new Function1() { // from class: ga9.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            ha9.e output = (ha9.e) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar2 = vVar;
                            vVar2.l2(new g1k.i(output, vVar2, null, 25), new yi5.b(26));
                            break;
                        case 1:
                            ks8.d it8 = (ks8.d) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar3 = vVar;
                            vVar3.l2(new m(vVar3, null, 0), new yi5.b(26));
                            break;
                        case 2:
                            mb9.d outputData = (mb9.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar4 = vVar;
                            vVar4.l2(new v(vVar4, outputData, (Continuation) null, 4), new yi5.b(26));
                            break;
                        default:
                            bc9.h output2 = (bc9.h) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar5 = vVar;
                            vVar5.l2(new com.revolut.feature.onboarding.impl.onboarding.u(vVar5, output2, null), new yi5.b(26));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block11, "block");
            politicallyExposedPersonScreen.H = block11;
            return politicallyExposedPersonScreen;
        }
        if (step instanceof OnboardingFlowContract$Step.MonthlyIncome) {
            ViewController viewControllerE15 = vVar.e1(new IncomeFlowControllerDescriptor(new IncomeFlowInputData(new TextLocalisedClause(R$string.signup_monthly_income_title, null, null, 14), (Clause) null, new TextLocalisedClause(R$string.signup_monthly_income_subtitle, null, null, 14), (TextLocalisedClause) null, (ResourceImage) null, ((OnboardingFlowContract$Step.MonthlyIncome) step).f78353a, u.c(sil.c.MONTHLY), 74)));
            ga9.f block12 = new ga9.f(vVar, 29);
            Intrinsics.checkNotNullParameter(block12, "block");
            viewControllerE15.H = block12;
            return viewControllerE15;
        }
        if (step instanceof OnboardingFlowContract$Step.PasscodeCreation) {
            OnboardingFlowContract$Step.PasscodeCreation passcodeCreation = (OnboardingFlowContract$Step.PasscodeCreation) step;
            PasscodeFlow passcodeFlow = new PasscodeFlow(new PasscodeFlowContract$InputData(passcodeCreation.f78357a, passcodeCreation.f78358b ? rbl.a.BACK : rbl.a.NONE));
            ga9.f block13 = new ga9.f(vVar, 17);
            Intrinsics.checkNotNullParameter(block13, "block");
            passcodeFlow.H = block13;
            return passcodeFlow;
        }
        final int i43 = 1;
        if (step instanceof OnboardingFlowContract$Step.BankTerms) {
            ViewController viewControllerE16 = vVar.e1(new AcceptBankTermsControllerDescriptor(new AcceptBankTermsScreenContract$InputData(new AcceptBankTermsScreenContract$Configuration.TermsCountry(((OnboardingFlowContract$Step.BankTerms) step).f78321a, null))));
            ga9.f block14 = new ga9.f(vVar, i43);
            Intrinsics.checkNotNullParameter(block14, "block");
            viewControllerE16.H = block14;
            return viewControllerE16;
        }
        if (step instanceof OnboardingFlowContract$Step.ContactsPermission) {
            ContactsPermissionScreen contactsPermissionScreen = new ContactsPermissionScreen();
            ga9.f block15 = new ga9.f(vVar, 18);
            Intrinsics.checkNotNullParameter(block15, "block");
            contactsPermissionScreen.H = block15;
            return contactsPermissionScreen;
        }
        if (step instanceof OnboardingFlowContract$Step.Citizenship) {
            wi0.b bVar2 = ((OnboardingFlowContract$Step.Citizenship) step).f78326a;
            boolean zC = ((jte.d) vVar.f78496x).c(KycApi$FeatureToggle.SimplifiedKyc.f77466c);
            k9 value = k9.Onboarding;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            ViewController viewControllerE17 = vVar.e1(new SubmitCitizenshipControllerDescriptor(new SubmitCitizenshipFlowInputData(false, zC, bVar2, bVar2, null, zC ? null : rbl.a.BACK, null, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_nationality_search_hint, null, null, 14), null, new AnalyticsProduct.Retail(value), 1201)));
            ga9.f block16 = new ga9.f(vVar, i32);
            Intrinsics.checkNotNullParameter(block16, "block");
            viewControllerE17.H = block16;
            return viewControllerE17;
        }
        if (step instanceof OnboardingFlowContract$Step.AddressVerificationKyc) {
            OnboardingFlowContract$Step.AddressVerificationKyc addressVerificationKyc = (OnboardingFlowContract$Step.AddressVerificationKyc) step;
            ViewController viewControllerE18 = vVar.e1(new ProofOfAddressFlowDescriptor.Verification(addressVerificationKyc.f78317b, gt8.a.UPLOADING_DONE, addressVerificationKyc.f78316a));
            Function1 block17 = new Function1() { // from class: ga9.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i43) {
                        case 0:
                            ha9.e output = (ha9.e) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar2 = vVar;
                            vVar2.l2(new g1k.i(output, vVar2, null, 25), new yi5.b(26));
                            break;
                        case 1:
                            ks8.d it8 = (ks8.d) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar3 = vVar;
                            vVar3.l2(new m(vVar3, null, 0), new yi5.b(26));
                            break;
                        case 2:
                            mb9.d outputData = (mb9.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar4 = vVar;
                            vVar4.l2(new v(vVar4, outputData, (Continuation) null, 4), new yi5.b(26));
                            break;
                        default:
                            bc9.h output2 = (bc9.h) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar5 = vVar;
                            vVar5.l2(new com.revolut.feature.onboarding.impl.onboarding.u(vVar5, output2, null), new yi5.b(26));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block17, "block");
            viewControllerE18.H = block17;
            return viewControllerE18;
        }
        if (step instanceof OnboardingFlowContract$Step.TaxResidency) {
            wi0.b userCountry = ((OnboardingFlowContract$Step.TaxResidency) step).f78371a;
            fne.b bVar3 = vVar.f78491q;
            k9 value2 = k9.Onboarding;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value2, "value");
            AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value2);
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(userCountry, "userCountry");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            CollectTaxResidencyFlow collectTaxResidencyFlow = new CollectTaxResidencyFlow(new CollectTaxResidencyFlowContract$InputData(userCountry, true, true, false, analyticsProduct, true, false, null));
            ga9.f fVar = new ga9.f(vVar, 8);
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            collectTaxResidencyFlow.J = fVar;
            return collectTaxResidencyFlow;
        }
        if (step instanceof OnboardingFlowContract$Step.Address) {
            wi0.b bVar4 = ((OnboardingFlowContract$Step.Address) step).f78315a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.signup_address_input_short_title, null, null, 14);
            wi0.b.Companion.getClass();
            ViewController viewControllerE19 = vVar.e1(new th1.a(new AddressFlowContract$InputData(new Address(null, null, null, null, null, bVar4.f297794a, null, null, null, null, null, null, null, null, null, 32735, null), textLocalisedClause, Intrinsics.f(bVar4, wi0.b.X0) ? new TextLocalisedClause(com.revolut.feature.address.common.api.R$string.signup_registration_address_subtitle_jp, null, null, 14) : Intrinsics.f(bVar4, wi0.b.J2) ? new TextLocalisedClause(com.revolut.feature.address.common.api.R$string.signup_registration_address_subtitle_sg, null, null, 14) : new TextLocalisedClause(R$string.onboarding_registration_address_subtitle, null, null, 14), false, null, FieldMode.Hidden.f60954a, qh1.b.NONE, null, false, new AddressValidationMode.Verification(AddressVerificationUseCase.RESIDENTIAL), 784244), null, null, 6));
            ga9.f block18 = new ga9.f(vVar, 13);
            Intrinsics.checkNotNullParameter(block18, "block");
            viewControllerE19.H = block18;
            return viewControllerE19;
        }
        if (step instanceof OnboardingFlowContract$Step.MarketingConsent) {
            OnboardingFlowContract$Step.MarketingConsent marketingConsent = (OnboardingFlowContract$Step.MarketingConsent) step;
            wi0.b bVar5 = marketingConsent.f78350a;
            boolean z3 = marketingConsent.f78351b;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.marketing_opt_in_prompt_title, null, null, 14);
            wi0.b.Companion.getClass();
            PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause2, Intrinsics.f(bVar5, wi0.b.O) ? new TextLocalisedClause(R$string.marketing_opt_in_prompt_subtitle_co, null, null, 14) : new TextLocalisedClause(R$string.marketing_opt_in_prompt_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D042", null, null, null, 30), null, null, z3 ? new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.marketing_opt_in_prompt_agree, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.marketing_opt_in_prompt_disagree, null, null, 14), (ResourceImage) (0 == true ? 1 : 0), (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, AnalyticsProduct.Shared.Onboarding.f, null, 61016));
            ga9.f block19 = new ga9.f(vVar, 20);
            Intrinsics.checkNotNullParameter(block19, "block");
            promptMarketingScreen2.H = block19;
            return promptMarketingScreen2;
        }
        if (step instanceof OnboardingFlowContract$Step.Biometric) {
            OnboardingFlowContract$Step.Biometric biometric = (OnboardingFlowContract$Step.Biometric) step;
            OnboardingBiometricFlow onboardingBiometricFlow = new OnboardingBiometricFlow(new OnboardingBiometricFlowContract$InputData(biometric.f78322a, biometric.f78323b));
            ga9.f block20 = new ga9.f(vVar, 28);
            Intrinsics.checkNotNullParameter(block20, "block");
            onboardingBiometricFlow.H = block20;
            return onboardingBiometricFlow;
        }
        final int i59 = 3;
        if (step instanceof OnboardingFlowContract$Step.ProfileDetails) {
            ViewController viewControllerE110 = vVar.e1(ew9.c.f130113a);
            ga9.f block21 = new ga9.f(vVar, i59);
            Intrinsics.checkNotNullParameter(block21, "block");
            viewControllerE110.H = block21;
            return viewControllerE110;
        }
        if (step instanceof OnboardingFlowContract$Step.ContactsSync) {
            ViewController viewControllerE111 = vVar.e1(new g3a.c());
            ga9.f block22 = new ga9.f(vVar, i21);
            Intrinsics.checkNotNullParameter(block22, "block");
            viewControllerE111.H = block22;
            return viewControllerE111;
        }
        if (step instanceof OnboardingFlowContract$Step.ProductLifecycle) {
            OnboardingFlowContract$Step.ProductLifecycle productLifecycle = (OnboardingFlowContract$Step.ProductLifecycle) step;
            OnboardingProductLifecycleFlow onboardingProductLifecycleFlow = new OnboardingProductLifecycleFlow(new OnboardingProductLifecycleFlowContract$InputData(productLifecycle.f78362a, productLifecycle.f78363b));
            ga9.f block23 = new ga9.f(vVar, 5);
            Intrinsics.checkNotNullParameter(block23, "block");
            onboardingProductLifecycleFlow.H = block23;
            return onboardingProductLifecycleFlow;
        }
        if (step instanceof OnboardingFlowContract$Step.Workflow) {
            OnboardingFlowContract$Step.Workflow workflow = (OnboardingFlowContract$Step.Workflow) step;
            OnboardingWorkflowFlow onboardingWorkflowFlow = new OnboardingWorkflowFlow(new OnboardingWorkflowFlowContract$InputData(workflow.f78378b, workflow.f78379c, workflow.f78377a));
            Function1 block24 = new Function1() { // from class: ga9.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i59) {
                        case 0:
                            ha9.e output = (ha9.e) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar2 = vVar;
                            vVar2.l2(new g1k.i(output, vVar2, null, 25), new yi5.b(26));
                            break;
                        case 1:
                            ks8.d it8 = (ks8.d) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar3 = vVar;
                            vVar3.l2(new m(vVar3, null, 0), new yi5.b(26));
                            break;
                        case 2:
                            mb9.d outputData = (mb9.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar4 = vVar;
                            vVar4.l2(new v(vVar4, outputData, (Continuation) null, 4), new yi5.b(26));
                            break;
                        default:
                            bc9.h output2 = (bc9.h) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar5 = vVar;
                            vVar5.l2(new com.revolut.feature.onboarding.impl.onboarding.u(vVar5, output2, null), new yi5.b(26));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block24, "block");
            onboardingWorkflowFlow.H = block24;
            return onboardingWorkflowFlow;
        }
        if (step instanceof OnboardingFlowContract$Step.Qes) {
            QesTermsFlow qesTermsFlow = new QesTermsFlow(new QesTermsFlowInputData(((o99.c) vVar.f78495w).b(((OnboardingFlowContract$Step.Qes) step).f78367a), y89.d.NONE, 2));
            ga9.f block25 = new ga9.f(vVar, 11);
            Intrinsics.checkNotNullParameter(block25, "block");
            qesTermsFlow.H = block25;
            return qesTermsFlow;
        }
        int i66 = 16;
        if (step instanceof OnboardingFlowContract$Step.AiCallsConsent) {
            ga9.a aVar2 = vVar.f78497y;
            g9j.v callback = new g9j.v(vVar, i3);
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(callback, "callback");
            PromptMarketingScreen promptMarketingScreen3 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.ai_calls_opt_in_prompt_title, null, null, 14), new TextLocalisedClause(R$string.ai_calls_opt_in_prompt_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D100", null, null, null, 30), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.ai_calls_opt_in_prompt_agree, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "AI_CALLS_PRIMARY_BUTTON_LOADING_TAG", 30), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.ai_calls_opt_in_prompt_disagree, null, null, 14), (ResourceImage) (0 == true ? 1 : 0), (LargeActionButton.ButtonStyle) null, false, "AI_CALLS_SECONDARY_BUTTON_LOADING_TAG", 30), null, null, null, AnalyticsProduct.Shared.Onboarding.f, null, 61016));
            g4k.e block26 = new g4k.e(callback, i66);
            Intrinsics.checkNotNullParameter(block26, "block");
            promptMarketingScreen3.H = block26;
            return promptMarketingScreen3;
        }
        if (step instanceof OnboardingFlowContract$Step.AnalyticsEventTrackingConsent) {
            AnalyticsTrackingConsentFlow analyticsTrackingConsentFlow = new AnalyticsTrackingConsentFlow(new AnalyticsTrackingConsentFlowContract$InputData(true, ((OnboardingFlowContract$Step.AnalyticsEventTrackingConsent) step).f78319a));
            Function1 block27 = new Function1() { // from class: ga9.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            ha9.e output = (ha9.e) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar2 = vVar;
                            vVar2.l2(new g1k.i(output, vVar2, null, 25), new yi5.b(26));
                            break;
                        case 1:
                            ks8.d it8 = (ks8.d) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar3 = vVar;
                            vVar3.l2(new m(vVar3, null, 0), new yi5.b(26));
                            break;
                        case 2:
                            mb9.d outputData = (mb9.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar4 = vVar;
                            vVar4.l2(new v(vVar4, outputData, (Continuation) null, 4), new yi5.b(26));
                            break;
                        default:
                            bc9.h output2 = (bc9.h) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.onboarding.impl.onboarding.v vVar5 = vVar;
                            vVar5.l2(new com.revolut.feature.onboarding.impl.onboarding.u(vVar5, output2, null), new yi5.b(26));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block27, "block");
            analyticsTrackingConsentFlow.H = block27;
            return analyticsTrackingConsentFlow;
        }
        if (step instanceof OnboardingFlowContract$Step.PodBeneficiaries) {
            OnboardingFlowContract$Step.PodBeneficiaries podBeneficiaries = (OnboardingFlowContract$Step.PodBeneficiaries) step;
            ViewController viewControllerE112 = vVar.e1(new aek.a(podBeneficiaries.f78360b, podBeneficiaries.f78359a));
            ga9.f block28 = new ga9.f(vVar, 4);
            Intrinsics.checkNotNullParameter(block28, "block");
            viewControllerE112.H = block28;
            return viewControllerE112;
        }
        if (step instanceof OnboardingFlowContract$Step.WaitingVerification) {
            WaitingVerificationFlow waitingVerificationFlow = new WaitingVerificationFlow(new WaitingVerificationFlowContract$InputData(((OnboardingFlowContract$Step.WaitingVerification) step).f78376a));
            ga9.f block29 = new ga9.f(vVar, 24);
            Intrinsics.checkNotNullParameter(block29, "block");
            waitingVerificationFlow.H = block29;
            return waitingVerificationFlow;
        }
        if (Intrinsics.f(step, OnboardingFlowContract$Step.ProductOnboarding.f78364a)) {
            ViewController viewControllerE113 = vVar.e1(vja.a.f289661a);
            ga9.f block30 = new ga9.f(vVar, i33);
            Intrinsics.checkNotNullParameter(block30, "block");
            viewControllerE113.H = block30;
            return viewControllerE113;
        }
        if (step instanceof OnboardingFlowContract$Step.JuniorGraduationAccountLinked) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.signup_junior_account_linked_title, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.signup_junior_account_linked_description, null, null, 14);
            ResourceImage resourceImage = ((OnboardingFlowContract$Step.JuniorGraduationAccountLinked) step).f78345a ? new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
            CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D151A", null, null, null, 30);
            PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
            k9 value3 = k9.Junior;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value3, "value");
            PromptMarketingScreen promptMarketingScreen4 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause3, textLocalisedClause4, cdnImageC, null, null, resourceImage, null, button, null, null, null, null, new AnalyticsProduct.Retail(value3), null, 61272));
            ga9.f block31 = new ga9.f(vVar, 21);
            Intrinsics.checkNotNullParameter(block31, "block");
            promptMarketingScreen4.H = block31;
            return promptMarketingScreen4;
        }
        if (step instanceof OnboardingFlowContract$Step.JuniorGraduationIdentification) {
            OnboardingFlowContract$Step.JuniorGraduationIdentification juniorGraduationIdentification = (OnboardingFlowContract$Step.JuniorGraduationIdentification) step;
            ViewController viewControllerE114 = vVar.e1(new JuniorGraduationIdentificationControllerDescriptor(juniorGraduationIdentification.f78347a, juniorGraduationIdentification.f78348b, juniorGraduationIdentification.f78349c));
            ga9.f block32 = new ga9.f(vVar, i66);
            Intrinsics.checkNotNullParameter(block32, "block");
            viewControllerE114.H = block32;
            return viewControllerE114;
        }
        if (step instanceof OnboardingFlowContract$Step.DocumentKyc) {
            OnboardingFlowContract$Step.DocumentKyc documentKyc = (OnboardingFlowContract$Step.DocumentKyc) step;
            KycWrapperScreen kycWrapperScreen = new KycWrapperScreen(new KycWrapperScreenContract$InputData.DocumentKyc(documentKyc.f78335a, documentKyc.f78336b, documentKyc.f78337c, documentKyc.d, documentKyc.e));
            ga9.f block33 = new ga9.f(vVar, 19);
            Intrinsics.checkNotNullParameter(block33, "block");
            kycWrapperScreen.H = block33;
            return kycWrapperScreen;
        }
        if (!(step instanceof OnboardingFlowContract$Step.DocumentId)) {
            throw new NoWhenBranchMatchedException();
        }
        OnboardingFlowContract$Step.DocumentId documentId = (OnboardingFlowContract$Step.DocumentId) step;
        KycWrapperScreen kycWrapperScreen2 = new KycWrapperScreen(new KycWrapperScreenContract$InputData.DocumentId(documentId.f78334b, documentId.f78333a));
        ga9.f block34 = new ga9.f(vVar, i);
        Intrinsics.checkNotNullParameter(block34, "block");
        kycWrapperScreen2.H = block34;
        return kycWrapperScreen2;
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.b bVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.b) this.f141119b;
        EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData = bVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step step = (EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.PortabilityInstruction) {
            EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.PortabilityInstruction portabilityInstruction = (EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.PortabilityInstruction) step;
            String str = portabilityInstruction.f100739c;
            Pair pair = new Pair("phoneNumber", bVar.f100741p.a(portabilityInstruction.f100738b));
            EsimGiftRecipient esimGiftRecipient = esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100733g;
            BackendFlowInput.Source.Remote remote = new BackendFlowInput.Source.Remote(str, foh.i.q(pair, new Pair("receiverName", esimGiftRecipient != null ? esimGiftRecipient.d : null)));
            BackendFlowApiEndpoints.INSTANCE.getClass();
            return bVar.e1(new n90.a(new BackendFlowInput(remote, null, null, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f == hgj.c.DEFAULT ? BackendFlowNavigationIcon.BackArrow.f63285a : BackendFlowNavigationIcon.Cross.f63286a, false, BackendFlowApiEndpoints.Companion.a(str), 54)));
        }
        if (!(step instanceof EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.NumberTransferConfirmation)) {
            if (!(step instanceof EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.BusinessDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.BusinessDetails businessDetails = (EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.BusinessDetails) step;
            EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen = new EsimMobilePlanDynamicFormBusinessDetailsScreen(new EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData(esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100730a, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100731b, businessDetails.f100734a, businessDetails.f100735b));
            final int i = 0;
            Function1 block = new Function1() { // from class: ggj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            g result = (g) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f fVar = (f) result;
                            bVar.C2(new c(fVar.f289970a, fVar.f289971b));
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean zF = Intrinsics.f(result2, a.C0618a.f101278a);
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.b bVar2 = bVar;
                            if (zF) {
                                bVar2.C2(new a.C0611a(false));
                            } else if (result2 instanceof i) {
                                i iVar = (i) result2;
                                bVar2.C2(new c(iVar.f306825a, iVar.f306826b));
                            } else {
                                if (!(result2 instanceof h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h hVar = (h) result2;
                                oki.h.t2(bVar2, bVar2.f100744s, new EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.BusinessDetails(hVar.f306823a, hVar.f306824b), true, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            esimMobilePlanDynamicFormBusinessDetailsScreen.H = block;
            return esimMobilePlanDynamicFormBusinessDetailsScreen;
        }
        String str2 = esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100730a;
        String str3 = esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100731b;
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100732c;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.d;
        EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm = esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.e;
        EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen = new EsimMobilePlanDynamicFormNumberTransferConfirmationScreen(new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData(esimCheckoutPortingSteps, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100733g, esimPhoneNumberPortingDynamicForm, esimPhoneNumberPortingInstruction, esimPhoneNumberPortingDynamicForm.f100351b != null ? hgj.c.DEFAULT : esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f, str2, str3));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: ggj.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        g result = (g) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!(result instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f fVar = (f) result;
                        bVar.C2(new c(fVar.f289970a, fVar.f289971b));
                        return Unit.f186387a;
                    default:
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.a) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        boolean zF = Intrinsics.f(result2, a.C0618a.f101278a);
                        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.b bVar2 = bVar;
                        if (zF) {
                            bVar2.C2(new a.C0611a(false));
                        } else if (result2 instanceof i) {
                            i iVar = (i) result2;
                            bVar2.C2(new c(iVar.f306825a, iVar.f306826b));
                        } else {
                            if (!(result2 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h hVar = (h) result2;
                            oki.h.t2(bVar2, bVar2.f100744s, new EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.BusinessDetails(hVar.f306823a, hVar.f306824b), true, null, false, 12);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        esimMobilePlanDynamicFormNumberTransferConfirmationScreen.H = block2;
        return esimMobilePlanDynamicFormNumberTransferConfirmationScreen;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.junior_graduation.impl.ui.screen.identification.a aVar = (com.revolut.feature.junior_graduation.impl.ui.screen.identification.a) this.f141119b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        JuniorIdentificationScreenContract$ModalStep step = (JuniorIdentificationScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof JuniorIdentificationScreenContract$ModalStep.SignUpAsNewUser)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.f76944s.getClass();
        k9 value = k9.Junior;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_junior_user_identification_reject_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_junior_user_identification_reject_dialog_description, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_junior_user_identification_reject_dialog_sign_up, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_junior_user_identification_reject_dialog_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), new AnalyticsProduct.Retail(value), null, null, 24));
        gd3.i block = new gd3.i(aVar, 8);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) this.f141119b;
        y yVar = cVar.f94293t;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TravelMilesFlightFinderScreenContract$ModalStep step = (TravelMilesFlightFinderScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, TravelMilesFlightFinderScreenContract$ModalStep.OriginPicker.f94286a)) {
            TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen = new TravelMilesFlightLocationPickerScreen(new TravelMilesFlightLocationPickerScreenContract$InputData(lig.h.ORIGIN, ((ghg.g) ((j2) yVar.f22677a).getValue()).d));
            final int i = 2;
            Function1 block = new Function1() { // from class: ghg.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            ehg.e outputData = (ehg.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar2 = cVar;
                            cVar2.H2(cVar2.f94293t, new gd3.i(outputData, 9));
                            cVar2.J2(false);
                            return Unit.f186387a;
                        case 1:
                            ygg.c result = (ygg.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof ygg.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C2(a.C0574a.f94288a);
                            return Unit.f186387a;
                        case 2:
                            lig.k outputData2 = (lig.k) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar3 = cVar;
                            cVar3.H2(cVar3.f94293t, new o(cVar3, outputData2, 0));
                            cVar3.J2(false);
                            return Unit.f186387a;
                        default:
                            lig.k outputData3 = (lig.k) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar4 = cVar;
                            cVar4.H2(cVar4.f94293t, new o(cVar4, outputData3, 1));
                            cVar4.J2(false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            travelMilesFlightLocationPickerScreen.H = block;
            return travelMilesFlightLocationPickerScreen;
        }
        if (Intrinsics.f(step, TravelMilesFlightFinderScreenContract$ModalStep.DestinationPicker.f94285a)) {
            TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen2 = new TravelMilesFlightLocationPickerScreen(new TravelMilesFlightLocationPickerScreenContract$InputData(lig.h.DESTINATION, ((ghg.g) ((j2) yVar.f22677a).getValue()).e));
            final int i2 = 3;
            Function1 block2 = new Function1() { // from class: ghg.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            ehg.e outputData = (ehg.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar2 = cVar;
                            cVar2.H2(cVar2.f94293t, new gd3.i(outputData, 9));
                            cVar2.J2(false);
                            return Unit.f186387a;
                        case 1:
                            ygg.c result = (ygg.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof ygg.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C2(a.C0574a.f94288a);
                            return Unit.f186387a;
                        case 2:
                            lig.k outputData2 = (lig.k) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar3 = cVar;
                            cVar3.H2(cVar3.f94293t, new o(cVar3, outputData2, 0));
                            cVar3.J2(false);
                            return Unit.f186387a;
                        default:
                            lig.k outputData3 = (lig.k) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar4 = cVar;
                            cVar4.H2(cVar4.f94293t, new o(cVar4, outputData3, 1));
                            cVar4.J2(false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            travelMilesFlightLocationPickerScreen2.H = block2;
            return travelMilesFlightLocationPickerScreen2;
        }
        if (Intrinsics.f(step, TravelMilesFlightFinderScreenContract$ModalStep.DatePicker.f94284a)) {
            TravelMilesFlightDatePickerScreen travelMilesFlightDatePickerScreen = new TravelMilesFlightDatePickerScreen(new TravelMilesFlightDatePickerScreenContract$InputData(((ghg.g) ((j2) yVar.f22677a).getValue()).f143908a.a()));
            final int i3 = 0;
            Function1 block3 = new Function1() { // from class: ghg.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            ehg.e outputData = (ehg.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar2 = cVar;
                            cVar2.H2(cVar2.f94293t, new gd3.i(outputData, 9));
                            cVar2.J2(false);
                            return Unit.f186387a;
                        case 1:
                            ygg.c result = (ygg.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof ygg.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C2(a.C0574a.f94288a);
                            return Unit.f186387a;
                        case 2:
                            lig.k outputData2 = (lig.k) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar3 = cVar;
                            cVar3.H2(cVar3.f94293t, new o(cVar3, outputData2, 0));
                            cVar3.J2(false);
                            return Unit.f186387a;
                        default:
                            lig.k outputData3 = (lig.k) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar4 = cVar;
                            cVar4.H2(cVar4.f94293t, new o(cVar4, outputData3, 1));
                            cVar4.J2(false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            travelMilesFlightDatePickerScreen.H = block3;
            return travelMilesFlightDatePickerScreen;
        }
        if (!(step instanceof TravelMilesFlightFinderScreenContract$ModalStep.RedeemOptionBottomSheet)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelMilesRedeemOptionScreen travelMilesRedeemOptionScreen = new TravelMilesRedeemOptionScreen(new TravelMilesRedeemOptionScreenContract$InputData(((TravelMilesFlightFinderScreenContract$ModalStep.RedeemOptionBottomSheet) step).f94287a));
        final int i5 = 1;
        Function1 block4 = new Function1() { // from class: ghg.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i5) {
                    case 0:
                        ehg.e outputData = (ehg.e) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar2 = cVar;
                        cVar2.H2(cVar2.f94293t, new gd3.i(outputData, 9));
                        cVar2.J2(false);
                        return Unit.f186387a;
                    case 1:
                        ygg.c result = (ygg.c) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!(result instanceof ygg.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar.C2(a.C0574a.f94288a);
                        return Unit.f186387a;
                    case 2:
                        lig.k outputData2 = (lig.k) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar3 = cVar;
                        cVar3.H2(cVar3.f94293t, new o(cVar3, outputData2, 0));
                        cVar3.J2(false);
                        return Unit.f186387a;
                    default:
                        lig.k outputData3 = (lig.k) obj4;
                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                        com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar4 = cVar;
                        cVar4.H2(cVar4.f94293t, new o(cVar4, outputData3, 1));
                        cVar4.J2(false);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block4, "block");
        travelMilesRedeemOptionScreen.H = block4;
        return travelMilesRedeemOptionScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0280  */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 3256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g75.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
