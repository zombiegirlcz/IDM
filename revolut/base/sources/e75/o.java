package e75;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends oki.h implements dli.b {
    public final LoanPaymentSettingsHubControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l35.b f123077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y45.i f123078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m35.c f123079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f123080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f123081t;

    public o(LoanPaymentSettingsHubControllerContract$InputData inputData, l35.b loanInteractor, y45.i loanProductInteractor, m35.c loanAutopayAccountMapper, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanAutopayAccountMapper, "loanAutopayAccountMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f123077p = loanInteractor;
        this.f123078q = loanProductInteractor;
        this.f123079r = loanAutopayAccountMapper;
        this.f123080s = new vii.b();
        this.f123081t = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f123080s, new dz6.n(continuation, this, 5)), null, null, new e0b.c(this, continuation, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f123081t;
    }
}
