package vfg;

import kotlin.jvm.internal.Intrinsics;
import lfg.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f288635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f288636b;

    public r(g0 travelMilesSearchRepository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(travelMilesSearchRepository, "travelMilesSearchRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f288635a = travelMilesSearchRepository;
        this.f288636b = featureToggleInteractor;
    }
}
