package c4h;

import ael.q;
import kge.d;
import kotlin.jvm.internal.Intrinsics;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f21297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.b f21299c;
    public final ybl.d d;
    public final l e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f2b.b f21300g;

    public b(d cfdPositionsInteractor, k tradingAccountsInteractor, ybl.b instrumentTickerInteractor, ybl.d portfolioInteractor, l tradingConfigInteractor, q pnlInteractor, f2b.b cfdPerformanceTracker) {
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(pnlInteractor, "pnlInteractor");
        Intrinsics.checkNotNullParameter(cfdPerformanceTracker, "cfdPerformanceTracker");
        this.f21297a = cfdPositionsInteractor;
        this.f21298b = tradingAccountsInteractor;
        this.f21299c = instrumentTickerInteractor;
        this.d = portfolioInteractor;
        this.e = tradingConfigInteractor;
        this.f = pnlInteractor;
        this.f21300g = cfdPerformanceTracker;
    }
}
