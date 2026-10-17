package c1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements hyf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f20497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f20498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f20499c;

    public m(eub.a revPointsAvailabilityInteractor, gte.a featureToggleInteractor, xoj.a featureInteractor) {
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f20497a = featureInteractor;
        this.f20498b = revPointsAvailabilityInteractor;
        this.f20499c = featureToggleInteractor;
    }

    public final boolean a() {
        return ((nyb.b) this.f20498b).f();
    }

    public final efm.r b() {
        efm.r rVarX = ((cpj.b) this.f20497a).f(yoj.c.TRAVEL_EXPERIENCES, yoj.d.DISABLED).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }
}
