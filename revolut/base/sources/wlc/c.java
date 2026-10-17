package wlc;

import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private c() {
    }

    public static String a(alc.c performanceChartParams) {
        Intrinsics.checkNotNullParameter(performanceChartParams, "performanceChartParams");
        String[] elements = {"TEMPLATE_PERFORMANCE_CHART", performanceChartParams.f6190a, performanceChartParams.f6191b.toString(), performanceChartParams.f6192c};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }
}
