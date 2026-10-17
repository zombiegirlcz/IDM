package ap7;

import a83.p0;
import androidx.room.util.DBUtil;
import aqb.s;
import aqd.a0;
import aqd.b0;
import aqd.c0;
import aqd.t;
import aqd.z;
import aqh.q;
import aqh.v;
import au6.d0;
import au6.e2;
import au6.k3;
import au6.n1;
import au6.p1;
import au6.u1;
import au6.z1;
import auj.i;
import auj.n;
import avc.r;
import cli.y;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreenContract$ModalStep;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreen;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.common.models.payments.FreelancerPaymentReceipt;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator.ScreenerFilterCalibratorScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_selection.AsftAirportSelectionScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.AsftFlightDatePickerScreen;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$ModalStep;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$RemoveTarget;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventScreen;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import h93.f0;
import ip0.vd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;
import vkm.j2;
import yhm.o;
import zh9.u0;
import zhm.a1;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8110w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f8110w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k((l) this.f8110w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k((CancellationCheckoutScreen) this.f8110w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k((com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b) this.f8110w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                k kVar4 = new k((com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a) this.f8110w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
            case 4:
                k kVar5 = new k((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d) this.f8110w, continuation, 4);
                kVar5.v = obj2;
                return kVar5;
            case 5:
                k kVar6 = new k((IncomeSortersDetailsController) this.f8110w, continuation, 5);
                kVar6.v = obj2;
                return kVar6;
            case 6:
                k kVar7 = new k((ScreenerFilterCalibratorScreen) this.f8110w, continuation, 6);
                kVar7.v = obj2;
                return kVar7;
            case 7:
                k kVar8 = new k((v) this.f8110w, continuation, 7);
                kVar8.v = obj2;
                return kVar8;
            case 8:
                k kVar9 = new k((com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) this.f8110w, continuation, 8);
                kVar9.v = obj2;
                return kVar9;
            case 9:
                k kVar10 = new k((SelectTransactionController) this.f8110w, continuation, 9);
                kVar10.v = obj2;
                return kVar10;
            case 10:
                k kVar11 = new k((arf.l) this.f8110w, continuation, 10);
                kVar11.v = obj2;
                return kVar11;
            case 11:
                k kVar12 = new k((atk.l) this.f8110w, continuation, 11);
                kVar12.v = obj2;
                return kVar12;
            case 12:
                return new k((au6.v) this.v, (AcquiringOrderFilter.Channel) this.f8110w, continuation, 12);
            case 13:
                k kVar13 = new k((d0) this.f8110w, continuation, 13);
                kVar13.v = obj2;
                return kVar13;
            case 14:
                return new k((n1) this.v, (tr6.a) this.f8110w, continuation, 14);
            case 15:
                k kVar14 = new k((p1) this.f8110w, continuation, 15);
                kVar14.v = obj2;
                return kVar14;
            case 16:
                k kVar15 = new k((u1) this.f8110w, continuation, 16);
                kVar15.v = obj2;
                return kVar15;
            case 17:
                k kVar16 = new k((z1) this.f8110w, continuation, 17);
                kVar16.v = obj2;
                return kVar16;
            case 18:
                return new k((k3) this.v, (ds6.j) this.f8110w, continuation, 18);
            case 19:
                k kVar17 = new k((k3) this.f8110w, continuation, 19);
                kVar17.v = obj2;
                return kVar17;
            case 20:
                k kVar18 = new k((AsftAirportSelectionScreen) this.f8110w, continuation, 20);
                kVar18.v = obj2;
                return kVar18;
            case 21:
                k kVar19 = new k((aui.j) this.f8110w, continuation, 21);
                kVar19.v = obj2;
                return kVar19;
            case 22:
                k kVar20 = new k((RewardsHubChallengeHistoryScreen) this.f8110w, continuation, 22);
                kVar20.v = obj2;
                return kVar20;
            case 23:
                k kVar21 = new k((FiltersByTypeScreen) this.f8110w, continuation, 23);
                kVar21.v = obj2;
                return kVar21;
            case 24:
                k kVar22 = new k((av7.m) this.f8110w, continuation, 24);
                kVar22.v = obj2;
                return kVar22;
            case 25:
                k kVar23 = new k((com.revolut.feature.kyc.impl.document_collection.document_selection.a) this.f8110w, continuation, 25);
                kVar23.v = obj2;
                return kVar23;
            case 26:
                k kVar24 = new k((LostCardController) this.f8110w, continuation, 26);
                kVar24.v = obj2;
                return kVar24;
            case 27:
                k kVar25 = new k((r) this.f8110w, continuation, 27);
                kVar25.v = obj2;
                return kVar25;
            case 28:
                k kVar26 = new k((AsftFlightDatePickerScreen) this.f8110w, continuation, 28);
                kVar26.v = obj2;
                return kVar26;
            default:
                k kVar27 = new k((TravelItineraryAddEventScreen) this.f8110w, continuation, 29);
                kVar27.v = obj2;
                return kVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((c0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((zph.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((k) create((ara.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((k) create((AcquiringPaymentsQuery) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((k) create((ur6.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((k) create((ir6.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((k) create((ds6.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((k) create((avc.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((k) create((f0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((k) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v6, types: [zhm.h0] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Set] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IncomeSorterDestinationId incomeSorterDestinationId;
        Object next;
        Iterable iterableL;
        List list;
        ur6.b bVar;
        TravelItineraryAddEventContract$RemoveTarget proposal;
        int i = this.u;
        int i2 = 6;
        int i3 = 7;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i5 = 3;
        int i6 = 2;
        int i21 = 10;
        ?? I1 = 0;
        I1 = 0;
        int i22 = 0;
        int i32 = 1;
        Object obj3 = this.f8110w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) obj3).x2(new j(data, 0));
                return Unit.f186387a;
            case 1:
                String id10 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aq4.f fVarE3 = ((CancellationCheckoutScreen) obj3).d();
                Intrinsics.h(id10);
                com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b bVar2 = (com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b) fVarE3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("id_skip_repayment")) {
                    y yVar = bVar2.f69112r;
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    wi0.b bVar3 = (wi0.b) ((aq4.e) j2Var.getValue()).e.getContent();
                    if (bVar3 != null && ((aq4.e) j2Var2.getValue()).f8249c != null) {
                        oki.h.v2(bVar2.f69113s, new CancellationCheckoutScreenContract$ModalStep.SkipRepayment(((aq4.e) j2Var2.getValue()).f8247a, bVar3), bottom_dialog);
                    }
                }
                return Unit.f186387a;
            case 2:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Data data2 = (Data) pair.f186385a;
                Data data3 = (Data) pair.f186386b;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, null, "Received pocket data update: " + data2 + " and user country data: " + data3, null, null, 16);
                com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b bVar4 = (com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b) obj3;
                bVar4.H2(bVar4.f69112r, new p0(data2, data3, i6));
                return Unit.f186387a;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a) obj3).x2(new j(data4, 1));
                return Unit.f186387a;
            case 4:
                a3 a3Var = (a3) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return nim.a.v(rd0.e.b(osg.b.o(((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d) obj3).f87757a, a3Var.k.f115083b, null, null, null, null, 126)), new aqd.g(a3Var, 0));
            case 5:
                c0 suggestion = (c0) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                IncomeSortersDetailsController incomeSortersDetailsController = (IncomeSortersDetailsController) obj3;
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(suggestion, "suggestion");
                y yVar2 = eVar.f87766x;
                j2 j2Var3 = (j2) yVar2.f22677a;
                j2 j2Var4 = (j2) yVar2.f22677a;
                aqd.m mVar = (aqd.m) ((t) j2Var3.getValue()).f8402a.getContent();
                if (mVar != null && (incomeSorterDestinationId = ((t) j2Var4.getValue()).f) != null) {
                    dj0.d dVar = mVar.f8363a;
                    if (suggestion instanceof b0) {
                        dj0.d dVar2 = new dj0.d(((100 / ((long) 2)) + (dVar.f115082a * ((long) ((b0) suggestion).f8328a))) / 100, dVar.f115083b);
                        j2 j2Var5 = eVar.A;
                        j2Var5.setValue(r0.q((Map) j2Var5.getValue(), new Pair(incomeSorterDestinationId, dVar2)));
                        eVar.H2(yVar2, new s(i21));
                    } else if (!(suggestion instanceof z)) {
                        if (!(suggestion instanceof a0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar.H2(yVar2, new s(11));
                    } else if (!Intrinsics.f(((t) j2Var4.getValue()).f8405g, incomeSorterDestinationId)) {
                        eVar.H2(yVar2, new an4.f(incomeSorterDestinationId, 28));
                    }
                }
                boolean z = ((t) ((j2) ((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d()).f87766x.f22677a).getValue()).f8405g != null;
                KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) incomeSortersDetailsController.O.getValue();
                Object obj4 = dqd.s.f116956a;
                keyboardSuggestionsControllerExtension.S("income_sorter_details", z ? (List) dqd.s.f116958c.getValue() : (List) dqd.s.f116957b.getValue());
                return Unit.f186387a;
            case 6:
                zph.i iVar = (zph.i) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aqh.h hVar = (aqh.h) ((ScreenerFilterCalibratorScreen) obj3).W.getValue();
                List values = iVar.f324306a;
                zph.b selectionState = iVar.f324307b;
                v vVar = (v) hVar;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(values, "values");
                Intrinsics.checkNotNullParameter(selectionState, "selectionState");
                y yVar3 = vVar.f8461s;
                j2 j2Var6 = (j2) yVar3.f22677a;
                j2 j2Var7 = (j2) yVar3.f22677a;
                Iterator it8 = ((aqh.i) j2Var6.getValue()).f8438c.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((ScreenerSelectedFilter) next).getF105167a() == ((aqh.i) j2Var7.getValue()).f8436a) {
                        }
                    } else {
                        next = null;
                    }
                }
                ScreenerSelectedFilter screenerSelectedFilter = (ScreenerSelectedFilter) next;
                ScreenerSelectedFilter.Options options = screenerSelectedFilter instanceof ScreenerSelectedFilter.Options ? (ScreenerSelectedFilter.Options) screenerSelectedFilter : null;
                if (options != null && (list = options.f105166b) != null) {
                    I1 = zhm.d0.i1(list);
                }
                if (I1 == 0) {
                    I1 = h0.f322473a;
                }
                int i33 = q.f8453a[selectionState.ordinal()];
                if (i33 == 1 || i33 == 2) {
                    iterableL = a1.l(I1, values);
                } else {
                    if (i33 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iterableL = a1.k(I1, zhm.d0.i1(values));
                }
                vVar.H2(yVar3, new aqh.o(vVar, new ScreenerSelectedFilter.Options(((aqh.i) j2Var7.getValue()).f8436a, zhm.d0.d1(iterableL)), 1));
                return Unit.f186387a;
            case 7:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                v vVar2 = (v) obj3;
                vVar2.H2(vVar2.f8461s, new j(data5, i5));
                return Unit.f186387a;
            case 8:
                ara.m mVar2 = (ara.m) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar10 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) obj3;
                aVar10.H2(aVar10.f81586y, new ar1.c(mVar2, i6));
                return Unit.f186387a;
            case 9:
                SelectTransactionController selectTransactionController = (SelectTransactionController) obj3;
                String str = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(str, "nav_bar_select")) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.select.a aVar12 = (com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) selectTransactionController.e3();
                    List listI2 = aVar12.I2();
                    Map map = aVar12.A;
                    List list2 = listI2;
                    int iB = q0.b(w.t(list2, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        linkedHashMap.put(((a3) it9.next()).f272581b, Boolean.TRUE);
                    }
                    aVar12.A = r0.p(map, linkedHashMap);
                    aVar12.H2(aVar12.f87897x, new a26.j(listI2, 15));
                } else if (Intrinsics.f(str, "nav_bar_deselect")) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.select.a aVar13 = (com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) selectTransactionController.e3();
                    Map map2 = aVar13.A;
                    List listI22 = aVar13.I2();
                    ArrayList arrayList = new ArrayList(w.t(listI22, 10));
                    Iterator it10 = listI22.iterator();
                    while (it10.hasNext()) {
                        arrayList.add(((a3) it10.next()).f272581b);
                    }
                    Set setI1 = zhm.d0.i1(arrayList);
                    Set setL = setI1;
                    if (aVar13.o.f87884c instanceof SelectTransactionContract$SelectionMode.Multiple.SpecificTransactions) {
                        setL = a1.l(setI1, aVar13.B);
                    }
                    Set set = setL;
                    int iB2 = q0.b(w.t(set, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                    for (Object obj5 : set) {
                        linkedHashMap2.put(obj5, Boolean.FALSE);
                    }
                    aVar13.A = r0.p(map2, linkedHashMap2);
                    aVar13.H2(aVar13.f87897x, new s(23));
                }
                return Unit.f186387a;
            case 10:
                Data data6 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((arf.l) obj3).x2(new j(data6, 4));
                return Unit.f186387a;
            case 11:
                Data data7 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                atk.l lVar = (atk.l) obj3;
                lVar.X2(lVar.f9094p, new j(data7, 5));
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                au6.v vVar3 = (au6.v) this.v;
                is6.a aVar17 = vVar3.e;
                List list3 = (List) DBUtil.performBlocking(aVar17.f168111a, true, false, new is2.t(aVar17, i5));
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it11 = list3.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(bu6.a.c((ks6.k) it11.next()));
                }
                return new Integer(vVar3.b(arrayList2, (AcquiringOrderFilter.Channel) obj3).size());
            case 13:
                AcquiringPaymentsQuery acquiringPaymentsQuery = (AcquiringPaymentsQuery) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return d0.a((d0) obj3, acquiringPaymentsQuery);
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tr6.a aVar20 = (tr6.a) obj3;
                ((n1) this.v).f9581c.G(new du6.h(aVar20.f273747a, aVar20.f273748b), "STORAGE_CACHE_KEY_JOIN_CAMPAIGN_PARAMS", wim.z.d(o0.b(du6.h.class)));
                return Unit.f186387a;
            case 15:
                ur6.b bVar5 = (ur6.b) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                du6.j jVar = (du6.j) j6.a.k(du6.j.class, ((p1) obj3).f9597c, p1.a(bVar5));
                if (jVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                List<du6.i> lessons = jVar.getLessons();
                ArrayList arrayList3 = new ArrayList(w.t(lessons, 10));
                for (du6.i iVar2 : lessons) {
                    Intrinsics.checkNotNullParameter(iVar2, "<this>");
                    String id11 = iVar2.getId();
                    String topic = iVar2.getTopic();
                    ur6.b[] bVarArrValues = ur6.b.values();
                    int length = bVarArrValues.length;
                    int i43 = 0;
                    while (true) {
                        if (i43 < length) {
                            bVar = bVarArrValues[i43];
                            if (!kotlin.text.a0.z(bVar.name(), topic, true)) {
                                i43++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar == null) {
                        bVar = ur6.b.UNKNOWN;
                    }
                    arrayList3.add(new ur6.a(id11, bVar));
                }
                return arrayList3;
            case 16:
                String str2 = (String) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                du6.l lVar2 = (du6.l) j6.a.k(du6.l.class, ((u1) obj3).f9631c, j6.a.q("STORAGE_CACHE_KEY_RECEIPT_", str2));
                if (lVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                return new FreelancerPaymentReceipt(lVar2.getUrl());
            case 17:
                ir6.c cVar = (ir6.c) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return ((z1) obj3).f9676c.T2(cVar.getId(), String.class);
            case 18:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k3 k3Var = (k3) this.v;
                xe0.e eVar2 = k3Var.f9561c;
                k3.Companion.getClass();
                k3Var.f9561c.G(a1.m((Set) eVar2.v0(h0.f322473a, "freelancer:ResolvedFreelancerTaxTypes", k3.f), (ds6.j) obj3), "freelancer:ResolvedFreelancerTaxTypes", kii.e.o(ds6.j.class, KTypeProjection.INSTANCE, Set.class));
                return Unit.f186387a;
            case 19:
                ds6.j jVar2 = (ds6.j) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wt6.l lVar3 = (wt6.l) wp5.y.t(wt6.l.class, ((k3) obj3).f9561c, j6.a.q("STORAGE_KEY_SCHEDULE_OPTION", jVar2.name()));
                if (lVar3 != null) {
                    return bu6.f.f(lVar3);
                }
                return null;
            case 20:
                String airportIataCode = (String) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aui.j jVar3 = (aui.j) ((AsftAirportSelectionScreen) obj3).R2();
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
                jVar3.C2(new aui.f(airportIataCode));
                return Unit.f186387a;
            case 21:
                Data data8 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aui.j jVar4 = (aui.j) obj3;
                jVar4.H2(jVar4.f9835q, new j(data8, i2));
                return Unit.f186387a;
            case 22:
                String itemId = (String) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                auj.j jVarE3 = ((RewardsHubChallengeHistoryScreen) obj3).R2();
                Intrinsics.h(itemId);
                n nVar = (n) jVarE3;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "ARCHIVE_MENU_ITEM_ID")) {
                    nVar.C2(i.a.f9847a);
                }
                return Unit.f186387a;
            case 23:
                String query = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                av5.h hVarH3 = ((FiltersByTypeScreen) obj3).h3();
                Intrinsics.h(query);
                av5.l lVar4 = (av5.l) hVarH3;
                lVar4.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                if (kotlin.text.d0.W(query)) {
                    lVar4.x2(new e2(i3));
                } else {
                    List list4 = ((av5.f) lVar4.t2()).f9915a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list4) {
                        CryptoTransactionFilter cryptoTransactionFilter = (CryptoTransactionFilter) obj6;
                        if (!(cryptoTransactionFilter instanceof CryptoTransactionFilter.TransactionTypeFilter) && !(cryptoTransactionFilter instanceof CryptoTransactionFilter.AccountTypeFilter)) {
                            if (!(cryptoTransactionFilter instanceof CryptoTransactionFilter.CurrencyFilter)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            xi0.b bVar6 = ((CryptoTransactionFilter.CurrencyFilter) cryptoTransactionFilter).f71391a;
                            boolean zJ = kotlin.text.d0.J(bVar6.f306286a, query, true);
                            String strA = lVar4.f9922p.a(bVar6);
                            boolean zJ2 = strA != null ? kotlin.text.d0.J(strA, query, true) : false;
                            if (zJ || zJ2) {
                            }
                        }
                        arrayList4.add(obj6);
                    }
                    lVar4.x2(new a83.c0(i2, arrayList4));
                }
                return Unit.f186387a;
            case 24:
                Data data9 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((av7.m) obj3).x2(new j(data9, i3));
                return Unit.f186387a;
            case 25:
                Data data10 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.kyc.impl.document_collection.document_selection.a aVar32 = (com.revolut.feature.kyc.impl.document_collection.document_selection.a) obj3;
                aVar32.H2(aVar32.f77627r, new j(data10, 8));
                return Unit.f186387a;
            case 26:
                avc.m parcel = (avc.m) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) ((avc.f) ((LostCardController) obj3).M.getValue());
                rVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i59 = 26;
                if (Intrinsics.f(parcel, avc.j.f9998a)) {
                    rVar.l2(new avc.q(rVar, I1, i22), new yi5.b(i59));
                } else if (Intrinsics.f(parcel, avc.k.f9999a)) {
                    rVar.C1(u0.b(gc0.c.f(new CardManagementFeatureConfig.CardSelectReplaceReason(((avc.e) ((j2) rVar.f10006p.f22677a).getValue()).f9995a.f150110a, wy2.d.LOST))));
                } else {
                    if (!Intrinsics.f(parcel, avc.l.f10000a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar.l2(new avc.q(rVar, I1, i32), new yi5.b(i59));
                }
                return Unit.f186387a;
            case 27:
                f0 f0Var = (f0) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar2 = (r) obj3;
                rVar2.H2(rVar2.f10006p, new avc.o(f0Var, i22));
                return Unit.f186387a;
            case 28:
                vd clickData = (vd) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                avi.f fVar = (avi.f) ((AsftFlightDatePickerScreen) obj3).P.getValue();
                Intrinsics.h(clickData);
                fVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                fVar.H2(fVar.o, new aae.e(clickData, 1));
                fVar.C2(new avi.d(clickData.f166807b));
                return Unit.f186387a;
            default:
                String str3 = (String) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(str3, "delete_event")) {
                    com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar7 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) ((TravelItineraryAddEventScreen) obj3).d();
                    TravelItineraryAddEventContract$Mode travelItineraryAddEventContract$Mode = bVar7.o.e;
                    if (travelItineraryAddEventContract$Mode instanceof TravelItineraryAddEventContract$Mode.Edit) {
                        proposal = new TravelItineraryAddEventContract$RemoveTarget.Event(((TravelItineraryAddEventContract$Mode.Edit) travelItineraryAddEventContract$Mode).f101628a);
                    } else if (travelItineraryAddEventContract$Mode instanceof TravelItineraryAddEventContract$Mode.AddProposal) {
                        proposal = new TravelItineraryAddEventContract$RemoveTarget.Proposal(((TravelItineraryAddEventContract$Mode.AddProposal) travelItineraryAddEventContract$Mode).f101625a);
                    } else if (!Intrinsics.f(travelItineraryAddEventContract$Mode, TravelItineraryAddEventContract$Mode.Add.f101624a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(bVar7.f101636r, new TravelItineraryAddEventContract$ModalStep.RemoveItem(proposal), bottom_dialog);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f8110w = obj2;
    }
}
