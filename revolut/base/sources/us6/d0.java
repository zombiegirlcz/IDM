package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements xki.c, d17.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerOnboardingFlowContract$InputData f282485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfe.e f282486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f282487c;
    public final d0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f282489h;
    public final e4m.e i;

    public d0(q qVar, FreelancerOnboardingFlowContract$InputData freelancerOnboardingFlowContract$InputData, zfe.e eVar) {
        this.f282487c = qVar;
        this.f282485a = freelancerOnboardingFlowContract$InputData;
        this.f282486b = eVar;
        int i = 29;
        this.e = e4m.b.b(new ufg.k0(qVar, this, 0, i));
        this.f = e4m.b.b(new ufg.k0(qVar, this, 1, i));
        this.f282488g = e4m.b.b(new ufg.k0(qVar, this, 3, i));
        this.f282489h = e4m.b.b(new ufg.k0(qVar, this, 2, i));
        this.i = e4m.b.b(new ufg.k0(qVar, this, 4, i));
    }

    @Override // d17.a
    public final v1 b() {
        return new v1(this.f282487c, this.d, 1);
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
