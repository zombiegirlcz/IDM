package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content.CongratulationsContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CongratulationsContentScreenContract$InputData f119227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f119229c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119231h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119232j;

    public m0(c1 c1Var, n0 n0Var, ViewController viewController, CongratulationsContentScreenContract$InputData congratulationsContentScreenContract$InputData) {
        this.f119227a = congratulationsContentScreenContract$InputData;
        this.f119228b = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, n0Var, this, 1, 2);
        this.f119229c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, n0Var, this, 0, 2));
        this.f = e4m.b.b(new e0(c1Var, n0Var, this, 2, 2));
        this.f119230g = e4m.b.b(new e0(c1Var, n0Var, this, 3, 2));
        this.f119231h = e4m.b.b(this.f119229c);
        this.i = e4m.b.b(new e0(c1Var, n0Var, this, 5, 2));
        this.f119232j = e4m.b.b(new e0(c1Var, n0Var, this, 4, 2));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119230g.get(), (yji.n) this.f119231h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}
