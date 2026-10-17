package e8h;

import com.revolut.feature.wealth.impl.data.network.popularfirstbuy.PopularFirstBuyService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PopularFirstBuyService f123729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8h.d f123730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f123731c;
    public final w4l.f d;

    public u(PopularFirstBuyService service, m8h.d storage, ne0.j memoryCache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f123729a = service;
        this.f123730b = storage;
        this.f123731c = memoryCache;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: e8h.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f123726b;

            {
                this.f123726b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                u uVar = this.f123726b;
                Unit params = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<w7h.a>> popularFirstBuy = uVar.f123729a.getPopularFirstBuy();
                        t tVar = t.f;
                        dug.e eVar = new dug.e(9);
                        popularFirstBuy.getClass();
                        ufm.i iVar = new ufm.i(popularFirstBuy, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "it");
                        return (xzg.g0) uVar.f123731c.get("POPULAR_FIRST_BUY_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(params, "it");
                        m8h.a aVar = (m8h.a) yh5.b.u(uVar.f123730b.f203547a, "PopularFirstBuy.POPULAR_FIRST_BUY_ASSETS", m8h.d.f203545b);
                        if (aVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        List stocks = aVar.getStocks();
                        List listA = stocks != null ? m8h.b.a(stocks) : zhm.f0.f322471a;
                        List etfs = aVar.getEtfs();
                        return new xzg.g0(listA, etfs != null ? m8h.b.a(etfs) : zhm.f0.f322471a);
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: e8h.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f123726b;

            {
                this.f123726b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                u uVar = this.f123726b;
                Unit params = (Unit) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<w7h.a>> popularFirstBuy = uVar.f123729a.getPopularFirstBuy();
                        t tVar = t.f;
                        dug.e eVar = new dug.e(9);
                        popularFirstBuy.getClass();
                        ufm.i iVar = new ufm.i(popularFirstBuy, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "it");
                        return (xzg.g0) uVar.f123731c.get("POPULAR_FIRST_BUY_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(params, "it");
                        m8h.a aVar = (m8h.a) yh5.b.u(uVar.f123730b.f203547a, "PopularFirstBuy.POPULAR_FIRST_BUY_ASSETS", m8h.d.f203545b);
                        if (aVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        List stocks = aVar.getStocks();
                        List listA = stocks != null ? m8h.b.a(stocks) : zhm.f0.f322471a;
                        List etfs = aVar.getEtfs();
                        return new xzg.g0(listA, etfs != null ? m8h.b.a(etfs) : zhm.f0.f322471a);
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: e8h.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f123728b;

            {
                this.f123728b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                xzg.g0 content = (xzg.g0) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(content, "content");
                        this.f123728b.f123731c.f("POPULAR_FIRST_BUY_CACHE_KEY", content);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(content, "content");
                        m8h.d dVar = this.f123728b.f123730b;
                        Intrinsics.checkNotNullParameter(content, "<this>");
                        m8h.a entity = new m8h.a(m8h.b.b(content.f309992a), m8h.b.b(content.f309993b));
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        dVar.f203547a.G(entity, "PopularFirstBuy.POPULAR_FIRST_BUY_ASSETS", wim.z.d(kotlin.jvm.internal.o0.b(m8h.a.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: e8h.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f123726b;

            {
                this.f123726b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i5;
                u uVar = this.f123726b;
                Unit params = (Unit) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<w7h.a>> popularFirstBuy = uVar.f123729a.getPopularFirstBuy();
                        t tVar = t.f;
                        dug.e eVar = new dug.e(9);
                        popularFirstBuy.getClass();
                        ufm.i iVar = new ufm.i(popularFirstBuy, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "it");
                        return (xzg.g0) uVar.f123731c.get("POPULAR_FIRST_BUY_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(params, "it");
                        m8h.a aVar = (m8h.a) yh5.b.u(uVar.f123730b.f203547a, "PopularFirstBuy.POPULAR_FIRST_BUY_ASSETS", m8h.d.f203545b);
                        if (aVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        List stocks = aVar.getStocks();
                        List listA = stocks != null ? m8h.b.a(stocks) : zhm.f0.f322471a;
                        List etfs = aVar.getEtfs();
                        return new xzg.g0(listA, etfs != null ? m8h.b.a(etfs) : zhm.f0.f322471a);
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: e8h.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f123728b;

            {
                this.f123728b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                xzg.g0 content = (xzg.g0) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(content, "content");
                        this.f123728b.f123731c.f("POPULAR_FIRST_BUY_CACHE_KEY", content);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(content, "content");
                        m8h.d dVar = this.f123728b.f123730b;
                        Intrinsics.checkNotNullParameter(content, "<this>");
                        m8h.a entity = new m8h.a(m8h.b.b(content.f309992a), m8h.b.b(content.f309993b));
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        dVar.f203547a.G(entity, "PopularFirstBuy.POPULAR_FIRST_BUY_ASSETS", wim.z.d(kotlin.jvm.internal.o0.b(m8h.a.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
