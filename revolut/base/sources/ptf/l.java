package ptf;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements g {

    @NotNull
    public static final i Companion = new i();
    public final TransferReasonsTransactionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f239668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f239669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f239670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f239671s;

    public l(n stateMapper, TransferReasonsTransactionsScreenContract$InputData inputData, com.revolut.domain.interactors.transactions.a transactionsInteractor, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.o = inputData;
        this.f239668p = transactionsInteractor;
        this.f239669q = transactionsContentProvider;
        m70.a.c(t0.f186434a);
        this.f239670r = q.c("");
        this.f239671s = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(whf.b.a(this.f239669q, rd0.e.c(new pkg.e(q.q(t1.g(this.f239670r, 300L)), this, 4), kotlin.coroutines.g.f186406a), null, null, null, 14)), null, null, new pqc.k(this, null, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f239671s;
    }
}
