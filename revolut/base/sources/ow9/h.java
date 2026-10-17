package ow9;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ove.w;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f230377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.c f230378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230379c;
    public final e4m.e d;
    public final w e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f230380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230381h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f230382j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f230383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f230384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f230385n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f230386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f230387q;

    public h(e eVar, ViewController viewController) {
        this.f230377a = eVar;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f230378b = cVarA;
        this.f230379c = e4m.b.b(cVarA);
        int i = 5;
        this.d = e4m.b.b(new w(eVar, this, 2, i));
        this.e = new w(eVar, this, 3, i);
        this.f = e4m.b.b(new w(eVar, this, 4, i));
        this.f230380g = new w(eVar, this, 5, i);
        this.f230381h = e4m.b.b(new w(eVar, this, 6, i));
        this.i = e4m.b.b(this.f230378b);
        this.f230382j = e4m.b.b(new w(eVar, this, 7, i));
        this.k = e4m.b.b(new w(eVar, this, 1, i));
        this.f230383l = e4m.b.b(new w(eVar, this, 0, i));
        this.f230384m = e4m.b.b(new w(eVar, this, 8, i));
        this.f230385n = e4m.b.b(new w(eVar, this, 12, i));
        this.o = e4m.b.b(new w(eVar, this, 11, i));
        this.f230386p = e4m.b.b(new w(eVar, this, 10, i));
        this.f230387q = e4m.b.b(new w(eVar, this, 9, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f230377a.f230341a;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f230377a.f230341a;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.f.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f230384m.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f230383l.get());
    }
}
