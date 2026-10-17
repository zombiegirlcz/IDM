package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanChangeRepaymentDayFlowContract$InputData f277167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f277168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277169c;
    public final e4m.e d;
    public final e4m.e e;

    public l(h hVar, LoanChangeRepaymentDayFlowContract$InputData loanChangeRepaymentDayFlowContract$InputData) {
        this.f277167a = loanChangeRepaymentDayFlowContract$InputData;
        this.f277168b = new e(hVar, this, 2, 5);
        this.f277169c = e4m.b.b(new e(hVar, this, 1, 5));
        this.d = e4m.b.b(new e(hVar, this, 0, 5));
        this.e = e4m.b.b(new e(hVar, this, 3, 5));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
