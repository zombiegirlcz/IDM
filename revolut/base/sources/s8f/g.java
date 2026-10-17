package s8f;

import cli.y;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.ManagedPortfoliosTopHoldingsControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import x5f.q;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends oki.h implements dli.b {
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ManagedPortfoliosTopHoldingsControllerContract$InputData f260987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f260988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f260989r;

    public g(q interactor, ManagedPortfoliosTopHoldingsControllerContract$InputData inputData, com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f260987p = inputData;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f260988q = z1VarB;
        this.f260989r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, vkm.q.Q(this.f260988q, new r3k.c(continuation, this, 29)), null, new s56.i(this, continuation, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f260989r;
    }
}
