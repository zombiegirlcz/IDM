package ld4;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.SelectLoanControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends oki.h implements dli.b {
    public final mx3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SelectLoanControllerContract$InputData f194031p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f194032q;

    public n(mx3.a interactor, SelectLoanControllerContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f194031p = inputData;
        this.f194032q = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.b1(this, ngm.n.K(new l40.j(this, continuation, 5)), null, new l1g.e(this, continuation, 21), 3);
    }

    public final void I2(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof f) {
            C2(j.f194027a);
            return;
        }
        if (event instanceof h) {
            Continuation continuation = null;
            yji.l.b1(this, ngm.n.K(new l40.j(this, continuation, 5)), null, new l1g.e(this, continuation, 21), 3);
        } else {
            if (!(event instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new k(((g) event).f194025a));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f194032q;
    }
}
