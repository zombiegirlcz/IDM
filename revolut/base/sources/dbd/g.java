package dbd;

import akl.o;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import cvi.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vad.h;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zt6.g f112730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd1.a f112731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f112732c;
    public final xad.a d;
    public final ue0.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f112733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f112734h;

    public g(zt6.g dataProvider, bd1.a litePosCatalogueLineItemMapper, j memoryCache, xad.a orderInitiationPageDao, ue0.c storage) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(litePosCatalogueLineItemMapper, "litePosCatalogueLineItemMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(orderInitiationPageDao, "orderInitiationPageDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f112730a = dataProvider;
        this.f112731b = litePosCatalogueLineItemMapper;
        this.f112732c = memoryCache;
        this.d = orderInitiationPageDao;
        this.e = storage;
        q.a(0, 1, ukm.f.DROP_OLDEST);
        Continuation continuation = null;
        final int i = 0;
        this.f = new x4l.c(new i(this, continuation, 16), new Function1(this) { // from class: dbd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f112722b;

            {
                this.f112722b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f112722b.f112732c.get(g.a(params));
                    case 1:
                        vad.g params2 = (vad.g) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (h) this.f112722b.f112732c.get(g.b(params2));
                    default:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (OrderInitiationPage) this.f112722b.f112732c.get(it8);
                }
            }
        }, new Function2(this) { // from class: dbd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f112724b;

            {
                this.f112724b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f112724b.f112732c.f(g.a(params), data);
                        break;
                    case 1:
                        vad.g params2 = (vad.g) obj2;
                        h data2 = (h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        j jVar = this.f112724b.f112732c;
                        String strB = g.b(params2);
                        List items = data2.f287277a;
                        vad.b scannedInterval = data2.f287278b;
                        vad.b bVar = data2.f287279c;
                        Intrinsics.checkNotNullParameter(items, "items");
                        Intrinsics.checkNotNullParameter(scannedInterval, "scannedInterval");
                        jVar.f(strB, new h(items, scannedInterval, bVar, true));
                        break;
                    default:
                        String params3 = (String) obj2;
                        OrderInitiationPage data3 = (OrderInitiationPage) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f112724b.f112732c.f(params3, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, 1), new awd.b(this, continuation, 26));
        final int i2 = 1;
        this.f112733g = new x4l.c(new i(this, continuation, 17), new Function1(this) { // from class: dbd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f112722b;

            {
                this.f112722b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f112722b.f112732c.get(g.a(params));
                    case 1:
                        vad.g params2 = (vad.g) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (h) this.f112722b.f112732c.get(g.b(params2));
                    default:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (OrderInitiationPage) this.f112722b.f112732c.get(it8);
                }
            }
        }, new Function2(this) { // from class: dbd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f112724b;

            {
                this.f112724b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f112724b.f112732c.f(g.a(params), data);
                        break;
                    case 1:
                        vad.g params2 = (vad.g) obj2;
                        h data2 = (h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        j jVar = this.f112724b.f112732c;
                        String strB = g.b(params2);
                        List items = data2.f287277a;
                        vad.b scannedInterval = data2.f287278b;
                        vad.b bVar = data2.f287279c;
                        Intrinsics.checkNotNullParameter(items, "items");
                        Intrinsics.checkNotNullParameter(scannedInterval, "scannedInterval");
                        jVar.f(strB, new h(items, scannedInterval, bVar, true));
                        break;
                    default:
                        String params3 = (String) obj2;
                        OrderInitiationPage data3 = (OrderInitiationPage) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f112724b.f112732c.f(params3, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new o(2, 26, continuation), new a19.e(3, 24, continuation));
        final int i3 = 2;
        this.f112734h = new x4l.c(new i(this, continuation, 15), new Function1(this) { // from class: dbd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f112722b;

            {
                this.f112722b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f112722b.f112732c.get(g.a(params));
                    case 1:
                        vad.g params2 = (vad.g) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (h) this.f112722b.f112732c.get(g.b(params2));
                    default:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (OrderInitiationPage) this.f112722b.f112732c.get(it8);
                }
            }
        }, new Function2(this) { // from class: dbd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f112724b;

            {
                this.f112724b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        d params = (d) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f112724b.f112732c.f(g.a(params), data);
                        break;
                    case 1:
                        vad.g params2 = (vad.g) obj2;
                        h data2 = (h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        j jVar = this.f112724b.f112732c;
                        String strB = g.b(params2);
                        List items = data2.f287277a;
                        vad.b scannedInterval = data2.f287278b;
                        vad.b bVar = data2.f287279c;
                        Intrinsics.checkNotNullParameter(items, "items");
                        Intrinsics.checkNotNullParameter(scannedInterval, "scannedInterval");
                        jVar.f(strB, new h(items, scannedInterval, bVar, true));
                        break;
                    default:
                        String params3 = (String) obj2;
                        OrderInitiationPage data3 = (OrderInitiationPage) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f112724b.f112732c.f(params3, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, 0), new awd.b(this, continuation, 25));
    }

    public static String a(d dVar) {
        dVar.getClass();
        return p.a.p("OrderInitiationPagesParams(limit=1, product=", dVar.f112725a, ")");
    }

    public static String b(vad.g gVar) {
        return "SearchOrderInitiationPageRequest(product=" + gVar.f287272a + ", states=" + gVar.f287273b + ", currencies=" + gVar.f287274c + ", from=" + gVar.d + ", to=" + gVar.e + ", fromAmount=" + gVar.f + ", toAmount=" + gVar.f287275g + ", searchText=" + gVar.f287276h + ")";
    }

    public static Object c(String str, String str2, Function1 function1, g0a.e eVar) throws Throwable {
        cuc.c cVar = new cuc.c(function1, str2, str, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, cVar, eVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
