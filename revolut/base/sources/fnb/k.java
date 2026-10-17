package fnb;

import us6.q;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f136617b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f136618c;
    public final phm.a d;
    public final a31.a e;
    public final a31.a f;

    public k(a31.a aVar, a31.a aVar2, phm.a aVar3, phm.a aVar4) {
        this.e = aVar;
        this.f = aVar2;
        this.f136618c = aVar3;
        this.d = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f136617b) {
            case 0:
                ajb.b bVar = (ajb.b) this.f136618c.get();
                ite.a aVar = (ite.a) ((phm.a) this.e.f955b).get();
                tib.b bVar2 = (tib.b) this.d.get();
                xmg.a aVar2 = (xmg.a) ((phm.a) this.f.f955b).get();
                bVar.getClass();
                aVar.getClass();
                bVar2.getClass();
                aVar2.getClass();
                return new e(bVar, bVar2, aVar, aVar2);
            case 1:
                dmc.a aVar3 = (dmc.a) this.f136618c.get();
                dmc.c cVar = (dmc.c) this.d.get();
                xmg.a aVar4 = (xmg.a) ((phm.a) this.e.f955b).get();
                ite.a aVar5 = (ite.a) ((phm.a) this.f.f955b).get();
                aVar3.getClass();
                cVar.getClass();
                aVar4.getClass();
                aVar5.getClass();
                return new f5b.a(aVar3, cVar, aVar4, aVar5);
            default:
                i6d.c cVar2 = (i6d.c) ((phm.a) this.e.f955b).get();
                c21.e eVar = (c21.e) ((phm.a) this.f.f955b).get();
                q qVar = (q) this.f136618c.get();
                xs6.b bVar3 = (xs6.b) this.d.get();
                cVar2.getClass();
                eVar.getClass();
                qVar.getClass();
                bVar3.getClass();
                return new ys6.a(cVar2, eVar, qVar, bVar3);
        }
    }

    public k(phm.a aVar, a31.a aVar2, phm.a aVar3, a31.a aVar4) {
        this.f136618c = aVar;
        this.e = aVar2;
        this.d = aVar3;
        this.f = aVar4;
    }

    public k(phm.a aVar, phm.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f136618c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }
}
