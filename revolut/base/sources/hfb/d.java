package hfb;

import a83.c0;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import cli.n;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkScreen;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.blocked_merchants.api.navigation.BlockedMerchantsListFeatureConfig;
import com.revolut.feature.call_security_info.dependencies.impl.configuration.RetailCallSecurityProductArticleKey;
import com.revolut.feature.card.verification.impl.flow.card_verification.CardVerificationFlowContract$InputData;
import com.revolut.feature.card.verification.impl.flow.card_verification.CardVerificationFlowContract$Step;
import com.revolut.feature.card.verification.impl.screen.transaction_code.TransactionCodeScreen;
import com.revolut.feature.card.verification.impl.screen.transaction_code_info.TransactionCodeInfoScreen;
import com.revolut.feature.card_management.api.CardManagementKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow.RecommendedValuatorsFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.ValuatorsListScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreenContract$InputData;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.account_information_service.AccountInformationServiceScreen;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.payment_initiation_service.PaymentInitiationServiceScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.InstitutionsListScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.feature.insurance_embedded.impl.data.model.o0;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorController;
import com.revolut.feature.payees.api.models.PayeesInputData;
import com.revolut.feature.payees.api.models.PayeesTargetUser;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsControllerContract$ModalStep;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.UnlockBenefitsFlowContract$Step;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.UnlockBenefitsScreen;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.UnlockBenefitsScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData;
import com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData;
import com.revolut.feature.retail.salary_account.impl.salary_hub.SalaryHubControllerContract$ModalStep;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.sca_prompt.api.navigation.TrustedEntitiesDestination;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.api.SecurityHubApi$Toggles;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayType;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreen;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.card_security.CardSecurityController;
import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import com.revolut.feature.security_hub.impl.ui.flow.m;
import com.revolut.feature.security_hub.impl.ui.gambling_block.GamblingBlockScreen;
import com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.HiddenAccountsAndTransactionsController;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreen;
import com.revolut.feature.security_hub.impl.ui.learn_about_security.LearnAboutSecurityScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_details.LinkedWalletDetailsScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_details.LinkedWalletDetailsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardController;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardControllerContract$InputData;
import com.revolut.feature.security_hub.impl.ui.lost_device.LostDeviceController;
import com.revolut.feature.security_hub.impl.ui.manage_merchants.ManageMerchantsScreen;
import com.revolut.feature.security_hub.impl.ui.secure_account.SecureAccountController;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreen;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlow;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$InputData;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.TransactionsDayNightLimitsFlow;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlow;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$InputData;
import com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10Screen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10ScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$Step;
import com.revolut.feature.shops.impl.flow.checkout.ModalCheckoutFlowContract$FlowState;
import com.revolut.feature.shops.impl.flow.checkout.ModalCheckoutFlowContract$Step;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreen;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreenContract$InputData;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$ModalStep;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.LogoutConfirmationFlowContract$InputData;
import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.LogoutConfirmationFlowContract$Step;
import com.revolut.feature.topup_screen.impl.data.repository.topup_methods.TopUpMethodsRequest;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.TravelMilesFlightSearchResultsFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.TravelMilesFlightSearchResultsFlowContract$Step;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreenContract$InputData;
import com.revolut.feature.trusted_merchants.api.TrustedMerchantsFeatureConfig;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionFlowContract$InputData;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionFlowContract$Step;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionController;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreenContract$ModalStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.preparing.AsftPreparingPassInfoScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingScreen;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.EsimMobilePlanNumberTransferConfirmationDynamicFormFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.EsimMobilePlanNumberPortabilityConfirmationOtpFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.EsimMobilePlanPacNumberTransferConfirmationFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.flow.PlanHubV2FlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2Screen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2ScreenContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CitizenshipGroup;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$SignInWithRevolutId;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.api.passcode.change.RevolutSsoChangePasscodeFlowDestination;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreen;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreenContract$InputData;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreen;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$InputData;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreen;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreenContract$InputData;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$Step;
import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlowContract$InputData;
import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlowContract$Step;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import gu7.g4;
import gu7.j1;
import h93.f0;
import iga.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jvc.l;
import jvc.o;
import jvc.p;
import jvc.q;
import jvc.r;
import jvc.s;
import jvc.t;
import jvc.u;
import jvc.v;
import jvc.w;
import jvc.x;
import jvc.y;
import jvc.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import m1c.e0;
import mii.k;
import oki.h;
import org.jmrtd.lds.LDSFile;
import tof.q6;
import tof.u9;
import vkm.j2;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f151789b;

    public /* synthetic */ d(int i, cli.j jVar, n nVar) {
        this.f151788a = i;
        this.f151789b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x07e0  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r77, java.lang.Object r78) {
        /*
            Method dump skipped, instruction units count: 2565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hfb.d.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3) {
        final m mVar = (m) this.f151789b;
        wt2.c cVar = mVar.A;
        yki.l FlowCoordinator = (yki.l) obj2;
        final SecurityHubFlowContract$Step step = (SecurityHubFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SecurityHubFlowContract$Step.Initial) {
            return new LayoutViewerScreen(R$layout.screen_transparent);
        }
        boolean z = step instanceof SecurityHubFlowContract$Step.ProductArticle;
        SkipShownArticleBehaviour.AlwaysShow alwaysShow = SkipShownArticleBehaviour.AlwaysShow.f81285a;
        if (z) {
            ProductArticleParams productArticleParams = ((SecurityHubFlowContract$Step.ProductArticle) step).f85535a;
            k9 k9Var = k9.SecurityHub;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ViewController viewControllerE1 = mVar.e1(new ProductArticleDescriptor(productArticleParams, alwaysShow, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 48));
            huc.g block = new huc.g(step, mVar, FlowCoordinator);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        final int i = 0;
        if (step instanceof SecurityHubFlowContract$Step.SecurityHub) {
            SecurityHubScreen securityHubScreen = new SecurityHubScreen(new SecurityHubScreenContract$InputData(((SecurityHubFlowContract$Step.SecurityHub) step).f85540a));
            Function1 block2 = new Function1() { // from class: huc.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep productArticle;
                    k kVar;
                    int i2 = i;
                    TrustedEntitiesDestination trustedEntitiesDestination = TrustedEntitiesDestination.f85339a;
                    m mVar2 = mVar;
                    switch (i2) {
                        case 0:
                            z result = (z) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof y;
                            m mVar3 = mVar;
                            if (z3) {
                                if (((y) result).f178853a) {
                                    mVar3.l2(new com.revolut.feature.security_hub.impl.ui.flow.i(mVar3, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a, null), new yi5.b(26));
                                } else {
                                    oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(((jte.d) mVar3.F).c(SecurityHubApi$Toggles.CardPaymentsWealthProtection.f85366c) ? SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS : SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO), null, com.revolut.feature.security_hub.impl.ui.flow.a.OPEN_WEALTH_PROTECTION, false, 8), true, null, false, 12);
                                }
                            } else if (result instanceof u) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.SignInMethods.f85541a, true, null, false, 12);
                            } else if (result instanceof l) {
                                mVar3.C1(new DeviceManagementDestination(DeviceManagementDestination.Config.Home.f71934a));
                            } else if (result instanceof s) {
                                yki.a aVar = mVar3.N;
                                boolean z4 = ((s) result).f178846a;
                                SecurityHubFlowContract$Step.ManageMerchants manageMerchants = SecurityHubFlowContract$Step.ManageMerchants.f85533a;
                                if (z4) {
                                    oki.h.t2(mVar3, aVar, manageMerchants, true, null, false, 12);
                                } else {
                                    oki.h.t2(mVar3, aVar, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.MERCHANT_MANAGEMENT_INTRO), manageMerchants, null, false, 12), true, null, false, 12);
                                }
                            } else if (result instanceof jvc.m) {
                                boolean z6 = ((jvc.m) result).f178840a;
                                SecurityHubFlowContract$Step.GamblingBlock gamblingBlock = SecurityHubFlowContract$Step.GamblingBlock.f85512a;
                                oki.h.t2(mVar3, mVar3.N, z6 ? gamblingBlock : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.GAMBLING_BLOCK_INTRO), gamblingBlock, null, false, 12), true, null, false, 12);
                            } else if (result instanceof w) {
                                w wVar = (w) result;
                                boolean z11 = wVar.f178850a;
                                SecurityHubFlowContract$Step.TransactionsLimit transactionsLimit = SecurityHubFlowContract$Step.TransactionsLimit.f85545a;
                                if (z11) {
                                    productArticle = transactionsLimit;
                                } else {
                                    ProductArticleKey productArticleKey = wVar.f178851b;
                                    if (productArticleKey == null) {
                                        throw new IllegalArgumentException(("If article key " + productArticleKey + " is null, then onboardingSeen is always true").toString());
                                    }
                                    productArticle = new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(productArticleKey), transactionsLimit, null, false, 12);
                                }
                                oki.h.t2(mVar3, mVar3.N, productArticle, true, null, false, 12);
                            } else if (result instanceof v) {
                                boolean z12 = ((v) result).f178849a;
                                SecurityHubFlowContract$Step.TransactionsDayNightLimits transactionsDayNightLimits = SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a;
                                oki.h.t2(mVar3, mVar3.N, z12 ? transactionsDayNightLimits : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO), transactionsDayNightLimits, null, false, 12), true, null, false, 12);
                            } else if (result instanceof r) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.LostDevice.f85532a, true, null, false, 12);
                            } else if (result instanceof p) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.SECURITY_HUB, null), true, null, false, 12);
                            } else if (result instanceof jvc.k) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CardSecurity.f85511a, true, null, false, 12);
                            } else if (result instanceof q) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LostCard(((q) result).f178844a), true, null, false, 12);
                            } else if (result instanceof t) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.Payees(PayeesTargetUser.All.f78988a), true, null, false, 12);
                            } else if (result instanceof o) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.Learn.f85524a, true, null, false, 12);
                            } else if (result instanceof jvc.j) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CallSecurityInfoProductArticle.f85509a, true, null, false, 12);
                            } else if (result instanceof x) {
                                mVar3.C1(trustedEntitiesDestination);
                            } else {
                                if (!(result instanceof jvc.n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.HiddenAccountsAndTransactions.f85513a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            evc.h it8 = (evc.h) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (Intrinsics.f(it8, evc.e.f129768a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(new BlockedMerchantsListFeatureConfig(0))));
                            } else if (Intrinsics.f(it8, evc.g.f129770a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(TrustedMerchantsFeatureConfig.TrustedMerchantsListFeatureConfig.f94403a)));
                            } else {
                                if (!Intrinsics.f(it8, evc.f.f129769a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mVar2.C1(trustedEntitiesDestination);
                            }
                            return Unit.f186387a;
                        case 2:
                            a aVar2 = mVar2.f85572r;
                            avc.i result2 = (avc.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (Intrinsics.f(result2, avc.g.f9996a)) {
                                aVar2.getClass();
                                kVar = new k("LOST_CARD_FROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_lost_card_toast_card_frozen, null, null, 14), null, null, null, 28);
                            } else {
                                if (!Intrinsics.f(result2, avc.h.f9997a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.getClass();
                                kVar = new k("CARD_UNFROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_home_toast_card_unfrozen, null, null, 14), null, null, null, 28);
                            }
                            mVar2.X1(kVar);
                            return Unit.f186387a;
                        case 3:
                            gvc.i it9 = (gvc.i) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if (!Intrinsics.f(it9, gvc.i.f147130a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(mVar2.N);
                            mVar2.C1(new BridgeDestination(new CompositeCommand(zhm.v.k(gc0.c.f(cka.b.a(mVar2.f85574t, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("35b3ba9a-c6cd-4b6f-af33-ad19d0a22ebf")), SkipShownArticleBehaviour.AlwaysShow.f81285a, null, null, null, SyslogConstants.LOG_CLOCK)), u0.f(new RevolutSsoChangePasscodeFlowDestination(0))))));
                            return Unit.f186387a;
                        case 4:
                            st2.e eVar = mVar2.z;
                            r7a.i output = (r7a.i) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof r7a.h) {
                                ((zt2.e) eVar).f325057b.setValue(null);
                            } else if (output instanceof r7a.f) {
                                zt2.e eVar2 = (zt2.e) eVar;
                                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, eVar2.f325056a, "KEY_DISMISSED_CALL_SECURITY_INFO", Boolean.TRUE);
                                eVar2.f325057b.setValue(null);
                            }
                            mVar2.B2();
                            return Unit.f186387a;
                        case 5:
                            fuc.e result3 = (fuc.e) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 != null) {
                                mVar2.C1(new CardManagementKompotFeatureConfig.SettingsDestination(result3.f138173a, AccountId.Personal.f51414a, null, wy2.b.SECURITY_HUB, 4));
                            }
                            return Unit.f186387a;
                        default:
                            luc.g result4 = (luc.g) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z29 = result4 instanceof luc.d;
                            m mVar4 = mVar;
                            if (z29) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenAccountsList.f85514a, true, null, false, 12);
                            } else if (result4 instanceof luc.f) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.SecretAccounts.f85538a, true, null, false, 12);
                            } else {
                                if (!(result4 instanceof luc.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((jte.d) mVar4.F).c(SecurityHubApi$Toggles.HiddenTransactionsNewScreen.f85367c)) {
                                    oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenTransactions.f85515a, true, null, false, 12);
                                } else {
                                    mVar4.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new u9(true), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 49134)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            securityHubScreen.H = block2;
            return securityHubScreen;
        }
        if (step instanceof SecurityHubFlowContract$Step.WealthProtection) {
            WealthProtectionScreen wealthProtectionScreen = new WealthProtectionScreen(new WealthProtectionScreenContract$InputData(((SecurityHubFlowContract$Step.WealthProtection) step).f85548a));
            huc.f block3 = new huc.f(mVar, FlowCoordinator, i);
            Intrinsics.checkNotNullParameter(block3, "block");
            wealthProtectionScreen.H = block3;
            return wealthProtectionScreen;
        }
        if (step instanceof SecurityHubFlowContract$Step.SignInMethods) {
            return mVar.e1(rjd.a.f254655a);
        }
        final int i2 = 1;
        if (step instanceof SecurityHubFlowContract$Step.ManageMerchants) {
            ManageMerchantsScreen manageMerchantsScreen = new ManageMerchantsScreen();
            Function1 block4 = new Function1() { // from class: huc.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep productArticle;
                    k kVar;
                    int i22 = i2;
                    TrustedEntitiesDestination trustedEntitiesDestination = TrustedEntitiesDestination.f85339a;
                    m mVar2 = mVar;
                    switch (i22) {
                        case 0:
                            z result = (z) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof y;
                            m mVar3 = mVar;
                            if (z3) {
                                if (((y) result).f178853a) {
                                    mVar3.l2(new com.revolut.feature.security_hub.impl.ui.flow.i(mVar3, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a, null), new yi5.b(26));
                                } else {
                                    oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(((jte.d) mVar3.F).c(SecurityHubApi$Toggles.CardPaymentsWealthProtection.f85366c) ? SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS : SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO), null, com.revolut.feature.security_hub.impl.ui.flow.a.OPEN_WEALTH_PROTECTION, false, 8), true, null, false, 12);
                                }
                            } else if (result instanceof u) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.SignInMethods.f85541a, true, null, false, 12);
                            } else if (result instanceof l) {
                                mVar3.C1(new DeviceManagementDestination(DeviceManagementDestination.Config.Home.f71934a));
                            } else if (result instanceof s) {
                                yki.a aVar = mVar3.N;
                                boolean z4 = ((s) result).f178846a;
                                SecurityHubFlowContract$Step.ManageMerchants manageMerchants = SecurityHubFlowContract$Step.ManageMerchants.f85533a;
                                if (z4) {
                                    oki.h.t2(mVar3, aVar, manageMerchants, true, null, false, 12);
                                } else {
                                    oki.h.t2(mVar3, aVar, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.MERCHANT_MANAGEMENT_INTRO), manageMerchants, null, false, 12), true, null, false, 12);
                                }
                            } else if (result instanceof jvc.m) {
                                boolean z6 = ((jvc.m) result).f178840a;
                                SecurityHubFlowContract$Step.GamblingBlock gamblingBlock = SecurityHubFlowContract$Step.GamblingBlock.f85512a;
                                oki.h.t2(mVar3, mVar3.N, z6 ? gamblingBlock : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.GAMBLING_BLOCK_INTRO), gamblingBlock, null, false, 12), true, null, false, 12);
                            } else if (result instanceof w) {
                                w wVar = (w) result;
                                boolean z11 = wVar.f178850a;
                                SecurityHubFlowContract$Step.TransactionsLimit transactionsLimit = SecurityHubFlowContract$Step.TransactionsLimit.f85545a;
                                if (z11) {
                                    productArticle = transactionsLimit;
                                } else {
                                    ProductArticleKey productArticleKey = wVar.f178851b;
                                    if (productArticleKey == null) {
                                        throw new IllegalArgumentException(("If article key " + productArticleKey + " is null, then onboardingSeen is always true").toString());
                                    }
                                    productArticle = new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(productArticleKey), transactionsLimit, null, false, 12);
                                }
                                oki.h.t2(mVar3, mVar3.N, productArticle, true, null, false, 12);
                            } else if (result instanceof v) {
                                boolean z12 = ((v) result).f178849a;
                                SecurityHubFlowContract$Step.TransactionsDayNightLimits transactionsDayNightLimits = SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a;
                                oki.h.t2(mVar3, mVar3.N, z12 ? transactionsDayNightLimits : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO), transactionsDayNightLimits, null, false, 12), true, null, false, 12);
                            } else if (result instanceof r) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.LostDevice.f85532a, true, null, false, 12);
                            } else if (result instanceof p) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.SECURITY_HUB, null), true, null, false, 12);
                            } else if (result instanceof jvc.k) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CardSecurity.f85511a, true, null, false, 12);
                            } else if (result instanceof q) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LostCard(((q) result).f178844a), true, null, false, 12);
                            } else if (result instanceof t) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.Payees(PayeesTargetUser.All.f78988a), true, null, false, 12);
                            } else if (result instanceof o) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.Learn.f85524a, true, null, false, 12);
                            } else if (result instanceof jvc.j) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CallSecurityInfoProductArticle.f85509a, true, null, false, 12);
                            } else if (result instanceof x) {
                                mVar3.C1(trustedEntitiesDestination);
                            } else {
                                if (!(result instanceof jvc.n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.HiddenAccountsAndTransactions.f85513a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            evc.h it8 = (evc.h) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (Intrinsics.f(it8, evc.e.f129768a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(new BlockedMerchantsListFeatureConfig(0))));
                            } else if (Intrinsics.f(it8, evc.g.f129770a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(TrustedMerchantsFeatureConfig.TrustedMerchantsListFeatureConfig.f94403a)));
                            } else {
                                if (!Intrinsics.f(it8, evc.f.f129769a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mVar2.C1(trustedEntitiesDestination);
                            }
                            return Unit.f186387a;
                        case 2:
                            a aVar2 = mVar2.f85572r;
                            avc.i result2 = (avc.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (Intrinsics.f(result2, avc.g.f9996a)) {
                                aVar2.getClass();
                                kVar = new k("LOST_CARD_FROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_lost_card_toast_card_frozen, null, null, 14), null, null, null, 28);
                            } else {
                                if (!Intrinsics.f(result2, avc.h.f9997a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.getClass();
                                kVar = new k("CARD_UNFROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_home_toast_card_unfrozen, null, null, 14), null, null, null, 28);
                            }
                            mVar2.X1(kVar);
                            return Unit.f186387a;
                        case 3:
                            gvc.i it9 = (gvc.i) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if (!Intrinsics.f(it9, gvc.i.f147130a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(mVar2.N);
                            mVar2.C1(new BridgeDestination(new CompositeCommand(zhm.v.k(gc0.c.f(cka.b.a(mVar2.f85574t, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("35b3ba9a-c6cd-4b6f-af33-ad19d0a22ebf")), SkipShownArticleBehaviour.AlwaysShow.f81285a, null, null, null, SyslogConstants.LOG_CLOCK)), u0.f(new RevolutSsoChangePasscodeFlowDestination(0))))));
                            return Unit.f186387a;
                        case 4:
                            st2.e eVar = mVar2.z;
                            r7a.i output = (r7a.i) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof r7a.h) {
                                ((zt2.e) eVar).f325057b.setValue(null);
                            } else if (output instanceof r7a.f) {
                                zt2.e eVar2 = (zt2.e) eVar;
                                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, eVar2.f325056a, "KEY_DISMISSED_CALL_SECURITY_INFO", Boolean.TRUE);
                                eVar2.f325057b.setValue(null);
                            }
                            mVar2.B2();
                            return Unit.f186387a;
                        case 5:
                            fuc.e result3 = (fuc.e) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 != null) {
                                mVar2.C1(new CardManagementKompotFeatureConfig.SettingsDestination(result3.f138173a, AccountId.Personal.f51414a, null, wy2.b.SECURITY_HUB, 4));
                            }
                            return Unit.f186387a;
                        default:
                            luc.g result4 = (luc.g) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z29 = result4 instanceof luc.d;
                            m mVar4 = mVar;
                            if (z29) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenAccountsList.f85514a, true, null, false, 12);
                            } else if (result4 instanceof luc.f) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.SecretAccounts.f85538a, true, null, false, 12);
                            } else {
                                if (!(result4 instanceof luc.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((jte.d) mVar4.F).c(SecurityHubApi$Toggles.HiddenTransactionsNewScreen.f85367c)) {
                                    oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenTransactions.f85515a, true, null, false, 12);
                                } else {
                                    mVar4.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new u9(true), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 49134)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            manageMerchantsScreen.H = block4;
            return manageMerchantsScreen;
        }
        if (step instanceof SecurityHubFlowContract$Step.GamblingBlock) {
            return new GamblingBlockScreen();
        }
        if (Intrinsics.f(step, SecurityHubFlowContract$Step.TransactionsLimit.f85545a)) {
            TransactionsLimitsFlow transactionsLimitsFlow = new TransactionsLimitsFlow();
            hie.b block5 = new hie.b(1, mVar, m.class, "handleTransactionsLimitsOutput", "handleTransactionsLimitsOutput(Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/flow/TransactionsLimitsFlowContract$OutputData;)V", 0, 11);
            Intrinsics.checkNotNullParameter(block5, "block");
            transactionsLimitsFlow.H = block5;
            return transactionsLimitsFlow;
        }
        if (step instanceof SecurityHubFlowContract$Step.TransactionsDayNightLimits) {
            TransactionsDayNightLimitsFlow transactionsDayNightLimitsFlow = new TransactionsDayNightLimitsFlow();
            huc.f block6 = new huc.f(mVar, FlowCoordinator, i2);
            Intrinsics.checkNotNullParameter(block6, "block");
            transactionsDayNightLimitsFlow.H = block6;
            return transactionsDayNightLimitsFlow;
        }
        final int i3 = 2;
        if (step instanceof SecurityHubFlowContract$Step.TransactionsLimitChange) {
            SecurityHubFlowContract$Step.TransactionsLimitChange transactionsLimitChange = (SecurityHubFlowContract$Step.TransactionsLimitChange) step;
            TransactionsLimitsChangeScreen transactionsLimitsChangeScreen = new TransactionsLimitsChangeScreen(new TransactionsLimitsChangeScreenContract$InputData(transactionsLimitChange.f85546a, transactionsLimitChange.f85547b));
            huc.f block7 = new huc.f(mVar, FlowCoordinator, i3);
            Intrinsics.checkNotNullParameter(block7, "block");
            transactionsLimitsChangeScreen.H = block7;
            return transactionsLimitsChangeScreen;
        }
        if (step instanceof SecurityHubFlowContract$Step.WealthProtectionLimitChangeAmount) {
            SecurityHubFlowContract$Step.WealthProtectionLimitChangeAmount wealthProtectionLimitChangeAmount = (SecurityHubFlowContract$Step.WealthProtectionLimitChangeAmount) step;
            WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen = new WealthProtectionLimitChangeScreen(new WealthProtectionLimitChangeScreenContract$InputData(wealthProtectionLimitChangeAmount.f85549a, wealthProtectionLimitChangeAmount.f85550b));
            huc.f block8 = new huc.f(FlowCoordinator, mVar);
            Intrinsics.checkNotNullParameter(block8, "block");
            wealthProtectionLimitChangeScreen.H = block8;
            return wealthProtectionLimitChangeScreen;
        }
        final int i5 = 4;
        if (Intrinsics.f(step, SecurityHubFlowContract$Step.LostDevice.f85532a)) {
            LostDeviceController lostDeviceController = new LostDeviceController();
            huc.f block9 = new huc.f(mVar, FlowCoordinator, i5);
            Intrinsics.checkNotNullParameter(block9, "block");
            lostDeviceController.H = block9;
            return lostDeviceController;
        }
        if (step instanceof SecurityHubFlowContract$Step.LostCard) {
            LostCardController lostCardController = new LostCardController(new LostCardControllerContract$InputData(((SecurityHubFlowContract$Step.LostCard) step).f85531a));
            Function1 block10 = new Function1() { // from class: huc.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep productArticle;
                    k kVar;
                    int i22 = i3;
                    TrustedEntitiesDestination trustedEntitiesDestination = TrustedEntitiesDestination.f85339a;
                    m mVar2 = mVar;
                    switch (i22) {
                        case 0:
                            z result = (z) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof y;
                            m mVar3 = mVar;
                            if (z3) {
                                if (((y) result).f178853a) {
                                    mVar3.l2(new com.revolut.feature.security_hub.impl.ui.flow.i(mVar3, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a, null), new yi5.b(26));
                                } else {
                                    oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(((jte.d) mVar3.F).c(SecurityHubApi$Toggles.CardPaymentsWealthProtection.f85366c) ? SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS : SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO), null, com.revolut.feature.security_hub.impl.ui.flow.a.OPEN_WEALTH_PROTECTION, false, 8), true, null, false, 12);
                                }
                            } else if (result instanceof u) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.SignInMethods.f85541a, true, null, false, 12);
                            } else if (result instanceof l) {
                                mVar3.C1(new DeviceManagementDestination(DeviceManagementDestination.Config.Home.f71934a));
                            } else if (result instanceof s) {
                                yki.a aVar = mVar3.N;
                                boolean z4 = ((s) result).f178846a;
                                SecurityHubFlowContract$Step.ManageMerchants manageMerchants = SecurityHubFlowContract$Step.ManageMerchants.f85533a;
                                if (z4) {
                                    oki.h.t2(mVar3, aVar, manageMerchants, true, null, false, 12);
                                } else {
                                    oki.h.t2(mVar3, aVar, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.MERCHANT_MANAGEMENT_INTRO), manageMerchants, null, false, 12), true, null, false, 12);
                                }
                            } else if (result instanceof jvc.m) {
                                boolean z6 = ((jvc.m) result).f178840a;
                                SecurityHubFlowContract$Step.GamblingBlock gamblingBlock = SecurityHubFlowContract$Step.GamblingBlock.f85512a;
                                oki.h.t2(mVar3, mVar3.N, z6 ? gamblingBlock : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.GAMBLING_BLOCK_INTRO), gamblingBlock, null, false, 12), true, null, false, 12);
                            } else if (result instanceof w) {
                                w wVar = (w) result;
                                boolean z11 = wVar.f178850a;
                                SecurityHubFlowContract$Step.TransactionsLimit transactionsLimit = SecurityHubFlowContract$Step.TransactionsLimit.f85545a;
                                if (z11) {
                                    productArticle = transactionsLimit;
                                } else {
                                    ProductArticleKey productArticleKey = wVar.f178851b;
                                    if (productArticleKey == null) {
                                        throw new IllegalArgumentException(("If article key " + productArticleKey + " is null, then onboardingSeen is always true").toString());
                                    }
                                    productArticle = new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(productArticleKey), transactionsLimit, null, false, 12);
                                }
                                oki.h.t2(mVar3, mVar3.N, productArticle, true, null, false, 12);
                            } else if (result instanceof v) {
                                boolean z12 = ((v) result).f178849a;
                                SecurityHubFlowContract$Step.TransactionsDayNightLimits transactionsDayNightLimits = SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a;
                                oki.h.t2(mVar3, mVar3.N, z12 ? transactionsDayNightLimits : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO), transactionsDayNightLimits, null, false, 12), true, null, false, 12);
                            } else if (result instanceof r) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.LostDevice.f85532a, true, null, false, 12);
                            } else if (result instanceof p) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.SECURITY_HUB, null), true, null, false, 12);
                            } else if (result instanceof jvc.k) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CardSecurity.f85511a, true, null, false, 12);
                            } else if (result instanceof q) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LostCard(((q) result).f178844a), true, null, false, 12);
                            } else if (result instanceof t) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.Payees(PayeesTargetUser.All.f78988a), true, null, false, 12);
                            } else if (result instanceof o) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.Learn.f85524a, true, null, false, 12);
                            } else if (result instanceof jvc.j) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CallSecurityInfoProductArticle.f85509a, true, null, false, 12);
                            } else if (result instanceof x) {
                                mVar3.C1(trustedEntitiesDestination);
                            } else {
                                if (!(result instanceof jvc.n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.HiddenAccountsAndTransactions.f85513a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            evc.h it8 = (evc.h) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (Intrinsics.f(it8, evc.e.f129768a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(new BlockedMerchantsListFeatureConfig(0))));
                            } else if (Intrinsics.f(it8, evc.g.f129770a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(TrustedMerchantsFeatureConfig.TrustedMerchantsListFeatureConfig.f94403a)));
                            } else {
                                if (!Intrinsics.f(it8, evc.f.f129769a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mVar2.C1(trustedEntitiesDestination);
                            }
                            return Unit.f186387a;
                        case 2:
                            a aVar2 = mVar2.f85572r;
                            avc.i result2 = (avc.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (Intrinsics.f(result2, avc.g.f9996a)) {
                                aVar2.getClass();
                                kVar = new k("LOST_CARD_FROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_lost_card_toast_card_frozen, null, null, 14), null, null, null, 28);
                            } else {
                                if (!Intrinsics.f(result2, avc.h.f9997a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.getClass();
                                kVar = new k("CARD_UNFROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_home_toast_card_unfrozen, null, null, 14), null, null, null, 28);
                            }
                            mVar2.X1(kVar);
                            return Unit.f186387a;
                        case 3:
                            gvc.i it9 = (gvc.i) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if (!Intrinsics.f(it9, gvc.i.f147130a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(mVar2.N);
                            mVar2.C1(new BridgeDestination(new CompositeCommand(zhm.v.k(gc0.c.f(cka.b.a(mVar2.f85574t, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("35b3ba9a-c6cd-4b6f-af33-ad19d0a22ebf")), SkipShownArticleBehaviour.AlwaysShow.f81285a, null, null, null, SyslogConstants.LOG_CLOCK)), u0.f(new RevolutSsoChangePasscodeFlowDestination(0))))));
                            return Unit.f186387a;
                        case 4:
                            st2.e eVar = mVar2.z;
                            r7a.i output = (r7a.i) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof r7a.h) {
                                ((zt2.e) eVar).f325057b.setValue(null);
                            } else if (output instanceof r7a.f) {
                                zt2.e eVar2 = (zt2.e) eVar;
                                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, eVar2.f325056a, "KEY_DISMISSED_CALL_SECURITY_INFO", Boolean.TRUE);
                                eVar2.f325057b.setValue(null);
                            }
                            mVar2.B2();
                            return Unit.f186387a;
                        case 5:
                            fuc.e result3 = (fuc.e) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 != null) {
                                mVar2.C1(new CardManagementKompotFeatureConfig.SettingsDestination(result3.f138173a, AccountId.Personal.f51414a, null, wy2.b.SECURITY_HUB, 4));
                            }
                            return Unit.f186387a;
                        default:
                            luc.g result4 = (luc.g) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z29 = result4 instanceof luc.d;
                            m mVar4 = mVar;
                            if (z29) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenAccountsList.f85514a, true, null, false, 12);
                            } else if (result4 instanceof luc.f) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.SecretAccounts.f85538a, true, null, false, 12);
                            } else {
                                if (!(result4 instanceof luc.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((jte.d) mVar4.F).c(SecurityHubApi$Toggles.HiddenTransactionsNewScreen.f85367c)) {
                                    oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenTransactions.f85515a, true, null, false, 12);
                                } else {
                                    mVar4.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new u9(true), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 49134)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block10, "block");
            lostCardController.H = block10;
            return lostCardController;
        }
        if (Intrinsics.f(step, SecurityHubFlowContract$Step.SecureAccount.f85539a)) {
            SecureAccountController secureAccountController = new SecureAccountController();
            final int i6 = 3;
            Function1 block11 = new Function1() { // from class: huc.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep productArticle;
                    k kVar;
                    int i22 = i6;
                    TrustedEntitiesDestination trustedEntitiesDestination = TrustedEntitiesDestination.f85339a;
                    m mVar2 = mVar;
                    switch (i22) {
                        case 0:
                            z result = (z) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof y;
                            m mVar3 = mVar;
                            if (z3) {
                                if (((y) result).f178853a) {
                                    mVar3.l2(new com.revolut.feature.security_hub.impl.ui.flow.i(mVar3, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a, null), new yi5.b(26));
                                } else {
                                    oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(((jte.d) mVar3.F).c(SecurityHubApi$Toggles.CardPaymentsWealthProtection.f85366c) ? SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS : SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO), null, com.revolut.feature.security_hub.impl.ui.flow.a.OPEN_WEALTH_PROTECTION, false, 8), true, null, false, 12);
                                }
                            } else if (result instanceof u) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.SignInMethods.f85541a, true, null, false, 12);
                            } else if (result instanceof l) {
                                mVar3.C1(new DeviceManagementDestination(DeviceManagementDestination.Config.Home.f71934a));
                            } else if (result instanceof s) {
                                yki.a aVar = mVar3.N;
                                boolean z4 = ((s) result).f178846a;
                                SecurityHubFlowContract$Step.ManageMerchants manageMerchants = SecurityHubFlowContract$Step.ManageMerchants.f85533a;
                                if (z4) {
                                    oki.h.t2(mVar3, aVar, manageMerchants, true, null, false, 12);
                                } else {
                                    oki.h.t2(mVar3, aVar, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.MERCHANT_MANAGEMENT_INTRO), manageMerchants, null, false, 12), true, null, false, 12);
                                }
                            } else if (result instanceof jvc.m) {
                                boolean z6 = ((jvc.m) result).f178840a;
                                SecurityHubFlowContract$Step.GamblingBlock gamblingBlock = SecurityHubFlowContract$Step.GamblingBlock.f85512a;
                                oki.h.t2(mVar3, mVar3.N, z6 ? gamblingBlock : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.GAMBLING_BLOCK_INTRO), gamblingBlock, null, false, 12), true, null, false, 12);
                            } else if (result instanceof w) {
                                w wVar = (w) result;
                                boolean z11 = wVar.f178850a;
                                SecurityHubFlowContract$Step.TransactionsLimit transactionsLimit = SecurityHubFlowContract$Step.TransactionsLimit.f85545a;
                                if (z11) {
                                    productArticle = transactionsLimit;
                                } else {
                                    ProductArticleKey productArticleKey = wVar.f178851b;
                                    if (productArticleKey == null) {
                                        throw new IllegalArgumentException(("If article key " + productArticleKey + " is null, then onboardingSeen is always true").toString());
                                    }
                                    productArticle = new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(productArticleKey), transactionsLimit, null, false, 12);
                                }
                                oki.h.t2(mVar3, mVar3.N, productArticle, true, null, false, 12);
                            } else if (result instanceof v) {
                                boolean z12 = ((v) result).f178849a;
                                SecurityHubFlowContract$Step.TransactionsDayNightLimits transactionsDayNightLimits = SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a;
                                oki.h.t2(mVar3, mVar3.N, z12 ? transactionsDayNightLimits : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO), transactionsDayNightLimits, null, false, 12), true, null, false, 12);
                            } else if (result instanceof r) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.LostDevice.f85532a, true, null, false, 12);
                            } else if (result instanceof p) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.SECURITY_HUB, null), true, null, false, 12);
                            } else if (result instanceof jvc.k) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CardSecurity.f85511a, true, null, false, 12);
                            } else if (result instanceof q) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LostCard(((q) result).f178844a), true, null, false, 12);
                            } else if (result instanceof t) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.Payees(PayeesTargetUser.All.f78988a), true, null, false, 12);
                            } else if (result instanceof o) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.Learn.f85524a, true, null, false, 12);
                            } else if (result instanceof jvc.j) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CallSecurityInfoProductArticle.f85509a, true, null, false, 12);
                            } else if (result instanceof x) {
                                mVar3.C1(trustedEntitiesDestination);
                            } else {
                                if (!(result instanceof jvc.n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.HiddenAccountsAndTransactions.f85513a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            evc.h it8 = (evc.h) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (Intrinsics.f(it8, evc.e.f129768a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(new BlockedMerchantsListFeatureConfig(0))));
                            } else if (Intrinsics.f(it8, evc.g.f129770a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(TrustedMerchantsFeatureConfig.TrustedMerchantsListFeatureConfig.f94403a)));
                            } else {
                                if (!Intrinsics.f(it8, evc.f.f129769a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mVar2.C1(trustedEntitiesDestination);
                            }
                            return Unit.f186387a;
                        case 2:
                            a aVar2 = mVar2.f85572r;
                            avc.i result2 = (avc.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (Intrinsics.f(result2, avc.g.f9996a)) {
                                aVar2.getClass();
                                kVar = new k("LOST_CARD_FROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_lost_card_toast_card_frozen, null, null, 14), null, null, null, 28);
                            } else {
                                if (!Intrinsics.f(result2, avc.h.f9997a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.getClass();
                                kVar = new k("CARD_UNFROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_home_toast_card_unfrozen, null, null, 14), null, null, null, 28);
                            }
                            mVar2.X1(kVar);
                            return Unit.f186387a;
                        case 3:
                            gvc.i it9 = (gvc.i) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if (!Intrinsics.f(it9, gvc.i.f147130a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(mVar2.N);
                            mVar2.C1(new BridgeDestination(new CompositeCommand(zhm.v.k(gc0.c.f(cka.b.a(mVar2.f85574t, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("35b3ba9a-c6cd-4b6f-af33-ad19d0a22ebf")), SkipShownArticleBehaviour.AlwaysShow.f81285a, null, null, null, SyslogConstants.LOG_CLOCK)), u0.f(new RevolutSsoChangePasscodeFlowDestination(0))))));
                            return Unit.f186387a;
                        case 4:
                            st2.e eVar = mVar2.z;
                            r7a.i output = (r7a.i) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof r7a.h) {
                                ((zt2.e) eVar).f325057b.setValue(null);
                            } else if (output instanceof r7a.f) {
                                zt2.e eVar2 = (zt2.e) eVar;
                                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, eVar2.f325056a, "KEY_DISMISSED_CALL_SECURITY_INFO", Boolean.TRUE);
                                eVar2.f325057b.setValue(null);
                            }
                            mVar2.B2();
                            return Unit.f186387a;
                        case 5:
                            fuc.e result3 = (fuc.e) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 != null) {
                                mVar2.C1(new CardManagementKompotFeatureConfig.SettingsDestination(result3.f138173a, AccountId.Personal.f51414a, null, wy2.b.SECURITY_HUB, 4));
                            }
                            return Unit.f186387a;
                        default:
                            luc.g result4 = (luc.g) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z29 = result4 instanceof luc.d;
                            m mVar4 = mVar;
                            if (z29) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenAccountsList.f85514a, true, null, false, 12);
                            } else if (result4 instanceof luc.f) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.SecretAccounts.f85538a, true, null, false, 12);
                            } else {
                                if (!(result4 instanceof luc.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((jte.d) mVar4.F).c(SecurityHubApi$Toggles.HiddenTransactionsNewScreen.f85367c)) {
                                    oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenTransactions.f85515a, true, null, false, 12);
                                } else {
                                    mVar4.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new u9(true), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 49134)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block11, "block");
            secureAccountController.H = block11;
            return secureAccountController;
        }
        final int i21 = 5;
        if (step instanceof SecurityHubFlowContract$Step.LinkedWallets) {
            SecurityHubFlowContract$Step.LinkedWallets linkedWallets = (SecurityHubFlowContract$Step.LinkedWallets) step;
            LinkedWalletsScreen linkedWalletsScreen = new LinkedWalletsScreen(new LinkedWalletsScreenContract$InputData(linkedWallets.f85528a, linkedWallets.f85529b));
            huc.f block12 = new huc.f(mVar, FlowCoordinator, i21);
            Intrinsics.checkNotNullParameter(block12, "block");
            linkedWalletsScreen.H = block12;
            return linkedWalletsScreen;
        }
        final int i22 = 6;
        if (step instanceof SecurityHubFlowContract$Step.LinkedWalletDetails) {
            SecurityHubFlowContract$Step.LinkedWalletDetails linkedWalletDetails = (SecurityHubFlowContract$Step.LinkedWalletDetails) step;
            LinkedWalletDetailsScreen linkedWalletDetailsScreen = new LinkedWalletDetailsScreen(new LinkedWalletDetailsScreenContract$InputData(linkedWalletDetails.f85525a, linkedWalletDetails.f85526b, linkedWalletDetails.f85527c, linkedWalletDetails.d));
            huc.f block13 = new huc.f(mVar, FlowCoordinator, i22);
            Intrinsics.checkNotNullParameter(block13, "block");
            linkedWalletDetailsScreen.H = block13;
            return linkedWalletDetailsScreen;
        }
        Continuation continuation = null;
        if (Intrinsics.f(step, SecurityHubFlowContract$Step.LinkedWalletsAcknowledgeNew.f85530a)) {
            LayoutViewerScreen layoutViewerScreen = new LayoutViewerScreen(R$layout.screen_transparent);
            mVar.l2(new gvc.m(mVar, continuation, 27), new yi5.b(26));
            return layoutViewerScreen;
        }
        if (Intrinsics.f(step, SecurityHubFlowContract$Step.CardSecurity.f85511a)) {
            CardSecurityController cardSecurityController = new CardSecurityController();
            Function1 block14 = new Function1() { // from class: huc.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep productArticle;
                    k kVar;
                    int i222 = i21;
                    TrustedEntitiesDestination trustedEntitiesDestination = TrustedEntitiesDestination.f85339a;
                    m mVar2 = mVar;
                    switch (i222) {
                        case 0:
                            z result = (z) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof y;
                            m mVar3 = mVar;
                            if (z3) {
                                if (((y) result).f178853a) {
                                    mVar3.l2(new com.revolut.feature.security_hub.impl.ui.flow.i(mVar3, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a, null), new yi5.b(26));
                                } else {
                                    oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(((jte.d) mVar3.F).c(SecurityHubApi$Toggles.CardPaymentsWealthProtection.f85366c) ? SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS : SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO), null, com.revolut.feature.security_hub.impl.ui.flow.a.OPEN_WEALTH_PROTECTION, false, 8), true, null, false, 12);
                                }
                            } else if (result instanceof u) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.SignInMethods.f85541a, true, null, false, 12);
                            } else if (result instanceof l) {
                                mVar3.C1(new DeviceManagementDestination(DeviceManagementDestination.Config.Home.f71934a));
                            } else if (result instanceof s) {
                                yki.a aVar = mVar3.N;
                                boolean z4 = ((s) result).f178846a;
                                SecurityHubFlowContract$Step.ManageMerchants manageMerchants = SecurityHubFlowContract$Step.ManageMerchants.f85533a;
                                if (z4) {
                                    oki.h.t2(mVar3, aVar, manageMerchants, true, null, false, 12);
                                } else {
                                    oki.h.t2(mVar3, aVar, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.MERCHANT_MANAGEMENT_INTRO), manageMerchants, null, false, 12), true, null, false, 12);
                                }
                            } else if (result instanceof jvc.m) {
                                boolean z6 = ((jvc.m) result).f178840a;
                                SecurityHubFlowContract$Step.GamblingBlock gamblingBlock = SecurityHubFlowContract$Step.GamblingBlock.f85512a;
                                oki.h.t2(mVar3, mVar3.N, z6 ? gamblingBlock : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.GAMBLING_BLOCK_INTRO), gamblingBlock, null, false, 12), true, null, false, 12);
                            } else if (result instanceof w) {
                                w wVar = (w) result;
                                boolean z11 = wVar.f178850a;
                                SecurityHubFlowContract$Step.TransactionsLimit transactionsLimit = SecurityHubFlowContract$Step.TransactionsLimit.f85545a;
                                if (z11) {
                                    productArticle = transactionsLimit;
                                } else {
                                    ProductArticleKey productArticleKey = wVar.f178851b;
                                    if (productArticleKey == null) {
                                        throw new IllegalArgumentException(("If article key " + productArticleKey + " is null, then onboardingSeen is always true").toString());
                                    }
                                    productArticle = new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(productArticleKey), transactionsLimit, null, false, 12);
                                }
                                oki.h.t2(mVar3, mVar3.N, productArticle, true, null, false, 12);
                            } else if (result instanceof v) {
                                boolean z12 = ((v) result).f178849a;
                                SecurityHubFlowContract$Step.TransactionsDayNightLimits transactionsDayNightLimits = SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a;
                                oki.h.t2(mVar3, mVar3.N, z12 ? transactionsDayNightLimits : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO), transactionsDayNightLimits, null, false, 12), true, null, false, 12);
                            } else if (result instanceof r) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.LostDevice.f85532a, true, null, false, 12);
                            } else if (result instanceof p) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.SECURITY_HUB, null), true, null, false, 12);
                            } else if (result instanceof jvc.k) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CardSecurity.f85511a, true, null, false, 12);
                            } else if (result instanceof q) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LostCard(((q) result).f178844a), true, null, false, 12);
                            } else if (result instanceof t) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.Payees(PayeesTargetUser.All.f78988a), true, null, false, 12);
                            } else if (result instanceof o) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.Learn.f85524a, true, null, false, 12);
                            } else if (result instanceof jvc.j) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CallSecurityInfoProductArticle.f85509a, true, null, false, 12);
                            } else if (result instanceof x) {
                                mVar3.C1(trustedEntitiesDestination);
                            } else {
                                if (!(result instanceof jvc.n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.HiddenAccountsAndTransactions.f85513a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            evc.h it8 = (evc.h) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (Intrinsics.f(it8, evc.e.f129768a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(new BlockedMerchantsListFeatureConfig(0))));
                            } else if (Intrinsics.f(it8, evc.g.f129770a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(TrustedMerchantsFeatureConfig.TrustedMerchantsListFeatureConfig.f94403a)));
                            } else {
                                if (!Intrinsics.f(it8, evc.f.f129769a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mVar2.C1(trustedEntitiesDestination);
                            }
                            return Unit.f186387a;
                        case 2:
                            a aVar2 = mVar2.f85572r;
                            avc.i result2 = (avc.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (Intrinsics.f(result2, avc.g.f9996a)) {
                                aVar2.getClass();
                                kVar = new k("LOST_CARD_FROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_lost_card_toast_card_frozen, null, null, 14), null, null, null, 28);
                            } else {
                                if (!Intrinsics.f(result2, avc.h.f9997a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.getClass();
                                kVar = new k("CARD_UNFROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_home_toast_card_unfrozen, null, null, 14), null, null, null, 28);
                            }
                            mVar2.X1(kVar);
                            return Unit.f186387a;
                        case 3:
                            gvc.i it9 = (gvc.i) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if (!Intrinsics.f(it9, gvc.i.f147130a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(mVar2.N);
                            mVar2.C1(new BridgeDestination(new CompositeCommand(zhm.v.k(gc0.c.f(cka.b.a(mVar2.f85574t, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("35b3ba9a-c6cd-4b6f-af33-ad19d0a22ebf")), SkipShownArticleBehaviour.AlwaysShow.f81285a, null, null, null, SyslogConstants.LOG_CLOCK)), u0.f(new RevolutSsoChangePasscodeFlowDestination(0))))));
                            return Unit.f186387a;
                        case 4:
                            st2.e eVar = mVar2.z;
                            r7a.i output = (r7a.i) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof r7a.h) {
                                ((zt2.e) eVar).f325057b.setValue(null);
                            } else if (output instanceof r7a.f) {
                                zt2.e eVar2 = (zt2.e) eVar;
                                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, eVar2.f325056a, "KEY_DISMISSED_CALL_SECURITY_INFO", Boolean.TRUE);
                                eVar2.f325057b.setValue(null);
                            }
                            mVar2.B2();
                            return Unit.f186387a;
                        case 5:
                            fuc.e result3 = (fuc.e) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 != null) {
                                mVar2.C1(new CardManagementKompotFeatureConfig.SettingsDestination(result3.f138173a, AccountId.Personal.f51414a, null, wy2.b.SECURITY_HUB, 4));
                            }
                            return Unit.f186387a;
                        default:
                            luc.g result4 = (luc.g) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z29 = result4 instanceof luc.d;
                            m mVar4 = mVar;
                            if (z29) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenAccountsList.f85514a, true, null, false, 12);
                            } else if (result4 instanceof luc.f) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.SecretAccounts.f85538a, true, null, false, 12);
                            } else {
                                if (!(result4 instanceof luc.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((jte.d) mVar4.F).c(SecurityHubApi$Toggles.HiddenTransactionsNewScreen.f85367c)) {
                                    oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenTransactions.f85515a, true, null, false, 12);
                                } else {
                                    mVar4.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new u9(true), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 49134)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block14, "block");
            cardSecurityController.H = block14;
            return cardSecurityController;
        }
        if (step instanceof SecurityHubFlowContract$Step.Payees) {
            return mVar.e1(new fm9.a(new PayeesInputData(((SecurityHubFlowContract$Step.Payees) step).f85534a)));
        }
        if (step instanceof SecurityHubFlowContract$Step.Learn) {
            return new LearnAboutSecurityScreen();
        }
        if (step instanceof SecurityHubFlowContract$Step.StreetMode) {
            return new StreetModeFlow(new StreetModeFlowContract$InputData(((SecurityHubFlowContract$Step.StreetMode) step).f85542a));
        }
        if (step instanceof SecurityHubFlowContract$Step.StreetModeSetupWithWifi) {
            buc.d dVar = mVar.I;
            String ssid = ((SecurityHubFlowContract$Step.StreetModeSetupWithWifi) step).f85543a.f85467a;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(ssid, "ssid");
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_suggestion_title, null, null, 14), new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_suggestion_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6)), null, false, 24);
            m6 m6Var = n6.Companion;
            aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_suggestion_action_agree, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.security_hub_wealth_protection_street_mode_trusted_wifi_suggestion_action_disagree, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
            boolean z3 = false;
            Clause clause = null;
            List listC = zhm.u.c(new eii.l((Clause) new TextClause(ssid, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_communication, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i22), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
            k9 k9Var2 = k9.SecurityHub;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar, hVar, listC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
            huc.g block15 = new huc.g(mVar, FlowCoordinator, step);
            Intrinsics.checkNotNullParameter(block15, "block");
            rowActionsBottomSheetController.H = block15;
            return rowActionsBottomSheetController;
        }
        if (step instanceof SecurityHubFlowContract$Step.WealthProtectionSecurityDelay) {
            ViewController viewControllerE12 = mVar.e1(new rtc.a(SecurityDelayType.WealthProtection.f85459a));
            Function1 block16 = new Function1() { // from class: huc.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            yja.b output = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            int i32 = com.revolut.feature.security_hub.impl.ui.flow.b.f85555c[output.ordinal()];
                            m mVar2 = mVar;
                            if (i32 == 2) {
                                mVar2.l2(new ald.m((Object) mVar2, true, (Object) ((SecurityHubFlowContract$Step.AddToClickToPayProductArticle) step).f85507a, (Continuation) null, 23), new yi5.b(26));
                            } else {
                                mVar2.B2();
                            }
                            return Unit.f186387a;
                        case 1:
                            rtc.d result = (rtc.d) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, rtc.c.f257222a);
                            m mVar3 = mVar;
                            SecurityHubFlowContract$Step securityHubFlowContract$Step = step;
                            if (zF) {
                                mVar3.K2(((SecurityHubFlowContract$Step.WealthProtectionSecurityDelay) securityHubFlowContract$Step).f85551a);
                            } else {
                                if (!Intrinsics.f(result, rtc.b.f257221a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((SecurityHubFlowContract$Step.WealthProtectionSecurityDelay) securityHubFlowContract$Step).f85552b) {
                                    mVar3.B2();
                                }
                            }
                            return Unit.f186387a;
                        default:
                            duc.f output2 = (duc.f) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (output2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f0 f0Var = ((SecurityHubFlowContract$Step.AddToClickToPay) step).f85506a;
                            m mVar4 = mVar;
                            mVar4.l2(new ald.m((Object) mVar4, false, (Object) f0Var, (Continuation) null, 23), new yi5.b(26));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block16, "block");
            viewControllerE12.H = block16;
            return viewControllerE12;
        }
        if (step instanceof SecurityHubFlowContract$Step.CallSecurityInfoProductArticle) {
            cVar.getClass();
            ProductArticleParams productArticleParamsA = rwc.d.a(RetailCallSecurityProductArticleKey.PERMISSIONS);
            cVar.getClass();
            k9 k9Var3 = k9.SecurityHub;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            ViewController viewControllerE13 = mVar.e1(new ProductArticleDescriptor(productArticleParamsA, alwaysShow, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, false, 48));
            huc.f block17 = new huc.f(mVar, FlowCoordinator, 7);
            Intrinsics.checkNotNullParameter(block17, "block");
            viewControllerE13.H = block17;
            return viewControllerE13;
        }
        if (step instanceof SecurityHubFlowContract$Step.CallSecurityPermissionRequest) {
            PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(zhm.u.c(new PermissionsControllerContract$Permission("android.permission.READ_PHONE_STATE", null, null, false, 6))));
            Function1 block18 = new Function1() { // from class: huc.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep productArticle;
                    k kVar;
                    int i222 = i5;
                    TrustedEntitiesDestination trustedEntitiesDestination = TrustedEntitiesDestination.f85339a;
                    m mVar2 = mVar;
                    switch (i222) {
                        case 0:
                            z result = (z) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z310 = result instanceof y;
                            m mVar3 = mVar;
                            if (z310) {
                                if (((y) result).f178853a) {
                                    mVar3.l2(new com.revolut.feature.security_hub.impl.ui.flow.i(mVar3, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a, null), new yi5.b(26));
                                } else {
                                    oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(((jte.d) mVar3.F).c(SecurityHubApi$Toggles.CardPaymentsWealthProtection.f85366c) ? SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS : SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO), null, com.revolut.feature.security_hub.impl.ui.flow.a.OPEN_WEALTH_PROTECTION, false, 8), true, null, false, 12);
                                }
                            } else if (result instanceof u) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.SignInMethods.f85541a, true, null, false, 12);
                            } else if (result instanceof l) {
                                mVar3.C1(new DeviceManagementDestination(DeviceManagementDestination.Config.Home.f71934a));
                            } else if (result instanceof s) {
                                yki.a aVar2 = mVar3.N;
                                boolean z4 = ((s) result).f178846a;
                                SecurityHubFlowContract$Step.ManageMerchants manageMerchants = SecurityHubFlowContract$Step.ManageMerchants.f85533a;
                                if (z4) {
                                    oki.h.t2(mVar3, aVar2, manageMerchants, true, null, false, 12);
                                } else {
                                    oki.h.t2(mVar3, aVar2, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.MERCHANT_MANAGEMENT_INTRO), manageMerchants, null, false, 12), true, null, false, 12);
                                }
                            } else if (result instanceof jvc.m) {
                                boolean z6 = ((jvc.m) result).f178840a;
                                SecurityHubFlowContract$Step.GamblingBlock gamblingBlock = SecurityHubFlowContract$Step.GamblingBlock.f85512a;
                                oki.h.t2(mVar3, mVar3.N, z6 ? gamblingBlock : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.GAMBLING_BLOCK_INTRO), gamblingBlock, null, false, 12), true, null, false, 12);
                            } else if (result instanceof w) {
                                w wVar = (w) result;
                                boolean z11 = wVar.f178850a;
                                SecurityHubFlowContract$Step.TransactionsLimit transactionsLimit = SecurityHubFlowContract$Step.TransactionsLimit.f85545a;
                                if (z11) {
                                    productArticle = transactionsLimit;
                                } else {
                                    ProductArticleKey productArticleKey = wVar.f178851b;
                                    if (productArticleKey == null) {
                                        throw new IllegalArgumentException(("If article key " + productArticleKey + " is null, then onboardingSeen is always true").toString());
                                    }
                                    productArticle = new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(productArticleKey), transactionsLimit, null, false, 12);
                                }
                                oki.h.t2(mVar3, mVar3.N, productArticle, true, null, false, 12);
                            } else if (result instanceof v) {
                                boolean z12 = ((v) result).f178849a;
                                SecurityHubFlowContract$Step.TransactionsDayNightLimits transactionsDayNightLimits = SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a;
                                oki.h.t2(mVar3, mVar3.N, z12 ? transactionsDayNightLimits : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO), transactionsDayNightLimits, null, false, 12), true, null, false, 12);
                            } else if (result instanceof r) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.LostDevice.f85532a, true, null, false, 12);
                            } else if (result instanceof p) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.SECURITY_HUB, null), true, null, false, 12);
                            } else if (result instanceof jvc.k) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CardSecurity.f85511a, true, null, false, 12);
                            } else if (result instanceof q) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LostCard(((q) result).f178844a), true, null, false, 12);
                            } else if (result instanceof t) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.Payees(PayeesTargetUser.All.f78988a), true, null, false, 12);
                            } else if (result instanceof o) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.Learn.f85524a, true, null, false, 12);
                            } else if (result instanceof jvc.j) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CallSecurityInfoProductArticle.f85509a, true, null, false, 12);
                            } else if (result instanceof x) {
                                mVar3.C1(trustedEntitiesDestination);
                            } else {
                                if (!(result instanceof jvc.n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.HiddenAccountsAndTransactions.f85513a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            evc.h it8 = (evc.h) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (Intrinsics.f(it8, evc.e.f129768a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(new BlockedMerchantsListFeatureConfig(0))));
                            } else if (Intrinsics.f(it8, evc.g.f129770a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(TrustedMerchantsFeatureConfig.TrustedMerchantsListFeatureConfig.f94403a)));
                            } else {
                                if (!Intrinsics.f(it8, evc.f.f129769a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mVar2.C1(trustedEntitiesDestination);
                            }
                            return Unit.f186387a;
                        case 2:
                            a aVar22 = mVar2.f85572r;
                            avc.i result2 = (avc.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (Intrinsics.f(result2, avc.g.f9996a)) {
                                aVar22.getClass();
                                kVar = new k("LOST_CARD_FROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_lost_card_toast_card_frozen, null, null, 14), null, null, null, 28);
                            } else {
                                if (!Intrinsics.f(result2, avc.h.f9997a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar22.getClass();
                                kVar = new k("CARD_UNFROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_home_toast_card_unfrozen, null, null, 14), null, null, null, 28);
                            }
                            mVar2.X1(kVar);
                            return Unit.f186387a;
                        case 3:
                            gvc.i it9 = (gvc.i) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if (!Intrinsics.f(it9, gvc.i.f147130a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(mVar2.N);
                            mVar2.C1(new BridgeDestination(new CompositeCommand(zhm.v.k(gc0.c.f(cka.b.a(mVar2.f85574t, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("35b3ba9a-c6cd-4b6f-af33-ad19d0a22ebf")), SkipShownArticleBehaviour.AlwaysShow.f81285a, null, null, null, SyslogConstants.LOG_CLOCK)), u0.f(new RevolutSsoChangePasscodeFlowDestination(0))))));
                            return Unit.f186387a;
                        case 4:
                            st2.e eVar = mVar2.z;
                            r7a.i output = (r7a.i) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof r7a.h) {
                                ((zt2.e) eVar).f325057b.setValue(null);
                            } else if (output instanceof r7a.f) {
                                zt2.e eVar2 = (zt2.e) eVar;
                                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, eVar2.f325056a, "KEY_DISMISSED_CALL_SECURITY_INFO", Boolean.TRUE);
                                eVar2.f325057b.setValue(null);
                            }
                            mVar2.B2();
                            return Unit.f186387a;
                        case 5:
                            fuc.e result3 = (fuc.e) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 != null) {
                                mVar2.C1(new CardManagementKompotFeatureConfig.SettingsDestination(result3.f138173a, AccountId.Personal.f51414a, null, wy2.b.SECURITY_HUB, 4));
                            }
                            return Unit.f186387a;
                        default:
                            luc.g result4 = (luc.g) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z29 = result4 instanceof luc.d;
                            m mVar4 = mVar;
                            if (z29) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenAccountsList.f85514a, true, null, false, 12);
                            } else if (result4 instanceof luc.f) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.SecretAccounts.f85538a, true, null, false, 12);
                            } else {
                                if (!(result4 instanceof luc.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((jte.d) mVar4.F).c(SecurityHubApi$Toggles.HiddenTransactionsNewScreen.f85367c)) {
                                    oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenTransactions.f85515a, true, null, false, 12);
                                } else {
                                    mVar4.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new u9(true), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 49134)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block18, "block");
            permissionsController.H = block18;
            return permissionsController;
        }
        if (step instanceof SecurityHubFlowContract$Step.HiddenAccountsAndTransactions) {
            HiddenAccountsAndTransactionsController hiddenAccountsAndTransactionsController = new HiddenAccountsAndTransactionsController();
            Function1 block19 = new Function1() { // from class: huc.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep productArticle;
                    k kVar;
                    int i222 = i22;
                    TrustedEntitiesDestination trustedEntitiesDestination = TrustedEntitiesDestination.f85339a;
                    m mVar2 = mVar;
                    switch (i222) {
                        case 0:
                            z result = (z) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z310 = result instanceof y;
                            m mVar3 = mVar;
                            if (z310) {
                                if (((y) result).f178853a) {
                                    mVar3.l2(new com.revolut.feature.security_hub.impl.ui.flow.i(mVar3, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a, null), new yi5.b(26));
                                } else {
                                    oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(((jte.d) mVar3.F).c(SecurityHubApi$Toggles.CardPaymentsWealthProtection.f85366c) ? SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS : SecurityHubProductArticleKey.WEALTH_PROTECTION_INTRO), null, com.revolut.feature.security_hub.impl.ui.flow.a.OPEN_WEALTH_PROTECTION, false, 8), true, null, false, 12);
                                }
                            } else if (result instanceof u) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.SignInMethods.f85541a, true, null, false, 12);
                            } else if (result instanceof l) {
                                mVar3.C1(new DeviceManagementDestination(DeviceManagementDestination.Config.Home.f71934a));
                            } else if (result instanceof s) {
                                yki.a aVar2 = mVar3.N;
                                boolean z4 = ((s) result).f178846a;
                                SecurityHubFlowContract$Step.ManageMerchants manageMerchants = SecurityHubFlowContract$Step.ManageMerchants.f85533a;
                                if (z4) {
                                    oki.h.t2(mVar3, aVar2, manageMerchants, true, null, false, 12);
                                } else {
                                    oki.h.t2(mVar3, aVar2, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.MERCHANT_MANAGEMENT_INTRO), manageMerchants, null, false, 12), true, null, false, 12);
                                }
                            } else if (result instanceof jvc.m) {
                                boolean z6 = ((jvc.m) result).f178840a;
                                SecurityHubFlowContract$Step.GamblingBlock gamblingBlock = SecurityHubFlowContract$Step.GamblingBlock.f85512a;
                                oki.h.t2(mVar3, mVar3.N, z6 ? gamblingBlock : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.GAMBLING_BLOCK_INTRO), gamblingBlock, null, false, 12), true, null, false, 12);
                            } else if (result instanceof w) {
                                w wVar = (w) result;
                                boolean z11 = wVar.f178850a;
                                SecurityHubFlowContract$Step.TransactionsLimit transactionsLimit = SecurityHubFlowContract$Step.TransactionsLimit.f85545a;
                                if (z11) {
                                    productArticle = transactionsLimit;
                                } else {
                                    ProductArticleKey productArticleKey = wVar.f178851b;
                                    if (productArticleKey == null) {
                                        throw new IllegalArgumentException(("If article key " + productArticleKey + " is null, then onboardingSeen is always true").toString());
                                    }
                                    productArticle = new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(productArticleKey), transactionsLimit, null, false, 12);
                                }
                                oki.h.t2(mVar3, mVar3.N, productArticle, true, null, false, 12);
                            } else if (result instanceof v) {
                                boolean z12 = ((v) result).f178849a;
                                SecurityHubFlowContract$Step.TransactionsDayNightLimits transactionsDayNightLimits = SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a;
                                oki.h.t2(mVar3, mVar3.N, z12 ? transactionsDayNightLimits : new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(SecurityHubProductArticleKey.TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO), transactionsDayNightLimits, null, false, 12), true, null, false, 12);
                            } else if (result instanceof r) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.LostDevice.f85532a, true, null, false, 12);
                            } else if (result instanceof p) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.SECURITY_HUB, null), true, null, false, 12);
                            } else if (result instanceof jvc.k) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CardSecurity.f85511a, true, null, false, 12);
                            } else if (result instanceof q) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.LostCard(((q) result).f178844a), true, null, false, 12);
                            } else if (result instanceof t) {
                                oki.h.t2(mVar3, mVar3.N, new SecurityHubFlowContract$Step.Payees(PayeesTargetUser.All.f78988a), true, null, false, 12);
                            } else if (result instanceof o) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.Learn.f85524a, true, null, false, 12);
                            } else if (result instanceof jvc.j) {
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.CallSecurityInfoProductArticle.f85509a, true, null, false, 12);
                            } else if (result instanceof x) {
                                mVar3.C1(trustedEntitiesDestination);
                            } else {
                                if (!(result instanceof jvc.n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(mVar3, mVar3.N, SecurityHubFlowContract$Step.HiddenAccountsAndTransactions.f85513a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            evc.h it8 = (evc.h) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (Intrinsics.f(it8, evc.e.f129768a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(new BlockedMerchantsListFeatureConfig(0))));
                            } else if (Intrinsics.f(it8, evc.g.f129770a)) {
                                mVar2.C1(new BridgeDestination(new FeatureCommand(TrustedMerchantsFeatureConfig.TrustedMerchantsListFeatureConfig.f94403a)));
                            } else {
                                if (!Intrinsics.f(it8, evc.f.f129769a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mVar2.C1(trustedEntitiesDestination);
                            }
                            return Unit.f186387a;
                        case 2:
                            a aVar22 = mVar2.f85572r;
                            avc.i result2 = (avc.i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (Intrinsics.f(result2, avc.g.f9996a)) {
                                aVar22.getClass();
                                kVar = new k("LOST_CARD_FROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_lost_card_toast_card_frozen, null, null, 14), null, null, null, 28);
                            } else {
                                if (!Intrinsics.f(result2, avc.h.f9997a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar22.getClass();
                                kVar = new k("CARD_UNFROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_home_toast_card_unfrozen, null, null, 14), null, null, null, 28);
                            }
                            mVar2.X1(kVar);
                            return Unit.f186387a;
                        case 3:
                            gvc.i it9 = (gvc.i) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if (!Intrinsics.f(it9, gvc.i.f147130a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(mVar2.N);
                            mVar2.C1(new BridgeDestination(new CompositeCommand(zhm.v.k(gc0.c.f(cka.b.a(mVar2.f85574t, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("35b3ba9a-c6cd-4b6f-af33-ad19d0a22ebf")), SkipShownArticleBehaviour.AlwaysShow.f81285a, null, null, null, SyslogConstants.LOG_CLOCK)), u0.f(new RevolutSsoChangePasscodeFlowDestination(0))))));
                            return Unit.f186387a;
                        case 4:
                            st2.e eVar = mVar2.z;
                            r7a.i output = (r7a.i) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof r7a.h) {
                                ((zt2.e) eVar).f325057b.setValue(null);
                            } else if (output instanceof r7a.f) {
                                zt2.e eVar2 = (zt2.e) eVar;
                                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, eVar2.f325056a, "KEY_DISMISSED_CALL_SECURITY_INFO", Boolean.TRUE);
                                eVar2.f325057b.setValue(null);
                            }
                            mVar2.B2();
                            return Unit.f186387a;
                        case 5:
                            fuc.e result3 = (fuc.e) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 != null) {
                                mVar2.C1(new CardManagementKompotFeatureConfig.SettingsDestination(result3.f138173a, AccountId.Personal.f51414a, null, wy2.b.SECURITY_HUB, 4));
                            }
                            return Unit.f186387a;
                        default:
                            luc.g result4 = (luc.g) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z29 = result4 instanceof luc.d;
                            m mVar4 = mVar;
                            if (z29) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenAccountsList.f85514a, true, null, false, 12);
                            } else if (result4 instanceof luc.f) {
                                oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.SecretAccounts.f85538a, true, null, false, 12);
                            } else {
                                if (!(result4 instanceof luc.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((jte.d) mVar4.F).c(SecurityHubApi$Toggles.HiddenTransactionsNewScreen.f85367c)) {
                                    oki.h.t2(mVar4, mVar4.N, SecurityHubFlowContract$Step.HiddenTransactions.f85515a, true, null, false, 12);
                                } else {
                                    mVar4.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new u9(true), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 49134)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block19, "block");
            hiddenAccountsAndTransactionsController.H = block19;
            return hiddenAccountsAndTransactionsController;
        }
        if (step instanceof SecurityHubFlowContract$Step.HiddenAccountsList) {
            return mVar.e1(new qa7.d(HiddenAccountsConfig.Accounts.f74647b));
        }
        if (step instanceof SecurityHubFlowContract$Step.SecretAccounts) {
            return mVar.e1(qa7.f.f243976a);
        }
        if (step instanceof SecurityHubFlowContract$Step.HiddenTransactions) {
            return new HiddenTransactionsScreen();
        }
        if (step instanceof SecurityHubFlowContract$Step.AddToClickToPay) {
            AddToClickToPayScreen addToClickToPayScreen = new AddToClickToPayScreen(new AddToClickToPayScreenContract$InputData(((SecurityHubFlowContract$Step.AddToClickToPay) step).f85506a));
            Function1 block20 = new Function1() { // from class: huc.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            yja.b output = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            int i32 = com.revolut.feature.security_hub.impl.ui.flow.b.f85555c[output.ordinal()];
                            m mVar2 = mVar;
                            if (i32 == 2) {
                                mVar2.l2(new ald.m((Object) mVar2, true, (Object) ((SecurityHubFlowContract$Step.AddToClickToPayProductArticle) step).f85507a, (Continuation) null, 23), new yi5.b(26));
                            } else {
                                mVar2.B2();
                            }
                            return Unit.f186387a;
                        case 1:
                            rtc.d result = (rtc.d) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, rtc.c.f257222a);
                            m mVar3 = mVar;
                            SecurityHubFlowContract$Step securityHubFlowContract$Step = step;
                            if (zF) {
                                mVar3.K2(((SecurityHubFlowContract$Step.WealthProtectionSecurityDelay) securityHubFlowContract$Step).f85551a);
                            } else {
                                if (!Intrinsics.f(result, rtc.b.f257221a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((SecurityHubFlowContract$Step.WealthProtectionSecurityDelay) securityHubFlowContract$Step).f85552b) {
                                    mVar3.B2();
                                }
                            }
                            return Unit.f186387a;
                        default:
                            duc.f output2 = (duc.f) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (output2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f0 f0Var = ((SecurityHubFlowContract$Step.AddToClickToPay) step).f85506a;
                            m mVar4 = mVar;
                            mVar4.l2(new ald.m((Object) mVar4, false, (Object) f0Var, (Continuation) null, 23), new yi5.b(26));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block20, "block");
            addToClickToPayScreen.H = block20;
            return addToClickToPayScreen;
        }
        if (!(step instanceof SecurityHubFlowContract$Step.AddToClickToPayProductArticle)) {
            throw new NoWhenBranchMatchedException();
        }
        ProductArticleParams productArticleParamsA2 = rwc.d.a(((SecurityHubFlowContract$Step.AddToClickToPayProductArticle) step).f85508b);
        k9 k9Var4 = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
        ViewController viewControllerE14 = mVar.e1(new ProductArticleDescriptor(productArticleParamsA2, alwaysShow, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, false, 48));
        Function1 block21 = new Function1() { // from class: huc.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i) {
                    case 0:
                        yja.b output = (yja.b) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        int i32 = com.revolut.feature.security_hub.impl.ui.flow.b.f85555c[output.ordinal()];
                        m mVar2 = mVar;
                        if (i32 == 2) {
                            mVar2.l2(new ald.m((Object) mVar2, true, (Object) ((SecurityHubFlowContract$Step.AddToClickToPayProductArticle) step).f85507a, (Continuation) null, 23), new yi5.b(26));
                        } else {
                            mVar2.B2();
                        }
                        return Unit.f186387a;
                    case 1:
                        rtc.d result = (rtc.d) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean zF = Intrinsics.f(result, rtc.c.f257222a);
                        m mVar3 = mVar;
                        SecurityHubFlowContract$Step securityHubFlowContract$Step = step;
                        if (zF) {
                            mVar3.K2(((SecurityHubFlowContract$Step.WealthProtectionSecurityDelay) securityHubFlowContract$Step).f85551a);
                        } else {
                            if (!Intrinsics.f(result, rtc.b.f257221a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (((SecurityHubFlowContract$Step.WealthProtectionSecurityDelay) securityHubFlowContract$Step).f85552b) {
                                mVar3.B2();
                            }
                        }
                        return Unit.f186387a;
                    default:
                        duc.f output2 = (duc.f) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (output2 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f0 f0Var = ((SecurityHubFlowContract$Step.AddToClickToPay) step).f85506a;
                        m mVar4 = mVar;
                        mVar4.l2(new ald.m((Object) mVar4, false, (Object) f0Var, (Continuation) null, 23), new yi5.b(26));
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block21, "block");
        viewControllerE14.H = block21;
        return viewControllerE14;
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c) this.f151789b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        AsftHomeScreenContract$ModalStep step = (AsftHomeScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AsftHomeScreenContract$ModalStep.RevPointsBottomSheet) {
            return cVar.e1(new hub.c(e0.ASFT));
        }
        if (step instanceof AsftHomeScreenContract$ModalStep.PreparingPassInfo) {
            return new AsftPreparingPassInfoScreen();
        }
        if (step instanceof AsftHomeScreenContract$ModalStep.PassAvailableSoon) {
            AsftHomeScreenContract$ModalStep.PassAvailableSoon passAvailableSoon = (AsftHomeScreenContract$ModalStep.PassAvailableSoon) step;
            AsftPassAvailableSoonScreen asftPassAvailableSoonScreen = new AsftPassAvailableSoonScreen(new AsftPassAvailableSoonScreenContract$InputData(passAvailableSoon.f98831a, passAvailableSoon.f98832b.d));
            hm3.b block = new hm3.b(cVar, ModalCoordinator, step, 29);
            Intrinsics.checkNotNullParameter(block, "block");
            asftPassAvailableSoonScreen.H = block;
            return asftPassAvailableSoonScreen;
        }
        if (step instanceof AsftHomeScreenContract$ModalStep.ManageBooking) {
            AsftManageBookingScreen asftManageBookingScreen = new AsftManageBookingScreen(((AsftHomeScreenContract$ModalStep.ManageBooking) step).f98830a);
            final int i = 0;
            Function1 block2 = new Function1() { // from class: hui.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            qui.e result = (qui.e) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, qui.c.f249457a);
                            com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar2 = cVar;
                            if (zF) {
                                cVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                            } else if (result instanceof qui.d) {
                                cVar2.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                            } else {
                                if (!(result instanceof qui.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                qui.b bVar = (qui.b) result;
                                oki.h.v2(cVar2.C, new AsftHomeScreenContract$ModalStep.CancelBooking(new AsftCancelBookingScreenContract$InputData(bVar.f249454a, bVar.f249455b, bVar.f249456c, bVar.d)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                        default:
                            lui.g result2 = (lui.g) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, lui.f.f200246a)) {
                                if (!(result2 instanceof lui.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar3 = cVar;
                                cVar3.l2(new hg0.n(cVar3, (lui.e) result2, null, 29), new yi5.b(26));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            asftManageBookingScreen.H = block2;
            return asftManageBookingScreen;
        }
        if (!(step instanceof AsftHomeScreenContract$ModalStep.CancelBooking)) {
            if (step instanceof AsftHomeScreenContract$ModalStep.ProductArticle) {
                return cVar.e1(new ProductArticleDescriptor(((AsftHomeScreenContract$ModalStep.ProductArticle) step).f98834a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
            }
            throw new NoWhenBranchMatchedException();
        }
        AsftCancelBookingScreen asftCancelBookingScreen = new AsftCancelBookingScreen(((AsftHomeScreenContract$ModalStep.CancelBooking) step).f98829a);
        final int i2 = 1;
        Function1 block3 = new Function1() { // from class: hui.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        qui.e result = (qui.e) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean zF = Intrinsics.f(result, qui.c.f249457a);
                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar2 = cVar;
                        if (zF) {
                            cVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                        } else if (result instanceof qui.d) {
                            cVar2.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                        } else {
                            if (!(result instanceof qui.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qui.b bVar = (qui.b) result;
                            oki.h.v2(cVar2.C, new AsftHomeScreenContract$ModalStep.CancelBooking(new AsftCancelBookingScreenContract$InputData(bVar.f249454a, bVar.f249455b, bVar.f249456c, bVar.d)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        }
                        return Unit.f186387a;
                    default:
                        lui.g result2 = (lui.g) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!Intrinsics.f(result2, lui.f.f200246a)) {
                            if (!(result2 instanceof lui.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar3 = cVar;
                            cVar3.l2(new hg0.n(cVar3, (lui.e) result2, null, 29), new yi5.b(26));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        asftCancelBookingScreen.H = block3;
        return asftCancelBookingScreen;
    }

    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ReverywhereWebAppScreenContract$InputData url2;
        ViewController esimMobilePlanNumberPortabilityConfirmationOtpFlow;
        int i = this.f151788a;
        final int i2 = 2;
        int i3 = 28;
        int i5 = 5;
        Object obj4 = this.f151789b;
        switch (i) {
            case 0:
                com.revolut.feature.retail.reverywhere.impl.onboarding.a aVar = (com.revolut.feature.retail.reverywhere.impl.onboarding.a) obj4;
                ReverywhereOnboardingFlowContract$InputData reverywhereOnboardingFlowContract$InputData = aVar.f82912r;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                ReverywhereOnboardingFlowContract$Step step = (ReverywhereOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof ReverywhereOnboardingFlowContract$Step.ProductArticle) {
                    ReverywhereOnboardingFlowContract$Step.ProductArticle productArticle = (ReverywhereOnboardingFlowContract$Step.ProductArticle) step;
                    ViewController viewControllerE1 = aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(productArticle.f82906a), !productArticle.f82907b.isEmpty() ? SkipShownArticleBehaviour.AlwaysShow.f81285a : SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                    h8b.b block = new h8b.b(aVar, productArticle, 14);
                    Intrinsics.checkNotNullParameter(block, "block");
                    viewControllerE1.H = block;
                    return viewControllerE1;
                }
                if (!(step instanceof ReverywhereOnboardingFlowContract$Step.RevPointsOptIn)) {
                    if (!(step instanceof ReverywhereOnboardingFlowContract$Step.Reverywhere)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (reverywhereOnboardingFlowContract$InputData instanceof ReverywhereOnboardingFlowContract$InputData.AppConfiguration) {
                        ReverywhereOnboardingFlowContract$InputData.AppConfiguration appConfiguration = (ReverywhereOnboardingFlowContract$InputData.AppConfiguration) reverywhereOnboardingFlowContract$InputData;
                        url2 = new ReverywhereWebAppScreenContract$InputData.AppConfiguration(appConfiguration.f82898a, appConfiguration.f82899b, appConfiguration.f82901g, appConfiguration.e, appConfiguration.f);
                    } else {
                        if (!(reverywhereOnboardingFlowContract$InputData instanceof ReverywhereOnboardingFlowContract$InputData.Url)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ReverywhereOnboardingFlowContract$InputData.Url url3 = (ReverywhereOnboardingFlowContract$InputData.Url) reverywhereOnboardingFlowContract$InputData;
                        url2 = new ReverywhereWebAppScreenContract$InputData.Url(url3.f82903a, url3.f82904b, url3.e, url3.f);
                    }
                    ReverywhereWebAppScreen reverywhereWebAppScreen = new ReverywhereWebAppScreen(url2);
                    reverywhereWebAppScreen.k2(new h1g.a(aVar, 13));
                    return reverywhereWebAppScreen;
                }
                l lVar = aVar.f82911q;
                ReverywhereMiniAppName miniAppName = reverywhereOnboardingFlowContract$InputData.getF82905c();
                lVar.getClass();
                Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
                boolean zF = Intrinsics.f(miniAppName, ReverywhereMiniAppName.AirportTransfers.f82887a);
                RevPointsOptInSource revPointsOptInSource = RevPointsOptInSource.AirportTransfers.f83981a;
                if (!zF) {
                    if (Intrinsics.f(miniAppName, ReverywhereMiniAppName.Stations.f82890a)) {
                        revPointsOptInSource = RevPointsOptInSource.Stations.f84005a;
                    } else if (Intrinsics.f(miniAppName, ReverywhereMiniAppName.LuggageStorage.f82888a)) {
                        revPointsOptInSource = RevPointsOptInSource.LuggageStorage.f83995a;
                    } else if (!(miniAppName instanceof ReverywhereMiniAppName.Other)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ViewController viewControllerE12 = aVar.e1(new hub.a(new LifestyleRevPointsOptInController$InputData(revPointsOptInSource, true, false)));
                h8b.b block2 = new h8b.b(ref$BooleanRef, aVar, 15);
                Intrinsics.checkNotNullParameter(block2, "block");
                viewControllerE12.H = block2;
                viewControllerE12.k2(new h1k.a(ref$BooleanRef, aVar, 22));
                return viewControllerE12;
            case 1:
                final com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.a aVar2 = (com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.a) obj4;
                UnlockBenefitsFlowContract$Step step2 = (UnlockBenefitsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof UnlockBenefitsFlowContract$Step.UnlockBenefits) {
                    UnlockBenefitsScreen unlockBenefitsScreen = new UnlockBenefitsScreen(new UnlockBenefitsScreenContract$InputData(((UnlockBenefitsFlowContract$Step.UnlockBenefits) step2).f80968a));
                    final int i6 = 1;
                    Function1 block3 = new Function1() { // from class: hga.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    til.r result = (til.r) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, til.q.f271586a);
                                    com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.a aVar3 = aVar2;
                                    if (zF2 || Intrinsics.f(result, til.n.f271581a)) {
                                        h.t2(aVar3, aVar3.f80969p, new UnlockBenefitsFlowContract$Step.UnlockBenefits(false), false, null, false, 12);
                                    } else {
                                        if (!(result instanceof til.o) && !(result instanceof til.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(aVar3.f80969p);
                                    }
                                    return Unit.f186387a;
                                default:
                                    g output = (g) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.a aVar4 = aVar2;
                                    h.t2(aVar4, aVar4.f80969p, new UnlockBenefitsFlowContract$Step.Attestation(output.f161105a), false, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    unlockBenefitsScreen.H = block3;
                    return unlockBenefitsScreen;
                }
                if (!(step2 instanceof UnlockBenefitsFlowContract$Step.Attestation)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((UnlockBenefitsFlowContract$Step.Attestation) step2).f80967a;
                til.m mVar = aVar2.o;
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var = k9.Premium;
                companion.getClass();
                final int i21 = 0;
                WorkflowFlow workflowFlowB = til.m.b(mVar, new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), new WorkflowFlowType.Regular(0), null, 56);
                Function1 block4 = new Function1() { // from class: hga.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i21) {
                            case 0:
                                til.r result = (til.r) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF2 = Intrinsics.f(result, til.q.f271586a);
                                com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.a aVar3 = aVar2;
                                if (zF2 || Intrinsics.f(result, til.n.f271581a)) {
                                    h.t2(aVar3, aVar3.f80969p, new UnlockBenefitsFlowContract$Step.UnlockBenefits(false), false, null, false, 12);
                                } else {
                                    if (!(result instanceof til.o) && !(result instanceof til.p)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(aVar3.f80969p);
                                }
                                return Unit.f186387a;
                            default:
                                g output = (g) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.a aVar4 = aVar2;
                                h.t2(aVar4, aVar4.f80969p, new UnlockBenefitsFlowContract$Step.Attestation(output.f161105a), false, null, false, 12);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                workflowFlowB.H = block4;
                return workflowFlowB;
            case 2:
                com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar3 = (com.revolut.feature.retail.salary_account.impl.salary_hub.a) obj4;
                hgb.b bVar = aVar3.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SalaryHubControllerContract$ModalStep step3 = (SalaryHubControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!Intrinsics.f(step3, SalaryHubControllerContract$ModalStep.SwitchSalary.f82990a)) {
                    if (!Intrinsics.f(step3, SalaryHubControllerContract$ModalStep.PrioritySupport.f82989a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.getClass();
                    lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_priority_support_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_priority_support_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_chat, null, null, 6)), null, false, 24);
                    aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_priority_support_action, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var2 = k9.Salary;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar4, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                }
                mgb.k kVarI2 = aVar3.I2();
                mgb.j jVar = kVarI2 != null ? kVarI2.f205250g : null;
                bVar.getClass();
                lw0.a aVar5 = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_switch_salary_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_switch_salary_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_lock_opened, null, null, 6)), null, false, 24);
                aw0.e eVar2 = new aw0.e(false, jVar != null ? c8g.a.E(jVar) : null, null, new n6(new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_switch_salary_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53);
                k9 k9Var3 = k9.Salary;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar5, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                hgb.w block5 = new hgb.w(aVar3, 1);
                Intrinsics.checkNotNullParameter(block5, "block");
                actionsBottomSheetController.H = block5;
                return actionsBottomSheetController;
            case 3:
                com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.a aVar6 = (com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                TravelMilesFlightSearchResultsFlowContract$Step step4 = (TravelMilesFlightSearchResultsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof TravelMilesFlightSearchResultsFlowContract$Step.SearchResults)) {
                    if (!(step4 instanceof TravelMilesFlightSearchResultsFlowContract$Step.FlightDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TravelMilesFlightSearchResultsFlowContract$Step.FlightDetails flightDetails = (TravelMilesFlightSearchResultsFlowContract$Step.FlightDetails) step4;
                    return new TravelMilesRecommendedFlightsFlow(new TravelMilesRecommendedFlightsFlowContract$InputData.FlightSearchResultDetails(flightDetails.f94216a, flightDetails.f94217b, flightDetails.d, flightDetails.f94218c));
                }
                TravelMilesFlightSearchResultsFlowContract$InputData travelMilesFlightSearchResultsFlowContract$InputData = aVar6.o;
                TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen = new TravelMilesFlightSearchResultsScreen(new TravelMilesFlightSearchResultsScreenContract$InputData(travelMilesFlightSearchResultsFlowContract$InputData.f94213a, travelMilesFlightSearchResultsFlowContract$InputData.f94214b, travelMilesFlightSearchResultsFlowContract$InputData.f94215c));
                h8b.b block6 = new h8b.b(aVar6, FlowCoordinator, 19);
                Intrinsics.checkNotNullParameter(block6, "block");
                travelMilesFlightSearchResultsScreen.H = block6;
                return travelMilesFlightSearchResultsScreen;
            case 4:
                final com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b) obj4;
                EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = bVar2.o;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                final EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step step5 = (EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PortabilityInstruction) {
                    EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PortabilityInstruction portabilityInstruction = (EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PortabilityInstruction) step5;
                    String str2 = portabilityInstruction.f;
                    Pair pair = new Pair("phoneNumber", bVar2.f100767q.a(portabilityInstruction.f100759b));
                    EsimGiftRecipient esimGiftRecipient = esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.d;
                    BackendFlowInput.Source.Remote remote = new BackendFlowInput.Source.Remote(str2, foh.i.q(pair, new Pair("receiverName", esimGiftRecipient != null ? esimGiftRecipient.d : null)));
                    BackendFlowApiEndpoints.INSTANCE.getClass();
                    return bVar2.e1(new n90.a(new BackendFlowInput(remote, null, null, portabilityInstruction.d == hgj.c.DEFAULT ? BackendFlowNavigationIcon.BackArrow.f63285a : BackendFlowNavigationIcon.Cross.f63286a, false, BackendFlowApiEndpoints.Companion.a(str2), 54)));
                }
                if (step5 instanceof EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PowerOfAttorney) {
                    EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PowerOfAttorney powerOfAttorney = (EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PowerOfAttorney) step5;
                    String str3 = powerOfAttorney.f100761a;
                    String str4 = powerOfAttorney.f100762b;
                    EsimPhoneNumberPorting esimPhoneNumberPorting = powerOfAttorney.f100763c;
                    esimMobilePlanNumberPortabilityConfirmationOtpFlow = new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlow(new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData(str3, str4, esimPhoneNumberPorting.f, esimPhoneNumberPorting.f100334g, powerOfAttorney.f, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.d, powerOfAttorney.d));
                    final int i22 = 3;
                    Function1 block7 = new Function1() { // from class: hgj.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a result = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof jgj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar3 = bVar2;
                                    if (z) {
                                        jgj.c cVar = (jgj.c) result;
                                        bVar3.K2(cVar.f174064a, cVar.f174065b);
                                    } else {
                                        if (!(result instanceof a.C0614a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar3.J2(step5, ((a.C0614a) result).f100793a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF2 = Intrinsics.f(result2, a.b.f100780a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar4 = bVar2;
                                    if (zF2) {
                                        bVar4.C2(a.b.f100765a);
                                    } else {
                                        boolean z3 = result2 instanceof a.C0613a;
                                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step = step5;
                                        if (z3) {
                                            bVar4.J2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step, ((a.C0613a) result2).f100779a);
                                        } else {
                                            if (!(result2 instanceof igj.c)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            igj.c cVar2 = (igj.c) result2;
                                            EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 = bVar4.I2(cVar2.f161229a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getF100763c(), cVar2.f161230b, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getD(), esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getE());
                                            if (esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 != null) {
                                                bVar4.N2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2);
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ggj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar5 = bVar2;
                                    if (z4) {
                                        ggj.c cVar3 = (ggj.c) result3;
                                        bVar5.K2(cVar3.f143693a, cVar3.f143694b);
                                    } else {
                                        if (!(result3 instanceof a.C0611a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.J2(step5, ((a.C0611a) result3).f100740a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a result4 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z6 = result4 instanceof kgj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar6 = bVar2;
                                    if (z6) {
                                        kgj.c cVar4 = (kgj.c) result4;
                                        bVar6.K2(cVar4.f184012a, cVar4.f184013b);
                                    } else {
                                        if (!(result4 instanceof a.C0615a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.J2(step5, ((a.C0615a) result4).f100809a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    esimMobilePlanNumberPortabilityConfirmationOtpFlow.H = block7;
                } else if (step5 instanceof EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Pac) {
                    EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Pac pac2 = (EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Pac) step5;
                    String str5 = pac2.f100756b;
                    String str6 = pac2.f100755a;
                    EsimPhoneNumberPorting esimPhoneNumberPorting2 = pac2.f100757c;
                    esimMobilePlanNumberPortabilityConfirmationOtpFlow = new EsimMobilePlanPacNumberTransferConfirmationFlow(new EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData(esimPhoneNumberPorting2.f100334g, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.d, esimPhoneNumberPorting2.f, pac2.f, pac2.d, str6, str5));
                    final int i32 = 0;
                    Function1 block8 = new Function1() { // from class: hgj.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i32) {
                                case 0:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a result = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof jgj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar3 = bVar2;
                                    if (z) {
                                        jgj.c cVar = (jgj.c) result;
                                        bVar3.K2(cVar.f174064a, cVar.f174065b);
                                    } else {
                                        if (!(result instanceof a.C0614a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar3.J2(step5, ((a.C0614a) result).f100793a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF2 = Intrinsics.f(result2, a.b.f100780a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar4 = bVar2;
                                    if (zF2) {
                                        bVar4.C2(a.b.f100765a);
                                    } else {
                                        boolean z3 = result2 instanceof a.C0613a;
                                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step = step5;
                                        if (z3) {
                                            bVar4.J2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step, ((a.C0613a) result2).f100779a);
                                        } else {
                                            if (!(result2 instanceof igj.c)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            igj.c cVar2 = (igj.c) result2;
                                            EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 = bVar4.I2(cVar2.f161229a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getF100763c(), cVar2.f161230b, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getD(), esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getE());
                                            if (esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 != null) {
                                                bVar4.N2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2);
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ggj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar5 = bVar2;
                                    if (z4) {
                                        ggj.c cVar3 = (ggj.c) result3;
                                        bVar5.K2(cVar3.f143693a, cVar3.f143694b);
                                    } else {
                                        if (!(result3 instanceof a.C0611a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.J2(step5, ((a.C0611a) result3).f100740a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a result4 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z6 = result4 instanceof kgj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar6 = bVar2;
                                    if (z6) {
                                        kgj.c cVar4 = (kgj.c) result4;
                                        bVar6.K2(cVar4.f184012a, cVar4.f184013b);
                                    } else {
                                        if (!(result4 instanceof a.C0615a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.J2(step5, ((a.C0615a) result4).f100809a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    esimMobilePlanNumberPortabilityConfirmationOtpFlow.H = block8;
                } else if (step5 instanceof EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.DynamicForm) {
                    EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.DynamicForm dynamicForm = (EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.DynamicForm) step5;
                    String str7 = dynamicForm.f100748a;
                    String str8 = dynamicForm.f100749b;
                    EsimPhoneNumberPorting esimPhoneNumberPorting3 = dynamicForm.f100750c;
                    esimMobilePlanNumberPortabilityConfirmationOtpFlow = new EsimMobilePlanNumberTransferConfirmationDynamicFormFlow(new EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData(esimPhoneNumberPorting3.f100334g, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.d, dynamicForm.f, esimPhoneNumberPorting3.f, dynamicForm.d, str7, str8));
                    Function1 block9 = new Function1() { // from class: hgj.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i2) {
                                case 0:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a result = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof jgj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar3 = bVar2;
                                    if (z) {
                                        jgj.c cVar = (jgj.c) result;
                                        bVar3.K2(cVar.f174064a, cVar.f174065b);
                                    } else {
                                        if (!(result instanceof a.C0614a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar3.J2(step5, ((a.C0614a) result).f100793a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF2 = Intrinsics.f(result2, a.b.f100780a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar4 = bVar2;
                                    if (zF2) {
                                        bVar4.C2(a.b.f100765a);
                                    } else {
                                        boolean z3 = result2 instanceof a.C0613a;
                                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step = step5;
                                        if (z3) {
                                            bVar4.J2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step, ((a.C0613a) result2).f100779a);
                                        } else {
                                            if (!(result2 instanceof igj.c)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            igj.c cVar2 = (igj.c) result2;
                                            EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 = bVar4.I2(cVar2.f161229a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getF100763c(), cVar2.f161230b, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getD(), esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getE());
                                            if (esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 != null) {
                                                bVar4.N2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2);
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ggj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar5 = bVar2;
                                    if (z4) {
                                        ggj.c cVar3 = (ggj.c) result3;
                                        bVar5.K2(cVar3.f143693a, cVar3.f143694b);
                                    } else {
                                        if (!(result3 instanceof a.C0611a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.J2(step5, ((a.C0611a) result3).f100740a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a result4 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z6 = result4 instanceof kgj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar6 = bVar2;
                                    if (z6) {
                                        kgj.c cVar4 = (kgj.c) result4;
                                        bVar6.K2(cVar4.f184012a, cVar4.f184013b);
                                    } else {
                                        if (!(result4 instanceof a.C0615a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.J2(step5, ((a.C0615a) result4).f100809a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    esimMobilePlanNumberPortabilityConfirmationOtpFlow.H = block9;
                } else {
                    if (!(step5 instanceof EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Otp)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Otp otp = (EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Otp) step5;
                    String str9 = otp.f100751a;
                    String str10 = otp.f100752b;
                    esimMobilePlanNumberPortabilityConfirmationOtpFlow = new EsimMobilePlanNumberPortabilityConfirmationOtpFlow(new EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData(otp.f100753c.f100334g, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.d, otp.f, otp.d, str9, str10, otp.f100754g));
                    final int i33 = 1;
                    Function1 block10 = new Function1() { // from class: hgj.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i33) {
                                case 0:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a result = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof jgj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar3 = bVar2;
                                    if (z) {
                                        jgj.c cVar = (jgj.c) result;
                                        bVar3.K2(cVar.f174064a, cVar.f174065b);
                                    } else {
                                        if (!(result instanceof a.C0614a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar3.J2(step5, ((a.C0614a) result).f100793a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF2 = Intrinsics.f(result2, a.b.f100780a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar4 = bVar2;
                                    if (zF2) {
                                        bVar4.C2(a.b.f100765a);
                                    } else {
                                        boolean z3 = result2 instanceof a.C0613a;
                                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step = step5;
                                        if (z3) {
                                            bVar4.J2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step, ((a.C0613a) result2).f100779a);
                                        } else {
                                            if (!(result2 instanceof igj.c)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            igj.c cVar2 = (igj.c) result2;
                                            EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 = bVar4.I2(cVar2.f161229a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getF100763c(), cVar2.f161230b, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getD(), esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getE());
                                            if (esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 != null) {
                                                bVar4.N2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2);
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ggj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar5 = bVar2;
                                    if (z4) {
                                        ggj.c cVar3 = (ggj.c) result3;
                                        bVar5.K2(cVar3.f143693a, cVar3.f143694b);
                                    } else {
                                        if (!(result3 instanceof a.C0611a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.J2(step5, ((a.C0611a) result3).f100740a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a result4 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z6 = result4 instanceof kgj.c;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar6 = bVar2;
                                    if (z6) {
                                        kgj.c cVar4 = (kgj.c) result4;
                                        bVar6.K2(cVar4.f184012a, cVar4.f184013b);
                                    } else {
                                        if (!(result4 instanceof a.C0615a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.J2(step5, ((a.C0615a) result4).f100809a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    esimMobilePlanNumberPortabilityConfirmationOtpFlow.H = block10;
                }
                return esimMobilePlanNumberPortabilityConfirmationOtpFlow;
            case 5:
                com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h hVar = (com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) obj4;
                ali.b PagerCoordinator = (ali.b) obj2;
                WatchlistAddAssetFlowContract$Step step6 = (WatchlistAddAssetFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof WatchlistAddAssetFlowContract$Step.Loaded) {
                    FavouritesAssetTypeKey favouritesAssetTypeKey = ((WatchlistAddAssetFlowContract$Step.Loaded) step6).f86945a;
                    hVar.getClass();
                    return new AddAssetRev10Screen(new AddAssetRev10ScreenContract$InputData.Content(favouritesAssetTypeKey, hVar.o.f86940b instanceof WatchlistAddAssetFlowContract$LaunchMode.SingleSelection));
                }
                if (!(step6 instanceof WatchlistAddAssetFlowContract$Step.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar.getClass();
                return new AddAssetRev10Screen(AddAssetRev10ScreenContract$InputData.Loading.f86823a);
            case 6:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = CreateRequestLinkScreen.U;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
                return new zp0.d(editText, ((yof.b) obj5).f315672a, (u80.d) ((CreateRequestLinkScreen) obj4).O.getValue(), null, null, false, false, 0, false, null, 1944);
            case 7:
                final com.revolut.feature.shops.impl.flow.checkout.b bVar3 = (com.revolut.feature.shops.impl.flow.checkout.b) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                ModalCheckoutFlowContract$Step step7 = (ModalCheckoutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof ModalCheckoutFlowContract$Step.CampaignCheckout) {
                    ShopsCampaignCheckoutScreen shopsCampaignCheckoutScreen = new ShopsCampaignCheckoutScreen(new ShopsCampaignCheckoutScreenContract$InputData(((ModalCheckoutFlowContract$Step.CampaignCheckout) step7).f87089a));
                    final int i43 = 1;
                    shopsCampaignCheckoutScreen.k2(new Function0() { // from class: hid.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i43) {
                                case 0:
                                    com.revolut.feature.shops.impl.flow.checkout.b bVar4 = bVar3;
                                    if (!((ModalCheckoutFlowContract$FlowState) ((j2) bVar4.f87093r.f22677a).getValue()).f87087a) {
                                        h.D2(bVar4.f87092q);
                                    }
                                    break;
                                default:
                                    h.D2(bVar3.f87092q);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return shopsCampaignCheckoutScreen;
                }
                if (!(step7 instanceof ModalCheckoutFlowContract$Step.OptIn)) {
                    throw new NoWhenBranchMatchedException();
                }
                final int i59 = 0;
                ViewController viewControllerE13 = bVar3.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.Shops.f84003a, false, 6)));
                hg4.a block11 = new hg4.a(bVar3, 8);
                Intrinsics.checkNotNullParameter(block11, "block");
                viewControllerE13.H = block11;
                viewControllerE13.k2(new Function0() { // from class: hid.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i59) {
                            case 0:
                                com.revolut.feature.shops.impl.flow.checkout.b bVar4 = bVar3;
                                if (!((ModalCheckoutFlowContract$FlowState) ((j2) bVar4.f87093r.f22677a).getValue()).f87087a) {
                                    h.D2(bVar4.f87092q);
                                }
                                break;
                            default:
                                h.D2(bVar3.f87092q);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return viewControllerE13;
            case 8:
                com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow.a aVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                RecommendedValuatorsFlowContract$Step step8 = (RecommendedValuatorsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof RecommendedValuatorsFlowContract$Step.Details) {
                    return new ValuatorDetailsScreen(new ValuatorDetailsScreenContract$InputData(((RecommendedValuatorsFlowContract$Step.Details) step8).f68508a));
                }
                if (!(step8 instanceof RecommendedValuatorsFlowContract$Step.List)) {
                    throw new NoWhenBranchMatchedException();
                }
                ValuatorsListScreen valuatorsListScreen = new ValuatorsListScreen();
                h8b.b block12 = new h8b.b(aVar7, FlowCoordinator2, 24);
                Intrinsics.checkNotNullParameter(block12, "block");
                valuatorsListScreen.H = block12;
                return valuatorsListScreen;
            case 9:
                PurchaseCalculatorController purchaseCalculatorController = (PurchaseCalculatorController) obj4;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = PurchaseCalculatorController.W;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText2 = field2.getEditText();
                xi0.b bVar4 = purchaseCalculatorController.L.f78904b;
                qd0.b bVarN = ((oi9.v) purchaseCalculatorController.Q.getValue()).f225571b.o.n();
                vc.s.j(bVarN);
                return new zp0.d(editText2, bVar4, new u80.d(((s80.b) bVarN).b()), null, new f61.a(purchaseCalculatorController, 12), false, false, 0, false, null, 1960);
            case 10:
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.flow.a aVar8 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.flow.a) obj4;
                PlanHubV2FlowContract$Step step9 = (PlanHubV2FlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof PlanHubV2FlowContract$Step.PlanHub) {
                    return new PlanHubV2Screen(new PlanHubV2ScreenContract$InputData(aVar8.o.f103551a));
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                com.revolut.sso.impl.ui.consent.qr.b bVar5 = (com.revolut.sso.impl.ui.consent.qr.b) obj4;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                QrConsentFlowContract$Step step10 = (QrConsentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof QrConsentFlowContract$Step.Confirmation) {
                    QrConsentFlowContract$Step.Confirmation confirmation = (QrConsentFlowContract$Step.Confirmation) step10;
                    ConsentChallenge.Qr qr10 = confirmation.f106469a;
                    ConsentChallenge.Qr.Delegated.Selection.Identity identity = confirmation.f106470b;
                    ConsentScreen consentScreen = new ConsentScreen(new ConsentScreenContract$InputData(qr10));
                    g31.e block13 = new g31.e(qr10, 26, bVar5, identity);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    consentScreen.H = block13;
                    return consentScreen;
                }
                if (step10 instanceof QrConsentFlowContract$Step.RequestLocation) {
                    return ((knl.h) bVar5.f106478r).Z2(new hm3.b(bVar5, ((QrConsentFlowContract$Step.RequestLocation) step10).f106471a, i5));
                }
                if (step10 instanceof QrConsentFlowContract$Step.UnexpectedLocationCheck) {
                    QrConsentFlowContract$Step.UnexpectedLocationCheck unexpectedLocationCheck = (QrConsentFlowContract$Step.UnexpectedLocationCheck) step10;
                    ConsentChallenge consentChallenge = unexpectedLocationCheck.f106473a;
                    UnexpectedLocationScreen unexpectedLocationScreen = new UnexpectedLocationScreen(new UnexpectedLocationScreenContract$InputData(consentChallenge, unexpectedLocationCheck.f106474b));
                    hm3.b block14 = new hm3.b(bVar5, consentChallenge, 4);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    unexpectedLocationScreen.H = block14;
                    return unexpectedLocationScreen;
                }
                if (!(step10 instanceof QrConsentFlowContract$Step.SelectIdentity)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConsentChallenge.Qr.Delegated delegated = ((QrConsentFlowContract$Step.SelectIdentity) step10).f106472a;
                SelectIdentityScreen selectIdentityScreen = new SelectIdentityScreen(new SelectIdentityScreenContract$InputData(delegated));
                hm3.b block15 = new hm3.b(bVar5, delegated, 3);
                Intrinsics.checkNotNullParameter(block15, "block");
                selectIdentityScreen.H = block15;
                return selectIdentityScreen;
            case 12:
                com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d dVar = (com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d) obj4;
                PennyTopUpFlowContract$InputData pennyTopUpFlowContract$InputData = dVar.o;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                PennyTopUpFlowContract$Step step11 = (PennyTopUpFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof PennyTopUpFlowContract$Step.Institutions) {
                    InstitutionsListScreen institutionsListScreen = new InstitutionsListScreen(new xn6.f(new ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_penny_topup_bank_selection_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_penny_topup_bank_selection_subtitle, null, null, 14), null, new ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.CantLinkAccountItem(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_selection_bank_not_found, null, null, 14), DummyCommand.f98635a), pennyTopUpFlowContract$InputData.f73024c, 44), new oe6.e(((PennyTopUpFlowContract$Step.Institutions) step11).f73032a), null));
                    hg4.a block16 = new hg4.a(dVar, 20);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    institutionsListScreen.H = block16;
                    return institutionsListScreen;
                }
                if (step11 instanceof PennyTopUpFlowContract$Step.Branches) {
                    PennyTopUpFlowContract$Step.Branches branches = (PennyTopUpFlowContract$Step.Branches) step11;
                    BranchesScreen branchesScreen = new BranchesScreen(new BranchesScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_penny_topup_selection_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_selection_branch_search_title, null, null, 14), branches.f73028a.f66107a, false));
                    hm3.b block17 = new hm3.b(branches, dVar, 8);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    branchesScreen.H = block17;
                    return branchesScreen;
                }
                if (step11 instanceof PennyTopUpFlowContract$Step.AccountInformationService) {
                    PennyTopUpFlowContract$Step.AccountInformationService accountInformationService = (PennyTopUpFlowContract$Step.AccountInformationService) step11;
                    AccountInformationServiceScreen accountInformationServiceScreen = new AccountInformationServiceScreen(new in6.e(accountInformationService.f73025a, accountInformationService.f73026b, accountInformationService.f73027c));
                    hm3.b block18 = new hm3.b(dVar, accountInformationService, 10);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    accountInformationServiceScreen.H = block18;
                    return accountInformationServiceScreen;
                }
                if (step11 instanceof PennyTopUpFlowContract$Step.Iban) {
                    PennyTopUpFlowContract$Step.Iban iban = (PennyTopUpFlowContract$Step.Iban) step11;
                    IbanScreen ibanScreen = new IbanScreen(iban.f73031c);
                    hm3.b block19 = new hm3.b(dVar, iban, 11);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    ibanScreen.H = block19;
                    return ibanScreen;
                }
                if (!(step11 instanceof PennyTopUpFlowContract$Step.PaymentInitiationService)) {
                    throw new NoWhenBranchMatchedException();
                }
                PennyTopUpFlowContract$Step.PaymentInitiationService paymentInitiationService = (PennyTopUpFlowContract$Step.PaymentInitiationService) step11;
                PaymentInitiationServiceScreen paymentInitiationServiceScreen = new PaymentInitiationServiceScreen(new kn6.f(pennyTopUpFlowContract$InputData.f73022a, paymentInitiationService.f73033a, paymentInitiationService.f73034b, pennyTopUpFlowContract$InputData.d, pennyTopUpFlowContract$InputData.e, paymentInitiationService.f73035c));
                hm3.b block20 = new hm3.b(dVar, paymentInitiationService, 9);
                Intrinsics.checkNotNullParameter(block20, "block");
                paymentInitiationServiceScreen.H = block20;
                return paymentInitiationServiceScreen;
            case 13:
                od0.i selectedRegisteredIdentityIdOptional = (od0.i) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(selectedRegisteredIdentityIdOptional, "selectedRegisteredIdentityIdOptional");
                ((hng.b) obj4).f154093b.f("SELECTED_REGISTERED_IDENTITY_ID", selectedRegisteredIdentityIdOptional);
                return Unit.f186387a;
            case 14:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return new hp2.h((List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null)), hp2.m.a((hp2.f) obj4), null, false, false);
            case 15:
                final com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a aVar9 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final ViewSplitItemsControllerContract$ModalStep step12 = (ViewSplitItemsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof ViewSplitItemsControllerContract$ModalStep.RemoveItem)) {
                    if (!(step12 instanceof ViewSplitItemsControllerContract$ModalStep.AddItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AddSplitItemController addSplitItemController = new AddSplitItemController(new cq9.g(aVar9.o.f154643a, ((ViewSplitItemsControllerContract$ModalStep.AddItem) step12).f79280a));
                    final int i66 = 1;
                    Function1 block21 = new Function1() { // from class: hq9.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            ArrayList arrayListF0;
                            switch (i66) {
                                case 0:
                                    dii.g output = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof dii.f) {
                                        String str11 = ((ViewSplitItemsControllerContract$ModalStep.RemoveItem) step12).f79281a.f79225a;
                                        com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a aVar10 = aVar9;
                                        aVar10.H2(aVar10.f79283q, new ho6.n(str11, 2));
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a aVar11 = aVar9;
                                    cli.y yVar = aVar11.f79283q;
                                    cq9.k output2 = (cq9.k) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof cq9.j) {
                                        SplitBillItem splitBillItem = ((cq9.j) output2).f108053a;
                                        List list = ((h) ((j2) yVar.f22677a).getValue()).f154642a;
                                        Iterator it8 = list.iterator();
                                        int i74 = 0;
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                i74 = -1;
                                            } else if (!Intrinsics.f(((SplitBillItem) it8.next()).f79225a, splitBillItem.f79225a)) {
                                                i74++;
                                            }
                                        }
                                        if (i74 == -1) {
                                            arrayListF0 = d0.F0(splitBillItem, list);
                                        } else {
                                            ArrayList arrayListF1 = d0.f1(list);
                                            arrayListF1.set(i74, splitBillItem);
                                            arrayListF0 = arrayListF1;
                                        }
                                        aVar11.H2(yVar, new c0(24, arrayListF0));
                                    } else {
                                        if (!(output2 instanceof cq9.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        SplitBillItem splitBillItem2 = ((ViewSplitItemsControllerContract$ModalStep.AddItem) step12).f79280a;
                                        if (splitBillItem2 == null) {
                                            r6.b.r("Item cannot be null when removing");
                                            return Unit.f186387a;
                                        }
                                        aVar11.H2(yVar, new ho6.n(splitBillItem2.f79225a, 2));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    addSplitItemController.H = block21;
                    return addSplitItemController;
                }
                bq9.d dVar2 = aVar9.f79282p;
                String str11 = ((ViewSplitItemsControllerContract$ModalStep.RemoveItem) step12).f79281a.f79226b;
                dVar2.getClass();
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(bq9.d.a(str11));
                final int i74 = 0;
                Function1 block22 = new Function1() { // from class: hq9.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        ArrayList arrayListF0;
                        switch (i74) {
                            case 0:
                                dii.g output = (dii.g) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof dii.f) {
                                    String str112 = ((ViewSplitItemsControllerContract$ModalStep.RemoveItem) step12).f79281a.f79225a;
                                    com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a aVar10 = aVar9;
                                    aVar10.H2(aVar10.f79283q, new ho6.n(str112, 2));
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a aVar11 = aVar9;
                                cli.y yVar = aVar11.f79283q;
                                cq9.k output2 = (cq9.k) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (output2 instanceof cq9.j) {
                                    SplitBillItem splitBillItem = ((cq9.j) output2).f108053a;
                                    List list = ((h) ((j2) yVar.f22677a).getValue()).f154642a;
                                    Iterator it8 = list.iterator();
                                    int i742 = 0;
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            i742 = -1;
                                        } else if (!Intrinsics.f(((SplitBillItem) it8.next()).f79225a, splitBillItem.f79225a)) {
                                            i742++;
                                        }
                                    }
                                    if (i742 == -1) {
                                        arrayListF0 = d0.F0(splitBillItem, list);
                                    } else {
                                        ArrayList arrayListF1 = d0.f1(list);
                                        arrayListF1.set(i742, splitBillItem);
                                        arrayListF0 = arrayListF1;
                                    }
                                    aVar11.H2(yVar, new c0(24, arrayListF0));
                                } else {
                                    if (!(output2 instanceof cq9.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    SplitBillItem splitBillItem2 = ((ViewSplitItemsControllerContract$ModalStep.AddItem) step12).f79280a;
                                    if (splitBillItem2 == null) {
                                        r6.b.r("Item cannot be null when removing");
                                        return Unit.f186387a;
                                    }
                                    aVar11.H2(yVar, new ho6.n(splitBillItem2.f79225a, 2));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block22, "block");
                actionsBottomSheetController2.H = block22;
                return actionsBottomSheetController2;
            case 16:
                hql.e eVar3 = (hql.e) obj4;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter((SignInWithRevolutIdFlowContract$Step) obj3, "<unused var>");
                nkl.b bVar6 = eVar3.f154742p;
                SignInWithRevolutIdFlowContract$InputData signInWithRevolutIdFlowContract$InputData = eVar3.o;
                String str12 = signInWithRevolutIdFlowContract$InputData.f106750a;
                String str13 = signInWithRevolutIdFlowContract$InputData.d;
                String str14 = signInWithRevolutIdFlowContract$InputData.f106751b;
                String str15 = signInWithRevolutIdFlowContract$InputData.e;
                RevolutSsoApi$InputData$SignInWithRevolutId input = new RevolutSsoApi$InputData$SignInWithRevolutId(str12, str13, str14, str15);
                hp5.b codeChallengeGenerator = new hp5.b(eVar3, 14);
                bVar6.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
                bVar6.f216818a.c(new xil.g(0));
                Intrinsics.checkNotNullParameter(input, "<this>");
                AuthenticationFlow authenticationFlow = new AuthenticationFlow(new AuthenticationFlowContract$InputData.SignInWithRevolutId(str12, str13, str14, str15), codeChallengeGenerator, new UICustomization(null, null, 31));
                hg4.a block23 = new hg4.a(eVar3, i3);
                Intrinsics.checkNotNullParameter(block23, "block");
                authenticationFlow.H = block23;
                return authenticationFlow;
            case 17:
                com.revolut.feature.terminated_users.impl.ui.logout_confirmation.b bVar7 = (com.revolut.feature.terminated_users.impl.ui.logout_confirmation.b) obj4;
                LogoutConfirmationFlowContract$Step step13 = (LogoutConfirmationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof LogoutConfirmationFlowContract$Step.BottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                LogoutConfirmationFlowContract$InputData logoutConfirmationFlowContract$InputData = bVar7.f90353q;
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(new lw0.a(logoutConfirmationFlowContract$InputData.f90347a, logoutConfirmationFlowContract$InputData.f90348b, null, null, false, 28), new aw0.g(new n6(logoutConfirmationFlowContract$InputData.f90349c, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(logoutConfirmationFlowContract$InputData.d, LargeActionButton.ButtonStyle.f58725a, null, "LOG_OUT_BUTTON_LOADING_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), (Clause) null, (aw0.f) null, 25), logoutConfirmationFlowContract$InputData.f, null, null, 24));
                hg4.a block24 = new hg4.a(bVar7, 29);
                Intrinsics.checkNotNullParameter(block24, "block");
                actionsBottomSheetController3.H = block24;
                return actionsBottomSheetController3;
            case 18:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new hs4.k((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), new hs4.j(hs4.p.a(((hs4.e) obj4).f154988b), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            case 19:
                return a(obj2, obj3);
            case 20:
                com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.b bVar8 = (com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.b) obj4;
                WorkflowDocumentSelectionFlowContract$InputData workflowDocumentSelectionFlowContract$InputData = bVar8.o;
                yki.b LazyFlowCoordinator6 = (yki.b) obj2;
                WorkflowDocumentSelectionFlowContract$Step step14 = (WorkflowDocumentSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator6, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof WorkflowDocumentSelectionFlowContract$Step.CitizenshipPicker) {
                    WorkflowDocumentSelectionConfiguration.CitizenshipPicker citizenshipPicker = workflowDocumentSelectionFlowContract$InputData.f96404b.f96393b;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_nationality_title, zhm.u.c(citizenshipPicker.f96398b), null, 12);
                    String str16 = citizenshipPicker.f96399c;
                    TextClause textClause = str16 != null ? new TextClause(str16, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    WorkflowDocumentSelectionFlowContract$Step.CitizenshipPicker citizenshipPicker2 = (WorkflowDocumentSelectionFlowContract$Step.CitizenshipPicker) step14;
                    String str17 = citizenshipPicker2.f96406a.f297794a;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_nationality_search_placeholder, null, null, 14);
                    boolean z = workflowDocumentSelectionFlowContract$InputData.d;
                    AnalyticsProduct analyticsProduct = workflowDocumentSelectionFlowContract$InputData.e;
                    aim.e eVarB = zhm.u.b();
                    if (workflowDocumentSelectionFlowContract$InputData.f96405c != null) {
                        eVarB.add(new TextNavBarMenuItem("HELP_MENU_ITEM_ID", new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_list_of_documents_action_help, null, null, 14), null, null, 12));
                    }
                    s7a.x xVar = new s7a.x(textLocalisedClause, null, textClause, null, z, null, textLocalisedClause2, null, null, false, null, str17, null, zhm.u.a(eVarB), false, analyticsProduct, null, new s7a.v(13, null, Integer.valueOf(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_citizenship_picker_no_result_subtitle)), null, null, 1976434034);
                    oth.a aVar10 = bVar8.f96416p;
                    ArrayList citizenshipGroups = citizenshipPicker2.f96407b;
                    aVar10.getClass();
                    Intrinsics.checkNotNullParameter(citizenshipGroups, "citizenshipGroups");
                    tog.a aVar11 = aVar10.f229591a;
                    oth.b citizenshipPickerCountryInteractor = new oth.b((CitizenshipGroup) d0.b0(citizenshipGroups), (CitizenshipGroup) d0.m0(citizenshipGroups));
                    Intrinsics.checkNotNullParameter(citizenshipPickerCountryInteractor, "citizenshipPickerCountryInteractor");
                    PickerController pickerController = new PickerController(xVar, new sog.e(aVar11.f273209a, citizenshipPickerCountryInteractor, aVar11.f273210b));
                    hth.f block25 = new hth.f(bVar8, LazyFlowCoordinator6, step14);
                    Intrinsics.checkNotNullParameter(block25, "block");
                    pickerController.H = block25;
                    return pickerController;
                }
                if (!(step14 instanceof WorkflowDocumentSelectionFlowContract$Step.SingleCitizenshipPrompt)) {
                    if (!(step14 instanceof WorkflowDocumentSelectionFlowContract$Step.DocumentSelection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WorkflowDocumentSelectionFlowContract$Step.DocumentSelection documentSelection = (WorkflowDocumentSelectionFlowContract$Step.DocumentSelection) step14;
                    DocumentSelectionController documentSelectionController = new DocumentSelectionController(new DocumentSelectionControllerContract$InputData(workflowDocumentSelectionFlowContract$InputData.f96404b, documentSelection.f96408a, documentSelection.f96409b, workflowDocumentSelectionFlowContract$InputData.f96403a, workflowDocumentSelectionFlowContract$InputData.e, documentSelection.f96410c, documentSelection.d, workflowDocumentSelectionFlowContract$InputData.f96405c));
                    hs4.l block26 = new hs4.l(bVar8, 17);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    documentSelectionController.H = block26;
                    return documentSelectionController;
                }
                int i92 = com.revolut.feature.workflow.engine.R$string.workflow_document_selection_nationality_confirmation_title;
                String str18 = ((WorkflowDocumentSelectionFlowContract$Step.SingleCitizenshipPrompt) step14).f96411a.f297794a;
                Locale locale = Locale.ROOT;
                String lowerCase = str18.toLowerCase(locale);
                String strP = t61.a.p(lowerCase, "toLowerCase(...)", "country_name_with_article.", lowerCase);
                Locale localeA = ((s80.b) bVar8.f96418r).a();
                String displayCountry = new Locale(localeA.getLanguage(), str18).getDisplayCountry(localeA);
                Intrinsics.h(displayCountry);
                if (kotlin.text.d0.W(displayCountry)) {
                    displayCountry = null;
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i92, zhm.u.c(new TextLocalisedClause(strP, (List) null, (Clause) new TextClause(displayCountry == null ? str18 : displayCountry, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22)), null, 12);
                String str19 = workflowDocumentSelectionFlowContract$InputData.f96404b.f96393b.d;
                TextClause textClause2 = str19 != null ? new TextClause(str19, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String lowerCase2 = str18.toLowerCase(locale);
                PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(new CdnImage(t61.a.p(lowerCase2, "toLowerCase(...)", "flag_", lowerCase2), "mobile/flags", null, null, null, null, Constants.TAG_FC_SPEED_MODE), null);
                id idVar = id.HORIZONTAL;
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("SINGLE_CITIZENSHIP_PROMPT_ID", textLocalisedClause3, textClause2, mediaContent, null, null, workflowDocumentSelectionFlowContract$InputData.d ? new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_single_citizenship_prompt_decline_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_single_citizenship_prompt_confirm_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), idVar, null, null, null, null, null, null, null, null, null, 2093488), workflowDocumentSelectionFlowContract$InputData.e, false, false, null, 28));
                hth.f block27 = new hth.f(LazyFlowCoordinator6, bVar8, step14);
                Intrinsics.checkNotNullParameter(block27, "block");
                promptMarketingScreen.H = block27;
                return promptMarketingScreen;
            case 21:
                hu7.a params = (hu7.a) obj2;
                j1 coverage = (j1) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(coverage, "coverage");
                ((hu7.b) obj4).f155569a.f(params.f155568b, coverage);
                return Unit.f186387a;
            case 22:
                hu7.k params2 = (hu7.k) obj2;
                g4 coverage2 = (g4) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(coverage2, "coverage");
                ((hu7.l) obj4).f155588a.f(params2.f155587c, coverage2);
                return Unit.f186387a;
            case 23:
                hu7.n params3 = (hu7.n) obj2;
                o0 policy = (o0) obj3;
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullParameter(policy, "policy");
                ((hu7.o) obj4).f155593a.f(params3.f155592b, policy);
                return Unit.f186387a;
            case 24:
                return b(obj2, obj3);
            case 25:
                com.revolut.feature.staking.impl.confirmation.a aVar12 = (com.revolut.feature.staking.impl.confirmation.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StakingConfirmationControllerContract$ModalStep step15 = (StakingConfirmationControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof StakingConfirmationControllerContract$ModalStep.UnstakingPeriodDisclaimerDialog) {
                    return aVar12.e1(new nc5.h(((StakingConfirmationControllerContract$ModalStep.UnstakingPeriodDisclaimerDialog) step15).f88109a));
                }
                throw new NoWhenBranchMatchedException();
            case 26:
                return c(obj2, obj3);
            case 27:
                com.revolut.feature.card.verification.impl.flow.card_verification.a aVar13 = (com.revolut.feature.card.verification.impl.flow.card_verification.a) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                CardVerificationFlowContract$Step step16 = (CardVerificationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof CardVerificationFlowContract$Step.TransactionCode)) {
                    if (step16 instanceof CardVerificationFlowContract$Step.Info) {
                        return new TransactionCodeInfoScreen(new ov2.d(((CardVerificationFlowContract$Step.Info) step16).f64410a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CardVerificationFlowContract$InputData cardVerificationFlowContract$InputData = aVar13.o;
                TransactionCodeScreen transactionCodeScreen = new TransactionCodeScreen(new mv2.d(cardVerificationFlowContract$InputData.f64408a, cardVerificationFlowContract$InputData.f64409b));
                hul.v block28 = new hul.v(aVar13, FlowCoordinator3, i2);
                Intrinsics.checkNotNullParameter(block28, "block");
                transactionCodeScreen.H = block28;
                return transactionCodeScreen;
            case 28:
                TopUpMethodsRequest topUpMethodsRequest = (TopUpMethodsRequest) obj2;
                com.revolut.domain.models.topup.methods.b domain = (com.revolut.domain.models.topup.methods.b) obj3;
                Intrinsics.checkNotNullParameter(topUpMethodsRequest, "topUpMethodsRequest");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((hve.o) obj4).f155848a.f(hx7.b.q(topUpMethodsRequest.f90581a), domain);
                return Unit.f186387a;
            default:
                com.revolut.feature.credit.card.impl.ui.statement_financing.flow.a aVar14 = (com.revolut.feature.credit.card.impl.ui.statement_financing.flow.a) obj4;
                CreditCardStatementFinancingFlowContract$InputData creditCardStatementFinancingFlowContract$InputData = aVar14.o;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                CreditCardStatementFinancingFlowContract$Step step17 = (CreditCardStatementFinancingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof CreditCardStatementFinancingFlowContract$Step.Setup) {
                    CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen = new CreditCardStatementFinancingSetupScreen(new CreditCardStatementFinancingSetupScreenContract$InputData(creditCardStatementFinancingFlowContract$InputData.f69764a));
                    hul.v block29 = new hul.v(aVar14, FlowCoordinator4, i5);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    creditCardStatementFinancingSetupScreen.H = block29;
                    return creditCardStatementFinancingSetupScreen;
                }
                if (!(step17 instanceof CreditCardStatementFinancingFlowContract$Step.Confirm)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen = new CreditCardStatementFinancingConfirmationScreen(new CreditCardStatementFinancingConfirmationScreenContract$InputData(creditCardStatementFinancingFlowContract$InputData.f69764a, ((CreditCardStatementFinancingFlowContract$Step.Confirm) step17).f69765a));
                hs4.l block30 = new hs4.l(aVar14, i3);
                Intrinsics.checkNotNullParameter(block30, "block");
                creditCardStatementFinancingConfirmationScreen.H = block30;
                return creditCardStatementFinancingConfirmationScreen;
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f151788a = i;
        this.f151789b = obj2;
    }
}
