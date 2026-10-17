package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements qji.a, b2g.b, z7a.c, m1g.a, t1g.a, l3g.a, p3g.a, p2g.a, j3g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesCheckoutFlowContract$InputData f318358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f318360c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(b bVar, TravelExperiencesCheckoutFlowContract$InputData travelExperiencesCheckoutFlowContract$InputData) {
        this.f318359b = bVar;
        this.f318358a = travelExperiencesCheckoutFlowContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.e = e4m.b.b(new yre.a(bVar, this, 0, i));
        this.f = e4m.b.b(new yre.a(bVar, this, 2, i));
    }

    @Override // j3g.a
    public final h0 B() {
        return new h0(this.f318359b, this.f318360c, 0);
    }

    @Override // l3g.a
    public final j0 D() {
        return new j0(this.f318359b, this.f318360c, 0);
    }

    @Override // m1g.a
    public final u b() {
        return new u(this.f318359b, this.f318360c, 0);
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f318359b, this.f318360c, 18);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // p2g.a
    public final f0 j() {
        return new f0(this.f318359b, this.f318360c, 0);
    }

    @Override // t1g.a
    public final y q() {
        return new y(this.f318359b, this.f318360c, 0);
    }

    @Override // p3g.a
    public final m0 s() {
        return new m0(this.f318359b, this.f318360c, 1);
    }

    @Override // b2g.b
    public final a0 y() {
        return new a0(this.f318359b, this.f318360c, 0);
    }
}
