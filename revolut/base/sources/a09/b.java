package a09;

import aii.q;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import b74.u;
import b74.v;
import b9.w2;
import c69.j;
import c69.l;
import c7i.s;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.ui.chatlist.ChatListContract$InputData;
import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.chat.ui.flow.ChatFlowContract$Step;
import com.revolut.chat.ui.introvideo.ChatIntroVideoScreen;
import com.revolut.chat.ui.introvideo.ChatIntroVideoScreenContract$InputData;
import com.revolut.chat.ui.messageslist.MessagesContract$InputData;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoCodeDetailsInputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep;
import com.revolut.feature.apm.multibanco.impl.ui.pay.MultibancoPayFlow;
import com.revolut.feature.apm.multibanco.impl.ui.pay.MultibancoPayFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.MultibancoWithdrawalFlow;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.WithdrawalCodeDetailsScreen;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list.WithdrawalCodeListScreen;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.bank_transfer.models.PaymentVendorCorridor;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardsListScreenContract$ModalStep;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetScreen;
import com.revolut.feature.cms.stories.api.navigation.CmsStoriesControllerDescriptor;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.LegacyConsentPreferencesFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.LegacyConsentPreferencesFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.LegacyConsentPreferencesFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.DocumentsRemediationFlowContract$Step;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlowContract$Step;
import com.revolut.feature.learn.shared.models.domain.LearnBlog;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.masav.impl.ui.MasavDirectDebitsFlowContract$Step;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreen;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$InputData;
import com.revolut.feature.masav.impl.ui.review.MasavDirectDebitReviewScreen;
import com.revolut.feature.masav.impl.ui.review.MasavDirectDebitReviewScreenContract$InputData;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlowContract$InputData;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlowContract$Step;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreen;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueBottomSheet;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueBottomSheetItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanCardFeesBreakdown;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$ModalStep;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreen;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.TravelFlightsBaggageInfoScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.TravelFlightsBaggageInfoScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_details.TravelFlightsBookingDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_status.TravelFlightsBookingStatusScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_status.TravelFlightsBookingStatusScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect.TravelFlightsChatRedirectScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect.TravelFlightsChatRedirectScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.TravelFlightsSearchSortByScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.TravelFlightsSearchSortByScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.self_transfer.TravelFlightsSelfTransferScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.ticket_rules.TravelFlightsTicketRulesScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.ticket_rules.TravelFlightsTicketRulesScreenContract$InputData;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsScreenContract$InputData;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsScreenContract$ModalStep;
import com.revolut.feature_move_money.impl.automation.flow.MoveMoneyAutomationFlowContract$Step;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreen;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InputData;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InvocationSource;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetController;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$ModalStep;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.PaymentVendorsBeneCreationFlowContract$Step;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection.VendorSelectionScreen;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.LaunchMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentController;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import d74.i;
import d9.e1;
import dm1.d;
import g50.c;
import grl.k9;
import i69.g;
import ip0.v7;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import oki.h;
import org.joda.time.Period;
import r40.b;
import v30.t;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f246b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f245a = i;
        this.f246b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0299  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a09.b.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj2, Object obj3) {
        TransferScheduleData transferScheduleData;
        dj0.d dVar;
        String str;
        jli.c cVarK;
        com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a aVar = (com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a) this.f246b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        JuniorAllowanceFlowContract$Step step = (JuniorAllowanceFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof JuniorAllowanceFlowContract$Step.Allowance)) {
            throw new NoWhenBranchMatchedException();
        }
        cc8.a aVar2 = aVar.f76832s;
        JuniorAllowanceFlowContract$Step.Allowance allowance = (JuniorAllowanceFlowContract$Step.Allowance) step;
        zm3.l contact = allowance.f76826a;
        qua.p pVar = allowance.f76827b;
        String str2 = allowance.f76828c;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (pVar != null) {
            Period period = pVar.f249314a.f160151b;
            if (period == null || (cVarK = jli.e.k(period)) == null) {
                cVarK = jli.c.PERIOD_SELECTION_NONE;
            }
            transferScheduleData = new TransferScheduleData(qua.u.e(pVar, ((l80.f) aVar2.f22965a).g()).getMillis(), cVarK, 4);
        } else {
            transferScheduleData = new TransferScheduleData(0L, jli.c.PERIOD_SELECTION_WEEK, 5);
        }
        PeerToPeerTransferInputData.Companion companion = PeerToPeerTransferInputData.INSTANCE;
        PeerToPeerRecipient peerToPeerRecipient = new PeerToPeerRecipient(contact);
        hrf.f fVar = hrf.f.OUTGOING;
        TransferFlowType.Default r92 = TransferFlowType.Default.f92257b;
        m1l.a aVar3 = m1l.a.SCHEDULE_REQUIRED;
        boolean z = pVar != null;
        if (pVar != null) {
            dVar = qua.u.f(pVar);
        } else {
            xi0.b bVar = aVar2.f22966b.d;
            dVar = bVar != null ? new dj0.d(0L, bVar) : null;
        }
        if (pVar != null && (str = pVar.W) != null) {
            str2 = str;
        }
        ViewController viewControllerE1 = aVar.e1(new s8k.e(PeerToPeerTransferInputData.Companion.a(companion, peerToPeerRecipient, fVar, r92, new TransferMoneyPocket(dVar, new SourceAccount.Pocket(str2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 6)), transferScheduleData, aVar3, z, pVar != null ? pVar.I : null, pVar != null ? pVar.f249325m : null, pVar, null, new LaunchMode.AsController(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.SILENT_COMPLETION), null, null, null, 125184)));
        a08.o block = new a08.o(aVar, step, 29);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [mha.k] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v131 */
    /* JADX WARN: Type inference failed for: r2v132 */
    /* JADX WARN: Type inference failed for: r2v133 */
    /* JADX WARN: Type inference failed for: r2v134 */
    /* JADX WARN: Type inference failed for: r2v135 */
    /* JADX WARN: Type inference failed for: r2v136 */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v139 */
    /* JADX WARN: Type inference failed for: r2v140 */
    /* JADX WARN: Type inference failed for: r2v141 */
    /* JADX WARN: Type inference failed for: r2v142 */
    /* JADX WARN: Type inference failed for: r2v143 */
    /* JADX WARN: Type inference failed for: r2v144 */
    /* JADX WARN: Type inference failed for: r2v145 */
    /* JADX WARN: Type inference failed for: r2v146 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        dj0.d dVarL;
        dj0.d dVar;
        mha.s sVarD;
        int i;
        int i2 = this.f245a;
        int i3 = 14;
        Object obj4 = null;
        ?? r2 = 0;
        ?? r23 = 0;
        ?? r210 = 0;
        ?? r211 = 0;
        ?? r212 = 0;
        ?? r213 = 0;
        ?? r214 = 0;
        ?? r215 = 0;
        ?? r216 = 0;
        ?? r217 = 0;
        final int i5 = 1;
        Object obj5 = this.f246b;
        switch (i2) {
            case 0:
                c cVar = (c) obj5;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                LearnBlog blog = (LearnBlog) obj3;
                Intrinsics.checkNotNullParameter(null, "<unused var>");
                Intrinsics.checkNotNullParameter(blog, "blog");
                hz8.a aVar = cVar.f249b;
                Intrinsics.checkNotNullParameter(blog, "<this>");
                aVar.a(new jz8.o(blog.d, blog.f78021a, blog.f78022b, blog.f78023c, blog.f78024g, blog.f78025h, blog.i, blog.f78026j, blog.e, blog.f));
                return Unit.f186387a;
            case 1:
                List tabs = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(tabs, "tabs");
                ((q) obj5).f278b.f("KEY_DOMAIN_TABS", tabs);
                return Unit.f186387a;
            case 2:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(6, (myh.j) obj5, true, false, null));
            case 3:
                NationalIdentifierDocumentController nationalIdentifierDocumentController = (NationalIdentifierDocumentController) obj5;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = NationalIdentifierDocumentController.T;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                String str = nationalIdentifierDocumentController.K.f104207a.f304708g;
                if (str == null) {
                    str = "[_…]";
                }
                return new zp0.y(field.getInnerEditText(), zhm.u.c(zp0.m.a()), str, new a05.a(nationalIdentifierDocumentController, 17), model.f52580a, null, false, 96);
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new a15.k(zhm.d0.E0((Iterable) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), a15.p.a((a15.h) obj5)));
            case 5:
                List items = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(items, "items");
                ((a19.f) obj5).f565b.f("libraries_cache_key", items);
                return Unit.f186387a;
            case 6:
                List value = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(value, "value");
                ((a1a.d) obj5).f577b.f("RECURRING_SPLITS", value);
                return Unit.f186387a;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return a2g.t.b(((a2g.g) obj5).e == a2g.h.BOOKING_FLOW);
            case 8:
                com.revolut.feature.retail.cfd.impl.flows.withdraw.a aVar2 = (com.revolut.feature.retail.cfd.impl.flows.withdraw.a) obj5;
                CfdWithdrawFlowContract$Step step = (CfdWithdrawFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CfdWithdrawFlowContract$Step.Screen)) {
                    throw new NoWhenBranchMatchedException();
                }
                CfdWithdrawFlowContract$InputData cfdWithdrawFlowContract$InputData = aVar2.o;
                CfdWithdrawScreen cfdWithdrawScreen = new CfdWithdrawScreen(new CfdWithdrawScreenContract$InputData(cfdWithdrawFlowContract$InputData.f82196a, cfdWithdrawFlowContract$InputData.f82197b));
                a0.c block = new a0.c(aVar2, 16);
                Intrinsics.checkNotNullParameter(block, "block");
                cfdWithdrawScreen.H = block;
                return cfdWithdrawScreen;
            case 9:
                w2 w2Var = (w2) obj5;
                Data limitsData = (Data) obj2;
                Data feeBreakdown = (Data) obj3;
                Intrinsics.checkNotNullParameter(limitsData, "limitsData");
                Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
                Object obj6 = w2Var.f13500c;
                ExchangeOrder order = ((OrderDetailsScreenContract$InputData) w2Var.f13499b).f96968a;
                List list = (List) limitsData.getContent();
                if (list != null && (sVarD = w2.D(list)) != null) {
                    obj4 = sVarD.f205466g;
                }
                ?? r252 = obj4;
                ChargeBreakdown chargeBreakdown = (ChargeBreakdown) feeBreakdown.getContent();
                Intrinsics.checkNotNullParameter(order, "order");
                ExchangeOrderInfo f72134a = order.getF72134a();
                dj0.d dVarK = f72134a.f72140g;
                xi0.b bVar = f72134a.e;
                double d = f72134a.f72141h;
                xi0.b bVar2 = f72134a.f;
                c3i.a aVar3 = Intrinsics.f(dVarK.f115083b, bVar) ? c3i.a.PRECISE : c3i.a.ESTIMATED;
                xi0.b bVar3 = dVarK.f115083b;
                if (Intrinsics.f(bVar3, bVar)) {
                    dVar = dVarK;
                } else {
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
                    if (e1.I(bigDecimal)) {
                        r6.b.D("The target rate should not be zero");
                        dj0.d.Companion.getClass();
                        dVarL = dj0.d.c(dj0.d.e, 0L, bVar, 1);
                    } else {
                        dj0.d dVar2 = f72134a.f72140g;
                        BigDecimal bigDecimalDivide = BigDecimal.ONE.divide(bigDecimal, MathContext.DECIMAL128);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                        dVarL = pyd.c.L(dVar2, bigDecimalDivide, bVar);
                    }
                    dVar = dVarL;
                }
                c3i.a aVar4 = Intrinsics.f(bVar3, bVar2) ? c3i.a.PRECISE : c3i.a.ESTIMATED;
                if (!Intrinsics.f(bVar3, bVar2)) {
                    dVarK = pyd.c.K(dVarK, d, bVar2);
                }
                return new c3i.b(f72134a.f72139c, f72134a.d, f72134a.f72141h, dVar, aVar3, dVarK, aVar4, chargeBreakdown, r252);
            case 10:
                final com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar4 = (com.revolut.feature_exchange.impl.ui.order_details_kompot.b) obj5;
                b3i.c cVar2 = bVar4.f96974r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                OrderDetailsScreenContract$ModalStep step2 = (OrderDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof OrderDetailsScreenContract$ModalStep.FeeAlert) {
                    OrderDetailsScreenContract$ModalStep.FeeAlert feeAlert = (OrderDetailsScreenContract$ModalStep.FeeAlert) step2;
                    Clause limitClause = feeAlert.f96970a;
                    Clause feeClause = feeAlert.f96971b;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(limitClause, "limitClause");
                    Intrinsics.checkNotNullParameter(feeClause, "feeClause");
                    lw0.a aVar5 = new lw0.a(new TextLocalisedClause(R$string.fx_orders_fee_alert_title, null, null, 14), new TextLocalisedClause(R$string.fx_orders_fee_alert_limit_message, zhm.v.k(limitClause, feeClause), null, 12), null, null, false, 28);
                    m6 m6Var = n6.Companion;
                    aw0.g gVar = new aw0.g(m6.c(m6Var, new TextLocalisedClause(R$string.fx_orders_fee_alert_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.fx_orders_fee_alert_action_upgrade, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar5, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    final ?? r218 = r2 == true ? 1 : 0;
                    Function1 block2 = new Function1() { // from class: a3i.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            dii.g output = (dii.g) obj7;
                            switch (r218) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, dii.f.f115069a)) {
                                        hha.u.Companion.getClass();
                                        bVar4.C1(u0.c(new PricingPlanFeatureConfig.DashboardByFeature(hha.u.f, xfa.b.FX_LIMIT_PITCH, null, false, 1020)));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, dii.f.f115069a)) {
                                        com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar5 = bVar4;
                                        bVar5.l2(new r(bVar5, null, 0), new yi5.b(26));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    actionsBottomSheetController.H = block2;
                    return actionsBottomSheetController;
                }
                if (!(step2 instanceof OrderDetailsScreenContract$ModalStep.CancelConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                wd6.h orderType = ((OrderDetailsScreenContract$ModalStep.CancelConfirmation) step2).f96969a;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                int i6 = b3i.b.f12031a[orderType.ordinal()];
                if (i6 == 1) {
                    i = R$string.fx_orders_auto_exchange_confirmation_limit_order_subtitle;
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException("please add the explicit logic for a new order type");
                    }
                    i = R$string.fx_orders_auto_exchange_confirmation_stop_order_subtitle;
                }
                lw0.a aVar6 = new lw0.a(new TextLocalisedClause(R$string.fx_orders_auto_exchange_confirmation_title, null, null, 14), new TextLocalisedClause(i, null, null, 14), null, null, false, 28);
                m6 m6Var2 = n6.Companion;
                aw0.g gVar2 = new aw0.g(m6.c(m6Var2, new TextLocalisedClause(R$string.fx_orders_auto_exchange_confirmation_action_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(R$string.fx_orders_auto_exchange_confirmation_action_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                k9 k9Var2 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar6, gVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                Function1 block3 = new Function1() { // from class: a3i.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        dii.g output = (dii.g) obj7;
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (Intrinsics.f(output, dii.f.f115069a)) {
                                    hha.u.Companion.getClass();
                                    bVar4.C1(u0.c(new PricingPlanFeatureConfig.DashboardByFeature(hha.u.f, xfa.b.FX_LIMIT_PITCH, null, false, 1020)));
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (Intrinsics.f(output, dii.f.f115069a)) {
                                    com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar5 = bVar4;
                                    bVar5.l2(new r(bVar5, null, 0), new yi5.b(26));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block3, "block");
                actionsBottomSheetController2.H = block3;
                return actionsBottomSheetController2;
            case 11:
                com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.a aVar7 = (com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.a) obj5;
                yki.l FlowCoordinator = (yki.l) obj2;
                PaymentVendorsBeneCreationFlowContract$Step step3 = (PaymentVendorsBeneCreationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof PaymentVendorsBeneCreationFlowContract$Step.BeneficiaryCreation)) {
                    if (!Intrinsics.f(step3, PaymentVendorsBeneCreationFlowContract$Step.VendorSelection.f102015a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VendorSelectionScreen vendorSelectionScreen = new VendorSelectionScreen();
                    a08.o block4 = new a08.o(aVar7, FlowCoordinator, 9);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    vendorSelectionScreen.H = block4;
                    return vendorSelectionScreen;
                }
                PaymentVendor paymentVendor = ((PaymentVendorsBeneCreationFlowContract$Step.BeneficiaryCreation) step3).f102014a;
                Iterator it8 = paymentVendor.f.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (((PaymentVendorCorridor) next).f64084c) {
                            obj4 = next;
                        }
                    }
                }
                PaymentVendorCorridor paymentVendorCorridor = (PaymentVendorCorridor) obj4;
                if (paymentVendorCorridor == null) {
                    paymentVendorCorridor = (PaymentVendorCorridor) zhm.d0.b0(paymentVendor.f);
                }
                ViewController viewControllerE1 = aVar7.e1(new com.revolut.retail.feature.beneficiary.api.navigation.a(new BeneficiaryCreationKompotInputData.CreationConfiguration.PaymentVendor(paymentVendorCorridor.f64082a, paymentVendorCorridor.f64083b, new BeneficiaryRouteType.PaymentVendorType(paymentVendor), zhm.h0.f322473a)));
                a0.c block5 = new a0.c(aVar7, 19);
                Intrinsics.checkNotNullParameter(block5, "block");
                viewControllerE1.H = block5;
                return viewControllerE1;
            case 12:
                final com.revolut.chat.ui.flow.e eVar = (com.revolut.chat.ui.flow.e) obj5;
                nf3.a aVar8 = eVar.f51161r;
                final ChatFlowContract$Step step4 = (ChatFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof ChatFlowContract$Step.IntroVideo) {
                    ChatIntroVideoScreen chatIntroVideoScreen = new ChatIntroVideoScreen(new ChatIntroVideoScreenContract$InputData(((ChatFlowContract$Step.IntroVideo) step4).f51154a));
                    final ?? r219 = r210 == true ? 1 : 0;
                    Function1 block6 = new Function1() { // from class: a50.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i21 = r219;
                            ChatFlowContract$Step chatFlowContract$Step = step4;
                            switch (i21) {
                                case 0:
                                    g50.c output = (g50.c) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, c.C0816c.f140597a);
                                    com.revolut.chat.ui.flow.e eVar2 = eVar;
                                    if (zF) {
                                        eVar2.l2(new com.revolut.chat.ui.flow.a(eVar2, chatFlowContract$Step, null), new yi5.b(26));
                                    } else if (Intrinsics.f(output, c.b.f140596a)) {
                                        eVar2.l2(new com.revolut.chat.ui.flow.b(eVar2, chatFlowContract$Step, null), new yi5.b(26));
                                    } else {
                                        if (!Intrinsics.f(output, c.a.f140595a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar2.B2();
                                        Unit unit = Unit.f186387a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    fj3.c result = (fj3.c) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof fj3.a;
                                    com.revolut.chat.ui.flow.e eVar3 = eVar;
                                    if (z) {
                                        eVar3.l2(new com.revolut.chat.ui.flow.d(eVar3, chatFlowContract$Step, null), new yi5.b(26));
                                        h.t2(eVar3, eVar3.s(), new ChatFlowContract$Step.Chat(((ChatFlowContract$Step.AirMandatoryIntroStories) chatFlowContract$Step).f51151a), false, TransitionAnimation.FADE.f98392a, false, 8);
                                    } else {
                                        if (!(result instanceof fj3.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    chatIntroVideoScreen.H = block6;
                    return chatIntroVideoScreen;
                }
                if (step4 instanceof ChatFlowContract$Step.AirIntroStories) {
                    aVar8.getClass();
                    ViewController viewControllerE12 = eVar.e1(new CmsStoriesControllerDescriptor("air-onboarding-stories", fj3.f.DYNAMIC));
                    viewControllerE12.j2(new a07.b(eVar, step4, 7));
                    final ?? r220 = r23 == true ? 1 : 0;
                    Function1 block7 = new Function1() { // from class: a50.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (r220) {
                                case 0:
                                    fj3.c it9 = (fj3.c) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    eVar.B2();
                                    return Unit.f186387a;
                                case 1:
                                    r40.b output = (r40.b) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof b.C1386b;
                                    com.revolut.chat.ui.flow.e eVar2 = eVar;
                                    if (z) {
                                        b.C1386b c1386b = (b.C1386b) output;
                                        h.t2(eVar2, eVar2.s(), new ChatFlowContract$Step.Chat(new ChatTarget.Messages(new ChatFeed.Support(c1386b.f251324b, null, c1386b.f251325c, 2), t.DEFAULT, null, 4)), true, null, false, 12);
                                    } else {
                                        if (!(output instanceof b.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(eVar2.s());
                                    }
                                    return Unit.f186387a;
                                default:
                                    k50.u0 output2 = (k50.u0) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (!Intrinsics.f(output2, k50.u0.f181253a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar.B2();
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    viewControllerE12.H = block7;
                    return viewControllerE12;
                }
                if (step4 instanceof ChatFlowContract$Step.AirMandatoryIntroStories) {
                    aVar8.getClass();
                    ViewController viewControllerE13 = eVar.e1(new CmsStoriesControllerDescriptor("air-onboarding-stories-blocking-consent", fj3.f.DYNAMIC));
                    Function1 block8 = new Function1() { // from class: a50.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i21 = i5;
                            ChatFlowContract$Step chatFlowContract$Step = step4;
                            switch (i21) {
                                case 0:
                                    g50.c output = (g50.c) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, c.C0816c.f140597a);
                                    com.revolut.chat.ui.flow.e eVar2 = eVar;
                                    if (zF) {
                                        eVar2.l2(new com.revolut.chat.ui.flow.a(eVar2, chatFlowContract$Step, null), new yi5.b(26));
                                    } else if (Intrinsics.f(output, c.b.f140596a)) {
                                        eVar2.l2(new com.revolut.chat.ui.flow.b(eVar2, chatFlowContract$Step, null), new yi5.b(26));
                                    } else {
                                        if (!Intrinsics.f(output, c.a.f140595a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar2.B2();
                                        Unit unit = Unit.f186387a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    fj3.c result = (fj3.c) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof fj3.a;
                                    com.revolut.chat.ui.flow.e eVar3 = eVar;
                                    if (z) {
                                        eVar3.l2(new com.revolut.chat.ui.flow.d(eVar3, chatFlowContract$Step, null), new yi5.b(26));
                                        h.t2(eVar3, eVar3.s(), new ChatFlowContract$Step.Chat(((ChatFlowContract$Step.AirMandatoryIntroStories) chatFlowContract$Step).f51151a), false, TransitionAnimation.FADE.f98392a, false, 8);
                                    } else {
                                        if (!(result instanceof fj3.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    viewControllerE13.H = block8;
                    return viewControllerE13;
                }
                if (step4 instanceof ChatFlowContract$Step.Chat) {
                    ChatTarget.Messages messages = ((ChatFlowContract$Step.Chat) step4).f51152a;
                    MessagesScreen messagesScreen = new MessagesScreen(new MessagesContract$InputData(messages.f51049a, messages.f51050b, messages.f51051c));
                    final int i21 = 2;
                    Function1 block9 = new Function1() { // from class: a50.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i21) {
                                case 0:
                                    fj3.c it9 = (fj3.c) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    eVar.B2();
                                    return Unit.f186387a;
                                case 1:
                                    r40.b output = (r40.b) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof b.C1386b;
                                    com.revolut.chat.ui.flow.e eVar2 = eVar;
                                    if (z) {
                                        b.C1386b c1386b = (b.C1386b) output;
                                        h.t2(eVar2, eVar2.s(), new ChatFlowContract$Step.Chat(new ChatTarget.Messages(new ChatFeed.Support(c1386b.f251324b, null, c1386b.f251325c, 2), t.DEFAULT, null, 4)), true, null, false, 12);
                                    } else {
                                        if (!(output instanceof b.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(eVar2.s());
                                    }
                                    return Unit.f186387a;
                                default:
                                    k50.u0 output2 = (k50.u0) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (!Intrinsics.f(output2, k50.u0.f181253a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar.B2();
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    messagesScreen.H = block9;
                    return messagesScreen;
                }
                if (!(step4 instanceof ChatFlowContract$Step.ChatList)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChatTarget.ChatList chatList = ((ChatFlowContract$Step.ChatList) step4).f51153a;
                ChatListScreen chatListScreen = new ChatListScreen(new ChatListContract$InputData(chatList.d, chatList.f51047b, chatList.f51046a, v30.t.DEFAULT, chatList.f51048c, 1));
                Function1 function1 = new Function1() { // from class: a50.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i5) {
                            case 0:
                                fj3.c it9 = (fj3.c) obj7;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                eVar.B2();
                                return Unit.f186387a;
                            case 1:
                                r40.b output = (r40.b) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z = output instanceof b.C1386b;
                                com.revolut.chat.ui.flow.e eVar2 = eVar;
                                if (z) {
                                    b.C1386b c1386b = (b.C1386b) output;
                                    h.t2(eVar2, eVar2.s(), new ChatFlowContract$Step.Chat(new ChatTarget.Messages(new ChatFeed.Support(c1386b.f251324b, null, c1386b.f251325c, 2), t.DEFAULT, null, 4)), true, null, false, 12);
                                } else {
                                    if (!(output instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(eVar2.s());
                                }
                                return Unit.f186387a;
                            default:
                                k50.u0 output2 = (k50.u0) obj7;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (!Intrinsics.f(output2, k50.u0.f181253a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar.B2();
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                chatListScreen.H = function1;
                return chatListScreen;
            case 13:
                com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a aVar9 = (com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a) obj5;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                CreditAgreementsV2FlowContract$Step step5 = (CreditAgreementsV2FlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof CreditAgreementsV2FlowContract$Step.DocumentViewer)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i22 = com.revolut.feature.credit.core.R$string.agreements_documents_title;
                CreditAgreementsV2FlowContract$Step.DocumentViewer documentViewer = (CreditAgreementsV2FlowContract$Step.DocumentViewer) step5;
                su3.a aVar10 = documentViewer.f67015c;
                String str2 = aVar10.e;
                if (str2 == null) {
                    str2 = documentViewer.f67013a;
                }
                CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = new CreditApplicationDocumentViewerScreen(new CreditApplicationDocumentViewerScreenContract$InputData(new TextLocalisedClause(i22, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), documentViewer.f67013a, new v44.f(aVar10.f265635a, aVar10.f265636b), documentViewer.d, null, new AnalyticsContext(v7.m(aVar9.f67016p.f67009a, AnalyticsContext.INSTANCE)), documentViewer.f67014b, documentViewer.e, 16));
                a0.c block10 = new a0.c(aVar9, 21);
                Intrinsics.checkNotNullParameter(block10, "block");
                creditApplicationDocumentViewerScreen.H = block10;
                return creditApplicationDocumentViewerScreen;
            case 14:
                com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a aVar11 = (com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelFlightsBookingDetailsScreenContract$ModalStep step6 = (TravelFlightsBookingDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof TravelFlightsBookingDetailsScreenContract$ModalStep.TicketRules) {
                    return new TravelFlightsTicketRulesScreen(new TravelFlightsTicketRulesScreenContract$InputData(((TravelFlightsBookingDetailsScreenContract$ModalStep.TicketRules) step6).f93278a));
                }
                if (step6 instanceof TravelFlightsBookingDetailsScreenContract$ModalStep.BookingContact) {
                    TravelFlightsBookingDetailsScreenContract$ModalStep.BookingContact bookingContact = (TravelFlightsBookingDetailsScreenContract$ModalStep.BookingContact) step6;
                    return new TravelFlightsBookingContactScreen(new TravelFlightsBookingContactScreenContract$InputData.ForBookingDetails(bookingContact.f93270a, bookingContact.f93271b, bookingContact.f93272c, bookingContact.d));
                }
                if (step6 instanceof TravelFlightsBookingDetailsScreenContract$ModalStep.ItineraryPreview) {
                    TravelFlightsBookingDetailsScreenContract$ModalStep.ItineraryPreview itineraryPreview = (TravelFlightsBookingDetailsScreenContract$ModalStep.ItineraryPreview) step6;
                    return new TravelFlightsItineraryPreviewScreen(new TravelFlightsItineraryPreviewScreenContract$InputData(itineraryPreview.f93275a, itineraryPreview.f93276b, itineraryPreview.f93277c));
                }
                if (step6 instanceof TravelFlightsBookingDetailsScreenContract$ModalStep.BookingStatusDetails) {
                    TravelFlightsBookingStatusScreen travelFlightsBookingStatusScreen = new TravelFlightsBookingStatusScreen(new TravelFlightsBookingStatusScreenContract$InputData(((TravelFlightsBookingDetailsScreenContract$ModalStep.BookingStatusDetails) step6).f93273a));
                    a0.c block11 = new a0.c(aVar11, 24);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    travelFlightsBookingStatusScreen.H = block11;
                    return travelFlightsBookingStatusScreen;
                }
                if (!(step6 instanceof TravelFlightsBookingDetailsScreenContract$ModalStep.ChatRedirect)) {
                    throw new NoWhenBranchMatchedException();
                }
                j5g.b bVar5 = aVar11.f93279p;
                TravelFlightsChatRedirectScreenContract$InputData inputData = new TravelFlightsChatRedirectScreenContract$InputData(((TravelFlightsBookingDetailsScreenContract$ModalStep.ChatRedirect) step6).f93274a);
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new TravelFlightsChatRedirectScreen(inputData);
            case 15:
                final com.revolut.feature.masav.impl.ui.c cVar3 = (com.revolut.feature.masav.impl.ui.c) obj5;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                MasavDirectDebitsFlowContract$Step step7 = (MasavDirectDebitsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof MasavDirectDebitsFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE14 = cVar3.e1(new ProductArticleDescriptor(cVar3.f78108q, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    final int i32 = 2;
                    Function1 block12 = new Function1() { // from class: a69.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i32) {
                                case 0:
                                    l result = (l) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof j) {
                                        DirectDebitData directDebitData = ((j) result).f21730a;
                                        com.revolut.feature.masav.impl.ui.c cVar4 = cVar3;
                                        cVar4.l2(new a1a.a(cVar4, directDebitData, null, 12), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    g result2 = (g) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof g) {
                                        cVar3.C2(q.f5292a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    yja.b it9 = (yja.b) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    com.revolut.feature.masav.impl.ui.c cVar5 = cVar3;
                                    h.t2(cVar5, cVar5.f78109r, MasavDirectDebitsFlowContract$Step.InstitutionsList.f78100a, false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    d result3 = (d) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z = result3 instanceof dm1.c;
                                    com.revolut.feature.masav.impl.ui.c cVar6 = cVar3;
                                    if (z) {
                                        h.t2(cVar6, cVar6.f78109r, new MasavDirectDebitsFlowContract$Step.Form(((dm1.c) result3).f115817a), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result3, dm1.b.f115816a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(cVar6.f78109r);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE14.H = block12;
                    return viewControllerE14;
                }
                if (step7 instanceof MasavDirectDebitsFlowContract$Step.InstitutionsList) {
                    ViewController viewControllerE15 = cVar3.e1(new dm1.a(new BillerSearchNavigation$InputData(xo1.g.MASAV_IL_DIRECT_DEBIT, null)));
                    final int i33 = 3;
                    Function1 block13 = new Function1() { // from class: a69.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i33) {
                                case 0:
                                    l result = (l) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof j) {
                                        DirectDebitData directDebitData = ((j) result).f21730a;
                                        com.revolut.feature.masav.impl.ui.c cVar4 = cVar3;
                                        cVar4.l2(new a1a.a(cVar4, directDebitData, null, 12), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    g result2 = (g) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof g) {
                                        cVar3.C2(q.f5292a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    yja.b it9 = (yja.b) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    com.revolut.feature.masav.impl.ui.c cVar5 = cVar3;
                                    h.t2(cVar5, cVar5.f78109r, MasavDirectDebitsFlowContract$Step.InstitutionsList.f78100a, false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    d result3 = (d) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z = result3 instanceof dm1.c;
                                    com.revolut.feature.masav.impl.ui.c cVar6 = cVar3;
                                    if (z) {
                                        h.t2(cVar6, cVar6.f78109r, new MasavDirectDebitsFlowContract$Step.Form(((dm1.c) result3).f115817a), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result3, dm1.b.f115816a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(cVar6.f78109r);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    viewControllerE15.H = block13;
                    return viewControllerE15;
                }
                if (step7 instanceof MasavDirectDebitsFlowContract$Step.Form) {
                    MasavDirectDebitFormScreen masavDirectDebitFormScreen = new MasavDirectDebitFormScreen(new MasavDirectDebitFormScreenContract$InputData.CreateByCreditor(((MasavDirectDebitsFlowContract$Step.Form) step7).f78099a));
                    final ?? r221 = r211 == true ? 1 : 0;
                    Function1 block14 = new Function1() { // from class: a69.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (r221) {
                                case 0:
                                    l result = (l) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof j) {
                                        DirectDebitData directDebitData = ((j) result).f21730a;
                                        com.revolut.feature.masav.impl.ui.c cVar4 = cVar3;
                                        cVar4.l2(new a1a.a(cVar4, directDebitData, null, 12), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    g result2 = (g) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof g) {
                                        cVar3.C2(q.f5292a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    yja.b it9 = (yja.b) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    com.revolut.feature.masav.impl.ui.c cVar5 = cVar3;
                                    h.t2(cVar5, cVar5.f78109r, MasavDirectDebitsFlowContract$Step.InstitutionsList.f78100a, false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    d result3 = (d) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z = result3 instanceof dm1.c;
                                    com.revolut.feature.masav.impl.ui.c cVar6 = cVar3;
                                    if (z) {
                                        h.t2(cVar6, cVar6.f78109r, new MasavDirectDebitsFlowContract$Step.Form(((dm1.c) result3).f115817a), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result3, dm1.b.f115816a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(cVar6.f78109r);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    masavDirectDebitFormScreen.H = block14;
                    return masavDirectDebitFormScreen;
                }
                if (!(step7 instanceof MasavDirectDebitsFlowContract$Step.Review)) {
                    throw new NoWhenBranchMatchedException();
                }
                MasavDirectDebitsFlowContract$Step.Review review = (MasavDirectDebitsFlowContract$Step.Review) step7;
                MasavDirectDebitReviewScreen masavDirectDebitReviewScreen = new MasavDirectDebitReviewScreen(new MasavDirectDebitReviewScreenContract$InputData(review.f78102a, review.f78103b));
                Function1 block15 = new Function1() { // from class: a69.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i5) {
                            case 0:
                                l result = (l) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof j) {
                                    DirectDebitData directDebitData = ((j) result).f21730a;
                                    com.revolut.feature.masav.impl.ui.c cVar4 = cVar3;
                                    cVar4.l2(new a1a.a(cVar4, directDebitData, null, 12), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 1:
                                g result2 = (g) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof g) {
                                    cVar3.C2(q.f5292a);
                                }
                                return Unit.f186387a;
                            case 2:
                                yja.b it9 = (yja.b) obj7;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                com.revolut.feature.masav.impl.ui.c cVar5 = cVar3;
                                h.t2(cVar5, cVar5.f78109r, MasavDirectDebitsFlowContract$Step.InstitutionsList.f78100a, false, null, false, 12);
                                return Unit.f186387a;
                            default:
                                d result3 = (d) obj7;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                boolean z = result3 instanceof dm1.c;
                                com.revolut.feature.masav.impl.ui.c cVar6 = cVar3;
                                if (z) {
                                    h.t2(cVar6, cVar6.f78109r, new MasavDirectDebitsFlowContract$Step.Form(((dm1.c) result3).f115817a), true, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(result3, dm1.b.f115816a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(cVar6.f78109r);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block15, "block");
                masavDirectDebitReviewScreen.H = block15;
                return masavDirectDebitReviewScreen;
            case 16:
                List codes = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(codes, "codes");
                ((a72.m) obj5).f1764c.f("MB_WITHDRAWALS_KEY", codes);
                return Unit.f186387a;
            case 17:
                final com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a aVar12 = (com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a) obj5;
                LegacyConsentPreferencesFlowContract$Step step8 = (LegacyConsentPreferencesFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof LegacyConsentPreferencesFlowContract$Step.Preferences)) {
                    if (!(step8 instanceof LegacyConsentPreferencesFlowContract$Step.EditPreferences)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen = new LegacyEditConsentPreferencesScreen(new LegacyEditConsentPreferencesScreenContract$InputData(((LegacyConsentPreferencesFlowContract$Step.EditPreferences) step8).f67271a));
                    Function1 block16 = new Function1() { // from class: a74.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i5) {
                                case 0:
                                    d74.j outputData = (d74.j) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, d74.g.f111812a);
                                    com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a aVar13 = aVar12;
                                    if (zF) {
                                        h.D2(aVar13.f67275r);
                                    } else if (outputData instanceof i) {
                                        aVar13.H2(aVar13.f67274q, new a0.c(outputData, 28));
                                        h.t2(aVar13, aVar13.f67275r, new LegacyConsentPreferencesFlowContract$Step.EditPreferences(((i) outputData).f111816c), false, null, false, 12);
                                    } else {
                                        if (!(outputData instanceof d74.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar13.l2(new a1a.a(aVar13, ((d74.h) outputData).f111813a, null, 17), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    v outputData2 = (v) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z = outputData2 instanceof b74.t;
                                    LegacyConsentPreferencesFlowContract$Step.Preferences preferences = LegacyConsentPreferencesFlowContract$Step.Preferences.f67272a;
                                    com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a aVar14 = aVar12;
                                    if (z) {
                                        h.t2(aVar14, aVar14.f67275r, preferences, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else {
                                        if (!(outputData2 instanceof u)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar14.H2(aVar14.f67274q, new a0.c(((u) outputData2).f12901a, 29));
                                        h.t2(aVar14, aVar14.f67275r, preferences, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    legacyEditConsentPreferencesScreen.H = block16;
                    return legacyEditConsentPreferencesScreen;
                }
                LegacyConsentPreferencesFlowContract$InputData legacyConsentPreferencesFlowContract$InputData = aVar12.o;
                qki.d dVar3 = aVar12.f67274q;
                LegacyConsentPreferencesScreen legacyConsentPreferencesScreen = new LegacyConsentPreferencesScreen(new LegacyConsentPreferencesScreenContract$InputData(legacyConsentPreferencesFlowContract$InputData.f67268a, ((LegacyConsentPreferencesFlowContract$State) ((j2) dVar3.f22677a).getValue()).f67270b, ((LegacyConsentPreferencesFlowContract$State) ((j2) dVar3.f22677a).getValue()).f67269a));
                final ?? r222 = r212 == true ? 1 : 0;
                Function1 block17 = new Function1() { // from class: a74.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (r222) {
                            case 0:
                                d74.j outputData = (d74.j) obj7;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean zF = Intrinsics.f(outputData, d74.g.f111812a);
                                com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a aVar13 = aVar12;
                                if (zF) {
                                    h.D2(aVar13.f67275r);
                                } else if (outputData instanceof i) {
                                    aVar13.H2(aVar13.f67274q, new a0.c(outputData, 28));
                                    h.t2(aVar13, aVar13.f67275r, new LegacyConsentPreferencesFlowContract$Step.EditPreferences(((i) outputData).f111816c), false, null, false, 12);
                                } else {
                                    if (!(outputData instanceof d74.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar13.l2(new a1a.a(aVar13, ((d74.h) outputData).f111813a, null, 17), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            default:
                                v outputData2 = (v) obj7;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z = outputData2 instanceof b74.t;
                                LegacyConsentPreferencesFlowContract$Step.Preferences preferences = LegacyConsentPreferencesFlowContract$Step.Preferences.f67272a;
                                com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a aVar14 = aVar12;
                                if (z) {
                                    h.t2(aVar14, aVar14.f67275r, preferences, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                } else {
                                    if (!(outputData2 instanceof u)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar14.H2(aVar14.f67274q, new a0.c(((u) outputData2).f12901a, 29));
                                    h.t2(aVar14, aVar14.f67275r, preferences, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block17, "block");
                legacyConsentPreferencesScreen.H = block17;
                return legacyConsentPreferencesScreen;
            case 18:
                q66.c params = (q66.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                return rd0.e.c(new a3i.i(((a76.e) obj5).f1773a.c(params), params, i5), kotlin.coroutines.g.f186406a);
            case 19:
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar4 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CobrandedCardsAdditionalValueScreenContract$ModalStep step9 = (CobrandedCardsAdditionalValueScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof CobrandedCardsAdditionalValueScreenContract$ModalStep.SectionInfo)) {
                    if (!(step9 instanceof CobrandedCardsAdditionalValueScreenContract$ModalStep.CardFees)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c7b.b bVar6 = cVar4.f82561r;
                    CobrandedCardsPlanCardFeesBreakdown breakdown = ((CobrandedCardsAdditionalValueScreenContract$ModalStep.CardFees) step9).f82553a;
                    bVar6.getClass();
                    Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                    lw0.a aVar13 = new lw0.a(new TextClause(breakdown.f82333a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(breakdown.f82334b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
                    aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextClause(breakdown.f82335c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var3 = k9.Cobrands;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar13, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                }
                a7b.v vVar = cVar4.f82562s;
                CobrandedCardsPlanAdditionalValueBottomSheet bottomSheet = ((CobrandedCardsAdditionalValueScreenContract$ModalStep.SectionInfo) step9).f82554a;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                TextClause textClause = new TextClause(bottomSheet.f82314a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = bottomSheet.f82315b;
                lw0.a aVar14 = new lw0.a(textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
                ArrayList<CobrandedCardsPlanAdditionalValueBottomSheetItem> arrayList = bottomSheet.f82316c;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (CobrandedCardsPlanAdditionalValueBottomSheetItem cobrandedCardsPlanAdditionalValueBottomSheetItem : arrayList) {
                    TextClause textClause2 = new TextClause(cobrandedCardsPlanAdditionalValueBottomSheetItem.f82318b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str4 = cobrandedCardsPlanAdditionalValueBottomSheetItem.f82319c;
                    arrayList2.add(new eii.l((Clause) textClause2, (Clause) (str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(vVar.f1836a.c(cobrandedCardsPlanAdditionalValueBottomSheetItem.f82317a), null, null, false, null, false, 62), false, false, (RowDelegate.Model.c) (0 == true ? 1 : 0), (Object) null, 488));
                }
                k9 k9Var4 = k9.Cobrands;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                return new RowActionsBottomSheetController(new eii.c(aVar14, null, arrayList2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null));
            case 20:
                final com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar7 = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelFlightsSearchScreenContract$ModalStep step10 = (TravelFlightsSearchScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof TravelFlightsSearchScreenContract$ModalStep.SortBy) {
                    TravelFlightsSearchSortByScreen travelFlightsSearchSortByScreen = new TravelFlightsSearchSortByScreen(new TravelFlightsSearchSortByScreenContract$InputData(((TravelFlightsSearchScreenContract$ModalStep.SortBy) step10).f93418a));
                    final int i43 = 2;
                    Function1 block18 = new Function1() { // from class: a7g.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            List list2;
                            int i59 = i43;
                            com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar8 = bVar7;
                            switch (i59) {
                                case 0:
                                    i6g.g output = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    cli.y yVar = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch = ((r) ((j2) yVar.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch, uc0.b.E(output.f158997a), null, null, null, null, null, 62);
                                    bVar8.H2(yVar, new a7b.r(flightSearchQueryA, 3));
                                    bVar8.f93424r.a(flightSearchQueryA);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 1:
                                    r6g.i output2 = (r6g.i) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    cli.y yVar2 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch2 = ((r) ((j2) yVar2.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch2, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA2 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch2, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                    bVar8.H2(yVar2, new a7b.r(flightSearchQueryA2, 3));
                                    bVar8.f93424r.a(flightSearchQueryA2);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA2, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    d7g.c output3 = (d7g.c) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    cli.y yVar3 = bVar8.f93427w;
                                    bVar8.H2(yVar3, new a7b.r(output3, 2));
                                    j2 j2Var = (j2) yVar3.f22677a;
                                    j2 j2Var2 = (j2) yVar3.f22677a;
                                    lk0.e eVar3 = (lk0.e) zhm.d0.d0(((r) j2Var.getValue()).f1893b.f196174a);
                                    if (eVar3 == null || (list2 = eVar3.f196171a) == null || !(!list2.isEmpty())) {
                                        bVar8.J2(((r) j2Var2.getValue()).f1892a, output3.f111962a);
                                    } else {
                                        bVar8.I2(((r) j2Var2.getValue()).f, output3.f111962a);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    y6g.l output4 = (y6g.l) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    bVar8.l2(new com.revolut.feature.travel.flights.impl.ui.screen.search_results.a(bVar8, output4, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    h4g.i iVar = bVar8.f93424r;
                                    cli.y yVar4 = bVar8.f93427w;
                                    t5g.e output5 = (t5g.e) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output5.f268108a;
                                    if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch3 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch3, "$this$updateSearchQueryAndTriggerSearch");
                                        FlightSearchQuery flightSearchQueryA3 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch3, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA3, 3));
                                        iVar.a(flightSearchQueryA3);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA3, null, 20), new yi5.b(26));
                                    } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch4 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch4, "$this$updateSearchQueryAndTriggerSearch");
                                        TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                        FlightSearchQuery flightSearchQueryA4 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch4, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA4, 3));
                                        iVar.a(flightSearchQueryA4);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA4, null, 20), new yi5.b(26));
                                    } else {
                                        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i66 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    i6g.g output6 = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    cli.y yVar5 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch5 = ((r) ((j2) yVar5.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch5, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA5 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch5, null, uc0.b.E(output6.f158997a), null, null, null, null, 61);
                                    bVar8.H2(yVar5, new a7b.r(flightSearchQueryA5, 3));
                                    bVar8.f93424r.a(flightSearchQueryA5);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA5, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    travelFlightsSearchSortByScreen.H = block18;
                    return travelFlightsSearchSortByScreen;
                }
                if (step10 instanceof TravelFlightsSearchScreenContract$ModalStep.OriginSelection) {
                    TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen = new TravelFlightsLocationPickerScreen(0);
                    final ?? r223 = r213 == true ? 1 : 0;
                    Function1 block19 = new Function1() { // from class: a7g.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            List list2;
                            int i59 = r223;
                            com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar8 = bVar7;
                            switch (i59) {
                                case 0:
                                    i6g.g output = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    cli.y yVar = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch = ((r) ((j2) yVar.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch, uc0.b.E(output.f158997a), null, null, null, null, null, 62);
                                    bVar8.H2(yVar, new a7b.r(flightSearchQueryA, 3));
                                    bVar8.f93424r.a(flightSearchQueryA);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 1:
                                    r6g.i output2 = (r6g.i) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    cli.y yVar2 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch2 = ((r) ((j2) yVar2.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch2, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA2 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch2, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                    bVar8.H2(yVar2, new a7b.r(flightSearchQueryA2, 3));
                                    bVar8.f93424r.a(flightSearchQueryA2);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA2, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    d7g.c output3 = (d7g.c) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    cli.y yVar3 = bVar8.f93427w;
                                    bVar8.H2(yVar3, new a7b.r(output3, 2));
                                    j2 j2Var = (j2) yVar3.f22677a;
                                    j2 j2Var2 = (j2) yVar3.f22677a;
                                    lk0.e eVar3 = (lk0.e) zhm.d0.d0(((r) j2Var.getValue()).f1893b.f196174a);
                                    if (eVar3 == null || (list2 = eVar3.f196171a) == null || !(!list2.isEmpty())) {
                                        bVar8.J2(((r) j2Var2.getValue()).f1892a, output3.f111962a);
                                    } else {
                                        bVar8.I2(((r) j2Var2.getValue()).f, output3.f111962a);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    y6g.l output4 = (y6g.l) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    bVar8.l2(new com.revolut.feature.travel.flights.impl.ui.screen.search_results.a(bVar8, output4, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    h4g.i iVar = bVar8.f93424r;
                                    cli.y yVar4 = bVar8.f93427w;
                                    t5g.e output5 = (t5g.e) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output5.f268108a;
                                    if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch3 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch3, "$this$updateSearchQueryAndTriggerSearch");
                                        FlightSearchQuery flightSearchQueryA3 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch3, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA3, 3));
                                        iVar.a(flightSearchQueryA3);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA3, null, 20), new yi5.b(26));
                                    } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch4 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch4, "$this$updateSearchQueryAndTriggerSearch");
                                        TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                        FlightSearchQuery flightSearchQueryA4 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch4, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA4, 3));
                                        iVar.a(flightSearchQueryA4);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA4, null, 20), new yi5.b(26));
                                    } else {
                                        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i66 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    i6g.g output6 = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    cli.y yVar5 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch5 = ((r) ((j2) yVar5.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch5, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA5 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch5, null, uc0.b.E(output6.f158997a), null, null, null, null, 61);
                                    bVar8.H2(yVar5, new a7b.r(flightSearchQueryA5, 3));
                                    bVar8.f93424r.a(flightSearchQueryA5);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA5, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    travelFlightsLocationPickerScreen.H = block19;
                    return travelFlightsLocationPickerScreen;
                }
                if (step10 instanceof TravelFlightsSearchScreenContract$ModalStep.DestinationSelection) {
                    TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen2 = new TravelFlightsLocationPickerScreen(0);
                    final int i59 = 5;
                    Function1 block20 = new Function1() { // from class: a7g.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            List list2;
                            int i592 = i59;
                            com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar8 = bVar7;
                            switch (i592) {
                                case 0:
                                    i6g.g output = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    cli.y yVar = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch = ((r) ((j2) yVar.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch, uc0.b.E(output.f158997a), null, null, null, null, null, 62);
                                    bVar8.H2(yVar, new a7b.r(flightSearchQueryA, 3));
                                    bVar8.f93424r.a(flightSearchQueryA);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 1:
                                    r6g.i output2 = (r6g.i) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    cli.y yVar2 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch2 = ((r) ((j2) yVar2.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch2, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA2 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch2, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                    bVar8.H2(yVar2, new a7b.r(flightSearchQueryA2, 3));
                                    bVar8.f93424r.a(flightSearchQueryA2);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA2, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    d7g.c output3 = (d7g.c) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    cli.y yVar3 = bVar8.f93427w;
                                    bVar8.H2(yVar3, new a7b.r(output3, 2));
                                    j2 j2Var = (j2) yVar3.f22677a;
                                    j2 j2Var2 = (j2) yVar3.f22677a;
                                    lk0.e eVar3 = (lk0.e) zhm.d0.d0(((r) j2Var.getValue()).f1893b.f196174a);
                                    if (eVar3 == null || (list2 = eVar3.f196171a) == null || !(!list2.isEmpty())) {
                                        bVar8.J2(((r) j2Var2.getValue()).f1892a, output3.f111962a);
                                    } else {
                                        bVar8.I2(((r) j2Var2.getValue()).f, output3.f111962a);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    y6g.l output4 = (y6g.l) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    bVar8.l2(new com.revolut.feature.travel.flights.impl.ui.screen.search_results.a(bVar8, output4, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    h4g.i iVar = bVar8.f93424r;
                                    cli.y yVar4 = bVar8.f93427w;
                                    t5g.e output5 = (t5g.e) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output5.f268108a;
                                    if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch3 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch3, "$this$updateSearchQueryAndTriggerSearch");
                                        FlightSearchQuery flightSearchQueryA3 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch3, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA3, 3));
                                        iVar.a(flightSearchQueryA3);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA3, null, 20), new yi5.b(26));
                                    } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch4 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch4, "$this$updateSearchQueryAndTriggerSearch");
                                        TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                        FlightSearchQuery flightSearchQueryA4 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch4, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA4, 3));
                                        iVar.a(flightSearchQueryA4);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA4, null, 20), new yi5.b(26));
                                    } else {
                                        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i66 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    i6g.g output6 = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    cli.y yVar5 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch5 = ((r) ((j2) yVar5.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch5, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA5 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch5, null, uc0.b.E(output6.f158997a), null, null, null, null, 61);
                                    bVar8.H2(yVar5, new a7b.r(flightSearchQueryA5, 3));
                                    bVar8.f93424r.a(flightSearchQueryA5);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA5, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    travelFlightsLocationPickerScreen2.H = block20;
                    return travelFlightsLocationPickerScreen2;
                }
                if (step10 instanceof TravelFlightsSearchScreenContract$ModalStep.DatesSelection) {
                    TravelFlightsSearchScreenContract$ModalStep.DatesSelection datesSelection = (TravelFlightsSearchScreenContract$ModalStep.DatesSelection) step10;
                    TravelFlightsDatesSelectionScreen travelFlightsDatesSelectionScreen = new TravelFlightsDatesSelectionScreen(new TravelFlightsDatesSelectionScreenContract$InputData(datesSelection.f93409a, datesSelection.f93410b));
                    final int i66 = 4;
                    Function1 block21 = new Function1() { // from class: a7g.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            List list2;
                            int i592 = i66;
                            com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar8 = bVar7;
                            switch (i592) {
                                case 0:
                                    i6g.g output = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    cli.y yVar = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch = ((r) ((j2) yVar.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch, uc0.b.E(output.f158997a), null, null, null, null, null, 62);
                                    bVar8.H2(yVar, new a7b.r(flightSearchQueryA, 3));
                                    bVar8.f93424r.a(flightSearchQueryA);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 1:
                                    r6g.i output2 = (r6g.i) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    cli.y yVar2 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch2 = ((r) ((j2) yVar2.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch2, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA2 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch2, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                    bVar8.H2(yVar2, new a7b.r(flightSearchQueryA2, 3));
                                    bVar8.f93424r.a(flightSearchQueryA2);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA2, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    d7g.c output3 = (d7g.c) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    cli.y yVar3 = bVar8.f93427w;
                                    bVar8.H2(yVar3, new a7b.r(output3, 2));
                                    j2 j2Var = (j2) yVar3.f22677a;
                                    j2 j2Var2 = (j2) yVar3.f22677a;
                                    lk0.e eVar3 = (lk0.e) zhm.d0.d0(((r) j2Var.getValue()).f1893b.f196174a);
                                    if (eVar3 == null || (list2 = eVar3.f196171a) == null || !(!list2.isEmpty())) {
                                        bVar8.J2(((r) j2Var2.getValue()).f1892a, output3.f111962a);
                                    } else {
                                        bVar8.I2(((r) j2Var2.getValue()).f, output3.f111962a);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    y6g.l output4 = (y6g.l) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    bVar8.l2(new com.revolut.feature.travel.flights.impl.ui.screen.search_results.a(bVar8, output4, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    h4g.i iVar = bVar8.f93424r;
                                    cli.y yVar4 = bVar8.f93427w;
                                    t5g.e output5 = (t5g.e) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output5.f268108a;
                                    if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch3 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch3, "$this$updateSearchQueryAndTriggerSearch");
                                        FlightSearchQuery flightSearchQueryA3 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch3, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA3, 3));
                                        iVar.a(flightSearchQueryA3);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA3, null, 20), new yi5.b(26));
                                    } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch4 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch4, "$this$updateSearchQueryAndTriggerSearch");
                                        TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                        FlightSearchQuery flightSearchQueryA4 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch4, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA4, 3));
                                        iVar.a(flightSearchQueryA4);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA4, null, 20), new yi5.b(26));
                                    } else {
                                        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i662 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    i6g.g output6 = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    cli.y yVar5 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch5 = ((r) ((j2) yVar5.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch5, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA5 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch5, null, uc0.b.E(output6.f158997a), null, null, null, null, 61);
                                    bVar8.H2(yVar5, new a7b.r(flightSearchQueryA5, 3));
                                    bVar8.f93424r.a(flightSearchQueryA5);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA5, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    travelFlightsDatesSelectionScreen.H = block21;
                    return travelFlightsDatesSelectionScreen;
                }
                if (step10 instanceof TravelFlightsSearchScreenContract$ModalStep.TravelersSelection) {
                    TravelFlightsSearchScreenContract$ModalStep.TravelersSelection travelersSelection = (TravelFlightsSearchScreenContract$ModalStep.TravelersSelection) step10;
                    TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen = new TravelFlightsPassengersPickerScreen(new TravelFlightsPassengersPickerScreenContract$InputData(travelersSelection.f93419a, travelersSelection.f93420b));
                    Function1 block22 = new Function1() { // from class: a7g.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            List list2;
                            int i592 = i5;
                            com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar8 = bVar7;
                            switch (i592) {
                                case 0:
                                    i6g.g output = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    cli.y yVar = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch = ((r) ((j2) yVar.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch, uc0.b.E(output.f158997a), null, null, null, null, null, 62);
                                    bVar8.H2(yVar, new a7b.r(flightSearchQueryA, 3));
                                    bVar8.f93424r.a(flightSearchQueryA);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 1:
                                    r6g.i output2 = (r6g.i) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    cli.y yVar2 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch2 = ((r) ((j2) yVar2.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch2, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA2 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch2, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                    bVar8.H2(yVar2, new a7b.r(flightSearchQueryA2, 3));
                                    bVar8.f93424r.a(flightSearchQueryA2);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA2, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    d7g.c output3 = (d7g.c) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    cli.y yVar3 = bVar8.f93427w;
                                    bVar8.H2(yVar3, new a7b.r(output3, 2));
                                    j2 j2Var = (j2) yVar3.f22677a;
                                    j2 j2Var2 = (j2) yVar3.f22677a;
                                    lk0.e eVar3 = (lk0.e) zhm.d0.d0(((r) j2Var.getValue()).f1893b.f196174a);
                                    if (eVar3 == null || (list2 = eVar3.f196171a) == null || !(!list2.isEmpty())) {
                                        bVar8.J2(((r) j2Var2.getValue()).f1892a, output3.f111962a);
                                    } else {
                                        bVar8.I2(((r) j2Var2.getValue()).f, output3.f111962a);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    y6g.l output4 = (y6g.l) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    bVar8.l2(new com.revolut.feature.travel.flights.impl.ui.screen.search_results.a(bVar8, output4, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    h4g.i iVar = bVar8.f93424r;
                                    cli.y yVar4 = bVar8.f93427w;
                                    t5g.e output5 = (t5g.e) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output5.f268108a;
                                    if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch3 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch3, "$this$updateSearchQueryAndTriggerSearch");
                                        FlightSearchQuery flightSearchQueryA3 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch3, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA3, 3));
                                        iVar.a(flightSearchQueryA3);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA3, null, 20), new yi5.b(26));
                                    } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                        FlightSearchQuery updateSearchQueryAndTriggerSearch4 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                        Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch4, "$this$updateSearchQueryAndTriggerSearch");
                                        TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                        FlightSearchQuery flightSearchQueryA4 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch4, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                        bVar8.H2(yVar4, new a7b.r(flightSearchQueryA4, 3));
                                        iVar.a(flightSearchQueryA4);
                                        bVar8.l2(new a1a.a(bVar8, flightSearchQueryA4, null, 20), new yi5.b(26));
                                    } else {
                                        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i662 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    i6g.g output6 = (i6g.g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    cli.y yVar5 = bVar8.f93427w;
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch5 = ((r) ((j2) yVar5.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch5, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA5 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch5, null, uc0.b.E(output6.f158997a), null, null, null, null, 61);
                                    bVar8.H2(yVar5, new a7b.r(flightSearchQueryA5, 3));
                                    bVar8.f93424r.a(flightSearchQueryA5);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA5, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    travelFlightsPassengersPickerScreen.H = block22;
                    return travelFlightsPassengersPickerScreen;
                }
                if (step10 instanceof TravelFlightsSearchScreenContract$ModalStep.PriceBreakdown) {
                    return new TravelFlightsPriceBreakdownScreen(new TravelFlightsPriceBreakdownScreenContract$InputData(((TravelFlightsSearchScreenContract$ModalStep.PriceBreakdown) step10).f93416a));
                }
                if (Intrinsics.f(step10, TravelFlightsSearchScreenContract$ModalStep.SelfTransfer.f93417a)) {
                    return new TravelFlightsSelfTransferScreen();
                }
                if (!(step10 instanceof TravelFlightsSearchScreenContract$ModalStep.Filters)) {
                    if (!(step10 instanceof TravelFlightsSearchScreenContract$ModalStep.BaggageDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TravelFlightsSearchScreenContract$ModalStep.BaggageDescription baggageDescription = (TravelFlightsSearchScreenContract$ModalStep.BaggageDescription) step10;
                    return new TravelFlightsBaggageInfoScreen(new TravelFlightsBaggageInfoScreenContract$InputData(new TravelFlightsBaggageInfoScreenContract$InputData.Mode.BaggageItems(baggageDescription.f93407a, baggageDescription.f93408b)));
                }
                TravelFlightsSearchScreenContract$ModalStep.Filters filters = (TravelFlightsSearchScreenContract$ModalStep.Filters) step10;
                TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen = new TravelFlightsSearchFiltersScreen(new TravelFlightsSearchFiltersScreenContract$InputData(filters.f93412a, filters.f93413b, filters.f93414c));
                final int i74 = 3;
                Function1 block23 = new Function1() { // from class: a7g.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        List list2;
                        int i592 = i74;
                        com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar8 = bVar7;
                        switch (i592) {
                            case 0:
                                i6g.g output = (i6g.g) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                cli.y yVar = bVar8.f93427w;
                                FlightSearchQuery updateSearchQueryAndTriggerSearch = ((r) ((j2) yVar.f22677a).getValue()).f1892a;
                                Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch, "$this$updateSearchQueryAndTriggerSearch");
                                FlightSearchQuery flightSearchQueryA = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch, uc0.b.E(output.f158997a), null, null, null, null, null, 62);
                                bVar8.H2(yVar, new a7b.r(flightSearchQueryA, 3));
                                bVar8.f93424r.a(flightSearchQueryA);
                                bVar8.l2(new a1a.a(bVar8, flightSearchQueryA, null, 20), new yi5.b(26));
                                return Unit.f186387a;
                            case 1:
                                r6g.i output2 = (r6g.i) obj7;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                cli.y yVar2 = bVar8.f93427w;
                                FlightSearchQuery updateSearchQueryAndTriggerSearch2 = ((r) ((j2) yVar2.f22677a).getValue()).f1892a;
                                Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch2, "$this$updateSearchQueryAndTriggerSearch");
                                FlightSearchQuery flightSearchQueryA2 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch2, null, null, null, null, output2.f251844a, output2.f251845b, 15);
                                bVar8.H2(yVar2, new a7b.r(flightSearchQueryA2, 3));
                                bVar8.f93424r.a(flightSearchQueryA2);
                                bVar8.l2(new a1a.a(bVar8, flightSearchQueryA2, null, 20), new yi5.b(26));
                                return Unit.f186387a;
                            case 2:
                                d7g.c output3 = (d7g.c) obj7;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                cli.y yVar3 = bVar8.f93427w;
                                bVar8.H2(yVar3, new a7b.r(output3, 2));
                                j2 j2Var = (j2) yVar3.f22677a;
                                j2 j2Var2 = (j2) yVar3.f22677a;
                                lk0.e eVar3 = (lk0.e) zhm.d0.d0(((r) j2Var.getValue()).f1893b.f196174a);
                                if (eVar3 == null || (list2 = eVar3.f196171a) == null || !(!list2.isEmpty())) {
                                    bVar8.J2(((r) j2Var2.getValue()).f1892a, output3.f111962a);
                                } else {
                                    bVar8.I2(((r) j2Var2.getValue()).f, output3.f111962a);
                                }
                                return Unit.f186387a;
                            case 3:
                                y6g.l output4 = (y6g.l) obj7;
                                Intrinsics.checkNotNullParameter(output4, "output");
                                bVar8.l2(new com.revolut.feature.travel.flights.impl.ui.screen.search_results.a(bVar8, output4, null), new yi5.b(26));
                                return Unit.f186387a;
                            case 4:
                                h4g.i iVar = bVar8.f93424r;
                                cli.y yVar4 = bVar8.f93427w;
                                t5g.e output5 = (t5g.e) obj7;
                                Intrinsics.checkNotNullParameter(output5, "output");
                                TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = output5.f268108a;
                                if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch3 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch3, "$this$updateSearchQueryAndTriggerSearch");
                                    FlightSearchQuery flightSearchQueryA3 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch3, null, null, ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a, null, null, null, 51);
                                    bVar8.H2(yVar4, new a7b.r(flightSearchQueryA3, 3));
                                    iVar.a(flightSearchQueryA3);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA3, null, 20), new yi5.b(26));
                                } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) {
                                    FlightSearchQuery updateSearchQueryAndTriggerSearch4 = ((r) ((j2) yVar4.f22677a).getValue()).f1892a;
                                    Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch4, "$this$updateSearchQueryAndTriggerSearch");
                                    TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                                    FlightSearchQuery flightSearchQueryA4 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch4, null, null, roundTrip.f93323a, roundTrip.f93324b, null, null, 51);
                                    bVar8.H2(yVar4, new a7b.r(flightSearchQueryA4, 3));
                                    iVar.a(flightSearchQueryA4);
                                    bVar8.l2(new a1a.a(bVar8, flightSearchQueryA4, null, 20), new yi5.b(26));
                                } else {
                                    if (travelFlightsDatesSelectionScreenContract$Trip != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i662 = jli.h.f175850a;
                                }
                                return Unit.f186387a;
                            default:
                                i6g.g output6 = (i6g.g) obj7;
                                Intrinsics.checkNotNullParameter(output6, "output");
                                cli.y yVar5 = bVar8.f93427w;
                                FlightSearchQuery updateSearchQueryAndTriggerSearch5 = ((r) ((j2) yVar5.f22677a).getValue()).f1892a;
                                Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch5, "$this$updateSearchQueryAndTriggerSearch");
                                FlightSearchQuery flightSearchQueryA5 = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch5, null, uc0.b.E(output6.f158997a), null, null, null, null, 61);
                                bVar8.H2(yVar5, new a7b.r(flightSearchQueryA5, 3));
                                bVar8.f93424r.a(flightSearchQueryA5);
                                bVar8.l2(new a1a.a(bVar8, flightSearchQueryA5, null, 20), new yi5.b(26));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block23, "block");
                travelFlightsSearchFiltersScreen.H = block23;
                return travelFlightsSearchFiltersScreen;
            case 21:
                final com.revolut.feature_move_money.impl.automation.flow.b bVar8 = (com.revolut.feature_move_money.impl.automation.flow.b) obj5;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                MoveMoneyAutomationFlowContract$Step step11 = (MoveMoneyAutomationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof MoveMoneyAutomationFlowContract$Step.AutomationScreen) {
                    MoveMoneyAutomationScreen moveMoneyAutomationScreen = new MoveMoneyAutomationScreen(new MoveMoneyAutomationScreenContract$InputData(bVar8.o.f97314a));
                    final ?? r224 = r214 == true ? 1 : 0;
                    Function1 block24 = new Function1() { // from class: a7i.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (r224) {
                                case 0:
                                    c7i.t result = (c7i.t) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof s)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar8.C2(new c(((s) result).f22027a));
                                    return Unit.f186387a;
                                default:
                                    yja.b result2 = (yja.b) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    int i92 = g.f1912a[result2.ordinal()];
                                    com.revolut.feature_move_money.impl.automation.flow.b bVar9 = bVar8;
                                    if (i92 == 1) {
                                        h.D2(bVar9.f97321q);
                                    } else {
                                        if (i92 != 2 && i92 != 3 && i92 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(bVar9, bVar9.f97321q, MoveMoneyAutomationFlowContract$Step.AutomationScreen.f97315a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    moveMoneyAutomationScreen.H = block24;
                    return moveMoneyAutomationScreen;
                }
                if (!(step11 instanceof MoveMoneyAutomationFlowContract$Step.ProductArticleScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                MoveMoneyAutomationFlowContract$Step.ProductArticleScreen productArticleScreen = (MoveMoneyAutomationFlowContract$Step.ProductArticleScreen) step11;
                ViewController viewControllerE16 = bVar8.e1(new ProductArticleDescriptor(productArticleScreen.f97316a, productArticleScreen.f97317b, false, null, null, false, 60));
                Function1 block25 = new Function1() { // from class: a7i.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i5) {
                            case 0:
                                c7i.t result = (c7i.t) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar8.C2(new c(((s) result).f22027a));
                                return Unit.f186387a;
                            default:
                                yja.b result2 = (yja.b) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                int i92 = g.f1912a[result2.ordinal()];
                                com.revolut.feature_move_money.impl.automation.flow.b bVar9 = bVar8;
                                if (i92 == 1) {
                                    h.D2(bVar9.f97321q);
                                } else {
                                    if (i92 != 2 && i92 != 3 && i92 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar9, bVar9.f97321q, MoveMoneyAutomationFlowContract$Step.AutomationScreen.f97315a, false, null, false, 12);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block25, "block");
                viewControllerE16.H = block25;
                return viewControllerE16;
            case 22:
                com.revolut.feature.apm.multibanco.impl.ui.home.area.b bVar9 = (com.revolut.feature.apm.multibanco.impl.ui.home.area.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                MultibancoHomeAreaContract$ModalStep step12 = (MultibancoHomeAreaContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof MultibancoHomeAreaContract$ModalStep.AddNewContact) {
                    return bVar9.e1(bVar9.f62604r.c(hrf.f.OUTGOING, null));
                }
                if (step12 instanceof MultibancoHomeAreaContract$ModalStep.RecipientList) {
                    return bVar9.e1(bVar9.f62605s.a(((MultibancoHomeAreaContract$ModalStep.RecipientList) step12).f62598a));
                }
                if (step12 instanceof MultibancoHomeAreaContract$ModalStep.PayFlow) {
                    return new MultibancoPayFlow(new MultibancoPayFlowContract$InputData(new TransferMoneyPocket(null, null, 3), bVar9.o.f62595a));
                }
                if (step12 instanceof MultibancoHomeAreaContract$ModalStep.WithdrawalFlow) {
                    return new MultibancoWithdrawalFlow(new MultibancoWithdrawalInputData((int) (r215 == true ? 1 : 0)));
                }
                if (step12 instanceof MultibancoHomeAreaContract$ModalStep.WithdrawalList) {
                    return new WithdrawalCodeListScreen();
                }
                if (step12 instanceof MultibancoHomeAreaContract$ModalStep.WithdrawalDetails) {
                    return new WithdrawalCodeDetailsScreen(new MultibancoCodeDetailsInputData.ByCode(((MultibancoHomeAreaContract$ModalStep.WithdrawalDetails) step12).f62599a));
                }
                throw new NoWhenBranchMatchedException();
            case 23:
                com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar15 = (com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardsListScreenContract$ModalStep step13 = (CardsListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof CardsListScreenContract$ModalStep.ShowExpiringCardsBottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                ExpiringCardsBottomSheetScreen expiringCardsBottomSheetScreen = new ExpiringCardsBottomSheetScreen(new ExpiringCardsBottomSheetContract$InputData(((CardsListScreenContract$ModalStep.ShowExpiringCardsBottomSheet) step13).f65471a));
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                aVar15.a(expiringCardsBottomSheetScreen, new a83.z(ref$BooleanRef, (int) (r216 == true ? 1 : 0), expiringCardsBottomSheetScreen, aVar15));
                expiringCardsBottomSheetScreen.k2(new a07.b(ref$BooleanRef, aVar15, i3));
                return expiringCardsBottomSheetScreen;
            case 24:
                return a(obj2, obj3);
            case 25:
                com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.a aVar16 = (com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.a) obj5;
                DocumentsRemediationFlowContract$Step step14 = (DocumentsRemediationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (Intrinsics.f(step14, DocumentsRemediationFlowContract$Step.Initial.f67570a)) {
                    return new LayoutViewerScreen(R$layout.screen_transparent);
                }
                if (!(step14 instanceof DocumentsRemediationFlowContract$Step.RemediationInProgress)) {
                    throw new NoWhenBranchMatchedException();
                }
                hs3.x xVar = ((DocumentsRemediationFlowContract$Step.RemediationInProgress) step14).f67571a;
                TextClause textClause3 = new TextClause(xVar.f154965a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str5 = xVar.f154966b;
                if (str5 == null) {
                    str5 = "";
                }
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(ug4.a.b(textClause3, new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), aVar16.f67574r.f67568a, false, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D007", null, null, null, 30), new TextClause(xVar.f154967c.f154927a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 16184));
                a7b.r block26 = new a7b.r(aVar16, 10);
                Intrinsics.checkNotNullParameter(block26, "block");
                fullScreenPromptScreen.H = block26;
                return fullScreenPromptScreen;
            case 26:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                MaskedTextInputEditText field2 = (MaskedTextInputEditText) obj3;
                TransferOutAssetSelectionScreen.Companion aVar17 = TransferOutAssetSelectionScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                return new zp0.y(field2, null, "[0…]", new abf.c(field2, (TransferOutAssetSelectionScreen) obj5, r217 == true ? 1 : 0), model2.f53228a, null, false, 98);
            case 27:
                com.revolut.feature_retail_user_declarations.email.verification_screen.a aVar18 = (com.revolut.feature_retail_user_declarations.email.verification_screen.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EmailVerificationPromptContract$ModalStep step15 = (EmailVerificationPromptContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!Intrinsics.f(step15, EmailVerificationPromptContract$ModalStep.VerificationCooldown.f97599a)) {
                    throw new NoWhenBranchMatchedException();
                }
                EmailVerificationCooldownBottomSheetController emailVerificationCooldownBottomSheetController = new EmailVerificationCooldownBottomSheetController(new EmailVerificationCooldownBottomSheetContract$InputData(new EmailVerificationCooldownBottomSheetContract$InvocationSource.EmailVerification(aVar18.o.f97596a, true)));
                a7b.r block27 = new a7b.r(aVar18, i3);
                Intrinsics.checkNotNullParameter(block27, "block");
                emailVerificationCooldownBottomSheetController.H = block27;
                return emailVerificationCooldownBottomSheetController;
            case 28:
                return b(obj2, obj3);
            default:
                acd.a aVar19 = (acd.a) obj5;
                mcd.c request = (mcd.c) obj2;
                List<InfoSheet> infoSheets = (List) obj3;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(infoSheets, "infoSheets");
                for (InfoSheet infoSheet : infoSheets) {
                    aVar19.f3127b.f(acd.a.a(request, infoSheet.f86470a), infoSheet);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f245a = i;
        this.f246b = obj3;
    }
}
