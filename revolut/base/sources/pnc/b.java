package pnc;

import kotlin.jvm.internal.Intrinsics;
import nnc.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nnc.b f237688a;

    public b(d riskMetricsItemMapper, nnc.b riskMetricsCellMapper) {
        Intrinsics.checkNotNullParameter(riskMetricsItemMapper, "riskMetricsItemMapper");
        Intrinsics.checkNotNullParameter(riskMetricsCellMapper, "riskMetricsCellMapper");
        this.f237688a = riskMetricsCellMapper;
    }
}
