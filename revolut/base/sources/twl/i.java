package twl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f275055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f275056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f275057c;
    public final l93.f d;

    public i(c state, com.revolut.domain.interactors.transactions.a transactionsInteractor, wsg.n walletsInteractor, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f275055a = state;
        this.f275056b = transactionsInteractor;
        this.f275057c = walletsInteractor;
        this.d = revolutCardsInteractor;
    }
}
