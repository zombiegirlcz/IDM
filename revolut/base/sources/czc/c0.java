package czc;

import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.r9;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends oki.h implements p {
    public final SotFlowContract$Step.Summary o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f110187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cli.y f110188q;

    public c0(SotFlowContract$Step.Summary step, m0 mapper, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.o = step;
        this.f110187p = transactionsInteractor;
        IncomeSource incomeSource = step.f85934b;
        SubmissionEvidence submissionEvidence = step.f85935c;
        this.f110188q = mra.d.b(this, new o(incomeSource, submissionEvidence, step.d, step.e, step.f, step.f85936g, step.f85937h, submissionEvidence == null, new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(nim.a.w(com.revolut.domain.interactors.transactions.a.d(this.f110187p, new r9(this.o.f85933a), null, null, null, null, 30), new cw7.j(20))), null, new cvi.j(this, (Continuation) null, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f110188q;
    }
}
