package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoBorrowerConsentInitiatorFlowContract$InputData f118838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118839c;
    public final h0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118841h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118842j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118845n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118850t;
    public final e4m.e u;

    public h0(c1 c1Var, iq3.a aVar, ViewController viewController, CoBorrowerConsentInitiatorFlowContract$InputData coBorrowerConsentInitiatorFlowContract$InputData) {
        this.f118839c = c1Var;
        this.f118837a = aVar;
        this.f118838b = coBorrowerConsentInitiatorFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f118840g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f118841h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(coBorrowerConsentInitiatorFlowContract$InputData));
        int i2 = 12;
        this.f118842j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f118843l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f118844m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f118845n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f118846p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f118847q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f118848r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f118849s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f118850t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118849s.get(), (yji.n) this.f118850t.get(), (yji.n) this.f118846p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118841h.get(), (yji.d) this.f118848r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118839c, this.d, 8);
    }
}
