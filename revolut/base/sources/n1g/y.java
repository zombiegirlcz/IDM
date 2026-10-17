package n1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f211355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fub.k f211356b;

    public y(whf.n transactionItemsMapper, fub.k revPointsTransactionMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        this.f211355a = transactionItemsMapper;
        this.f211356b = revPointsTransactionMapper;
    }
}
