package ael;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdl.r f3616a;

    public h(vdl.r instrumentStatsRepository) {
        Intrinsics.checkNotNullParameter(instrumentStatsRepository, "instrumentStatsRepository");
        this.f3616a = instrumentStatsRepository;
    }

    public final akg.n a(nel.n instrument, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vdl.r rVar = this.f3616a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(rVar.f.b(zhm.y0.b(instrument), loadingStrategy), new vch.h0(15));
    }
}
