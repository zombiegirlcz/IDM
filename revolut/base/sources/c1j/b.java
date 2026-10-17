package c1j;

import an0.c;
import e4m.e;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f20530c;
    public final phm.a d;

    public /* synthetic */ b(a31.a aVar, e eVar, int i) {
        this.f20529b = i;
        this.f20530c = aVar;
        this.d = eVar;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f20529b) {
            case 0:
                c cVar = (c) ((phm.a) this.f20530c.f955b).get();
                e1j.a aVar = (e1j.a) this.d.get();
                cVar.getClass();
                aVar.getClass();
                return new a(cVar, aVar);
            default:
                ite.a aVar2 = (ite.a) ((phm.a) this.f20530c.f955b).get();
                ktl.a aVar3 = (ktl.a) this.d.get();
                aVar2.getClass();
                aVar3.getClass();
                return new gsl.a(aVar2, aVar3);
        }
    }
}
