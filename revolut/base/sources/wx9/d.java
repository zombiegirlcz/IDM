package wx9;

import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.jvm.internal.Intrinsics;
import mp.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    @NotNull
    public static final c Companion = new c(0);
    public static final TransactionContext e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f300793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f300794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hx9.a f300795c;
    public final hx9.c d;

    static {
        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.ACQUIRING_CASHBACK, TransactionContext.TransactionData.EXCLUDED_FROM_SPENDING_ANALYTICS, TransactionContext.TransactionData.LOANS, TransactionContext.TransactionData.MERCHANT_PAYMENTS, TransactionContext.TransactionData.RELATED_TRANSACTIONS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = new TransactionContext(null, new TransactionContext.DataSet.Excluded(kotlin.collections.d.y0(elements)), 1);
    }

    public d(com.revolut.domain.interactors.transactions.a transactionsInteractor, r recentTransactionScopesProvider, hx9.a recentFilterInteractor, hx9.c recentTypeMapper) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(recentTransactionScopesProvider, "recentTransactionScopesProvider");
        Intrinsics.checkNotNullParameter(recentFilterInteractor, "recentFilterInteractor");
        Intrinsics.checkNotNullParameter(recentTypeMapper, "recentTypeMapper");
        this.f300793a = transactionsInteractor;
        this.f300794b = recentTransactionScopesProvider;
        this.f300795c = recentFilterInteractor;
        this.d = recentTypeMapper;
    }
}
