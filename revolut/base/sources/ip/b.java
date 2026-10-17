package ip;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f163349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f163350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f163351c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f163352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f163353h;

    public b(Lazy featureToggleInteractorProvider, Lazy sessionControllerProvider, Lazy backgroundsInteractorProvider, Lazy pricingPlanInteractor, Lazy themeCompatibilityProvider, Lazy startupPreferencesInteractorProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractorProvider, "featureToggleInteractorProvider");
        Intrinsics.checkNotNullParameter(sessionControllerProvider, "sessionControllerProvider");
        Intrinsics.checkNotNullParameter(backgroundsInteractorProvider, "backgroundsInteractorProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(themeCompatibilityProvider, "themeCompatibilityProvider");
        Intrinsics.checkNotNullParameter(startupPreferencesInteractorProvider, "startupPreferencesInteractorProvider");
        this.f163349a = featureToggleInteractorProvider;
        this.f163350b = sessionControllerProvider;
        this.f163351c = backgroundsInteractorProvider;
        this.d = pricingPlanInteractor;
        this.e = themeCompatibilityProvider;
        this.f = startupPreferencesInteractorProvider;
        this.f163352g = j.b(new ie7.a(this, 4));
        this.f163353h = new AtomicReference();
    }
}
