package nyj;

import a09.e0;
import a09.j0;
import a09.m;
import a09.q;
import a09.w;
import android.content.Context;
import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import g09.i;
import hz8.k;
import hz8.l;
import kotlinx.serialization.json.Json;
import lu7.m0;
import ne0.j;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f220880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f220881b;

    public b(c cVar, int i) {
        this.f220880a = cVar;
        this.f220881b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f220880a;
        int i = this.f220881b;
        switch (i) {
            case 0:
                return new g09.e((m) cVar.u.get());
            case 1:
                return new m((LearnService) cVar.f220892q.get(), (hz8.h) cVar.f220894s.get(), (j) cVar.f220895t.get());
            case 2:
                return oyj.c.l((Retrofit) cVar.f220891p.get());
            case 3:
                ik0.b bVarM = ((nj0.d) cVar.f220882a).m();
                s.j(bVarM);
                v09.a aVarA = cVar.f220883b.a();
                s.j(aVarA);
                return oz8.c.a(bVarM, aVarA, (Converter.Factory) cVar.o.get());
            case 4:
                return oz8.a.a((Json) cVar.f220890n.get());
            case 5:
                return oz8.b.a();
            case 6:
                return iz8.c.k((LearnDatabase) cVar.f220893r.get());
            case 7:
                Context context = cVar.f220884c;
                yk0.a aVarB = cVar.d.b();
                s.j(aVarB);
                return iz8.c.l(context, aVarB, ((c21.b) cVar.e).b());
            case 8:
                return new ne0.d();
            case 9:
                return new g09.a((a09.h) cVar.f220896w.get());
            case 10:
                return new a09.h((LearnService) cVar.f220892q.get(), (hz8.h) cVar.f220894s.get(), (j) cVar.f220895t.get());
            case 11:
                return new i((e0) cVar.f220898y.get(), (ue0.c) cVar.z.get());
            case 12:
                return new e0((LearnService) cVar.f220892q.get(), (hz8.h) cVar.f220894s.get(), new ne0.d(), new a61.a((m) cVar.u.get(), (j) cVar.f220895t.get()), (c09.b) cVar.f220897x.get());
            case 13:
                return new c09.b();
            case 14:
                an0.c cVar2 = cVar.d;
                ee0.a aVar = cVar.f;
                yk0.a aVarB2 = cVar2.b();
                s.j(aVarB2);
                je0.d dVarB = aVar.b();
                s.j(dVarB);
                xe0.f fVarF = aVar.f();
                s.j(fVarF);
                return m0.B(aVarB2, dVarB, fVarF);
            case 15:
                return new g09.h((w) cVar.C.get());
            case 16:
                return new w((LearnService) cVar.f220892q.get(), (k) cVar.B.get(), new ne0.d());
            case 17:
                return iz8.c.r((LearnDatabase) cVar.f220893r.get());
            case 18:
                return new r39.a((a09.c) cVar.F.get());
            case 19:
                LearnService learnService = (LearnService) cVar.f220892q.get();
                ne0.d dVar = new ne0.d();
                hz8.a aVar2 = (hz8.a) cVar.E.get();
                b80.c cVarP = cVar.f220885g.p();
                s.j(cVarP);
                return new a09.c(learnService, dVar, aVar2, cVarP);
            case 20:
                return ige.d.f((LearnDatabase) cVar.f220893r.get());
            case 21:
                return new g09.j((j0) cVar.H.get());
            case 22:
                return new j0((LearnService) cVar.f220892q.get(), (l) cVar.G.get(), new ne0.d());
            case 23:
                return iz8.c.z((LearnDatabase) cVar.f220893r.get());
            case 24:
                return new pyj.h((sri.m) cVar.J.get(), (myj.e) cVar.K.get());
            case 25:
                return oyj.c.r(cVar.f220884c);
            case 26:
                xoj.a aVarA2 = cVar.f220886h.a();
                s.j(aVarA2);
                return new myj.e(aVarA2);
            case 27:
                sri.m mVar = (sri.m) cVar.J.get();
                xoj.a aVarA3 = cVar.f220886h.a();
                s.j(aVarA3);
                return new pyj.a(mVar, aVarA3);
            case 28:
                return new g09.f((q) cVar.N.get());
            case 29:
                return new q((LearnService) cVar.f220892q.get(), new ne0.d(), (ue0.c) cVar.z.get());
            case 30:
                return new ez8.b();
            default:
                throw new AssertionError(i);
        }
    }
}
