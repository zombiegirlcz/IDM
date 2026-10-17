package zy5;

import ffk.t;
import hha.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wik.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f326377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f326378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f326379c;
    public final rul.e d;
    public final u e;

    public f(t pricingPlanInteractor, l80.e dateProvider, i resolveStoryHelper, gte.a featureToggleInteractor, rul.e planOnboardInteractor, u planWaveAnimationInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(resolveStoryHelper, "resolveStoryHelper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(planOnboardInteractor, "planOnboardInteractor");
        Intrinsics.checkNotNullParameter(planWaveAnimationInteractor, "planWaveAnimationInteractor");
        this.f326377a = pricingPlanInteractor;
        this.f326378b = dateProvider;
        this.f326379c = featureToggleInteractor;
        this.d = planOnboardInteractor;
        this.e = planWaveAnimationInteractor;
    }

    public static ola.c a(w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        switch (d.f326375a[w0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return null;
            case 5:
                return ola.c.PLAN_BENEFITS_PLUS;
            case 6:
                return ola.c.PLAN_BENEFITS_PREMIUM;
            case 7:
                return ola.c.PLAN_BENEFITS_METAL;
            case 8:
                return ola.c.PLAN_BENEFITS_ULTRA;
            case 9:
                return ola.c.PLAN_BENEFITS_PRIVATE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
