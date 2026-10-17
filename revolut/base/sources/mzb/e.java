package mzb;

import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import b3j.q;
import b3j.t;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabController;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.impl.flows.selector.flow.CardPaymentMethodSelectorFlow;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlow;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub.DebtsV3HubController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub.DebtsV3HubControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreenContract$InputData;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreen;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreenContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui.view_itemized_split_bill_lines.ViewItemizedSplitBillLinesController;
import com.revolut.feature.retail.privacy.impl.ui.flow.RetailPrivacyFlow;
import com.revolut.feature.retail.privacy.impl.ui.flow.RetailPrivacyFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreen;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreenContract$InputData;
import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreen;
import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlow;
import com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.screen.BlockSubscriptionScreen;
import com.revolut.feature.subscriptions.impl.block_card_subscription.screen.BlockSubscriptionScreenContract$InputData;
import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlow;
import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlowContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllController;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllControllerContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates.PortfolioUpdatesScreen;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$InputData;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.OnboardingWorkflowContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.OnboardingWorkflowFlow;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlow;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$InputData;
import dw3.a2;
import dw3.u4;
import fa1.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kyk.l;
import kyk.v;
import kyk.y;
import mll.c0;
import n33.f2;
import n33.j0;
import n33.r;
import n33.t0;
import n33.u0;
import r6e.o;
import skm.p0;
import te0.w;
import u45.f0;
import u7i.m;
import vc.s;
import x13.a0;
import x13.p;
import zxb.n;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f210751c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f210749a = i;
        this.f210750b = obj2;
        this.f210751c = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f210749a;
        int i2 = 14;
        Object obj2 = this.f210751c;
        Object obj3 = this.f210750b;
        switch (i) {
            case 0:
                RevPointsLearnScreenContract$InputData revPointsLearnScreenContract$InputData = (RevPointsLearnScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = RevPointsLearnScreen.S;
                phm.a aVar2 = (phm.a) ue0.e.j(((RevPointsLearnScreen) obj3).m2()).a().get(zxb.e.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new n(((zxb.e) aVar.b()).V, revPointsLearnScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
            case 1:
                return Boolean.valueOf(SupportedSurfaceCombination.getOrderedSupportedStreamUseCaseSurfaceConfigList$lambda$0((SupportedSurfaceCombination) obj3, (List) obj2));
            case 2:
                LearnHomeScreenContract$InputData learnHomeScreenContract$InputData = (LearnHomeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = LearnHomeScreen.Y;
                phm.a aVar3 = (phm.a) ue0.e.j(((LearnHomeScreen) obj3).m2()).a().get(f09.e.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new f09.d(((f09.e) aVar.b()).f131060c, learnHomeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f09.e.class, " is not found"));
            case 3:
                OnboardingWorkflowContract$InputData onboardingWorkflowContract$InputData = (OnboardingWorkflowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((OnboardingWorkflowFlow) obj3).m2()).a().get(y.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new l(((v) ((y) aVar.b())).A, onboardingWorkflowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
            case 4:
                return BasicTextFieldKt.BasicTextField$lambda$20$0((TextFieldValue) obj3, (MutableState) obj2);
            case 5:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$1$0((TextLinkScope) obj3, (AnnotatedString) obj2);
            case 6:
                n1a.d dVar = (n1a.d) obj2;
                KProperty[] kPropertyArr3 = ViewItemizedSplitBillLinesController.Q;
                phm.a aVar5 = (phm.a) ue0.e.j(((ViewItemizedSplitBillLinesController) obj3).m2()).a().get(v0a.b.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new j1a.l(((j1a.i) aVar.b()).f170313p, dVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
            case 7:
                TravelExperiencesBookingDetailsScreen travelExperiencesBookingDetailsScreen = (TravelExperiencesBookingDetailsScreen) obj3;
                KProperty[] kPropertyArr4 = TravelExperiencesBookingDetailsScreen.f0;
                qji.b bVarQ2 = travelExperiencesBookingDetailsScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.di.TravelExperiencesBookingDetailsScreenInjector");
                z0g.j jVar = (z0g.j) bVarQ2;
                return new z0g.c(jVar.f318386b, jVar.f318387c, travelExperiencesBookingDetailsScreen, (TravelExperiencesBookingDetailsScreenContract$InputData) obj2);
            case 8:
                OrderNewCardTabController orderNewCardTabController = (OrderNewCardTabController) obj3;
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData = (OrderNewCardTabControllerContract$InputData) obj2;
                KProperty[] kPropertyArr5 = OrderNewCardTabController.V;
                phm.a aVar6 = (phm.a) ue0.e.j(orderNewCardTabController.m2()).a().get(p.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                }
                p pVar = ((p) aVar.b()).T;
                k23.f fVar = orderNewCardTabController.K;
                fVar.getClass();
                return new a0(pVar, new agk.c(), orderNewCardTabController, orderNewCardTabControllerContract$InputData, fVar);
            case 9:
                f2 f2Var = (f2) obj3;
                kc8.a cardType = (kc8.a) obj2;
                r rVar = f2Var.o;
                CardOrderAccountWrapper accountWrapper = f2Var.f211716s.f65210c;
                t0 t0Var = (t0) rVar;
                t0Var.getClass();
                Intrinsics.checkNotNullParameter(cardType, "cardType");
                Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
                pfm.a aVar7 = new pfm.a(w.o0(p0.f264003c, new c0(t0Var, cardType, accountWrapper, null, 19)), new j0(26, new u0(f2Var, i2)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar7, "flatMapCompletable(...)");
                return aVar7;
            case 10:
                AccountFieldsScreen accountFieldsScreen = (AccountFieldsScreen) obj3;
                AccountFieldsScreenContract$InputData accountFieldsScreenContract$InputData = (AccountFieldsScreenContract$InputData) obj2;
                AccountFieldsScreen.Companion aVar8 = AccountFieldsScreen.INSTANCE;
                phm.a aVar9 = (phm.a) ue0.e.j(accountFieldsScreen.m2()).a().get(t.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new q(((t) aVar.b()).f12108t, accountFieldsScreen, accountFieldsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
            case 11:
                CardPaymentMethodSelectorFlow cardPaymentMethodSelectorFlow = (CardPaymentMethodSelectorFlow) obj3;
                SelectPaymentMethodInputData selectPaymentMethodInputData = (SelectPaymentMethodInputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(cardPaymentMethodSelectorFlow.m2()).a().get(c43.h.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", c43.h.class, " is not found"));
                }
                c43.h hVar = ((c43.h) aVar.b()).f21028w;
                selectPaymentMethodInputData.getClass();
                return new c43.j(hVar, cardPaymentMethodSelectorFlow, selectPaymentMethodInputData);
            case 12:
                return ((n50.l) obj3).f212491a.a((String) obj2);
            case 13:
                SubaccountAddMoneyFlowContract$InputData subaccountAddMoneyFlowContract$InputData = (SubaccountAddMoneyFlowContract$InputData) obj2;
                phm.a aVar11 = (phm.a) ue0.e.j(((SubaccountAddMoneyFlow) obj3).m2()).a().get(o.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new r6e.n(((o) aVar.b()).K, subaccountAddMoneyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 14:
                LoanRepaymentsListScreen loanRepaymentsListScreen = (LoanRepaymentsListScreen) obj3;
                LoanRepaymentsListScreenContract$InputData loanRepaymentsListScreenContract$InputData = (LoanRepaymentsListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = LoanRepaymentsListScreen.f70576e0;
                phm.a aVar12 = (phm.a) ue0.e.j(loanRepaymentsListScreen.m2()).a().get(u45.h.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                }
                u45.h hVar2 = ((u45.h) aVar.b()).B;
                ScreenContentRecyclerView repaymentsListScreenRecyclerView = loanRepaymentsListScreen.h3().d;
                Intrinsics.checkNotNullExpressionValue(repaymentsListScreenRecyclerView, "repaymentsListScreenRecyclerView");
                return new f0(hVar2, repaymentsListScreenRecyclerView, loanRepaymentsListScreenContract$InputData);
            case 15:
                MoveMoneyTopupScreen moveMoneyTopupScreen = (MoveMoneyTopupScreen) obj3;
                MoveMoneyTopupScreenContract$InputData moveMoneyTopupScreenContract$InputData = (MoveMoneyTopupScreenContract$InputData) obj2;
                MoveMoneyTopupScreen.Companion aVar13 = MoveMoneyTopupScreen.INSTANCE;
                qji.b bVarU2 = moveMoneyTopupScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_move_money.impl.topup.di.MoveMoneyTopupScreenInjector");
                m mVar = (m) bVarU2;
                u7i.l lVar = mVar.e;
                m mVar2 = mVar.f;
                moveMoneyTopupScreenContract$InputData.getClass();
                return new u7i.o(lVar, mVar2, moveMoneyTopupScreen, moveMoneyTopupScreenContract$InputData);
            case 16:
                KProperty[] kPropertyArr7 = DebtsV3HubController.R;
                qji.b bVarU22 = ((DebtsV3HubController) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub.di.DebtsV3HubControllerInjector");
                u4 u4Var = (u4) bVarU22;
                return new a2(u4Var.f119906c, u4Var.d, (DebtsV3HubControllerContract$InputData) obj2);
            case 17:
                BlockSubscriptionScreenContract$InputData blockSubscriptionScreenContract$InputData = (BlockSubscriptionScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = BlockSubscriptionScreen.Z;
                qji.b bVarQ22 = ((BlockSubscriptionScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.block_card_subscription.screen.di.BlockSubscriptionScreenInjector");
                i9e.h hVar3 = (i9e.h) bVarQ22;
                i9e.o oVar = hVar3.f159679b;
                i9e.h hVar4 = hVar3.f159680c;
                blockSubscriptionScreenContract$InputData.getClass();
                return new i9e.k(oVar, hVar4, blockSubscriptionScreenContract$InputData);
            case 18:
                KProperty[] kPropertyArr9 = AssetsPriceUpdateScreen.Q;
                qji.b bVarU23 = ((AssetsPriceUpdateScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.di.AssetsPriceUpdateScreenInjector");
                l9f.j jVar2 = (l9f.j) bVarU23;
                return new l9f.a(jVar2.f193180b, jVar2.f193181c, (AssetsPriceUpdateScreenContract$InputData) obj2);
            case 19:
                SuspiciousTransactionFlow suspiciousTransactionFlow = (SuspiciousTransactionFlow) obj3;
                SuspiciousTransactionFlowContract$InputData suspiciousTransactionFlowContract$InputData = (SuspiciousTransactionFlowContract$InputData) obj2;
                KProperty[] kPropertyArr10 = SuspiciousTransactionFlow.X;
                phm.a aVar14 = (phm.a) ue0.e.j(suspiciousTransactionFlow.m2()).a().get(lal.k.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", lal.k.class, " is not found"));
                }
                lal.k kVar = ((lal.k) aVar.b()).e;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) suspiciousTransactionFlow.T.getValue();
                twinVerticalButton.getClass();
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) suspiciousTransactionFlow.U.getValue();
                navBarWithToolbar.getClass();
                return new lal.l(kVar, suspiciousTransactionFlowContract$InputData, twinVerticalButton, navBarWithToolbar);
            case 20:
                nc1.m mVar3 = (nc1.m) obj3;
                dj0.d amount = mVar3.D2();
                Throwable th10 = ((o.e) ((fa1.o) obj2)).f133200a;
                pc1.b bVar = mVar3.D;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                zii.i.t(mVar3, mVar3.z2(pc1.b.f(bVar.g(th10), amount)), new nc1.g(mVar3, 5), null, 14);
                return Unit.f186387a;
            case 21:
                nc1.m mVar4 = (nc1.m) obj3;
                fa1.y yVar = ((fa1.l) obj2).e;
                String str = yVar != null ? yVar.d : null;
                dj0.d dVarD2 = mVar4.D2();
                mVar4.D.getClass();
                zii.i.t(mVar4, mVar4.z2(pc1.b.a(dVarD2, str)), new nc1.i(mVar4, str, dVarD2, 1), null, 14);
                return Unit.f186387a;
            case 22:
                RetailPrivacyFlowContract$InputData retailPrivacyFlowContract$InputData = (RetailPrivacyFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((RetailPrivacyFlow) obj3).m2()).a().get(lcb.d.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", lcb.d.class, " is not found"));
                }
                kdh.b bVarA = ((lcb.d) aVar.b()).a();
                bVarA.getClass();
                bVarA.f182900c = retailPrivacyFlowContract$InputData;
                s.h((RetailPrivacyFlowContract$InputData) bVarA.f182900c, RetailPrivacyFlowContract$InputData.class);
                return new lcb.b((lcb.a) bVarA.f182899b, (RetailPrivacyFlowContract$InputData) bVarA.f182900c);
            case 23:
                InstrumentsCollectionFiltersSeeAllController instrumentsCollectionFiltersSeeAllController = (InstrumentsCollectionFiltersSeeAllController) obj3;
                InstrumentsCollectionFiltersSeeAllControllerContract$InputData instrumentsCollectionFiltersSeeAllControllerContract$InputData = (InstrumentsCollectionFiltersSeeAllControllerContract$InputData) obj2;
                KProperty[] kPropertyArr11 = InstrumentsCollectionFiltersSeeAllController.R;
                phm.a aVar16 = (phm.a) ue0.e.j(instrumentsCollectionFiltersSeeAllController.m2()).a().get(h9h.a.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar != null) {
                    return new h9h.d(((h9h.a) aVar.b()).D, instrumentsCollectionFiltersSeeAllController, instrumentsCollectionFiltersSeeAllControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
            case 24:
                YourCashbackFlowContract$InputData yourCashbackFlowContract$InputData = (YourCashbackFlowContract$InputData) obj2;
                phm.a aVar17 = (phm.a) ue0.e.j(((YourCashbackFlow) obj3).m2()).a().get(tc3.a.class);
                aVar = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar != null) {
                    return new yc3.h(((yc3.a) aVar.b()).u, yourCashbackFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", tc3.a.class, " is not found"));
            case 25:
                KProperty[] kPropertyArr12 = PriceTargetsFaqLeafScreen.f100160b0;
                qji.b bVarQ23 = ((PriceTargetsFaqLeafScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.di.PriceTargetsFaqLeafScreenInjector");
                fdj.b bVar2 = (fdj.b) bVarQ23;
                return new fdj.d(bVar2.f133952b, bVar2.f133953c, (PriceTargetsFaqLeafScreenContract$InputData) obj2);
            case 26:
                VatInputScreenContract$InputData vatInputScreenContract$InputData = (VatInputScreenContract$InputData) obj3;
                VatInputScreen vatInputScreen = (VatInputScreen) obj2;
                KProperty[] kPropertyArr13 = VatInputScreen.f84760a0;
                ofc.a aVar18 = new ofc.a();
                vatInputScreenContract$InputData.getClass();
                aVar18.f224798b = vatInputScreenContract$InputData;
                vatInputScreen.getClass();
                aVar18.f224797a = vatInputScreen;
                return (ofc.b) aVar18.mo3800build();
            case 27:
                RetailSuspiciousTransactionContainerFlowContract$InputData retailSuspiciousTransactionContainerFlowContract$InputData = (RetailSuspiciousTransactionContainerFlowContract$InputData) obj2;
                phm.a aVar19 = (phm.a) ue0.e.j(((RetailSuspiciousTransactionContainerFlow) obj3).m2()).a().get(lfe.b.class);
                aVar = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar != null) {
                    return new lfe.a(((lfe.b) aVar.b()).e, retailSuspiciousTransactionContainerFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", lfe.b.class, " is not found"));
            case 28:
                TravelMilesFlightSearchDashboardPagerFlowContract$InputData travelMilesFlightSearchDashboardPagerFlowContract$InputData = (TravelMilesFlightSearchDashboardPagerFlowContract$InputData) obj2;
                KProperty[] kPropertyArr14 = TravelMilesFlightSearchDashboardPagerFlow.P;
                phm.a aVar20 = (phm.a) ue0.e.j(((TravelMilesFlightSearchDashboardPagerFlow) obj3).m2()).a().get(ffg.a.class);
                aVar = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar != null) {
                    return new ufg.j(((ufg.g) aVar.b()).A, travelMilesFlightSearchDashboardPagerFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
            default:
                ngh.f fVar2 = (ngh.f) obj2;
                KProperty[] kPropertyArr15 = PortfolioUpdatesScreen.Q;
                phm.a aVar21 = (phm.a) ue0.e.j(((PortfolioUpdatesScreen) obj3).m2()).a().get(ufh.i.class);
                aVar = aVar21 != null ? (b60.a) aVar21.get() : null;
                if (aVar != null) {
                    return new ufh.h(((ufh.i) aVar.b()).f279862s, fVar2);
                }
                throw new IllegalStateException(a0.d.q("Api ", ufh.i.class, " is not found"));
        }
    }
}
