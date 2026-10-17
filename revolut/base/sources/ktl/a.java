package ktl;

import htl.f;
import htl.k;
import ltl.h;
import ltl.j;
import ltl.l;
import r10.q;
import vc.s;
import vrl.g;
import yd9.e;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trl.a f189569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae9.a f189570b;

    public a(trl.a aVar, ae9.a aVar2, h9h.a aVar3) {
        this.f189569a = aVar;
        this.f189570b = aVar2;
    }

    public final f a() {
        return ka1.c.j(b());
    }

    public final q b() {
        trl.a aVar = this.f189569a;
        l lVar = new l(new nbh.a(), aVar.k());
        e eVarA = this.f189570b.a();
        htl.a aVar2 = (htl.a) aVar.c0.get();
        s.j(aVar2);
        k kVar = new k(lVar, new ltl.b(eVarA, aVar2, aVar.k()), new ltl.f(aVar.k()), new ltl.d(new nbh.a(), aVar.k()), new h(new nbh.a(), aVar.k()), new j(new nbh.a(), aVar.k()));
        htl.l lVar2 = new htl.l();
        g gVarB = aVar.b();
        s.j(gVarB);
        return new q(kVar, lVar2, gVarB);
    }
}
