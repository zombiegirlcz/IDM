package gae;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f142146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f142147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i9e.c f142148c;
    public final g d;
    public final whf.b e;
    public final s71.c f;

    public c(xua.a recurringPaymentInteractor, g state, i9e.c amountConverter, g subscriptionState, whf.b transactionsContentProvider, s71.c recurringPaymentsFilterProvider) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentsFilterProvider, "recurringPaymentsFilterProvider");
        this.f142146a = recurringPaymentInteractor;
        this.f142147b = state;
        this.f142148c = amountConverter;
        this.d = subscriptionState;
        this.e = transactionsContentProvider;
        this.f = recurringPaymentsFilterProvider;
    }
}
