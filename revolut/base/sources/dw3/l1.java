package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l1 implements xki.c, iq3.d, dd4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditLinkedAccountsV2FlowContract$InputData f119159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119160c;
    public final l1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119162h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119163j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119166n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119171t;
    public final e4m.e u;
    public final e4m.e v;

    public l1(c1 c1Var, iq3.a aVar, ViewController viewController, CreditLinkedAccountsV2FlowContract$InputData creditLinkedAccountsV2FlowContract$InputData) {
        this.f119160c = c1Var;
        this.f119158a = aVar;
        this.f119159b = creditLinkedAccountsV2FlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119161g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119162h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditLinkedAccountsV2FlowContract$InputData));
        int i2 = 2;
        this.f119163j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119164l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119165m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119166n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119167p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119168q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119169r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119170s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119171t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 15, i2));
        this.v = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // dd4.a
    public final p8 b() {
        return new p8(this.f119160c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119170s.get(), (yji.n) this.f119171t.get(), (yji.n) this.f119167p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119162h.get(), (yji.d) this.f119169r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119160c, this.d, 22);
    }
}
