package av8;

import android.os.Parcelable;
import android.view.View;
import aw0.n6;
import b4b.z;
import b4g.a0;
import b4g.c0;
import b4g.h0;
import b4g.i0;
import b4g.x;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.custom_tab.AkahuCustomTabScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.LoanInterestRateBreakdownControllerContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.FreelancerNewSalePickerScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.sales.payment_options_picker.FreelancerPaymentOptionsPickerScreen;
import com.revolut.feature.freelancer.impl.ui.sales.payment_options_picker.FreelancerPaymentOptionsPickerScreenContract$InputData;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$ModalStep;
import com.revolut.feature.junior.isa.api.navigation.JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor;
import com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionControllerContract$ModalStep;
import com.revolut.feature.paynow.impl.screens.amount.PayNowAmountScreen;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeController;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsController;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListController;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelController;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsController;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$Step;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormControllerContract$ModalStep;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.travel.flights.models.domain.offer_details.TravelFlightsOfferDetails;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchResult;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$ModalStep;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$OrderContext;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$OutputData;
import com.revolut.feature_move_money.impl.amount.order_automations.OrderAutomationsScreen;
import com.revolut.feature_move_money.impl.amount.order_automations.OrderAutomationsScreenContract$InputData;
import com.revolut.feature_move_money.impl.amount.order_options.OrderOptionsScreen;
import com.revolut.feature_move_money.impl.amount.order_options.OrderOptionsScreenContract$InputData;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreen;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipControllerDescriptor;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowInputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.AirportLoungePassCheckoutEntriesScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.AirportLoungePassCheckoutEntriesScreenContract$InputData;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.disclaimer.SavingsDisclaimerScreen;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.disclaimer.SavingsDisclaimerScreenContract$InputData;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlowContract$ModalStep;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.selector.SavingsSelectorScreen;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.selector.SavingsSelectorScreenContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$ModalStep;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$RemoveTarget;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.date_picker.TravelItineraryDatePickerContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.date_picker.TravelItineraryDatePickerScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker.TravelItineraryTimePickerContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker.TravelItineraryTimePickerScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventScreen;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.RetailRevolutSsoAccessRecoveryWrapperFlowContract$Step;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$AccessRecovery;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.uicomponent.swipe_layout.SwipeToActionLayout;
import dw3.y3;
import efm.d0;
import ft3.h1;
import grl.k9;
import h6i.p0;
import ip0.s7;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import l1j.a;
import m1c.e0;
import nya.s;
import oki.h;
import s7g.f0;
import s7g.h2;
import uu.a;
import vkm.j2;
import wya.l;
import xya.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9957b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f9956a = i;
        this.f9957b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        b79.b bVar = (b79.b) this.f9957b;
        w4l.f DataObservableDelegate = (w4l.f) obj2;
        b79.a requestParams = (b79.a) obj3;
        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        d0<a79.b> article = bVar.f12938a.getArticle(requestParams.f12936a, requestParams.f12937b);
        b0a.h hVar = new b0a.h(27, new b73.h(5));
        article.getClass();
        ufm.i iVar = new ufm.i(article, hVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v195, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r21v7, types: [com.revolut.shared.feature.market_data.models.domain.models.Amount] */
    /* JADX WARN: Type inference failed for: r2v147, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        TravelItineraryRemoveEventContract$Target proposal;
        JuniorIsaAccountOwnership custodian;
        t6i.c cVar;
        Pair pair;
        u6i.b bVar;
        u6i.c cVar2;
        int i = this.f9956a;
        final int i2 = 1;
        ?? amount = 0;
        u6i.c cVar3 = null;
        aVar = null;
        t6i.a aVar = null;
        Object obj4 = this.f9957b;
        switch (i) {
            case 0:
                com.revolut.feature.kyc.impl.document_collection.document_selection.a aVar2 = (com.revolut.feature.kyc.impl.document_collection.document_selection.a) obj4;
                DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = aVar2.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DocumentSelectionControllerContract$ModalStep step = (DocumentSelectionControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, DocumentSelectionControllerContract$ModalStep.Citizenship.f77624a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = aVar2.e1(new SubmitCitizenshipControllerDescriptor(new SubmitCitizenshipFlowInputData(false, true, documentSelectionControllerContract$InputData.f77618a, documentSelectionControllerContract$InputData.f77619b, null, rbl.a.CLOSE, ((j) ((j2) aVar2.f77627r.f22677a).getValue()).f9948a.f297794a, new TextLocalisedClause(R$string.kyc_nationality_search_hint, null, null, 14), documentSelectionControllerContract$InputData.i, documentSelectionControllerContract$InputData.f77622h, 48)));
                auj.o block = new auj.o(aVar2, 2);
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            case 1:
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar2 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) obj4;
                TravelItineraryAddEventContract$InputData travelItineraryAddEventContract$InputData = bVar2.o;
                y yVar = bVar2.f101637s;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelItineraryAddEventContract$ModalStep step2 = (TravelItineraryAddEventContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof TravelItineraryAddEventContract$ModalStep.DatePicker) {
                    TravelItineraryDatePickerScreen travelItineraryDatePickerScreen = new TravelItineraryDatePickerScreen(new TravelItineraryDatePickerContract$InputData(travelItineraryAddEventContract$InputData.f101618b, travelItineraryAddEventContract$InputData.f101619c, ((avj.a) ((j2) yVar.f22677a).getValue()).f10047b));
                    avj.n block2 = new avj.n(bVar2, i2);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    travelItineraryDatePickerScreen.H = block2;
                    return travelItineraryDatePickerScreen;
                }
                if (step2 instanceof TravelItineraryAddEventContract$ModalStep.TimePicker) {
                    TravelItineraryTimePickerScreen travelItineraryTimePickerScreen = new TravelItineraryTimePickerScreen(new TravelItineraryTimePickerContract$InputData(((avj.a) ((j2) yVar.f22677a).getValue()).f10048c));
                    avj.n block3 = new avj.n(bVar2, 2);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    travelItineraryTimePickerScreen.H = block3;
                    return travelItineraryTimePickerScreen;
                }
                if (!(step2 instanceof TravelItineraryAddEventContract$ModalStep.RemoveItem)) {
                    if (!(step2 instanceof TravelItineraryAddEventContract$ModalStep.LocationPicker)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.api.travel_trips.R$string.travel_trip_itinerary_add_event_location_picker_title, null, null, 14);
                    Address address = ((avj.a) ((j2) yVar.f22677a).getValue()).d;
                    ViewController viewControllerE12 = bVar2.e1(new th1.a(new AddressFlowContract$InputData(address == null ? new Address(null, null, null, null, null, travelItineraryAddEventContract$InputData.d, null, null, null, null, null, null, null, null, null, 32735, null) : address, textLocalisedClause, null, true, null, FieldMode.NotEditable.f60955a, null, null, false, null, 2096988), null, null, 6));
                    avj.n block4 = new avj.n(bVar2, 3);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    viewControllerE12.H = block4;
                    return viewControllerE12;
                }
                TravelItineraryAddEventContract$RemoveTarget travelItineraryAddEventContract$RemoveTarget = ((TravelItineraryAddEventContract$ModalStep.RemoveItem) step2).f101622a;
                if (travelItineraryAddEventContract$RemoveTarget instanceof TravelItineraryAddEventContract$RemoveTarget.Event) {
                    proposal = new TravelItineraryRemoveEventContract$Target.Event(((TravelItineraryAddEventContract$RemoveTarget.Event) travelItineraryAddEventContract$RemoveTarget).f101631a);
                } else {
                    if (!(travelItineraryAddEventContract$RemoveTarget instanceof TravelItineraryAddEventContract$RemoveTarget.Proposal)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    proposal = new TravelItineraryRemoveEventContract$Target.Proposal(((TravelItineraryAddEventContract$RemoveTarget.Proposal) travelItineraryAddEventContract$RemoveTarget).f101632a);
                }
                TravelItineraryRemoveEventScreen travelItineraryRemoveEventScreen = new TravelItineraryRemoveEventScreen(new TravelItineraryRemoveEventContract$InputData(proposal));
                as9.a block5 = new as9.a(step2, bVar2, 12);
                Intrinsics.checkNotNullParameter(block5, "block");
                travelItineraryRemoveEventScreen.H = block5;
                return travelItineraryRemoveEventScreen;
            case 2:
                List stakingProducts = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(stakingProducts, "stakingProducts");
                ((awd.c) obj4).f10762c.f("CACHE_KEY_STAKING_PRODUCTS_V2", stakingProducts);
                return Unit.f186387a;
            case 3:
                yte.k domain = (yte.k) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((axe.b) obj4).f10931b.f("POST_ACTIVATION_CONFIG_KEY", domain);
                return Unit.f186387a;
            case 4:
                com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar4 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) obj4;
                gxi.c cVar5 = cVar4.f99059t;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AirportLoungePassCheckoutScreenContract$ModalStep step3 = (AirportLoungePassCheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (Intrinsics.f(step3, AirportLoungePassCheckoutScreenContract$ModalStep.RevPointsInfo.f99053a)) {
                    return cVar4.e1(new hub.c(e0.LOUNGES_CHECKOUT));
                }
                if (step3 instanceof AirportLoungePassCheckoutScreenContract$ModalStep.RevPayPocketSelection) {
                    return cVar5.b3(((AirportLoungePassCheckoutScreenContract$ModalStep.RevPayPocketSelection) step3).f99052a);
                }
                if (step3 instanceof AirportLoungePassCheckoutScreenContract$ModalStep.ExchangeBreakdown) {
                    return cVar5.Z2(((AirportLoungePassCheckoutScreenContract$ModalStep.ExchangeBreakdown) step3).f99051a);
                }
                if (!(step3 instanceof AirportLoungePassCheckoutScreenContract$ModalStep.Entries)) {
                    throw new NoWhenBranchMatchedException();
                }
                AirportLoungePassCheckoutScreenContract$ModalStep.Entries entries = (AirportLoungePassCheckoutScreenContract$ModalStep.Entries) step3;
                AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen = new AirportLoungePassCheckoutEntriesScreen(new AirportLoungePassCheckoutEntriesScreenContract$InputData(entries.f99049a, entries.f99050b));
                auj.o block6 = new auj.o(cVar4, 17);
                Intrinsics.checkNotNullParameter(block6, "block");
                airportLoungePassCheckoutEntriesScreen.H = block6;
                return airportLoungePassCheckoutEntriesScreen;
            case 5:
                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a aVar3 = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a) obj4;
                RetailRevolutSsoAccessRecoveryWrapperFlowContract$Step step4 = (RetailRevolutSsoAccessRecoveryWrapperFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof RetailRevolutSsoAccessRecoveryWrapperFlowContract$Step.UnlockAppWithBiometrics)) {
                    throw new NoWhenBranchMatchedException();
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AuthenticationFlow authenticationFlowA = djl.a.a(aVar3.o, new RevolutSsoApi$InputData$AccessRecovery(RevolutSsoApi$InputData$AccessRecovery.Origin.UnlockAppWithBiometrics.f105846a), new abf.c(ref$ObjectRef, aVar3, 3));
                as9.a block7 = new as9.a(aVar3, ref$ObjectRef, 13);
                Intrinsics.checkNotNullParameter(block7, "block");
                authenticationFlowA.H = block7;
                return authenticationFlowA;
            case 6:
                h1 h1Var = (h1) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                throw new IllegalStateException(("Failed to reload refinancing account details content for product: " + h1Var.f137836b.f137810a).toString());
            case 7:
                az7.g gVar = (az7.g) obj4;
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                gVar.o.getClass();
                s7 s7Var = new s7("ADDRESS_NOT_SUPPORTED_LOADING_ITEM", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return new Pair(null, u.c(s7Var));
            case 8:
                final com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar = (com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e) obj4;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                final ReferralsFlowContract$Step step5 = (ReferralsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof ReferralsFlowContract$Step.InviteCampaignHome) {
                    InviteCampaignHomeController inviteCampaignHomeController = new InviteCampaignHomeController(((ReferralsFlowContract$Step.InviteCampaignHome) step5).f81935a);
                    final int i3 = 0;
                    Function1 block8 = new Function1() { // from class: aza.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    s result = (s) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar2 = eVar;
                                    eVar2.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.a(result, eVar2, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                                case 1:
                                    l result2 = (l) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar3 = eVar;
                                    eVar3.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.b(result2, eVar3, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                                default:
                                    p result3 = (p) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar4 = eVar;
                                    eVar4.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.c(result3, eVar4, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    inviteCampaignHomeController.H = block8;
                    return inviteCampaignHomeController;
                }
                if (step5 instanceof ReferralsFlowContract$Step.ReferralsTroubleshooter) {
                    ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController = new ReferralsTroubleshooterTopLevelController(((ReferralsFlowContract$Step.ReferralsTroubleshooter) step5).f81938a);
                    Function1 block9 = new Function1() { // from class: aza.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i2) {
                                case 0:
                                    s result = (s) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar2 = eVar;
                                    eVar2.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.a(result, eVar2, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                                case 1:
                                    l result2 = (l) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar3 = eVar;
                                    eVar3.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.b(result2, eVar3, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                                default:
                                    p result3 = (p) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar4 = eVar;
                                    eVar4.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.c(result3, eVar4, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    referralsTroubleshooterTopLevelController.H = block9;
                    return referralsTroubleshooterTopLevelController;
                }
                if (step5 instanceof ReferralsFlowContract$Step.AllReferralsTroubleshooter) {
                    AllReferralsController allReferralsController = new AllReferralsController(((ReferralsFlowContract$Step.AllReferralsTroubleshooter) step5).f81932a);
                    final int i5 = 2;
                    Function1 block10 = new Function1() { // from class: aza.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    s result = (s) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar2 = eVar;
                                    eVar2.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.a(result, eVar2, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                                case 1:
                                    l result2 = (l) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar3 = eVar;
                                    eVar3.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.b(result2, eVar3, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                                default:
                                    p result3 = (p) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar4 = eVar;
                                    eVar4.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.c(result3, eVar4, LazyFlowCoordinator, step5, null), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    allReferralsController.H = block10;
                    return allReferralsController;
                }
                if (step5 instanceof ReferralsFlowContract$Step.InvitesList) {
                    InvitesListController invitesListController = new InvitesListController(((ReferralsFlowContract$Step.InvitesList) step5).f81937a);
                    final int i6 = 0;
                    Function1 block11 = new Function1() { // from class: aza.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    rya.g result = (rya.g) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar2 = eVar;
                                    eVar2.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.d(result, eVar2, LazyFlowCoordinator, null), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    a.AbstractC1562a outputData = (a.AbstractC1562a) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (!Intrinsics.f(outputData, a.AbstractC1562a.C1563a.f283124a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(eVar, LazyFlowCoordinator, new ReferralsFlowContract$Step.InviteCampaignHome(new InviteCampaignHomeControllerContract$InputData(0)), false, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    invitesListController.H = block11;
                    return invitesListController;
                }
                final int i21 = 0;
                if (step5 instanceof ReferralsFlowContract$Step.InviteDetails) {
                    InvitesDetailsController invitesDetailsController = new InvitesDetailsController(((ReferralsFlowContract$Step.InviteDetails) step5).f81936a);
                    Function1 block12 = new Function1() { // from class: aza.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    pya.g result = (pya.g) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pya.f fVar = result.f240714a;
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar2 = eVar;
                                    eVar2.C1(eVar2.f81950s.a(fVar.f240713a));
                                    break;
                                default:
                                    yja.b it8 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar3 = eVar;
                                    h.t2(eVar3, eVar3.u, ReferralsFlowContract$Step.C2BReferrals.f81933a, false, null, false, 12);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    invitesDetailsController.H = block12;
                    return invitesDetailsController;
                }
                if (step5 instanceof ReferralsFlowContract$Step.C2BReferrals) {
                    ViewController viewControllerE13 = eVar.e1(new uu.a());
                    Function1 block13 = new Function1() { // from class: aza.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i2) {
                                case 0:
                                    rya.g result = (rya.g) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar2 = eVar;
                                    eVar2.l2(new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.d(result, eVar2, LazyFlowCoordinator, null), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    a.AbstractC1562a outputData = (a.AbstractC1562a) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (!Intrinsics.f(outputData, a.AbstractC1562a.C1563a.f283124a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(eVar, LazyFlowCoordinator, new ReferralsFlowContract$Step.InviteCampaignHome(new InviteCampaignHomeControllerContract$InputData(0)), false, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    viewControllerE13.H = block13;
                    return viewControllerE13;
                }
                if (!(step5 instanceof ReferralsFlowContract$Step.C2BReferralsArticle)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE14 = eVar.e1(new ProductArticleDescriptor(((ReferralsFlowContract$Step.C2BReferralsArticle) step5).f81934a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                Function1 block14 = new Function1() { // from class: aza.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i2) {
                            case 0:
                                pya.g result = (pya.g) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                pya.f fVar = result.f240714a;
                                com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar2 = eVar;
                                eVar2.C1(eVar2.f81950s.a(fVar.f240713a));
                                break;
                            default:
                                yja.b it8 = (yja.b) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar3 = eVar;
                                h.t2(eVar3, eVar3.u, ReferralsFlowContract$Step.C2BReferrals.f81933a, false, null, false, 12);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block14, "block");
                viewControllerE14.H = block14;
                return viewControllerE14;
            case 9:
                SwipeToActionLayout swipeToActionLayout = (SwipeToActionLayout) obj4;
                View v = (View) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                int i22 = SwipeToActionLayout.z;
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(null, "a");
                Function2 function2 = swipeToActionLayout.onActionClickListener;
                if (function2 != null) {
                    function2.invoke(v, null);
                }
                swipeToActionLayout.d();
                return Unit.f186387a;
            case 10:
                com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a aVar4 = (com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FreelancerNewSalePickerScreenContract$ModalStep step6 = (FreelancerNewSalePickerScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof FreelancerNewSalePickerScreenContract$ModalStep.MorePaymentOptions)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerPaymentOptionsPickerScreen freelancerPaymentOptionsPickerScreen = new FreelancerPaymentOptionsPickerScreen(new FreelancerPaymentOptionsPickerScreenContract$InputData(((FreelancerNewSalePickerScreenContract$ModalStep.MorePaymentOptions) step6).f74163a));
                auj.o block15 = new auj.o(aVar4, 26);
                Intrinsics.checkNotNullParameter(block15, "block");
                freelancerPaymentOptionsPickerScreen.H = block15;
                return freelancerPaymentOptionsPickerScreen;
            case 11:
                com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.a aVar5 = (com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.a) obj4;
                SavingsDisclaimersFlowContract$ModalStep step7 = (SavingsDisclaimersFlowContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                aVar5.f99523p = step7.getClass().getName();
                if (step7 instanceof SavingsDisclaimersFlowContract$ModalStep.Disclaimer) {
                    SavingsDisclaimersFlowContract$ModalStep.Disclaimer disclaimer = (SavingsDisclaimersFlowContract$ModalStep.Disclaimer) step7;
                    SavingsDisclaimerScreen savingsDisclaimerScreen = new SavingsDisclaimerScreen(new SavingsDisclaimerScreenContract$InputData(disclaimer.f99520a, disclaimer.f99521b));
                    savingsDisclaimerScreen.l2(new at4.b(aVar5, step7, 17));
                    return savingsDisclaimerScreen;
                }
                if (!(step7 instanceof SavingsDisclaimersFlowContract$ModalStep.Selector)) {
                    throw new NoWhenBranchMatchedException();
                }
                SavingsSelectorScreen savingsSelectorScreen = new SavingsSelectorScreen(new SavingsSelectorScreenContract$InputData(((SavingsDisclaimersFlowContract$ModalStep.Selector) step7).f99522a));
                auj.o block16 = new auj.o(aVar5, 28);
                Intrinsics.checkNotNullParameter(block16, "block");
                savingsSelectorScreen.H = block16;
                savingsSelectorScreen.l2(new at4.b(aVar5, step7, 17));
                return savingsSelectorScreen;
            case 12:
                String applicationId = (String) obj2;
                mu3.b content = (mu3.b) obj3;
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(content, "content");
                ((b34.b) obj4).f12000c.f("CreditInsuranceOfferRepositoryImpl:InsuranceOptions:" + applicationId, content);
                return Unit.f186387a;
            case 13:
                CfdOrderFormController cfdOrderFormController = (CfdOrderFormController) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = CfdOrderFormController.X;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.f51981p;
                b4b.m mVar = obj5 instanceof b4b.m ? (b4b.m) obj5 : null;
                if (mVar == null) {
                    return null;
                }
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar6 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) cfdOrderFormController.k3();
                aVar6.getClass();
                aVar6.l2(new aza.g(aVar6, amount, 2), new yi5.b(26));
                MaskedTextInputEditText editText = field.getEditText();
                xi0.b bVar3 = new xi0.b(4, mVar.f12225a.f104720b, Integer.valueOf(mVar.f12226b));
                qd0.b bVarN = ((m2b.n) cfdOrderFormController.V.getValue()).f201860c.f201932r.n();
                vc.s.j(bVarN);
                return new zp0.d(editText, bVar3, new u80.d(((s80.b) bVarN).b()), null, new r10.f(cfdOrderFormController, mVar, 3), false, false, 0, false, null, 1928);
            case 14:
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar7 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) obj4;
                y yVar2 = aVar7.J;
                b4b.p pVar = aVar7.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CfdOrderFormControllerContract$ModalStep modalStep = (CfdOrderFormControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                if (modalStep instanceof CfdOrderFormControllerContract$ModalStep.TargetPrice) {
                    CfdOrderFormControllerContract$ModalStep.TargetPrice targetPrice = (CfdOrderFormControllerContract$ModalStep.TargetPrice) modalStep;
                    if (targetPrice.f82244b) {
                        BigDecimal bigDecimal = ((b4b.n) ((j2) yVar2.f22677a).getValue()).f12227a.e;
                        f8l.c cVar6 = f8l.c.FIAT;
                        xi0.b bVar4 = pVar.f12237b.i;
                        amount = new Amount(bigDecimal, new Asset(cVar6, bVar4.f306286a, bVar4));
                    }
                    ViewController viewControllerE15 = aVar7.e1(new hdf.a(pVar.f12237b.f214596b, pVar.f12236a, u2b.c.d(targetPrice.f82243a), targetPrice.f82245c, amount));
                    as9.a block17 = new as9.a(aVar7, targetPrice, 20);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    viewControllerE15.H = block17;
                    return viewControllerE15;
                }
                if (modalStep instanceof CfdOrderFormControllerContract$ModalStep.Tutorial) {
                    e2b.a aVar8 = ((CfdOrderFormControllerContract$ModalStep.Tutorial) modalStep).f82246a;
                    ViewController viewControllerE16 = aVar7.e1(new idf.a(((b4b.n) ((j2) yVar2.f22677a).getValue()).f12227a.f82169a, u2b.c.d(aVar8), pVar.f12237b));
                    as9.a block18 = new as9.a(aVar7, aVar8, 23);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    viewControllerE16.H = block18;
                    return viewControllerE16;
                }
                if (modalStep instanceof CfdOrderFormControllerContract$ModalStep.ExposureBreakdown) {
                    CfdOrderFormControllerContract$ModalStep.ExposureBreakdown exposureBreakdown = (CfdOrderFormControllerContract$ModalStep.ExposureBreakdown) modalStep;
                    return aVar7.e1(new a2b.a(exposureBreakdown.f82239a, exposureBreakdown.f82240b, exposureBreakdown.f82241c, pVar.f12238c, exposureBreakdown.d));
                }
                if (!(modalStep instanceof CfdOrderFormControllerContract$ModalStep.ReduceOnlyInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.cfd.impl.R$string.wealth_cfd_order_form_reduce_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.cfd.impl.R$string.wealth_cfd_order_form_reduce_dialog_description, null, null, 14), null, null, false, 28);
                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.MarginTrading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar9, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 15:
                String bookingId = (String) obj2;
                f0 bookingDetails = (f0) obj3;
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
                ((b4g.f) obj4).f12330b.f("KEY_BOOKING_DETAILS_" + bookingId, bookingDetails);
                return Unit.f186387a;
            case 16:
                h2 bookings = (h2) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                ((b4g.j) obj4).f12339b.f("TRAVEL_FLIGHTS_BOOKINGS", bookings);
                return Unit.f186387a;
            case 17:
                b4g.s params = (b4g.s) obj2;
                u7g.f receipts = (u7g.f) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(receipts, "receipts");
                ((b4g.u) obj4).f12365c.f(b4g.u.a(params), receipts);
                return Unit.f186387a;
            case 18:
                x params2 = (x) obj2;
                List fares = (List) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(fares, "fares");
                ((b4g.y) obj4).f12370b.f(a0.d.s("FLIGHTS_FARES_", params2.f12367a, "_", params2.f12368b), fares);
                return Unit.f186387a;
            case 19:
                String query = (String) obj2;
                List results = (List) obj3;
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(results, "results");
                ehe.n.z("FLIGHTS_LOCATIONS_", query, ((a0) obj4).f12315b, results);
                return Unit.f186387a;
            case 20:
                c0 params3 = (c0) obj2;
                TravelFlightsOfferDetails offerDetails = (TravelFlightsOfferDetails) obj3;
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullParameter(offerDetails, "offerDetails");
                ne0.j jVar = ((b4g.d0) obj4).f12323b;
                String strS = a0.d.s("FLIGHTS_OFFER_DETAILS_", params3.f12320a, "_", params3.f12321b);
                zhm.f0 notifications = zhm.f0.f322471a;
                String id10 = offerDetails.f93531a;
                List includedBaggage = offerDetails.f93532b;
                List extraProducts = offerDetails.f93533c;
                List passengerRequirements = offerDetails.d;
                Payment payment = offerDetails.e;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(includedBaggage, "includedBaggage");
                Intrinsics.checkNotNullParameter(extraProducts, "extraProducts");
                Intrinsics.checkNotNullParameter(passengerRequirements, "passengerRequirements");
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(notifications, "notifications");
                jVar.f(strS, new TravelFlightsOfferDetails(id10, includedBaggage, extraProducts, passengerRequirements, payment, notifications));
                return Unit.f186387a;
            case 21:
                h0 request = (h0) obj2;
                FlightSearchResult page = (FlightSearchResult) obj3;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(page, "page");
                ((i0) obj4).f12336b.f(i0.a(request), page);
                return Unit.f186387a;
            case 22:
                com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.akahu.b) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                AkahuFlowContract$Step step8 = (AkahuFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof AkahuFlowContract$Step.Intro) {
                    zv3.a aVar10 = zv3.a.BACK;
                    AkahuFlowContract$InputData akahuFlowContract$InputData = bVar5.f67026p;
                    CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(aVar10, akahuFlowContract$InputData.f67022b, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_akahu_intro_title, com.revolut.feature.credit.core.R$string.credit_akahu_intro_description, com.revolut.feature.credit.core.R$string.credit_akahu_intro_primaryButton, com.revolut.feature.credit.core.R$string.credit_akahu_intro_secondaryButton), akahuFlowContract$InputData.d));
                    cma.b block19 = new cma.b(bVar5, FlowCoordinator, 12);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    creditPromptFlow.H = block19;
                    return creditPromptFlow;
                }
                if (!(step8 instanceof AkahuFlowContract$Step.CustomTab)) {
                    throw new NoWhenBranchMatchedException();
                }
                AkahuCustomTabScreen akahuCustomTabScreen = new AkahuCustomTabScreen(new c54.f(((AkahuFlowContract$Step.CustomTab) step8).f67024a));
                b54.b block20 = new b54.b(bVar5, 0);
                Intrinsics.checkNotNullParameter(block20, "block");
                akahuCustomTabScreen.H = block20;
                return akahuCustomTabScreen;
            case 23:
                final com.revolut.feature_move_money.impl.amount.c cVar7 = (com.revolut.feature_move_money.impl.amount.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final MoveAmountScreenContract$ModalStep step9 = (MoveAmountScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof MoveAmountScreenContract$ModalStep.LimitOrderSettings) {
                    MoveAmountScreenContract$ModalStep.LimitOrderSettings limitOrderSettings = (MoveAmountScreenContract$ModalStep.LimitOrderSettings) step9;
                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext = limitOrderSettings.f97260a;
                    OrderSettingsScreen orderSettingsScreen = new OrderSettingsScreen(new OrderSettingsScreenContract$InputData(oi0.d.b0(moveAmountScreenContract$OrderContext.f97275a), v6i.k.LIMIT, moveAmountScreenContract$OrderContext.f97276b, moveAmountScreenContract$OrderContext.f97277c, limitOrderSettings.f97261b));
                    final int i32 = 0;
                    Function1 block21 = new Function1() { // from class: b6i.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Pair pair2;
                            switch (i32) {
                                case 0:
                                    v6i.j output = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    x5i.l lVar = x5i.l.LIMIT;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext2 = ((MoveAmountScreenContract$ModalStep.LimitOrderSettings) step9).f97260a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext2.f97275a, output.f286399a, lVar, moveAmountScreenContract$OrderContext2.f97276b, moveAmountScreenContract$OrderContext2.f97277c);
                                    return Unit.f186387a;
                                case 1:
                                    v6i.j output2 = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    x5i.l lVar2 = x5i.l.STOP;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext3 = ((MoveAmountScreenContract$ModalStep.StopOrderSettings) step9).f97271a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext3.f97275a, output2.f286399a, lVar2, moveAmountScreenContract$OrderContext3.f97276b, moveAmountScreenContract$OrderContext3.f97277c);
                                    return Unit.f186387a;
                                case 2:
                                    u6i.d output3 = (u6i.d) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext4 = ((MoveAmountScreenContract$ModalStep.OptionsSelector) step9).f97262a;
                                    com.revolut.feature_move_money.impl.amount.c cVar8 = cVar7;
                                    com.revolut.kompot.navigable.vc.modal.a aVar11 = cVar8.X;
                                    if (output3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i33 = a0.f12758g[output3.f277604a.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i33 == 1) {
                                        TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(cVar8.Q2().f12787h);
                                        if (transferScheduleDataB == null) {
                                            transferScheduleDataB = new TransferScheduleData(0L, (jli.c) null, 7);
                                        }
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB, cVar8.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), fullscreen_fade);
                                    } else if (i33 == 2) {
                                        cVar8.H2(cVar8.Y, new b4g.f0(16));
                                    } else if (i33 == 3) {
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    } else {
                                        if (i33 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.StopOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g1j.b output4 = (g1j.b) obj6;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j1j.d dVar = output4.f139686a;
                                    String str = dVar.f170617a;
                                    k1j.a aVar12 = dVar.d;
                                    j jVar2 = ((MoveAmountScreenContract$ModalStep.BalancePicker) step9).d;
                                    com.revolut.feature_move_money.impl.amount.c cVar9 = cVar7;
                                    cVar9.l2(new a1a.c(cVar9, aVar12, jVar2, str, (Continuation) null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    l1j.a output5 = (l1j.a) obj6;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (!Intrinsics.f(output5, a.C1086a.f191546a)) {
                                        if (!(output5 instanceof l1j.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str2 = ((l1j.b) output5).f191547a;
                                        k1j.a aVar13 = k1j.a.NON_EXISTING_CURRENCY;
                                        j jVar3 = ((MoveAmountScreenContract$ModalStep.CurrencyPicker) step9).f97257b;
                                        com.revolut.feature_move_money.impl.amount.c cVar10 = cVar7;
                                        cVar10.l2(new a1a.c(cVar10, aVar13, jVar3, str2, (Continuation) null, 20), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    t6i.j output6 = (t6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z = output6 instanceof t6i.i;
                                    com.revolut.feature_move_money.impl.amount.c cVar11 = cVar7;
                                    if (z) {
                                        t6i.a aVar14 = ((t6i.i) output6).f268356a;
                                        MoveAmountScreenContract$ModalStep.OrderAutomations orderAutomations = (MoveAmountScreenContract$ModalStep.OrderAutomations) step9;
                                        com.revolut.kompot.navigable.vc.modal.a aVar15 = cVar11.X;
                                        int i43 = a0.f12756b[aVar14.ordinal()];
                                        if (i43 == 1) {
                                            TransferScheduleData transferScheduleDataB2 = com.revolut.feature_move_money.api.model.c.b(cVar11.Q2().f12787h);
                                            if (transferScheduleDataB2 == null) {
                                                transferScheduleDataB2 = new TransferScheduleData(0L, (jli.c) null, 7);
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB2, cVar11.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                        } else if (i43 == 2) {
                                            cli.y yVar3 = cVar11.Y;
                                            s6i.e eVar3 = ((h) ((j2) yVar3.f22677a).getValue()).f12783a;
                                            if (eVar3 == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            x5i.a aVar16 = eVar3.f260362a;
                                            x5i.a aVar17 = eVar3.f260363b;
                                            int i59 = a0.f12757c[((h) ((j2) yVar3.f22677a).getValue()).f12785c.ordinal()];
                                            if (i59 == 1) {
                                                pair2 = new Pair(aVar16, aVar17.f302980b);
                                            } else {
                                                if (i59 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                pair2 = new Pair(aVar17, aVar16.f302980b);
                                            }
                                            x5i.a aVar18 = (x5i.a) pair2.f186385a;
                                            AccountWrapper accountWrapper = (AccountWrapper) pair2.f186386b;
                                            long j2 = aVar18.f302979a.f115082a;
                                            cVar11.C2(new MoveAmountScreenContract$OutputData.OpenAutomationScreen(aVar18.f302980b, accountWrapper, j2 > 0 ? Long.valueOf(j2) : null));
                                        } else {
                                            if (i43 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.OrderBasedOnExchange(orderAutomations.f97264a, orderAutomations.f97265b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        }
                                    } else {
                                        if (!(output6 instanceof t6i.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar11.C1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k output7 = (eii.k) obj6;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    eii.i iVar = output7 instanceof eii.i ? (eii.i) output7 : null;
                                    Object obj7 = iVar != null ? iVar.f126655a : null;
                                    t6i.c cVar12 = obj7 instanceof t6i.c ? (t6i.c) obj7 : null;
                                    if (cVar12 == null) {
                                        return Unit.f186387a;
                                    }
                                    MoveAmountScreenContract$ModalStep.OrderBasedOnExchange orderBasedOnExchange = (MoveAmountScreenContract$ModalStep.OrderBasedOnExchange) step9;
                                    com.revolut.kompot.navigable.vc.modal.a aVar19 = cVar7.X;
                                    int i66 = a0.d[cVar12.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade2 = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i66 == 1) {
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    } else {
                                        if (i66 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.StopOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    orderSettingsScreen.H = block21;
                    return orderSettingsScreen;
                }
                if (step9 instanceof MoveAmountScreenContract$ModalStep.StopOrderSettings) {
                    MoveAmountScreenContract$ModalStep.StopOrderSettings stopOrderSettings = (MoveAmountScreenContract$ModalStep.StopOrderSettings) step9;
                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext2 = stopOrderSettings.f97271a;
                    OrderSettingsScreen orderSettingsScreen2 = new OrderSettingsScreen(new OrderSettingsScreenContract$InputData(oi0.d.b0(moveAmountScreenContract$OrderContext2.f97275a), v6i.k.STOP, moveAmountScreenContract$OrderContext2.f97276b, moveAmountScreenContract$OrderContext2.f97277c, stopOrderSettings.f97272b));
                    Function1 block22 = new Function1() { // from class: b6i.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Pair pair2;
                            switch (i2) {
                                case 0:
                                    v6i.j output = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    x5i.l lVar = x5i.l.LIMIT;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext22 = ((MoveAmountScreenContract$ModalStep.LimitOrderSettings) step9).f97260a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext22.f97275a, output.f286399a, lVar, moveAmountScreenContract$OrderContext22.f97276b, moveAmountScreenContract$OrderContext22.f97277c);
                                    return Unit.f186387a;
                                case 1:
                                    v6i.j output2 = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    x5i.l lVar2 = x5i.l.STOP;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext3 = ((MoveAmountScreenContract$ModalStep.StopOrderSettings) step9).f97271a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext3.f97275a, output2.f286399a, lVar2, moveAmountScreenContract$OrderContext3.f97276b, moveAmountScreenContract$OrderContext3.f97277c);
                                    return Unit.f186387a;
                                case 2:
                                    u6i.d output3 = (u6i.d) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext4 = ((MoveAmountScreenContract$ModalStep.OptionsSelector) step9).f97262a;
                                    com.revolut.feature_move_money.impl.amount.c cVar8 = cVar7;
                                    com.revolut.kompot.navigable.vc.modal.a aVar11 = cVar8.X;
                                    if (output3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i33 = a0.f12758g[output3.f277604a.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i33 == 1) {
                                        TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(cVar8.Q2().f12787h);
                                        if (transferScheduleDataB == null) {
                                            transferScheduleDataB = new TransferScheduleData(0L, (jli.c) null, 7);
                                        }
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB, cVar8.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), fullscreen_fade);
                                    } else if (i33 == 2) {
                                        cVar8.H2(cVar8.Y, new b4g.f0(16));
                                    } else if (i33 == 3) {
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    } else {
                                        if (i33 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.StopOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g1j.b output4 = (g1j.b) obj6;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j1j.d dVar = output4.f139686a;
                                    String str = dVar.f170617a;
                                    k1j.a aVar12 = dVar.d;
                                    j jVar2 = ((MoveAmountScreenContract$ModalStep.BalancePicker) step9).d;
                                    com.revolut.feature_move_money.impl.amount.c cVar9 = cVar7;
                                    cVar9.l2(new a1a.c(cVar9, aVar12, jVar2, str, (Continuation) null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    l1j.a output5 = (l1j.a) obj6;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (!Intrinsics.f(output5, a.C1086a.f191546a)) {
                                        if (!(output5 instanceof l1j.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str2 = ((l1j.b) output5).f191547a;
                                        k1j.a aVar13 = k1j.a.NON_EXISTING_CURRENCY;
                                        j jVar3 = ((MoveAmountScreenContract$ModalStep.CurrencyPicker) step9).f97257b;
                                        com.revolut.feature_move_money.impl.amount.c cVar10 = cVar7;
                                        cVar10.l2(new a1a.c(cVar10, aVar13, jVar3, str2, (Continuation) null, 20), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    t6i.j output6 = (t6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z = output6 instanceof t6i.i;
                                    com.revolut.feature_move_money.impl.amount.c cVar11 = cVar7;
                                    if (z) {
                                        t6i.a aVar14 = ((t6i.i) output6).f268356a;
                                        MoveAmountScreenContract$ModalStep.OrderAutomations orderAutomations = (MoveAmountScreenContract$ModalStep.OrderAutomations) step9;
                                        com.revolut.kompot.navigable.vc.modal.a aVar15 = cVar11.X;
                                        int i43 = a0.f12756b[aVar14.ordinal()];
                                        if (i43 == 1) {
                                            TransferScheduleData transferScheduleDataB2 = com.revolut.feature_move_money.api.model.c.b(cVar11.Q2().f12787h);
                                            if (transferScheduleDataB2 == null) {
                                                transferScheduleDataB2 = new TransferScheduleData(0L, (jli.c) null, 7);
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB2, cVar11.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                        } else if (i43 == 2) {
                                            cli.y yVar3 = cVar11.Y;
                                            s6i.e eVar3 = ((h) ((j2) yVar3.f22677a).getValue()).f12783a;
                                            if (eVar3 == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            x5i.a aVar16 = eVar3.f260362a;
                                            x5i.a aVar17 = eVar3.f260363b;
                                            int i59 = a0.f12757c[((h) ((j2) yVar3.f22677a).getValue()).f12785c.ordinal()];
                                            if (i59 == 1) {
                                                pair2 = new Pair(aVar16, aVar17.f302980b);
                                            } else {
                                                if (i59 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                pair2 = new Pair(aVar17, aVar16.f302980b);
                                            }
                                            x5i.a aVar18 = (x5i.a) pair2.f186385a;
                                            AccountWrapper accountWrapper = (AccountWrapper) pair2.f186386b;
                                            long j2 = aVar18.f302979a.f115082a;
                                            cVar11.C2(new MoveAmountScreenContract$OutputData.OpenAutomationScreen(aVar18.f302980b, accountWrapper, j2 > 0 ? Long.valueOf(j2) : null));
                                        } else {
                                            if (i43 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.OrderBasedOnExchange(orderAutomations.f97264a, orderAutomations.f97265b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        }
                                    } else {
                                        if (!(output6 instanceof t6i.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar11.C1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k output7 = (eii.k) obj6;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    eii.i iVar = output7 instanceof eii.i ? (eii.i) output7 : null;
                                    Object obj7 = iVar != null ? iVar.f126655a : null;
                                    t6i.c cVar12 = obj7 instanceof t6i.c ? (t6i.c) obj7 : null;
                                    if (cVar12 == null) {
                                        return Unit.f186387a;
                                    }
                                    MoveAmountScreenContract$ModalStep.OrderBasedOnExchange orderBasedOnExchange = (MoveAmountScreenContract$ModalStep.OrderBasedOnExchange) step9;
                                    com.revolut.kompot.navigable.vc.modal.a aVar19 = cVar7.X;
                                    int i66 = a0.d[cVar12.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade2 = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i66 == 1) {
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    } else {
                                        if (i66 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.StopOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    orderSettingsScreen2.H = block22;
                    return orderSettingsScreen2;
                }
                if (step9 instanceof MoveAmountScreenContract$ModalStep.SchedulingSettings) {
                    MoveAmountScreenContract$ModalStep.SchedulingSettings schedulingSettings = (MoveAmountScreenContract$ModalStep.SchedulingSettings) step9;
                    ScheduleTransferScreen scheduleTransferScreenD = ((qpf.h) cVar7.A).d(new ScheduleTransferInputData((TextLocalisedClause) null, schedulingSettings.f97269a, schedulingSettings.f97270b, (TextLocalisedClause) null, (List) null, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 8185));
                    b6i.s sVar = new b6i.s(cVar7, 0);
                    Intrinsics.checkNotNullParameter(sVar, "<set-?>");
                    scheduleTransferScreenD.H = sVar;
                    return scheduleTransferScreenD;
                }
                if (step9 instanceof MoveAmountScreenContract$ModalStep.OptionsSelector) {
                    MoveAmountScreenContract$ModalStep.OptionsSelector optionsSelector = (MoveAmountScreenContract$ModalStep.OptionsSelector) step9;
                    OrderMode orderMode = optionsSelector.f97263b;
                    if (orderMode != null) {
                        Intrinsics.checkNotNullParameter(orderMode, "<this>");
                        if (orderMode instanceof OrderMode.Threshold) {
                            int i33 = y6i.b.f311314a[((OrderMode.Threshold) orderMode).f97231a.ordinal()];
                            if (i33 == 1) {
                                cVar2 = u6i.c.LIMIT_ORDER;
                            } else {
                                if (i33 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar2 = u6i.c.STOP_ORDER;
                            }
                        } else if (orderMode instanceof OrderMode.Market) {
                            cVar2 = u6i.c.MARKET_ORDER;
                        } else {
                            if (!(orderMode instanceof OrderMode.Scheduling)) {
                                if (orderMode instanceof OrderMode.Automation) {
                                    throw new IllegalStateException();
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar2 = u6i.c.SCHEDULING;
                        }
                        cVar3 = cVar2;
                    }
                    int i43 = b6i.a0.f12755a[optionsSelector.f97262a.f97275a.ordinal()];
                    if (i43 == 1) {
                        bVar = u6i.b.BUY;
                    } else {
                        if (i43 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = u6i.b.SELL;
                    }
                    OrderOptionsScreen orderOptionsScreen = new OrderOptionsScreen(new OrderOptionsScreenContract$InputData(cVar3, bVar));
                    orderOptionsScreen.l2(new aqe.a(cVar7, 26));
                    final int i59 = 2;
                    Function1 block23 = new Function1() { // from class: b6i.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Pair pair2;
                            switch (i59) {
                                case 0:
                                    v6i.j output = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    x5i.l lVar = x5i.l.LIMIT;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext22 = ((MoveAmountScreenContract$ModalStep.LimitOrderSettings) step9).f97260a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext22.f97275a, output.f286399a, lVar, moveAmountScreenContract$OrderContext22.f97276b, moveAmountScreenContract$OrderContext22.f97277c);
                                    return Unit.f186387a;
                                case 1:
                                    v6i.j output2 = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    x5i.l lVar2 = x5i.l.STOP;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext3 = ((MoveAmountScreenContract$ModalStep.StopOrderSettings) step9).f97271a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext3.f97275a, output2.f286399a, lVar2, moveAmountScreenContract$OrderContext3.f97276b, moveAmountScreenContract$OrderContext3.f97277c);
                                    return Unit.f186387a;
                                case 2:
                                    u6i.d output3 = (u6i.d) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext4 = ((MoveAmountScreenContract$ModalStep.OptionsSelector) step9).f97262a;
                                    com.revolut.feature_move_money.impl.amount.c cVar8 = cVar7;
                                    com.revolut.kompot.navigable.vc.modal.a aVar11 = cVar8.X;
                                    if (output3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i332 = a0.f12758g[output3.f277604a.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i332 == 1) {
                                        TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(cVar8.Q2().f12787h);
                                        if (transferScheduleDataB == null) {
                                            transferScheduleDataB = new TransferScheduleData(0L, (jli.c) null, 7);
                                        }
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB, cVar8.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), fullscreen_fade);
                                    } else if (i332 == 2) {
                                        cVar8.H2(cVar8.Y, new b4g.f0(16));
                                    } else if (i332 == 3) {
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    } else {
                                        if (i332 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.StopOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g1j.b output4 = (g1j.b) obj6;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j1j.d dVar = output4.f139686a;
                                    String str = dVar.f170617a;
                                    k1j.a aVar12 = dVar.d;
                                    j jVar2 = ((MoveAmountScreenContract$ModalStep.BalancePicker) step9).d;
                                    com.revolut.feature_move_money.impl.amount.c cVar9 = cVar7;
                                    cVar9.l2(new a1a.c(cVar9, aVar12, jVar2, str, (Continuation) null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    l1j.a output5 = (l1j.a) obj6;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (!Intrinsics.f(output5, a.C1086a.f191546a)) {
                                        if (!(output5 instanceof l1j.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str2 = ((l1j.b) output5).f191547a;
                                        k1j.a aVar13 = k1j.a.NON_EXISTING_CURRENCY;
                                        j jVar3 = ((MoveAmountScreenContract$ModalStep.CurrencyPicker) step9).f97257b;
                                        com.revolut.feature_move_money.impl.amount.c cVar10 = cVar7;
                                        cVar10.l2(new a1a.c(cVar10, aVar13, jVar3, str2, (Continuation) null, 20), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    t6i.j output6 = (t6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z = output6 instanceof t6i.i;
                                    com.revolut.feature_move_money.impl.amount.c cVar11 = cVar7;
                                    if (z) {
                                        t6i.a aVar14 = ((t6i.i) output6).f268356a;
                                        MoveAmountScreenContract$ModalStep.OrderAutomations orderAutomations = (MoveAmountScreenContract$ModalStep.OrderAutomations) step9;
                                        com.revolut.kompot.navigable.vc.modal.a aVar15 = cVar11.X;
                                        int i432 = a0.f12756b[aVar14.ordinal()];
                                        if (i432 == 1) {
                                            TransferScheduleData transferScheduleDataB2 = com.revolut.feature_move_money.api.model.c.b(cVar11.Q2().f12787h);
                                            if (transferScheduleDataB2 == null) {
                                                transferScheduleDataB2 = new TransferScheduleData(0L, (jli.c) null, 7);
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB2, cVar11.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                        } else if (i432 == 2) {
                                            cli.y yVar3 = cVar11.Y;
                                            s6i.e eVar3 = ((h) ((j2) yVar3.f22677a).getValue()).f12783a;
                                            if (eVar3 == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            x5i.a aVar16 = eVar3.f260362a;
                                            x5i.a aVar17 = eVar3.f260363b;
                                            int i592 = a0.f12757c[((h) ((j2) yVar3.f22677a).getValue()).f12785c.ordinal()];
                                            if (i592 == 1) {
                                                pair2 = new Pair(aVar16, aVar17.f302980b);
                                            } else {
                                                if (i592 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                pair2 = new Pair(aVar17, aVar16.f302980b);
                                            }
                                            x5i.a aVar18 = (x5i.a) pair2.f186385a;
                                            AccountWrapper accountWrapper = (AccountWrapper) pair2.f186386b;
                                            long j2 = aVar18.f302979a.f115082a;
                                            cVar11.C2(new MoveAmountScreenContract$OutputData.OpenAutomationScreen(aVar18.f302980b, accountWrapper, j2 > 0 ? Long.valueOf(j2) : null));
                                        } else {
                                            if (i432 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.OrderBasedOnExchange(orderAutomations.f97264a, orderAutomations.f97265b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        }
                                    } else {
                                        if (!(output6 instanceof t6i.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar11.C1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k output7 = (eii.k) obj6;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    eii.i iVar = output7 instanceof eii.i ? (eii.i) output7 : null;
                                    Object obj7 = iVar != null ? iVar.f126655a : null;
                                    t6i.c cVar12 = obj7 instanceof t6i.c ? (t6i.c) obj7 : null;
                                    if (cVar12 == null) {
                                        return Unit.f186387a;
                                    }
                                    MoveAmountScreenContract$ModalStep.OrderBasedOnExchange orderBasedOnExchange = (MoveAmountScreenContract$ModalStep.OrderBasedOnExchange) step9;
                                    com.revolut.kompot.navigable.vc.modal.a aVar19 = cVar7.X;
                                    int i66 = a0.d[cVar12.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade2 = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i66 == 1) {
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    } else {
                                        if (i66 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.StopOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    orderOptionsScreen.H = block23;
                    return orderOptionsScreen;
                }
                if (step9 instanceof MoveAmountScreenContract$ModalStep.BalancePicker) {
                    MoveAmountScreenContract$ModalStep.BalancePicker balancePicker = (MoveAmountScreenContract$ModalStep.BalancePicker) step9;
                    BalanceSelector$InputData balanceSelector$InputData = balancePicker.f97253a;
                    r10.r rVar = cVar7.K;
                    AccountWrapper accountWrapper = balancePicker.f97255c;
                    x5i.d dVar = balancePicker.f97254b;
                    if (cVar7.f97287q.g() != null) {
                        throw new ClassCastException();
                    }
                    h6i.d filteringStrategy = new h6i.d(accountWrapper, dVar);
                    MoveAmountScreenContract$InputData moveAmountScreenContract$InputData = cVar7.o;
                    Intrinsics.checkNotNullParameter(moveAmountScreenContract$InputData, "<this>");
                    MoveAmountScreenContract$InputData.MoveWithFixedAccount moveWithFixedAccount = moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.MoveWithFixedAccount ? (MoveAmountScreenContract$InputData.MoveWithFixedAccount) moveAmountScreenContract$InputData : null;
                    Long lValueOf = moveWithFixedAccount != null ? Long.valueOf(moveWithFixedAccount.d) : null;
                    i1j.a aVar11 = (i1j.a) cVar7.f97286p.g();
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(filteringStrategy, "filteringStrategy");
                    h6i.o oVar = (h6i.o) rVar.f250852b;
                    r7i.u uVar = (r7i.u) rVar.f250851a;
                    if (aVar11 == null) {
                        aVar11 = (h6i.a) rVar.f250853c;
                    }
                    ViewController viewControllerE17 = cVar7.e1(new g1j.a(balanceSelector$InputData, new p0(oVar, uVar, filteringStrategy, lValueOf, aVar11)));
                    final int i66 = 3;
                    Function1 block24 = new Function1() { // from class: b6i.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Pair pair2;
                            switch (i66) {
                                case 0:
                                    v6i.j output = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    x5i.l lVar = x5i.l.LIMIT;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext22 = ((MoveAmountScreenContract$ModalStep.LimitOrderSettings) step9).f97260a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext22.f97275a, output.f286399a, lVar, moveAmountScreenContract$OrderContext22.f97276b, moveAmountScreenContract$OrderContext22.f97277c);
                                    return Unit.f186387a;
                                case 1:
                                    v6i.j output2 = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    x5i.l lVar2 = x5i.l.STOP;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext3 = ((MoveAmountScreenContract$ModalStep.StopOrderSettings) step9).f97271a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext3.f97275a, output2.f286399a, lVar2, moveAmountScreenContract$OrderContext3.f97276b, moveAmountScreenContract$OrderContext3.f97277c);
                                    return Unit.f186387a;
                                case 2:
                                    u6i.d output3 = (u6i.d) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext4 = ((MoveAmountScreenContract$ModalStep.OptionsSelector) step9).f97262a;
                                    com.revolut.feature_move_money.impl.amount.c cVar8 = cVar7;
                                    com.revolut.kompot.navigable.vc.modal.a aVar112 = cVar8.X;
                                    if (output3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i332 = a0.f12758g[output3.f277604a.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i332 == 1) {
                                        TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(cVar8.Q2().f12787h);
                                        if (transferScheduleDataB == null) {
                                            transferScheduleDataB = new TransferScheduleData(0L, (jli.c) null, 7);
                                        }
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB, cVar8.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), fullscreen_fade);
                                    } else if (i332 == 2) {
                                        cVar8.H2(cVar8.Y, new b4g.f0(16));
                                    } else if (i332 == 3) {
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    } else {
                                        if (i332 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.StopOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g1j.b output4 = (g1j.b) obj6;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j1j.d dVar2 = output4.f139686a;
                                    String str = dVar2.f170617a;
                                    k1j.a aVar12 = dVar2.d;
                                    j jVar2 = ((MoveAmountScreenContract$ModalStep.BalancePicker) step9).d;
                                    com.revolut.feature_move_money.impl.amount.c cVar9 = cVar7;
                                    cVar9.l2(new a1a.c(cVar9, aVar12, jVar2, str, (Continuation) null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    l1j.a output5 = (l1j.a) obj6;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (!Intrinsics.f(output5, a.C1086a.f191546a)) {
                                        if (!(output5 instanceof l1j.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str2 = ((l1j.b) output5).f191547a;
                                        k1j.a aVar13 = k1j.a.NON_EXISTING_CURRENCY;
                                        j jVar3 = ((MoveAmountScreenContract$ModalStep.CurrencyPicker) step9).f97257b;
                                        com.revolut.feature_move_money.impl.amount.c cVar10 = cVar7;
                                        cVar10.l2(new a1a.c(cVar10, aVar13, jVar3, str2, (Continuation) null, 20), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    t6i.j output6 = (t6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z = output6 instanceof t6i.i;
                                    com.revolut.feature_move_money.impl.amount.c cVar11 = cVar7;
                                    if (z) {
                                        t6i.a aVar14 = ((t6i.i) output6).f268356a;
                                        MoveAmountScreenContract$ModalStep.OrderAutomations orderAutomations = (MoveAmountScreenContract$ModalStep.OrderAutomations) step9;
                                        com.revolut.kompot.navigable.vc.modal.a aVar15 = cVar11.X;
                                        int i432 = a0.f12756b[aVar14.ordinal()];
                                        if (i432 == 1) {
                                            TransferScheduleData transferScheduleDataB2 = com.revolut.feature_move_money.api.model.c.b(cVar11.Q2().f12787h);
                                            if (transferScheduleDataB2 == null) {
                                                transferScheduleDataB2 = new TransferScheduleData(0L, (jli.c) null, 7);
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB2, cVar11.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                        } else if (i432 == 2) {
                                            cli.y yVar3 = cVar11.Y;
                                            s6i.e eVar3 = ((h) ((j2) yVar3.f22677a).getValue()).f12783a;
                                            if (eVar3 == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            x5i.a aVar16 = eVar3.f260362a;
                                            x5i.a aVar17 = eVar3.f260363b;
                                            int i592 = a0.f12757c[((h) ((j2) yVar3.f22677a).getValue()).f12785c.ordinal()];
                                            if (i592 == 1) {
                                                pair2 = new Pair(aVar16, aVar17.f302980b);
                                            } else {
                                                if (i592 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                pair2 = new Pair(aVar17, aVar16.f302980b);
                                            }
                                            x5i.a aVar18 = (x5i.a) pair2.f186385a;
                                            AccountWrapper accountWrapper2 = (AccountWrapper) pair2.f186386b;
                                            long j2 = aVar18.f302979a.f115082a;
                                            cVar11.C2(new MoveAmountScreenContract$OutputData.OpenAutomationScreen(aVar18.f302980b, accountWrapper2, j2 > 0 ? Long.valueOf(j2) : null));
                                        } else {
                                            if (i432 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.OrderBasedOnExchange(orderAutomations.f97264a, orderAutomations.f97265b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        }
                                    } else {
                                        if (!(output6 instanceof t6i.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar11.C1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k output7 = (eii.k) obj6;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    eii.i iVar = output7 instanceof eii.i ? (eii.i) output7 : null;
                                    Object obj7 = iVar != null ? iVar.f126655a : null;
                                    t6i.c cVar12 = obj7 instanceof t6i.c ? (t6i.c) obj7 : null;
                                    if (cVar12 == null) {
                                        return Unit.f186387a;
                                    }
                                    MoveAmountScreenContract$ModalStep.OrderBasedOnExchange orderBasedOnExchange = (MoveAmountScreenContract$ModalStep.OrderBasedOnExchange) step9;
                                    com.revolut.kompot.navigable.vc.modal.a aVar19 = cVar7.X;
                                    int i662 = a0.d[cVar12.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade2 = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i662 == 1) {
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    } else {
                                        if (i662 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.StopOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    viewControllerE17.H = block24;
                    return viewControllerE17;
                }
                if (step9 instanceof MoveAmountScreenContract$ModalStep.CurrencyPicker) {
                    ViewController viewControllerE18 = cVar7.e1(new l1j.c(((MoveAmountScreenContract$ModalStep.CurrencyPicker) step9).f97256a));
                    final int i74 = 4;
                    Function1 block25 = new Function1() { // from class: b6i.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Pair pair2;
                            switch (i74) {
                                case 0:
                                    v6i.j output = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    x5i.l lVar = x5i.l.LIMIT;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext22 = ((MoveAmountScreenContract$ModalStep.LimitOrderSettings) step9).f97260a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext22.f97275a, output.f286399a, lVar, moveAmountScreenContract$OrderContext22.f97276b, moveAmountScreenContract$OrderContext22.f97277c);
                                    return Unit.f186387a;
                                case 1:
                                    v6i.j output2 = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    x5i.l lVar2 = x5i.l.STOP;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext3 = ((MoveAmountScreenContract$ModalStep.StopOrderSettings) step9).f97271a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext3.f97275a, output2.f286399a, lVar2, moveAmountScreenContract$OrderContext3.f97276b, moveAmountScreenContract$OrderContext3.f97277c);
                                    return Unit.f186387a;
                                case 2:
                                    u6i.d output3 = (u6i.d) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext4 = ((MoveAmountScreenContract$ModalStep.OptionsSelector) step9).f97262a;
                                    com.revolut.feature_move_money.impl.amount.c cVar8 = cVar7;
                                    com.revolut.kompot.navigable.vc.modal.a aVar112 = cVar8.X;
                                    if (output3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i332 = a0.f12758g[output3.f277604a.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i332 == 1) {
                                        TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(cVar8.Q2().f12787h);
                                        if (transferScheduleDataB == null) {
                                            transferScheduleDataB = new TransferScheduleData(0L, (jli.c) null, 7);
                                        }
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB, cVar8.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), fullscreen_fade);
                                    } else if (i332 == 2) {
                                        cVar8.H2(cVar8.Y, new b4g.f0(16));
                                    } else if (i332 == 3) {
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    } else {
                                        if (i332 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.StopOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g1j.b output4 = (g1j.b) obj6;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j1j.d dVar2 = output4.f139686a;
                                    String str = dVar2.f170617a;
                                    k1j.a aVar12 = dVar2.d;
                                    j jVar2 = ((MoveAmountScreenContract$ModalStep.BalancePicker) step9).d;
                                    com.revolut.feature_move_money.impl.amount.c cVar9 = cVar7;
                                    cVar9.l2(new a1a.c(cVar9, aVar12, jVar2, str, (Continuation) null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    l1j.a output5 = (l1j.a) obj6;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (!Intrinsics.f(output5, a.C1086a.f191546a)) {
                                        if (!(output5 instanceof l1j.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str2 = ((l1j.b) output5).f191547a;
                                        k1j.a aVar13 = k1j.a.NON_EXISTING_CURRENCY;
                                        j jVar3 = ((MoveAmountScreenContract$ModalStep.CurrencyPicker) step9).f97257b;
                                        com.revolut.feature_move_money.impl.amount.c cVar10 = cVar7;
                                        cVar10.l2(new a1a.c(cVar10, aVar13, jVar3, str2, (Continuation) null, 20), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    t6i.j output6 = (t6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z = output6 instanceof t6i.i;
                                    com.revolut.feature_move_money.impl.amount.c cVar11 = cVar7;
                                    if (z) {
                                        t6i.a aVar14 = ((t6i.i) output6).f268356a;
                                        MoveAmountScreenContract$ModalStep.OrderAutomations orderAutomations = (MoveAmountScreenContract$ModalStep.OrderAutomations) step9;
                                        com.revolut.kompot.navigable.vc.modal.a aVar15 = cVar11.X;
                                        int i432 = a0.f12756b[aVar14.ordinal()];
                                        if (i432 == 1) {
                                            TransferScheduleData transferScheduleDataB2 = com.revolut.feature_move_money.api.model.c.b(cVar11.Q2().f12787h);
                                            if (transferScheduleDataB2 == null) {
                                                transferScheduleDataB2 = new TransferScheduleData(0L, (jli.c) null, 7);
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB2, cVar11.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                        } else if (i432 == 2) {
                                            cli.y yVar3 = cVar11.Y;
                                            s6i.e eVar3 = ((h) ((j2) yVar3.f22677a).getValue()).f12783a;
                                            if (eVar3 == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            x5i.a aVar16 = eVar3.f260362a;
                                            x5i.a aVar17 = eVar3.f260363b;
                                            int i592 = a0.f12757c[((h) ((j2) yVar3.f22677a).getValue()).f12785c.ordinal()];
                                            if (i592 == 1) {
                                                pair2 = new Pair(aVar16, aVar17.f302980b);
                                            } else {
                                                if (i592 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                pair2 = new Pair(aVar17, aVar16.f302980b);
                                            }
                                            x5i.a aVar18 = (x5i.a) pair2.f186385a;
                                            AccountWrapper accountWrapper2 = (AccountWrapper) pair2.f186386b;
                                            long j2 = aVar18.f302979a.f115082a;
                                            cVar11.C2(new MoveAmountScreenContract$OutputData.OpenAutomationScreen(aVar18.f302980b, accountWrapper2, j2 > 0 ? Long.valueOf(j2) : null));
                                        } else {
                                            if (i432 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.OrderBasedOnExchange(orderAutomations.f97264a, orderAutomations.f97265b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        }
                                    } else {
                                        if (!(output6 instanceof t6i.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar11.C1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k output7 = (eii.k) obj6;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    eii.i iVar = output7 instanceof eii.i ? (eii.i) output7 : null;
                                    Object obj7 = iVar != null ? iVar.f126655a : null;
                                    t6i.c cVar12 = obj7 instanceof t6i.c ? (t6i.c) obj7 : null;
                                    if (cVar12 == null) {
                                        return Unit.f186387a;
                                    }
                                    MoveAmountScreenContract$ModalStep.OrderBasedOnExchange orderBasedOnExchange = (MoveAmountScreenContract$ModalStep.OrderBasedOnExchange) step9;
                                    com.revolut.kompot.navigable.vc.modal.a aVar19 = cVar7.X;
                                    int i662 = a0.d[cVar12.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade2 = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i662 == 1) {
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    } else {
                                        if (i662 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.StopOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    viewControllerE18.H = block25;
                    return viewControllerE18;
                }
                if (step9 instanceof MoveAmountScreenContract$ModalStep.OrderAutomations) {
                    MoveAmountScreenContract$ModalStep.OrderAutomations orderAutomations = (MoveAmountScreenContract$ModalStep.OrderAutomations) step9;
                    OrderMode orderMode2 = orderAutomations.f97265b;
                    if (orderMode2 != null) {
                        Intrinsics.checkNotNullParameter(orderMode2, "<this>");
                        if (orderMode2 instanceof OrderMode.Threshold) {
                            aVar = t6i.a.EXCHANGE_RATE_BASED;
                        } else if (orderMode2 instanceof OrderMode.Scheduling) {
                            aVar = t6i.a.SCHEDULING;
                        } else if (orderMode2 instanceof OrderMode.Automation) {
                            aVar = t6i.a.BALANCE_BASED;
                        } else if (!(orderMode2 instanceof OrderMode.Market)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    OrderAutomationsScreen orderAutomationsScreen = new OrderAutomationsScreen(new OrderAutomationsScreenContract$InputData(aVar, orderAutomations.f97266c, orderAutomations.d));
                    final int i92 = 5;
                    Function1 block26 = new Function1() { // from class: b6i.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Pair pair2;
                            switch (i92) {
                                case 0:
                                    v6i.j output = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    x5i.l lVar = x5i.l.LIMIT;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext22 = ((MoveAmountScreenContract$ModalStep.LimitOrderSettings) step9).f97260a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext22.f97275a, output.f286399a, lVar, moveAmountScreenContract$OrderContext22.f97276b, moveAmountScreenContract$OrderContext22.f97277c);
                                    return Unit.f186387a;
                                case 1:
                                    v6i.j output2 = (v6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    x5i.l lVar2 = x5i.l.STOP;
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext3 = ((MoveAmountScreenContract$ModalStep.StopOrderSettings) step9).f97271a;
                                    cVar7.X2(moveAmountScreenContract$OrderContext3.f97275a, output2.f286399a, lVar2, moveAmountScreenContract$OrderContext3.f97276b, moveAmountScreenContract$OrderContext3.f97277c);
                                    return Unit.f186387a;
                                case 2:
                                    u6i.d output3 = (u6i.d) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext4 = ((MoveAmountScreenContract$ModalStep.OptionsSelector) step9).f97262a;
                                    com.revolut.feature_move_money.impl.amount.c cVar8 = cVar7;
                                    com.revolut.kompot.navigable.vc.modal.a aVar112 = cVar8.X;
                                    if (output3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i332 = a0.f12758g[output3.f277604a.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i332 == 1) {
                                        TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(cVar8.Q2().f12787h);
                                        if (transferScheduleDataB == null) {
                                            transferScheduleDataB = new TransferScheduleData(0L, (jli.c) null, 7);
                                        }
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB, cVar8.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), fullscreen_fade);
                                    } else if (i332 == 2) {
                                        cVar8.H2(cVar8.Y, new b4g.f0(16));
                                    } else if (i332 == 3) {
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    } else {
                                        if (i332 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.StopOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g1j.b output4 = (g1j.b) obj6;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j1j.d dVar2 = output4.f139686a;
                                    String str = dVar2.f170617a;
                                    k1j.a aVar12 = dVar2.d;
                                    j jVar2 = ((MoveAmountScreenContract$ModalStep.BalancePicker) step9).d;
                                    com.revolut.feature_move_money.impl.amount.c cVar9 = cVar7;
                                    cVar9.l2(new a1a.c(cVar9, aVar12, jVar2, str, (Continuation) null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                case 4:
                                    l1j.a output5 = (l1j.a) obj6;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (!Intrinsics.f(output5, a.C1086a.f191546a)) {
                                        if (!(output5 instanceof l1j.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str2 = ((l1j.b) output5).f191547a;
                                        k1j.a aVar13 = k1j.a.NON_EXISTING_CURRENCY;
                                        j jVar3 = ((MoveAmountScreenContract$ModalStep.CurrencyPicker) step9).f97257b;
                                        com.revolut.feature_move_money.impl.amount.c cVar10 = cVar7;
                                        cVar10.l2(new a1a.c(cVar10, aVar13, jVar3, str2, (Continuation) null, 20), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    t6i.j output6 = (t6i.j) obj6;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z = output6 instanceof t6i.i;
                                    com.revolut.feature_move_money.impl.amount.c cVar11 = cVar7;
                                    if (z) {
                                        t6i.a aVar14 = ((t6i.i) output6).f268356a;
                                        MoveAmountScreenContract$ModalStep.OrderAutomations orderAutomations2 = (MoveAmountScreenContract$ModalStep.OrderAutomations) step9;
                                        com.revolut.kompot.navigable.vc.modal.a aVar15 = cVar11.X;
                                        int i432 = a0.f12756b[aVar14.ordinal()];
                                        if (i432 == 1) {
                                            TransferScheduleData transferScheduleDataB2 = com.revolut.feature_move_money.api.model.c.b(cVar11.Q2().f12787h);
                                            if (transferScheduleDataB2 == null) {
                                                transferScheduleDataB2 = new TransferScheduleData(0L, (jli.c) null, 7);
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB2, cVar11.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                        } else if (i432 == 2) {
                                            cli.y yVar3 = cVar11.Y;
                                            s6i.e eVar3 = ((h) ((j2) yVar3.f22677a).getValue()).f12783a;
                                            if (eVar3 == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            x5i.a aVar16 = eVar3.f260362a;
                                            x5i.a aVar17 = eVar3.f260363b;
                                            int i592 = a0.f12757c[((h) ((j2) yVar3.f22677a).getValue()).f12785c.ordinal()];
                                            if (i592 == 1) {
                                                pair2 = new Pair(aVar16, aVar17.f302980b);
                                            } else {
                                                if (i592 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                pair2 = new Pair(aVar17, aVar16.f302980b);
                                            }
                                            x5i.a aVar18 = (x5i.a) pair2.f186385a;
                                            AccountWrapper accountWrapper2 = (AccountWrapper) pair2.f186386b;
                                            long j2 = aVar18.f302979a.f115082a;
                                            cVar11.C2(new MoveAmountScreenContract$OutputData.OpenAutomationScreen(aVar18.f302980b, accountWrapper2, j2 > 0 ? Long.valueOf(j2) : null));
                                        } else {
                                            if (i432 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.OrderBasedOnExchange(orderAutomations2.f97264a, orderAutomations2.f97265b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        }
                                    } else {
                                        if (!(output6 instanceof t6i.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar11.C1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k output7 = (eii.k) obj6;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    eii.i iVar = output7 instanceof eii.i ? (eii.i) output7 : null;
                                    Object obj7 = iVar != null ? iVar.f126655a : null;
                                    t6i.c cVar12 = obj7 instanceof t6i.c ? (t6i.c) obj7 : null;
                                    if (cVar12 == null) {
                                        return Unit.f186387a;
                                    }
                                    MoveAmountScreenContract$ModalStep.OrderBasedOnExchange orderBasedOnExchange = (MoveAmountScreenContract$ModalStep.OrderBasedOnExchange) step9;
                                    com.revolut.kompot.navigable.vc.modal.a aVar19 = cVar7.X;
                                    int i662 = a0.d[cVar12.ordinal()];
                                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade2 = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                    if (i662 == 1) {
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    } else {
                                        if (i662 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.StopOrderSettings(orderBasedOnExchange.f97267a), fullscreen_fade2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block26, "block");
                    orderAutomationsScreen.H = block26;
                    return orderAutomationsScreen;
                }
                if (!(step9 instanceof MoveAmountScreenContract$ModalStep.OrderBasedOnExchange)) {
                    if (step9 instanceof MoveAmountScreenContract$ModalStep.UnsettledDialog) {
                        return cVar7.e1(new pih.i(((MoveAmountScreenContract$ModalStep.UnsettledDialog) step9).f97274a));
                    }
                    if (step9 instanceof MoveAmountScreenContract$ModalStep.TaaInvestAllowanceDialog) {
                        return cVar7.e1(new ygh.a(((MoveAmountScreenContract$ModalStep.TaaInvestAllowanceDialog) step9).f97273a));
                    }
                    if (!(step9 instanceof MoveAmountScreenContract$ModalStep.JisaCashHoldingAvailableToWithdrawInfoDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TradingAccount.TaxAdvantage.JIsa jIsa = ((MoveAmountScreenContract$ModalStep.JisaCashHoldingAvailableToWithdrawInfoDialog) step9).f97259a;
                    if (jIsa instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                        custodian = new JuniorIsaAccountOwnership.Custodian(((TradingAccount.TaxAdvantage.JIsa.Custodian) jIsa).f105237n.f105176b);
                    } else {
                        if (!(jIsa instanceof TradingAccount.TaxAdvantage.JIsa.Personal)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        custodian = JuniorIsaAccountOwnership.Personal.f76736a;
                    }
                    return cVar7.e1(new JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor(custodian, t98.e.WITHDRAW));
                }
                t6i.b bVar6 = cVar7.T;
                MoveAmountScreenContract$ModalStep.OrderBasedOnExchange orderBasedOnExchange = (MoveAmountScreenContract$ModalStep.OrderBasedOnExchange) step9;
                OrderMode orderMode3 = orderBasedOnExchange.f97268b;
                if (orderMode3 != null) {
                    Intrinsics.checkNotNullParameter(orderMode3, "<this>");
                    if (orderMode3 instanceof OrderMode.Threshold) {
                        int i96 = y6i.b.f311314a[((OrderMode.Threshold) orderMode3).f97231a.ordinal()];
                        if (i96 == 1) {
                            cVar = t6i.c.LIMIT_ORDER;
                        } else {
                            if (i96 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = t6i.c.STOP_ORDER;
                        }
                    } else {
                        if (!(orderMode3 instanceof OrderMode.Market) && !(orderMode3 instanceof OrderMode.Automation) && !(orderMode3 instanceof OrderMode.Scheduling)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = null;
                    }
                } else {
                    cVar = null;
                }
                j8l.d buyMode = orderBasedOnExchange.f97267a.f97275a;
                bVar6.getClass();
                Intrinsics.checkNotNullParameter(buyMode, "buyMode");
                lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_order_type_bottom_sheet_rate_title, null, null, 14), null, null, null, false, 30);
                Intrinsics.checkNotNullParameter(buyMode, "buyMode");
                int i99 = t6i.d.f268353a[buyMode.ordinal()];
                if (i99 == 1) {
                    pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_order_downwards), Integer.valueOf(R$drawable.uikit_icn_24_order_upwards));
                } else {
                    if (i99 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_order_upwards), Integer.valueOf(R$drawable.uikit_icn_24_order_downwards));
                }
                int iIntValue = ((Number) pair.f186385a).intValue();
                int iIntValue2 = ((Number) pair.f186386b).intValue();
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_order_type_bottom_sheet_rate_limit_title, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_order_type_bottom_sheet_rate_limit_subtitle, null, null, 14);
                t6i.c cVar8 = t6i.c.LIMIT_ORDER;
                eii.a aVarA = t6i.e.a("LIMIT_ORDER", textLocalisedClause2, textLocalisedClause3, iIntValue, cVar == cVar8, cVar8);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_order_type_bottom_sheet_rate_stop_title, null, null, 14);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_order_type_bottom_sheet_rate_stop_subtitle, null, null, 14);
                t6i.c cVar9 = t6i.c.STOP_ORDER;
                List listK = v.k(aVarA, t6i.e.a("STOP_ORDER", textLocalisedClause4, textLocalisedClause5, iIntValue2, cVar == cVar9, cVar9));
                k9 k9Var2 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar12, null, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
                final int i100 = 6;
                Function1 block27 = new Function1() { // from class: b6i.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        Pair pair2;
                        switch (i100) {
                            case 0:
                                v6i.j output = (v6i.j) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                x5i.l lVar = x5i.l.LIMIT;
                                MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext22 = ((MoveAmountScreenContract$ModalStep.LimitOrderSettings) step9).f97260a;
                                cVar7.X2(moveAmountScreenContract$OrderContext22.f97275a, output.f286399a, lVar, moveAmountScreenContract$OrderContext22.f97276b, moveAmountScreenContract$OrderContext22.f97277c);
                                return Unit.f186387a;
                            case 1:
                                v6i.j output2 = (v6i.j) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                x5i.l lVar2 = x5i.l.STOP;
                                MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext3 = ((MoveAmountScreenContract$ModalStep.StopOrderSettings) step9).f97271a;
                                cVar7.X2(moveAmountScreenContract$OrderContext3.f97275a, output2.f286399a, lVar2, moveAmountScreenContract$OrderContext3.f97276b, moveAmountScreenContract$OrderContext3.f97277c);
                                return Unit.f186387a;
                            case 2:
                                u6i.d output3 = (u6i.d) obj6;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext4 = ((MoveAmountScreenContract$ModalStep.OptionsSelector) step9).f97262a;
                                com.revolut.feature_move_money.impl.amount.c cVar82 = cVar7;
                                com.revolut.kompot.navigable.vc.modal.a aVar112 = cVar82.X;
                                if (output3 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i332 = a0.f12758g[output3.f277604a.ordinal()];
                                ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                if (i332 == 1) {
                                    TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(cVar82.Q2().f12787h);
                                    if (transferScheduleDataB == null) {
                                        transferScheduleDataB = new TransferScheduleData(0L, (jli.c) null, 7);
                                    }
                                    oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB, cVar82.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), fullscreen_fade);
                                } else if (i332 == 2) {
                                    cVar82.H2(cVar82.Y, new b4g.f0(16));
                                } else if (i332 == 3) {
                                    oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                } else {
                                    if (i332 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.v2(aVar112, new MoveAmountScreenContract$ModalStep.StopOrderSettings(moveAmountScreenContract$OrderContext4), fullscreen_fade);
                                }
                                return Unit.f186387a;
                            case 3:
                                g1j.b output4 = (g1j.b) obj6;
                                Intrinsics.checkNotNullParameter(output4, "output");
                                if (output4 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                j1j.d dVar2 = output4.f139686a;
                                String str = dVar2.f170617a;
                                k1j.a aVar122 = dVar2.d;
                                j jVar2 = ((MoveAmountScreenContract$ModalStep.BalancePicker) step9).d;
                                com.revolut.feature_move_money.impl.amount.c cVar92 = cVar7;
                                cVar92.l2(new a1a.c(cVar92, aVar122, jVar2, str, (Continuation) null, 20), new yi5.b(26));
                                return Unit.f186387a;
                            case 4:
                                l1j.a output5 = (l1j.a) obj6;
                                Intrinsics.checkNotNullParameter(output5, "output");
                                if (!Intrinsics.f(output5, a.C1086a.f191546a)) {
                                    if (!(output5 instanceof l1j.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str2 = ((l1j.b) output5).f191547a;
                                    k1j.a aVar13 = k1j.a.NON_EXISTING_CURRENCY;
                                    j jVar3 = ((MoveAmountScreenContract$ModalStep.CurrencyPicker) step9).f97257b;
                                    com.revolut.feature_move_money.impl.amount.c cVar10 = cVar7;
                                    cVar10.l2(new a1a.c(cVar10, aVar13, jVar3, str2, (Continuation) null, 20), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 5:
                                t6i.j output6 = (t6i.j) obj6;
                                Intrinsics.checkNotNullParameter(output6, "output");
                                boolean z = output6 instanceof t6i.i;
                                com.revolut.feature_move_money.impl.amount.c cVar11 = cVar7;
                                if (z) {
                                    t6i.a aVar14 = ((t6i.i) output6).f268356a;
                                    MoveAmountScreenContract$ModalStep.OrderAutomations orderAutomations2 = (MoveAmountScreenContract$ModalStep.OrderAutomations) step9;
                                    com.revolut.kompot.navigable.vc.modal.a aVar15 = cVar11.X;
                                    int i432 = a0.f12756b[aVar14.ordinal()];
                                    if (i432 == 1) {
                                        TransferScheduleData transferScheduleDataB2 = com.revolut.feature_move_money.api.model.c.b(cVar11.Q2().f12787h);
                                        if (transferScheduleDataB2 == null) {
                                            transferScheduleDataB2 = new TransferScheduleData(0L, (jli.c) null, 7);
                                        }
                                        oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB2, cVar11.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                    } else if (i432 == 2) {
                                        cli.y yVar3 = cVar11.Y;
                                        s6i.e eVar3 = ((h) ((j2) yVar3.f22677a).getValue()).f12783a;
                                        if (eVar3 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        x5i.a aVar16 = eVar3.f260362a;
                                        x5i.a aVar17 = eVar3.f260363b;
                                        int i592 = a0.f12757c[((h) ((j2) yVar3.f22677a).getValue()).f12785c.ordinal()];
                                        if (i592 == 1) {
                                            pair2 = new Pair(aVar16, aVar17.f302980b);
                                        } else {
                                            if (i592 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            pair2 = new Pair(aVar17, aVar16.f302980b);
                                        }
                                        x5i.a aVar18 = (x5i.a) pair2.f186385a;
                                        AccountWrapper accountWrapper2 = (AccountWrapper) pair2.f186386b;
                                        long j2 = aVar18.f302979a.f115082a;
                                        cVar11.C2(new MoveAmountScreenContract$OutputData.OpenAutomationScreen(aVar18.f302980b, accountWrapper2, j2 > 0 ? Long.valueOf(j2) : null));
                                    } else {
                                        if (i432 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar15, new MoveAmountScreenContract$ModalStep.OrderBasedOnExchange(orderAutomations2.f97264a, orderAutomations2.f97265b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                } else {
                                    if (!(output6 instanceof t6i.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar11.C1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                                }
                                return Unit.f186387a;
                            default:
                                eii.k output7 = (eii.k) obj6;
                                Intrinsics.checkNotNullParameter(output7, "output");
                                eii.i iVar = output7 instanceof eii.i ? (eii.i) output7 : null;
                                Object obj7 = iVar != null ? iVar.f126655a : null;
                                t6i.c cVar12 = obj7 instanceof t6i.c ? (t6i.c) obj7 : null;
                                if (cVar12 == null) {
                                    return Unit.f186387a;
                                }
                                MoveAmountScreenContract$ModalStep.OrderBasedOnExchange orderBasedOnExchange2 = (MoveAmountScreenContract$ModalStep.OrderBasedOnExchange) step9;
                                com.revolut.kompot.navigable.vc.modal.a aVar19 = cVar7.X;
                                int i662 = a0.d[cVar12.ordinal()];
                                ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade2 = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                                if (i662 == 1) {
                                    oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.LimitOrderSettings(orderBasedOnExchange2.f97267a), fullscreen_fade2);
                                } else {
                                    if (i662 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.v2(aVar19, new MoveAmountScreenContract$ModalStep.StopOrderSettings(orderBasedOnExchange2.f97267a), fullscreen_fade2);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block27, "block");
                rowActionsBottomSheetController.H = block27;
                return rowActionsBottomSheetController;
            case 24:
                LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen = (LegacyEditConsentPreferencesScreen) obj4;
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                KProperty[] kPropertyArr2 = LegacyEditConsentPreferencesScreen.T;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                if (!Intrinsics.f(model2.f52580a, "consent-retention-date")) {
                    return null;
                }
                qd0.b bVarN2 = ((y3) legacyEditConsentPreferencesScreen.Q.getValue()).f120204b.f118443h.n();
                vc.s.j(bVarN2);
                return new zp0.p(((s80.b) bVarN2).b(), field2.getInnerEditText(), new b3.a(legacyEditConsentPreferencesScreen, i2), null, false, true, null, false, 456);
            case 25:
                com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a aVar13 = (com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                LegacyEditConsentPreferencesScreenContract$ModalStep step10 = (LegacyEditConsentPreferencesScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!Intrinsics.f(step10, LegacyEditConsentPreferencesScreenContract$ModalStep.DatePicker.f67278a)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_consents_options_select_date, null, null, 14);
                EditPreferencesConfiguration editPreferencesConfiguration = aVar13.o.f67277a;
                LocalDate f66441a = ((b74.s) ((j2) aVar13.f67279p.f22677a).getValue()).f12898a.getF66441a();
                if (f66441a == null) {
                    f66441a = editPreferencesConfiguration.getE();
                }
                DatePickerBottomSheetController datePickerBottomSheetController = new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(textLocalisedClause6, (LocalDate) kotlin.ranges.f.j(f66441a, editPreferencesConfiguration.getF67267c(), editPreferencesConfiguration.getD()), editPreferencesConfiguration.getF67267c(), editPreferencesConfiguration.getD(), 16));
                z block28 = new z(aVar13, 21);
                Intrinsics.checkNotNullParameter(block28, "block");
                datePickerBottomSheetController.H = block28;
                return datePickerBottomSheetController;
            case 26:
                com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.a aVar14 = (com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                LoanInterestRateBreakdownControllerContract$ModalStep step11 = (LoanInterestRateBreakdownControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof LoanInterestRateBreakdownControllerContract$ModalStep.InterestRateTypeExplainer) {
                    return ((c55.n) aVar14.o).a(((LoanInterestRateBreakdownControllerContract$ModalStep.InterestRateTypeExplainer) step11).f70442a);
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                com.revolut.feature.giro.impl.ui.form.b bVar7 = (com.revolut.feature.giro.impl.ui.form.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator9 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DirectDebitFormScreenContract$ModalStep step12 = (DirectDebitFormScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator9, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (Intrinsics.f(step12, DirectDebitFormScreenContract$ModalStep.CreditorSelector.f74543a)) {
                    ViewController viewControllerE19 = bVar7.e1(new dm1.a(new BillerSearchNavigation$InputData(xo1.g.GIRO_HU_DIRECT_DEBIT, null)));
                    b77.l block29 = new b77.l(bVar7, i2);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    viewControllerE19.H = block29;
                    return viewControllerE19;
                }
                if (!(step12 instanceof DirectDebitFormScreenContract$ModalStep.DateSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                DirectDebitFormScreenContract$ModalStep.DateSelection dateSelection = (DirectDebitFormScreenContract$ModalStep.DateSelection) step12;
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(dateSelection.f74545b, null, null, 14);
                LocalDate localDateE = dateSelection.d;
                if (localDateE == null) {
                    localDateE = ((l80.f) bVar7.f74548p).e();
                }
                DatePickerBottomSheetController datePickerBottomSheetController2 = new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(textLocalisedClause7, localDateE, dateSelection.f74546c, (LocalDate) null, 16));
                b58.f block30 = new b58.f(dateSelection, bVar7, 15);
                Intrinsics.checkNotNullParameter(block30, "block");
                datePickerBottomSheetController2.H = block30;
                return datePickerBottomSheetController2;
            case 28:
                return a(obj2, obj3);
            default:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                PayNowAmountScreen.Companion aVar15 = PayNowAmountScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field3, "field");
                MaskedTextInputEditText editText2 = field3.getEditText();
                Object obj6 = data.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
                return new zp0.d(editText2, ((yof.b) obj6).f315672a, (u80.d) ((PayNowAmountScreen) obj4).N.getValue(), null, null, false, false, 0, false, null, 1944);
        }
    }
}
