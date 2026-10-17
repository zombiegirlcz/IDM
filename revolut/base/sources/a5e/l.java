package a5e;

import ael.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f1373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f1374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f1375n;
    public final vki.a o;

    public l(g inputData, d0 stocksInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f1373l = inputData;
        this.f1374m = stocksInteractor;
        this.f1375n = instrumentTickerInteractor;
        this.o = pyd.c.a(this, new f(null, null));
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, nim.a.v(rd0.e.b(this.f1374m.a(this.f1373l.f1368a, false)), new a35.b(28)), null, new j(this, null, 0), 3);
        yji.n.l2(this, nim.a.v(q.Q(new a35.d(this.o.B(new a35.b(26)), 3), new a0e.m((Continuation) null, this, 6)), new a35.b(27)), null, new j(this, null, 1), 3);
    }

    @Override // a5e.b
    public final void Z2(d page) {
        Intrinsics.checkNotNullParameter(page, "page");
        X2(this.o, new a0.c(page, 23));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
