package sf1;

import com.revolut.feature.add.new_product.impl.repository.AddNewProductTrackingService;
import tf1.c0;
import tf1.d0;
import vy5.s0;
import xf6.q1;

/* JADX INFO: loaded from: classes.dex */
public final class r implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f262307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262308b;

    public r(s sVar, int i) {
        this.f262307a = sVar;
        this.f262308b = i;
    }

    @Override // phm.a
    public final Object get() {
        s sVar = this.f262307a;
        int i = this.f262308b;
        switch (i) {
            case 0:
                return new c0(new tf1.s(), new tf1.a(), new jt0.b(sVar.f262309a.a(), new su9.c(sVar.b(), new ryc.a(sVar.b())), new ryc.a(sVar.b())), new os2.g(new xf1.f((AddNewProductTrackingService) sVar.K.get(), (ne0.j) sVar.L.get())), (of1.a) sVar.M.get());
            case 1:
                mf1.c cVar = (mf1.c) ((q1) sVar.f262310b).f305006m.get();
                vc.s.j(cVar);
                return cVar;
            case 2:
                yy5.b bVar = (yy5.b) sVar.f262311c;
                uy5.f fVar = (uy5.f) bVar.C.get();
                rea.g gVarC = bVar.f317840w.c();
                gte.a aVarB = bVar.f317827b.b();
                vc.s.j(aVarB);
                return new s0(fVar, gVarC, aVarB);
            case 3:
                mf1.c cVarA = ((fob.a) sVar.d).a();
                vc.s.j(cVarA);
                return cVarA;
            case 4:
                mf1.c cVar2 = (mf1.c) sVar.e.f246502p.get();
                vc.s.j(cVar2);
                return cVar2;
            case 5:
                mf1.c cVar3 = (mf1.c) ((c6e.a) sVar.f).f21789s.get();
                vc.s.j(cVar3);
                return cVar3;
            case 6:
                mf1.c cVar4 = (mf1.c) ((q38.b) sVar.f262312g).H.get();
                vc.s.j(cVar4);
                return cVar4;
            case 7:
                mf1.c cVar5 = (mf1.c) ((yha.a) sVar.f262313h).z.get();
                vc.s.j(cVar5);
                return cVar5;
            case 8:
                mf1.c cVar6 = (mf1.c) ((t15.d) sVar.i).M.get();
                vc.s.j(cVar6);
                return cVar6;
            case 9:
                mf1.c cVar7 = (mf1.c) sVar.f262314j.f277046c.get();
                vc.s.j(cVar7);
                return cVar7;
            case 10:
                mkh.s sVar2 = (mkh.s) sVar.k;
                h9h.a aVar = sVar2.d;
                tzg.m mVarT = aVar.t();
                vc.s.j(mVarT);
                oih.j jVar = (oih.j) sVar2.y0.get();
                ybl.l lVarF = aVar.f();
                gte.a aVarB2 = sVar2.f206400a.b();
                vc.s.j(aVarB2);
                return new plh.n(mVarT, jVar, lVarF, aVarB2);
            case 11:
                mf1.c cVarA2 = sVar.f262315l.a();
                vc.s.j(cVarA2);
                return cVarA2;
            case 12:
                mf1.c cVar8 = (mf1.c) sVar.f262316m.I0.get();
                vc.s.j(cVar8);
                return cVar8;
            case 13:
                mf1.c cVarA3 = sVar.f262317n.a();
                vc.s.j(cVarA3);
                return cVarA3;
            case 14:
                mf1.c cVarA4 = ((wfb.i) sVar.o).a();
                vc.s.j(cVarA4);
                return cVarA4;
            case 15:
                mf1.c cVarA5 = sVar.f262318p.a();
                vc.s.j(cVarA5);
                return cVarA5;
            case 16:
                mf1.b bVarB = ((fob.a) sVar.d).b();
                vc.s.j(bVarB);
                return bVarB;
            case 17:
                mf1.b bVar2 = (mf1.b) ((c6e.a) sVar.f).f21790t.get();
                vc.s.j(bVar2);
                return bVar2;
            case 18:
                h hVar = sVar.f262320r;
                nj0.a aVar2 = sVar.f262321s;
                ik0.b bVarM = ((nj0.d) aVar2).m();
                vc.s.j(bVarM);
                return i.a(hVar, bVarM, ((nj0.d) aVar2).d());
            case 19:
                return new ne0.d();
            case 20:
                gte.a aVarB3 = sVar.f262319q.b();
                vc.s.j(aVarB3);
                return new tf1.p(aVarB3);
            case 21:
                return new d0(sVar.a());
            default:
                throw new AssertionError(i);
        }
    }
}
