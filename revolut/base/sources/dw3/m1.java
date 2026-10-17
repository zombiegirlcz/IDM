package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m1 implements xki.c, iq3.d, dd4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditLinkedAccountsV3FlowContract$InputData f119234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119235c;
    public final m1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119237h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119238j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119241n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119246t;
    public final e4m.e u;
    public final e4m.e v;

    public m1(c1 c1Var, iq3.a aVar, ViewController viewController, CreditLinkedAccountsV3FlowContract$InputData creditLinkedAccountsV3FlowContract$InputData) {
        this.f119235c = c1Var;
        this.f119233a = aVar;
        this.f119234b = creditLinkedAccountsV3FlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119236g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119237h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditLinkedAccountsV3FlowContract$InputData));
        int i2 = 3;
        this.f119238j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119239l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119240m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119241n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119242p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119243q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119244r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119245s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119246t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 15, i2));
        this.v = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // dd4.a
    public final p8 b() {
        return new p8(this.f119235c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119245s.get(), (yji.n) this.f119246t.get(), (yji.n) this.f119242p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119237h.get(), (yji.d) this.f119244r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119235c, this.d, 26);
    }
}
