package ika;

import com.revolut.feature.product_article.impl.network.ProductArticleService;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f161911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161912b;

    public a(b bVar, int i) {
        this.f161911a = bVar;
        this.f161912b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f161911a;
        int i = this.f161912b;
        switch (i) {
            case 0:
                return new vka.a();
            case 1:
                ska.k kVar = (ska.k) bVar.f161922p.get();
                ska.e eVar = (ska.e) bVar.f161923q.get();
                l80.e eVarH = bVar.e.h();
                s.j(eVarH);
                return new kka.h(kVar, eVar, eVarH);
            case 2:
                return new ska.k((ProductArticleService) bVar.f161919l.get(), (ne0.j) bVar.f161920m.get(), (ue0.c) bVar.o.get(), new lka.d(new e84.e(new mka.a(), new mka.b(), new mka.c(), new mka.d(), new mka.e(), new mka.g(), new mka.h(), new mka.i(), new mka.j()), new lka.a()), new ska.l());
            case 3:
                Retrofit retrofit = (Retrofit) bVar.f161914b.f133928b.i.get();
                s.j(retrofit);
                return l.a(retrofit, (Converter.Factory) bVar.k.get());
            case 4:
                return i.a((Json) bVar.f161918j.get());
            case 5:
                ee0.a aVar = bVar.f161915c;
                return ige.d.o(new hqa.c(fe0.d.a(), 2));
            case 6:
                return new ne0.d();
            case 7:
                je0.d dVar = (je0.d) bVar.f161921n.get();
                yk0.a aVarB = bVar.d.b();
                s.j(aVarB);
                xe0.f fVarF = bVar.f161915c.f();
                s.j(fVarF);
                return ige.d.y(dVar, aVarB, fVarF);
            case 8:
                Json json = (Json) bVar.f161918j.get();
                me0.a aVarE = bVar.f161915c.e();
                s.j(aVarE);
                return ige.d.q(json, aVarE);
            case 9:
                jka.a aVar2 = (jka.a) bVar.f161914b.f133928b.f161936h.get();
                s.j(aVar2);
                return ige.d.g(aVar2, (ue0.c) bVar.o.get());
            case 10:
                return new kka.j((ska.e) bVar.f161923q.get());
            default:
                throw new AssertionError(i);
        }
    }
}
