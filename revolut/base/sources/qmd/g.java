package qmd;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.spending_analytics.impl.network.SpendingAnalyticsService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import wim.z;
import zhm.q0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpendingAnalyticsService f247811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f247812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f247813c;
    public final Type d;
    public final w4l.f e;

    public g(SpendingAnalyticsService spendingAnalyticsService, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(spendingAnalyticsService, "spendingAnalyticsService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f247811a = spendingAnalyticsService;
        this.f247812b = storage;
        this.f247813c = memoryCache;
        this.d = new TypeToken<Map<String, ? extends Long>>() { // from class: com.revolut.feature.spending_analytics.impl.repository.ProjectedSpendRepositoryImpl$mapStringLongType$1
        }.getType();
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: qmd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f247808b;

            {
                this.f247808b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Pair paramsWithKey = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paramsWithKey, "paramsWithKey");
                        String str = (String) paramsWithKey.f186385a;
                        kmd.c cVar = (kmd.c) paramsWithKey.f186386b;
                        LocalDate localDateNow = LocalDate.now();
                        g gVar = this.f247808b;
                        d0<kmd.b> spendProjection = gVar.f247811a.getSpendProjection(cVar);
                        c cVar2 = new c(0, new q2k.b(5, str, gVar, localDateNow, cVar));
                        spendProjection.getClass();
                        ufm.i iVar = new ufm.i(spendProjection, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(ue0.e.F(iVar, g.a(cVar)), new c(1, new qce.a(gVar, localDateNow, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        Pair params = (Pair) obj2;
                        Map projection = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        this.f247808b.f247813c.f(params.f186385a, projection);
                        break;
                    default:
                        Pair params2 = (Pair) obj2;
                        Map domain = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar3 = this.f247808b.f247812b;
                        String str2 = (String) params2.f186385a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(domain.size()));
                        for (Map.Entry entry : domain.entrySet()) {
                            linkedHashMap.put(((LocalDate) entry.getKey()).toString(), entry.getValue());
                        }
                        cVar3.G(linkedHashMap, str2, z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(Long.TYPE)))));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: qmd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f247810b;

            {
                this.f247810b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Pair params = (Pair) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (Map) this.f247810b.f247813c.get(params.f186385a);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f247810b;
                        ue0.c cVar = gVar.f247812b;
                        String str = (String) params.f186385a;
                        Type mapStringLongType = gVar.d;
                        Intrinsics.checkNotNullExpressionValue(mapStringLongType, "mapStringLongType");
                        Map mapG = (Map) cVar.T2(str, mapStringLongType);
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                        for (Map.Entry entry : mapG.entrySet()) {
                            LocalDate localDate = LocalDate.parse((String) entry.getKey());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            linkedHashMap.put(localDate, entry.getValue());
                        }
                        return linkedHashMap;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: qmd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f247808b;

            {
                this.f247808b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Pair paramsWithKey = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paramsWithKey, "paramsWithKey");
                        String str = (String) paramsWithKey.f186385a;
                        kmd.c cVar = (kmd.c) paramsWithKey.f186386b;
                        LocalDate localDateNow = LocalDate.now();
                        g gVar = this.f247808b;
                        d0<kmd.b> spendProjection = gVar.f247811a.getSpendProjection(cVar);
                        c cVar2 = new c(0, new q2k.b(5, str, gVar, localDateNow, cVar));
                        spendProjection.getClass();
                        ufm.i iVar = new ufm.i(spendProjection, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(ue0.e.F(iVar, g.a(cVar)), new c(1, new qce.a(gVar, localDateNow, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        Pair params = (Pair) obj2;
                        Map projection = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        this.f247808b.f247813c.f(params.f186385a, projection);
                        break;
                    default:
                        Pair params2 = (Pair) obj2;
                        Map domain = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar3 = this.f247808b.f247812b;
                        String str2 = (String) params2.f186385a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(domain.size()));
                        for (Map.Entry entry : domain.entrySet()) {
                            linkedHashMap.put(((LocalDate) entry.getKey()).toString(), entry.getValue());
                        }
                        cVar3.G(linkedHashMap, str2, z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(Long.TYPE)))));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: qmd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f247810b;

            {
                this.f247810b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Pair params = (Pair) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (Map) this.f247810b.f247813c.get(params.f186385a);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f247810b;
                        ue0.c cVar = gVar.f247812b;
                        String str = (String) params.f186385a;
                        Type mapStringLongType = gVar.d;
                        Intrinsics.checkNotNullExpressionValue(mapStringLongType, "mapStringLongType");
                        Map mapG = (Map) cVar.T2(str, mapStringLongType);
                        if (mapG == null) {
                            mapG = r0.g();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
                        for (Map.Entry entry : mapG.entrySet()) {
                            LocalDate localDate = LocalDate.parse((String) entry.getKey());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            linkedHashMap.put(localDate, entry.getValue());
                        }
                        return linkedHashMap;
                }
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: qmd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f247808b;

            {
                this.f247808b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Pair paramsWithKey = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paramsWithKey, "paramsWithKey");
                        String str = (String) paramsWithKey.f186385a;
                        kmd.c cVar = (kmd.c) paramsWithKey.f186386b;
                        LocalDate localDateNow = LocalDate.now();
                        g gVar = this.f247808b;
                        d0<kmd.b> spendProjection = gVar.f247811a.getSpendProjection(cVar);
                        c cVar2 = new c(0, new q2k.b(5, str, gVar, localDateNow, cVar));
                        spendProjection.getClass();
                        ufm.i iVar = new ufm.i(spendProjection, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(ue0.e.F(iVar, g.a(cVar)), new c(1, new qce.a(gVar, localDateNow, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        Pair params = (Pair) obj2;
                        Map projection = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        this.f247808b.f247813c.f(params.f186385a, projection);
                        break;
                    default:
                        Pair params2 = (Pair) obj2;
                        Map domain = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar3 = this.f247808b.f247812b;
                        String str2 = (String) params2.f186385a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(domain.size()));
                        for (Map.Entry entry : domain.entrySet()) {
                            linkedHashMap.put(((LocalDate) entry.getKey()).toString(), entry.getValue());
                        }
                        cVar3.G(linkedHashMap, str2, z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(Long.TYPE)))));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static ArrayList a(kmd.c cVar) {
        List historicalData = cVar.getHistoricalData();
        Intrinsics.checkNotNullParameter(historicalData, "<this>");
        Iterator it8 = historicalData.iterator();
        double dLongValue = 0.0d;
        int i = 0;
        while (it8.hasNext()) {
            dLongValue += ((Number) it8.next()).longValue();
            i++;
            if (i < 0) {
                v.r();
                throw null;
            }
        }
        long j2 = (long) (i == 0 ? Double.NaN : dLongValue / ((double) i));
        int forecastLength = (int) cVar.getForecastLength();
        ArrayList arrayList = new ArrayList(forecastLength);
        for (int i2 = 0; i2 < forecastLength; i2++) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }
}
