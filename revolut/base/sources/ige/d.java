package ige;

import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase;
import com.revolut.feature.product_article.impl.network.ProductArticleConfigService;
import com.revolut.feature.rev_points.giftcards.impl.data.network.RevPointsGiftcardsService;
import e4m.e;
import fw2.l;
import gr1.f;
import htl.g;
import htl.i;
import htl.j;
import ika.h;
import iwb.v;
import iwb.x;
import jge.k;
import jxa.m;
import jyc.q;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ulm.b1;
import vc.s;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d implements e {
    public static jxa.a A(m mVar) {
        jxa.a aVar = (jxa.a) mVar.b();
        s.k(aVar);
        return aVar;
    }

    public static gyc.a B(q qVar) {
        gyc.a aVar = (gyc.a) qVar.b();
        s.k(aVar);
        return aVar;
    }

    public static k C(jge.s sVar) {
        k kVar = (k) sVar.b();
        s.k(kVar);
        return kVar;
    }

    public static a2d.m a(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new a2d.m(aVar, aVar2, aVar3, 13);
    }

    public static a7d.a b(a31.a aVar) {
        return new a7d.a(aVar, 15);
    }

    public static ae9.d c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, l lVar) {
        return new ae9.d(aVar, aVar2, aVar3, aVar4, lVar, 2);
    }

    public static ajf.d d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new ajf.d(aVar, aVar2, aVar3, aVar4, aVar5, 7);
    }

    public static c3d.d e(a31.a aVar, a31.a aVar2) {
        return new c3d.d(aVar, aVar2, 11);
    }

    public static hz8.a f(LearnDatabase database) {
        iz8.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        hz8.a aVarG = database.g();
        s.k(aVarG);
        return aVarG;
    }

    public static ska.e g(jka.a factory, ue0.c baseStorage) {
        ika.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(baseStorage, "storage");
        Intrinsics.checkNotNullParameter(baseStorage, "baseStorage");
        tka.b bVar = new tka.b(baseStorage);
        return new ska.e(factory.f175139c, factory.f175138b, baseStorage, factory.f175137a, factory.d.d(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d h(iq3.a aVar, j60.a extension) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    public static i76.d i(f61.a factory) {
        ilf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new i76.d((i76.c) factory.f132372b);
    }

    public static void j(x xVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
    }

    public static Retrofit k(x xVar, Retrofit retrofit, o oVar) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "gson");
        builderX.converterFactories().clear();
        Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static o l(ir1.l lVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        he0.m mVarB = he0.m.b(f.class, "action");
        mVarB.c(gr1.c.class, "PAY");
        mVarB.c(gr1.e.class, "TERMS_REQUIRED");
        Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
        pVar.e.add(mVarB);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static htl.c m(r10.q factory, g view, htl.d controllerModelExtension) {
        itl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        factory.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new i(view, controllerModelExtension);
    }

    public static htl.d n(r10.q factory) {
        itl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new j((htl.l) factory.f250850c, (vrl.g) factory.d);
    }

    public static rlm.o o(hqa.c jsonProvider) {
        Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
        rlm.o oVar = jsonProvider.f154654a;
        s.k(oVar);
        return oVar;
    }

    public static xe0.e p(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        il8.p.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "JuniorRemoteLogin", mapper, 1, f0.f322471a, 32);
    }

    public static fl0.a q(Json json, me0.a factory) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(json);
    }

    public static le0.a r(o gson, le0.b factory) {
        v.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(gson);
    }

    public static Retrofit s(ik0.b retrofitFactory, Json baseJson) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, p.a.g(b1.Companion, "application/json", baseJson), null, 27);
        s.k(retrofitA);
        return retrofitA;
    }

    public static ProductArticleConfigService t(Retrofit retrofit) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ProductArticleConfigService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ProductArticleConfigService productArticleConfigService = (ProductArticleConfigService) objCreate;
        s.k(productArticleConfigService);
        return productArticleConfigService;
    }

    public static Retrofit u(ik0.b retrofitFactory, Json baseJson, dka.a productArticleNetworkConfiguration) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        Intrinsics.checkNotNullParameter(productArticleNetworkConfiguration, "productArticleNetworkConfiguration");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, productArticleNetworkConfiguration.getHostUrl(), p.a.g(b1.Companion, "application/json", baseJson), null, 25);
        s.k(retrofitA);
        return retrofitA;
    }

    public static RevPointsGiftcardsService v(x xVar, Retrofit retrofit) {
        RevPointsGiftcardsService revPointsGiftcardsService = (RevPointsGiftcardsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsGiftcardsService.class, "create(...)");
        s.k(revPointsGiftcardsService);
        return revPointsGiftcardsService;
    }

    public static xe0.e w(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        v.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "rev_points_giftcards", mapper, 2, u.c(dwb.a.d), 32);
    }

    public static ve0.c x(je0.d mapper, xe0.f storageFactory) {
        in0.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return storageFactory.b("security_manager", mapper, 1);
    }

    public static xe0.e y(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        ika.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "product_article", mapper, tka.c.f271927b, tka.c.f271926a, 32);
    }

    public static xe0.e z(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        iq.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "widgets", mapper, 2, u.c(new hq.a()), 32);
    }
}
