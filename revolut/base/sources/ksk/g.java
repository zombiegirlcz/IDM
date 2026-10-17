package ksk;

import ael.d0;
import k7c.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f189476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f189477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f189478n;
    public final c4h.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f189479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f189480q;

    public g(e inputData, d0 stocksInteractor, ybl.b instrumentTickerInteractor, c4h.c stockOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        this.f189476l = inputData;
        this.f189477m = stocksInteractor;
        this.f189478n = instrumentTickerInteractor;
        this.o = stockOnboardingInteractor;
        d dVar = new d(null);
        this.f189479p = dVar;
        this.f189480q = pyd.c.a(this, dVar);
    }

    @Override // yji.n
    public final void H2() {
        V2(new l0(this, null, 26), new yi5.b(29));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f189480q;
    }
}
