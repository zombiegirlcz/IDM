package wvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f300324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f300325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f300326c;
    public final a2 d;
    public final a2 e;

    public b(gte.a featureToggleInteractor, e1 legacyPerformanceChartRepository, e1 realtimePerformanceChartRepository, a2 legacyTotalValueChartRepository, a2 realtimeTotalValueChartRepository) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(legacyPerformanceChartRepository, "legacyPerformanceChartRepository");
        Intrinsics.checkNotNullParameter(realtimePerformanceChartRepository, "realtimePerformanceChartRepository");
        Intrinsics.checkNotNullParameter(legacyTotalValueChartRepository, "legacyTotalValueChartRepository");
        Intrinsics.checkNotNullParameter(realtimeTotalValueChartRepository, "realtimeTotalValueChartRepository");
        this.f300324a = featureToggleInteractor;
        this.f300325b = legacyPerformanceChartRepository;
        this.f300326c = realtimePerformanceChartRepository;
        this.d = legacyTotalValueChartRepository;
        this.e = realtimeTotalValueChartRepository;
    }
}
