package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.ReviewPaymentControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReviewPaymentControllerContract$InputData f277234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277236c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277238h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f277239j;

    public v0(h hVar, c0 c0Var, ViewController viewController, ReviewPaymentControllerContract$InputData reviewPaymentControllerContract$InputData) {
        this.f277235b = hVar;
        this.f277234a = reviewPaymentControllerContract$InputData;
        this.f277236c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new e(hVar, this, 2, 29));
        this.e = e4m.b.b(new e(hVar, this, 1, 29));
        this.f = e4m.b.b(new e(hVar, this, 0, 29));
        this.f277237g = e4m.b.b(new e(hVar, this, 4, 29));
        this.f277238h = e4m.b.b(new e(hVar, this, 3, 29));
        this.i = e4m.b.b(new e(hVar, this, 6, 29));
        this.f277239j = e4m.b.b(new e(hVar, this, 5, 29));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f277238h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
