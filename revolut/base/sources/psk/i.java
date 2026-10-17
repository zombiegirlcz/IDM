package psk;

import ael.d0;
import com.revolut.retail.feature.stockdetails.api.navigation.InstrumentAttrsFeatureConfig$InstrumentAttrsDestination;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import pe2.l;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f239505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f239506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f239507n;
    public final c4h.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f239508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f239509q;

    public i(f inputData, d0 stocksInteractor, ybl.b instrumentTickerInteractor, c4h.c stockOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        this.f239505l = inputData;
        this.f239506m = stocksInteractor;
        this.f239507n = instrumentTickerInteractor;
        this.o = stockOnboardingInteractor;
        e eVar = new e(null, null);
        this.f239508p = eVar;
        this.f239509q = pyd.c.a(this, eVar);
    }

    @Override // yji.n
    public final void H2() {
        V2(new l(this, null, 22), new yi5.b(29));
    }

    @Override // psk.b
    public final void Z2(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        A2(new InstrumentAttrsFeatureConfig$InstrumentAttrsDestination(instrument));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f239509q;
    }
}
