package vnb;

import kotlin.jvm.internal.Intrinsics;
import tnb.g0;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f290788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcd.b f290789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f290790c;

    public i(g0 savingsEntryPointsContentProvider, dcd.b savingsInterestRateFormatter, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(savingsEntryPointsContentProvider, "savingsEntryPointsContentProvider");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f290788a = savingsEntryPointsContentProvider;
        this.f290789b = savingsInterestRateFormatter;
        this.f290790c = featureToggleInteractor;
    }
}
