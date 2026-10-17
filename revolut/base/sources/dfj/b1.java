package dfj;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class b1 implements a39.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113912a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f113913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f113914c;

    public b1(cej.a esimFeatureAvailabilityInteractor, oej.a esimCoreInteractor) {
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        this.f113914c = esimFeatureAvailabilityInteractor;
        this.f113913b = esimCoreInteractor;
    }

    @Override // a39.a
    public final Flow a() {
        switch (this.f113912a) {
            case 0:
                return nim.a.v(zh9.u0.m(((efj.c) ((cej.a) this.f113914c)).b(), ((oej.b) ((oej.a) this.f113913b)).d()), new dee.x(12));
            case 1:
                return nim.a.v(zh9.u0.m(((efj.d) ((cej.b) this.f113914c)).b(), ((oej.b) ((oej.a) this.f113913b)).d()), new dee.x(17));
            case 2:
                return nim.a.v(zh9.u0.m(new go.g(zi0.c.P(Boolean.valueOf(((jte.d) ((efj.e) ((cej.c) this.f113914c)).f125337a).c(EsimApi$Toggles.EsimRevPoint.f100183c)), false, null, 3), 2), ((oej.b) ((oej.a) this.f113913b)).d()), new dee.x(22));
            case 3:
                return nim.a.v(zh9.u0.m(((a31.a) this.f113914c).j(), new sa6.o(bla.b.b((jla.h) this.f113913b, "REVOLUT_PAY.payment_processing"), 1)), new s8h.h(28));
            default:
                return new t38.e(((u29.g) this.f113914c).b(), 24, ((nyb.b) ((eub.a) this.f113913b)).b(), new et6.j(3, 2, null));
        }
    }

    public b1(u29.g lifestyleTabAvailabilityInteractor, eub.a revPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(lifestyleTabAvailabilityInteractor, "lifestyleTabAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f113914c = lifestyleTabAvailabilityInteractor;
        this.f113913b = revPointsAvailabilityInteractor;
    }

    public b1(cej.b esimMobilePlansFeatureAvailabilityInteractor, oej.a esimCoreInteractor) {
        Intrinsics.checkNotNullParameter(esimMobilePlansFeatureAvailabilityInteractor, "esimMobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        this.f113914c = esimMobilePlansFeatureAvailabilityInteractor;
        this.f113913b = esimCoreInteractor;
    }

    public b1(cej.c eSimRevPointsFeatureAvailabilityInteractor, oej.a eSimCoreInteractor) {
        Intrinsics.checkNotNullParameter(eSimRevPointsFeatureAvailabilityInteractor, "eSimRevPointsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(eSimCoreInteractor, "eSimCoreInteractor");
        this.f113914c = eSimRevPointsFeatureAvailabilityInteractor;
        this.f113913b = eSimCoreInteractor;
    }

    public b1(a31.a donationsAvailabilityInteractor, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f113914c = donationsAvailabilityInteractor;
        this.f113913b = productCatalogueInteractor;
    }
}
