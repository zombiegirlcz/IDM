package ael;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xbl.c f3604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xbl.a f3605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vdl.x0 f3606c;

    public d0(xbl.c instrumentTickerRepository, xbl.a instrumentDetailsRepository, vdl.x0 stockExchangeRepository) {
        Intrinsics.checkNotNullParameter(instrumentTickerRepository, "instrumentTickerRepository");
        Intrinsics.checkNotNullParameter(instrumentDetailsRepository, "instrumentDetailsRepository");
        Intrinsics.checkNotNullParameter(stockExchangeRepository, "stockExchangeRepository");
        this.f3604a = instrumentTickerRepository;
        this.f3605b = instrumentDetailsRepository;
        this.f3606c = stockExchangeRepository;
    }

    public final efm.r a(String ref2, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        vdl.o oVar = (vdl.o) this.f3605b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        return oVar.f288019n.f(ref2, z);
    }
}
