package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow.FamilyCreditCardSettingsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e3 implements xki.c, iq3.d, f54.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FamilyCreditCardSettingsFlowContract$InputData f118628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118629c;
    public final e3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118631h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118632j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118635n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118636p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118640t;
    public final e4m.e u;

    public e3(c1 c1Var, iq3.a aVar, ViewController viewController, FamilyCreditCardSettingsFlowContract$InputData familyCreditCardSettingsFlowContract$InputData) {
        this.f118629c = c1Var;
        this.f118627a = aVar;
        this.f118628b = familyCreditCardSettingsFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f118630g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f118631h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(familyCreditCardSettingsFlowContract$InputData));
        int i2 = 29;
        this.f118632j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f118633l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f118634m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f118635n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f118636p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f118637q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f118638r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f118639s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f118640t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118639s.get(), (yji.n) this.f118640t.get(), (yji.n) this.f118636p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118631h.get(), (yji.d) this.f118638r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f118629c, this.d, 28);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f118629c, this.d, 5);
    }
}
