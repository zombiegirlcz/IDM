package l70;

import android.content.Context;
import android.net.Uri;
import androidx.appcompat.view.ContextThemeWrapper;
import com.revolut.core.chaosmanagement.data.network.ChaosManagementService;
import com.revolut.core.ui_kit_resources.R$style;
import com.revolut.feature.revpro.card_reader.order.impl.data.service.CardReaderOrdersService;
import com.revolut.shared.feature.suspicious_transaction.impl.data.service.SuspiciousTransactionService;
import com.revolut.sso.impl.network.services.AppConsentService;
import com.revolut.sso.impl.network.services.AuthenticationService;
import com.revolut.sso.impl.network.services.ClaimsService;
import com.revolut.sso.impl.network.services.ConfigurationService;
import com.revolut.sso.impl.network.services.SocialAccountIdsService;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ld1.c0;
import ld1.e0;
import ljl.r1;
import ljl.t1;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import skm.p0;
import u80.v;

/* JADX INFO: loaded from: classes19.dex */
public abstract class h implements e4m.e {
    public static CardReaderOrdersService A(Retrofit retrofit) {
        lfc.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CardReaderOrdersService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CardReaderOrdersService cardReaderOrdersService = (CardReaderOrdersService) objCreate;
        vc.s.k(cardReaderOrdersService);
        return cardReaderOrdersService;
    }

    public static ve0.c B(je0.d mapper, xe0.f storageFactory) {
        led.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "shared_alerts_storage", mapper, 8);
    }

    public static mj8.b C(mj8.i iVar) {
        mj8.b bVar = (mj8.b) iVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static SuspiciousTransactionService D(kg.o baseGson, Retrofit baseRetrofit) {
        lal.o.Companion.getClass();
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        Intrinsics.checkNotNullParameter(baseRetrofit, "baseRetrofit");
        kg.p pVar = new kg.p(baseGson);
        pVar.e.add(new qal.b());
        kg.o oVarB = pVar.b();
        Retrofit.Builder builderNewBuilder = baseRetrofit.newBuilder();
        builderNewBuilder.converterFactories().clear();
        builderNewBuilder.addConverterFactory(GsonConverterFactory.create(oVarB));
        Object objCreate = builderNewBuilder.build().create(SuspiciousTransactionService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SuspiciousTransactionService suspiciousTransactionService = (SuspiciousTransactionService) objCreate;
        vc.s.k(suspiciousTransactionService);
        return suspiciousTransactionService;
    }

    public static z a(r2d.t factory) {
        lc7.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new z(factory.f251121a, new r2d.p(factory.f251122b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n b(jg9.g extension) {
        lg9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n c(jg9.q extension) {
        lg9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        return nVar;
    }

    public static g80.c d(g gVar, g80.a helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        return helper;
    }

    public static AppConsentService e(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AppConsentService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AppConsentService appConsentService = (AppConsentService) objCreate;
        vc.s.k(appConsentService);
        return appConsentService;
    }

    public static kkl.b f(kg.o gson, e4m.a sessionTokenRepositoryProvider) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(sessionTokenRepositoryProvider, "sessionTokenRepositoryProvider");
        return new kkl.b(gson, sessionTokenRepositoryProvider);
    }

    public static AuthenticationService g(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AuthenticationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AuthenticationService authenticationService = (AuthenticationService) objCreate;
        vc.s.k(authenticationService);
        return authenticationService;
    }

    public static md0.b h(ld0.a aVar, md0.e interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    public static gd0.f i(ld0.a aVar, gd0.f repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return repository;
    }

    public static ChaosManagementService j(ld0.a aVar, md0.a dependenciesProvider) {
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Object objCreate = ((nj0.d) ((mp.n) dependenciesProvider).f207706a.j()).f().create(ChaosManagementService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ChaosManagementService chaosManagementService = (ChaosManagementService) objCreate;
        vc.s.k(chaosManagementService);
        return chaosManagementService;
    }

    public static ClaimsService k(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ClaimsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ClaimsService claimsService = (ClaimsService) objCreate;
        vc.s.k(claimsService);
        return claimsService;
    }

    public static ConfigurationService l(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ConfigurationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ConfigurationService configurationService = (ConfigurationService) objCreate;
        vc.s.k(configurationService);
        return configurationService;
    }

    public static c90.c m(Context context) {
        c0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new c90.c(new ContextThemeWrapper(context, R$style.UiKitColorsTheme_Day));
    }

    public static c90.c n(Context context) {
        e0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new c90.c(new ContextThemeWrapper(context, R$style.UiKitColorsTheme_Day));
    }

    public static w80.a o(qd0.b languageProvider) {
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.f286701a.a(languageProvider, true, false, false, true, false);
    }

    public static w80.b p(qd0.b languageProvider) {
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 62);
    }

    public static SocialAccountIdsService q(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SocialAccountIdsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SocialAccountIdsService socialAccountIdsService = (SocialAccountIdsService) objCreate;
        vc.s.k(socialAccountIdsService);
        return socialAccountIdsService;
    }

    public static xj0.f r(wj0.a idempotencyKeyHolder, sf0.h serverErrorParser) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        return new xj0.f(idempotencyKeyHolder, serverErrorParser);
    }

    public static t70.h s(Context context, t70.i localizationContextWrapper) {
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localizationContextWrapper, "localizationContextWrapper");
        return ((t70.j) localizationContextWrapper).a(context);
    }

    public static ikl.b t(rj0.a appNetworkToggles) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(appNetworkToggles, "appNetworkToggles");
        return new ikl.b(appNetworkToggles);
    }

    public static Uri u(g gVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
        Intrinsics.checkNotNullExpressionValue(uriFromParts, "fromParts(...)");
        vc.s.k(uriFromParts);
        return uriFromParts;
    }

    public static yem.h v(Context context) {
        q.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        yem.h hVarB = yem.h.b(context);
        Intrinsics.checkNotNullExpressionValue(hVarB, "createInstance(...)");
        return hVarB;
    }

    public static v w(qd0.b languageProvider) {
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return new v(languageProvider);
    }

    public static void x(Retrofit retrofit) {
        lal.o.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
    }

    public static CoroutineScope y(r1 r1Var) {
        return rd0.e.a(p0.f264003c);
    }

    public static aod.a z(r1 r1Var) {
        return new aod.a(skm.z.f264021a, 4);
    }
}
