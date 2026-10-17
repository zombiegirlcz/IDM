package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 implements xki.c, iq3.d, ki4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComboCardOrderingFlowContract$InputData f118998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118999c;
    public final j0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119001h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119002j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119005n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119010t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f119011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f119012x;

    public j0(c1 c1Var, iq3.a aVar, ViewController viewController, ComboCardOrderingFlowContract$InputData comboCardOrderingFlowContract$InputData) {
        this.f118999c = c1Var;
        this.f118997a = aVar;
        this.f118998b = comboCardOrderingFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119000g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119001h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(comboCardOrderingFlowContract$InputData));
        int i2 = 14;
        this.f119002j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119003l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119004m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119005n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119006p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119007q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119008r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119009s = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.f119010t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
        this.f119011w = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f119012x = e4m.b.b(new dmc.b0(c1Var, this, 17, i2));
    }

    @Override // ki4.a
    public final g9 b() {
        return new g9(this.f118999c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.v.get(), (yji.n) this.f119011w.get(), (yji.n) this.f119006p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119001h.get(), (yji.d) this.f119008r.get(), (yji.d) this.u.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118999c, this.d, 21);
    }
}
