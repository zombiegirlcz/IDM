package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content.CreditHealthContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i1 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditHealthContentScreenContract$InputData f118942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118944c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public i1(c1 c1Var, j1 j1Var, ViewController viewController, CreditHealthContentScreenContract$InputData creditHealthContentScreenContract$InputData) {
        this.f118943b = c1Var;
        this.f118942a = creditHealthContentScreenContract$InputData;
        this.f118944c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new h1(c1Var, this, 0, 0));
        this.e = e4m.b.b(new h1(c1Var, this, 1, 0));
        this.f = e4m.b.b(new h1(c1Var, this, 2, 0));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
