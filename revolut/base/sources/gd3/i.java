package gd3;

import android.net.Uri;
import androidx.collection.ArrayMap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import aw0.y4;
import ckd.o;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.la;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.feature.insurance_car.impl.data.model.MtaCreateResult;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$State;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$Step;
import com.revolut.retail.feature.esim.impl.R$string;
import cp6.e;
import f0d.m;
import g4b.a0;
import g9j.v;
import gig.t;
import hx7.l;
import ip0.pc0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kl7.a1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import le.u1;
import sh1.n;
import vkm.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143061b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f143060a = i;
        this.f143061b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object gVar;
        y yVarE;
        String text;
        int i;
        int i2;
        Integer numValueOf;
        int i3;
        String text2;
        int i5;
        int i6;
        hi9.c cVar;
        int i21;
        String text3;
        int i22;
        PhotoBannerLargeDelegate.Model.Background video;
        int i32 = this.f143060a;
        int i33 = 23;
        int i43 = 3;
        int i59 = 2;
        Continuation continuation = null;
        Object obj3 = this.f143061b;
        switch (i32) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (uc3.f) ((k) obj3).f143063b.get("KEY_CASHBACK_STATUS");
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (List) ((gd8.c) obj3).f143079c.get("CACHE_KEY_JUNIOR_CONSENTS_TRACK");
            case 2:
                gd8.h hVar = (gd8.h) obj3;
                gd8.g gVar2 = (gd8.g) obj2;
                Intrinsics.checkNotNullParameter(gVar2, "<destruct>");
                String str = gVar2.f143083a;
                wc8.a aVar = gVar2.f143084b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                pfm.h hVar2 = new pfm.h(hVar.f143085a.trackConsentPromptState(str, new ad8.b(u1.g(aVar, l.k()), jCurrentTimeMillis)).B().l(2L, mfm.f.f205044g), 3);
                pfm.h hVar3 = new pfm.h(new m(hVar, str, i33), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                pfm.a aVar2 = new pfm.a(hVar2.e(hVar3), new v(new e1.e(hVar, str, aVar, jCurrentTimeMillis, 1), i33), i59);
                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                return ue0.e.v(aVar2).D(Unit.f186387a);
            case 3:
                ge1.f update = (ge1.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b) obj3).f60778q.getClass();
                return ge1.f.a(update, null, null, 3);
            case 4:
                return (ge1.f) obj3;
            case 5:
                ge5.g gVar3 = (ge5.g) obj3;
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSet = config.M;
                xi0.a aVar3 = xi0.b.Companion;
                ArrayList arrayList = new ArrayList(w.t(linkedHashSet, 10));
                Iterator it10 = linkedHashSet.iterator();
                while (it10.hasNext()) {
                    t61.a.A(aVar3, (String) it10.next(), arrayList);
                }
                Collection[] elements = {arrayList, config.T};
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList arrayListU = w.u(kotlin.collections.d.L(elements));
                Set setC = gVar3.f143229b.c(td0.a.LISTED);
                ArrayList arrayList2 = new ArrayList(w.t(setC, 10));
                Iterator it11 = setC.iterator();
                while (it11.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList2);
                }
                Set setJ1 = d0.j1(arrayListU, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : setJ1) {
                    xi0.b bVar = (xi0.b) obj4;
                    if (cp5.d.z(bVar) || cp5.d.A(bVar)) {
                        arrayList3.add(obj4);
                    }
                }
                return d0.i1(arrayList3);
            case 6:
                return geg.d.a((geg.d) obj2, new Data((afi.a) obj3, null, false, 6, null));
            case 7:
                yg3.c details = (yg3.c) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                bil.a aVar4 = ((gh3.l) obj3).f143847q;
                List<zg3.b> blocks = details.f313503b;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(blocks, "blocks");
                if (blocks.isEmpty()) {
                    gVar = new go.g(f0.f322471a, 2);
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (zg3.b bVar2 : blocks) {
                        Object obj5 = aVar4.f15531a.get(bVar2.getClass());
                        hh3.f fVar = obj5 instanceof hh3.f ? (hh3.f) obj5 : null;
                        if (fVar == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("No block provider found for block " + bVar2);
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            yVarE = null;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        } else {
                            yVarE = rd0.e.e(new a0(fVar.a(bVar2), 15), h0.f322473a, new g23.j(i43, 25, null));
                        }
                        if (yVarE != null) {
                            arrayList4.add(yVarE);
                        }
                    }
                    gVar = arrayList4.isEmpty() ? new go.g(f0.f322471a, 2) : new ag1.k((Flow[]) d0.d1(arrayList4).toArray(new Flow[0]), 24);
                }
                return new et6.u1(gVar, details, 29);
            case 8:
                com.revolut.feature.junior_graduation.impl.ui.screen.identification.a aVar5 = (com.revolut.feature.junior_graduation.impl.ui.screen.identification.a) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    aVar5.l2(new gh8.l(aVar5, null, i59), new yi5.b(26));
                } else if (!(result instanceof dii.f)) {
                    if (!(result instanceof dii.b) && !(result instanceof dii.c) && !(result instanceof dii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unhandled action bottom sheet result: " + result);
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                }
                return Unit.f186387a;
            case 9:
                ghg.g update2 = (ghg.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ghg.g.a(update2, new ghg.i(((ehg.e) obj3).f126188a), null, null, null, null, false, false, 126);
            case 10:
                String collectionKey = (String) obj2;
                Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                return (fel.c) ((ghl.b) obj3).f143998b.get(ghl.b.a(collectionKey));
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) ((ghl.e) obj3).f144003b.get("ALL_SCREENER_COLLECTIONS");
            case 12:
                List instrumentTypes = (List) obj2;
                Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
                return (zel.e) ((ghl.g) obj3).f144006b.get(ghl.g.a(instrumentTypes));
            case 13:
                ghl.j jVar = (ghl.j) obj3;
                shl.a params = (shl.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (zel.h) jVar.f144009b.get(jVar.d.a(params));
            case 14:
                return ghl.m.a((ghl.m) obj3, (String) obj2);
            case 15:
                gi1.k update3 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return gi1.k.a(update3, null, null, null, null, false, null, null, null, null, null, (n) obj3, 32767);
            case 16:
                gi1.k update4 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return gi1.k.a(update4, (sh1.h) obj3, null, null, null, false, null, null, null, null, null, null, 65534);
            case 17:
                gi1.k update5 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return gi1.k.a(update5, sh1.h.a(update5.f144028a, null, new sh1.g(((bi1.c) obj3).f15371a, null, 6), null, null, null, null, null, null, null, null, null, null, 8187), null, null, null, true, null, null, null, null, null, null, 65518);
            case 18:
                gi1.k update6 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return gi1.k.a(update6, null, null, ((hi1.d) ((hi1.e) obj3)).f152446a, null, false, null, null, null, null, null, null, 65531);
            case 19:
                gi9.c cVar2 = (gi9.c) obj3;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM plans");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "facilityId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantName");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantLogoUrl");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantLogoName");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantCategory");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startDateTime");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateDateTime");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidAmount");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remainingAmount");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "revPoints");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fee");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isLimitWithdrawn");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feeType");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "origin");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "countryCode");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instalmentType");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "termFeeRate");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minFeeAmount");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancellationOrigin");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rescheduleCount");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "withdrawalTransactionId");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feeDetails");
                    ArrayMap arrayMap = new ArrayMap();
                    int i66 = columnIndexOrThrow12;
                    ArrayMap arrayMap2 = new ArrayMap();
                    while (sQLiteStatementPrepare.step()) {
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                            i21 = columnIndexOrThrow11;
                            text3 = null;
                        } else {
                            i21 = columnIndexOrThrow11;
                            text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        }
                        if (text3 == null || arrayMap.containsKey(text3)) {
                            i22 = columnIndexOrThrow10;
                        } else {
                            i22 = columnIndexOrThrow10;
                            arrayMap.put(text3, new ArrayList());
                        }
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        if (text4 != null) {
                            arrayMap2.put(text4, null);
                        }
                        columnIndexOrThrow10 = i22;
                        columnIndexOrThrow11 = i21;
                    }
                    int i74 = columnIndexOrThrow11;
                    int i92 = columnIndexOrThrow10;
                    sQLiteStatementPrepare.reset();
                    cVar2.b(sQLiteConnection, arrayMap);
                    cVar2.a(sQLiteConnection, arrayMap2);
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                        int i96 = i92;
                        long j5 = sQLiteStatementPrepare.getLong(i96);
                        int i99 = i74;
                        long j16 = sQLiteStatementPrepare.getLong(i99);
                        int i100 = i66;
                        long j22 = sQLiteStatementPrepare.getLong(i100);
                        int i101 = columnIndexOrThrow2;
                        int i102 = columnIndexOrThrow13;
                        Long lValueOf = sQLiteStatementPrepare.isNull(i102) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i102));
                        columnIndexOrThrow13 = i102;
                        int i103 = columnIndexOrThrow14;
                        long j42 = sQLiteStatementPrepare.getLong(i103);
                        columnIndexOrThrow14 = i103;
                        int i104 = columnIndexOrThrow15;
                        String text12 = sQLiteStatementPrepare.isNull(i104) ? null : sQLiteStatementPrepare.getText(i104);
                        columnIndexOrThrow15 = i104;
                        int i105 = columnIndexOrThrow16;
                        if (sQLiteStatementPrepare.isNull(i105)) {
                            text = null;
                            columnIndexOrThrow16 = i105;
                            i92 = i96;
                        } else {
                            text = sQLiteStatementPrepare.getText(i105);
                            i92 = i96;
                            columnIndexOrThrow16 = i105;
                        }
                        int i106 = columnIndexOrThrow17;
                        int i107 = columnIndexOrThrow3;
                        boolean z = ((int) sQLiteStatementPrepare.getLong(i106)) != 0;
                        int i108 = columnIndexOrThrow18;
                        String text13 = sQLiteStatementPrepare.isNull(i108) ? null : sQLiteStatementPrepare.getText(i108);
                        int i109 = columnIndexOrThrow19;
                        String text14 = sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109);
                        int i110 = columnIndexOrThrow20;
                        String text15 = sQLiteStatementPrepare.isNull(i110) ? null : sQLiteStatementPrepare.getText(i110);
                        columnIndexOrThrow20 = i110;
                        int i111 = columnIndexOrThrow21;
                        String text16 = sQLiteStatementPrepare.isNull(i111) ? null : sQLiteStatementPrepare.getText(i111);
                        columnIndexOrThrow21 = i111;
                        int i112 = columnIndexOrThrow22;
                        String text17 = sQLiteStatementPrepare.isNull(i112) ? null : sQLiteStatementPrepare.getText(i112);
                        columnIndexOrThrow22 = i112;
                        int i113 = columnIndexOrThrow23;
                        long j46 = sQLiteStatementPrepare.getLong(i113);
                        columnIndexOrThrow23 = i113;
                        int i114 = columnIndexOrThrow24;
                        String text18 = sQLiteStatementPrepare.isNull(i114) ? null : sQLiteStatementPrepare.getText(i114);
                        columnIndexOrThrow24 = i114;
                        int i115 = columnIndexOrThrow25;
                        if (sQLiteStatementPrepare.isNull(i115)) {
                            i = i108;
                            i2 = i109;
                            numValueOf = null;
                        } else {
                            i = i108;
                            i2 = i109;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i115));
                        }
                        int i116 = columnIndexOrThrow26;
                        String text19 = sQLiteStatementPrepare.isNull(i116) ? null : sQLiteStatementPrepare.getText(i116);
                        int i117 = columnIndexOrThrow27;
                        if (sQLiteStatementPrepare.isNull(i117)) {
                            i3 = i115;
                            text2 = null;
                        } else {
                            i3 = i115;
                            text2 = sQLiteStatementPrepare.getText(i117);
                        }
                        if (text2 != null) {
                            i5 = i116;
                            Json json = (Json) bj9.a.f15588a.getValue();
                            json.getClass();
                            i6 = i117;
                            cVar = (hi9.c) json.b(nlm.a.c(hi9.c.INSTANCE.serializer()), text2);
                        } else {
                            i5 = i116;
                            i6 = i117;
                            cVar = null;
                        }
                        hi9.k kVar = new hi9.k(text5, text6, text7, text8, text9, text10, text11, j2, j3, j5, j16, j22, lValueOf, j42, text12, text, z, text13, text14, text15, text16, text17, j46, text18, numValueOf, text19, cVar);
                        String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        ArrayList arrayList6 = text20 != null ? (ArrayList) arrayMap.get(text20) : new ArrayList();
                        String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        ArrayMap arrayMap3 = arrayMap;
                        arrayList5.add(new ki9.a(kVar, arrayList6, text21 != null ? (hi9.l) arrayMap2.get(text21) : null));
                        columnIndexOrThrow3 = i107;
                        columnIndexOrThrow17 = i106;
                        columnIndexOrThrow18 = i;
                        columnIndexOrThrow19 = i2;
                        arrayMap = arrayMap3;
                        columnIndexOrThrow25 = i3;
                        columnIndexOrThrow2 = i101;
                        columnIndexOrThrow26 = i5;
                        columnIndexOrThrow27 = i6;
                        i74 = i99;
                        i66 = i100;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList5;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 20:
                gig.g update7 = (gig.g) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                Data recommendedFlightsData = update7.f144189a;
                Data milesProviderData = update7.f144190b;
                Intrinsics.checkNotNullParameter(recommendedFlightsData, "recommendedFlightsData");
                Intrinsics.checkNotNullParameter(milesProviderData, "milesProviderData");
                return new gig.g(recommendedFlightsData, milesProviderData, (hfg.y) obj3);
            case 21:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ((t) obj3).a();
            case 22:
                ggk.a family = (ggk.a) obj2;
                Intrinsics.checkNotNullParameter(family, "family");
                return nim.a.v(rd0.e.b(yoj.b.s(si7.a.d(((gkk.k) obj3).f144426s, family.f143697a), InsuranceDocumentsAvailability.Unavailable.f74931a)), new i(family, i33));
            case 23:
                InsuranceDocumentsAvailability it13 = (InsuranceDocumentsAvailability) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Pair((ggk.a) obj3, it13);
            case 24:
                List tiles = (List) obj2;
                Intrinsics.checkNotNullParameter(tiles, "tiles");
                hld.c cVar3 = ((gld.a0) obj3).e;
                List list = tiles;
                if (list == null || list.isEmpty()) {
                    return f0.f322471a;
                }
                List<o> list2 = tiles;
                ArrayList arrayList7 = new ArrayList(w.t(list2, 10));
                for (o oVar : list2) {
                    f01.a aVar6 = cVar3.f153441a;
                    ckd.e eVar = oVar.f24816b;
                    ckd.n nVar = oVar.f24815a;
                    int iA = aVar6.a(eVar.d.f24806a.f24810a);
                    Integer numValueOf2 = Integer.valueOf(iA);
                    if (iA == 0) {
                        numValueOf2 = null;
                    }
                    int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : R$drawable.uikit_icn_24_lightbulb;
                    String str2 = nVar.f24812a;
                    String str3 = nVar.f24813b;
                    if (str2.length() == 0) {
                        str2 = str3;
                    }
                    String str4 = "cross_sell_tiles_scroller " + ((Object) str2);
                    TextClause textClause = new TextClause(eVar.f24802a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str5 = eVar.f24803b;
                    TextClause textClause2 = str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    String str6 = eVar.f24804c;
                    int i118 = hld.b.f153440a[uld.b.a(str6).ordinal()];
                    if (i118 == 1) {
                        Uri uri2 = Uri.parse(str6);
                        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                        video = new PhotoBannerLargeDelegate.Model.Background.Video(new UriVideo(uri2, (Uri) null, false, (oz0.b) null, (Boolean) null, (oz0.c) null, 126), null);
                    } else {
                        if (i118 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        video = new PhotoBannerLargeDelegate.Model.Background.Image(new UrlImage(str6, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
                    }
                    PhotoBannerLargeDelegate.Model model = new PhotoBannerLargeDelegate.Model(str4, textClause, textClause2, video, new la(iIntValue, new TextClause(eVar.d.f24807b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), a0.d.r(str3, "_cta")), true, oVar, 384);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList7.add(model);
                }
                aw0.d0.Companion.getClass();
                return u.c(new hg("cross_sell_tiles_scroller", arrayList7, 1, new y4(aw0.d0.f10273c), null, new gg.b(tiles.size() > 1, 2), false, false, new pc0(cVar3.f153442b), null, 0, 0, 0, 0, 32208));
            case 25:
                gld.f0 f0Var = (gld.f0) obj3;
                cp6.e result2 = (cp6.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof e.a) {
                    cp6.d dVar = ((e.a) result2).f107881a;
                    if (dVar instanceof cp6.c) {
                        yji.n.l2(f0Var, f0Var.L2(new mii.k("fincrime_nps_comment_success", ((cp6.c) dVar).f107880a, null, null, null, 28)), null, null, 7);
                    }
                } else if (!Intrinsics.f(result2, e.b.f107882a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 26:
                gm5.e eVar2 = (gm5.e) obj3;
                yja.b output = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                int i119 = gm5.c.f144759a[output.ordinal()];
                if (i119 == 1 || i119 == 2) {
                    eVar2.f3(gm5.a.CANCELLED);
                } else {
                    if (i119 != 3 && i119 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar2.getClass();
                    eVar2.T2(new ge7.f(eVar2, continuation, 17), new yi5.b(27));
                }
                return Unit.f186387a;
            case 27:
                com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar3 = (com.revolut.feature.insurance_car.impl.ui.flow.mta.b) obj3;
                MtaCreateResult mtaCreateResult = (MtaCreateResult) obj2;
                Intrinsics.checkNotNullParameter(mtaCreateResult, "mtaCreateResult");
                if (mtaCreateResult instanceof MtaCreateResult.Decline) {
                    bVar3.P2(new MtaFlowContract$Step.Review(mtaCreateResult));
                } else {
                    if (!(mtaCreateResult instanceof MtaCreateResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((MtaFlowContract$State) bVar3.A2().f98429a).f75363a == a1.ADDITIONAL_DRIVER_ADD) {
                        bVar3.P2(new MtaFlowContract$Step.ProofOfDrivingNumber(((MtaCreateResult.Success) mtaCreateResult).f75250c, mtaCreateResult));
                    } else {
                        bVar3.P2(new MtaFlowContract$Step.Review(mtaCreateResult));
                    }
                }
                return Unit.f186387a;
            case 28:
                List<vel.f> assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                ((gmh.h) obj3).getClass();
                ArrayList arrayList8 = new ArrayList();
                for (vel.f fVar2 : assets) {
                    vel.d dVar2 = fVar2 instanceof vel.d ? (vel.d) fVar2 : null;
                    jih.a aVar7 = dVar2 == null ? null : new jih.a(dVar2.f288352a, dVar2);
                    if (aVar7 != null) {
                        arrayList8.add(aVar7);
                    }
                }
                return arrayList8;
            default:
                gmj.i iVar = (gmj.i) obj3;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                iVar.f144872q.getClass();
                iVar.X1(new mii.h(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_label_error_title, null, null, 14), "ID_PHONE_NUMBER_LABEL_UPDATE_ERROR"));
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var3);
                return Boolean.TRUE;
        }
    }
}
