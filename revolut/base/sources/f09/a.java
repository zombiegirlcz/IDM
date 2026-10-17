package f09;

import a09.e0;
import a09.j0;
import a09.m;
import a09.q;
import a09.w;
import android.content.Context;
import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import g09.i;
import hz8.h;
import hz8.k;
import hz8.l;
import kotlinx.serialization.json.Json;
import lu7.m0;
import ne0.j;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f131027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f131028b;

    public a(b bVar, int i) {
        this.f131027a = bVar;
        this.f131028b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f131027a;
        int i = this.f131028b;
        switch (i) {
            case 0:
                an0.c cVar = bVar.f131029a;
                ee0.a aVar = bVar.f131030b;
                yk0.a aVarB = cVar.b();
                s.j(aVarB);
                je0.d dVarB = aVar.b();
                s.j(dVarB);
                xe0.f fVarF = aVar.f();
                s.j(fVarF);
                return m0.B(aVarB, dVarB, fVarF);
            case 1:
                Context context = bVar.f131031c;
                yk0.a aVarB2 = bVar.f131029a.b();
                s.j(aVarB2);
                de0.a aVarA = ((cl0.a) bVar.d).a();
                s.j(aVarA);
                return iz8.c.l(context, aVarB2, aVarA);
            case 2:
                return new g09.e((m) bVar.f131038p.get());
            case 3:
                return new m((LearnService) bVar.f131036m.get(), (h) bVar.f131037n.get(), (j) bVar.o.get());
            case 4:
                return oyj.c.l((Retrofit) bVar.f131035l.get());
            case 5:
                ik0.b bVarM = ((nj0.d) bVar.e).m();
                s.j(bVarM);
                return oz8.c.a(bVarM, bVar.f.f301537a, (Converter.Factory) bVar.k.get());
            case 6:
                return oz8.a.a((Json) bVar.f131034j.get());
            case 7:
                return oz8.b.a();
            case 8:
                return iz8.c.k((LearnDatabase) bVar.i.get());
            case 9:
                return new ne0.d();
            case 10:
                return new g09.a((a09.h) bVar.f131040r.get());
            case 11:
                return new a09.h((LearnService) bVar.f131036m.get(), (h) bVar.f131037n.get(), (j) bVar.o.get());
            case 12:
                return new i((e0) bVar.u.get(), (ue0.c) bVar.f131033h.get());
            case 13:
                return new e0((LearnService) bVar.f131036m.get(), (h) bVar.f131037n.get(), new ne0.d(), new a61.a((m) bVar.f131038p.get(), (j) bVar.o.get()), (c09.b) bVar.f131042t.get());
            case 14:
                return new c09.b();
            case 15:
                return new g09.f((q) bVar.f131043w.get());
            case 16:
                return new q((LearnService) bVar.f131036m.get(), new ne0.d(), (ue0.c) bVar.f131033h.get());
            case 17:
                return new g09.h((w) bVar.z.get());
            case 18:
                return new w((LearnService) bVar.f131036m.get(), (k) bVar.f131045y.get(), new ne0.d());
            case 19:
                return iz8.c.r((LearnDatabase) bVar.i.get());
            case 20:
                return new g09.j((j0) bVar.C.get());
            case 21:
                return new j0((LearnService) bVar.f131036m.get(), (l) bVar.B.get(), new ne0.d());
            case 22:
                return iz8.c.z((LearnDatabase) bVar.i.get());
            case 23:
                return new r39.a((a09.c) bVar.E.get());
            case 24:
                LearnService learnService = (LearnService) bVar.f131036m.get();
                ne0.d dVar = new ne0.d();
                hz8.a aVar2 = (hz8.a) bVar.D.get();
                b80.c cVarP = bVar.f131032g.p();
                s.j(cVarP);
                return new a09.c(learnService, dVar, aVar2, cVarP);
            case 25:
                return ige.d.f((LearnDatabase) bVar.i.get());
            default:
                throw new AssertionError(i);
        }
    }
}
