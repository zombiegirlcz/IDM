package po9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f237941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nhf.a f237942b;

    public x(com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f237941a = transactionsInteractor;
        this.f237942b = unitedWalletInteractor;
    }
}
