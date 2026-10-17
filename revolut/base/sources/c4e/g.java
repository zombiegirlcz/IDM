package c4e;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements b60.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f21174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f21175c;
    public final phm.a d;
    public final a31.a e;

    public /* synthetic */ g(a31.a aVar, a31.a aVar2, phm.a aVar3, a31.a aVar4, int i) {
        this.f21173a = i;
        this.f21174b = aVar;
        this.f21175c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.d
    public final Object a() {
        switch (this.f21173a) {
            case 0:
                poi.b bVar = (poi.b) ((phm.a) this.f21174b.f955b).get();
                l70.e eVar = (l70.e) ((phm.a) this.f21175c.f955b).get();
                w3e.b bVar2 = (w3e.b) this.d.get();
                cri.b bVar3 = (cri.b) ((phm.a) this.e.f955b).get();
                bVar.getClass();
                eVar.getClass();
                bVar2.getClass();
                bVar3.getClass();
                return new c(new hri.b(), bVar, eVar, bVar2, bVar3);
            case 1:
                l70.e eVar2 = (l70.e) ((phm.a) this.f21174b.f955b).get();
                t2j.a aVar = (t2j.a) ((phm.a) this.f21175c.f955b).get();
                hak.a aVar2 = (hak.a) this.d.get();
                xmg.a aVar3 = (xmg.a) ((phm.a) this.e.f955b).get();
                eVar2.getClass();
                aVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                return new jak.b(new hri.b(), eVar2, aVar, aVar2, aVar3);
            case 2:
                l70.e eVar3 = (l70.e) ((phm.a) this.f21174b.f955b).get();
                nj0.a aVar4 = (nj0.a) ((phm.a) this.f21175c.f955b).get();
                cri.b bVar4 = (cri.b) ((phm.a) this.e.f955b).get();
                dw3.e eVar4 = (dw3.e) this.d.get();
                eVar3.getClass();
                aVar4.getClass();
                bVar4.getClass();
                eVar4.getClass();
                return new fc4.c(new hri.b(), eVar3, aVar4, bVar4, eVar4);
            default:
                l70.e eVar5 = (l70.e) ((phm.a) this.f21174b.f955b).get();
                nf0.a aVar5 = (nf0.a) ((phm.a) this.f21175c.f955b).get();
                ex7.a aVar6 = (ex7.a) this.d.get();
                shi.a aVar7 = (shi.a) ((phm.a) this.e.f955b).get();
                eVar5.getClass();
                aVar5.getClass();
                aVar6.getClass();
                aVar7.getClass();
                return new zz7.c(new hri.b(), eVar5, aVar5, aVar6, aVar7);
        }
    }

    public g(a31.a aVar, phm.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f21173a = 2;
        this.f21174b = aVar;
        this.f21175c = aVar3;
        this.e = aVar4;
        this.d = aVar2;
    }
}
