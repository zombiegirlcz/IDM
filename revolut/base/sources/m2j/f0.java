package m2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.n f202030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final toh.d f202031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rnb.p f202032c;
    public final djb.u d;

    public f0(djb.n savingAccountsInteractor, toh.d savingsAvailabilityInteractor, rnb.p savingsDisclaimersDelegate, djb.u tradingOnboardingStatusProvider) {
        Intrinsics.checkNotNullParameter(savingAccountsInteractor, "savingAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsAvailabilityInteractor, "savingsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsDisclaimersDelegate, "savingsDisclaimersDelegate");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        this.f202030a = savingAccountsInteractor;
        this.f202031b = savingsAvailabilityInteractor;
        this.f202032c = savingsDisclaimersDelegate;
        this.d = tradingOnboardingStatusProvider;
    }
}
