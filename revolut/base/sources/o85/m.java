package o85;

import cli.n;
import cli.y;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements f {
    public final LoanRepaymentTypeControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l35.b f222944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f222945q;

    public m(n mapper, LoanRepaymentTypeControllerContract$InputData inputData, l35.b loanInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        this.o = inputData;
        this.f222944p = loanInteractor;
        this.f222945q = mra.d.b(this, new d(inputData.f70581a), mapper, null, false, 12);
    }

    public final void I2(g0 g0Var) {
        int i = g0Var == null ? -1 : i.f222940a[g0Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                l2(new l(this, null, 0), new yi5.b(26));
                return;
            } else if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        C1(new LoanKompotFeatureConfig.PartialRepaymentDestination(this.o.f70581a.f70144a.f70108a, g0Var));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f222945q;
    }
}
