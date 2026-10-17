package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d6 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectSolicitorControllerContract$InputData f118585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118587c;
    public final t5 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118589h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118590j;

    public d6(c1 c1Var, r6 r6Var, ViewController viewController, SelectSolicitorControllerContract$InputData selectSolicitorControllerContract$InputData) {
        this.f118586b = c1Var;
        this.f118585a = selectSolicitorControllerContract$InputData;
        this.f118587c = e4m.b.b(e4m.c.a(viewController));
        t5 t5Var = new t5(c1Var, r6Var, this, 1, 4);
        this.d = t5Var;
        this.e = e4m.b.b(t5Var);
        this.f = e4m.b.b(new t5(c1Var, r6Var, this, 0, 4));
        this.f118588g = e4m.b.b(new t5(c1Var, r6Var, this, 2, 4));
        this.f118589h = e4m.b.b(new t5(c1Var, r6Var, this, 3, 4));
        this.i = e4m.b.b(this.d);
        this.f118590j = e4m.b.b(new t5(c1Var, r6Var, this, 4, 4));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f118588g.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118589h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f118588g.get());
    }
}
