package h9j;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f150331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ttd.a f150332b;

    public c(gte.a featureToggleInteractor, ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        this.f150331a = featureToggleInteractor;
        this.f150332b = stakingInterestRateFormatter;
    }
}
