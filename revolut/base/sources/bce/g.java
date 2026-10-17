package bce;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import qce.k;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.d f14441c;
    public final com.revolut.domain.interactors.transactions.a d;
    public final nhf.a e;
    public final o71.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s71.c f14442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o7.d f14443h;
    public final r0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jt0.b f14444j;

    public g(b detailsState, k actionsState, uc.d recurringPaymentExtendedContentProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor, o71.a beneficiaryRepository, s71.c recurringPaymentsFilterProvider, o7.d subscriptionDetailsTotalSumProvider, r0 jointAccountsInteractor, jt0.b juniorAllowanceRecurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(detailsState, "detailsState");
        Intrinsics.checkNotNullParameter(actionsState, "actionsState");
        Intrinsics.checkNotNullParameter(recurringPaymentExtendedContentProvider, "recurringPaymentExtendedContentProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(recurringPaymentsFilterProvider, "recurringPaymentsFilterProvider");
        Intrinsics.checkNotNullParameter(subscriptionDetailsTotalSumProvider, "subscriptionDetailsTotalSumProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowanceRecurringPaymentInteractor, "juniorAllowanceRecurringPaymentInteractor");
        this.f14439a = detailsState;
        this.f14440b = actionsState;
        this.f14441c = recurringPaymentExtendedContentProvider;
        this.d = transactionsInteractor;
        this.e = unitedWalletInteractor;
        this.f = beneficiaryRepository;
        this.f14442g = recurringPaymentsFilterProvider;
        this.f14443h = subscriptionDetailsTotalSumProvider;
        this.i = jointAccountsInteractor;
        this.f14444j = juniorAllowanceRecurringPaymentInteractor;
    }
}
