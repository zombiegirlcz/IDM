package joa;

import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileScreen;
import com.revolut.feature.terms.api.model.TermsScope;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import smd.s;
import te0.w;
import til.m;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends jki.g implements d {
    public final gte.a A;
    public final m B;
    public final pa.a C;
    public final s D;
    public final on2.b E;
    public final sf0.h F;
    public final v60.e G;
    public final c H;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f176906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mt8.d f176907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tla.d f176908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jma.f f176909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mre.c f176910t;
    public final sla.h u;
    public final pre.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final am2.a f176911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xoj.a f176912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final lek.a f176913y;
    public final f80.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, ang.f userInteractor, mt8.d kycInteractor, tla.d appNavigationCommandsProvider, jma.f closeAccountNavigationHandler, mre.c termsNavigationFactory, sla.h termsAndConditionsNavigationFactory, pre.c termsInteractor, am2.a profileTypeInteractor, xoj.a featuresInteractor, lek.a podNomineesFeatureChecker, f80.a uriHelper, gte.a featureToggleInteractor, m workflowFlowProvider, pa.a userDetailsInteractor, s permissionsSettingsProvider, on2.b accountSwitchingFeatureChecker, sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(appNavigationCommandsProvider, "appNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(closeAccountNavigationHandler, "closeAccountNavigationHandler");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(termsAndConditionsNavigationFactory, "termsAndConditionsNavigationFactory");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(podNomineesFeatureChecker, "podNomineesFeatureChecker");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(userDetailsInteractor, "userDetailsInteractor");
        Intrinsics.checkNotNullParameter(permissionsSettingsProvider, "permissionsSettingsProvider");
        Intrinsics.checkNotNullParameter(accountSwitchingFeatureChecker, "accountSwitchingFeatureChecker");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f176906p = userInteractor;
        this.f176907q = kycInteractor;
        this.f176908r = appNavigationCommandsProvider;
        this.f176909s = closeAccountNavigationHandler;
        this.f176910t = termsNavigationFactory;
        this.u = termsAndConditionsNavigationFactory;
        this.v = termsInteractor;
        this.f176911w = profileTypeInteractor;
        this.f176912x = featuresInteractor;
        this.f176913y = podNomineesFeatureChecker;
        this.z = uriHelper;
        this.A = featureToggleInteractor;
        this.B = workflowFlowProvider;
        this.C = userDetailsInteractor;
        this.D = permissionsSettingsProvider;
        this.E = accountSwitchingFeatureChecker;
        this.F = serverErrorParser;
        this.G = serverErrorsProvider;
        this.H = new c(0);
    }

    @Override // yji.l
    public final void I1() {
        r rVarX;
        r rVarK = this.f176906p.k(false);
        r rVarA = this.f176907q.a(false);
        r rVarA2 = this.f176911w.a();
        TermsScope.INSTANCE.getClass();
        r rVarX2 = this.v.f(TermsScope.K, null).x();
        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
        r rVarX3 = ((cpj.b) this.f176912x).f(yoj.c.KYC_VERIFICATION, yoj.d.ENABLED).x();
        Intrinsics.checkNotNullExpressionValue(rVarX3, "toObservable(...)");
        r rVarX4 = this.f176913y.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX4, "toObservable(...)");
        r rVarC = rd0.e.c(this.D.E(), kotlin.coroutines.g.f186406a);
        if (((jte.d) this.A).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c)) {
            rVarX = r.just(new kn2.a(0));
            Intrinsics.h(rVarX);
        } else {
            rVarX = this.E.a().x();
        }
        yji.l.a1(this, rd0.e.b(w.r(rVarK, rVarA, rVarA2, rVarX2, rVarX3, rVarX4, rVarC, rVarX)), null, null, new h(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(((wa.a) this.C).a()), null, new h(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.H;
    }
}
