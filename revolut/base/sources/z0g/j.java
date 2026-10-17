package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements xki.c, k2g.a, b2g.b, p3g.a, t1g.a, q1g.a, l3g.a, m1g.a, p2g.a, j3g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesHomeFlowContract$InputData f318385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f318387c = this;
    public final e4m.e d;

    public j(b bVar, TravelExperiencesHomeFlowContract$InputData travelExperiencesHomeFlowContract$InputData) {
        this.f318386b = bVar;
        this.f318385a = travelExperiencesHomeFlowContract$InputData;
        this.d = e4m.b.b(new yf3.d(bVar, this, 3));
    }

    @Override // k2g.a
    public final d0 A() {
        return new d0(this.f318386b, this.f318387c, 1);
    }

    @Override // j3g.a
    public final h0 B() {
        return new h0(this.f318386b, this.f318387c, 1);
    }

    @Override // l3g.a
    public final j0 D() {
        return new j0(this.f318386b, this.f318387c, 1);
    }

    @Override // m1g.a
    public final u b() {
        return new u(this.f318386b, this.f318387c, 1);
    }

    @Override // q1g.a
    public final w c() {
        return new w(this.f318386b, this.f318387c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // p2g.a
    public final f0 j() {
        return new f0(this.f318386b, this.f318387c, 1);
    }

    @Override // t1g.a
    public final y q() {
        return new y(this.f318386b, this.f318387c, 1);
    }

    @Override // p3g.a
    public final m0 s() {
        return new m0(this.f318386b, this.f318387c, 2);
    }

    @Override // b2g.b
    public final a0 y() {
        return new a0(this.f318386b, this.f318387c, 1);
    }
}
