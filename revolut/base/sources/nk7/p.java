package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceExpenseDetailsScreenContract$InputData f216705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f216707c;
    public final e4m.e d;
    public final k e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f216708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f216709h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f216710j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f216711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f216712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f216713n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f216714p;

    public p(q qVar, j jVar, ViewController viewController, CFACInsuranceExpenseDetailsScreenContract$InputData cFACInsuranceExpenseDetailsScreenContract$InputData) {
        this.f216706b = qVar;
        this.f216705a = cFACInsuranceExpenseDetailsScreenContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f216707c = cVarA;
        this.d = e4m.b.b(cVarA);
        int i = 4;
        this.e = new k(qVar, this, 2, i);
        this.f = e4m.b.b(new k(qVar, this, 3, i));
        this.f216708g = new k(qVar, this, 4, i);
        this.f216709h = e4m.b.b(new k(qVar, this, 5, i));
        this.i = e4m.b.b(this.f216707c);
        this.f216710j = e4m.b.b(new k(qVar, this, 6, i));
        this.k = e4m.b.b(new k(qVar, this, 1, i));
        this.f216711l = e4m.b.b(new k(qVar, this, 0, i));
        this.f216712m = e4m.b.b(new k(qVar, this, 8, i));
        this.f216713n = e4m.b.b(new k(qVar, this, 7, i));
        this.o = e4m.b.b(new k(qVar, this, 9, i));
        this.f216714p = e4m.b.b(new k(qVar, this, 10, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f216706b.d;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f216706b.d;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f216711l.get(), (yji.d) this.f216713n.get());
    }

    public final t80.x j() {
        f80.a aVarX = this.f216706b.d.x();
        vc.s.j(aVarX);
        return new t80.x(aVarX, new i90.b());
    }
}
