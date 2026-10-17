package h4g;

import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsInStore;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsLite;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsLoyalty;
import com.revolut.feature.travel.flights.api.TravelFlightsApi$Toggles$Flights;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f149364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f149365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jla.h f149366c;

    public g(gte.a featureToggleInteractor, eub.a revPointsAvailabilityInteractor, jla.h productCatalogueInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
                this.f149364a = featureToggleInteractor;
                this.f149365b = revPointsAvailabilityInteractor;
                this.f149366c = productCatalogueInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
                this.f149364a = featureToggleInteractor;
                this.f149365b = revPointsAvailabilityInteractor;
                this.f149366c = productCatalogueInteractor;
                break;
        }
    }

    public boolean a() {
        return ((jte.d) this.f149364a).c(TravelFlightsApi$Toggles$Flights.f93205c) && (this.f149366c.d("FLIGHTS", null) == bla.c.ENABLED) && ((nyb.b) this.f149365b).f();
    }

    public boolean b() {
        return ((jte.d) this.f149364a).c(ShopsApi$Toggles$ShopsLite.f87000c) && (this.f149366c.d("SHOPS", null) == bla.c.ENABLED);
    }

    public r c() {
        return w.h(Boolean.valueOf(b()));
    }

    public r d() {
        return w.h(Boolean.valueOf(b() && ((jte.d) this.f149364a).c(ShopsApi$Toggles$ShopsInStore.f86999c)));
    }

    public boolean e() {
        return b() && (this.f149366c.d("SHOPS.earn_revpoints", null) == bla.c.ENABLED) && ((nyb.b) this.f149365b).f() && ((jte.d) this.f149364a).c(ShopsApi$Toggles$ShopsLoyalty.f87001c);
    }
}
