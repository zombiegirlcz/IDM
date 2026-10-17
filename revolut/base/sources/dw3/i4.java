package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i4 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MortgageSignatureSignedFlowContract$InputData f118965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118966c;
    public final i4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118968h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118969j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118972n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118977t;
    public final e4m.e u;

    public i4(c1 c1Var, iq3.a aVar, ViewController viewController, MortgageSignatureSignedFlowContract$InputData mortgageSignatureSignedFlowContract$InputData) {
        this.f118966c = c1Var;
        this.f118964a = aVar;
        this.f118965b = mortgageSignatureSignedFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f118967g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f118968h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(mortgageSignatureSignedFlowContract$InputData));
        int i2 = 16;
        this.f118969j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f118970l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f118971m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f118972n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f118973p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f118974q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f118975r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f118976s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f118977t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118976s.get(), (yji.n) this.f118977t.get(), (yji.n) this.f118973p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118968h.get(), (yji.d) this.f118975r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118966c, this.d, 4);
    }
}
