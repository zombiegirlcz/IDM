package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.CongratulationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CongratulationFlowContract$InputData f119307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119308c;
    public final n0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119310h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119311j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119314n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119319t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f119320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f119321x;

    public n0(c1 c1Var, iq3.a aVar, ViewController viewController, CongratulationFlowContract$InputData congratulationFlowContract$InputData) {
        this.f119308c = c1Var;
        this.f119306a = aVar;
        this.f119307b = congratulationFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 17;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119309g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119310h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(new dmc.b0(c1Var, this, 5, i));
        this.f119311j = e4m.b.b(new dmc.b0(c1Var, this, 4, i));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 3, i));
        this.f119312l = e4m.b.b(e4m.c.a(congratulationFlowContract$InputData));
        int i2 = 17;
        this.f119313m = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119314n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.f119315p = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.f119316q = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f119317r = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119318s = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119319t = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
        this.f119320w = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f119321x = e4m.b.b(new dmc.b0(c1Var, this, 17, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.v.get(), (yji.n) this.f119320w.get(), (yji.n) this.f119318s.get(), (yji.n) this.f119314n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119310h.get(), (yji.d) this.k.get(), (yji.d) this.u.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119308c, this.d, 22);
    }
}
