package k78;

import b88.p;
import djb.n;
import te8.v;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f181884b;

    public /* synthetic */ d(b bVar, int i) {
        this.f181883a = i;
        this.f181884b = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f181883a) {
            case 0:
                x78.l lVar = new x78.l();
                b bVar = this.f181884b;
                hj8.a aVarA = bVar.f181872s.a();
                s.j(aVarA);
                se8.a aVar = bVar.f181874t;
                kbb.c cVarF = aVar.f();
                v vVarD = aVar.d();
                s.j(vVarD);
                return new x78.k(lVar, aVarA, cVarF, vVarD, bVar.f181853b.b());
            default:
                p pVar = new p();
                b bVar2 = this.f181884b;
                yf8.a aVar2 = bVar2.f181858g;
                zf8.k kVarA = aVar2.a();
                s.j(kVarA);
                hj8.a aVarA2 = bVar2.f181872s.a();
                s.j(aVarA2);
                n nVarA = bVar2.C.a();
                s.j(nVarA);
                zf8.n nVarB = aVar2.b();
                s.j(nVarB);
                kbb.c cVarF2 = bVar2.f181874t.f();
                an8.b bVarA = bVar2.D.a();
                s.j(bVarA);
                return new b88.n(pVar, kVarA, aVarA2, nVarA, nVarB, cVarF2, bVarA);
        }
    }
}
