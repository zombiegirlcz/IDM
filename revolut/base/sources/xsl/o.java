package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$InputData;
import java.util.Set;
import xf6.t1;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TargetPriceScreenContract$InputData f308683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oul.j f308684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f308685c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f308686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f308687h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f308688j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f308689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f308690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f308691n;

    public o(p pVar, ViewController viewController, TargetPriceScreenContract$InputData targetPriceScreenContract$InputData, oul.j jVar) {
        this.f308685c = pVar;
        this.f308683a = targetPriceScreenContract$InputData;
        this.f308684b = jVar;
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new t1(pVar, this, 2, 29));
        this.f = e4m.b.b(new t1(pVar, this, 1, 29));
        this.f308686g = e4m.b.b(new t1(pVar, this, 0, 29));
        this.f308687h = e4m.b.b(new t1(pVar, this, 4, 29));
        this.i = e4m.b.b(new t1(pVar, this, 3, 29));
        this.f308688j = e4m.b.b(new t1(pVar, this, 7, 29));
        this.k = e4m.b.b(new t1(pVar, this, 6, 29));
        this.f308689l = e4m.b.b(new t1(pVar, this, 8, 29));
        this.f308690m = e4m.b.b(new t1(pVar, this, 9, 29));
        this.f308691n = e4m.b.b(new t1(pVar, this, 5, 29));
    }

    public final ogm.i b() {
        l4i.a aVar = new l4i.a();
        p2b.c cVarE = this.f308685c.I.e();
        vc.s.j(cVarE);
        return new ogm.i(aVar, cVarE);
    }

    public final f7j.p c() {
        return new f7j.p(new l4i.a(), 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f308686g.get(), (yji.d) this.i.get());
    }
}
