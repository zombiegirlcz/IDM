package ix5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import iw5.j;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoTradeFlowContract$InputData f169362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0h.a f169363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f169364c;
    public final d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f169365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f169366h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f169367j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f169368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f169369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f169370n;
    public final e4m.e o;

    public f(d dVar, x0h.a aVar, ViewController viewController, CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData, j jVar) {
        this.d = dVar;
        this.f169362a = cryptoTradeFlowContract$InputData;
        this.f169363b = aVar;
        this.f169364c = jVar;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.f = e4m.b.b(new iwb.b(dVar, this, 2, i));
        this.f169365g = e4m.b.b(new iwb.b(dVar, this, 1, i));
        this.f169366h = e4m.b.b(new iwb.b(dVar, this, 0, i));
        this.i = e4m.b.b(new iwb.b(dVar, this, 4, i));
        this.f169367j = e4m.b.b(new iwb.b(dVar, this, 6, i));
        this.k = e4m.b.b(new iwb.b(dVar, this, 5, i));
        this.f169368l = e4m.b.b(new iwb.b(dVar, this, 7, i));
        this.f169369m = e4m.b.b(new iwb.b(dVar, this, 8, i));
        this.f169370n = e4m.b.b(new iwb.b(dVar, this, 9, i));
        this.o = e4m.b.b(new iwb.b(dVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f169366h.get());
    }
}
