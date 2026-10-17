package i9g;

import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements p8g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f159842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f159843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eub.a f159844c;

    public v(eub.a revPointsAvailabilityInteractor, gte.a featureToggleInteractor, xoj.a featureInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f159842a = featureToggleInteractor;
        this.f159843b = featureInteractor;
        this.f159844c = revPointsAvailabilityInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f159842a).c(TravelHotelsApi$Toggles.StaysExpediaCheckoutUpdates.f93615c);
    }

    public final boolean b() {
        return ((nyb.b) this.f159844c).f();
    }

    public final boolean c() {
        return ((jte.d) this.f159842a).c(TravelHotelsApi$Toggles.StaysDropOffNavigation.f93614c);
    }

    public final efm.r d() {
        efm.r map = ((cpj.b) this.f159843b).j(yoj.c.STAYS, w4l.h.f294642c).map(new i52.j(26, new i6j.p(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ue0.e.E(map, Boolean.FALSE);
    }
}
