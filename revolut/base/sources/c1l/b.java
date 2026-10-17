package c1l;

import g1l.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f20539a;

    public b(c tradingOnboardingFailCommandBuilder, d tradingOnboardingPendingCommandProvider, n onboardingStateChecker) {
        Intrinsics.checkNotNullParameter(tradingOnboardingFailCommandBuilder, "tradingOnboardingFailCommandBuilder");
        Intrinsics.checkNotNullParameter(tradingOnboardingPendingCommandProvider, "tradingOnboardingPendingCommandProvider");
        Intrinsics.checkNotNullParameter(onboardingStateChecker, "onboardingStateChecker");
        this.f20539a = onboardingStateChecker;
    }
}
