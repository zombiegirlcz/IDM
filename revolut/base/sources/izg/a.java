package izg;

import gzg.c;
import kotlin.jvm.internal.Intrinsics;
import uyg.e;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f169887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f169888b;

    public a(e timeframeMapper, uyg.c headerTimeframeMapper, gte.a featureToggleInteractor, c contributionsMapper) {
        Intrinsics.checkNotNullParameter(timeframeMapper, "timeframeMapper");
        Intrinsics.checkNotNullParameter(headerTimeframeMapper, "headerTimeframeMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(contributionsMapper, "contributionsMapper");
        this.f169887a = featureToggleInteractor;
        this.f169888b = contributionsMapper;
    }
}
