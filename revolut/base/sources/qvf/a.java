package qvf;

import a0.d;
import androidx.camera.camera2.config.UseCaseGraphContext;
import com.revolut.chat.ui.chatlist.ChatListContract$InputData;
import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreen;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreenContract$InputData;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreen;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreenContract$InputData;
import com.revolut.feature.card_design.impl.card_design.card_video_preview.CardVideoPreviewController;
import com.revolut.feature.card_design.impl.card_design.card_video_preview.CardVideoPreviewScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.intro.ManualUnderwritingIntroScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.intro.ManualUnderwritingIntroScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.AmountSuggestionScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.AmountSuggestionScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser.FreelancerPluginChooserScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser.FreelancerPluginChooserScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.FreelancerCreateTaxPocketFlow;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.FreelancerCreateTaxPocketFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlowContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlow;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreen;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreenContract$InputData;
import com.revolut.feature.transport.api.navigation.TransportFlowInputData;
import com.revolut.feature.transport.impl.ui.TransportFlow;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreenContract$InputData;
import com.revolut.feature_rev_points_pocket_impl.ui.flow.RevPointsPocketFlow;
import com.revolut.feature_rev_points_pocket_impl.ui.flow.RevPointsPocketFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$InputData;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.WealthNewsFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.WealthNewsFlowContract$InputData;
import com.revolut.retail.feature.payment_options.impl.ui.flow.PaymentOptionsFlow;
import com.revolut.retail.feature.payment_options.impl.ui.flow.PaymentOptionsFlowContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.PartnerConsentRequestFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.PartnerConsentRequestFlowContract$InputData;
import cwi.b0;
import cwi.h0;
import dw3.b4;
import dw3.c4;
import dw3.p;
import dw3.s4;
import f4g.m0;
import gy2.h;
import h30.r;
import hvf.j;
import hvf.m;
import hvf.q;
import java.util.Map;
import jdi.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kyk.o;
import kyk.v;
import kyk.y;
import nv1.t;
import nv1.u;
import o4e.l;
import p2k.i;
import p2k.k;
import p2k.n;
import qtb.c;
import r6e.g;
import u45.i0;
import ue0.e;
import us6.h1;
import us6.k0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f249694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f249695c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f249693a = i;
        this.f249694b = obj2;
        this.f249695c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f249693a;
        Object obj2 = this.f249695c;
        Object obj3 = this.f249694b;
        switch (i) {
            case 0:
                TransportFlowInputData transportFlowInputData = (TransportFlowInputData) obj2;
                phm.a aVar2 = (phm.a) e.j(((TransportFlow) obj3).m2()).a().get(q.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(d.q("Api ", q.class, " is not found"));
                }
                q qVar = ((q) aVar.b()).k;
                transportFlowInputData.getClass();
                return new m(qVar, transportFlowInputData);
            case 1:
                BrebRegisterScreen brebRegisterScreen = (BrebRegisterScreen) obj3;
                BrebRegisterScreenContract$InputData brebRegisterScreenContract$InputData = (BrebRegisterScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = BrebRegisterScreen.R;
                qji.b bVarU2 = brebRegisterScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.register.di.BrebRegisterScreenInjector");
                t tVar = (t) ((rw1.a) bVarU2).b().mo3808a(brebRegisterScreen);
                switch (tVar.f219448a) {
                    case 0:
                        tVar.d = brebRegisterScreenContract$InputData;
                        break;
                    default:
                        tVar.d = brebRegisterScreenContract$InputData;
                        break;
                }
                return (u) tVar.mo3783build();
            case 2:
                KProperty[] kPropertyArr2 = FreelancerPluginChooserScreen.Q;
                qji.b bVarU22 = ((FreelancerPluginChooserScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser.di.FreelancerPluginChooserScreenInjector");
                h1 h1Var = (h1) bVarU22;
                return new k0(h1Var.f282563a, h1Var.f282564b, (FreelancerPluginChooserScreenContract$InputData) obj2);
            case 3:
                TransitCheckoutScreen transitCheckoutScreen = (TransitCheckoutScreen) obj3;
                TransitCheckoutScreenContract$InputData transitCheckoutScreenContract$InputData = (TransitCheckoutScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = TransitCheckoutScreen.f92560k0;
                phm.a aVar3 = (phm.a) e.j(transitCheckoutScreen.m2()).a().get(q.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new j(((q) aVar.b()).k, transitCheckoutScreen, transitCheckoutScreenContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", q.class, " is not found"));
            case 4:
                AirportLoungePassDetailsFlowContract$InputData airportLoungePassDetailsFlowContract$InputData = (AirportLoungePassDetailsFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) e.j(((AirportLoungePassDetailsFlow) obj3).m2()).a().get(ovi.a.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new b0(((h0) aVar.b()).f109711y, airportLoungePassDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", ovi.a.class, " is not found"));
            case 5:
                CardVideoPreviewScreenContract$InputData cardVideoPreviewScreenContract$InputData = (CardVideoPreviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = CardVideoPreviewController.Q;
                phm.a aVar5 = (phm.a) e.j(((CardVideoPreviewController) obj3).m2()).a().get(gy2.d.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new h(((gy2.d) aVar.b()).f147796y, cardVideoPreviewScreenContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", gy2.d.class, " is not found"));
            case 6:
                KProperty[] kPropertyArr5 = CustomOrderAmountScreen.R;
                qji.b bVarU23 = ((CustomOrderAmountScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.di.CustomOrderAmountScreenComponent.Injector");
                jxd.a aVar6 = (jxd.a) bVarU23;
                return new jxd.d(aVar6.f179136b, aVar6.f179137c, (CustomOrderAmountScreenContract$InputData) obj2);
            case 7:
                return UseCaseGraphContext.surfaceToStreamMap_delegate$lambda$0((Map) obj3, (UseCaseGraphContext) obj2);
            case 8:
                return ((com.google.firebase.messaging.t) obj3).f(new c((r08.c) obj2, 18));
            case 9:
                McyExchangeRateScreen mcyExchangeRateScreen = (McyExchangeRateScreen) obj3;
                KProperty[] kPropertyArr6 = McyExchangeRateScreen.U;
                qji.b bVarU24 = mcyExchangeRateScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.di.IndiaTopupReviewTransferScreenInjector");
                qve.m mVar = (qve.m) bVarU24;
                return new qve.j(mVar.f249627c, mVar.d, mcyExchangeRateScreen, (McyExchangeRateScreenContract$InputData) obj2);
            case 10:
                WealthNewsFlowContract$InputData wealthNewsFlowContract$InputData = (WealthNewsFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) e.j(((WealthNewsFlow) obj3).m2()).a().get(l0k.c.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new l0k.h(((l0k.c) aVar.b()).o, new o0h.a(), wealthNewsFlowContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", l0k.c.class, " is not found"));
            case 11:
                PartnerConsentRequestFlowContract$InputData partnerConsentRequestFlowContract$InputData = (PartnerConsentRequestFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) e.j(((PartnerConsentRequestFlow) obj3).m2()).a().get(y.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(d.q("Api ", y.class, " is not found"));
                }
                v vVar = ((v) ((y) aVar.b())).A;
                TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig = partnerConsentRequestFlowContract$InputData.f104264a;
                tradingOnboardingFeatureConfig.getClass();
                return new o(vVar, tradingOnboardingFeatureConfig);
            case 12:
                PaymentOptionsFlowContract$InputData paymentOptionsFlowContract$InputData = (PaymentOptionsFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) e.j(((PaymentOptionsFlow) obj3).m2()).a().get(q1k.a.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new q1k.b(((q1k.a) aVar.b()).e, paymentOptionsFlowContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", q1k.a.class, " is not found"));
            case 13:
                FreelancerCreateTaxPocketFlowContract$InputData freelancerCreateTaxPocketFlowContract$InputData = (FreelancerCreateTaxPocketFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) e.j(((FreelancerCreateTaxPocketFlow) obj3).m2()).a().get(bt6.b.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new bt6.a(((bt6.b) aVar.b()).f18307t, freelancerCreateTaxPocketFlowContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", bt6.b.class, " is not found"));
            case 14:
                ChatListScreen chatListScreen = (ChatListScreen) obj3;
                ChatListScreen.Companion aVar11 = ChatListScreen.INSTANCE;
                qji.b bVarQ2 = chatListScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.chat.ui.chatlist.di.ChatListInjector");
                h30.q qVarA = ((d50.a) bVarQ2).A();
                qVarA.e = (ChatListContract$InputData) obj2;
                qVarA.d = chatListScreen;
                return (r) qVarA.mo3800build();
            case 15:
                BankTransferReviewScreen bankTransferReviewScreen = (BankTransferReviewScreen) obj3;
                BankTransferReviewScreenContract$InputData bankTransferReviewScreenContract$InputData = (BankTransferReviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = BankTransferReviewScreen.f102115n0;
                qji.b bVarU25 = bankTransferReviewScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.di.BankTransferReviewScreenInjector");
                i iVar = (i) bVarU25;
                n nVar = iVar.f232358c;
                i iVar2 = iVar.d;
                bankTransferReviewScreenContract$InputData.getClass();
                return new k(nVar, iVar2, bankTransferReviewScreen, bankTransferReviewScreenContract$InputData, bankTransferReviewScreen);
            case 16:
                PayoutScenarioScreenContract$InputData payoutScenarioScreenContract$InputData = (PayoutScenarioScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = PayoutScenarioScreen.R;
                phm.a aVar12 = (phm.a) e.j(((PayoutScenarioScreen) obj3).m2()).a().get(l.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new o4e.h(((l) aVar.b()).o, payoutScenarioScreenContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
            case 17:
                LoanSelectNewRepaymentDayScreenContract$InputData loanSelectNewRepaymentDayScreenContract$InputData = (LoanSelectNewRepaymentDayScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = LoanSelectNewRepaymentDayScreen.f70404b0;
                phm.a aVar13 = (phm.a) e.j(((LoanSelectNewRepaymentDayScreen) obj3).m2()).a().get(u45.h.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new i0(((u45.h) aVar.b()).B, loanSelectNewRepaymentDayScreenContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", u45.h.class, " is not found"));
            case 18:
                TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen = (TravelFlightsPassengersPickerScreen) obj3;
                KProperty[] kPropertyArr10 = TravelFlightsPassengersPickerScreen.T;
                qji.b bVarU26 = travelFlightsPassengersPickerScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.di.TravelFlightsPassengersPickerScreenInjector");
                return (m0) ((s6g.a) ((s6g.b) bVarU26).q().mo3808a(travelFlightsPassengersPickerScreen)).Z((TravelFlightsPassengersPickerScreenContract$InputData) obj2).mo3783build();
            case 19:
                CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData cobrandedCardsPlanHubTransactionDetailsScreenContract$InputData = (CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                qji.b bVarU27 = ((CobrandedCardsPlanHubTransactionDetailsScreen) obj3).U2();
                if (bVarU27 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.di.CobrandedCardsPlanHubTransactionDetailsScreenInjector");
                }
                b6b.q qVar2 = (b6b.q) bVarU27;
                return new b6b.u(qVar2.f12665b, qVar2.f12666c, cobrandedCardsPlanHubTransactionDetailsScreenContract$InputData);
            case 20:
                AddDebtScreen addDebtScreen = (AddDebtScreen) obj3;
                KProperty[] kPropertyArr12 = AddDebtScreen.f67423d0;
                qji.b bVarQ22 = addDebtScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.di.AddDebtScreenInjector");
                s4 s4Var = (s4) bVarQ22;
                return new p(s4Var.f119751c, s4Var.d, addDebtScreen, (AddDebtScreenContract$InputData) obj2);
            case 21:
                GroupMembersScreen groupMembersScreen = (GroupMembersScreen) obj3;
                GroupMembersScreenContract$InputData groupMembersScreenContract$InputData = (GroupMembersScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = GroupMembersScreen.f0;
                phm.a aVar14 = (phm.a) e.j(groupMembersScreen.m2()).a().get(r6e.o.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new g(((r6e.o) aVar.b()).K, groupMembersScreen, groupMembersScreenContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", r6e.o.class, " is not found"));
            case 22:
                BlockFuturePaymentsFlowContract$InputData blockFuturePaymentsFlowContract$InputData = (BlockFuturePaymentsFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) e.j(((BlockFuturePaymentsFlow) obj3).m2()).a().get(f9e.a.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new i9e.i(((i9e.o) aVar.b()).G, blockFuturePaymentsFlowContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", f9e.a.class, " is not found"));
            case 23:
                KProperty[] kPropertyArr14 = AmountSuggestionScreen.f72055e0;
                qji.b bVarQ23 = ((AmountSuggestionScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.di.AmountSuggestionScreenInjector");
                pa6.n nVar2 = (pa6.n) bVarQ23;
                return new pa6.a(nVar2.f234406b, nVar2.f234407c, (AmountSuggestionScreenContract$InputData) obj2);
            case 24:
                ShippingTrackingScreen shippingTrackingScreen = (ShippingTrackingScreen) obj3;
                KProperty[] kPropertyArr15 = ShippingTrackingScreen.S;
                qji.b bVarU28 = shippingTrackingScreen.U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.di.ShippingTrackingScreenInjector");
                uac.i iVar3 = (uac.i) bVarU28;
                return new uac.h(iVar3.f278584b, iVar3.f278585c, shippingTrackingScreen, (ShippingTrackingScreenContract$InputData) obj2);
            case 25:
                TravelHotelsFavoritesGridScreen travelHotelsFavoritesGridScreen = (TravelHotelsFavoritesGridScreen) obj3;
                TravelHotelsFavoritesGridScreenContract$InputData travelHotelsFavoritesGridScreenContract$InputData = (TravelHotelsFavoritesGridScreenContract$InputData) obj2;
                KProperty[] kPropertyArr16 = TravelHotelsFavoritesGridScreen.R;
                qji.b bVarU29 = travelHotelsFavoritesGridScreen.U2();
                Intrinsics.i(bVarU29, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.di.TravelHotelsFavoritesGridScreenInjector");
                g9g.t tVar2 = (g9g.t) bVarU29;
                g9g.d dVar = tVar2.f141813b;
                g9g.t tVar3 = tVar2.f141814c;
                travelHotelsFavoritesGridScreenContract$InputData.getClass();
                return new g9g.p(dVar, tVar3, travelHotelsFavoritesGridScreen, travelHotelsFavoritesGridScreenContract$InputData);
            case 26:
                ManualUnderwritingIntroScreen manualUnderwritingIntroScreen = (ManualUnderwritingIntroScreen) obj3;
                KProperty[] kPropertyArr17 = ManualUnderwritingIntroScreen.f67954b0;
                qji.b bVarQ24 = manualUnderwritingIntroScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.intro.di.ManualUnderwritingIntroScreenInjector");
                b4 b4Var = (b4) bVarQ24;
                return new c4(b4Var.f118345c, b4Var.d, manualUnderwritingIntroScreen, (ManualUnderwritingIntroScreenContract$InputData) obj2);
            case 27:
                RevPointsPocketFlowContract$InputData revPointsPocketFlowContract$InputData = (RevPointsPocketFlowContract$InputData) obj2;
                phm.a aVar16 = (phm.a) e.j(((RevPointsPocketFlow) obj3).m2()).a().get(jdi.c.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar != null) {
                    return new f(((jdi.c) aVar.b()).i, revPointsPocketFlowContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", jdi.c.class, " is not found"));
            case 28:
                KProperty[] kPropertyArr18 = SwishTransactionLimitScreen.S;
                qji.b bVarU210 = ((SwishTransactionLimitScreen) obj3).U2();
                Intrinsics.i(bVarU210, "null cannot be cast to non-null type com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.di.SwishTransactionLimitScreenInjector");
                he2.f fVar = (he2.f) bVarU210;
                return new he2.h(fVar.f151539a, fVar.f151540b, (SwishTransactionLimitScreenContract$InputData) obj2);
            default:
                SharedAlertDetailsFlow sharedAlertDetailsFlow = (SharedAlertDetailsFlow) obj3;
                SharedAlertDetailsFlowContract$InputData sharedAlertDetailsFlowContract$InputData = (SharedAlertDetailsFlowContract$InputData) obj2;
                phm.a aVar17 = (phm.a) e.j(sharedAlertDetailsFlow.m2()).a().get(ned.e.class);
                aVar = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar != null) {
                    return new ned.d(((ned.e) aVar.b()).i, sharedAlertDetailsFlow, sharedAlertDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(d.q("Api ", ned.e.class, " is not found"));
        }
    }
}
