package q65;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.r0;
import q2e.i0;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LoanConfirmNewRepaymentDayScreenContract$InputData f242503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l35.b f242504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n65.a f242505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rp0.m f242506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ky4.e f242507t;
    public final g u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, LoanConfirmNewRepaymentDayScreenContract$InputData inputData, l35.b loanInteractor, n65.a loanChangeRepaymentDayDialogMapper, rp0.m expandableDialogDisplayer) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanChangeRepaymentDayDialogMapper, "loanChangeRepaymentDayDialogMapper");
        Intrinsics.checkNotNullParameter(expandableDialogDisplayer, "expandableDialogDisplayer");
        this.f242503p = inputData;
        this.f242504q = loanInteractor;
        this.f242505r = loanChangeRepaymentDayDialogMapper;
        this.f242506s = expandableDialogDisplayer;
        this.f242507t = new ky4.e(0);
        this.u = new g(inputData.f70402b, new Data(null, null, true, 3, null), inputData.f70403c);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f242507t, new r0(10, continuation, this)), null, null, new i0(this, continuation, 14), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
