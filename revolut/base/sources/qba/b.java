package qba;

import com.revolut.feature.apm.bizum.api.navigation.BizumFlowInputData;
import com.revolut.feature.apm.bizum.impl.ui.BizumFlow;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsScreen;
import com.revolut.feature.cash_topup.impl.ui.select_store.CashTopUpSelectStoreScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsController;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreen;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreenContract$InputData;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.CurrencyChooserFlow;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentContract$InputData;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentController;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.PlanComparisonFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.PlanComparisonFlowContract$InputData;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreen;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreenContract$InputData;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreen;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreenContract$InputData;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.transfer.screen.new_contact.PixNewContactScreen;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsController;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsControllerContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics_details.RiskMetricsDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics_details.RiskMetricsDetailsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlow;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlowContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reason.summary.ReasonForTransferSummaryScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.summary.ReasonForTransferSummaryScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.text.TextQuestionScreen;
import com.revolut.feature_rev_points_pocket_impl.ui.add_money.RevPointsAddMoneyFlow;
import com.revolut.feature_rev_points_pocket_impl.ui.add_money.RevPointsAddMoneyFlowContract$InputData;
import cu1.p;
import dmc.r;
import dw3.b2;
import dw3.c1;
import java.util.concurrent.CopyOnWriteArrayList;
import jm4.a3;
import jm4.d3;
import jm4.t2;
import jm4.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.internal.EnumDescriptor;
import mb3.u;
import mb3.v;
import p8a.d0;
import p8a.g0;
import p8a.j0;
import p8a.k0;
import p8a.u0;
import ppd.c0;
import qc0.y0;
import qh2.o;
import ql7.g1;
import ql7.s;
import qlm.b0;
import skm.e0;
import ufg.i0;
import ufg.x;
import ufg.y;
import vkm.q;
import vkm.z1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f244148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f244149c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f244147a = i;
        this.f244148b = obj2;
        this.f244149c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r4v64 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        jef.e eVar;
        b60.a aVar;
        int i = this.f244147a;
        Object obj2 = this.f244149c;
        Object obj3 = this.f244148b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = PixQrCodeTransactionAmountScreen.W;
                qji.b bVarU2 = ((PixQrCodeTransactionAmountScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.di.PixQrCodeTransactionAmountScreenInjector");
                k0 k0Var = (k0) bVarU2;
                return new j0(k0Var.f234005b, k0Var.f234006c, (PixQrCodeTransactionAmountScreenContract$InputData) obj2);
            case 1:
                ((y0) obj3).Q((qc0.l) obj2);
                return Unit.f186387a;
            case 2:
                qc3.f fVar = (qc3.f) obj2;
                KProperty[] kPropertyArr2 = CashTopUpSelectStoreScreen.R;
                qji.b bVarU22 = ((CashTopUpSelectStoreScreen) obj3).U2();
                if (bVarU22 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.select_store.di.CashTopUpSelectStoreScreenInjector");
                }
                u uVar = (u) bVarU22;
                return new v(uVar.f204106b, uVar.f204107c, fVar);
            case 3:
                DeclineInvitationPopupScreen declineInvitationPopupScreen = (DeclineInvitationPopupScreen) obj3;
                DeclineInvitationPopupScreenContract$InputData declineInvitationPopupScreenContract$InputData = (DeclineInvitationPopupScreenContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(declineInvitationPopupScreen.m2()).a().get(dw3.e.class);
                 = aVar2 != null ? (b60.a) aVar2.get() : 0;
                if ( != 0) {
                    return new b2(((c1) ((dw3.e) b())).m0, declineInvitationPopupScreen, declineInvitationPopupScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
            case 4:
                PixNewContactScreen pixNewContactScreen = (PixNewContactScreen) obj3;
                PixTransferNavigation$InputData.NewContact newContact = (PixTransferNavigation$InputData.NewContact) obj2;
                KProperty[] kPropertyArr3 = PixNewContactScreen.R;
                qji.b bVarU23 = pixNewContactScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.transfer.screen.new_contact.di.PixNewContactScreenInjector");
                u0 u0Var = (u0) bVarU23;
                d0 d0Var = u0Var.f234097b;
                u0 u0Var2 = u0Var.f234098c;
                newContact.getClass();
                return new g0(d0Var, u0Var2, pixNewContactScreen, newContact);
            case 5:
                RevolutPayPromotedMerchantsController revolutPayPromotedMerchantsController = (RevolutPayPromotedMerchantsController) obj3;
                RevolutPayPromotedMerchantsControllerContract$InputData revolutPayPromotedMerchantsControllerContract$InputData = (RevolutPayPromotedMerchantsControllerContract$InputData) obj2;
                KProperty[] kPropertyArr4 = RevolutPayPromotedMerchantsController.T;
                phm.a aVar3 = (phm.a) ue0.e.j(revolutPayPromotedMerchantsController.m2()).a().get(jcc.e.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return new jcc.f(((jcc.e) aVar4.b()).f172773j, revolutPayPromotedMerchantsController, revolutPayPromotedMerchantsControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", jcc.e.class, " is not found"));
            case 6:
                RevPointsAddMoneyFlowContract$InputData revPointsAddMoneyFlowContract$InputData = (RevPointsAddMoneyFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((RevPointsAddMoneyFlow) obj3).m2()).a().get(jdi.c.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 != null) {
                    return new jdi.b(((jdi.c) aVar6.b()).i, revPointsAddMoneyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", jdi.c.class, " is not found"));
            case 7:
                SharedAddAlertFlowContract$InputData sharedAddAlertFlowContract$InputData = (SharedAddAlertFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((SharedAddAlertFlow) obj3).m2()).a().get(ned.e.class);
                b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar8 != null) {
                    return new ned.c(((ned.e) aVar8.b()).i, sharedAddAlertFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ned.e.class, " is not found"));
            case 8:
                TransactionRecogniserFlow transactionRecogniserFlow = (TransactionRecogniserFlow) obj3;
                TransactionRecogniserFlowContract$InputData transactionRecogniserFlowContract$InputData = (TransactionRecogniserFlowContract$InputData) obj2;
                try {
                    phm.a aVar9 = (phm.a) ue0.e.j(transactionRecogniserFlow.m2()).a().get(fef.a.class);
                    aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                } catch (Exception unused) {
                    Object objC = jef.i.Companion.c();
                    Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.feature.transaction.recogniser.impl.ui.flow.di.TransactionRecogniserFlowInjector");
                    eVar = (jef.e) objC;
                }
                if (aVar != null) {
                    eVar = (jef.e) aVar.b();
                    return new jef.g(eVar.f, transactionRecogniserFlow, transactionRecogniserFlowContract$InputData);
                }
                throw new IllegalStateException("Api " + fef.a.class + " is not found");
            case 9:
                qej.e eVar2 = (qej.e) obj3;
                rej.c cVar = (rej.c) obj2;
                eVar2.getClass();
                try {
                    eVar2.f245188a.unregisterReceiver(cVar);
                    break;
                } catch (Throwable th10) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimInstallationRepositoryImpl", null, th10, h0Var);
                }
                return Unit.f186387a;
            case 10:
                TravelMilesAccountRegistrationScreen travelMilesAccountRegistrationScreen = (TravelMilesAccountRegistrationScreen) obj3;
                TravelMilesAccountRegistrationScreenContract$InputData travelMilesAccountRegistrationScreenContract$InputData = (TravelMilesAccountRegistrationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = TravelMilesAccountRegistrationScreen.c0;
                qji.b bVarQ2 = travelMilesAccountRegistrationScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.account_registration.di.TravelMilesSignUpScreenInjector");
                x xVar = (x) ((rgg.a) bVarQ2).b().S(travelMilesAccountRegistrationScreen);
                switch (xVar.f279802a) {
                    case 0:
                        xVar.d = travelMilesAccountRegistrationScreenContract$InputData;
                        break;
                    default:
                        xVar.d = travelMilesAccountRegistrationScreenContract$InputData;
                        break;
                }
                return (y) xVar.mo3800build();
            case 11:
                z1 z1VarB = q.b(0, 6, null);
                e0.C((CoroutineScope) obj3, null, null, new qh2.l((o) obj2, , 1), 3);
                return z1VarB;
            case 12:
                TravelMilesTransferBreakdownScreen travelMilesTransferBreakdownScreen = (TravelMilesTransferBreakdownScreen) obj3;
                TravelMilesTransferBreakdownScreenContract$InputData travelMilesTransferBreakdownScreenContract$InputData = (TravelMilesTransferBreakdownScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = TravelMilesTransferBreakdownScreen.T;
                qji.b bVarU24 = travelMilesTransferBreakdownScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.di.TravelMilesTransferBreakdownScreenInjector");
                ufg.h0 h0Var2 = (ufg.h0) ((rig.a) bVarU24).q().mo3808a(travelMilesTransferBreakdownScreen);
                switch (h0Var2.f279738a) {
                    case 0:
                        h0Var2.d = travelMilesTransferBreakdownScreenContract$InputData;
                        break;
                    default:
                        h0Var2.d = travelMilesTransferBreakdownScreenContract$InputData;
                        break;
                }
                return (i0) h0Var2.mo3783build();
            case 13:
                CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData = (CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(((CurrencyChooserFlow) obj3).m2()).a().get(ak5.j.class);
                b60.a aVar11 = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar11 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ak5.j.class, " is not found"));
                }
                ak5.j jVar = ((ak5.j) aVar11.b()).f5711n;
                inputData.getClass();
                return new ak5.l(jVar, inputData);
            case 14:
                b0 b0Var = (b0) obj3;
                String str = (String) obj2;
                EnumDescriptor enumDescriptor = b0Var.f247615b;
                if (enumDescriptor == null) {
                    Enum[] enumArr = b0Var.f247614a;
                    enumDescriptor = new EnumDescriptor(str, enumArr.length);
                    for (Enum r06 : enumArr) {
                        enumDescriptor.j(r06.name(), false);
                    }
                }
                return enumDescriptor;
            case 15:
                ClaimsFlow claimsFlow = (ClaimsFlow) obj3;
                ClaimsFlowContract$InputData claimsFlowContract$InputData = (ClaimsFlowContract$InputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(claimsFlow.m2()).a().get(fl7.a.class);
                b60.a aVar13 = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar13 != null) {
                    return new s(((ql7.k0) aVar13.b()).f247359n, claimsFlow, claimsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
            case 16:
                ((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.b) obj3).G2(new qm7.b(new Survey.Claims((Answer.ClaimsState) obj2, f0.f322471a)));
                return Unit.f186387a;
            case 17:
                JuniorRewardDetailsDialogScreen juniorRewardDetailsDialogScreen = (JuniorRewardDetailsDialogScreen) obj3;
                JuniorRewardDetailsDialogScreenContract$InputData juniorRewardDetailsDialogScreenContract$InputData = (JuniorRewardDetailsDialogScreenContract$InputData) obj2;
                int i2 = JuniorRewardDetailsDialogScreen.U;
                phm.a aVar14 = (phm.a) ue0.e.j(juniorRewardDetailsDialogScreen.m2()).a().get(nm8.e.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new nm8.c(((nm8.e) aVar15.b()).f, juniorRewardDetailsDialogScreen, juniorRewardDetailsDialogScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nm8.e.class, " is not found"));
            case 18:
                KProperty[] kPropertyArr7 = PayInStoreScreen.f79044d0;
                qji.b bVarQ22 = ((PayInStoreScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.payinstore.impl.ui.screen.di.PayInStoreScreenInjector");
                kn9.b bVar = (kn9.b) bVarQ22;
                return new kn9.c(bVar.f186042b, bVar.f186043c, (PayInStoreScreenContract$InputData) obj2);
            case 19:
                RiskMetricsDetailsScreenContract$InputData riskMetricsDetailsScreenContract$InputData = (RiskMetricsDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = RiskMetricsDetailsScreen.X;
                phm.a aVar16 = (phm.a) ue0.e.j(((RiskMetricsDetailsScreen) obj3).m2()).a().get(r.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                }
                r rVar = ((r) aVar17.b()).f116039s;
                riskMetricsDetailsScreenContract$InputData.getClass();
                return new dmc.n(rVar, riskMetricsDetailsScreenContract$InputData);
            case 20:
                FeedbackCommentContract$InputData feedbackCommentContract$InputData = (FeedbackCommentContract$InputData) obj2;
                int i3 = FeedbackCommentController.V;
                phm.a aVar18 = (phm.a) ue0.e.j(((FeedbackCommentController) obj3).m2()).a().get(gp6.e.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new gp6.c(((gp6.e) aVar19.b()).d, feedbackCommentContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", gp6.e.class, " is not found"));
            case 21:
                ReservationScreen reservationScreen = (ReservationScreen) obj3;
                KProperty[] kPropertyArr9 = ReservationScreen.g0;
                qji.b bVarQ23 = reservationScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.di.ReservationScreenInjector");
                ql7.n nVar = (ql7.n) bVarQ23;
                return new g1(nVar.f247399b, nVar.f247400c, reservationScreen, (ReservationScreenContract$InputData) obj2);
            case 22:
                GroupDetailsScreenContract$InputData groupDetailsScreenContract$InputData = (GroupDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = GroupDetailsScreen.S;
                phm.a aVar20 = (phm.a) ue0.e.j(((GroupDetailsScreen) obj3).m2()).a().get(ppd.n.class);
                b60.a aVar21 = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar21 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                }
                ppd.n nVar2 = ((ppd.n) aVar21.b()).L0;
                groupDetailsScreenContract$InputData.getClass();
                return new c0(nVar2, groupDetailsScreenContract$InputData);
            case 23:
                CreditCardsScreenContract$InputData creditCardsScreenContract$InputData = (CreditCardsScreenContract$InputData) obj2;
                int i5 = CreditCardsController.W;
                phm.a aVar22 = (phm.a) ue0.e.j(((CreditCardsController) obj3).m2()).a().get(a3.class);
                b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar23 != null) {
                    return new d3(((a3) aVar23.b()).Y, creditCardsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 24:
                KProperty[] kPropertyArr11 = ReasonForTransferSummaryScreen.f92212b0;
                qji.b bVarQ24 = ((ReasonForTransferSummaryScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.transfer.core.impl.ui.reason.summary.di.ReasonForTransferSummaryScreenInjector");
                lpf.c cVar2 = (lpf.c) bVarQ24;
                return new lpf.e(cVar2.f199013b, cVar2.f199014c, (ReasonForTransferSummaryScreenContract$InputData) obj2);
            case 25:
                BizumFlowInputData bizumFlowInputData = (BizumFlowInputData) obj2;
                phm.a aVar24 = (phm.a) ue0.e.j(((BizumFlow) obj3).m2()).a().get(ms1.j.class);
                b60.a aVar25 = aVar24 != null ? (b60.a) aVar24.get() : null;
                if (aVar25 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                }
                ms1.j jVar2 = ((ms1.j) aVar25.b()).B;
                bizumFlowInputData.getClass();
                return new ms1.l(jVar2, bizumFlowInputData);
            case 26:
                BlikSettingsContract$InputData blikSettingsContract$InputData = (BlikSettingsContract$InputData) obj2;
                KProperty[] kPropertyArr12 = BlikSettingsScreen.S;
                phm.a aVar26 = (phm.a) ue0.e.j(((BlikSettingsScreen) obj3).m2()).a().get(cu1.k.class);
                b60.a aVar27 = aVar26 != null ? (b60.a) aVar26.get() : null;
                if (aVar27 != null) {
                    return new p(((cu1.k) aVar27.b()).f108754t, blikSettingsContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", cu1.k.class, " is not found"));
            case 27:
                PlanComparisonFlowContract$InputData planComparisonFlowContract$InputData = (PlanComparisonFlowContract$InputData) obj2;
                phm.a aVar28 = (phm.a) ue0.e.j(((PlanComparisonFlow) obj3).m2()).a().get(lu7.s.class);
                b60.a aVar29 = aVar28 != null ? (b60.a) aVar28.get() : null;
                if (aVar29 != null) {
                    return new lu7.u(((lu7.s) aVar29.b()).o, planComparisonFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", lu7.s.class, " is not found"));
            case 28:
                int i6 = TextQuestionScreen.U;
                qji.b bVarU25 = ((TextQuestionScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.rfi.impl.ui.text.di.TextQuestionScreenInjector");
                euh.e eVar3 = (euh.e) bVarU25;
                return new euh.f(eVar3.f129583b, eVar3.f129584c, (BaseQuestionScreenContract$InputData) obj2);
            default:
                KProperty[] kPropertyArr13 = CreditCardStatementHubScreen.T;
                qji.b bVarU26 = ((CreditCardStatementHubScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement.hub.di.CreditCardStatementHubScreenInjector");
                t2 t2Var = (t2) bVarU26;
                return new u2(t2Var.f176366b, t2Var.f176367c, (CreditCardStatementHubScreenContract$InputData) obj2);
        }
    }
}
