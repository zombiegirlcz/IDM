package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanRepaymentBreakdownControllerContract$InputData f277056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277058c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277060h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f277061j;

    public b0(h hVar, ViewController viewController, LoanRepaymentBreakdownControllerContract$InputData loanRepaymentBreakdownControllerContract$InputData) {
        this.f277057b = hVar;
        this.f277056a = loanRepaymentBreakdownControllerContract$InputData;
        this.f277058c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new e(hVar, this, 2, 13));
        this.e = e4m.b.b(new e(hVar, this, 1, 13));
        this.f = e4m.b.b(new e(hVar, this, 0, 13));
        this.f277059g = e4m.b.b(new e(hVar, this, 4, 13));
        this.f277060h = e4m.b.b(new e(hVar, this, 3, 13));
        this.i = e4m.b.b(new e(hVar, this, 6, 13));
        this.f277061j = e4m.b.b(new e(hVar, this, 5, 13));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f277060h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
