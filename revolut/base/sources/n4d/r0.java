package n4d;

import com.google.gson.reflect.TypeToken;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import d9.t0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import n33.i2;
import n33.p1;
import n33.v0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f212393m = zhm.r0.k(new Pair("FIAT", 0), new Pair("SECURITY", 1), new Pair("STOCK", 2), new Pair("ETP", 3), new Pair("CRYPTO", 4), new Pair("BOND", 5), new Pair("COMMODITY", 6), new Pair("CFD", 7), new Pair("INDEX", 8), new Pair("PERPETUAL_FUTURE", 9));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ogd.d f212394n = ogd.d.LAST_ADDED;
    public static final String o = "WATCHLIST_SORTING";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Type f212395p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f212396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f212397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f212398c;
    public final WatchlistService d;
    public final l80.e e;
    public final lfm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mk0.a f212399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ao.h f212400h;
    public final z1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f212401j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f212402l;

    static {
        Type type = new TypeToken<Map<String, ? extends o4d.b>>() { // from class: com.revolut.feature.separate_favourites.item_data.impl.watchlist.WatchlistItemsRepositoryImpl$Companion$CONFIGS_CONTAINER_ENTITY_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f212395p = type;
    }

    public r0(n dao, ne0.j memoryCache, ue0.c storage, WatchlistService watchlistService, l80.e dateProvider, r previewItemsProvider, lfm.c appCompositeDisposable, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(watchlistService, "watchlistService");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(previewItemsProvider, "previewItemsProvider");
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f212396a = dao;
        this.f212397b = memoryCache;
        this.f212398c = storage;
        this.d = watchlistService;
        this.e = dateProvider;
        this.f = appCompositeDisposable;
        this.f212399g = personalisationStorage;
        this.f212400h = new ao.h(20, new b0(this, 1));
        this.i = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
        final int i = 4;
        Function2 function2 = new Function2(this) { // from class: n4d.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f212353b;

            {
                this.f212353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String context = (String) obj2;
                        ogd.a assetPairCustomOrderIds = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds, "assetPairCustomOrderIds");
                        this.f212353b.f212398c.G(new o4d.a(context, assetPairCustomOrderIds.f225103b), j6.a.q("STORAGE_ORDERING_KEY_", context), wim.z.d(kotlin.jvm.internal.o0.b(o4d.a.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List params = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        r0 r0Var = this.f212353b;
                        WatchlistService watchlistService2 = r0Var.d;
                        List list = params;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                        }
                        efm.d0<Response<s4d.k>> settings = watchlistService2.getSettings(arrayList);
                        i2 i2Var = new i2(26, new v0(29));
                        settings.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(settings, i2Var, 1), new i2(27, new lsl.d(24, r0Var, params)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f212353b.f212397b;
                        Map mapG = (Map) jVar.get("CONFIGS_MEMORY_KEY");
                        if (mapG == null) {
                            mapG = zhm.r0.g();
                        }
                        List list2 = domain;
                        int iB = zhm.q0.b(zhm.w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj4 : list2) {
                            linkedHashMap.put(((z3d.b) obj4).f319246a.f86866a, obj4);
                        }
                        jVar.f("CONFIGS_MEMORY_KEY", zhm.r0.p(mapG, linkedHashMap));
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = this.f212353b.f212398c;
                        Map mapG2 = (Map) cVar.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                        if (mapG2 == null) {
                            mapG2 = zhm.r0.g();
                        }
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<z3d.b> list3 = domain2;
                        int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (z3d.b bVar : list3) {
                            String str = bVar.f319246a.f86866a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            linkedHashMap2.put(str, new o4d.b(bVar.f319247b));
                        }
                        cVar.G(zhm.r0.p(mapG2, linkedHashMap2), "CONFIGS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(o4d.b.class)))));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h0 params2 = (h0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        r0 r0Var2 = this.f212353b;
                        efm.d0 d0VarK = r0Var2.f212400h.k(Unit.f186387a);
                        a0 a0Var = new a0(new y(r0Var2, params2, 0), 0);
                        d0VarK.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarK, a0Var, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 5:
                        h0 params3 = (h0) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ne0.j jVar2 = this.f212353b.f212397b;
                        r0.Companion.getClass();
                        jVar2.f(e0.b(params3), domain3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String context2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        efm.d0<s4d.m> sortedWatchlistItems = this.f212353b.d.getSortedWatchlistItems(context2, null);
                        a0 a0Var2 = new a0(new mll.h(context2, 17), 4);
                        sortedWatchlistItems.getClass();
                        ufm.i iVar3 = new ufm.i(sortedWatchlistItems, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String context3 = (String) obj2;
                        ogd.a assetPairCustomOrderIds2 = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds2, "assetPairCustomOrderIds");
                        this.f212353b.f212397b.f("MEMORY_ORDERING_KEY_" + context3, assetPairCustomOrderIds2);
                        return Unit.f186387a;
                }
            }
        };
        b0 b0Var = new b0(this, i);
        final int i2 = 5;
        this.f212401j = new w4l.f(function2, b0Var, new Function2(this) { // from class: n4d.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f212353b;

            {
                this.f212353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String context = (String) obj2;
                        ogd.a assetPairCustomOrderIds = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds, "assetPairCustomOrderIds");
                        this.f212353b.f212398c.G(new o4d.a(context, assetPairCustomOrderIds.f225103b), j6.a.q("STORAGE_ORDERING_KEY_", context), wim.z.d(kotlin.jvm.internal.o0.b(o4d.a.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List params = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        r0 r0Var = this.f212353b;
                        WatchlistService watchlistService2 = r0Var.d;
                        List list = params;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                        }
                        efm.d0<Response<s4d.k>> settings = watchlistService2.getSettings(arrayList);
                        i2 i2Var = new i2(26, new v0(29));
                        settings.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(settings, i2Var, 1), new i2(27, new lsl.d(24, r0Var, params)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f212353b.f212397b;
                        Map mapG = (Map) jVar.get("CONFIGS_MEMORY_KEY");
                        if (mapG == null) {
                            mapG = zhm.r0.g();
                        }
                        List list2 = domain;
                        int iB = zhm.q0.b(zhm.w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj4 : list2) {
                            linkedHashMap.put(((z3d.b) obj4).f319246a.f86866a, obj4);
                        }
                        jVar.f("CONFIGS_MEMORY_KEY", zhm.r0.p(mapG, linkedHashMap));
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = this.f212353b.f212398c;
                        Map mapG2 = (Map) cVar.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                        if (mapG2 == null) {
                            mapG2 = zhm.r0.g();
                        }
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<z3d.b> list3 = domain2;
                        int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (z3d.b bVar : list3) {
                            String str = bVar.f319246a.f86866a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            linkedHashMap2.put(str, new o4d.b(bVar.f319247b));
                        }
                        cVar.G(zhm.r0.p(mapG2, linkedHashMap2), "CONFIGS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(o4d.b.class)))));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h0 params2 = (h0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        r0 r0Var2 = this.f212353b;
                        efm.d0 d0VarK = r0Var2.f212400h.k(Unit.f186387a);
                        a0 a0Var = new a0(new y(r0Var2, params2, 0), 0);
                        d0VarK.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarK, a0Var, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 5:
                        h0 params3 = (h0) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ne0.j jVar2 = this.f212353b.f212397b;
                        r0.Companion.getClass();
                        jVar2.f(e0.b(params3), domain3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String context2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        efm.d0<s4d.m> sortedWatchlistItems = this.f212353b.d.getSortedWatchlistItems(context2, null);
                        a0 a0Var2 = new a0(new mll.h(context2, 17), 4);
                        sortedWatchlistItems.getClass();
                        ufm.i iVar3 = new ufm.i(sortedWatchlistItems, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String context3 = (String) obj2;
                        ogd.a assetPairCustomOrderIds2 = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds2, "assetPairCustomOrderIds");
                        this.f212353b.f212397b.f("MEMORY_ORDERING_KEY_" + context3, assetPairCustomOrderIds2);
                        return Unit.f186387a;
                }
            }
        }, null, new n33.l0(11), null, new b0(this, 5), null, 168);
        final int i3 = 6;
        Function2 function22 = new Function2(this) { // from class: n4d.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f212353b;

            {
                this.f212353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String context = (String) obj2;
                        ogd.a assetPairCustomOrderIds = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds, "assetPairCustomOrderIds");
                        this.f212353b.f212398c.G(new o4d.a(context, assetPairCustomOrderIds.f225103b), j6.a.q("STORAGE_ORDERING_KEY_", context), wim.z.d(kotlin.jvm.internal.o0.b(o4d.a.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List params = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        r0 r0Var = this.f212353b;
                        WatchlistService watchlistService2 = r0Var.d;
                        List list = params;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                        }
                        efm.d0<Response<s4d.k>> settings = watchlistService2.getSettings(arrayList);
                        i2 i2Var = new i2(26, new v0(29));
                        settings.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(settings, i2Var, 1), new i2(27, new lsl.d(24, r0Var, params)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f212353b.f212397b;
                        Map mapG = (Map) jVar.get("CONFIGS_MEMORY_KEY");
                        if (mapG == null) {
                            mapG = zhm.r0.g();
                        }
                        List list2 = domain;
                        int iB = zhm.q0.b(zhm.w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj4 : list2) {
                            linkedHashMap.put(((z3d.b) obj4).f319246a.f86866a, obj4);
                        }
                        jVar.f("CONFIGS_MEMORY_KEY", zhm.r0.p(mapG, linkedHashMap));
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = this.f212353b.f212398c;
                        Map mapG2 = (Map) cVar.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                        if (mapG2 == null) {
                            mapG2 = zhm.r0.g();
                        }
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<z3d.b> list3 = domain2;
                        int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (z3d.b bVar : list3) {
                            String str = bVar.f319246a.f86866a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            linkedHashMap2.put(str, new o4d.b(bVar.f319247b));
                        }
                        cVar.G(zhm.r0.p(mapG2, linkedHashMap2), "CONFIGS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(o4d.b.class)))));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h0 params2 = (h0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        r0 r0Var2 = this.f212353b;
                        efm.d0 d0VarK = r0Var2.f212400h.k(Unit.f186387a);
                        a0 a0Var = new a0(new y(r0Var2, params2, 0), 0);
                        d0VarK.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarK, a0Var, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 5:
                        h0 params3 = (h0) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ne0.j jVar2 = this.f212353b.f212397b;
                        r0.Companion.getClass();
                        jVar2.f(e0.b(params3), domain3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String context2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        efm.d0<s4d.m> sortedWatchlistItems = this.f212353b.d.getSortedWatchlistItems(context2, null);
                        a0 a0Var2 = new a0(new mll.h(context2, 17), 4);
                        sortedWatchlistItems.getClass();
                        ufm.i iVar3 = new ufm.i(sortedWatchlistItems, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String context3 = (String) obj2;
                        ogd.a assetPairCustomOrderIds2 = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds2, "assetPairCustomOrderIds");
                        this.f212353b.f212397b.f("MEMORY_ORDERING_KEY_" + context3, assetPairCustomOrderIds2);
                        return Unit.f186387a;
                }
            }
        };
        b0 b0Var2 = new b0(this, i3);
        final int i5 = 7;
        Function2 function23 = new Function2(this) { // from class: n4d.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f212353b;

            {
                this.f212353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        String context = (String) obj2;
                        ogd.a assetPairCustomOrderIds = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds, "assetPairCustomOrderIds");
                        this.f212353b.f212398c.G(new o4d.a(context, assetPairCustomOrderIds.f225103b), j6.a.q("STORAGE_ORDERING_KEY_", context), wim.z.d(kotlin.jvm.internal.o0.b(o4d.a.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List params = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        r0 r0Var = this.f212353b;
                        WatchlistService watchlistService2 = r0Var.d;
                        List list = params;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                        }
                        efm.d0<Response<s4d.k>> settings = watchlistService2.getSettings(arrayList);
                        i2 i2Var = new i2(26, new v0(29));
                        settings.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(settings, i2Var, 1), new i2(27, new lsl.d(24, r0Var, params)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f212353b.f212397b;
                        Map mapG = (Map) jVar.get("CONFIGS_MEMORY_KEY");
                        if (mapG == null) {
                            mapG = zhm.r0.g();
                        }
                        List list2 = domain;
                        int iB = zhm.q0.b(zhm.w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj4 : list2) {
                            linkedHashMap.put(((z3d.b) obj4).f319246a.f86866a, obj4);
                        }
                        jVar.f("CONFIGS_MEMORY_KEY", zhm.r0.p(mapG, linkedHashMap));
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = this.f212353b.f212398c;
                        Map mapG2 = (Map) cVar.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                        if (mapG2 == null) {
                            mapG2 = zhm.r0.g();
                        }
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<z3d.b> list3 = domain2;
                        int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (z3d.b bVar : list3) {
                            String str = bVar.f319246a.f86866a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            linkedHashMap2.put(str, new o4d.b(bVar.f319247b));
                        }
                        cVar.G(zhm.r0.p(mapG2, linkedHashMap2), "CONFIGS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(o4d.b.class)))));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h0 params2 = (h0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        r0 r0Var2 = this.f212353b;
                        efm.d0 d0VarK = r0Var2.f212400h.k(Unit.f186387a);
                        a0 a0Var = new a0(new y(r0Var2, params2, 0), 0);
                        d0VarK.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarK, a0Var, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 5:
                        h0 params3 = (h0) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ne0.j jVar2 = this.f212353b.f212397b;
                        r0.Companion.getClass();
                        jVar2.f(e0.b(params3), domain3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String context2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        efm.d0<s4d.m> sortedWatchlistItems = this.f212353b.d.getSortedWatchlistItems(context2, null);
                        a0 a0Var2 = new a0(new mll.h(context2, 17), 4);
                        sortedWatchlistItems.getClass();
                        ufm.i iVar3 = new ufm.i(sortedWatchlistItems, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String context3 = (String) obj2;
                        ogd.a assetPairCustomOrderIds2 = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds2, "assetPairCustomOrderIds");
                        this.f212353b.f212397b.f("MEMORY_ORDERING_KEY_" + context3, assetPairCustomOrderIds2);
                        return Unit.f186387a;
                }
            }
        };
        b0 b0Var3 = new b0(this, i5);
        final int i6 = 0;
        this.k = new w4l.f(function22, b0Var2, function23, b0Var3, new Function2(this) { // from class: n4d.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f212353b;

            {
                this.f212353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        String context = (String) obj2;
                        ogd.a assetPairCustomOrderIds = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds, "assetPairCustomOrderIds");
                        this.f212353b.f212398c.G(new o4d.a(context, assetPairCustomOrderIds.f225103b), j6.a.q("STORAGE_ORDERING_KEY_", context), wim.z.d(kotlin.jvm.internal.o0.b(o4d.a.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List params = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        r0 r0Var = this.f212353b;
                        WatchlistService watchlistService2 = r0Var.d;
                        List list = params;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                        }
                        efm.d0<Response<s4d.k>> settings = watchlistService2.getSettings(arrayList);
                        i2 i2Var = new i2(26, new v0(29));
                        settings.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(settings, i2Var, 1), new i2(27, new lsl.d(24, r0Var, params)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f212353b.f212397b;
                        Map mapG = (Map) jVar.get("CONFIGS_MEMORY_KEY");
                        if (mapG == null) {
                            mapG = zhm.r0.g();
                        }
                        List list2 = domain;
                        int iB = zhm.q0.b(zhm.w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj4 : list2) {
                            linkedHashMap.put(((z3d.b) obj4).f319246a.f86866a, obj4);
                        }
                        jVar.f("CONFIGS_MEMORY_KEY", zhm.r0.p(mapG, linkedHashMap));
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = this.f212353b.f212398c;
                        Map mapG2 = (Map) cVar.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                        if (mapG2 == null) {
                            mapG2 = zhm.r0.g();
                        }
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<z3d.b> list3 = domain2;
                        int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (z3d.b bVar : list3) {
                            String str = bVar.f319246a.f86866a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            linkedHashMap2.put(str, new o4d.b(bVar.f319247b));
                        }
                        cVar.G(zhm.r0.p(mapG2, linkedHashMap2), "CONFIGS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(o4d.b.class)))));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h0 params2 = (h0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        r0 r0Var2 = this.f212353b;
                        efm.d0 d0VarK = r0Var2.f212400h.k(Unit.f186387a);
                        a0 a0Var = new a0(new y(r0Var2, params2, 0), 0);
                        d0VarK.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarK, a0Var, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 5:
                        h0 params3 = (h0) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ne0.j jVar2 = this.f212353b.f212397b;
                        r0.Companion.getClass();
                        jVar2.f(e0.b(params3), domain3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String context2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        efm.d0<s4d.m> sortedWatchlistItems = this.f212353b.d.getSortedWatchlistItems(context2, null);
                        a0 a0Var2 = new a0(new mll.h(context2, 17), 4);
                        sortedWatchlistItems.getClass();
                        ufm.i iVar3 = new ufm.i(sortedWatchlistItems, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String context3 = (String) obj2;
                        ogd.a assetPairCustomOrderIds2 = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds2, "assetPairCustomOrderIds");
                        this.f212353b.f212397b.f("MEMORY_ORDERING_KEY_" + context3, assetPairCustomOrderIds2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 1;
        Function2 function24 = new Function2(this) { // from class: n4d.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f212353b;

            {
                this.f212353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        String context = (String) obj2;
                        ogd.a assetPairCustomOrderIds = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds, "assetPairCustomOrderIds");
                        this.f212353b.f212398c.G(new o4d.a(context, assetPairCustomOrderIds.f225103b), j6.a.q("STORAGE_ORDERING_KEY_", context), wim.z.d(kotlin.jvm.internal.o0.b(o4d.a.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List params = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        r0 r0Var = this.f212353b;
                        WatchlistService watchlistService2 = r0Var.d;
                        List list = params;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                        }
                        efm.d0<Response<s4d.k>> settings = watchlistService2.getSettings(arrayList);
                        i2 i2Var = new i2(26, new v0(29));
                        settings.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(settings, i2Var, 1), new i2(27, new lsl.d(24, r0Var, params)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f212353b.f212397b;
                        Map mapG = (Map) jVar.get("CONFIGS_MEMORY_KEY");
                        if (mapG == null) {
                            mapG = zhm.r0.g();
                        }
                        List list2 = domain;
                        int iB = zhm.q0.b(zhm.w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj4 : list2) {
                            linkedHashMap.put(((z3d.b) obj4).f319246a.f86866a, obj4);
                        }
                        jVar.f("CONFIGS_MEMORY_KEY", zhm.r0.p(mapG, linkedHashMap));
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = this.f212353b.f212398c;
                        Map mapG2 = (Map) cVar.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                        if (mapG2 == null) {
                            mapG2 = zhm.r0.g();
                        }
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<z3d.b> list3 = domain2;
                        int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (z3d.b bVar : list3) {
                            String str = bVar.f319246a.f86866a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            linkedHashMap2.put(str, new o4d.b(bVar.f319247b));
                        }
                        cVar.G(zhm.r0.p(mapG2, linkedHashMap2), "CONFIGS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(o4d.b.class)))));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h0 params2 = (h0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        r0 r0Var2 = this.f212353b;
                        efm.d0 d0VarK = r0Var2.f212400h.k(Unit.f186387a);
                        a0 a0Var = new a0(new y(r0Var2, params2, 0), 0);
                        d0VarK.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarK, a0Var, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 5:
                        h0 params3 = (h0) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ne0.j jVar2 = this.f212353b.f212397b;
                        r0.Companion.getClass();
                        jVar2.f(e0.b(params3), domain3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String context2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        efm.d0<s4d.m> sortedWatchlistItems = this.f212353b.d.getSortedWatchlistItems(context2, null);
                        a0 a0Var2 = new a0(new mll.h(context2, 17), 4);
                        sortedWatchlistItems.getClass();
                        ufm.i iVar3 = new ufm.i(sortedWatchlistItems, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String context3 = (String) obj2;
                        ogd.a assetPairCustomOrderIds2 = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds2, "assetPairCustomOrderIds");
                        this.f212353b.f212397b.f("MEMORY_ORDERING_KEY_" + context3, assetPairCustomOrderIds2);
                        return Unit.f186387a;
                }
            }
        };
        final int i22 = 2;
        b0 b0Var4 = new b0(this, i22);
        Function2 function25 = new Function2(this) { // from class: n4d.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f212353b;

            {
                this.f212353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        String context = (String) obj2;
                        ogd.a assetPairCustomOrderIds = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds, "assetPairCustomOrderIds");
                        this.f212353b.f212398c.G(new o4d.a(context, assetPairCustomOrderIds.f225103b), j6.a.q("STORAGE_ORDERING_KEY_", context), wim.z.d(kotlin.jvm.internal.o0.b(o4d.a.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List params = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        r0 r0Var = this.f212353b;
                        WatchlistService watchlistService2 = r0Var.d;
                        List list = params;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                        }
                        efm.d0<Response<s4d.k>> settings = watchlistService2.getSettings(arrayList);
                        i2 i2Var = new i2(26, new v0(29));
                        settings.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(settings, i2Var, 1), new i2(27, new lsl.d(24, r0Var, params)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f212353b.f212397b;
                        Map mapG = (Map) jVar.get("CONFIGS_MEMORY_KEY");
                        if (mapG == null) {
                            mapG = zhm.r0.g();
                        }
                        List list2 = domain;
                        int iB = zhm.q0.b(zhm.w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj4 : list2) {
                            linkedHashMap.put(((z3d.b) obj4).f319246a.f86866a, obj4);
                        }
                        jVar.f("CONFIGS_MEMORY_KEY", zhm.r0.p(mapG, linkedHashMap));
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = this.f212353b.f212398c;
                        Map mapG2 = (Map) cVar.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                        if (mapG2 == null) {
                            mapG2 = zhm.r0.g();
                        }
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<z3d.b> list3 = domain2;
                        int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (z3d.b bVar : list3) {
                            String str = bVar.f319246a.f86866a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            linkedHashMap2.put(str, new o4d.b(bVar.f319247b));
                        }
                        cVar.G(zhm.r0.p(mapG2, linkedHashMap2), "CONFIGS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(o4d.b.class)))));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h0 params2 = (h0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        r0 r0Var2 = this.f212353b;
                        efm.d0 d0VarK = r0Var2.f212400h.k(Unit.f186387a);
                        a0 a0Var = new a0(new y(r0Var2, params2, 0), 0);
                        d0VarK.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarK, a0Var, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 5:
                        h0 params3 = (h0) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ne0.j jVar2 = this.f212353b.f212397b;
                        r0.Companion.getClass();
                        jVar2.f(e0.b(params3), domain3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String context2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        efm.d0<s4d.m> sortedWatchlistItems = this.f212353b.d.getSortedWatchlistItems(context2, null);
                        a0 a0Var2 = new a0(new mll.h(context2, 17), 4);
                        sortedWatchlistItems.getClass();
                        ufm.i iVar3 = new ufm.i(sortedWatchlistItems, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String context3 = (String) obj2;
                        ogd.a assetPairCustomOrderIds2 = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds2, "assetPairCustomOrderIds");
                        this.f212353b.f212397b.f("MEMORY_ORDERING_KEY_" + context3, assetPairCustomOrderIds2);
                        return Unit.f186387a;
                }
            }
        };
        final int i32 = 3;
        this.f212402l = new w4l.f(function24, b0Var4, function25, new b0(this, i32), new Function2(this) { // from class: n4d.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f212353b;

            {
                this.f212353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        String context = (String) obj2;
                        ogd.a assetPairCustomOrderIds = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds, "assetPairCustomOrderIds");
                        this.f212353b.f212398c.G(new o4d.a(context, assetPairCustomOrderIds.f225103b), j6.a.q("STORAGE_ORDERING_KEY_", context), wim.z.d(kotlin.jvm.internal.o0.b(o4d.a.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List params = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        r0 r0Var = this.f212353b;
                        WatchlistService watchlistService2 = r0Var.d;
                        List list = params;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                        }
                        efm.d0<Response<s4d.k>> settings = watchlistService2.getSettings(arrayList);
                        i2 i2Var = new i2(26, new v0(29));
                        settings.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(settings, i2Var, 1), new i2(27, new lsl.d(24, r0Var, params)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f212353b.f212397b;
                        Map mapG = (Map) jVar.get("CONFIGS_MEMORY_KEY");
                        if (mapG == null) {
                            mapG = zhm.r0.g();
                        }
                        List list2 = domain;
                        int iB = zhm.q0.b(zhm.w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj4 : list2) {
                            linkedHashMap.put(((z3d.b) obj4).f319246a.f86866a, obj4);
                        }
                        jVar.f("CONFIGS_MEMORY_KEY", zhm.r0.p(mapG, linkedHashMap));
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = this.f212353b.f212398c;
                        Map mapG2 = (Map) cVar.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                        if (mapG2 == null) {
                            mapG2 = zhm.r0.g();
                        }
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<z3d.b> list3 = domain2;
                        int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (z3d.b bVar : list3) {
                            String str = bVar.f319246a.f86866a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            linkedHashMap2.put(str, new o4d.b(bVar.f319247b));
                        }
                        cVar.G(zhm.r0.p(mapG2, linkedHashMap2), "CONFIGS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(o4d.b.class)))));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h0 params2 = (h0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        r0 r0Var2 = this.f212353b;
                        efm.d0 d0VarK = r0Var2.f212400h.k(Unit.f186387a);
                        a0 a0Var = new a0(new y(r0Var2, params2, 0), 0);
                        d0VarK.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarK, a0Var, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 5:
                        h0 params3 = (h0) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ne0.j jVar2 = this.f212353b.f212397b;
                        r0.Companion.getClass();
                        jVar2.f(e0.b(params3), domain3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String context2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        efm.d0<s4d.m> sortedWatchlistItems = this.f212353b.d.getSortedWatchlistItems(context2, null);
                        a0 a0Var2 = new a0(new mll.h(context2, 17), 4);
                        sortedWatchlistItems.getClass();
                        ufm.i iVar3 = new ufm.i(sortedWatchlistItems, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String context3 = (String) obj2;
                        ogd.a assetPairCustomOrderIds2 = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(assetPairCustomOrderIds2, "assetPairCustomOrderIds");
                        this.f212353b.f212397b.f("MEMORY_ORDERING_KEY_" + context3, assetPairCustomOrderIds2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static final void a(r0 r0Var) {
        lfm.c cVar = r0Var.f;
        efm.d0 d0VarK = r0Var.f212400h.k(Unit.f186387a);
        a0 a0Var = new a0(new b0(r0Var, 0), 2);
        d0VarK.getClass();
        ufm.f fVar = new ufm.f(d0VarK, a0Var, 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        ufm.i iVar = new ufm.i(fVar, new kl.c0(new p1(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new a08.s(29, i0.f212363a), new a08.s(29, j0.f212366a), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        te0.w.j0(cVar, iVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00fe -> B:38:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(n4d.r0 r15, java.util.List r16, gim.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4d.r0.b(n4d.r0, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String e(String str) {
        String id10;
        switch (str.hashCode()) {
            case -976319135:
                id10 = !str.equals("CURRENCY_PAIRS_ORDERING_REVOLUT_X") ? null : "CURRENCY_PAIRS_SORTING_ALG";
                break;
            case 59872765:
                id10 = !str.equals("COMBINED_WATCHLIST_ORDERING_SECURITIES") ? null : "WATCHLIST_STOCKS_WIDGET_SORTING_ALG";
                break;
            case 197918304:
                id10 = !str.equals("COMBINED_WATCHLIST_ORDERING_CRYPTO") ? null : "WATCHLIST_CRYPTO_WIDGET_SORTING_ALG";
                break;
            case 697557566:
                id10 = !str.equals("COMBINED_WATCHLIST_ORDERING_HOME") ? null : "WATCHLIST_HOME_WIDGET_SORTING_ALG";
                break;
            default:
                id10 = null;
                break;
        }
        if (id10 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10;
    }

    public final Object c(Map map, gim.c cVar) throws Throwable {
        mx5.g gVar = new mx5.g(this, map, null, 18);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, gVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final boolean d(h0 h0Var) {
        Companion.getClass();
        String strA = e0.a(h0Var);
        Class cls = Boolean.TYPE;
        return ((Boolean) this.f212398c.v0(Boolean.FALSE, strA, cls)).booleanValue();
    }

    public final ArrayList f(h0 h0Var) {
        List list = h0Var.f212360a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
        }
        List<o4d.c> listD = this.f212396a.d(arrayList);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
        for (o4d.c cVar : listD) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList2.add(new z3d.e(cVar.f222196b, cVar.f222197c, cVar.d, new FavouritesAssetTypeKey(cVar.f222195a), (z3d.f) u1.u(cVar.e, t0.g())));
        }
        return arrayList2;
    }

    public final Flow g(List assetTypeKeys, boolean z) {
        ogd.d dVar;
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        ue0.c cVar = this.f212398c;
        String str = o;
        efm.r map = te0.w.a0(rd0.e.c(cVar.C0(str, String.class), kotlin.coroutines.g.f186406a), new v0(27)).map(new a0(new v0(28), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        String str2 = (String) cVar.T2(str, String.class);
        if (str2 == null || (dVar = (ogd.d) u1.v(str2, (Map) p4d.a.f232912a.getValue())) == null) {
            dVar = f212394n;
        }
        efm.r rVarSwitchMap = map.startWith(dVar).distinctUntilChanged().switchMap(new a0(new l1.e(assetTypeKeys, this, z, 16), 1));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rd0.e.b(rVarSwitchMap);
    }
}
