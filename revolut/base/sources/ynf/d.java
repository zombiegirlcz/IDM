package ynf;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import snf.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements b {

    @NotNull
    public static final c Companion = new c();
    public static final TransactionContext f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f315466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f315467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final anf.b f315468c;
    public final l0 d;
    public final znf.c e;

    static {
        Priority.HIGH high = new Priority.HIGH("Transaction details - related cashback");
        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.LOANS, TransactionContext.TransactionData.HIDDEN};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f = new TransactionContext(high, new TransactionContext.DataSet.Excluded(kotlin.collections.d.y0(elements)));
    }

    public d(whf.b transactionsContentProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, anf.b sumCalculator, l0 accountDetector, znf.c refundsInfoProvider) {
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(sumCalculator, "sumCalculator");
        Intrinsics.checkNotNullParameter(accountDetector, "accountDetector");
        Intrinsics.checkNotNullParameter(refundsInfoProvider, "refundsInfoProvider");
        this.f315466a = transactionsContentProvider;
        this.f315467b = transactionsInteractor;
        this.f315468c = sumCalculator;
        this.d = accountDetector;
        this.e = refundsInfoProvider;
    }
}
