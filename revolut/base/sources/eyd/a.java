package eyd;

import com.revolut.feature.statements.impl.documents_hub.service.DocumentsHubService;
import com.revolut.feature.statements.impl.services.StatementsService;
import com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f130671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f130672b;

    public a(b bVar, int i) {
        this.f130671a = bVar;
        this.f130672b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f130671a;
        int i = this.f130672b;
        switch (i) {
            case 0:
                return new nyd.k((DocumentsHubService) bVar.f130692s.get(), (ne0.j) bVar.f130693t.get(), (ue0.c) bVar.v.get());
            case 1:
                return fyd.d.a(((nj0.d) bVar.f130680a).f(), (Converter.Factory) bVar.f130691r.get());
            case 2:
                return fyd.c.a((Json) bVar.f130690q.get());
            case 3:
                ee0.a aVar = bVar.f130681b;
                return fp8.c.j(fe0.d.a());
            case 4:
                return new ne0.d();
            case 5:
                je0.d dVar = (je0.d) bVar.u.get();
                yk0.a aVarB = bVar.f130682c.b();
                vc.s.j(aVarB);
                xe0.f fVarF = bVar.f130681b.f();
                vc.s.j(fVarF);
                return fp8.c.l(dVar, fVarF, aVarB);
            case 6:
                Json json = (Json) bVar.f130690q.get();
                me0.a aVarE = bVar.f130681b.e();
                vc.s.j(aVarE);
                return fp8.c.k(json, aVarE);
            case 7:
                e4m.e eVar = bVar.z;
                usg.a aVar2 = bVar.f130683g;
                uyd.v vVar = (uyd.v) eVar.get();
                syd.b bVar2 = new syd.b();
                c31.e eVar2 = (c31.e) ((c21.b) bVar.e).u0.get();
                vc.s.j(eVar2);
                ang.f fVarE = bVar.d.e();
                xoj.a aVarA = bVar.f.a();
                vc.s.j(aVarA);
                return new ryd.w(vVar, bVar2, eVar2, fVarE, aVarA, aVar2.b(), bVar.f130684h.c(), aVar2.a());
            case 8:
                return new uyd.h0((StatementsService) bVar.f130695x.get(), new syd.b(), (ne0.j) bVar.f130693t.get(), (ue0.c) bVar.f130696y.get());
            case 9:
                return ewg.w.D(((nj0.d) bVar.f130680a).f());
            case 10:
                je0.d dVarB = bVar.f130681b.b();
                vc.s.j(dVarB);
                yk0.a aVarB2 = bVar.f130682c.b();
                vc.s.j(aVarB2);
                xe0.f fVarF2 = bVar.f130681b.f();
                vc.s.j(fVarF2);
                return ewg.w.z(dVarB, fVarF2, aVarB2);
            case 11:
                zxd.c cVar = (zxd.c) bVar.A.get();
                ang.f fVarE2 = bVar.d.e();
                yme.a aVarA2 = bVar.i.a();
                vc.s.j(aVarA2);
                gte.a aVarB3 = bVar.f130685j.b();
                vc.s.j(aVarB3);
                return new StatementsFeatureCheckerImpl(cVar, fVarE2, aVarA2, aVarB3, bVar.k.a());
            case 12:
                wsg.n nVarB = bVar.f130683g.b();
                wsg.b bVarA = bVar.f130683g.a();
                n8b.a aVarA3 = bVar.f130686l.a();
                vc.s.j(aVarA3);
                return new ryd.b(nVarB, bVarA, aVarA3);
            case 13:
                return new ryd.c();
            case 14:
                return ewg.w.o(bVar.f130687m);
            case 15:
                return new tyd.h((sri.m) bVar.E.get(), (zxd.c) bVar.A.get(), bVar.c());
            default:
                throw new AssertionError(i);
        }
    }
}
