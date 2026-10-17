package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class y0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f4528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimSubscriptionsScreenContract$InputData f4529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4530c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f4532h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f4533j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f4534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f4535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f4536n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f4537p;

    public y0(b bVar, m mVar, ViewController viewController, EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData, mkd.g gVar) {
        this.f4530c = bVar;
        this.f4528a = gVar;
        this.f4529b = esimSubscriptionsScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.e = e4m.b.b(new d(bVar, mVar, this, 2, i));
        this.f = e4m.b.b(new d(bVar, mVar, this, 1, i));
        this.f4531g = e4m.b.b(new d(bVar, mVar, this, 0, i));
        this.f4532h = e4m.b.b(new d(bVar, mVar, this, 4, i));
        this.i = e4m.b.b(new d(bVar, mVar, this, 3, i));
        this.f4533j = e4m.b.b(new d(bVar, mVar, this, 5, i));
        this.k = e4m.b.b(new d(bVar, mVar, this, 6, i));
        this.f4534l = e4m.b.b(new d(bVar, mVar, this, 7, i));
        this.f4535m = e4m.b.b(new d(bVar, mVar, this, 8, i));
        this.f4536n = e4m.b.b(new d(bVar, mVar, this, 9, i));
        this.o = e4m.b.b(new d(bVar, mVar, this, 11, i));
        this.f4537p = e4m.b.b(new d(bVar, mVar, this, 10, i));
    }

    public final tb4.t b() {
        dm0.d dVarD = this.f4530c.f4144m.d();
        vc.s.j(dVarD);
        return new tb4.t(dVarD);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get(), (yji.n) this.f4533j.get(), (yji.n) this.k.get(), (yji.n) this.f4534l.get(), (yji.n) this.f4535m.get(), (yji.n) this.f4536n.get(), new yji.n[0]);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f4531g.get());
    }
}
