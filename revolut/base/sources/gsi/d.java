package gsi;

import android.content.Context;
import androidx.work.WorkManager;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.chat.data.network.ChatIntroApi;
import com.revolut.chat.data.network.SuggestionsApi;
import com.revolut.feature.revolut_x_common.impl.data.network.RevolutXCommonService;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.BackendFlowOnboardingService;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.SpouseConsentService;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import lx0.j;
import qg7.k;
import qz0.n;
import retrofit2.Retrofit;
import rp0.m;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d implements e4m.e {
    public static n A(h30.b bVar, Context context, a20.a authHeaderProvider, bk0.e headerProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authHeaderProvider, "authHeaderProvider");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        return new n(context, authHeaderProvider, headerProvider);
    }

    public static j B(h30.b bVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new j(lx0.g.f200511a.a(context));
    }

    public static WorkManager C(h30.b bVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WorkManager companion = WorkManager.INSTANCE.getInstance(context);
        s.k(companion);
        return companion;
    }

    public static j60.c D(com.revolut.kompot.navigable.a controller, he2.b dialogHostFinder) {
        h6k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, new m(), dialogHostFinder);
    }

    public static yji.d a(g6k.e extension) {
        h6k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n b(g6k.f extension) {
        h6k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        s.k(nVar);
        return nVar;
    }

    public static a2d.m c(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new a2d.m(aVar, aVar2, aVar3, 10);
    }

    public static cwi.g d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, q qVar, q qVar2) {
        return new cwi.g(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, qVar, qVar2);
    }

    public static h30.g e(a31.a aVar, q qVar) {
        return new h30.g(aVar, qVar);
    }

    public static void f(i iVar) {
        throw new IllegalStateException("must be provided from app");
    }

    public static BackendFlowOnboardingService g(gyk.a aVar, Retrofit retrofit) {
        BackendFlowOnboardingService backendFlowOnboardingService = (BackendFlowOnboardingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", BackendFlowOnboardingService.class, "create(...)");
        s.k(backendFlowOnboardingService);
        return backendFlowOnboardingService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d h(j60.a impl) {
        h6k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(impl, "impl");
        yji.d dVar = (yji.d) impl;
        s.k(dVar);
        return dVar;
    }

    public static yji.n i(fz.b extension) {
        gz.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        return extension;
    }

    public static ChatDatabase j(h30.b bVar, Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        ChatDatabase.Companion companion = ChatDatabase.INSTANCE;
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
        String passPhrase = databaseSessionProvider.getToken();
        companion.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(passPhrase, "passPhrase");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        ChatDatabase chatDatabase = (ChatDatabase) ce0.a.b(new k(context2, databaseEncryptionMigratorFactory, passPhrase, 3));
        s.k(chatDatabase);
        return chatDatabase;
    }

    public static q10.a k(h30.b bVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new q10.a(context);
    }

    public static p30.d l(h30.b bVar, q10.a chatFileHelper, Context context, qz0.j urlImagesRepository, su9.c imageTempFileProvider) {
        Intrinsics.checkNotNullParameter(chatFileHelper, "chatFileHelper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        Intrinsics.checkNotNullParameter(imageTempFileProvider, "imageTempFileProvider");
        return new p30.d(chatFileHelper, context, urlImagesRepository, imageTempFileProvider);
    }

    public static ChatIntroApi m(h30.b bVar, Retrofit retrofit) {
        ChatIntroApi chatIntroApi = (ChatIntroApi) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ChatIntroApi.class, "create(...)");
        s.k(chatIntroApi);
        return chatIntroApi;
    }

    public static ryc.a n(h30.b bVar, d4m.a introApiLazy, d4m.a storageLazy) {
        Intrinsics.checkNotNullParameter(introApiLazy, "intoApiLazy");
        Intrinsics.checkNotNullParameter(storageLazy, "storageLazy");
        Intrinsics.checkNotNullParameter(introApiLazy, "introApiLazy");
        Intrinsics.checkNotNullParameter(storageLazy, "storageLazy");
        ryc.a aVar = new ryc.a();
        aVar.f258289a = introApiLazy;
        aVar.f258290b = storageLazy;
        return aVar;
    }

    public static e30.e o(h30.b bVar, e30.e impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    public static i01.b p(fsi.g coreActivityApi) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        i01.b bVarD0 = coreActivityApi.d0();
        s.k(bVarD0);
        return bVarD0;
    }

    public static void q(i iVar) {
        throw new IllegalStateException("must be provided from app");
    }

    public static nl0.f r(h30.b bVar) {
        return new nl0.f();
    }

    public static ky1.b s(ky1.b provider) {
        gy1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static RevolutXCommonService t(ik0.b retrofitFactory) {
        h5c.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, null, null, 31).create(RevolutXCommonService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RevolutXCommonService revolutXCommonService = (RevolutXCommonService) objCreate;
        s.k(revolutXCommonService);
        return revolutXCommonService;
    }

    public static xe0.e u(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h3f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "portfolio_spare_change", mapper, 0, null, 56);
    }

    public static SpouseConsentService v(gyk.a aVar, Retrofit retrofit) {
        SpouseConsentService spouseConsentService = (SpouseConsentService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", SpouseConsentService.class, "create(...)");
        s.k(spouseConsentService);
        return spouseConsentService;
    }

    public static xe0.e w(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        gtg.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "weakPasscodeUpgrade", mapper, 0, null, 56);
    }

    public static SuggestionsApi x(h30.b bVar, Retrofit retrofit) {
        SuggestionsApi suggestionsApi = (SuggestionsApi) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", SuggestionsApi.class, "create(...)");
        s.k(suggestionsApi);
        return suggestionsApi;
    }

    public static xe0.e y(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h3f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "trades", mapper, 0, null, 56);
    }

    public static void z(i iVar) {
        throw new IllegalStateException("must be provided from app");
    }
}
