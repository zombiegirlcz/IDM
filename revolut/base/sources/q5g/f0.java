package q5g;

import aii.r;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import bgd.e;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreenContract$ModalStep;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreenContract$InputData;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.EnrollmentListContract$Step;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreenContract$InputData;
import com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.AddPayIdScreen;
import com.revolut.feature.apm.payid.impl.screen.createpayid.flow.CreatePayIdFlowContract$Step;
import com.revolut.feature.apm.payid.impl.screen.createpayid.otp.OtpScreen;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreen;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_other_debt.AddOtherDebtScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlowContract$Step$ModalStep$Info;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$ModalStep;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.BrazilInboundOpenbankingFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_bank_selection.PixBankSelectionScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.PixBranchSelectionScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.PixBranchSelectionScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreenContract$ModalStep;
import com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.JuniorCreatePhoneNumberFlow;
import com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.JuniorInviteCreationFlowContract$InputData;
import com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.JuniorInviteCreationFlowContract$Step;
import com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.JuniorInviteCreationScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.JuniorInviteCreationScreenContract$InputData;
import com.revolut.feature.junior_remote_login.navigation.JuniorCreatePhoneNumberDestination;
import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlow;
import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreenContract$Modal;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$State;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsDestination;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsContract$ModalStep;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.dialog.CardDeliveryCancelOrderDialogController;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$Step;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreen;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreenContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreen;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreenContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.self_transfer.TravelFlightsSelfTransferScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund.TravelHotelsCancellationNetRefundScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund.TravelHotelsCancellationNetRefundScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.CountriesSelectionScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountController;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.flow.WrapperFlowStep;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$UiConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.SelectFamilyPlanFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreenContract$ModalStep;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import dii.e;
import grl.k9;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k50.b2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nk6.f;
import qc0.e1;
import ri4.f;
import ri4.g;
import ri4.h;
import ubg.e;
import vkm.j2;
import vkm.z1;
import yed.p;
import yki.i;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f242370b;

    public /* synthetic */ f0(Object obj2, int i) {
        this.f242369a = i;
        this.f242370b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a) this.f242370b;
        yki.l FlowCoordinator = (yki.l) obj2;
        CreditCardPostRetailOnboardingFlowContract$Step step = (CreditCardPostRetailOnboardingFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CreditCardPostRetailOnboardingFlowContract$Step.Intro)) {
            if (step instanceof CreditCardPostRetailOnboardingFlowContract$Step$ModalStep$Info) {
                return aVar.e1(new fy4.s(new fy4.t(((CreditCardPostRetailOnboardingFlowContract$Step$ModalStep$Info) step).f68219a)));
            }
            throw new NoWhenBranchMatchedException();
        }
        dt3.a creditCardPostRetailOnboarding = aVar.o.f68217b;
        aVar.f68221q.getClass();
        Intrinsics.checkNotNullParameter(creditCardPostRetailOnboarding, "creditCardPostRetailOnboarding");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_premium_onboarding_offer_title_template, zhm.u.c(creditCardPostRetailOnboarding.f117351a), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_premium_onboarding_offer_description_template, zhm.u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, creditCardPostRetailOnboarding.f117352b)), null, 12);
        ld ldVar = ld.CAPTION;
        PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlVideo(creditCardPostRetailOnboarding.f117353c, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, 114), null, 0 == true ? 1 : 0, 6);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.credit_card_premium_onboarding_offer_primary_button_template, zhm.u.c(creditCardPostRetailOnboarding.e.f117355a), null, 12), null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54);
        String str = creditCardPostRetailOnboarding.d;
        PromptMarketingContentDelegate.Model model = new PromptMarketingContentDelegate.Model("CREDIT_CARD_POST_ONBOARDING_PROMPT_ID", textLocalisedClause, textLocalisedClause2, fullScreenMediaContent, null, null, null, ldVar, null, button, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.credit_card_premium_onboarding_offer_secondary_button_template, zhm.u.c(creditCardPostRetailOnboarding.f.f117355a), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.o, false, (String) null, 54), null, str != null ? new PromptMarketingContentDelegate.Model.Footer(new TextLocalisedClause(R$string.credit_card_premium_onboarding_offer_footer_template, prk.o.v(0, 30, null, null, str), null, 12)) : null, null, null, null, null, null, new PromptMarketingContentDelegate.Model.AnimationType.SlideInAndFadeIn(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 1000L, r3.f245649a.getResources().getDisplayMetrics().heightPixels), new AnimationRequest(false), null, 1304880);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(model, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), false, true, null, 20));
        qce.a block = new qce.a(creditCardPostRetailOnboarding, aVar, 8);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.rollee.c) this.f242370b;
        RolleeFlowContract$InputData rolleeFlowContract$InputData = cVar.f68334p;
        yki.l FlowCoordinator = (yki.l) obj2;
        RolleeFlowContract$Step step = (RolleeFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof RolleeFlowContract$Step.Intro) {
            CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(zv3.a.BACK, ((RolleeFlowContract$Step.Intro) step).f68327a, new CreditPromptAnalyticsConfiguration(R$string.credit_rollee_intro_title, R$string.credit_rollee_intro_description, R$string.credit_rollee_intro_primaryButton, R$string.credit_rollee_intro_secondaryButton), rolleeFlowContract$InputData.f68326c));
            qce.a block = new qce.a(cVar, FlowCoordinator, 11);
            Intrinsics.checkNotNullParameter(block, "block");
            creditPromptFlow.H = block;
            return creditPromptFlow;
        }
        if (!(step instanceof RolleeFlowContract$Step.Login)) {
            throw new NoWhenBranchMatchedException();
        }
        RolleeScreen rolleeScreen = new RolleeScreen(new RolleeScreenContract$InputData(rolleeFlowContract$InputData.f68325b, rolleeFlowContract$InputData.f68326c));
        qgf.o block2 = new qgf.o(cVar, 2);
        Intrinsics.checkNotNullParameter(block2, "block");
        rolleeScreen.H = block2;
        return rolleeScreen;
    }

    private final Object c(Object obj2, Object obj3) {
        RolleeScreen rolleeScreen = (RolleeScreen) this.f242370b;
        String accountID = (String) obj2;
        KProperty[] kPropertyArr = RolleeScreen.T;
        Intrinsics.checkNotNullParameter(accountID, "accountID");
        rolleeScreen.g3("onLoginSuccess", (30 & 2) != 0 ? null : accountID, (30 & 4) != 0 ? null : null, null, null);
        qh4.b0 b0VarR2 = rolleeScreen.R2();
        b0VarR2.getClass();
        Intrinsics.checkNotNullParameter(accountID, "accountID");
        b0VarR2.C2(new qh4.x((String) obj3));
        return Unit.f186387a;
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a) this.f242370b;
        SpousalConsentPartnerFlowContract$InputData spousalConsentPartnerFlowContract$InputData = aVar.f68467p;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        SpousalConsentPartnerFlowContract$Step step = (SpousalConsentPartnerFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SpousalConsentPartnerFlowContract$Step.GiveConsent) {
            GiveConsentScreen giveConsentScreen = new GiveConsentScreen(new GiveConsentScreenContract$InputData(spousalConsentPartnerFlowContract$InputData.f68459a));
            final int i = 0;
            Function1 function1 = new Function1() { // from class: qi4.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            h result = (h) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof f;
                            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a aVar2 = aVar;
                            if (z) {
                                aVar2.K2(null);
                            } else {
                                if (!(result instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.n2(new e1(aVar2, result, null, 12), new whi.b(6));
                            }
                            return Unit.f186387a;
                        case 1:
                            dii.g outputData = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z3 = outputData instanceof e;
                            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a aVar3 = aVar;
                            if (z3) {
                                oki.h.u2(aVar3, aVar3.f68469r, SpousalConsentPartnerFlowContract$Step.GiveConsent.f68464a, null, 6);
                            } else {
                                aVar3.K2(null);
                            }
                            return Unit.f186387a;
                        default:
                            dii.g it8 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            aVar.K2(null);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            giveConsentScreen.H = function1;
            return giveConsentScreen;
        }
        Continuation continuation = null;
        if (step instanceof SpousalConsentPartnerFlowContract$Step.ModalStep.Respond) {
            SpousalConsentPartnerPopupScreenConfig.Respond respond = ((SpousalConsentPartnerFlowContract$Step.ModalStep.Respond) step).f68465a;
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            CreditApplicationCommonContext creditApplicationCommonContextO = t1.O(spousalConsentPartnerFlowContract$InputData);
            companion.getClass();
            ActionsBottomSheetController actionsBottomSheetControllerA = si4.a.a(respond, AnalyticsContext.Companion.a(creditApplicationCommonContextO));
            final int i2 = 1;
            md6.s.G(actionsBottomSheetControllerA, new b2(2, aVar, com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 25), new qi4.c(aVar, continuation, 0), new Function1() { // from class: qi4.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            h result = (h) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof f;
                            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a aVar2 = aVar;
                            if (z) {
                                aVar2.K2(null);
                            } else {
                                if (!(result instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.n2(new e1(aVar2, result, null, 12), new whi.b(6));
                            }
                            return Unit.f186387a;
                        case 1:
                            dii.g outputData = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z3 = outputData instanceof e;
                            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a aVar3 = aVar;
                            if (z3) {
                                oki.h.u2(aVar3, aVar3.f68469r, SpousalConsentPartnerFlowContract$Step.GiveConsent.f68464a, null, 6);
                            } else {
                                aVar3.K2(null);
                            }
                            return Unit.f186387a;
                        default:
                            dii.g it8 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            aVar.K2(null);
                            return Unit.f186387a;
                    }
                }
            });
            return actionsBottomSheetControllerA;
        }
        if (!(step instanceof SpousalConsentPartnerFlowContract$Step.ModalStep.Waiting)) {
            throw new NoWhenBranchMatchedException();
        }
        SpousalConsentPartnerPopupScreenConfig.Waiting waiting = ((SpousalConsentPartnerFlowContract$Step.ModalStep.Waiting) step).f68466a;
        AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
        CreditApplicationCommonContext creditApplicationCommonContextO2 = t1.O(spousalConsentPartnerFlowContract$InputData);
        companion2.getClass();
        ActionsBottomSheetController actionsBottomSheetControllerA2 = si4.a.a(waiting, AnalyticsContext.Companion.a(creditApplicationCommonContextO2));
        final int i3 = 2;
        md6.s.G(actionsBottomSheetControllerA2, new b2(i3, aVar, com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 26), new qi4.c(aVar, continuation, 1), new Function1() { // from class: qi4.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i3) {
                    case 0:
                        h result = (h) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof f;
                        com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a aVar2 = aVar;
                        if (z) {
                            aVar2.K2(null);
                        } else {
                            if (!(result instanceof g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.n2(new e1(aVar2, result, null, 12), new whi.b(6));
                        }
                        return Unit.f186387a;
                    case 1:
                        dii.g outputData = (dii.g) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z3 = outputData instanceof e;
                        com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a aVar3 = aVar;
                        if (z3) {
                            oki.h.u2(aVar3, aVar3.f68469r, SpousalConsentPartnerFlowContract$Step.GiveConsent.f68464a, null, 6);
                        } else {
                            aVar3.K2(null);
                        }
                        return Unit.f186387a;
                    default:
                        dii.g it8 = (dii.g) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        aVar.K2(null);
                        return Unit.f186387a;
                }
            }
        });
        return actionsBottomSheetControllerA2;
    }

    private final Object e(Object obj2, Object obj3) {
        final qii.d dVar = (qii.d) this.f242370b;
        yki.l FlowCoordinator = (yki.l) obj2;
        WrapperFlowStep it8 = (WrapperFlowStep) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        com.revolut.kompot.navigable.a aVar = dVar.o;
        if (aVar instanceof BaseFlow) {
            final int i = 0;
            Function1 function1 = new Function1() { // from class: qii.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    r it9 = (r) obj4;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it9, "it");
                            d dVar2 = dVar;
                            dVar2.f246724p.a(it9, dVar2);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(it9, "it");
                            d dVar3 = dVar;
                            dVar3.f246724p.a(it9, dVar3);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it9, "it");
                            d dVar4 = dVar;
                            dVar4.f246724p.a(it9, dVar4);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            ((BaseFlow) aVar).J = function1;
            return aVar;
        }
        if (aVar instanceof BaseScreen) {
            final int i2 = 1;
            Function1 function12 = new Function1() { // from class: qii.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    r it9 = (r) obj4;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it9, "it");
                            d dVar2 = dVar;
                            dVar2.f246724p.a(it9, dVar2);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(it9, "it");
                            d dVar3 = dVar;
                            dVar3.f246724p.a(it9, dVar3);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it9, "it");
                            d dVar4 = dVar;
                            dVar4.f246724p.a(it9, dVar4);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            ((BaseScreen) aVar).H = function12;
            return aVar;
        }
        if (!(aVar instanceof ViewController)) {
            throw new IllegalStateException("Unsupported controller type for WrapperFlow");
        }
        ViewController viewController = (ViewController) aVar;
        final int i3 = 2;
        Function1 block = new Function1() { // from class: qii.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                r it9 = (r) obj4;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d dVar2 = dVar;
                        dVar2.f246724p.a(it9, dVar2);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d dVar3 = dVar;
                        dVar3.f246724p.a(it9, dVar3);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d dVar4 = dVar;
                        dVar4.f246724p.a(it9, dVar4);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block, "block");
        viewController.H = block;
        return viewController;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.a aVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.a) this.f242370b;
        yki.l FlowCoordinator = (yki.l) obj2;
        SelectFamilyPlanFlowContract$Step step = (SelectFamilyPlanFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof SelectFamilyPlanFlowContract$Step.SelectPlan)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanPagerFlow planPagerFlow = new PlanPagerFlow(new PlanPagerFlowContract$InputData(aVar.o.f103256a, new PlanPagerFlowContract$UiConfig(PlanPagerFlowContract$UiConfig.TitleConfig.Default.f103063a, PlanLayoutType.SwitchToFamily.f103313a, Integer.valueOf(R$drawable.uikit_icn_24_back), false), aVar.f103259q.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c)));
        qgf.o block = new qgf.o(aVar, 4);
        Intrinsics.checkNotNullParameter(block, "block");
        planPagerFlow.H = block;
        return planPagerFlow;
    }

    private final Object h(Object obj2, Object obj3) {
        final com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b) this.f242370b;
        final yki.b LazyFlowCoordinator = (yki.b) obj2;
        BrazilInboundOpenbankingFlowContract$Step step = (BrazilInboundOpenbankingFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, BrazilInboundOpenbankingFlowContract$Step.PixSmartTransferProductArticle.f72595a)) {
            ViewController viewControllerE1 = bVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("pix-add-money-with-a-tap-standalone")), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
            final int i = 0;
            Function1 block = new Function1() { // from class: qj6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    ho3.a aVar;
                    int i2 = i;
                    String str = null;
                    we6.h hVar = we6.h.f296644a;
                    we6.g gVar = we6.g.f296642a;
                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar2 = bVar;
                    yki.b bVar3 = LazyFlowCoordinator;
                    switch (i2) {
                        case 0:
                            yja.b result = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            int i3 = d.f246771a[result.ordinal()];
                            com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar4 = bVar;
                            yki.b bVar5 = LazyFlowCoordinator;
                            BrazilInboundOpenbankingFlowContract$Step.BankSelection bankSelection = BrazilInboundOpenbankingFlowContract$Step.BankSelection.f72589a;
                            if (i3 == 1 || i3 == 2) {
                                oki.h.t2(bVar4, bVar5, bankSelection, false, null, false, 12);
                            } else if (i3 == 3) {
                                oki.h.D2(bVar5);
                            } else {
                                if (i3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("Error showing Product Article because NOT_FOUND");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                oki.h.t2(bVar4, bVar5, bankSelection, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            nk6.f result2 = (nk6.f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof nk6.g) {
                                nk6.g gVar2 = (nk6.g) result2;
                                List list = gVar2.d;
                                com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar6 = bVar;
                                i iVar = bVar6.f72599s;
                                io3.b bVar7 = gVar2.f216662c;
                                String str2 = gVar2.f216661b;
                                String str3 = gVar2.f216660a;
                                if ((list != null ? list.size() : 0) > 1) {
                                    oki.h.t2(bVar6, iVar, new BrazilInboundOpenbankingFlowContract$Step.BranchSelection(str3, str2, bVar7), true, null, false, 12);
                                } else {
                                    if (list != null && (aVar = (ho3.a) d0.d0(list)) != null) {
                                        str = aVar.f154218a;
                                    }
                                    bVar6.C2(new we6.f(bVar7, str3, str2, str));
                                    oki.h.D2(iVar);
                                }
                            } else {
                                if (!Intrinsics.f(result2, f.a.f216659a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.w2(bVar3, BrazilInboundOpenbankingFlowContract$Step.InstitutionNotListedDialog.f72594a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                        case 2:
                            dii.g outputData = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof e) {
                                bVar2.C2(gVar);
                                oki.h.D2(bVar3);
                            } else if (outputData instanceof dii.f) {
                                bVar2.C2(hVar);
                                oki.h.D2(bVar3);
                            }
                            return Unit.f186387a;
                        default:
                            dii.g outputData2 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 instanceof e) {
                                bVar2.C2(gVar);
                                oki.h.D2(bVar3);
                            } else if (outputData2 instanceof dii.f) {
                                bVar2.C2(hVar);
                                oki.h.D2(bVar3);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (Intrinsics.f(step, BrazilInboundOpenbankingFlowContract$Step.BankSelection.f72589a)) {
            PixBankSelectionScreen pixBankSelectionScreen = new PixBankSelectionScreen();
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: qj6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    ho3.a aVar;
                    int i22 = i2;
                    String str = null;
                    we6.h hVar = we6.h.f296644a;
                    we6.g gVar = we6.g.f296642a;
                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar2 = bVar;
                    yki.b bVar3 = LazyFlowCoordinator;
                    switch (i22) {
                        case 0:
                            yja.b result = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            int i3 = d.f246771a[result.ordinal()];
                            com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar4 = bVar;
                            yki.b bVar5 = LazyFlowCoordinator;
                            BrazilInboundOpenbankingFlowContract$Step.BankSelection bankSelection = BrazilInboundOpenbankingFlowContract$Step.BankSelection.f72589a;
                            if (i3 == 1 || i3 == 2) {
                                oki.h.t2(bVar4, bVar5, bankSelection, false, null, false, 12);
                            } else if (i3 == 3) {
                                oki.h.D2(bVar5);
                            } else {
                                if (i3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("Error showing Product Article because NOT_FOUND");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                oki.h.t2(bVar4, bVar5, bankSelection, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            nk6.f result2 = (nk6.f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof nk6.g) {
                                nk6.g gVar2 = (nk6.g) result2;
                                List list = gVar2.d;
                                com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar6 = bVar;
                                i iVar = bVar6.f72599s;
                                io3.b bVar7 = gVar2.f216662c;
                                String str2 = gVar2.f216661b;
                                String str3 = gVar2.f216660a;
                                if ((list != null ? list.size() : 0) > 1) {
                                    oki.h.t2(bVar6, iVar, new BrazilInboundOpenbankingFlowContract$Step.BranchSelection(str3, str2, bVar7), true, null, false, 12);
                                } else {
                                    if (list != null && (aVar = (ho3.a) d0.d0(list)) != null) {
                                        str = aVar.f154218a;
                                    }
                                    bVar6.C2(new we6.f(bVar7, str3, str2, str));
                                    oki.h.D2(iVar);
                                }
                            } else {
                                if (!Intrinsics.f(result2, f.a.f216659a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.w2(bVar3, BrazilInboundOpenbankingFlowContract$Step.InstitutionNotListedDialog.f72594a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                        case 2:
                            dii.g outputData = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof e) {
                                bVar2.C2(gVar);
                                oki.h.D2(bVar3);
                            } else if (outputData instanceof dii.f) {
                                bVar2.C2(hVar);
                                oki.h.D2(bVar3);
                            }
                            return Unit.f186387a;
                        default:
                            dii.g outputData2 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 instanceof e) {
                                bVar2.C2(gVar);
                                oki.h.D2(bVar3);
                            } else if (outputData2 instanceof dii.f) {
                                bVar2.C2(hVar);
                                oki.h.D2(bVar3);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            pixBankSelectionScreen.H = block2;
            return pixBankSelectionScreen;
        }
        if (step instanceof BrazilInboundOpenbankingFlowContract$Step.BranchSelection) {
            PixBranchSelectionScreen pixBranchSelectionScreen = new PixBranchSelectionScreen(new PixBranchSelectionScreenContract$InputData(((BrazilInboundOpenbankingFlowContract$Step.BranchSelection) step).f72591a));
            pza.d block3 = new pza.d(bVar, 21, step, LazyFlowCoordinator);
            Intrinsics.checkNotNullParameter(block3, "block");
            pixBranchSelectionScreen.H = block3;
            return pixBranchSelectionScreen;
        }
        if (Intrinsics.f(step, BrazilInboundOpenbankingFlowContract$Step.InstitutionNotListedDialog.f72594a)) {
            rj6.b bVar2 = bVar.f72597q;
            k9 value = k9.OpenBanking;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_bank_selection_bank_not_listed_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_bank_selection_bank_not_listed_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_bank_selection_bank_not_listed_pix_code_transfer, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_bank_selection_bank_not_listed_select_other, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct, null, null, 24));
            final int i3 = 2;
            Function1 block4 = new Function1() { // from class: qj6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    ho3.a aVar;
                    int i22 = i3;
                    String str = null;
                    we6.h hVar = we6.h.f296644a;
                    we6.g gVar = we6.g.f296642a;
                    com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar22 = bVar;
                    yki.b bVar3 = LazyFlowCoordinator;
                    switch (i22) {
                        case 0:
                            yja.b result = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            int i32 = d.f246771a[result.ordinal()];
                            com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar4 = bVar;
                            yki.b bVar5 = LazyFlowCoordinator;
                            BrazilInboundOpenbankingFlowContract$Step.BankSelection bankSelection = BrazilInboundOpenbankingFlowContract$Step.BankSelection.f72589a;
                            if (i32 == 1 || i32 == 2) {
                                oki.h.t2(bVar4, bVar5, bankSelection, false, null, false, 12);
                            } else if (i32 == 3) {
                                oki.h.D2(bVar5);
                            } else {
                                if (i32 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("Error showing Product Article because NOT_FOUND");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                oki.h.t2(bVar4, bVar5, bankSelection, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            nk6.f result2 = (nk6.f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof nk6.g) {
                                nk6.g gVar2 = (nk6.g) result2;
                                List list = gVar2.d;
                                com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar6 = bVar;
                                i iVar = bVar6.f72599s;
                                io3.b bVar7 = gVar2.f216662c;
                                String str2 = gVar2.f216661b;
                                String str3 = gVar2.f216660a;
                                if ((list != null ? list.size() : 0) > 1) {
                                    oki.h.t2(bVar6, iVar, new BrazilInboundOpenbankingFlowContract$Step.BranchSelection(str3, str2, bVar7), true, null, false, 12);
                                } else {
                                    if (list != null && (aVar = (ho3.a) d0.d0(list)) != null) {
                                        str = aVar.f154218a;
                                    }
                                    bVar6.C2(new we6.f(bVar7, str3, str2, str));
                                    oki.h.D2(iVar);
                                }
                            } else {
                                if (!Intrinsics.f(result2, f.a.f216659a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.w2(bVar3, BrazilInboundOpenbankingFlowContract$Step.InstitutionNotListedDialog.f72594a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                        case 2:
                            dii.g outputData = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof e) {
                                bVar22.C2(gVar);
                                oki.h.D2(bVar3);
                            } else if (outputData instanceof dii.f) {
                                bVar22.C2(hVar);
                                oki.h.D2(bVar3);
                            }
                            return Unit.f186387a;
                        default:
                            dii.g outputData2 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 instanceof e) {
                                bVar22.C2(gVar);
                                oki.h.D2(bVar3);
                            } else if (outputData2 instanceof dii.f) {
                                bVar22.C2(hVar);
                                oki.h.D2(bVar3);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            actionsBottomSheetController.H = block4;
            return actionsBottomSheetController;
        }
        if (!Intrinsics.f(step, BrazilInboundOpenbankingFlowContract$Step.BranchNotListedDialog.f72590a)) {
            throw new NoWhenBranchMatchedException();
        }
        rj6.a aVar = bVar.f72598r;
        k9 value2 = k9.OpenBanking;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value2, "value");
        AnalyticsProduct.Retail analyticsProduct2 = new AnalyticsProduct.Retail(value2);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
        ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_branch_selection_branch_not_listed_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_branch_selection_branch_not_listed_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_bank_selection_bank_not_listed_pix_code_transfer, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_bank_selection_bank_not_listed_select_other, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct2, null, null, 24));
        final int i5 = 3;
        Function1 block5 = new Function1() { // from class: qj6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                ho3.a aVar2;
                int i22 = i5;
                String str = null;
                we6.h hVar = we6.h.f296644a;
                we6.g gVar = we6.g.f296642a;
                com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar22 = bVar;
                yki.b bVar3 = LazyFlowCoordinator;
                switch (i22) {
                    case 0:
                        yja.b result = (yja.b) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        int i32 = d.f246771a[result.ordinal()];
                        com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar4 = bVar;
                        yki.b bVar5 = LazyFlowCoordinator;
                        BrazilInboundOpenbankingFlowContract$Step.BankSelection bankSelection = BrazilInboundOpenbankingFlowContract$Step.BankSelection.f72589a;
                        if (i32 == 1 || i32 == 2) {
                            oki.h.t2(bVar4, bVar5, bankSelection, false, null, false, 12);
                        } else if (i32 == 3) {
                            oki.h.D2(bVar5);
                        } else {
                            if (i32 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            IllegalStateException illegalStateException = new IllegalStateException("Error showing Product Article because NOT_FOUND");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            oki.h.t2(bVar4, bVar5, bankSelection, false, null, false, 12);
                        }
                        return Unit.f186387a;
                    case 1:
                        nk6.f result2 = (nk6.f) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (result2 instanceof nk6.g) {
                            nk6.g gVar2 = (nk6.g) result2;
                            List list = gVar2.d;
                            com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar6 = bVar;
                            i iVar = bVar6.f72599s;
                            io3.b bVar7 = gVar2.f216662c;
                            String str2 = gVar2.f216661b;
                            String str3 = gVar2.f216660a;
                            if ((list != null ? list.size() : 0) > 1) {
                                oki.h.t2(bVar6, iVar, new BrazilInboundOpenbankingFlowContract$Step.BranchSelection(str3, str2, bVar7), true, null, false, 12);
                            } else {
                                if (list != null && (aVar2 = (ho3.a) d0.d0(list)) != null) {
                                    str = aVar2.f154218a;
                                }
                                bVar6.C2(new we6.f(bVar7, str3, str2, str));
                                oki.h.D2(iVar);
                            }
                        } else {
                            if (!Intrinsics.f(result2, f.a.f216659a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.w2(bVar3, BrazilInboundOpenbankingFlowContract$Step.InstitutionNotListedDialog.f72594a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        }
                        return Unit.f186387a;
                    case 2:
                        dii.g outputData = (dii.g) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (outputData instanceof e) {
                            bVar22.C2(gVar);
                            oki.h.D2(bVar3);
                        } else if (outputData instanceof dii.f) {
                            bVar22.C2(hVar);
                            oki.h.D2(bVar3);
                        }
                        return Unit.f186387a;
                    default:
                        dii.g outputData2 = (dii.g) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        if (outputData2 instanceof e) {
                            bVar22.C2(gVar);
                            oki.h.D2(bVar3);
                        } else if (outputData2 instanceof dii.f) {
                            bVar22.C2(hVar);
                            oki.h.D2(bVar3);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block5, "block");
        actionsBottomSheetController2.H = block5;
        return actionsBottomSheetController2;
    }

    private final Object i(Object obj2, Object obj3) {
        com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.a aVar = (com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.a) this.f242370b;
        JuniorInviteCreationFlowContract$InputData juniorInviteCreationFlowContract$InputData = aVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        JuniorInviteCreationFlowContract$Step step = (JuniorInviteCreationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof JuniorInviteCreationFlowContract$Step.InviteCreation) {
            JuniorInviteCreationFlowContract$Step.InviteCreation inviteCreation = (JuniorInviteCreationFlowContract$Step.InviteCreation) step;
            JuniorInviteCreationScreen juniorInviteCreationScreen = new JuniorInviteCreationScreen(new JuniorInviteCreationScreenContract$InputData(inviteCreation.f77188a, inviteCreation.f77189b));
            qce.a block = new qce.a(aVar, FlowCoordinator, 18);
            Intrinsics.checkNotNullParameter(block, "block");
            juniorInviteCreationScreen.H = block;
            return juniorInviteCreationScreen;
        }
        if (!(step instanceof JuniorInviteCreationFlowContract$Step.CreatePhoneNumber)) {
            if (Intrinsics.f(step, JuniorInviteCreationFlowContract$Step.QrCodeScanner.f77190a)) {
                return aVar.e1(new kn8.e(juniorInviteCreationFlowContract$InputData.f77186a.f77103j));
            }
            throw new NoWhenBranchMatchedException();
        }
        JuniorCreatePhoneNumberFlow juniorCreatePhoneNumberFlow = new JuniorCreatePhoneNumberFlow(new JuniorCreatePhoneNumberDestination.InputData(juniorInviteCreationFlowContract$InputData.f77186a));
        qi3.i block2 = new qi3.i(1, aVar, com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.a.class, "handleJuniorCreatePhoneNumberResult", "handleJuniorCreatePhoneNumberResult(Lcom/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlowContract$OutputData;)V", 0, 5);
        Intrinsics.checkNotNullParameter(block2, "block");
        juniorCreatePhoneNumberFlow.H = block2;
        return juniorCreatePhoneNumberFlow;
    }

    /* JADX WARN: Type inference failed for: r1v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v134, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        BaseScreen sharedFavouritesAssetTypeChooserScreen;
        int i = this.f242369a;
        final int i2 = 2;
        final int i3 = 1;
        Object obj4 = this.f242370b;
        switch (i) {
            case 0:
                final com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelFlightsCheckoutScreenContract$ModalStep step = (TravelFlightsCheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelFlightsCheckoutScreenContract$ModalStep.PocketSelection) {
                    dj0.d dVar = ((TravelFlightsCheckoutScreenContract$ModalStep.PocketSelection) step).f93304a;
                    u6c.t tVar = u6c.t.FLIGHTS;
                    Object content = ((s) ((j2) bVar.B.f22677a).getValue()).f.getContent();
                    u uVar = content instanceof u ? (u) content : null;
                    ViewController viewControllerE1 = bVar.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(tVar, dVar, uVar != null ? uVar.f242392a : null, null, null, null, w6c.f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 1912)));
                    final int i5 = 0;
                    Function1 block = new Function1() { // from class: q5g.e0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    w6c.e output = (w6c.e) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof w6c.c) {
                                        PaymentMethod paymentMethod = ((w6c.c) output).f295413a;
                                        PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                                        if (pocket != null) {
                                            j2 j2Var = bVar.o.d;
                                            od0.i.Companion.getClass();
                                            od0.i iVarA = od0.h.a(pocket);
                                            j2Var.getClass();
                                            j2Var.g(null, iVarA);
                                        }
                                    }
                                    break;
                                default:
                                    y4g.h output2 = (y4g.h) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar2 = bVar;
                                    bVar2.H2(bVar2.B, new q56.o(output2, 3));
                                    bVar2.f93316x.a();
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    viewControllerE1.H = block;
                    return viewControllerE1;
                }
                if (step instanceof TravelFlightsCheckoutScreenContract$ModalStep.ItineraryPreview) {
                    TravelFlightsCheckoutScreenContract$ModalStep.ItineraryPreview itineraryPreview = (TravelFlightsCheckoutScreenContract$ModalStep.ItineraryPreview) step;
                    return new TravelFlightsItineraryPreviewScreen(new TravelFlightsItineraryPreviewScreenContract$InputData(itineraryPreview.f93301a, itineraryPreview.f93302b, itineraryPreview.f93303c));
                }
                if (step instanceof TravelFlightsCheckoutScreenContract$ModalStep.BookingContact) {
                    TravelFlightsCheckoutScreenContract$ModalStep.BookingContact bookingContact = (TravelFlightsCheckoutScreenContract$ModalStep.BookingContact) step;
                    TravelFlightsBookingContactScreen travelFlightsBookingContactScreen = new TravelFlightsBookingContactScreen(new TravelFlightsBookingContactScreenContract$InputData.ForCheckout(bookingContact.f93299a, bookingContact.f93300b));
                    Function1 block2 = new Function1() { // from class: q5g.e0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    w6c.e output = (w6c.e) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof w6c.c) {
                                        PaymentMethod paymentMethod = ((w6c.c) output).f295413a;
                                        PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                                        if (pocket != null) {
                                            j2 j2Var = bVar.o.d;
                                            od0.i.Companion.getClass();
                                            od0.i iVarA = od0.h.a(pocket);
                                            j2Var.getClass();
                                            j2Var.g(null, iVarA);
                                        }
                                    }
                                    break;
                                default:
                                    y4g.h output2 = (y4g.h) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar2 = bVar;
                                    bVar2.H2(bVar2.B, new q56.o(output2, 3));
                                    bVar2.f93316x.a();
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    travelFlightsBookingContactScreen.H = block2;
                    return travelFlightsBookingContactScreen;
                }
                if (!(step instanceof TravelFlightsCheckoutScreenContract$ModalStep.PriceChanged)) {
                    if (step instanceof TravelFlightsCheckoutScreenContract$ModalStep.PriceBreakdown) {
                        return new TravelFlightsPriceBreakdownScreen(new TravelFlightsPriceBreakdownScreenContract$InputData(((TravelFlightsCheckoutScreenContract$ModalStep.PriceBreakdown) step).f93305a));
                    }
                    if (Intrinsics.f(step, TravelFlightsCheckoutScreenContract$ModalStep.SelfTransfer.f93307a)) {
                        return new TravelFlightsSelfTransferScreen();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                boolean z = ((TravelFlightsCheckoutScreenContract$ModalStep.PriceChanged) step).f93306a;
                bVar.u.getClass();
                ActionsBottomSheetController actionsBottomSheetControllerA = j4g.c.a(new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_checkout_error_price_update_btn_title, null, null, 14));
                if (z) {
                    actionsBottomSheetControllerA.l2(new d0(bVar, i3));
                }
                return actionsBottomSheetControllerA;
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                GiveConsentScreenContract$ModalStep step2 = (GiveConsentScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof GiveConsentScreenContract$ModalStep.DeclineConfirmation)) {
                    if (step2 instanceof GiveConsentScreenContract$ModalStep.Info) {
                        return bVar2.e1(new fy4.s(new fy4.t(((GiveConsentScreenContract$ModalStep.Info) step2).f67233a)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                iu3.o oVar = ((iu3.v) zi0.c.I(((q64.l) ((j2) bVar2.f67236q.f22677a).getValue()).f242484a)).f168515l;
                lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.co_borrower_consent_give_consent_decline_title, zhm.u.c(new TextClause(oVar.f168492a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.co_borrower_consent_give_consent_decline_description, zhm.u.c(new TextClause(oVar.f168493b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, 28);
                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.co_borrower_consent_give_consent_decline_primary_button, zhm.u.c(new TextClause(oVar.f168494c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.co_borrower_consent_give_consent_decline_secondary_button, zhm.u.c(new TextClause(oVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                q56.o block3 = new q56.o(bVar2, 6);
                Intrinsics.checkNotNullParameter(block3, "block");
                actionsBottomSheetController.H = block3;
                return actionsBottomSheetController;
            case 2:
                LoanPartialRepaymentController loanPartialRepaymentController = (LoanPartialRepaymentController) obj4;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = LoanPartialRepaymentController.X;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract.InputAmountParcel");
                return new zp0.d(field.getEditText(), ((q75.j) obj5).f242750a, (u80.d) loanPartialRepaymentController.R.getValue(), null, new onh.b(loanPartialRepaymentController, 10), false, false, 0, false, null, 1928);
            case 3:
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar2 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) obj4;
                m35.f fVar = aVar2.f70500t;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                LoanPartialRepaymentControllerContract$ModalStep step3 = (LoanPartialRepaymentControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof LoanPartialRepaymentControllerContract$ModalStep.Picker) {
                    q35.f0 f0Var = aVar2.K2().f70505b;
                    ViewController viewControllerE12 = aVar2.e1(new g1j.a(new BalanceSelector$InputData(f0Var.f241816g, k1j.d.RETAIL, io3.l.CURRENT, null, null, f0Var.f241817h, null, aVar2.K2().a(), null, 344), aVar2.f70498r));
                    q56.o block4 = new q56.o(aVar2, 9);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    viewControllerE12.H = block4;
                    return viewControllerE12;
                }
                if (step3 instanceof LoanPartialRepaymentControllerContract$ModalStep.LoanStateExplainer) {
                    m35.o oVarB = ((c55.j0) aVar2.f70499s).b(((LoanPartialRepaymentControllerContract$ModalStep.LoanStateExplainer) step3).f70491a, false);
                    if (oVarB instanceof m35.n) {
                        return aVar2.e1(((m35.n) oVarB).f202290a);
                    }
                    if (!(oVarB instanceof m35.m)) {
                        if (oVarB == null) {
                            throw new IllegalArgumentException("Explainer dialog was null");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    CreditBottomSheetListItemsController creditBottomSheetListItemsController = ((m35.m) oVarB).f202289a;
                    pvc.e block5 = new pvc.e(1, aVar2, com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a.class, "handleStateExplainerResult", "handleStateExplainerResult(Lcom/revolut/feature/credit/core/ui/bottom_sheet/list/CreditBottomSheetListItemsController$OutputData;)V", 0, 7);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    creditBottomSheetListItemsController.H = block5;
                    return creditBottomSheetListItemsController;
                }
                if (step3 instanceof LoanPartialRepaymentControllerContract$ModalStep.RepaymentStampDutyExplainer) {
                    return ((c55.n) fVar).b(((LoanPartialRepaymentControllerContract$ModalStep.RepaymentStampDutyExplainer) step3).f70494a);
                }
                if (step3 instanceof LoanPartialRepaymentControllerContract$ModalStep.MonthlyRepaymentReductionExplainer) {
                    ((c55.n) fVar).getClass();
                    lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.loan_management_repayment_amount_input_bottom_sheet_amount_reduced_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_repayment_amount_input_bottom_sheet_amount_reduced_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var2 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar3, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                }
                if (!(step3 instanceof LoanPartialRepaymentControllerContract$ModalStep.FinalRepaymentReductionExplainer)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((c55.n) fVar).getClass();
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.loan_management_repayment_amount_input_bottom_sheet_term_reduced_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_repayment_amount_input_bottom_sheet_term_reduced_description, null, null, 14), null, null, false, 28);
                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var3 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar4, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
            case 4:
                final com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.debts.c) obj4;
                OutstandingDebtsFlowContract$InputData outstandingDebtsFlowContract$InputData = cVar.f67436s;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                OutstandingDebtsFlowContract$Step step4 = (OutstandingDebtsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof OutstandingDebtsFlowContract$Step.Intro) {
                    FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(ug4.a.b(new TextLocalisedClause(R$string.credit_application_outstanding_debts_intro_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_outstanding_debts_intro_description, null, null, 14), outstandingDebtsFlowContract$InputData.f67413a, false, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D310", null, null, null, 30), new TextLocalisedClause(R$string.credit_application_outstanding_debts_intro_primary_action, null, null, 14), new TextLocalisedClause(R$string.credit_application_outstanding_debts_intro_secondary_action, null, null, 14), 15928));
                    final int i6 = 0;
                    Function1 block6 = new Function1() { // from class: q84.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i21 = i6;
                            com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar2 = cVar;
                            switch (i21) {
                                case 0:
                                    com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof c.C0497c) {
                                        cVar2.P2();
                                    } else if (result instanceof c.d) {
                                        cVar2.n2(new k(cVar2, null, 2), new whi.b(6));
                                    } else if (result instanceof c.a) {
                                        cVar2.l2(new k(cVar2, null, 0), new yi5.b(26));
                                    } else {
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "OutstandingDebtsFlowControllerModel", "Can't support this action " + result + ", for OutstandingDebtsFlowContract.Step.Intro", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    x84.l result2 = (x84.l) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof x84.h) {
                                        cVar2.P2();
                                    } else if (result2 instanceof x84.i) {
                                        cVar2.l2(new k(cVar2, null, 1), new yi5.b(26));
                                    } else if (result2 instanceof x84.k) {
                                        oki.h.u2(cVar2, cVar2.u, new OutstandingDebtsFlowContract$Step.DebtDetails(((x84.k) result2).f303284a), null, 6);
                                    } else {
                                        if (!(result2 instanceof x84.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar2.l2(new q03.m(cVar2, result2, null, 19), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    r84.f it8 = (r84.f) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.r2(cVar2.u);
                                    cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    t84.e result3 = (t84.e) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    cVar2.l2(new prl.k(cVar2, result3.f268836a, (Continuation) null, 22), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    v84.d output = (v84.d) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof v84.d) {
                                        oki.h.r2(cVar2.u);
                                        cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    fullScreenPromptScreen.H = block6;
                    return fullScreenPromptScreen;
                }
                if (step4 instanceof OutstandingDebtsFlowContract$Step.DebtsHub) {
                    OutstandingDebtsFlowContract$Step.DebtsHub debtsHub = (OutstandingDebtsFlowContract$Step.DebtsHub) step4;
                    DebtsHubScreen debtsHubScreen = new DebtsHubScreen(new DebtsHubScreenContract$InputData(debtsHub.f67419b, debtsHub.f67418a, outstandingDebtsFlowContract$InputData.f67413a));
                    Function1 function1 = new Function1() { // from class: q84.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i21 = i3;
                            com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar2 = cVar;
                            switch (i21) {
                                case 0:
                                    com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof c.C0497c) {
                                        cVar2.P2();
                                    } else if (result instanceof c.d) {
                                        cVar2.n2(new k(cVar2, null, 2), new whi.b(6));
                                    } else if (result instanceof c.a) {
                                        cVar2.l2(new k(cVar2, null, 0), new yi5.b(26));
                                    } else {
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "OutstandingDebtsFlowControllerModel", "Can't support this action " + result + ", for OutstandingDebtsFlowContract.Step.Intro", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    x84.l result2 = (x84.l) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof x84.h) {
                                        cVar2.P2();
                                    } else if (result2 instanceof x84.i) {
                                        cVar2.l2(new k(cVar2, null, 1), new yi5.b(26));
                                    } else if (result2 instanceof x84.k) {
                                        oki.h.u2(cVar2, cVar2.u, new OutstandingDebtsFlowContract$Step.DebtDetails(((x84.k) result2).f303284a), null, 6);
                                    } else {
                                        if (!(result2 instanceof x84.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar2.l2(new q03.m(cVar2, result2, null, 19), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    r84.f it8 = (r84.f) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.r2(cVar2.u);
                                    cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    t84.e result3 = (t84.e) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    cVar2.l2(new prl.k(cVar2, result3.f268836a, (Continuation) null, 22), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    v84.d output = (v84.d) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof v84.d) {
                                        oki.h.r2(cVar2.u);
                                        cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    debtsHubScreen.H = function1;
                    return debtsHubScreen;
                }
                if (step4 instanceof OutstandingDebtsFlowContract$Step.AddDebt) {
                    OutstandingDebtsFlowContract$Step.AddDebt addDebt = (OutstandingDebtsFlowContract$Step.AddDebt) step4;
                    AddDebtScreen addDebtScreen = new AddDebtScreen(new AddDebtScreenContract$InputData(addDebt.f67414a, addDebt.f67415b, outstandingDebtsFlowContract$InputData.f67413a));
                    Function1 function12 = new Function1() { // from class: q84.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i21 = i2;
                            com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar2 = cVar;
                            switch (i21) {
                                case 0:
                                    com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof c.C0497c) {
                                        cVar2.P2();
                                    } else if (result instanceof c.d) {
                                        cVar2.n2(new k(cVar2, null, 2), new whi.b(6));
                                    } else if (result instanceof c.a) {
                                        cVar2.l2(new k(cVar2, null, 0), new yi5.b(26));
                                    } else {
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "OutstandingDebtsFlowControllerModel", "Can't support this action " + result + ", for OutstandingDebtsFlowContract.Step.Intro", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    x84.l result2 = (x84.l) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof x84.h) {
                                        cVar2.P2();
                                    } else if (result2 instanceof x84.i) {
                                        cVar2.l2(new k(cVar2, null, 1), new yi5.b(26));
                                    } else if (result2 instanceof x84.k) {
                                        oki.h.u2(cVar2, cVar2.u, new OutstandingDebtsFlowContract$Step.DebtDetails(((x84.k) result2).f303284a), null, 6);
                                    } else {
                                        if (!(result2 instanceof x84.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar2.l2(new q03.m(cVar2, result2, null, 19), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    r84.f it8 = (r84.f) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.r2(cVar2.u);
                                    cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    t84.e result3 = (t84.e) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    cVar2.l2(new prl.k(cVar2, result3.f268836a, (Continuation) null, 22), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    v84.d output = (v84.d) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof v84.d) {
                                        oki.h.r2(cVar2.u);
                                        cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function12, "<set-?>");
                    addDebtScreen.H = function12;
                    return addDebtScreen;
                }
                if (step4 instanceof OutstandingDebtsFlowContract$Step.AddOtherDebt) {
                    AddOtherDebtScreen addOtherDebtScreen = new AddOtherDebtScreen();
                    final int i21 = 3;
                    Function1 function13 = new Function1() { // from class: q84.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i212 = i21;
                            com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar2 = cVar;
                            switch (i212) {
                                case 0:
                                    com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof c.C0497c) {
                                        cVar2.P2();
                                    } else if (result instanceof c.d) {
                                        cVar2.n2(new k(cVar2, null, 2), new whi.b(6));
                                    } else if (result instanceof c.a) {
                                        cVar2.l2(new k(cVar2, null, 0), new yi5.b(26));
                                    } else {
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "OutstandingDebtsFlowControllerModel", "Can't support this action " + result + ", for OutstandingDebtsFlowContract.Step.Intro", null, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    x84.l result2 = (x84.l) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof x84.h) {
                                        cVar2.P2();
                                    } else if (result2 instanceof x84.i) {
                                        cVar2.l2(new k(cVar2, null, 1), new yi5.b(26));
                                    } else if (result2 instanceof x84.k) {
                                        oki.h.u2(cVar2, cVar2.u, new OutstandingDebtsFlowContract$Step.DebtDetails(((x84.k) result2).f303284a), null, 6);
                                    } else {
                                        if (!(result2 instanceof x84.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar2.l2(new q03.m(cVar2, result2, null, 19), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    r84.f it8 = (r84.f) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.r2(cVar2.u);
                                    cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    t84.e result3 = (t84.e) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    cVar2.l2(new prl.k(cVar2, result3.f268836a, (Continuation) null, 22), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    v84.d output = (v84.d) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof v84.d) {
                                        oki.h.r2(cVar2.u);
                                        cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function13, "<set-?>");
                    addOtherDebtScreen.H = function13;
                    return addOtherDebtScreen;
                }
                if (!(step4 instanceof OutstandingDebtsFlowContract$Step.DebtDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                DebtDetailsScreen debtDetailsScreen = new DebtDetailsScreen(new DebtDetailsScreenContract$InputData(((OutstandingDebtsFlowContract$Step.DebtDetails) step4).f67417a, outstandingDebtsFlowContract$InputData.f67413a));
                final int i22 = 4;
                Function1 function14 = new Function1() { // from class: q84.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i212 = i22;
                        com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar2 = cVar;
                        switch (i212) {
                            case 0:
                                com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof c.C0497c) {
                                    cVar2.P2();
                                } else if (result instanceof c.d) {
                                    cVar2.n2(new k(cVar2, null, 2), new whi.b(6));
                                } else if (result instanceof c.a) {
                                    cVar2.l2(new k(cVar2, null, 0), new yi5.b(26));
                                } else {
                                    h0 h0Var = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, "OutstandingDebtsFlowControllerModel", "Can't support this action " + result + ", for OutstandingDebtsFlowContract.Step.Intro", null, h0Var);
                                }
                                return Unit.f186387a;
                            case 1:
                                x84.l result2 = (x84.l) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof x84.h) {
                                    cVar2.P2();
                                } else if (result2 instanceof x84.i) {
                                    cVar2.l2(new k(cVar2, null, 1), new yi5.b(26));
                                } else if (result2 instanceof x84.k) {
                                    oki.h.u2(cVar2, cVar2.u, new OutstandingDebtsFlowContract$Step.DebtDetails(((x84.k) result2).f303284a), null, 6);
                                } else {
                                    if (!(result2 instanceof x84.j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar2.l2(new q03.m(cVar2, result2, null, 19), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 2:
                                r84.f it8 = (r84.f) obj6;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                oki.h.r2(cVar2.u);
                                cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                return Unit.f186387a;
                            case 3:
                                t84.e result3 = (t84.e) obj6;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                cVar2.l2(new prl.k(cVar2, result3.f268836a, (Continuation) null, 22), new yi5.b(26));
                                return Unit.f186387a;
                            default:
                                v84.d output = (v84.d) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof v84.d) {
                                    oki.h.r2(cVar2.u);
                                    cVar2.l2(new l(cVar2, null, 1), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(function14, "<set-?>");
                debtDetailsScreen.H = function14;
                return debtDetailsScreen;
            case 5:
                com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar5 = (com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                MarketDetailsRedesignScreenContract$ModalStep step5 = (MarketDetailsRedesignScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!Intrinsics.f(step5, MarketDetailsRedesignScreenContract$ModalStep.EconomicIndicatorsInfo.f74601a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar5.f74606t.getClass();
                lw0.a aVar6 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_title, null, null, 14), null, null, null, false, 30);
                Object obj6 = null;
                RowDelegate.Model.c cVar2 = null;
                boolean z3 = false;
                boolean z4 = false;
                boolean z6 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z29 = false;
                List listK = zhm.v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_gdp_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_gdp_message, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_boost, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), false, false, cVar2, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_inflation_rate_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_inflation_rate_message, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rates, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), false, false, cVar2, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_interest_rate_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_interest_rate_message, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_percent, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z6, z6, 6), false, false, cVar2, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_retail_sales_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_retail_sales_message, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shopping, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z11, z11, 6), false, false, cVar2, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_unemployment_rate_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_unemployment_rate_message, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wealth_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z12, z12, 6), false, false, cVar2, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_consumer_confidence_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_markets_economic_indicators_help_consumer_confidence_message, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z29, z29, 6), false, false, cVar2, obj6, 488));
                k9 value = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new RowActionsBottomSheetController(new eii.c(aVar6, new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), listK, new AnalyticsProduct.Retail(value), null));
            case 6:
                com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a aVar7 = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EnrollmentListContract$Step step6 = (EnrollmentListContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof EnrollmentListContract$Step.Details) {
                    return new EnrollmentDetailsScreen(new EnrollmentDetailsScreenContract$InputData(((EnrollmentListContract$Step.Details) step6).f62669a));
                }
                if (!(step6 instanceof EnrollmentListContract$Step.AddEnrollment)) {
                    throw new NoWhenBranchMatchedException();
                }
                EnrollmentRegistrationScreen enrollmentRegistrationScreen = new EnrollmentRegistrationScreen(new EnrollmentRegistrationScreenContract$InputData(((EnrollmentListContract$Step.AddEnrollment) step6).f62668a));
                q56.o block7 = new q56.o(aVar7, 15);
                Intrinsics.checkNotNullParameter(block7, "block");
                enrollmentRegistrationScreen.H = block7;
                return enrollmentRegistrationScreen;
            case 7:
                com.revolut.feature.apm.payid.impl.screen.createpayid.flow.a aVar8 = (com.revolut.feature.apm.payid.impl.screen.createpayid.flow.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                CreatePayIdFlowContract$Step step7 = (CreatePayIdFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof CreatePayIdFlowContract$Step.AddPayID) {
                    AddPayIdScreen addPayIdScreen = new AddPayIdScreen();
                    q2g.h block8 = new q2g.h(aVar8, FlowCoordinator, 11);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    addPayIdScreen.H = block8;
                    return addPayIdScreen;
                }
                if (!(step7 instanceof CreatePayIdFlowContract$Step.Otp)) {
                    throw new NoWhenBranchMatchedException();
                }
                OtpScreen otpScreen = new OtpScreen(new sa2.e(((CreatePayIdFlowContract$Step.Otp) step7).f62726a, null));
                baa.c block9 = new baa.c(aVar8, FlowCoordinator, 18);
                Intrinsics.checkNotNullParameter(block9, "block");
                otpScreen.H = block9;
                return otpScreen;
            case 8:
                com.revolut.feature.onboarding.impl.onboarding.country.screen.a aVar9 = (com.revolut.feature.onboarding.impl.onboarding.country.screen.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CountryResidenceScreenContract$Modal modal = (CountryResidenceScreenContract$Modal) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modal, "modal");
                if (Intrinsics.f(modal, CountryResidenceScreenContract$Modal.LanguageChangeDialog.f78429a)) {
                    return new LanguageChangeFlow(new LanguageChangeFlowContract$InputData(true));
                }
                if (!Intrinsics.f(modal, CountryResidenceScreenContract$Modal.CountryPicker.f78428a)) {
                    if (modal instanceof CountryResidenceScreenContract$Modal.ContractualDocumentation) {
                        return aVar9.f78430p.a("CONTRACTUAL_DOCUMENTATION_LINK_ID", ((CountryResidenceScreenContract$Modal.ContractualDocumentation) modal).f78427a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                s7a.x xVar = new s7a.x(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.country_codes_title, null, null, 14), null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_registration_country_search_hint, null, null, 14), null, null, false, null, ((qa9.k) ((j2) aVar9.u.f22677a).getValue()).f243986a.f297794a, null, null, true, null, null, null, null, null, 2138963450);
                Object obj7 = aVar9.f78433s.get();
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                PickerController pickerController = new PickerController(xVar, (x7a.d) obj7);
                qa9.r block10 = new qa9.r(aVar9, 0);
                Intrinsics.checkNotNullParameter(block10, "block");
                pickerController.H = block10;
                return pickerController;
            case 9:
                CashTopUpAmountScreen cashTopUpAmountScreen = (CashTopUpAmountScreen) obj4;
                AmountEditDelegate.Model model = (AmountEditDelegate.Model) obj2;
                AmountEditView field2 = (AmountEditView) obj3;
                KProperty[] kPropertyArr2 = CashTopUpAmountScreen.f0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText = field2.getEditText();
                Object obj8 = model.f51629j;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreenContract.AmountModelPayload");
                return new zp0.d(editText, ((qb3.g) obj8).f244087a, (u80.d) cashTopUpAmountScreen.f65607b0.getValue(), null, new qb3.d(cashTopUpAmountScreen), false, false, 0, false, null, 1928);
            case 10:
                pd9.a domain = (pd9.a) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((qb9.b) obj4).f244137b.f("onboarding_countries_memory_key", domain);
                return Unit.f186387a;
            case 11:
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr3 = PixQrCodeTransactionAmountScreen.W;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field3, "field");
                MaskedTextInputEditText editText2 = field3.getEditText();
                xi0.b.Companion.getClass();
                return new zp0.d(editText2, xi0.b.D, (u80.d) ((PixQrCodeTransactionAmountScreen) obj4).Q.getValue(), null, null, false, false, 0, false, null, 1944);
            case 12:
                final com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a aVar10 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsCancellationPolicyScreenContract$ModalStep step8 = (TravelHotelsCancellationPolicyScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof TravelHotelsCancellationPolicyScreenContract$ModalStep.Confirmation) {
                    TravelHotelsCancellationPolicyScreenContract$ModalStep.Confirmation confirmation = (TravelHotelsCancellationPolicyScreenContract$ModalStep.Confirmation) step8;
                    TravelHotelsCancellationConfirmationScreen travelHotelsCancellationConfirmationScreen = new TravelHotelsCancellationConfirmationScreen(new TravelHotelsCancellationConfirmationContract$InputData(confirmation.f93870a, confirmation.f93871b, confirmation.f93872c));
                    q2g.h block11 = new q2g.h(aVar10, confirmation, 17);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    travelHotelsCancellationConfirmationScreen.H = block11;
                    return travelHotelsCancellationConfirmationScreen;
                }
                if (step8 instanceof TravelHotelsCancellationPolicyScreenContract$ModalStep.NetRefund) {
                    TravelHotelsCancellationPolicyScreenContract$ModalStep.NetRefund netRefund = (TravelHotelsCancellationPolicyScreenContract$ModalStep.NetRefund) step8;
                    TravelHotelsCancellationNetRefundScreen travelHotelsCancellationNetRefundScreen = new TravelHotelsCancellationNetRefundScreen(new TravelHotelsCancellationNetRefundScreenContract$InputData(netRefund.f93874b, netRefund.f93873a));
                    final int i32 = 0;
                    Function1 block12 = new Function1() { // from class: qbg.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i32) {
                                case 0:
                                    ubg.e output = (ubg.e) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, e.a.f278894a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.y2(aVar10.f93883s, TravelHotelsCancellationPolicyScreenContract$ModalStep.PointsReversal.f93875a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    return Unit.f186387a;
                                default:
                                    dii.g it8 = (dii.g) obj9;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar10.B2();
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    travelHotelsCancellationNetRefundScreen.H = block12;
                    return travelHotelsCancellationNetRefundScreen;
                }
                if (!Intrinsics.f(step8, TravelHotelsCancellationPolicyScreenContract$ModalStep.PointsReversal.f93875a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar10.f93882r.getClass();
                lw0.a aVar11 = new lw0.a(new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_booking_details_manage_booking_cancellation_points_reversal, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_booking_details_manage_booking_cancellation_points_reversal_description, null, null, 14), null, null, false, 28);
                aw0.e eVar3 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var4 = k9.Travel;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar11, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                Function1 block13 = new Function1() { // from class: qbg.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i3) {
                            case 0:
                                ubg.e output = (ubg.e) obj9;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (!Intrinsics.f(output, e.a.f278894a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.y2(aVar10.f93883s, TravelHotelsCancellationPolicyScreenContract$ModalStep.PointsReversal.f93875a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                return Unit.f186387a;
                            default:
                                dii.g it8 = (dii.g) obj9;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                aVar10.B2();
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block13, "block");
                actionsBottomSheetController2.H = block13;
                return actionsBottomSheetController2;
            case 13:
                xl2.h0 item = (xl2.h0) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                ((qc0.j0) obj4).Y.onNext(new Pair(item, (ValidationResult) obj3));
                return Unit.f186387a;
            case 14:
                com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a aVar12 = (com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CountriesSelectionScreenContract$ModalStep step9 = (CountriesSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof CountriesSelectionScreenContract$ModalStep.ExpectedAmount)) {
                    throw new NoWhenBranchMatchedException();
                }
                wi0.b bVar3 = ((CountriesSelectionScreenContract$ModalStep.ExpectedAmount) step9).f97761a;
                xi0.b.Companion.getClass();
                ExpectedAmountController expectedAmountController = new ExpectedAmountController(new ExpectedAmountControllerContract$InputData(bVar3, xi0.a.b(bVar3)));
                qce.a block14 = new qce.a(step9, aVar12, i3);
                Intrinsics.checkNotNullParameter(block14, "block");
                expectedAmountController.H = block14;
                return expectedAmountController;
            case 15:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a aVar13 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator9 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EditTaxRateScreenContract$ModalStep it8 = (EditTaxRateScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator9, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, EditTaxRateScreenContract$ModalStep.DeleteConfirmation.f60810a)) {
                    throw new NoWhenBranchMatchedException();
                }
                rd1.a aVar14 = aVar13.f60812q;
                aVar14.getClass();
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_tax_rates_delete_tax_rate_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_tax_rates_delete_tax_rate_subtitle, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_common_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), aVar14.f253314b, null, null, 24));
                qa9.r block15 = new qa9.r(aVar13, 24);
                Intrinsics.checkNotNullParameter(block15, "block");
                actionsBottomSheetController3.H = block15;
                return actionsBottomSheetController3;
            case 16:
                final com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar15 = (com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a) obj4;
                SharedAddAlertFlowContract$InputData sharedAddAlertFlowContract$InputData = aVar15.o;
                qki.d dVar2 = aVar15.f86698q;
                SharedAddAlertFlowContract$Step step10 = (SharedAddAlertFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                int i33 = qed.d.f245119a[step10.ordinal()];
                if (i33 != 1) {
                    int i43 = 5;
                    if (i33 == 2) {
                        FavouritesAssetTypeKey favouritesAssetTypeKey = ((SharedAddAlertFlowContract$State) ((j2) dVar2.f22677a).getValue()).f86694a;
                        if (favouritesAssetTypeKey == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen = new SharedFavouritesAddAssetScreen(new SharedFavouritesAddAssetScreenContract$InputData(favouritesAssetTypeKey, sharedAddAlertFlowContract$InputData.Z1(), yfd.n.SINGLE, null));
                        qce.a aVar16 = new qce.a(aVar15, favouritesAssetTypeKey, i43);
                        Intrinsics.checkNotNullParameter(aVar16, "<set-?>");
                        sharedFavouritesAddAssetScreen.H = aVar16;
                        return sharedFavouritesAddAssetScreen;
                    }
                    if (i33 == 3) {
                        FavouritesAssetDetails favouritesAssetDetails = ((SharedAddAlertFlowContract$State) ((j2) dVar2.f22677a).getValue()).f86695b;
                        if (favouritesAssetDetails == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        SharedCreateAlertScreenContract$InputData.Create create = new SharedCreateAlertScreenContract$InputData.Create(favouritesAssetDetails, !sharedAddAlertFlowContract$InputData.s1(), ((SharedAddAlertFlowContract$State) ((j2) dVar2.f22677a).getValue()).f86696c);
                        BaseScreen sharedCreateAlertRevampedScreen = r6.b.B(xi0.b.Companion, favouritesAssetDetails.f86863a) ? new SharedCreateAlertRevampedScreen(create) : new SharedCreateAlertScreen(create);
                        Function1 function15 = new Function1() { // from class: qed.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                switch (i2) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter((p0j.e) obj9, "<unused var>");
                                        oki.h.D2(aVar15.f86699r);
                                        return Unit.f186387a;
                                    case 1:
                                        bgd.e outputData = (bgd.e) obj9;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z31 = outputData instanceof e.a;
                                        com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar17 = aVar15;
                                        if (z31) {
                                            aVar17.B2();
                                        } else {
                                            if (!(outputData instanceof bgd.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar17.H2(aVar17.f86698q, new qa9.r(outputData, 25));
                                            oki.h.t2(aVar17, aVar17.f86699r, SharedAddAlertFlowContract$Step.FROM_ASSET_CHOOSER, false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        p outputData2 = (p) obj9;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        boolean zF = Intrinsics.f(outputData2, p.a.f312888a);
                                        com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar18 = aVar15;
                                        if (zF) {
                                            aVar18.l2(new qc8.b(aVar18, null, 3), new yi5.b(26));
                                        } else {
                                            if (!Intrinsics.f(outputData2, p.b.f312889a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar18.C1(new SharedAlertsDestination(new SharedAlertsConfiguration(d0.i1(aVar18.o.Q3()), (Set) null, (mgd.d) null, (SharedAlertsConfiguration.Action.CreateAlert) null, false, 62), false));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(function15, "<set-?>");
                        sharedCreateAlertRevampedScreen.H = function15;
                        return sharedCreateAlertRevampedScreen;
                    }
                    if (i33 != 4) {
                        if (i33 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ViewController viewControllerE13 = aVar15.e1(p0j.b.f231545a);
                        final int i59 = 0;
                        Function1 block16 = new Function1() { // from class: qed.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                switch (i59) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter((p0j.e) obj9, "<unused var>");
                                        oki.h.D2(aVar15.f86699r);
                                        return Unit.f186387a;
                                    case 1:
                                        bgd.e outputData = (bgd.e) obj9;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z31 = outputData instanceof e.a;
                                        com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar17 = aVar15;
                                        if (z31) {
                                            aVar17.B2();
                                        } else {
                                            if (!(outputData instanceof bgd.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar17.H2(aVar17.f86698q, new qa9.r(outputData, 25));
                                            oki.h.t2(aVar17, aVar17.f86699r, SharedAddAlertFlowContract$Step.FROM_ASSET_CHOOSER, false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        p outputData2 = (p) obj9;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        boolean zF = Intrinsics.f(outputData2, p.a.f312888a);
                                        com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar18 = aVar15;
                                        if (zF) {
                                            aVar18.l2(new qc8.b(aVar18, null, 3), new yi5.b(26));
                                        } else {
                                            if (!Intrinsics.f(outputData2, p.b.f312889a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar18.C1(new SharedAlertsDestination(new SharedAlertsConfiguration(d0.i1(aVar18.o.Q3()), (Set) null, (mgd.d) null, (SharedAlertsConfiguration.Action.CreateAlert) null, false, 62), false));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block16, "block");
                        viewControllerE13.H = block16;
                        return viewControllerE13;
                    }
                    AlertItem alertItem = ((SharedAddAlertFlowContract$State) ((j2) dVar2.f22677a).getValue()).d;
                    if (alertItem == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    sharedFavouritesAssetTypeChooserScreen = new SharedCreateAlertRevampedScreen(new SharedCreateAlertScreenContract$InputData.Edit(alertItem));
                    Function1 function16 = new Function1() { // from class: qed.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i2) {
                                case 0:
                                    Intrinsics.checkNotNullParameter((p0j.e) obj9, "<unused var>");
                                    oki.h.D2(aVar15.f86699r);
                                    return Unit.f186387a;
                                case 1:
                                    bgd.e outputData = (bgd.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z31 = outputData instanceof e.a;
                                    com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar17 = aVar15;
                                    if (z31) {
                                        aVar17.B2();
                                    } else {
                                        if (!(outputData instanceof bgd.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar17.H2(aVar17.f86698q, new qa9.r(outputData, 25));
                                        oki.h.t2(aVar17, aVar17.f86699r, SharedAddAlertFlowContract$Step.FROM_ASSET_CHOOSER, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    p outputData2 = (p) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean zF = Intrinsics.f(outputData2, p.a.f312888a);
                                    com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar18 = aVar15;
                                    if (zF) {
                                        aVar18.l2(new qc8.b(aVar18, null, 3), new yi5.b(26));
                                    } else {
                                        if (!Intrinsics.f(outputData2, p.b.f312889a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar18.C1(new SharedAlertsDestination(new SharedAlertsConfiguration(d0.i1(aVar18.o.Q3()), (Set) null, (mgd.d) null, (SharedAlertsConfiguration.Action.CreateAlert) null, false, 62), false));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function16, "<set-?>");
                    sharedFavouritesAssetTypeChooserScreen.H = function16;
                } else {
                    sharedFavouritesAssetTypeChooserScreen = new SharedFavouritesAssetTypeChooserScreen(new SharedFavouritesAssetTypeChooserScreenContract$InputData(sharedAddAlertFlowContract$InputData.Q3()));
                    Function1 function17 = new Function1() { // from class: qed.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter((p0j.e) obj9, "<unused var>");
                                    oki.h.D2(aVar15.f86699r);
                                    return Unit.f186387a;
                                case 1:
                                    bgd.e outputData = (bgd.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z31 = outputData instanceof e.a;
                                    com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar17 = aVar15;
                                    if (z31) {
                                        aVar17.B2();
                                    } else {
                                        if (!(outputData instanceof bgd.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar17.H2(aVar17.f86698q, new qa9.r(outputData, 25));
                                        oki.h.t2(aVar17, aVar17.f86699r, SharedAddAlertFlowContract$Step.FROM_ASSET_CHOOSER, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    p outputData2 = (p) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean zF = Intrinsics.f(outputData2, p.a.f312888a);
                                    com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar18 = aVar15;
                                    if (zF) {
                                        aVar18.l2(new qc8.b(aVar18, null, 3), new yi5.b(26));
                                    } else {
                                        if (!Intrinsics.f(outputData2, p.b.f312889a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar18.C1(new SharedAlertsDestination(new SharedAlertsConfiguration(d0.i1(aVar18.o.Q3()), (Set) null, (mgd.d) null, (SharedAlertsConfiguration.Action.CreateAlert) null, false, 62), false));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function17, "<set-?>");
                    sharedFavouritesAssetTypeChooserScreen.H = function17;
                }
                return sharedFavouritesAssetTypeChooserScreen;
            case 17:
                com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar17 = (com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator10 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardDeliveryDetailsContract$ModalStep step11 = (CardDeliveryDetailsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator10, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!Intrinsics.f(step11, CardDeliveryDetailsContract$ModalStep.CancelOrderConfirmation.f89436a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CardDeliveryCancelOrderDialogController cardDeliveryCancelOrderDialogController = new CardDeliveryCancelOrderDialogController();
                qa9.r block17 = new qa9.r(aVar17, 26);
                Intrinsics.checkNotNullParameter(block17, "block");
                cardDeliveryCancelOrderDialogController.H = block17;
                return cardDeliveryCancelOrderDialogController;
            case 18:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new pf4.u((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), ((qf4.g) obj4).f245241b.a(), false, null, false, SyslogConstants.LOG_CLOCK);
            case 19:
                return a(obj2, obj3);
            case 20:
                final com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar18 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) obj4;
                TransactionListFlowContract$InputData transactionListFlowContract$InputData = aVar18.o;
                TransactionListFlowContract$Step step12 = (TransactionListFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof TransactionListFlowContract$Step.Past) {
                    TransactionsScreen transactionsScreen = new TransactionsScreen(new TransactionsScreenContract$InputData(transactionListFlowContract$InputData.e, transactionListFlowContract$InputData.f91904g, transactionListFlowContract$InputData.f91906j, transactionListFlowContract$InputData.i, transactionListFlowContract$InputData.k, transactionListFlowContract$InputData.f91907l, transactionListFlowContract$InputData.f91908m, transactionListFlowContract$InputData.f91909n, com.revolut.feature.transaction_list.impl.ui.list.flow.a.K2(transactionListFlowContract$InputData), transactionListFlowContract$InputData.f91902b, transactionListFlowContract$InputData.o, transactionListFlowContract$InputData.f91910p));
                    final int i66 = 0;
                    Function1 block18 = new Function1() { // from class: qgf.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i66) {
                                case 0:
                                    vgf.t result = (vgf.t) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, vgf.t.f289134a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z1 z1Var = aVar18.f91918s;
                                    Unit unit = Unit.f186387a;
                                    z1Var.k(unit);
                                    return unit;
                                case 1:
                                    tgf.i result2 = (tgf.i) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar19 = aVar18;
                                    aVar19.H2(aVar19.u, new o(result2, 0));
                                    return Unit.f186387a;
                                default:
                                    rgf.g result3 = (rgf.g) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar20 = aVar18;
                                    aVar20.H2(aVar20.u, new qa9.r(result3, 29));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    transactionsScreen.H = block18;
                    return transactionsScreen;
                }
                if (step12 instanceof TransactionListFlowContract$Step.TransactionFilter) {
                    TransactionsFilterScreen transactionsFilterScreen = new TransactionsFilterScreen(new TransactionsFilterScreenContract$InputData(((TransactionListFlowContract$Step.TransactionFilter) step12).f91914a));
                    Function1 block19 = new Function1() { // from class: qgf.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i3) {
                                case 0:
                                    vgf.t result = (vgf.t) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, vgf.t.f289134a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z1 z1Var = aVar18.f91918s;
                                    Unit unit = Unit.f186387a;
                                    z1Var.k(unit);
                                    return unit;
                                case 1:
                                    tgf.i result2 = (tgf.i) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar19 = aVar18;
                                    aVar19.H2(aVar19.u, new o(result2, 0));
                                    return Unit.f186387a;
                                default:
                                    rgf.g result3 = (rgf.g) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar20 = aVar18;
                                    aVar20.H2(aVar20.u, new qa9.r(result3, 29));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    transactionsFilterScreen.H = block19;
                    return transactionsFilterScreen;
                }
                if (!(step12 instanceof TransactionListFlowContract$Step.AllAccountsTransactionFilter)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransactionListFlowContract$Step.AllAccountsTransactionFilter allAccountsTransactionFilter = (TransactionListFlowContract$Step.AllAccountsTransactionFilter) step12;
                AllAccountsTransactionFiltersScreen allAccountsTransactionFiltersScreen = new AllAccountsTransactionFiltersScreen(new AllAccountsTransactionFiltersScreenContract$InputData(allAccountsTransactionFilter.f91911a, allAccountsTransactionFilter.f91912b));
                Function1 block20 = new Function1() { // from class: qgf.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i2) {
                            case 0:
                                vgf.t result = (vgf.t) obj9;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!Intrinsics.f(result, vgf.t.f289134a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z1 z1Var = aVar18.f91918s;
                                Unit unit = Unit.f186387a;
                                z1Var.k(unit);
                                return unit;
                            case 1:
                                tgf.i result2 = (tgf.i) obj9;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar19 = aVar18;
                                aVar19.H2(aVar19.u, new o(result2, 0));
                                return Unit.f186387a;
                            default:
                                rgf.g result3 = (rgf.g) obj9;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar20 = aVar18;
                                aVar20.H2(aVar20.u, new qa9.r(result3, 29));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block20, "block");
                allAccountsTransactionFiltersScreen.H = block20;
                return allAccountsTransactionFiltersScreen;
            case 21:
                return b(obj2, obj3);
            case 22:
                return c(obj2, obj3);
            case 23:
                return d(obj2, obj3);
            case 24:
                return e(obj2, obj3);
            case 25:
                return g(obj2, obj3);
            case 26:
                return h(obj2, obj3);
            case 27:
                String juniorId = (String) obj2;
                List value2 = (List) obj3;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(value2, "value");
                ((qj8.l) obj4).f246794b.f(qj8.l.a(juniorId), value2);
                return Unit.f186387a;
            case 28:
                return i(obj2, obj3);
            default:
                com.revolut.sso.impl.ui.combined_authentication.unified.a aVar19 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator11 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CombinedAuthenticationUnifiedScreenContract$ModalStep step13 = (CombinedAuthenticationUnifiedScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator11, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!Intrinsics.f(step13, CombinedAuthenticationUnifiedScreenContract$ModalStep.CountryPicker.f106433a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PickerController pickerController2 = new PickerController(new s7a.x(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_login_input_country_title, null, null, 14), null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.picker.R$string.picker_country_picker_search_hint, null, null, 14), null, null, false, null, null, null, null, true, mql.a.f208025a, null, null, null, null, 2105540094), aVar19.C);
                qll.d0 block21 = new qll.d0(aVar19, i2);
                Intrinsics.checkNotNullParameter(block21, "block");
                pickerController2.H = block21;
                return pickerController2;
        }
    }
}
