package tyh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f275608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeScreenContract$InputData f275609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f275610c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f275611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f275612h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f275613j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f275614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f275615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f275616n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f275617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f275618q;

    public d(b bVar, c cVar, ViewController viewController, CryptoExchangeScreenContract$InputData cryptoExchangeScreenContract$InputData) {
        this.f275610c = bVar;
        this.f275608a = viewController;
        this.f275609b = cryptoExchangeScreenContract$InputData;
        int i = 13;
        this.d = e4m.b.b(new tg5.h(bVar, this, 2, i));
        this.e = e4m.b.b(new tg5.h(bVar, this, 1, i));
        this.f = e4m.b.b(new tg5.h(bVar, this, 0, i));
        this.f275611g = e4m.b.b(e4m.c.a(viewController));
        int i2 = 13;
        this.f275612h = e4m.b.b(new tg5.h(bVar, this, 4, i2));
        this.i = e4m.b.b(new tg5.h(bVar, this, 3, i2));
        this.f275613j = e4m.b.b(new tg5.h(bVar, this, 6, i2));
        this.k = e4m.b.b(new tg5.h(bVar, this, 5, i2));
        this.f275614l = e4m.b.b(new tg5.h(bVar, this, 11, i2));
        this.f275615m = e4m.b.b(new tg5.h(bVar, this, 10, i2));
        this.f275616n = e4m.b.b(new tg5.h(bVar, this, 9, i2));
        this.o = e4m.b.b(new tg5.h(bVar, this, 8, i2));
        this.f275617p = e4m.b.b(new tg5.h(bVar, this, 7, i2));
        this.f275618q = e4m.b.b(new tg5.h(bVar, this, 12, i2));
    }

    public final czh.b b() {
        b bVar = this.f275610c;
        m2j.j jVarC = bVar.k.c();
        gte.a aVarB = bVar.f275592l.b();
        s.j(aVarB);
        eub.a aVarA = bVar.f275593m.a();
        s.j(aVarA);
        return new czh.b(jVarC, aVarB, aVarA);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f275618q.get(), (n) this.o.get(), (n) this.f275615m.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get(), (yji.d) this.k.get(), (yji.d) this.f275617p.get());
    }
}
