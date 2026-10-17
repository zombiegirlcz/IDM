package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails.LoanRepaymentDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanRepaymentDetailsControllerContract$InputData f277099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f277100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277101c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277103h;
    public final e4m.e i;

    public d0(h hVar, ViewController viewController, LoanRepaymentDetailsControllerContract$InputData loanRepaymentDetailsControllerContract$InputData) {
        this.f277099a = loanRepaymentDetailsControllerContract$InputData;
        this.f277100b = e4m.b.b(e4m.c.a(viewController));
        this.f277101c = e4m.b.b(new e(hVar, this, 2, 14));
        this.d = e4m.b.b(new e(hVar, this, 1, 14));
        this.e = e4m.b.b(new e(hVar, this, 0, 14));
        this.f = e4m.b.b(new e(hVar, this, 4, 14));
        this.f277102g = e4m.b.b(new e(hVar, this, 3, 14));
        this.f277103h = e4m.b.b(new e(hVar, this, 6, 14));
        this.i = e4m.b.b(new e(hVar, this, 5, 14));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f277102g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
