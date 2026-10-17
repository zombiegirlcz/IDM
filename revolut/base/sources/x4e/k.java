package x4e;

import ael.d0;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f302869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f302870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f302871n;
    public final vki.a o;

    public k(e inputData, d0 stocksInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f302869l = inputData;
        this.f302870m = stocksInteractor;
        this.f302871n = instrumentTickerInteractor;
        this.o = pyd.c.a(this, new d(null, null, null));
    }

    @Override // yji.n
    public final void H2() {
        e eVar = this.f302869l;
        n.l2(this, nim.a.v(rd0.e.b(this.f302870m.a(eVar.f302866a, false)), new x29.a(17)), null, new i(this, null), 3);
        n.l2(this, rd0.e.b(((ael.k) this.f302871n).f(eVar.f302866a)), null, new j(this, null), 3);
    }

    @Override // x4e.b
    public final void Z2(TrendViewDelegate.a trendState) {
        Intrinsics.checkNotNullParameter(trendState, "trendState");
        X2(this.o, new g6f.k(trendState, 5));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
