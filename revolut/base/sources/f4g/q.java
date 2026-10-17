package f4g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements xki.c, s4g.b, w5g.b, b7g.b, z6g.b, e7g.b, u5g.a, s6g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsHomeFlowContract$InputData f132173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f132175c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q(b bVar, TravelFlightsHomeFlowContract$InputData travelFlightsHomeFlowContract$InputData) {
        this.f132174b = bVar;
        this.f132173a = travelFlightsHomeFlowContract$InputData;
        int i = 15;
        this.d = e4m.b.b(new eyd.j(bVar, this, 1, i));
        this.e = e4m.b.b(new eyd.j(bVar, this, 0, i));
        this.f = e4m.b.b(new eyd.j(bVar, this, 2, i));
    }

    @Override // w5g.b
    public final w5g.a A() {
        return new i0(this.f132174b, this.f132175c);
    }

    @Override // s4g.b
    public final s4g.a D() {
        return new a0(this.f132174b, this.f132175c, 0);
    }

    @Override // u5g.a
    public final g0 b() {
        return new g0(this.f132174b, this.f132175c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // b7g.b
    public final b7g.a j() {
        return new q0(this.f132174b, this.f132175c, 0);
    }

    @Override // s6g.b
    public final s6g.a q() {
        return new l0(this.f132174b, this.f132175c, 0);
    }

    @Override // z6g.b
    public final z6g.a s() {
        return new o0(this.f132174b, this.f132175c, 0);
    }

    @Override // e7g.b
    public final e7g.a y() {
        return new u0(this.f132174b, this.f132175c, 0);
    }
}
