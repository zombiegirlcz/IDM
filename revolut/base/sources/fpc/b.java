package fpc;

import dmc.c;
import dmc.r;
import l70.e;
import vjb.g;
import zdl.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f137086b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f137087c;
    public final a31.a d;
    public final a31.a e;
    public final phm.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final phm.a f137088g;

    public b(a31.a aVar, a31.a aVar2, a31.a aVar3, phm.a aVar4, phm.a aVar5) {
        this.f137087c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f137088g = aVar5;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f137086b) {
            case 0:
                ite.a aVar = (ite.a) ((phm.a) this.f137087c.f955b).get();
                h9h.a aVar2 = (h9h.a) ((phm.a) this.d.f955b).get();
                dmc.a aVar3 = (dmc.a) this.f.get();
                f fVar = (f) ((phm.a) this.e.f955b).get();
                c cVar = (c) this.f137088g.get();
                aVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                fVar.getClass();
                cVar.getClass();
                return new a(aVar, aVar2, aVar3, cVar, fVar);
            case 1:
                zdl.c cVar2 = (zdl.c) ((phm.a) this.f137087c.f955b).get();
                ite.a aVar4 = (ite.a) ((phm.a) this.d.f955b).get();
                i9l.a aVar5 = (i9l.a) ((phm.a) this.e.f955b).get();
                dmc.a aVar6 = (dmc.a) this.f.get();
                r rVar = (r) this.f137088g.get();
                cVar2.getClass();
                aVar4.getClass();
                aVar5.getClass();
                aVar6.getClass();
                rVar.getClass();
                return new g5f.a(new kpc.a(), cVar2, aVar4, aVar5, aVar6, rVar);
            default:
                e eVar = (e) ((phm.a) this.f137087c.f955b).get();
                cri.b bVar = (cri.b) ((phm.a) this.d.f955b).get();
                pib.b bVar2 = (pib.b) this.f.get();
                bnb.a aVar7 = (bnb.a) this.f137088g.get();
                usg.a aVar8 = (usg.a) ((phm.a) this.e.f955b).get();
                eVar.getClass();
                bVar.getClass();
                bVar2.getClass();
                aVar7.getClass();
                aVar8.getClass();
                return new g(eVar, bVar, bVar2, aVar7, aVar8);
        }
    }

    public b(a31.a aVar, a31.a aVar2, phm.a aVar3, a31.a aVar4, phm.a aVar5) {
        this.f137087c = aVar;
        this.d = aVar2;
        this.f = aVar3;
        this.e = aVar4;
        this.f137088g = aVar5;
    }

    public b(a31.a aVar, a31.a aVar2, phm.a aVar3, phm.a aVar4, a31.a aVar5) {
        this.f137087c = aVar;
        this.d = aVar2;
        this.f = aVar3;
        this.f137088g = aVar4;
        this.e = aVar5;
    }
}
