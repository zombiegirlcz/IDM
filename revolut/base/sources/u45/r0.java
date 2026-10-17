package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class r0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanPartialRepaymentControllerContract$InputData f277207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277209c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277211h;
    public final e4m.e i;

    public r0(h hVar, LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData) {
        this.f277208b = hVar;
        this.f277207a = loanPartialRepaymentControllerContract$InputData;
        int i = 26;
        this.f277209c = e4m.b.b(new e(hVar, this, 1, i));
        this.d = e4m.b.b(new e(hVar, this, 0, i));
        this.e = e4m.b.b(new e(hVar, this, 3, i));
        this.f = e4m.b.b(new e(hVar, this, 2, i));
        this.f277210g = e4m.b.b(new e(hVar, this, 5, i));
        this.f277211h = e4m.b.b(new e(hVar, this, 6, i));
        this.i = e4m.b.b(new e(hVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
