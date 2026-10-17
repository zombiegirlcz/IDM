package o19;

import com.revolut.feature.lifestyle.content_gateway.impl.network.LifestyleContentGatewayService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ogm.i;
import retrofit2.Converter;
import rlm.o;
import ulm.b1;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f221352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f221353b;

    public a(b bVar, int i) {
        this.f221352a = bVar;
        this.f221353b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f221352a;
        int i = this.f221353b;
        switch (i) {
            case 0:
                f39.c cVarA = bVar.f221354a.a();
                s.j(cVarA);
                return new p19.a(cVarA, (r19.e) bVar.k.get());
            case 1:
                LifestyleContentGatewayService lifestyleContentGatewayService = (LifestyleContentGatewayService) bVar.f221358h.get();
                ne0.d dVar = new ne0.d();
                ue0.c cVar = (ue0.c) bVar.f221359j.get();
                w39.b bVarA = bVar.e.a();
                s.j(bVarA);
                return new r19.e(lifestyleContentGatewayService, dVar, cVar, bVarA);
            case 2:
                ik0.b retrofitFactory = ((nj0.d) bVar.f221355b).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) bVar.f221357g.get();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(LifestyleContentGatewayService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                LifestyleContentGatewayService lifestyleContentGatewayService2 = (LifestyleContentGatewayService) objCreate;
                s.k(lifestyleContentGatewayService2);
                return lifestyleContentGatewayService2;
            case 3:
                Json json = (Json) bVar.f.get();
                Intrinsics.checkNotNullParameter(json, "json");
                return p.a.g(b1.Companion, "application/json", json);
            case 4:
                ee0.a aVar = bVar.f221356c;
                i jsonProvider = new i(fe0.d.a());
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                o oVar = (o) jsonProvider.f225222b;
                s.k(oVar);
                return oVar;
            case 5:
                je0.d mapper = (je0.d) bVar.i.get();
                yk0.a databaseSecurityProvider = bVar.d.b();
                s.j(databaseSecurityProvider);
                f storageFactory = bVar.f221356c.f();
                s.j(storageFactory);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return f.f(storageFactory, databaseSecurityProvider, "lifestyle_content_gateway", mapper, 0, null, 56);
            case 6:
                Json json2 = (Json) bVar.f.get();
                me0.a factory = bVar.f221356c.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json2, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json2);
            case 7:
                return new hom.e();
            case 8:
                return new hom.a();
            case 9:
                return new hom.c();
            case 10:
                return new n19.b();
            default:
                throw new AssertionError(i);
        }
    }
}
