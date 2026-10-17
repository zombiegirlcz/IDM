package plc;

import com.revolut.feature.robo.impl.data.network.TemplateService;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import te0.w;
import vlc.a;
import wim.z;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateService f237349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlc.g f237350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej9.c f237351c;
    public final ylc.c d;
    public final nlc.a e;
    public final w4l.f f;

    public n(b80.c connectivityRepository, TemplateService service, vlc.g networkMapper, ej9.c storage, ylc.c mapper, nlc.a cache) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f237349a = service;
        this.f237350b = networkMapper;
        this.f237351c = storage;
        this.d = mapper;
        this.e = cache;
        uj0.b bVarK0 = w.k0(connectivityRepository, new i(1, this, n.class, "getFromNetwork", "getFromNetwork(Lcom/revolut/feature/robo/api/model/DrawdownChartParams;)Lio/reactivex/Single;", 0, 7));
        i iVar = new i(1, this, n.class, "getFromStorage", "getFromStorage(Lcom/revolut/feature/robo/api/model/DrawdownChartParams;)Lcom/revolut/feature/wealth/models/drawdown/DrawdownChart;", 0, 8);
        i iVar2 = new i(1, this, n.class, "getFromMemory", "getFromMemory(Lcom/revolut/feature/robo/api/model/DrawdownChartParams;)Lcom/revolut/feature/wealth/models/drawdown/DrawdownChart;", 0, 9);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: plc.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f237348b;

            {
                this.f237348b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        alc.b params = (alc.b) obj2;
                        sdh.b drawdown = (sdh.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(drawdown, "drawdown");
                        n nVar = this.f237348b;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(drawdown, "drawdown");
                        nVar.e.A(params, drawdown);
                        break;
                    default:
                        alc.b params2 = (alc.b) obj2;
                        sdh.b drawdownChart = (sdh.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(drawdownChart, "drawdown");
                        Intrinsics.checkNotNullParameter(drawdownChart, "drawdown");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(drawdownChart, "drawdownChart");
                        long epochMilli = drawdownChart.f261890a.toEpochMilli();
                        long epochMilli2 = drawdownChart.f261891b.toEpochMilli();
                        BigDecimal bigDecimal = drawdownChart.f261892c;
                        Instant instant = drawdownChart.d;
                        Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                        Instant instant2 = drawdownChart.e;
                        Long lValueOf2 = instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null;
                        BigDecimal bigDecimal2 = drawdownChart.f;
                        ArrayList arrayList = drawdownChart.f261893g;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            sdh.a aVar = (sdh.a) it8.next();
                            arrayList2.add(new a.C1602a(aVar.f261887a.toEpochMilli(), aVar.f261888b, aVar.f261889c));
                            it8 = it8;
                            epochMilli = epochMilli;
                        }
                        vlc.a drawdown2 = new vlc.a(epochMilli, epochMilli2, bigDecimal, lValueOf, lValueOf2, bigDecimal2, arrayList2);
                        ej9.c cVar = this.f237348b.f237351c;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(drawdown2, "drawdown");
                        cVar.f126792a.G(drawdown2, pyd.c.g0(params2), z.d(o0.b(vlc.a.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        this.f = new w4l.f(bVarK0, iVar2, function2, iVar, new Function2(this) { // from class: plc.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f237348b;

            {
                this.f237348b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        alc.b params = (alc.b) obj2;
                        sdh.b drawdown = (sdh.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(drawdown, "drawdown");
                        n nVar = this.f237348b;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(drawdown, "drawdown");
                        nVar.e.A(params, drawdown);
                        break;
                    default:
                        alc.b params2 = (alc.b) obj2;
                        sdh.b drawdownChart = (sdh.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(drawdownChart, "drawdown");
                        Intrinsics.checkNotNullParameter(drawdownChart, "drawdown");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(drawdownChart, "drawdownChart");
                        long epochMilli = drawdownChart.f261890a.toEpochMilli();
                        long epochMilli2 = drawdownChart.f261891b.toEpochMilli();
                        BigDecimal bigDecimal = drawdownChart.f261892c;
                        Instant instant = drawdownChart.d;
                        Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                        Instant instant2 = drawdownChart.e;
                        Long lValueOf2 = instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null;
                        BigDecimal bigDecimal2 = drawdownChart.f;
                        ArrayList arrayList = drawdownChart.f261893g;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            sdh.a aVar = (sdh.a) it8.next();
                            arrayList2.add(new a.C1602a(aVar.f261887a.toEpochMilli(), aVar.f261888b, aVar.f261889c));
                            it8 = it8;
                            epochMilli = epochMilli;
                        }
                        vlc.a drawdown2 = new vlc.a(epochMilli, epochMilli2, bigDecimal, lValueOf, lValueOf2, bigDecimal2, arrayList2);
                        ej9.c cVar = this.f237348b.f237351c;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(drawdown2, "drawdown");
                        cVar.f126792a.G(drawdown2, pyd.c.g0(params2), z.d(o0.b(vlc.a.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    @Override // phm.a
    public final Object get() {
        return this.f;
    }
}
