package ava;

import pa6.m;
import q05.k;
import rb8.e;
import rkd.g;
import whl.f;
import yaj.i;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f9990c;
    public final a31.a d;
    public final a31.a e;

    public /* synthetic */ d(a31.a aVar, a31.a aVar2, phm.a aVar3, int i) {
        this.f9989b = i;
        this.d = aVar;
        this.e = aVar2;
        this.f9990c = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f9989b) {
            case 0:
                m mVar = (m) ((phm.a) this.d.f955b).get();
                e eVar = (e) ((phm.a) this.e.f955b).get();
                a aVar = (a) this.f9990c.get();
                mVar.getClass();
                eVar.getClass();
                aVar.getClass();
                return new b(mVar, eVar, aVar);
            case 1:
                gp6.a aVar2 = (gp6.a) this.f9990c.get();
                g gVar = (g) ((phm.a) this.d.f955b).get();
                wqb.a aVar3 = (wqb.a) ((phm.a) this.e.f955b).get();
                aVar2.getClass();
                gVar.getClass();
                aVar3.getClass();
                return new gp6.e(aVar2, gVar, aVar3);
            case 2:
                ite.a aVar4 = (ite.a) ((phm.a) this.d.f955b).get();
                h9h.a aVar5 = (h9h.a) ((phm.a) this.e.f955b).get();
                u8h.c cVar = (u8h.c) this.f9990c.get();
                aVar4.getClass();
                aVar5.getClass();
                cVar.getClass();
                return new p9h.a(aVar4, aVar5, cVar);
            case 3:
                cri.a aVar6 = (cri.a) ((phm.a) this.d.f955b).get();
                q05.e eVar2 = (q05.e) this.f9990c.get();
                hsh.b bVar = (hsh.b) ((phm.a) this.e.f955b).get();
                aVar6.getClass();
                eVar2.getClass();
                bVar.getClass();
                return new k(aVar6, eVar2, bVar);
            case 4:
                h9h.a aVar7 = (h9h.a) this.f9990c.get();
                ite.a aVar8 = (ite.a) ((phm.a) this.d.f955b).get();
                f fVar = (f) ((phm.a) this.e.f955b).get();
                aVar7.getClass();
                aVar8.getClass();
                fVar.getClass();
                return new u9h.a(aVar7, aVar8, fVar);
            case 5:
                je6.g gVar2 = (je6.g) this.f9990c.get();
                co0.a aVar9 = (co0.a) ((phm.a) this.d.f955b).get();
                nf0.a aVar10 = (nf0.a) ((phm.a) this.e.f955b).get();
                gVar2.getClass();
                aVar9.getClass();
                aVar10.getClass();
                return new xf6.e(gVar2, aVar9, aVar10);
            default:
                cf0.f fVar2 = (cf0.f) ((phm.a) this.d.f955b).get();
                yaj.a aVar11 = (yaj.a) this.f9990c.get();
                pqi.a aVar12 = (pqi.a) ((phm.a) this.e.f955b).get();
                fVar2.getClass();
                aVar11.getClass();
                aVar12.getClass();
                return new i(fVar2, aVar11, aVar12);
        }
    }

    public /* synthetic */ d(a31.a aVar, e4m.e eVar, a31.a aVar2, int i) {
        this.f9989b = i;
        this.d = aVar;
        this.f9990c = eVar;
        this.e = aVar2;
    }

    public /* synthetic */ d(phm.a aVar, a31.a aVar2, a31.a aVar3, int i) {
        this.f9989b = i;
        this.f9990c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }
}
