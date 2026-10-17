package gce;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc.d f142432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f142433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nhf.a f142434c;
    public final o71.a d;
    public final s71.c e;
    public final o7.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f142435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jt0.b f142436h;

    public m(uc.d recurringPaymentExtendedContentProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor, o71.a beneficiaryRepository, s71.c recurringPaymentsFilterProvider, o7.d subscriptionDetailsTotalSumProvider, r0 jointAccountsInteractor, jt0.b juniorAllowanceRecurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentExtendedContentProvider, "recurringPaymentExtendedContentProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(recurringPaymentsFilterProvider, "recurringPaymentsFilterProvider");
        Intrinsics.checkNotNullParameter(subscriptionDetailsTotalSumProvider, "subscriptionDetailsTotalSumProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowanceRecurringPaymentInteractor, "juniorAllowanceRecurringPaymentInteractor");
        this.f142432a = recurringPaymentExtendedContentProvider;
        this.f142433b = transactionsInteractor;
        this.f142434c = unitedWalletInteractor;
        this.d = beneficiaryRepository;
        this.e = recurringPaymentsFilterProvider;
        this.f = subscriptionDetailsTotalSumProvider;
        this.f142435g = jointAccountsInteractor;
        this.f142436h = juniorAllowanceRecurringPaymentInteractor;
    }
}
