package w4f;

import ael.t;
import kotlin.jvm.internal.Intrinsics;
import ybl.d;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f294563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f294564m;

    public b(d portfolioInteractor, t portfolioBalanceInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        this.f294563l = portfolioInteractor;
        this.f294564m = portfolioBalanceInteractor;
    }
}
