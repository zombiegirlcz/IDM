package tl9;

import kotlinx.coroutines.CoroutineScope;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f272025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ila.b f272026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f272027c;
    public final an0.c d;
    public final ite.a e;
    public final rg0.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xmg.a f272028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final he9.e f272029h;
    public final poi.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l70.e f272030j;
    public final c k = this;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f272031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f272032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f272033n;

    public c(poi.b bVar, l70.e eVar, ee0.a aVar, rg0.e eVar2, nj0.a aVar2, ite.a aVar3, he9.e eVar3, ila.b bVar2, an0.c cVar, xmg.a aVar4) {
        this.f272025a = aVar2;
        this.f272026b = bVar2;
        this.f272027c = aVar;
        this.d = cVar;
        this.e = aVar3;
        this.f = eVar2;
        this.f272028g = aVar4;
        this.f272029h = eVar3;
        this.i = bVar;
        this.f272030j = eVar;
        int i = 29;
        this.f272031l = e4m.b.b(new sac.a(this, 1, i));
        this.f272032m = e4m.b.b(new sac.a(this, 2, i));
        this.f272033n = e4m.b.b(new sac.a(this, 0, i));
    }

    public final ul9.g a() {
        ql9.d dVar = (ql9.d) this.f272033n.get();
        gte.a aVarB = this.e.b();
        s.j(aVarB);
        jla.h hVarA = this.f272026b.a();
        CoroutineScope coroutineScopeA = this.f.a();
        s.j(coroutineScopeA);
        return new ul9.g(dVar, aVarB, hVarA, coroutineScopeA);
    }
}
