package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.CheckoutControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutControllerContract$InputData f118783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118785c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118787h;

    public g0(c1 c1Var, y4 y4Var, ViewController viewController, CheckoutControllerContract$InputData checkoutControllerContract$InputData) {
        this.f118784b = c1Var;
        this.f118783a = checkoutControllerContract$InputData;
        this.f118785c = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        e0 e0Var = new e0(c1Var, y4Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, y4Var, this, 0, i));
        this.f118786g = e4m.b.b(this.d);
        this.f118787h = e4m.b.b(new e0(c1Var, y4Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118786g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
