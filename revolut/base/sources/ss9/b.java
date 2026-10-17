package ss9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.payments.groups.impl.mappers.transactions.a f265359a;

    public b(com.revolut.feature.payments.groups.impl.mappers.transactions.a groupTransactionsMapper) {
        Intrinsics.checkNotNullParameter(groupTransactionsMapper, "groupTransactionsMapper");
        this.f265359a = groupTransactionsMapper;
    }
}
