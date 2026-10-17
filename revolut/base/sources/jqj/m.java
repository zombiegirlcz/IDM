package jqj;

import com.revolut.retail.feature.impl.analytics_cycle.network.TransactionAnalyticsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionAnalyticsService f177746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f177747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fqj.a f177748c;

    public m(TransactionAnalyticsService transactionAnalyticsService, com.revolut.domain.interactors.transactions.a transactionsInteractor, fqj.a analyticsTransactionsUpdatesLoader) {
        Intrinsics.checkNotNullParameter(transactionAnalyticsService, "transactionAnalyticsService");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsUpdatesLoader, "analyticsTransactionsUpdatesLoader");
        this.f177746a = transactionAnalyticsService;
        this.f177747b = transactionsInteractor;
        this.f177748c = analyticsTransactionsUpdatesLoader;
    }
}
