package tw5;

import com.revolut.feature.cryptocommodity_invest.impl.network.CryptoStatsService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tc7.m0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoStatsService f274922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f274923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f274924c;
    public final w4l.f d;

    public e(CryptoStatsService service, j memoryCache, ue0.c storageCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        this.f274922a = service;
        this.f274923b = memoryCache;
        this.f274924c = storageCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: tw5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f274919b;

            {
                this.f274919b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                e eVar = this.f274919b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<qw5.a>> cryptoStats = eVar.f274922a.getCryptoStats();
                        d dVar = d.f;
                        m0 m0Var = new m0(5);
                        cryptoStats.getClass();
                        ufm.i iVar = new ufm.i(cryptoStats, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        eVar.f274923b.f("CRYPTO_STATS_MEMORY_CACHE_KEY", domain);
                        break;
                    default:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = eVar.f274924c;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (Iterator it9 = list.iterator(); it9.hasNext(); it9 = it9) {
                            cw5.b bVar = (cw5.b) it9.next();
                            arrayList.add(new rw5.a(bVar.f109534a, bVar.f109535b, bVar.f109536c, bVar.d, bVar.e, bVar.f));
                        }
                        cVar.G(arrayList, "CRYPTO_STATS_STORAGE_CACHE_KEY", kii.e.o(rw5.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: tw5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f274921b;

            {
                this.f274921b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f274921b.f274923b.get("CRYPTO_STATS_MEMORY_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f274921b.f274924c;
                        Type type = f.f274925a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-LIST_CRYPTO_STATS_TYPE>(...)");
                        List list = (List) cVar.T2("CRYPTO_STATS_STORAGE_CACHE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<rw5.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (rw5.a aVar : list2) {
                            arrayList.add(new cw5.b(aVar.getCode(), aVar.getMarketCap(), aVar.getCurrentPrice(), aVar.getPriceChange24h(), aVar.getBought24h(), aVar.getSold24h()));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: tw5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f274919b;

            {
                this.f274919b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                e eVar = this.f274919b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<qw5.a>> cryptoStats = eVar.f274922a.getCryptoStats();
                        d dVar = d.f;
                        m0 m0Var = new m0(5);
                        cryptoStats.getClass();
                        ufm.i iVar = new ufm.i(cryptoStats, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        eVar.f274923b.f("CRYPTO_STATS_MEMORY_CACHE_KEY", domain);
                        break;
                    default:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = eVar.f274924c;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (Iterator it9 = list.iterator(); it9.hasNext(); it9 = it9) {
                            cw5.b bVar = (cw5.b) it9.next();
                            arrayList.add(new rw5.a(bVar.f109534a, bVar.f109535b, bVar.f109536c, bVar.d, bVar.e, bVar.f));
                        }
                        cVar.G(arrayList, "CRYPTO_STATS_STORAGE_CACHE_KEY", kii.e.o(rw5.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: tw5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f274921b;

            {
                this.f274921b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f274921b.f274923b.get("CRYPTO_STATS_MEMORY_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f274921b.f274924c;
                        Type type = f.f274925a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-LIST_CRYPTO_STATS_TYPE>(...)");
                        List list = (List) cVar.T2("CRYPTO_STATS_STORAGE_CACHE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<rw5.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (rw5.a aVar : list2) {
                            arrayList.add(new cw5.b(aVar.getCode(), aVar.getMarketCap(), aVar.getCurrentPrice(), aVar.getPriceChange24h(), aVar.getBought24h(), aVar.getSold24h()));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: tw5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f274919b;

            {
                this.f274919b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                e eVar = this.f274919b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<qw5.a>> cryptoStats = eVar.f274922a.getCryptoStats();
                        d dVar = d.f;
                        m0 m0Var = new m0(5);
                        cryptoStats.getClass();
                        ufm.i iVar = new ufm.i(cryptoStats, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        eVar.f274923b.f("CRYPTO_STATS_MEMORY_CACHE_KEY", domain);
                        break;
                    default:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        ue0.c cVar = eVar.f274924c;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (Iterator it9 = list.iterator(); it9.hasNext(); it9 = it9) {
                            cw5.b bVar = (cw5.b) it9.next();
                            arrayList.add(new rw5.a(bVar.f109534a, bVar.f109535b, bVar.f109536c, bVar.d, bVar.e, bVar.f));
                        }
                        cVar.G(arrayList, "CRYPTO_STATS_STORAGE_CACHE_KEY", kii.e.o(rw5.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
