package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements xki.c, y32.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g12.l f231659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f231660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f231661c = this;
    public final e4m.c d;
    public final e4m.e e;
    public final ove.w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ove.w f231663h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f231664j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f231665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f231666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f231667n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f231668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f231669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f231670r;

    public g(d dVar, ViewController viewController, g12.l lVar) {
        this.f231660b = dVar;
        this.f231659a = lVar;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 19;
        this.f = new ove.w(dVar, this, 2, i);
        this.f231662g = e4m.b.b(new ove.w(dVar, this, 3, i));
        this.f231663h = new ove.w(dVar, this, 4, i);
        this.i = e4m.b.b(new ove.w(dVar, this, 5, i));
        this.f231664j = e4m.b.b(this.d);
        this.k = e4m.b.b(new ove.w(dVar, this, 6, i));
        this.f231665l = e4m.b.b(new ove.w(dVar, this, 1, i));
        this.f231666m = e4m.b.b(new ove.w(dVar, this, 0, i));
        this.f231667n = e4m.b.b(new ove.w(dVar, this, 7, i));
        this.o = e4m.b.b(new ove.w(dVar, this, 8, i));
        this.f231668p = e4m.b.b(new ove.w(dVar, this, 9, i));
        this.f231669q = e4m.b.b(new ove.w(dVar, this, 10, i));
        this.f231670r = e4m.b.b(new ove.w(dVar, this, 11, i));
    }

    @Override // y32.a
    public final j b() {
        return new j(this.f231660b, this.f231661c, 0);
    }

    public final t80.b c() {
        l70.e eVar = this.f231660b.f231629a;
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        return new t80.b(aVarX, eVarH, bVarL);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f231667n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f231666m.get());
    }

    public final u96.b j() {
        l70.e eVar = this.f231660b.f231629a;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e q() {
        l70.e eVar = this.f231660b.f231629a;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f231662g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }
}
