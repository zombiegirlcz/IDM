package com.revolut.feature.wealth.impl.data.repositories;

import b80.c;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteFee;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteFeeBreakdown;
import com.revolut.feature.wealth.impl.data.network.collections.CollectionsService;
import com.revolut.feature.wealth.impl.data.repositories.CollectionsRepository$Companion;
import dp4.a1;
import dp4.f1;
import efm.r;
import f7h.f;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import te0.w;
import v60.e;
import xzg.o;
import y6h.g;
import y6h.l;
import y6h.n;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final CollectionsRepository$Companion Companion = new CollectionsRepository$Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f95510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f95511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CollectionsService f95512c;
    public final f d;
    public final c e;
    public final ue0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f95513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f95514h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f95515j;
    public final x4l.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f95516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4l.f f95517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f95518n;
    public final w4l.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jpf.a f95519p;

    /* JADX WARN: Type inference failed for: r5v4, types: [e8h.a] */
    /* JADX WARN: Type inference failed for: r6v8, types: [e8h.b] */
    public a(j memoryCache, n collectionsConfigStorage, CollectionsService collectionsService, f collectionsDao, c networkStateRepository, ue0.c storage, l collectionQuoteStorage, g collectionPerformanceStorage, h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(collectionsConfigStorage, "collectionsConfigStorage");
        Intrinsics.checkNotNullParameter(collectionsService, "collectionsService");
        Intrinsics.checkNotNullParameter(collectionsDao, "collectionsDao");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(collectionQuoteStorage, "collectionQuoteStorage");
        Intrinsics.checkNotNullParameter(collectionPerformanceStorage, "collectionPerformanceStorage");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f95510a = memoryCache;
        this.f95511b = collectionsConfigStorage;
        this.f95512c = collectionsService;
        this.d = collectionsDao;
        this.e = networkStateRepository;
        this.f = storage;
        this.f95513g = collectionQuoteStorage;
        this.f95514h = collectionPerformanceStorage;
        this.i = serverErrorParser;
        this.f95515j = serverErrorsProvider;
        Continuation continuation = null;
        final int i = 0;
        this.k = new x4l.c(new a1(this, continuation, 9), new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new e0b.c(this, continuation, 25), new f1(this, continuation, 4));
        final int i2 = 6;
        final int i3 = 7;
        final int i5 = 7;
        final int i6 = 8;
        final int i21 = 8;
        this.f95516l = new w4l.f(new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i2) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i2) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i3) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i5) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i6) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i21) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, 160);
        final int i22 = 9;
        final int i32 = 9;
        final int i33 = 5;
        final int i43 = 10;
        final int i59 = 10;
        this.f95517m = new w4l.f(new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i22) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i32) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i33) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i43) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i59) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i66 = 11;
        final int i74 = 11;
        final int i92 = 12;
        final int i96 = 12;
        final int i99 = 13;
        this.f95518n = new w4l.f(new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i66) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i74) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i92) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i96) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i99) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i100 = 13;
        final int i101 = 1;
        final int i102 = 1;
        final int i103 = 2;
        final int i104 = 2;
        this.o = new w4l.f(w.k0(networkStateRepository, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i100) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }), new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i101) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i102) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i103) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i104) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i105 = 3;
        final int i106 = 4;
        final int i107 = 3;
        final int i108 = 5;
        final int i109 = 4;
        this.f95519p = new jpf.a(new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i105) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i106) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i107) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: e8h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123669b;

            {
                this.f123669b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CollectionQuoteFee collectionQuoteFee;
                String strA;
                switch (i108) {
                    case 0:
                        o7h.x it8 = (o7h.x) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (zzg.r) this.f123669b.f95510a.get(it8.getCacheKey());
                    case 1:
                        yhm.r params = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        y6h.g gVar = this.f123669b.f95514h;
                        String collectionKey = (String) params.f314201a;
                        qta.f period = (qta.f) params.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        return (xzg.h) gVar.f311292a.get(y6h.f.a(y6h.g.Companion, collectionKey, period));
                    case 2:
                        yhm.r params2 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        y6h.g gVar2 = this.f123669b.f95514h;
                        String collectionKey2 = (String) params2.f314201a;
                        qta.f period2 = (qta.f) params2.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        ue0.c cVar = gVar2.f311293b;
                        String strA2 = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Type COLLECTION_PERFORMANCE_CHART_TYPE = y6h.g.f311291c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCE_CHART_TYPE, "COLLECTION_PERFORMANCE_CHART_TYPE");
                        y6h.b bVar = (y6h.b) cVar.T2(strA2, COLLECTION_PERFORMANCE_CHART_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        String percentageChange = bVar.getPercentageChange();
                        List<y6h.a> points = bVar.getPoints();
                        ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                        for (y6h.a aVar : points) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new xzg.i(aVar.getTimestamp(), new BigDecimal(aVar.getRate()), aVar.getPercentageChange()));
                        }
                        return new xzg.h(percentageChange, arrayList);
                    case 3:
                        yhm.r params3 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123669b;
                        efm.d0<List<o7h.h>> collectionsPerformance = aVar2.f95512c.getCollectionsPerformance((List) params3.f314201a, (String) params3.f314202b, (String) params3.f314203c);
                        e31.e eVar = new e31.e(29, new e8e.y(2));
                        collectionsPerformance.getClass();
                        ufm.i iVar = new ufm.i(collectionsPerformance, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return te0.w.n0(iVar, aVar2.e);
                    case 4:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        return (List) this.f123669b.f95514h.f311292a.get("COLLECTION_PERFORMANCE_KEY_PREFIX");
                    case 5:
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "it");
                        ue0.c cVar2 = this.f123669b.f95514h.f311293b;
                        Type COLLECTION_PERFORMANCES_TYPE = y6h.g.d;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_PERFORMANCES_TYPE, "COLLECTION_PERFORMANCES_TYPE");
                        List list = (List) cVar2.T2("COLLECTION_PERFORMANCE_KEY_PREFIX", COLLECTION_PERFORMANCES_TYPE);
                        if (list == null) {
                            return null;
                        }
                        List<y6h.e> list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (y6h.e eVar2 : list2) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            String collectionKey3 = eVar2.getCollectionKey();
                            xi0.a aVar3 = xi0.b.Companion;
                            String baseCurrency = eVar2.getBaseCurrency();
                            aVar3.getClass();
                            xi0.b bVarA = xi0.a.a(baseCurrency);
                            y6h.c performance = eVar2.getPerformance();
                            Intrinsics.checkNotNullParameter(performance, "<this>");
                            arrayList2.add(new xzg.g(collectionKey3, bVarA, new xzg.j(new BigDecimal(performance.getPercentageChange())), eVar2.getTimestamp()));
                        }
                        return arrayList2;
                    case 6:
                        xzg.o assetType = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        return (List) this.f123669b.f95510a.get(oc.c.v(assetType));
                    case 7:
                        xzg.o assetType2 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        List listA = this.f123669b.d.a(assetType2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listA, 10));
                        Iterator it9 = listA.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(zi0.c.V((f7h.a) it9.next()));
                        }
                        return arrayList3;
                    case 8:
                        xzg.o assetType3 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        List listA2 = this.f123669b.d.a(assetType3);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(listA2, 10));
                        Iterator it10 = listA2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(zi0.c.V((f7h.a) it10.next()));
                        }
                        ufm.b bVarM = efm.d0.m(new Data(arrayList4, null, false, 6, null));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    case 9:
                        xzg.o assetType4 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        return (z2f.a) this.f123669b.f95510a.get(oc.c.w(assetType4));
                    case 10:
                        xzg.o assetType5 = (xzg.o) obj2;
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        y6h.o oVarA = this.f123669b.f95511b.a(assetType5);
                        if (oVarA != null) {
                            return nz8.d.G(oVarA);
                        }
                        return null;
                    case 11:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "it");
                        y6h.l lVar = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        ne0.j jVar = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        return (CollectionQuote) jVar.get(y6h.k.a(collectionQuoteInfo));
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "it");
                        y6h.l lVar2 = this.f123669b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        ue0.c cVar3 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA3 = y6h.k.a(collectionQuoteInfo2);
                        Type COLLECTION_QUOTE_TYPE = y6h.l.f311303c;
                        Intrinsics.checkNotNullExpressionValue(COLLECTION_QUOTE_TYPE, "COLLECTION_QUOTE_TYPE");
                        y6h.j jVar2 = (y6h.j) cVar3.T2(strA3, COLLECTION_QUOTE_TYPE);
                        if (jVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar2, "<this>");
                        List listC = jVar2.getCurrencies();
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(listC, 10));
                        Iterator it11 = listC.iterator();
                        while (it11.hasNext()) {
                            t61.a.A(xi0.b.Companion, (String) it11.next(), arrayList5);
                        }
                        dj0.d dVarO = mo3.a.o(jVar2.getTotalAmount());
                        dj0.d dVarO2 = mo3.a.o(jVar2.getTotalFee());
                        dj0.d dVarO3 = mo3.a.o(jVar2.getTotalAmountAfterFee());
                        dj0.d dVarO4 = mo3.a.o(jVar2.getAmountPerCurrency());
                        jo3.a aVarB = jVar2.getAmountPerCurrencyBeforeFee();
                        dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                        dj0.d dVarO6 = mo3.a.o(jVar2.getLowerLimitPerCurrency());
                        dj0.d dVarO7 = mo3.a.o(jVar2.getLowerLimitTotal());
                        y6h.i iVarD = jVar2.getFee();
                        if (iVarD != null) {
                            Intrinsics.checkNotNullParameter(iVarD, "<this>");
                            List breakdown = iVarD.getBreakdown();
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(breakdown, 10));
                            for (Iterator it12 = breakdown.iterator(); it12.hasNext(); it12 = it12) {
                                y6h.h hVar = (y6h.h) it12.next();
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList6.add(new CollectionQuoteFeeBreakdown(mo3.a.o(hVar.getSellCurrencyAmount()), hVar.getTitle(), hVar.getShortDescription(), hVar.getDescription()));
                            }
                            collectionQuoteFee = new CollectionQuoteFee(arrayList6);
                        } else {
                            collectionQuoteFee = null;
                        }
                        return new CollectionQuote(arrayList5, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
                    default:
                        yhm.r params4 = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        CollectionsService collectionsService2 = this.f123669b.f95512c;
                        String str = (String) params4.f314201a;
                        String str2 = (String) params4.f314202b;
                        qta.f fVar = (qta.f) params4.f314203c;
                        String strG0 = ofm.q.g0(fVar);
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        switch (y6h.d.f311287a[fVar.ordinal()]) {
                            case 1:
                                strA = epk.a.FIVE_MINUTES.a();
                                break;
                            case 2:
                                strA = epk.a.FIFTEEN_MINUTES.a();
                                break;
                            case 3:
                                strA = epk.a.NINETY_MINUTES.a();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                strA = epk.a.DAY.a();
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<o7h.e> collectionPerformanceChart = collectionsService2.getCollectionPerformanceChart(str, str2, strG0, strA);
                        c cVar4 = new c(0, new e8e.y(3));
                        collectionPerformanceChart.getClass();
                        ufm.i iVar2 = new ufm.i(collectionPerformanceChart, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: e8h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.impl.data.repositories.a f123671b;

            {
                this.f123671b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                f7h.f fVar;
                String str;
                ArrayList arrayList;
                jo3.a aVar;
                y6h.i iVar;
                switch (i109) {
                    case 0:
                        o7h.x params = (o7h.x) obj2;
                        zzg.r data = (zzg.r) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f123671b.f95510a.f(params.getCacheKey(), data);
                        break;
                    case 1:
                        yhm.r params2 = (yhm.r) obj2;
                        xzg.h performanceToSave = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave, "collectionPerformance");
                        y6h.g gVar = this.f123671b.f95514h;
                        String collectionKey = (String) params2.f314201a;
                        qta.f period = (qta.f) params2.f314203c;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                        Intrinsics.checkNotNullParameter(period, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave, "performanceToSave");
                        gVar.f311292a.f(y6h.f.a(y6h.g.Companion, collectionKey, period), performanceToSave);
                        break;
                    case 2:
                        yhm.r params3 = (yhm.r) obj2;
                        xzg.h performanceToSave2 = (xzg.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "collectionPerformance");
                        y6h.g gVar2 = this.f123671b.f95514h;
                        String collectionKey2 = (String) params3.f314201a;
                        qta.f period2 = (qta.f) params3.f314203c;
                        Intrinsics.checkNotNullParameter(collectionKey2, "collectionKey");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        Intrinsics.checkNotNullParameter(performanceToSave2, "performanceToSave");
                        ue0.c cVar = gVar2.f311293b;
                        String strA = y6h.f.a(y6h.g.Companion, collectionKey2, period2);
                        Intrinsics.checkNotNullParameter(performanceToSave2, "<this>");
                        String str2 = performanceToSave2.f309994a;
                        ArrayList<xzg.i> arrayList2 = performanceToSave2.f309995b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        for (xzg.i iVar2 : arrayList2) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            String string = iVar2.f309999b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList3.add(new y6h.a(iVar2.f309998a, string, iVar2.f310000c));
                        }
                        cVar.G(new y6h.b(str2, arrayList3), strA, wim.z.d(kotlin.jvm.internal.o0.b(y6h.b.class)));
                        break;
                    case 3:
                        List collectionsPerformances = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionPerformances");
                        y6h.g gVar3 = this.f123671b.f95514h;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                        gVar3.f311292a.f("COLLECTION_PERFORMANCE_KEY_PREFIX", collectionsPerformances);
                        break;
                    case 4:
                        List performancesToSave = (List) obj3;
                        Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(performancesToSave, "collectionPerformances");
                        y6h.g gVar4 = this.f123671b.f95514h;
                        Intrinsics.checkNotNullParameter(performancesToSave, "performancesToSave");
                        ue0.c cVar2 = gVar4.f311293b;
                        List<xzg.g> list = performancesToSave;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.g gVar5 : list) {
                            Intrinsics.checkNotNullParameter(gVar5, "<this>");
                            String str3 = gVar5.f309989a;
                            String str4 = gVar5.f309990b.f306286a;
                            xzg.j jVar = gVar5.f309991c;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            String string2 = jVar.f310002a.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList4.add(new y6h.e(str3, str4, new y6h.c(string2), gVar5.d));
                        }
                        cVar2.G(arrayList4, "COLLECTION_PERFORMANCE_KEY_PREFIX", kii.e.o(y6h.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 5:
                        xzg.o assetType = (xzg.o) obj2;
                        z2f.a config = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f123671b.f95510a.f(oc.c.w(assetType), config);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        xzg.o assetType2 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType2, "assetType");
                        efm.d0<List<o7h.b>> collections = this.f123671b.f95512c.getCollections(gc0.c.z(assetType2));
                        e31.e eVar = new e31.e(27, new e87.e(assetType2, 3));
                        collections.getClass();
                        ufm.i iVar3 = new ufm.i(collections, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 7:
                        xzg.o assetType3 = (xzg.o) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(assetType3, "assetType");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (!collections2.isEmpty()) {
                            this.f123671b.f95510a.f(oc.c.v(assetType3), collections2);
                        }
                        break;
                    case 8:
                        xzg.o assetType4 = (xzg.o) obj2;
                        List collections3 = (List) obj3;
                        String str5 = "assetType";
                        Intrinsics.checkNotNullParameter(assetType4, "assetType");
                        Intrinsics.checkNotNullParameter(collections3, "collections");
                        f7h.f fVar2 = this.f123671b.d;
                        List list2 = collections3;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it8) {
                            xzg.d dVar = (xzg.d) it9.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(assetType4, str5);
                            ArrayList arrayList6 = arrayList5;
                            String str6 = dVar.f309976a;
                            String str7 = dVar.f309978c;
                            String str8 = dVar.d;
                            String str9 = dVar.f;
                            String str10 = dVar.f309979g;
                            String str11 = dVar.f309980h;
                            String str12 = dVar.e;
                            List list3 = dVar.f309981j;
                            if (list3 != null) {
                                List list4 = list3;
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = new ArrayList(zhm.w.t(list4, 10));
                                for (Iterator it10 = list4.iterator(); it10.hasNext(); it10 = it10) {
                                    xzg.e eVar2 = (xzg.e) it10.next();
                                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                    arrayList.add(new f7h.b(eVar2.f309983a, eVar2.f309984b));
                                }
                            } else {
                                it8 = it9;
                                fVar = fVar2;
                                str = str6;
                                arrayList = null;
                            }
                            arrayList6.add(new f7h.a(str, str7, str8, dVar.f309982l, str12, str9, str10, str11, dVar.k, dVar.i, arrayList, assetType4));
                            fVar2 = fVar;
                            arrayList5 = arrayList6;
                            str5 = str5;
                        }
                        fVar2.d(arrayList5, assetType4);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        xzg.o assetType5 = (xzg.o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(assetType5, "assetType");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar2 = this.f123671b;
                        efm.d0<o7h.k> configuration = aVar2.f95512c.getConfiguration(gc0.c.z(assetType5));
                        c cVar3 = new c(1, new e8e.y(4));
                        configuration.getClass();
                        ufm.i iVar4 = new ufm.i(configuration, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 10:
                        xzg.o param = (xzg.o) obj2;
                        z2f.a config2 = (z2f.a) obj3;
                        Intrinsics.checkNotNullParameter(param, "assetType");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        y6h.n nVar = this.f123671b.f95511b;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        z2f.b bVar = config2.f319060a;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        y6h.o config3 = new y6h.o(new y6h.q(bVar.f319061a, bVar.f319062b));
                        Intrinsics.checkNotNullParameter(config3, "config");
                        Intrinsics.checkNotNullParameter(param, "param");
                        nVar.f311307a.G(config3, nz8.d.v(param), wim.z.d(kotlin.jvm.internal.o0.b(y6h.o.class)));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionRequestInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(collectionRequestInfo, "collectionRequestInfo");
                        com.revolut.feature.wealth.impl.data.repositories.a aVar3 = this.f123671b;
                        efm.d0<com.revolut.feature.wealth.impl.data.network.collections.a> collectionQuote = aVar3.f95512c.getCollectionQuote(collectionRequestInfo.f95508a, com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionRequestInfo.f95509b));
                        e31.e eVar3 = new e31.e(28, new e8e.y(1));
                        collectionQuote.getClass();
                        ufm.i iVar5 = new ufm.i(collectionQuote, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 12:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote2 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        y6h.l lVar = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote2, "collectionQuote");
                        ne0.j jVar2 = lVar.f311304a;
                        y6h.l.Companion.getClass();
                        jVar2.f(y6h.k.a(collectionQuoteInfo), collectionQuote2);
                        break;
                    default:
                        CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteInfo2 = (CollectionsRepository$Companion.CollectionQuoteRequestInfo) obj2;
                        CollectionQuote collectionQuote3 = (CollectionQuote) obj3;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        y6h.l lVar2 = this.f123671b.f95513g;
                        Intrinsics.checkNotNullParameter(collectionQuoteInfo2, "collectionQuoteInfo");
                        Intrinsics.checkNotNullParameter(collectionQuote3, "collectionQuote");
                        ue0.c cVar4 = lVar2.f311305b;
                        y6h.l.Companion.getClass();
                        String strA2 = y6h.k.a(collectionQuoteInfo2);
                        String str13 = "<this>";
                        Intrinsics.checkNotNullParameter(collectionQuote3, "<this>");
                        List list5 = collectionQuote3.f95265a;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(((xi0.b) it11.next()).f306286a);
                        }
                        jo3.a aVarP = mo3.a.p(collectionQuote3.f95266b);
                        jo3.a aVarP2 = mo3.a.p(collectionQuote3.f95267c);
                        jo3.a aVarP3 = mo3.a.p(collectionQuote3.d);
                        jo3.a aVarP4 = mo3.a.p(collectionQuote3.e);
                        dj0.d dVar2 = collectionQuote3.f;
                        jo3.a aVarP5 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        jo3.a aVarP6 = mo3.a.p(collectionQuote3.f95268g);
                        jo3.a aVarP7 = mo3.a.p(collectionQuote3.f95269h);
                        CollectionQuoteFee collectionQuoteFee = collectionQuote3.i;
                        if (collectionQuoteFee != null) {
                            Intrinsics.checkNotNullParameter(collectionQuoteFee, "<this>");
                            ArrayList arrayList8 = collectionQuoteFee.f95270a;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                            Iterator it12 = arrayList8.iterator();
                            while (it12.hasNext()) {
                                CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) it12.next();
                                Intrinsics.checkNotNullParameter(collectionQuoteFeeBreakdown, str13);
                                arrayList9.add(new y6h.h(collectionQuoteFeeBreakdown.f95271a, collectionQuoteFeeBreakdown.f95272b, collectionQuoteFeeBreakdown.f95273c, mo3.a.p(collectionQuoteFeeBreakdown.d)));
                                it12 = it12;
                                str13 = str13;
                                aVarP5 = aVarP5;
                            }
                            aVar = aVarP5;
                            iVar = new y6h.i(arrayList9);
                        } else {
                            aVar = aVarP5;
                            iVar = null;
                        }
                        cVar4.G(new y6h.j(arrayList7, aVarP, aVarP2, aVarP3, aVarP4, aVar, aVarP6, aVarP7, iVar), strA2, wim.z.d(kotlin.jvm.internal.o0.b(y6h.j.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, 32);
    }

    public final r a(List keys, o collectionsAssetType) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(collectionsAssetType, "collectionsAssetType");
        if (keys.isEmpty()) {
            return zi0.c.j(f0.f322471a);
        }
        Intrinsics.checkNotNullParameter(collectionsAssetType, "collectionsAssetType");
        return nim.a.w(ue0.e.q(this.f95516l.f(collectionsAssetType, false), h0.f322473a), new do2.o(keys, 8));
    }
}
