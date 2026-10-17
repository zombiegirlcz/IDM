package ywi;

import android.content.Context;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.NextFrameEndCallbackQueue;
import androidx.compose.runtime.Recomposer;
import com.google.android.gms.wallet.Wallet;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.GooglePayConfirmationFlow;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.GooglePayConfirmationFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.home.MultibancoHomeFlow;
import com.revolut.feature.apm.multibanco.impl.ui.home.MultibancoHomeFlowContract$InputData;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlow;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlowContract$InputData;
import com.revolut.feature.card_management.impl.ui.change_pin.activation.ChangePinActivationScreen;
import com.revolut.feature.card_management.impl.ui.change_pin.activation.ChangePinActivationScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownControllerContract$InputData;
import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlow;
import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlow;
import com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlowContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.FormFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.FormFlowContract$InputData;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlow;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlowContract$InputData;
import com.revolut.feature.retail.crypto.advanced_charts.impl.ui.currencies_selector.CryptoCurrenciesSelectorScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreenContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.order_summary.OrderSummaryScreen;
import com.revolut.feature.revolutpay.shared.ui.order_summary.OrderSummaryScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10Screen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10ScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.account.flow.AccountsStatementFlow;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreen;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.TravelHotelsCardSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.TravelHotelsCardSelectionScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector.ComplexAnalyticsSectorAllocationController;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector.ComplexAnalyticsSectorAllocationControllerContract$InputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreenContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import cwi.v0;
import cwi.w0;
import ewg.h;
import ewg.p;
import eyd.b0;
import g9g.u0;
import i72.m;
import i72.s;
import kl.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import mkh.u;
import p7c.i;
import qbj.q;
import qbj.r;
import qve.x;
import r7d.t;
import ta9.a0;
import tz2.j;
import tz2.k;
import vkm.j2;
import z0g.o;
import zbj.g0;
import zxb.y;
import zxb.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f317443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f317444c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f317442a = i;
        this.f317443b = obj2;
        this.f317444c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v152, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        switch (this.f317442a) {
            case 0:
                AirportLoungesAmenitiesScreen airportLoungesAmenitiesScreen = (AirportLoungesAmenitiesScreen) this.f317443b;
                AirportLoungesAmenitiesScreenContract$InputData airportLoungesAmenitiesScreenContract$InputData = (AirportLoungesAmenitiesScreenContract$InputData) this.f317444c;
                KProperty[] kPropertyArr = AirportLoungesAmenitiesScreen.f99041b0;
                qji.b bVarQ2 = airportLoungesAmenitiesScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.di.AirportLoungeAmenitiesScreenInjector");
                v0 v0Var = (v0) ((zwi.a) bVarQ2).s().S(airportLoungesAmenitiesScreen);
                switch (v0Var.f109779a) {
                    case 0:
                        v0Var.d = airportLoungesAmenitiesScreenContract$InputData;
                        break;
                    default:
                        v0Var.d = airportLoungesAmenitiesScreenContract$InputData;
                        break;
                }
                return (w0) v0Var.mo3800build();
            case 1:
                ComplexAnalyticsSectorAllocationController complexAnalyticsSectorAllocationController = (ComplexAnalyticsSectorAllocationController) this.f317443b;
                ComplexAnalyticsSectorAllocationControllerContract$InputData complexAnalyticsSectorAllocationControllerContract$InputData = (ComplexAnalyticsSectorAllocationControllerContract$InputData) this.f317444c;
                KProperty[] kPropertyArr2 = ComplexAnalyticsSectorAllocationController.Q;
                phm.a aVar2 = (phm.a) ue0.e.j(complexAnalyticsSectorAllocationController.m2()).a().get(p.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                }
                h hVar = ((h) ((p) aVar.b())).f130214x;
                complexAnalyticsSectorAllocationControllerContract$InputData.getClass();
                gwg.a aVar3 = complexAnalyticsSectorAllocationControllerContract$InputData.f95039c;
                aVar3.getClass();
                return new ewg.c(hVar, complexAnalyticsSectorAllocationControllerContract$InputData, aVar3);
            case 2:
                AccountsStatementFlow accountsStatementFlow = (AccountsStatementFlow) this.f317443b;
                wyd.p pVar = (wyd.p) this.f317444c;
                phm.a aVar4 = (phm.a) ue0.e.j(accountsStatementFlow.m2()).a().get(b0.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new eyd.e(((b0) aVar.b()).o, pVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
            case 3:
                ChangePinActivationScreen changePinActivationScreen = (ChangePinActivationScreen) this.f317443b;
                ChangePinActivationScreenContract$InputData changePinActivationScreenContract$InputData = (ChangePinActivationScreenContract$InputData) this.f317444c;
                KProperty[] kPropertyArr3 = ChangePinActivationScreen.Z;
                qji.b bVarQ22 = changePinActivationScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.change_pin.activation.di.ChangePinActivationScreenInjector");
                k kVar = (k) bVarQ22;
                return new j(kVar.f275787b, kVar.f275788c, changePinActivationScreenContract$InputData);
            case 4:
                PeerToPeerChatFlow peerToPeerChatFlow = (PeerToPeerChatFlow) this.f317443b;
                PeerToPeerChatFlowContract$InputData peerToPeerChatFlowContract$InputData = (PeerToPeerChatFlowContract$InputData) this.f317444c;
                phm.a aVar5 = (phm.a) ue0.e.j(peerToPeerChatFlow.m2()).a().get(oz9.c.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new oz9.a(((oz9.c) aVar.b()).R, peerToPeerChatFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", oz9.c.class, " is not found"));
            case 5:
                yze.c cVar = (yze.c) this.f317443b;
                Context context = (Context) this.f317444c;
                ni0.k kVar2 = cVar.f318094a;
                Wallet.WalletOptions.Builder internal = new Wallet.WalletOptions.Builder();
                Intrinsics.checkNotNullParameter(internal, "<this>");
                Intrinsics.checkNotNullParameter(internal, "internal");
                internal.setEnvironment(1);
                Wallet.WalletOptions walletOptionsBuild = internal.build();
                Intrinsics.checkNotNullExpressionValue(walletOptionsBuild, "build(...)");
                Intrinsics.checkNotNullParameter(walletOptionsBuild, "<this>");
                return kVar2.a(context, new ni0.c(walletOptionsBuild));
            case 6:
                RevPointsTrophyRoomHighlightsSharingScreen revPointsTrophyRoomHighlightsSharingScreen = (RevPointsTrophyRoomHighlightsSharingScreen) this.f317443b;
                RevPointsTrophyRoomHighlightsSharingScreenContract$InputData revPointsTrophyRoomHighlightsSharingScreenContract$InputData = (RevPointsTrophyRoomHighlightsSharingScreenContract$InputData) this.f317444c;
                KProperty[] kPropertyArr4 = RevPointsTrophyRoomHighlightsSharingScreen.R;
                qji.b bVarU2 = revPointsTrophyRoomHighlightsSharingScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.di.RevPointsTrophyRoomHighlightsSharingScreenInjector");
                y yVar = (y) bVarU2;
                return new z(yVar.f326311a, yVar.f326312b, revPointsTrophyRoomHighlightsSharingScreenContract$InputData);
            case 7:
                TopupMethodsScreen topupMethodsScreen = (TopupMethodsScreen) this.f317443b;
                TopupMethodsScreenContract$InputData topupMethodsScreenContract$InputData = (TopupMethodsScreenContract$InputData) this.f317444c;
                KProperty[] kPropertyArr5 = TopupMethodsScreen.U;
                qji.b bVarU22 = topupMethodsScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.screens.topup_methods.di.TopupMethodsScreenInjector");
                x xVar = (x) bVarU22;
                return new qve.y(xVar.f249683b, xVar.f249684c, topupMethodsScreen, topupMethodsScreenContract$InputData);
            case 8:
                return ComposerImpl.insertMovableContentGuarded$lambda$0$0$1$0$0$0$0((ComposerImpl) this.f317443b, (MovableContentStateReference) this.f317444c);
            case 9:
                return NextFrameEndCallbackQueue.onNewAwaiters$lambda$0((NextFrameEndCallbackQueue) this.f317443b, (Function0) this.f317444c);
            case 10:
                return Recomposer.performRecompose$lambda$0$0((MutableScatterSet) this.f317443b, (ControlledComposition) this.f317444c);
            case 11:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f317443b;
                z10.e eVar = (z10.e) this.f317444c;
                Job job2 = (Job) ref$ObjectRef.f186409a;
                if (job2 != null) {
                    job2.f(null);
                }
                kmm.h hVar2 = eVar.d;
                if (hVar2 != null) {
                    hVar2.b(1000, "REASON_FINISH");
                }
                eVar.d = null;
                if (!(eVar.f318714h.getValue() instanceof r20.c) && !(eVar.f318714h.getValue() instanceof r20.e)) {
                    j2 j2Var = eVar.f318714h;
                    r20.c cVar2 = new r20.c(1000, "Flow cancelled / No subscribers");
                    j2Var.getClass();
                    j2Var.g(null, cVar2);
                }
                return Unit.f186387a;
            case 12:
                TravelExperiencesPriceBreakdownScreen travelExperiencesPriceBreakdownScreen = (TravelExperiencesPriceBreakdownScreen) this.f317443b;
                TravelExperiencesPriceBreakdownScreenContract$InputData travelExperiencesPriceBreakdownScreenContract$InputData = (TravelExperiencesPriceBreakdownScreenContract$InputData) this.f317444c;
                KProperty[] kPropertyArr6 = TravelExperiencesPriceBreakdownScreen.S;
                qji.b bVarU23 = travelExperiencesPriceBreakdownScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.di.TravelExperiencesPriceBreakdownScreenInjector");
                z0g.f fVar = (z0g.f) bVarU23;
                return new o(fVar.f318359b, fVar.f318360c, travelExperiencesPriceBreakdownScreenContract$InputData);
            case 13:
                LoanAccountDetailsScreen loanAccountDetailsScreen = (LoanAccountDetailsScreen) this.f317443b;
                LoanAccountDetailsScreenContract$InputData loanAccountDetailsScreenContract$InputData = (LoanAccountDetailsScreenContract$InputData) this.f317444c;
                KProperty[] kPropertyArr7 = LoanAccountDetailsScreen.Y;
                phm.a aVar6 = (phm.a) ue0.e.j(loanAccountDetailsScreen.m2()).a().get(u45.h.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new u45.g(((u45.h) aVar.b()).B, loanAccountDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 14:
                MultibancoHomeFlow multibancoHomeFlow = (MultibancoHomeFlow) this.f317443b;
                MultibancoHomeFlowContract$InputData multibancoHomeFlowContract$InputData = (MultibancoHomeFlowContract$InputData) this.f317444c;
                phm.a aVar7 = (phm.a) ue0.e.j(multibancoHomeFlow.m2()).a().get(m.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new s(((m) aVar.b()).A, multibancoHomeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
            case 15:
                LoanRepaymentBreakdownController loanRepaymentBreakdownController = (LoanRepaymentBreakdownController) this.f317443b;
                LoanRepaymentBreakdownControllerContract$InputData loanRepaymentBreakdownControllerContract$InputData = (LoanRepaymentBreakdownControllerContract$InputData) this.f317444c;
                LoanRepaymentBreakdownController.a aVar8 = LoanRepaymentBreakdownController.Companion;
                return new u45.b0(czi.c.o(loanRepaymentBreakdownController.m2()).B, loanRepaymentBreakdownController, loanRepaymentBreakdownControllerContract$InputData);
            case 16:
                CryptoCurrenciesSelectorScreen cryptoCurrenciesSelectorScreen = (CryptoCurrenciesSelectorScreen) this.f317443b;
                z8b.h hVar3 = (z8b.h) this.f317444c;
                KProperty[] kPropertyArr8 = CryptoCurrenciesSelectorScreen.T;
                phm.a aVar9 = (phm.a) ue0.e.j(cryptoCurrenciesSelectorScreen.m2()).a().get(u8b.a.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new u8b.b(((u8b.a) aVar.b()).f, hVar3);
                }
                throw new IllegalStateException(a0.d.q("Api ", u8b.a.class, " is not found"));
            case 17:
                AllCardsScreen allCardsScreen = (AllCardsScreen) this.f317443b;
                AllCardsScreenContract$InputData allCardsScreenContract$InputData = (AllCardsScreenContract$InputData) this.f317444c;
                KProperty[] kPropertyArr9 = AllCardsScreen.f86307d0;
                qji.b bVarQ23 = allCardsScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.di.AllCardsScreenInjector");
                t tVar = (t) ((v7d.a) bVarQ23);
                return new r7d.a(tVar.f252174b, tVar.f252175c, allCardsScreenContract$InputData);
            case 18:
                PeerToPeerAmountScreen peerToPeerAmountScreen = (PeerToPeerAmountScreen) this.f317443b;
                PeerToPeerAmountScreenContract$InputData peerToPeerAmountScreenContract$InputData = (PeerToPeerAmountScreenContract$InputData) this.f317444c;
                PeerToPeerAmountScreen.a aVar10 = PeerToPeerAmountScreen.Companion;
                qji.b bVarQ24 = peerToPeerAmountScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.di.PeerToPeerAmountScreenInjector");
                v8k.g gVar = (v8k.g) bVarQ24;
                v8k.c cVar3 = gVar.f286853b;
                v8k.g gVar2 = gVar.f286854c;
                peerToPeerAmountScreenContract$InputData.getClass();
                ReactionsKeyboardView transferScreenReactionsKeyboard = peerToPeerAmountScreen.i3().f;
                Intrinsics.checkNotNullExpressionValue(transferScreenReactionsKeyboard, "transferScreenReactionsKeyboard");
                return new v8k.d(cVar3, gVar2, new o9i.a(), new o9i.b(), new o9i.c(), peerToPeerAmountScreen, peerToPeerAmountScreenContract$InputData, transferScreenReactionsKeyboard);
            case 19:
                WaitingVerificationFlow waitingVerificationFlow = (WaitingVerificationFlow) this.f317443b;
                WaitingVerificationFlowContract$InputData waitingVerificationFlowContract$InputData = (WaitingVerificationFlowContract$InputData) this.f317444c;
                qji.b bVarU24 = waitingVerificationFlow.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.waiting_verification.di.WaitingVerificationFlowComponent.WaitingVerificationFlowInjector");
                ta9.o oVar = (ta9.o) bVarU24;
                return new a0(oVar.f269260b, oVar.f269261c, waitingVerificationFlowContract$InputData);
            case 20:
                TravelHotelsCardSelectionScreen travelHotelsCardSelectionScreen = (TravelHotelsCardSelectionScreen) this.f317443b;
                TravelHotelsCardSelectionScreenContract$InputData travelHotelsCardSelectionScreenContract$InputData = (TravelHotelsCardSelectionScreenContract$InputData) this.f317444c;
                int i = TravelHotelsCardSelectionScreen.T;
                qji.b bVarU25 = travelHotelsCardSelectionScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.di.TravelHotelsCardSelectionScreenInjector");
                u0 u0Var = (u0) ((acg.a) bVarU25).B().mo3808a(travelHotelsCardSelectionScreen);
                switch (u0Var.f141827a) {
                    case 0:
                        u0Var.d = travelHotelsCardSelectionScreenContract$InputData;
                        break;
                    case 1:
                        u0Var.d = travelHotelsCardSelectionScreenContract$InputData;
                        break;
                    default:
                        u0Var.d = travelHotelsCardSelectionScreenContract$InputData;
                        break;
                }
                return (g9g.v0) u0Var.mo3783build();
            case 21:
                CryptoDepositsOverviewController cryptoDepositsOverviewController = (CryptoDepositsOverviewController) this.f317443b;
                g0 g0Var = (g0) this.f317444c;
                KProperty[] kPropertyArr10 = CryptoDepositsOverviewController.S;
                qji.b bVarU26 = cryptoDepositsOverviewController.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.retail.feature.crypto_deposits.impl.ui.overview.di.CryptoDepositsOverviewInjector");
                qbj.s sVar = (qbj.s) bVarU26;
                q qVar = sVar.f244355b;
                qbj.s sVar2 = sVar.f244356c;
                CryptoDepositsOverviewControllerContract$InputData cryptoDepositsOverviewControllerContract$InputData = cryptoDepositsOverviewController.L;
                cryptoDepositsOverviewControllerContract$InputData.getClass();
                return new r(qVar, sVar2, cryptoDepositsOverviewController, new bcj.g((CircleActionButtonsBarDelegate) g0Var.f320911h.getValue()), cryptoDepositsOverviewControllerContract$InputData);
            case 22:
                SpinTransferFlow spinTransferFlow = (SpinTransferFlow) this.f317443b;
                SpinTransferFlowContract$InputData spinTransferFlowContract$InputData = (SpinTransferFlowContract$InputData) this.f317444c;
                phm.a aVar11 = (phm.a) ue0.e.j(spinTransferFlow.m2()).a().get(qd2.f.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new qd2.j(((qd2.f) aVar.b()).k, spinTransferFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", qd2.f.class, " is not found"));
            case 23:
                OrderSummaryScreen orderSummaryScreen = (OrderSummaryScreen) this.f317443b;
                OrderSummaryScreenContract$InputData orderSummaryScreenContract$InputData = (OrderSummaryScreenContract$InputData) this.f317444c;
                KProperty[] kPropertyArr11 = OrderSummaryScreen.P;
                qji.b bVarU27 = orderSummaryScreen.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.order_summary.di.OrderSummaryScreenInjector");
                p7c.x xVar2 = (p7c.x) bVarU27;
                return new i(xVar2.f233742b, xVar2.f233743c, orderSummaryScreenContract$InputData);
            case 24:
                FormFlow formFlow = (FormFlow) this.f317443b;
                FormFlowContract$InputData formFlowContract$InputData = (FormFlowContract$InputData) this.f317444c;
                phm.a aVar12 = (phm.a) ue0.e.j(formFlow.m2()).a().get(lf9.m.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new lf9.h(((lf9.m) aVar.b()).u, formFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", lf9.m.class, " is not found"));
            case 25:
                zfc.d dVar = (zfc.d) this.f317443b;
                w4l.k loadingStrategy = (w4l.k) this.f317444c;
                vfc.f fVar2 = dVar.f321923b;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(fVar2.f.b(Unit.f186387a, loadingStrategy), new zc0.z(24));
            case 26:
                AddAssetRev10Screen addAssetRev10Screen = (AddAssetRev10Screen) this.f317443b;
                AddAssetRev10ScreenContract$InputData addAssetRev10ScreenContract$InputData = (AddAssetRev10ScreenContract$InputData) this.f317444c;
                AddAssetRev10Screen.Companion aVar13 = AddAssetRev10Screen.INSTANCE;
                qji.b bVarQ25 = addAssetRev10Screen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.di.AddAssetRev10ScreenComponent.Injector");
                fhd.c cVar4 = (fhd.c) bVarQ25;
                return new fhd.a(cVar4.f135209b, cVar4.f135210c, addAssetRev10ScreenContract$InputData);
            case 27:
                GooglePayConfirmationFlow googlePayConfirmationFlow = (GooglePayConfirmationFlow) this.f317443b;
                GooglePayConfirmationFlowContract$InputData googlePayConfirmationFlowContract$InputData = (GooglePayConfirmationFlowContract$InputData) this.f317444c;
                phm.a aVar14 = (phm.a) ue0.e.j(googlePayConfirmationFlow.m2()).a().get(og1.i.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new og1.e(((og1.i) aVar.b()).f, googlePayConfirmationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", og1.i.class, " is not found"));
            case 28:
                IdentificationFlow identificationFlow = (IdentificationFlow) this.f317443b;
                IdentificationFlowContract$InputData identificationFlowContract$InputData = (IdentificationFlowContract$InputData) this.f317444c;
                phm.a aVar15 = (phm.a) ue0.e.j(identificationFlow.m2()).a().get(sg8.c.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new sg8.b(((sg8.c) aVar.b()).o, identificationFlow, identificationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", sg8.c.class, " is not found"));
            default:
                CashBalanceController cashBalanceController = (CashBalanceController) this.f317443b;
                CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData = (CashBalanceControllerContract$InputData) this.f317444c;
                KProperty[] kPropertyArr12 = CashBalanceController.j0;
                phm.a aVar16 = (phm.a) ue0.e.j(cashBalanceController.m2()).a().get(vhh.a.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                }
                d2 d2Var = new d2(((mkh.s) ((u) aVar.b())).l0);
                d2Var.f185163b = cashBalanceController;
                String str = cashBalanceControllerContract$InputData.f95952b;
                d2Var.f185164c = cashBalanceControllerContract$InputData;
                zjh.d dVar2 = cashBalanceController.X;
                dVar2.getClass();
                d2Var.d = dVar2;
                zjh.e eVar2 = cashBalanceController.Y;
                eVar2.getClass();
                d2Var.e = eVar2;
                avk.h hVar4 = cashBalanceController.Z;
                hVar4.getClass();
                d2Var.f = hVar4;
                zjh.f fVar3 = cashBalanceController.f95946a0;
                fVar3.getClass();
                d2Var.i = fVar3;
                zjh.c cVar5 = cashBalanceController.f95947b0;
                cVar5.getClass();
                d2Var.f185167j = cVar5;
                zjh.i iVar = cashBalanceController.f95948d0;
                iVar.getClass();
                d2Var.k = iVar;
                zjh.j jVar = cashBalanceController.c0;
                jVar.getClass();
                d2Var.f185170n = jVar;
                r3b.c cVar6 = cashBalanceController.f95949e0;
                cVar6.getClass();
                d2Var.f185168l = cVar6;
                d2Var.f185165g = new zgh.d(cashBalanceControllerContract$InputData.f95951a, str);
                d2Var.f185166h = new y5h.d(str);
                d2Var.f185169m = new u5h.d(str);
                d2Var.o = new w5h.d(str);
                d2Var.f185171p = cashBalanceController;
                return (mkh.a) d2Var.mo3783build();
        }
    }
}
