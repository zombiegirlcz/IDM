package osa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lra.d f229289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zpa.a f229290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.b f229291c;
    public final r10.a d;

    public b(lra.d interactor, zpa.a paymentsSettingsInteractor, whf.b transactionsListContentProvider, r10.a recipientAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(paymentsSettingsInteractor, "paymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        Intrinsics.checkNotNullParameter(recipientAnalyticsInteractor, "recipientAnalyticsInteractor");
        this.f229289a = interactor;
        this.f229290b = paymentsSettingsInteractor;
        this.f229291c = transactionsListContentProvider;
        this.d = recipientAnalyticsInteractor;
    }
}
