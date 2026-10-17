package g0b;

import c1b.f;
import c1b.h;
import c1b.i;
import c1b.k;
import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.ChartTimeFrameDisplayType;
import com.revolut.feature.retail.advanced_charts.models.LockPolicy;
import com.revolut.feature.retail.advanced_charts.models.OverlayPolicy;
import d1b.e;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f139398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f139399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f139400c;
    public final AdvancedChartSymbol d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c1b.c f139401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f139402h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OverlayPolicy f139403j;
    public final LockPolicy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f139404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f139405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f139406n;
    public final HashMap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c1b.e f139407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f139408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AdvancedChartSymbol f139409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ChartTimeFrameDisplayType f139410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f139411t;
    public final i u;

    public c(h chartInterval, k kVar, e chartStyle, AdvancedChartSymbol chartSymbol, Data chartSymbolPrice, Data data, c1b.c advancedChartsProductIdentifier, Set chartSymbolsToCompare, Set selectedIndicators, OverlayPolicy overlayPolicy, LockPolicy lockPolicy, Data chartHistory, Data latestChartHistory, boolean z, HashMap studyEventsMap, c1b.e eVar, boolean z3, AdvancedChartSymbol advancedChartSymbol, ChartTimeFrameDisplayType chartTimeFrameDisplayType, f chartHandlerVersion, i iVar) {
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        Intrinsics.checkNotNullParameter(chartSymbolPrice, "chartSymbolPrice");
        Intrinsics.checkNotNullParameter(advancedChartsProductIdentifier, "advancedChartsProductIdentifier");
        Intrinsics.checkNotNullParameter(chartSymbolsToCompare, "chartSymbolsToCompare");
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        Intrinsics.checkNotNullParameter(overlayPolicy, "overlayPolicy");
        Intrinsics.checkNotNullParameter(lockPolicy, "lockPolicy");
        Intrinsics.checkNotNullParameter(chartHistory, "chartHistory");
        Intrinsics.checkNotNullParameter(latestChartHistory, "latestChartHistory");
        Intrinsics.checkNotNullParameter(studyEventsMap, "studyEventsMap");
        Intrinsics.checkNotNullParameter(chartTimeFrameDisplayType, "chartTimeFrameDisplayType");
        Intrinsics.checkNotNullParameter(chartHandlerVersion, "chartHandlerVersion");
        this.f139398a = chartInterval;
        this.f139399b = kVar;
        this.f139400c = chartStyle;
        this.d = chartSymbol;
        this.e = chartSymbolPrice;
        this.f = data;
        this.f139401g = advancedChartsProductIdentifier;
        this.f139402h = chartSymbolsToCompare;
        this.i = selectedIndicators;
        this.f139403j = overlayPolicy;
        this.k = lockPolicy;
        this.f139404l = chartHistory;
        this.f139405m = latestChartHistory;
        this.f139406n = z;
        this.o = studyEventsMap;
        this.f139407p = eVar;
        this.f139408q = z3;
        this.f139409r = advancedChartSymbol;
        this.f139410s = chartTimeFrameDisplayType;
        this.f139411t = chartHandlerVersion;
        this.u = iVar;
    }

    public static c a(c cVar, h hVar, e eVar, AdvancedChartSymbol advancedChartSymbol, Data data, Data data2, Set set, Set set2, Data data3, Data data4, boolean z, c1b.e eVar2, AdvancedChartSymbol advancedChartSymbol2, i iVar, int i) {
        h chartInterval = (i & 1) != 0 ? cVar.f139398a : hVar;
        k kVar = (i & 2) != 0 ? cVar.f139399b : null;
        e chartStyle = (i & 4) != 0 ? cVar.f139400c : eVar;
        AdvancedChartSymbol chartSymbol = (i & 8) != 0 ? cVar.d : advancedChartSymbol;
        Data chartSymbolPrice = (i & 16) != 0 ? cVar.e : data;
        Data data5 = (i & 32) != 0 ? cVar.f : data2;
        c1b.c advancedChartsProductIdentifier = cVar.f139401g;
        Set chartSymbolsToCompare = (i & 128) != 0 ? cVar.f139402h : set;
        Set selectedIndicators = (i & 256) != 0 ? cVar.i : set2;
        OverlayPolicy overlayPolicy = cVar.f139403j;
        LockPolicy lockPolicy = cVar.k;
        Data chartHistory = (i & 2048) != 0 ? cVar.f139404l : data3;
        Data latestChartHistory = (i & 4096) != 0 ? cVar.f139405m : data4;
        boolean z3 = (i & 8192) != 0 ? cVar.f139406n : z;
        HashMap studyEventsMap = cVar.o;
        c1b.e eVar3 = (i & 32768) != 0 ? cVar.f139407p : eVar2;
        boolean z4 = (i & 65536) != 0 ? cVar.f139408q : true;
        AdvancedChartSymbol advancedChartSymbol3 = (i & 131072) != 0 ? cVar.f139409r : advancedChartSymbol2;
        ChartTimeFrameDisplayType chartTimeFrameDisplayType = cVar.f139410s;
        f chartHandlerVersion = cVar.f139411t;
        Data data6 = data5;
        i iVar2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? cVar.u : iVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        Intrinsics.checkNotNullParameter(chartSymbolPrice, "chartSymbolPrice");
        Intrinsics.checkNotNullParameter(advancedChartsProductIdentifier, "advancedChartsProductIdentifier");
        Intrinsics.checkNotNullParameter(chartSymbolsToCompare, "chartSymbolsToCompare");
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        Intrinsics.checkNotNullParameter(overlayPolicy, "overlayPolicy");
        Intrinsics.checkNotNullParameter(lockPolicy, "lockPolicy");
        Intrinsics.checkNotNullParameter(chartHistory, "chartHistory");
        Intrinsics.checkNotNullParameter(latestChartHistory, "latestChartHistory");
        Intrinsics.checkNotNullParameter(studyEventsMap, "studyEventsMap");
        Intrinsics.checkNotNullParameter(chartTimeFrameDisplayType, "chartTimeFrameDisplayType");
        Intrinsics.checkNotNullParameter(chartHandlerVersion, "chartHandlerVersion");
        return new c(chartInterval, kVar, chartStyle, chartSymbol, chartSymbolPrice, data6, advancedChartsProductIdentifier, chartSymbolsToCompare, selectedIndicators, overlayPolicy, lockPolicy, chartHistory, latestChartHistory, z3, studyEventsMap, eVar3, z4, advancedChartSymbol3, chartTimeFrameDisplayType, chartHandlerVersion, iVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f139398a == cVar.f139398a && this.f139399b == cVar.f139399b && this.f139400c == cVar.f139400c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f139401g == cVar.f139401g && Intrinsics.f(this.f139402h, cVar.f139402h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f139403j, cVar.f139403j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f139404l, cVar.f139404l) && Intrinsics.f(this.f139405m, cVar.f139405m) && this.f139406n == cVar.f139406n && Intrinsics.f(this.o, cVar.o) && this.f139407p == cVar.f139407p && this.f139408q == cVar.f139408q && Intrinsics.f(this.f139409r, cVar.f139409r) && Intrinsics.f(this.f139410s, cVar.f139410s) && this.f139411t == cVar.f139411t && Intrinsics.f(this.u, cVar.u);
    }

    public final int hashCode() {
        int iHashCode = this.f139398a.hashCode() * 31;
        k kVar = this.f139399b;
        int iC = kii.e.c(this.e, (this.d.hashCode() + ((this.f139400c.hashCode() + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31)) * 31, 31);
        Data data = this.f;
        int iHashCode2 = (this.o.hashCode() + j6.a.c(kii.e.c(this.f139405m, kii.e.c(this.f139404l, (this.k.hashCode() + p.a.f(p.a.f(p.a.f((this.f139401g.hashCode() + ((iC + (data == null ? 0 : data.hashCode())) * 31)) * 31, 31, this.f139402h), 31, this.i), 31, this.f139403j.f82091a)) * 31, 31), 31), 31, this.f139406n)) * 31;
        c1b.e eVar = this.f139407p;
        int iC2 = j6.a.c((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f139408q);
        AdvancedChartSymbol advancedChartSymbol = this.f139409r;
        int iHashCode3 = (this.f139411t.hashCode() + ((this.f139410s.hashCode() + ((iC2 + (advancedChartSymbol == null ? 0 : advancedChartSymbol.hashCode())) * 31)) * 31)) * 31;
        i iVar = this.u;
        return iHashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }
}
