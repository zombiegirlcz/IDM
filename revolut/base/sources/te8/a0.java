package te8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f270052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f270053b;

    public a0(com.revolut.domain.interactors.transactions.a transactionsInteractor, wsg.n walletsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        this.f270052a = transactionsInteractor;
        this.f270053b = walletsInteractor;
    }
}
