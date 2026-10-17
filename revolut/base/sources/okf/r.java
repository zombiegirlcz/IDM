package okf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class r {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f226029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.b f226030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.n f226031c;
    public final glf.b d;

    public r(h0 commonDataSource, whf.b transactionsContentProvider, whf.n transactionListMapper, glf.b creditLinkedTransactionClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(transactionListMapper, "transactionListMapper");
        Intrinsics.checkNotNullParameter(creditLinkedTransactionClickHandler, "creditLinkedTransactionClickHandler");
        this.f226029a = commonDataSource;
        this.f226030b = transactionsContentProvider;
        this.f226031c = transactionListMapper;
        this.d = creditLinkedTransactionClickHandler;
    }
}
