package iag;

import fub.k;
import kotlin.jvm.internal.Intrinsics;
import whf.n;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f160019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f160020b;

    public a(n transactionItemsMapper, k revPointsTransactionMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        this.f160019a = transactionItemsMapper;
        this.f160020b = revPointsTransactionMapper;
    }
}
