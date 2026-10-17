package qm2;

import aii.r;
import android.os.Parcelable;
import aw0.f;
import aw0.g;
import aw0.n6;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressValidationMode;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.backgroundpicker.api.model.BackgroundPickerFlowInput;
import com.revolut.feature.backgroundpicker.impl.flow.BackgroundPickerFlowContract$Step;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.FreelancerCreateTaxPocketFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.FreelancerTaxReservationScreen;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.FreelancerTaxReservationScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.TaxHubPaymentTypePickerScreenContract$ModalStep;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.impl.web_id.web_id_portal.WebIdPortalScreenContract$ModalStep;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreen;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step;
import com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$TransferInput;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.profile.impl.ui.details.address.flow.ProfileAddressFlowContract$Step;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationDescriptor;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreenContract$ModalStep;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroup;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlow;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$PagerItem;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.RevPointsGiftcardsFlowContract$Step;
import com.revolut.feature.rev_points.giftcards.impl.ui.model.GiftCardPreview;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.RevPointsGiftcardsDownloadScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.search.RevPointsGiftcardsSearchScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreenContract$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.usedexpiredcards.RevPointsGiftcardsUsedExpiredCardsScreen;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreenContract$ModalStep;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlow;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingResponse;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$ModalStep;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$ModalStep;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreen;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreenContract$ModalStep;
import com.revolut.feature.structured_note.details.impl.ui.common.PayoutScenarioMapper$CalculatorParcel;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreenContract$ModalStep;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.DirectTinFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.DirectTinFlowContract$Step;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlow;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$State;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreen;
import com.revolut.feature.topup_screen.impl.flows.topup.limits.TopUpLimitsBottomSheetController;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlow;
import com.revolut.feature.topup_screen.impl.google_pay.flow.GooglePayFlow;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$State;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$Step;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlow;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreen;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.refund.TransferReasonsIsRefundScreen;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreen;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreen;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersControllerContract$ModalStep;
import com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.ScreenerFilterOptionsPickerScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.ScreenerFilterOptionsPickerScreenContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersControllerContract$InputData;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig;
import com.revolut.retail.feature.airportlounges.impl.R$plurals;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.AirportLoungesDisclaimerAcceptanceContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.AirportLoungesDisclaimerAcceptanceScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.gifted_breakdown.AirportLoungesPassListGiftedBreakdownScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.AirportLoungesPassRefundScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.a;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.AirportLoungePassDetailsRefundScreen;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferReviewDescriptor;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BeneficiaryDetailsInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreenContract$ModalStep;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.beneficiary_details.BeneficiaryDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.InsightsFlowContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.InsightsFlowContract$Step;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.analyst_ratings.AnalystRatingsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.FundamentalsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommendation_history_screen.RecommendationHistoryScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommendation_history_screen.RecommendationHistoryScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import com.revolut.sso.impl.ui.revolut_id.documents.DocumentsFlowContract$Step;
import com.revolut.sso.impl.ui.revolut_id.documents.document_photo.DocumentPhotoScreen;
import com.revolut.sso.impl.ui.revolut_id.documents.document_photo.DocumentPhotoScreenContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import d67.s;
import d67.t;
import d67.u;
import grl.k9;
import hx7.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlin.text.a0;
import oxi.d;
import pak.h;
import q97.p1;
import qwd.o;
import r40.x0;
import r4k.w;
import rm2.i;
import rm2.p;
import sph.m;
import svi.k;
import tpl.k;
import vkm.j2;
import we6.b0;
import we6.x;
import we6.z;
import yki.l;
import yte.n;
import ywb.e;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f247766b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f247765a = i;
        this.f247766b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar = (com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) this.f247766b;
        eyi.b bVar = eVar.f99019w;
        final yki.b LazyFlowCoordinator = (yki.b) obj2;
        final AirportLoungePassDetailsFlowContract$Step step = (AirportLoungePassDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.PassList) {
            AirportLoungePassDetailsFlowContract$Step.PassList passList = (AirportLoungePassDetailsFlowContract$Step.PassList) step;
            AirportLoungesPassListScreen airportLoungesPassListScreen = new AirportLoungesPassListScreen(new AirportLoungesPassListContract$InputData(passList.f98999a, passList.f99000b));
            qpb.a block = new qpb.a(eVar, LazyFlowCoordinator, 22);
            Intrinsics.checkNotNullParameter(block, "block");
            airportLoungesPassListScreen.H = block;
            return airportLoungesPassListScreen;
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.PassDetails) {
            Pair pair = ((AirportLoungePassDetailsFlowContract$Step.PassDetails) step).f98998a;
            AirportLoungePassDetailsScreen airportLoungePassDetailsScreen = new AirportLoungePassDetailsScreen(new AirportLoungePassDetailsScreenContract$InputData(pair != null ? new AirportLoungePassDetailsScreenContract$InputData.PreloadedScreenData((k) pair.f186385a, (fyi.e) pair.f186386b) : null));
            qwi.d block2 = new qwi.d(eVar, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            airportLoungePassDetailsScreen.H = block2;
            return airportLoungePassDetailsScreen;
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.GiftedPassesBreakdown) {
            return new AirportLoungesPassListGiftedBreakdownScreen(((AirportLoungePassDetailsFlowContract$Step.GiftedPassesBreakdown) step).f98997a);
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.DisclaimerAcceptance) {
            AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen = new AirportLoungesDisclaimerAcceptanceScreen(new AirportLoungesDisclaimerAcceptanceContract$InputData(((AirportLoungePassDetailsFlowContract$Step.DisclaimerAcceptance) step).f98990a));
            o block3 = new o(15);
            Intrinsics.checkNotNullParameter(block3, "block");
            airportLoungesDisclaimerAcceptanceScreen.H = block3;
            return airportLoungesDisclaimerAcceptanceScreen;
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.UnlimitedPassWelcome.Ultra) {
            AirportLoungePassDetailsFlowContract$Step.UnlimitedPassWelcome.Ultra ultra = (AirportLoungePassDetailsFlowContract$Step.UnlimitedPassWelcome.Ultra) step;
            PricingPlanSubscription subscription = ultra.f99008a;
            int i = ultra.f99009b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            return eVar.M2(bVar.b(subscription, i, R$string.airport_lounges_ultra_user_prompt_title, R$string.airport_lounges_ultra_user_prompt_subtitle, R$string.airport_lounges_ultra_user_prompt_disclaimer_within_cancellation, R$string.airport_lounges_ultra_user_prompt_disclaimer_text, R$string.airport_lounges_ultra_user_prompt_terms_and_conditions, R$string.airport_lounges_ultra_user_prompt_view_pass));
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.UnlimitedPassWelcome.Private) {
            AirportLoungePassDetailsFlowContract$Step.UnlimitedPassWelcome.Private r152 = (AirportLoungePassDetailsFlowContract$Step.UnlimitedPassWelcome.Private) step;
            PricingPlanSubscription subscription2 = r152.f99006a;
            int i2 = r152.f99007b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(subscription2, "subscription");
            return eVar.M2(bVar.b(subscription2, i2, R$string.airport_lounges_private_user_prompt_title, R$string.airport_lounges_private_user_prompt_subtitle, R$string.airport_lounges_private_user_prompt_disclaimer_within_cancellation, R$string.airport_lounges_private_user_prompt_disclaimer_text, R$string.airport_lounges_private_user_prompt_terms_and_conditions, R$string.airport_lounges_private_user_prompt_view_pass));
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.RecurringPassWelcome) {
            AirportLoungePassDetailsFlowContract$Step.RecurringPassWelcome recurringPassWelcome = (AirportLoungePassDetailsFlowContract$Step.RecurringPassWelcome) step;
            PricingPlanSubscription subscription3 = recurringPassWelcome.f99001a;
            int i3 = recurringPassWelcome.f99002b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(subscription3, "subscription");
            return eVar.M2(eyi.b.c(new TextLocalisedQuantityClause(R$plurals.airport_lounges_recurrent_prompt_subtitle, Integer.valueOf(i3), v.k(Integer.valueOf(i3), fgk.b.a(bVar.f130864b, subscription3.f81129a)), (Style) null, 24), new TextLocalisedClause(R$string.airport_lounges_recurrent_prompt_title, null, null, 14), bVar.a(subscription3, R$string.airport_lounges_recurrent_prompt_terms_template, R$string.airport_lounges_ultra_user_prompt_disclaimer_text, R$string.airport_lounges_recurrent_prompt_terms_handle, 7L), new TextLocalisedClause(R$string.airport_lounges_recurrent_prompt_cta, null, null, 14)));
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.Checkout) {
            mwi.a aVar = eVar.f99017s;
            b2 goToPassDetails = new b2(2, eVar, com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.class, "goToPassDetailsStep", "goToPassDetailsStep(Lkotlin/Pair;Z)V", 0, 28);
            boolean z = ((AirportLoungePassDetailsFlowContract$Step.Checkout) step).f98989a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(goToPassDetails, "goToPassDetails");
            AirportLoungeCheckoutFlow airportLoungeCheckoutFlow = new AirportLoungeCheckoutFlow(new AirportLoungeCheckoutFlowContract$InputData(1, z));
            mqi.a block4 = new mqi.a(goToPassDetails, 17);
            Intrinsics.checkNotNullParameter(block4, "block");
            airportLoungeCheckoutFlow.H = block4;
            return airportLoungeCheckoutFlow;
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.Refund) {
            if (!((AirportLoungePassDetailsFlowContract$State) ((j2) eVar.z.f22677a).getValue()).f98986a) {
                AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen = new AirportLoungePassDetailsRefundScreen();
                dph.c block5 = new dph.c(eVar, LazyFlowCoordinator, 22);
                Intrinsics.checkNotNullParameter(block5, "block");
                airportLoungePassDetailsRefundScreen.H = block5;
                return airportLoungePassDetailsRefundScreen;
            }
            AirportLoungePassDetailsFlowContract$Step.Refund refund = (AirportLoungePassDetailsFlowContract$Step.Refund) step;
            String str = refund.f99003a;
            if (str == null) {
                throw new IllegalArgumentException("passId is required for Collinson refund");
            }
            AirportLoungesPassRefundScreen airportLoungesPassRefundScreen = new AirportLoungesPassRefundScreen(new oyi.c(str, refund.f99005c, refund.d, refund.f99004b));
            final int i5 = 0;
            Function1 block6 = new Function1() { // from class: qwi.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i6 = i5;
                    AirportLoungePassDetailsFlowContract$Step airportLoungePassDetailsFlowContract$Step = step;
                    switch (i6) {
                        case 0:
                            com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.a it8 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.a) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (it8 instanceof a.C0608a) {
                                eVar.C1(new AirportLoungesFeatureConfig.FindLoungesDestination(false));
                            } else {
                                boolean z3 = it8 instanceof a.b;
                                yki.b bVar2 = LazyFlowCoordinator;
                                if (z3) {
                                    oki.h.D2(bVar2);
                                } else {
                                    if (!(it8 instanceof oyi.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str2 = ((AirportLoungePassDetailsFlowContract$Step.Refund) airportLoungePassDetailsFlowContract$Step).f99003a;
                                    if (str2 == null) {
                                        throw new IllegalArgumentException("passId is required for Collinson refund");
                                    }
                                    oyi.d dVar = (oyi.d) it8;
                                    oki.h.w2(bVar2, new AirportLoungePassDetailsFlowContract$Step.EditPassenger(str2, dVar.f231044a, dVar.f231045b), ModalDestination.Style.POPUP.f98311a);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            oxi.d output = (oxi.d) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z4 = output instanceof d.a;
                            com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar2 = eVar;
                            if (z4) {
                                eVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.accessing-airport-lounges", 2))));
                            } else if (output instanceof d.b) {
                                oki.h.t2(eVar2, LazyFlowCoordinator, new AirportLoungePassDetailsFlowContract$Step.Refund(0), false, null, false, 14);
                                Unit unit = Unit.f186387a;
                            } else {
                                if (!(output instanceof d.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar2.l2(new com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.a(eVar2, airportLoungePassDetailsFlowContract$Step, null), new yi5.b(26));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block6, "block");
            airportLoungesPassRefundScreen.H = block6;
            return airportLoungesPassRefundScreen;
        }
        if (step instanceof AirportLoungePassDetailsFlowContract$Step.GetHelp) {
            AirportLoungePassDetailsFlowContract$Step.GetHelp getHelp = (AirportLoungePassDetailsFlowContract$Step.GetHelp) step;
            AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen = new AirportLoungesHomeHelpScreen(new AirportLoungesHomeHelpScreenContract$InputData(getHelp.f98994a, getHelp.f98996c));
            final int i6 = 1;
            Function1 block7 = new Function1() { // from class: qwi.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i66 = i6;
                    AirportLoungePassDetailsFlowContract$Step airportLoungePassDetailsFlowContract$Step = step;
                    switch (i66) {
                        case 0:
                            com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.a it8 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.a) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (it8 instanceof a.C0608a) {
                                eVar.C1(new AirportLoungesFeatureConfig.FindLoungesDestination(false));
                            } else {
                                boolean z3 = it8 instanceof a.b;
                                yki.b bVar2 = LazyFlowCoordinator;
                                if (z3) {
                                    oki.h.D2(bVar2);
                                } else {
                                    if (!(it8 instanceof oyi.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str2 = ((AirportLoungePassDetailsFlowContract$Step.Refund) airportLoungePassDetailsFlowContract$Step).f99003a;
                                    if (str2 == null) {
                                        throw new IllegalArgumentException("passId is required for Collinson refund");
                                    }
                                    oyi.d dVar = (oyi.d) it8;
                                    oki.h.w2(bVar2, new AirportLoungePassDetailsFlowContract$Step.EditPassenger(str2, dVar.f231044a, dVar.f231045b), ModalDestination.Style.POPUP.f98311a);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            oxi.d output = (oxi.d) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z4 = output instanceof d.a;
                            com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar2 = eVar;
                            if (z4) {
                                eVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.accessing-airport-lounges", 2))));
                            } else if (output instanceof d.b) {
                                oki.h.t2(eVar2, LazyFlowCoordinator, new AirportLoungePassDetailsFlowContract$Step.Refund(0), false, null, false, 14);
                                Unit unit = Unit.f186387a;
                            } else {
                                if (!(output instanceof d.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar2.l2(new com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.a(eVar2, airportLoungePassDetailsFlowContract$Step, null), new yi5.b(26));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block7, "block");
            airportLoungesHomeHelpScreen.H = block7;
            return airportLoungesHomeHelpScreen;
        }
        if (!(step instanceof AirportLoungePassDetailsFlowContract$Step.EditPassenger)) {
            throw new NoWhenBranchMatchedException();
        }
        AirportLoungePassDetailsFlowContract$Step.EditPassenger editPassenger = (AirportLoungePassDetailsFlowContract$Step.EditPassenger) step;
        AirportLoungePassPassengersScreen airportLoungePassPassengersScreen = new AirportLoungePassPassengersScreen(new AirportLoungePassPassengersContract$InputData(editPassenger.f98991a, editPassenger.f98992b, editPassenger.f98993c));
        qwi.d block8 = new qwi.d(eVar, 2);
        Intrinsics.checkNotNullParameter(block8, "block");
        airportLoungePassPassengersScreen.H = block8;
        return airportLoungePassPassengersScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a aVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a) this.f247766b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TaxHubPaymentTypePickerScreenContract$ModalStep step = (TaxHubPaymentTypePickerScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, TaxHubPaymentTypePickerScreenContract$ModalStep.CannotFindTaxType.f74332a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.o.getClass();
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_type_selector_prompt_cant_find_tax_type_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_type_selector_prompt_cant_find_tax_type_description, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_type_selector_prompt_cant_find_tax_type_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Freelancer;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    private final Object c(Object obj2, Object obj3) {
        x0 x0Var = (x0) this.f247766b;
        List nextResolvedChats = (List) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(nextResolvedChats, "nextResolvedChats");
        x0Var.D2(nextResolvedChats);
        return Unit.f186387a;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a aVar = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) this.f247766b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        BankTransferReviewScreenContract$ModalStep step = (BankTransferReviewScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BankTransferReviewScreenContract$ModalStep.BeneficiaryDetails) {
            BankTransferReviewScreenContract$ModalStep.BeneficiaryDetails beneficiaryDetails = (BankTransferReviewScreenContract$ModalStep.BeneficiaryDetails) step;
            return new BeneficiaryDetailsController(new BeneficiaryDetailsInputData(beneficiaryDetails.f102125a, aVar.o.f102122a, beneficiaryDetails.f102126b));
        }
        if (!(step instanceof BankTransferReviewScreenContract$ModalStep.RemoveScannedBill)) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_review_pay_with_photo_remove_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_review_pay_with_photo_remove_dialog_description, null, null, 14), null, null, false, 28);
        g gVar = new g(new n6(new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_review_pay_with_photo_remove_dialog_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_review_pay_with_photo_remove_dialog_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (f) null, 25);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        w block = new w(aVar, 2);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object e(Object obj2, Object obj3) {
        r5c.b bVar = (r5c.b) this.f247766b;
        k5c.a eligibility = (k5c.a) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        bVar.f251578a.f("CRYPTO_EXCHANGE_ELIGIBILITY_KEY", eligibility);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v147, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v210, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController viewControllerE1;
        AccountFieldType accountFieldType;
        ViewController transferReasonsAdditionalInfoScreen;
        ViewController transferReasonsSearchScreen;
        RevPointsGiftcardsHomePagerFlowContract$PagerItem discover;
        ViewController topUpLimitsBottomSheetController;
        int i = this.f247765a;
        int i2 = 12;
        final int i3 = 2;
        final int i5 = 1;
        Object obj4 = this.f247766b;
        switch (i) {
            case 0:
                com.revolut.feature.backgroundpicker.impl.flow.a aVar = (com.revolut.feature.backgroundpicker.impl.flow.a) obj4;
                BackgroundPickerFlowInput backgroundPickerFlowInput = aVar.o;
                l FlowCoordinator = (l) obj2;
                BackgroundPickerFlowContract$Step step = (BackgroundPickerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof BackgroundPickerFlowContract$Step.BackgroundPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                BackgroundKey backgroundKey = backgroundPickerFlowInput.f63739a;
                BackgroundCatalogController backgroundCatalogController = new BackgroundCatalogController(new i(backgroundKey != null ? new rm2.o(backgroundKey) : p.f255196a, backgroundPickerFlowInput.f63740b, backgroundPickerFlowInput.f63739a != null));
                qce.a block = new qce.a(aVar, FlowCoordinator, 21);
                Intrinsics.checkNotNullParameter(block, "block");
                backgroundCatalogController.H = block;
                return backgroundCatalogController;
            case 1:
                com.revolut.feature.profile.impl.ui.details.address.flow.c cVar = (com.revolut.feature.profile.impl.ui.details.address.flow.c) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                ProfileAddressFlowContract$Step step2 = (ProfileAddressFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof ProfileAddressFlowContract$Step.AddressStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProfileAddressFlowContract$Step.AddressStep addressStep = (ProfileAddressFlowContract$Step.AddressStep) step2;
                Address address = addressStep.f81368a;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.profile_personal_details_address_header, null, null, 14);
                boolean z = cVar.o.f81345a;
                FieldMode editable = addressStep.f81369b ? new FieldMode.Editable(true) : FieldMode.NotEditable.f60955a;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.button_action_done, null, null, 14);
                qh1.b bVar = qh1.b.BACK;
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var = k9.Profile;
                companion.getClass();
                AddressFlowContract$InputData addressFlowContract$InputData = new AddressFlowContract$InputData(address, textLocalisedClause, null, false, textLocalisedClause2, editable, bVar, AnalyticsProduct.Companion.b(k9Var), z, AddressValidationMode.Validation.f60951a, 882492);
                Object obj5 = cVar.f81375s.f185743a.get();
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                ViewController viewControllerE12 = cVar.e1(new th1.a(addressFlowContract$InputData, null, (x7a.d) obj5, 2));
                qce.a block2 = new qce.a(cVar, addressStep, 23);
                Intrinsics.checkNotNullParameter(block2, "block");
                viewControllerE12.H = block2;
                return viewControllerE12;
            case 2:
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = PayInStoreScreen.f79044d0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj6 = model.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreenContract.AmountParcel");
                qn9.e eVar = (qn9.e) obj6;
                return new zp0.d(field.getEditText(), eVar.f247878b, new u80.d(eVar.f247877a), null, new h((PayInStoreScreen) obj4, 7), false, false, 0, false, null, 1960);
            case 3:
                final com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar2 = (com.revolut.feature.payments.air.widget.impl.ui.flow.a) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                AirPaymentTransferFlowContract$Step step3 = (AirPaymentTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof AirPaymentTransferFlowContract$Step.CreateRecipient)) {
                    if (!(step3 instanceof AirPaymentTransferFlowContract$Step.Transfer)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AirPaymentTransferFlowContract$TransferInput airPaymentTransferFlowContract$TransferInput = ((AirPaymentTransferFlowContract$Step.Transfer) step3).f79128a;
                    if (airPaymentTransferFlowContract$TransferInput instanceof AirPaymentTransferFlowContract$TransferInput.PeerToPeer) {
                        ViewController viewControllerE13 = aVar2.e1(new s8k.e(((AirPaymentTransferFlowContract$TransferInput.PeerToPeer) airPaymentTransferFlowContract$TransferInput).f79131a));
                        final int i6 = 0;
                        Function1 block3 = new Function1() { // from class: qo9.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i6) {
                                    case 0:
                                        s8k.j output = (s8k.j) obj7;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        boolean z3 = output instanceof s8k.g;
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar3 = aVar2;
                                        if (z3) {
                                            aVar3.J2(com.revolut.domain.models.transfers.a.a(((s8k.g) output).f261065b));
                                        } else if (output instanceof s8k.h) {
                                            aVar3.J2(((s8k.h) output).f261066a.f272581b);
                                        } else {
                                            if (!(output instanceof s8k.f) && !(output instanceof s8k.i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.D2(aVar3.f79136t);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        d2k.f output2 = (d2k.f) obj7;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        boolean z4 = output2 instanceof d2k.d;
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar4 = aVar2;
                                        if (z4) {
                                            aVar4.J2(((d2k.d) output2).f110874a);
                                        } else if (output2 instanceof d2k.e) {
                                            aVar4.J2(((d2k.e) output2).f110877a.f272581b);
                                        } else {
                                            if (!Intrinsics.f(output2, d2k.b.f110872a) && !Intrinsics.f(output2, d2k.c.f110873a) && !(output2 instanceof d2k.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.D2(aVar4.f79136t);
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        cqa.e output3 = (cqa.e) obj7;
                                        Intrinsics.checkNotNullParameter(output3, "output");
                                        boolean z6 = output3 instanceof cqa.c;
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar5 = aVar2;
                                        if (z6) {
                                            aVar5.J2(((cqa.c) output3).f108062a);
                                        } else if (output3 instanceof cqa.d) {
                                            aVar5.J2(((cqa.d) output3).f108063a.f272581b);
                                        } else {
                                            if (!Intrinsics.f(output3, cqa.b.f108061a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.D2(aVar5.f79136t);
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        dqa.b output4 = (dqa.b) obj7;
                                        Intrinsics.checkNotNullParameter(output4, "output");
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar6 = aVar2;
                                        aVar6.l2(new j(aVar6, output4, null), new h(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar6, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                        return Unit.f186387a;
                                    default:
                                        x2j.b output5 = (x2j.b) obj7;
                                        Intrinsics.checkNotNullParameter(output5, "output");
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar7 = aVar2;
                                        aVar7.l2(new g(aVar7, output5, null), new e(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar7, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block3, "block");
                        viewControllerE13.H = block3;
                        return viewControllerE13;
                    }
                    if (!(airPaymentTransferFlowContract$TransferInput instanceof AirPaymentTransferFlowContract$TransferInput.BankTransfer)) {
                        if (!(airPaymentTransferFlowContract$TransferInput instanceof AirPaymentTransferFlowContract$TransferInput.CardTransfer)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ViewController viewControllerE14 = aVar2.e1(new cqa.a(((AirPaymentTransferFlowContract$TransferInput.CardTransfer) airPaymentTransferFlowContract$TransferInput).f79130a));
                        Function1 block4 = new Function1() { // from class: qo9.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i3) {
                                    case 0:
                                        s8k.j output = (s8k.j) obj7;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        boolean z3 = output instanceof s8k.g;
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar3 = aVar2;
                                        if (z3) {
                                            aVar3.J2(com.revolut.domain.models.transfers.a.a(((s8k.g) output).f261065b));
                                        } else if (output instanceof s8k.h) {
                                            aVar3.J2(((s8k.h) output).f261066a.f272581b);
                                        } else {
                                            if (!(output instanceof s8k.f) && !(output instanceof s8k.i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.D2(aVar3.f79136t);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        d2k.f output2 = (d2k.f) obj7;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        boolean z4 = output2 instanceof d2k.d;
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar4 = aVar2;
                                        if (z4) {
                                            aVar4.J2(((d2k.d) output2).f110874a);
                                        } else if (output2 instanceof d2k.e) {
                                            aVar4.J2(((d2k.e) output2).f110877a.f272581b);
                                        } else {
                                            if (!Intrinsics.f(output2, d2k.b.f110872a) && !Intrinsics.f(output2, d2k.c.f110873a) && !(output2 instanceof d2k.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.D2(aVar4.f79136t);
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        cqa.e output3 = (cqa.e) obj7;
                                        Intrinsics.checkNotNullParameter(output3, "output");
                                        boolean z6 = output3 instanceof cqa.c;
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar5 = aVar2;
                                        if (z6) {
                                            aVar5.J2(((cqa.c) output3).f108062a);
                                        } else if (output3 instanceof cqa.d) {
                                            aVar5.J2(((cqa.d) output3).f108063a.f272581b);
                                        } else {
                                            if (!Intrinsics.f(output3, cqa.b.f108061a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.D2(aVar5.f79136t);
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        dqa.b output4 = (dqa.b) obj7;
                                        Intrinsics.checkNotNullParameter(output4, "output");
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar6 = aVar2;
                                        aVar6.l2(new j(aVar6, output4, null), new h(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar6, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                        return Unit.f186387a;
                                    default:
                                        x2j.b output5 = (x2j.b) obj7;
                                        Intrinsics.checkNotNullParameter(output5, "output");
                                        com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar7 = aVar2;
                                        aVar7.l2(new g(aVar7, output5, null), new e(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar7, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block4, "block");
                        viewControllerE14.H = block4;
                        return viewControllerE14;
                    }
                    BankTransferFlowInputData bankTransferFlowInputData = ((AirPaymentTransferFlowContract$TransferInput.BankTransfer) airPaymentTransferFlowContract$TransferInput).f79129a;
                    if (bankTransferFlowInputData instanceof BankTransferFlowInputData.NewTransfer) {
                        viewControllerE1 = aVar2.e1(new com.revolut.retail.feature.payments.bank_transfer.api.navigation.a((BankTransferFlowInputData.NewTransfer) bankTransferFlowInputData, null));
                    } else {
                        if (!(bankTransferFlowInputData instanceof BankTransferFlowInputData.ReviewOnly)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewControllerE1 = aVar2.e1(new BankTransferReviewDescriptor((BankTransferFlowInputData.ReviewOnly) bankTransferFlowInputData));
                    }
                    Function1 block5 = new Function1() { // from class: qo9.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i5) {
                                case 0:
                                    s8k.j output = (s8k.j) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z3 = output instanceof s8k.g;
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar3 = aVar2;
                                    if (z3) {
                                        aVar3.J2(com.revolut.domain.models.transfers.a.a(((s8k.g) output).f261065b));
                                    } else if (output instanceof s8k.h) {
                                        aVar3.J2(((s8k.h) output).f261066a.f272581b);
                                    } else {
                                        if (!(output instanceof s8k.f) && !(output instanceof s8k.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar3.f79136t);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    d2k.f output2 = (d2k.f) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof d2k.d;
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar4 = aVar2;
                                    if (z4) {
                                        aVar4.J2(((d2k.d) output2).f110874a);
                                    } else if (output2 instanceof d2k.e) {
                                        aVar4.J2(((d2k.e) output2).f110877a.f272581b);
                                    } else {
                                        if (!Intrinsics.f(output2, d2k.b.f110872a) && !Intrinsics.f(output2, d2k.c.f110873a) && !(output2 instanceof d2k.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar4.f79136t);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    cqa.e output3 = (cqa.e) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z6 = output3 instanceof cqa.c;
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar5 = aVar2;
                                    if (z6) {
                                        aVar5.J2(((cqa.c) output3).f108062a);
                                    } else if (output3 instanceof cqa.d) {
                                        aVar5.J2(((cqa.d) output3).f108063a.f272581b);
                                    } else {
                                        if (!Intrinsics.f(output3, cqa.b.f108061a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar5.f79136t);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    dqa.b output4 = (dqa.b) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar6 = aVar2;
                                    aVar6.l2(new j(aVar6, output4, null), new h(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar6, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                    return Unit.f186387a;
                                default:
                                    x2j.b output5 = (x2j.b) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar7 = aVar2;
                                    aVar7.l2(new g(aVar7, output5, null), new e(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar7, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                ResolvedRecipient.ToCreate toCreate = ((AirPaymentTransferFlowContract$Step.CreateRecipient) step3).f79127a;
                PaymentWidget widget = aVar2.o;
                qo9.a aVar3 = aVar2.f79135s;
                if (!(toCreate instanceof ResolvedRecipient.NewBeneficiary)) {
                    if (!(toCreate instanceof ResolvedRecipient.NewCard)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WidgetRecipient.NewCard recipient = ((ResolvedRecipient.NewCard) toCreate).f79111a;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    Intrinsics.checkNotNullParameter(recipient, "recipient");
                    Set setB = y0.b(new CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId(widget.f79072a));
                    String str = recipient.f79095c;
                    String str2 = recipient.f79093a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = recipient.f79094b;
                    ViewController viewControllerE15 = aVar2.e1(new CardOwnerCreationDescriptor(setB, new CardOwnerInfoState(false, str, str2, str3 == null ? "" : str3, fqa.a.MANUAL)));
                    final int i21 = 3;
                    Function1 block6 = new Function1() { // from class: qo9.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i21) {
                                case 0:
                                    s8k.j output = (s8k.j) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z3 = output instanceof s8k.g;
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar32 = aVar2;
                                    if (z3) {
                                        aVar32.J2(com.revolut.domain.models.transfers.a.a(((s8k.g) output).f261065b));
                                    } else if (output instanceof s8k.h) {
                                        aVar32.J2(((s8k.h) output).f261066a.f272581b);
                                    } else {
                                        if (!(output instanceof s8k.f) && !(output instanceof s8k.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar32.f79136t);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    d2k.f output2 = (d2k.f) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof d2k.d;
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar4 = aVar2;
                                    if (z4) {
                                        aVar4.J2(((d2k.d) output2).f110874a);
                                    } else if (output2 instanceof d2k.e) {
                                        aVar4.J2(((d2k.e) output2).f110877a.f272581b);
                                    } else {
                                        if (!Intrinsics.f(output2, d2k.b.f110872a) && !Intrinsics.f(output2, d2k.c.f110873a) && !(output2 instanceof d2k.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar4.f79136t);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    cqa.e output3 = (cqa.e) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z6 = output3 instanceof cqa.c;
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar5 = aVar2;
                                    if (z6) {
                                        aVar5.J2(((cqa.c) output3).f108062a);
                                    } else if (output3 instanceof cqa.d) {
                                        aVar5.J2(((cqa.d) output3).f108063a.f272581b);
                                    } else {
                                        if (!Intrinsics.f(output3, cqa.b.f108061a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar5.f79136t);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    dqa.b output4 = (dqa.b) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar6 = aVar2;
                                    aVar6.l2(new j(aVar6, output4, null), new h(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar6, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                    return Unit.f186387a;
                                default:
                                    x2j.b output5 = (x2j.b) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar7 = aVar2;
                                    aVar7.l2(new g(aVar7, output5, null), new e(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar7, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE15.H = block6;
                    return viewControllerE15;
                }
                WidgetRecipient.NewBeneficiary recipient2 = ((ResolvedRecipient.NewBeneficiary) toCreate).f79110a;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(widget, "widget");
                Intrinsics.checkNotNullParameter(recipient2, "recipient");
                List<WidgetRecipient.AccountField> list = recipient2.d;
                ArrayList arrayList = new ArrayList();
                for (WidgetRecipient.AccountField accountField : list) {
                    String str4 = accountField.f79081a;
                    AccountFieldType[] accountFieldTypeArrValues = AccountFieldType.values();
                    int length = accountFieldTypeArrValues.length;
                    int i22 = 0;
                    while (true) {
                        if (i22 < length) {
                            accountFieldType = accountFieldTypeArrValues[i22];
                            if (!a0.z(accountFieldType.name(), str4, true)) {
                                i22++;
                            }
                        } else {
                            accountFieldType = null;
                        }
                    }
                    Pair pair = accountFieldType != null ? new Pair(accountFieldType, accountField.f79082b) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                Map mapT = r0.t(arrayList);
                String str5 = recipient2.f79089a;
                String str6 = recipient2.f79090b;
                wi0.a aVar4 = wi0.b.Companion;
                String str7 = recipient2.f79091c;
                aVar4.getClass();
                ViewController viewControllerE16 = aVar2.e1(new com.revolut.retail.feature.beneficiary.api.navigation.a(new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(str5, str6, wi0.a.a(str7), widget.f79074c.f79079c.f115083b, mapT, null, null, 96)));
                final int i32 = 4;
                Function1 block7 = new Function1() { // from class: qo9.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i32) {
                            case 0:
                                s8k.j output = (s8k.j) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z3 = output instanceof s8k.g;
                                com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar32 = aVar2;
                                if (z3) {
                                    aVar32.J2(com.revolut.domain.models.transfers.a.a(((s8k.g) output).f261065b));
                                } else if (output instanceof s8k.h) {
                                    aVar32.J2(((s8k.h) output).f261066a.f272581b);
                                } else {
                                    if (!(output instanceof s8k.f) && !(output instanceof s8k.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(aVar32.f79136t);
                                }
                                return Unit.f186387a;
                            case 1:
                                d2k.f output2 = (d2k.f) obj7;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z4 = output2 instanceof d2k.d;
                                com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar42 = aVar2;
                                if (z4) {
                                    aVar42.J2(((d2k.d) output2).f110874a);
                                } else if (output2 instanceof d2k.e) {
                                    aVar42.J2(((d2k.e) output2).f110877a.f272581b);
                                } else {
                                    if (!Intrinsics.f(output2, d2k.b.f110872a) && !Intrinsics.f(output2, d2k.c.f110873a) && !(output2 instanceof d2k.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(aVar42.f79136t);
                                }
                                return Unit.f186387a;
                            case 2:
                                cqa.e output3 = (cqa.e) obj7;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                boolean z6 = output3 instanceof cqa.c;
                                com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar5 = aVar2;
                                if (z6) {
                                    aVar5.J2(((cqa.c) output3).f108062a);
                                } else if (output3 instanceof cqa.d) {
                                    aVar5.J2(((cqa.d) output3).f108063a.f272581b);
                                } else {
                                    if (!Intrinsics.f(output3, cqa.b.f108061a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(aVar5.f79136t);
                                }
                                return Unit.f186387a;
                            case 3:
                                dqa.b output4 = (dqa.b) obj7;
                                Intrinsics.checkNotNullParameter(output4, "output");
                                com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar6 = aVar2;
                                aVar6.l2(new j(aVar6, output4, null), new h(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar6, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                return Unit.f186387a;
                            default:
                                x2j.b output5 = (x2j.b) obj7;
                                Intrinsics.checkNotNullParameter(output5, "output");
                                com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar7 = aVar2;
                                aVar7.l2(new g(aVar7, output5, null), new e(1, 0, com.revolut.feature.payments.air.widget.impl.ui.flow.a.class, aVar7, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z"));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block7, "block");
                viewControllerE16.H = block7;
                return viewControllerE16;
            case 4:
                com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a aVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                GroupDetailsScreenContract$ModalStep step4 = (GroupDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof GroupDetailsScreenContract$ModalStep.TransactionDetailsPager)) {
                    throw new NoWhenBranchMatchedException();
                }
                GroupDetailsScreenContract$ModalStep.TransactionDetailsPager transactionDetailsPager = (GroupDetailsScreenContract$ModalStep.TransactionDetailsPager) step4;
                return aVar5.e1(new rhf.e(transactionDetailsPager.f87704a, transactionDetailsPager.f87705b, new TransactionContext(null, null, 3), "", rhf.d.ANALYTICS));
            case 5:
                final com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.a aVar6 = (com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.a) obj4;
                DirectTinFlowContract$InputData directTinFlowContract$InputData = aVar6.o;
                DirectTinFlowContract$Step step5 = (DirectTinFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof DirectTinFlowContract$Step.ResidencyQuestion)) {
                    if (!(step5 instanceof DirectTinFlowContract$Step.TaxResidencyDeclaration)) {
                        if (!(step5 instanceof DirectTinFlowContract$Step.WhatIsTaxResidency)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar6.f90246q.getClass();
                        return new ActionsBottomSheetController(lpe.e.a());
                    }
                    wi0.b bVar2 = directTinFlowContract$InputData.f90237a;
                    TaxResidencyDeclarationFlow taxResidencyDeclarationFlow = new TaxResidencyDeclarationFlow(new TaxResidencyDeclarationFlowContract$InputData(bVar2, directTinFlowContract$InputData.e, directTinFlowContract$InputData.f, new TaxResidencyDeclarationFlowContract$UseCase.Add(q.o(directTinFlowContract$InputData.f90240g, bVar2)), directTinFlowContract$InputData.f90241h, directTinFlowContract$InputData.f90239c, directTinFlowContract$InputData.d, ((DirectTinFlowContract$Step.TaxResidencyDeclaration) step5).f90243a, true));
                    Function1 block8 = new Function1() { // from class: qpe.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) throws Throwable {
                            r dVar;
                            switch (i5) {
                                case 0:
                                    u output = (u) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, s.f111464a);
                                    com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.a aVar7 = aVar6;
                                    if (zF) {
                                        oki.h.t2(aVar7, aVar7.f90247r, new DirectTinFlowContract$Step.TaxResidencyDeclaration(BackNavigationType.BACK), false, null, false, 14);
                                    } else if (Intrinsics.f(output, t.f111465a)) {
                                        aVar7.C2(c.f248374a);
                                    } else if (Intrinsics.f(output, d67.r.f111463a)) {
                                        oki.h.w2(aVar7.f90247r, DirectTinFlowContract$Step.WhatIsTaxResidency.f90244a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else if (Intrinsics.f(output, d67.q.f111462a)) {
                                        aVar7.B2();
                                    } else {
                                        if (!(output instanceof d67.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        hx7.e.n(new IllegalStateException("Unexpected Local Residency Question screen result " + output));
                                    }
                                    return Unit.f186387a;
                                default:
                                    ppe.f output2 = (ppe.f) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof ppe.c) {
                                        dVar = c.f248374a;
                                    } else if (output2 instanceof ppe.d) {
                                        dVar = new d(((ppe.d) output2).f238593a);
                                    } else {
                                        if (!Intrinsics.f(output2, ppe.e.f238594a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dVar = new d("Unexpected primary residency request for Direct TIN");
                                    }
                                    aVar6.C2(dVar);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    taxResidencyDeclarationFlow.H = block8;
                    return taxResidencyDeclarationFlow;
                }
                qpe.h hVar = aVar6.f90245p;
                wi0.b countryCode = directTinFlowContract$InputData.f90237a;
                BackNavigationType backNavigationType = directTinFlowContract$InputData.i;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
                CountryClause countryClause = new CountryClause(countryCode, null);
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_local_residency_savings_title, zhm.u.c(countryClause), null, 12), new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_local_residency_savings_description, zhm.u.c(countryClause), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D299", null, null, null, 30), null, null, czi.c.R(backNavigationType), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_local_residency_savings_cta_primary, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_local_residency_savings_cta_secondary, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), id.VERTICAL, null, null, null, new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_sole_residency_declaration_learn_more, null, null, 14), 56408));
                final int i33 = 0;
                Function1 block9 = new Function1() { // from class: qpe.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) throws Throwable {
                        r dVar;
                        switch (i33) {
                            case 0:
                                u output = (u) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean zF = Intrinsics.f(output, s.f111464a);
                                com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.a aVar7 = aVar6;
                                if (zF) {
                                    oki.h.t2(aVar7, aVar7.f90247r, new DirectTinFlowContract$Step.TaxResidencyDeclaration(BackNavigationType.BACK), false, null, false, 14);
                                } else if (Intrinsics.f(output, t.f111465a)) {
                                    aVar7.C2(c.f248374a);
                                } else if (Intrinsics.f(output, d67.r.f111463a)) {
                                    oki.h.w2(aVar7.f90247r, DirectTinFlowContract$Step.WhatIsTaxResidency.f90244a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                } else if (Intrinsics.f(output, d67.q.f111462a)) {
                                    aVar7.B2();
                                } else {
                                    if (!(output instanceof d67.p)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    hx7.e.n(new IllegalStateException("Unexpected Local Residency Question screen result " + output));
                                }
                                return Unit.f186387a;
                            default:
                                ppe.f output2 = (ppe.f) obj7;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (output2 instanceof ppe.c) {
                                    dVar = c.f248374a;
                                } else if (output2 instanceof ppe.d) {
                                    dVar = new d(((ppe.d) output2).f238593a);
                                } else {
                                    if (!Intrinsics.f(output2, ppe.e.f238594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar = new d("Unexpected primary residency request for Direct TIN");
                                }
                                aVar6.C2(dVar);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block9, "block");
                promptMarketingScreen.H = block9;
                return promptMarketingScreen;
            case 6:
                final com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar7 = (com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ScreenerEmbeddedFiltersControllerContract$ModalStep step6 = (ScreenerEmbeddedFiltersControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof ScreenerEmbeddedFiltersControllerContract$ModalStep.StatsGroup) {
                    ScreenerEmbeddedFiltersControllerContract$ModalStep.StatsGroup statsGroup = (ScreenerEmbeddedFiltersControllerContract$ModalStep.StatsGroup) step6;
                    ScreenerStatsFiltersController screenerStatsFiltersController = new ScreenerStatsFiltersController(new ScreenerStatsFiltersControllerContract$InputData(aVar7.o.f96208a, statsGroup.f96214a, statsGroup.f96215b));
                    final int i43 = 0;
                    Function1 block10 = new Function1() { // from class: qph.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i43) {
                                case 0:
                                    rqh.i output = (rqh.i) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar8 = aVar7;
                                    vph.o oVar = aVar8.f96218q;
                                    y yVar = aVar8.A;
                                    List currentFilters = ((m) ((j2) yVar.f22677a).getValue()).f248409c;
                                    List updatedFilters = output.f256544a;
                                    oVar.getClass();
                                    Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
                                    Intrinsics.checkNotNullParameter(updatedFilters, "updatedFilters");
                                    Iterator it8 = updatedFilters.iterator();
                                    while (it8.hasNext()) {
                                        currentFilters = vph.o.c(currentFilters, (ScreenerSelectedFilter) it8.next());
                                    }
                                    aVar8.H2(yVar, new q2j.j(currentFilters, 14));
                                    return Unit.f186387a;
                                case 1:
                                    dii.g it9 = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof dii.c) {
                                        Object obj8 = ((dii.c) it9).f115066a.d;
                                        if (obj8 instanceof woh.a) {
                                            aVar7.C1(u0.c(new WebViewFeatureConfig(((woh.a) obj8).f298936a, null, 0, false, true, false, 130974)));
                                        }
                                    } else if (!(it9 instanceof dii.b) && !(it9 instanceof dii.d) && !Intrinsics.f(it9, dii.e.f115068a) && !Intrinsics.f(it9, dii.f.f115069a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    iqh.l output2 = (iqh.l) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (!Intrinsics.f(output2, iqh.j.f167861a)) {
                                        if (!(output2 instanceof iqh.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar9 = aVar7;
                                        vph.o oVar2 = aVar9.f96218q;
                                        y yVar2 = aVar9.A;
                                        List list2 = ((m) ((j2) yVar2.f22677a).getValue()).f248409c;
                                        ScreenerSelectedFilter.Options options = ((iqh.k) output2).f167862a;
                                        oVar2.getClass();
                                        aVar9.H2(yVar2, new jeg.i(26, vph.o.c(list2, options)));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    screenerStatsFiltersController.H = block10;
                    return screenerStatsFiltersController;
                }
                if (step6 instanceof ScreenerEmbeddedFiltersControllerContract$ModalStep.InfoDialog) {
                    m mVar = aVar7.f96220s;
                    ScreenerFilterInfo.Dialog dialog = ((ScreenerEmbeddedFiltersControllerContract$ModalStep.InfoDialog) step6).f96211a;
                    mVar.getClass();
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(m.a(dialog));
                    Function1 block11 = new Function1() { // from class: qph.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i5) {
                                case 0:
                                    rqh.i output = (rqh.i) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar8 = aVar7;
                                    vph.o oVar = aVar8.f96218q;
                                    y yVar = aVar8.A;
                                    List currentFilters = ((m) ((j2) yVar.f22677a).getValue()).f248409c;
                                    List updatedFilters = output.f256544a;
                                    oVar.getClass();
                                    Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
                                    Intrinsics.checkNotNullParameter(updatedFilters, "updatedFilters");
                                    Iterator it8 = updatedFilters.iterator();
                                    while (it8.hasNext()) {
                                        currentFilters = vph.o.c(currentFilters, (ScreenerSelectedFilter) it8.next());
                                    }
                                    aVar8.H2(yVar, new q2j.j(currentFilters, 14));
                                    return Unit.f186387a;
                                case 1:
                                    dii.g it9 = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof dii.c) {
                                        Object obj8 = ((dii.c) it9).f115066a.d;
                                        if (obj8 instanceof woh.a) {
                                            aVar7.C1(u0.c(new WebViewFeatureConfig(((woh.a) obj8).f298936a, null, 0, false, true, false, 130974)));
                                        }
                                    } else if (!(it9 instanceof dii.b) && !(it9 instanceof dii.d) && !Intrinsics.f(it9, dii.e.f115068a) && !Intrinsics.f(it9, dii.f.f115069a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    iqh.l output2 = (iqh.l) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (!Intrinsics.f(output2, iqh.j.f167861a)) {
                                        if (!(output2 instanceof iqh.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar9 = aVar7;
                                        vph.o oVar2 = aVar9.f96218q;
                                        y yVar2 = aVar9.A;
                                        List list2 = ((m) ((j2) yVar2.f22677a).getValue()).f248409c;
                                        ScreenerSelectedFilter.Options options = ((iqh.k) output2).f167862a;
                                        oVar2.getClass();
                                        aVar9.H2(yVar2, new jeg.i(26, vph.o.c(list2, options)));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    actionsBottomSheetController.H = block11;
                    return actionsBottomSheetController;
                }
                if (step6 instanceof ScreenerEmbeddedFiltersControllerContract$ModalStep.SeeAllOptions) {
                    ScreenerEmbeddedFiltersControllerContract$ModalStep.SeeAllOptions seeAllOptions = (ScreenerEmbeddedFiltersControllerContract$ModalStep.SeeAllOptions) step6;
                    ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen = new ScreenerFilterOptionsPickerScreen(new ScreenerFilterOptionsPickerScreenContract$Input(seeAllOptions.f96212a, seeAllOptions.f96213b));
                    Function1 block12 = new Function1() { // from class: qph.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    rqh.i output = (rqh.i) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar8 = aVar7;
                                    vph.o oVar = aVar8.f96218q;
                                    y yVar = aVar8.A;
                                    List currentFilters = ((m) ((j2) yVar.f22677a).getValue()).f248409c;
                                    List updatedFilters = output.f256544a;
                                    oVar.getClass();
                                    Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
                                    Intrinsics.checkNotNullParameter(updatedFilters, "updatedFilters");
                                    Iterator it8 = updatedFilters.iterator();
                                    while (it8.hasNext()) {
                                        currentFilters = vph.o.c(currentFilters, (ScreenerSelectedFilter) it8.next());
                                    }
                                    aVar8.H2(yVar, new q2j.j(currentFilters, 14));
                                    return Unit.f186387a;
                                case 1:
                                    dii.g it9 = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof dii.c) {
                                        Object obj8 = ((dii.c) it9).f115066a.d;
                                        if (obj8 instanceof woh.a) {
                                            aVar7.C1(u0.c(new WebViewFeatureConfig(((woh.a) obj8).f298936a, null, 0, false, true, false, 130974)));
                                        }
                                    } else if (!(it9 instanceof dii.b) && !(it9 instanceof dii.d) && !Intrinsics.f(it9, dii.e.f115068a) && !Intrinsics.f(it9, dii.f.f115069a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    iqh.l output2 = (iqh.l) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (!Intrinsics.f(output2, iqh.j.f167861a)) {
                                        if (!(output2 instanceof iqh.k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar9 = aVar7;
                                        vph.o oVar2 = aVar9.f96218q;
                                        y yVar2 = aVar9.A;
                                        List list2 = ((m) ((j2) yVar2.f22677a).getValue()).f248409c;
                                        ScreenerSelectedFilter.Options options = ((iqh.k) output2).f167862a;
                                        oVar2.getClass();
                                        aVar9.H2(yVar2, new jeg.i(26, vph.o.c(list2, options)));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    screenerFilterOptionsPickerScreen.H = block12;
                    return screenerFilterOptionsPickerScreen;
                }
                if (!(step6 instanceof ScreenerEmbeddedFiltersControllerContract$ModalStep.ControllerDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                vph.d dVar = aVar7.v;
                com.revolut.feature.wealth_discovery.impl.screener.domain.model.a info = ((ScreenerEmbeddedFiltersControllerContract$ModalStep.ControllerDialog) step6).f96210a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(info, "info");
                if (vph.c.f291210a[info.ordinal()] == 1) {
                    return aVar7.e1(new j3h.a());
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                final com.revolut.sso.impl.ui.revolut_id.documents.a aVar8 = (com.revolut.sso.impl.ui.revolut_id.documents.a) obj4;
                DocumentsFlowContract$Step step7 = (DocumentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof DocumentsFlowContract$Step.DocumentPhoto) {
                    DocumentPhotoScreen documentPhotoScreen = new DocumentPhotoScreen(new DocumentPhotoScreenContract$InputData(((DocumentsFlowContract$Step.DocumentPhoto) step7).f106736a));
                    Function1 block13 = new Function1() { // from class: qpl.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i5) {
                                case 0:
                                    tpl.k result = (tpl.k) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof k.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.w2(aVar8.f106739p, DocumentsFlowContract$Step.HelpPrompt.f106737a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                    return Unit.f186387a;
                                default:
                                    rpl.e outputData = (rpl.e) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (!(outputData instanceof rpl.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar8.C1(new ExternalDestination.ByIntent(((rpl.d) outputData).f256421a, null));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    documentPhotoScreen.H = block13;
                    return documentPhotoScreen;
                }
                if (step7 instanceof DocumentsFlowContract$Step.IdentityDocuments) {
                    IdentityDocumentsScreen identityDocumentsScreen = new IdentityDocumentsScreen();
                    final int i59 = 0;
                    Function1 block14 = new Function1() { // from class: qpl.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i59) {
                                case 0:
                                    tpl.k result = (tpl.k) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof k.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.w2(aVar8.f106739p, DocumentsFlowContract$Step.HelpPrompt.f106737a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                    return Unit.f186387a;
                                default:
                                    rpl.e outputData = (rpl.e) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (!(outputData instanceof rpl.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar8.C1(new ExternalDestination.ByIntent(((rpl.d) outputData).f256421a, null));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    identityDocumentsScreen.H = block14;
                    return identityDocumentsScreen;
                }
                if (!(step7 instanceof DocumentsFlowContract$Step.HelpPrompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                qpl.d.Companion.getClass();
                ViewController viewControllerE17 = aVar8.e1(new ProductArticleDescriptor(qpl.b.f248440b, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, mql.a.f208025a, null, false, 48));
                qpb.i block15 = new qpb.i(10);
                Intrinsics.checkNotNullParameter(block15, "block");
                viewControllerE17.H = block15;
                return viewControllerE17;
            case 8:
                final com.revolut.feature.transfer_reasons.impl.flow.a aVar9 = (com.revolut.feature.transfer_reasons.impl.flow.a) obj4;
                qki.d dVar2 = aVar9.u;
                TransferReasonsFlowInputData transferReasonsFlowInputData = aVar9.f92347q;
                final l FlowCoordinator2 = (l) obj2;
                TransferReasonsFlowContract$Step step8 = (TransferReasonsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof TransferReasonsFlowContract$Step.Initial) {
                    return new LayoutViewerScreen(R$layout.screen_transparent);
                }
                if (!(step8 instanceof TransferReasonsFlowContract$Step.AmountAllocation)) {
                    if (step8 instanceof TransferReasonsFlowContract$Step.ReasonsList) {
                        TransferReasonsFlowContract$Step.ReasonsList reasonsList = (TransferReasonsFlowContract$Step.ReasonsList) step8;
                        transferReasonsSearchScreen = new TransferReasonsScreen(new TransferReasonsScreenContract$InputData(reasonsList.f92341a, reasonsList.f92342b, ((TransferReasonsFlowContract$State) ((j2) dVar2.f22677a).getValue()).f92332a, transferReasonsFlowInputData.getD()), dVar2.B(new qsa.p(8)), dVar2.B(new qsa.p(6)));
                        final int i66 = 0;
                        Function1 block16 = new Function1() { // from class: qsf.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i66) {
                                    case 0:
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar10 = aVar9;
                                        qki.d dVar3 = aVar10.u;
                                        htf.n result = (htf.n) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z3 = result instanceof htf.k;
                                        yki.l lVar = FlowCoordinator2;
                                        if (z3) {
                                            oki.h.t2(aVar10, lVar, new TransferReasonsFlowContract$Step.ReasonsSearch(((htf.k) result).f155372a), true, null, false, 12);
                                        } else if (result instanceof htf.m) {
                                            htf.m mVar2 = (htf.m) result;
                                            aVar10.H2(dVar3, new pza.d(mVar2.f155374a, 25, aVar10, mVar2.f155375b));
                                        } else if (result instanceof htf.i) {
                                            aVar10.H2(dVar3, new qsa.p(7));
                                        } else if (result instanceof htf.j) {
                                            oki.h.t2(aVar10, lVar, new TransferReasonsFlowContract$Step.AdditionalInfoStep(((htf.j) result).f155371a), true, null, false, 12);
                                        } else {
                                            if (!(result instanceof htf.l)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar10.J2();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar11 = aVar9;
                                        qki.d dVar4 = aVar11.u;
                                        ntf.m result2 = (ntf.m) obj7;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (result2 instanceof ntf.j) {
                                            oki.h.t2(aVar11, FlowCoordinator2, new TransferReasonsFlowContract$Step.AdditionalInfoStep(((ntf.j) result2).f219026a), true, null, false, 12);
                                        } else if (result2 instanceof ntf.i) {
                                            aVar11.H2(dVar4, new qsa.p(7));
                                        } else if (result2 instanceof ntf.k) {
                                            aVar11.J2();
                                        } else {
                                            if (!(result2 instanceof ntf.l)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            ntf.l lVar2 = (ntf.l) result2;
                                            aVar11.H2(dVar4, new pza.d(lVar2.f219028a, 25, aVar11, lVar2.f219029b));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block16, "block");
                        transferReasonsSearchScreen.H = block16;
                        transferReasonsSearchScreen.k2(new p1(aVar9, 21));
                    } else if (step8 instanceof TransferReasonsFlowContract$Step.ReasonsSearch) {
                        transferReasonsSearchScreen = new TransferReasonsSearchScreen(new TransferReasonsSearchScreenContract$InputData(transferReasonsFlowInputData.getF92327c().f92438a, ((TransferReasonsFlowContract$Step.ReasonsSearch) step8).f92343a, transferReasonsFlowInputData.getD()), dVar2.B(new qsa.p(8)));
                        Function1 block17 = new Function1() { // from class: qsf.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i5) {
                                    case 0:
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar10 = aVar9;
                                        qki.d dVar3 = aVar10.u;
                                        htf.n result = (htf.n) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z3 = result instanceof htf.k;
                                        yki.l lVar = FlowCoordinator2;
                                        if (z3) {
                                            oki.h.t2(aVar10, lVar, new TransferReasonsFlowContract$Step.ReasonsSearch(((htf.k) result).f155372a), true, null, false, 12);
                                        } else if (result instanceof htf.m) {
                                            htf.m mVar2 = (htf.m) result;
                                            aVar10.H2(dVar3, new pza.d(mVar2.f155374a, 25, aVar10, mVar2.f155375b));
                                        } else if (result instanceof htf.i) {
                                            aVar10.H2(dVar3, new qsa.p(7));
                                        } else if (result instanceof htf.j) {
                                            oki.h.t2(aVar10, lVar, new TransferReasonsFlowContract$Step.AdditionalInfoStep(((htf.j) result).f155371a), true, null, false, 12);
                                        } else {
                                            if (!(result instanceof htf.l)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar10.J2();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar11 = aVar9;
                                        qki.d dVar4 = aVar11.u;
                                        ntf.m result2 = (ntf.m) obj7;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (result2 instanceof ntf.j) {
                                            oki.h.t2(aVar11, FlowCoordinator2, new TransferReasonsFlowContract$Step.AdditionalInfoStep(((ntf.j) result2).f219026a), true, null, false, 12);
                                        } else if (result2 instanceof ntf.i) {
                                            aVar11.H2(dVar4, new qsa.p(7));
                                        } else if (result2 instanceof ntf.k) {
                                            aVar11.J2();
                                        } else {
                                            if (!(result2 instanceof ntf.l)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            ntf.l lVar2 = (ntf.l) result2;
                                            aVar11.H2(dVar4, new pza.d(lVar2.f219028a, 25, aVar11, lVar2.f219029b));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block17, "block");
                        transferReasonsSearchScreen.H = block17;
                    } else {
                        if (step8 instanceof TransferReasonsFlowContract$Step.ReuseDeclaration) {
                            TransferReasonsReuseDeclarationScreen transferReasonsReuseDeclarationScreen = new TransferReasonsReuseDeclarationScreen(new TransferReasonsReuseDeclarationScreenContract$InputData(((TransferReasonsFlowContract$Step.ReuseDeclaration) step8).f92345a, transferReasonsFlowInputData.getF92326b()));
                            Function1 block18 = new Function1() { // from class: qsf.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (i5) {
                                        case 0:
                                            dtf.f result = (dtf.f) obj7;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar10 = aVar9;
                                            aVar10.H2(aVar10.u, new d(result, 0));
                                            aVar10.J2();
                                            return Unit.f186387a;
                                        case 1:
                                            ltf.h result2 = (ltf.h) obj7;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            boolean zF = Intrinsics.f(result2, ltf.f.f199866a);
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar11 = aVar9;
                                            if (zF) {
                                                aVar11.L2(aVar11.f92350t.b());
                                            } else {
                                                if (!(result2 instanceof ltf.g)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar11.K2(((ltf.g) result2).f199867a);
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            xsf.o result3 = (xsf.o) obj7;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (result3 == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar12 = aVar9;
                                            aVar12.H2(aVar12.u, new c(result3, 0));
                                            aVar12.J2();
                                            return Unit.f186387a;
                                        case 3:
                                            jtf.f result4 = (jtf.f) obj7;
                                            Intrinsics.checkNotNullParameter(result4, "result");
                                            boolean zF2 = Intrinsics.f(result4, jtf.e.f178506a);
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar13 = aVar9;
                                            if (zF2) {
                                                oki.h.t2(aVar13, aVar13.v, new TransferReasonsFlowContract$Step.Refund(aVar13.f92347q.getD()), false, null, false, 14);
                                            } else {
                                                if (!Intrinsics.f(result4, jtf.d.f178505a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar13.L2(aVar13.f92350t.a());
                                            }
                                            return Unit.f186387a;
                                        case 4:
                                            dsf.e result5 = (dsf.e) obj7;
                                            Intrinsics.checkNotNullParameter(result5, "result");
                                            if (result5 == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar9.K2(result5.f117310a);
                                            return Unit.f186387a;
                                        default:
                                            vsf.e result6 = (vsf.e) obj7;
                                            Intrinsics.checkNotNullParameter(result6, "result");
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar14 = aVar9;
                                            aVar14.H2(aVar14.u, new qgf.o(result6, 28));
                                            aVar14.L2(aVar14.f92350t.b());
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block18, "block");
                            transferReasonsReuseDeclarationScreen.H = block18;
                            transferReasonsReuseDeclarationScreen.k2(new p1(aVar9, 21));
                            return transferReasonsReuseDeclarationScreen;
                        }
                        if (!(step8 instanceof TransferReasonsFlowContract$Step.AdditionalInfoStep)) {
                            if (step8 instanceof TransferReasonsFlowContract$Step.IsRefund) {
                                TransferReasonsIsRefundScreen transferReasonsIsRefundScreen = new TransferReasonsIsRefundScreen();
                                final int i74 = 3;
                                Function1 block19 = new Function1() { // from class: qsf.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        switch (i74) {
                                            case 0:
                                                dtf.f result = (dtf.f) obj7;
                                                Intrinsics.checkNotNullParameter(result, "result");
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar10 = aVar9;
                                                aVar10.H2(aVar10.u, new d(result, 0));
                                                aVar10.J2();
                                                return Unit.f186387a;
                                            case 1:
                                                ltf.h result2 = (ltf.h) obj7;
                                                Intrinsics.checkNotNullParameter(result2, "result");
                                                boolean zF = Intrinsics.f(result2, ltf.f.f199866a);
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar11 = aVar9;
                                                if (zF) {
                                                    aVar11.L2(aVar11.f92350t.b());
                                                } else {
                                                    if (!(result2 instanceof ltf.g)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    aVar11.K2(((ltf.g) result2).f199867a);
                                                }
                                                return Unit.f186387a;
                                            case 2:
                                                xsf.o result3 = (xsf.o) obj7;
                                                Intrinsics.checkNotNullParameter(result3, "result");
                                                if (result3 == null) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar12 = aVar9;
                                                aVar12.H2(aVar12.u, new c(result3, 0));
                                                aVar12.J2();
                                                return Unit.f186387a;
                                            case 3:
                                                jtf.f result4 = (jtf.f) obj7;
                                                Intrinsics.checkNotNullParameter(result4, "result");
                                                boolean zF2 = Intrinsics.f(result4, jtf.e.f178506a);
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar13 = aVar9;
                                                if (zF2) {
                                                    oki.h.t2(aVar13, aVar13.v, new TransferReasonsFlowContract$Step.Refund(aVar13.f92347q.getD()), false, null, false, 14);
                                                } else {
                                                    if (!Intrinsics.f(result4, jtf.d.f178505a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    aVar13.L2(aVar13.f92350t.a());
                                                }
                                                return Unit.f186387a;
                                            case 4:
                                                dsf.e result5 = (dsf.e) obj7;
                                                Intrinsics.checkNotNullParameter(result5, "result");
                                                if (result5 == null) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar9.K2(result5.f117310a);
                                                return Unit.f186387a;
                                            default:
                                                vsf.e result6 = (vsf.e) obj7;
                                                Intrinsics.checkNotNullParameter(result6, "result");
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar14 = aVar9;
                                                aVar14.H2(aVar14.u, new qgf.o(result6, 28));
                                                aVar14.L2(aVar14.f92350t.b());
                                                return Unit.f186387a;
                                        }
                                    }
                                };
                                Intrinsics.checkNotNullParameter(block19, "block");
                                transferReasonsIsRefundScreen.H = block19;
                                return transferReasonsIsRefundScreen;
                            }
                            if (step8 instanceof TransferReasonsFlowContract$Step.Refund) {
                                TransferReasonsRefundFlow transferReasonsRefundFlow = new TransferReasonsRefundFlow(new TransferReasonsRefundFlowContract$InputData(transferReasonsFlowInputData.getF92325a(), transferReasonsFlowInputData.getF92327c().f92438a, ((TransferReasonsFlowContract$Step.Refund) step8).f92344a));
                                final int i92 = 4;
                                Function1 block20 = new Function1() { // from class: qsf.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        switch (i92) {
                                            case 0:
                                                dtf.f result = (dtf.f) obj7;
                                                Intrinsics.checkNotNullParameter(result, "result");
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar10 = aVar9;
                                                aVar10.H2(aVar10.u, new d(result, 0));
                                                aVar10.J2();
                                                return Unit.f186387a;
                                            case 1:
                                                ltf.h result2 = (ltf.h) obj7;
                                                Intrinsics.checkNotNullParameter(result2, "result");
                                                boolean zF = Intrinsics.f(result2, ltf.f.f199866a);
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar11 = aVar9;
                                                if (zF) {
                                                    aVar11.L2(aVar11.f92350t.b());
                                                } else {
                                                    if (!(result2 instanceof ltf.g)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    aVar11.K2(((ltf.g) result2).f199867a);
                                                }
                                                return Unit.f186387a;
                                            case 2:
                                                xsf.o result3 = (xsf.o) obj7;
                                                Intrinsics.checkNotNullParameter(result3, "result");
                                                if (result3 == null) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar12 = aVar9;
                                                aVar12.H2(aVar12.u, new c(result3, 0));
                                                aVar12.J2();
                                                return Unit.f186387a;
                                            case 3:
                                                jtf.f result4 = (jtf.f) obj7;
                                                Intrinsics.checkNotNullParameter(result4, "result");
                                                boolean zF2 = Intrinsics.f(result4, jtf.e.f178506a);
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar13 = aVar9;
                                                if (zF2) {
                                                    oki.h.t2(aVar13, aVar13.v, new TransferReasonsFlowContract$Step.Refund(aVar13.f92347q.getD()), false, null, false, 14);
                                                } else {
                                                    if (!Intrinsics.f(result4, jtf.d.f178505a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    aVar13.L2(aVar13.f92350t.a());
                                                }
                                                return Unit.f186387a;
                                            case 4:
                                                dsf.e result5 = (dsf.e) obj7;
                                                Intrinsics.checkNotNullParameter(result5, "result");
                                                if (result5 == null) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar9.K2(result5.f117310a);
                                                return Unit.f186387a;
                                            default:
                                                vsf.e result6 = (vsf.e) obj7;
                                                Intrinsics.checkNotNullParameter(result6, "result");
                                                com.revolut.feature.transfer_reasons.impl.flow.a aVar14 = aVar9;
                                                aVar14.H2(aVar14.u, new qgf.o(result6, 28));
                                                aVar14.L2(aVar14.f92350t.b());
                                                return Unit.f186387a;
                                        }
                                    }
                                };
                                Intrinsics.checkNotNullParameter(block20, "block");
                                transferReasonsRefundFlow.H = block20;
                                return transferReasonsRefundFlow;
                            }
                            if (!(step8 instanceof TransferReasonsFlowContract$Step.ChooseAction)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            TransferReasonsFlowContract$Step.ChooseAction chooseAction = (TransferReasonsFlowContract$Step.ChooseAction) step8;
                            TransferReasonsDeclarationActionsScreen transferReasonsDeclarationActionsScreen = new TransferReasonsDeclarationActionsScreen(new TransferReasonsDeclarationActionsScreenContract$InputData(chooseAction.f92337a, chooseAction.f92338b, transferReasonsFlowInputData.getF92326b()));
                            final int i96 = 5;
                            Function1 block21 = new Function1() { // from class: qsf.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (i96) {
                                        case 0:
                                            dtf.f result = (dtf.f) obj7;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar10 = aVar9;
                                            aVar10.H2(aVar10.u, new d(result, 0));
                                            aVar10.J2();
                                            return Unit.f186387a;
                                        case 1:
                                            ltf.h result2 = (ltf.h) obj7;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            boolean zF = Intrinsics.f(result2, ltf.f.f199866a);
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar11 = aVar9;
                                            if (zF) {
                                                aVar11.L2(aVar11.f92350t.b());
                                            } else {
                                                if (!(result2 instanceof ltf.g)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar11.K2(((ltf.g) result2).f199867a);
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            xsf.o result3 = (xsf.o) obj7;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (result3 == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar12 = aVar9;
                                            aVar12.H2(aVar12.u, new c(result3, 0));
                                            aVar12.J2();
                                            return Unit.f186387a;
                                        case 3:
                                            jtf.f result4 = (jtf.f) obj7;
                                            Intrinsics.checkNotNullParameter(result4, "result");
                                            boolean zF2 = Intrinsics.f(result4, jtf.e.f178506a);
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar13 = aVar9;
                                            if (zF2) {
                                                oki.h.t2(aVar13, aVar13.v, new TransferReasonsFlowContract$Step.Refund(aVar13.f92347q.getD()), false, null, false, 14);
                                            } else {
                                                if (!Intrinsics.f(result4, jtf.d.f178505a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar13.L2(aVar13.f92350t.a());
                                            }
                                            return Unit.f186387a;
                                        case 4:
                                            dsf.e result5 = (dsf.e) obj7;
                                            Intrinsics.checkNotNullParameter(result5, "result");
                                            if (result5 == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar9.K2(result5.f117310a);
                                            return Unit.f186387a;
                                        default:
                                            vsf.e result6 = (vsf.e) obj7;
                                            Intrinsics.checkNotNullParameter(result6, "result");
                                            com.revolut.feature.transfer_reasons.impl.flow.a aVar14 = aVar9;
                                            aVar14.H2(aVar14.u, new qgf.o(result6, 28));
                                            aVar14.L2(aVar14.f92350t.b());
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block21, "block");
                            transferReasonsDeclarationActionsScreen.H = block21;
                            transferReasonsDeclarationActionsScreen.k2(new p1(aVar9, 21));
                            return transferReasonsDeclarationActionsScreen;
                        }
                        transferReasonsAdditionalInfoScreen = new TransferReasonsAdditionalInfoScreen(new TransferReasonsAdditionalInfoScreenContract$InputData(transferReasonsFlowInputData.getF92325a(), ((TransferReasonsFlowContract$Step.AdditionalInfoStep) step8).f92335a, ((TransferReasonsFlowContract$State) ((j2) dVar2.f22677a).getValue()).f92334c));
                        Function1 block22 = new Function1() { // from class: qsf.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i3) {
                                    case 0:
                                        dtf.f result = (dtf.f) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar10 = aVar9;
                                        aVar10.H2(aVar10.u, new d(result, 0));
                                        aVar10.J2();
                                        return Unit.f186387a;
                                    case 1:
                                        ltf.h result2 = (ltf.h) obj7;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        boolean zF = Intrinsics.f(result2, ltf.f.f199866a);
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar11 = aVar9;
                                        if (zF) {
                                            aVar11.L2(aVar11.f92350t.b());
                                        } else {
                                            if (!(result2 instanceof ltf.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar11.K2(((ltf.g) result2).f199867a);
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        xsf.o result3 = (xsf.o) obj7;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar12 = aVar9;
                                        aVar12.H2(aVar12.u, new c(result3, 0));
                                        aVar12.J2();
                                        return Unit.f186387a;
                                    case 3:
                                        jtf.f result4 = (jtf.f) obj7;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        boolean zF2 = Intrinsics.f(result4, jtf.e.f178506a);
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar13 = aVar9;
                                        if (zF2) {
                                            oki.h.t2(aVar13, aVar13.v, new TransferReasonsFlowContract$Step.Refund(aVar13.f92347q.getD()), false, null, false, 14);
                                        } else {
                                            if (!Intrinsics.f(result4, jtf.d.f178505a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar13.L2(aVar13.f92350t.a());
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        dsf.e result5 = (dsf.e) obj7;
                                        Intrinsics.checkNotNullParameter(result5, "result");
                                        if (result5 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar9.K2(result5.f117310a);
                                        return Unit.f186387a;
                                    default:
                                        vsf.e result6 = (vsf.e) obj7;
                                        Intrinsics.checkNotNullParameter(result6, "result");
                                        com.revolut.feature.transfer_reasons.impl.flow.a aVar14 = aVar9;
                                        aVar14.H2(aVar14.u, new qgf.o(result6, 28));
                                        aVar14.L2(aVar14.f92350t.b());
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block22, "block");
                        transferReasonsAdditionalInfoScreen.H = block22;
                    }
                    return transferReasonsSearchScreen;
                }
                transferReasonsAdditionalInfoScreen = new TransferReasonsAmountAllocationScreen(new TransferReasonsAmountAllocationScreenContract$InputData(transferReasonsFlowInputData.getF92325a(), d0.d1(((TransferReasonsFlowContract$State) ((j2) dVar2.f22677a).getValue()).f92333b), ((TransferReasonsFlowContract$State) ((j2) dVar2.f22677a).getValue()).d));
                final int i99 = 0;
                Function1 block23 = new Function1() { // from class: qsf.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i99) {
                            case 0:
                                dtf.f result = (dtf.f) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                com.revolut.feature.transfer_reasons.impl.flow.a aVar10 = aVar9;
                                aVar10.H2(aVar10.u, new d(result, 0));
                                aVar10.J2();
                                return Unit.f186387a;
                            case 1:
                                ltf.h result2 = (ltf.h) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean zF = Intrinsics.f(result2, ltf.f.f199866a);
                                com.revolut.feature.transfer_reasons.impl.flow.a aVar11 = aVar9;
                                if (zF) {
                                    aVar11.L2(aVar11.f92350t.b());
                                } else {
                                    if (!(result2 instanceof ltf.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar11.K2(((ltf.g) result2).f199867a);
                                }
                                return Unit.f186387a;
                            case 2:
                                xsf.o result3 = (xsf.o) obj7;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (result3 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.transfer_reasons.impl.flow.a aVar12 = aVar9;
                                aVar12.H2(aVar12.u, new c(result3, 0));
                                aVar12.J2();
                                return Unit.f186387a;
                            case 3:
                                jtf.f result4 = (jtf.f) obj7;
                                Intrinsics.checkNotNullParameter(result4, "result");
                                boolean zF2 = Intrinsics.f(result4, jtf.e.f178506a);
                                com.revolut.feature.transfer_reasons.impl.flow.a aVar13 = aVar9;
                                if (zF2) {
                                    oki.h.t2(aVar13, aVar13.v, new TransferReasonsFlowContract$Step.Refund(aVar13.f92347q.getD()), false, null, false, 14);
                                } else {
                                    if (!Intrinsics.f(result4, jtf.d.f178505a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar13.L2(aVar13.f92350t.a());
                                }
                                return Unit.f186387a;
                            case 4:
                                dsf.e result5 = (dsf.e) obj7;
                                Intrinsics.checkNotNullParameter(result5, "result");
                                if (result5 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar9.K2(result5.f117310a);
                                return Unit.f186387a;
                            default:
                                vsf.e result6 = (vsf.e) obj7;
                                Intrinsics.checkNotNullParameter(result6, "result");
                                com.revolut.feature.transfer_reasons.impl.flow.a aVar14 = aVar9;
                                aVar14.H2(aVar14.u, new qgf.o(result6, 28));
                                aVar14.L2(aVar14.f92350t.b());
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block23, "block");
                transferReasonsAdditionalInfoScreen.H = block23;
                return transferReasonsAdditionalInfoScreen;
            case 9:
                com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.a aVar10 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.a) obj4;
                InsightsFlowContract$InputData insightsFlowContract$InputData = aVar10.o;
                l FlowCoordinator3 = (l) obj2;
                InsightsFlowContract$Step step9 = (InsightsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof InsightsFlowContract$Step.Insights) {
                    InsightsScreen insightsScreen = new InsightsScreen(new InsightsScreenContract$InputData(insightsFlowContract$InputData.f103849a, insightsFlowContract$InputData.f103850b));
                    qpb.a block24 = new qpb.a(aVar10, FlowCoordinator3, i2);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    insightsScreen.H = block24;
                    return insightsScreen;
                }
                if (step9 instanceof InsightsFlowContract$Step.Sentiment) {
                    return new IndexMarketSentimentController(new IndexMarketSentimentControllerContract$InputData(((InsightsFlowContract$Step.Sentiment) step9).f103855a));
                }
                if (step9 instanceof InsightsFlowContract$Step.AnalystRatings) {
                    return new AnalystRatingsScreen(new rtk.d(insightsFlowContract$InputData.f103849a));
                }
                if (step9 instanceof InsightsFlowContract$Step.Technicals) {
                    return new TechnicalInsightsController(new TechnicalInsightsControllerContract$InputData(insightsFlowContract$InputData.f103849a));
                }
                if (step9 instanceof InsightsFlowContract$Step.Fundamentals) {
                    return new FundamentalsScreen(new wtk.i(insightsFlowContract$InputData.f103849a));
                }
                if (step9 instanceof InsightsFlowContract$Step.History) {
                    return new RecommendationHistoryScreen(new RecommendationHistoryScreenContract$InputData(insightsFlowContract$InputData.f103849a));
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = (CreditCardRepayPaymentAmountScreen) obj4;
                CenteredAmountDelegate.Model model2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = CreditCardRepayPaymentAmountScreen.W;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj7 = model2.f51981p;
                xi0.b bVar3 = obj7 instanceof xi0.b ? (xi0.b) obj7 : null;
                if (bVar3 != null) {
                    return new zp0.d(field2.getEditText(), bVar3, (u80.d) creditCardRepayPaymentAmountScreen.Q.getValue(), null, new p56.a(creditCardRepayPaymentAmountScreen, 10), false, false, 0, false, null, 1928);
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return (bw0.h) ((qul.b) obj4).f.getValue();
            case 12:
                final com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar11 = (com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a) obj4;
                final yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                RevPointsGiftcardsFlowContract$Step step10 = (RevPointsGiftcardsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof RevPointsGiftcardsFlowContract$Step.OpenGiftcardsHome) {
                    RevPointsGiftcardsDestination.GiftcardsHomePagerItem giftcardsHomePagerItem = ((RevPointsGiftcardsFlowContract$Step.OpenGiftcardsHome) step10).f83692a;
                    if (giftcardsHomePagerItem instanceof RevPointsGiftcardsDestination.GiftcardsHomePagerItem.Discover) {
                        discover = new RevPointsGiftcardsHomePagerFlowContract$PagerItem.Discover(((RevPointsGiftcardsDestination.GiftcardsHomePagerItem.Discover) giftcardsHomePagerItem).f83657a);
                    } else {
                        if (!(giftcardsHomePagerItem instanceof RevPointsGiftcardsDestination.GiftcardsHomePagerItem.MyCards)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        discover = RevPointsGiftcardsHomePagerFlowContract$PagerItem.MyCards.f83676a;
                    }
                    RevPointsGiftcardsHomePagerFlow revPointsGiftcardsHomePagerFlow = new RevPointsGiftcardsHomePagerFlow(new RevPointsGiftcardsHomePagerFlowContract$InputData(discover));
                    final int i100 = 0;
                    Function1 block25 = new Function1() { // from class: qwb.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i100) {
                                case 0:
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a result = (com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof pwb.h;
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar12 = aVar11;
                                    yki.b bVar4 = LazyFlowCoordinator3;
                                    if (z3) {
                                        VoucherProductGroup voucherProductGroup = ((pwb.h) result).f240382a;
                                        oki.h.t2(aVar12, bVar4, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(voucherProductGroup.f83642a, null, new GiftCardPreview(voucherProductGroup.f83644c, voucherProductGroup.d), null, 10), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (result instanceof pwb.g) {
                                        oki.h.t2(aVar12, bVar4, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((pwb.g) result).f240381a, null, null, 13), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!(result instanceof a.C0529a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar12, bVar4, RevPointsGiftcardsFlowContract$Step.OpenSearch.f83693a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ywb.g result2 = (ywb.g) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z4 = result2 instanceof ywb.f;
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar13 = aVar11;
                                    yki.b bVar5 = LazyFlowCoordinator3;
                                    if (z4) {
                                        oki.h.t2(aVar13, bVar5, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(((ywb.f) result2).f317406a, null, null, null, 14), true, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar13, bVar5, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((e) result2).f317405a, null, null, 13), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    axb.f result3 = (axb.f) obj8;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof axb.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar11, LazyFlowCoordinator3, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((axb.e) result3).f10916a, null, null, 13), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    swb.g result4 = (swb.g) obj8;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof swb.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar11, LazyFlowCoordinator3, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((swb.f) result4).f266174a, null, null, 13), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    revPointsGiftcardsHomePagerFlow.H = block25;
                    return revPointsGiftcardsHomePagerFlow;
                }
                if (step10 instanceof RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails) {
                    RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails openGiftcardDetails = (RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails) step10;
                    RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen = new RevPointsGiftcardDetailsScreen(new RevPointsGiftcardDetailsScreenContract$InputData(openGiftcardDetails.f83687a, openGiftcardDetails.f83688b, openGiftcardDetails.f83689c));
                    pza.d block26 = new pza.d(aVar11, 28, LazyFlowCoordinator3, step10);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    revPointsGiftcardDetailsScreen.H = block26;
                    return revPointsGiftcardDetailsScreen;
                }
                if (step10 instanceof RevPointsGiftcardsFlowContract$Step.OpenGiftcardTermsAndConditions) {
                    RevPointsGiftcardsFlowContract$Step.OpenGiftcardTermsAndConditions openGiftcardTermsAndConditions = (RevPointsGiftcardsFlowContract$Step.OpenGiftcardTermsAndConditions) step10;
                    return new RevPointsGiftcardsTermsAndConditionsScreen(new RevPointsGiftcardsTermsAndConditionsScreenContract$InputData(openGiftcardTermsAndConditions.f83690a, openGiftcardTermsAndConditions.f83691b));
                }
                if (step10 instanceof RevPointsGiftcardsFlowContract$Step.OpenSearch) {
                    RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen = new RevPointsGiftcardsSearchScreen();
                    Function1 block27 = new Function1() { // from class: qwb.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i5) {
                                case 0:
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a result = (com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof pwb.h;
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar12 = aVar11;
                                    yki.b bVar4 = LazyFlowCoordinator3;
                                    if (z3) {
                                        VoucherProductGroup voucherProductGroup = ((pwb.h) result).f240382a;
                                        oki.h.t2(aVar12, bVar4, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(voucherProductGroup.f83642a, null, new GiftCardPreview(voucherProductGroup.f83644c, voucherProductGroup.d), null, 10), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (result instanceof pwb.g) {
                                        oki.h.t2(aVar12, bVar4, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((pwb.g) result).f240381a, null, null, 13), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!(result instanceof a.C0529a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar12, bVar4, RevPointsGiftcardsFlowContract$Step.OpenSearch.f83693a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ywb.g result2 = (ywb.g) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z4 = result2 instanceof ywb.f;
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar13 = aVar11;
                                    yki.b bVar5 = LazyFlowCoordinator3;
                                    if (z4) {
                                        oki.h.t2(aVar13, bVar5, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(((ywb.f) result2).f317406a, null, null, null, 14), true, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar13, bVar5, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((e) result2).f317405a, null, null, 13), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    axb.f result3 = (axb.f) obj8;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof axb.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar11, LazyFlowCoordinator3, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((axb.e) result3).f10916a, null, null, 13), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    swb.g result4 = (swb.g) obj8;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof swb.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar11, LazyFlowCoordinator3, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((swb.f) result4).f266174a, null, null, 13), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block27, "block");
                    revPointsGiftcardsSearchScreen.H = block27;
                    return revPointsGiftcardsSearchScreen;
                }
                if (step10 instanceof RevPointsGiftcardsFlowContract$Step.UsedAndExpiredCards) {
                    RevPointsGiftcardsUsedExpiredCardsScreen revPointsGiftcardsUsedExpiredCardsScreen = new RevPointsGiftcardsUsedExpiredCardsScreen();
                    Function1 block28 = new Function1() { // from class: qwb.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i3) {
                                case 0:
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a result = (com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof pwb.h;
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar12 = aVar11;
                                    yki.b bVar4 = LazyFlowCoordinator3;
                                    if (z3) {
                                        VoucherProductGroup voucherProductGroup = ((pwb.h) result).f240382a;
                                        oki.h.t2(aVar12, bVar4, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(voucherProductGroup.f83642a, null, new GiftCardPreview(voucherProductGroup.f83644c, voucherProductGroup.d), null, 10), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (result instanceof pwb.g) {
                                        oki.h.t2(aVar12, bVar4, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((pwb.g) result).f240381a, null, null, 13), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!(result instanceof a.C0529a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar12, bVar4, RevPointsGiftcardsFlowContract$Step.OpenSearch.f83693a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ywb.g result2 = (ywb.g) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z4 = result2 instanceof ywb.f;
                                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar13 = aVar11;
                                    yki.b bVar5 = LazyFlowCoordinator3;
                                    if (z4) {
                                        oki.h.t2(aVar13, bVar5, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(((ywb.f) result2).f317406a, null, null, null, 14), true, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar13, bVar5, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((e) result2).f317405a, null, null, 13), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    axb.f result3 = (axb.f) obj8;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof axb.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar11, LazyFlowCoordinator3, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((axb.e) result3).f10916a, null, null, 13), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    swb.g result4 = (swb.g) obj8;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof swb.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar11, LazyFlowCoordinator3, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((swb.f) result4).f266174a, null, null, 13), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block28, "block");
                    revPointsGiftcardsUsedExpiredCardsScreen.H = block28;
                    return revPointsGiftcardsUsedExpiredCardsScreen;
                }
                if (!(step10 instanceof RevPointsGiftcardsFlowContract$Step.DownloadCards)) {
                    throw new NoWhenBranchMatchedException();
                }
                RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen = new RevPointsGiftcardsDownloadScreen();
                final int i101 = 3;
                Function1 block29 = new Function1() { // from class: qwb.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i101) {
                            case 0:
                                com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a result = (com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a) obj8;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z3 = result instanceof pwb.h;
                                com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar12 = aVar11;
                                yki.b bVar4 = LazyFlowCoordinator3;
                                if (z3) {
                                    VoucherProductGroup voucherProductGroup = ((pwb.h) result).f240382a;
                                    oki.h.t2(aVar12, bVar4, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(voucherProductGroup.f83642a, null, new GiftCardPreview(voucherProductGroup.f83644c, voucherProductGroup.d), null, 10), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                } else if (result instanceof pwb.g) {
                                    oki.h.t2(aVar12, bVar4, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((pwb.g) result).f240381a, null, null, 13), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                } else {
                                    if (!(result instanceof a.C0529a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar12, bVar4, RevPointsGiftcardsFlowContract$Step.OpenSearch.f83693a, true, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 1:
                                ywb.g result2 = (ywb.g) obj8;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean z4 = result2 instanceof ywb.f;
                                com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar13 = aVar11;
                                yki.b bVar5 = LazyFlowCoordinator3;
                                if (z4) {
                                    oki.h.t2(aVar13, bVar5, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(((ywb.f) result2).f317406a, null, null, null, 14), true, null, false, 12);
                                } else {
                                    if (!(result2 instanceof e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar13, bVar5, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((e) result2).f317405a, null, null, 13), true, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 2:
                                axb.f result3 = (axb.f) obj8;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (!(result3 instanceof axb.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(aVar11, LazyFlowCoordinator3, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((axb.e) result3).f10916a, null, null, 13), true, null, false, 12);
                                return Unit.f186387a;
                            default:
                                swb.g result4 = (swb.g) obj8;
                                Intrinsics.checkNotNullParameter(result4, "result");
                                if (!(result4 instanceof swb.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(aVar11, LazyFlowCoordinator3, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(null, ((swb.f) result4).f266174a, null, null, 13), true, null, false, 12);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block29, "block");
                revPointsGiftcardsDownloadScreen.H = block29;
                return revPointsGiftcardsDownloadScreen;
            case 13:
                CenteredAmountDelegate.Model model3 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr3 = StakeController.T;
                Intrinsics.checkNotNullParameter(model3, "model");
                Intrinsics.checkNotNullParameter(field3, "field");
                Object obj8 = model3.f51981p;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.feature.staking.impl.stake.v2.StakeControllerContract.AmountParcel");
                qwd.i iVar = (qwd.i) obj8;
                return new zp0.d(field3.getEditText(), iVar.f249857b, new u80.d(iVar.f249856a), null, new om4.d0((StakeController) obj4, 8), false, false, 0, false, null, 1960);
            case 14:
                com.revolut.feature.staking.impl.stake.v2.b bVar4 = (com.revolut.feature.staking.impl.stake.v2.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StakeControllerContract$ModalStep step11 = (StakeControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof StakeControllerContract$ModalStep.BalancePicker)) {
                    if (step11 instanceof StakeControllerContract$ModalStep.EarnRateBottomSheet) {
                        return bVar4.A.a(((StakeControllerContract$ModalStep.EarnRateBottomSheet) step11).f88145a);
                    }
                    if (!(step11 instanceof StakeControllerContract$ModalStep.CryptoScaPrompt)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewControllerE18 = bVar4.e1(new wrc.a(((StakeControllerContract$ModalStep.CryptoScaPrompt) step11).f88142a, null, 14));
                    qpb.a block30 = new qpb.a(bVar4, step11, 17);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    viewControllerE18.H = block30;
                    return viewControllerE18;
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.staking.api.R$string.crypto_staking_stake_from_title, null, null, 14);
                k1j.a[] elements = {k1j.a.POCKETS, k1j.a.CRYPTO, k1j.a.VAULTS};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Set setY0 = kotlin.collections.d.y0(elements);
                k1j.d dVar3 = k1j.d.RETAIL;
                io3.l lVar = io3.l.CURRENT;
                String str8 = ((StakeControllerContract$ModalStep.BalancePicker) step11).f88141a;
                BalanceSelector$ExtraConfiguration[] elements2 = {new BalanceSelector$ExtraConfiguration.ShowDisclaimerForExchange(bVar4.o.f88138a.d), new BalanceSelector$ExtraConfiguration.CustomPersonalSectionOrder(v.k(g1j.c.ACCOUNTS, g1j.c.CRYPTO, g1j.c.VAULTS))};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                ViewController viewControllerE19 = bVar4.e1(new g1j.a(new BalanceSelector$InputData(setY0, dVar3, lVar, textLocalisedClause3, null, null, null, str8, kotlin.collections.d.y0(elements2), 112), bVar4.C));
                qwd.p block31 = new qwd.p(bVar4, i5);
                Intrinsics.checkNotNullParameter(block31, "block");
                viewControllerE19.H = block31;
                return viewControllerE19;
            case 15:
                final com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar2 = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) obj4;
                l FlowCoordinator4 = (l) obj2;
                CheckoutFlowContract$Step step12 = (CheckoutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof CheckoutFlowContract$Step.Checkout) {
                    CheckoutScreenContract$InputData checkoutScreenContract$InputData = ((CheckoutFlowContract$Step.Checkout) step12).f90675a;
                    CheckoutTopupScreen checkoutTopupScreen = new CheckoutTopupScreen(checkoutScreenContract$InputData);
                    qpb.a block32 = new qpb.a(eVar2, checkoutScreenContract$InputData, 21);
                    Intrinsics.checkNotNullParameter(block32, "block");
                    checkoutTopupScreen.H = block32;
                    return checkoutTopupScreen;
                }
                if (step12 instanceof CheckoutFlowContract$Step.Amount) {
                    CheckoutCustomAmountScreen checkoutCustomAmountScreen = new CheckoutCustomAmountScreen(((CheckoutFlowContract$Step.Amount) step12).f90672a);
                    final int i102 = 0;
                    Function1 block33 = new Function1() { // from class: qwe.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            int i103 = i102;
                            com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar3 = eVar2;
                            Continuation continuation = null;
                            switch (i103) {
                                case 0:
                                    lxe.e outputData = (lxe.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    eVar3.n2(new qu4.s(eVar3, outputData, continuation, 9), new whi.b(6));
                                    return Unit.f186387a;
                                case 1:
                                    we6.a0 result = (we6.a0) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, z.f296697a)) {
                                        eVar3.l2(new h(eVar3, null, 0), new yi5.b(26));
                                    } else if (!Intrinsics.f(result, we6.y.f296693a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g7a.b result2 = (g7a.b) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, g7a.b.f141141a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar3.l2(new h(eVar3, null, 1), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    ste.u result3 = (ste.u) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof ste.s) {
                                        if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                            eVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                        }
                                    } else if (!(result3 instanceof ste.t)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.b result4 = (ste.b) obj9;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                        eVar3.f90703q.f300649b.setValue(eVar3.u.h((CardDetailsScreenDescriptor$OutputData$CardData) result4));
                                    } else {
                                        if (!(result4 instanceof ste.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Result not expected in this flow: " + result4);
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block33, "block");
                    checkoutCustomAmountScreen.H = block33;
                    return checkoutCustomAmountScreen;
                }
                if (step12 instanceof CheckoutFlowContract$Step.TopUpMethods) {
                    CheckoutFlowContract$Step.TopUpMethods topUpMethods = (CheckoutFlowContract$Step.TopUpMethods) step12;
                    String str9 = topUpMethods.f90691a;
                    TopUpTarget topUpTarget = topUpMethods.f90693c;
                    n nVar = topUpMethods.f90692b;
                    List list2 = topUpMethods.d;
                    CheckoutContext checkoutContext = topUpMethods.e;
                    topUpLimitsBottomSheetController = new TopupMethodsFlow(new TopupMethodsFlowContract$InputData(str9, nVar, topUpTarget, list2, checkoutContext, null, 32));
                    q2k.b block34 = new q2k.b(eVar2, nVar, checkoutContext, topUpTarget, 7);
                    Intrinsics.checkNotNullParameter(block34, "block");
                    topUpLimitsBottomSheetController.H = block34;
                } else if (step12 instanceof CheckoutFlowContract$Step.GooglePayTopUp) {
                    CheckoutFlowContract$Step.GooglePayTopUp googlePayTopUp = (CheckoutFlowContract$Step.GooglePayTopUp) step12;
                    GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = googlePayTopUp.f90676a;
                    CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order = googlePayTopUp.f90677b;
                    List list3 = googlePayTopUp.f90678c;
                    CheckoutCardPlan checkoutCardPlan = googlePayTopUp.d;
                    topUpLimitsBottomSheetController = new GooglePayFlow(googlePayFlowDescriptor$InputData);
                    kwg.e block35 = new kwg.e(eVar2, googlePayFlowDescriptor$InputData, checkoutScreenContract$CheckoutContent$Order, list3, checkoutCardPlan, 26);
                    Intrinsics.checkNotNullParameter(block35, "block");
                    topUpLimitsBottomSheetController.H = block35;
                } else {
                    if (step12 instanceof CheckoutFlowContract$Step.CardTopUp) {
                        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = ((CheckoutFlowContract$Step.CardTopUp) step12).f90674a;
                        FacadeCardTopupFlow facadeCardTopupFlow = new FacadeCardTopupFlow(facadeCardTopupFlowDescriptor$InputData);
                        qpb.a block36 = new qpb.a(eVar2, facadeCardTopupFlowDescriptor$InputData, 18);
                        Intrinsics.checkNotNullParameter(block36, "block");
                        facadeCardTopupFlow.H = block36;
                        return facadeCardTopupFlow;
                    }
                    if (step12 instanceof CheckoutFlowContract$Step.NewCardTopUp) {
                        TopupWithNewCardFlowDescriptor$InputData topupWithNewCardFlowDescriptor$InputData = ((CheckoutFlowContract$Step.NewCardTopUp) step12).f90686a;
                        TopupWithNewCardFlow topupWithNewCardFlow = new TopupWithNewCardFlow(topupWithNewCardFlowDescriptor$InputData);
                        qpb.a block37 = new qpb.a(eVar2, topupWithNewCardFlowDescriptor$InputData, 19);
                        Intrinsics.checkNotNullParameter(block37, "block");
                        topupWithNewCardFlow.H = block37;
                        return topupWithNewCardFlow;
                    }
                    if (step12 instanceof CheckoutFlowContract$Step.CardDetails) {
                        CardDetailsScreen cardDetailsScreen = new CardDetailsScreen(new CardDetailsScreenDescriptor$InputData(false));
                        final int i103 = 4;
                        Function1 block38 = new Function1() { // from class: qwe.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i1032 = i103;
                                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar3 = eVar2;
                                Continuation continuation = null;
                                switch (i1032) {
                                    case 0:
                                        lxe.e outputData = (lxe.e) obj9;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        eVar3.n2(new qu4.s(eVar3, outputData, continuation, 9), new whi.b(6));
                                        return Unit.f186387a;
                                    case 1:
                                        we6.a0 result = (we6.a0) obj9;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, z.f296697a)) {
                                            eVar3.l2(new h(eVar3, null, 0), new yi5.b(26));
                                        } else if (!Intrinsics.f(result, we6.y.f296693a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        g7a.b result2 = (g7a.b) obj9;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (!Intrinsics.f(result2, g7a.b.f141141a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.l2(new h(eVar3, null, 1), new yi5.b(26));
                                        return Unit.f186387a;
                                    case 3:
                                        ste.u result3 = (ste.u) obj9;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 instanceof ste.s) {
                                            if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                                eVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                            }
                                        } else if (!(result3 instanceof ste.t)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        ste.b result4 = (ste.b) obj9;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        if (result4 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                            eVar3.f90703q.f300649b.setValue(eVar3.u.h((CardDetailsScreenDescriptor$OutputData$CardData) result4));
                                        } else {
                                            if (!(result4 instanceof ste.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Result not expected in this flow: " + result4);
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block38, "block");
                        cardDetailsScreen.H = block38;
                        return cardDetailsScreen;
                    }
                    if (step12 instanceof CheckoutFlowContract$Step.MoveMoney) {
                        ViewController viewControllerE110 = eVar2.e1(new y5i.a(((CheckoutFlowContract$Step.MoveMoney) step12).f90685a, null, 14));
                        qwe.d block39 = new qwe.d(eVar2, FlowCoordinator4);
                        Intrinsics.checkNotNullParameter(block39, "block");
                        viewControllerE110.H = block39;
                        return viewControllerE110;
                    }
                    if (step12 instanceof CheckoutFlowContract$Step.IndiaNetBankingTopUp) {
                        CheckoutFlowContract$Step.IndiaNetBankingTopUp indiaNetBankingTopUp = (CheckoutFlowContract$Step.IndiaNetBankingTopUp) step12;
                        ViewController viewControllerE111 = eVar2.e1(new x(indiaNetBankingTopUp.f90679a, Boolean.valueOf(indiaNetBankingTopUp.f90680b), indiaNetBankingTopUp.d, indiaNetBankingTopUp.f90681c));
                        Function1 block40 = new Function1() { // from class: qwe.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i1032 = i5;
                                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar3 = eVar2;
                                Continuation continuation = null;
                                switch (i1032) {
                                    case 0:
                                        lxe.e outputData = (lxe.e) obj9;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        eVar3.n2(new qu4.s(eVar3, outputData, continuation, 9), new whi.b(6));
                                        return Unit.f186387a;
                                    case 1:
                                        we6.a0 result = (we6.a0) obj9;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, z.f296697a)) {
                                            eVar3.l2(new h(eVar3, null, 0), new yi5.b(26));
                                        } else if (!Intrinsics.f(result, we6.y.f296693a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        g7a.b result2 = (g7a.b) obj9;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (!Intrinsics.f(result2, g7a.b.f141141a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.l2(new h(eVar3, null, 1), new yi5.b(26));
                                        return Unit.f186387a;
                                    case 3:
                                        ste.u result3 = (ste.u) obj9;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 instanceof ste.s) {
                                            if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                                eVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                            }
                                        } else if (!(result3 instanceof ste.t)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        ste.b result4 = (ste.b) obj9;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        if (result4 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                            eVar3.f90703q.f300649b.setValue(eVar3.u.h((CardDetailsScreenDescriptor$OutputData$CardData) result4));
                                        } else {
                                            if (!(result4 instanceof ste.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Result not expected in this flow: " + result4);
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block40, "block");
                        viewControllerE111.H = block40;
                        return viewControllerE111;
                    }
                    if (step12 instanceof CheckoutFlowContract$Step.IndiaUpiTopUp) {
                        CheckoutFlowContract$Step.IndiaUpiTopUp indiaUpiTopUp = (CheckoutFlowContract$Step.IndiaUpiTopUp) step12;
                        ViewController viewControllerE112 = eVar2.e1(new b0(indiaUpiTopUp.f90682a, Boolean.valueOf(indiaUpiTopUp.f90683b), indiaUpiTopUp.d, indiaUpiTopUp.f90684c));
                        qwe.d block41 = new qwe.d(FlowCoordinator4, eVar2);
                        Intrinsics.checkNotNullParameter(block41, "block");
                        viewControllerE112.H = block41;
                        return viewControllerE112;
                    }
                    if (step12 instanceof CheckoutFlowContract$Step.PocketDetails) {
                        CheckoutFlowContract$Step.PocketDetails pocketDetails = (CheckoutFlowContract$Step.PocketDetails) step12;
                        return eVar2.e1(new hda.a(new PocketDetailsFlowContract$InputData(pocketDetails.f90688a, pocketDetails.f90689b, false, true, (wi0.b) null, false, false, ((CheckoutFlowContract$State) ((j2) eVar2.L.f22677a).getValue()).f90671a, pocketDetails.f90690c, (PocketDetailsInitialAction) null, false, 3696)));
                    }
                    if (step12 instanceof CheckoutFlowContract$Step.PayNowTopUp) {
                        ViewController viewControllerE113 = eVar2.e1(new g7a.a(((CheckoutFlowContract$Step.PayNowTopUp) step12).f90687a, true));
                        Function1 block42 = new Function1() { // from class: qwe.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i1032 = i3;
                                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar3 = eVar2;
                                Continuation continuation = null;
                                switch (i1032) {
                                    case 0:
                                        lxe.e outputData = (lxe.e) obj9;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        eVar3.n2(new qu4.s(eVar3, outputData, continuation, 9), new whi.b(6));
                                        return Unit.f186387a;
                                    case 1:
                                        we6.a0 result = (we6.a0) obj9;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, z.f296697a)) {
                                            eVar3.l2(new h(eVar3, null, 0), new yi5.b(26));
                                        } else if (!Intrinsics.f(result, we6.y.f296693a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        g7a.b result2 = (g7a.b) obj9;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (!Intrinsics.f(result2, g7a.b.f141141a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.l2(new h(eVar3, null, 1), new yi5.b(26));
                                        return Unit.f186387a;
                                    case 3:
                                        ste.u result3 = (ste.u) obj9;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 instanceof ste.s) {
                                            if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                                eVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                            }
                                        } else if (!(result3 instanceof ste.t)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        ste.b result4 = (ste.b) obj9;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        if (result4 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                            eVar3.f90703q.f300649b.setValue(eVar3.u.h((CardDetailsScreenDescriptor$OutputData$CardData) result4));
                                        } else {
                                            if (!(result4 instanceof ste.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Result not expected in this flow: " + result4);
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block42, "block");
                        viewControllerE113.H = block42;
                        return viewControllerE113;
                    }
                    if (!(step12 instanceof CheckoutFlowContract$Step.UnverifiedOwnerLimitValueDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xye.d dVar4 = eVar2.I;
                    aue.d dVar5 = eVar2.J;
                    TopUpLimitUiModel topUpLimitUiModel = ((CheckoutFlowContract$Step.UnverifiedOwnerLimitValueDialog) step12).f90694a;
                    dVar5.getClass();
                    topUpLimitsBottomSheetController = new TopUpLimitsBottomSheetController(dVar4.b(zhm.u.c(aue.d.a(topUpLimitUiModel)), false));
                    final int i104 = 3;
                    Function1 block43 = new Function1() { // from class: qwe.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            int i1032 = i104;
                            com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar3 = eVar2;
                            Continuation continuation = null;
                            switch (i1032) {
                                case 0:
                                    lxe.e outputData = (lxe.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    eVar3.n2(new qu4.s(eVar3, outputData, continuation, 9), new whi.b(6));
                                    return Unit.f186387a;
                                case 1:
                                    we6.a0 result = (we6.a0) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, z.f296697a)) {
                                        eVar3.l2(new h(eVar3, null, 0), new yi5.b(26));
                                    } else if (!Intrinsics.f(result, we6.y.f296693a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g7a.b result2 = (g7a.b) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, g7a.b.f141141a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar3.l2(new h(eVar3, null, 1), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    ste.u result3 = (ste.u) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof ste.s) {
                                        if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                            eVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                        }
                                    } else if (!(result3 instanceof ste.t)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.b result4 = (ste.b) obj9;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                        eVar3.f90703q.f300649b.setValue(eVar3.u.h((CardDetailsScreenDescriptor$OutputData$CardData) result4));
                                    } else {
                                        if (!(result4 instanceof ste.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Result not expected in this flow: " + result4);
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block43, "block");
                    topUpLimitsBottomSheetController.H = block43;
                }
                return topUpLimitsBottomSheetController;
            case 16:
                return a(obj2, obj3);
            case 17:
                com.revolut.feature.kyc.impl.web_id.web_id_portal.a aVar12 = (com.revolut.feature.kyc.impl.web_id.web_id_portal.a) obj4;
                nx8.a aVar13 = aVar12.f77896p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WebIdPortalScreenContract$ModalStep step13 = (WebIdPortalScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof WebIdPortalScreenContract$ModalStep.CloseVideoCall) {
                    aVar13.getClass();
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(nx8.a.b(aVar13, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_close_confirmation_title, null, null, 14)));
                    qx8.p block44 = new qx8.p(aVar12, i5);
                    Intrinsics.checkNotNullParameter(block44, "block");
                    actionsBottomSheetController2.H = block44;
                    return actionsBottomSheetController2;
                }
                if (!Intrinsics.f(step13, WebIdPortalScreenContract$ModalStep.InterruptedVideoCall.f77895a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar13.getClass();
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(nx8.a.b(aVar13, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_interrupted_title, null, null, 14)));
                qx8.p block45 = new qx8.p(aVar12, i3);
                Intrinsics.checkNotNullParameter(block45, "block");
                actionsBottomSheetController3.H = block45;
                return actionsBottomSheetController3;
            case 18:
                RevPointsPersonalisationTargetingOnboardingResponse onboarding = (RevPointsPersonalisationTargetingOnboardingResponse) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(onboarding, "onboarding");
                ((qxb.c) obj4).f250061c.f("TARGETING_ONBOARDING_MEM_KEY", onboarding);
                return Unit.f186387a;
            case 19:
                CustomOrderAmountScreen customOrderAmountScreen = (CustomOrderAmountScreen) obj4;
                AmountEditDelegate.Model model4 = (AmountEditDelegate.Model) obj2;
                AmountEditView field4 = (AmountEditView) obj3;
                KProperty[] kPropertyArr4 = CustomOrderAmountScreen.R;
                Intrinsics.checkNotNullParameter(model4, "model");
                Intrinsics.checkNotNullParameter(field4, "field");
                MaskedTextInputEditText editText = field4.getEditText();
                Object obj9 = model4.f51629j;
                Intrinsics.i(obj9, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj9, (u80.d) customOrderAmountScreen.O.getValue(), null, new os2.g(customOrderAmountScreen, i2), false, false, 0, false, null, 1928);
            case 20:
                com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar14 = (com.revolut.feature.rev_points.impl.ui.opt_in.screen.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevPointsOptInScreenContract$ModalStep step14 = (RevPointsOptInScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof RevPointsOptInScreenContract$ModalStep.TermsReview)) {
                    throw new NoWhenBranchMatchedException();
                }
                k0c.a aVar15 = aVar14.f83823s;
                RevPointsTermsReviewInputData revPointsTermsReviewInputData = ((RevPointsOptInScreenContract$ModalStep.TermsReview) step14).f83819a;
                aVar15.getClass();
                RevPointsTermsReviewFlow revPointsTermsReviewFlowA = k0c.a.a(revPointsTermsReviewInputData);
                qzb.m block46 = new qzb.m(aVar14, i5);
                Intrinsics.checkNotNullParameter(block46, "block");
                revPointsTermsReviewFlowA.H = block46;
                return revPointsTermsReviewFlowA;
            case 21:
                String applicationId = (String) obj2;
                ky3.a content = (ky3.a) obj3;
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(content, "content");
                ((r24.d) obj4).f251050c.f("current_address_" + applicationId, content);
                return Unit.f186387a;
            case 22:
                com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a aVar16 = (com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a) obj4;
                FreelancerCreateTaxPocketFlowContract$Step step15 = (FreelancerCreateTaxPocketFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof FreelancerCreateTaxPocketFlowContract$Step.TaxReservation)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerTaxReservationScreen freelancerTaxReservationScreen = new FreelancerTaxReservationScreen(new FreelancerTaxReservationScreenContract$InputData(true));
                qi3.i block47 = new qi3.i(1, aVar16, com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a.class, "handleTaxReservationResult", "handleTaxReservationResult(Lcom/revolut/feature/freelancer/impl/ui/subaccount/create/screen/FreelancerTaxReservationScreenContract$OutputData;)V", 0, 16);
                Intrinsics.checkNotNullParameter(block47, "block");
                freelancerTaxReservationScreen.H = block47;
                return freelancerTaxReservationScreen;
            case 23:
                return b(obj2, obj3);
            case 24:
                com.revolut.feature.retail.cfd.impl.screens.home.a aVar17 = (com.revolut.feature.retail.cfd.impl.screens.home.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CfdTradingHomeScreenContract$ModalStep step16 = (CfdTradingHomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof CfdTradingHomeScreenContract$ModalStep.KompotDescriptor) {
                    return aVar17.e1(((CfdTradingHomeScreenContract$ModalStep.KompotDescriptor) step16).f82213a);
                }
                throw new NoWhenBranchMatchedException();
            case 25:
                com.revolut.feature.store.impl.ui.search.a aVar18 = (com.revolut.feature.store.impl.ui.search.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StoreSearchScreenContract$ModalStep step17 = (StoreSearchScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof StoreSearchScreenContract$ModalStep.ItemDetails) {
                    return aVar18.e1(new thd.a(((StoreSearchScreenContract$ModalStep.ItemDetails) step17).f88734a));
                }
                throw new NoWhenBranchMatchedException();
            case 26:
                return c(obj2, obj3);
            case 27:
                return d(obj2, obj3);
            case 28:
                return e(obj2, obj3);
            default:
                com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a aVar19 = (com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PayoutScenarioScreenContract$ModalStep step18 = (PayoutScenarioScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (!(step18 instanceof PayoutScenarioScreenContract$ModalStep.PayoutCalculator)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str10 = aVar19.o.f88899a;
                PayoutScenarioMapper$CalculatorParcel payoutScenarioMapper$CalculatorParcel = ((PayoutScenarioScreenContract$ModalStep.PayoutCalculator) step18).f88900a;
                return new PayoutCalculatorScreen(new PayoutCalculatorScreenContract$InputData(str10, payoutScenarioMapper$CalculatorParcel.f88862a, payoutScenarioMapper$CalculatorParcel.f88863b, payoutScenarioMapper$CalculatorParcel.f88864c, payoutScenarioMapper$CalculatorParcel.d));
        }
    }
}
