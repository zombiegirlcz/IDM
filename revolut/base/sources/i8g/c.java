package i8g;

import jla.h;
import kotlin.jvm.internal.Intrinsics;
import r10.r;
import vc.s;
import zxb.j0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f159531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f159532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ila.b f159533c;

    public c(ila.b bVar, ite.a aVar, j0 j0Var) {
        this.f159531a = aVar;
        this.f159532b = j0Var;
        this.f159533c = bVar;
    }

    public final r a() {
        gte.a featureToggleInteractor = this.f159531a.b();
        s.j(featureToggleInteractor);
        eub.a revPointsAvailabilityInteractor = this.f159532b.a();
        s.j(revPointsAvailabilityInteractor);
        h productCatalogueInteractor = this.f159533c.a();
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        r rVar = new r();
        rVar.f250851a = featureToggleInteractor;
        rVar.f250852b = revPointsAvailabilityInteractor;
        rVar.f250853c = productCatalogueInteractor;
        return rVar;
    }
}
