package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.DownPaymentSourceDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class n2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownPaymentSourceDetailsControllerContract$InputData f119327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119329c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119331h;

    public n2(c1 c1Var, o2 o2Var, ViewController viewController, DownPaymentSourceDetailsControllerContract$InputData downPaymentSourceDetailsControllerContract$InputData) {
        this.f119328b = c1Var;
        this.f119327a = downPaymentSourceDetailsControllerContract$InputData;
        this.f119329c = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, o2Var, this, 1, 13);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, o2Var, this, 0, 13));
        this.f119330g = e4m.b.b(this.d);
        this.f119331h = e4m.b.b(new e0(c1Var, o2Var, this, 2, 13));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119330g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
