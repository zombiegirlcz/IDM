package ftk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qrk.c f138034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f138035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0h.d f138036c;
    public final ybl.k d;
    public final ybl.l e;

    public d(qrk.c insightsInteractor, ybl.b tickerInteractor, z0h.d wealthDisclaimersDataProvider, ybl.k tradingAccountsInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(insightsInteractor, "insightsInteractor");
        Intrinsics.checkNotNullParameter(tickerInteractor, "tickerInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDataProvider, "wealthDisclaimersDataProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f138034a = insightsInteractor;
        this.f138035b = tickerInteractor;
        this.f138036c = wealthDisclaimersDataProvider;
        this.d = tradingAccountsInteractor;
        this.e = tradingConfigInteractor;
    }
}
