package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u6 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpousalConsentInitiatorFlowContract$InputData f119924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119925c;
    public final u6 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119927h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119928j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119931n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119936t;
    public final e4m.e u;

    public u6(c1 c1Var, iq3.a aVar, ViewController viewController, SpousalConsentInitiatorFlowContract$InputData spousalConsentInitiatorFlowContract$InputData) {
        this.f119925c = c1Var;
        this.f119923a = aVar;
        this.f119924b = spousalConsentInitiatorFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f119926g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f119927h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(spousalConsentInitiatorFlowContract$InputData));
        int i2 = 19;
        this.f119928j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f119929l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f119930m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f119931n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f119932p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f119933q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f119934r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f119935s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f119936t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119935s.get(), (yji.n) this.f119936t.get(), (yji.n) this.f119932p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119927h.get(), (yji.d) this.f119934r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119925c, this.d, 15);
    }
}
