package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.HowItWorksScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class n3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HowItWorksScreenContract$InputData f119332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f119334c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119336h;

    public n3(c1 c1Var, m3 m3Var, ViewController viewController, HowItWorksScreenContract$InputData howItWorksScreenContract$InputData) {
        this.f119332a = howItWorksScreenContract$InputData;
        this.f119333b = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        e0 e0Var = new e0(c1Var, m3Var, this, 1, i);
        this.f119334c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, m3Var, this, 0, i));
        this.f = e4m.b.b(this.f119334c);
        this.f119335g = e4m.b.b(new e0(c1Var, m3Var, this, 3, i));
        this.f119336h = e4m.b.b(new e0(c1Var, m3Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
