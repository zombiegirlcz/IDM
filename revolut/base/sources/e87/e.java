package e87;

import com.revolut.data.model.Data;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.PersonalDetailsFlowContract$Step;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$PagerItem;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.youTransactor.uCube.rpc.Constants;
import e8e.j;
import e8e.k;
import e8h.c0;
import e8h.p0;
import e8h.y;
import eac.m;
import eaf.r;
import eg2.u;
import ft3.a1;
import ft3.j1;
import grl.r2;
import hg4.n;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import m1c.x0;
import md6.s;
import org.jmrtd.lds.LDSFile;
import qua.p;
import vb3.l;
import xzg.o;
import y7k.x;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123614b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f123613a = i;
        this.f123614b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k kVar;
        j jVar;
        Set linkedHashSet;
        Set linkedHashSet2;
        ArrayList arrayList;
        int i = this.f123613a;
        int i2 = 2;
        Continuation continuation = null;
        Object obj3 = this.f123614b;
        switch (i) {
            case 0:
                com.revolut.feature.global_markets.impl.ui.flow.index_details.a update = (com.revolut.feature.global_markets.impl.ui.flow.index_details.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return com.revolut.feature.global_markets.impl.ui.flow.index_details.a.a(update, ((IndexDetailsFlowContract$PagerItem) obj3).getF94249a(), null, null, null, LDSFile.EF_SOD_TAG);
            case 1:
                e88.e eVar = (e88.e) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Pair pair2 = (Pair) pair.f186385a;
                Pair pair3 = (Pair) pair.f186386b;
                Map map = (Map) pair2.f186385a;
                List list = (List) pair2.f186386b;
                Map map2 = (Map) pair3.f186385a;
                List list2 = (List) pair3.f186386b;
                int iB = q0.b(w.t(list2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj4 : list2) {
                    linkedHashMap.put(((psg.a) obj4).f239485b, obj4);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (pd.b.j((Boolean) map2.get(entry.getKey()))) {
                        psg.a aVar = (psg.a) linkedHashMap.get(entry.getKey());
                        if (pd.b.j(aVar != null ? Boolean.valueOf(ta6.a.A(aVar)) : null)) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                Iterator it8 = linkedHashMap2.entrySet().iterator();
                while (it8.hasNext()) {
                    arrayList2.add((JuniorBankingProfile) ((Map.Entry) it8.next()).getValue());
                }
                if (arrayList2.isEmpty()) {
                    return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(eVar.f123627b.N(((JuniorBankingProfile) it9.next()).f77103j));
                }
                return nim.a.v(u0.k(arrayList3), new e88.b(arrayList2, list));
            case 2:
                h6e.d dVar = (h6e.d) obj3;
                Map linkedCardBills = (Map) obj2;
                Intrinsics.checkNotNullParameter(linkedCardBills, "linkedCardBills");
                h6e.c cVar = dVar.f149629a;
                if (cVar != null) {
                    List list3 = (List) linkedCardBills.get(cVar.f149628a.f150110a);
                    if (list3 != null) {
                        linkedHashSet2 = new LinkedHashSet();
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            linkedHashSet2.add(((p) it10.next()).f249314a.f160150a);
                        }
                    } else {
                        linkedHashSet2 = null;
                    }
                    if (linkedHashSet2 == null) {
                        linkedHashSet2 = h0.f322473a;
                    }
                    kVar = new k(cVar, linkedHashSet2);
                } else {
                    kVar = null;
                }
                h6e.b bVar = dVar.f149630b;
                if (bVar != null) {
                    List list4 = (List) linkedCardBills.get(bVar.f149622a);
                    if (list4 != null) {
                        linkedHashSet = new LinkedHashSet();
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            linkedHashSet.add(((p) it11.next()).f249314a.f160150a);
                        }
                    } else {
                        linkedHashSet = null;
                    }
                    if (linkedHashSet == null) {
                        linkedHashSet = h0.f322473a;
                    }
                    jVar = new j(bVar, linkedHashSet);
                } else {
                    jVar = null;
                }
                return new Pair(kVar, jVar);
            case 3:
                o assetType = (o) obj3;
                List collections = (List) obj2;
                Intrinsics.checkNotNullParameter(collections, "collections");
                List<o7h.b> list5 = collections;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                for (o7h.b bVar2 : list5) {
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    Intrinsics.checkNotNullParameter(assetType, "assetType");
                    String strJ = bVar2.getKey();
                    String strK = bVar2.getTitle();
                    String strF = bVar2.getDescription();
                    String strC = bVar2.getBackgroundImageLink();
                    String strB = bVar2.getAvatarImageLink();
                    String strI = bVar2.getIcon();
                    String strA = bVar2.getAdditionalInfoLink();
                    List listE = bVar2.getCollections();
                    List listH = bVar2.getEntries();
                    if (listH != null) {
                        List<o7h.c> list6 = listH;
                        ArrayList arrayList5 = new ArrayList(w.t(list6, 10));
                        for (o7h.c cVar2 : list6) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            arrayList5.add(new xzg.e(cVar2.getSymbol(), cVar2.getRef()));
                        }
                        arrayList = arrayList5;
                    } else {
                        arrayList = null;
                    }
                    o oVar = assetType;
                    arrayList4.add(new xzg.d(strJ, strK, strF, strC, strB, strI, strA, bVar2.getCategory(), bVar2.getEmoji(), listE, arrayList, oVar));
                    assetType = oVar;
                }
                return arrayList4;
            case 4:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (yzg.d) ((e8h.j) obj3).f123697a.get("STORAGE_FREE_STOCKS_CAMPAIGN_KEY");
            case 5:
                String promotionId = (String) obj2;
                Intrinsics.checkNotNullParameter(promotionId, "promotionId");
                return (b0h.a) ((y) obj3).f123736c.get(e8h.w.a(y.Companion, promotionId));
            case 6:
                Set ids = (Set) obj2;
                Intrinsics.checkNotNullParameter(ids, "ids");
                return (List) ((c0) obj3).f123674a.get(c0.a(ids));
            case 7:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (List) ((p0) obj3).f123722a.get("WEALTH_DISCLAIMERS_DATA_KEY");
            case 8:
                x it14 = (x) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                oki.h.D2(((e8k.b) obj3).f123744p);
                return Unit.f186387a;
            case 9:
                y5i.b it15 = (y5i.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                ((com.revolut.feature.revolutpay.impl.ui.native_move_money.a) obj3).I2();
                return Unit.f186387a;
            case 10:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return e9d.c.d((j7d.a) obj3);
            case 11:
                eac.h update2 = (eac.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return eac.h.a(update2, null, null, null, new Data(((oec.b) ((oec.a) obj3)).f224577a, null, false, 6, null), null, 55);
            case 12:
                x0 optInState = ((m) obj3).f124170a;
                Intrinsics.checkNotNullParameter(optInState, "optInState");
                return eac.h.a((eac.h) obj2, null, zi0.c.P(new m(optInState, true), false, null, 3), null, null, null, 61);
            case 13:
                ead.f update3 = (ead.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ead.f.a(update3, ((ead.i) ((ead.j) obj3)).f124199a, null, null, null, 29);
            case 14:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (List) ((r) obj3).f124247a.getValue();
            case 15:
                com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a) obj3;
                ExpiredApplicationLazyFlowContract$InputData expiredApplicationLazyFlowContract$InputData = aVar2.f67659p;
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = expiredApplicationLazyFlowContract$InputData.f67655a;
                    j1 j1Var = creditApplicationPluginFlowContract$Configuration.d;
                    if (j1Var == j1.CREDIT_CARD_LIMIT_DECREASE && creditApplicationPluginFlowContract$Configuration.e == gt3.b.USER_INITIATED) {
                        aVar2.O2(null, creditApplicationPluginFlowContract$Configuration.f66892b);
                    } else {
                        aVar2.O2(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(j1Var, creditApplicationPluginFlowContract$Configuration.e, wp3.a.START_FORCE, creditApplicationPluginFlowContract$Configuration.k, new a1(r2.APPLICATION_EXPIRED, null, null, s.A(creditApplicationPluginFlowContract$Configuration.f66898m), null, 22), 6648)), expiredApplicationLazyFlowContract$InputData.f67655a.f66892b);
                    }
                } else if (outputData instanceof dii.f) {
                    aVar2.O2(null, expiredApplicationLazyFlowContract$InputData.f67655a.f66892b);
                } else {
                    if (!(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "ExpiredApplicationLazyFlowModel", "Unsupported actions bottom sheet " + o0.f186429a.b(outputData.getClass()) + " output", null, h0Var);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.b) obj3;
                ExpiredApplicationRootFlowContract$InputData expiredApplicationRootFlowContract$InputData = bVar3.f67662p;
                db4.f it18 = (db4.f) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                if (it18 instanceof db4.d) {
                    bVar3.O2(null, expiredApplicationRootFlowContract$InputData.f67657a.f66892b);
                } else {
                    if (!(it18 instanceof db4.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar3.O2(((db4.e) it18).f112665a, expiredApplicationRootFlowContract$InputData.f67657a.f66892b);
                }
                return Unit.f186387a;
            case 17:
                com.revolut.feature.cash_topup.impl.ui.flow.map.a aVar3 = (com.revolut.feature.cash_topup.impl.ui.flow.map.a) obj3;
                l result = (l) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof vb3.i) {
                    CashTopUpLocationInfo cashTopUpLocationInfo = ((vb3.i) result).f287384a;
                    aVar3.C1(new BridgeDestination(((ri3.a) aVar3.o).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                } else if (result instanceof vb3.j) {
                    nd.o oVar2 = aVar3.f65659p;
                    String str = ((vb3.j) result).f287385a;
                    oVar2.getClass();
                    aVar3.C1(new BridgeDestination(nd.o.h(str)));
                } else if (result instanceof vb3.k) {
                    IllegalStateException illegalStateException = new IllegalStateException(p.a.p("received unexpected result SelectLocationClicked(locationId=", ((vb3.k) result).f287386a, ")"));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                } else if (result instanceof vb3.h) {
                    IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("received unexpected result DepositCashClicked(locationId=", ((vb3.h) result).f287383a, ")"));
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var3);
                } else {
                    if (!(result instanceof l.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException3 = new IllegalStateException("received unexpected result ShowBarcode");
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var4);
                }
                return Unit.f186387a;
            case 18:
                return ech.d.a((ech.d) obj2, null, ((gch.h) obj3).f142479a, 1);
            case 19:
                ld6.g gVar = (ld6.g) obj3;
                wc6.d legalEntityRegion = (wc6.d) obj2;
                Intrinsics.checkNotNullParameter(legalEntityRegion, "legalEntityRegion");
                if (legalEntityRegion instanceof wc6.b) {
                    return new ld6.c(((wc6.b) legalEntityRegion).f296347a, gVar);
                }
                if (legalEntityRegion instanceof wc6.c) {
                    return ld6.e.f194037a;
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                ((eeh.e) obj3).getClass();
                ArrayList arrayList6 = new ArrayList(10);
                for (int i3 = 0; i3 < 10; i3++) {
                    arrayList6.add(new pb0(a0.d.n("MUTUAL_FUND_INSTRUMENT_LOADING_", i3)));
                }
                return yp0.b.h(arrayList6, new gu("ALL_MUTUAL_FUNDS_HEADER_LOADING", 0, 0, 30), null, 0, 126);
            case 21:
                ef5.b update4 = (ef5.b) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ef5.b.a(update4, null, null, (we5.a) obj3, null, null, null, null, 123);
            case 22:
                u uVar = (u) obj3;
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof dpf.a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uVar.H2(uVar.u, new bg2.p(output, i2));
                }
                return Unit.f186387a;
            case 23:
                return eg2.g.a((eg2.g) obj2, null, (eg2.h) obj3, null, LDSFile.EF_DG15_TAG);
            case 24:
                return eg2.g.a((eg2.g) obj2, null, null, new Data((eg2.o) obj3, null, false, 6, null), 95);
            case 25:
                com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a aVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a) obj3;
                hg4.p outputData2 = (hg4.p) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                int i5 = 6;
                if (outputData2 instanceof hg4.l) {
                    aVar4.n2(new e8e.w(aVar4, ((hg4.l) outputData2).f152096a, continuation, i), new whi.b(i5));
                } else if (outputData2 instanceof hg4.k) {
                    aVar4.n2(new ebg.o(aVar4, continuation, i5), new whi.b(i5));
                } else if (outputData2 instanceof hg4.o) {
                    aVar4.K2(new FeatureCommand(SupportFeatureConfig.f89363a));
                } else if (outputData2 instanceof n) {
                    oki.h.t2(aVar4, aVar4.f68186q, PersonalDetailsFlowContract$Step.CustomerIdentification.f68182a, true, null, false, 12);
                } else {
                    if (!(outputData2 instanceof hg4.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(aVar4.f68186q, PersonalDetailsFlowContract$Step.ProfileAddress.f68184a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                }
                return Unit.f186387a;
            case 26:
                aw0.i iVar = (aw0.i) obj3;
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 2);
                ArrayList arrayList7 = new ArrayList(w.t(intRangeO, 10));
                vim.f it21 = intRangeO.iterator();
                while (it21.f289625c) {
                    arrayList7.add(nb0.b(pb0.Companion, a0.d.n("LOADING_ITEM_LIST_ID_PREFIX_", it21.nextInt()), true, 0, false, 28));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                return new eh3.r(eh3.o.f125723a, arrayList7, iVar);
            case 27:
                return (eh8.d) obj3;
            case 28:
                return eh9.a.a((eh9.a) obj2, (PaymentData) obj3, null, 0, null, 254);
            default:
                return eh9.a.a((eh9.a) obj2, null, (eh9.b) obj3, 0, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
    }

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f123613a = i;
        this.f123614b = obj3;
    }
}
