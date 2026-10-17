package afj;

import dw3.f6;

/* JADX INFO: loaded from: classes11.dex */
public final class e4 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4229b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f4230c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f4231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final phm.a f4232h;

    public e4(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, f6 f6Var) {
        this.f4230c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f4231g = aVar5;
        this.f4232h = f6Var;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f4229b) {
            case 0:
                l70.e eVar = (l70.e) ((phm.a) this.f4230c.f955b).get();
                ee0.a aVar = (ee0.a) ((phm.a) this.d.f955b).get();
                nj0.a aVar2 = (nj0.a) ((phm.a) this.e.f955b).get();
                b bVar = (b) this.f4232h.get();
                ite.a aVar3 = (ite.a) ((phm.a) this.f.f955b).get();
                an0.c cVar = (an0.c) ((phm.a) this.f4231g.f955b).get();
                eVar.getClass();
                aVar.getClass();
                aVar2.getClass();
                bVar.getClass();
                aVar3.getClass();
                cVar.getClass();
                return new s3(eVar, aVar, aVar2, bVar, aVar3, cVar);
            case 1:
                t2j.a aVar4 = (t2j.a) ((phm.a) this.f4230c.f955b).get();
                l70.e eVar2 = (l70.e) ((phm.a) this.d.f955b).get();
                nj0.a aVar5 = (nj0.a) ((phm.a) this.e.f955b).get();
                ite.a aVar6 = (ite.a) ((phm.a) this.f.f955b).get();
                bw9.a aVar7 = (bw9.a) ((phm.a) this.f4231g.f955b).get();
                fl9.c cVar2 = (fl9.c) this.f4232h.get();
                aVar4.getClass();
                eVar2.getClass();
                aVar5.getClass();
                aVar6.getClass();
                aVar7.getClass();
                cVar2.getClass();
                return new fl9.a(aVar4, eVar2, aVar5, aVar6, aVar7, cVar2);
            case 2:
                l70.e eVar3 = (l70.e) ((phm.a) this.f4230c.f955b).get();
                z87.b bVar2 = (z87.b) ((phm.a) this.d.f955b).get();
                g97.d dVar = (g97.d) this.f4232h.get();
                vn.a aVar8 = (vn.a) ((phm.a) this.e.f955b).get();
                cri.b bVar3 = (cri.b) ((phm.a) this.f.f955b).get();
                ite.a aVar9 = (ite.a) ((phm.a) this.f4231g.f955b).get();
                eVar3.getClass();
                bVar2.getClass();
                dVar.getClass();
                aVar8.getClass();
                bVar3.getClass();
                aVar9.getClass();
                return new g97.a(dVar, bVar2, eVar3, aVar8, bVar3, aVar9);
            default:
                g2j.f fVar = (g2j.f) ((phm.a) this.f4230c.f955b).get();
                ta7.a aVar10 = (ta7.a) this.f4232h.get();
                jge.j jVar = (jge.j) ((phm.a) this.d.f955b).get();
                an0.c cVar3 = (an0.c) ((phm.a) this.e.f955b).get();
                he9.e eVar4 = (he9.e) ((phm.a) this.f.f955b).get();
                ika.f fVar2 = (ika.f) ((phm.a) this.f4231g.f955b).get();
                fVar.getClass();
                aVar10.getClass();
                jVar.getClass();
                cVar3.getClass();
                eVar4.getClass();
                fVar2.getClass();
                return new ta7.d(fVar, aVar10, jVar, cVar3, eVar4, fVar2);
        }
    }

    public e4(a31.a aVar, a31.a aVar2, a31.a aVar3, phm.a aVar4, a31.a aVar5, a31.a aVar6) {
        this.f4230c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f4232h = aVar4;
        this.f = aVar5;
        this.f4231g = aVar6;
    }

    public e4(a31.a aVar, a31.a aVar2, euh.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6) {
        this.f4230c = aVar;
        this.d = aVar2;
        this.f4232h = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.f4231g = aVar6;
    }

    public e4(a31.a aVar, ql7.d2 d2Var, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        this.f4230c = aVar;
        this.f4232h = d2Var;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f4231g = aVar5;
    }
}
