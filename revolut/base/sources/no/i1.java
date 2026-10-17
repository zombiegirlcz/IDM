package no;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends nri.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jte.c f217790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f217791c;
    public final lte.b d;
    public final j2 e;
    public final gpk.c f;

    public i1(jte.c experimentsInteractor, gte.a featureToggleInteractor, lte.b featureTogglesRegistry, j2 settingsEventsTracker, gpk.c coroutineScopeProvider) {
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(featureTogglesRegistry, "featureTogglesRegistry");
        Intrinsics.checkNotNullParameter(settingsEventsTracker, "settingsEventsTracker");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        this.f217790b = experimentsInteractor;
        this.f217791c = featureToggleInteractor;
        this.d = featureTogglesRegistry;
        this.e = settingsEventsTracker;
        this.f = coroutineScopeProvider;
    }

    @Override // nri.a
    public final void i3() {
        jte.c cVar = this.f217790b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        cVar.d.add(this);
    }
}
