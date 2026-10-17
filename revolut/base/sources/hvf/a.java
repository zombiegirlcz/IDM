package hvf;

import com.revolut.feature.transport.impl.data.TransportService;
import com.revolut.feature.transport.impl.data.database.TransportDatabase;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f155857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155858b;

    public a(b bVar, int i) {
        this.f155857a = bVar;
        this.f155858b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f155857a;
        int i = this.f155858b;
        switch (i) {
            case 0:
                return new quf.b(bVar.f155860a.e(), bVar.f155861b.a());
            case 1:
                return new ovf.b((ouf.a) bVar.f155873t.get(), ((ika.b) bVar.f155865j).b());
            case 2:
                return new ivf.r((suf.h) bVar.f155871r.get(), new usc.a((zzl.b) bVar.f155872s.get()));
            case 3:
                TransportService transportService = (TransportService) bVar.f155867m.get();
                vuf.h hVar = (vuf.h) bVar.o.get();
                ne0.j jVar = (ne0.j) bVar.f155869p.get();
                ue0.c cVar = (ue0.c) bVar.f155870q.get();
                l80.e eVarH = bVar.i.h();
                vc.s.j(eVarH);
                wj0.a aVarI = ((nj0.d) bVar.d).i();
                vc.s.j(aVarI);
                return new suf.h(transportService, hVar, jVar, cVar, eVarH, aVarI);
            case 4:
                return hsi.b.z(bVar.f155862c, (Retrofit) bVar.f155866l.get());
            case 5:
                h0 h0Var = bVar.f155862c;
                ik0.b bVarM = ((nj0.d) bVar.d).m();
                vc.s.j(bVarM);
                h0 h0Var2 = bVar.f155862c;
                kg.o oVarH = ((c21.b) bVar.e).h();
                vc.s.j(oVarH);
                return i0.a(h0Var, bVarM, j0.a(h0Var2, hsi.b.k(h0Var2, oVarH)));
            case 6:
                return hsi.b.C((TransportDatabase) bVar.f155868n.get());
            case 7:
                return hsi.b.D(bVar.f);
            case 8:
                return c0.a();
            case 9:
                je0.d dVarB = bVar.f155863g.b();
                vc.s.j(dVarB);
                xe0.f fVarF = bVar.f155863g.f();
                vc.s.j(fVarF);
                yk0.a aVarB = bVar.f155864h.b();
                vc.s.j(aVarB);
                return hsi.b.w(dVarB, fVarF, aVarB);
            case 10:
                return d0.a();
            case 11:
                return new gvf.b((puf.a) bVar.u.get(), (quf.b) bVar.k.get(), (sri.m) bVar.v.get());
            case 12:
                return hsi.b.q(bVar.f);
            case 13:
                return new mfg.a(bVar.f, (TransportDatabase) bVar.f155868n.get());
            default:
                throw new AssertionError(i);
        }
    }
}
