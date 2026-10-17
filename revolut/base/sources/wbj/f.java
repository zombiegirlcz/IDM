package wbj;

import cli.y;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositReturnDetailsBottomSheetControllerInputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.r9;
import w3c.n;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends oki.h implements e {
    public final CryptoDepositReturnDetailsBottomSheetControllerInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f296235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fbj.a f296236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f296237r;

    public f(h stateMapper, CryptoDepositReturnDetailsBottomSheetControllerInputData inputData, com.revolut.domain.interactors.transactions.a transactionsInteractor, fbj.a cryptoDepositsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        this.o = inputData;
        this.f296235p = transactionsInteractor;
        this.f296236q = cryptoDepositsInteractor;
        this.f296237r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        z1(new w50.g(this, (Continuation) null, 15), boh.f.e(nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(this.f296235p, new r9(this.o.f100049a), null, null, null, new TransactionContext(new Priority.HIGH("Crypto deposit return details"), null, 2), 14)), new w6h.f(26)), new n(this, 25)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f296237r;
    }
}
