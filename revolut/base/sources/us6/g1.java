package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements xki.c, d17.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerWebsiteFlowContract$InputData f282549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f282551c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g1(q qVar, FreelancerWebsiteFlowContract$InputData freelancerWebsiteFlowContract$InputData) {
        this.f282550b = qVar;
        this.f282549a = freelancerWebsiteFlowContract$InputData;
        this.d = e4m.b.b(new q0(qVar, this, 0, 5));
        this.e = e4m.b.b(new q0(qVar, this, 2, 5));
        this.f = e4m.b.b(new q0(qVar, this, 1, 5));
    }

    @Override // d17.a
    public final v1 b() {
        return new v1(this.f282550b, this.f282551c, 0);
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
