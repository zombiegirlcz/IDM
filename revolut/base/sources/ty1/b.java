package ty1;

import com.revolut.feature.apm.core.api.ApmToggles$Iris;
import com.revolut.feature.apm.core.api.ApmToggles$Qvik;
import com.revolut.feature.toggles.models.FeatureDefinition;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import tx0.o1;
import ufm.i;
import uw1.f;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements uw1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f275453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f275454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f275455c;

    public b(xoj.a featuresInteractor, gte.a featureToggleInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f275453a = featuresInteractor;
        this.f275454b = featureToggleInteractor;
        this.f275455c = productCatalogueInteractor;
    }

    public final i a() {
        i iVar = new i(c(yoj.c.BLIK_PLN), new o1(new a(this, 0), 27), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final boolean b(f fVar) {
        return ((h) this.f275455c).d(fVar.getCode(), null) == bla.c.ENABLED;
    }

    public final z c(yoj.c cVar) {
        return ue0.e.F(((cpj.b) this.f275453a).f(cVar, yoj.d.DISABLED), Boolean.FALSE);
    }

    public final ufm.c d(f fVar, FeatureDefinition featureDefinition) {
        ufm.c cVar = new ufm.c(new tif.e(this, 5, fVar, featureDefinition), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final ufm.c e() {
        return d(f.IRIS, ApmToggles$Iris.f61796c);
    }

    public final ufm.c f(f fVar) {
        ufm.c cVar = new ufm.c(new to7.f(this, fVar, 3), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final ufm.c g() {
        return d(f.QVIK, ApmToggles$Qvik.f61802c);
    }
}
