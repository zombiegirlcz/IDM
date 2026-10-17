package qw7;

import android.content.Context;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.revolut.feature.credit.forbearance.application.impl.network.ForbearanceApplicationService;
import com.revolut.feature.onboarding.impl.esignature.data.network.ESignatureService;
import com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService;
import com.revolut.kompot.navigable.screen.BaseScreen;
import kotlin.jvm.internal.Intrinsics;
import p8a.c0;
import r6e.e0;
import r6e.k0;
import retrofit2.Retrofit;
import t80.e;
import wli.x;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements e4m.e {
    public static r8l.a A(s79.c cVar) {
        r8l.a aVar = (r8l.a) cVar.b();
        vc.s.k(aVar);
        return aVar;
    }

    public static a31.a B(r5a.b bVar) {
        return new a31.a(bVar);
    }

    public static oda.d C(oda.u uVar) {
        oda.d dVar = (oda.d) uVar.b();
        vc.s.k(dVar);
        return dVar;
    }

    public static u8h.c D(u8h.d dVar) {
        u8h.c cVar = (u8h.c) dVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static a51.d a(of3.e eVar) {
        return new a51.d(eVar, 16);
    }

    public static a51.d b(c0 c0Var) {
        return new a51.d(c0Var, 17);
    }

    public static emi.g c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, ecm.q qVar) {
        return new emi.g(qVar, aVar, aVar2, aVar3, aVar4, 10);
    }

    public static ezj.h d(ecm.q qVar, a31.a aVar, a31.a aVar2, r5a.b bVar) {
        return new ezj.h(qVar, aVar, aVar2, bVar, 3);
    }

    public static fsg.f e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, ecm.q qVar) {
        return new fsg.f(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, 3);
    }

    public static xe0.e f(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        rb8.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_allowances", mapper, 0, null, 56);
    }

    public static mae.o g(mae.p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        k0.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.a(uiKitResources, currenciesLocalization);
    }

    public static CatalogueService h(Retrofit retrofit) {
        rfc.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CatalogueService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CatalogueService catalogueService = (CatalogueService) objCreate;
        vc.s.k(catalogueService);
        return catalogueService;
    }

    public static xl2.f i(r54.d dVar) {
        dVar.getClass();
        return new xl2.f(true, 14);
    }

    public static xl2.f j(r54.f fVar) {
        fVar.getClass();
        return new xl2.f(false, 14);
    }

    public static n3h.b k(jpc.e factory, q2h.k view, q2h.b controllerModelExtension) {
        r2h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new n3h.b(view, controllerModelExtension);
    }

    public static n3h.c l(jpc.e factory) {
        r2h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new n3h.c((udf.a) factory.f177256b, (d1e.a) factory.f177257c, (z5j.d) factory.d);
    }

    public static w9j.b m(w9j.a factory) {
        qyg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new w9j.b();
    }

    public static ESignatureService n(Retrofit retrofit) {
        r99.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ESignatureService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ESignatureService eSignatureService = (ESignatureService) objCreate;
        vc.s.k(eSignatureService);
        return eSignatureService;
    }

    public static Retrofit o(qz4.f fVar, Retrofit retrofit, kg.o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static ForbearanceApplicationService p(qz4.f fVar, Retrofit retrofit) {
        ForbearanceApplicationService forbearanceApplicationService = (ForbearanceApplicationService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ForbearanceApplicationService.class, "create(...)");
        vc.s.k(forbearanceApplicationService);
        return forbearanceApplicationService;
    }

    public static wvl.d q(rdf.a aVar, uvl.c factory, qdf.d view, qdf.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new wvl.d(view, controllerModelExtension);
    }

    public static wvl.g r(rdf.a aVar, uvl.c factory, qr0.i freeTradesProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(freeTradesProvider, "provider");
        Intrinsics.checkNotNullParameter(freeTradesProvider, "freeTradesProvider");
        return new wvl.g(freeTradesProvider, (qrk.d) factory.f283492b, (ybl.l) factory.f283493c, (x) factory.d);
    }

    public static kg.o s(qz4.f fVar, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.o oVarB = new kg.p(gson).b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static t80.c t(r54.e eVar) {
        return new t80.c(new e.a("CreditCardApplication"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
    }

    public static sri.m u(Context context) {
        qz4.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m v(Context context) {
        r3d.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static xe0.e w(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "insurance_home", mapper, 0, null, 56);
    }

    public static xe0.e x(je0.d objectMapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        e0.Companion.getClass();
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.c(storageFactory, databaseSessionProvider, "SUBACCOUNT_DATA_MODULE", objectMapper, 1, 16);
    }

    public static c90.c y(BaseScreen screen) {
        qy4.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new c90.c(screen.m2());
    }

    public static ibh.b z(ibh.c cVar) {
        ibh.b bVar = (ibh.b) cVar.b();
        vc.s.k(bVar);
        return bVar;
    }
}
