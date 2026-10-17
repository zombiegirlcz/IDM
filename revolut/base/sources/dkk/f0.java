package dkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f115597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f115598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffk.j f115599c;

    public f0(ang.f userInteractor, fk3.a configurationInteractor, ffk.j pricingPlanLimitsInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanLimitsInteractor, "pricingPlanLimitsInteractor");
        this.f115597a = userInteractor;
        this.f115598b = configurationInteractor;
        this.f115599c = pricingPlanLimitsInteractor;
    }
}
