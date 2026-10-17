package nyb;

import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import kotlin.jvm.internal.Intrinsics;
import no.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements eub.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jxb.f f220820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pre.c f220821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffk.t f220822c;
    public final gte.a d;
    public final oyb.e e;
    public final eub.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f220823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f220824h;
    public final fk3.a i;

    public o(jxb.f revPointsRepository, pre.c termsInteractor, ffk.t pricingPlanInteractor, gte.a featureToggleInteractor, oyb.e termsProvider, oyb.f revPointsTermsToArgMapper, eub.a revPointsAvailabilityInteractor, j2 settingsEventsTracker, pyb.i optInSourceToV3Mapper, e0 personalisationTargetingSettingsInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(revPointsRepository, "revPointsRepository");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(termsProvider, "termsProvider");
        Intrinsics.checkNotNullParameter(revPointsTermsToArgMapper, "revPointsTermsToArgMapper");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(settingsEventsTracker, "settingsEventsTracker");
        Intrinsics.checkNotNullParameter(optInSourceToV3Mapper, "optInSourceToV3Mapper");
        Intrinsics.checkNotNullParameter(personalisationTargetingSettingsInteractor, "personalisationTargetingSettingsInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f220820a = revPointsRepository;
        this.f220821b = termsInteractor;
        this.f220822c = pricingPlanInteractor;
        this.d = featureToggleInteractor;
        this.e = termsProvider;
        this.f = revPointsAvailabilityInteractor;
        this.f220823g = settingsEventsTracker;
        this.f220824h = personalisationTargetingSettingsInteractor;
        this.i = configurationInteractor;
    }

    public final efm.b c(RevPointsOptInSource source, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!((b) this.f).f()) {
            pfm.n nVarN = efm.b.n(new IllegalAccessException("Can't create profile when RevPoints are not enabled"));
            Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
            return nVarN;
        }
        efm.d0 d0VarFirstOrError = m70.a.h(nim.a.w(((jxb.l) this.f220820a).a(false), new m(3)), new ngh.i(12), null, null, 6).firstOrError();
        ny7.j jVar = new ny7.j(new n(this, z, source, 0), 27);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, jVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.d0 d() {
        if (!((jte.d) this.d).c(RevPointsApi$Toggles.RevPointsCashbackRemovalTerms.f83463c)) {
            return efm.d0.m(Boolean.FALSE);
        }
        hha.u.Companion.getClass();
        hha.u feature = hha.u.v;
        Intrinsics.checkNotNullParameter(feature, "feature");
        efm.d0 d0VarE = this.f220822c.e();
        ffk.l lVar = new ffk.l(1, new ffk.m(feature, 0));
        d0VarE.getClass();
        ufm.i iVar = new ufm.i(d0VarE, lVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }

    public final efm.d0 e(boolean z) {
        efm.d0 d0VarFirstOrError = m70.a.g(f(z), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final efm.r f(boolean z) {
        return yoj.b.p(pd.b.t(nim.a.w(((jxb.l) this.f220820a).a(z), new m(3)), new l(this, 0)));
    }
}
