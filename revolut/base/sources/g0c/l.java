package g0c;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.h1;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements c0c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cej.a f139433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oej.a f139434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f139435c;
    public final h0c.a d;

    public l(cej.a esimFeatureAvailabilityInteractor, oej.a esimCoreInteractor, gte.a featureToggleInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139433a = esimFeatureAvailabilityInteractor;
        this.f139434b = esimCoreInteractor;
        this.f139435c = featureToggleInteractor;
        this.d = productItemFactory;
    }

    @Override // c0c.b
    public final Flow a(h1 h1Var) {
        return new e(ta6.a.h(mo3.a.g(((efj.c) this.f139433a).b(), null, new fv0.c(29), 1), new a87.b(mo3.a.g(((oej.b) this.f139434b).d(), null, new h(0), 1), 23), new go.g(Boolean.valueOf(((jte.d) this.f139435c).c(EsimApi$Toggles.EsimRevPoint.f100183c)), 2), new k(4, 0, null)), this, h1Var, 2);
    }
}
