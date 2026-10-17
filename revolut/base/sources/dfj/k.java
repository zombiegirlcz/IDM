package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements bej.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7c.m f114010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nfj.d f114011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f114012c;

    public k(q7c.m quoteInteractor, nfj.d checkoutRepository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(checkoutRepository, "checkoutRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f114010a = quoteInteractor;
        this.f114011b = checkoutRepository;
        this.f114012c = featureToggleInteractor;
    }
}
