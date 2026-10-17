package vrl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prl.r f291674a;

    public s(prl.r tradingOrdersRepository) {
        Intrinsics.checkNotNullParameter(tradingOrdersRepository, "tradingOrdersRepository");
        this.f291674a = tradingOrdersRepository;
    }

    public final efm.r a(String portfolioId, String instrument, bfl.g side, k4l.q0 q0Var, Boolean bool, String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        prl.r rVar = this.f291674a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rVar.f.e(new prl.p(portfolioId, instrument, side, q0Var, bool, str), loadingStrategy);
    }
}
