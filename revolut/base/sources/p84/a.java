package p84;

import b60.d;
import l70.e;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f233826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f233827c;
    public final a31.a d;
    public final a31.a e;
    public final Object f;

    public /* synthetic */ a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, Object obj2, int i) {
        this.f233825a = i;
        this.f233826b = aVar;
        this.f233827c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = obj2;
    }

    @Override // b60.d
    public final Object a() {
        switch (this.f233825a) {
            case 0:
                nj0.a aVar = (nj0.a) ((phm.a) this.f233826b.f955b).get();
                e eVar = (e) ((phm.a) this.f233827c.f955b).get();
                pqi.a aVar2 = (pqi.a) ((phm.a) this.d.f955b).get();
                uq3.b bVar = (uq3.b) ((phm.a) this.e.f955b).get();
                dw3.e eVar2 = (dw3.e) ((phm.a) this.f).get();
                aVar.getClass();
                eVar.getClass();
                aVar2.getClass();
                bVar.getClass();
                eVar2.getClass();
                return new c(new hri.b(), eVar, aVar, aVar2, bVar, eVar2);
            case 1:
                e eVar3 = (e) ((phm.a) this.f233826b.f955b).get();
                nf0.a aVar3 = (nf0.a) ((phm.a) this.f233827c.f955b).get();
                xmg.a aVar4 = (xmg.a) ((phm.a) this.d.f955b).get();
                pqi.a aVar5 = (pqi.a) ((phm.a) this.e.f955b).get();
                ex7.a aVar6 = (ex7.a) ((phm.a) this.f).get();
                eVar3.getClass();
                aVar3.getClass();
                aVar4.getClass();
                aVar5.getClass();
                aVar6.getClass();
                return new qy7.c(new hri.b(), eVar3, aVar3, aVar6, aVar4, aVar5);
            default:
                e eVar4 = (e) ((phm.a) this.f233826b.f955b).get();
                ava.a aVar7 = (ava.a) ((phm.a) this.f233827c.f955b).get();
                djf.c cVar = (djf.c) ((phm.a) this.d.f955b).get();
                usg.a aVar8 = (usg.a) ((phm.a) this.e.f955b).get();
                ite.a aVar9 = (ite.a) ((phm.a) ((a31.a) this.f).f955b).get();
                eVar4.getClass();
                aVar7.getClass();
                cVar.getClass();
                aVar8.getClass();
                aVar9.getClass();
                return new oae.b(new hri.b(), eVar4, aVar7, cVar, aVar8, aVar9);
        }
    }
}
