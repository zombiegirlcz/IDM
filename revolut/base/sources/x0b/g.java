package x0b;

import c1b.m;
import c1b.o;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.advanced_charts.api.extension.AdvancedChartExtensionContract$InputData;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.LockPolicy;
import com.revolut.feature.retail.advanced_charts.models.OverlayPolicy;
import com.revolut.kompot.common.ExternalDestination;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import le.u1;
import s7a.m0;
import tb4.t;
import vkm.j2;
import vkm.q;
import vkm.z1;
import wim.z;
import wvg.d0;
import wyc.p;
import yji.n;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends g0b.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0b.d f301549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f301550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v0b.d f301551n;
    public final AdvancedChartExtensionContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.c f301552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f301553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f301554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vki.a f301555s;

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    public g(i0b.d advancedChartsInteractor, t advancedChartsHistoryInteractor, v0b.d settingsInteractor, AdvancedChartExtensionContract$InputData inputData) {
        c1b.h hVar;
        xe0.e eVar = settingsInteractor.f284777a;
        Intrinsics.checkNotNullParameter(advancedChartsInteractor, "advancedChartsInteractor");
        Intrinsics.checkNotNullParameter(advancedChartsHistoryInteractor, "advancedChartsHistoryInteractor");
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f301549l = advancedChartsInteractor;
        this.f301550m = advancedChartsHistoryInteractor;
        this.f301551n = settingsInteractor;
        this.o = inputData;
        this.f301552p = new vii.c();
        this.f301554r = q.a(0, 1, ukm.f.DROP_OLDEST);
        c1b.d dVar = inputData.d;
        c1b.c identifier = inputData.f82059b;
        if (dVar == c1b.d.ONLY_STYLE) {
            hVar = inputData.f82058a;
        } else {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            hVar = (c1b.h) eVar.v0(c1b.h.ONE_HOUR, v0b.d.b(identifier, "INTERVAL"), z.d(o0.b(c1b.h.class)));
        }
        c1b.h hVar2 = hVar;
        AdvancedChartSymbol advancedChartSymbol = inputData.f82060c;
        Data data = new Data(null, null, false, 7, null);
        c1b.c cVar = inputData.f82059b;
        h0 h0Var = h0.f322473a;
        OverlayPolicy overlayPolicy = inputData.f;
        LockPolicy lockPolicy = inputData.f82061g;
        boolean z = !this.f301553q;
        Data data2 = new Data(null, null, false, 7, null);
        Data data3 = new Data(null, null, false, 7, null);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f301555s = pyd.c.a(this, new g0b.c(hVar2, null, (d1b.e) eVar.v0(d1b.e.CANDLES, p.a.p("advanced_charts_", u1.g(identifier, v0b.d.f284776b), "_key"), z.d(o0.b(d1b.e.class))), advancedChartSymbol, data, null, cVar, h0Var, h0Var, overlayPolicy, lockPolicy, data2, data3, z, new HashMap(), null, false, null, inputData.e, advancedChartsInteractor.d(), null));
    }

    @Override // yji.n
    public final void H2() {
        p pVar = new p(20);
        vki.a aVar = this.f301555s;
        int i = 0;
        Continuation continuation = null;
        n.l2(this, q.Q(aVar.B(pVar), new e(i, continuation, this)), null, new f(i, continuation, this), 3);
        int i2 = 1;
        n.l2(this, q.Q(this.f301552p.a(Unit.f186387a, w4l.h.f294642c), new e(i2, continuation, this)), null, new f(i2, continuation, this), 3);
        if (((g0b.c) ((j2) aVar.f22677a).getValue()).f139408q) {
            v3();
        }
    }

    @Override // g0b.d
    public final z1 Z2() {
        return this.f301554r;
    }

    @Override // g0b.d
    public final void b3(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        n.j2(this, s3(info), null, new f(2, null, this), 3);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // g0b.d
    public final void c3(d1b.e chartStyle) {
        Intrinsics.checkNotNullParameter(chartStyle, "newChartStyle");
        c cVar = new c(chartStyle, 1);
        vki.a aVar = this.f301555s;
        X2(aVar, cVar);
        c1b.c identifier = ((g0b.c) ((j2) aVar.f22677a).getValue()).f139401g;
        v0b.d dVar = this.f301551n;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        dVar.f284777a.G(chartStyle, p.a.p("advanced_charts_", u1.g(identifier, v0b.d.f284776b), "_key"), z.d(o0.b(d1b.e.class)));
    }

    @Override // g0b.d
    public final void d3(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        ((g0b.c) ((j2) this.f301555s.f22677a).getValue()).o.put(id10, new m(id10, name));
    }

    @Override // g0b.d
    public final void e3(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        n.j2(this, s3(info), null, new f(3, null, this), 3);
    }

    @Override // g0b.d
    public final void f3() {
        this.f301554r.k(Unit.f186387a);
    }

    @Override // g0b.d
    public final void g3(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        A2(new ExternalDestination.Browser(url2, null));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f301555s;
    }

    @Override // g0b.d
    public final void h3(String id10, String eventType) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Iterator<E> it8 = c1b.p.a().iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((c1b.p) next).b(), eventType)) {
                    break;
                }
            }
        }
        if (((c1b.p) next) == c1b.p.REMOVE) {
            vki.a aVar = this.f301555s;
            j2 j2Var = (j2) aVar.f22677a;
            j2 j2Var2 = (j2) aVar.f22677a;
            o oVar = (o) ((g0b.c) j2Var.getValue()).o.remove(id10);
            if (oVar == null) {
                return;
            }
            if (oVar instanceof m) {
                Iterator<E> it9 = d1b.c.b().iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next2 = it9.next();
                    if (Intrinsics.f(((d1b.c) next2).name(), ((m) oVar).f20442b)) {
                        obj2 = next2;
                        break;
                    }
                }
                d1b.c cVar = (d1b.c) obj2;
                if (cVar == null) {
                    return;
                }
                r3(a1.j(((g0b.c) j2Var2.getValue()).i, cVar));
                return;
            }
            if (!(oVar instanceof c1b.n)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it10 = ((g0b.c) j2Var2.getValue()).f139402h.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                Object next3 = it10.next();
                if (Intrinsics.f(((AdvancedChartSymbol) next3).getId(), ((c1b.n) oVar).f20444b)) {
                    obj2 = next3;
                    break;
                }
            }
            AdvancedChartSymbol advancedChartSymbol = (AdvancedChartSymbol) obj2;
            if (advancedChartSymbol == null) {
                return;
            }
            X2(aVar, new nrb.a(advancedChartSymbol, 4));
        }
    }

    @Override // g0b.d
    public final void i3(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        ((g0b.c) ((j2) this.f301555s.f22677a).getValue()).o.put(id10, new c1b.n(id10, name));
    }

    @Override // g0b.d
    public final void j3(String id10) {
        Object next;
        Intrinsics.checkNotNullParameter(id10, "id");
        vki.a aVar = this.f301555s;
        g0b.c cVar = (g0b.c) ((j2) aVar.f22677a).getValue();
        Iterator it8 = a1.m(cVar.f139402h, cVar.d).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((AdvancedChartSymbol) next).getId(), id10)) {
                    break;
                }
            }
        }
        AdvancedChartSymbol advancedChartSymbol = (AdvancedChartSymbol) next;
        if (advancedChartSymbol == null) {
            return;
        }
        X2(aVar, new nrb.a(advancedChartSymbol, 5));
    }

    @Override // g0b.d
    public final void k3() {
        X2(this.f301555s, new p(21));
    }

    @Override // g0b.d
    public final void l3() {
        X2(this.f301555s, new p(19));
        v3();
    }

    @Override // g0b.d
    public final void m3(c1b.h chartInterval) {
        Intrinsics.checkNotNullParameter(chartInterval, "newChartInterval");
        vki.a aVar = this.f301555s;
        if (((g0b.c) ((j2) aVar.f22677a).getValue()).f139398a != chartInterval) {
            X2(aVar, new d0(chartInterval, 29));
            this.f301552p.b(Unit.f186387a);
            c1b.c identifier = ((g0b.c) ((j2) aVar.f22677a).getValue()).f139401g;
            v0b.d dVar = this.f301551n;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
            dVar.f284777a.G(chartInterval, v0b.d.b(identifier, "INTERVAL"), z.d(o0.b(c1b.h.class)));
        }
    }

    @Override // g0b.d
    public final void n3(Set chartSymbolsToCompare) {
        Intrinsics.checkNotNullParameter(chartSymbolsToCompare, "chartSymbolsToCompare");
        X2(this.f301555s, new m0(21, chartSymbolsToCompare));
    }

    @Override // g0b.d
    public final void o3(c1b.i iVar) {
        X2(this.f301555s, new c(iVar, 0));
    }

    @Override // g0b.d
    public final void p3(AdvancedChartSymbol chartSymbol) {
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        vki.a aVar = this.f301555s;
        int i = d.f301543a[((g0b.c) ((j2) aVar.f22677a).getValue()).f139401g.ordinal()];
        if (i == 1 || i == 2) {
            X2(aVar, new nrb.a(chartSymbol, 3));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            X2(aVar, new nrb.a(chartSymbol, 2));
            this.f301552p.b(Unit.f186387a);
        }
    }

    @Override // g0b.d
    public final void q3(c1b.e eVar) {
        X2(this.f301555s, new d0(eVar, 28));
    }

    @Override // g0b.d
    public final void r3(Set chartIndicators) {
        Intrinsics.checkNotNullParameter(chartIndicators, "newIndicators");
        m0 m0Var = new m0(23, chartIndicators);
        vki.a aVar = this.f301555s;
        X2(aVar, m0Var);
        j2 j2Var = (j2) aVar.f22677a;
        AdvancedChartExtensionContract$InputData advancedChartExtensionContract$InputData = this.o;
        boolean z = advancedChartExtensionContract$InputData.f82062h;
        v0b.d dVar = this.f301551n;
        if (z) {
            Set setA = dVar.a(((g0b.c) j2Var.getValue()).f139401g);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setA) {
                d1b.c indicator = (d1b.c) obj2;
                OverlayPolicy overlayPolicy = advancedChartExtensionContract$InputData.f;
                overlayPolicy.getClass();
                Intrinsics.checkNotNullParameter(indicator, "indicator");
                if (!overlayPolicy.f82091a.contains(indicator)) {
                    arrayList.add(obj2);
                }
            }
            chartIndicators = a1.l(chartIndicators, zhm.d0.i1(arrayList));
        }
        c1b.c identifier = ((g0b.c) j2Var.getValue()).f139401g;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(chartIndicators, "chartIndicators");
        dVar.f284777a.G(chartIndicators, v0b.d.b(identifier, "INDICATORS"), kii.e.o(d1b.c.class, KTypeProjection.INSTANCE, Set.class));
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
    public final v0b.b s3(String historyRequestInfo) {
        c1b.l lVar;
        long jCurrentTimeMillis;
        t tVar;
        String strG;
        vki.a aVar = this.f301555s;
        int i = d.f301543a[((g0b.c) ((j2) aVar.f22677a).getValue()).f139401g.ordinal()];
        if (i == 1) {
            lVar = c1b.l.CRYPTO;
        } else if (i == 2) {
            lVar = c1b.l.REVX;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = c1b.l.STOCKS;
        }
        c1b.l chartType = lVar;
        c1b.h interval = ((g0b.c) ((j2) aVar.f22677a).getValue()).f139398a;
        w0b.d tradingHours = w0b.d.EXTENDED;
        t tVar2 = this.f301550m;
        tVar2.getClass();
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(historyRequestInfo, "historyRequestInfo");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(tradingHours, "tradingHours");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w0b.c cVar = (w0b.c) ((je0.d) tVar2.f269457c).b(historyRequestInfo, w0b.c.class);
        if (pd.b.j(cVar.e)) {
            tVar = tVar2;
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = cVar.f293679b * ((long) 1000);
            tVar = tVar2;
        }
        u0b.a aVar2 = (u0b.a) tVar.f269456b;
        long j2 = jCurrentTimeMillis;
        long j3 = cVar.f293678a * ((long) 1000);
        int i2 = cVar.f293680c;
        String symbol = cVar.d;
        o0b.e eVar = (o0b.e) aVar2;
        eVar.getClass();
        ?? r142 = o0b.e.e;
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(tradingHours, "tradingHours");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i3 = o0b.c.f221191a[chartType.ordinal()];
        if (i3 == 1) {
            strG = u1.g(interval, r142);
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            strG = u1.g(interval, r142).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(strG, "toLowerCase(...)");
        }
        return new v0b.b(eVar.d.b(new o0b.a(j3, j2, i2, symbol, strG, chartType, tradingHours), loadingStrategy), cVar, 0);
    }

    public final void t3() {
        vki.a aVar = this.f301555s;
        Set setA = this.f301551n.a(((g0b.c) ((j2) aVar.f22677a).getValue()).f139401g);
        AdvancedChartExtensionContract$InputData advancedChartExtensionContract$InputData = this.o;
        if (advancedChartExtensionContract$InputData.f82062h) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setA) {
                d1b.c indicator = (d1b.c) obj2;
                OverlayPolicy overlayPolicy = advancedChartExtensionContract$InputData.f;
                overlayPolicy.getClass();
                Intrinsics.checkNotNullParameter(indicator, "indicator");
                if (overlayPolicy.f82091a.contains(indicator)) {
                    arrayList.add(obj2);
                }
            }
            setA = zhm.d0.i1(arrayList);
        }
        if (Intrinsics.f(setA, ((g0b.c) ((j2) aVar.f22677a).getValue()).i)) {
            return;
        }
        if (advancedChartExtensionContract$InputData.f82062h) {
            X2(aVar, new m0(22, setA));
        } else {
            r3(setA);
        }
    }

    public final void u3() {
        vki.a aVar = this.f301555s;
        c1b.c identifier = ((g0b.c) ((j2) aVar.f22677a).getValue()).f139401g;
        v0b.d dVar = this.f301551n;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        c1b.h hVar = (c1b.h) dVar.f284777a.v0(c1b.h.ONE_HOUR, v0b.d.b(identifier, "INTERVAL"), z.d(o0.b(c1b.h.class)));
        if (hVar != ((g0b.c) ((j2) aVar.f22677a).getValue()).f139398a) {
            m3(hVar);
        }
    }

    public final void v3() {
        AdvancedChartExtensionContract$InputData advancedChartExtensionContract$InputData = this.o;
        int i = d.f301544b[advancedChartExtensionContract$InputData.d.ordinal()];
        if (i == 1) {
            w3();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            w3();
            u3();
            t3();
            return;
        }
        w3();
        u3();
        if (advancedChartExtensionContract$InputData.f82062h) {
            t3();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void w3() {
        vki.a aVar = this.f301555s;
        c1b.c identifier = ((g0b.c) ((j2) aVar.f22677a).getValue()).f139401g;
        v0b.d dVar = this.f301551n;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        d1b.e eVar = (d1b.e) dVar.f284777a.v0(d1b.e.CANDLES, p.a.p("advanced_charts_", u1.g(identifier, v0b.d.f284776b), "_key"), z.d(o0.b(d1b.e.class)));
        if (eVar != ((g0b.c) ((j2) aVar.f22677a).getValue()).f139400c) {
            c3(eVar);
        }
    }
}
