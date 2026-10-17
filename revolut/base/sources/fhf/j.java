package fhf;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreenContract$InputData;
import et6.u1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends oki.h implements f {
    public final SimpleTransactionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f135223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d3j.b f135224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f135225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f135226s;

    public j(SimpleTransactionsScreenContract$InputData inputData, n stateMapper, whf.b transactionsContentProvider, d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.o = inputData;
        this.f135223p = transactionsContentProvider;
        this.f135224q = beneficiaryInteractor;
        this.f135225r = mra.d.b(this, new e(new Data(null, null, true, 3, null), null, inputData.e, inputData.f), stateMapper, null, false, 12);
        this.f135226s = q.c(null);
    }

    @Override // yji.l
    public final void I1() {
        SimpleTransactionsScreenContract$InputData simpleTransactionsScreenContract$InputData = this.o;
        yji.l.a1(this, rd0.e.b(whf.b.a(this.f135223p, w.h(simpleTransactionsScreenContract$InputData.f91950c), null, null, simpleTransactionsScreenContract$InputData.d, 6)), null, null, new i(this, null, 0), 3);
        yji.l.a1(this, new u1(this.f135226s, this, 8), null, null, new i(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f135225r;
    }
}
