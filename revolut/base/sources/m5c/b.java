package m5c;

import com.revolut.feature.revolut_x_promo.impl.service.CryptoExchangeEligibilityService;
import e4m.e;
import ne0.j;
import vc.s;
import wli.x;
import xe0.f;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f202882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f202883b;

    public b(c cVar, int i) {
        this.f202882a = cVar;
        this.f202883b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f202882a;
        int i = this.f202883b;
        switch (i) {
            case 0:
                return new o5c.a((r5c.b) cVar.f202893p.get());
            case 1:
                return new r5c.b((j) cVar.f202890l.get(), (ue0.c) cVar.f202891m.get(), (p5c.a) cVar.f202892n.get(), (CryptoExchangeEligibilityService) cVar.o.get());
            case 2:
                return new ne0.d();
            case 3:
                je0.d dVarD = cVar.f202884a.d();
                s.j(dVarD);
                yk0.a aVarB = cVar.f202885b.b();
                s.j(aVarB);
                f fVarF = cVar.f202884a.f();
                s.j(fVarF);
                return trl.f.k(dVarD, fVarF, aVarB);
            case 4:
                return new p5c.a();
            case 5:
                s5c.a aVar = cVar.f202886c;
                nj0.a aVar2 = cVar.d;
                ik0.b bVarM = ((nj0.d) aVar2).m();
                s.j(bVarM);
                return s5c.b.a(aVar, bVarM, ((nj0.d) aVar2).d());
            case 6:
                return new p5c.b();
            case 7:
                return new qy5.a((o5c.a) cVar.f202894q.get(), (j5c.a) cVar.f202895r.get());
            case 8:
                y70.a aVarC = cVar.e.c();
                s.j(aVarC);
                o5c.a aVar3 = (o5c.a) cVar.f202894q.get();
                x xVarD = ((s41.a) cVar.f).d();
                zja.a aVarA = ((ika.b) cVar.f202887g).a();
                s.j(aVarA);
                ang.f fVarE = cVar.f202888h.e();
                ryc.a aVarB2 = cVar.i.b();
                z70.a aVarF = cVar.e.f();
                s.j(aVarF);
                return new n5c.e(aVarC, aVar3, xVarD, aVarA, fVarE, aVarB2, aVarF);
            case 9:
                return new q5c.a();
            default:
                throw new AssertionError(i);
        }
    }
}
