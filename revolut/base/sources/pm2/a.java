package pm2;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import rm2.i;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f237446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f237447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f237448c;
    public final e4m.c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pa6.f f237449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f237450h;
    public final pa6.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f237451j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f237452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f237453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f237454n;
    public final e4m.e o;

    public a(c cVar, b bVar, ViewController viewController, i iVar) {
        this.f237447b = cVar;
        this.f237448c = bVar;
        this.f237446a = iVar;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 15;
        this.f = e4m.b.b(new pa6.f(cVar, this, 2, i));
        this.f237449g = new pa6.f(cVar, this, 3, i);
        this.f237450h = e4m.b.b(new pa6.f(cVar, this, 4, i));
        this.i = new pa6.f(cVar, this, 5, i);
        this.f237451j = e4m.b.b(new pa6.f(cVar, this, 6, i));
        this.k = e4m.b.b(this.d);
        this.f237452l = e4m.b.b(new pa6.f(cVar, this, 7, i));
        this.f237453m = e4m.b.b(new pa6.f(cVar, this, 1, i));
        this.f237454n = e4m.b.b(new pa6.f(cVar, this, 0, i));
        this.o = e4m.b.b(new pa6.f(cVar, this, 8, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f237447b.f;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f237447b.f;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.f237450h.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f237454n.get());
    }
}
