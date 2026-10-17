package vn;

import android.content.Context;
import l70.e;
import no.d;
import os2.g;
import poi.b;
import uo.d1;
import uo.l;
import uo.q;
import uo.q0;
import uo.u;
import vc.s;
import vfg.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f290627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f290628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290629c = e4m.b.b(new vab.a(this, 9));

    public a(b bVar, e eVar) {
        this.f290627a = bVar;
        this.f290628b = eVar;
    }

    public final xn.b a() {
        b bVar = this.f290627a;
        d dVar = new d(e4m.b.a(bVar.K), bVar.a());
        yn.a aVar = (yn.a) this.f290629c.get();
        l80.e eVarH = this.f290628b.h();
        s.j(eVarH);
        return new xn.b(dVar, aVar, eVarH, new tn.a());
    }

    public final p b() {
        return new p(a());
    }

    public final g c() {
        b bVar = this.f290627a;
        d1 d1Var = new d1();
        q qVar = new q(new d1());
        Context context = bVar.f238017c;
        u uVar = new u(new lo0.a(context), new d1());
        ugc.a aVar = new ugc.a(new lo0.a(context));
        q0 q0VarJ = bVar.j();
        l lVar = (l) bVar.T.get();
        s.j(lVar);
        return new g(new sn.a(d1Var, qVar, uVar, aVar, q0VarJ, lVar));
    }
}
