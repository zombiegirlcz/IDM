package nh2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements xki.c, kx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeroHomeFlowContract$InputData f215345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f215346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f215347c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f215348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f215349h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f215350j;

    public s(o oVar, WeroHomeFlowContract$InputData weroHomeFlowContract$InputData) {
        this.f215346b = oVar;
        this.f215345a = weroHomeFlowContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new ms1.s(oVar, this, 1, i));
        this.e = e4m.b.b(new ms1.s(oVar, this, 0, i));
        this.f = e4m.b.b(new ms1.s(oVar, this, 2, i));
        this.f215348g = e4m.b.b(new ms1.s(oVar, this, 4, i));
        this.f215349h = e4m.b.b(new ms1.s(oVar, this, 3, i));
        this.i = e4m.b.b(new ms1.s(oVar, this, 5, i));
        this.f215350j = e4m.b.b(new ms1.s(oVar, this, 6, i));
    }

    @Override // kx1.a
    public final hc2.j c() {
        return new hc2.j(this.f215346b, this.f215347c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f.get(), (yji.n) this.f215349h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
