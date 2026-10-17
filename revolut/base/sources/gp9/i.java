package gp9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.e0;
import java.util.Set;
import t80.x;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillInputData f145380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f145381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f145382c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f145383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f145384h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f145385j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0 f145386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f145387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f145388n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f145389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f145390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f145391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f145392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f145393t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f145394w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f145395x;

    public i(d dVar, ViewController viewController, SplitBillInputData splitBillInputData) {
        this.f145381b = dVar;
        this.f145380a = splitBillInputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f145382c = cVarA;
        this.d = e4m.b.b(cVarA);
        int i = 19;
        this.e = e4m.b.b(new e0(dVar, this, 2, i));
        this.f = e4m.b.b(new e0(dVar, this, 1, i));
        this.f145383g = e4m.b.b(new e0(dVar, this, 0, i));
        this.f145384h = e4m.b.b(new e0(dVar, this, 4, i));
        this.i = e4m.b.b(new e0(dVar, this, 3, i));
        this.f145385j = new e0(dVar, this, 7, i);
        this.k = e4m.b.b(new e0(dVar, this, 8, i));
        this.f145386l = new e0(dVar, this, 9, i);
        this.f145387m = e4m.b.b(new e0(dVar, this, 10, i));
        this.f145388n = e4m.b.b(this.f145382c);
        this.o = e4m.b.b(new e0(dVar, this, 11, i));
        this.f145389p = e4m.b.b(new e0(dVar, this, 6, i));
        this.f145390q = e4m.b.b(new e0(dVar, this, 5, i));
        this.f145391r = e4m.b.b(new e0(dVar, this, 13, i));
        this.f145392s = e4m.b.b(new e0(dVar, this, 12, i));
        this.f145393t = e4m.b.b(new e0(dVar, this, 14, i));
        this.u = e4m.g.a(new e0(dVar, this, 17, i));
        this.v = e4m.b.b(new e0(dVar, this, 16, i));
        this.f145394w = e4m.b.b(new e0(dVar, this, 15, i));
        this.f145395x = e4m.g.a(new e0(dVar, this, 18, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f145381b.f145357g;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f145381b.f145357g;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.k.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f145392s.get(), (n) this.f145393t.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f145383g.get(), (yji.d) this.i.get(), (yji.d) this.f145390q.get());
    }

    public final x j() {
        f80.a aVarX = this.f145381b.f145357g.x();
        s.j(aVarX);
        return new x(aVarX, new i90.b());
    }
}
