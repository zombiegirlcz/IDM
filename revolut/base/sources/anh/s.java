package anh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.q f7800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f7801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.l f7802c;

    public s(r10.q collectionsAssetListInstrumentProvider, ybl.k tradingAccountsInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(collectionsAssetListInstrumentProvider, "collectionsAssetListInstrumentProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f7800a = collectionsAssetListInstrumentProvider;
        this.f7801b = tradingAccountsInteractor;
        this.f7802c = tradingConfigInteractor;
    }
}
