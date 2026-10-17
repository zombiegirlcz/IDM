package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements xki.c, ucg.a, ybg.a, fdg.a, acg.a, zcg.a, ddg.a, cdg.a, tbg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCheckoutFlowContract$InputData f141746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f141748c = this;
    public final e4m.e d;
    public final e4m.e e;

    public n(d dVar, TravelHotelsCheckoutFlowContract$InputData travelHotelsCheckoutFlowContract$InputData) {
        this.f141747b = dVar;
        this.f141746a = travelHotelsCheckoutFlowContract$InputData;
        int i = 22;
        this.d = e4m.b.b(new fta.e(dVar, this, 1, i));
        this.e = e4m.b.b(new fta.e(dVar, this, 0, i));
    }

    @Override // cdg.a
    public final e1 A() {
        return new e1(this.f141747b, this.f141748c, 0);
    }

    @Override // acg.a
    public final u0 B() {
        return new u0(this.f141747b, this.f141748c, 1);
    }

    @Override // ucg.a
    public final y0 D() {
        return new y0(this.f141747b, this.f141748c, 1);
    }

    @Override // fdg.a
    public final a1 b() {
        return new a1(this.f141747b, this.f141748c, 1);
    }

    @Override // ybg.a
    public final s0 c() {
        return new s0(this.f141747b, this.f141748c, 1);
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
        return new w0(this.f141747b, this.f141748c, 0);
    }

    @Override // zcg.a
    public final c1 s() {
        return new c1(this.f141747b, this.f141748c, 0);
    }

    @Override // ddg.a
    public final g1 y() {
        return new g1(this.f141747b, this.f141748c, 0);
    }
}
