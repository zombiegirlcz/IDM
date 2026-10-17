package nyb;

import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServe;
import com.revolut.feature_rev_points_pocket_api.RevPointsPocketApi$Toggles;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements eub.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f220771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f220772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jla.h f220773c;
    public final vgc.a d;

    public b(gte.a featureToggleInteractor, xoj.a featuresInteractor, jla.h productCatalogueInteractor, vgc.a rentAndBillsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(rentAndBillsAvailabilityInteractor, "rentAndBillsAvailabilityInteractor");
        this.f220771a = featureToggleInteractor;
        this.f220772b = featuresInteractor;
        this.f220773c = productCatalogueInteractor;
        this.d = rentAndBillsAvailabilityInteractor;
    }

    public final boolean a(String str) {
        return this.f220773c.d(str, null) == bla.c.ENABLED;
    }

    public final n1g.p b() {
        return new n1g.p(new go.g(Boolean.valueOf(a("REVPOINTS")), 2), this, 23);
    }

    public final vkm.d c() {
        return rd0.e.b(nim.a.w(kli.a.h(zi0.c.j(Boolean.valueOf(((jte.d) this.f220771a).c(RevPointsApi$Toggles.RevPoints.f83461c))), zi0.c.j(Boolean.valueOf(a("REVPOINTS")))), new nxa.v(22)));
    }

    public final vkm.d d() {
        return rd0.e.b(nim.a.w(kli.a.i(rd0.e.c(c(), kotlin.coroutines.g.f186406a), zi0.c.j(Boolean.valueOf(a("REVPOINTS.points_pocket"))), zi0.c.j(Boolean.valueOf(((jte.d) this.f220771a).c(RevPointsPocketApi$Toggles.RevPointsPocketHome.f97777c)))), new nxa.v(21)));
    }

    public final vkm.d e() {
        return rd0.e.b(nim.a.w(kli.a.h(rd0.e.c(c(), kotlin.coroutines.g.f186406a), zi0.c.j(Boolean.valueOf(a("REVPOINTS.spare_change_to_revpoints")))), new nxa.v(23)));
    }

    public final boolean f() {
        return ((jte.d) this.f220771a).c(RevPointsApi$Toggles.RevPoints.f83461c) && a("REVPOINTS");
    }

    public final boolean g() {
        if (f()) {
            return ((jte.d) this.f220771a).c(RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServe.f84114c);
        }
        return false;
    }
}
