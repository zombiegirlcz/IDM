package k7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzi.a f182063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f182064b;

    public e(wzi.a incomeSorterInteractor, com.revolut.domain.interactors.transactions.a transactionInteractor) {
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        this.f182063a = incomeSorterInteractor;
        this.f182064b = transactionInteractor;
    }
}
