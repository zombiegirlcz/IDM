package okf;

import klf.s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f226033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.g f226034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final glf.b f226035c;

    public u(s0 creditRepaymentRevPointsDataSource, thf.g transactionsRowMapper, glf.b creditLinkedTransactionClickHandler) {
        Intrinsics.checkNotNullParameter(creditRepaymentRevPointsDataSource, "creditRepaymentRevPointsDataSource");
        Intrinsics.checkNotNullParameter(transactionsRowMapper, "transactionsRowMapper");
        Intrinsics.checkNotNullParameter(creditLinkedTransactionClickHandler, "creditLinkedTransactionClickHandler");
        this.f226033a = creditRepaymentRevPointsDataSource;
        this.f226034b = transactionsRowMapper;
        this.f226035c = creditLinkedTransactionClickHandler;
    }
}
