package abf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.internal.views.LazyInflatableCachedView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.database.models.beneficiary.BeneficiaryDao_Impl;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.TermsScreenContract$InputData;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsEntryPoint;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.QrCodeNotParsedException;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreenContract$AssetDraft;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.travel.miles.api.model.TravelMilesTransaction;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.NationalIdentifiersFlowContract$State;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.sso.impl.domain.models.Document;
import efm.r;
import g1i.n0;
import g1i.o0;
import gkl.q0;
import gu7.d4;
import hx5.b;
import ip0.nb0;
import ip0.pb0;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k50.a1;
import k50.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import m1c.f1;
import nyb.m0;
import qua.u;
import tpl.s;
import vfg.t;
import vkm.j2;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2959c;

    public /* synthetic */ n(int i, Object obj2, int i2) {
        this.f2957a = i2;
        this.f2958b = i;
        this.f2959c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listP0;
        MoneyDetails moneyDetails;
        int iH;
        Collection collectionG;
        Data data;
        ArrayList arrayList;
        r rVarW;
        int i = this.f2957a;
        int i2 = 0;
        Object obj3 = this.f2959c;
        int i3 = this.f2958b;
        switch (i) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Map map = update.f2953b;
                String str = ((TransferOutInstrument) obj3).f91514a;
                TransferOutAssetSelectionScreenContract$AssetDraft transferOutAssetSelectionScreenContract$AssetDraft = (TransferOutAssetSelectionScreenContract$AssetDraft) map.get(str);
                if (transferOutAssetSelectionScreenContract$AssetDraft == null) {
                    transferOutAssetSelectionScreenContract$AssetDraft = new TransferOutAssetSelectionScreenContract$AssetDraft(Integer.valueOf(i3), false);
                }
                boolean z = transferOutAssetSelectionScreenContract$AssetDraft.f91638b;
                return i.a(update, null, r0.q(update.f2953b, new Pair(str, new TransferOutAssetSelectionScreenContract$AssetDraft(z ? transferOutAssetSelectionScreenContract$AssetDraft.f91637a : Integer.valueOf(i3), !z))), 1);
            case 1:
                Function1 function1 = (Function1) obj3;
                adg.g update2 = (adg.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy = (HotelsPropertyRoomOccupancy) d0.e0(i3, update2.f3344a);
                if (hotelsPropertyRoomOccupancy == null) {
                    return update2;
                }
                HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy2 = (HotelsPropertyRoomOccupancy) function1.invoke(hotelsPropertyRoomOccupancy);
                if (Intrinsics.f(hotelsPropertyRoomOccupancy2, hotelsPropertyRoomOccupancy)) {
                    return update2;
                }
                List list = update2.f3344a;
                ArrayList roomsList = new ArrayList(w.t(list, 10));
                for (Object obj4 : list) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy3 = (HotelsPropertyRoomOccupancy) obj4;
                    if (i2 == i3) {
                        hotelsPropertyRoomOccupancy3 = hotelsPropertyRoomOccupancy2;
                    }
                    roomsList.add(hotelsPropertyRoomOccupancy3);
                    i2 = i5;
                }
                Intrinsics.checkNotNullParameter(roomsList, "roomsList");
                return new adg.g(roomsList);
            case 2:
                aw7.g updateState = (aw7.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return aw7.g.a(updateState, null, boh.f.K((d4) obj3, i3), 3);
            case 3:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return i3 < ((LinkedHashSet) ((i4b.f) obj3).f158330b).size() - 1 ? ufm.m.f279897a : efm.d0.l(new QrCodeNotParsedException(throwable));
            case 4:
                xel.f fVar = (xel.f) obj3;
                NationalIdentifiersFlowContract$State update3 = (NationalIdentifiersFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return fVar == null ? NationalIdentifiersFlowContract$State.a(update3, null, r0.l(Integer.valueOf(i3), update3.f104213b), 1) : NationalIdentifiersFlowContract$State.a(update3, null, r0.q(update3.f104213b, new Pair(Integer.valueOf(i3), fVar)), 1);
            case 5:
                ScheduledPaymentsEntryPoint scheduledPaymentsEntryPoint = (ScheduledPaymentsEntryPoint) obj3;
                b9e.e payments = (b9e.e) obj2;
                Intrinsics.checkNotNullParameter(payments, "payments");
                ArrayList arrayListA = payments.a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayListA) {
                    RecurringPaymentWithExtra recurringPaymentWithExtra = (RecurringPaymentWithExtra) obj5;
                    if (recurringPaymentWithExtra.getF81653a().K != fva.e.ADHOC && !u.v(recurringPaymentWithExtra.getF81653a())) {
                        arrayList2.add(obj5);
                    }
                }
                if (scheduledPaymentsEntryPoint instanceof ScheduledPaymentsEntryPoint.CreditCard) {
                    listP0 = d0.P0(arrayList2, new a9j.f(new cd7.k(), 15));
                } else {
                    if (scheduledPaymentsEntryPoint != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listP0 = d0.P0(arrayList2, new cd7.l());
                }
                return d0.V0(listP0, i3);
            case 6:
                return ((BeneficiaryDao_Impl) obj3).lambda$observeFrequent$7(i3, (SQLiteConnection) obj2);
            case 7:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                return ((com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) obj3).f99865w.n(draft, i3);
            case 8:
                com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft draft2 = (com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft2, "draft");
                o0 o0Var = ((g1i.d0) obj3).f139605n;
                o0Var.getClass();
                Intrinsics.checkNotNullParameter(draft2, "draft");
                wd6.e eVar = draft2.f96881c;
                int[] iArr = n0.f139670b;
                int i6 = iArr[eVar.ordinal()];
                if (i6 == 1) {
                    moneyDetails = draft2.f96880b;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moneyDetails = draft2.f96879a;
                }
                Long lC = o0.c(draft2.k, moneyDetails.f, moneyDetails.f96897a);
                if (lC == null) {
                    return draft2;
                }
                long jLongValue = (lC.longValue() * ((long) i3)) / ((long) 100);
                int i21 = iArr[draft2.f96881c.ordinal()];
                if (i21 == 1) {
                    return o0Var.l(o0Var.n(draft2, r1i.h.BOTTOM, false), jLongValue, true);
                }
                if (i21 == 2) {
                    return o0Var.q(o0Var.n(draft2, r1i.h.TOP, false), jLongValue, true);
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                return Boolean.valueOf(SnapshotStateList.addAll$lambda$0(i3, (Collection) obj3, (List) obj2));
            case 10:
                g42.a update4 = (g42.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data termsData = new Data(null, null, true, 3, null);
                ApmRegistrationTermsScope$InputData apmRegistrationTermsScope$InputData = ((g42.f) obj3).f140328p;
                TextClause textClause = new TextClause(((ApmOnboardingStatusTerms) apmRegistrationTermsScope$InputData.f62275a.get(i3)).f61977a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = ((ApmOnboardingStatusTerms) apmRegistrationTermsScope$InputData.f62275a.get(i3)).f61978b;
                TextClause textClause2 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                update4.getClass();
                Intrinsics.checkNotNullParameter(termsData, "termsData");
                return new g42.a(termsData, i3, textClause, textClause2);
            case 11:
                b.a aVar = hx5.b.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return hx5.b.a((hx5.b) obj3, i3);
            case 12:
                ieb.g update5 = (ieb.g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ieb.g.a(update5, null, null, null, null, null, null, ieb.i.a((ieb.i) obj3, null, null, i3, 3), null, 63);
            case 13:
                igf.c update6 = (igf.c) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return igf.c.a(update6, ((TransactionDetailsPagerFlowContract$DetailsPage) obj3).f91896a.getF94575b(), null, Integer.valueOf(i3), null, 10);
            case 14:
                return LazyListState.prefetchState$lambda$0((LazyListState) obj3, i3, (NestedPrefetchScope) obj2);
            case 15:
                jrd.b update7 = (jrd.b) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                List listI2 = ((jrd.j) obj3).I2(i3);
                int i22 = update7.f177992c;
                int iIntValue = ((Number) d0.m0(listI2)).intValue();
                if (i22 > iIntValue) {
                    i22 = iIntValue;
                }
                return jrd.b.a(update7, i3, i22, listI2, 9);
            case 16:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                h0 update8 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                a1 a1Var = update8.A;
                List list2 = a1Var.f181023c;
                int i32 = a1Var.d;
                if (list2.isEmpty() || (iH = kotlin.ranges.f.h(i3 + i32, v.i(list2))) == i32) {
                    return update8;
                }
                ref$ObjectRef.f186409a = list2.get(iH);
                return h0.a(update8, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, a1.a(update8.A, null, null, iH, 7), 201326591);
            case 17:
                Map map2 = (Map) obj3;
                List entities = (List) obj2;
                Intrinsics.checkNotNullParameter(entities, "entities");
                Iterator it8 = entities.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        i2 = -1;
                    } else if (((kq.i) it8.next()).getId() != i3) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    entities.set(i2, kq.i.a((kq.i) entities.get(i2), map2));
                } else {
                    entities.add(new kq.i(i3, map2, true));
                }
                return Unit.f186387a;
            case 18:
                lde.f fVar2 = (lde.f) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                b9e.e eVar2 = (b9e.e) pair.f186385a;
                List list3 = (List) pair.f186386b;
                aim.e eVarB = zhm.u.b();
                fVar2.getClass();
                aim.e eVarB2 = zhm.u.b();
                eVarB2.addAll(fVar2.a(b9e.b.SUBSCRIPTION, eVar2.f13738b, i3));
                eVarB2.addAll(fVar2.a(b9e.b.DIRECT_DEBIT, eVar2.f13739c, i3));
                eVarB2.addAll(fVar2.a(b9e.b.PAY_LATER_REPAYMENT, eVar2.d, i3));
                eVarB2.addAll(fVar2.a(b9e.b.LOAN_PAYMENT, eVar2.e, i3));
                eVarB2.addAll(fVar2.a(b9e.b.SCHEDULED_TRANSFER, eVar2.f, i3));
                eVarB2.addAll(fVar2.a(b9e.b.BLOCKED_OR_INACTIVE, d0.E0(eVar2.f13741h, eVar2.i), i3));
                eVarB.addAll(zhm.u.a(eVarB2));
                yd9.g gVar = fVar2.d;
                if (list3.isEmpty()) {
                    collectionG = f0.f322471a;
                } else {
                    List listV0 = d0.V0(list3, i3);
                    ArrayList arrayList3 = new ArrayList(w.t(listV0, 10));
                    Iterator it9 = listV0.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(gVar.a((wd9.c) it9.next()));
                    }
                    collectionG = yp0.b.g(arrayList3, lde.f.b(fVar2, new TextLocalisedClause(R$string.wealth_trading_orders_title, null, null, 14)), e0.OUTSIDE_BOX, 0, 0, 124);
                }
                eVarB.addAll(collectionG);
                return zhm.u.a(eVarB);
            case 19:
                lpd.e eVar3 = (lpd.e) obj3;
                lpd.l updateState2 = (lpd.l) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                int i33 = i3 + 1;
                return lpd.l.a(updateState2, lpd.e.a(eVar3, i33, i33 == eVar3.f198969a.f200975a ? eVar3.e : lpd.d.ON_THE_DAY, 11));
            case 20:
                Context it10 = (Context) obj2;
                int i43 = LazyInflatableCachedView.d;
                Intrinsics.checkNotNullParameter(it10, "it");
                View viewInflate = LayoutInflater.from(it10).inflate(i3, (ViewGroup) obj3, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return viewInflate;
            case 21:
                nrj.f updateState3 = (nrj.f) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                uzi.c cyclePeriod = ((nrj.f) ((nrj.h) obj3).t2()).f218655a.f284679a;
                Intrinsics.checkNotNullParameter(cyclePeriod, "cyclePeriod");
                uzi.b budgetingCycle = new uzi.b(cyclePeriod, i3 + 1);
                updateState3.getClass();
                Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
                return new nrj.f(budgetingCycle);
            case 22:
                LocalTime selectedTime = (LocalTime) obj3;
                oeb.a update9 = (oeb.a) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                List timeValues = update9.f224569b;
                Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
                Intrinsics.checkNotNullParameter(timeValues, "timeValues");
                return new oeb.a(selectedTime, timeValues, i3);
            case 23:
                ofg.j jVar = (ofg.j) obj3;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                jVar.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM travel_miles_topup ORDER BY updatedDate DESC LIMIT ?, ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, i3);
                    sQLiteStatementPrepare.bindLong(2, 20);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    ArrayMap arrayMap = new ArrayMap();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        if (text != null && !arrayMap.containsKey(text)) {
                            arrayMap.put(text, new ArrayList());
                        }
                    }
                    sQLiteStatementPrepare.reset();
                    jVar.a(sQLiteConnection, arrayMap);
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        qfg.m mVar = new qfg.m(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        arrayList4.add(new qfg.n(mVar, text2 != null ? (ArrayList) arrayMap.get(text2) : new ArrayList()));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList4;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 24:
                ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, i3);
                ArrayList arrayList5 = new ArrayList(w.t(intRangeO, 10));
                vim.f it11 = intRangeO.iterator();
                while (it11.f289625c) {
                    arrayList5.add(nb0.b(pb0.Companion, a0.d.n("WATCHLIST_LOADING_ITEM_ID_", it11.nextInt()), false, 0, false, 30));
                }
                return i2b.a.q(model, arrayList5);
            case 25:
                return ((uyd.h0) ((ryd.w) obj3).f258357a).f284198q.e(new uyd.l(i3, ((Boolean) obj2).booleanValue()), w4l.h.f294642c);
            case 26:
                tpl.j update10 = (tpl.j) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                q0 q0Var = (q0) ((tpl.j) ((j2) ((s) obj3).u.f22677a).getValue()).f273421a.getContent();
                return tpl.j.a(update10, null, q0Var != null ? (Document) q0Var.f144483a.get(i3) : null, 1);
            case 27:
                return uod.a.a((uod.a) obj2, null, (ArrayList) obj3, Integer.valueOf(i3), 79);
            case 28:
                t tVar = (t) obj3;
                Data topUpsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(topUpsData, "topUpsData");
                try {
                    Object content = topUpsData.getContent();
                    if (content != null) {
                        arrayList = new ArrayList();
                        for (hfg.o0 o0Var2 : (List) content) {
                            ArrayList arrayList6 = o0Var2.d;
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj6 : arrayList6) {
                                TravelMilesTransaction travelMilesTransaction = (TravelMilesTransaction) obj6;
                                if (travelMilesTransaction.d == hfg.r0.LOYALTY && !tVar.a(travelMilesTransaction.f94145a)) {
                                    arrayList7.add(obj6);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                            Iterator it12 = arrayList7.iterator();
                            while (it12.hasNext()) {
                                arrayList8.add(((TravelMilesTransaction) it12.next()).f94145a);
                            }
                            List listV02 = d0.V0(arrayList8, i3);
                            if (listV02.isEmpty()) {
                                rVarW = null;
                            } else {
                                m0 m0Var = tVar.f288640b;
                                int size = listV02.size();
                                rVarW = nim.a.w(m0Var.c(new RevPointsTransactionPageParams(size < 1 ? 1 : size, null, Long.valueOf(o0Var2.f151878b.toEpochMilli()), null, f1.MILES, null, null, listV02, null, 362)), new vf0.p(16));
                            }
                            if (rVarW != null) {
                                arrayList.add(rVarW);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    data = new Data(arrayList, topUpsData.getError(), topUpsData.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, topUpsData.getLoading());
                }
                return (efm.w) iii.c.f(data, new vf0.p(17), new vea.b(9), new fb6.m(i3));
            default:
                Data termsData2 = new Data(null, null, true, 3, null);
                TermsScreenContract$InputData termsScreenContract$InputData = ((vu1.h) obj3).f292199p;
                String title = ((ApmOnboardingStatusTerms) termsScreenContract$InputData.f61695a.get(i3)).f61977a;
                String str3 = ((ApmOnboardingStatusTerms) termsScreenContract$InputData.f61695a.get(i3)).f61978b;
                ((vu1.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(termsData2, "termsData");
                Intrinsics.checkNotNullParameter(title, "title");
                return new vu1.d(termsData2, i3, title, str3);
        }
    }

    public /* synthetic */ n(Object obj2, int i, int i2) {
        this.f2957a = i2;
        this.f2959c = obj2;
        this.f2958b = i;
    }

    public /* synthetic */ n(o7.d dVar, int i, ScheduledPaymentsEntryPoint scheduledPaymentsEntryPoint) {
        this.f2957a = 5;
        this.f2958b = i;
        this.f2959c = scheduledPaymentsEntryPoint;
    }
}
