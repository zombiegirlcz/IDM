package uyh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czh.k f284353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f284354b;

    public b1(czh.k fallbackCurrencyProvider, a1 cryptoOrderDraftMutator) {
        Intrinsics.checkNotNullParameter(fallbackCurrencyProvider, "fallbackCurrencyProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderDraftMutator, "cryptoOrderDraftMutator");
        this.f284353a = fallbackCurrencyProvider;
        this.f284354b = cryptoOrderDraftMutator;
    }
}
