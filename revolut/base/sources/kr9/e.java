package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f188716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f188717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f188718c;
    public final e4m.e d;
    public final e4m.e e;
    public final jqa.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f188719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jqa.h f188720h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f188721j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f188722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f188723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f188724n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f188725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f188726q;

    public e(l lVar, ViewController viewController) {
        this.f188717b = lVar;
        this.f188716a = viewController;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f188718c = cVarA;
        this.d = e4m.b.b(cVarA);
        int i = 28;
        this.e = e4m.b.b(new jqa.h(lVar, this, 2, i));
        this.f = new jqa.h(lVar, this, 3, i);
        this.f188719g = e4m.b.b(new jqa.h(lVar, this, 4, i));
        this.f188720h = new jqa.h(lVar, this, 5, i);
        this.i = e4m.b.b(new jqa.h(lVar, this, 6, i));
        this.f188721j = e4m.b.b(this.f188718c);
        this.k = e4m.b.b(new jqa.h(lVar, this, 7, i));
        this.f188722l = e4m.b.b(new jqa.h(lVar, this, 1, i));
        this.f188723m = e4m.b.b(new jqa.h(lVar, this, 0, i));
        this.f188724n = e4m.b.b(new jqa.h(lVar, this, 8, i));
        this.o = e4m.b.b(new jqa.h(lVar, this, 10, i));
        this.f188725p = e4m.b.b(new jqa.h(lVar, this, 11, i));
        this.f188726q = e4m.b.b(new jqa.h(lVar, this, 9, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f188717b.f188760h;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f188717b.f188760h;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f188719g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f188724n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f188723m.get());
    }
}
