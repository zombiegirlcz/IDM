package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData f326249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f326250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326251c;

    public r(e eVar, q qVar, RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData) {
        this.f326250b = qVar;
        this.f326249a = revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData;
        this.f326251c = e4m.b.b(new zu8.r(eVar, this, 15));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f326250b.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
