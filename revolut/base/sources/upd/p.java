package upd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f281983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f281984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.b f281985c;
    public final l80.e d;
    public final rqd.h e;
    public final gte.a f;

    public p(ang.f userInteractor, g6e.d subAccountInteractor, g6e.b subAccountBackgroundInteractor, l80.e dateProvider, rqd.h ratesProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(subAccountInteractor, "subAccountInteractor");
        Intrinsics.checkNotNullParameter(subAccountBackgroundInteractor, "subAccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(ratesProvider, "ratesProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f281983a = userInteractor;
        this.f281984b = subAccountInteractor;
        this.f281985c = subAccountBackgroundInteractor;
        this.d = dateProvider;
        this.e = ratesProvider;
        this.f = featureToggleInteractor;
    }
}
