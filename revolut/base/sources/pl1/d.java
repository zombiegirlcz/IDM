package pl1;

import anb.c0;
import android.content.Context;
import android.nfc.NfcAdapter;
import androidx.room.Room;
import androidx.room.migration.Migration;
import com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationVisionResourcesService;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator;
import com.revolut.retail.feature.crypto_deposits.impl.database.CryptoDepositsDatabase;
import com.revolut.retail.feature.crypto_deposits.impl.network.CryptoDepositsService;
import com.youTransactor.uCube.rpc.Constants;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import oda.v;
import okhttp3.OkHttpClient;
import prk.m0;
import q7k.p;
import qud.o;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public abstract class d implements e4m.e {
    public static on.a A(os2.g factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return (sn.a) factory.f229224b;
    }

    public static tf5.a B(tf5.b bVar) {
        tf5.a aVar = (tf5.a) bVar.b();
        s.k(aVar);
        return aVar;
    }

    public static rtd.a C(qud.l lVar) {
        rtd.a aVar = (rtd.a) lVar.b();
        s.k(aVar);
        return aVar;
    }

    public static rtd.b D(o oVar) {
        rtd.b bVar = (rtd.b) oVar.b();
        s.k(bVar);
        return bVar;
    }

    public static c0 a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new c0(aVar, aVar2, aVar3, aVar4, 23);
    }

    public static ezj.h b(q qVar, p8a.c0 c0Var, a31.a aVar, a31.a aVar2) {
        return new ezj.h(qVar, c0Var, aVar, aVar2, 2);
    }

    public static kmg.j c(q qVar, ibh.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6) {
        return new kmg.j(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static v d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, a31.a aVar38, q qVar, of3.e eVar) {
        return new v(qVar, eVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38);
    }

    public static m0 e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, q qVar) {
        return new m0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, qVar);
    }

    public static p f(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, a31.a aVar38) {
        return new p(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38);
    }

    public static p g(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, of3.e eVar, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37) {
        return new p(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, eVar, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37);
    }

    public static qbj.e h(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, p8a.c0 c0Var, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20) {
        return new qbj.e(qVar, aVar, aVar2, aVar3, aVar4, c0Var, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20);
    }

    public static qga.c i(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10) {
        return new qga.c(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, 0);
    }

    public static a j(com.revolut.feature.apm.core.impl.crypto.h factory) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        e02.b config = b.f237245b;
        Intrinsics.checkNotNullParameter(config, "config");
        ApmKeyGenerator apmKeyGenerator = new ApmKeyGenerator(config.f, 14);
        ang.f fVar = factory.f61864a;
        tl0.a aVar = factory.f61865b;
        kdh.b keyProvider = new kdh.b(new com.revolut.feature.apm.core.impl.crypto.o(config, fVar, apmKeyGenerator, aVar));
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        return new a(keyProvider, new com.revolut.feature.apm.core.impl.crypto.d(config, keyProvider, aVar, factory.f61866c));
    }

    public static mae.o k(mae.p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        ppd.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.a(uiKitResources, currenciesLocalization);
    }

    public static BiometricVerificationDatabase l(Context context) {
        pr.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        BiometricVerificationDatabase biometricVerificationDatabase = (BiometricVerificationDatabase) Room.databaseBuilder(context, BiometricVerificationDatabase.class, "biometric_verification_db").fallbackToDestructiveMigration(true).build();
        s.k(biometricVerificationDatabase);
        return biometricVerificationDatabase;
    }

    public static BiometricVerificationVisionResourcesService m(Retrofit retrofit) {
        pr.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BiometricVerificationVisionResourcesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BiometricVerificationVisionResourcesService biometricVerificationVisionResourcesService = (BiometricVerificationVisionResourcesService) objCreate;
        s.k(biometricVerificationVisionResourcesService);
        return biometricVerificationVisionResourcesService;
    }

    public static yji.d n(KeyboardSuggestionsControllerExtension keyboardSuggestionsApi) {
        Intrinsics.checkNotNullParameter(keyboardSuggestionsApi, "keyboardSuggestionsApi");
        s.k(keyboardSuggestionsApi);
        return keyboardSuggestionsApi;
    }

    public static nbj.a o(CryptoDepositsDatabase database) {
        qbj.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        nbj.a aVarG = database.g();
        s.k(aVarG);
        return aVarG;
    }

    public static CryptoDepositsService p(Retrofit retrofit) {
        qbj.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CryptoDepositsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoDepositsService cryptoDepositsService = (CryptoDepositsService) objCreate;
        s.k(cryptoDepositsService);
        return cryptoDepositsService;
    }

    public static xe0.e q(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        pl5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "crypto_spare_change", mapper, 0, null, 56);
    }

    public static CryptoDepositsDatabase r(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        qbj.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        CryptoDepositsDatabase cryptoDepositsDatabase = (CryptoDepositsDatabase) CryptoDepositsDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{obj.a.f223966c, obj.b.f223967c, obj.c.f223968c, obj.d.f223969c, obj.e.f223970c}, databaseEncryptionMigratorFactory);
        s.k(cryptoDepositsDatabase);
        return cryptoDepositsDatabase;
    }

    public static Retrofit s(kg.o gson, Retrofit retrofit) {
        qbj.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
    }

    public static pak.h t(rlm.o jsonParser) {
        pr.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        return new pak.h(jsonParser, 2);
    }

    public static KeyboardSuggestionsControllerExtension u(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new KeyboardSuggestionsControllerExtension(controller);
    }

    public static sri.m v(Context context) {
        qc9.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static od0.i w(Context context) {
        pr.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        od0.h hVar = od0.i.Companion;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        hVar.getClass();
        return od0.h.a(defaultAdapter);
    }

    public static OkHttpClient x(xj0.i okHttpClientFactory, xq.a bearerFromVerificationTokenInterceptor, xq.c visionRegionalRoutingBaseUrlInterceptor) {
        pr.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        Intrinsics.checkNotNullParameter(bearerFromVerificationTokenInterceptor, "bearerFromVerificationTokenInterceptor");
        Intrinsics.checkNotNullParameter(visionRegionalRoutingBaseUrlInterceptor, "visionRegionalRoutingBaseUrlInterceptor");
        return xj0.i.a(okHttpClientFactory, null, false, false, zhm.v.k(bearerFromVerificationTokenInterceptor, visionRegionalRoutingBaseUrlInterceptor), null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
    }

    public static OkHttpClient y(xj0.i okHttpClientFactory, xq.a bearerFromVerificationTokenInterceptor, xq.c visionRegionalRoutingBaseUrlInterceptor) {
        pr.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        Intrinsics.checkNotNullParameter(bearerFromVerificationTokenInterceptor, "bearerFromVerificationTokenInterceptor");
        Intrinsics.checkNotNullParameter(visionRegionalRoutingBaseUrlInterceptor, "visionRegionalRoutingBaseUrlInterceptor");
        return xj0.i.a(okHttpClientFactory, 60L, false, false, zhm.v.k(bearerFromVerificationTokenInterceptor, visionRegionalRoutingBaseUrlInterceptor), null, null, 246);
    }

    public static mae.o z(mae.p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        q38.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.d(uiKitResources, currenciesLocalization);
    }
}
