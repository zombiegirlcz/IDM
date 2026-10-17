package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l5 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RefinancingAccountDetailsHomeScreenContract$InputData f119203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f119205c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119207h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119208j;

    public l5(c1 c1Var, k5 k5Var, ViewController viewController, RefinancingAccountDetailsHomeScreenContract$InputData refinancingAccountDetailsHomeScreenContract$InputData) {
        this.f119203a = refinancingAccountDetailsHomeScreenContract$InputData;
        this.f119204b = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        e0 e0Var = new e0(c1Var, k5Var, this, 1, i);
        this.f119205c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, k5Var, this, 0, i));
        this.f = e4m.b.b(new e0(c1Var, k5Var, this, 2, i));
        this.f119206g = e4m.b.b(new e0(c1Var, k5Var, this, 3, i));
        this.f119207h = e4m.b.b(this.f119205c);
        this.i = e4m.b.b(new e0(c1Var, k5Var, this, 5, i));
        this.f119208j = e4m.b.b(new e0(c1Var, k5Var, this, 4, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119206g.get(), (yji.n) this.f119207h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}
