package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class r3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KontomatikIncomeCheckFlowContract$InputData f119646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119647c;
    public final r3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119649h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119650j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119653n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119658t;
    public final e4m.e u;
    public final e4m.e v;

    public r3(c1 c1Var, iq3.a aVar, ViewController viewController, KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData) {
        this.f119647c = c1Var;
        this.f119645a = aVar;
        this.f119646b = kontomatikIncomeCheckFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119648g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119649h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(kontomatikIncomeCheckFlowContract$InputData));
        int i2 = 6;
        this.f119650j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119651l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119652m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119653n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119654p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119655q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119656r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119657s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f119658t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
        this.v = e4m.b.b(new g3(c1Var, this, 15, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119657s.get(), (yji.n) this.f119658t.get(), (yji.n) this.f119654p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119649h.get(), (yji.d) this.f119656r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119647c, this.d, 3);
    }
}
