package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7d.i f297595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f297596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RentAndBillsManageLinkedPaymentsScreenContract$InputData f297597c;
    public final z d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f297598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f297599h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f297600j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f297601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f297602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f297603n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f297604p;

    public v(z zVar, ViewController viewController, RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData, i7d.i iVar) {
        this.d = zVar;
        this.f297595a = iVar;
        this.f297596b = viewController;
        this.f297597c = rentAndBillsManageLinkedPaymentsScreenContract$InputData;
        int i = 1;
        this.e = e4m.b.b(new t(zVar, this, 2, i));
        this.f = e4m.b.b(new t(zVar, this, 1, i));
        this.f297598g = e4m.b.b(new t(zVar, this, 0, i));
        this.f297599h = e4m.b.b(e4m.c.a(viewController));
        int i2 = 1;
        this.i = e4m.b.b(new t(zVar, this, 4, i2));
        this.f297600j = e4m.b.b(new t(zVar, this, 6, i2));
        this.k = e4m.b.b(new t(zVar, this, 5, i2));
        this.f297601l = e4m.b.b(new t(zVar, this, 7, i2));
        this.f297602m = e4m.b.b(new t(zVar, this, 3, i2));
        this.f297603n = e4m.b.b(new t(zVar, this, 8, i2));
        this.o = e4m.b.b(new t(zVar, this, 10, i2));
        this.f297604p = e4m.b.b(new t(zVar, this, 9, i2));
    }

    @Override // xki.e
    public final Set f() {
        i7d.o oVar = (i7d.o) this.f.get();
        h7d.e.a(oVar);
        return ImmutableSet.of((yji.n) oVar, (yji.n) this.f297603n.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        i7d.n nVar = (i7d.n) this.f297598g.get();
        h7d.c.a(nVar);
        return ImmutableSet.of((yji.d) nVar, (yji.d) this.f297602m.get());
    }
}
