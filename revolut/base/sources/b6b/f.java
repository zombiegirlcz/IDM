package b6b;

import cwi.m1;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f12587c;
    public final a31.a d;

    public /* synthetic */ f(a31.a aVar, phm.a aVar2, int i) {
        this.f12586b = i;
        this.d = aVar;
        this.f12587c = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f12586b) {
            case 0:
                h hVar = (h) this.f12587c.get();
                pqi.a aVar = (pqi.a) ((phm.a) this.d.f955b).get();
                hVar.getClass();
                aVar.getClass();
                return new n0(hVar, aVar);
            case 1:
                cwi.x xVar = (cwi.x) this.f12587c.get();
                xmg.a aVar2 = (xmg.a) ((phm.a) this.d.f955b).get();
                xVar.getClass();
                aVar2.getClass();
                return new m1(xVar, aVar2);
            case 2:
                ika.f fVar = (ika.f) ((phm.a) this.d.f955b).get();
                did.q qVar = (did.q) this.f12587c.get();
                fVar.getClass();
                qVar.getClass();
                return new did.s(fVar, qVar);
            case 3:
                l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
                kti.g gVar = (kti.g) this.f12587c.get();
                eVar.getClass();
                gVar.getClass();
                return new kti.i(eVar, gVar);
            case 4:
                y96.f fVar2 = (y96.f) this.f12587c.get();
                ila.b bVar = (ila.b) ((phm.a) this.d.f955b).get();
                fVar2.getClass();
                bVar.getClass();
                return new pa6.v(fVar2, bVar);
            case 5:
                h9h.a aVar3 = (h9h.a) this.f12587c.get();
                xmg.a aVar4 = (xmg.a) ((phm.a) this.d.f955b).get();
                aVar3.getClass();
                aVar4.getClass();
                return new e5f.a(aVar3, aVar4, 1);
            case 6:
                jm4.r rVar = (jm4.r) this.f12587c.get();
                uie.h hVar2 = (uie.h) ((phm.a) this.d.f955b).get();
                rVar.getClass();
                hVar2.getClass();
                return new rw4.l(rVar, hVar2);
            case 7:
                ika.f fVar3 = (ika.f) ((phm.a) this.d.f955b).get();
                us6.q qVar2 = (us6.q) this.f12587c.get();
                fVar3.getClass();
                qVar2.getClass();
                return new toh.d(fVar3, qVar2);
            default:
                c4f.a aVar5 = (c4f.a) ((phm.a) this.d.f955b).get();
                h9h.a aVar6 = (h9h.a) this.f12587c.get();
                aVar5.getClass();
                aVar6.getClass();
                return new w9h.a(aVar5, aVar6);
        }
    }

    public /* synthetic */ f(phm.a aVar, a31.a aVar2, int i) {
        this.f12586b = i;
        this.f12587c = aVar;
        this.d = aVar2;
    }
}
