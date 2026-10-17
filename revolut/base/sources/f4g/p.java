package f4g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.impl.ui.flow.root.TravelFlightsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements xki.c, s4g.b, b7g.b, z6g.b, e7g.b, u5g.a, s6g.b, j7g.b, z4g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsFlowContract$InputData f132167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f132169c = this;
    public final e4m.e d = e4m.b.b(new eyd.v(this, 3));

    public p(b bVar, TravelFlightsFlowContract$InputData travelFlightsFlowContract$InputData) {
        this.f132168b = bVar;
        this.f132167a = travelFlightsFlowContract$InputData;
    }

    @Override // z4g.b
    public final z4g.a B() {
        return new d0(this.f132168b, this.f132169c);
    }

    @Override // s4g.b
    public final s4g.a D() {
        return new a0(this.f132168b, this.f132169c, 1);
    }

    @Override // u5g.a
    public final g0 b() {
        return new g0(this.f132168b, this.f132169c, 0);
    }

    @Override // j7g.b
    public final j7g.a c() {
        return new x0(this.f132168b, this.f132169c);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // b7g.b
    public final b7g.a j() {
        return new q0(this.f132168b, this.f132169c, 1);
    }

    @Override // s6g.b
    public final s6g.a q() {
        return new l0(this.f132168b, this.f132169c, 1);
    }

    @Override // z6g.b
    public final z6g.a s() {
        return new o0(this.f132168b, this.f132169c, 1);
    }

    @Override // e7g.b
    public final e7g.a y() {
        return new u0(this.f132168b, this.f132169c, 1);
    }
}
