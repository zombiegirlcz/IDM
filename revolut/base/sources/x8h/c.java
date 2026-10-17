package x8h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements efm.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.wealth.impl.data.repositories.a f303327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f303328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv5.b f303329c;

    public c(com.revolut.feature.wealth.impl.data.repositories.a collectionsRepository, ybl.b instrumentTickerInteractor, tv5.b currenciesInteractor) {
        Intrinsics.checkNotNullParameter(collectionsRepository, "collectionsRepository");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(currenciesInteractor, "currenciesInteractor");
        this.f303327a = collectionsRepository;
        this.f303328b = instrumentTickerInteractor;
        this.f303329c = currenciesInteractor;
    }

    @Override // efm.x
    public final efm.w apply(efm.r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return pd.b.r(upstream, new x0b.c(this, 27));
    }
}
