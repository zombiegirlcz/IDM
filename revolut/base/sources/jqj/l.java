package jqj;

import com.revolut.retail.feature.impl.analytics_cycle.network.TransactionAnalyticsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f177743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionAnalyticsService f177744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f177745c;

    public l(ue0.c storage, TransactionAnalyticsService transactionAnalyticsService, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(transactionAnalyticsService, "transactionAnalyticsService");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f177743a = storage;
        this.f177744b = transactionAnalyticsService;
        this.f177745c = transactionsInteractor;
    }
}
