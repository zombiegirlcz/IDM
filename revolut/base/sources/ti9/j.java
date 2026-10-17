package ti9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements xh9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh9.a f271465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f271466b;

    public j(xh9.a payLaterInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f271465a = payLaterInteractor;
        this.f271466b = transactionsInteractor;
    }
}
