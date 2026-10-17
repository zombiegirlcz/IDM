package n1;

import android.view.WindowInsets;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFeatureConfig;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.feature.rev_points.models.SpareChangeRefund;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.store.api.model.StorePurchasesResponse;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllContract$InputData;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllScreen;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$OutputData;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$PagerItem;
import com.revolut.feature.travel.flights.impl.ui.flow.root.TravelFlightsFlowContract$Step;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.BankTransferFlowContract$Step;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import e4k.e0;
import e4k.g0;
import ix0.x0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import klf.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import lk0.h;
import n4d.a0;
import o45.b1;
import o45.c0;
import o45.f0;
import o45.f1;
import o45.j0;
import o45.p0;
import o45.v0;
import o45.y0;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f211194b;

    public /* synthetic */ y(Object obj2, int i) {
        this.f211193a = i;
        this.f211194b = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:3:0x0013, B:4:0x0045, B:6:0x004b, B:23:0x0083, B:24:0x008e, B:25:0x008f, B:29:0x0099, B:33:0x00a7, B:37:0x00b6, B:41:0x00c5, B:45:0x00d4, B:49:0x00e2, B:48:0x00dd, B:44:0x00ce, B:40:0x00bf, B:36:0x00b0, B:32:0x00a2, B:27:0x0093, B:28:0x0096), top: B:57:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:3:0x0013, B:4:0x0045, B:6:0x004b, B:23:0x0083, B:24:0x008e, B:25:0x008f, B:29:0x0099, B:33:0x00a7, B:37:0x00b6, B:41:0x00c5, B:45:0x00d4, B:49:0x00e2, B:48:0x00dd, B:44:0x00ce, B:40:0x00bf, B:36:0x00b0, B:32:0x00a2, B:27:0x0093, B:28:0x0096), top: B:57:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:3:0x0013, B:4:0x0045, B:6:0x004b, B:23:0x0083, B:24:0x008e, B:25:0x008f, B:29:0x0099, B:33:0x00a7, B:37:0x00b6, B:41:0x00c5, B:45:0x00d4, B:49:0x00e2, B:48:0x00dd, B:44:0x00ce, B:40:0x00bf, B:36:0x00b0, B:32:0x00a2, B:27:0x0093, B:28:0x0096), top: B:57:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:3:0x0013, B:4:0x0045, B:6:0x004b, B:23:0x0083, B:24:0x008e, B:25:0x008f, B:29:0x0099, B:33:0x00a7, B:37:0x00b6, B:41:0x00c5, B:45:0x00d4, B:49:0x00e2, B:48:0x00dd, B:44:0x00ce, B:40:0x00bf, B:36:0x00b0, B:32:0x00a2, B:27:0x0093, B:28:0x0096), top: B:57:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:3:0x0013, B:4:0x0045, B:6:0x004b, B:23:0x0083, B:24:0x008e, B:25:0x008f, B:29:0x0099, B:33:0x00a7, B:37:0x00b6, B:41:0x00c5, B:45:0x00d4, B:49:0x00e2, B:48:0x00dd, B:44:0x00ce, B:40:0x00bf, B:36:0x00b0, B:32:0x00a2, B:27:0x0093, B:28:0x0096), top: B:57:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:3:0x0013, B:4:0x0045, B:6:0x004b, B:23:0x0083, B:24:0x008e, B:25:0x008f, B:29:0x0099, B:33:0x00a7, B:37:0x00b6, B:41:0x00c5, B:45:0x00d4, B:49:0x00e2, B:48:0x00dd, B:44:0x00ce, B:40:0x00bf, B:36:0x00b0, B:32:0x00a2, B:27:0x0093, B:28:0x0096), top: B:57:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:3:0x0013, B:4:0x0045, B:6:0x004b, B:23:0x0083, B:24:0x008e, B:25:0x008f, B:29:0x0099, B:33:0x00a7, B:37:0x00b6, B:41:0x00c5, B:45:0x00d4, B:49:0x00e2, B:48:0x00dd, B:44:0x00ce, B:40:0x00bf, B:36:0x00b0, B:32:0x00a2, B:27:0x0093, B:28:0x0096), top: B:57:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:3:0x0013, B:4:0x0045, B:6:0x004b, B:23:0x0083, B:24:0x008e, B:25:0x008f, B:29:0x0099, B:33:0x00a7, B:37:0x00b6, B:41:0x00c5, B:45:0x00d4, B:49:0x00e2, B:48:0x00dd, B:44:0x00ce, B:40:0x00bf, B:36:0x00b0, B:32:0x00a2, B:27:0x0093, B:28:0x0096), top: B:57:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0083 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.y.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        x08.f fVar;
        int i;
        String text;
        int i2;
        int i3;
        f1 f1Var;
        int i5;
        String text2;
        int i6;
        int i21;
        v0 v0Var;
        f0 f0Var;
        b1 b1Var;
        c0 c0Var;
        y0 y0Var;
        p0 p0Var;
        j0 j0Var;
        int i22 = this.f211193a;
        int i32 = 3;
        int i33 = 2;
        Object[] objArr = 0;
        int i43 = 10;
        int i59 = 1;
        Object obj3 = this.f211194b;
        switch (i22) {
            case 0:
                return Float.valueOf(TextFieldScrollKt.textFieldScrollable$lambda$1$0$0((TextFieldScrollerPosition) obj3, ((Float) obj2).floatValue()));
            case 1:
                com.revolut.feature.freelancer.impl.ui.sales.details.kompot.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.flow.a) obj3;
                o17.l result = (o17.l) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, o17.l.f221326a)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.D2(aVar.f74117p);
                return Unit.f186387a;
            case 2:
                jt0.b bVar = (jt0.b) obj3;
                ybl.b bVar2 = (ybl.b) bVar.d;
                o18.e feed = (o18.e) obj2;
                Intrinsics.checkNotNullParameter(feed, "feed");
                ArrayList arrayList = feed.f221351a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((o18.d) it8.next()).f);
                }
                List listU = d0.U(arrayList2);
                return nim.a.v(u0.m(((ael.k) bVar2).l(d0.i1(listU)), new vkm.v(rd0.e.b(ybl.b.a(bVar2, listU)), new w1(i33, 9, null))), new y(bVar, feed, i32));
            case 3:
                o18.e eVar = (o18.e) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                int iB = q0.b(zhm.w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list2) {
                    linkedHashMap.put(((InstrumentTicker) obj4).f105112b, obj4);
                }
                List list3 = list;
                int iB2 = q0.b(zhm.w.t(list3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj5 : list3) {
                    linkedHashMap2.put(((nel.n) obj5).f214596b, obj5);
                }
                ArrayList<o18.d> arrayList3 = eVar.f221351a;
                ArrayList arrayList4 = new ArrayList();
                for (o18.d dVar : arrayList3) {
                    nel.n nVar = (nel.n) linkedHashMap2.get(dVar.f);
                    if (nVar != null) {
                        String str = dVar.f221347a;
                        x08.c cVar = dVar.f221348b;
                        Instant instant = dVar.f221349c;
                        String str2 = dVar.d;
                        String str3 = dVar.e;
                        String str4 = dVar.f;
                        fVar = new x08.f(str, cVar, instant, str2, str3, new x08.d(str4, nVar.e, (InstrumentTicker) linkedHashMap.get(str4), dVar.f221350g));
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        arrayList4.add(fVar);
                    }
                }
                return arrayList4;
            case 4:
                n1g.r rVar = (n1g.r) obj3;
                TravelExperiencesCancellationScreenContract$OutputData output = (TravelExperiencesCancellationScreenContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output.f93031a) {
                    rVar.l2(new n1g.m(rVar, null, i59), new yi5.b(26));
                }
                return Unit.f186387a;
            case 5:
                return n1j.m.e((n1j.m) obj2, null, null, (n1j.r) obj3, null, null, null, null, null, null, 507);
            case 6:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new n1j.s(n1j.d0.a(), null, r1j.a.a((n1j.m) obj3), null);
            case 7:
                SpareChangeRefundQuote spareChangeRefundQuote = (SpareChangeRefundQuote) obj3;
                Data spareChangeRefund = zi0.c.P(new SpareChangeRefund("", m1c.w1.NOT_REQUESTED, spareChangeRefundQuote.f84093a, spareChangeRefundQuote.f84094b, null, null, null), false, null, 3);
                ((n2c.b) obj2).getClass();
                Intrinsics.checkNotNullParameter(spareChangeRefund, "spareChangeRefund");
                return new n2c.b(spareChangeRefund, spareChangeRefundQuote);
            case 8:
                n2j.c cVar2 = (n2j.c) obj3;
                e16.d account = (e16.d) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                ArrayList<e16.g> arrayListL = foh.i.l(account, h0.f322473a);
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayListL, 10));
                for (e16.g gVar : arrayListL) {
                    arrayList5.add(n14.k.p(nim.a.v(cVar2.f211560b.a(gVar.f121894a.f71635a, w4l.j.f294644c), new n09.j0(cVar2, gVar, account.f121890b)), new n1j.t(i)));
                }
                return arrayList5.isEmpty() ? zi0.c.i(zhm.f0.f322471a) : nim.a.v(u0.k(arrayList5), new n1j.t(15));
            case 9:
                n2j.e eVar2 = (n2j.e) obj3;
                m1c.z status = (m1c.z) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                m1c.y yVar = status instanceof m1c.y ? (m1c.y) status : null;
                m1c.x xVar = yVar != null ? yVar.f201475a : null;
                if (xVar != null) {
                    dj0.d dVar2 = xVar.f201472c.f83960a;
                    if (xVar.f201471b == m1c.w.ACTIVE) {
                        dj0.d.Companion.getClass();
                        if (!dVar2.i(dj0.d.e)) {
                            return new m2j.b(new k1j.b(k1j.c.REV_POINTS, new TextLocalisedClause(R$string.balance_picker_rev_points_header, null, null, 14), zhm.u.c(new BalanceWrapper.RevPointsAccountBalanceWrapper(dVar2, xVar.f201470a, eVar2.f211565b.b(new TextLocalisedClause(R$string.balance_picker_rev_points_item_title, null, null, 14)).toString())), 4));
                        }
                    }
                }
                return m2j.a.f202010a;
            case 10:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return rd0.e.c(nim.a.v(((hc5.a) ((k18.c) obj3).d).a(w4l.h.f294642c), new n33.a((l71.d) pair2.f186385a, (do3.n) pair2.f186386b, objArr == true ? 1 : 0)), kotlin.coroutines.g.f186406a);
            case 11:
                n3e.g gVar2 = (n3e.g) obj3;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                StorePurchasesResponse storePurchasesResponse = (StorePurchasesResponse) data.getContent();
                List list4 = storePurchasesResponse != null ? storePurchasesResponse.f88589a : null;
                if (list4 == null) {
                    list4 = zhm.f0.f322471a;
                }
                return new lk0.e(list4, gVar2, data.getLoading(), null, data.getError(), 8);
            case 12:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new la8.j((n3e.c) obj3, pagedData, 24), 2);
            case 13:
                KProperty[] kPropertyArr = StoreOrdersSeeAllScreen.U;
                com.revolut.feature.store.impl.ui.orders.see_all.a aVar2 = (com.revolut.feature.store.impl.ui.orders.see_all.a) ((StoreOrdersSeeAllScreen) obj3).d();
                aVar2.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                if (aVar2.f88719r instanceof StoreOrdersSeeAllContract$InputData.Orders) {
                    aVar2.f88720s.onNext(event);
                }
                return Unit.f186387a;
            case 14:
                return n3j.n.a((n3j.n) obj2, null, (n61.c) obj3, 0, null, null, 61);
            case 15:
                r45.a aVar3 = ((n45.c) obj3).f212297c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM loans");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "disbursalDate");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "finalRepaymentDate");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "countryCode");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "principal");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "outstandingPrincipal");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "outstandingRescheduledPrincipal");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fixedOutstandingBalance");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalRepaid");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalToRepay");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fractionRepaid");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repaidCount");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remainingTerm");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interestRate");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextInstalment");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastPaidRepayment");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "config");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refurbishment");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interestOnly");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "insuranceState");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        LocalDate localDateC = r45.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        LocalDate localDateC2 = r45.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                        Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                        long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                        long j16 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                        double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow13);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                            i = columnIndexOrThrow;
                            text = null;
                        } else {
                            i = columnIndexOrThrow;
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                        }
                        if (text != null) {
                            i2 = columnIndexOrThrow2;
                            Json jsonA = h55.b.a();
                            jsonA.getClass();
                            i3 = columnIndexOrThrow3;
                            f1Var = (f1) jsonA.b(nlm.a.c(f1.INSTANCE.serializer()), text);
                        } else {
                            i2 = columnIndexOrThrow2;
                            i3 = columnIndexOrThrow3;
                            f1Var = null;
                        }
                        int i66 = columnIndexOrThrow15;
                        String text7 = sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66);
                        int i74 = columnIndexOrThrow4;
                        int i92 = columnIndexOrThrow16;
                        int i96 = (int) sQLiteStatementPrepare.getLong(i92);
                        columnIndexOrThrow16 = i92;
                        int i99 = columnIndexOrThrow17;
                        int i100 = (int) sQLiteStatementPrepare.getLong(i99);
                        int i101 = columnIndexOrThrow18;
                        if (sQLiteStatementPrepare.isNull(i101)) {
                            i5 = i66;
                            text2 = null;
                        } else {
                            i5 = i66;
                            text2 = sQLiteStatementPrepare.getText(i101);
                        }
                        if (text2 != null) {
                            i6 = i100;
                            Json jsonA2 = h55.b.a();
                            jsonA2.getClass();
                            i21 = i101;
                            v0Var = (v0) jsonA2.b(nlm.a.c(v0.Companion.serializer()), text2);
                        } else {
                            i6 = i100;
                            i21 = i101;
                            v0Var = null;
                        }
                        int i102 = columnIndexOrThrow19;
                        String text8 = sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102);
                        if (text8 != null) {
                            Json jsonA3 = h55.b.a();
                            jsonA3.getClass();
                            columnIndexOrThrow19 = i102;
                            f0Var = (f0) jsonA3.b(nlm.a.c(f0.Companion.serializer()), text8);
                        } else {
                            columnIndexOrThrow19 = i102;
                            f0Var = null;
                        }
                        int i103 = columnIndexOrThrow20;
                        String text9 = sQLiteStatementPrepare.isNull(i103) ? null : sQLiteStatementPrepare.getText(i103);
                        if (text9 != null) {
                            Json jsonA4 = h55.b.a();
                            jsonA4.getClass();
                            columnIndexOrThrow20 = i103;
                            b1Var = (b1) jsonA4.b(nlm.a.c(b1.Companion.serializer()), text9);
                        } else {
                            columnIndexOrThrow20 = i103;
                            b1Var = null;
                        }
                        int i104 = columnIndexOrThrow21;
                        String text10 = sQLiteStatementPrepare.isNull(i104) ? null : sQLiteStatementPrepare.getText(i104);
                        if (text10 != null) {
                            Json jsonA5 = h55.b.a();
                            jsonA5.getClass();
                            columnIndexOrThrow21 = i104;
                            c0Var = (c0) jsonA5.b(nlm.a.c(c0.Companion.serializer()), text10);
                        } else {
                            columnIndexOrThrow21 = i104;
                            c0Var = null;
                        }
                        int i105 = columnIndexOrThrow22;
                        String text11 = sQLiteStatementPrepare.isNull(i105) ? null : sQLiteStatementPrepare.getText(i105);
                        if (text11 != null) {
                            Json jsonA6 = h55.b.a();
                            jsonA6.getClass();
                            columnIndexOrThrow22 = i105;
                            y0Var = (y0) jsonA6.b(nlm.a.c(y0.Companion.serializer()), text11);
                        } else {
                            columnIndexOrThrow22 = i105;
                            y0Var = null;
                        }
                        int i106 = columnIndexOrThrow23;
                        String text12 = sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106);
                        if (text12 != null) {
                            Json jsonA7 = h55.b.a();
                            jsonA7.getClass();
                            columnIndexOrThrow23 = i106;
                            p0Var = (p0) jsonA7.b(nlm.a.c(p0.Companion.serializer()), text12);
                        } else {
                            columnIndexOrThrow23 = i106;
                            p0Var = null;
                        }
                        int i107 = columnIndexOrThrow24;
                        String text13 = sQLiteStatementPrepare.isNull(i107) ? null : sQLiteStatementPrepare.getText(i107);
                        if (text13 != null) {
                            Json jsonA8 = h55.b.a();
                            jsonA8.getClass();
                            columnIndexOrThrow24 = i107;
                            j0Var = (j0) jsonA8.b(nlm.a.c(j0.INSTANCE.serializer()), text13);
                        } else {
                            columnIndexOrThrow24 = i107;
                            j0Var = null;
                        }
                        arrayList6.add(new o45.w1(text3, text4, localDateC, localDateC2, text5, text6, j2, j3, lValueOf, lValueOf2, j5, j16, d, f1Var, text7, i96, i6, v0Var, f0Var, b1Var, c0Var, y0Var, p0Var, j0Var));
                        columnIndexOrThrow17 = i99;
                        columnIndexOrThrow2 = i2;
                        columnIndexOrThrow = i;
                        columnIndexOrThrow3 = i3;
                        columnIndexOrThrow4 = i74;
                        columnIndexOrThrow15 = i5;
                        columnIndexOrThrow18 = i21;
                        break;
                    }
                    return arrayList6;
                } finally {
                }
            case 16:
                WhoToTransferActionItem action = (WhoToTransferActionItem) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                return ((n4a.e) obj3).c(action);
            case 17:
                ((n4d.x) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM plain_multiple_watchlists_items WHERE sync_state != 'SYNCED'");
                try {
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "watchlist_id");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "asset_type_key");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "from_code");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "to_code");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "added_time");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "sync_state");
                    ArrayList arrayList7 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text14 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow25);
                        String text15 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow26);
                        String text16 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow27);
                        String text17 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow28);
                        Long lValueOf3 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow29) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow29));
                        arrayList7.add(new o4d.d(text14, text15, text16, text17, lValueOf3 != null ? Instant.ofEpochMilli(lValueOf3.longValue()).atZone(ZoneOffset.UTC) : null, sQLiteStatementPrepare2.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow30)));
                        break;
                    }
                    return arrayList7;
                } finally {
                }
            case 18:
                com.revolut.feature.travel.flights.impl.ui.flow.root.a aVar4 = (com.revolut.feature.travel.flights.impl.ui.flow.root.a) obj3;
                yki.a aVar5 = aVar4.f93236p;
                q5g.x outputData = (q5g.x) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof q5g.v) {
                    aVar4.o = ((q5g.v) outputData).f242394a.f93433a;
                    TravelFlightsHomeFlowContract$PagerItem travelFlightsHomeFlowContract$PagerItem = TravelFlightsHomeFlowContract$PagerItem.BOOKINGS;
                    oki.h.r2(aVar5);
                    oki.h.t2(aVar4, aVar5, new TravelFlightsFlowContract$Step.Home(travelFlightsHomeFlowContract$PagerItem), false, null, false, 12);
                } else {
                    if (!Intrinsics.f(outputData, q5g.w.f242395a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TravelFlightsHomeFlowContract$PagerItem travelFlightsHomeFlowContract$PagerItem2 = TravelFlightsHomeFlowContract$PagerItem.DISCOVER;
                    oki.h.r2(aVar5);
                    oki.h.t2(aVar4, aVar5, new TravelFlightsFlowContract$Step.Home(travelFlightsHomeFlowContract$PagerItem2), false, null, false, 12);
                }
                return Unit.f186387a;
            case 19:
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c cVar3 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c) obj3;
                g0 output2 = (g0) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof e4k.d0) {
                    cVar3.C2(d2k.b.f110872a);
                } else if (output2 instanceof e0) {
                    e0 e0Var = (e0) output2;
                    cVar3.I2(e0Var.f122589a, e0Var.f122590b, true);
                } else {
                    if (!(output2 instanceof e4k.f0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e4k.f0 f0Var2 = (e4k.f0) output2;
                    oki.h.t2(cVar3, cVar3.u, new BankTransferFlowContract$Step.AddressUpdate(f0Var2.f122594b, f0Var2.f122593a), true, null, false, 12);
                }
                return Unit.f186387a;
            case 20:
                String url2 = (String) obj2;
                Intrinsics.checkNotNullParameter(url2, "url");
                rfm.m mVar = new rfm.m(((n52.c) obj3).f212537b.a(url2), new a0(new n4d.d0(5), i43), 1);
                ufm.b bVarM = efm.d0.m(new FeatureCommand(new IDealFeatureConfig(new IDealFlowDestination(IDealFlowDestination.StartType.SuccessQrAuth.f62837a))));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                int i108 = 6;
                ufm.i iVar = new ufm.i(mVar.l(bVarM), new a0(new n4d.d0(i108), i108), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 21:
                n5k.r rVar2 = (n5k.r) obj3;
                dii.g output3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof dii.c) {
                    Object obj6 = ((dii.c) output3).f115066a.d;
                    if (obj6 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                        rVar2.A2(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj6).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                    }
                }
                return Unit.f186387a;
            case 22:
                n60.b bVar3 = (n60.b) obj3;
                WindowInsets newInsets = (WindowInsets) obj2;
                Intrinsics.checkNotNullParameter(newInsets, "newInsets");
                int iB3 = x0.b(newInsets);
                if (iB3 > 0) {
                    bVar3.e = Integer.valueOf(iB3);
                }
                bVar3.d.onNext(Boolean.valueOf(iB3 > 0));
                return Unit.f186387a;
            case 23:
                n68.k update = (n68.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n68.k.c(update, null, null, ((j68.f) ((j68.g) obj3)).f171690a, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 24:
                n68.k update2 = (n68.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                l68.f fVar2 = (l68.f) ((l68.g) obj3);
                return n68.k.c(update2, fVar2.f192364a, fVar2.f192365b, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 25:
                n6e.b bVar4 = (n6e.b) obj3;
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list5 = (List) pair3.f186385a;
                Map map = (Map) pair3.f186386b;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj7 : list5) {
                    Subaccount subaccount = (Subaccount) obj7;
                    bVar4.getClass();
                    if (n6e.b.d(subaccount) && subaccount.getPocketId() != null) {
                        arrayList8.add(obj7);
                    }
                }
                int iB4 = q0.b(zhm.w.t(arrayList8, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB4 >= 16 ? iB4 : 16);
                for (Object obj8 : arrayList8) {
                    Subaccount subaccount2 = (Subaccount) obj8;
                    String pocketId = subaccount2.getPocketId();
                    if (pocketId == null) {
                        throw new IllegalArgumentException(("Inconsistent subaccount " + subaccount2).toString());
                    }
                    linkedHashMap3.put(pocketId, obj8);
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it10 = arrayList8.iterator();
                while (it10.hasNext()) {
                    String pocketId2 = ((Subaccount) it10.next()).getPocketId();
                    io3.d dVar3 = pocketId2 != null ? (io3.d) map.get(pocketId2) : null;
                    if (dVar3 != null) {
                        arrayList9.add(dVar3);
                    }
                }
                return bVar4.b(arrayList9, linkedHashMap3, true);
            case 26:
                return a(obj2);
            case 27:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                oki.h.D2(((com.revolut.feature.subaccount.impl.ui.add_money.flow.b) obj3).f88997s);
                return Boolean.TRUE;
            case 28:
                t7h.d params = (t7h.d) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (WealthMarginBorrowingInterest) ((ne0.j) ((lal.a) obj3).f193427c).get("margin_borrowing_interest_" + params.f268698a + "_" + params.f268699b);
            default:
                t7h.s params2 = (t7h.s) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                ne0.j jVar = ((n7h.b) obj3).f213094b;
                n7h.b.Companion.getClass();
                return (WealthMarginStatus) jVar.get(n7h.a.a(params2));
        }
    }

    public /* synthetic */ y(Object obj2, Object obj3, int i) {
        this.f211193a = i;
        this.f211194b = obj3;
    }
}
