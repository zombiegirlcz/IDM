package fuk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f138264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f138265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f138266c;

    public p(m chartHeaderMapper, p0 commonChartMapper, a defaultBarSelector) {
        Intrinsics.checkNotNullParameter(chartHeaderMapper, "chartHeaderMapper");
        Intrinsics.checkNotNullParameter(commonChartMapper, "commonChartMapper");
        Intrinsics.checkNotNullParameter(defaultBarSelector, "defaultBarSelector");
        this.f138264a = chartHeaderMapper;
        this.f138265b = commonChartMapper;
        this.f138266c = defaultBarSelector;
    }

    public final List a(h state, b chart, n chartRenderInfo, int i, kotlin.jvm.internal.h0 valueAccessor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartRenderInfo, "chartRenderInfo");
        Intrinsics.checkNotNullParameter(valueAccessor, "valueAccessor");
        Data data = (Data) state.f138239a.get(chart);
        List list = data != null ? (List) iii.c.f(data, new ft4.w(16), new fq7.j(21), new clh.d(state, chart, this, i, valueAccessor, chartRenderInfo)) : null;
        return list == null ? zhm.f0.f322471a : list;
    }
}
