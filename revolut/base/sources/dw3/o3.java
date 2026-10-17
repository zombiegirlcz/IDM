package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IllionBankStatementFlowContract$InputData f119424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119425c;
    public final o3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119427h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119428j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119431n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119436t;
    public final e4m.e u;

    public o3(c1 c1Var, iq3.a aVar, ViewController viewController, IllionBankStatementFlowContract$InputData illionBankStatementFlowContract$InputData) {
        this.f119425c = c1Var;
        this.f119423a = aVar;
        this.f119424b = illionBankStatementFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119426g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119427h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(illionBankStatementFlowContract$InputData));
        int i2 = 5;
        this.f119428j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119429l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119430m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119431n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119432p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119433q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119434r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119435s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f119436t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119435s.get(), (yji.n) this.f119436t.get(), (yji.n) this.f119432p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119427h.get(), (yji.d) this.f119434r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119425c, this.d, 20);
    }
}
