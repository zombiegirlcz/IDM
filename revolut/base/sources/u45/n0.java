package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanStatementsListScreenContract$InputData f277182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f277183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277184c;

    public n0(h hVar, LoanStatementsListScreenContract$InputData loanStatementsListScreenContract$InputData) {
        this.f277182a = loanStatementsListScreenContract$InputData;
        int i = 21;
        this.f277183b = e4m.b.b(new e(hVar, this, 1, i));
        this.f277184c = e4m.b.b(new e(hVar, this, 0, i));
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
