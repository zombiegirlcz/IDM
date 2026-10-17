package hma;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements toa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y21.c f153619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final am2.a f153620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final toa.a f153621c;
    public final xh5.a d;
    public final jla.h e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f153622g;

    public s(ioa.b filter, y21.c optOutRepository, am2.a profileTypeInteractor, toa.a originalInteractor, xh5.a cryptoFeatureEnabledInteractor, jla.h productCatalogueInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(originalInteractor, "originalInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f153619a = optOutRepository;
        this.f153620b = profileTypeInteractor;
        this.f153621c = originalInteractor;
        this.d = cryptoFeatureEnabledInteractor;
        this.e = productCatalogueInteractor;
        this.f = featureToggleInteractor;
        this.f153622g = yhm.j.b(new h1g.a(this, 22));
    }

    @Override // toa.a
    public final efm.b a(soa.b setting) {
        efm.f hVar;
        Intrinsics.checkNotNullParameter(setting, "setting");
        efm.b bVarA = this.f153621c.a(setting);
        int i = 2;
        if (q.f153616a[setting.f264801a.ordinal()] != 2) {
            return bVarA;
        }
        p pVar = new p(this, 1);
        Boolean bool = setting.e;
        if (bool != null) {
            hVar = new pfm.h(new c86.d(pVar, bool.booleanValue(), i), 1);
        } else {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            hVar = mVar;
        }
        efm.b bVarP = efm.b.p(hVar, bVarA);
        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
        return bVarP;
    }

    @Override // toa.a
    public final efm.r b() {
        return rd0.e.c(boh.f.e(rd0.e.b(this.f153620b.a()), new p(this, 0)), kotlin.coroutines.g.f186406a);
    }
}
