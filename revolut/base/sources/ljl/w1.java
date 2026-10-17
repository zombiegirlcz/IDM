package ljl;

import android.content.Context;
import com.revolut.feature.rewards.shops.impl.data.network.services.LifestyleWidgetService;
import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import com.revolut.sso.impl.data.db.SsoDatabase;
import com.revolut.sso.impl.network.services.QrSignInService;
import com.revolut.sso.impl.network.services.SignOutService;
import com.revolut.sso.impl.network.services.SignUpService;
import com.revolut.sso.impl.network.services.UserActivityService;
import com.revolut.sso.impl.network.services.UserInfoService;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes12.dex */
public abstract class w1 implements e4m.e {
    public static t81.a A(a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar) {
        return new t81.a(aVar, aVar2, aVar3, qVar);
    }

    public static if0.a B(o81.a aVar) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(aVar.f222898g, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(aVar.f, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static mn8.b C(mn8.u uVar) {
        mn8.b bVar = (mn8.b) uVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static b60.a a(t81.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(t81.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(e91.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f123821a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(n81.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a e(t81.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f268797g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(t81.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f268797g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static tjl.b g(y1 y1Var, SsoDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        tjl.b bVarG = database.g();
        vc.s.k(bVarG);
        return bVarG;
    }

    public static kg.o h(lkc.b bVar, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.o oVarB = new kg.p(gson).b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit i(lkc.b bVar, Retrofit retrofit, kg.o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static Json j(z1 z1Var) {
        Json jsonA = af0.b.a();
        vc.s.k(jsonA);
        return jsonA;
    }

    public static sri.m k(Context context) {
        lne.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static OkHttpClient l(dk0.c factory, kkl.b authenticationInterceptor, kkl.c xForwardedForHeaderInterceptor, bjl.p0 revolutSsoDependenciesProvider) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(authenticationInterceptor, "authenticationInterceptor");
        Intrinsics.checkNotNullParameter(xForwardedForHeaderInterceptor, "xForwardedForHeaderInterceptor");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        if (!((jte.d) ((rqk.k) revolutSsoDependenciesProvider).f).c(RevolutSsoApi$Toggles.XForwardedForHeaderEnabled.f105884a)) {
            xForwardedForHeaderInterceptor = null;
        }
        Interceptor[] elements = {authenticationInterceptor, xForwardedForHeaderInterceptor};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return xj0.i.a(factory, null, false, false, kotlin.collections.d.L(elements), null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
    }

    public static dk0.c m(xj0.f idempotencyInterceptor, ikl.b networkFeatureTogglesProvider, yj0.g appUnlockedCacheInterceptor, yj0.h cacheControlInterceptor, ij0.a configuration, xj0.a connectionErrorWrapperInterceptor, Context context, lj0.b debugInterceptor, nz5.a failoverInterceptor, xj0.d headersInterceptor, bk0.b headersSizeInterceptor, qm0.b integrityCheckInterceptor, yh0.a integrityHeaderInterceptor, ak0.a instrumentationTestDecorator, ak0.c loggingDecorator, yj0.j okHttpCacheProvider, gk0.a okHttpClientValidator, xj0.k oneShotRequestBodyInterceptor, sj0.b overseerInterceptor, ek0.a progressInterceptor, fk0.a proxyRepository, nz5.a regionalHostInterceptor, qm0.i signingInterceptor, qql.b ssoReauthenticationInterceptor, jj0.g twoFactorAuthInterceptor) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(idempotencyInterceptor, "idempotencyInterceptor");
        Intrinsics.checkNotNullParameter(networkFeatureTogglesProvider, "networkFeatureTogglesProvider");
        Intrinsics.checkNotNullParameter(appUnlockedCacheInterceptor, "appUnlockedCacheInterceptor");
        Intrinsics.checkNotNullParameter(cacheControlInterceptor, "cacheControlInterceptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(connectionErrorWrapperInterceptor, "connectionErrorWrapperInterceptor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(debugInterceptor, "debugInterceptor");
        Intrinsics.checkNotNullParameter(failoverInterceptor, "failoverInterceptor");
        Intrinsics.checkNotNullParameter(headersInterceptor, "headersInterceptor");
        Intrinsics.checkNotNullParameter(headersSizeInterceptor, "headersSizeInterceptor");
        Intrinsics.checkNotNullParameter(integrityCheckInterceptor, "integrityCheckInterceptor");
        Intrinsics.checkNotNullParameter(integrityHeaderInterceptor, "integrityHeaderInterceptor");
        Intrinsics.checkNotNullParameter(instrumentationTestDecorator, "instrumentationTestDecorator");
        Intrinsics.checkNotNullParameter(loggingDecorator, "loggingDecorator");
        Intrinsics.checkNotNullParameter(okHttpCacheProvider, "okHttpCacheProvider");
        Intrinsics.checkNotNullParameter(okHttpClientValidator, "okHttpClientValidator");
        Intrinsics.checkNotNullParameter(oneShotRequestBodyInterceptor, "oneShotRequestBodyInterceptor");
        Intrinsics.checkNotNullParameter(overseerInterceptor, "overseerInterceptor");
        Intrinsics.checkNotNullParameter(progressInterceptor, "progressInterceptor");
        Intrinsics.checkNotNullParameter(proxyRepository, "proxyRepository");
        Intrinsics.checkNotNullParameter(regionalHostInterceptor, "regionalHostInterceptor");
        Intrinsics.checkNotNullParameter(signingInterceptor, "signingInterceptor");
        Intrinsics.checkNotNullParameter(ssoReauthenticationInterceptor, "ssoReauthenticationInterceptor");
        Intrinsics.checkNotNullParameter(twoFactorAuthInterceptor, "twoFactorAuthInterceptor");
        ulm.b bVar = ulm.d.f281081a;
        Optional optionalEmpty = Optional.empty();
        Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
        Optional optionalEmpty2 = Optional.empty();
        Intrinsics.checkNotNullExpressionValue(optionalEmpty2, "empty(...)");
        return new dk0.c(appUnlockedCacheInterceptor, bVar, cacheControlInterceptor, configuration, connectionErrorWrapperInterceptor, context, debugInterceptor, failoverInterceptor, headersInterceptor, headersSizeInterceptor, idempotencyInterceptor, integrityCheckInterceptor, integrityHeaderInterceptor, loggingDecorator, networkFeatureTogglesProvider, okHttpCacheProvider, okHttpClientValidator, oneShotRequestBodyInterceptor, overseerInterceptor, progressInterceptor, proxyRepository, regionalHostInterceptor, signingInterceptor, ssoReauthenticationInterceptor, twoFactorAuthInterceptor, instrumentationTestDecorator, optionalEmpty, optionalEmpty2);
    }

    public static QrSignInService n(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(QrSignInService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        QrSignInService qrSignInService = (QrSignInService) objCreate;
        vc.s.k(qrSignInService);
        return qrSignInService;
    }

    public static xe0.e o(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        lkc.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.c(storageFactory, databaseSessionProvider, "shops_rewards_", mapper, 2, 16);
    }

    public static LifestyleWidgetService p(lkc.b bVar, Retrofit retrofit) {
        LifestyleWidgetService lifestyleWidgetService = (LifestyleWidgetService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", LifestyleWidgetService.class, "create(...)");
        vc.s.k(lifestyleWidgetService);
        return lifestyleWidgetService;
    }

    public static SignOutService q(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SignOutService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SignOutService signOutService = (SignOutService) objCreate;
        vc.s.k(signOutService);
        return signOutService;
    }

    public static SignUpService r(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SignUpService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SignUpService signUpService = (SignUpService) objCreate;
        vc.s.k(signUpService);
        return signUpService;
    }

    public static ne0.d s(i2 i2Var) {
        return new ne0.d(ne0.b.HASH);
    }

    public static xe0.e t(i2 i2Var, le0.a mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "sso_client_deeplink_restore", mapper, 0, null, 56);
    }

    public static SsoDatabase u(y1 y1Var, Context context, de0.a databaseEncryptionMigratorFactory, yk0.a databaseSessionProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        SsoDatabase.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        SsoDatabase ssoDatabase = (SsoDatabase) ce0.a.b(new cy9.e(context, databaseEncryptionMigratorFactory, databaseSessionProvider, 1));
        vc.s.k(ssoDatabase);
        return ssoDatabase;
    }

    public static xe0.e v(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        lne.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "tax_exemption", mapper, 0, null, 56);
    }

    public static xe0.e w(i2 i2Var, je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "sso_shared_preferences", mapper, 0, null, 56);
    }

    public static UserActivityService x(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(UserActivityService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        UserActivityService userActivityService = (UserActivityService) objCreate;
        vc.s.k(userActivityService);
        return userActivityService;
    }

    public static tjl.d y(y1 y1Var, SsoDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        tjl.d dVarH = database.h();
        vc.s.k(dVarH);
        return dVarH;
    }

    public static UserInfoService z(Retrofit retrofit) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(UserInfoService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        UserInfoService userInfoService = (UserInfoService) objCreate;
        vc.s.k(userInfoService);
        return userInfoService;
    }
}
