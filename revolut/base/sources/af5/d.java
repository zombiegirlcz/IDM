package af5;

import ku5.g;
import mp.p;
import r10.v;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qud.c f3892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rc5.b f3893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final usg.a f3894c;
    public final vv5.e d;
    public final npk.a e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f3895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final eud.b f3896h;
    public final ei5.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f3897j = this;

    public d(rc5.b bVar, vv5.e eVar, g gVar, ei5.d dVar, npk.a aVar, qud.c cVar, eud.b bVar2, xmg.a aVar2, usg.a aVar3) {
        this.f3892a = cVar;
        this.f3893b = bVar;
        this.f3894c = aVar3;
        this.d = eVar;
        this.e = aVar;
        this.f = aVar2;
        this.f3895g = gVar;
        this.f3896h = bVar2;
        this.i = dVar;
    }

    public final p a() {
        qud.c cVar = this.f3892a;
        yud.g gVarD = cVar.d();
        wsg.b bVarA = this.f3894c.a();
        xv5.c cVarA = this.d.a();
        s.j(cVarA);
        return new p(gVarD, bVarA, new v(cVarA, this.e.a(), cVar.d()));
    }
}
