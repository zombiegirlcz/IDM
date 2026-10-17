package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f307372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wzi.a f307373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f307374c;
    public final whf.b d;

    public a1(wsg.n walletInteractor, wzi.a incomeSorterInteractor, gte.a featureToggleInteractor, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f307372a = walletInteractor;
        this.f307373b = incomeSorterInteractor;
        this.f307374c = featureToggleInteractor;
        this.d = transactionsContentProvider;
    }
}
