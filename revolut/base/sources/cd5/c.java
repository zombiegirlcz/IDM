package cd5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f23190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f23191b;

    public c(gte.a featureToggleInteractor, ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f23190a = stakingInterestRateFormatter;
        this.f23191b = featureToggleInteractor;
    }
}
