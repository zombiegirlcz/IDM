package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 implements xki.c, h75.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanSetupSepaAccountFlowContract$InputData f277170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f277172c = this;
    public final e4m.e d;
    public final e4m.e e;

    public l0(h hVar, LoanSetupSepaAccountFlowContract$InputData loanSetupSepaAccountFlowContract$InputData) {
        this.f277171b = hVar;
        this.f277170a = loanSetupSepaAccountFlowContract$InputData;
        int i = 20;
        this.d = e4m.b.b(new e(hVar, this, 0, i));
        this.e = e4m.b.b(new e(hVar, this, 1, i));
    }

    @Override // h75.a
    public final z0 b() {
        return new z0(this.f277171b, this.f277172c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
