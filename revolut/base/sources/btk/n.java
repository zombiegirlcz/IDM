package btk;

import kotlin.jvm.internal.Intrinsics;
import ybl.q;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f18645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrl.g f18646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nil.c f18647c;
    public final q d;

    public n(ybl.b instrumentTickerInteractor, vrl.g investOrdersInteractor, nil.c tradingProjectionsInteractor, q wealthInstrumentStateDetailsInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(tradingProjectionsInteractor, "tradingProjectionsInteractor");
        Intrinsics.checkNotNullParameter(wealthInstrumentStateDetailsInteractor, "wealthInstrumentStateDetailsInteractor");
        this.f18645a = instrumentTickerInteractor;
        this.f18646b = investOrdersInteractor;
        this.f18647c = tradingProjectionsInteractor;
        this.d = wealthInstrumentStateDetailsInteractor;
    }
}
