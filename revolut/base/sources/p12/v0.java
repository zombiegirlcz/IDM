package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class v0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferAmountContract$InputData f231794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f231795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f231796c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f231798h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f231799j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f231800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f231801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f231802n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f231803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f231804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f231805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f231806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f231807t;
    public final e4m.e u;

    public v0(v vVar, l0 l0Var, ViewController viewController, TransferAmountContract$InputData transferAmountContract$InputData) {
        this.f231795b = vVar;
        this.f231796c = l0Var;
        this.f231794a = transferAmountContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.e = e4m.b.b(new ned.h(vVar, l0Var, this, 1, i));
        this.f = e4m.b.b(new ned.h(vVar, l0Var, this, 0, i));
        this.f231797g = e4m.b.b(new ned.h(vVar, l0Var, this, 3, i));
        this.f231798h = e4m.b.b(new ned.h(vVar, l0Var, this, 2, i));
        this.i = e4m.b.b(new ned.h(vVar, l0Var, this, 6, i));
        this.f231799j = e4m.b.b(new ned.h(vVar, l0Var, this, 5, i));
        this.k = e4m.b.b(new ned.h(vVar, l0Var, this, 4, i));
        this.f231800l = e4m.b.b(new ned.h(vVar, l0Var, this, 8, i));
        this.f231801m = e4m.b.b(new ned.h(vVar, l0Var, this, 7, i));
        this.f231802n = e4m.b.b(new ned.h(vVar, l0Var, this, 11, i));
        this.o = e4m.b.b(new ned.h(vVar, l0Var, this, 10, i));
        this.f231803p = e4m.b.b(new ned.h(vVar, l0Var, this, 9, i));
        this.f231804q = e4m.b.b(new ned.h(vVar, l0Var, this, 13, i));
        this.f231805r = e4m.b.b(new ned.h(vVar, l0Var, this, 14, i));
        this.f231806s = e4m.b.b(new ned.h(vVar, l0Var, this, 16, i));
        this.f231807t = e4m.b.b(new ned.h(vVar, l0Var, this, 15, i));
        this.u = e4m.b.b(new ned.h(vVar, l0Var, this, 12, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f231801m.get(), (yji.n) this.f231803p.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f231798h.get(), (yji.d) this.k.get());
    }
}
