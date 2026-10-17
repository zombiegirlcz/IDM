package v0c;

import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerState;
import androidx.compose.material.DrawerValue;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.ApmAliasClaimFlow;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.QrScannerFlow;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameControllerContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreen;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details.LoanDirectDebitAccountDetailsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details.LoanDirectDebitAccountDetailsRootFlow;
import com.revolut.feature.defi.remittances.impl.ui.send.flow.DeFiSendFlow;
import com.revolut.feature.defi.remittances.impl.ui.send.flow.DeFiSendFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreenContract$InputData;
import com.revolut.feature.joint.impl.ui.creation_flow.JointAccountCreationFlow;
import com.revolut.feature.junior.accounts.api.navigation.JuniorSelectionInputData;
import com.revolut.feature.junior.accounts.impl.ui.junior_selection.JuniorSelectionScreen;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.RevPointsTrophyRoomDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.RevPointsTrophyRoomDetailsScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.TopLevelFaqScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.TopLevelFaqScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreen;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyMapPreviewScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyMapPreviewScreenContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreenContract$Input;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreen;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreenContract$InputData;
import dw3.h8;
import dw3.s4;
import f4g.j0;
import g9g.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import mb3.m;
import p12.n;
import p12.v;
import r7d.t;
import s3a.k;
import s3a.r;
import u45.o;
import us6.q;
import us6.z0;
import vch.a0;
import vch.p;
import vch.x0;
import z0g.l;
import zxb.x;
import zxb.y;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f284781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f284782c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f284780a = i;
        this.f284781b = obj2;
        this.f284782c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f284780a;
        p pVar = p.f287725a;
        Object obj2 = this.f284782c;
        Object obj3 = this.f284781b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = RevPointsTrophyRoomDetailsScreen.R;
                qji.b bVarU2 = ((RevPointsTrophyRoomDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.trophy_room.details.di.RevPointsTrophyRoomDetailsScreenInjector");
                y yVar = (y) bVarU2;
                return new x(yVar.f326311a, yVar.f326312b, (RevPointsTrophyRoomDetailsScreenContract$InputData) obj2);
            case 1:
                return AnchoredDraggableState.trySnapTo$lambda$0((AnchoredDraggableState) obj3, obj2);
            case 2:
                return Boolean.valueOf(DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$5$0$0((DrawerState) obj3, (CoroutineScope) obj2));
            case 3:
                return DrawerKt.rememberDrawerState$lambda$1$0((DrawerValue) obj3, (Function1) obj2);
            case 4:
                ApmAliasClaimNavigation$InputData apmAliasClaimNavigation$InputData = (ApmAliasClaimNavigation$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((ApmAliasClaimFlow) obj3).m2()).a().get(v.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                }
                v vVar = ((v) aVar.b()).K;
                apmAliasClaimNavigation$InputData.getClass();
                return new n(vVar, apmAliasClaimNavigation$InputData);
            case 5:
                FreelancerSalesFiltersScreenContract$InputData freelancerSalesFiltersScreenContract$InputData = (FreelancerSalesFiltersScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = FreelancerSalesFiltersScreen.f74135h0;
                phm.a aVar3 = (phm.a) ue0.e.j(((FreelancerSalesFiltersScreen) obj3).m2()).a().get(q.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new z0(((q) aVar.b()).Q, freelancerSalesFiltersScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
            case 6:
                SplitBillQrFlowContract$InputData splitBillQrFlowContract$InputData = (SplitBillQrFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((SplitBillQrFlow) obj3).m2()).a().get(v0a.b.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new j1a.f(((j1a.i) aVar.b()).f170313p, splitBillQrFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
            case 7:
                KProperty[] kPropertyArr3 = TravelExperiencesCategoriesFiltersScreen.Q;
                qji.b bVarU22 = ((TravelExperiencesCategoriesFiltersScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.di.TravelExperiencesCategoriesFiltersScreenInjector");
                z0g.f fVar = (z0g.f) bVarU22;
                return new z0g.e(fVar.f318359b, fVar.f318360c, (TravelExperiencesCategoriesFiltersScreenContract$InputData) obj2);
            case 8:
                KProperty[] kPropertyArr4 = CardHolderNameController.Q;
                qji.b bVarU23 = ((CardHolderNameController) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.di.CardHolderNameControllerInjector");
                x13.q qVar = (x13.q) bVarU23;
                return new x13.n(qVar.f302174c, qVar.d, (CardHolderNameControllerContract$InputData) obj2);
            case 9:
                StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen = (StoreBrandDetailRedeemScreen) obj3;
                StoreBrandDetailRedeemScreenContract$InputData storeBrandDetailRedeemScreenContract$InputData = (StoreBrandDetailRedeemScreenContract$InputData) obj2;
                h30.q qVar2 = storeBrandDetailRedeemScreen.K;
                qVar2.getClass();
                storeBrandDetailRedeemScreenContract$InputData.getClass();
                qVar2.e = storeBrandDetailRedeemScreenContract$InputData;
                qVar2.d = storeBrandDetailRedeemScreen;
                return (k2e.f) qVar2.mo3783build();
            case 10:
                KProperty[] kPropertyArr5 = TravelExperiencesPastAndCancelledScreen.S;
                qji.b bVarU24 = ((TravelExperiencesPastAndCancelledScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.di.TravelExperiencesPastAndCancelledScreenInjector");
                z0g.j jVar = (z0g.j) bVarU24;
                return new l(jVar.f318386b, jVar.f318387c, (TravelExperiencesPastAndCancelledScreenContract$InputData) obj2);
            case 11:
                QrScannerFlow qrScannerFlow = (QrScannerFlow) obj3;
                g12.l lVar = (g12.l) obj2;
                KProperty[] kPropertyArr6 = QrScannerFlow.T;
                phm.a aVar5 = (phm.a) ue0.e.j(qrScannerFlow.m2()).a().get(p12.d.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", p12.d.class, " is not found"));
                }
                p12.d dVar = ((p12.d) aVar.b()).f;
                qrScannerFlow.K.getClass();
                lVar.getClass();
                return new p12.g(dVar, qrScannerFlow, lVar);
            case 12:
                v48.c cVar = (v48.c) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((JointAccountCreationFlow) obj3).m2()).a().get(i38.c.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new q38.a(((q38.b) aVar.b()).v, cVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", i38.c.class, " is not found"));
            case 13:
                RecipientSelectionInputData recipientSelectionInputData = (RecipientSelectionInputData) obj2;
                KProperty[] kPropertyArr7 = RecipientSelectionScreen.f80137h0;
                phm.a aVar7 = (phm.a) ue0.e.j(((RecipientSelectionScreen) obj3).m2()).a().get(r.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                }
                k kVar = ((k) ((r) aVar.b())).g0;
                recipientSelectionInputData.getClass();
                return new s3a.l(kVar, recipientSelectionInputData);
            case 14:
                KProperty[] kPropertyArr8 = TravelFlightsBaggageSelectionScreen.R;
                qji.b bVarU25 = ((TravelFlightsBaggageSelectionScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.di.TravelFlightsBaggageSelectionScreenInjector");
                f4g.p pVar2 = (f4g.p) bVarU25;
                return new f4g.d(pVar2.f132168b, pVar2.f132169c, (TravelFlightsBaggageSelectionScreenContract$InputData) obj2);
            case 15:
                LoanDirectDebitAccountDetailsFlowContract$InputData loanDirectDebitAccountDetailsFlowContract$InputData = (LoanDirectDebitAccountDetailsFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((LoanDirectDebitAccountDetailsRootFlow) obj3).m2()).a().get(u45.h.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new o(((u45.h) aVar.b()).B, loanDirectDebitAccountDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 16:
                DeFiSendFlowContract$InputData deFiSendFlowContract$InputData = (DeFiSendFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(((DeFiSendFlow) obj3).m2()).a().get(g56.l.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new g56.g(((g56.d) ((g56.l) aVar.b())).f140644q, deFiSendFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", g56.l.class, " is not found"));
            case 17:
                TravelFlightsDiscoverScreen travelFlightsDiscoverScreen = (TravelFlightsDiscoverScreen) obj3;
                TravelFlightsDiscoverScreenContract$InputData travelFlightsDiscoverScreenContract$InputData = (TravelFlightsDiscoverScreenContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(travelFlightsDiscoverScreen.m2()).a().get(f4g.b.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return (j0) ((w5g.a) ((w5g.b) aVar.b()).A().R(travelFlightsDiscoverScreenContract$InputData).mo3808a(travelFlightsDiscoverScreen)).mo3783build();
                }
                throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
            case 18:
                OrderSettingsScreenContract$InputData orderSettingsScreenContract$InputData = (OrderSettingsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = OrderSettingsScreen.Q;
                phm.a aVar11 = (phm.a) ue0.e.j(((OrderSettingsScreen) obj3).m2()).a().get(u7i.l.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new u7i.r(((u7i.l) aVar.b()).f277829h0, orderSettingsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u7i.l.class, " is not found"));
            case 19:
                JuniorSelectionScreen juniorSelectionScreen = (JuniorSelectionScreen) obj3;
                JuniorSelectionInputData juniorSelectionInputData = (JuniorSelectionInputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(juniorSelectionScreen.m2()).a().get(r68.b.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new k78.h(((k78.b) ((w78.a) aVar.b())).Q, juniorSelectionScreen, juniorSelectionInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r68.b.class, " is not found"));
            case 20:
                KProperty[] kPropertyArr10 = SubaccountInfoPickerScreen.f89044d0;
                qji.b bVarQ2 = ((SubaccountInfoPickerScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.subaccount.impl.ui.create.screen.info.di.SubaccountInfoPickerScreenInjector");
                r6e.f fVar2 = (r6e.f) bVarQ2;
                return new r6e.q(fVar2.f251730c, fVar2.d, (SubaccountInfoPickerScreenContract$InputData) obj2);
            case 21:
                DebtDetailsScreen debtDetailsScreen = (DebtDetailsScreen) obj3;
                KProperty[] kPropertyArr11 = DebtDetailsScreen.f67438b0;
                qji.b bVarQ22 = debtDetailsScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts.details.di.DebtDetailsScreenInjector");
                s4 s4Var = (s4) bVarQ22;
                return new h8(s4Var.f119751c, s4Var.d, debtDetailsScreen, (DebtDetailsScreenContract$InputData) obj2);
            case 22:
                KProperty[] kPropertyArr12 = TopLevelFaqScreen.f86303d0;
                qji.b bVarQ23 = ((TopLevelFaqScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.di.TopLevelFaqScreenInjector");
                t tVar = (t) ((v7d.a) bVarQ23);
                return new r7d.x(tVar.f252174b, tVar.f252175c, (TopLevelFaqScreenContract$InputData) obj2);
            case 23:
                ActionsScreen actionsScreen = (ActionsScreen) obj3;
                ActionsScreen.Companion aVar13 = ActionsScreen.INSTANCE;
                qji.b bVarQ24 = actionsScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.di.ActionsScreenInjector");
                lal.a aVarB = ((oal.a) bVarQ24).b();
                aVarB.d = actionsScreen;
                aVarB.e = (ActionsScreenContract$InputData) obj2;
                return (lal.b) aVarB.mo3800build();
            case 24:
                CashTopUpDetailsScreenContract$InputData cashTopUpDetailsScreenContract$InputData = (CashTopUpDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = CashTopUpDetailsScreen.f65624b0;
                phm.a aVar14 = (phm.a) ue0.e.j(((CashTopUpDetailsScreen) obj3).m2()).a().get(bb3.a.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new m(((mb3.p) aVar.b()).i, cashTopUpDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
            case 25:
                KProperty[] kPropertyArr14 = TravelHotelsPropertyMapPreviewScreen.S;
                qji.b bVarU26 = ((TravelHotelsPropertyMapPreviewScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.di.TravelHotelsPropertyMapPreviewScreenInjector");
                g9g.t tVar2 = (g9g.t) bVarU26;
                return new b0(tVar2.f141813b, tVar2.f141814c, (TravelHotelsPropertyMapPreviewScreenContract$InputData) obj2);
            case 26:
                WithdrawScreen withdrawScreen = (WithdrawScreen) obj3;
                KProperty[] kPropertyArr15 = WithdrawScreen.f95647h0;
                qji.b bVarQ25 = withdrawScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.withdraw.di.WithdrawScreenInjector");
                z9h.k kVar2 = (z9h.k) bVarQ25;
                return new z9h.l(kVar2.f320456c, kVar2.d, new vsb.a(), withdrawScreen, (WithdrawScreenContract$Input) obj2);
            case 27:
                x0 x0Var = (x0) obj2;
                if (!(((vch.j) obj3) instanceof vch.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                x0Var.v2(pVar);
                return Unit.f186387a;
            case 28:
                vch.o oVar = (vch.o) obj3;
                x0 x0Var2 = (x0) obj2;
                if (Intrinsics.f(oVar, vch.l.f287716a)) {
                    x0Var2.u2();
                } else if (Intrinsics.f(oVar, vch.n.f287722a)) {
                    x0Var2.v2(vch.q.f287727a);
                } else {
                    if (!Intrinsics.f(oVar, vch.m.f287720a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x0Var2.v2(pVar);
                }
                return Unit.f186387a;
            default:
                x0 x0Var3 = (x0) obj3;
                efl.i iVar = ((a0) obj2).f287698a;
                x0Var3.v2(new vch.r(iVar.f125374a, ((vch.k) x0Var3.t2()).f287709b, iVar.f125375b));
                return Unit.f186387a;
        }
    }
}
