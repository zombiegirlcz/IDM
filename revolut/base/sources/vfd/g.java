package vfd;

import l3d.h0;
import m3d.j;
import vc.s;
import xfd.i;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2d.e f288600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2d.c f288601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3d.b f288602c;
    public final k3d.d d;
    public final g e = this;

    public g(y2d.c cVar, k3d.b bVar, k3d.d dVar, k2d.e eVar) {
        this.f288600a = eVar;
        this.f288601b = cVar;
        this.f288602c = bVar;
        this.d = dVar;
    }

    public final uvl.c a() {
        k2d.e eVar = this.f288600a;
        efd.a aVarA = eVar.a();
        s.j(aVarA);
        ffd.a aVarB = eVar.b();
        s.j(aVarB);
        ifd.h hVarB = this.f288601b.b();
        s.j(hVarB);
        i iVar = new i(aVarB, hVarB);
        h0 h0VarB = this.f288602c.b();
        s.j(h0VarB);
        j jVarA = this.d.a();
        s.j(jVarA);
        return new uvl.c(aVarA, iVar, h0VarB, jVarA);
    }
}
