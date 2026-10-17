package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class x0 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditAddressV2FlowContract$InputData f120112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120113c;
    public final x0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120115h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120116j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120119n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120124t;
    public final e4m.e u;

    public x0(c1 c1Var, iq3.a aVar, ViewController viewController, CreditAddressV2FlowContract$InputData creditAddressV2FlowContract$InputData) {
        this.f120113c = c1Var;
        this.f120111a = aVar;
        this.f120112b = creditAddressV2FlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f120114g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f120115h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditAddressV2FlowContract$InputData));
        int i2 = 24;
        this.f120116j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f120117l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f120118m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f120119n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f120120p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f120121q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f120122r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f120123s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f120124t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120123s.get(), (yji.n) this.f120124t.get(), (yji.n) this.f120120p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120115h.get(), (yji.d) this.f120122r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f120113c, this.d, 11);
    }
}
