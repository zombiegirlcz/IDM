package uqh;

import kotlin.jvm.internal.Intrinsics;
import z0h.q1;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f282135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iph.a f282136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final toh.g f282137c;
    public final q1 d;

    public c0(f contentMapper, q loadingMapper, p emptyStateMapper, vph.g filtersButtonsMapper, iph.a metricPriorityProvider, toh.g editableMetricsProvider, q1 wealthDisclaimersMapper, a0 footerMapper) {
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(loadingMapper, "loadingMapper");
        Intrinsics.checkNotNullParameter(emptyStateMapper, "emptyStateMapper");
        Intrinsics.checkNotNullParameter(filtersButtonsMapper, "filtersButtonsMapper");
        Intrinsics.checkNotNullParameter(metricPriorityProvider, "metricPriorityProvider");
        Intrinsics.checkNotNullParameter(editableMetricsProvider, "editableMetricsProvider");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f282135a = contentMapper;
        this.f282136b = metricPriorityProvider;
        this.f282137c = editableMetricsProvider;
        this.d = wealthDisclaimersMapper;
    }
}
