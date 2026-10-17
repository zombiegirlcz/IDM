package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.CoBorrowerConsentPartnerFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoBorrowerConsentPartnerFlowContract$InputData f118928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118929c;
    public final i0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118931h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118932j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118935n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118940t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118941w;

    public i0(c1 c1Var, iq3.a aVar, ViewController viewController, CoBorrowerConsentPartnerFlowContract$InputData coBorrowerConsentPartnerFlowContract$InputData) {
        this.f118929c = c1Var;
        this.f118927a = aVar;
        this.f118928b = coBorrowerConsentPartnerFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f118930g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f118931h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(coBorrowerConsentPartnerFlowContract$InputData));
        int i2 = 13;
        this.f118932j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f118933l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f118934m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f118935n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f118936p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f118937q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f118938r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f118939s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f118940t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f118941w = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118939s.get(), (yji.n) this.f118940t.get(), (yji.n) this.f118936p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118931h.get(), (yji.d) this.f118938r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118929c, this.d, 9);
    }
}
