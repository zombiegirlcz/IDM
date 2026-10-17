package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h4 implements xki.c, iq3.d, z44.a, w94.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MortgageSignatureFlowContract$InputData f118874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118875c;
    public final h4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118877h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118878j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118881n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118886t;
    public final e4m.e u;
    public final e4m.e v;

    public h4(c1 c1Var, iq3.a aVar, ViewController viewController, MortgageSignatureFlowContract$InputData mortgageSignatureFlowContract$InputData) {
        this.f118875c = c1Var;
        this.f118873a = aVar;
        this.f118874b = mortgageSignatureFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 15;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f118876g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f118877h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(mortgageSignatureFlowContract$InputData));
        int i2 = 15;
        this.f118878j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f118879l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f118880m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f118881n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f118882p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f118883q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f118884r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f118885s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f118886t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 15, i2));
        this.v = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // z44.a
    public final y7 b() {
        return new y7(this.f118875c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118885s.get(), (yji.n) this.f118886t.get(), (yji.n) this.f118882p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118877h.get(), (yji.d) this.f118884r.get());
    }

    @Override // w94.a
    public final i8 j() {
        return new i8(this.f118875c, this.d, 2);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118875c, this.d, 23);
    }
}
