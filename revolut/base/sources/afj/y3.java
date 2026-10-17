package afj;

import com.revolut.feature.external_accounts.impl.repository.network.IndiaNetBankingService;
import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberCheckoutService;
import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberPortingService;
import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberService;
import com.revolut.retail.feature.esim.impl.network.EsimPlanOffersService;
import com.revolut.retail.feature.esim.impl.network.EsimProfilesService;
import com.revolut.retail.feature.esim.impl.network.EsimStatementsService;
import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsRefundQuoteService;
import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsService;
import com.revolut.retail.feature.esim.impl.network.EsimWidgetsConfigService;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y3 implements e4m.e {
    public static xe0.e A(je0.d mapper, xe0.f storageFactory, yk0.a dbSessionProvider) {
        ag6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, dbSessionProvider, "india_netbanking_institutions_storage", mapper, 0, null, 56);
    }

    public static IndiaNetBankingService B(Retrofit retrofit) {
        ag6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(IndiaNetBankingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        IndiaNetBankingService indiaNetBankingService = (IndiaNetBankingService) objCreate;
        vc.s.k(indiaNetBankingService);
        return indiaNetBankingService;
    }

    public static lhk.e0 C(agk.a aVar, mhk.a factory, xfk.b planDurableTermsControllerExtension, bgk.a planTermsWorkflowControllerExtension, wfk.a globalPlansControllerExtension) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(globalPlansControllerExtension, "globalPlansControllerExtension");
        return factory.a(planTermsWorkflowControllerExtension, planDurableTermsControllerExtension, globalPlansControllerExtension);
    }

    public static ohk.g D(agk.a aVar, ohk.a factory) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a();
    }

    public static e4 a(a31.a aVar, a31.a aVar2, a31.a aVar3, xs6.a aVar4, a31.a aVar5, a31.a aVar6) {
        return new e4(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static ehk.g b(agk.a aVar, fhk.a factory) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a();
    }

    public static xe0.e c(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "esim_banners", mapper, 0, null, 56);
    }

    public static xe0.e d(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "esim_configuration", mapper, 3, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5)), 32);
    }

    public static xe0.e e(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "esim_data_plans", mapper, 6, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5), new exa.a(4, 5, 5), new exa.a(5, 6, 5)), 32);
    }

    public static xe0.e f(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "esim_events", mapper, 0, null, 56);
    }

    public static xe0.e g(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "esim_gifting", mapper, 0, null, 56);
    }

    public static xe0.e h(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "esim_help_terms", mapper, 0, null, 56);
    }

    public static xe0.e i(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "esim_home_config", mapper, 0, null, 56);
    }

    public static EsimPhoneNumberCheckoutService j(x3 x3Var, Retrofit retrofit) {
        EsimPhoneNumberCheckoutService esimPhoneNumberCheckoutService = (EsimPhoneNumberCheckoutService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimPhoneNumberCheckoutService.class, "create(...)");
        vc.s.k(esimPhoneNumberCheckoutService);
        return esimPhoneNumberCheckoutService;
    }

    public static EsimPhoneNumberPortingService k(x3 x3Var, Retrofit retrofit) {
        EsimPhoneNumberPortingService esimPhoneNumberPortingService = (EsimPhoneNumberPortingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimPhoneNumberPortingService.class, "create(...)");
        vc.s.k(esimPhoneNumberPortingService);
        return esimPhoneNumberPortingService;
    }

    public static EsimPhoneNumberService l(x3 x3Var, Retrofit retrofit) {
        EsimPhoneNumberService esimPhoneNumberService = (EsimPhoneNumberService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimPhoneNumberService.class, "create(...)");
        vc.s.k(esimPhoneNumberService);
        return esimPhoneNumberService;
    }

    public static xe0.e m(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "esim_phone_number", mapper, 3, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5)), 32);
    }

    public static EsimPlanOffersService n(x3 x3Var, Retrofit retrofit) {
        EsimPlanOffersService esimPlanOffersService = (EsimPlanOffersService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimPlanOffersService.class, "create(...)");
        vc.s.k(esimPlanOffersService);
        return esimPlanOffersService;
    }

    public static xe0.e o(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "esim_plan_offers", mapper, 0, null, 56);
    }

    public static EsimProfilesService p(x3 x3Var, Retrofit retrofit) {
        EsimProfilesService esimProfilesService = (EsimProfilesService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimProfilesService.class, "create(...)");
        vc.s.k(esimProfilesService);
        return esimProfilesService;
    }

    public static xe0.e q(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "esim_profiles", mapper, 6, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5), new exa.a(4, 5, 5), new exa.a(5, 6, 5)), 32);
    }

    public static Retrofit r(x3 x3Var, Retrofit baseRetrofit, OkHttpClient okHttpClient, com.revolut.retail.feature.esim.impl.network.interceptor.c esimRestrictionInterceptor) {
        Intrinsics.checkNotNullParameter(baseRetrofit, "baseRetrofit");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(esimRestrictionInterceptor, "esimRestrictionInterceptor");
        Retrofit.Builder builderNewBuilder = baseRetrofit.newBuilder();
        OkHttpClient.a aVarA = okHttpClient.a();
        aVarA.a(esimRestrictionInterceptor);
        Retrofit retrofitBuild = builderNewBuilder.client(new OkHttpClient(aVarA)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        vc.s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static EsimStatementsService s(x3 x3Var, Retrofit retrofit) {
        EsimStatementsService esimStatementsService = (EsimStatementsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimStatementsService.class, "create(...)");
        vc.s.k(esimStatementsService);
        return esimStatementsService;
    }

    public static EsimSubscriptionsRefundQuoteService t(x3 x3Var, Retrofit retrofit) {
        EsimSubscriptionsRefundQuoteService esimSubscriptionsRefundQuoteService = (EsimSubscriptionsRefundQuoteService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimSubscriptionsRefundQuoteService.class, "create(...)");
        vc.s.k(esimSubscriptionsRefundQuoteService);
        return esimSubscriptionsRefundQuoteService;
    }

    public static EsimSubscriptionsService u(x3 x3Var, Retrofit retrofit) {
        EsimSubscriptionsService esimSubscriptionsService = (EsimSubscriptionsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimSubscriptionsService.class, "create(...)");
        vc.s.k(esimSubscriptionsService);
        return esimSubscriptionsService;
    }

    public static xe0.e v(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "esim_subscriptions", mapper, 11, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5), new exa.a(4, 5, 5), new exa.a(5, 6, 5), new exa.a(6, 7, 5), new exa.a(7, 8, 5), new exa.a(8, 9, 5), new exa.a(9, 10, 5), new exa.a(10, 11, 5)), 32);
    }

    public static xe0.e w(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "esim_terms", mapper, 2, zhm.u.c(new exa.a(1, 2, 5)), 32);
    }

    public static EsimWidgetsConfigService x(x3 x3Var, Retrofit retrofit) {
        EsimWidgetsConfigService esimWidgetsConfigService = (EsimWidgetsConfigService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimWidgetsConfigService.class, "create(...)");
        vc.s.k(esimWidgetsConfigService);
        return esimWidgetsConfigService;
    }

    public static xe0.e y(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a4.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "esim_widgets_config", mapper, 0, null, 56);
    }

    public static dhk.e z(agk.a aVar, dhk.a factory) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new dhk.e(factory.f114822a);
    }
}
