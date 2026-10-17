package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.UserSelectionFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b7 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserSelectionFlowContract$InputData f118380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118381c;
    public final b7 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118383h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118384j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118387n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118392t;
    public final e4m.e u;

    public b7(c1 c1Var, iq3.a aVar, ViewController viewController, UserSelectionFlowContract$InputData userSelectionFlowContract$InputData) {
        this.f118381c = c1Var;
        this.f118379a = aVar;
        this.f118380b = userSelectionFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f118382g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f118383h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(userSelectionFlowContract$InputData));
        int i2 = 23;
        this.f118384j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f118385l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f118386m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f118387n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f118388p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f118389q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f118390r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f118391s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f118392t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118391s.get(), (yji.n) this.f118392t.get(), (yji.n) this.f118388p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118383h.get(), (yji.d) this.f118390r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f118381c, this.d, 29);
    }
}
