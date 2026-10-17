package ta8;

import aii.q;
import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import bof.r;
import c12.j;
import c12.p0;
import c12.v;
import com.google.protobuf.w0;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationSelfieStepFlowProvider$InputData;
import com.revolut.biometric_verification.impl.ui.step.selfie.flow.BiometricVerificationSelfieStepFlow;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CaptureMode;
import com.revolut.camerakit.client.api.models.VideoDuration;
import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings;
import com.revolut.camerakit.core.settings.WatermarkSettings;
import com.revolut.camerakit.revolut.ui.barcodeqr.BarcodeQrReaderFlow;
import com.revolut.camerakit.revolut.ui.barcodeqr.BarcodeQrReaderFlowContract$InputData;
import com.revolut.camerakit.revolut.ui.barcodeqr.models.BarcodeQrReaderScreenSettings;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.QrCodeMaskModel;
import com.revolut.camerakit.ui.models.R$color;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.ui.api.navigation.ApmPendingNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import com.revolut.feature.apm.qvik.impl.ui.pay.QvikPayFlowContract$Step;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step;
import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlow;
import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlow;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlow;
import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditProductArticleKey;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.product_articles.ProductArticlesFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.product_articles.ProductArticlesFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositFlowContract$Step;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$RepaymentInfo;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountRootFlow;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateScreen;
import com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.AutopayAmountConfirmationContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.AutopayAmountConfirmationController;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayRootFlow;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsScreen;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitFlow;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$InputData;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreen;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreenContract$AccountInfo;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayContent;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsScreen;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreenContract$Step;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.esim.instructions.ui.flow.instructions.EsimInstructionsFlowContract$InputData;
import com.revolut.feature.esim.instructions.ui.flow.instructions.EsimInstructionsFlowContract$Step;
import com.revolut.feature.esim.instructions.ui.screen.instructions.EsimInstructionsScreen;
import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import com.revolut.feature.image_gallery.flow.ImageGalleryFlowContract$Step;
import com.revolut.feature.image_gallery.screens.grid.ImageGalleryGridScreen;
import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreen;
import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreen;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreen;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreenContract$InputData;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreenContract$ModalStep;
import com.revolut.feature.junior_settings.impl.ui_kompot.enter_qr_data.EnterQrDataController;
import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.selfie.OnboardingSelfieFlowContract$Step;
import com.revolut.feature.onboarding.impl.revolut_card_ready.flow.RevolutCardReadyFlowContract$InputData;
import com.revolut.feature.onboarding.impl.revolut_card_ready.flow.RevolutCardReadyFlowContract$Step;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreen;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreenContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentRootFlow;
import com.revolut.feature.tax_residency.impl.exemption.ui.amount.LimitOrderAmountSelectorScreen;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyPreview;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.TravelHotelsRoomsSelectionFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.TravelHotelsRoomDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.TravelHotelsRoomDetailsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewControllerContract$ModalStep;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.room.Area;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoom;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import com.revolut.feature_travel_hotels_models.property.room.OccupancyRates;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlow;
import com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$InputData;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.checkout.EsimCheckoutFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.checkout.EsimCheckoutFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.CheckoutPlanSelectionFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection.PlanSelectionFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.PlanPartnersFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.PlanPartnersFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreenContract$InputData;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.sso.api.app_consent.SsoQrConsentInputData;
import com.revolut.sso.api.email.change.ChangeEmailInputData;
import com.revolut.sso.api.models.SsoChangeClaimMode;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheet;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheetContract$InputData;
import com.revolut.sso.impl.ui.email.change_flow.ChangeEmailFlowContract$Step;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreen;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreenContract$InputData;
import com.revolut.tracking.v3.CreditApplicationProductArticleContext;
import ft3.d1;
import grl.k9;
import i9g.j0;
import ieg.n;
import ieg.o;
import ip0.z;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ms0.h4;
import oki.h;
import t73.z2;
import tb6.t;
import ueg.a0;
import ueg.b0;
import vkm.j2;
import wbg.i0;
import wbg.k0;
import wbg.l0;
import wbg.m0;
import xu3.d0;
import xu3.e0;
import xu3.f0;
import xu3.g0;
import zhm.h0;
import zhm.u;
import zp0.y;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f269151b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f269150a = i;
        this.f269151b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.feature.apm.wero.impl.ui.flow.b bVar = (com.revolut.feature.apm.wero.impl.ui.flow.b) this.f269151b;
        yki.l FlowCoordinator = (yki.l) obj2;
        WeroFlowContract$Step step = (WeroFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof WeroFlowContract$Step.Intro) {
            ViewController viewControllerE1 = bVar.e1(new d12.a(new d12.c(new TextLocalisedClause(R$string.wero_entry, null, null, 14)), bVar.f63061s));
            final int i = 3;
            Function1 block = new Function1() { // from class: th2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 1:
                            oi2.f outputData = (oi2.f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, oi2.c.f225414a);
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar2 = bVar;
                            if (zF || Intrinsics.f(outputData, oi2.d.f225415a)) {
                                h.D2(bVar2.u);
                            } else {
                                if (!Intrinsics.f(outputData, oi2.e.f225416a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(bVar2, bVar2.u, WeroFlowContract$Step.Intro.f63050a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            j it9 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 3:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar3 = bVar;
                            bVar3.l2(new tgk.f(bVar3, (sh2.a) outputData2, null, 2), new yi5.b(26));
                            return Unit.f186387a;
                        case 4:
                            v outputData3 = (v) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar4 = bVar;
                            bVar4.l2(new com.revolut.feature.apm.wero.impl.ui.flow.a(bVar4, outputData3, null), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            gi2.c it10 = (gi2.c) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (step instanceof WeroFlowContract$Step.Pending) {
            String str = ((WeroFlowContract$Step.Pending) step).f63054a;
            ApmWero apmWero = ApmWero.f61829c;
            ViewController viewControllerE12 = bVar.e1(new c12.k(new ApmPendingNavigation$InputData(str, apmWero.e(), apmWero.F(), CapturePresenter.PASSPORT_OVERLAY_DELAY_MS), bVar.f63062t));
            final int i2 = 4;
            Function1 block2 = new Function1() { // from class: th2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 1:
                            oi2.f outputData = (oi2.f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, oi2.c.f225414a);
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar2 = bVar;
                            if (zF || Intrinsics.f(outputData, oi2.d.f225415a)) {
                                h.D2(bVar2.u);
                            } else {
                                if (!Intrinsics.f(outputData, oi2.e.f225416a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(bVar2, bVar2.u, WeroFlowContract$Step.Intro.f63050a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            j it9 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 3:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar3 = bVar;
                            bVar3.l2(new tgk.f(bVar3, (sh2.a) outputData2, null, 2), new yi5.b(26));
                            return Unit.f186387a;
                        case 4:
                            v outputData3 = (v) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar4 = bVar;
                            bVar4.l2(new com.revolut.feature.apm.wero.impl.ui.flow.a(bVar4, outputData3, null), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            gi2.c it10 = (gi2.c) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE12.H = block2;
            return viewControllerE12;
        }
        if (step instanceof WeroFlowContract$Step.Registration) {
            WeroRegistrationFlow weroRegistrationFlow = new WeroRegistrationFlow(new WeroRegistrationFlowContract$InputData(((WeroFlowContract$Step.Registration) step).f63056a));
            final int i3 = 1;
            Function1 block3 = new Function1() { // from class: th2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 1:
                            oi2.f outputData = (oi2.f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, oi2.c.f225414a);
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar2 = bVar;
                            if (zF || Intrinsics.f(outputData, oi2.d.f225415a)) {
                                h.D2(bVar2.u);
                            } else {
                                if (!Intrinsics.f(outputData, oi2.e.f225416a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(bVar2, bVar2.u, WeroFlowContract$Step.Intro.f63050a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            j it9 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 3:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar3 = bVar;
                            bVar3.l2(new tgk.f(bVar3, (sh2.a) outputData2, null, 2), new yi5.b(26));
                            return Unit.f186387a;
                        case 4:
                            v outputData3 = (v) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar4 = bVar;
                            bVar4.l2(new com.revolut.feature.apm.wero.impl.ui.flow.a(bVar4, outputData3, null), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            gi2.c it10 = (gi2.c) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            weroRegistrationFlow.H = block3;
            return weroRegistrationFlow;
        }
        if (step instanceof WeroFlowContract$Step.Area) {
            return new WeroHomeFlow(new WeroHomeFlowContract$InputData(uh2.b.FULL));
        }
        if (step instanceof WeroFlowContract$Step.PaymentArea) {
            return new WeroHomeFlow(new WeroHomeFlowContract$InputData(uh2.b.PAYMENT));
        }
        if (step instanceof WeroFlowContract$Step.NewContact) {
            ViewController viewControllerE13 = bVar.e1(bVar.f63059q.a(((WeroFlowContract$Step.NewContact) step).f63051a, hrf.f.OUTGOING, null));
            final int i5 = 2;
            Function1 block4 = new Function1() { // from class: th2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i5) {
                        case 0:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 1:
                            oi2.f outputData = (oi2.f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, oi2.c.f225414a);
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar2 = bVar;
                            if (zF || Intrinsics.f(outputData, oi2.d.f225415a)) {
                                h.D2(bVar2.u);
                            } else {
                                if (!Intrinsics.f(outputData, oi2.e.f225416a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(bVar2, bVar2.u, WeroFlowContract$Step.Intro.f63050a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            j it9 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 3:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar3 = bVar;
                            bVar3.l2(new tgk.f(bVar3, (sh2.a) outputData2, null, 2), new yi5.b(26));
                            return Unit.f186387a;
                        case 4:
                            v outputData3 = (v) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar4 = bVar;
                            bVar4.l2(new com.revolut.feature.apm.wero.impl.ui.flow.a(bVar4, outputData3, null), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            gi2.c it10 = (gi2.c) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            viewControllerE13.H = block4;
            return viewControllerE13;
        }
        if (step instanceof WeroFlowContract$Step.RecipientList) {
            ViewController viewControllerE14 = bVar.e1(bVar.f63060r.b(hrf.f.OUTGOING));
            final int i6 = 0;
            Function1 block5 = new Function1() { // from class: th2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i6) {
                        case 0:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 1:
                            oi2.f outputData = (oi2.f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, oi2.c.f225414a);
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar2 = bVar;
                            if (zF || Intrinsics.f(outputData, oi2.d.f225415a)) {
                                h.D2(bVar2.u);
                            } else {
                                if (!Intrinsics.f(outputData, oi2.e.f225416a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(bVar2, bVar2.u, WeroFlowContract$Step.Intro.f63050a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            j it9 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                        case 3:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar3 = bVar;
                            bVar3.l2(new tgk.f(bVar3, (sh2.a) outputData2, null, 2), new yi5.b(26));
                            return Unit.f186387a;
                        case 4:
                            v outputData3 = (v) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            com.revolut.feature.apm.wero.impl.ui.flow.b bVar4 = bVar;
                            bVar4.l2(new com.revolut.feature.apm.wero.impl.ui.flow.a(bVar4, outputData3, null), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            gi2.c it10 = (gi2.c) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            h.D2(bVar.u);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            viewControllerE14.H = block5;
            return viewControllerE14;
        }
        if (!(step instanceof WeroFlowContract$Step.Pay)) {
            throw new NoWhenBranchMatchedException();
        }
        WeroPayFlow weroPayFlow = new WeroPayFlow(new WeroPayFlowContract$InputData(((WeroFlowContract$Step.Pay) step).f63052a));
        final int i21 = 5;
        Function1 block6 = new Function1() { // from class: th2.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i21) {
                    case 0:
                        q it8 = (q) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        h.D2(bVar.u);
                        return Unit.f186387a;
                    case 1:
                        oi2.f outputData = (oi2.f) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean zF = Intrinsics.f(outputData, oi2.c.f225414a);
                        com.revolut.feature.apm.wero.impl.ui.flow.b bVar2 = bVar;
                        if (zF || Intrinsics.f(outputData, oi2.d.f225415a)) {
                            h.D2(bVar2.u);
                        } else {
                            if (!Intrinsics.f(outputData, oi2.e.f225416a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h.t2(bVar2, bVar2.u, WeroFlowContract$Step.Intro.f63050a, false, null, false, 12);
                        }
                        return Unit.f186387a;
                    case 2:
                        j it9 = (j) obj4;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        h.D2(bVar.u);
                        return Unit.f186387a;
                    case 3:
                        d12.d outputData2 = (d12.d) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        com.revolut.feature.apm.wero.impl.ui.flow.b bVar3 = bVar;
                        bVar3.l2(new tgk.f(bVar3, (sh2.a) outputData2, null, 2), new yi5.b(26));
                        return Unit.f186387a;
                    case 4:
                        v outputData3 = (v) obj4;
                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                        com.revolut.feature.apm.wero.impl.ui.flow.b bVar4 = bVar;
                        bVar4.l2(new com.revolut.feature.apm.wero.impl.ui.flow.a(bVar4, outputData3, null), new yi5.b(26));
                        return Unit.f186387a;
                    default:
                        gi2.c it10 = (gi2.c) obj4;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        h.D2(bVar.u);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block6, "block");
        weroPayFlow.H = block6;
        return weroPayFlow;
    }

    private final Object b(Object obj2, Object obj3) {
        th6.c cVar = (th6.c) this.f269151b;
        ExternalInstitutionAuthData params = (ExternalInstitutionAuthData) obj2;
        List list = (List) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(list, "list");
        cVar.f271269b.f(th6.c.a(params), list);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    private final Object c(Object obj2, Object obj3) {
        thh.f fVar = (thh.f) this.f269151b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return (lw0.h) fVar.f271388a.getValue();
    }

    private final Object d(Object obj2, Object obj3) {
        tjf.j jVar = (tjf.j) this.f269151b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return jVar.d.b(com.revolut.feature.transactions.impl.R$string.search_block_joint_transactions_title, "JOINT_TRANSACTIONS_SECTION_LIST_ID");
    }

    private final Object e(Object obj2, Object obj3) {
        PlanPartnersFlowContract$InputData planPartnersFlowContract$InputData = (PlanPartnersFlowContract$InputData) this.f269151b;
        yki.l FlowCoordinator = (yki.l) obj2;
        PlanPartnersFlowContract$Step step = (PlanPartnersFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PlanPartnersFlowContract$Step.ListPartners) {
            return new PlanPartnersOffersScreen(new PlanPartnersOffersScreenContract$InputData(planPartnersFlowContract$InputData.f103454a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.junior_rewards.impl.ui.list.a aVar = (com.revolut.feature.junior_rewards.impl.ui.list.a) this.f269151b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        JuniorRewardsListScreenContract$ModalStep step = (JuniorRewardsListScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof JuniorRewardsListScreenContract$ModalStep.JuniorRewardDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        JuniorRewardsListScreenContract$ModalStep.JuniorRewardDetails juniorRewardDetails = (JuniorRewardsListScreenContract$ModalStep.JuniorRewardDetails) step;
        JuniorRewardDetailsDialogScreen juniorRewardDetailsDialogScreen = new JuniorRewardDetailsDialogScreen(new JuniorRewardDetailsDialogScreenContract$InputData(juniorRewardDetails.f77235a, juniorRewardDetails.f77236b));
        tjf.e block = new tjf.e(aVar, 12);
        Intrinsics.checkNotNullParameter(block, "block");
        juniorRewardDetailsDialogScreen.H = block;
        return juniorRewardDetailsDialogScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        xil.d cVar;
        String str;
        final com.revolut.sso.impl.ui.email.change_flow.a aVar = (com.revolut.sso.impl.ui.email.change_flow.a) this.f269151b;
        ChangeEmailInputData changeEmailInputData = aVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        ChangeEmailFlowContract$Step step = (ChangeEmailFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ChangeEmailFlowContract$Step.ChooseAccountsToApplyChange) {
            ChangeEmailFlowContract$Step.ChooseAccountsToApplyChange chooseAccountsToApplyChange = (ChangeEmailFlowContract$Step.ChooseAccountsToApplyChange) step;
            final String str2 = chooseAccountsToApplyChange.f106513b;
            String str3 = chooseAccountsToApplyChange.f106514c;
            List list = chooseAccountsToApplyChange.f106512a;
            SsoChangeClaimMode ssoChangeClaimMode = changeEmailInputData.d;
            if (ssoChangeClaimMode instanceof SsoChangeClaimMode.Current) {
                str = str3;
            } else {
                if (!(ssoChangeClaimMode instanceof SsoChangeClaimMode.Multiple)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((SsoChangeClaimMode.Multiple) ssoChangeClaimMode).f105983a;
            }
            AccountsToApplyChangesBottomSheet accountsToApplyChangesBottomSheet = new AccountsToApplyChangesBottomSheet(new AccountsToApplyChangesBottomSheetContract$InputData(str3, str, list, ull.c.EMAIL));
            final int i = 0;
            Function1 block = new Function1() { // from class: tml.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i2 = i;
                    String str4 = str2;
                    com.revolut.sso.impl.ui.email.change_flow.a aVar2 = aVar;
                    switch (i2) {
                        case 0:
                            ull.d result = (ull.d) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            aVar2.l2(new i(aVar2, str4, result, null), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            tni.f result2 = (tni.f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            aVar2.f106524t.b();
                            if (result2 instanceof tni.c) {
                                IllegalStateException illegalStateException = new IllegalStateException("Unexpected result " + result2);
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                aVar2.P2(new tlf.n(3));
                                Unit unit = Unit.f186387a;
                            } else if (result2 instanceof tni.d) {
                                aVar2.l2(new k(aVar2, str4, null), new yi5.b(26));
                            } else {
                                if (!(result2 instanceof tni.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.l2(new l(aVar2, str4, result2, null), new yi5.b(26));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            accountsToApplyChangesBottomSheet.H = block;
            return accountsToApplyChangesBottomSheet;
        }
        if (step instanceof ChangeEmailFlowContract$Step.CreateNewEmail) {
            EnterEmailScreen enterEmailScreen = new EnterEmailScreen(new EnterEmailScreenContract$InputData(new EnterEmailScreenContract$InputData.Mode.Create(((ChangeEmailFlowContract$Step.CreateNewEmail) step).f106515a)));
            tml.d block2 = new tml.d(aVar, 5);
            Intrinsics.checkNotNullParameter(block2, "block");
            enterEmailScreen.H = block2;
            return enterEmailScreen;
        }
        if (!(step instanceof ChangeEmailFlowContract$Step.EvidenceRequired)) {
            if (!(step instanceof ChangeEmailFlowContract$Step.VerifyEmail)) {
                throw new NoWhenBranchMatchedException();
            }
            EnterEmailScreen enterEmailScreen2 = new EnterEmailScreen(new EnterEmailScreenContract$InputData(new EnterEmailScreenContract$InputData.Mode.Verify(((ChangeEmailFlowContract$Step.VerifyEmail) step).f106519a)));
            tml.d block3 = new tml.d(aVar, 4);
            Intrinsics.checkNotNullParameter(block3, "block");
            enterEmailScreen2.H = block3;
            return enterEmailScreen2;
        }
        ChangeEmailFlowContract$Step.EvidenceRequired evidenceRequired = (ChangeEmailFlowContract$Step.EvidenceRequired) step;
        final String str4 = evidenceRequired.f106516a;
        Challenge challenge = evidenceRequired.f106517b;
        ArrayList arrayList = evidenceRequired.f106518c;
        String str5 = challenge.d;
        String str6 = challenge.e;
        aVar.f106522r.getClass();
        ConfirmEmailWithOtpFlow confirmEmailWithOtpFlow = new ConfirmEmailWithOtpFlow(new ConfirmEmailWithOtpFlowContract$InputData(str5, str6, 60L, arrayList, changeEmailInputData.e, false, null));
        xjl.h hVar = aVar.f106524t;
        SsoChangeClaimMode ssoChangeClaimMode2 = changeEmailInputData.d;
        Intrinsics.checkNotNullParameter(ssoChangeClaimMode2, "<this>");
        if (ssoChangeClaimMode2 instanceof SsoChangeClaimMode.Current) {
            cVar = new xil.b(0);
        } else {
            if (!(ssoChangeClaimMode2 instanceof SsoChangeClaimMode.Multiple)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new xil.c(((SsoChangeClaimMode.Multiple) ssoChangeClaimMode2).f105983a);
        }
        hVar.c(new xil.a(str4, cVar));
        final int i2 = 1;
        Function1 block4 = new Function1() { // from class: tml.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i22 = i2;
                String str42 = str4;
                com.revolut.sso.impl.ui.email.change_flow.a aVar2 = aVar;
                switch (i22) {
                    case 0:
                        ull.d result = (ull.d) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        aVar2.l2(new i(aVar2, str42, result, null), new yi5.b(26));
                        return Unit.f186387a;
                    default:
                        tni.f result2 = (tni.f) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        aVar2.f106524t.b();
                        if (result2 instanceof tni.c) {
                            IllegalStateException illegalStateException = new IllegalStateException("Unexpected result " + result2);
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            aVar2.P2(new tlf.n(3));
                            Unit unit = Unit.f186387a;
                        } else if (result2 instanceof tni.d) {
                            aVar2.l2(new k(aVar2, str42, null), new yi5.b(26));
                        } else {
                            if (!(result2 instanceof tni.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.l2(new l(aVar2, str42, result2, null), new yi5.b(26));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block4, "block");
        confirmEmailWithOtpFlow.H = block4;
        return confirmEmailWithOtpFlow;
    }

    private final Object i(Object obj2, Object obj3) {
        tn7.d dVar = (tn7.d) this.f269151b;
        Function1 getDefaultErrorItems = (Function1) obj3;
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        return new tn7.g(tn7.k.b(dVar), (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null)), false);
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kotlin.Lazy] */
    private final Object j(Object obj2, Object obj3) {
        LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen = (LimitOrderAmountSelectorScreen) this.f269151b;
        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = LimitOrderAmountSelectorScreen.S;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        return new zp0.d(field.getEditText(), limitOrderAmountSelectorScreen.K.f89997a.e.f115083b, (u80.d) limitOrderAmountSelectorScreen.O.getValue(), null, new p56.a(limitOrderAmountSelectorScreen, 25), false, false, 0, false, null, 1928);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f269151b
            com.revolut.otp.input.flow.email.flow.a r0 = (com.revolut.otp.input.flow.email.flow.a) r0
            yki.l r12 = (yki.l) r12
            com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step r13 = (com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step) r13
            java.lang.String r1 = "$this$FlowCoordinator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r12 = "step"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r12)
            boolean r12 = r13 instanceof com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step.CheckEmail
            java.lang.String r1 = "block"
            if (r12 == 0) goto L4c
            com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$InputData r12 = r0.o
            java.lang.String r3 = r12.f98515a
            java.lang.String r13 = r12.f98516b
            r2 = 0
            if (r13 == 0) goto L2b
            od0.a r4 = od0.a.f224253a
            boolean r4 = od0.a.e()
            if (r4 == 0) goto L2b
            r4 = r13
            goto L2c
        L2b:
            r4 = r2
        L2c:
            long r5 = r12.f98517c
            java.util.List r7 = r12.d
            boolean r8 = r12.e
            boolean r9 = r12.f
            java.lang.Boolean r10 = r12.f98518g
            com.revolut.otp.input.flow.email.OtpEmailScreenContract$InputData r2 = new com.revolut.otp.input.flow.email.OtpEmailScreenContract$InputData
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            com.revolut.otp.input.flow.email.OtpEmailScreen r12 = new com.revolut.otp.input.flow.email.OtpEmailScreen
            r12.<init>(r2)
            tni.g r13 = new tni.g
            r2 = 1
            r13.<init>()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            r12.H = r13
            return r12
        L4c:
            boolean r12 = r13 instanceof com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step.NoEmailOnDevice
            if (r12 == 0) goto L70
            com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step$NoEmailOnDevice r13 = (com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step.NoEmailOnDevice) r13
            boolean r12 = r13.f98520a
            aii.o r13 = r0.l1()
            aii.h r0 = new aii.h
            xsa.a r1 = new xsa.a
            r1.<init>(r12)
            r0.<init>(r1)
            aii.n r12 = r13.M0(r0)
            java.lang.String r13 = "null cannot be cast to non-null type com.revolut.kompot.common.ControllerHolder"
            kotlin.jvm.internal.Intrinsics.i(r12, r13)
            aii.g r12 = (aii.g) r12
            com.revolut.kompot.navigable.vc.ViewController r12 = r12.f5285a
            return r12
        L70:
            boolean r12 = r13 instanceof com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step.NoEmailReceived
            if (r12 == 0) goto L90
            com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step$NoEmailReceived r13 = (com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step.NoEmailReceived) r13
            long r2 = r13.f98521a
            boolean r12 = r13.f98522b
            com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheet r13 = new com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheet
            com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheetContract$InputData r4 = new com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheetContract$InputData
            r4.<init>(r2, r12)
            r13.<init>(r4)
            tni.g r12 = new tni.g
            r2 = 0
            r12.<init>()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            r13.H = r12
            return r13
        L90:
            boolean r12 = r13 instanceof com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step.ResendMethods
            if (r12 == 0) goto Lae
            com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step$ResendMethods r13 = (com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step.ResendMethods) r13
            java.util.List r12 = r13.f98523a
            com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheet r13 = new com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheet
            com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheetContract$InputData r2 = new com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheetContract$InputData
            r2.<init>(r12)
            r13.<init>(r2)
            tni.g r12 = new tni.g
            r2 = 2
            r12.<init>()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            r13.H = r12
            return r13
        Lae:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ta8.a.k(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3) {
        r rVar = (r) this.f269151b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return new rnj.f(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_header_subtitle_generic, null, null, 14), ((tnj.d) rVar.f17429b).a(false));
    }

    private final Object m(Object obj2, Object obj3) {
        to2.f fVar = (to2.f) this.f269151b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        mn2.a aVar = fVar.f272498a;
        z zVarB = to2.n.b();
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_list_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_list_error_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_list_error_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new to2.l(to2.n.a(aVar), zhm.v.k(zVarB, model), false);
    }

    private final Object n(Object obj2, Object obj3) {
        com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b) this.f269151b;
        yki.l FlowCoordinator = (yki.l) obj2;
        JuniorAuthQrScannerFlowContract$Step step = (JuniorAuthQrScannerFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof JuniorAuthQrScannerFlowContract$Step.QrScanner) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_title, null, null, 14);
            od0.a aVar = od0.a.f224253a;
            BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration = new BarcodeQrReaderScreenSettings.ButtonConfiguration(new TextClause("[DEV] Simulate QR code scanning", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, LargeActionButton.ButtonStyle.o, null);
            Intrinsics.checkNotNullParameter(od0.a.f224253a, "<this>");
            BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration2 = od0.a.e() ? buttonConfiguration : null;
            BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration3 = new BarcodeQrReaderScreenSettings.ButtonConfiguration(new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_hint, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), LargeActionButton.ButtonStyle.f58726b, "TAG_QR_CODE_INSTRUCTION_BUTTON");
            rz.m mVar = rz.m.FIT;
            int i = R$color.camera_kit_white;
            BarcodeQrReaderFlow barcodeQrReaderFlow = new BarcodeQrReaderFlow(new BarcodeQrReaderFlowContract$InputData(new BarcodeQrReaderScreenSettings(textLocalisedClause, null, new Mask.QrCode(mVar, i, i, i, new QrCodeMaskModel(24.0f, 2.0f, 96.0f), 32), buttonConfiguration2, buttonConfiguration3), new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_prompt_camera_permission_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_prompt_camera_permission_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_prompt_camera_permission_button_settings, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), null)));
            su0.c block = new su0.c(1, bVar, com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b.class, "handleQrScanningResult", "handleQrScanningResult(Lcom/revolut/camerakit/revolut/ui/barcodeqr/BarcodeQrReaderFlowContract$OutputData;)V", 0, 19);
            Intrinsics.checkNotNullParameter(block, "block");
            barcodeQrReaderFlow.H = block;
            return barcodeQrReaderFlow;
        }
        if (step instanceof JuniorAuthQrScannerFlowContract$Step.QrCodeInstructionsDialog) {
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_prompt_description, u.c(((JuniorAuthQrScannerFlowContract$Step.QrCodeInstructionsDialog) step).f77316a), null, 12), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_prompt_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var = k9.Junior;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        }
        if (step instanceof JuniorAuthQrScannerFlowContract$Step.QrCodeChallenge) {
            JuniorAuthQrScannerFlowContract$Step.QrCodeChallenge qrCodeChallenge = (JuniorAuthQrScannerFlowContract$Step.QrCodeChallenge) step;
            return bVar.e1(new vil.h(new SsoQrConsentInputData(cjl.n.QrDelegated, qrCodeChallenge.f77314a, qrCodeChallenge.f77315b)));
        }
        if (!(step instanceof JuniorAuthQrScannerFlowContract$Step.EnterQrDataDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        EnterQrDataController enterQrDataController = new EnterQrDataController();
        to8.c block2 = new to8.c(bVar, 0);
        Intrinsics.checkNotNullParameter(block2, "block");
        enterQrDataController.H = block2;
        return enterQrDataController;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        TravelHotelsCheckoutParams travelHotelsCheckoutParams;
        Object obj4;
        HotelsPropertyInputData bookablePreview;
        ActionsBottomSheetController actionsBottomSheetController;
        lw0.a aVar;
        aw0.i hVar;
        Object obj5;
        Object next;
        int i = this.f269150a;
        final int i2 = 2;
        int i3 = 9;
        final int i5 = 3;
        int i6 = 10;
        boolean z = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z6 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z29 = true;
        Object obj6 = this.f269151b;
        switch (i) {
            case 0:
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = JuniorIsaNationalNumberScreen.S;
                Intrinsics.checkNotNullParameter((InputTextDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field, "field");
                return new y(field.getInnerEditText(), null, "[AA] [00] [00] [00] [A]", new z2((JuniorIsaNationalNumberScreen) obj6, 20), "NINO_INPUT_LIST_ID", null, false, 98);
            case 1:
                final com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a) obj6;
                p8g.c cVar = aVar2.o;
                final yki.l FlowCoordinator = (yki.l) obj2;
                final TravelHotelsCheckoutFlowContract$Step step = (TravelHotelsCheckoutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelHotelsCheckoutFlowContract$Step.SearchResults) {
                    TravelHotelsCheckoutFlowContract$Step.SearchResults searchResults = (TravelHotelsCheckoutFlowContract$Step.SearchResults) step;
                    TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = new TravelHotelsSearchResultsMapScreen(new TravelHotelsSearchResultsMapScreenContract$InputData(searchResults.f93718c, searchResults.f93716a, searchResults.f93717b));
                    final int i21 = 0;
                    Function1 block = new Function1() { // from class: tag.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i21) {
                                case 0:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar3 = aVar2;
                                    yki.a aVar4 = aVar3.f93721r;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z31 = output instanceof a.b;
                                    yki.l lVar = FlowCoordinator;
                                    if (z31) {
                                        oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.LocationPicker(false), true, null, false, 12);
                                    } else if (output instanceof b0) {
                                        b0 b0Var = (b0) output;
                                        oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(b0Var.f279365a, null, null, null, aVar3.J2(), 14), false, false), true, com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(b0Var.f279366b), null), false, 8);
                                    } else {
                                        boolean z41 = output instanceof a.C0573a;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup);
                                        } else {
                                            if (!(output instanceof a0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((a0) output).f279362a)), popup);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    tcg.m output2 = (tcg.m) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z49 = output2 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar5 = aVar2;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output2).f269792a, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                    } else if (output2 instanceof tcg.k) {
                                        oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.k) output2).f269794b, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                    } else if (output2 instanceof tcg.l) {
                                        j0 j0Var = aVar5.f93719p;
                                        String prompt = ((tcg.l) output2).f269795a;
                                        j0Var.getClass();
                                        Intrinsics.checkNotNullParameter(prompt, "prompt");
                                        j0Var.f159806a.onNext(prompt);
                                        aVar5.f93721r.e(false);
                                    } else if (!(output2 instanceof tcg.g) && !(output2 instanceof tcg.i) && !(output2 instanceof tcg.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar6 = aVar2;
                                    yki.a aVar7 = aVar6.f93721r;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a output3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z54 = output3 instanceof vag.g;
                                    yki.l lVar3 = FlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.RoomsSelection(((vag.g) output3).f287291a), true, null, false, 12);
                                    } else if (output3 instanceof vag.f) {
                                        aVar6.C2(new f(((vag.f) output3).f287290a));
                                    } else if (output3 instanceof vag.c) {
                                        oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.Checkout(((vag.c) output3).f287287a), true, null, false, 12);
                                    } else if (output3 instanceof vag.e) {
                                        aVar6.C2(new e(((vag.e) output3).f287289a));
                                    } else {
                                        boolean z74 = output3 instanceof a.C0567a;
                                        ModalDestination.Style.POPUP popup2 = ModalDestination.Style.POPUP.f98311a;
                                        if (z74) {
                                            oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup2);
                                        } else {
                                            if (!(output3 instanceof vag.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((vag.d) output3).f287288a)), popup2);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    geg.h output4 = (geg.h) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z83 = output4 instanceof geg.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar8 = aVar2;
                                    if (z83) {
                                        oki.h.t2(aVar8, FlowCoordinator, new TravelHotelsCheckoutFlowContract$Step.Checkout(((geg.f) output4).f143290a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof geg.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.C2(new g(((geg.g) output4).f143291a));
                                    }
                                    return Unit.f186387a;
                                default:
                                    m0 outputData = (m0) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z89 = outputData instanceof wbg.h0;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar9 = aVar2;
                                    if (z89) {
                                        aVar9.C2(new d(new TravelHotelsBookingDetailsParams(((wbg.h0) outputData).f296177a.f97887a, true)));
                                    } else {
                                        boolean z96 = outputData instanceof k0;
                                        yki.l lVar4 = FlowCoordinator;
                                        if (z96) {
                                            oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.RoomDetails(((k0) outputData).f296184a), true, null, false, 12);
                                        } else if (outputData instanceof l0) {
                                            aVar9.C2(new h(new TravelHotelsTravellerInformationEditScreenContract$InputData.Draft(((l0) outputData).f296186a)));
                                        } else if (outputData instanceof wbg.j0) {
                                            aVar9.C2(new g(((wbg.j0) outputData).f296182a));
                                        } else {
                                            if (!(outputData instanceof i0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i0 i0Var = (i0) outputData;
                                            oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(i0Var.f296179a, i0Var.f296180b))), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    travelHotelsSearchResultsMapScreen.H = block;
                    return travelHotelsSearchResultsMapScreen;
                }
                if (step instanceof TravelHotelsCheckoutFlowContract$Step.LocationPicker) {
                    TravelHotelsLocationPickerScreen travelHotelsLocationPickerScreen = new TravelHotelsLocationPickerScreen(new TravelHotelsLocationPickerScreenContract$InputData(((TravelHotelsCheckoutFlowContract$Step.LocationPicker) step).f93710a, true));
                    final boolean z31 = z3 ? 1 : 0;
                    Function1 block2 = new Function1() { // from class: tag.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (z31) {
                                case 0:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar3 = aVar2;
                                    yki.a aVar4 = aVar3.f93721r;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z312 = output instanceof a.b;
                                    yki.l lVar = FlowCoordinator;
                                    if (z312) {
                                        oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.LocationPicker(false), true, null, false, 12);
                                    } else if (output instanceof b0) {
                                        b0 b0Var = (b0) output;
                                        oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(b0Var.f279365a, null, null, null, aVar3.J2(), 14), false, false), true, com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(b0Var.f279366b), null), false, 8);
                                    } else {
                                        boolean z41 = output instanceof a.C0573a;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup);
                                        } else {
                                            if (!(output instanceof a0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((a0) output).f279362a)), popup);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    tcg.m output2 = (tcg.m) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z49 = output2 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar5 = aVar2;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output2).f269792a, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                    } else if (output2 instanceof tcg.k) {
                                        oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.k) output2).f269794b, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                    } else if (output2 instanceof tcg.l) {
                                        j0 j0Var = aVar5.f93719p;
                                        String prompt = ((tcg.l) output2).f269795a;
                                        j0Var.getClass();
                                        Intrinsics.checkNotNullParameter(prompt, "prompt");
                                        j0Var.f159806a.onNext(prompt);
                                        aVar5.f93721r.e(false);
                                    } else if (!(output2 instanceof tcg.g) && !(output2 instanceof tcg.i) && !(output2 instanceof tcg.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar6 = aVar2;
                                    yki.a aVar7 = aVar6.f93721r;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a output3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z54 = output3 instanceof vag.g;
                                    yki.l lVar3 = FlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.RoomsSelection(((vag.g) output3).f287291a), true, null, false, 12);
                                    } else if (output3 instanceof vag.f) {
                                        aVar6.C2(new f(((vag.f) output3).f287290a));
                                    } else if (output3 instanceof vag.c) {
                                        oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.Checkout(((vag.c) output3).f287287a), true, null, false, 12);
                                    } else if (output3 instanceof vag.e) {
                                        aVar6.C2(new e(((vag.e) output3).f287289a));
                                    } else {
                                        boolean z74 = output3 instanceof a.C0567a;
                                        ModalDestination.Style.POPUP popup2 = ModalDestination.Style.POPUP.f98311a;
                                        if (z74) {
                                            oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup2);
                                        } else {
                                            if (!(output3 instanceof vag.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((vag.d) output3).f287288a)), popup2);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    geg.h output4 = (geg.h) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z83 = output4 instanceof geg.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar8 = aVar2;
                                    if (z83) {
                                        oki.h.t2(aVar8, FlowCoordinator, new TravelHotelsCheckoutFlowContract$Step.Checkout(((geg.f) output4).f143290a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof geg.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.C2(new g(((geg.g) output4).f143291a));
                                    }
                                    return Unit.f186387a;
                                default:
                                    m0 outputData = (m0) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z89 = outputData instanceof wbg.h0;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar9 = aVar2;
                                    if (z89) {
                                        aVar9.C2(new d(new TravelHotelsBookingDetailsParams(((wbg.h0) outputData).f296177a.f97887a, true)));
                                    } else {
                                        boolean z96 = outputData instanceof k0;
                                        yki.l lVar4 = FlowCoordinator;
                                        if (z96) {
                                            oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.RoomDetails(((k0) outputData).f296184a), true, null, false, 12);
                                        } else if (outputData instanceof l0) {
                                            aVar9.C2(new h(new TravelHotelsTravellerInformationEditScreenContract$InputData.Draft(((l0) outputData).f296186a)));
                                        } else if (outputData instanceof wbg.j0) {
                                            aVar9.C2(new g(((wbg.j0) outputData).f296182a));
                                        } else {
                                            if (!(outputData instanceof i0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i0 i0Var = (i0) outputData;
                                            oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(i0Var.f296179a, i0Var.f296180b))), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    travelHotelsLocationPickerScreen.H = block2;
                    return travelHotelsLocationPickerScreen;
                }
                if (step instanceof TravelHotelsCheckoutFlowContract$Step.Property) {
                    TravelHotelsCheckoutFlowContract$Step.Property property = (TravelHotelsCheckoutFlowContract$Step.Property) step;
                    HotelsPropertyInputData hotelsPropertyInputData = property.f93711a;
                    if (((i9g.v) cVar).c()) {
                        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookableProperty) {
                            HotelsPropertyInputData.BookableProperty bookableProperty = (HotelsPropertyInputData.BookableProperty) hotelsPropertyInputData;
                            String strJ2 = aVar2.J2();
                            HotelsProperty hotelsProperty = bookableProperty.f93673b;
                            LocalDate localDate = bookableProperty.f93674c;
                            LocalDate localDate2 = bookableProperty.d;
                            List list = bookableProperty.e;
                            Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
                            bookablePreview = new HotelsPropertyInputData.BookableProperty(hotelsProperty, localDate, localDate2, list, strJ2);
                        } else if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookablePreview) {
                            HotelsPropertyInputData.BookablePreview bookablePreview2 = (HotelsPropertyInputData.BookablePreview) hotelsPropertyInputData;
                            String strJ22 = aVar2.J2();
                            HotelsPropertyPreview hotelsPropertyPreview = bookablePreview2.f93671b;
                            LocalDate localDate3 = bookablePreview2.f93672c;
                            LocalDate localDate4 = bookablePreview2.d;
                            List list2 = bookablePreview2.e;
                            Intrinsics.checkNotNullParameter(hotelsPropertyPreview, "hotelsPropertyPreview");
                            bookablePreview = new HotelsPropertyInputData.BookablePreview(hotelsPropertyPreview, localDate3, localDate4, list2, strJ22);
                        } else if (!(hotelsPropertyInputData instanceof HotelsPropertyInputData.BookedProperty)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hotelsPropertyInputData = bookablePreview;
                    }
                    TravelHotelsPropertyFlow travelHotelsPropertyFlow = new TravelHotelsPropertyFlow(new TravelHotelsPropertyFlowContract$InputData(hotelsPropertyInputData, property.f93712b, property.f93713c));
                    Function1 block3 = new Function1() { // from class: tag.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i2) {
                                case 0:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar3 = aVar2;
                                    yki.a aVar4 = aVar3.f93721r;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z312 = output instanceof a.b;
                                    yki.l lVar = FlowCoordinator;
                                    if (z312) {
                                        oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.LocationPicker(false), true, null, false, 12);
                                    } else if (output instanceof b0) {
                                        b0 b0Var = (b0) output;
                                        oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(b0Var.f279365a, null, null, null, aVar3.J2(), 14), false, false), true, com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(b0Var.f279366b), null), false, 8);
                                    } else {
                                        boolean z41 = output instanceof a.C0573a;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup);
                                        } else {
                                            if (!(output instanceof a0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((a0) output).f279362a)), popup);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    tcg.m output2 = (tcg.m) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z49 = output2 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar5 = aVar2;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output2).f269792a, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                    } else if (output2 instanceof tcg.k) {
                                        oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.k) output2).f269794b, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                    } else if (output2 instanceof tcg.l) {
                                        j0 j0Var = aVar5.f93719p;
                                        String prompt = ((tcg.l) output2).f269795a;
                                        j0Var.getClass();
                                        Intrinsics.checkNotNullParameter(prompt, "prompt");
                                        j0Var.f159806a.onNext(prompt);
                                        aVar5.f93721r.e(false);
                                    } else if (!(output2 instanceof tcg.g) && !(output2 instanceof tcg.i) && !(output2 instanceof tcg.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar6 = aVar2;
                                    yki.a aVar7 = aVar6.f93721r;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a output3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z54 = output3 instanceof vag.g;
                                    yki.l lVar3 = FlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.RoomsSelection(((vag.g) output3).f287291a), true, null, false, 12);
                                    } else if (output3 instanceof vag.f) {
                                        aVar6.C2(new f(((vag.f) output3).f287290a));
                                    } else if (output3 instanceof vag.c) {
                                        oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.Checkout(((vag.c) output3).f287287a), true, null, false, 12);
                                    } else if (output3 instanceof vag.e) {
                                        aVar6.C2(new e(((vag.e) output3).f287289a));
                                    } else {
                                        boolean z74 = output3 instanceof a.C0567a;
                                        ModalDestination.Style.POPUP popup2 = ModalDestination.Style.POPUP.f98311a;
                                        if (z74) {
                                            oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup2);
                                        } else {
                                            if (!(output3 instanceof vag.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((vag.d) output3).f287288a)), popup2);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    geg.h output4 = (geg.h) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z83 = output4 instanceof geg.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar8 = aVar2;
                                    if (z83) {
                                        oki.h.t2(aVar8, FlowCoordinator, new TravelHotelsCheckoutFlowContract$Step.Checkout(((geg.f) output4).f143290a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof geg.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.C2(new g(((geg.g) output4).f143291a));
                                    }
                                    return Unit.f186387a;
                                default:
                                    m0 outputData = (m0) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z89 = outputData instanceof wbg.h0;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar9 = aVar2;
                                    if (z89) {
                                        aVar9.C2(new d(new TravelHotelsBookingDetailsParams(((wbg.h0) outputData).f296177a.f97887a, true)));
                                    } else {
                                        boolean z96 = outputData instanceof k0;
                                        yki.l lVar4 = FlowCoordinator;
                                        if (z96) {
                                            oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.RoomDetails(((k0) outputData).f296184a), true, null, false, 12);
                                        } else if (outputData instanceof l0) {
                                            aVar9.C2(new h(new TravelHotelsTravellerInformationEditScreenContract$InputData.Draft(((l0) outputData).f296186a)));
                                        } else if (outputData instanceof wbg.j0) {
                                            aVar9.C2(new g(((wbg.j0) outputData).f296182a));
                                        } else {
                                            if (!(outputData instanceof i0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i0 i0Var = (i0) outputData;
                                            oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(i0Var.f296179a, i0Var.f296180b))), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    travelHotelsPropertyFlow.H = block3;
                    obj4 = travelHotelsPropertyFlow;
                } else {
                    if (step instanceof TravelHotelsCheckoutFlowContract$Step.RoomsSelection) {
                        TravelHotelsRoomsSelectionFlow travelHotelsRoomsSelectionFlow = new TravelHotelsRoomsSelectionFlow(new TravelHotelsRoomsSelectionScreenContract$InputData(((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) step).f93715a));
                        final int i22 = 0;
                        Function1 block4 = new Function1() { // from class: tag.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i22) {
                                    case 0:
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar3 = aVar2;
                                        p8g.c cVar2 = aVar3.o;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a) obj7;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        boolean z41 = output instanceof a.C0571a;
                                        yki.l lVar = FlowCoordinator;
                                        TravelHotelsCheckoutFlowContract$Step travelHotelsCheckoutFlowContract$Step = step;
                                        if (z41) {
                                            String strJ23 = ((i9g.v) cVar2).c() ? aVar3.J2() : ((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) travelHotelsCheckoutFlowContract$Step).f93715a.f93663a;
                                            TravelHotelsRoomsSelectionParams travelHotelsRoomsSelectionParams = ((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) travelHotelsCheckoutFlowContract$Step).f93715a;
                                            oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.Checkout(new TravelHotelsCheckoutParams(strJ23, travelHotelsRoomsSelectionParams.f93664b, travelHotelsRoomsSelectionParams.f93665c, travelHotelsRoomsSelectionParams.d, travelHotelsRoomsSelectionParams.e, ((a.C0571a) output).f94017a)), true, null, false, 12);
                                        } else if (output instanceof o) {
                                            o oVar = (o) output;
                                            HotelsPropertyRoom hotelsPropertyRoom = oVar.f160726a.f98104a;
                                            String str = hotelsPropertyRoom.f98099b;
                                            ArrayList arrayList = hotelsPropertyRoom.d;
                                            Area area = hotelsPropertyRoom.f98102h;
                                            List list3 = oVar.f160727b;
                                            String strJ24 = ((i9g.v) cVar2).c() ? aVar3.J2() : ((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) travelHotelsCheckoutFlowContract$Step).f93715a.f93663a;
                                            TravelHotelsRoomsSelectionParams travelHotelsRoomsSelectionParams2 = ((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) travelHotelsCheckoutFlowContract$Step).f93715a;
                                            oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.RoomDetails(new TravelHotelsRoomDetailsParams(str, area, arrayList, list3, strJ24, true, travelHotelsRoomsSelectionParams2.f93664b, travelHotelsRoomsSelectionParams2.f93665c, travelHotelsRoomsSelectionParams2.d, travelHotelsRoomsSelectionParams2.e, u.c(oVar.f160728c))), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                        } else {
                                            if (!(output instanceof n)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            n nVar = (n) output;
                                            HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = nVar.f160723a;
                                            OccupancyRates occupancyRates = hotelsPropertyRoomOccupancyRatesSelection.f98106c;
                                            aVar3.C2(new g(new TravelHotelsPriceBreakdownScreenContract$InputData(u.c(occupancyRates.f98114c), hotelsPropertyRoomOccupancyRatesSelection.f98105b.f98116b, nVar.f160724b, h9g.m.h(occupancyRates.f98114c), null, null, nVar.f160725c)));
                                        }
                                        return Unit.f186387a;
                                    default:
                                        ycg.f it8 = (ycg.f) obj7;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        oki.h.t2(aVar2, FlowCoordinator, ((TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow) step).f93707b, false, null, false, 12);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block4, "block");
                        travelHotelsRoomsSelectionFlow.H = block4;
                        return travelHotelsRoomsSelectionFlow;
                    }
                    if (step instanceof TravelHotelsCheckoutFlowContract$Step.RoomDetails) {
                        TravelHotelsRoomDetailsScreen travelHotelsRoomDetailsScreen = new TravelHotelsRoomDetailsScreen(new TravelHotelsRoomDetailsScreenContract$InputData(((TravelHotelsCheckoutFlowContract$Step.RoomDetails) step).f93714a));
                        Function1 block5 = new Function1() { // from class: tag.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i5) {
                                    case 0:
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar3 = aVar2;
                                        yki.a aVar4 = aVar3.f93721r;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a) obj7;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        boolean z312 = output instanceof a.b;
                                        yki.l lVar = FlowCoordinator;
                                        if (z312) {
                                            oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.LocationPicker(false), true, null, false, 12);
                                        } else if (output instanceof b0) {
                                            b0 b0Var = (b0) output;
                                            oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(b0Var.f279365a, null, null, null, aVar3.J2(), 14), false, false), true, com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(b0Var.f279366b), null), false, 8);
                                        } else {
                                            boolean z41 = output instanceof a.C0573a;
                                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                            if (z41) {
                                                oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup);
                                            } else {
                                                if (!(output instanceof a0)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((a0) output).f279362a)), popup);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        tcg.m output2 = (tcg.m) obj7;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        boolean z49 = output2 instanceof tcg.j;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar5 = aVar2;
                                        yki.l lVar2 = FlowCoordinator;
                                        if (z49) {
                                            oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output2).f269792a, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                        } else if (output2 instanceof tcg.k) {
                                            oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.k) output2).f269794b, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                        } else if (output2 instanceof tcg.l) {
                                            j0 j0Var = aVar5.f93719p;
                                            String prompt = ((tcg.l) output2).f269795a;
                                            j0Var.getClass();
                                            Intrinsics.checkNotNullParameter(prompt, "prompt");
                                            j0Var.f159806a.onNext(prompt);
                                            aVar5.f93721r.e(false);
                                        } else if (!(output2 instanceof tcg.g) && !(output2 instanceof tcg.i) && !(output2 instanceof tcg.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar6 = aVar2;
                                        yki.a aVar7 = aVar6.f93721r;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a output3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a) obj7;
                                        Intrinsics.checkNotNullParameter(output3, "output");
                                        boolean z54 = output3 instanceof vag.g;
                                        yki.l lVar3 = FlowCoordinator;
                                        if (z54) {
                                            oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.RoomsSelection(((vag.g) output3).f287291a), true, null, false, 12);
                                        } else if (output3 instanceof vag.f) {
                                            aVar6.C2(new f(((vag.f) output3).f287290a));
                                        } else if (output3 instanceof vag.c) {
                                            oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.Checkout(((vag.c) output3).f287287a), true, null, false, 12);
                                        } else if (output3 instanceof vag.e) {
                                            aVar6.C2(new e(((vag.e) output3).f287289a));
                                        } else {
                                            boolean z74 = output3 instanceof a.C0567a;
                                            ModalDestination.Style.POPUP popup2 = ModalDestination.Style.POPUP.f98311a;
                                            if (z74) {
                                                oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup2);
                                            } else {
                                                if (!(output3 instanceof vag.d)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((vag.d) output3).f287288a)), popup2);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        geg.h output4 = (geg.h) obj7;
                                        Intrinsics.checkNotNullParameter(output4, "output");
                                        boolean z83 = output4 instanceof geg.f;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar8 = aVar2;
                                        if (z83) {
                                            oki.h.t2(aVar8, FlowCoordinator, new TravelHotelsCheckoutFlowContract$Step.Checkout(((geg.f) output4).f143290a), true, null, false, 12);
                                        } else {
                                            if (!(output4 instanceof geg.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar8.C2(new g(((geg.g) output4).f143291a));
                                        }
                                        return Unit.f186387a;
                                    default:
                                        m0 outputData = (m0) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z89 = outputData instanceof wbg.h0;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar9 = aVar2;
                                        if (z89) {
                                            aVar9.C2(new d(new TravelHotelsBookingDetailsParams(((wbg.h0) outputData).f296177a.f97887a, true)));
                                        } else {
                                            boolean z96 = outputData instanceof k0;
                                            yki.l lVar4 = FlowCoordinator;
                                            if (z96) {
                                                oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.RoomDetails(((k0) outputData).f296184a), true, null, false, 12);
                                            } else if (outputData instanceof l0) {
                                                aVar9.C2(new h(new TravelHotelsTravellerInformationEditScreenContract$InputData.Draft(((l0) outputData).f296186a)));
                                            } else if (outputData instanceof wbg.j0) {
                                                aVar9.C2(new g(((wbg.j0) outputData).f296182a));
                                            } else {
                                                if (!(outputData instanceof i0)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                i0 i0Var = (i0) outputData;
                                                oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(i0Var.f296179a, i0Var.f296180b))), true, null, false, 12);
                                            }
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block5, "block");
                        travelHotelsRoomDetailsScreen.H = block5;
                        return travelHotelsRoomDetailsScreen;
                    }
                    if (!(step instanceof TravelHotelsCheckoutFlowContract$Step.Checkout)) {
                        if (step instanceof TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow) {
                            TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen = new TravelHotelsDatesPickerScreen(((TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow) step).f93706a);
                            final boolean z41 = z ? 1 : 0;
                            Function1 block6 = new Function1() { // from class: tag.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (z41) {
                                        case 0:
                                            com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar3 = aVar2;
                                            p8g.c cVar2 = aVar3.o;
                                            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a) obj7;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            boolean z412 = output instanceof a.C0571a;
                                            yki.l lVar = FlowCoordinator;
                                            TravelHotelsCheckoutFlowContract$Step travelHotelsCheckoutFlowContract$Step = step;
                                            if (z412) {
                                                String strJ23 = ((i9g.v) cVar2).c() ? aVar3.J2() : ((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) travelHotelsCheckoutFlowContract$Step).f93715a.f93663a;
                                                TravelHotelsRoomsSelectionParams travelHotelsRoomsSelectionParams = ((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) travelHotelsCheckoutFlowContract$Step).f93715a;
                                                oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.Checkout(new TravelHotelsCheckoutParams(strJ23, travelHotelsRoomsSelectionParams.f93664b, travelHotelsRoomsSelectionParams.f93665c, travelHotelsRoomsSelectionParams.d, travelHotelsRoomsSelectionParams.e, ((a.C0571a) output).f94017a)), true, null, false, 12);
                                            } else if (output instanceof o) {
                                                o oVar = (o) output;
                                                HotelsPropertyRoom hotelsPropertyRoom = oVar.f160726a.f98104a;
                                                String str = hotelsPropertyRoom.f98099b;
                                                ArrayList arrayList = hotelsPropertyRoom.d;
                                                Area area = hotelsPropertyRoom.f98102h;
                                                List list3 = oVar.f160727b;
                                                String strJ24 = ((i9g.v) cVar2).c() ? aVar3.J2() : ((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) travelHotelsCheckoutFlowContract$Step).f93715a.f93663a;
                                                TravelHotelsRoomsSelectionParams travelHotelsRoomsSelectionParams2 = ((TravelHotelsCheckoutFlowContract$Step.RoomsSelection) travelHotelsCheckoutFlowContract$Step).f93715a;
                                                oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.RoomDetails(new TravelHotelsRoomDetailsParams(str, area, arrayList, list3, strJ24, true, travelHotelsRoomsSelectionParams2.f93664b, travelHotelsRoomsSelectionParams2.f93665c, travelHotelsRoomsSelectionParams2.d, travelHotelsRoomsSelectionParams2.e, u.c(oVar.f160728c))), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                            } else {
                                                if (!(output instanceof n)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                n nVar = (n) output;
                                                HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = nVar.f160723a;
                                                OccupancyRates occupancyRates = hotelsPropertyRoomOccupancyRatesSelection.f98106c;
                                                aVar3.C2(new g(new TravelHotelsPriceBreakdownScreenContract$InputData(u.c(occupancyRates.f98114c), hotelsPropertyRoomOccupancyRatesSelection.f98105b.f98116b, nVar.f160724b, h9g.m.h(occupancyRates.f98114c), null, null, nVar.f160725c)));
                                            }
                                            return Unit.f186387a;
                                        default:
                                            ycg.f it8 = (ycg.f) obj7;
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            oki.h.t2(aVar2, FlowCoordinator, ((TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow) step).f93707b, false, null, false, 12);
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block6, "block");
                            travelHotelsDatesPickerScreen.H = block6;
                            return travelHotelsDatesPickerScreen;
                        }
                        if (step instanceof TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal) {
                            return new TravelHotelsDatesPickerScreen(((TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal) step).f93708a);
                        }
                        if (step instanceof TravelHotelsCheckoutFlowContract$Step.GuestPicker) {
                            return new TravelHotelsGuestPickerScreen(((TravelHotelsCheckoutFlowContract$Step.GuestPicker) step).f93709a);
                        }
                        if (step instanceof TravelHotelsCheckoutFlowContract$Step.CancellationPolicy) {
                            return new TravelHotelsCancellationPolicyScreen(((TravelHotelsCheckoutFlowContract$Step.CancellationPolicy) step).f93704a);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((i9g.v) cVar).c()) {
                        TravelHotelsCheckoutParams travelHotelsCheckoutParams2 = ((TravelHotelsCheckoutFlowContract$Step.Checkout) step).f93705a;
                        String draftId = aVar2.J2();
                        String propertyId = travelHotelsCheckoutParams2.f93651b;
                        LocalDate localDate5 = travelHotelsCheckoutParams2.f93652c;
                        LocalDate localDate6 = travelHotelsCheckoutParams2.d;
                        List list3 = travelHotelsCheckoutParams2.e;
                        List list4 = travelHotelsCheckoutParams2.f;
                        Intrinsics.checkNotNullParameter(draftId, "draftId");
                        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
                        travelHotelsCheckoutParams = new TravelHotelsCheckoutParams(draftId, propertyId, localDate5, localDate6, list3, list4);
                    } else {
                        travelHotelsCheckoutParams = ((TravelHotelsCheckoutFlowContract$Step.Checkout) step).f93705a;
                    }
                    TravelHotelsCheckoutScreen travelHotelsCheckoutScreen = new TravelHotelsCheckoutScreen(new TravelHotelsCheckoutScreenContract$InputData(travelHotelsCheckoutParams));
                    final int i32 = 4;
                    Function1 block7 = new Function1() { // from class: tag.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i32) {
                                case 0:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar3 = aVar2;
                                    yki.a aVar4 = aVar3.f93721r;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z312 = output instanceof a.b;
                                    yki.l lVar = FlowCoordinator;
                                    if (z312) {
                                        oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.LocationPicker(false), true, null, false, 12);
                                    } else if (output instanceof b0) {
                                        b0 b0Var = (b0) output;
                                        oki.h.t2(aVar3, lVar, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(b0Var.f279365a, null, null, null, aVar3.J2(), 14), false, false), true, com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(b0Var.f279366b), null), false, 8);
                                    } else {
                                        boolean z412 = output instanceof a.C0573a;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z412) {
                                            oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup);
                                        } else {
                                            if (!(output instanceof a0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.w2(aVar4, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((a0) output).f279362a)), popup);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    tcg.m output2 = (tcg.m) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z49 = output2 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar5 = aVar2;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output2).f269792a, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                    } else if (output2 instanceof tcg.k) {
                                        oki.h.t2(aVar5, lVar2, new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookableProperty(((tcg.k) output2).f269794b, null, null, null, aVar5.J2(), 14), false, false), true, null, false, 12);
                                    } else if (output2 instanceof tcg.l) {
                                        j0 j0Var = aVar5.f93719p;
                                        String prompt = ((tcg.l) output2).f269795a;
                                        j0Var.getClass();
                                        Intrinsics.checkNotNullParameter(prompt, "prompt");
                                        j0Var.f159806a.onNext(prompt);
                                        aVar5.f93721r.e(false);
                                    } else if (!(output2 instanceof tcg.g) && !(output2 instanceof tcg.i) && !(output2 instanceof tcg.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar6 = aVar2;
                                    yki.a aVar7 = aVar6.f93721r;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a output3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z54 = output3 instanceof vag.g;
                                    yki.l lVar3 = FlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.RoomsSelection(((vag.g) output3).f287291a), true, null, false, 12);
                                    } else if (output3 instanceof vag.f) {
                                        aVar6.C2(new f(((vag.f) output3).f287290a));
                                    } else if (output3 instanceof vag.c) {
                                        oki.h.t2(aVar6, lVar3, new TravelHotelsCheckoutFlowContract$Step.Checkout(((vag.c) output3).f287287a), true, null, false, 12);
                                    } else if (output3 instanceof vag.e) {
                                        aVar6.C2(new e(((vag.e) output3).f287289a));
                                    } else {
                                        boolean z74 = output3 instanceof a.C0567a;
                                        ModalDestination.Style.POPUP popup2 = ModalDestination.Style.POPUP.f98311a;
                                        if (z74) {
                                            oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0)), popup2);
                                        } else {
                                            if (!(output3 instanceof vag.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.w2(aVar7, new TravelHotelsCheckoutFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((vag.d) output3).f287288a)), popup2);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    geg.h output4 = (geg.h) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z83 = output4 instanceof geg.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar8 = aVar2;
                                    if (z83) {
                                        oki.h.t2(aVar8, FlowCoordinator, new TravelHotelsCheckoutFlowContract$Step.Checkout(((geg.f) output4).f143290a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof geg.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.C2(new g(((geg.g) output4).f143291a));
                                    }
                                    return Unit.f186387a;
                                default:
                                    m0 outputData = (m0) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z89 = outputData instanceof wbg.h0;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a aVar9 = aVar2;
                                    if (z89) {
                                        aVar9.C2(new d(new TravelHotelsBookingDetailsParams(((wbg.h0) outputData).f296177a.f97887a, true)));
                                    } else {
                                        boolean z96 = outputData instanceof k0;
                                        yki.l lVar4 = FlowCoordinator;
                                        if (z96) {
                                            oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.RoomDetails(((k0) outputData).f296184a), true, null, false, 12);
                                        } else if (outputData instanceof l0) {
                                            aVar9.C2(new h(new TravelHotelsTravellerInformationEditScreenContract$InputData.Draft(((l0) outputData).f296186a)));
                                        } else if (outputData instanceof wbg.j0) {
                                            aVar9.C2(new g(((wbg.j0) outputData).f296182a));
                                        } else {
                                            if (!(outputData instanceof i0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i0 i0Var = (i0) outputData;
                                            oki.h.t2(aVar9, lVar4, new TravelHotelsCheckoutFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(i0Var.f296179a, i0Var.f296180b))), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    travelHotelsCheckoutScreen.H = block7;
                    obj4 = travelHotelsCheckoutScreen;
                }
                return obj4;
            case 2:
                final com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SummaryScreenContract$ModalStep step2 = (SummaryScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof SummaryScreenContract$ModalStep.RemoveDocumentConfirmation) {
                    SummaryScreenContract$ModalStep.RemoveDocumentConfirmation removeDocumentConfirmation = (SummaryScreenContract$ModalStep.RemoveDocumentConfirmation) step2;
                    lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_remove_document_dialog_title, u.c(removeDocumentConfirmation.f67736a.f258207a.getName()), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_remove_document_dialog_description, null, null, 14), null, null, false, 28);
                    aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_remove_document_dialog_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_remove_document_dialog_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar3, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    t8e.c block8 = new t8e.c(hVar2, removeDocumentConfirmation, 7);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    actionsBottomSheetController2.H = block8;
                    return actionsBottomSheetController2;
                }
                if (step2 instanceof SummaryScreenContract$ModalStep.RevokeRevolutAccount) {
                    g0 g0Var = ((SummaryScreenContract$ModalStep.RevokeRevolutAccount) step2).f67737a;
                    lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revoke_revolut_dialog_title_v2, u.c(g0Var.f308898a), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revoke_revolut_dialog_description_v2, u.c(g0Var.f308899b), null, 12), null, null, false, 28);
                    aw0.g gVar2 = new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revoke_revolut_dialog_action_back_v2, u.c(g0Var.f308900c), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revoke_revolut_dialog_action_confirm_v2, u.c(g0Var.d), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var2 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar4, gVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                    final boolean z49 = z4 ? 1 : 0;
                    Function1 block9 = new Function1() { // from class: tb4.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i33 = z49;
                            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar3 = hVar2;
                            dii.g outputData = (dii.g) obj7;
                            switch (i33) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        hVar3.I2();
                                    } else {
                                        if (!(outputData instanceof dii.f) && !(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i43 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.f) {
                                        hVar3.n2(new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.d(hVar3, null), new whi.b(6));
                                    } else {
                                        if (!(outputData instanceof dii.e) && !(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i59 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    actionsBottomSheetController3.H = block9;
                    return actionsBottomSheetController3;
                }
                if (step2 instanceof SummaryScreenContract$ModalStep.RevolutAccountDetails) {
                    SummaryScreenContract$ModalStep.RevolutAccountDetails revolutAccountDetails = (SummaryScreenContract$ModalStep.RevolutAccountDetails) step2;
                    xu3.h0 h0Var = revolutAccountDetails.f67738a;
                    f0 f0Var = h0Var.f308905b;
                    if (f0Var instanceof d0) {
                        aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_description, null, null, 14), null, null, false, 28);
                    } else {
                        if (!(f0Var instanceof e0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e0 e0Var = (e0) f0Var;
                        aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_title_v2, u.c(e0Var.f308889a), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_description_v2, u.c(e0Var.f308890b), null, 12), null, null, false, 28);
                    }
                    f0 f0Var2 = h0Var.f308905b;
                    if (f0Var2 instanceof d0) {
                        hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_action_revoke, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    } else {
                        if (!(f0Var2 instanceof e0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e0 e0Var2 = (e0) f0Var2;
                        String str = e0Var2.f308891c;
                        String str2 = e0Var2.d;
                        hVar = str2 != null ? new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_action_got_it_v2, u.c(str), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_action_revoke_v2, u.c(str2), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121) : new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_popup_action_got_it_v2, u.c(str), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    }
                    k9 k9Var3 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                    t8e.c block10 = new t8e.c(hVar2, revolutAccountDetails, 5);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    actionsBottomSheetController.H = block10;
                } else {
                    if (!(step2 instanceof SummaryScreenContract$ModalStep.RevolutOnlyConfirmation)) {
                        if (!(step2 instanceof SummaryScreenContract$ModalStep.TransactionManagement)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SummaryScreenContract$ModalStep.TransactionManagement transactionManagement = (SummaryScreenContract$ModalStep.TransactionManagement) step2;
                        lw0.a aVar5 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_transaction_popup_title, u.c(transactionManagement.f67740a), null, 12), null, null, null, false, 30);
                        boolean z54 = false;
                        List listK = zhm.v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_transaction_popup_action_details, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_info_outline, null, null, 6), null, null, z54, null, false, 62), true, z54, (RowDelegate.Model.c) (false ? 1 : 0), (Object) "transaction-management-view-details-action", 232), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_transaction_popup_action_remove, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_cross_small, null, null, 6), null, null, z54, false ? 1 : 0, false, 62), true, z54, (RowDelegate.Model.c) (false ? 1 : 0), (Object) "transaction-management-remove-action", 232));
                        k9 value = k9.Credit;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar5, null, listK, new AnalyticsProduct.Retail(value), null));
                        t8e.c block11 = new t8e.c(hVar2, transactionManagement, 6);
                        Intrinsics.checkNotNullParameter(block11, "block");
                        rowActionsBottomSheetController.H = block11;
                        return rowActionsBottomSheetController;
                    }
                    xu3.i0 i0Var = ((SummaryScreenContract$ModalStep.RevolutOnlyConfirmation) step2).f67739a;
                    lw0.a aVar6 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_only_confirmation_popup_title, u.c(i0Var.f308908a), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_only_confirmation_popup_description, u.c(i0Var.f308909b), null, 12), null, null, false, 28);
                    aw0.h hVar3 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_only_confirmation_popup_action_confirm, u.c(i0Var.d), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_only_confirmation_popup_action_back, u.c(i0Var.f308910c), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var4 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar6, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                    final int i33 = 0;
                    Function1 block12 = new Function1() { // from class: tb4.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i332 = i33;
                            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar32 = hVar2;
                            dii.g outputData = (dii.g) obj7;
                            switch (i332) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        hVar32.I2();
                                    } else {
                                        if (!(outputData instanceof dii.f) && !(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i43 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.f) {
                                        hVar32.n2(new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.d(hVar32, null), new whi.b(6));
                                    } else {
                                        if (!(outputData instanceof dii.e) && !(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i59 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    actionsBottomSheetController.H = block12;
                }
                return actionsBottomSheetController;
            case 3:
                com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar2 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CharityDetailsScreenContract$Step step3 = (CharityDetailsScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof CharityDetailsScreenContract$Step.DonateWithRevPointsBottomSheet)) {
                    if (!(step3 instanceof CharityDetailsScreenContract$Step.SpareChange)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CharityDetailsScreenContract$Step.SpareChange spareChange = (CharityDetailsScreenContract$Step.SpareChange) step3;
                    return new SpareChangeScreen(new SpareChangeContract$InputData(spareChange.f72065a, spareChange.f72066b));
                }
                cli.y yVar = cVar2.J;
                DonateWithPointsScreen donateWithPointsScreen = new DonateWithPointsScreen(new DonateWithPointsContract$InputData(cVar2.o.f72063a, (xi0.b) zi0.c.I(((tb6.m) ((j2) yVar.f22677a).getValue()).e), ((ba6.l) zi0.c.I(((tb6.m) ((j2) yVar.f22677a).getValue()).f269480a)).f13942h.f115083b));
                t block13 = new t(cVar2, z6 ? 1 : 0);
                Intrinsics.checkNotNullParameter(block13, "block");
                donateWithPointsScreen.H = block13;
                return donateWithPointsScreen;
            case 4:
                tb9.g gVar3 = (tb9.g) obj6;
                OnboardingSelfieFlowContract$Step step4 = (OnboardingSelfieFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                gVar3.o.getClass();
                CaptureMode.AutoCaptureTimeout autoCaptureTimeout = new CaptureMode.AutoCaptureTimeout(30000L);
                CameraCaptureSettings.Photo.INSTANCE.getClass();
                BiometricVerificationStep.Selfie step5 = new BiometricVerificationStep.Selfie(zhm.f0.f322471a, autoCaptureTimeout, new CameraCaptureSettings.Compound(CameraCaptureSettings.Photo.f50697g, new CameraCaptureSettings.Video((VideoDuration) new VideoDuration.Fixed(2000L), 720, (VideoEncodingBitRate) VideoEncodingBitRate.Default.f50741a, false, (String) null, (yw.n) null, (VideoImuDataCollectionSettings) null, (WatermarkSettings) null, 496)), BiometricVerificationFeatures.Companion.a(BiometricVerificationFeatures.INSTANCE));
                AnalyticsContext.INSTANCE.getClass();
                w0 w0VarA = AnalyticsContext.Companion.a(null);
                new BiometricVerificationSelfieStepFlowProvider$InputData(step5, null, true, w0VarA, false);
                sd9.a aVar7 = step4.f78487a.isEmpty() ? null : new sd9.a(step4.f78487a);
                Intrinsics.checkNotNullParameter(step5, "step");
                BiometricVerificationSelfieStepFlowProvider$InputData inputData = new BiometricVerificationSelfieStepFlowProvider$InputData(step5, aVar7, false, w0VarA, false);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                BiometricVerificationSelfieStepFlow biometricVerificationSelfieStepFlow = new BiometricVerificationSelfieStepFlow(inputData);
                t5e.m block14 = new t5e.m(gVar3, 25);
                Intrinsics.checkNotNullParameter(block14, "block");
                biometricVerificationSelfieStepFlow.H = block14;
                gVar3.f269512q.a();
                return biometricVerificationSelfieStepFlow;
            case 5:
                com.revolut.feature.apm.qvik.impl.ui.pay.a aVar8 = (com.revolut.feature.apm.qvik.impl.ui.pay.a) obj6;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                QvikPayFlowContract$Step step6 = (QvikPayFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof QvikPayFlowContract$Step.Scanner) {
                    ViewController viewControllerE1 = aVar8.e1(new g12.k(new QrScannerInputData(), aVar8.f62821p));
                    t5e.m block15 = new t5e.m(aVar8, 27);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    viewControllerE1.H = block15;
                    return viewControllerE1;
                }
                if (!(step6 instanceof QvikPayFlowContract$Step.Transfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                QvikPayFlowContract$Step.Transfer transfer = (QvikPayFlowContract$Step.Transfer) step6;
                ViewController viewControllerE12 = aVar8.e1(new p0(transfer.f62819a));
                t8e.c block16 = new t8e.c(transfer, aVar8, i3);
                Intrinsics.checkNotNullParameter(block16, "block");
                viewControllerE12.H = block16;
                return viewControllerE12;
            case 6:
                com.revolut.feature.onboarding.impl.revolut_card_ready.flow.a aVar9 = (com.revolut.feature.onboarding.impl.revolut_card_ready.flow.a) obj6;
                RevolutCardReadyFlowContract$Step step7 = (RevolutCardReadyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, RevolutCardReadyFlowContract$Step.RevolutCardStep.f78575a)) {
                    throw new NoWhenBranchMatchedException();
                }
                RevolutCardReadyFlowContract$InputData revolutCardReadyFlowContract$InputData = aVar9.o;
                RevolutCardReadyScreen revolutCardReadyScreen = new RevolutCardReadyScreen(new RevolutCardReadyScreenContract$InputData(revolutCardReadyFlowContract$InputData.f78573a, revolutCardReadyFlowContract$InputData.f78574b));
                t5e.m block17 = new t5e.m(aVar9, 28);
                Intrinsics.checkNotNullParameter(block17, "block");
                revolutCardReadyScreen.H = block17;
                return revolutCardReadyScreen;
            case 7:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar10 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsLocationPickerScreenContract$ModalStep it8 = (TravelHotelsLocationPickerScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, TravelHotelsLocationPickerScreenContract$ModalStep.LocationPermissionsRequest.f93938a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, null, false, 14))));
                tcg.p block18 = new tcg.p(aVar10, ModalCoordinator3);
                Intrinsics.checkNotNullParameter(block18, "block");
                permissionsController.H = block18;
                return permissionsController;
            case 8:
                com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar11 = (com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RecurringDepositDetailsViewControllerContract$ModalStep step8 = (RecurringDepositDetailsViewControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof RecurringDepositDetailsViewControllerContract$ModalStep.DeactivationDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                tch.b bVar = aVar11.v;
                tch.r portfolioType = aVar11.f95643t.f95637b;
                PortfolioRecurringOrder recurringOrder = ((RecurringDepositDetailsViewControllerContract$ModalStep.DeactivationDialog) step8).f95638a;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
                Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
                lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_recurring_deposit_deactivate_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_recurring_deposit_deactivate_prompt_message, u.c(new MoneyClause(recurringOrder.i, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 28);
                aw0.g gVar4 = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_recurring_transfer_action_deactivate, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                if (tch.a.f269813a[portfolioType.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                k9 k9Var5 = k9.RoboAdvisor;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar12, gVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                t8e.c block19 = new t8e.c(aVar11, step8, i6);
                Intrinsics.checkNotNullParameter(block19, "block");
                actionsBottomSheetController4.H = block19;
                return actionsBottomSheetController4;
            case 9:
                com.revolut.feature.esim.instructions.ui.flow.instructions.a aVar13 = (com.revolut.feature.esim.instructions.ui.flow.instructions.a) obj6;
                EsimInstructionsFlowContract$Step step9 = (EsimInstructionsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!Intrinsics.f(step9, EsimInstructionsFlowContract$Step.Instructions.f72122a)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimInstructionsFlowContract$InputData esimInstructionsFlowContract$InputData = aVar13.o;
                EsimInstructionsScreen esimInstructionsScreen = new EsimInstructionsScreen(new EsimInstructionsControllerDescriptor$InputData(esimInstructionsFlowContract$InputData.f72120a, esimInstructionsFlowContract$InputData.f72121b));
                td1.f block20 = new td1.f(aVar13, z11 ? 1 : 0);
                Intrinsics.checkNotNullParameter(block20, "block");
                esimInstructionsScreen.H = block20;
                return esimInstructionsScreen;
            case 10:
                com.revolut.feature.image_gallery.flow.a aVar14 = (com.revolut.feature.image_gallery.flow.a) obj6;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                ImageGalleryFlowContract$Step step10 = (ImageGalleryFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof ImageGalleryFlowContract$Step.Gallery)) {
                    if (step10 instanceof ImageGalleryFlowContract$Step.Pager) {
                        return new ImageGalleryLightboxScreen(new ImageGalleryLightboxScreenContract$InputData(((ImageGalleryFlowContract$Step.Pager) step10).f74766a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ImageGalleryGridScreen imageGalleryGridScreen = new ImageGalleryGridScreen();
                t8e.c block21 = new t8e.c(aVar14, FlowCoordinator2, 11);
                Intrinsics.checkNotNullParameter(block21, "block");
                imageGalleryGridScreen.H = block21;
                return imageGalleryGridScreen;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((tdi.a) obj6).getClass();
                return zhm.f0.f322471a;
            case 12:
                com.revolut.retail.feature.esim.impl.ui.flows.checkout.c cVar3 = (com.revolut.retail.feature.esim.impl.ui.flows.checkout.c) obj6;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                EsimCheckoutFlowContract$Step step11 = (EsimCheckoutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof EsimCheckoutFlowContract$Step.Checkout)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimCheckoutFlowContract$InputData esimCheckoutFlowContract$InputData = cVar3.f100604p;
                EsimCheckoutScreen esimCheckoutScreen = new EsimCheckoutScreen(new EsimCheckoutScreenContract$InputData(esimCheckoutFlowContract$InputData.f100598a, esimCheckoutFlowContract$InputData.f100599b, esimCheckoutFlowContract$InputData.f100600c));
                tfj.d block22 = new tfj.d(cVar3, z12 ? 1 : 0);
                Intrinsics.checkNotNullParameter(block22, "block");
                esimCheckoutScreen.H = block22;
                return esimCheckoutScreen;
            case 13:
                com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a aVar15 = (com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a) obj6;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter((ProductArticlesFlowContract$Step) obj3, "step");
                ProductArticlesFlowContract$InputData productArticlesFlowContract$InputData = aVar15.f68239p;
                ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(new CreditProductArticleKey("credit", productArticlesFlowContract$InputData.f68235a, productArticlesFlowContract$InputData.f68236b)));
                k9 value2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                wi0.b bVar2 = productArticlesFlowContract$InputData.d.f;
                CreditApplicationPluginFlowContract$Configuration f67889b = productArticlesFlowContract$InputData.getF67796a();
                CreditApplicationProductArticleContext creditApplicationProductArticleContextA = zr3.c.a(bVar2, new d1(f67889b.d, f67889b.e, null), productArticlesFlowContract$InputData.d.f66893c);
                companion.getClass();
                ViewController viewControllerE13 = aVar15.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, new AnalyticsProduct.Retail(value2), new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationProductArticleContextA)), false, 32));
                tg4.b block23 = new tg4.b(aVar15, FlowCoordinator3, 0);
                Intrinsics.checkNotNullParameter(block23, "block");
                viewControllerE13.H = block23;
                return viewControllerE13;
            case 14:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a aVar16 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a) obj6;
                CheckoutPlanSelectionFlowContract$Step step12 = (CheckoutPlanSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof CheckoutPlanSelectionFlowContract$Step.SelectPlan)) {
                    throw new NoWhenBranchMatchedException();
                }
                tgk.d dVar = aVar16.o;
                PlanSelectionFlow planSelectionFlow = new PlanSelectionFlow(new nik.c(dVar.f271189a, PlanSelection.LowestPlan.f103356a, dVar.f271190b, new nik.d(5, Integer.valueOf(R$drawable.uikit_icn_24_back)), null));
                td1.f block24 = new td1.f(aVar16, 18);
                Intrinsics.checkNotNullParameter(block24, "block");
                planSelectionFlow.H = block24;
                return planSelectionFlow;
            case 15:
                return a(obj2, obj3);
            case 16:
                com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.a aVar17 = (com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.a) obj6;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter((SecurityDepositFlowContract$Step) obj3, "step");
                SecurityDepositFlowContract$InputData securityDepositFlowContract$InputData = aVar17.f68344p;
                String str3 = securityDepositFlowContract$InputData.f68341b;
                xi0.a aVar18 = xi0.b.Companion;
                wi0.b bVar3 = securityDepositFlowContract$InputData.f68342c.f;
                aVar18.getClass();
                ViewController viewControllerE14 = aVar17.e1(new zl4.a(new zl4.b(str3, xi0.a.b(bVar3), com.revolut.feature.credit.card.api.navigation.a.INITIAL_DEPOSIT)));
                td1.f block25 = new td1.f(aVar17, 19);
                Intrinsics.checkNotNullParameter(block25, "block");
                viewControllerE14.H = block25;
                return viewControllerE14;
            case 17:
                return b(obj2, obj3);
            case 18:
                return c(obj2, obj3);
            case 19:
                return d(obj2, obj3);
            case 20:
                return e(obj2, obj3);
            case 21:
                return g(obj2, obj3);
            case 22:
                return h(obj2, obj3);
            case 23:
                return i(obj2, obj3);
            case 24:
                return j(obj2, obj3);
            case 25:
                return k(obj2, obj3);
            case 26:
                return l(obj2, obj3);
            case 27:
                return m(obj2, obj3);
            case 28:
                return n(obj2, obj3);
            default:
                com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar19 = (com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a) obj6;
                qki.d dVar2 = aVar19.f69069y;
                CreditCardAutopaySettingsFlowContract$InputData creditCardAutopaySettingsFlowContract$InputData = aVar19.o;
                CreditCardAutopaySettingsFlowContract$Step step13 = (CreditCardAutopaySettingsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof CreditCardAutopaySettingsFlowContract$Step.Settings) {
                    AutopaySettingsScreen autopaySettingsScreen = new AutopaySettingsScreen(new AutopaySettingsContract$InputData(creditCardAutopaySettingsFlowContract$InputData.f69039a));
                    tkm.d dVar3 = new tkm.d(autopaySettingsScreen, aVar19, i6);
                    Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                    autopaySettingsScreen.H = dVar3;
                    return autopaySettingsScreen;
                }
                if (step13 instanceof CreditCardAutopaySettingsFlowContract$Step.Setup) {
                    return new CreditCardSetupAutopayRootFlow(new CreditCardSetupAutopayFlowContract$InputData.Create(creditCardAutopaySettingsFlowContract$InputData.f69039a));
                }
                if (step13 instanceof CreditCardAutopaySettingsFlowContract$Step.Recreate) {
                    return new CreditCardSetupAutopayRootFlow(new CreditCardSetupAutopayFlowContract$InputData.Recreate(creditCardAutopaySettingsFlowContract$InputData.f69039a, ((CreditCardAutopaySettingsFlowContract$Step.Recreate) step13).f69056a));
                }
                if (step13 instanceof CreditCardAutopaySettingsFlowContract$Step.SetAmount) {
                    wi0.b bVar4 = ((CreditCardAutopaySettingsFlowContract$Step.SetAmount) step13).f69057a;
                    Object value3 = ((j2) dVar2.f22677a).getValue();
                    Intrinsics.i(value3, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract.State.RevolutAccount");
                    CreditCardAutopaySettingsFlowContract$State.RevolutAccount revolutAccount = (CreditCardAutopaySettingsFlowContract$State.RevolutAccount) value3;
                    CreditCardAutopayPayment.AutoPayment autoPayment = revolutAccount.f69045a;
                    xi0.b bVar5 = autoPayment.d.f70721c;
                    CreditScheduledAmountType creditScheduledAmountTypeA = com.revolut.feature.credit_card.autopay.api.models_v3.d.a(autoPayment.e);
                    List list5 = revolutAccount.e;
                    boolean z74 = list5.size() > 1;
                    Iterator it9 = list5.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            RepaymentSource repaymentSource = (RepaymentSource) next;
                            String str4 = autoPayment.d.f70719a;
                            if (str4 == null || !str4.equals(repaymentSource.getF68556a())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    RepaymentSource repaymentSource2 = (RepaymentSource) next;
                    if (repaymentSource2 == null) {
                        repaymentSource2 = RepaymentSource.RevolutWallet.f68559a;
                    }
                    SetAmountFlowContract$RepaymentInfo setAmountFlowContract$RepaymentInfo = new SetAmountFlowContract$RepaymentInfo(repaymentSource2, z74);
                    vj4.a aVar20 = aVar19.f69068x;
                    CreditCardAutopayConfig creditCardAutopayConfigQ9 = ((CreditCardAutopaySettingsFlowContract$State) ((j2) dVar2.f22677a).getValue()).getF69046b();
                    if (creditCardAutopayConfigQ9 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    CreditCardAutopayContent creditCardAutopayContent = creditCardAutopayConfigQ9.f70694b;
                    SetAmountRootFlow setAmountRootFlow = new SetAmountRootFlow(new SetAmountFlowContract$InputData(bVar5, creditScheduledAmountTypeA, false, setAmountFlowContract$RepaymentInfo, ((dk4.a) aVar20).a(bVar4, creditCardAutopayContent != null ? creditCardAutopayContent.f70702a : null), null, 32));
                    tp4.e eVar = new tp4.e(aVar19, i5);
                    Intrinsics.checkNotNullParameter(eVar, "<set-?>");
                    setAmountRootFlow.J = eVar;
                    obj5 = setAmountRootFlow;
                } else {
                    if (step13 instanceof CreditCardAutopaySettingsFlowContract$Step.AmountConfirmation) {
                        CreditCardAutopaySettingsFlowContract$Step.AmountConfirmation amountConfirmation = (CreditCardAutopaySettingsFlowContract$Step.AmountConfirmation) step13;
                        AutopayAmountConfirmationController autopayAmountConfirmationController = new AutopayAmountConfirmationController(new AutopayAmountConfirmationContract$InputData(amountConfirmation.f69049a));
                        tkm.d block26 = new tkm.d(aVar19, amountConfirmation, i3);
                        Intrinsics.checkNotNullParameter(block26, "block");
                        autopayAmountConfirmationController.H = block26;
                        return autopayAmountConfirmationController;
                    }
                    if (step13 instanceof CreditCardAutopaySettingsFlowContract$Step.SetDate) {
                        zhm.f0 f0Var3 = zhm.f0.f322471a;
                        j2 j2Var = (j2) dVar2.f22677a;
                        j2 j2Var2 = (j2) dVar2.f22677a;
                        CreditCardAutopayPayment.AutoPayment autoPaymentQ3 = ((CreditCardAutopaySettingsFlowContract$State) j2Var.getValue()).getF69045a();
                        if (autoPaymentQ3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Integer numValueOf = Integer.valueOf(autoPaymentQ3.f.f70717b);
                        CreditCardAutopayPayments creditCardAutopayPaymentsZ4 = ((CreditCardAutopaySettingsFlowContract$State) j2Var2.getValue()).getD();
                        if (creditCardAutopayPaymentsZ4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        long jF0 = pyd.c.f0(creditCardAutopayPaymentsZ4.f70722a);
                        CreditCardAutopayPayment.AutoPayment autoPaymentQ32 = ((CreditCardAutopaySettingsFlowContract$State) j2Var2.getValue()).getF69045a();
                        if (autoPaymentQ32 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        SetDateScreen setDateScreen = new SetDateScreen(new SetDateContract$InputData(f0Var3, numValueOf, true, jF0, com.revolut.feature.credit_card.autopay.api.models_v3.d.b(autoPaymentQ32.f70705b), null));
                        tp4.e eVar2 = new tp4.e(aVar19, i2);
                        Intrinsics.checkNotNullParameter(eVar2, "<set-?>");
                        setDateScreen.H = eVar2;
                        obj5 = setDateScreen;
                    } else {
                        if (!(step13 instanceof CreditCardAutopaySettingsFlowContract$Step.SetupBackupCard)) {
                            if (step13 instanceof CreditCardAutopaySettingsFlowContract$Step.DirectDebit) {
                                String str5 = creditCardAutopaySettingsFlowContract$InputData.f69039a;
                                CreditCardAutopayConfig creditCardAutopayConfigQ92 = ((CreditCardAutopaySettingsFlowContract$State) ((j2) dVar2.f22677a).getValue()).getF69046b();
                                if (creditCardAutopayConfigQ92 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                ArrayList arrayList = creditCardAutopayConfigQ92.f70693a;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj7 : arrayList) {
                                    if (obj7 instanceof CreditCardAutopayType.DirectDebit) {
                                        arrayList2.add(obj7);
                                    }
                                }
                                CreditCardDirectDebitFlow creditCardDirectDebitFlow = new CreditCardDirectDebitFlow(new CreditCardDirectDebitV3FlowContract$InputData(str5, (CreditCardAutopayType.DirectDebit) zhm.d0.b0(arrayList2)));
                                tp4.e block27 = new tp4.e(aVar19, z29 ? 1 : 0);
                                Intrinsics.checkNotNullParameter(block27, "block");
                                creditCardDirectDebitFlow.H = block27;
                                return creditCardDirectDebitFlow;
                            }
                            if (step13 instanceof CreditCardAutopaySettingsFlowContract$Step.DirectDebitAccountDetails) {
                                CreditCardAutopaySettingsFlowContract$Step.DirectDebitAccountDetails directDebitAccountDetails = (CreditCardAutopaySettingsFlowContract$Step.DirectDebitAccountDetails) step13;
                                CreditCardDirectDebitMandate creditCardDirectDebitMandate = directDebitAccountDetails.f69053a;
                                DirectDebitAccountDetailsScreen directDebitAccountDetailsScreen = new DirectDebitAccountDetailsScreen(new DirectDebitAccountDetailsScreenContract$InputData(new DirectDebitAccountDetailsScreenContract$AccountInfo.Clabe(directDebitAccountDetails.f69054b, creditCardDirectDebitMandate.d, creditCardDirectDebitMandate.f70741c), new TextClause(creditCardDirectDebitMandate.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_direct_debit_account_details_description, null, null, 14), null));
                                tkm.d dVar4 = new tkm.d(aVar19, creditCardDirectDebitMandate, 11);
                                Intrinsics.checkNotNullParameter(dVar4, "<set-?>");
                                directDebitAccountDetailsScreen.H = dVar4;
                                return directDebitAccountDetailsScreen;
                            }
                            if (!(step13 instanceof CreditCardAutopaySettingsFlowContract$Step.Picker)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object value4 = ((j2) dVar2.f22677a).getValue();
                            Intrinsics.i(value4, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract.State.RevolutAccount");
                            BalanceSelector$InputData balanceSelector$InputDataU = pw5.a.u(((CreditCardAutopaySettingsFlowContract$State.RevolutAccount) value4).f69048g, ((CreditCardAutopaySettingsFlowContract$Step.Picker) step13).f69055a);
                            tp4.e eVar3 = new tp4.e(aVar19, 0);
                            ViewController viewControllerE15 = aVar19.e1(new g1j.a(balanceSelector$InputDataU, aVar19.v));
                            tkm.d block28 = new tkm.d(aVar19, eVar3, 8);
                            Intrinsics.checkNotNullParameter(block28, "block");
                            viewControllerE15.H = block28;
                            return viewControllerE15;
                        }
                        t61.g gVar5 = ((CreditCardAutopaySettingsFlowContract$Step.SetupBackupCard) step13).f69061a;
                        SelectPaymentRootFlow selectPaymentRootFlowA = zwc.a.a(aVar19.f69064r, gVar5, null, null, 30);
                        tkm.d block29 = new tkm.d(aVar19, gVar5, 7);
                        Intrinsics.checkNotNullParameter(block29, "block");
                        selectPaymentRootFlowA.H = block29;
                        obj5 = selectPaymentRootFlowA;
                    }
                }
                return obj5;
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f269150a = i;
        this.f269151b = obj3;
    }
}
