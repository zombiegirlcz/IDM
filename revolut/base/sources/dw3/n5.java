package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class n5 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RefinancingAccountDetailsInputScreenContract$InputData f119352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f119354c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119356h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119357j;

    public n5(c1 c1Var, m5 m5Var, ViewController viewController, RefinancingAccountDetailsInputScreenContract$InputData refinancingAccountDetailsInputScreenContract$InputData) {
        this.f119352a = refinancingAccountDetailsInputScreenContract$InputData;
        this.f119353b = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, m5Var, this, 1, 29);
        this.f119354c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, m5Var, this, 0, 29));
        this.f = e4m.b.b(new e0(c1Var, m5Var, this, 2, 29));
        this.f119355g = e4m.b.b(new e0(c1Var, m5Var, this, 3, 29));
        this.f119356h = e4m.b.b(this.f119354c);
        this.i = e4m.b.b(new e0(c1Var, m5Var, this, 5, 29));
        this.f119357j = e4m.b.b(new e0(c1Var, m5Var, this, 4, 29));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119355g.get(), (yji.n) this.f119356h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}
