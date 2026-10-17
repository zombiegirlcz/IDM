package rtl;

import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f257314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f257315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.d f257316c;
    public final wsg.n d;
    public final tv5.b e;
    public final Lazy f;

    public c0(ybl.k tradingAccountsInteractor, ybl.b instrumentTickerInteractor, ybl.d portfolioInteractor, wsg.n walletInteractor, tv5.b currencyDiscoveryInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        this.f257314a = tradingAccountsInteractor;
        this.f257315b = instrumentTickerInteractor;
        this.f257316c = portfolioInteractor;
        this.d = walletInteractor;
        this.e = currencyDiscoveryInteractor;
        this.f = yhm.j.b(new y(this, 0));
    }

    public static boolean a(dj0.d dVar, fdf.b bVar) {
        int i = a0.f257312a[bVar.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return dVar.f(dj0.d.e);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean b(Set set, xi0.b bVar) {
        Set set2 = set;
        if (set2 == null || set2.isEmpty()) {
            return true;
        }
        return set.contains(bVar);
    }
}
