package w75;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends oki.h implements dli.b {

    @NotNull
    public static final i Companion = new i();
    public final s85.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f295478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x75.b f295479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l35.b f295480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ky4.e f295481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f295482t;

    public l(s85.c loanToggleBackupCardModelExtension, j60.a bottomDialogControllerExtension, x75.b loanRepaymentAccountsDialogModelFactory, l35.b loanInteractor, LoanRepaymentAccountsControllerContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(loanToggleBackupCardModelExtension, "loanToggleBackupCardModelExtension");
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(loanRepaymentAccountsDialogModelFactory, "loanRepaymentAccountsDialogModelFactory");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = loanToggleBackupCardModelExtension;
        this.f295478p = bottomDialogControllerExtension;
        this.f295479q = loanRepaymentAccountsDialogModelFactory;
        this.f295480r = loanInteractor;
        this.f295481s = new ky4.e(0);
        this.f295482t = mra.d.b(this, new e(inputData.f70519a, d0.P0(inputData.f70520b, new k()), new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f295481s, new w2a.q(continuation, this, 6)), null, null, new w50.g(this, continuation, 4), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(this.f295478p.E()), null, new w65.c(this, null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f295482t;
    }
}
