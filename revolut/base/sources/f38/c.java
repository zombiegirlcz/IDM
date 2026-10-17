package f38;

import ael.h0;
import akg.n;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import ybl.i;
import ybl.l;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f131914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f131915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f131916c;
    public final gte.a d;
    public volatile CombinedWatchlistContext e;

    public c(m wealthAccountsInteractor, i productGroupAvailabilityInteractor, l tradingConfigInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f131914a = wealthAccountsInteractor;
        this.f131915b = productGroupAvailabilityInteractor;
        this.f131916c = tradingConfigInteractor;
        this.d = featureToggleInteractor;
    }

    public final n a() {
        return nim.a.v(u0.i(m.c(this.f131914a, null, null, 3), ((h0) this.f131915b).d(), l.d(this.f131916c)), new f0m.c(this, 6));
    }
}
