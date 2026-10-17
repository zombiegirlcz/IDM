package doc;

import com.revolut.data.model.Data;
import ip0.jm0;
import ip0.yl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f116489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f116490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f116491c;
    public final o7.d d;

    public b0(y headerMapper, w chartMapper, a0 timeSpanTabsMapper, o7.d tagMapper, foc.b chartAdapterFactory) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(timeSpanTabsMapper, "timeSpanTabsMapper");
        Intrinsics.checkNotNullParameter(tagMapper, "tagMapper");
        Intrinsics.checkNotNullParameter(chartAdapterFactory, "chartAdapterFactory");
        this.f116489a = headerMapper;
        this.f116490b = chartMapper;
        this.f116491c = timeSpanTabsMapper;
        this.d = tagMapper;
    }

    public final List a(e config, j jVar) {
        Map map;
        Data data;
        List list;
        Intrinsics.checkNotNullParameter(config, "config");
        return (jVar == null || (map = jVar.f116506b) == null || (data = (Data) map.get(jVar.d)) == null || (list = (List) iii.c.f(data, new dmj.e0(this, 8), new dmb.m(16), new a0i.a(this, 11, jVar, config))) == null) ? b() : list;
    }

    public final List b() {
        qv0.i[] elements = {new yl("CHART_WIDGET_HEADER", 0, 30), new jm0("PERFORMANCE_CHART_WIDGET_CHART", null, null, false, null, null, 0, true, 0, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -198)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
