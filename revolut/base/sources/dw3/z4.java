package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.PersonalDetailsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z4 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PersonalDetailsFlowContract$InputData f120286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120287c;
    public final z4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120289h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120290j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120293n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120298t;
    public final e4m.e u;

    public z4(c1 c1Var, iq3.a aVar, ViewController viewController, PersonalDetailsFlowContract$InputData personalDetailsFlowContract$InputData) {
        this.f120287c = c1Var;
        this.f120285a = aVar;
        this.f120286b = personalDetailsFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f120288g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f120289h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(personalDetailsFlowContract$InputData));
        int i2 = 26;
        this.f120290j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f120291l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f120292m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f120293n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f120294p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f120295q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f120296r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f120297s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f120298t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120297s.get(), (yji.n) this.f120298t.get(), (yji.n) this.f120294p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120289h.get(), (yji.d) this.f120296r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f120287c, this.d, 10);
    }
}
