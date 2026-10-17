package uj7;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitController;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitControllerContract$InputData;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.CooldownCheckerFlow;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.CooldownCheckerFlowContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3Screen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3ScreenContract$InputData;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.sheet.CryptoMultichainInfoSheetController;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreenContract$InputData;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreen;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review.InsuranceDocumentsReviewFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review.InsuranceDocumentsReviewFlowContract$InputData;
import com.revolut.feature.payments.bills_chooser.api.navigation.CustomBillInputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom.CustomBillScreen;
import com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.MultilevelCampaignModalInputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.MultilevelCampaignModalScreen;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSlideFlowContract$InputData;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSliderFlow;
import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlow;
import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreen;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareController;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlow;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlowContract$InputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreenContract$InputData;
import com.revolut.feature.workflow.engine.product_closures.modal.CloseProductScreen;
import com.revolut.feature.workflow.engine.product_closures.modal.CloseProductScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.yes_no.YesNoQuestionScreen;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreenContract$InputData;
import com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreen;
import com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation.PlanChangeConfirmationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation.PlanChangeConfirmationScreenContract$InputData;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlow;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlowContract$InputData;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheet;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheetContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.wrapper_flow.InvestOrderWrapperFlowViewController;
import cwi.t0;
import cwi.u0;
import jm4.q3;
import jm4.r3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.b1;
import ljl.c1;
import ljl.q0;
import lu7.s;
import nk7.o;
import ppd.f1;
import qgk.e0;
import qgk.y;
import ql7.q;
import ukk.p;
import um2.r;
import up5.a0;
import uyh.k;
import vkm.j2;
import zxb.m;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f280519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f280520c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f280518a = i;
        this.f280519b = obj2;
        this.f280520c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r3v52 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f280518a;
        Object obj2 = this.f280520c;
        Object obj3 = this.f280519b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = CFACInsuranceExactReasonScreen.c0;
                qji.b bVarQ2 = ((CFACInsuranceExactReasonScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.di.CFACInsuranceExactReasonScreenInjector");
                nk7.j jVar = (nk7.j) bVarQ2;
                return new o(jVar.f216688b, jVar.f216689c, (CFACInsuranceExactReasonScreenContract$InputData) obj2);
            case 1:
                SelectAutopayMethodV3Screen selectAutopayMethodV3Screen = (SelectAutopayMethodV3Screen) obj3;
                SelectAutopayMethodV3ScreenContract$InputData selectAutopayMethodV3ScreenContract$InputData = (SelectAutopayMethodV3ScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = SelectAutopayMethodV3Screen.R;
                qji.b bVarU2 = selectAutopayMethodV3Screen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.di.SelectAutopayMethodV3ScreenInjector");
                q3 q3Var = (q3) ((vk4.a) bVarU2).b().mo3808a(selectAutopayMethodV3Screen);
                switch (q3Var.f176271a) {
                    case 0:
                        q3Var.d = selectAutopayMethodV3ScreenContract$InputData;
                        break;
                    default:
                        q3Var.d = selectAutopayMethodV3ScreenContract$InputData;
                        break;
                }
                return (r3) q3Var.mo3783build();
            case 2:
                tk5.j jVar2 = (tk5.j) obj2;
                phm.a aVar = (phm.a) ue0.e.j(((CryptoMultichainInfoSheetController) obj3).m2()).a().get(ak5.a.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( == 0) {
                    throw new IllegalStateException(a0.d.q("Api ", ak5.a.class, " is not found"));
                }
                ak5.i iVar = ((ak5.i) ((ak5.a) b())).f5692g;
                jVar2.getClass();
                return new ak5.g(iVar, jVar2);
            case 3:
                p pVar = (p) obj3;
                pVar.l2(new u2i.g(pVar, (String) obj2, , 24), new yi5.b(26));
                return Unit.f186387a;
            case 4:
                return new ljl.d(((q0) kli.a.n(((AuthenticationRejectedFlow) obj3).m2())).E, (AuthenticationRejectedFlowContract$InputData) obj2);
            case 5:
                KProperty[] kPropertyArr3 = PlanChangeConfirmationScreen.P;
                qji.b bVarU22 = ((PlanChangeConfirmationScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation.di.PlanChangeConfirmationScreenInjector");
                e0 e0Var = (e0) ((vhk.a) bVarU22);
                return new y(e0Var.f245934b, e0Var.f245935c, (PlanChangeConfirmationScreenContract$InputData) obj2);
            case 6:
                AccountsToApplyChangesBottomSheet accountsToApplyChangesBottomSheet = (AccountsToApplyChangesBottomSheet) obj3;
                AccountsToApplyChangesBottomSheetContract$InputData accountsToApplyChangesBottomSheetContract$InputData = (AccountsToApplyChangesBottomSheetContract$InputData) obj2;
                int i2 = AccountsToApplyChangesBottomSheet.U;
                qji.b bVarU23 = accountsToApplyChangesBottomSheet.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.sso.impl.ui.common.accounts_to_apply_changes.di.AccountsToApplyChangesBottomSheetInjector");
                b1 b1Var = (b1) ((vll.a) bVarU23).b().mo3808a(accountsToApplyChangesBottomSheet);
                switch (b1Var.f195887a) {
                    case 0:
                        b1Var.d = accountsToApplyChangesBottomSheetContract$InputData;
                        break;
                    default:
                        b1Var.d = accountsToApplyChangesBottomSheetContract$InputData;
                        break;
                }
                return (c1) b1Var.mo3783build();
            case 7:
                ThemeCustomisationController.Companion aVar2 = ThemeCustomisationController.INSTANCE;
                ((ThemeCustomisationController) obj3).d3().f207133b.setModel(((r) obj2).d.f281194a);
                return Unit.f186387a;
            case 8:
                CooldownCheckerFlowContract$InputData cooldownCheckerFlowContract$InputData = (CooldownCheckerFlowContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((CooldownCheckerFlow) obj3).m2()).a().get(tn3.c.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return new tn3.d(((tn3.c) aVar4.b()).d, cooldownCheckerFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", tn3.c.class, " is not found"));
            case 9:
                CarSearchScreen carSearchScreen = (CarSearchScreen) obj3;
                KProperty[] kPropertyArr4 = CarSearchScreen.c0;
                qji.b bVarQ22 = carSearchScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.di.CarSearchScreenInjector");
                q qVar = (q) bVarQ22;
                return new ql7.p(qVar.f247430a, qVar.f247431b, carSearchScreen, (CarSearchScreenContract$InputData) obj2);
            case 10:
                PenContributionScreen penContributionScreen = (PenContributionScreen) obj3;
                PenContributionScreenContract$InputData penContributionScreenContract$InputData = (PenContributionScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = PenContributionScreen.Z;
                Object objQ2 = penContributionScreen.Q2();
                dmc.r rVar = objQ2 instanceof dmc.r ? (dmc.r) objQ2 : null;
                if (rVar == null) {
                    phm.a aVar5 = (phm.a) ue0.e.j(penContributionScreen.m2()).a().get(dmc.r.class);
                    b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                    if (aVar6 == null) {
                        throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                    }
                    Object objB = aVar6.b();
                    Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.di.PenContributionScreenInjector");
                    rVar = (dmc.r) objB;
                }
                return new dmc.j(rVar.f116039s, penContributionScreenContract$InputData);
            case 11:
                KProperty[] kPropertyArr6 = TripsShareController.P;
                qji.b bVarU24 = ((TripsShareController) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.di.TripsShareScreenInjector");
                ppd.c1 c1Var = (ppd.c1) bVarU24;
                return new f1(c1Var.f238386b, c1Var.f238387c, (TripsShareContract$InputData) obj2);
            case 12:
                return ((a0) obj3).f281854g.d(AccountId.Personal.f51414a, (io3.d) obj2);
            case 13:
                CustomBillInputData customBillInputData = (CustomBillInputData) obj2;
                KProperty[] kPropertyArr7 = CustomBillScreen.f79238d0;
                phm.a aVar7 = (phm.a) ue0.e.j(((CustomBillScreen) obj3).m2()).a().get(gp9.a.class);
                b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar8 != null) {
                    return new gp9.f(((gp9.d) ((gp9.a) aVar8.b())).f145365r, customBillInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
            case 14:
                ReferenceFlowContract$InputData referenceFlowContract$InputData = (ReferenceFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(((ReferenceFlow) obj3).m2()).a().get(wof.a.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 != null) {
                    return new lpf.f(((lpf.i) ((lpf.y) aVar10.b())).o, referenceFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
            case 15:
                DocumentListScreenContract$InputData documentListScreenContract$InputData = (DocumentListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = DocumentListScreen.c0;
                phm.a aVar11 = (phm.a) ue0.e.j(((DocumentListScreen) obj3).m2()).a().get(qr7.b.class);
                b60.a aVar12 = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar12 != null) {
                    return new qr7.a(((qr7.b) aVar12.b()).e, documentListScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", qr7.b.class, " is not found"));
            case 16:
                MainContainerSliderFlow mainContainerSliderFlow = (MainContainerSliderFlow) obj3;
                MainContainerSlideFlowContract$InputData mainContainerSlideFlowContract$InputData = (MainContainerSlideFlowContract$InputData) obj2;
                MainContainerSliderFlow.Companion aVar13 = MainContainerSliderFlow.INSTANCE;
                phm.a aVar14 = (phm.a) ue0.e.j(mainContainerSliderFlow.m2()).a().get(dtb.a.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new mtb.c(((mtb.d) aVar15.b()).d, mainContainerSliderFlow, mainContainerSlideFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", dtb.a.class, " is not found"));
            case 17:
                int i3 = CloseProductScreen.T;
                qji.b bVarR1 = ((CloseProductScreen) obj3).z2().R1();
                Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.product_closures.modal.di.CloseProductScreenComponentInjector");
                return new qth.b(((qth.i) bVarR1).f249151b, (CloseProductScreenContract$InputData) obj2);
            case 18:
                InsuranceDocumentsReviewFlowContract$InputData insuranceDocumentsReviewFlowContract$InputData = (InsuranceDocumentsReviewFlowContract$InputData) obj2;
                phm.a aVar16 = (phm.a) ue0.e.j(((InsuranceDocumentsReviewFlow) obj3).m2()).a().get(s.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new lu7.p(((s) aVar17.b()).o, insuranceDocumentsReviewFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
            case 19:
                int i5 = YesNoQuestionScreen.U;
                qji.b bVarU25 = ((YesNoQuestionScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.rfi.impl.ui.yes_no.di.YesNoQuestionScreenInjector");
                euh.e eVar = (euh.e) bVarU25;
                return new euh.i(eVar.f129583b, eVar.f129584c, (BaseQuestionScreenContract$InputData) obj2);
            case 20:
                InvestOrderContract$InputData investOrderContract$InputData = (InvestOrderContract$InputData) obj2;
                phm.a aVar18 = (phm.a) ue0.e.j(((InvestOrderWrapperFlowViewController) obj3).m2()).a().get(xsl.p.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                }
                xsl.p pVar2 = ((xsl.p) aVar19.b()).O;
                investOrderContract$InputData.getClass();
                return new xsl.h(pVar2, investOrderContract$InputData);
            case 21:
                PassengerDetailsScreen passengerDetailsScreen = (PassengerDetailsScreen) obj3;
                PassengerDetailsScreenContract$InputData passengerDetailsScreenContract$InputData = (PassengerDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = PassengerDetailsScreen.U;
                phm.a aVar20 = (phm.a) ue0.e.j(passengerDetailsScreen.m2()).a().get(hvf.q.class);
                b60.a aVar21 = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar21 != null) {
                    return new hvf.h(((hvf.q) aVar21.b()).k, passengerDetailsScreen, passengerDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
            case 22:
                AirportDetailsScreen airportDetailsScreen = (AirportDetailsScreen) obj3;
                AirportDetailsScreenContract$InputData airportDetailsScreenContract$InputData = (AirportDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = AirportDetailsScreen.f99027d0;
                qji.b bVarQ23 = airportDetailsScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.di.AirportDetailsScreenInjector");
                t0 t0Var = (t0) ((vwi.a) bVarQ23).c().S(airportDetailsScreen);
                switch (t0Var.f109771a) {
                    case 0:
                        t0Var.d = airportDetailsScreenContract$InputData;
                        break;
                    default:
                        t0Var.d = airportDetailsScreenContract$InputData;
                        break;
                }
                return (u0) t0Var.mo3800build();
            case 23:
                qji.b bVarQ24 = ((MultilevelCampaignModalScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.di.MultilevelCampaignModalScreenInjector");
                eya.f fVar = (eya.f) bVarQ24;
                return new eya.e(fVar.f130626b, fVar.f130627c, (MultilevelCampaignModalInputData) obj2);
            case 24:
                RevPointsAdventRewardsFlowContract$InputData revPointsAdventRewardsFlowContract$InputData = (RevPointsAdventRewardsFlowContract$InputData) obj2;
                phm.a aVar22 = (phm.a) ue0.e.j(((RevPointsAdventRewardsFlow) obj3).m2()).a().get(zxb.e.class);
                b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar23 != null) {
                    return new zxb.c(((zxb.e) aVar23.b()).V, revPointsAdventRewardsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
            case 25:
                CryptoExchangeScreen cryptoExchangeScreen = (CryptoExchangeScreen) obj3;
                CryptoExchangeScreenContract$InputData cryptoExchangeScreenContract$InputData = (CryptoExchangeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = CryptoExchangeScreen.X;
                qji.b bVarU26 = cryptoExchangeScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature_crypto_order_flow.impl.exchange.di.CryptoExchangeScreenInjector");
                tyh.c cVar = (tyh.c) bVarU26;
                tyh.b bVar = cVar.f275604b;
                tyh.c cVar2 = cVar.f275605c;
                cryptoExchangeScreenContract$InputData.getClass();
                return new tyh.d(bVar, cVar2, cryptoExchangeScreen, cryptoExchangeScreenContract$InputData);
            case 26:
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = (com.revolut.feature_crypto_order_flow.impl.exchange.d) obj3;
                fh5.d dVar2 = (fh5.d) obj2;
                if (dVar2 instanceof fh5.b) {
                    CryptoOrderDraft cryptoOrderDraft = ((uyh.j) ((j2) dVar.K.f22677a).getValue()).f284369a;
                    if (cryptoOrderDraft != null) {
                        dVar.C2(new k(((fh5.b) dVar2).f135148a, cryptoOrderDraft.f96690b.f96683a));
                    }
                } else if (!(dVar2 instanceof fh5.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 27:
                ShareRewardsScreenContract$InputData shareRewardsScreenContract$InputData = (ShareRewardsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = ShareRewardsScreen.f101771b0;
                phm.a aVar24 = (phm.a) ue0.e.j(((ShareRewardsScreen) obj3).m2()).a().get(nyj.h.class);
                b60.a aVar25 = aVar24 != null ? (b60.a) aVar24.get() : null;
                if (aVar25 != null) {
                    return new nyj.e(((nyj.c) ((nyj.h) aVar25.b())).f220889m, shareRewardsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nyj.h.class, " is not found"));
            case 28:
                int i6 = RevPointsExpiryDetailsScreen.U;
                qji.b bVarU27 = ((RevPointsExpiryDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.points_expiry.details.di.RevPointsExpiryDetailsScreenInjector");
                m mVar = (m) bVarU27;
                return new zxb.k(mVar.f326220b, mVar.f326221c, (RevPointsExpiryDetailsScreenContract$InputData) obj2);
            default:
                TransactionLimitController transactionLimitController = (TransactionLimitController) obj3;
                TransactionLimitControllerContract$InputData transactionLimitControllerContract$InputData = (TransactionLimitControllerContract$InputData) obj2;
                KProperty[] kPropertyArr13 = TransactionLimitController.Q;
                phm.a aVar26 = (phm.a) ue0.e.j(transactionLimitController.m2()).a().get(tz2.e.class);
                b60.a aVar27 = aVar26 != null ? (b60.a) aVar26.get() : null;
                if (aVar27 != null) {
                    return new tz2.r(((tz2.e) aVar27.b()).f275770s, transactionLimitController, transactionLimitControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", tz2.e.class, " is not found"));
        }
    }
}
