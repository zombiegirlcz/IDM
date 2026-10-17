package wmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f298673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.f f298674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f298675c;
    public final df0.b d;
    public final h e;

    public i(ybl.b instrumentTickerInteractor, zjh.f ipoInstrumentInteractor, gte.a featureToggleInteractor, df0.b syncedDateProvider, h ipoSpotlightInstrumentComparator) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(ipoInstrumentInteractor, "ipoInstrumentInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        Intrinsics.checkNotNullParameter(ipoSpotlightInstrumentComparator, "ipoSpotlightInstrumentComparator");
        this.f298673a = instrumentTickerInteractor;
        this.f298674b = ipoInstrumentInteractor;
        this.f298675c = featureToggleInteractor;
        this.d = syncedDateProvider;
        this.e = ipoSpotlightInstrumentComparator;
    }
}
