package v4e;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends m {

    @NotNull
    private static final y Companion = new y();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f286043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ael.d0 f286044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f286045n;
    public final zhl.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yhl.d f286046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l80.e f286047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vki.a f286048r;

    public f0(q inputData, ael.d0 stocksInteractor, ybl.b instrumentTickerInteractor, zhl.k historicalPricesInteractor, yhl.d corporateEventsInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(historicalPricesInteractor, "historicalPricesInteractor");
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f286043l = inputData;
        this.f286044m = stocksInteractor;
        this.f286045n = instrumentTickerInteractor;
        this.o = historicalPricesInteractor;
        this.f286046p = corporateEventsInteractor;
        this.f286047q = dateProvider;
        this.f286048r = pyd.c.a(this, new p(0));
    }

    @Override // yji.n
    public final void H2() {
        q qVar = this.f286043l;
        yji.n.l2(this, nim.a.v(rd0.e.b(this.f286044m.a(qVar.f286060a, false)), new v2g.i(18)), null, new b0(this, null), 3);
        yji.n.l2(this, rd0.e.b(((ael.k) this.f286045n).f(qVar.f286060a)), null, new c0(this, null), 3);
        v2g.i iVar = new v2g.i(19);
        vki.a aVar = this.f286048r;
        yji.n.l2(this, vkm.q.Q(new t0(aVar.B(iVar), 1), new uec.d((Continuation) null, this, 16)), null, new d0(this, null), 3);
        yji.n.l2(this, boh.f.e(new t0(aVar.B(new v2g.i(20)), 1), new v25.k(this, 8)), null, new e0(this, null), 3);
        V2(new a0(this, null), new yi5.b(29));
    }

    @Override // v4e.m
    public final void Z2(k chartId) {
        Intrinsics.checkNotNullParameter(chartId, "chartId");
        X2(this.f286048r, new v25.k(chartId, 7));
    }

    @Override // v4e.m
    public final void b3(TrendViewDelegate.a trendViewState) {
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        X2(this.f286048r, new g6f.k(trendViewState, 4));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f286048r;
    }
}
