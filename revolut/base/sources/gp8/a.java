package gp8;

import com.revolut.feature.junior_tasks.impl.services.JuniorTasksService;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f145285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f145286b;

    public a(b bVar, int i) {
        this.f145285a = bVar;
        this.f145286b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f145285a;
        c21.e eVar = bVar.f145288b;
        ee0.a aVar = bVar.f145289c;
        nj0.a aVar2 = bVar.e;
        p pVar = bVar.f145287a;
        int i = this.f145286b;
        switch (i) {
            case 0:
                return new hp8.b((lp8.a) bVar.k.get());
            case 1:
                return new lp8.e((JuniorTasksService) bVar.f145291h.get(), (ne0.j) bVar.i.get(), (ue0.c) bVar.f145292j.get());
            case 2:
                return gmf.b.o(pVar, (Retrofit) bVar.f145290g.get());
            case 3:
                Retrofit retrofitI = ((c21.b) eVar).i();
                vc.s.j(retrofitI);
                return gmf.b.n(pVar, retrofitI, (kg.o) bVar.f.get());
            case 4:
                kg.o oVarH = ((c21.b) eVar).h();
                vc.s.j(oVarH);
                gmf.b.m(pVar, oVarH);
                return oVarH;
            case 5:
                return new ne0.d();
            case 6:
                je0.d dVarB = aVar.b();
                vc.s.j(dVarB);
                yk0.a aVarB = bVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = aVar.f();
                vc.s.j(fVarF);
                return gmf.b.p(dVarB, fVarF, aVarB);
            case 7:
                ik0.b bVarM = ((nj0.d) aVar2).m();
                vc.s.j(bVarM);
                return s.a(((nj0.d) aVar2).d(), bVarM);
            default:
                throw new AssertionError(i);
        }
    }
}
