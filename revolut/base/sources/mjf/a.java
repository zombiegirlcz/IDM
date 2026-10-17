package mjf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements mhf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g31.c f205978a;

    public a(g31.c repository, com.revolut.domain.interactors.transactions.a transactionsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f205978a = repository;
    }
}
