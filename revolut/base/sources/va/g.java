package va;

import android.content.Context;
import com.feature.user.details.impl.network.UserDetailsService;
import com.revolut.feature.credit.application.impl.network.CreditEntryPointsService;
import com.revolut.feature.credit.application.impl.network.CreditExternalClientMonitoringService;
import com.revolut.feature.credit.application.impl.network.CreditLimitIncreaseService;
import com.revolut.feature.junior_referrals.impl.services.JuniorReferralsService;
import com.revolut.feature.security_hub.impl.network.LinkedWalletsService;
import com.youTransactor.uCube.rpc.Constants;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import sri.m;
import tnb.g0;
import uqh.l0;
import uqh.o;
import uqh.r;
import uqh.u;
import usb.p;
import vc.s;
import vtc.n0;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public abstract class g implements e4m.e {
    public static xe0.e A(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "backend_driven_profile", mapper, 1, f0.f322471a, 32);
    }

    public static UserDetailsService B(Retrofit retrofit) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(UserDetailsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        UserDetailsService userDetailsService = (UserDetailsService) objCreate;
        s.k(userDetailsService);
        return userDetailsService;
    }

    public static avk.j C(r delegates) {
        vqh.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        return new avk.j(delegates, 28);
    }

    public static usb.s D(vsb.a aVar, g0 factory, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        return new usb.s(amountFormatter, (p) factory.f272384b);
    }

    public static deh.c a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9) {
        return new deh.c(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, 7);
    }

    public static fpc.b b(a31.a aVar, a31.a aVar2, xs6.a aVar3, xs6.a aVar4, a31.a aVar5) {
        return new fpc.b(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static n8j.a c(a31.a aVar) {
        return new n8j.a(aVar, 21);
    }

    public static u41.d d(q qVar, q qVar2, uhc.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25) {
        return new u41.d(qVar, qVar2, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25);
    }

    public static vjb.h e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new vjb.h(aVar, aVar2, aVar3, aVar4);
    }

    public static w80.b f(qd0.b languageProvider) {
        vsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 26);
    }

    public static com.revolut.core.mobile_services.impl.map.a g(th0.b mapServices) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapServices, "mapServices");
        return new com.revolut.core.mobile_services.impl.map.a();
    }

    public static u h(uqh.s extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return extensions.f282174b;
    }

    public static yji.d i(uqh.s extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return extensions.f282173a;
    }

    public static n j(uqh.s extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return extensions.f282174b;
    }

    public static CreditEntryPointsService k(vq3.a aVar, Retrofit retrofit) {
        CreditEntryPointsService creditEntryPointsService = (CreditEntryPointsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditEntryPointsService.class, "create(...)");
        s.k(creditEntryPointsService);
        return creditEntryPointsService;
    }

    public static CreditExternalClientMonitoringService l(vq3.e eVar, Retrofit retrofit) {
        CreditExternalClientMonitoringService creditExternalClientMonitoringService = (CreditExternalClientMonitoringService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditExternalClientMonitoringService.class, "create(...)");
        s.k(creditExternalClientMonitoringService);
        return creditExternalClientMonitoringService;
    }

    public static CreditLimitIncreaseService m(vq3.a aVar, Retrofit retrofit) {
        CreditLimitIncreaseService creditLimitIncreaseService = (CreditLimitIncreaseService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditLimitIncreaseService.class, "create(...)");
        s.k(creditLimitIncreaseService);
        return creditLimitIncreaseService;
    }

    public static xe0.e n(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        vbj.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_crypto_deposit", mapper, 0, null, 56);
    }

    public static uqh.s o(ugc.a extensionFactory, r delegates) {
        Intrinsics.checkNotNullParameter(extensionFactory, "extensionFactory");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        l0 l0Var = (l0) extensionFactory.f279998b;
        return new uqh.s(new o(delegates, l0Var), l0Var);
    }

    public static OkHttpClient p(vq3.e eVar, xj0.i okHttpClientFactory) {
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        return xj0.i.a(okHttpClientFactory, null, false, false, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
    }

    public static kg.o q(kg.o gson) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        return new kg.o();
    }

    public static xe0.e r(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(storageFactory, databaseSessionProvider, "security_hub_storage", mapper, 0, null, 56);
    }

    public static fd6.a s(i4b.f factory, xc6.a modelExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelExtension, "legalEntityControllerModelExtension");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        return new fd6.a(modelExtension);
    }

    public static yji.d t(fd6.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n u(xc6.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        n nVar = (n) extension;
        s.k(nVar);
        return nVar;
    }

    public static LinkedWalletsService v(Retrofit retrofit) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(LinkedWalletsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        LinkedWalletsService linkedWalletsService = (LinkedWalletsService) objCreate;
        s.k(linkedWalletsService);
        return linkedWalletsService;
    }

    public static m w(Context context) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static JuniorReferralsService x(vk8.d dVar, Retrofit retrofit) {
        JuniorReferralsService juniorReferralsService = (JuniorReferralsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorReferralsService.class, "create(...)");
        s.k(juniorReferralsService);
        return juniorReferralsService;
    }

    public static ve0.c y(z70.a contextProvider, xe0.f storageFactory, je0.d mapper) {
        vta.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return storageFactory.d(2, a0.d.r(contextProvider.getContext().getPackageName(), "_preferences"), zhm.u.c(new aua.g()), mapper);
    }

    public static xe0.e z(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        vk8.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_referrals", mapper, 0, null, 56);
    }
}
