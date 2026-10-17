package xwd;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import aw0.u0;
import b1c.j;
import b1c.k;
import b1c.l;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Email;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Phone;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreenContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlow;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$EligibilityCheck$AccountRestriction;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$EligibilityCheck$AnnualInboundVolume;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$EligibilityCheck$KymNotPassedPrompt;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$EligibilityCheck$ProductArticle;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$EligibilityCheck$WebsiteUrlNotSubmittedPrompt;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$Sale$CardReader;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$Sale$Invoice;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$Sale$OrderInitPage;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$Sale$QrShare;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreen;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.junior.accounts.impl.ui.pocket_picker.JuniorPocketChildPickerScreen;
import com.revolut.feature.junior.accounts.impl.ui.pocket_picker.flow.JuniorPocketChildPickerFlowContract$Step;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.PeerToPeerChatOnlyFlowContract$Step;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$Step;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$ModalStep;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartIntervalSelectorBottomSheetControllerProvider$InputData;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartStyleSelectorBottomSheetControllerProvider$InputData;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartsIndicatorScreenProvider$InputData;
import com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.add.ChartAddBottomSheetController;
import com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.drawing_selector.ChartDrawingSelectorBottomSheetController;
import com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.interval_selector.ChartIntervalSelectorBottomSheetController;
import com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.style_selector.ChartStyleSelectorBottomSheetController;
import com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.AdvancedChartsScreenContract$ModalStep;
import com.revolut.feature.retail.advanced_charts.impl.screen.indicators.ChartsIndicatorScreen;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.cfd.impl.flows.position.CfdPositionFlowContract$Step;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreen;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidget;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreen;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.RevPointsTrophyRoomDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.RevPointsTrophyRoomDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.a;
import com.revolut.feature.rev_points.impl.ui.trophy_room.flow.RevPointsTrophyRoomFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.RevPointsTrophyRoomHomeScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.a;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.revolut_x_balances.impl.fiat.RevolutXFiatBalancesDetailsScreenContract$ModalStep;
import com.revolut.feature.selfserve.entity.config.shared.flow.EntityConfigFlowContract$InputData;
import com.revolut.feature.selfserve.entity.config.shared.flow.EntityConfigFlowContract$Step;
import com.revolut.feature.selfserve.entity.config.shared.ui.help.EntityHelpScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.help.EntityHelpScreenContract$InputData;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreenContract$InputData;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.feature.selfserve.sot.impl.ui.description.AddDescriptionController;
import com.revolut.feature.selfserve.sot.impl.ui.document.list.DocumentSelectionController;
import com.revolut.feature.selfserve.sot.impl.ui.document.other.OtherDocumentController;
import com.revolut.feature.selfserve.sot.impl.ui.evidencelist.EvidenceListController;
import com.revolut.feature.selfserve.sot.impl.ui.evidencetypes.EvidenceTypesController;
import com.revolut.feature.selfserve.sot.impl.ui.flow.LoadingController;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeController;
import com.revolut.feature.selfserve.sot.impl.ui.note.AddNoteController;
import com.revolut.feature.selfserve.sot.impl.ui.status.StatusController;
import com.revolut.feature.selfserve.sot.impl.ui.summary.SummaryController;
import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewControllerContract$ModalStep;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeControllerContract$ModalStep;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelectorBottomSheetProvider$InputData;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreen;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreen;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreenContract$ModalStep;
import com.revolut.feature.statements.impl.ui.documents_hub.period.bottom_sheet.StatementPeriodSelectorBottomSheet;
import com.revolut.feature.store.core.api.model.StoreProduct;
import com.revolut.feature.store.core.api.model.StoreProductStatusResponse;
import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$Step;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreenContract$InputData;
import com.revolut.feature.trading.impl.R$string;
import com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryControllerContract$ModalStep;
import com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData;
import com.revolut.feature.transfer.core.api.reason.ReasonTransferDetails;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.transfer.models.quotes.TransferAvailabilityReason;
import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreenContract$ModalStep;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import com.revolut.feature_move_money.impl.automation.flow.MoveMoneyAutomationFlow;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step;
import com.revolut.feature_move_money.impl.flow.delegate.ValidationResult$ConfirmationModalRequired;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreenContract$InputData;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.AirportLoungesPassActivityScreenContract$ModalStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreenContract$InputData;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyReason;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyReasonConfig;
import czc.r;
import czc.s;
import czc.t;
import grl.k9;
import ip0.gu;
import ip0.pb0;
import ip0.s7;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.s0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import oki.h;
import s7a.x;
import vkm.j2;
import xnl.f;
import y5b.g0;
import y5b.i0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;
import zyc.n;
import zyc.o;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f309347b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f309346a = i;
        this.f309347b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        y4d.l lVar = ((com.revolut.feature.settings.preview.displayCurrency.a) this.f309347b).o;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        DisplayCurrencyPreviewControllerContract$ModalStep step = (DisplayCurrencyPreviewControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, DisplayCurrencyPreviewControllerContract$ModalStep.CurrencyExchangeDisclaimerStep.f86027a)) {
            return com.revolut.feature.settings.preview.displayCurrency.a.I2(lVar.b().f310886b);
        }
        if (Intrinsics.f(step, DisplayCurrencyPreviewControllerContract$ModalStep.ShortcutHintStep.f86028a)) {
            return com.revolut.feature.settings.preview.displayCurrency.a.I2(lVar.b().f310887c);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object b(Object obj2, Object obj3) {
        a5f.a aVar = ((com.revolut.feature.trading.impl.ui.holdings.information.entry.a) this.f309347b).o;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        HoldingsInformationEntryControllerContract$ModalStep step = (HoldingsInformationEntryControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, HoldingsInformationEntryControllerContract$ModalStep.OnMarginCall.f91218a)) {
            ((a5f.b) aVar).getClass();
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.wealth_trading_holdings_information_bottom_sheet_on_margin_call_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_holdings_information_bottom_sheet_on_margin_call_details, null, null, 14), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
            k9 k9Var = k9.Trading;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        }
        if (!Intrinsics.f(step, HoldingsInformationEntryControllerContract$ModalStep.NotOnMarginCall.f91217a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((a5f.b) aVar).getClass();
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.wealth_trading_holdings_information_bottom_sheet_not_on_margin_call_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_holdings_information_bottom_sheet_not_on_margin_call_details, null, null, 14), null, null, false, 28);
        aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
        k9 k9Var2 = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar3, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b) this.f309347b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TravelFlightsBookingContactScreenContract$ModalStep step = (TravelFlightsBookingContactScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof TravelFlightsBookingContactScreenContract$ModalStep.CountrySelection)) {
            throw new NoWhenBranchMatchedException();
        }
        x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, null, y0.b(((TravelFlightsBookingContactScreenContract$ModalStep.CountrySelection) step).f93261a.f297794a), null, true, null, null, null, null, null, 2138832382);
        Object obj4 = bVar.f93267s.get();
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        PickerController pickerController = new PickerController(xVar, (x7a.d) obj4);
        y1.a block = new y1.a(bVar, 14);
        Intrinsics.checkNotNullParameter(block, "block");
        pickerController.H = block;
        return pickerController;
    }

    private final Object d(Object obj2, Object obj3) {
        i0 i0Var = (i0) this.f309347b;
        CobrandedCardsWidget domain = (CobrandedCardsWidget) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(domain, "domain");
        i0Var.f311047c.f("KEY_WIDGET", domain);
        return Unit.f186387a;
    }

    private final Object e(Object obj2, Object obj3) {
        q35.j jVar;
        com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.f309347b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        LoanInstalmentDetailsScreenContract$ModalStep step = (LoanInstalmentDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof LoanInstalmentDetailsScreenContract$ModalStep.Explainer)) {
            if (!(step instanceof LoanInstalmentDetailsScreenContract$ModalStep.AccountDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            x35.b bVar = ((LoanInstalmentDetailsScreenContract$ModalStep.AccountDetails) step).f70428a;
            LoanDetails loanDetails = (LoanDetails) ((y65.d) ((j2) aVar.f70439x.f22677a).getValue()).f311155a.getContent();
            return aVar.e1(new y35.a(bVar, (loanDetails == null || (jVar = loanDetails.f70144a.f70120s) == null) ? null : jVar.f));
        }
        LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer loanPaymentScheduleMapper$ScheduleStep$InfoExplainer = ((LoanInstalmentDetailsScreenContract$ModalStep.Explainer) step).f70429a;
        lw0.a aVar2 = new lw0.a(loanPaymentScheduleMapper$ScheduleStep$InfoExplainer.f70431b, loanPaymentScheduleMapper$ScheduleStep$InfoExplainer.f70432c, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(loanPaymentScheduleMapper$ScheduleStep$InfoExplainer.d, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a aVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a) this.f309347b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TravelFlightsSearchFiltersScreenContract$ModalStep step = (TravelFlightsSearchFiltersScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof TravelFlightsSearchFiltersScreenContract$ModalStep.Airlines)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelFlightsSearchFiltersScreenContract$ModalStep.Airlines airlines = (TravelFlightsSearchFiltersScreenContract$ModalStep.Airlines) step;
        TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen = new TravelFlightsAirlinesFilterScreen(new TravelFlightsAirlinesFilterScreenContract$InputData(airlines.f93402b, airlines.f93401a));
        y1.a block = new y1.a(aVar, 23);
        Intrinsics.checkNotNullParameter(block, "block");
        travelFlightsAirlinesFilterScreen.H = block;
        return travelFlightsAirlinesFilterScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.junior.accounts.impl.ui.pocket_picker.flow.a aVar = (com.revolut.feature.junior.accounts.impl.ui.pocket_picker.flow.a) this.f309347b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        JuniorPocketChildPickerFlowContract$Step step = (JuniorPocketChildPickerFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, JuniorPocketChildPickerFlowContract$Step.Picker.f76702a)) {
            throw new NoWhenBranchMatchedException();
        }
        JuniorPocketChildPickerScreen juniorPocketChildPickerScreen = new JuniorPocketChildPickerScreen();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        xyc.j block = new xyc.j(ref$ObjectRef, aVar, 21);
        Intrinsics.checkNotNullParameter(block, "block");
        juniorPocketChildPickerScreen.H = block;
        juniorPocketChildPickerScreen.l2(new c88.c(ref$ObjectRef, aVar, LazyFlowCoordinator, 2));
        return juniorPocketChildPickerScreen;
    }

    private final Object i(Object obj2, Object obj3) {
        Object obj4;
        RowActionsBottomSheetController rowActionsBottomSheetController;
        aw0.i gVar;
        RowActionsBottomSheetController rowActionsBottomSheetController2;
        Object dVar;
        com.revolut.feature_move_money.impl.flow.e eVar = (com.revolut.feature_move_money.impl.flow.e) this.f309347b;
        zof.f fVar = eVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        MoveMoneyFlowContract$Step step = (MoveMoneyFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        int i = 1;
        if (step instanceof MoveMoneyFlowContract$Step.MoveAmount) {
            MoveMoneyAmountScreen moveMoneyAmountScreen = new MoveMoneyAmountScreen(((MoveMoneyFlowContract$Step.MoveAmount) step).f97361a);
            y7i.c block = new y7i.c(eVar, i);
            Intrinsics.checkNotNullParameter(block, "block");
            moveMoneyAmountScreen.H = block;
            obj4 = moveMoneyAmountScreen;
        } else if (step instanceof MoveMoneyFlowContract$Step.Review) {
            MoveMoneyFlowContract$Step.Review review = (MoveMoneyFlowContract$Step.Review) step;
            MoveMoneyReviewScreen moveMoneyReviewScreen = new MoveMoneyReviewScreen(new MoveMoneyReviewScreenContract$InputData(review.f97364a.f97347a, review.f97365b));
            xyc.j jVar = new xyc.j(eVar, review, 27);
            Intrinsics.checkNotNullParameter(jVar, "<set-?>");
            moveMoneyReviewScreen.H = jVar;
            obj4 = moveMoneyReviewScreen;
        } else if (Intrinsics.f(step, MoveMoneyFlowContract$Step.Schedule.f97368a)) {
            ScheduleTransferScreen scheduleTransferScreenD = ((qpf.h) fVar).d(new ScheduleTransferInputData((TextLocalisedClause) null, new TransferScheduleData(0L, (jli.c) null, 7), m1l.a.SCHEDULE_REQUIRED, (TextLocalisedClause) null, (List) null, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 8185));
            y7i.c cVar = new y7i.c(eVar, 3);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            scheduleTransferScreenD.H = cVar;
            obj4 = scheduleTransferScreenD;
        } else if (step instanceof MoveMoneyFlowContract$Step.Topup) {
            MoveMoneyTopupScreen moveMoneyTopupScreen = new MoveMoneyTopupScreen(((MoveMoneyFlowContract$Step.Topup) step).f97369a);
            xyc.j block2 = new xyc.j(eVar, LazyFlowCoordinator, 29);
            Intrinsics.checkNotNullParameter(block2, "block");
            moveMoneyTopupScreen.H = block2;
            obj4 = moveMoneyTopupScreen;
        } else if (step instanceof MoveMoneyFlowContract$Step.ScaPrompt) {
            MoveMoneyFlowContract$Step.ScaPrompt scaPrompt = (MoveMoneyFlowContract$Step.ScaPrompt) step;
            ViewController viewControllerE1 = eVar.e1(new wrc.a(scaPrompt.f97366a, null, 14));
            xyc.j block3 = new xyc.j(eVar, scaPrompt, 26);
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE1.H = block3;
            obj4 = viewControllerE1;
        } else {
            int i2 = 24;
            if (step instanceof MoveMoneyFlowContract$Step.ExchangeGlobalAccessModal) {
                bla.c cVar2 = ((MoveMoneyFlowContract$Step.ExchangeGlobalAccessModal) step).f97355a;
                t99.k kVar = eVar.f97395t;
                k9 value = frl.a.f137500l;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                AnalyticsProduct.Retail retail = new AnalyticsProduct.Retail(value);
                kVar.getClass();
                ExchangeGlobalAccessFlow exchangeGlobalAccessFlowA = t99.k.a(cVar2, retail);
                eVar.a(exchangeGlobalAccessFlowA, new u3a.p(eVar, step, i2));
                obj4 = exchangeGlobalAccessFlowA;
            } else if (step instanceof MoveMoneyFlowContract$Step.Reason) {
                MoveMoneyFlowContract$Step.Reason reason = (MoveMoneyFlowContract$Step.Reason) step;
                MoveMoneyReasonConfig moveMoneyReasonConfig = reason.f97363b;
                Intrinsics.checkNotNullParameter(moveMoneyReasonConfig, "<this>");
                ArrayList<MoveMoneyReason> arrayList = moveMoneyReasonConfig.f104801a;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (MoveMoneyReason moveMoneyReason : arrayList) {
                    Intrinsics.checkNotNullParameter(moveMoneyReason, "<this>");
                    if (moveMoneyReason instanceof MoveMoneyReason.Predefined) {
                        MoveMoneyReason.Predefined predefined = (MoveMoneyReason.Predefined) moveMoneyReason;
                        dVar = new krf.e(predefined.f104799a, predefined.f104800b, null);
                    } else {
                        if (!(moveMoneyReason instanceof MoveMoneyReason.Custom)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = new krf.d(((MoveMoneyReason.Custom) moveMoneyReason).f104798a);
                    }
                    arrayList2.add(dVar);
                }
                krf.f fVar2 = new krf.f(moveMoneyReasonConfig.f104803c, arrayList2, moveMoneyReasonConfig.f104802b);
                MoveMoneyOrderInfo moveMoneyOrderInfo = reason.f97362a.f97347a;
                Object objA = ((qpf.h) fVar).a(new ReasonForTransferInputData(new ReasonTransferDetails.Link(moveMoneyOrderInfo.f97403c, null, hx7.e.k(moveMoneyOrderInfo)), fVar2, false));
                xyc.j jVar2 = new xyc.j(eVar, step, i2);
                Intrinsics.checkNotNullParameter(jVar2, "<set-?>");
                ((BaseFlow) objA).J = jVar2;
                obj4 = objA;
            } else {
                int i3 = 2;
                if (step instanceof MoveMoneyFlowContract$Step.ConfirmationModal) {
                    MoveMoneyFlowContract$Step.ConfirmationModal.ConfirmationModalState confirmationModalState = ((MoveMoneyFlowContract$Step.ConfirmationModal) step).f97351a;
                    o7i.b bVar = eVar.u;
                    ValidationResult$ConfirmationModalRequired validation = confirmationModalState.f97352a;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(validation, "validation");
                    if (Intrinsics.f(validation, ValidationResult$ConfirmationModalRequired.SavingsChallengeWithdrawConfirmationRequired.f97383a)) {
                        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_sheets_withdraw_challenge_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_sheets_withdraw_challenge_subtitle, null, null, 14), null, null, false, 28);
                        f0 f0Var = f0.f322471a;
                        aw0.g gVar2 = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                        k9 value2 = k9.Savings;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value2, "value");
                        rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar, gVar2, f0Var, new AnalyticsProduct.Retail(value2), null));
                    } else {
                        if (validation instanceof ValidationResult$ConfirmationModalRequired.WalletBalanceLimitExceeded) {
                            ValidationResult$ConfirmationModalRequired.WalletBalanceLimitExceeded validation2 = (ValidationResult$ConfirmationModalRequired.WalletBalanceLimitExceeded) validation;
                            Intrinsics.checkNotNullParameter(validation2, "validation");
                            dj0.d dVar2 = validation2.f97385b;
                            TextLocalisedClause textLocalisedClause = dVar2 != null ? new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_wallet_balance_limit_subtitle_with_conversion, v.k(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(validation2.f97386c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_wallet_balance_limit_subtitle, u.c(new MoneyClause(validation2.f97386c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                            CompositeClause compositeClause = new CompositeClause(v.k(new MoneyClause(validation2.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(validation2.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, null, null, 14);
                            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_wallet_balance_limit_title, null, null, 14), textLocalisedClause, null, null, false, 28);
                            List listC = u.c(new eii.b(new CellDetailsDelegate.Model("wallet_balance_limit", new t0(validation2.f, (Image) null, 0, false, 30), compositeClause, null, null, null, u0.MEDIUM, 0, null, false, false, null, null, 28408)));
                            aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_wallet_balance_limit_edit_amount, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                            k9 value3 = k9.Payments;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                            Intrinsics.checkNotNullParameter(value3, "value");
                            rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar2, eVar2, listC, new AnalyticsProduct.Retail(value3), null));
                        } else if (validation instanceof ValidationResult$ConfirmationModalRequired.KillSwitchConfirmationRequired) {
                            ValidationResult$ConfirmationModalRequired.KillSwitchConfirmationRequired validation3 = (ValidationResult$ConfirmationModalRequired.KillSwitchConfirmationRequired) validation;
                            TransferAvailabilityReason transferAvailabilityReason = validation3.f97381a;
                            Intrinsics.checkNotNullParameter(validation3, "validation");
                            lw0.a aVar3 = new lw0.a(new TextClause(transferAvailabilityReason.f92279a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new HtmlClause(0, 30, (Integer) null, (Object) null, transferAvailabilityReason.f92280b), null, null, false, 28);
                            f0 f0Var2 = f0.f322471a;
                            int i5 = p7i.a.f233771a[validation3.f97382b.ordinal()];
                            if (i5 == 1) {
                                m6 m6Var = n6.Companion;
                                gVar = new aw0.g(m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                gVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                            }
                            aw0.i iVar = gVar;
                            k9 value4 = k9.Retail;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                            Intrinsics.checkNotNullParameter(value4, "value");
                            rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar3, iVar, f0Var2, new AnalyticsProduct.Retail(value4), null));
                        } else {
                            if (!(validation instanceof ValidationResult$ConfirmationModalRequired.CfdMarginCallRiskIncrease)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ValidationResult$ConfirmationModalRequired.CfdMarginCallRiskIncrease validation4 = (ValidationResult$ConfirmationModalRequired.CfdMarginCallRiskIncrease) validation;
                            Intrinsics.checkNotNullParameter(validation4, "validation");
                            lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_withdraw_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_withdraw_confirmation_description, null, null, 14), null, null, false, 28);
                            f0 f0Var3 = f0.f322471a;
                            m6 m6Var2 = n6.Companion;
                            aw0.h hVar = new aw0.h(false, m6.c(m6Var2, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_withdraw_confirmation_confirm, u.c(new MoneyClause(validation4.f97380a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_withdraw_confirmation_edit, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                            k9 value5 = k9.Wealth;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                            Intrinsics.checkNotNullParameter(value5, "value");
                            rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar4, hVar, f0Var3, new AnalyticsProduct.Retail(value5), null));
                        }
                        rowActionsBottomSheetController2 = rowActionsBottomSheetController;
                    }
                    xyc.j block4 = new xyc.j(eVar, confirmationModalState, 25);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    rowActionsBottomSheetController2.H = block4;
                    obj4 = rowActionsBottomSheetController2;
                } else if (step instanceof MoveMoneyFlowContract$Step.FirmPriceDeviance) {
                    MoveMoneyFlowContract$Step.FirmPriceDeviance firmPriceDeviance = (MoveMoneyFlowContract$Step.FirmPriceDeviance) step;
                    ViewController viewControllerE12 = eVar.e1(new nyh.c(firmPriceDeviance.f97358a));
                    xyc.j block5 = new xyc.j(eVar, firmPriceDeviance, 28);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE12.H = block5;
                    obj4 = viewControllerE12;
                } else {
                    if (!(step instanceof MoveMoneyFlowContract$Step.Automation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MoveMoneyAutomationFlow moveMoneyAutomationFlow = new MoveMoneyAutomationFlow(((MoveMoneyFlowContract$Step.Automation) step).f97350a, eVar.f97396w, eVar.f97397x);
                    y7i.c block6 = new y7i.c(eVar, i3);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    moveMoneyAutomationFlow.H = block6;
                    obj4 = moveMoneyAutomationFlow;
                }
            }
        }
        return (com.revolut.kompot.navigable.a) obj4;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object j(Object obj2, Object obj3) {
        PaymentLinksAmountScreen paymentLinksAmountScreen = (PaymentLinksAmountScreen) this.f309347b;
        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = PaymentLinksAmountScreen.f0;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        Object obj4 = data.f51981p;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
        return new zp0.d(editText, ((yof.b) obj4).f315672a, (u80.d) paymentLinksAmountScreen.Q.getValue(), null, null, false, false, 0, false, null, 1944);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController entityHelpScreen;
        EntityHomeScreenContract$InputData screenContent;
        ViewController statusController;
        ViewController viewControllerE1;
        boolean z;
        List list;
        boolean z3;
        ViewController freelancerQrShareScreen;
        List preselectedContacts;
        ActionsBottomSheetController actionsBottomSheetController;
        int i = this.f309346a;
        int i2 = 5;
        int i3 = 14;
        final int i5 = 4;
        final int i6 = 3;
        Object obj4 = this.f309347b;
        switch (i) {
            case 0:
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                UnstakeController.Companion aVar = UnstakeController.INSTANCE;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.staking.impl.unstake.v2.UnstakeControllerContract.AmountParcel");
                i iVar = (i) obj5;
                return new zp0.d(field.getEditText(), iVar.f309351b, new u80.d(iVar.f309350a), null, new t1j.b((UnstakeController) obj4, 23), false, false, 0, false, null, 1960);
            case 1:
                com.revolut.feature.staking.impl.unstake.v2.a aVar2 = (com.revolut.feature.staking.impl.unstake.v2.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                UnstakeControllerContract$ModalStep step = (UnstakeControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof UnstakeControllerContract$ModalStep.LockUpDialog) {
                    return aVar2.e1(new nc5.h(((UnstakeControllerContract$ModalStep.LockUpDialog) step).f88161a));
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                com.revolut.feature.selfserve.entity.config.shared.flow.a aVar3 = (com.revolut.feature.selfserve.entity.config.shared.flow.a) obj4;
                EntityConfigFlowContract$InputData entityConfigFlowContract$InputData = aVar3.o;
                EntityConfigFlowContract$Step step2 = (EntityConfigFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof EntityConfigFlowContract$Step.Home) {
                    if (entityConfigFlowContract$InputData instanceof EntityConfigFlowContract$InputData.Params) {
                        EntityConfigFlowContract$InputData.Params params = (EntityConfigFlowContract$InputData.Params) entityConfigFlowContract$InputData;
                        screenContent = new EntityHomeScreenContract$InputData.Params(params.f85824b, params.f85823a);
                    } else {
                        if (!(entityConfigFlowContract$InputData instanceof EntityConfigFlowContract$InputData.ScreenContent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EntityConfigFlowContract$InputData.ScreenContent screenContent2 = (EntityConfigFlowContract$InputData.ScreenContent) entityConfigFlowContract$InputData;
                        screenContent = new EntityHomeScreenContract$InputData.ScreenContent(screenContent2.f85826b, screenContent2.f85825a);
                    }
                    entityHelpScreen = new EntityHomeScreen(screenContent);
                    xw9.c block = new xw9.c(aVar3, i2);
                    Intrinsics.checkNotNullParameter(block, "block");
                    entityHelpScreen.H = block;
                } else {
                    if (!(step2 instanceof EntityConfigFlowContract$Step.Help)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(entityConfigFlowContract$InputData instanceof EntityConfigFlowContract$InputData.Params)) {
                        if (entityConfigFlowContract$InputData instanceof EntityConfigFlowContract$InputData.ScreenContent) {
                            throw new IllegalStateException("Help screen is not supported for provided Entity Config content");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    entityHelpScreen = new EntityHelpScreen(new EntityHelpScreenContract$InputData(((EntityConfigFlowContract$InputData.Params) entityConfigFlowContract$InputData).f85824b));
                }
                return entityHelpScreen;
            case 3:
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a aVar4 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AirportLoungesPassActivityScreenContract$ModalStep step3 = (AirportLoungesPassActivityScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof AirportLoungesPassActivityScreenContract$ModalStep.Filters)) {
                    throw new NoWhenBranchMatchedException();
                }
                AirportLoungesPassActivityScreenContract$ModalStep.Filters filters = (AirportLoungesPassActivityScreenContract$ModalStep.Filters) step3;
                AirportLoungesPassActivityFiltersScreen airportLoungesPassActivityFiltersScreen = new AirportLoungesPassActivityFiltersScreen(new AirportLoungesPassActivityFiltersScreenContract$InputData(filters.f99114a, filters.f99115b));
                xw9.c block2 = new xw9.c(aVar4, 11);
                Intrinsics.checkNotNullParameter(block2, "block");
                airportLoungesPassActivityFiltersScreen.H = block2;
                return airportLoungesPassActivityFiltersScreen;
            case 4:
                xy7.o oVar = (xy7.o) obj4;
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                oVar.o.getClass();
                s0 s0Var = new s0(3);
                s7 s7Var = new s7("ADDRESS_CHANGE_LOADING_ITEM", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                s0Var.a(s7Var);
                s0Var.a(new gu("ADDRESS_CHANGE_LOADING_ITEM", 0, 0, 30));
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    it8.nextInt();
                    arrayList.add(new pb0("ADDRESS_CHANGE_LOADING_ITEM"));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                s0Var.b(arrayList.toArray(new pb0[0]));
                ArrayList arrayList2 = s0Var.f186433a;
                return new Pair(null, v.k(arrayList2.toArray(new koi.j[arrayList2.size()])));
            case 5:
                com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b bVar = (com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AllReferralsScreenContract$ModalStep step4 = (AllReferralsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof AllReferralsScreenContract$ModalStep.IneligibilityDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                cya.g gVar = bVar.f81928t;
                String str = ((AllReferralsScreenContract$ModalStep.IneligibilityDialog) step4).f81923a;
                xlb.o oVar2 = new xlb.o(1, bVar.u, cya.f.class, "handleDeeplink", "handleDeeplink(Ljava/lang/String;)V", 0, 12);
                gVar.getClass();
                return cya.g.a(str, oVar2);
            case 6:
                final com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar = (com.revolut.feature.selfserve.sot.impl.ui.flow.e) obj4;
                qki.d dVar = eVar.v;
                final yki.l FlowCoordinator = (yki.l) obj2;
                SotFlowContract$Step step5 = (SotFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (Intrinsics.f(step5, SotFlowContract$Step.Loading.f85930a)) {
                    return new LoadingController();
                }
                if (Intrinsics.f(step5, SotFlowContract$Step.Home.f85929a)) {
                    statusController = new SotHomeController(((SotFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f85911a);
                    final int i21 = 0;
                    Function1 block3 = new Function1() { // from class: xyc.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i21) {
                                case 0:
                                    o output = (o) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof n;
                                    com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar2 = eVar;
                                    if (z4) {
                                        oki.h.t2(eVar2, FlowCoordinator, SotFlowContract$Step.Status.f85932a, true, null, false, 12);
                                    } else {
                                        if (!(output instanceof zyc.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar2.B2();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar3 = eVar;
                                    qki.d dVar2 = eVar3.v;
                                    bzc.o output2 = (bzc.o) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z6 = true;
                                    if (output2 instanceof bzc.n) {
                                        bzc.n nVar = (bzc.n) output2;
                                        SubmissionEvidence submissionEvidence = nVar.f19965b;
                                        if (submissionEvidence != null) {
                                            eVar3.H2(dVar2, new xx9.f(13));
                                        }
                                        eVar3.H2(dVar2, new xw9.c(output2, 15));
                                        j2 j2Var = (j2) dVar2.f22677a;
                                        yki.l lVar = FlowCoordinator;
                                        if (submissionEvidence != null) {
                                            oki.h.t2(eVar3, lVar, eVar3.K2(), true, null, false, 12);
                                        } else {
                                            String str2 = nVar.f19964a;
                                            if (((SotFlowContract$FlowState) j2Var.getValue()).f.isEmpty() && ((SotFlowContract$FlowState) j2Var.getValue()).f85914g.length() <= 0) {
                                                z6 = false;
                                            }
                                            oki.h.t2(eVar3, lVar, new SotFlowContract$Step.EvidenceTypes(str2, z6), true, null, false, 12);
                                        }
                                    } else if (output2 instanceof bzc.m) {
                                        eVar3.F1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                    } else {
                                        if (!(output2 instanceof bzc.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.B2();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar4 = eVar;
                                    qki.d dVar3 = eVar4.v;
                                    czc.v output3 = (czc.v) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z11 = output3 instanceof s;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z11) {
                                        String str3 = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85915h;
                                        String str4 = str3.length() > 0 ? str3 : null;
                                        if (str4 == null) {
                                            str4 = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).i;
                                        }
                                        oki.h.t2(eVar4, lVar2, new SotFlowContract$Step.AddNote(str4), false, null, false, 12);
                                    } else if (output3 instanceof t) {
                                        eVar4.H2(dVar3, new xw9.c(output3, 19));
                                        oki.h.t2(eVar4, lVar2, new SotFlowContract$Step.EvidenceList(((t) output3).f110218a, ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).k, ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85917l, true), true, null, false, 12);
                                    } else if (output3 instanceof czc.u) {
                                        eVar4.l2(new xb4.e(eVar4, null, 17), new yi5.b(26));
                                    } else {
                                        if (!(output3 instanceof r)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar4.B2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar5 = eVar;
                                    qki.d dVar4 = eVar5.v;
                                    final azc.l output4 = (azc.l) obj6;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z12 = output4 instanceof azc.k;
                                    yki.l lVar3 = FlowCoordinator;
                                    if (z12) {
                                        final int i22 = 0;
                                        eVar5.H2(dVar4, new Function1() { // from class: xyc.h
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj7) {
                                                SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj7;
                                                switch (i22) {
                                                    case 0:
                                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                                        String str5 = ((azc.k) output4).f11435a;
                                                        return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, str5, str5, null, null, null, null, false, 15999);
                                                    default:
                                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                                        return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, null, ((azc.j) output4).f11434a, null, null, null, null, false, 16127);
                                                }
                                            }
                                        });
                                        oki.h.t2(eVar5, lVar3, eVar5.K2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else {
                                        if (!(output4 instanceof azc.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        final int i32 = 1;
                                        eVar5.H2(dVar4, new Function1() { // from class: xyc.h
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj7) {
                                                SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj7;
                                                switch (i32) {
                                                    case 0:
                                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                                        String str5 = ((azc.k) output4).f11435a;
                                                        return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, str5, str5, null, null, null, null, false, 15999);
                                                    default:
                                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                                        return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, null, ((azc.j) output4).f11434a, null, null, null, null, false, 16127);
                                                }
                                            }
                                        });
                                        oki.h.t2(eVar5, lVar3, eVar5.K2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    statusController.H = block3;
                } else {
                    if (!Intrinsics.f(step5, SotFlowContract$Step.Status.f85932a)) {
                        if (step5 instanceof SotFlowContract$Step.EvidenceTypes) {
                            SotFlowContract$Step.EvidenceTypes evidenceTypes = (SotFlowContract$Step.EvidenceTypes) step5;
                            EvidenceTypesController evidenceTypesController = new EvidenceTypesController(evidenceTypes.f85927a, ((SotFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f85913c, evidenceTypes.f85928b);
                            xyc.k block4 = new xyc.k(eVar, 0);
                            Intrinsics.checkNotNullParameter(block4, "block");
                            evidenceTypesController.H = block4;
                            return evidenceTypesController;
                        }
                        if (step5 instanceof SotFlowContract$Step.EvidenceDescription) {
                            AddDescriptionController addDescriptionController = new AddDescriptionController(((SotFlowContract$Step.EvidenceDescription) step5).f85923a);
                            xyc.k block5 = new xyc.k(eVar, 1);
                            Intrinsics.checkNotNullParameter(block5, "block");
                            addDescriptionController.H = block5;
                            return addDescriptionController;
                        }
                        if (step5 instanceof SotFlowContract$Step.EvidenceList) {
                            EvidenceListController evidenceListController = new EvidenceListController((SotFlowContract$Step.EvidenceList) step5);
                            xyc.k block6 = new xyc.k(eVar, 2);
                            Intrinsics.checkNotNullParameter(block6, "block");
                            evidenceListController.H = block6;
                            return evidenceListController;
                        }
                        final int i22 = 2;
                        if (step5 instanceof SotFlowContract$Step.Summary) {
                            SummaryController summaryController = new SummaryController((SotFlowContract$Step.Summary) step5);
                            Function1 block7 = new Function1() { // from class: xyc.i
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    switch (i22) {
                                        case 0:
                                            o output = (o) obj6;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            boolean z4 = output instanceof n;
                                            com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar2 = eVar;
                                            if (z4) {
                                                oki.h.t2(eVar2, FlowCoordinator, SotFlowContract$Step.Status.f85932a, true, null, false, 12);
                                            } else {
                                                if (!(output instanceof zyc.m)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                eVar2.B2();
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar3 = eVar;
                                            qki.d dVar2 = eVar3.v;
                                            bzc.o output2 = (bzc.o) obj6;
                                            Intrinsics.checkNotNullParameter(output2, "output");
                                            boolean z6 = true;
                                            if (output2 instanceof bzc.n) {
                                                bzc.n nVar = (bzc.n) output2;
                                                SubmissionEvidence submissionEvidence = nVar.f19965b;
                                                if (submissionEvidence != null) {
                                                    eVar3.H2(dVar2, new xx9.f(13));
                                                }
                                                eVar3.H2(dVar2, new xw9.c(output2, 15));
                                                j2 j2Var = (j2) dVar2.f22677a;
                                                yki.l lVar = FlowCoordinator;
                                                if (submissionEvidence != null) {
                                                    oki.h.t2(eVar3, lVar, eVar3.K2(), true, null, false, 12);
                                                } else {
                                                    String str2 = nVar.f19964a;
                                                    if (((SotFlowContract$FlowState) j2Var.getValue()).f.isEmpty() && ((SotFlowContract$FlowState) j2Var.getValue()).f85914g.length() <= 0) {
                                                        z6 = false;
                                                    }
                                                    oki.h.t2(eVar3, lVar, new SotFlowContract$Step.EvidenceTypes(str2, z6), true, null, false, 12);
                                                }
                                            } else if (output2 instanceof bzc.m) {
                                                eVar3.F1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                            } else {
                                                if (!(output2 instanceof bzc.l)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                eVar3.B2();
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar4 = eVar;
                                            qki.d dVar3 = eVar4.v;
                                            czc.v output3 = (czc.v) obj6;
                                            Intrinsics.checkNotNullParameter(output3, "output");
                                            boolean z11 = output3 instanceof s;
                                            yki.l lVar2 = FlowCoordinator;
                                            if (z11) {
                                                String str3 = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85915h;
                                                String str4 = str3.length() > 0 ? str3 : null;
                                                if (str4 == null) {
                                                    str4 = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).i;
                                                }
                                                oki.h.t2(eVar4, lVar2, new SotFlowContract$Step.AddNote(str4), false, null, false, 12);
                                            } else if (output3 instanceof t) {
                                                eVar4.H2(dVar3, new xw9.c(output3, 19));
                                                oki.h.t2(eVar4, lVar2, new SotFlowContract$Step.EvidenceList(((t) output3).f110218a, ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).k, ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85917l, true), true, null, false, 12);
                                            } else if (output3 instanceof czc.u) {
                                                eVar4.l2(new xb4.e(eVar4, null, 17), new yi5.b(26));
                                            } else {
                                                if (!(output3 instanceof r)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                eVar4.B2();
                                            }
                                            return Unit.f186387a;
                                        default:
                                            com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar5 = eVar;
                                            qki.d dVar4 = eVar5.v;
                                            final azc.l output4 = (azc.l) obj6;
                                            Intrinsics.checkNotNullParameter(output4, "output");
                                            boolean z12 = output4 instanceof azc.k;
                                            yki.l lVar3 = FlowCoordinator;
                                            if (z12) {
                                                final int i222 = 0;
                                                eVar5.H2(dVar4, new Function1() { // from class: xyc.h
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj7;
                                                        switch (i222) {
                                                            case 0:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                String str5 = ((azc.k) output4).f11435a;
                                                                return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, str5, str5, null, null, null, null, false, 15999);
                                                            default:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, null, ((azc.j) output4).f11434a, null, null, null, null, false, 16127);
                                                        }
                                                    }
                                                });
                                                oki.h.t2(eVar5, lVar3, eVar5.K2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                            } else {
                                                if (!(output4 instanceof azc.j)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                final int i32 = 1;
                                                eVar5.H2(dVar4, new Function1() { // from class: xyc.h
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj7;
                                                        switch (i32) {
                                                            case 0:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                String str5 = ((azc.k) output4).f11435a;
                                                                return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, str5, str5, null, null, null, null, false, 15999);
                                                            default:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, null, ((azc.j) output4).f11434a, null, null, null, null, false, 16127);
                                                        }
                                                    }
                                                });
                                                oki.h.t2(eVar5, lVar3, eVar5.K2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block7, "block");
                            summaryController.H = block7;
                            return summaryController;
                        }
                        if (step5 instanceof SotFlowContract$Step.AddNote) {
                            AddNoteController addNoteController = new AddNoteController(((SotFlowContract$Step.AddNote) step5).f85920a);
                            Function1 block8 = new Function1() { // from class: xyc.i
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    switch (i6) {
                                        case 0:
                                            o output = (o) obj6;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            boolean z4 = output instanceof n;
                                            com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar2 = eVar;
                                            if (z4) {
                                                oki.h.t2(eVar2, FlowCoordinator, SotFlowContract$Step.Status.f85932a, true, null, false, 12);
                                            } else {
                                                if (!(output instanceof zyc.m)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                eVar2.B2();
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar3 = eVar;
                                            qki.d dVar2 = eVar3.v;
                                            bzc.o output2 = (bzc.o) obj6;
                                            Intrinsics.checkNotNullParameter(output2, "output");
                                            boolean z6 = true;
                                            if (output2 instanceof bzc.n) {
                                                bzc.n nVar = (bzc.n) output2;
                                                SubmissionEvidence submissionEvidence = nVar.f19965b;
                                                if (submissionEvidence != null) {
                                                    eVar3.H2(dVar2, new xx9.f(13));
                                                }
                                                eVar3.H2(dVar2, new xw9.c(output2, 15));
                                                j2 j2Var = (j2) dVar2.f22677a;
                                                yki.l lVar = FlowCoordinator;
                                                if (submissionEvidence != null) {
                                                    oki.h.t2(eVar3, lVar, eVar3.K2(), true, null, false, 12);
                                                } else {
                                                    String str2 = nVar.f19964a;
                                                    if (((SotFlowContract$FlowState) j2Var.getValue()).f.isEmpty() && ((SotFlowContract$FlowState) j2Var.getValue()).f85914g.length() <= 0) {
                                                        z6 = false;
                                                    }
                                                    oki.h.t2(eVar3, lVar, new SotFlowContract$Step.EvidenceTypes(str2, z6), true, null, false, 12);
                                                }
                                            } else if (output2 instanceof bzc.m) {
                                                eVar3.F1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                            } else {
                                                if (!(output2 instanceof bzc.l)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                eVar3.B2();
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar4 = eVar;
                                            qki.d dVar3 = eVar4.v;
                                            czc.v output3 = (czc.v) obj6;
                                            Intrinsics.checkNotNullParameter(output3, "output");
                                            boolean z11 = output3 instanceof s;
                                            yki.l lVar2 = FlowCoordinator;
                                            if (z11) {
                                                String str3 = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85915h;
                                                String str4 = str3.length() > 0 ? str3 : null;
                                                if (str4 == null) {
                                                    str4 = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).i;
                                                }
                                                oki.h.t2(eVar4, lVar2, new SotFlowContract$Step.AddNote(str4), false, null, false, 12);
                                            } else if (output3 instanceof t) {
                                                eVar4.H2(dVar3, new xw9.c(output3, 19));
                                                oki.h.t2(eVar4, lVar2, new SotFlowContract$Step.EvidenceList(((t) output3).f110218a, ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).k, ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85917l, true), true, null, false, 12);
                                            } else if (output3 instanceof czc.u) {
                                                eVar4.l2(new xb4.e(eVar4, null, 17), new yi5.b(26));
                                            } else {
                                                if (!(output3 instanceof r)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                eVar4.B2();
                                            }
                                            return Unit.f186387a;
                                        default:
                                            com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar5 = eVar;
                                            qki.d dVar4 = eVar5.v;
                                            final azc.l output4 = (azc.l) obj6;
                                            Intrinsics.checkNotNullParameter(output4, "output");
                                            boolean z12 = output4 instanceof azc.k;
                                            yki.l lVar3 = FlowCoordinator;
                                            if (z12) {
                                                final int i222 = 0;
                                                eVar5.H2(dVar4, new Function1() { // from class: xyc.h
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj7;
                                                        switch (i222) {
                                                            case 0:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                String str5 = ((azc.k) output4).f11435a;
                                                                return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, str5, str5, null, null, null, null, false, 15999);
                                                            default:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, null, ((azc.j) output4).f11434a, null, null, null, null, false, 16127);
                                                        }
                                                    }
                                                });
                                                oki.h.t2(eVar5, lVar3, eVar5.K2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                            } else {
                                                if (!(output4 instanceof azc.j)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                final int i32 = 1;
                                                eVar5.H2(dVar4, new Function1() { // from class: xyc.h
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj7;
                                                        switch (i32) {
                                                            case 0:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                String str5 = ((azc.k) output4).f11435a;
                                                                return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, str5, str5, null, null, null, null, false, 15999);
                                                            default:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, null, ((azc.j) output4).f11434a, null, null, null, null, false, 16127);
                                                        }
                                                    }
                                                });
                                                oki.h.t2(eVar5, lVar3, eVar5.K2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block8, "block");
                            addNoteController.H = block8;
                            return addNoteController;
                        }
                        if (step5 instanceof SotFlowContract$Step.DocumentSelection) {
                            SotFlowContract$Step.DocumentSelection documentSelection = (SotFlowContract$Step.DocumentSelection) step5;
                            DocumentSelectionController documentSelectionController = new DocumentSelectionController(documentSelection.f85921a, documentSelection.f85922b);
                            xyc.k block9 = new xyc.k(eVar, i6);
                            Intrinsics.checkNotNullParameter(block9, "block");
                            documentSelectionController.H = block9;
                            return documentSelectionController;
                        }
                        if (!(step5 instanceof SotFlowContract$Step.OtherDocument)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        OtherDocumentController otherDocumentController = new OtherDocumentController(((SotFlowContract$Step.OtherDocument) step5).f85931a);
                        xyc.k block10 = new xyc.k(eVar, i5);
                        Intrinsics.checkNotNullParameter(block10, "block");
                        otherDocumentController.H = block10;
                        return otherDocumentController;
                    }
                    statusController = new StatusController(((SotFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f85911a);
                    final int i32 = 1;
                    Function1 block11 = new Function1() { // from class: xyc.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i32) {
                                case 0:
                                    o output = (o) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof n;
                                    com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar2 = eVar;
                                    if (z4) {
                                        oki.h.t2(eVar2, FlowCoordinator, SotFlowContract$Step.Status.f85932a, true, null, false, 12);
                                    } else {
                                        if (!(output instanceof zyc.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar2.B2();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar3 = eVar;
                                    qki.d dVar2 = eVar3.v;
                                    bzc.o output2 = (bzc.o) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z6 = true;
                                    if (output2 instanceof bzc.n) {
                                        bzc.n nVar = (bzc.n) output2;
                                        SubmissionEvidence submissionEvidence = nVar.f19965b;
                                        if (submissionEvidence != null) {
                                            eVar3.H2(dVar2, new xx9.f(13));
                                        }
                                        eVar3.H2(dVar2, new xw9.c(output2, 15));
                                        j2 j2Var = (j2) dVar2.f22677a;
                                        yki.l lVar = FlowCoordinator;
                                        if (submissionEvidence != null) {
                                            oki.h.t2(eVar3, lVar, eVar3.K2(), true, null, false, 12);
                                        } else {
                                            String str2 = nVar.f19964a;
                                            if (((SotFlowContract$FlowState) j2Var.getValue()).f.isEmpty() && ((SotFlowContract$FlowState) j2Var.getValue()).f85914g.length() <= 0) {
                                                z6 = false;
                                            }
                                            oki.h.t2(eVar3, lVar, new SotFlowContract$Step.EvidenceTypes(str2, z6), true, null, false, 12);
                                        }
                                    } else if (output2 instanceof bzc.m) {
                                        eVar3.F1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                    } else {
                                        if (!(output2 instanceof bzc.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.B2();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar4 = eVar;
                                    qki.d dVar3 = eVar4.v;
                                    czc.v output3 = (czc.v) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z11 = output3 instanceof s;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z11) {
                                        String str3 = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85915h;
                                        String str4 = str3.length() > 0 ? str3 : null;
                                        if (str4 == null) {
                                            str4 = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).i;
                                        }
                                        oki.h.t2(eVar4, lVar2, new SotFlowContract$Step.AddNote(str4), false, null, false, 12);
                                    } else if (output3 instanceof t) {
                                        eVar4.H2(dVar3, new xw9.c(output3, 19));
                                        oki.h.t2(eVar4, lVar2, new SotFlowContract$Step.EvidenceList(((t) output3).f110218a, ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).k, ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85917l, true), true, null, false, 12);
                                    } else if (output3 instanceof czc.u) {
                                        eVar4.l2(new xb4.e(eVar4, null, 17), new yi5.b(26));
                                    } else {
                                        if (!(output3 instanceof r)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar4.B2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar5 = eVar;
                                    qki.d dVar4 = eVar5.v;
                                    final azc.l output4 = (azc.l) obj6;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z12 = output4 instanceof azc.k;
                                    yki.l lVar3 = FlowCoordinator;
                                    if (z12) {
                                        final int i222 = 0;
                                        eVar5.H2(dVar4, new Function1() { // from class: xyc.h
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj7) {
                                                SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj7;
                                                switch (i222) {
                                                    case 0:
                                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                                        String str5 = ((azc.k) output4).f11435a;
                                                        return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, str5, str5, null, null, null, null, false, 15999);
                                                    default:
                                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                                        return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, null, ((azc.j) output4).f11434a, null, null, null, null, false, 16127);
                                                }
                                            }
                                        });
                                        oki.h.t2(eVar5, lVar3, eVar5.K2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else {
                                        if (!(output4 instanceof azc.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        final int i322 = 1;
                                        eVar5.H2(dVar4, new Function1() { // from class: xyc.h
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj7) {
                                                SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj7;
                                                switch (i322) {
                                                    case 0:
                                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                                        String str5 = ((azc.k) output4).f11435a;
                                                        return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, str5, str5, null, null, null, null, false, 15999);
                                                    default:
                                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                                        return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, null, null, ((azc.j) output4).f11434a, null, null, null, null, false, 16127);
                                                }
                                            }
                                        });
                                        oki.h.t2(eVar5, lVar3, eVar5.K2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    statusController.H = block11;
                }
                return statusController;
            case 7:
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.c cVar = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.c) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                PeerToPeerChatOnlyFlowContract$Step step6 = (PeerToPeerChatOnlyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof PeerToPeerChatOnlyFlowContract$Step.ChatScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                PeerToPeerChatOnlyFlowContract$Step.ChatScreen chatScreen = (PeerToPeerChatOnlyFlowContract$Step.ChatScreen) step6;
                PeerToPeerChatScreen peerToPeerChatScreen = new PeerToPeerChatScreen(new PeerToPeerChatScreenContract$InputData(chatScreen.f79741a, chatScreen.f79742b, chatScreen.f79743c, chatScreen.d));
                xw9.c block12 = new xw9.c(cVar, 23);
                Intrinsics.checkNotNullParameter(block12, "block");
                peerToPeerChatScreen.H = block12;
                return peerToPeerChatScreen;
            case 8:
                com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar2 = (com.revolut.feature.statements.impl.ui.custom_statement.screen.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CustomStatementScreenContract$ModalStep step7 = (CustomStatementScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof CustomStatementScreenContract$ModalStep.LanguagePicker) {
                    x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(R.string.common_search, null, null, 14), null, null, false, null, ((CustomStatementScreenContract$ModalStep.LanguagePicker) step7).f88336a.toLanguageTag(), null, null, true, null, null, null, null, null, 2138963454);
                    Object obj6 = bVar2.f88350r.get();
                    Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                    PickerController pickerController = new PickerController(xVar, (x7a.d) obj6);
                    xzd.o block13 = new xzd.o(bVar2, i6);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    pickerController.H = block13;
                    return pickerController;
                }
                if (step7 instanceof CustomStatementScreenContract$ModalStep.CurrencyPicker) {
                    CustomStatementScreenContract$ModalStep.CurrencyPicker currencyPicker = (CustomStatementScreenContract$ModalStep.CurrencyPicker) step7;
                    CurrencyChooserFlow currencyChooserFlowA = bVar2.f88351s.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.CurrencyChooser(null, null, currencyPicker.f88334a, currencyPicker.f88335b, null, null, 51)));
                    xzd.o oVar3 = new xzd.o(bVar2, 1);
                    Intrinsics.checkNotNullParameter(oVar3, "<set-?>");
                    currencyChooserFlowA.J = oVar3;
                    return currencyChooserFlowA;
                }
                if (step7 instanceof CustomStatementScreenContract$ModalStep.Products) {
                    CustomStatementScreenContract$ModalStep.Products products = (CustomStatementScreenContract$ModalStep.Products) step7;
                    AllProductsScreen allProductsScreen = new AllProductsScreen(new AllProductsScreenContract$InputData(products.f88340a, d0.i1(products.f88342c), products.f88341b));
                    xzd.o block14 = new xzd.o(bVar2, i5);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    allProductsScreen.H = block14;
                    return allProductsScreen;
                }
                if (step7 instanceof CustomStatementScreenContract$ModalStep.Categories) {
                    CustomStatementScreenContract$ModalStep.Categories categories = (CustomStatementScreenContract$ModalStep.Categories) step7;
                    AllCategoriesScreen allCategoriesScreen = new AllCategoriesScreen(new AllCategoriesScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_categories_title, null, null, 14), categories.f88332a, d0.i1(categories.f88333b)));
                    xzd.o block15 = new xzd.o(bVar2, 2);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    allCategoriesScreen.H = block15;
                    return allCategoriesScreen;
                }
                if (step7 instanceof CustomStatementScreenContract$ModalStep.TransactionDirections) {
                    CustomStatementScreenContract$ModalStep.TransactionDirections transactionDirections = (CustomStatementScreenContract$ModalStep.TransactionDirections) step7;
                    AllCategoriesScreen allCategoriesScreen2 = new AllCategoriesScreen(new AllCategoriesScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_transactions_title, null, null, 14), transactionDirections.f88343a, d0.i1(transactionDirections.f88344b)));
                    xzd.o block16 = new xzd.o(bVar2, 0);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    allCategoriesScreen2.H = block16;
                    return allCategoriesScreen2;
                }
                if (!(step7 instanceof CustomStatementScreenContract$ModalStep.PeriodSelector)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomStatementScreenContract$ModalStep.PeriodSelector periodSelector = (CustomStatementScreenContract$ModalStep.PeriodSelector) step7;
                wzd.c cVar2 = bVar2.f88348p;
                StatementPeriod availablePeriod = periodSelector.f88337a;
                StatementPeriodSelection selectedPeriod = periodSelector.f88338b;
                TaxPeriod taxPeriod = periodSelector.f88339c;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
                StatementPeriodType[] elements = {StatementPeriodType.TAX_YEAR, StatementPeriodType.CUSTOM, StatementPeriodType.ALL_TIME};
                Intrinsics.checkNotNullParameter(elements, "elements");
                StatementPeriodSelectorBottomSheet statementPeriodSelectorBottomSheetA = e0e.i.a(new StatementPeriodSelectorBottomSheetProvider$InputData(availablePeriod, selectedPeriod, kotlin.collections.d.y0(elements), taxPeriod));
                xzd.o block17 = new xzd.o(bVar2, i2);
                Intrinsics.checkNotNullParameter(block17, "block");
                statementPeriodSelectorBottomSheetA.H = block17;
                return statementPeriodSelectorBottomSheetA;
            case 9:
                final com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a aVar5 = (com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) obj4;
                i0b.c cVar3 = aVar5.o;
                y yVar = aVar5.f82081s;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AdvancedChartsScreenContract$ModalStep step8 = (AdvancedChartsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (Intrinsics.f(step8, AdvancedChartsScreenContract$ModalStep.ChartIndicatorSelector.f82073a)) {
                    Set set = ((y0b.f) ((j2) yVar.f22677a).getValue()).d.i;
                    c1b.g gVar2 = (c1b.g) ((y0b.f) ((j2) yVar.f22677a).getValue()).d.f139404l.getContent();
                    if (gVar2 == null || (list = gVar2.f20434b) == null) {
                        z = false;
                    } else {
                        List list2 = list;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            z3 = false;
                            z = z3;
                        } else {
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                if (((d1b.b) it9.next()).getVolume() != null) {
                                    z3 = true;
                                    z = z3;
                                }
                            }
                            z3 = false;
                            z = z3;
                        }
                    }
                    ChartsIndicatorScreen chartsIndicatorScreen = new ChartsIndicatorScreen(new ChartsIndicatorScreenProvider$InputData(set, z));
                    Function1 block18 = new Function1() { // from class: y0b.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i5) {
                                case 0:
                                    h0b.h outputData = (h0b.h) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    aVar5.f82079q.c3(outputData.f148346a);
                                    return Unit.f186387a;
                                case 1:
                                    h0b.f outputData2 = (h0b.f) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    aVar5.f82079q.q3(outputData2.f148344a);
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.kompot.navigable.vc.modal.a aVar6 = aVar5.f82082t;
                                    h0b.d outputData3 = (h0b.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, h0b.b.f148342a);
                                    ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                    if (zF) {
                                        oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.SymbolComparator.f82076a, popup);
                                    } else {
                                        if (!Intrinsics.f(outputData3, h0b.c.f148343a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.ChartIndicatorSelector.f82073a, popup);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    h0b.g outputData4 = (h0b.g) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    aVar5.f82079q.m3(outputData4.f148345a);
                                    return Unit.f186387a;
                                default:
                                    h0b.i result = (h0b.i) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    aVar5.f82079q.r3(result.f148347a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    chartsIndicatorScreen.H = block18;
                    return chartsIndicatorScreen;
                }
                if (Intrinsics.f(step8, AdvancedChartsScreenContract$ModalStep.SymbolSearcher.f82077a)) {
                    i0b.b bVarB = cVar3.b(((y0b.f) ((j2) yVar.f22677a).getValue()).d.d);
                    aii.e eVar2 = bVarB.f157343a;
                    final Function1 function1 = bVarB.f157344b;
                    viewControllerE1 = aVar5.e1(eVar2);
                    final int i33 = 1;
                    Function1 block19 = new Function1() { // from class: y0b.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            aii.r it10 = (aii.r) obj7;
                            switch (i33) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar5.f82079q.n3((Set) function1.invoke(it10));
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    AdvancedChartSymbol advancedChartSymbol = (AdvancedChartSymbol) function1.invoke(it10);
                                    if (advancedChartSymbol != null) {
                                        aVar5.f82079q.p3(advancedChartSymbol);
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    viewControllerE1.H = block19;
                } else {
                    if (!Intrinsics.f(step8, AdvancedChartsScreenContract$ModalStep.SymbolComparator.f82076a)) {
                        if (Intrinsics.f(step8, AdvancedChartsScreenContract$ModalStep.ChartIntervalSelector.f82074a)) {
                            ChartIntervalSelectorBottomSheetController chartIntervalSelectorBottomSheetController = new ChartIntervalSelectorBottomSheetController(new ChartIntervalSelectorBottomSheetControllerProvider$InputData(((y0b.f) ((j2) yVar.f22677a).getValue()).d.f139398a, ((y0b.f) ((j2) yVar.f22677a).getValue()).f310175b));
                            Function1 block20 = new Function1() { // from class: y0b.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (i6) {
                                        case 0:
                                            h0b.h outputData = (h0b.h) obj7;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            aVar5.f82079q.c3(outputData.f148346a);
                                            return Unit.f186387a;
                                        case 1:
                                            h0b.f outputData2 = (h0b.f) obj7;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            aVar5.f82079q.q3(outputData2.f148344a);
                                            return Unit.f186387a;
                                        case 2:
                                            com.revolut.kompot.navigable.vc.modal.a aVar6 = aVar5.f82082t;
                                            h0b.d outputData3 = (h0b.d) obj7;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            boolean zF = Intrinsics.f(outputData3, h0b.b.f148342a);
                                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                            if (zF) {
                                                oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.SymbolComparator.f82076a, popup);
                                            } else {
                                                if (!Intrinsics.f(outputData3, h0b.c.f148343a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.ChartIndicatorSelector.f82073a, popup);
                                            }
                                            return Unit.f186387a;
                                        case 3:
                                            h0b.g outputData4 = (h0b.g) obj7;
                                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                            aVar5.f82079q.m3(outputData4.f148345a);
                                            return Unit.f186387a;
                                        default:
                                            h0b.i result = (h0b.i) obj7;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            aVar5.f82079q.r3(result.f148347a);
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block20, "block");
                            chartIntervalSelectorBottomSheetController.H = block20;
                            return chartIntervalSelectorBottomSheetController;
                        }
                        if (Intrinsics.f(step8, AdvancedChartsScreenContract$ModalStep.ChartStyleSelector.f82075a)) {
                            ChartStyleSelectorBottomSheetController chartStyleSelectorBottomSheetController = new ChartStyleSelectorBottomSheetController(new ChartStyleSelectorBottomSheetControllerProvider$InputData(((y0b.f) ((j2) yVar.f22677a).getValue()).d.f139400c));
                            final int i43 = 0;
                            Function1 block21 = new Function1() { // from class: y0b.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (i43) {
                                        case 0:
                                            h0b.h outputData = (h0b.h) obj7;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            aVar5.f82079q.c3(outputData.f148346a);
                                            return Unit.f186387a;
                                        case 1:
                                            h0b.f outputData2 = (h0b.f) obj7;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            aVar5.f82079q.q3(outputData2.f148344a);
                                            return Unit.f186387a;
                                        case 2:
                                            com.revolut.kompot.navigable.vc.modal.a aVar6 = aVar5.f82082t;
                                            h0b.d outputData3 = (h0b.d) obj7;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            boolean zF = Intrinsics.f(outputData3, h0b.b.f148342a);
                                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                            if (zF) {
                                                oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.SymbolComparator.f82076a, popup);
                                            } else {
                                                if (!Intrinsics.f(outputData3, h0b.c.f148343a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.ChartIndicatorSelector.f82073a, popup);
                                            }
                                            return Unit.f186387a;
                                        case 3:
                                            h0b.g outputData4 = (h0b.g) obj7;
                                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                            aVar5.f82079q.m3(outputData4.f148345a);
                                            return Unit.f186387a;
                                        default:
                                            h0b.i result = (h0b.i) obj7;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            aVar5.f82079q.r3(result.f148347a);
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block21, "block");
                            chartStyleSelectorBottomSheetController.H = block21;
                            return chartStyleSelectorBottomSheetController;
                        }
                        if (Intrinsics.f(step8, AdvancedChartsScreenContract$ModalStep.ChartDrawingSelector.f82072a)) {
                            ChartDrawingSelectorBottomSheetController chartDrawingSelectorBottomSheetController = new ChartDrawingSelectorBottomSheetController();
                            final int i59 = 1;
                            Function1 block22 = new Function1() { // from class: y0b.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (i59) {
                                        case 0:
                                            h0b.h outputData = (h0b.h) obj7;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            aVar5.f82079q.c3(outputData.f148346a);
                                            return Unit.f186387a;
                                        case 1:
                                            h0b.f outputData2 = (h0b.f) obj7;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            aVar5.f82079q.q3(outputData2.f148344a);
                                            return Unit.f186387a;
                                        case 2:
                                            com.revolut.kompot.navigable.vc.modal.a aVar6 = aVar5.f82082t;
                                            h0b.d outputData3 = (h0b.d) obj7;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            boolean zF = Intrinsics.f(outputData3, h0b.b.f148342a);
                                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                            if (zF) {
                                                oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.SymbolComparator.f82076a, popup);
                                            } else {
                                                if (!Intrinsics.f(outputData3, h0b.c.f148343a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.ChartIndicatorSelector.f82073a, popup);
                                            }
                                            return Unit.f186387a;
                                        case 3:
                                            h0b.g outputData4 = (h0b.g) obj7;
                                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                            aVar5.f82079q.m3(outputData4.f148345a);
                                            return Unit.f186387a;
                                        default:
                                            h0b.i result = (h0b.i) obj7;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            aVar5.f82079q.r3(result.f148347a);
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block22, "block");
                            chartDrawingSelectorBottomSheetController.H = block22;
                            return chartDrawingSelectorBottomSheetController;
                        }
                        if (!Intrinsics.f(step8, AdvancedChartsScreenContract$ModalStep.ChartAdd.f82071a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ChartAddBottomSheetController chartAddBottomSheetController = new ChartAddBottomSheetController();
                        final int i66 = 2;
                        Function1 block23 = new Function1() { // from class: y0b.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i66) {
                                    case 0:
                                        h0b.h outputData = (h0b.h) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        aVar5.f82079q.c3(outputData.f148346a);
                                        return Unit.f186387a;
                                    case 1:
                                        h0b.f outputData2 = (h0b.f) obj7;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        aVar5.f82079q.q3(outputData2.f148344a);
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.kompot.navigable.vc.modal.a aVar6 = aVar5.f82082t;
                                        h0b.d outputData3 = (h0b.d) obj7;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        boolean zF = Intrinsics.f(outputData3, h0b.b.f148342a);
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (zF) {
                                            oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.SymbolComparator.f82076a, popup);
                                        } else {
                                            if (!Intrinsics.f(outputData3, h0b.c.f148343a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar6, AdvancedChartsScreenContract$ModalStep.ChartIndicatorSelector.f82073a, popup);
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        h0b.g outputData4 = (h0b.g) obj7;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        aVar5.f82079q.m3(outputData4.f148345a);
                                        return Unit.f186387a;
                                    default:
                                        h0b.i result = (h0b.i) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        aVar5.f82079q.r3(result.f148347a);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block23, "block");
                        chartAddBottomSheetController.H = block23;
                        return chartAddBottomSheetController;
                    }
                    i0b.a aVarA = cVar3.a(((y0b.f) ((j2) yVar.f22677a).getValue()).d.d, ((y0b.f) ((j2) yVar.f22677a).getValue()).d.f139402h);
                    aii.e eVar3 = aVarA.f157341a;
                    final Function1 function12 = aVarA.f157342b;
                    viewControllerE1 = aVar5.e1(eVar3);
                    final int i74 = 0;
                    Function1 block24 = new Function1() { // from class: y0b.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            aii.r it10 = (aii.r) obj7;
                            switch (i74) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar5.f82079q.n3((Set) function12.invoke(it10));
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    AdvancedChartSymbol advancedChartSymbol = (AdvancedChartSymbol) function12.invoke(it10);
                                    if (advancedChartSymbol != null) {
                                        aVar5.f82079q.p3(advancedChartSymbol);
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    viewControllerE1.H = block24;
                }
                return viewControllerE1;
            case 10:
                final com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a aVar6 = (com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a) obj4;
                RevPointsTrophyRoomFlowContract$Step step9 = (RevPointsTrophyRoomFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof RevPointsTrophyRoomFlowContract$Step.Home) {
                    RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen = new RevPointsTrophyRoomHomeScreen();
                    final int i92 = 0;
                    Function1 block25 = new Function1() { // from class: y0c.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i92) {
                                case 0:
                                    com.revolut.feature.rev_points.impl.ui.trophy_room.home.a outputData = (com.revolut.feature.rev_points.impl.ui.trophy_room.home.a) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z4 = outputData instanceof a.b;
                                    com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a aVar7 = aVar6;
                                    if (z4) {
                                        aVar7.C1(zh9.u0.c(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14)));
                                    } else if (outputData instanceof a.C0534a) {
                                        aVar7.C1(zh9.u0.b(aVar7.o.b()));
                                    } else if (outputData instanceof a.c) {
                                        h.t2(aVar7, aVar7.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsOptIn.f83915a, true, null, false, 12);
                                    } else if (outputData instanceof a.d) {
                                        h.t2(aVar7, aVar7.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsRedeem.f83916a, true, null, false, 12);
                                    } else if (outputData instanceof l) {
                                        h.t2(aVar7, aVar7.f83918q, new RevPointsTrophyRoomFlowContract$Step.Details(((l) outputData).f11787a), true, null, false, 12);
                                    } else if (outputData instanceof j) {
                                        aVar7.l2(new f(aVar7, ((j) outputData).f11784a, null, 23), new yi5.b(26));
                                    } else {
                                        if (!(outputData instanceof k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        k kVar = (k) outputData;
                                        ArrayList arrayList3 = kVar.f11785a;
                                        h.t2(aVar7, aVar7.f83918q, new RevPointsTrophyRoomFlowContract$Step.HighlightsSharing(kVar.f11786b, arrayList3), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    hub.b it10 = (hub.b) obj7;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a aVar8 = aVar6;
                                    h.t2(aVar8, aVar8.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsRedeem.f83916a, false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.rev_points.impl.ui.trophy_room.details.a outputData2 = (com.revolut.feature.rev_points.impl.ui.trophy_room.details.a) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!Intrinsics.f(outputData2, a.C0532a.f83904a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar6.C1(zh9.u0.c(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14)));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    revPointsTrophyRoomHomeScreen.H = block25;
                    return revPointsTrophyRoomHomeScreen;
                }
                if (step9 instanceof RevPointsTrophyRoomFlowContract$Step.RevPointsOptIn) {
                    ViewController viewControllerE12 = aVar6.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.LoyaltySavings.f83994a, false, 6)));
                    final int i96 = 1;
                    Function1 block26 = new Function1() { // from class: y0c.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i96) {
                                case 0:
                                    com.revolut.feature.rev_points.impl.ui.trophy_room.home.a outputData = (com.revolut.feature.rev_points.impl.ui.trophy_room.home.a) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z4 = outputData instanceof a.b;
                                    com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a aVar7 = aVar6;
                                    if (z4) {
                                        aVar7.C1(zh9.u0.c(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14)));
                                    } else if (outputData instanceof a.C0534a) {
                                        aVar7.C1(zh9.u0.b(aVar7.o.b()));
                                    } else if (outputData instanceof a.c) {
                                        h.t2(aVar7, aVar7.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsOptIn.f83915a, true, null, false, 12);
                                    } else if (outputData instanceof a.d) {
                                        h.t2(aVar7, aVar7.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsRedeem.f83916a, true, null, false, 12);
                                    } else if (outputData instanceof l) {
                                        h.t2(aVar7, aVar7.f83918q, new RevPointsTrophyRoomFlowContract$Step.Details(((l) outputData).f11787a), true, null, false, 12);
                                    } else if (outputData instanceof j) {
                                        aVar7.l2(new f(aVar7, ((j) outputData).f11784a, null, 23), new yi5.b(26));
                                    } else {
                                        if (!(outputData instanceof k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        k kVar = (k) outputData;
                                        ArrayList arrayList3 = kVar.f11785a;
                                        h.t2(aVar7, aVar7.f83918q, new RevPointsTrophyRoomFlowContract$Step.HighlightsSharing(kVar.f11786b, arrayList3), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    hub.b it10 = (hub.b) obj7;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a aVar8 = aVar6;
                                    h.t2(aVar8, aVar8.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsRedeem.f83916a, false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.rev_points.impl.ui.trophy_room.details.a outputData2 = (com.revolut.feature.rev_points.impl.ui.trophy_room.details.a) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!Intrinsics.f(outputData2, a.C0532a.f83904a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar6.C1(zh9.u0.c(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14)));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block26, "block");
                    viewControllerE12.H = block26;
                    return viewControllerE12;
                }
                if (step9 instanceof RevPointsTrophyRoomFlowContract$Step.RevPointsRedeem) {
                    return new RevPointsRedeemScreen(new RevPointsRedeemScreenContract$InputData(false));
                }
                if (!(step9 instanceof RevPointsTrophyRoomFlowContract$Step.Details)) {
                    if (!(step9 instanceof RevPointsTrophyRoomFlowContract$Step.HighlightsSharing)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RevPointsTrophyRoomFlowContract$Step.HighlightsSharing highlightsSharing = (RevPointsTrophyRoomFlowContract$Step.HighlightsSharing) step9;
                    return new RevPointsTrophyRoomHighlightsSharingScreen(new RevPointsTrophyRoomHighlightsSharingScreenContract$InputData(highlightsSharing.f83913b, highlightsSharing.f83912a));
                }
                RevPointsTrophyRoomDetailsScreen revPointsTrophyRoomDetailsScreen = new RevPointsTrophyRoomDetailsScreen(new RevPointsTrophyRoomDetailsScreenContract$InputData(((RevPointsTrophyRoomFlowContract$Step.Details) step9).f83911a));
                final int i99 = 2;
                Function1 block27 = new Function1() { // from class: y0c.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i99) {
                            case 0:
                                com.revolut.feature.rev_points.impl.ui.trophy_room.home.a outputData = (com.revolut.feature.rev_points.impl.ui.trophy_room.home.a) obj7;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z4 = outputData instanceof a.b;
                                com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a aVar7 = aVar6;
                                if (z4) {
                                    aVar7.C1(zh9.u0.c(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14)));
                                } else if (outputData instanceof a.C0534a) {
                                    aVar7.C1(zh9.u0.b(aVar7.o.b()));
                                } else if (outputData instanceof a.c) {
                                    h.t2(aVar7, aVar7.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsOptIn.f83915a, true, null, false, 12);
                                } else if (outputData instanceof a.d) {
                                    h.t2(aVar7, aVar7.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsRedeem.f83916a, true, null, false, 12);
                                } else if (outputData instanceof l) {
                                    h.t2(aVar7, aVar7.f83918q, new RevPointsTrophyRoomFlowContract$Step.Details(((l) outputData).f11787a), true, null, false, 12);
                                } else if (outputData instanceof j) {
                                    aVar7.l2(new f(aVar7, ((j) outputData).f11784a, null, 23), new yi5.b(26));
                                } else {
                                    if (!(outputData instanceof k)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    k kVar = (k) outputData;
                                    ArrayList arrayList3 = kVar.f11785a;
                                    h.t2(aVar7, aVar7.f83918q, new RevPointsTrophyRoomFlowContract$Step.HighlightsSharing(kVar.f11786b, arrayList3), true, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 1:
                                hub.b it10 = (hub.b) obj7;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a aVar8 = aVar6;
                                h.t2(aVar8, aVar8.f83918q, RevPointsTrophyRoomFlowContract$Step.RevPointsRedeem.f83916a, false, null, false, 12);
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.rev_points.impl.ui.trophy_room.details.a outputData2 = (com.revolut.feature.rev_points.impl.ui.trophy_room.details.a) obj7;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                if (!Intrinsics.f(outputData2, a.C0532a.f83904a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar6.C1(zh9.u0.c(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14)));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block27, "block");
                revPointsTrophyRoomDetailsScreen.H = block27;
                return revPointsTrophyRoomDetailsScreen;
            case 11:
                com.revolut.feature.freelancer.impl.ui.sales.new_sale.a aVar7 = (com.revolut.feature.freelancer.impl.ui.sales.new_sale.a) obj4;
                jr6.m mVar = aVar7.f74157r;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                FreelancerNewSaleFlowContract$Step step10 = (FreelancerNewSaleFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof FreelancerNewSaleFlowContract$Step$EligibilityCheck$ProductArticle) {
                    ViewController viewControllerE13 = aVar7.e1(new ProductArticleDescriptor(((FreelancerNewSaleFlowContract$Step$EligibilityCheck$ProductArticle) step10).f74147a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    y17.l block28 = new y17.l(aVar7, i6);
                    Intrinsics.checkNotNullParameter(block28, "block");
                    viewControllerE13.H = block28;
                    return viewControllerE13;
                }
                if (Intrinsics.f(step10, FreelancerNewSaleFlowContract$Step$EligibilityCheck$WebsiteUrlNotSubmittedPrompt.f74148a)) {
                    int i100 = R$drawable.uikit_icn_24_back;
                    ((ct6.t) mVar).getClass();
                    FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_website_url_pending_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_website_url_pending_description, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30), new ResourceImage(i100, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_website_url_pending_action_confirm, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_website_url_pending_action_cancel, null, null, 14), true, null, null, null, false, 16741324));
                    y17.l block29 = new y17.l(aVar7, i2);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    fullScreenPromptScreen.H = block29;
                    return fullScreenPromptScreen;
                }
                if (Intrinsics.f(step10, FreelancerNewSaleFlowContract$Step$EligibilityCheck$KymNotPassedPrompt.f74146a)) {
                    int i101 = R$drawable.uikit_icn_24_back;
                    ((ct6.t) mVar).getClass();
                    FullScreenPromptScreen fullScreenPromptScreen2 = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_kym_pending_v2_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_kym_pending_v2_description, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D259", null, null, null, 30), new ResourceImage(i101, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, true, null, null, null, false, 16743372));
                    y17.l block30 = new y17.l(aVar7, 1);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    fullScreenPromptScreen2.H = block30;
                    return fullScreenPromptScreen2;
                }
                if (step10 instanceof FreelancerNewSaleFlowContract$Step$EligibilityCheck$AnnualInboundVolume) {
                    return aVar7.e1(((FreelancerNewSaleFlowContract$Step$EligibilityCheck$AnnualInboundVolume) step10).f74145a);
                }
                if (step10 instanceof FreelancerNewSaleFlowContract$Step$EligibilityCheck$AccountRestriction) {
                    return aVar7.e1(((FreelancerNewSaleFlowContract$Step$EligibilityCheck$AccountRestriction) step10).f74144a);
                }
                if (Intrinsics.f(step10, FreelancerNewSaleFlowContract$Step$Sale$CardReader.f74149a)) {
                    return aVar7.e1(sb1.a.f261472a);
                }
                if (Intrinsics.f(step10, FreelancerNewSaleFlowContract$Step$Sale$Invoice.f74150a)) {
                    return new InvoiceCreateFlow(new InvoiceCreateFlowContract$InputData(null));
                }
                if (step10 instanceof FreelancerNewSaleFlowContract$Step$Sale$OrderInitPage) {
                    freelancerQrShareScreen = new OrderInitPageCreateScreen(new OrderInitPageCreateScreenContract$InputData(((FreelancerNewSaleFlowContract$Step$Sale$OrderInitPage) step10).f74151a));
                    y17.l block31 = new y17.l(aVar7, i5);
                    Intrinsics.checkNotNullParameter(block31, "block");
                    freelancerQrShareScreen.H = block31;
                } else {
                    if (!(step10 instanceof FreelancerNewSaleFlowContract$Step$Sale$QrShare)) {
                        if (!Intrinsics.f(step10, FreelancerNewSaleFlowContract$Step.WebsiteUrlSubmission.f74154a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FreelancerWebsiteFlow freelancerWebsiteFlow = new FreelancerWebsiteFlow(new FreelancerWebsiteFlowContract$InputData(2));
                        y17.l block32 = new y17.l(aVar7, 2);
                        Intrinsics.checkNotNullParameter(block32, "block");
                        freelancerWebsiteFlow.H = block32;
                        return freelancerWebsiteFlow;
                    }
                    FreelancerNewSaleFlowContract$Step$Sale$QrShare freelancerNewSaleFlowContract$Step$Sale$QrShare = (FreelancerNewSaleFlowContract$Step$Sale$QrShare) step10;
                    freelancerQrShareScreen = new FreelancerQrShareScreen(new FreelancerQrShareScreenContract$InputData(freelancerNewSaleFlowContract$Step$Sale$QrShare.f74152a, freelancerNewSaleFlowContract$Step$Sale$QrShare.f74153b));
                }
                return freelancerQrShareScreen;
            case 12:
                com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d dVar2 = (com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d) obj4;
                y1a.g gVar3 = dVar2.f79909p;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                RecurringSplitFlowContract$Step step11 = (RecurringSplitFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof RecurringSplitFlowContract$Step.SelectContacts) {
                    RecurringSplitFlowContract$LaunchMode recurringSplitFlowContract$LaunchMode = ((RecurringSplitFlowContract$Step.SelectContacts) step11).f79902a;
                    if (Intrinsics.f(recurringSplitFlowContract$LaunchMode, RecurringSplitFlowContract$LaunchMode.Creation.f79898a)) {
                        preselectedContacts = f0.f322471a;
                    } else {
                        if (!(recurringSplitFlowContract$LaunchMode instanceof RecurringSplitFlowContract$LaunchMode.Update)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        preselectedContacts = ((RecurringSplitFlowContract$LaunchMode.Update) recurringSplitFlowContract$LaunchMode).f79900b;
                    }
                    gVar3.getClass();
                    Intrinsics.checkNotNullParameter(preselectedContacts, "preselectedContacts");
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.payments_split_bill_contacts_picker_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_bill_contacts_picker_search_hint, null, null, 14);
                    ContactType[] elements2 = {ContactType.RevolutContact.Local.f66038a, new ContactType.RevolutContact.Remote(0), ContactType.UsernameContact.f66040a, ContactType$DeviceContact$Phone.f66036a, ContactType$DeviceContact$Email.f66035a};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    ContactsChooserScreen contactsChooserScreenA = ln3.b.a(new ContactsChooserInputData((Clause) textLocalisedClause, (Clause) textLocalisedClause2, kotlin.collections.d.L(elements2), preselectedContacts, (ContactsChooserMode) new ContactsChooserMode.MultiSelect(null), false, true, false, false, (ContactsFilter) null, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) null, (Clause) null, (Set) null, (ContactsPrimaryButtonClause) null, (cn3.h) null, 0, (Set) null, 1031936));
                    xyc.j block33 = new xyc.j(dVar2, recurringSplitFlowContract$LaunchMode, 13);
                    Intrinsics.checkNotNullParameter(block33, "block");
                    contactsChooserScreenA.H = block33;
                    return contactsChooserScreenA;
                }
                if (!(step11 instanceof RecurringSplitFlowContract$Step.SplitSummary)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecurringSplitFlowContract$Step.SplitSummary splitSummary = (RecurringSplitFlowContract$Step.SplitSummary) step11;
                SplitMembersType splitMembers = splitSummary.f79903a;
                qua.p recurringPayment = dVar2.o.f79896a;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(splitMembers, "splitMembers");
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                List listC = u.c(new BillType.RecurringPaymentBill(recurringPayment));
                int i102 = y1a.f.f310356a[recurringPayment.f249314a.f160152c.ordinal()];
                SplitBillInputData inputData = new SplitBillInputData(splitMembers, listC, new TextLocalisedClause(i102 != 1 ? i102 != 2 ? i102 != 3 ? com.revolut.feature.payments.splitbill.api.R$string.split_bill_summary : com.revolut.feature.payments.splitbill.api.R$string.split_bill_summary_direct_debit_title : com.revolut.feature.payments.splitbill.api.R$string.split_bill_summary_standing_order_title : com.revolut.feature.payments.splitbill.api.R$string.split_bill_summary_subscription_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_bill_summary_action, null, null, 14), false, cp9.a.PERCENT);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                SplitBillsSummaryScreen splitBillsSummaryScreen = new SplitBillsSummaryScreen(inputData);
                xyc.j block34 = new xyc.j(dVar2, splitSummary, 12);
                Intrinsics.checkNotNullParameter(block34, "block");
                splitBillsSummaryScreen.H = block34;
                return splitBillsSummaryScreen;
            case 13:
                String productId = (String) obj2;
                StoreProduct product = (StoreProduct) obj3;
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(product, "product");
                ((y1e.b) obj4).f310365b.f("STORE_PRODUCT_" + productId, product);
                return Unit.f186387a;
            case 14:
                v1e.c params2 = (v1e.c) obj2;
                StoreProductStatusResponse response = (StoreProductStatusResponse) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(response, "response");
                ((y1e.d) obj4).f310368b.f("STORE_PRODUCT_STATUS_productId=" + params2.f285303a + "_isThirdPartyTargetingEnabled=" + params2.f285304b, response);
                return Unit.f186387a;
            case 15:
                com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c cVar4 = (com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c) obj4;
                TradeRevPointsAgentDetailsFlowContract$InputData tradeRevPointsAgentDetailsFlowContract$InputData = cVar4.o;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                TradeRevPointsAgentDetailsFlowContract$Step step12 = (TradeRevPointsAgentDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof TradeRevPointsAgentDetailsFlowContract$Step.AgentDetails) {
                    TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen = new TradeRevPointsAgentDetailsScreen(new TradeRevPointsAgentDetailsScreenContract$InputData(((TradeRevPointsAgentDetailsFlowContract$Step.AgentDetails) step12).f91120a, tradeRevPointsAgentDetailsFlowContract$InputData.getF91116b(), tradeRevPointsAgentDetailsFlowContract$InputData.getF91117c()));
                    xyc.j block35 = new xyc.j(cVar4, LazyFlowCoordinator4, i3);
                    Intrinsics.checkNotNullParameter(block35, "block");
                    tradeRevPointsAgentDetailsScreen.H = block35;
                    return tradeRevPointsAgentDetailsScreen;
                }
                if (step12 instanceof TradeRevPointsAgentDetailsFlowContract$Step.Transfer) {
                    TradeRevPointsAgentDetailsFlowContract$Step.Transfer transfer = (TradeRevPointsAgentDetailsFlowContract$Step.Transfer) step12;
                    TradeRevPointsTransferScreen tradeRevPointsTransferScreen = new TradeRevPointsTransferScreen(new TradeRevPointsTransferScreenContract$InputData(transfer.f91122a, tradeRevPointsAgentDetailsFlowContract$InputData.getF91116b(), transfer.f91123b, transfer.f91124c));
                    y1f.c block36 = new y1f.c(cVar4, 0);
                    Intrinsics.checkNotNullParameter(block36, "block");
                    tradeRevPointsTransferScreen.H = block36;
                    return tradeRevPointsTransferScreen;
                }
                if (!(step12 instanceof TradeRevPointsAgentDetailsFlowContract$Step.AccountRegistration)) {
                    if (step12 instanceof TradeRevPointsAgentDetailsFlowContract$Step.SeeAllUserVouchers) {
                        return new TradeRevPointsAgentAllVouchersScreen(new TradeRevPointsAgentAllVouchersScreenContract$InputData(((TradeRevPointsAgentDetailsFlowContract$Step.SeeAllUserVouchers) step12).f91121a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TradeRevPointsAccountRegistrationScreen tradeRevPointsAccountRegistrationScreen = new TradeRevPointsAccountRegistrationScreen(new TradeRevPointsAccountRegistrationScreenContract$InputData(((TradeRevPointsAgentDetailsFlowContract$Step.AccountRegistration) step12).f91118a, tradeRevPointsAgentDetailsFlowContract$InputData.getF91116b()));
                o block37 = new o(cVar4, i5, LazyFlowCoordinator4, step12);
                Intrinsics.checkNotNullParameter(block37, "block");
                tradeRevPointsAccountRegistrationScreen.H = block37;
                return tradeRevPointsAccountRegistrationScreen;
            case 16:
                com.revolut.feature.retail.cfd.impl.flows.position.a aVar8 = (com.revolut.feature.retail.cfd.impl.flows.position.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                CfdPositionFlowContract$Step step13 = (CfdPositionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof CfdPositionFlowContract$Step.Positions) {
                    CfdPositionFlowContract$Step.Positions positions = (CfdPositionFlowContract$Step.Positions) step13;
                    CfdPositionsController cfdPositionsController = new CfdPositionsController(positions.f82193a, positions.f82194b, positions.f82195c, positions.d);
                    baa.c block38 = new baa.c(aVar8, FlowCoordinator2, 22);
                    Intrinsics.checkNotNullParameter(block38, "block");
                    cfdPositionsController.H = block38;
                    return cfdPositionsController;
                }
                if (!(step13 instanceof CfdPositionFlowContract$Step.OrderReview)) {
                    throw new NoWhenBranchMatchedException();
                }
                CfdPositionFlowContract$Step.OrderReview orderReview = (CfdPositionFlowContract$Step.OrderReview) step13;
                String str2 = orderReview.f82190a;
                nel.n nVar = orderReview.f82191b;
                String str3 = orderReview.f82192c;
                bfl.g gVar4 = orderReview.e;
                BigDecimal bigDecimal = orderReview.d;
                e2b.a aVar9 = e2b.a.MARKET;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                CfdOrderReviewScreen cfdOrderReviewScreen = new CfdOrderReviewScreen(new CfdOrderReviewScreenContract$InputData(str2, null, nVar, str3, str3, gVar4, bigDecimal, aVar9, ZERO, null, f0.f322471a, null));
                baa.c cVar5 = new baa.c(aVar8, FlowCoordinator2, 23);
                Intrinsics.checkNotNullParameter(cVar5, "<set-?>");
                cfdOrderReviewScreen.H = cVar5;
                return cfdOrderReviewScreen;
            case 17:
                String username = (String) obj2;
                zm3.j jVar = (zm3.j) obj3;
                Intrinsics.checkNotNullParameter(username, "username");
                Intrinsics.h(jVar);
                ((y2c.c) obj4).f310619b.f("REVOLUT_ACCOUNT_KEY_" + username, jVar);
                return Unit.f186387a;
            case 18:
                com.revolut.feature.revolut_x_balances.impl.fiat.a aVar10 = (com.revolut.feature.revolut_x_balances.impl.fiat.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevolutXFiatBalancesDetailsScreenContract$ModalStep step14 = (RevolutXFiatBalancesDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (Intrinsics.f(step14, RevolutXFiatBalancesDetailsScreenContract$ModalStep.BalanceBreakdown.f84256a)) {
                    return aVar10.e1(new t4c.c(((y4c.d) ((j2) aVar10.u.f22677a).getValue()).f310861a));
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                return a(obj2, obj3);
            case 20:
                return b(obj2, obj3);
            case 21:
                return c(obj2, obj3);
            case 22:
                od0.i pageToken = (od0.i) obj2;
                r5b.n domain = (r5b.n) obj3;
                Intrinsics.checkNotNullParameter(pageToken, "pageToken");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((g0) obj4).f311041c.f(g0.b(pageToken), domain);
                return Unit.f186387a;
            case 23:
                return d(obj2, obj3);
            case 24:
                return e(obj2, obj3);
            case 25:
                return g(obj2, obj3);
            case 26:
                return h(obj2, obj3);
            case 27:
                return i(obj2, obj3);
            case 28:
                return j(obj2, obj3);
            default:
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar11 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) obj4;
                c8k.f fVar = aVar11.F;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PaymentLinksAmountScreenContract$ModalStep step15 = (PaymentLinksAmountScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                int i103 = 27;
                if (step15 instanceof PaymentLinksAmountScreenContract$ModalStep.CurrencyChooser) {
                    CurrencyChooserFlow currencyChooserFlowA2 = aVar11.C.a(((PaymentLinksAmountScreenContract$ModalStep.CurrencyChooser) step15).f102202a);
                    currencyChooserFlowA2.l2(new xge.h(aVar11, i103));
                    y7k.d0 d0Var = new y7k.d0(aVar11, i6);
                    Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
                    currencyChooserFlowA2.J = d0Var;
                    return currencyChooserFlowA2;
                }
                if (step15 instanceof PaymentLinksAmountScreenContract$ModalStep.DualCurrencyChooser) {
                    ViewController viewControllerE14 = aVar11.e1(new l1j.d(((PaymentLinksAmountScreenContract$ModalStep.DualCurrencyChooser) step15).f102203a, null));
                    viewControllerE14.l2(new xge.h(aVar11, i103));
                    y7k.d0 block39 = new y7k.d0(aVar11, i5);
                    Intrinsics.checkNotNullParameter(block39, "block");
                    viewControllerE14.H = block39;
                    return viewControllerE14;
                }
                if (Intrinsics.f(step15, PaymentLinksAmountScreenContract$ModalStep.FeesDisclaimerBottomDialog.f102206a)) {
                    fVar.getClass();
                    lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payment_link_bottom_sheet_fees_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payment_link_bottom_sheet_fees_subtitle, null, null, 14), null, null, false, 28);
                    aw0.e eVar4 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar12, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                } else {
                    if (!Intrinsics.f(step15, PaymentLinksAmountScreenContract$ModalStep.WarningBottomDialog.f102207a)) {
                        if (!(step15 instanceof PaymentLinksAmountScreenContract$ModalStep.ExchangeGlobalAccessStep)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PaymentLinksAmountScreenContract$ModalStep.ExchangeGlobalAccessStep exchangeGlobalAccessStep = (PaymentLinksAmountScreenContract$ModalStep.ExchangeGlobalAccessStep) step15;
                        ViewController viewControllerZ2 = aVar11.G.Z2(exchangeGlobalAccessStep.f102205b, exchangeGlobalAccessStep.f102204a);
                        y7k.d0 block40 = new y7k.d0(aVar11, i2);
                        Intrinsics.checkNotNullParameter(block40, "block");
                        viewControllerZ2.H = block40;
                        return viewControllerZ2;
                    }
                    fVar.getClass();
                    lw0.a aVar13 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payment_link_bottom_sheet_security_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payment_link_bottom_sheet_security_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_warning, null, null, 6)), null, false, 24);
                    aw0.e eVar5 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var2 = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar13, eVar5, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                }
                return actionsBottomSheetController;
        }
    }
}
