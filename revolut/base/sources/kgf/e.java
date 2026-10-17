package kgf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9e.a f183982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f183983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dhf.b f183984c;

    public e(g9e.a subscriptionsListPresentationModel, c transactionsAccountsInteractor, dhf.b recurringPaymentsContentFilter) {
        Intrinsics.checkNotNullParameter(subscriptionsListPresentationModel, "subscriptionsListPresentationModel");
        Intrinsics.checkNotNullParameter(transactionsAccountsInteractor, "transactionsAccountsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentsContentFilter, "recurringPaymentsContentFilter");
        this.f183982a = subscriptionsListPresentationModel;
        this.f183983b = transactionsAccountsInteractor;
        this.f183984c = recurringPaymentsContentFilter;
    }
}
