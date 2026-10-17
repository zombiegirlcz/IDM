package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.SepaDirectDebitFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h6 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SepaDirectDebitFlowContract$InputData f118902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118903c;
    public final h6 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118905h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118906j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118909n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118914t;

    public h6(c1 c1Var, iq3.a aVar, ViewController viewController, SepaDirectDebitFlowContract$InputData sepaDirectDebitFlowContract$InputData) {
        this.f118903c = c1Var;
        this.f118901a = aVar;
        this.f118902b = sepaDirectDebitFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f118904g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f118905h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(new g5(c1Var, this, 7, i));
        this.f118906j = e4m.b.b(new g5(c1Var, this, 6, i));
        this.k = e4m.b.b(new g5(c1Var, this, 10, i));
        this.f118907l = e4m.b.b(new g5(c1Var, this, 11, i));
        this.f118908m = e4m.b.b(new g5(c1Var, this, 9, i));
        this.f118909n = e4m.b.b(new g5(c1Var, this, 8, i));
        this.o = e4m.b.b(new g5(c1Var, this, 5, i));
        this.f118910p = e4m.b.b(new g5(c1Var, this, 4, i));
        this.f118911q = e4m.b.b(new g5(c1Var, this, 3, i));
        this.f118912r = e4m.b.b(new g5(c1Var, this, 12, i));
        this.f118913s = e4m.b.b(new g5(c1Var, this, 13, i));
        this.f118914t = e4m.b.b(new g5(c1Var, this, 14, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118912r.get(), (yji.n) this.f118913s.get(), (yji.n) this.o.get(), (yji.n) this.f118906j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118905h.get(), (yji.d) this.f118911q.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118903c, this.d, 12);
    }
}
