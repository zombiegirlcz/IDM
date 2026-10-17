package m75;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2ControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements g {
    public final y45.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f203326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f203327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f203328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f203329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ky4.e f203330t;

    public j(LoanRefinancedCreditListV2ControllerContract$InputData inputData, n stateMapper, y45.i loanProductInteractor, a loanRefinancedCreditDialogFactory, j60.a bottomDialog) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanRefinancedCreditDialogFactory, "loanRefinancedCreditDialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.o = loanProductInteractor;
        this.f203326p = loanRefinancedCreditDialogFactory;
        this.f203327q = bottomDialog;
        this.f203328r = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f203329s = inputData.f70480a;
        this.f203330t = new ky4.e(0);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f203330t, new li2.f(continuation, this, 22)), null, null, new i(this, continuation, 0), 3);
        l2(new lo.c(this, continuation, 22), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f203328r;
    }
}
