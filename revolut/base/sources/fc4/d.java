package fc4;

import l70.e;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements b60.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f133643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f133644c;
    public final a31.a d;

    public /* synthetic */ d(a31.a aVar, a31.a aVar2, a31.a aVar3, int i) {
        this.f133642a = i;
        this.f133643b = aVar;
        this.f133644c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.d
    public final Object a() {
        switch (this.f133642a) {
            case 0:
                e eVar = (e) ((phm.a) this.f133643b.f955b).get();
                nj0.a aVar = (nj0.a) ((phm.a) this.f133644c.f955b).get();
                cri.b bVar = (cri.b) ((phm.a) this.d.f955b).get();
                eVar.getClass();
                aVar.getClass();
                bVar.getClass();
                return new c(new hri.b(), eVar, aVar, bVar, 0);
            default:
                e eVar2 = (e) ((phm.a) this.f133643b.f955b).get();
                nj0.a aVar2 = (nj0.a) ((phm.a) this.f133644c.f955b).get();
                cri.b bVar2 = (cri.b) ((phm.a) this.d.f955b).get();
                eVar2.getClass();
                aVar2.getClass();
                bVar2.getClass();
                return new c(new hri.b(), eVar2, aVar2, bVar2, 2);
        }
    }
}
