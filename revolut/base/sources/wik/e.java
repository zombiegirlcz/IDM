package wik;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements egk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cha.b f297911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffk.t f297912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f297913c;

    public e(cha.b familyPlansInteractor, ffk.t pricingPlanInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f297911a = familyPlansInteractor;
        this.f297912b = pricingPlanInteractor;
        this.f297913c = featureToggleInteractor;
    }
}
