package r9h;

import b9k.f;
import e9h.d;
import l70.e;
import su9.c;
import t70.b;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f252727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f252728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tgh.a f252729c;
    public final ite.a d;

    public a(e eVar, ite.a aVar, h9h.a aVar2, tgh.a aVar3) {
        this.f252727a = eVar;
        this.f252728b = aVar2;
        this.f252729c = aVar3;
        this.d = aVar;
    }

    public final f a() {
        b bVarG = this.f252727a.g();
        s.j(bVarG);
        h9h.a aVar = this.f252728b;
        c cVarK = aVar.k();
        d9h.a aVar2 = new d9h.a(aVar.D(), 1);
        d dVarD = aVar.D();
        sgh.a aVarA = this.f252729c.a();
        nbh.f fVarX = h9h.a.x();
        gte.a aVarB = this.d.b();
        s.j(aVarB);
        return new f(bVarG, cVarK, aVar2, dVarD, aVarA, fVarX, aVarB);
    }
}
