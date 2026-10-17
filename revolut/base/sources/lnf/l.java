package lnf;

import cli.y;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import mjf.u;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements e {
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f197245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f197246q;

    public l(n stateMapper, PendingTransactionRecallControllerContract$InputData inputData, u recallableInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recallableInteractor, "recallableInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.o = recallableInteractor;
        this.f197245p = transactionsInteractor;
        this.f197246q = mra.d.b(this, new g(inputData.f92075a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f197246q;
    }
}
