package qgh;

import a2d.m;
import android.content.Context;
import bjk.d;
import bjk.x0;
import bjk.y0;
import bjk.z0;
import com.revolut.core.network.retrofit.RawUrlRequestService;
import com.revolut.feature.junior_onboarding.impl.service.JuniorDetailsValidationService;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.PricingPlanUiService;
import e4m.e;
import ecm.q;
import ffk.t;
import java.io.File;
import java.util.Set;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import ljk.d;
import ljk.l;
import ljk.m;
import okhttp3.OkHttpClient;
import qgk.a4;
import qgk.m3;
import qgk.p3;
import qgk.q3;
import qgk.y3;
import qh8.u;
import qj0.f;
import qj0.h;
import qjb.i;
import ql7.e2;
import ql7.j2;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;
import wli.x;
import yji.n;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c implements e {
    public static tpb.a A(i factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new tpb.a();
    }

    public static spb.a B(i factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new spb.a();
    }

    public static ypb.a C(i factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new ypb.a();
    }

    public static zpb.a D(i factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new zpb.a();
    }

    public static a16.b a(a31.a aVar, q qVar) {
        return new a16.b(qVar, aVar, 13);
    }

    public static m b(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new m(aVar, aVar2, aVar3, 23);
    }

    public static qd2.b c(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, of3.e eVar, of3.e eVar2) {
        return new qd2.b(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, eVar, eVar2);
    }

    public static m3 d(q qVar, a31.a aVar, of3.e eVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13) {
        return new m3(qVar, aVar, eVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13);
    }

    public static q3 e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new q3(aVar, aVar2, aVar3, aVar4);
    }

    public static e2 f(a31.a aVar, a31.a aVar2) {
        return new e2(aVar, aVar2);
    }

    public static OkHttpClient g(xj0.i okHttpClientFactory) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        return xj0.i.a(okHttpClientFactory, 30L, false, false, null, null, null, 254);
    }

    public static com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b h(x deeplinkHandler, ajk.b outOfAppNavigationProvider, zfk.c planSubscriberControllerModelExtension, ma3.a orderNewCardNavigationCommandFactory, t pricingPlanInteractor, ylk.a statusDialogConfigProvider) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(orderNewCardNavigationCommandFactory, "orderNewCardNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(statusDialogConfigProvider, "statusDialogConfigProvider");
        return new com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b(deeplinkHandler, outOfAppNavigationProvider, planSubscriberControllerModelExtension, orderNewCardNavigationCommandFactory, pricingPlanInteractor, statusDialogConfigProvider);
    }

    public static File i(Context context) {
        j2.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(new File(context.getCacheDir(), zk0.a.INTERNAL_CACHE.a()), "car_insurance");
    }

    public static Set j(qhk.d dVar, zfk.c planSubscriberControllerModelExtension, xfk.b planDurableTermsControllerExtension, bgk.a planTermsWorkflowControllerExtension, wfk.a globalPlansControllerExtension) {
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(globalPlansControllerExtension, "globalPlansControllerExtension");
        n[] elements = {planSubscriberControllerModelExtension, planDurableTermsControllerExtension, planTermsWorkflowControllerExtension, globalPlansControllerExtension};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static o k(qlc.a aVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        Intrinsics.checkNotNullExpressionValue(pVar, "newBuilder(...)");
        ged.a.b(pVar);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit l(y3 y3Var, Retrofit retrofit, o oVar) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "pricingPlansGson");
        builderX.converterFactories().clear();
        Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static o m(o baseGson, cjk.i gsonProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(baseGson, "gson");
        Intrinsics.checkNotNullParameter(gsonProvider, "gsonProvider");
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        p pVar = new p(baseGson);
        pVar.c(new ljk.n(), ljk.m.class);
        pVar.c(new l(), m.b.e.class);
        pVar.c(new ljk.c(), ljk.d.class);
        pVar.c(new ljk.a(), d.g.a.class);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static String n(Retrofit retrofit) {
        j2.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        String str = retrofit.baseUrl().i;
        s.k(str);
        return str;
    }

    public static JuniorDetailsValidationService o(Retrofit retrofit) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(JuniorDetailsValidationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorDetailsValidationService juniorDetailsValidationService = (JuniorDetailsValidationService) objCreate;
        s.k(juniorDetailsValidationService);
        return juniorDetailsValidationService;
    }

    public static xe0.e p(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        qh8.x.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_onboarding_workflow", mapper, 1, f0.f322471a, 32);
    }

    public static sri.m q(Context context) {
        p3.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static le0.a r(o gson, le0.b gsonObjectMapperFactory) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        return gsonObjectMapperFactory.a(gson);
    }

    public static PricingPlanUiService s(y3 y3Var, Retrofit retrofit) {
        PricingPlanUiService pricingPlanUiService = (PricingPlanUiService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PricingPlanUiService.class, "create(...)");
        s.k(pricingPlanUiService);
        return pricingPlanUiService;
    }

    public static o t(y3 y3Var, o baseGson, cjk.i gsonProvider) {
        Intrinsics.checkNotNullParameter(baseGson, "gson");
        Intrinsics.checkNotNullParameter(gsonProvider, "gsonProvider");
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        p pVar = new p(baseGson);
        pVar.c(new z0(), y0.class);
        pVar.c(new x0(), y0.b.e.class);
        pVar.c(new bjk.f(), bjk.d.class);
        pVar.c(new bjk.c(), d.C0102d.a.class);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static xe0.e u(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "pricing_plan_ui", mapper, 0, null, 56);
    }

    public static RawUrlRequestService v(Retrofit retrofit) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(RawUrlRequestService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RawUrlRequestService rawUrlRequestService = (RawUrlRequestService) objCreate;
        s.k(rawUrlRequestService);
        return rawUrlRequestService;
    }

    public static Set w(b bVar) {
        h0 h0Var = h0.f322473a;
        s.k(h0Var);
        return h0Var;
    }

    public static ij0.d x(ij0.a networkConfiguration, x60.a accountRegionProvider) {
        qj0.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(accountRegionProvider, "accountRegionProvider");
        return new ij0.d(networkConfiguration.getBaseUrl(), networkConfiguration.getRevolutHosts(), accountRegionProvider);
    }

    public static qpb.c y(i factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        ppb.a aVar = (ppb.a) factory;
        return new qpb.c(aVar.f238310a, aVar.f238311b, aVar.o);
    }

    public static upb.a z(i factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new upb.a();
    }
}
