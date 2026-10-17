package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements xki.c, z07.a, p07.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerProfileFlowContract$InputData f282657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f282659c = this;
    public final e4m.e d;

    public p0(q qVar, FreelancerProfileFlowContract$InputData freelancerProfileFlowContract$InputData) {
        this.f282658b = qVar;
        this.f282657a = freelancerProfileFlowContract$InputData;
        this.d = e4m.b.b(new o0(qVar, this, 0));
    }

    @Override // z07.a
    public final t1 b() {
        return new t1(this.f282658b, this.f282659c, 1);
    }

    @Override // p07.a
    public final r1 c() {
        return new r1(this.f282658b, this.f282659c, 1);
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
