package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2ControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class x0 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReviewPaymentV2ControllerContract$InputData f277249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277251c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277253h;
    public final e4m.e i;

    public x0(h hVar, c0 c0Var, ViewController viewController, ReviewPaymentV2ControllerContract$InputData reviewPaymentV2ControllerContract$InputData) {
        this.f277250b = hVar;
        this.f277249a = reviewPaymentV2ControllerContract$InputData;
        this.f277251c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new w0(hVar, this, 0, 0));
        this.e = e4m.b.b(new w0(hVar, this, 2, 0));
        this.f = e4m.b.b(new w0(hVar, this, 1, 0));
        this.f277252g = e4m.b.b(new w0(hVar, this, 3, 0));
        this.f277253h = e4m.b.b(new w0(hVar, this, 5, 0));
        this.i = e4m.b.b(new w0(hVar, this, 4, 0));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.f277252g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
