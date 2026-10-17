package wif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.a f297892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f297893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tul.b f297894c;

    public d(a31.a commonTransactionDetailsRemoteProvider, a savingsInterestTransactionDetailsRemoteProvider, tul.b cryptoExchangeTransactionDetailsRemoteProvider) {
        Intrinsics.checkNotNullParameter(commonTransactionDetailsRemoteProvider, "commonTransactionDetailsRemoteProvider");
        Intrinsics.checkNotNullParameter(savingsInterestTransactionDetailsRemoteProvider, "savingsInterestTransactionDetailsRemoteProvider");
        Intrinsics.checkNotNullParameter(cryptoExchangeTransactionDetailsRemoteProvider, "cryptoExchangeTransactionDetailsRemoteProvider");
        this.f297892a = commonTransactionDetailsRemoteProvider;
        this.f297893b = savingsInterestTransactionDetailsRemoteProvider;
        this.f297894c = cryptoExchangeTransactionDetailsRemoteProvider;
    }
}
