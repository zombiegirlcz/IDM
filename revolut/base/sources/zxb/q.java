package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.RevPointsPostOnboardingPersonalisationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPostOnboardingPersonalisationFlowContract$InputData f326243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f326244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f326245c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q(e eVar, RevPointsPostOnboardingPersonalisationFlowContract$InputData revPointsPostOnboardingPersonalisationFlowContract$InputData) {
        this.f326244b = eVar;
        this.f326243a = revPointsPostOnboardingPersonalisationFlowContract$InputData;
        int i = 29;
        this.d = e4m.b.b(new zpc.m(eVar, this, 1, i));
        this.e = e4m.b.b(new zpc.m(eVar, this, 0, i));
        this.f = e4m.b.b(new zpc.m(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
