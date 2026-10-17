package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y5 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecurityDepositFlowContract$InputData f120221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120222c;
    public final y5 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120224h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120225j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120228n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120233t;
    public final e4m.e u;

    public y5(c1 c1Var, iq3.a aVar, ViewController viewController, SecurityDepositFlowContract$InputData securityDepositFlowContract$InputData) {
        this.f120222c = c1Var;
        this.f120220a = aVar;
        this.f120221b = securityDepositFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f120223g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f120224h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(securityDepositFlowContract$InputData));
        int i2 = 9;
        this.f120225j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f120226l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f120227m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f120228n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f120229p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f120230q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f120231r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f120232s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f120233t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120232s.get(), (yji.n) this.f120233t.get(), (yji.n) this.f120229p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120224h.get(), (yji.d) this.f120231r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f120222c, this.d, 6);
    }
}
