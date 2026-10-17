package fuk;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f138269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qrk.c f138270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f138271n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f138272p;

    public t(y fundamentalsChartsWidgetProvider, qrk.c stocksInsightsInteractor, e input) {
        Intrinsics.checkNotNullParameter(fundamentalsChartsWidgetProvider, "fundamentalsChartsWidgetProvider");
        Intrinsics.checkNotNullParameter(stocksInsightsInteractor, "stocksInsightsInteractor");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f138269l = fundamentalsChartsWidgetProvider;
        this.f138270m = stocksInsightsInteractor;
        this.f138271n = input;
        b[] elements = {b.EPS_GROWTH_CHART, b.PE_CHART, b.DIVIDEND_YIELD_CHART};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        this.o = setY0;
        Map mapG = r0.g();
        Set set = setY0;
        int iB = q0.b(zhm.w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(obj2, Boolean.FALSE);
        }
        this.f138272p = pyd.c.a(this, new h(null, mapG, null, linkedHashMap));
    }

    @Override // yji.n
    public final void H2() {
        cel.a aVar;
        cel.a aVar2;
        e eVar = this.f138271n;
        Continuation continuation = null;
        yji.n.l2(this, nim.a.v(this.f138270m.b(eVar.f138232a, w4l.h.f294642c), new ft4.w(18)), null, new fna.f(this, continuation, 12), 3);
        for (b chart : this.o) {
            String ref2 = eVar.f138232a;
            y yVar = this.f138269l;
            yVar.getClass();
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(chart, "chart");
            int[] iArr = x.f138275a;
            int i = iArr[chart.ordinal()];
            if (i == 1) {
                aVar = cel.a.EPS_ANN_CALENDARISED;
            } else if (i == 2) {
                aVar = cel.a.PE_RATIO_ANN;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = cel.a.DPS_ANN_CALENDARISED;
            }
            int i2 = iArr[chart.ordinal()];
            if (i2 == 1) {
                aVar2 = cel.a.EPS_ANN_GROWTH_CALENDARISED;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = null;
            }
            qrk.a aVar3 = yVar.f138276a;
            cel.a[] elements = {aVar, aVar2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            yji.n.l2(this, rd0.e.n(nim.a.v(qrk.a.a(aVar3, ref2, kotlin.collections.d.L(elements), 3, 3), new eed.i(yVar, 24, aVar, aVar2)), zhm.h0.f322473a), null, new f23.y(this, chart, continuation, 8), 3);
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f138272p;
    }
}
