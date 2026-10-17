package h9j;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f150333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he2.b f150334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f150335c;

    public f(gte.a featureToggleInteractor, he2.b assetDetailsPerformanceMapper, ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        Intrinsics.checkNotNullParameter(assetDetailsPerformanceMapper, "assetDetailsPerformanceMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f150333a = stakingInterestRateFormatter;
        this.f150334b = assetDetailsPerformanceMapper;
        this.f150335c = featureToggleInteractor;
    }
}
