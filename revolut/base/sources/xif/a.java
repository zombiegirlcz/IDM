package xif;

import com.revolut.feature.transactions.impl.data.network.TransactionsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsService f306348a;

    public a(TransactionsService transactionsService) {
        Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
        this.f306348a = transactionsService;
    }
}
