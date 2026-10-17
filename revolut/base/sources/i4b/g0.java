package i4b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vrl.y0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 extends jki.g implements q {
    public final kge.d A;
    public final a4b.h B;
    public final ydf.b C;
    public final f2b.b D;
    public a2 E;
    public final n F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f158334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CfdOrderReviewScreenContract$InputData f158335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f158336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l4b.v f158337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t2b.f f158338t;
    public final o7.b u;
    public final vrl.s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ybl.l f158339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ang.f f158340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g5b.a f158341y;
    public final wj0.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(jki.p stateMapper, gte.a featureToggleInteractor, CfdOrderReviewScreenContract$InputData inputData, y0 placeOrderInteractor, l4b.v placeOrderRequestMapper, t2b.f fetchMarginQuotes, o7.b openPositionsDelegate, vrl.s orderLimitsByPortfolio, ybl.l tradingConfigInteractor, ang.f userInteractor, g5b.a exitStrategiesExtension, wj0.a idempotencyKeyHolder, kge.d cfdPositionsInteractor, a4b.h cfdOrderPositionsOutcomeProvider, ydf.b executionTimingInteractor, f2b.b cfdPerformanceTracker) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(placeOrderInteractor, "placeOrderInteractor");
        Intrinsics.checkNotNullParameter(placeOrderRequestMapper, "placeOrderRequestMapper");
        Intrinsics.checkNotNullParameter(fetchMarginQuotes, "fetchMarginQuotes");
        Intrinsics.checkNotNullParameter(openPositionsDelegate, "openPositionsDelegate");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolio, "orderLimitsByPortfolio");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(exitStrategiesExtension, "exitStrategiesExtension");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        Intrinsics.checkNotNullParameter(cfdOrderPositionsOutcomeProvider, "cfdOrderPositionsOutcomeProvider");
        Intrinsics.checkNotNullParameter(executionTimingInteractor, "executionTimingInteractor");
        Intrinsics.checkNotNullParameter(cfdPerformanceTracker, "cfdPerformanceTracker");
        this.f158334p = featureToggleInteractor;
        this.f158335q = inputData;
        this.f158336r = placeOrderInteractor;
        this.f158337s = placeOrderRequestMapper;
        this.f158338t = fetchMarginQuotes;
        this.u = openPositionsDelegate;
        this.v = orderLimitsByPortfolio;
        this.f158339w = tradingConfigInteractor;
        this.f158340x = userInteractor;
        this.f158341y = exitStrategiesExtension;
        this.z = idempotencyKeyHolder;
        this.A = cfdPositionsInteractor;
        this.B = cfdOrderPositionsOutcomeProvider;
        this.C = executionTimingInteractor;
        this.D = cfdPerformanceTracker;
        this.F = new n(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), inputData.f82280h, inputData.f82278c, inputData.f, inputData.f82279g, inputData.i, inputData.f82281j, null, null, null, null);
    }

    @Override // yji.l
    public final void I1() {
        this.z.a("IDEMPOTENCY_TAG_PLACE_MARGIN_ORDER");
    }

    @Override // yji.l
    public final void T1(long j2) {
        y2();
        CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData = this.f158335q;
        String str = cfdOrderReviewScreenContract$InputData.e;
        nel.n nVar = cfdOrderReviewScreenContract$InputData.f82278c;
        if (str == null) {
            yji.l.b1(this, rd0.e.b(this.v.a(cfdOrderReviewScreenContract$InputData.f82276a, nVar.f214596b, cfdOrderReviewScreenContract$InputData.f, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : w4l.i.f294643c)), null, new z(this, null, 4), 3);
        }
        int i = 0;
        if (cfdOrderReviewScreenContract$InputData.e == null) {
            yji.l.b1(this, boh.f.e(vkm.q.q(new g4b.a0(q2(), 23)), new v(this, i)), null, new z(this, null, 0), 3);
        }
        yji.l.b1(this, rd0.e.b(nim.a.w(this.f158340x.k(false), a0.f)), null, new z(this, null, 5), 3);
        String str2 = cfdOrderReviewScreenContract$InputData.f82276a;
        String str3 = nVar.f214596b;
        a4b.b bVar = a4b.c.Companion;
        yji.l.b1(this, this.u.o(str2, str3, w4l.h.f294642c), null, new z(this, null, 2), 3);
        if (!((jte.d) this.f158334p).c(TradingOrdersApi$Toggles.OrderReviewMarketTiming.f106793c) || u2b.c.d(((n) t2()).f158359c) == k4l.r0.RECURRING || u2b.c.d(((n) t2()).f158359c) == k4l.r0.MARKET) {
            x2(new i3k.h(8));
            return;
        }
        yji.l.b1(this, rd0.e.n(this.C.a(nVar.f214596b, nVar.k.a(), u2b.c.d(cfdOrderReviewScreenContract$InputData.f82280h), false), zhm.h0.f322473a), null, new z(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.F;
    }

    public final void y2() {
        a2 a2Var = this.E;
        if (a2Var != null) {
            a2Var.f(null);
        }
        CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData = this.f158335q;
        String str = cfdOrderReviewScreenContract$InputData.e;
        this.E = yji.l.b1(this, str != null ? nim.a.v(u0.m(boh.f.e(vkm.q.q(new g4b.a0(q2(), 24)), new v(this, 1)), kge.d.u(this.A, str, cfdOrderReviewScreenContract$InputData.f82276a)), new i3k.h(6)) : nim.a.v(u0.m(boh.f.e(vkm.q.q(new g4b.a0(q2(), 24)), new v(this, 1)), nim.a.v(vkm.q.q(new g4b.a0(q2(), 25)), new v(this, 2))), new i3k.h(7)), null, new z(this, null, 3), 3);
    }
}
