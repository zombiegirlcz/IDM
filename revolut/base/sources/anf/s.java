package anf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nhf.a f7752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f7753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.l f7754c;
    public final thf.i d;
    public final d3j.b e;
    public final y45.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ar3.c f7755g;

    public s(nhf.a unitedWalletInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, thf.l swipeToActionMapper, thf.i selectableMapper, d3j.b beneficiariesInteractor, y45.h loanProductFeatureTogglesInteractor, ar3.c multiCurrencyMoneyInteractor) {
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(swipeToActionMapper, "swipeToActionMapper");
        Intrinsics.checkNotNullParameter(selectableMapper, "selectableMapper");
        Intrinsics.checkNotNullParameter(beneficiariesInteractor, "beneficiariesInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(multiCurrencyMoneyInteractor, "multiCurrencyMoneyInteractor");
        this.f7752a = unitedWalletInteractor;
        this.f7753b = transactionsInteractor;
        this.f7754c = swipeToActionMapper;
        this.d = selectableMapper;
        this.e = beneficiariesInteractor;
        this.f = loanProductFeatureTogglesInteractor;
        this.f7755g = multiCurrencyMoneyInteractor;
    }
}
