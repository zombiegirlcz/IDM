package us2;

import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collections;
import java.util.Set;
import jt2.m;
import jt2.o;
import jt2.q;
import jt2.w;
import n5j.k;
import ufg.k0;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f282405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282407c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public i(j jVar, h hVar, ViewController viewController) {
        this.f282405a = jVar;
        this.f282406b = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.f282407c = e4m.b.b(new k0(jVar, this, 1, i));
        this.d = e4m.b.b(new k0(jVar, this, 2, i));
        this.e = e4m.b.b(new k0(jVar, this, 3, i));
        this.f = e4m.b.b(new k0(jVar, this, 0, i));
    }

    public final jt2.g b() {
        j jVar = this.f282405a;
        jt2.i iVar = new jt2.i((ws2.a) jVar.f282413j.get(), (ws2.g) jVar.k.get());
        ws2.g gVar = (ws2.g) jVar.k.get();
        k5j.c cVar = jVar.f282408a;
        vu.g gVarA = cVar.a();
        s.j(gVarA);
        q qVar = new q(gVar, gVarA);
        vu.g gVarA2 = cVar.a();
        s.j(gVarA2);
        m mVar = new m(gVarA2);
        jt2.i iVar2 = new jt2.i((ws2.a) jVar.f282413j.get(), (ws2.g) jVar.k.get());
        ws2.a aVar = (ws2.a) jVar.f282413j.get();
        vu.g gVarA3 = cVar.a();
        s.j(gVarA3);
        jt2.b bVar = new jt2.b(iVar2, aVar, gVarA3);
        vu.g gVarA4 = cVar.a();
        s.j(gVarA4);
        jt2.f fVar = new jt2.f(gVarA4);
        vu.g gVarA5 = cVar.a();
        s.j(gVarA5);
        jt2.s sVar = new jt2.s(gVarA5);
        vu.g gVarA6 = cVar.a();
        s.j(gVarA6);
        ws2.f fVar2 = new ws2.f(gVarA6);
        vu.g gVarA7 = cVar.a();
        s.j(gVarA7);
        k kVar = (k) cVar.f181522l.get();
        s.j(kVar);
        o oVar = new o(fVar2, gVarA7, kVar);
        vu.c cVar2 = (vu.c) cVar.k.get();
        s.j(cVar2);
        vu.b bVar2 = (vu.b) cVar.f.get();
        s.j(bVar2);
        vu.g gVarA8 = cVar.a();
        s.j(gVarA8);
        w wVar = new w(bVar2, gVarA8);
        vu.g gVarA9 = cVar.a();
        s.j(gVarA9);
        return new jt2.g(iVar, qVar, mVar, bVar, fVar, sVar, oVar, cVar2, wVar, new jt2.k(gVarA9));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
