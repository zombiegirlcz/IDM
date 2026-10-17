package dkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f115604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su9.c f115605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffk.j f115606c;

    public i(ang.f userInteractor, su9.c cryptoFeesInteractor, ffk.j pricingPlanLimitsInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeesInteractor, "cryptoFeesInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanLimitsInteractor, "pricingPlanLimitsInteractor");
        this.f115604a = userInteractor;
        this.f115605b = cryptoFeesInteractor;
        this.f115606c = pricingPlanLimitsInteractor;
    }
}
