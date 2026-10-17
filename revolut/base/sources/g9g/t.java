package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements xki.c, ucg.a, fdg.a, acg.a, ybg.a, zcg.a, cdg.a, ddg.a, lbg.a, tbg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsFlowContract$InputData f141812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f141814c = this;
    public final e4m.e d;

    public t(d dVar, TravelHotelsFlowContract$InputData travelHotelsFlowContract$InputData) {
        this.f141813b = dVar;
        this.f141812a = travelHotelsFlowContract$InputData;
        this.d = e4m.b.b(new g2j.k(dVar, this, 7));
    }

    @Override // cdg.a
    public final e1 A() {
        return new e1(this.f141813b, this.f141814c, 1);
    }

    @Override // acg.a
    public final u0 B() {
        return new u0(this.f141813b, this.f141814c, 2);
    }

    @Override // ucg.a
    public final y0 D() {
        return new y0(this.f141813b, this.f141814c, 2);
    }

    @Override // fdg.a
    public final a1 b() {
        return new a1(this.f141813b, this.f141814c, 2);
    }

    @Override // ybg.a
    public final s0 c() {
        return new s0(this.f141813b, this.f141814c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // tbg.a
    public final w0 j() {
        return new w0(this.f141813b, this.f141814c, 1);
    }

    @Override // lbg.a
    public final q0 q() {
        return new q0(this.f141813b, this.f141814c, 1);
    }

    @Override // zcg.a
    public final c1 s() {
        return new c1(this.f141813b, this.f141814c, 1);
    }

    @Override // ddg.a
    public final g1 y() {
        return new g1(this.f141813b, this.f141814c, 1);
    }
}
