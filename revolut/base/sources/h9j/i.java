package h9j;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements g {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he2.b f150336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ttd.a f150337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f150338c;

    public i(gte.a featureToggleInteractor, he2.b assetDetailsPerformanceMapper, ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(assetDetailsPerformanceMapper, "assetDetailsPerformanceMapper");
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f150336a = assetDetailsPerformanceMapper;
        this.f150337b = stakingInterestRateFormatter;
        this.f150338c = featureToggleInteractor;
    }
}
