package plc;

import com.revolut.feature.robo.impl.data.network.TemplateService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import te0.w;
import wim.z;
import zlc.a;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateService f237355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlc.g f237356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wlc.d f237357c;
    public final nlc.a d;
    public final w4l.f e;

    public r(b80.c connectivityRepository, TemplateService service, vlc.g networkMapper, wlc.d storage, ylc.d mapper, nlc.a cache) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f237355a = service;
        this.f237356b = networkMapper;
        this.f237357c = storage;
        this.d = cache;
        uj0.b bVarK0 = w.k0(connectivityRepository, new i(1, this, r.class, "getFromNetwork", "getFromNetwork(Lcom/revolut/feature/robo/api/model/PerformanceChartParams;)Lio/reactivex/Single;", 0, 12));
        i iVar = new i(1, this, r.class, "getFromStorage", "getFromStorage(Lcom/revolut/feature/robo/api/model/PerformanceChartParams;)Lcom/revolut/feature/wealth/models/PerformanceChart;", 0, 13);
        i iVar2 = new i(1, this, r.class, "getFromMemory", "getFromMemory(Lcom/revolut/feature/robo/api/model/PerformanceChartParams;)Lcom/revolut/feature/wealth/models/PerformanceChart;", 0, 14);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: plc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f237354b;

            {
                this.f237354b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        alc.c params = (alc.c) obj2;
                        pdh.b performance = (pdh.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(performance, "templates");
                        r rVar = this.f237354b;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(performance, "performance");
                        rVar.d.A(params, performance);
                        break;
                    default:
                        alc.c params2 = (alc.c) obj2;
                        pdh.b performanceChart = (pdh.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceChart, "projection");
                        Intrinsics.checkNotNullParameter(performanceChart, "projection");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceChart, "performanceChart");
                        long millis = performanceChart.f235230a.getMillis();
                        long millis2 = performanceChart.f235231b.getMillis();
                        long millis3 = performanceChart.f235232c.getMillis();
                        ArrayList arrayList = performanceChart.d;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                            pdh.a aVar = (pdh.a) it8.next();
                            arrayList2.add(new a.C1793a(aVar.f235227a.getMillis(), aVar.f235228b, aVar.f235229c, aVar.d));
                        }
                        zlc.a projection = new zlc.a(millis, millis2, millis3, arrayList2);
                        wlc.d dVar = this.f237354b.f237357c;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        ue0.c cVar = dVar.f298471a;
                        wlc.d.Companion.getClass();
                        cVar.G(projection, wlc.c.a(params2), z.d(o0.b(zlc.a.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        this.e = new w4l.f(bVarK0, iVar2, function2, iVar, new Function2(this) { // from class: plc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f237354b;

            {
                this.f237354b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        alc.c params = (alc.c) obj2;
                        pdh.b performance = (pdh.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(performance, "templates");
                        r rVar = this.f237354b;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(performance, "performance");
                        rVar.d.A(params, performance);
                        break;
                    default:
                        alc.c params2 = (alc.c) obj2;
                        pdh.b performanceChart = (pdh.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceChart, "projection");
                        Intrinsics.checkNotNullParameter(performanceChart, "projection");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(performanceChart, "performanceChart");
                        long millis = performanceChart.f235230a.getMillis();
                        long millis2 = performanceChart.f235231b.getMillis();
                        long millis3 = performanceChart.f235232c.getMillis();
                        ArrayList arrayList = performanceChart.d;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                            pdh.a aVar = (pdh.a) it8.next();
                            arrayList2.add(new a.C1793a(aVar.f235227a.getMillis(), aVar.f235228b, aVar.f235229c, aVar.d));
                        }
                        zlc.a projection = new zlc.a(millis, millis2, millis3, arrayList2);
                        wlc.d dVar = this.f237354b.f237357c;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        ue0.c cVar = dVar.f298471a;
                        wlc.d.Companion.getClass();
                        cVar.G(projection, wlc.c.a(params2), z.d(o0.b(zlc.a.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    @Override // phm.a
    public final Object get() {
        return this.e;
    }
}
