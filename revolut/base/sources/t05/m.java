package t05;

import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetContract$InputData;
import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetController;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_other_debt.AddOtherDebtScreen;
import com.revolut.feature.credit.health.impl.ui.dashboard.DashboardScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import com.revolut.feature.pay_later.impl.ui.overdue_info.OverdueInfoController;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlow;
import com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.RevPointsTrophyRoomBottomSheetScreen;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeScreen;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowController;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.PortfolioInsightsScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_type.NewTransferInvestmentsTypeScreen;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.TravelFlightsBaggageInfoScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreen;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewController;
import com.revolut.retail.feature.cryptocommoditydetails.impl.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.ManualConsentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import th6.b0;
import ujb.z0;
import vkm.j2;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((DashboardScreen) this.v, continuation, 0);
            case 1:
                return new m((RevPointsTrophyRoomBottomSheetScreen) this.v, continuation, 1);
            case 2:
                return new m((t0c.e) this.v, continuation, 2);
            case 3:
                return new m((TaxFilingScreen) this.v, continuation, 3);
            case 4:
                return new m((ManualConsentScreen) this.v, continuation, 4);
            case 5:
                return new m((TransfersPersonalisationFlow) this.v, continuation, 5);
            case 6:
                return new m((t48.y) this.v, continuation, 6);
            case 7:
                return new m((TravelFlightsBaggageInfoScreen) this.v, continuation, 7);
            case 8:
                return new m((PerformanceTrackerFlowController) this.v, continuation, 8);
            case 9:
                return new m((TravelFlightsPostBookingScreen) this.v, continuation, 9);
            case 10:
                return new m((PortfolioInsightsScreen) this.v, continuation, 10);
            case 11:
                return new m((AddOtherDebtScreen) this.v, continuation, 11);
            case 12:
                return new m((t95.e) this.v, continuation, 12);
            case 13:
                return new m((BlockFuturePaymentsScreen) this.v, continuation, 13);
            case 14:
                return new m((t9e.w) this.v, continuation, 14);
            case 15:
                return new m((NewTransferInvestmentsTypeScreen) this.v, continuation, 15);
            case 16:
                return new m((tb0.g) this.v, continuation, 16);
            case 17:
                return new m((CharityDetailsScreen) this.v, continuation, 17);
            case 18:
                return new m((tb9.g) this.v, continuation, 18);
            case 19:
                return new m((TravelHotelsLocationPickerScreen) this.v, continuation, 19);
            case 20:
                return new m((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) this.v, continuation, 20);
            case 21:
                return new m((RecurringDepositDetailsViewController) this.v, continuation, 21);
            case 22:
                return new m((o9h.f) this.v, continuation, 22);
            case 23:
                return new m((TransactionsFilterScreen) this.v, continuation, 23);
            case 24:
                return new m((th6.q) this.v, continuation, 24);
            case 25:
                return new m((b0) this.v, continuation, 25);
            case 26:
                return new m((SuggestionSheetController) this.v, continuation, 26);
            case 27:
                return new m((OverdueInfoController) this.v, continuation, 27);
            case 28:
                return new m((tjb.g) this.v, continuation, 28);
            default:
                return new m((ActivationNoticeScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((m) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((m) create((t95.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((m) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((m) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((m) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y19.c cVar;
        Address address;
        int i = this.u;
        int i2 = 0;
        int i3 = 28;
        Object arrayList = 0;
        ArrayList arrayList2 = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((DashboardScreen) obj3).d3().B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0c.e eVar = (t0c.e) ((RevPointsTrophyRoomBottomSheetScreen) obj3).S.getValue();
                y19.d dVar = (y19.d) ((t0c.b) ((j2) eVar.f267000r.f22677a).getValue()).f266994a.getContent();
                String str = (dVar == null || (cVar = dVar.d) == null) ? null : cVar.f310334b;
                if (str != null) {
                    eVar.n2(new t0c.c(eVar, str, arrayList, i2), new whi.b(6));
                } else {
                    eVar.B2();
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t0c.e) obj3).B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TaxFilingScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ManualConsentScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TransfersPersonalisationFlow) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t48.y) obj3).v2(t48.l.f267924a);
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t4g.b) ((TravelFlightsBaggageInfoScreen) obj3).T.getValue()).B2();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t5e.o) ((PerformanceTrackerFlowController) obj3).M.getValue()).B2();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.flights.impl.ui.screen.post_booking.b) ((t6g.g) ((TravelFlightsPostBookingScreen) obj3).O.getValue())).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a) ((t7f.e) ((PortfolioInsightsScreen) obj3).T.getValue())).B2();
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AddOtherDebtScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) ((t95.e) obj3).f268953c.a(t95.c.f268949a);
                if (list != null) {
                    List<r95.c> list2 = list;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    for (r95.c cVar2 : list2) {
                        Intrinsics.checkNotNullParameter(cVar2, "<this>");
                        arrayList.add(new f95.d(cVar2.getFacilityId(), f95.e.valueOf(cVar2.getState())));
                    }
                }
                return arrayList;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BlockFuturePaymentsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t9e.w wVar = (t9e.w) obj3;
                return yji.l.a1(wVar, boh.f.e(rd0.e.b(((yua.q) wVar.f269004q).o(wVar.f269003p.f89182a)), new t9e.l(wVar, 3)), null, null, new t9e.s(wVar, arrayList, i2), 3);
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((NewTransferInvestmentsTypeScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tb0.g gVar = (tb0.g) obj3;
                gVar.T2(new xa0.a(gVar, arrayList, i2), new yi5.b(27));
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) ((CharityDetailsScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tb9.g) obj3).C2(tb9.d.f269509a);
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar21 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) ((TravelHotelsLocationPickerScreen) obj3).e3();
                aVar21.getClass();
                aVar21.l2(new m(aVar21, arrayList, 20), new yi5.b(26));
                return Unit.f186387a;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar23 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) obj3;
                aVar23.f93943t.Q();
                aVar23.B2();
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RecurringDepositDetailsViewController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j60.a) ((o9h.f) obj3).f).x(new rp0.y(f0.f322471a, new rp0.t(new TextLocalisedClause(R$string.commodity_price_targets_prompt_feature_description_title, null, null, 14), new TextLocalisedClause(R$string.commodity_price_targets_prompt_feature_description_description, null, null, 14), null, 28), null, null, null, null, "FEATURE_DESCRIPTION_DIALOG_DELEGATE_KEY", null, null, null, 3836));
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TransactionsFilterScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ye6.g gVar2 = (ye6.g) j6.a.k(ye6.g.class, ((th6.q) obj3).f271293c, "LINKED_ACCOUNTS_CONSENT_STORAGE_KEY");
                if (gVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(gVar2, "<this>");
                String strC = gVar2.getTitle();
                String strB = gVar2.getSubtitle();
                List<ye6.c> listA = gVar2.getAccounts();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                for (ye6.c cVar3 : listA) {
                    Intrinsics.checkNotNullParameter(cVar3, "<this>");
                    arrayList3.add(new ph6.a(new io3.b(io3.a.valueOf(cVar3.getLogo().getType()), cVar3.getLogo().getValue()), cVar3.getId(), cVar3.getTitle(), cVar3.getDescription()));
                }
                return new ph6.f(strC, strB, arrayList3);
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    rf6.a aVar29 = (rf6.a) ((b0) obj3).f271266b.T2("PSE_STORAGE_KEY", wim.z.d(o0.b(rf6.a.class)));
                    if (aVar29 != null) {
                        return c6d.b.E(aVar29);
                    }
                    return null;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ti1.g gVar3 = (ti1.g) ((SuggestionSheetController) obj3).V.getValue();
                SuggestionSheetContract$InputData suggestionSheetContract$InputData = gVar3.o;
                int i5 = ti1.f.f271402a[((ti1.b) ((j2) gVar3.f271403p.f22677a).getValue()).f271398a.ordinal()];
                if (i5 == 1) {
                    address = suggestionSheetContract$InputData.f61035a;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    address = suggestionSheetContract$InputData.f61036b;
                }
                gVar3.C2(new ti1.c(address));
                return Unit.f186387a;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tj9.c) ((OverdueInfoController) obj3).S.getValue()).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list3 = (List) ((tjb.g) obj3).f271625c.T2("challenges_onboarding_key", tjb.g.f271622g);
                if (list3 != null) {
                    List list4 = list3;
                    arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(tjb.a.b((z0) it8.next()));
                    }
                }
                return arrayList2;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tjc.f fVar = (tjc.f) ((ActivationNoticeScreen) obj3).T.getValue();
                fVar.getClass();
                fVar.n2(new sqd.h0(fVar, arrayList, i3), new td1.f(fVar, i3));
                return Unit.f186387a;
        }
    }
}
