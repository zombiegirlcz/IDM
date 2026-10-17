package fae;

import b60.d;
import l70.e;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133300a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f133301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f133302c;
    public final phm.a d;

    public c(a31.a aVar, a31.a aVar2, cbb.b bVar) {
        this.f133301b = aVar;
        this.f133302c = aVar2;
        this.d = bVar;
    }

    @Override // b60.d
    public final Object a() {
        switch (this.f133300a) {
            case 0:
                ava.a aVar = (ava.a) ((phm.a) this.f133301b.f955b).get();
                x9e.a aVar2 = (x9e.a) this.d.get();
                djf.c cVar = (djf.c) ((phm.a) this.f133302c.f955b).get();
                aVar.getClass();
                aVar2.getClass();
                cVar.getClass();
                return new b(new hri.b(), aVar, aVar2, cVar);
            default:
                e eVar = (e) ((phm.a) this.f133301b.f955b).get();
                xmg.a aVar3 = (xmg.a) ((phm.a) this.f133302c.f955b).get();
                ex7.a aVar4 = (ex7.a) this.d.get();
                eVar.getClass();
                aVar3.getClass();
                aVar4.getClass();
                return new ox7.b(new hri.b(), eVar, aVar4, aVar3);
        }
    }

    public c(a31.a aVar, phm.a aVar2, a31.a aVar3) {
        this.f133301b = aVar;
        this.d = aVar2;
        this.f133302c = aVar3;
    }
}
