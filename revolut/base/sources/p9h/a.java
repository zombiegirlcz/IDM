package p9h;

import aah.i;
import aah.m;
import kbh.h;
import vc.s;
import ybl.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9h.a f234318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f234319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u8h.c f234320c;

    public a(ite.a aVar, h9h.a aVar2, u8h.c cVar) {
        this.f234318a = aVar2;
        this.f234319b = aVar;
        this.f234320c = cVar;
    }

    public final ou5.b a() {
        l lVarF = this.f234318a.f();
        h hVarB = b();
        kbh.a aVar = new kbh.a();
        u8h.b bVar = (u8h.b) this.f234320c;
        i iVarD = bVar.d();
        s.j(iVarD);
        m mVarS = p7h.b.s(iVarD);
        z0h.a aVarB = bVar.b();
        s.j(aVarB);
        return new ou5.b(lVarF, hVarB, aVar, mVarS, aVarB);
    }

    public final h b() {
        gte.a aVarB = this.f234319b.b();
        s.j(aVarB);
        return new h(aVarB);
    }
}
