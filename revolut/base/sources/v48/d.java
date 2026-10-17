package v48;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Parcelable;
import aw0.n6;
import com.google.android.gms.common.api.ResolvableApiException;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.common.api.factory.BiometricVerificationSelfieIntroScreenFactory$InputData;
import com.revolut.biometric_verification.common.impl.selfie.intro.BiometricVerificationSelfieIntroScreen;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.ConfirmationPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.country.BirthCountryScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.country.BirthCountryScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.MediaHeaderCreditPromptScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptController;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.LoanRepaymentAccountsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.LoanRepaymentAccountsFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardRootFlow;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreenContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.send.flow.DeFiSendFlowContract$Step;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.joint.impl.ui.creation_flow.JointAccountCreationFlowContract$Step;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlow;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$InputData;
import com.revolut.feature.kyc.api.common.KycConsentDescriptor;
import com.revolut.feature.onboarding.selfie.impl.intro.flow.OnboardingSelfieIntroFlowContract$Step;
import com.revolut.feature.passcode.PasscodeScreen;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode;
import com.revolut.feature.passcode_reminder.impl.ui.flow.PasscodeReminderFlowContract$Step;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.structured_note.details.impl.ui.common.PayoutScenarioMapper$CalculatorParcel;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsControllerContract$ModalStep;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$SearchParameters;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$InputData;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.additional_details.TravelHotelsAdditionalDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.additional_details.TravelHotelsAdditionalDetailsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities.TravelHotelsPropertyAmenitiesScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities.TravelHotelsPropertyAmenitiesScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreenContract$InputData;
import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreenContract$InputData;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.common.InfoDialogFactory$DialogConfig;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$ModalStep;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlowContract$Step;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreenContract$Input;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.flows.checkout.EsimCheckoutFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.checkout.EsimCheckoutFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.EsimMobilePlanCheckoutFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.EsimMobilePlanCheckoutFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.EsimMobilePlanNumberSelectionFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.EsimMobilePlanNumberSelectionFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.EsimPlanSelectionScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$State;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.FamilyPlanContactSelectionFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.FamilyPlanInvitationFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection.PlanSelectionFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.SelectFamilyPlanFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.SelectFamilyPlanFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$HigherThan$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$With$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plan.intro.FamilyPlanIntroScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.checkout.FamilyPlanCheckoutScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.FamilyPlanManagementScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dii.g;
import gkk.f;
import grl.k9;
import ht3.j0;
import ht3.l0;
import ht3.o;
import igk.a0;
import igk.b0;
import igk.c0;
import igk.d0;
import igk.y;
import igk.z;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import ko5.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kp0.w0;
import kz9.e;
import lfg.g0;
import lha.h;
import lo5.r;
import lo5.s;
import lo5.t;
import lo5.u;
import lo5.v;
import lo5.w;
import m1c.e0;
import nel.n;
import rv3.b;
import s74.m;
import s7a.x;
import uyh.k0;
import vch.x0;
import vdl.d1;
import vdl.j1;
import vdl.l1;
import vdl.z0;
import vkm.j2;
import vkm.q0;
import w4l.i;
import w4l.k;
import w56.j;
import yki.l;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285987b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f285986a = i;
        this.f285987b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) this.f285987b;
        final yki.b LazyFlowCoordinator = (yki.b) obj2;
        final FamilyPlanFlowContract$Step step = (FamilyPlanFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final int i = 0;
        if (Intrinsics.f(step, FamilyPlanFlowContract$Step.Intro.f102984a)) {
            FamilyPlanIntroScreen familyPlanIntroScreen = new FamilyPlanIntroScreen(new gkk.e());
            Function1 block = new Function1() { // from class: vgk.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            gkk.f it8 = (gkk.f) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (!Intrinsics.f(it8, f.a.f144415a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar2 = dVar;
                            dVar2.f103017x.Z2(new vd1.a(dVar2, LazyFlowCoordinator, 9));
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.a it9 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.a) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z = it9 instanceof mkk.g;
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar3 = dVar;
                            if (z) {
                                dVar3.n2(new com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.c(dVar3, ((mkk.g) it9).f206483a, true, null), new whi.b(6));
                            } else if (Intrinsics.f(it9, a.C0636a.f103410a)) {
                                oki.h.D2(dVar3.z);
                            } else {
                                if (!(it9 instanceof mkk.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(dVar3, LazyFlowCoordinator, new FamilyPlanFlowContract$Step.MoreForFamily(((mkk.h) it9).f206484a), true, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            familyPlanIntroScreen.H = block;
            return familyPlanIntroScreen;
        }
        final int i2 = 1;
        if (Intrinsics.f(step, FamilyPlanFlowContract$Step.SelectFamilyPlan.f102988a)) {
            SelectFamilyPlanFlow selectFamilyPlanFlow = new SelectFamilyPlanFlow(new SelectFamilyPlanFlowContract$InputData(dVar.o.f289188a));
            vgk.d block2 = new vgk.d(dVar, i2);
            Intrinsics.checkNotNullParameter(block2, "block");
            selectFamilyPlanFlow.H = block2;
            return selectFamilyPlanFlow;
        }
        int i3 = 2;
        if (step instanceof FamilyPlanFlowContract$Step.Checkout) {
            FamilyPlanCheckoutScreen familyPlanCheckoutScreen = new FamilyPlanCheckoutScreen();
            vgk.d block3 = new vgk.d(dVar, i3);
            Intrinsics.checkNotNullParameter(block3, "block");
            familyPlanCheckoutScreen.H = block3;
            return familyPlanCheckoutScreen;
        }
        if (step instanceof FamilyPlanFlowContract$Step.ContactPicker) {
            FamilyPlanContactSelectionFlow familyPlanContactSelectionFlow = new FamilyPlanContactSelectionFlow(new wgk.c(((FamilyPlanFlowContract$State) ((j2) dVar.f103018y.f22677a).getValue()).f102981a));
            Function1 block4 = new Function1() { // from class: vgk.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            d0 result = (d0) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof a0) {
                                a0 a0Var = (a0) result;
                                hha.d dVar2 = a0Var.f161232a;
                                hha.i iVar = a0Var.f161233b;
                                zm3.l lVar = ((FamilyPlanFlowContract$Step.UpgradeToInvite) step).f102989a;
                                dVar.L2(dVar2.f152287a, iVar, lVar);
                            } else {
                                if (!(result instanceof b0) && !(result instanceof c0) && !(result instanceof z) && !(result instanceof y)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(LazyFlowCoordinator);
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.a it8 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.a) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean z = it8 instanceof wgk.d;
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar3 = dVar;
                            if (z) {
                                dVar3.l2(new uvf.b(dVar3, ((FamilyPlanFlowContract$Step.ContactPicker) step).f102983a, ((wgk.d) it8).f297333a, (Continuation) null, 25), new yi5.b(26));
                            } else if (it8 instanceof wgk.e) {
                                wgk.e eVar = (wgk.e) it8;
                                oki.h.w2(LazyFlowCoordinator, new FamilyPlanFlowContract$Step.UpgradeToInvite(eVar.f297334a, eVar.f297335b), ModalDestination.Style.POPUP.f98311a);
                            } else {
                                if (!(it8 instanceof a.C0631a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TransitionAnimation.SLIDE_START_TO_END slide_start_to_end = TransitionAnimation.SLIDE_START_TO_END.f98396a;
                                yki.i iVar2 = dVar3.z;
                                oki.h.r2(iVar2);
                                oki.h.t2(dVar3, iVar2, FamilyPlanFlowContract$Step.PlanManagement.f102987a, false, slide_start_to_end, false, 8);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            familyPlanContactSelectionFlow.H = block4;
            return familyPlanContactSelectionFlow;
        }
        if (step instanceof FamilyPlanFlowContract$Step.PlanManagement) {
            FamilyPlanManagementScreen familyPlanManagementScreen = new FamilyPlanManagementScreen();
            Function1 block5 = new Function1() { // from class: vgk.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            gkk.f it8 = (gkk.f) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (!Intrinsics.f(it8, f.a.f144415a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar2 = dVar;
                            dVar2.f103017x.Z2(new vd1.a(dVar2, LazyFlowCoordinator, 9));
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.a it9 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.a) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z = it9 instanceof mkk.g;
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar3 = dVar;
                            if (z) {
                                dVar3.n2(new com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.c(dVar3, ((mkk.g) it9).f206483a, true, null), new whi.b(6));
                            } else if (Intrinsics.f(it9, a.C0636a.f103410a)) {
                                oki.h.D2(dVar3.z);
                            } else {
                                if (!(it9 instanceof mkk.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(dVar3, LazyFlowCoordinator, new FamilyPlanFlowContract$Step.MoreForFamily(((mkk.h) it9).f206484a), true, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            familyPlanManagementScreen.H = block5;
            return familyPlanManagementScreen;
        }
        if (step instanceof FamilyPlanFlowContract$Step.MoreForFamily) {
            return new MoreForFamilyScreen(new MoreForFamilyScreenContract$InputData(((FamilyPlanFlowContract$Step.MoreForFamily) step).f102986a));
        }
        if (step instanceof FamilyPlanFlowContract$Step.Invitation) {
            h hVar = ((FamilyPlanFlowContract$Step.Invitation) step).f102985a;
            return new FamilyPlanInvitationFlow(new zgk.d(hVar.f195208a, hVar.f195209b));
        }
        if (!(step instanceof FamilyPlanFlowContract$Step.UpgradeToInvite)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanFilter.Companion companion = PlanFilter.INSTANCE;
        hha.d dVar2 = ((FamilyPlanFlowContract$Step.UpgradeToInvite) step).f102990b;
        PlanFilter[] planFilterArr = {new PlanFilter$HigherThan$Id(dVar2.f152287a), new PlanFilter$With$Id(dVar2.f152287a)};
        companion.getClass();
        PlanSelectionFlow planSelectionFlow = new PlanSelectionFlow(new nik.c(PlanFilter.Companion.a(planFilterArr), PlanSelection.Default.f103355a, xfa.b.FAMILY_PLANS_UPGRADE_TO_INVITE, new nik.d(7, null), null));
        Function1 block6 = new Function1() { // from class: vgk.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i) {
                    case 0:
                        d0 result = (d0) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof a0) {
                            a0 a0Var = (a0) result;
                            hha.d dVar22 = a0Var.f161232a;
                            hha.i iVar = a0Var.f161233b;
                            zm3.l lVar = ((FamilyPlanFlowContract$Step.UpgradeToInvite) step).f102989a;
                            dVar.L2(dVar22.f152287a, iVar, lVar);
                        } else {
                            if (!(result instanceof b0) && !(result instanceof c0) && !(result instanceof z) && !(result instanceof y)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(LazyFlowCoordinator);
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.a it8 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.a) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        boolean z = it8 instanceof wgk.d;
                        com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar3 = dVar;
                        if (z) {
                            dVar3.l2(new uvf.b(dVar3, ((FamilyPlanFlowContract$Step.ContactPicker) step).f102983a, ((wgk.d) it8).f297333a, (Continuation) null, 25), new yi5.b(26));
                        } else if (it8 instanceof wgk.e) {
                            wgk.e eVar = (wgk.e) it8;
                            oki.h.w2(LazyFlowCoordinator, new FamilyPlanFlowContract$Step.UpgradeToInvite(eVar.f297334a, eVar.f297335b), ModalDestination.Style.POPUP.f98311a);
                        } else {
                            if (!(it8 instanceof a.C0631a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            TransitionAnimation.SLIDE_START_TO_END slide_start_to_end = TransitionAnimation.SLIDE_START_TO_END.f98396a;
                            yki.i iVar2 = dVar3.z;
                            oki.h.r2(iVar2);
                            oki.h.t2(dVar3, iVar2, FamilyPlanFlowContract$Step.PlanManagement.f102987a, false, slide_start_to_end, false, 8);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block6, "block");
        planSelectionFlow.H = block6;
        return planSelectionFlow;
    }

    /* JADX WARN: Type inference failed for: r3v116, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v78, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws IntentSender.SendIntentException {
        Object next;
        ViewController esimMobilePlanNumberSelectionFlow;
        int i = this.f285986a;
        k loadingStrategy = w4l.h.f294642c;
        i iVar = i.f294643c;
        final int i2 = 1;
        Object obj4 = this.f285987b;
        switch (i) {
            case 0:
                com.revolut.feature.joint.impl.ui.creation_flow.b bVar = (com.revolut.feature.joint.impl.ui.creation_flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                JointAccountCreationFlowContract$Step step = (JointAccountCreationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof JointAccountCreationFlowContract$Step.Creation) {
                    return new InviteFlow(new InviteFlowContract$InputData(((JointAccountCreationFlowContract$Step.Creation) step).f76528a, true));
                }
                if (!(step instanceof JointAccountCreationFlowContract$Step.Prompt)) {
                    if (!(step instanceof JointAccountCreationFlowContract$Step.PendingJointAccount)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActionsBottomSheetController actionsBottomSheetControllerA = bVar.f76536t.a(h38.d.JOINT_SUBACCOUNT);
                    actionsBottomSheetControllerA.l2(new dld.c(bVar, LazyFlowCoordinator, 11));
                    return actionsBottomSheetControllerA;
                }
                JointAccountCreationFlowContract$Step.Prompt prompt = (JointAccountCreationFlowContract$Step.Prompt) step;
                PromptContentDelegate.Model model = new PromptContentDelegate.Model("joint_prompt_id", prompt.f76530a, prompt.f76531b, null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536870344);
                k9 value = k9.JointAccounts;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(new d67.f(model, new AnalyticsProduct.Retail(value), null, true));
                dph.c block = new dph.c(bVar, LazyFlowCoordinator, 23);
                Intrinsics.checkNotNullParameter(block, "block");
                fullScreenPromptScreen.H = block;
                return fullScreenPromptScreen;
            case 1:
                com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.b bVar2 = (com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditQualityScreenContract$ModalStep step2 = (CreditQualityScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof CreditQualityScreenContract$ModalStep.InfoDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                u4h.c cVar = bVar2.o;
                InfoDialogFactory$DialogConfig config = ((CreditQualityScreenContract$ModalStep.InfoDialog) step2).f95428a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                lw0.a aVar = new lw0.a(config.f95425a, config.f95426b, null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 2:
                final com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a) obj4;
                phm.a aVar3 = aVar2.f67175s;
                BirthPlaceRootFlowContract$InputData birthPlaceRootFlowContract$InputData = aVar2.f67172p;
                qki.d dVar = aVar2.f67176t;
                l FlowCoordinator = (l) obj2;
                BirthPlaceRootFlowContract$Step step3 = (BirthPlaceRootFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof BirthPlaceRootFlowContract$Step.ChooseCountry) {
                    BirthCountryScreen birthCountryScreen = new BirthCountryScreen(new BirthCountryScreenContract$InputData(((BirthPlaceRootFlowContract$State) ((j2) dVar.f22677a).getValue()).f67165a));
                    final int i3 = 4;
                    Function1 function1 = new Function1() { // from class: v54.d
                        /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 398
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: v54.d.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    birthCountryScreen.H = function1;
                    return birthCountryScreen;
                }
                if (step3 instanceof BirthPlaceRootFlowContract$Step.ChooseCity) {
                    BirthCityScreen birthCityScreen = new BirthCityScreen(new BirthCityScreenContract$InputData(((BirthPlaceRootFlowContract$State) ((j2) dVar.f22677a).getValue()).f67165a, ((BirthPlaceRootFlowContract$State) ((j2) dVar.f22677a).getValue()).f67166b));
                    final int i5 = 0;
                    Function1 function12 = new Function1() { // from class: v54.d
                        /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 398
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: v54.d.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(function12, "<set-?>");
                    birthCityScreen.H = function12;
                    return birthCityScreen;
                }
                if (step3 instanceof BirthPlaceRootFlowContract$Step.InitialCityPicker) {
                    x xVar = new x(new TextLocalisedClause(R$string.birth_place_city_title, null, null, 14), w0.F(birthPlaceRootFlowContract$InputData.f67164a), new TextLocalisedClause(R$string.birth_place_country_subtitle, null, null, 14), null, false, null, new TextLocalisedClause(R$string.birth_place_city_search_hint, null, null, 14), new TextLocalisedClause(R$string.birth_place_provide_city_search_content_description, null, null, 14), null, false, null, null, null, null, false, null, null, null, null, null, 2147465716);
                    Object obj5 = aVar3.get();
                    Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                    PickerController pickerController = new PickerController(xVar, (x7a.d) obj5);
                    final int i6 = 2;
                    Function1 block2 = new Function1() { // from class: v54.d
                        /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 398
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: v54.d.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    pickerController.H = block2;
                    return pickerController;
                }
                if (step3 instanceof BirthPlaceRootFlowContract$Step.CountryPicker) {
                    x xVar2 = new x(null, null, null, null, false, null, new TextLocalisedClause(R$string.birth_place_country_search_hint, null, null, 14), new TextLocalisedClause(R$string.birth_place_country_search_content_description, null, null, 14), null, false, null, ((BirthPlaceRootFlowContract$Step.CountryPicker) step3).f67170a.f297794a, null, null, true, null, null, null, null, null, 1870526974);
                    Object obj6 = aVar2.f67174r.get();
                    Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                    PickerController pickerController2 = new PickerController(xVar2, (x7a.d) obj6);
                    Function1 block3 = new Function1() { // from class: v54.d
                        /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 398
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: v54.d.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    pickerController2.H = block3;
                    return pickerController2;
                }
                if (!(step3 instanceof BirthPlaceRootFlowContract$Step.CityPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                x xVar3 = new x(null, w0.F(birthPlaceRootFlowContract$InputData.f67164a), null, null, false, null, new TextLocalisedClause(R$string.birth_place_city_search_hint, null, null, 14), new TextLocalisedClause(R$string.birth_place_provide_city_search_content_description, null, null, 14), null, false, null, ((BirthPlaceRootFlowContract$Step.CityPicker) step3).f67169a, null, null, true, null, null, null, null, null, 1870510588);
                Object obj7 = aVar3.get();
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                PickerController pickerController3 = new PickerController(xVar3, (x7a.d) obj7);
                final int i21 = 3;
                Function1 block4 = new Function1() { // from class: v54.d
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r9) {
                        /*
                            Method dump skipped, instruction units count: 398
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: v54.d.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                pickerController3.H = block4;
                return pickerController3;
            case 3:
                final com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar4 = (com.revolut.feature.defi.remittances.impl.ui.send.flow.a) obj4;
                l FlowCoordinator2 = (l) obj2;
                DeFiSendFlowContract$Step step4 = (DeFiSendFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (Intrinsics.f(step4, DeFiSendFlowContract$Step.WalletList.f71849a)) {
                    ViewController viewControllerE1 = aVar4.e1(new s(y0.b(p.WALLET), r.DEFI));
                    final int i22 = 2;
                    Function1 block5 = new Function1() { // from class: v56.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            CryptoAddress cryptoAddress;
                            CryptoAddress cryptoAddress2;
                            String str;
                            int i32 = i22;
                            com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar5 = aVar4;
                            switch (i32) {
                                case 0:
                                    yki.a aVar6 = aVar5.f71850p;
                                    j output = (j) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof w56.h) {
                                        i56.i iVar2 = ((w56.h) output).f294704a;
                                        if (iVar2 != null) {
                                            oki.h.w2(aVar6, new DeFiSendFlowContract$Step.TransactionDetails(new k71.d(iVar2.f158776a, iVar2.f158777b)), ModalDestination.Style.POPUP.f98311a);
                                        } else {
                                            oki.h.D2(aVar6);
                                        }
                                    } else {
                                        if (!(output instanceof w56.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar5.J2(((w56.i) output).f294705a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    lo5.j output2 = (lo5.j) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, lo5.h.f197400a)) {
                                        yki.a aVar7 = aVar5.f71850p;
                                        oki.h.E2(aVar7, new v2g.i(27));
                                        aVar7.e(false);
                                    } else {
                                        if (!(output2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", "Unexpected SubmitRecipientDetails output in DeFi send flow", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    lo5.c0 output3 = (lo5.c0) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z = output3 instanceof t;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar8 = aVar4;
                                    if (z) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.AddBeneficiary(((t) output3).f197412a), false, null, false, 14);
                                    } else if (output3 instanceof lo5.x) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(((lo5.x) output3).f197417a, (jz9.a) null, 6)), true, null, false, 12);
                                    } else if (output3 instanceof lo5.y) {
                                        aVar8.J2(((lo5.y) output3).f197418a);
                                    } else if (output3 instanceof lo5.z) {
                                        aVar8.I2(((lo5.z) output3).f197419a, true);
                                    } else if (output3 instanceof lo5.b0) {
                                        aVar8.I2(((lo5.b0) output3).f197395a, false);
                                    } else {
                                        if (!Intrinsics.f(output3, u.f197413a) && !(output3 instanceof v) && !(output3 instanceof w) && !(output3 instanceof lo5.a0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", j6.a.q("Unexpected output in DeFi send flow: ", o0.f186429a.b(output3.getClass()).m()), null, h0Var2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    q56.l output4 = (q56.l) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CryptoAddress cryptoAddress3 = output4.f242306a;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar9 = aVar4;
                                    oki.h.t2(aVar9, aVar9.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(cryptoAddress3, (jz9.a) null, 6)), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    e output5 = (e) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (output5 instanceof kz9.c) {
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK2 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.c) output5).f191076a);
                                        if (cryptoAddressRecipientK2 != null && (cryptoAddress2 = cryptoAddressRecipientK2.f79721a) != null && (str = cryptoAddress2.f71059a) != null) {
                                            aVar5.J2(str);
                                        }
                                    } else {
                                        if (!(output5 instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK22 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.d) output5).f191077a);
                                        if (cryptoAddressRecipientK22 != null && (cryptoAddress = cryptoAddressRecipientK22.f79721a) != null) {
                                            aVar5.I2(cryptoAddress, false);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                if (step4 instanceof DeFiSendFlowContract$Step.Chat) {
                    ViewController viewControllerE12 = aVar4.e1(new kz9.b(((DeFiSendFlowContract$Step.Chat) step4).f71844a));
                    final int i32 = 4;
                    Function1 block6 = new Function1() { // from class: v56.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            CryptoAddress cryptoAddress;
                            CryptoAddress cryptoAddress2;
                            String str;
                            int i322 = i32;
                            com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar5 = aVar4;
                            switch (i322) {
                                case 0:
                                    yki.a aVar6 = aVar5.f71850p;
                                    j output = (j) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof w56.h) {
                                        i56.i iVar2 = ((w56.h) output).f294704a;
                                        if (iVar2 != null) {
                                            oki.h.w2(aVar6, new DeFiSendFlowContract$Step.TransactionDetails(new k71.d(iVar2.f158776a, iVar2.f158777b)), ModalDestination.Style.POPUP.f98311a);
                                        } else {
                                            oki.h.D2(aVar6);
                                        }
                                    } else {
                                        if (!(output instanceof w56.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar5.J2(((w56.i) output).f294705a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    lo5.j output2 = (lo5.j) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, lo5.h.f197400a)) {
                                        yki.a aVar7 = aVar5.f71850p;
                                        oki.h.E2(aVar7, new v2g.i(27));
                                        aVar7.e(false);
                                    } else {
                                        if (!(output2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", "Unexpected SubmitRecipientDetails output in DeFi send flow", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    lo5.c0 output3 = (lo5.c0) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z = output3 instanceof t;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar8 = aVar4;
                                    if (z) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.AddBeneficiary(((t) output3).f197412a), false, null, false, 14);
                                    } else if (output3 instanceof lo5.x) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(((lo5.x) output3).f197417a, (jz9.a) null, 6)), true, null, false, 12);
                                    } else if (output3 instanceof lo5.y) {
                                        aVar8.J2(((lo5.y) output3).f197418a);
                                    } else if (output3 instanceof lo5.z) {
                                        aVar8.I2(((lo5.z) output3).f197419a, true);
                                    } else if (output3 instanceof lo5.b0) {
                                        aVar8.I2(((lo5.b0) output3).f197395a, false);
                                    } else {
                                        if (!Intrinsics.f(output3, u.f197413a) && !(output3 instanceof v) && !(output3 instanceof w) && !(output3 instanceof lo5.a0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", j6.a.q("Unexpected output in DeFi send flow: ", o0.f186429a.b(output3.getClass()).m()), null, h0Var2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    q56.l output4 = (q56.l) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CryptoAddress cryptoAddress3 = output4.f242306a;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar9 = aVar4;
                                    oki.h.t2(aVar9, aVar9.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(cryptoAddress3, (jz9.a) null, 6)), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    e output5 = (e) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (output5 instanceof kz9.c) {
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK2 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.c) output5).f191076a);
                                        if (cryptoAddressRecipientK2 != null && (cryptoAddress2 = cryptoAddressRecipientK2.f79721a) != null && (str = cryptoAddress2.f71059a) != null) {
                                            aVar5.J2(str);
                                        }
                                    } else {
                                        if (!(output5 instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK22 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.d) output5).f191077a);
                                        if (cryptoAddressRecipientK22 != null && (cryptoAddress = cryptoAddressRecipientK22.f79721a) != null) {
                                            aVar5.I2(cryptoAddress, false);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE12.H = block6;
                    return viewControllerE12;
                }
                if (step4 instanceof DeFiSendFlowContract$Step.AmountInput) {
                    DeFiSendFlowContract$Step.AmountInput amountInput = (DeFiSendFlowContract$Step.AmountInput) step4;
                    DeFiSendAmountScreen deFiSendAmountScreen = new DeFiSendAmountScreen(new DeFiSendAmountScreenContract$InputData(aVar4.o.f71840a, amountInput.f71842a, amountInput.f71843b));
                    k0 block7 = new k0(aVar4, amountInput, 24);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    deFiSendAmountScreen.H = block7;
                    return deFiSendAmountScreen;
                }
                if (step4 instanceof DeFiSendFlowContract$Step.Review) {
                    DeFiSendFlowContract$Step.Review review = (DeFiSendFlowContract$Step.Review) step4;
                    DeFiSendReviewScreen deFiSendReviewScreen = new DeFiSendReviewScreen(new DeFiSendReviewScreenContract$InputData(review.f71845a, review.f71846b));
                    final int i33 = 0;
                    Function1 block8 = new Function1() { // from class: v56.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            CryptoAddress cryptoAddress;
                            CryptoAddress cryptoAddress2;
                            String str;
                            int i322 = i33;
                            com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar5 = aVar4;
                            switch (i322) {
                                case 0:
                                    yki.a aVar6 = aVar5.f71850p;
                                    j output = (j) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof w56.h) {
                                        i56.i iVar2 = ((w56.h) output).f294704a;
                                        if (iVar2 != null) {
                                            oki.h.w2(aVar6, new DeFiSendFlowContract$Step.TransactionDetails(new k71.d(iVar2.f158776a, iVar2.f158777b)), ModalDestination.Style.POPUP.f98311a);
                                        } else {
                                            oki.h.D2(aVar6);
                                        }
                                    } else {
                                        if (!(output instanceof w56.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar5.J2(((w56.i) output).f294705a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    lo5.j output2 = (lo5.j) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, lo5.h.f197400a)) {
                                        yki.a aVar7 = aVar5.f71850p;
                                        oki.h.E2(aVar7, new v2g.i(27));
                                        aVar7.e(false);
                                    } else {
                                        if (!(output2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", "Unexpected SubmitRecipientDetails output in DeFi send flow", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    lo5.c0 output3 = (lo5.c0) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z = output3 instanceof t;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar8 = aVar4;
                                    if (z) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.AddBeneficiary(((t) output3).f197412a), false, null, false, 14);
                                    } else if (output3 instanceof lo5.x) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(((lo5.x) output3).f197417a, (jz9.a) null, 6)), true, null, false, 12);
                                    } else if (output3 instanceof lo5.y) {
                                        aVar8.J2(((lo5.y) output3).f197418a);
                                    } else if (output3 instanceof lo5.z) {
                                        aVar8.I2(((lo5.z) output3).f197419a, true);
                                    } else if (output3 instanceof lo5.b0) {
                                        aVar8.I2(((lo5.b0) output3).f197395a, false);
                                    } else {
                                        if (!Intrinsics.f(output3, u.f197413a) && !(output3 instanceof v) && !(output3 instanceof w) && !(output3 instanceof lo5.a0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", j6.a.q("Unexpected output in DeFi send flow: ", o0.f186429a.b(output3.getClass()).m()), null, h0Var2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    q56.l output4 = (q56.l) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CryptoAddress cryptoAddress3 = output4.f242306a;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar9 = aVar4;
                                    oki.h.t2(aVar9, aVar9.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(cryptoAddress3, (jz9.a) null, 6)), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    e output5 = (e) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (output5 instanceof kz9.c) {
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK2 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.c) output5).f191076a);
                                        if (cryptoAddressRecipientK2 != null && (cryptoAddress2 = cryptoAddressRecipientK2.f79721a) != null && (str = cryptoAddress2.f71059a) != null) {
                                            aVar5.J2(str);
                                        }
                                    } else {
                                        if (!(output5 instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK22 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.d) output5).f191077a);
                                        if (cryptoAddressRecipientK22 != null && (cryptoAddress = cryptoAddressRecipientK22.f79721a) != null) {
                                            aVar5.I2(cryptoAddress, false);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    deFiSendReviewScreen.H = block8;
                    return deFiSendReviewScreen;
                }
                if (step4 instanceof DeFiSendFlowContract$Step.AddBeneficiary) {
                    DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen = new DeFiSendAddBeneficiaryScreen(new DeFiSendAddBeneficiaryScreenContract$InputData(((DeFiSendFlowContract$Step.AddBeneficiary) step4).f71841a));
                    final int i43 = 3;
                    Function1 block9 = new Function1() { // from class: v56.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            CryptoAddress cryptoAddress;
                            CryptoAddress cryptoAddress2;
                            String str;
                            int i322 = i43;
                            com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar5 = aVar4;
                            switch (i322) {
                                case 0:
                                    yki.a aVar6 = aVar5.f71850p;
                                    j output = (j) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof w56.h) {
                                        i56.i iVar2 = ((w56.h) output).f294704a;
                                        if (iVar2 != null) {
                                            oki.h.w2(aVar6, new DeFiSendFlowContract$Step.TransactionDetails(new k71.d(iVar2.f158776a, iVar2.f158777b)), ModalDestination.Style.POPUP.f98311a);
                                        } else {
                                            oki.h.D2(aVar6);
                                        }
                                    } else {
                                        if (!(output instanceof w56.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar5.J2(((w56.i) output).f294705a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    lo5.j output2 = (lo5.j) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, lo5.h.f197400a)) {
                                        yki.a aVar7 = aVar5.f71850p;
                                        oki.h.E2(aVar7, new v2g.i(27));
                                        aVar7.e(false);
                                    } else {
                                        if (!(output2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", "Unexpected SubmitRecipientDetails output in DeFi send flow", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    lo5.c0 output3 = (lo5.c0) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z = output3 instanceof t;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar8 = aVar4;
                                    if (z) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.AddBeneficiary(((t) output3).f197412a), false, null, false, 14);
                                    } else if (output3 instanceof lo5.x) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(((lo5.x) output3).f197417a, (jz9.a) null, 6)), true, null, false, 12);
                                    } else if (output3 instanceof lo5.y) {
                                        aVar8.J2(((lo5.y) output3).f197418a);
                                    } else if (output3 instanceof lo5.z) {
                                        aVar8.I2(((lo5.z) output3).f197419a, true);
                                    } else if (output3 instanceof lo5.b0) {
                                        aVar8.I2(((lo5.b0) output3).f197395a, false);
                                    } else {
                                        if (!Intrinsics.f(output3, u.f197413a) && !(output3 instanceof v) && !(output3 instanceof w) && !(output3 instanceof lo5.a0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", j6.a.q("Unexpected output in DeFi send flow: ", o0.f186429a.b(output3.getClass()).m()), null, h0Var2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    q56.l output4 = (q56.l) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CryptoAddress cryptoAddress3 = output4.f242306a;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar9 = aVar4;
                                    oki.h.t2(aVar9, aVar9.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(cryptoAddress3, (jz9.a) null, 6)), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    e output5 = (e) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (output5 instanceof kz9.c) {
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK2 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.c) output5).f191076a);
                                        if (cryptoAddressRecipientK2 != null && (cryptoAddress2 = cryptoAddressRecipientK2.f79721a) != null && (str = cryptoAddress2.f71059a) != null) {
                                            aVar5.J2(str);
                                        }
                                    } else {
                                        if (!(output5 instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK22 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.d) output5).f191077a);
                                        if (cryptoAddressRecipientK22 != null && (cryptoAddress = cryptoAddressRecipientK22.f79721a) != null) {
                                            aVar5.I2(cryptoAddress, false);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    deFiSendAddBeneficiaryScreen.H = block9;
                    return deFiSendAddBeneficiaryScreen;
                }
                if (step4 instanceof DeFiSendFlowContract$Step.WalletDetails) {
                    ViewController viewControllerE13 = aVar4.e1(new lo5.f(new CryptoBeneficiaryDetailsScreenContract$InputData(((DeFiSendFlowContract$Step.WalletDetails) step4).f71848a, lo5.g.DEFI)));
                    Function1 block10 = new Function1() { // from class: v56.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            CryptoAddress cryptoAddress;
                            CryptoAddress cryptoAddress2;
                            String str;
                            int i322 = i2;
                            com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar5 = aVar4;
                            switch (i322) {
                                case 0:
                                    yki.a aVar6 = aVar5.f71850p;
                                    j output = (j) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof w56.h) {
                                        i56.i iVar2 = ((w56.h) output).f294704a;
                                        if (iVar2 != null) {
                                            oki.h.w2(aVar6, new DeFiSendFlowContract$Step.TransactionDetails(new k71.d(iVar2.f158776a, iVar2.f158777b)), ModalDestination.Style.POPUP.f98311a);
                                        } else {
                                            oki.h.D2(aVar6);
                                        }
                                    } else {
                                        if (!(output instanceof w56.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar5.J2(((w56.i) output).f294705a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    lo5.j output2 = (lo5.j) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, lo5.h.f197400a)) {
                                        yki.a aVar7 = aVar5.f71850p;
                                        oki.h.E2(aVar7, new v2g.i(27));
                                        aVar7.e(false);
                                    } else {
                                        if (!(output2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", "Unexpected SubmitRecipientDetails output in DeFi send flow", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    lo5.c0 output3 = (lo5.c0) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z = output3 instanceof t;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar8 = aVar4;
                                    if (z) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.AddBeneficiary(((t) output3).f197412a), false, null, false, 14);
                                    } else if (output3 instanceof lo5.x) {
                                        oki.h.t2(aVar8, aVar8.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(((lo5.x) output3).f197417a, (jz9.a) null, 6)), true, null, false, 12);
                                    } else if (output3 instanceof lo5.y) {
                                        aVar8.J2(((lo5.y) output3).f197418a);
                                    } else if (output3 instanceof lo5.z) {
                                        aVar8.I2(((lo5.z) output3).f197419a, true);
                                    } else if (output3 instanceof lo5.b0) {
                                        aVar8.I2(((lo5.b0) output3).f197395a, false);
                                    } else {
                                        if (!Intrinsics.f(output3, u.f197413a) && !(output3 instanceof v) && !(output3 instanceof w) && !(output3 instanceof lo5.a0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "DeFiSendFlowModel", j6.a.q("Unexpected output in DeFi send flow: ", o0.f186429a.b(output3.getClass()).m()), null, h0Var2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    q56.l output4 = (q56.l) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    CryptoAddress cryptoAddress3 = output4.f242306a;
                                    com.revolut.feature.defi.remittances.impl.ui.send.flow.a aVar9 = aVar4;
                                    oki.h.t2(aVar9, aVar9.f71850p, new DeFiSendFlowContract$Step.Chat(new ChatTransferRecipient.CryptoAddressRecipient(cryptoAddress3, (jz9.a) null, 6)), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    e output5 = (e) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (output5 instanceof kz9.c) {
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK2 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.c) output5).f191076a);
                                        if (cryptoAddressRecipientK2 != null && (cryptoAddress2 = cryptoAddressRecipientK2.f79721a) != null && (str = cryptoAddress2.f71059a) != null) {
                                            aVar5.J2(str);
                                        }
                                    } else {
                                        if (!(output5 instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipientK22 = com.revolut.feature.defi.remittances.impl.ui.send.flow.a.K2(((kz9.d) output5).f191077a);
                                        if (cryptoAddressRecipientK22 != null && (cryptoAddress = cryptoAddressRecipientK22.f79721a) != null) {
                                            aVar5.I2(cryptoAddress, false);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    viewControllerE13.H = block10;
                    return viewControllerE13;
                }
                if (!(step4 instanceof DeFiSendFlowContract$Step.TransactionDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE14 = aVar4.e1(new rhf.f(((DeFiSendFlowContract$Step.TransactionDetails) step4).f71847a, rhf.d.CRYPTO));
                viewControllerE14.k2(new ur2.a(aVar4, 19));
                return viewControllerE14;
            case 4:
                com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.a aVar5 = (com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PerformanceTrackerTermsControllerContract$ModalStep step5 = (PerformanceTrackerTermsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof PerformanceTrackerTermsControllerContract$ModalStep.PayoutCalculator)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = aVar5.o.f88907a;
                PayoutScenarioMapper$CalculatorParcel payoutScenarioMapper$CalculatorParcel = ((PerformanceTrackerTermsControllerContract$ModalStep.PayoutCalculator) step5).f88908a;
                return new PayoutCalculatorScreen(new PayoutCalculatorScreenContract$InputData(str, payoutScenarioMapper$CalculatorParcel.f88862a, payoutScenarioMapper$CalculatorParcel.f88863b, payoutScenarioMapper$CalculatorParcel.f88864c, payoutScenarioMapper$CalculatorParcel.d));
            case 5:
                final com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar6 = (com.revolut.feature.travel.flights.impl.ui.screen.discover.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelFlightsDiscoverScreenContract$ModalStep step6 = (TravelFlightsDiscoverScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof TravelFlightsDiscoverScreenContract$ModalStep.DatesSelection) {
                    TravelFlightsDiscoverScreenContract$ModalStep.DatesSelection datesSelection = (TravelFlightsDiscoverScreenContract$ModalStep.DatesSelection) step6;
                    TravelFlightsDatesSelectionScreen travelFlightsDatesSelectionScreen = new TravelFlightsDatesSelectionScreen(new TravelFlightsDatesSelectionScreenContract$InputData(datesSelection.f93326a, datesSelection.f93327b));
                    final int i59 = 0;
                    Function1 block11 = new Function1() { // from class: v5g.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i66 = i59;
                            com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar7 = aVar6;
                            switch (i66) {
                                case 0:
                                    h4g.i iVar2 = aVar7.f93335p;
                                    cli.y yVar = aVar7.f93336q;
                                    t5g.e output = (t5g.e) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output.f268108a;
                                    if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                        TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                                        Intrinsics.checkNotNullParameter(updateSearchParameters, "$this$updateSearchParameters");
                                        TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                        aVar7.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA, 0));
                                        FlightSearchQuery flightSearchQueryE = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA);
                                        if (flightSearchQueryE != null) {
                                            iVar2.a(flightSearchQueryE);
                                        }
                                    } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                        TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters2 = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                                        Intrinsics.checkNotNullParameter(updateSearchParameters2, "$this$updateSearchParameters");
                                        TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                        TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA2 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters2, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                        aVar7.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA2, 0));
                                        FlightSearchQuery flightSearchQueryE2 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA2);
                                        if (flightSearchQueryE2 != null) {
                                            iVar2.a(flightSearchQueryE2);
                                        }
                                    } else {
                                        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i74 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    r6g.i output2 = (r6g.i) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    cli.y yVar2 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters3 = ((d) ((j2) yVar2.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters3, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA3 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters3, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                    aVar7.H2(yVar2, new i(travelFlightsDiscoverScreenContract$SearchParametersA3, 0));
                                    FlightSearchQuery flightSearchQueryE3 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA3);
                                    if (flightSearchQueryE3 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE3);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    i6g.g output3 = (i6g.g) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    cli.y yVar3 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters4 = ((d) ((j2) yVar3.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters4, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA4 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters4, uc0.b.E(output3.f158997a), null, null, null, null, null, 62);
                                    aVar7.H2(yVar3, new i(travelFlightsDiscoverScreenContract$SearchParametersA4, 0));
                                    FlightSearchQuery flightSearchQueryE4 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA4);
                                    if (flightSearchQueryE4 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE4);
                                    }
                                    return Unit.f186387a;
                                default:
                                    i6g.g output4 = (i6g.g) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    cli.y yVar4 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters5 = ((d) ((j2) yVar4.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters5, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA5 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters5, null, uc0.b.E(output4.f158997a), null, null, null, null, 61);
                                    aVar7.H2(yVar4, new i(travelFlightsDiscoverScreenContract$SearchParametersA5, 0));
                                    FlightSearchQuery flightSearchQueryE5 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA5);
                                    if (flightSearchQueryE5 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE5);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    travelFlightsDatesSelectionScreen.H = block11;
                    return travelFlightsDatesSelectionScreen;
                }
                if (step6 instanceof TravelFlightsDiscoverScreenContract$ModalStep.PassengersSelection) {
                    TravelFlightsDiscoverScreenContract$ModalStep.PassengersSelection passengersSelection = (TravelFlightsDiscoverScreenContract$ModalStep.PassengersSelection) step6;
                    TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen = new TravelFlightsPassengersPickerScreen(new TravelFlightsPassengersPickerScreenContract$InputData(passengersSelection.f93330a, passengersSelection.f93331b));
                    Function1 block12 = new Function1() { // from class: v5g.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i66 = i2;
                            com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar7 = aVar6;
                            switch (i66) {
                                case 0:
                                    h4g.i iVar2 = aVar7.f93335p;
                                    cli.y yVar = aVar7.f93336q;
                                    t5g.e output = (t5g.e) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output.f268108a;
                                    if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                        TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                                        Intrinsics.checkNotNullParameter(updateSearchParameters, "$this$updateSearchParameters");
                                        TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                        aVar7.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA, 0));
                                        FlightSearchQuery flightSearchQueryE = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA);
                                        if (flightSearchQueryE != null) {
                                            iVar2.a(flightSearchQueryE);
                                        }
                                    } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                        TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters2 = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                                        Intrinsics.checkNotNullParameter(updateSearchParameters2, "$this$updateSearchParameters");
                                        TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                        TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA2 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters2, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                        aVar7.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA2, 0));
                                        FlightSearchQuery flightSearchQueryE2 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA2);
                                        if (flightSearchQueryE2 != null) {
                                            iVar2.a(flightSearchQueryE2);
                                        }
                                    } else {
                                        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i74 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    r6g.i output2 = (r6g.i) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    cli.y yVar2 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters3 = ((d) ((j2) yVar2.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters3, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA3 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters3, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                    aVar7.H2(yVar2, new i(travelFlightsDiscoverScreenContract$SearchParametersA3, 0));
                                    FlightSearchQuery flightSearchQueryE3 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA3);
                                    if (flightSearchQueryE3 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE3);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    i6g.g output3 = (i6g.g) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    cli.y yVar3 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters4 = ((d) ((j2) yVar3.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters4, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA4 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters4, uc0.b.E(output3.f158997a), null, null, null, null, null, 62);
                                    aVar7.H2(yVar3, new i(travelFlightsDiscoverScreenContract$SearchParametersA4, 0));
                                    FlightSearchQuery flightSearchQueryE4 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA4);
                                    if (flightSearchQueryE4 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE4);
                                    }
                                    return Unit.f186387a;
                                default:
                                    i6g.g output4 = (i6g.g) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    cli.y yVar4 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters5 = ((d) ((j2) yVar4.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters5, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA5 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters5, null, uc0.b.E(output4.f158997a), null, null, null, null, 61);
                                    aVar7.H2(yVar4, new i(travelFlightsDiscoverScreenContract$SearchParametersA5, 0));
                                    FlightSearchQuery flightSearchQueryE5 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA5);
                                    if (flightSearchQueryE5 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE5);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    travelFlightsPassengersPickerScreen.H = block12;
                    return travelFlightsPassengersPickerScreen;
                }
                if (step6 instanceof TravelFlightsDiscoverScreenContract$ModalStep.OriginSelection) {
                    TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen = new TravelFlightsLocationPickerScreen(0);
                    final int i66 = 2;
                    Function1 block13 = new Function1() { // from class: v5g.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i662 = i66;
                            com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar7 = aVar6;
                            switch (i662) {
                                case 0:
                                    h4g.i iVar2 = aVar7.f93335p;
                                    cli.y yVar = aVar7.f93336q;
                                    t5g.e output = (t5g.e) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output.f268108a;
                                    if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                        TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                                        Intrinsics.checkNotNullParameter(updateSearchParameters, "$this$updateSearchParameters");
                                        TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                        aVar7.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA, 0));
                                        FlightSearchQuery flightSearchQueryE = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA);
                                        if (flightSearchQueryE != null) {
                                            iVar2.a(flightSearchQueryE);
                                        }
                                    } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                        TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters2 = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                                        Intrinsics.checkNotNullParameter(updateSearchParameters2, "$this$updateSearchParameters");
                                        TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                        TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA2 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters2, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                        aVar7.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA2, 0));
                                        FlightSearchQuery flightSearchQueryE2 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA2);
                                        if (flightSearchQueryE2 != null) {
                                            iVar2.a(flightSearchQueryE2);
                                        }
                                    } else {
                                        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i74 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    r6g.i output2 = (r6g.i) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    cli.y yVar2 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters3 = ((d) ((j2) yVar2.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters3, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA3 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters3, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                    aVar7.H2(yVar2, new i(travelFlightsDiscoverScreenContract$SearchParametersA3, 0));
                                    FlightSearchQuery flightSearchQueryE3 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA3);
                                    if (flightSearchQueryE3 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE3);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    i6g.g output3 = (i6g.g) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    cli.y yVar3 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters4 = ((d) ((j2) yVar3.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters4, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA4 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters4, uc0.b.E(output3.f158997a), null, null, null, null, null, 62);
                                    aVar7.H2(yVar3, new i(travelFlightsDiscoverScreenContract$SearchParametersA4, 0));
                                    FlightSearchQuery flightSearchQueryE4 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA4);
                                    if (flightSearchQueryE4 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE4);
                                    }
                                    return Unit.f186387a;
                                default:
                                    i6g.g output4 = (i6g.g) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    cli.y yVar4 = aVar7.f93336q;
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters5 = ((d) ((j2) yVar4.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters5, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA5 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters5, null, uc0.b.E(output4.f158997a), null, null, null, null, 61);
                                    aVar7.H2(yVar4, new i(travelFlightsDiscoverScreenContract$SearchParametersA5, 0));
                                    FlightSearchQuery flightSearchQueryE5 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA5);
                                    if (flightSearchQueryE5 != null) {
                                        aVar7.f93335p.a(flightSearchQueryE5);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    travelFlightsLocationPickerScreen.H = block13;
                    return travelFlightsLocationPickerScreen;
                }
                if (!(step6 instanceof TravelFlightsDiscoverScreenContract$ModalStep.DestinationSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen2 = new TravelFlightsLocationPickerScreen(0);
                final int i74 = 3;
                Function1 block14 = new Function1() { // from class: v5g.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        int i662 = i74;
                        com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar7 = aVar6;
                        switch (i662) {
                            case 0:
                                h4g.i iVar2 = aVar7.f93335p;
                                cli.y yVar = aVar7.f93336q;
                                t5g.e output = (t5g.e) obj8;
                                Intrinsics.checkNotNullParameter(output, "output");
                                TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output.f268108a;
                                if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters, "$this$updateSearchParameters");
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                    aVar7.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA, 0));
                                    FlightSearchQuery flightSearchQueryE = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA);
                                    if (flightSearchQueryE != null) {
                                        iVar2.a(flightSearchQueryE);
                                    }
                                } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                    TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters2 = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                                    Intrinsics.checkNotNullParameter(updateSearchParameters2, "$this$updateSearchParameters");
                                    TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                    TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA2 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters2, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                    aVar7.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA2, 0));
                                    FlightSearchQuery flightSearchQueryE2 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA2);
                                    if (flightSearchQueryE2 != null) {
                                        iVar2.a(flightSearchQueryE2);
                                    }
                                } else {
                                    if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i742 = jli.h.f175850a;
                                }
                                return Unit.f186387a;
                            case 1:
                                r6g.i output2 = (r6g.i) obj8;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                cli.y yVar2 = aVar7.f93336q;
                                TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters3 = ((d) ((j2) yVar2.f22677a).getValue()).f286218a;
                                Intrinsics.checkNotNullParameter(updateSearchParameters3, "$this$updateSearchParameters");
                                TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA3 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters3, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                aVar7.H2(yVar2, new i(travelFlightsDiscoverScreenContract$SearchParametersA3, 0));
                                FlightSearchQuery flightSearchQueryE3 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA3);
                                if (flightSearchQueryE3 != null) {
                                    aVar7.f93335p.a(flightSearchQueryE3);
                                }
                                return Unit.f186387a;
                            case 2:
                                i6g.g output3 = (i6g.g) obj8;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                cli.y yVar3 = aVar7.f93336q;
                                TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters4 = ((d) ((j2) yVar3.f22677a).getValue()).f286218a;
                                Intrinsics.checkNotNullParameter(updateSearchParameters4, "$this$updateSearchParameters");
                                TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA4 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters4, uc0.b.E(output3.f158997a), null, null, null, null, null, 62);
                                aVar7.H2(yVar3, new i(travelFlightsDiscoverScreenContract$SearchParametersA4, 0));
                                FlightSearchQuery flightSearchQueryE4 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA4);
                                if (flightSearchQueryE4 != null) {
                                    aVar7.f93335p.a(flightSearchQueryE4);
                                }
                                return Unit.f186387a;
                            default:
                                i6g.g output4 = (i6g.g) obj8;
                                Intrinsics.checkNotNullParameter(output4, "output");
                                cli.y yVar4 = aVar7.f93336q;
                                TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters5 = ((d) ((j2) yVar4.f22677a).getValue()).f286218a;
                                Intrinsics.checkNotNullParameter(updateSearchParameters5, "$this$updateSearchParameters");
                                TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA5 = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters5, null, uc0.b.E(output4.f158997a), null, null, null, null, 61);
                                aVar7.H2(yVar4, new i(travelFlightsDiscoverScreenContract$SearchParametersA5, 0));
                                FlightSearchQuery flightSearchQueryE5 = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA5);
                                if (flightSearchQueryE5 != null) {
                                    aVar7.f93335p.a(flightSearchQueryE5);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block14, "block");
                travelFlightsLocationPickerScreen2.H = block14;
                return travelFlightsLocationPickerScreen2;
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.confirmation.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.confirmation.b) obj4;
                ConfirmationFlowContract$InputData confirmationFlowContract$InputData = bVar3.f67249q;
                l FlowCoordinator3 = (l) obj2;
                ConfirmationFlowContract$Step step7 = (ConfirmationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof ConfirmationFlowContract$Step.Confirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConfirmationPromptScreenConfig confirmationPromptScreenConfig = confirmationFlowContract$InputData.f67245b;
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(ug4.a.a(confirmationPromptScreenConfig.f66341a, confirmationPromptScreenConfig.f66342b, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D020", null, null, null, 30), confirmationFlowContract$InputData.f67244a, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.credit_application_doc_sign_identity_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, 7920));
                v25.k block15 = new v25.k(bVar3, 12);
                Intrinsics.checkNotNullParameter(block15, "block");
                promptMarketingScreen.H = block15;
                return promptMarketingScreen;
            case 7:
                final com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a) obj4;
                l FlowCoordinator4 = (l) obj2;
                CreditPromptFlowContract$Step step8 = (CreditPromptFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                CreditPromptFlowContract$InputData creditPromptFlowContract$InputData = aVar7.o;
                zv3.a aVar8 = creditPromptFlowContract$InputData.f67347a;
                l0 l0Var = creditPromptFlowContract$InputData.f67348b;
                CreditPromptAnalyticsConfiguration creditPromptAnalyticsConfiguration = creditPromptFlowContract$InputData.f67349c;
                AnalyticsContext analyticsContext = creditPromptFlowContract$InputData.d;
                CreditPromptScreenContract$InputData creditPromptScreenContract$InputData = new CreditPromptScreenContract$InputData(aVar8, creditPromptAnalyticsConfiguration, analyticsContext);
                if (!(step8 instanceof CreditPromptFlowContract$Step.Prompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                if ((l0Var instanceof o) || (l0Var instanceof ht3.g)) {
                    CreditPromptScreen creditPromptScreen = new CreditPromptScreen(creditPromptScreenContract$InputData);
                    final int i92 = 0;
                    Function1 block16 = new Function1() { // from class: v74.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i92) {
                                case 0:
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a outputData = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof a.C0471a;
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar9 = aVar7;
                                    if (z) {
                                        aVar9.C2(b.a.f257690a);
                                    } else if (outputData instanceof a.b) {
                                        aVar9.C2(b.C1428b.f257691a);
                                    } else {
                                        if (!(outputData instanceof r74.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r74.k kVar = (r74.k) outputData;
                                        aVar9.C2(new rv3.c(kVar.f251991a, kVar.f251992b));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a outputData2 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof a.C0471a;
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar10 = aVar7;
                                    if (z3) {
                                        aVar10.C2(b.a.f257690a);
                                    } else if (outputData2 instanceof a.b) {
                                        aVar10.C2(b.C1428b.f257691a);
                                    } else {
                                        if (!(outputData2 instanceof r74.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r74.k kVar2 = (r74.k) outputData2;
                                        aVar10.C2(new rv3.c(kVar2.f251991a, kVar2.f251992b));
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a outputData3 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a) obj8;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z4 = outputData3 instanceof a.C0472a;
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar11 = aVar7;
                                    if (z4) {
                                        aVar11.C2(b.a.f257690a);
                                    } else if (outputData3 instanceof a.b) {
                                        aVar11.C2(b.C1428b.f257691a);
                                    } else {
                                        if (!(outputData3 instanceof m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        m mVar = (m) outputData3;
                                        aVar11.C2(new rv3.c(mVar.f260515a, mVar.f260516b));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    creditPromptScreen.H = block16;
                    return creditPromptScreen;
                }
                if (l0Var instanceof j0) {
                    MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen = new MediaHeaderCreditPromptScreen(creditPromptScreenContract$InputData);
                    Function1 block17 = new Function1() { // from class: v74.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i2) {
                                case 0:
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a outputData = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof a.C0471a;
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar9 = aVar7;
                                    if (z) {
                                        aVar9.C2(b.a.f257690a);
                                    } else if (outputData instanceof a.b) {
                                        aVar9.C2(b.C1428b.f257691a);
                                    } else {
                                        if (!(outputData instanceof r74.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r74.k kVar = (r74.k) outputData;
                                        aVar9.C2(new rv3.c(kVar.f251991a, kVar.f251992b));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a outputData2 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof a.C0471a;
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar10 = aVar7;
                                    if (z3) {
                                        aVar10.C2(b.a.f257690a);
                                    } else if (outputData2 instanceof a.b) {
                                        aVar10.C2(b.C1428b.f257691a);
                                    } else {
                                        if (!(outputData2 instanceof r74.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r74.k kVar2 = (r74.k) outputData2;
                                        aVar10.C2(new rv3.c(kVar2.f251991a, kVar2.f251992b));
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a outputData3 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a) obj8;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z4 = outputData3 instanceof a.C0472a;
                                    com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar11 = aVar7;
                                    if (z4) {
                                        aVar11.C2(b.a.f257690a);
                                    } else if (outputData3 instanceof a.b) {
                                        aVar11.C2(b.C1428b.f257691a);
                                    } else {
                                        if (!(outputData3 instanceof m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        m mVar = (m) outputData3;
                                        aVar11.C2(new rv3.c(mVar.f260515a, mVar.f260516b));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    mediaHeaderCreditPromptScreen.H = block17;
                    return mediaHeaderCreditPromptScreen;
                }
                if (!(l0Var instanceof ht3.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConstructorCreditPromptController constructorCreditPromptController = new ConstructorCreditPromptController(new ConstructorCreditPromptControllerContract$InputData((ht3.e) l0Var, creditPromptFlowContract$InputData.f67347a, creditPromptAnalyticsConfiguration, analyticsContext));
                final int i96 = 2;
                Function1 block18 = new Function1() { // from class: v74.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i96) {
                            case 0:
                                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a outputData = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a) obj8;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z = outputData instanceof a.C0471a;
                                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar9 = aVar7;
                                if (z) {
                                    aVar9.C2(b.a.f257690a);
                                } else if (outputData instanceof a.b) {
                                    aVar9.C2(b.C1428b.f257691a);
                                } else {
                                    if (!(outputData instanceof r74.k)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    r74.k kVar = (r74.k) outputData;
                                    aVar9.C2(new rv3.c(kVar.f251991a, kVar.f251992b));
                                }
                                return Unit.f186387a;
                            case 1:
                                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a outputData2 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a) obj8;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z3 = outputData2 instanceof a.C0471a;
                                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar10 = aVar7;
                                if (z3) {
                                    aVar10.C2(b.a.f257690a);
                                } else if (outputData2 instanceof a.b) {
                                    aVar10.C2(b.C1428b.f257691a);
                                } else {
                                    if (!(outputData2 instanceof r74.k)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    r74.k kVar2 = (r74.k) outputData2;
                                    aVar10.C2(new rv3.c(kVar2.f251991a, kVar2.f251992b));
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a outputData3 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a) obj8;
                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                boolean z4 = outputData3 instanceof a.C0472a;
                                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.a aVar11 = aVar7;
                                if (z4) {
                                    aVar11.C2(b.a.f257690a);
                                } else if (outputData3 instanceof a.b) {
                                    aVar11.C2(b.C1428b.f257691a);
                                } else {
                                    if (!(outputData3 instanceof m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    m mVar = (m) outputData3;
                                    aVar11.C2(new rv3.c(mVar.f260515a, mVar.f260516b));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block18, "block");
                constructorCreditPromptController.H = block18;
                return constructorCreditPromptController;
            case 8:
                com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.a aVar9 = (com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.a) obj4;
                LoanRepaymentAccountsFlowContract$InputData loanRepaymentAccountsFlowContract$InputData = aVar9.o;
                l FlowCoordinator5 = (l) obj2;
                LoanRepaymentAccountsFlowContract$Step step9 = (LoanRepaymentAccountsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof LoanRepaymentAccountsFlowContract$Step.ManageRepaymentAccounts)) {
                    if (!(step9 instanceof LoanRepaymentAccountsFlowContract$Step.SetupBackUpCard)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LoanRepaymentAccountsFlowContract$Step.SetupBackUpCard setupBackUpCard = (LoanRepaymentAccountsFlowContract$Step.SetupBackUpCard) step9;
                    return new LoanSelectBackupCardRootFlow(new LoanSelectBackupCardFlowContract$InputData(loanRepaymentAccountsFlowContract$InputData.f70511a, setupBackUpCard.f70516b, setupBackUpCard.f70515a));
                }
                LoanRepaymentAccountsController loanRepaymentAccountsController = new LoanRepaymentAccountsController(new LoanRepaymentAccountsControllerContract$InputData(loanRepaymentAccountsFlowContract$InputData.f70511a, loanRepaymentAccountsFlowContract$InputData.f70512b));
                v73.c block19 = new v73.c(aVar9, FlowCoordinator5, i2);
                Intrinsics.checkNotNullParameter(block19, "block");
                loanRepaymentAccountsController.H = block19;
                return loanRepaymentAccountsController;
            case 9:
                v7e.g gVar = (v7e.g) obj4;
                Function1 function13 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(function13, "default");
                List list = (List) function13.invoke(new iii.d(14, null, false, false, null));
                ChosenBackground chosenBackground = gVar.f286592c;
                return new v7e.m(list, chosenBackground != null ? chosenBackground.f63742b : null, false, v7e.v.b(gVar.f286590a));
            case 10:
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.b bVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.b) obj4;
                TravelHotelsPropertyFlowContract$InputData travelHotelsPropertyFlowContract$InputData = bVar4.o;
                l FlowCoordinator6 = (l) obj2;
                TravelHotelsPropertyFlowContract$Step it8 = (TravelHotelsPropertyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                TravelHotelsPropertyFlowContract$Step travelHotelsPropertyFlowContract$Step = (TravelHotelsPropertyFlowContract$Step) FlowCoordinator6.d();
                if (travelHotelsPropertyFlowContract$Step instanceof TravelHotelsPropertyFlowContract$Step.Details) {
                    TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen = new TravelHotelsPropertyDetailsScreen(new TravelHotelsPropertyDetailsScreenContract$InputData(travelHotelsPropertyFlowContract$InputData.f93741a, travelHotelsPropertyFlowContract$InputData.f93742b, travelHotelsPropertyFlowContract$InputData.f93743c));
                    v73.c block20 = new v73.c(bVar4, FlowCoordinator6, 4);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    travelHotelsPropertyDetailsScreen.H = block20;
                    return travelHotelsPropertyDetailsScreen;
                }
                if (travelHotelsPropertyFlowContract$Step instanceof TravelHotelsPropertyFlowContract$Step.Gallery) {
                    FlowStep flowStepD = FlowCoordinator6.d();
                    Intrinsics.i(flowStepD, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlowContract.Step.Gallery");
                    return bVar4.e1(new rd7.e(new rd7.j(((TravelHotelsPropertyFlowContract$Step.Gallery) flowStepD).f93747a)));
                }
                if (travelHotelsPropertyFlowContract$Step instanceof TravelHotelsPropertyFlowContract$Step.Amenities) {
                    return new TravelHotelsPropertyAmenitiesScreen(new TravelHotelsPropertyAmenitiesScreenContract$InputData(travelHotelsPropertyFlowContract$InputData.f93741a.f93670a));
                }
                if (travelHotelsPropertyFlowContract$Step instanceof TravelHotelsPropertyFlowContract$Step.AdditionalDetails) {
                    FlowStep flowStepD2 = FlowCoordinator6.d();
                    Intrinsics.i(flowStepD2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlowContract.Step.AdditionalDetails");
                    return new TravelHotelsAdditionalDetailsScreen(new TravelHotelsAdditionalDetailsScreenContract$InputData(((TravelHotelsPropertyFlowContract$Step.AdditionalDetails) flowStepD2).f93744a));
                }
                if (!(travelHotelsPropertyFlowContract$Step instanceof TravelHotelsPropertyFlowContract$Step.GuestsReviews)) {
                    throw new NoWhenBranchMatchedException();
                }
                FlowStep flowStepD3 = FlowCoordinator6.d();
                Intrinsics.i(flowStepD3, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlowContract.Step.GuestsReviews");
                return new TravelHotelsPropertyGuestsReviewsScreen(new TravelHotelsPropertyGuestsReviewsScreenContract$InputData(((TravelHotelsPropertyFlowContract$Step.GuestsReviews) flowStepD3).f93748a));
            case 11:
                com.revolut.feature.wealth.impl.ui.flows.withdraw.b bVar5 = (com.revolut.feature.wealth.impl.ui.flows.withdraw.b) obj4;
                l FlowCoordinator7 = (l) obj2;
                WithdrawFlowContract$Step step10 = (WithdrawFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!Intrinsics.f(step10, WithdrawFlowContract$Step.Amount.f95569a)) {
                    throw new NoWhenBranchMatchedException();
                }
                WithdrawFlowContract$Input withdrawFlowContract$Input = bVar5.o;
                WithdrawScreen withdrawScreen = new WithdrawScreen(new WithdrawScreenContract$Input(withdrawFlowContract$Input.f95565a, withdrawFlowContract$Input.f95567c));
                ux7.i iVar2 = new ux7.i(1, bVar5, com.revolut.feature.wealth.impl.ui.flows.withdraw.b.class, "handleWithdrawScreenOutput", "handleWithdrawScreenOutput(Lcom/revolut/feature/wealth/impl/ui/screens/withdraw/WithdrawScreenContract$Output;)V", 0, 24);
                Intrinsics.checkNotNullParameter(iVar2, "<set-?>");
                withdrawScreen.H = iVar2;
                return withdrawScreen;
            case 12:
                WithdrawScreen withdrawScreen2 = (WithdrawScreen) obj4;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = WithdrawScreen.f95647h0;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj8 = data.f51981p;
                usb.a aVar10 = obj8 instanceof usb.a ? (usb.a) obj8 : null;
                if (aVar10 == null) {
                    return null;
                }
                MaskedTextInputEditText editText = field.getEditText();
                xi0.b bVar6 = aVar10.f282862a;
                qd0.b bVarN = ((z9h.l) withdrawScreen2.U.getValue()).f320463c.f320404n.n();
                vc.s.j(bVarN);
                return new zp0.d(editText, bVar6, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
            case 13:
                ((x0) obj4).x2(new vch.h0(3));
                return Unit.f186387a;
            case 14:
                final com.revolut.feature.onboarding.selfie.impl.intro.flow.b bVar7 = (com.revolut.feature.onboarding.selfie.impl.intro.flow.b) obj4;
                l FlowCoordinator8 = (l) obj2;
                OnboardingSelfieIntroFlowContract$Step step11 = (OnboardingSelfieIntroFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator8, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof OnboardingSelfieIntroFlowContract$Step.SelfieIntro)) {
                    if (!(step11 instanceof OnboardingSelfieIntroFlowContract$Step.AcceptConsent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OnboardingSelfieIntroFlowContract$Step.AcceptConsent acceptConsent = (OnboardingSelfieIntroFlowContract$Step.AcceptConsent) step11;
                    ViewController viewControllerE15 = bVar7.e1(new KycConsentDescriptor(acceptConsent.f78601a, acceptConsent.f78602b));
                    final int i99 = 0;
                    Function1 block21 = new Function1() { // from class: vd9.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i99) {
                                case 0:
                                    ns8.a result = (ns8.a) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof ns8.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar7.C2(pu.e.f239785a);
                                    return Unit.f186387a;
                                default:
                                    pu.e it9 = (pu.e) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    com.revolut.feature.onboarding.selfie.impl.intro.flow.b bVar8 = bVar7;
                                    c cVar2 = bVar8.o;
                                    if (cVar2.f287829a.isEmpty()) {
                                        bVar8.C2(pu.e.f239785a);
                                    } else {
                                        bVar8.l2(new v06.i(bVar8, (my8.k) zhm.d0.a0(cVar2.f287829a), null, 23), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    viewControllerE15.H = block21;
                    return viewControllerE15;
                }
                uq.a aVar11 = bVar7.f78605p;
                k9 k9Var2 = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                BiometricVerificationSelfieIntroScreenFactory$InputData inputData = new BiometricVerificationSelfieIntroScreenFactory$InputData(false, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2));
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen = new BiometricVerificationSelfieIntroScreen(inputData);
                Function1 block22 = new Function1() { // from class: vd9.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i2) {
                            case 0:
                                ns8.a result = (ns8.a) obj9;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof ns8.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar7.C2(pu.e.f239785a);
                                return Unit.f186387a;
                            default:
                                pu.e it9 = (pu.e) obj9;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                com.revolut.feature.onboarding.selfie.impl.intro.flow.b bVar8 = bVar7;
                                c cVar2 = bVar8.o;
                                if (cVar2.f287829a.isEmpty()) {
                                    bVar8.C2(pu.e.f239785a);
                                } else {
                                    bVar8.l2(new v06.i(bVar8, (my8.k) zhm.d0.a0(cVar2.f287829a), null, 23), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block22, "block");
                biometricVerificationSelfieIntroScreen.H = block22;
                return biometricVerificationSelfieIntroScreen;
            case 15:
                wel.d buyBlock = (wel.d) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(buyBlock, "buyBlock");
                ((vdl.d) obj4).f287949b.f("INVEST_BUY_BLOCK", buyBlock);
                return Unit.f186387a;
            case 16:
                String portfolioId = (String) obj2;
                List pendingAssets = (List) obj3;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(pendingAssets, "pendingAssets");
                ((vdl.f) obj4).f287964b.f(vdl.f.a(portfolioId), pendingAssets);
                return Unit.f186387a;
            case 17:
                List indexes = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(indexes, "indexes");
                ((vdl.h) obj4).f287970a.f("INDEXES_CACHE_KEY", indexes);
                return Unit.f186387a;
            case 18:
                ne0.j jVar = ((vdl.r) obj4).e;
                Set<n> instruments = (Set) obj2;
                List data2 = (List) obj3;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                Intrinsics.checkNotNullParameter(data2, "data");
                for (n nVar : instruments) {
                    Iterator it9 = data2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((afl.a) next).i(), nVar.f214596b)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    afl.a aVar12 = (afl.a) next;
                    if (aVar12 != null) {
                        jVar.f(vdl.r.b(nVar), aVar12);
                    }
                }
                return Unit.f186387a;
            case 19:
                z0 params = (z0) obj2;
                eel.a domain = (eel.a) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((d1) obj4).d.f(d1.d(params), domain);
                return Unit.f186387a;
            case 20:
                j1 params2 = (j1) obj2;
                eel.e domain2 = (eel.e) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                ((l1) obj4).e.f(l1.c(params2), domain2);
                return Unit.f186387a;
            case 21:
                final com.revolut.feature.passcode_reminder.impl.ui.flow.b bVar8 = (com.revolut.feature.passcode_reminder.impl.ui.flow.b) obj4;
                l FlowCoordinator9 = (l) obj2;
                PasscodeReminderFlowContract$Step step12 = (PasscodeReminderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator9, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof PasscodeReminderFlowContract$Step.EnterPasscode) {
                    final int i100 = 0;
                    PasscodeScreen passcodeScreen = new PasscodeScreen(PasscodeScreenContract$InputData.Companion.d(PasscodeScreenContract$InputData.INSTANCE, new PinCodeView.Header.Title(6, new TextLocalisedClause(com.revolut.feature.passcode.R$string.passcode_title_enter_passcode, null, null, 14), (TextLocalisedClause) null), (PinCodeView.Mode) bVar8.f78655t.getValue(), new PasscodeScreenContract$VerificationMode.Default(false), false, null, null, CaptureActivity.RESULT_EXIT_USER_FLOW));
                    Function1 function14 = new Function1() { // from class: ve9.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i100) {
                                case 0:
                                    de9.m result = (de9.m) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof de9.j) {
                                        String str2 = ((de9.j) result).f113326a;
                                        com.revolut.feature.passcode_reminder.impl.ui.flow.b bVar9 = bVar8;
                                        bVar9.n2(new v06.i(bVar9, str2, null, 25), new whi.b(6));
                                        return Unit.f186387a;
                                    }
                                    if (result instanceof de9.i) {
                                        throw new IllegalStateException("ForgotPasscode is not support in PasscodeReminderFlow");
                                    }
                                    if (result instanceof de9.k) {
                                        throw new IllegalStateException("Biometric is not support in PasscodeReminderFlow");
                                    }
                                    if (result instanceof de9.l) {
                                        throw new IllegalStateException("UsePassword is not support in PasscodeReminderFlow");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                default:
                                    g result2 = (g) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof dii.e;
                                    com.revolut.feature.passcode_reminder.impl.ui.flow.b bVar10 = bVar8;
                                    if (z) {
                                        bVar10.l2(new d(bVar10, null, 0), new yi5.b(26));
                                        oki.h.t2(bVar10, bVar10.u, PasscodeReminderFlowContract$Step.ChangePasscode.f78646a, false, null, false, 12);
                                    } else if (result2 instanceof dii.f) {
                                        oki.h.D2(bVar10.u);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function14, "<set-?>");
                    passcodeScreen.H = function14;
                    return passcodeScreen;
                }
                if (step12 instanceof PasscodeReminderFlowContract$Step.ChangePasscode) {
                    return bVar8.e1(new ejl.c(0));
                }
                if (step12 instanceof PasscodeReminderFlowContract$Step.ChangePasscodeDialog) {
                    LayoutViewerScreen layoutViewerScreen = new LayoutViewerScreen(R$layout.screen_transparent);
                    oki.h.w2(bVar8.u, PasscodeReminderFlowContract$Step.ForgotPassword.f78649a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    return layoutViewerScreen;
                }
                if (!(step12 instanceof PasscodeReminderFlowContract$Step.ForgotPassword)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar13 = new lw0.a(new TextLocalisedClause(com.revolut.feature.passcode_reminder.impl.R$string.passcode_reminder_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.passcode_reminder.impl.R$string.passcode_reminder_dialog_description, null, null, 14), null, null, false, 28);
                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.passcode_reminder.impl.R$string.passcode_reminder_dialog_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.passcode_reminder.impl.R$string.passcode_reminder_dialog_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var3 = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar13, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                Function1 block23 = new Function1() { // from class: ve9.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i2) {
                            case 0:
                                de9.m result = (de9.m) obj9;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof de9.j) {
                                    String str2 = ((de9.j) result).f113326a;
                                    com.revolut.feature.passcode_reminder.impl.ui.flow.b bVar9 = bVar8;
                                    bVar9.n2(new v06.i(bVar9, str2, null, 25), new whi.b(6));
                                    return Unit.f186387a;
                                }
                                if (result instanceof de9.i) {
                                    throw new IllegalStateException("ForgotPasscode is not support in PasscodeReminderFlow");
                                }
                                if (result instanceof de9.k) {
                                    throw new IllegalStateException("Biometric is not support in PasscodeReminderFlow");
                                }
                                if (result instanceof de9.l) {
                                    throw new IllegalStateException("UsePassword is not support in PasscodeReminderFlow");
                                }
                                throw new NoWhenBranchMatchedException();
                            default:
                                g result2 = (g) obj9;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean z = result2 instanceof dii.e;
                                com.revolut.feature.passcode_reminder.impl.ui.flow.b bVar10 = bVar8;
                                if (z) {
                                    bVar10.l2(new d(bVar10, null, 0), new yi5.b(26));
                                    oki.h.t2(bVar10, bVar10.u, PasscodeReminderFlowContract$Step.ChangePasscode.f78646a, false, null, false, 12);
                                } else if (result2 instanceof dii.f) {
                                    oki.h.D2(bVar10.u);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block23, "block");
                actionsBottomSheetController.H = block23;
                return actionsBottomSheetController;
            case 22:
                vfg.i params3 = (vfg.i) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(params3, "params");
                g0 g0Var = ((vfg.k) obj4).f288624a;
                if (zBooleanValue) {
                    loadingStrategy = iVar;
                }
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return g0Var.f194890j.e(params3, loadingStrategy).map(new vf0.n(new vdl.a(params3, 17), 20));
            case 23:
                vfg.o oVar = (vfg.o) obj4;
                hfg.j0 request = (hfg.j0) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(request, "request");
                vfg.r rVar = oVar.f288629a;
                if (zBooleanValue2) {
                    loadingStrategy = iVar;
                }
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                g0 g0Var2 = rVar.f288635a;
                boolean zC = ((jte.d) rVar.f288636b).c(TravelMilesApi$Toggles.AirMilesFlightLiveSearch.f94077c);
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.c(new v0b.b(new q0(rd0.e.b(g0Var2.f194889h.e(new lfg.b0(zC, request), loadingStrategy)), new vfg.m(oVar, null, 0), 1), request, 3), kotlin.coroutines.g.f186406a);
            case 24:
                gfg.b params4 = (gfg.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(params4, "params");
                return ((vfg.t) obj4).b(params4, 20).map(new vf0.n(new vdl.a(params4, 20), 22));
            case 25:
                final com.revolut.retail.feature.esim.impl.ui.flows.get_plan.c cVar2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.c) obj4;
                EsimGetPlanFlowContract$InputData esimGetPlanFlowContract$InputData = cVar2.f100633r;
                l FlowCoordinator10 = (l) obj2;
                EsimGetPlanFlowContract$Step step13 = (EsimGetPlanFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator10, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof EsimGetPlanFlowContract$Step.SelectPlan) {
                    EsimGetPlanFlowContract$Step.SelectPlan selectPlan = (EsimGetPlanFlowContract$Step.SelectPlan) step13;
                    EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = new EsimGetPlanScreenContract$InputData(selectPlan.f100629a, selectPlan.f100630b, selectPlan.f100631c, esimGetPlanFlowContract$InputData.getD());
                    ViewController esimPlanSelectionScreen = ((jte.d) cVar2.f100635t).c(EsimApi$Toggles.EsimPurchaseScreenRedesign.f100181c) ? new EsimPlanSelectionScreen(esimGetPlanScreenContract$InputData) : new EsimGetPlanScreen(esimGetPlanScreenContract$InputData);
                    Function1 block24 = new Function1() { // from class: vfj.c
                        /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 350
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: vfj.c.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    esimPlanSelectionScreen.H = block24;
                    return esimPlanSelectionScreen;
                }
                if (step13 instanceof EsimGetPlanFlowContract$Step.Checkout) {
                    EsimGetPlanFlowContract$Step.Checkout checkout = (EsimGetPlanFlowContract$Step.Checkout) step13;
                    esimMobilePlanNumberSelectionFlow = new EsimCheckoutFlow(new EsimCheckoutFlowContract$InputData(checkout.f100616a, checkout.f100617b, esimGetPlanFlowContract$InputData.getD()));
                    final int i101 = 2;
                    Function1 block25 = new Function1() { // from class: vfj.c
                        /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 350
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: vfj.c.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    esimMobilePlanNumberSelectionFlow.H = block25;
                } else if (step13 instanceof EsimGetPlanFlowContract$Step.MobilePlanCheckout) {
                    EsimGetPlanFlowContract$Step.MobilePlanCheckout mobilePlanCheckout = (EsimGetPlanFlowContract$Step.MobilePlanCheckout) step13;
                    esimMobilePlanNumberSelectionFlow = new EsimMobilePlanCheckoutFlow(new EsimMobilePlanCheckoutFlowContract$InputData.PurchaseNewPlan(mobilePlanCheckout.f100620a, mobilePlanCheckout.f100622c, mobilePlanCheckout.f100621b, esimGetPlanFlowContract$InputData.getD()));
                    final int i102 = 3;
                    Function1 block26 = new Function1() { // from class: vfj.c
                        /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 350
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: vfj.c.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(block26, "block");
                    esimMobilePlanNumberSelectionFlow.H = block26;
                } else if (step13 instanceof EsimGetPlanFlowContract$Step.PostCheckout) {
                    EsimPostCheckoutFlowContract$Step esimPostCheckoutFlowContract$Step = ((EsimGetPlanFlowContract$Step.PostCheckout) step13).f100627a;
                    EsimGiftRecipient d = esimGetPlanFlowContract$InputData.getD();
                    esimMobilePlanNumberSelectionFlow = new EsimPostCheckoutFlow(new EsimPostCheckoutFlowContract$InputData(esimPostCheckoutFlowContract$Step, d != null ? new EsimHomeFlowContract$InputData.InitialDestination.PreferredView.GiftRecipient(d.f100268a) : EsimHomeFlowContract$InputData.InitialDestination.PreferredView.CurrentDevice.f100647a));
                } else {
                    if (!(step13 instanceof EsimGetPlanFlowContract$Step.MobilePlanNumberSelection)) {
                        if (step13 instanceof EsimGetPlanFlowContract$Step.MobilePlanChangeCheckout) {
                            EsimGetPlanFlowContract$Step.MobilePlanChangeCheckout mobilePlanChangeCheckout = (EsimGetPlanFlowContract$Step.MobilePlanChangeCheckout) step13;
                            EsimMobilePlanCheckoutFlow esimMobilePlanCheckoutFlow = new EsimMobilePlanCheckoutFlow(new EsimMobilePlanCheckoutFlowContract$InputData.ChangePlan(mobilePlanChangeCheckout.f100618a, mobilePlanChangeCheckout.f100619b, null));
                            final int i103 = 3;
                            Function1 block27 = new Function1() { // from class: vfj.c
                                /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
                                @Override // kotlin.jvm.functions.Function1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invoke(java.lang.Object r9) {
                                    /*
                                        Method dump skipped, instruction units count: 350
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: vfj.c.invoke(java.lang.Object):java.lang.Object");
                                }
                            };
                            Intrinsics.checkNotNullParameter(block27, "block");
                            esimMobilePlanCheckoutFlow.H = block27;
                            return esimMobilePlanCheckoutFlow;
                        }
                        if (step13 instanceof EsimGetPlanFlowContract$Step.MobilePlanResubscribeCheckout) {
                            EsimGetPlanFlowContract$Step.MobilePlanResubscribeCheckout mobilePlanResubscribeCheckout = (EsimGetPlanFlowContract$Step.MobilePlanResubscribeCheckout) step13;
                            EsimMobilePlanCheckoutFlow esimMobilePlanCheckoutFlow2 = new EsimMobilePlanCheckoutFlow(new EsimMobilePlanCheckoutFlowContract$InputData.ResubscribeToMobilePlanSubscription(mobilePlanResubscribeCheckout.f100625a, null, mobilePlanResubscribeCheckout.f100626b));
                            final int i104 = 3;
                            Function1 block28 = new Function1() { // from class: vfj.c
                                /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
                                @Override // kotlin.jvm.functions.Function1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invoke(java.lang.Object r9) {
                                    /*
                                        Method dump skipped, instruction units count: 350
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: vfj.c.invoke(java.lang.Object):java.lang.Object");
                                }
                            };
                            Intrinsics.checkNotNullParameter(block28, "block");
                            esimMobilePlanCheckoutFlow2.H = block28;
                            return esimMobilePlanCheckoutFlow2;
                        }
                        if (!(step13 instanceof EsimGetPlanFlowContract$Step.Restricted)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(((EsimGetPlanFlowContract$Step.Restricted) step13).f100628a);
                        final int i105 = 0;
                        Function1 block29 = new Function1() { // from class: vfj.c
                            /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r9) {
                                /*
                                    Method dump skipped, instruction units count: 350
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: vfj.c.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        Intrinsics.checkNotNullParameter(block29, "block");
                        promptMarketingScreen2.H = block29;
                        return promptMarketingScreen2;
                    }
                    EsimGetPlanFlowContract$Step.MobilePlanNumberSelection mobilePlanNumberSelection = (EsimGetPlanFlowContract$Step.MobilePlanNumberSelection) step13;
                    esimMobilePlanNumberSelectionFlow = new EsimMobilePlanNumberSelectionFlow(new EsimMobilePlanNumberSelectionFlowContract$InputData(mobilePlanNumberSelection.f100623a, esimGetPlanFlowContract$InputData.getD(), mobilePlanNumberSelection.f100624b));
                    final int i106 = 4;
                    Function1 block30 = new Function1() { // from class: vfj.c
                        /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 350
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: vfj.c.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(block30, "block");
                    esimMobilePlanNumberSelectionFlow.H = block30;
                }
                return esimMobilePlanNumberSelectionFlow;
            case 26:
                com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar14 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TransactionsScreenContract$ModalStep step14 = (TransactionsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof TransactionsScreenContract$ModalStep.DetailsPager)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransactionsScreenContract$ModalStep.DetailsPager detailsPager = (TransactionsScreenContract$ModalStep.DetailsPager) step14;
                return aVar14.e1(new rhf.e(detailsPager.f91932a, detailsPager.f91933b, null, 12));
            case 27:
                com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar9 = (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelMilesAirlineDetailsScreenContract$ModalStep step15 = (TravelMilesAirlineDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof TravelMilesAirlineDetailsScreenContract$ModalStep.RevPointsBottomSheet) {
                    return bVar9.e1(new hub.c(e0.MILES));
                }
                if (step15 instanceof TravelMilesAirlineDetailsScreenContract$ModalStep.RedeemOptionBottomSheet) {
                    TravelMilesRedeemOptionScreen travelMilesRedeemOptionScreen = new TravelMilesRedeemOptionScreen(new TravelMilesRedeemOptionScreenContract$InputData(((TravelMilesAirlineDetailsScreenContract$ModalStep.RedeemOptionBottomSheet) step15).f94268a));
                    vgg.v block31 = new vgg.v(bVar9, i2);
                    Intrinsics.checkNotNullParameter(block31, "block");
                    travelMilesRedeemOptionScreen.H = block31;
                    return travelMilesRedeemOptionScreen;
                }
                if (step15 instanceof TravelMilesAirlineDetailsScreenContract$ModalStep.RevPointsGiftcardsPurchase) {
                    ViewController viewControllerE16 = bVar9.e1(new uvb.i(((TravelMilesAirlineDetailsScreenContract$ModalStep.RevPointsGiftcardsPurchase) step15).f94270a));
                    vgg.v block32 = new vgg.v(bVar9, 2);
                    Intrinsics.checkNotNullParameter(block32, "block");
                    viewControllerE16.H = block32;
                    return viewControllerE16;
                }
                if (!(step15 instanceof TravelMilesAirlineDetailsScreenContract$ModalStep.AccountRegistrationByTaxId)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelMilesAirlineDetailsScreenContract$ModalStep.AccountRegistrationByTaxId accountRegistrationByTaxId = (TravelMilesAirlineDetailsScreenContract$ModalStep.AccountRegistrationByTaxId) step15;
                String str2 = accountRegistrationByTaxId.f94267b;
                TravelMilesAirline travelMilesAirline = accountRegistrationByTaxId.f94266a;
                TravelMilesAccountRegistrationTaxIdScreen travelMilesAccountRegistrationTaxIdScreen = new TravelMilesAccountRegistrationTaxIdScreen(new TravelMilesAccountRegistrationTaxIdScreenContract$InputData(str2, travelMilesAirline.f94091g, travelMilesAirline.f94089b, travelMilesAirline.f94090c, travelMilesAirline.f94088a));
                v73.c block33 = new v73.c(bVar9, step15, 29);
                Intrinsics.checkNotNullParameter(block33, "block");
                travelMilesAccountRegistrationTaxIdScreen.H = block33;
                return travelMilesAccountRegistrationTaxIdScreen;
            case 28:
                return a(obj2, obj3);
            default:
                Activity activity = (Activity) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(activity, "activity");
                ((ResolvableApiException) obj4).startResolutionForResult(activity, iIntValue);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ d(v7e.g gVar, v7e.v vVar) {
        this.f285986a = 9;
        this.f285987b = gVar;
    }
}
