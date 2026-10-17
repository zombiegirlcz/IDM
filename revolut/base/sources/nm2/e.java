package nm2;

import android.content.Context;
import bn2.p;
import cm2.f;
import ekg.g;
import km2.i;
import km2.k;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements cm2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om2.e f217156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f217157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f217158c;
    public final rk0.c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f217159g;

    public e(om2.e eVar, nj0.a aVar, rk0.c cVar, Context context) {
        this.f217156a = eVar;
        this.f217157b = context;
        this.f217158c = aVar;
        this.d = cVar;
        int i = 15;
        this.e = e4m.b.b(new mva.a(this, 1, i));
        this.f = e4m.b.b(new mva.a(this, 2, i));
        this.f217159g = e4m.b.b(new mva.a(this, 0, i));
    }

    @Override // cm2.a
    public final cn2.a a() {
        return new cn2.a();
    }

    @Override // cm2.a
    public final f b() {
        return (f) this.f217159g.get();
    }

    @Override // cm2.a
    public final p c() {
        p pVarB = this.f217156a.b();
        s.j(pVarB);
        return pVarB;
    }

    @Override // cm2.a
    public final bn2.s d() {
        return new bn2.s((k) this.f217156a.f226504h.get());
    }

    public final bn2.f e() {
        om2.e eVar = this.f217156a;
        k kVar = (k) eVar.f226504h.get();
        i iVar = (i) eVar.k.get();
        ckg.a aVar = eVar.e;
        g gVarB = aVar.b();
        bn2.b bVar = new bn2.b();
        zk0.b bVarL = eVar.f226503g.l();
        s.j(bVarL);
        i90.b bVar2 = new i90.b();
        vjg.g gVarA = aVar.a();
        s.j(gVarA);
        return new bn2.f(kVar, iVar, gVarB, bVar, bVarL, bVar2, gVarA);
    }
}
