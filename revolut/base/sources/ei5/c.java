package ei5;

import com.revolut.feature.crypto.onboarding.impl.service.CryptoOnboardingService;
import di5.f;
import ji5.i;
import sri.m;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f126420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f126421b;

    public c(d dVar, int i) {
        this.f126420a = dVar;
        this.f126421b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f126420a;
        int i = this.f126421b;
        switch (i) {
            case 0:
                return new f();
            case 1:
                return new di5.e((m) dVar.f126431p.get(), (i) dVar.f126434s.get(), (ai5.b) dVar.v.get(), (xh5.a) dVar.f126435t.get());
            case 2:
                return f9f.b.l(dVar.f126422a);
            case 3:
                li5.d dVar2 = (li5.d) dVar.f126433r.get();
                xoj.a aVarA = dVar.d.a();
                s.j(aVarA);
                sd5.c cVarA = dVar.e.a();
                s.j(cVarA);
                fk3.a aVarA2 = dVar.f.a();
                s.j(aVarA2);
                hc5.a aVarA3 = ((gc5.c) dVar.f126425g).a();
                s.j(aVarA3);
                return new i(dVar2, aVarA, cVarA, aVarA2, aVarA3);
            case 4:
                return new li5.d((CryptoOnboardingService) dVar.f126432q.get());
            case 5:
                mi5.a aVar = dVar.f126423b;
                nj0.a aVar2 = dVar.f126424c;
                ik0.b bVarM = ((nj0.d) aVar2).m();
                s.j(bVarM);
                return mi5.b.a(aVar, bVarM, ((nj0.d) aVar2).d());
            case 6:
                return new ki5.c((ji5.m) dVar.u.get(), (m) dVar.f126431p.get());
            case 7:
                dVar.getClass();
                mk0.a aVarA4 = dVar.f126426h.a();
                s.j(aVarA4);
                return new ji5.m(new li5.f(aVarA4), (xh5.a) dVar.f126435t.get());
            case 8:
                xoj.a aVarA5 = dVar.d.a();
                s.j(aVarA5);
                return new ji5.e(aVarA5, (i) dVar.f126434s.get(), dVar.i.a());
            case 9:
                ang.f fVarE = dVar.f126427j.e();
                gte.a aVarB = dVar.k.b();
                s.j(aVarB);
                return new gi5.d(fVarE, aVarB);
            case 10:
                return new hi5.a((i) dVar.f126434s.get(), (xh5.a) dVar.f126435t.get());
            case 11:
                xoj.a aVarA6 = dVar.d.a();
                s.j(aVarA6);
                return new ii5.a(aVarA6, (i) dVar.f126434s.get(), (m) dVar.f126431p.get(), dVar.i.a());
            case 12:
                i iVar = (i) dVar.f126434s.get();
                hc5.a aVarA7 = ((gc5.c) dVar.f126425g).a();
                s.j(aVarA7);
                til.m mVarA = dVar.f126428l.a();
                s.j(mVarA);
                return new hi5.f(aVarA7, iVar, mVarA);
            default:
                throw new AssertionError(i);
        }
    }
}
