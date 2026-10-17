package us6;

import android.content.Context;
import androidx.work.WorkManager;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.network.services.FreelancerInvoiceService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerOnboardingService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerPartnerService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerPaymentsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerProTrackService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerProductArticleService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerPromptService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerSettingsFeaturesService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerSettlementService;
import com.revolut.feature.payments.impl.interactor.qr.QrCodeService;
import com.revolut.feature.trading.impl.data.network.TradingTransactionsService;
import com.revolut.feature.wealth.analytics.insights.repository.database.PortfolioInsightsDatabase;
import com.revolut.feature_exchange.impl.network.service.FxService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w3 implements e4m.e {
    public static v8k.a A(v8k.j jVar) {
        v8k.a aVar = (v8k.a) jVar.b();
        vc.s.k(aVar);
        return aVar;
    }

    public static v8k.h B(v8k.m mVar) {
        v8k.h hVar = (v8k.h) mVar.b();
        vc.s.k(hVar);
        return hVar;
    }

    public static kyk.y C(kyk.a0 a0Var) {
        kyk.y yVar = (kyk.y) a0Var.b();
        vc.s.k(yVar);
        return yVar;
    }

    public static TradingTransactionsService D(v3f.a aVar, Retrofit retrofit) {
        TradingTransactionsService tradingTransactionsService = (TradingTransactionsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TradingTransactionsService.class, "create(...)");
        vc.s.k(tradingTransactionsService);
        return tradingTransactionsService;
    }

    public static b6b.f a(a31.a aVar, r5a.b bVar) {
        return new b6b.f(aVar, bVar, 7);
    }

    public static PortfolioInsightsDatabase b(z70.a contextProvider, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory, ImmutableSet typeConverters) {
        uwg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        PortfolioInsightsDatabase.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        PortfolioInsightsDatabase portfolioInsightsDatabase = (PortfolioInsightsDatabase) ce0.a.b(new qpj.a(contextProvider, databaseEncryptionMigratorFactory, databaseSessionProvider, typeConverters, 1));
        vc.s.k(portfolioInsightsDatabase);
        return portfolioInsightsDatabase;
    }

    public static FreelancerPartnerService c(v3 v3Var, Retrofit retrofit) {
        FreelancerPartnerService freelancerPartnerService = (FreelancerPartnerService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerPartnerService.class, "create(...)");
        vc.s.k(freelancerPartnerService);
        return freelancerPartnerService;
    }

    public static FreelancerPaymentsService d(v3 v3Var, Retrofit retrofit) {
        FreelancerPaymentsService freelancerPaymentsService = (FreelancerPaymentsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerPaymentsService.class, "create(...)");
        vc.s.k(freelancerPaymentsService);
        return freelancerPaymentsService;
    }

    public static FreelancerProTrackService e(v3 v3Var, Retrofit retrofit) {
        FreelancerProTrackService freelancerProTrackService = (FreelancerProTrackService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerProTrackService.class, "create(...)");
        vc.s.k(freelancerProTrackService);
        return freelancerProTrackService;
    }

    public static FreelancerProductArticleService f(v3 v3Var, Retrofit retrofit) {
        FreelancerProductArticleService freelancerProductArticleService = (FreelancerProductArticleService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerProductArticleService.class, "create(...)");
        vc.s.k(freelancerProductArticleService);
        return freelancerProductArticleService;
    }

    public static FreelancerPromptService g(v3 v3Var, Retrofit retrofit) {
        FreelancerPromptService freelancerPromptService = (FreelancerPromptService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerPromptService.class, "create(...)");
        vc.s.k(freelancerPromptService);
        return freelancerPromptService;
    }

    public static FreelancerSettingsFeaturesService h(v3 v3Var, Retrofit retrofit) {
        FreelancerSettingsFeaturesService freelancerSettingsFeaturesService = (FreelancerSettingsFeaturesService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerSettingsFeaturesService.class, "create(...)");
        vc.s.k(freelancerSettingsFeaturesService);
        return freelancerSettingsFeaturesService;
    }

    public static FreelancerSettlementService i(v3 v3Var, Retrofit retrofit) {
        FreelancerSettlementService freelancerSettlementService = (FreelancerSettlementService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerSettlementService.class, "create(...)");
        vc.s.k(freelancerSettlementService);
        return freelancerSettlementService;
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        v0i.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "fx_exchanges", mapper, 2, zhm.u.c(new d1i.a()), 32);
    }

    public static FxService k(v0i.j jVar, Retrofit retrofit) {
        FxService fxService = (FxService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FxService.class, "create(...)");
        vc.s.k(fxService);
        return fxService;
    }

    public static kg.o l(kg.o gson) {
        ut9.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        he0.m mVarB = he0.m.b(xt9.c.class, "formatType");
        mVarB.c(xt9.a.class, "LINK");
        mVarB.c(xt9.i.class, "STRUCTURED");
        Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
        pVar.e.add(mVarB);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static FreelancerInvoiceService m(v3 v3Var, Retrofit retrofit) {
        FreelancerInvoiceService freelancerInvoiceService = (FreelancerInvoiceService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerInvoiceService.class, "create(...)");
        vc.s.k(freelancerInvoiceService);
        return freelancerInvoiceService;
    }

    public static sri.m n(Context context) {
        v0i.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static FreelancerOnboardingService o(v3 v3Var, Retrofit retrofit) {
        FreelancerOnboardingService freelancerOnboardingService = (FreelancerOnboardingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerOnboardingService.class, "create(...)");
        vc.s.k(freelancerOnboardingService);
        return freelancerOnboardingService;
    }

    public static twg.c p(PortfolioInsightsDatabase db8) {
        uwg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        twg.c cVarG = db8.g();
        vc.s.k(cVarG);
        return cVarG;
    }

    public static QrCodeService q(Retrofit retrofit) {
        ut9.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(QrCodeService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        QrCodeService qrCodeService = (QrCodeService) objCreate;
        vc.s.k(qrCodeService);
        return qrCodeService;
    }

    public static Retrofit r(kg.o gson, Retrofit retrofit) {
        ut9.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
    }

    public static FreelancerService s(v3 v3Var, Retrofit retrofit) {
        FreelancerService freelancerService = (FreelancerService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerService.class, "create(...)");
        vc.s.k(freelancerService);
        return freelancerService;
    }

    public static gld.p0 t(mkd.g view, sri.m navigator, tpi.j progressView, r3l.a shotView, k3l.b statusDialogView, rkd.n factory) {
        v2i.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(shotView, "shotView");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(view, navigator, progressView, statusDialogView, shotView);
    }

    public static xe0.e u(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        y3.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "freelancer", mapper, 9, zhm.v.k(new eu6.b(), new eu6.c(), new eu6.d(), new eu6.e(), new eu6.f(), new eu6.g(), new eu6.h(), new eu6.i()), 32);
    }

    public static xe0.e v(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        ut9.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "payments_preferences", mapper, 0, null, 56);
    }

    public static mae.o w(mae.p factory, com.revolut.kompot.navigable.a controller, t70.b currenciesLocalization) {
        uv4.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.c(new f01.c(controller.m2()), currenciesLocalization);
    }

    public static WorkManager x(z70.a contextProvider) {
        v8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        WorkManager companion = WorkManager.INSTANCE.getInstance(contextProvider.getContext());
        vc.s.k(companion);
        return companion;
    }

    public static vxc.i y(vxc.j jVar) {
        vxc.i iVar = (vxc.i) jVar.b();
        vc.s.k(iVar);
        return iVar;
    }

    public static v0i.b z(v0i.g gVar) {
        v0i.b bVar = (v0i.b) gVar.b();
        vc.s.k(bVar);
        return bVar;
    }
}
