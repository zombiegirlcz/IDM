package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanSelectNewRepaymentDayScreenContract$InputData f277150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277152c;
    public final e4m.e d;

    public i0(h hVar, LoanSelectNewRepaymentDayScreenContract$InputData loanSelectNewRepaymentDayScreenContract$InputData) {
        this.f277151b = hVar;
        this.f277150a = loanSelectNewRepaymentDayScreenContract$InputData;
        int i = 18;
        this.f277152c = e4m.b.b(new e(hVar, this, 1, i));
        this.d = e4m.b.b(new e(hVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
