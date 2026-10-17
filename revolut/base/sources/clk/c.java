package clk;

import a5h.g;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import pfk.x;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f25045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f25046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fn2.c f25047c;
    public final fk3.a d;
    public final bd3.a e;
    public final dha.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f25048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f25049h;

    public c(gte.a featureToggleInteractor, t pricingPlanInteractor, xoj.a featuresInteractor, fn2.c productCatalogueLoader, fk3.a configurationInteractor, bd3.a cashbackInteractor, dha.c pricingPlansRepository, x pricingPlanCancelRepository, g planChangeAppThemeManager) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        Intrinsics.checkNotNullParameter(pricingPlanCancelRepository, "pricingPlanCancelRepository");
        Intrinsics.checkNotNullParameter(planChangeAppThemeManager, "planChangeAppThemeManager");
        this.f25045a = pricingPlanInteractor;
        this.f25046b = featuresInteractor;
        this.f25047c = productCatalogueLoader;
        this.d = configurationInteractor;
        this.e = cashbackInteractor;
        this.f = pricingPlansRepository;
        this.f25048g = pricingPlanCancelRepository;
        this.f25049h = planChangeAppThemeManager;
    }
}
