package wna;

import cli.y;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileScreen;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vy5.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends oki.h implements d {
    public final xo.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jma.f f298763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final am2.a f298764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final avd.b f298765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f298766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yok.m f298767t;
    public final y u;

    public t(v stateMapper, xo.h bugReportNavigationProvider, jma.f closeAccountNavigationHandler, am2.a profileTypeInteractor, avd.b flexibleStakingConsentInteractor, gte.a featureToggleInteractor, yok.m tradingModeEntryProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bugReportNavigationProvider, "bugReportNavigationProvider");
        Intrinsics.checkNotNullParameter(closeAccountNavigationHandler, "closeAccountNavigationHandler");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(flexibleStakingConsentInteractor, "flexibleStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingModeEntryProvider, "tradingModeEntryProvider");
        this.o = bugReportNavigationProvider;
        this.f298763p = closeAccountNavigationHandler;
        this.f298764q = profileTypeInteractor;
        this.f298765r = flexibleStakingConsentInteractor;
        this.f298766s = featureToggleInteractor;
        this.f298767t = tradingModeEntryProvider;
        this.u = mra.d.b(this, new c(3), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(this.f298764q.a()), null, null, new s(this, null, 1), 3);
        StakingApi$FeatureToggles.FlexibleStaking flexibleStaking = StakingApi$FeatureToggles.FlexibleStaking.f88055c;
        jte.d dVar = (jte.d) this.f298766s;
        if (dVar.c(flexibleStaking) && dVar.c(ProfileApi$Toggles$RevampedProfileScreen.f81321c)) {
            yji.l.a1(this, vkm.q.Q(new d0(this.u.B(new wl3.d(25)), 7), new w2a.q(continuation, this, 18)), null, null, new s(this, null, 0), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
