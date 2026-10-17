package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class x6 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatusDialogFlowContract$InputData f120152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120153c;
    public final x6 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120155h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120156j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120159n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120164t;
    public final e4m.e u;

    public x6(c1 c1Var, iq3.a aVar, ViewController viewController, StatusDialogFlowContract$InputData statusDialogFlowContract$InputData) {
        this.f120153c = c1Var;
        this.f120151a = aVar;
        this.f120152b = statusDialogFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f120154g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f120155h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(statusDialogFlowContract$InputData));
        int i2 = 22;
        this.f120156j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f120157l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f120158m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f120159n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f120160p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f120161q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f120162r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f120163s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f120164t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120163s.get(), (yji.n) this.f120164t.get(), (yji.n) this.f120160p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120155h.get(), (yji.d) this.f120162r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f120153c, this.d, 0);
    }
}
