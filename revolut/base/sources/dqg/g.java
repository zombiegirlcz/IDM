package dqg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f116985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f116986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p38.a f116987c;

    public g(gr6.e freelancerAvailabilityInteractor, gte.a featureToggleInteractor, p38.a jointAccountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsProductFeatureChecker, "jointAccountsProductFeatureChecker");
        this.f116985a = freelancerAvailabilityInteractor;
        this.f116986b = featureToggleInteractor;
        this.f116987c = jointAccountsProductFeatureChecker;
    }
}
