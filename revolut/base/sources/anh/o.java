package anh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oih.j f7793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g9h.c f7794m;

    public o(oih.j stocksAccountCommandProvider, g9h.c assetDetailsNotAvailableProvider) {
        Intrinsics.checkNotNullParameter(stocksAccountCommandProvider, "stocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
        this.f7793l = stocksAccountCommandProvider;
        this.f7794m = assetDetailsNotAvailableProvider;
    }
}
