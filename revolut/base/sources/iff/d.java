package iff;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements ihf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f161014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f161015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f161016c;

    public d(a transactionsStatisticsCacheRepository, com.revolut.domain.interactors.transactions.a transactionsInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(transactionsStatisticsCacheRepository, "transactionsStatisticsCacheRepository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f161014a = transactionsStatisticsCacheRepository;
        this.f161015b = transactionsInteractor;
        this.f161016c = walletInteractor;
    }
}
