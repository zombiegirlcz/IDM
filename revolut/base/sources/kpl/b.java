package kpl;

import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.State;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlow;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreen;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreenContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlow;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$InputData;
import com.revolut.feature.apm.qvik.impl.ui.QvikFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.card.verification.impl.screen.penny_topup_info.CardPennyTopUpInfoScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2Controller;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2ControllerContract$InputData;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.type_selection.DirectDepositTypeSelectionSheet;
import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.onboarding.impl.onboarding.passcode.flow.PasscodeFlow;
import com.revolut.feature.onboarding.impl.onboarding.passcode.flow.PasscodeFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.PaymentsGroupsBillsSplitFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.PaymentsGroupsBillsSplitFlowContract$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierController;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreen;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreenContract$InputData;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.subaccount.impl.ui.invite.screen.VaultInvitationConfirmationScreen;
import com.revolut.feature.subaccount.impl.ui.invite.screen.VaultInvitationConfirmationScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData;
import com.revolut.feature.transfer.core.impl.ui.reason.flow.ReasonForTransferFlow;
import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlow;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities.TravelHotelsPropertyAmenitiesScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities.TravelHotelsPropertyAmenitiesScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreenContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$InputData;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreenContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreenContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsFlow;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsFlowContract$InputData;
import cu1.o;
import fa0.k;
import g9g.x;
import g9g.z;
import h54.h;
import jm4.a3;
import jm4.y2;
import jm4.z0;
import jm4.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import kr9.j;
import kr9.l;
import kv2.g;
import kye.n;
import lpf.i;
import lpf.y;
import mjl.f;
import mjl.m;
import mjl.q;
import p7c.r;
import ta9.t;
import u45.c0;
import u45.x0;
import z0g.u;
import z0g.v;
import z52.p;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f188262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188263c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f188261a = i;
        this.f188262b = obj2;
        this.f188263c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f188261a;
        Object obj2 = this.f188263c;
        Object obj3 = this.f188262b;
        switch (i) {
            case 0:
                ConnectedClientDetailsFlow connectedClientDetailsFlow = (ConnectedClientDetailsFlow) obj3;
                ConnectedClientDetailsFlowContract$InputData connectedClientDetailsFlowContract$InputData = (ConnectedClientDetailsFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(connectedClientDetailsFlow.m2()).a().get(q.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new f(((m) ((q) aVar.b())).f206109t, connectedClientDetailsFlow, connectedClientDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
            case 1:
                ReasonForTransferInputData reasonForTransferInputData = (ReasonForTransferInputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((ReasonForTransferFlow) obj3).m2()).a().get(wof.a.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new lpf.c(((i) ((y) aVar.b())).o, reasonForTransferInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
            case 2:
                PaymentsGroupsBillsSplitFlowContract$InputData paymentsGroupsBillsSplitFlowContract$InputData = (PaymentsGroupsBillsSplitFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((PaymentsGroupsBillsSplitFlow) obj3).m2()).a().get(l.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new j(((l) aVar.b()).F, paymentsGroupsBillsSplitFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 3:
                KProperty[] kPropertyArr = BlikConfirmationScreen.f61666e0;
                qji.b bVarQ2 = ((BlikConfirmationScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.blik.impl.ui.confirmation.di.BlikConfirmationScreenInjector");
                o oVar = (o) ((mu1.a) bVarQ2);
                return new cu1.m(oVar.f108769b, oVar.f108770c, (BlikConfirmationScreenContract$InputData) obj2);
            case 4:
                KProperty[] kPropertyArr2 = CardPennyTopUpInfoScreen.P;
                qji.b bVarU2 = ((CardPennyTopUpInfoScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card.verification.impl.screen.penny_topup_info.di.CardPennyTopUpInfoScreenInjector");
                ev2.a aVar5 = (ev2.a) bVarU2;
                return new ev2.b(aVar5.f129681b, aVar5.f129682c, (g) obj2);
            case 5:
                CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData = (CreditCardStatementDetailsFlowContract$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((CreditCardStatementDetailsFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new z0(((a3) aVar.b()).Y, creditCardStatementDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 6:
                CreditCardTopupScreen creditCardTopupScreen = (CreditCardTopupScreen) obj3;
                KProperty[] kPropertyArr3 = CreditCardTopupScreen.X;
                qji.b bVarU22 = creditCardTopupScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.topup.di.CreditCardTopupScreenInjector");
                z1 z1Var = (z1) bVarU22;
                return new y2(z1Var.f176466b, z1Var.f176467c, creditCardTopupScreen, (CreditCardTopupScreenContract$InputData) obj2);
            case 7:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                h hVar = (h) obj2;
                if (!ref$BooleanRef.f186407a) {
                    ref$BooleanRef.f186407a = true;
                    hVar.invoke();
                }
                return Unit.f186387a;
            case 8:
                AmountNewScreen amountNewScreen = (AmountNewScreen) obj3;
                n nVar = (n) obj2;
                KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                qji.b bVarU23 = amountNewScreen.U2();
                if (bVarU23 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.topup.amount_new.di.AmountNewScreenInjector");
                }
                qve.n nVar2 = (qve.n) bVarU23;
                return new qve.b(nVar2.f249629b, nVar2.f249630c, amountNewScreen, nVar);
            case 9:
                return LazyLayoutPagerKt.rememberPagerItemProviderLambda$lambda$0$1((State) obj3, (PagerState) obj2);
            case 10:
                TravelExperiencesAdditionalInformationScreen travelExperiencesAdditionalInformationScreen = (TravelExperiencesAdditionalInformationScreen) obj3;
                TravelExperiencesAdditionalInformationScreenContract$InputData travelExperiencesAdditionalInformationScreenContract$InputData = (TravelExperiencesAdditionalInformationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = TravelExperiencesAdditionalInformationScreen.c0;
                qji.b bVarQ22 = travelExperiencesAdditionalInformationScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.di.TravelExperiencesAdditionalInformationScreenInjector");
                u uVar = (u) ((m1g.a) bVarQ22).b().S(travelExperiencesAdditionalInformationScreen);
                switch (uVar.f318457a) {
                    case 0:
                        uVar.d = travelExperiencesAdditionalInformationScreenContract$InputData;
                        break;
                    default:
                        uVar.d = travelExperiencesAdditionalInformationScreenContract$InputData;
                        break;
                }
                return (v) uVar.mo3800build();
            case 11:
                WealthNewsArticleReaderScreen wealthNewsArticleReaderScreen = (WealthNewsArticleReaderScreen) obj3;
                WealthNewsArticleReaderScreenContract$InputData wealthNewsArticleReaderScreenContract$InputData = (WealthNewsArticleReaderScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = WealthNewsArticleReaderScreen.f0;
                qji.b bVarQ23 = wealthNewsArticleReaderScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.di.WealthNewsArticleReaderScreenComponentInjector");
                l0k.h hVar2 = (l0k.h) bVarQ23;
                l0k.c cVar = hVar2.f191295c;
                l0k.h hVar3 = hVar2.d;
                ScreenContentRecyclerView recyclerView = wealthNewsArticleReaderScreen.h3().f174540c;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                return new l0k.g(cVar, hVar3, new o0h.b(), wealthNewsArticleReaderScreen, wealthNewsArticleReaderScreenContract$InputData, recyclerView);
            case 12:
                RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData = (RevPointsSpareChangeControllerApi$InputData) obj2;
                KProperty[] kPropertyArr7 = RevPointsSpareChangeFullMultiplierController.U;
                phm.a aVar7 = (phm.a) ue0.e.j(((RevPointsSpareChangeFullMultiplierController) obj3).m2()).a().get(w1c.a.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                }
                w1c.a aVar8 = ((w1c.a) aVar.b()).f293821h;
                revPointsSpareChangeControllerApi$InputData.getClass();
                return new w1c.h(aVar8, revPointsSpareChangeControllerApi$InputData);
            case 13:
                TravelFlightsHomeFlowContract$InputData travelFlightsHomeFlowContract$InputData = (TravelFlightsHomeFlowContract$InputData) obj2;
                KProperty[] kPropertyArr8 = TravelFlightsHomeFlow.P;
                phm.a aVar9 = (phm.a) ue0.e.j(((TravelFlightsHomeFlow) obj3).m2()).a().get(f4g.b.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new f4g.q(((f4g.b) aVar.b()).o, travelFlightsHomeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
            case 14:
                IrisRegistrationFlowContract$InputData irisRegistrationFlowContract$InputData = (IrisRegistrationFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(((IrisRegistrationFlow) obj3).m2()).a().get(z52.e.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new p(((z52.j) ((z52.e) aVar.b())).o, irisRegistrationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", z52.e.class, " is not found"));
            case 15:
                CommodityOrderReviewScreen commodityOrderReviewScreen = (CommodityOrderReviewScreen) obj3;
                KProperty[] kPropertyArr9 = CommodityOrderReviewScreen.X;
                qji.b bVarU24 = commodityOrderReviewScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.di.CommodityOrderReviewScreenInjector");
                r6j.d dVar = (r6j.d) bVarU24;
                return new r6j.e(dVar.f251895b, dVar.f251896c, commodityOrderReviewScreen, (CommodityOrderReviewScreenContract$InputData) obj2);
            case 16:
                ReviewPaymentV2Controller reviewPaymentV2Controller = (ReviewPaymentV2Controller) obj3;
                ReviewPaymentV2ControllerContract$InputData reviewPaymentV2ControllerContract$InputData = (ReviewPaymentV2ControllerContract$InputData) obj2;
                KProperty[] kPropertyArr10 = ReviewPaymentV2Controller.Q;
                qji.b bVarU25 = reviewPaymentV2Controller.U2();
                if (bVarU25 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.di.ReviewPaymentV2ControllerInjector");
                }
                c0 c0Var = (c0) bVarU25;
                return new x0(c0Var.f277074b, c0Var.f277075c, reviewPaymentV2Controller, reviewPaymentV2ControllerContract$InputData);
            case 17:
                VaultInvitationConfirmationScreen vaultInvitationConfirmationScreen = (VaultInvitationConfirmationScreen) obj3;
                VaultInvitationConfirmationScreenContract$InputData vaultInvitationConfirmationScreenContract$InputData = (VaultInvitationConfirmationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = VaultInvitationConfirmationScreen.c0;
                phm.a aVar11 = (phm.a) ue0.e.j(vaultInvitationConfirmationScreen.m2()).a().get(r6e.o.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new r6e.u(((r6e.o) aVar.b()).K, vaultInvitationConfirmationScreen, vaultInvitationConfirmationScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r6e.o.class, " is not found"));
            case 18:
                int i2 = DirectDepositTypeSelectionSheet.U;
                qji.b bVarU26 = ((DirectDepositTypeSelectionSheet) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.type_selection.di.DirectDepositTypeSelectionSheetInjector");
                a96.d dVar2 = (a96.d) bVarU26;
                return new a96.g(dVar2.f2344a, dVar2.f2345b, (l96.c) obj2);
            case 19:
                GlobalSearchScreen globalSearchScreen = (GlobalSearchScreen) obj3;
                GlobalSearchContext globalSearchContext = (GlobalSearchContext) obj2;
                KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                phm.a aVar12 = (phm.a) ue0.e.j(globalSearchScreen.m2()).a().get(z87.a.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", z87.a.class, " is not found"));
                }
                g97.a aVar13 = ((g97.a) aVar.b()).f141466g;
                globalSearchContext.getClass();
                return new g97.b(aVar13, globalSearchScreen, globalSearchContext);
            case 20:
                RequestCvvScreenContract$InputData requestCvvScreenContract$InputData = (RequestCvvScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = RequestCvvScreen.f84514b0;
                phm.a aVar14 = (phm.a) ue0.e.j(((RequestCvvScreen) obj3).m2()).a().get(r.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new p7c.q(((r) aVar.b()).D, requestCvvScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
            case 21:
                CryptoEarningScreen cryptoEarningScreen = (CryptoEarningScreen) obj3;
                StakingPocket stakingPocket = (StakingPocket) obj2;
                KProperty[] kPropertyArr14 = CryptoEarningScreen.T;
                phm.a aVar15 = (phm.a) ue0.e.j(cryptoEarningScreen.m2()).a().get(t7j.a.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", t7j.a.class, " is not found"));
                }
                Object objB = aVar.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.retail.feature.crypto.asset_details.impl.di.CryptoAssetDetailsApiComponent");
                return new q8j.f(((q8j.c) objB).M, cryptoEarningScreen, new CryptoEarningScreenContract$InputData(stakingPocket), cryptoEarningScreen);
            case 22:
                PeerToPeerReviewScreen peerToPeerReviewScreen = (PeerToPeerReviewScreen) obj3;
                PeerToPeerReviewScreenInputData peerToPeerReviewScreenInputData = (PeerToPeerReviewScreenInputData) obj2;
                KProperty[] kPropertyArr15 = PeerToPeerReviewScreen.f102358h0;
                phm.a aVar16 = (phm.a) ue0.e.j(peerToPeerReviewScreen.m2()).a().get(q8k.e.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", q8k.e.class, " is not found"));
                }
                v8k.c cVar2 = ((v8k.c) aVar.b()).W;
                peerToPeerReviewScreenInputData.getClass();
                return new v8k.f(cVar2, peerToPeerReviewScreen, peerToPeerReviewScreenInputData);
            case 23:
                InternalBackendFlow internalBackendFlow = (InternalBackendFlow) obj3;
                BackendFlowInput backendFlowInput = (BackendFlowInput) obj2;
                phm.a aVar17 = (phm.a) ue0.e.j(internalBackendFlow.m2()).a().get(fa0.y.class);
                b60.a aVar18 = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar18 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", fa0.y.class, " is not found"));
                }
                BackendFlow backendFlow = ((fa0.y) aVar18.b()).a().a(((BackendFlowInput.Source.Session) backendFlowInput.f51218a).f51223a);
                if (backendFlow == null) {
                    throw new IllegalStateException("Backend form session hasn't been found");
                }
                phm.a aVar19 = (phm.a) ue0.e.j(internalBackendFlow.m2()).a().get(k.class);
                aVar = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                }
                k kVar = (k) aVar.b();
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
                return (na0.d) ((na0.c) (!com.revolut.core.backend_flow.impl.internal_flow.a.a(backendFlow).isEmpty() ? new fa0.g(kVar.f133106j) : new fa0.i(kVar.f133106j)).k(backendFlowInput).m(backendFlow).h(backendFlowInput.f).a(internalBackendFlow)).build();
            case 24:
                FormController formController = (FormController) obj3;
                FormScreen formScreen = (FormScreen) obj2;
                int i3 = FormController.D0;
                qji.b bVarU27 = formController.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.di.FormScreenControllerInjector");
                fa0.p pVarE = ((na0.d) bVarU27).E();
                switch (pVarE.f133125a) {
                    case 0:
                        pVarE.d = formScreen;
                        break;
                    default:
                        pVarE.d = formScreen;
                        break;
                }
                return (nb0.a) ((fa0.p) pVarE.mo3808a(formController)).mo3783build();
            case 25:
                PasscodeFlowContract$InputData passcodeFlowContract$InputData = (PasscodeFlowContract$InputData) obj2;
                phm.a aVar20 = (phm.a) ue0.e.j(((PasscodeFlow) obj3).m2()).a().get(ta9.m.class);
                aVar = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar != null) {
                    return new t(((ta9.m) aVar.b()).O, passcodeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ta9.m.class, " is not found"));
            case 26:
                OrderDetailsScreen orderDetailsScreen = (OrderDetailsScreen) obj3;
                KProperty[] kPropertyArr16 = OrderDetailsScreen.Y;
                qji.b bVarU28 = orderDetailsScreen.U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.di.OrderDetailsScreenInjector");
                uac.i iVar = (uac.i) bVarU28;
                return new uac.e(iVar.f278584b, iVar.f278585c, orderDetailsScreen, (OrderDetailsScreenContract$InputData) obj2);
            case 27:
                QvikNavigation$InputData qvikNavigation$InputData = (QvikNavigation$InputData) obj2;
                phm.a aVar21 = (phm.a) ue0.e.j(((QvikFlow) obj3).m2()).a().get(hc2.d.class);
                aVar = aVar21 != null ? (b60.a) aVar21.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", hc2.d.class, " is not found"));
                }
                hc2.m mVar = ((hc2.m) ((hc2.d) aVar.b())).f150806m;
                qvikNavigation$InputData.getClass();
                return new hc2.o(mVar, qvikNavigation$InputData);
            case 28:
                KProperty[] kPropertyArr17 = TravelHotelsPropertyAmenitiesScreen.Q;
                qji.b bVarU29 = ((TravelHotelsPropertyAmenitiesScreen) obj3).U2();
                Intrinsics.i(bVarU29, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities.di.TravelHotelsPropertyAmenitiesScreenInjector");
                z zVar = (z) bVarU29;
                return new x(zVar.f141862b, zVar.f141863c, (TravelHotelsPropertyAmenitiesScreenContract$InputData) obj2);
            default:
                PriceTargetsDetailsScreen priceTargetsDetailsScreen = (PriceTargetsDetailsScreen) obj3;
                PriceTargetsDetailsScreenContract$InputData priceTargetsDetailsScreenContract$InputData = (PriceTargetsDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr18 = PriceTargetsDetailsScreen.f100155b0;
                qji.b bVarQ24 = priceTargetsDetailsScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.di.PriceTargetsDetailsScreenInjector");
                fdj.b bVar = (fdj.b) bVarQ24;
                fdj.a aVar22 = bVar.f133952b;
                fdj.b bVar2 = bVar.f133953c;
                od0.h hVar4 = od0.i.Companion;
                ncj.d dVar3 = priceTargetsDetailsScreenContract$InputData.f100159c;
                hVar4.getClass();
                return new fdj.c(aVar22, bVar2, priceTargetsDetailsScreen, priceTargetsDetailsScreenContract$InputData, od0.h.a(dVar3));
        }
    }
}
