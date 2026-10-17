package wub;

import com.revolut.feature.rev_points.buying.api.RevPointsBuyingApi$Toggles$OneOffPointsBuying;
import com.revolut.feature.rev_points.buying.api.RevPointsBuyingApi$Toggles$RecurringPointsBuying;
import jla.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f300094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f300095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f300096c;

    public a(eub.a revPointsAvailabilityInteractor, gte.a featureToggleInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f300094a = featureToggleInteractor;
        this.f300095b = revPointsAvailabilityInteractor;
        this.f300096c = productCatalogueInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f300094a).c(RevPointsBuyingApi$Toggles$OneOffPointsBuying.f83551c) && ((nyb.b) this.f300095b).f() && this.f300096c.d("REVPOINTS.points_buying", null) == bla.c.ENABLED;
    }

    public final boolean b() {
        return ((jte.d) this.f300094a).c(RevPointsBuyingApi$Toggles$RecurringPointsBuying.f83552c) && ((nyb.b) this.f300095b).f() && this.f300096c.d("REVPOINTS.recurring_points_buying", null) == bla.c.ENABLED;
    }
}
