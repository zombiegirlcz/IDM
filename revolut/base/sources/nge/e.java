package nge;

import jge.n;
import uie.i;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f215141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f215142c;
    public final a31.a d;
    public final a31.a e;

    public e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f215141b = aVar;
        this.f215142c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        i iVar = (i) ((phm.a) this.f215141b.f955b).get();
        qie.a aVar = (qie.a) ((phm.a) this.f215142c.f955b).get();
        rj1.e eVar = (rj1.e) ((phm.a) this.d.f955b).get();
        n nVar = (n) ((phm.a) this.e.f955b).get();
        iVar.getClass();
        aVar.getClass();
        eVar.getClass();
        nVar.getClass();
        return new a(iVar, aVar, eVar, nVar);
    }
}
