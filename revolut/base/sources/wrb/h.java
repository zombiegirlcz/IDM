package wrb;

import aw0.n6;
import cli.y;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.stock.StockSellAllControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.e0;
import vkm.q;
import vrl.y0;
import wgb.v;
import wp5.w;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements dli.b {
    public final StockSellAllControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lal.a f299541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final prb.c f299542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f299543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f299544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f299545t;

    public h(StockSellAllControllerContract$InputData inputData, lal.a openPositionsInteractor, prb.c placeOrderRequestMapper, y0 tradingPlaceOrderInteractor, wj0.a idempotencyKeyHolder, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(openPositionsInteractor, "openPositionsInteractor");
        Intrinsics.checkNotNullParameter(placeOrderRequestMapper, "placeOrderRequestMapper");
        Intrinsics.checkNotNullParameter(tradingPlaceOrderInteractor, "tradingPlaceOrderInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f299541p = openPositionsInteractor;
        this.f299542q = placeOrderRequestMapper;
        this.f299543r = tradingPlaceOrderInteractor;
        this.f299544s = idempotencyKeyHolder;
        this.f299545t = mra.d.b(this, new c(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f299544s.a("ADVANCED_CHARTS_SELL_ALL_KEY");
    }

    public final void I2(n6 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.k;
        Continuation continuation = null;
        f fVar = obj2 instanceof f ? (f) obj2 : null;
        if (fVar == null) {
            return;
        }
        if (fVar.equals(d.f299537a)) {
            B2();
        } else {
            if (!(fVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new v(this, ((e) fVar).f299538a, continuation, 25), new yi5.b(26));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        StockSellAllControllerContract$InputData stockSellAllControllerContract$InputData = this.o;
        String securityRef = stockSellAllControllerContract$InputData.f83403a;
        String portfolioId = stockSellAllControllerContract$InputData.f83404b;
        lal.a aVar = this.f299541p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        ybl.d dVar = (ybl.d) aVar.f193426b;
        ybl.c cVar = ybl.d.Companion;
        l.b1(this, nim.a.v(boh.f.e(q.q(nim.a.v(((ael.y) dVar).f(3L, portfolioId), new nj8.b(securityRef, 14))), new e0(aVar, securityRef, 8)), new w(18)), null, new wka.e(this, null, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f299545t;
    }
}
