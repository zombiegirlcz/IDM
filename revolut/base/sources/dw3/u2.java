package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u2 implements xki.c, iq3.d, ki4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmailVerificationFlowContract$InputData f119888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119889c;
    public final u2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119891h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119892j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119895n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119900t;
    public final e4m.e u;

    public u2(c1 c1Var, iq3.a aVar, ViewController viewController, EmailVerificationFlowContract$InputData emailVerificationFlowContract$InputData) {
        this.f119889c = c1Var;
        this.f119887a = aVar;
        this.f119888b = emailVerificationFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119890g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119891h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(emailVerificationFlowContract$InputData));
        int i2 = 21;
        this.f119892j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119893l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119894m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119895n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119896p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119897q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119898r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119899s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119900t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // ki4.a
    public final g9 b() {
        return new g9(this.f119889c, this.d, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119899s.get(), (yji.n) this.f119900t.get(), (yji.n) this.f119896p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119891h.get(), (yji.d) this.f119898r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119889c, this.d, 4);
    }
}
