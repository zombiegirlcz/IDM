package kvb;

import com.revolut.feature.rev_points.exclusive_store.impl.data.network.ExclusiveStoreService;
import ivb.l;
import sri.m;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f190057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f190058b;

    public a(b bVar, int i) {
        this.f190057a = bVar;
        this.f190058b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f190057a;
        nj0.a aVar = bVar.f190061c;
        ee0.a aVar2 = bVar.d;
        int i = this.f190058b;
        switch (i) {
            case 0:
                return new mvb.a();
            case 1:
                m mVarD = ((g8b.a) bVar.f190059a).d();
                s.j(mVarD);
                eub.a aVarA = bVar.f190060b.a();
                s.j(aVarA);
                return new jvb.a(mVarD, aVarA);
            case 2:
                return new lvb.e((ivb.h) bVar.f190069q.get());
            case 3:
                return new l((ExclusiveStoreService) bVar.f190068p.get());
            case 4:
                ik0.b bVarM = ((nj0.d) aVar).m();
                s.j(bVarM);
                return i.a(((nj0.d) aVar).d(), bVarM);
            case 5:
                return new lvb.d((ivb.f) bVar.u.get());
            case 6:
                return new ivb.f((ExclusiveStoreService) bVar.f190068p.get(), (ne0.j) bVar.f190071s.get(), (ue0.c) bVar.f190072t.get());
            case 7:
                return new ne0.d();
            case 8:
                je0.d dVarD = aVar2.d();
                s.j(dVarD);
                yk0.a aVarB = bVar.e.b();
                s.j(aVarB);
                xe0.f fVarF = aVar2.f();
                s.j(fVarF);
                return ka1.c.z(dVarD, fVarF, aVarB);
            default:
                throw new AssertionError(i);
        }
    }
}
