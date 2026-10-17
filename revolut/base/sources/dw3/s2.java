package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s2 implements xki.c, iq3.d, sk3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ESignatureFlowContract$InputData f119732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119733c;
    public final s2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119735h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119736j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119739n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119744t;
    public final e4m.e u;

    public s2(c1 c1Var, iq3.a aVar, ViewController viewController, ESignatureFlowContract$InputData eSignatureFlowContract$InputData) {
        this.f119733c = c1Var;
        this.f119731a = aVar;
        this.f119732b = eSignatureFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119734g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119735h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(eSignatureFlowContract$InputData));
        int i2 = 20;
        this.f119736j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119737l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119738m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119739n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119740p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119741q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119742r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119743s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119744t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // sk3.b
    public final dd9.a c() {
        return new dd9.a(this.f119733c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119743s.get(), (yji.n) this.f119744t.get(), (yji.n) this.f119740p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119735h.get(), (yji.d) this.f119742r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119733c, this.d, 12);
    }
}
