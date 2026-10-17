package e5f;

import android.content.Context;
import c3d.d;
import c84.z;
import com.revolut.feature.cards_core.impl.data.network.promotions.CardPromotionsService;
import com.revolut.feature.cards_core.impl.data.network.revolutcard.RevolutCardScaService;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.notification_centre.impl.data.retrofit.service.ArticleService;
import com.revolut.feature.notification_centre.impl.data.retrofit.service.NotificationCentreService;
import com.revolut.feature.support.impl.data.network.service.SupportService;
import com.revolut.retail.feature.pricing_plans.impl.network.CreditPlansService;
import com.revolut.retail.feature.pricing_plans.impl.network.FamilyPlanService;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanCancelService;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanSubscriptionsService;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanWorkflowService;
import com.revolut.retail.feature.pricing_plans.impl.network.StudentPlanService;
import e4m.e;
import e79.m;
import e84.i;
import ecm.q;
import ede.h;
import efk.g;
import gfk.k;
import gfk.l;
import hz3.c;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;
import xe0.f;
import xq3.j;
import yji.n;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b implements e {
    public static PricingPlanWorkflowService A(g gVar, Retrofit retrofit) {
        PricingPlanWorkflowService pricingPlanWorkflowService = (PricingPlanWorkflowService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PricingPlanWorkflowService.class, "create(...)");
        s.k(pricingPlanWorkflowService);
        return pricingPlanWorkflowService;
    }

    public static RevolutCardScaService B(ea3.e eVar, Retrofit retrofit) {
        RevolutCardScaService revolutCardScaService = (RevolutCardScaService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevolutCardScaService.class, "create(...)");
        s.k(revolutCardScaService);
        return revolutCardScaService;
    }

    public static StudentPlanService C(g gVar, Retrofit retrofit) {
        StudentPlanService studentPlanService = (StudentPlanService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", StudentPlanService.class, "create(...)");
        s.k(studentPlanService);
        return studentPlanService;
    }

    public static SupportService D(Retrofit retrofit) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SupportService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SupportService supportService = (SupportService) objCreate;
        s.k(supportService);
        return supportService;
    }

    public static n a(z controllerModelExtension) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        s.k(controllerModelExtension);
        return controllerModelExtension;
    }

    public static add.b b(q qVar) {
        return new add.b(qVar, 1);
    }

    public static d c(a31.a aVar, a31.a aVar2) {
        return new d(aVar, aVar2, 2);
    }

    public static c84.a d(com.revolut.kompot.navigable.a controller, c84.b controllerModel, PluginFlowContract$Input inputData) {
        e84.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new c84.a(controller, controllerModel, inputData);
    }

    public static c84.a e(com.revolut.kompot.navigable.a controller, c84.b controllerModel, PluginFlowContract$Input inputData) {
        e84.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new c84.a(controller, controllerModel, inputData);
    }

    public static ArticleService f(m mVar, Retrofit retrofit) {
        ArticleService articleService = (ArticleService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ArticleService.class, "create(...)");
        s.k(articleService);
        return articleService;
    }

    public static CardPromotionsService g(ea3.e eVar, Retrofit retrofit) {
        CardPromotionsService cardPromotionsService = (CardPromotionsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CardPromotionsService.class, "create(...)");
        s.k(cardPromotionsService);
        return cardPromotionsService;
    }

    public static xe0.e h(je0.d mapper, f storageFactory, yk0.a databaseSecurityProvider) {
        ea3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSecurityProvider, "cards_promotions", mapper, 0, null, 56);
    }

    public static CreditPlansService i(g gVar, Retrofit retrofit) {
        CreditPlansService creditPlansService = (CreditPlansService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditPlansService.class, "create(...)");
        s.k(creditPlansService);
        return creditPlansService;
    }

    public static xe0.e j(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        efk.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "credit_plans", mapper, 0, null, 56);
    }

    public static FamilyPlanService k(g gVar, Retrofit retrofit) {
        FamilyPlanService familyPlanService = (FamilyPlanService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FamilyPlanService.class, "create(...)");
        s.k(familyPlanService);
        return familyPlanService;
    }

    public static xe0.e l(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        efk.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "family_plan", mapper, 3, v.k(new rfk.a(), new exa.a(2, 3, 5)), 32);
    }

    public static o m(m mVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        pVar.c(t69.b.f268269a, a79.n.class);
        pVar.c(t69.d.f268270a, a79.p.class);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static o n(o gson) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        pVar.c(new zce.a(), bde.q.class);
        pVar.c(new zce.b(), bde.q.class);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit o(m mVar, Retrofit retrofit, o oVar) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "gson");
        builderX.converterFactories().clear();
        builderX.converterFactories().add(GsonConverterFactory.create(oVar));
        Retrofit retrofitBuild = builderX.build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static Retrofit p(o gson, Retrofit retrofit) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
    }

    public static o q(o gson) {
        efk.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        pVar.c(new l(), k.class);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static sri.m r(Context context) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static xe0.e s(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        e79.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "NOTIFICATION_CENTRE_SECURE_STORAGE_NAME", mapper, 0, null, 56);
    }

    public static NotificationCentreService t(m mVar, Retrofit retrofit) {
        NotificationCentreService notificationCentreService = (NotificationCentreService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", NotificationCentreService.class, "create(...)");
        s.k(notificationCentreService);
        return notificationCentreService;
    }

    public static le0.a u(o gson, le0.b gsonObjectMapperFactory) {
        efk.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        return gsonObjectMapperFactory.a(gson);
    }

    public static PricingPlanCancelService v(g gVar, Retrofit retrofit) {
        PricingPlanCancelService pricingPlanCancelService = (PricingPlanCancelService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PricingPlanCancelService.class, "create(...)");
        s.k(pricingPlanCancelService);
        return pricingPlanCancelService;
    }

    public static e84.e w(PluginFlowContract$Input inputData, c84.g pluginControllerModelExtension, xa4.a creditApplicationErrorHandlerExtension, gte.a featureToggleInteractor, c creditApplicationCommandsFactory, j creditAcknowledgementInteractor, w revolutJobInteractor, hy3.j otherCreditProductsAvailabilityInteractor, vie.i tabCreditPreferencesInteractor) {
        e84.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerModelExtension, "pluginControllerModelExtension");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerExtension, "creditApplicationErrorHandlerExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(creditAcknowledgementInteractor, "creditAcknowledgementInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(otherCreditProductsAvailabilityInteractor, "otherCreditProductsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tabCreditPreferencesInteractor, "tabCreditPreferencesInteractor");
        return new e84.e(inputData, pluginControllerModelExtension, creditApplicationErrorHandlerExtension, featureToggleInteractor, creditApplicationCommandsFactory, creditAcknowledgementInteractor, revolutJobInteractor, otherCreditProductsAvailabilityInteractor, tabCreditPreferencesInteractor);
    }

    public static c84.w x(z controllerModel) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        return new c84.w(controllerModel);
    }

    public static xe0.e y(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        e79.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "NOTIFICATION_POPUPS_SECURE_STORAGE_NAME", mapper, 0, null, 56);
    }

    public static PricingPlanSubscriptionsService z(g gVar, Retrofit retrofit) {
        PricingPlanSubscriptionsService pricingPlanSubscriptionsService = (PricingPlanSubscriptionsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PricingPlanSubscriptionsService.class, "create(...)");
        s.k(pricingPlanSubscriptionsService);
        return pricingPlanSubscriptionsService;
    }
}
