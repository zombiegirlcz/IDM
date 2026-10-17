package xab;

import kotlin.jvm.internal.Intrinsics;
import no.j2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class w0 extends pri.b implements q0 {

    @NotNull
    public static final t0 Companion = new t0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wl0.c f303856h;
    public final j2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cn0.e f303857j;
    public final sri.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tpi.j f303858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final opi.d f303859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mli.e f303860n;
    public final com.revolut.retail.feature.api.userauth.navigation.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f303861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public wl0.n f303862q;

    public w0(wl0.c biometricHelper, j2 settingsEventsTracker, cn0.e primaryAuthCredentialsTypeProvider, sri.m navigator, tpi.j progressView, opi.b expandableDialogView, mli.e userLogoutInteractor, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, a currentActivityInfoProvider) {
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(settingsEventsTracker, "settingsEventsTracker");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsTypeProvider, "primaryAuthCredentialsTypeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(currentActivityInfoProvider, "currentActivityInfoProvider");
        this.f303856h = biometricHelper;
        this.i = settingsEventsTracker;
        this.f303857j = primaryAuthCredentialsTypeProvider;
        this.k = navigator;
        this.f303858l = progressView;
        this.f303859m = expandableDialogView;
        this.f303860n = userLogoutInteractor;
        this.o = userOnboardingNavigationProvider;
        this.f303861p = currentActivityInfoProvider;
    }
}
