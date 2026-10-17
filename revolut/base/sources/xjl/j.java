package xjl;

import akl.w1;
import akl.z;
import bjl.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jol.b f306562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mp.p f306563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final akl.k f306564c;
    public final akl.l d;
    public final fkg.a e;
    public final ph0.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gql.a f306565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p0 f306566h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f306567j;
    public final z k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iy8.b f306568l;

    public j(akl.k challengesRepository, akl.l claimsRepository, z configurationRepository, w1 socialAccountRepository, p0 revolutSsoDependenciesProvider, fkg.a dapIntentHandler, gql.a googleMobileServicesAvailabilityManager, iy8.b uaePassAppAvailabilityChecker, jol.b authenticationFlowDialogsFactory, mp.p bankIdIntentHandler, ph0.f googleAuthenticationClient, i revolutSsoFlowConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(authenticationFlowDialogsFactory, "authenticationFlowDialogsFactory");
        Intrinsics.checkNotNullParameter(bankIdIntentHandler, "bankIdIntentHandler");
        Intrinsics.checkNotNullParameter(challengesRepository, "challengesRepository");
        Intrinsics.checkNotNullParameter(claimsRepository, "claimsRepository");
        Intrinsics.checkNotNullParameter(dapIntentHandler, "dapIntentHandler");
        Intrinsics.checkNotNullParameter(googleAuthenticationClient, "googleAuthenticationClient");
        Intrinsics.checkNotNullParameter(googleMobileServicesAvailabilityManager, "googleMobileServicesAvailabilityManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(socialAccountRepository, "socialAccountRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(uaePassAppAvailabilityChecker, "uaePassAppAvailabilityChecker");
        this.f306562a = authenticationFlowDialogsFactory;
        this.f306563b = bankIdIntentHandler;
        this.f306564c = challengesRepository;
        this.d = claimsRepository;
        this.e = dapIntentHandler;
        this.f = googleAuthenticationClient;
        this.f306565g = googleMobileServicesAvailabilityManager;
        this.f306566h = revolutSsoDependenciesProvider;
        this.i = revolutSsoFlowConfigurationInteractor;
        this.f306567j = socialAccountRepository;
        this.k = configurationRepository;
        this.f306568l = uaePassAppAvailabilityChecker;
    }

    @Override // od0.e
    public final void clear() {
        if (this.f306565g.a()) {
            this.f.b(new xda.z(28), new xif.c(8));
        }
    }
}
