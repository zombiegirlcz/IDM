package fp8;

import aah.i;
import aah.m;
import ajf.d;
import android.content.Context;
import android.location.Geocoder;
import android.location.LocationManager;
import com.revolut.feature.crypto_investments.impl.data.network.CryptoPositionsService;
import com.revolut.feature.crypto_investments.impl.data.network.CryptoTaxService;
import com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingsDatabase;
import com.revolut.feature.payments.recipients.settings.impl.data.network.RecipientPaymentsSettingsService;
import com.revolut.feature.wealth.impl.data.database.WealthDatabase;
import com.revolut.feature.workflow.engine.rfi.impl.data.network.service.RfiScreeningService;
import e4m.e;
import ecm.q;
import fsg.f;
import fsl.t;
import fsl.u;
import g49.h;
import gp8.o;
import h30.g;
import h30.g0;
import java.util.Locale;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import qz0.n;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements e {
    public static m A(i factory) {
        g2j.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.b();
    }

    public static g0 B(g gVar) {
        g0 g0Var = (g0) gVar.b();
        s.k(g0Var);
        return g0Var;
    }

    public static gp8.b C(o oVar) {
        gp8.b bVar = (gp8.b) oVar.b();
        s.k(bVar);
        return bVar;
    }

    public static RfiScreeningService D(ysb.a deps) {
        fuh.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(deps, "deps");
        Object objCreate = ((Retrofit) deps.f316431b.get()).create(RfiScreeningService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RfiScreeningService rfiScreeningService = (RfiScreeningService) objCreate;
        s.k(rfiScreeningService);
        return rfiScreeningService;
    }

    public static n a(Context context) {
        fy2.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new n(context, null, null);
    }

    public static d b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5, 4);
    }

    public static fpc.b c(a1j.a aVar, a1j.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new fpc.b(aVar3, aVar4, aVar, aVar5, aVar2);
    }

    public static f d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, q qVar) {
        return new f(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, 0);
    }

    public static f7h.f e(WealthDatabase db8) {
        g7h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        f7h.f fVarG = db8.g();
        s.k(fVarG);
        return fVarG;
    }

    public static CryptoPositionsService f(fu5.a aVar, Retrofit retrofit) {
        CryptoPositionsService cryptoPositionsService = (CryptoPositionsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CryptoPositionsService.class, "create(...)");
        s.k(cryptoPositionsService);
        return cryptoPositionsService;
    }

    public static CryptoTaxService g(fu5.a aVar, Retrofit retrofit) {
        CryptoTaxService cryptoTaxService = (CryptoTaxService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CryptoTaxService.class, "create(...)");
        s.k(cryptoTaxService);
        return cryptoTaxService;
    }

    public static RecipientSettingsDatabase h(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        fy9.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        RecipientSettingsDatabase.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        RecipientSettingsDatabase recipientSettingsDatabase = (RecipientSettingsDatabase) ce0.a.b(new cy9.e(context, databaseEncryptionMigratorFactory, databaseSessionProvider, 0));
        s.k(recipientSettingsDatabase);
        return recipientSettingsDatabase;
    }

    public static WealthDatabase i(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        g7h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        WealthDatabase.Companion aVar = WealthDatabase.INSTANCE;
        aVar.getClass();
        WealthDatabase wealthDatabase = (WealthDatabase) aVar.a(context, databaseSessionProvider, WealthDatabase.f, databaseEncryptionMigratorFactory);
        s.k(wealthDatabase);
        return wealthDatabase;
    }

    public static rlm.o j(Json baseJson) {
        fyd.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        return ue0.e.b(baseJson, new fwf.n(15));
    }

    public static fl0.a k(Json json, me0.a factory) {
        fyd.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(json);
    }

    public static xe0.e l(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        fyd.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "documents_hub", mapper, 1, null, 48);
    }

    public static kg.o m(fu5.a aVar, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.o oVarB = new p(gson).b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit n(fu5.a aVar, Retrofit retrofit, kg.o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static Geocoder o(Context appContext) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return new Geocoder(appContext, Locale.UK);
    }

    public static fsl.q p(t factory, fsl.o view, fsl.i controllerModelExtension) {
        fsl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new fsl.q(view, controllerModelExtension);
    }

    public static fsl.s q(t factory, fsl.c configurationProvider) {
        fsl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        return new fsl.s(configurationProvider);
    }

    public static u r(t factory, htl.f investOrdersCommonMapper) {
        fsl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(investOrdersCommonMapper, "investOrdersCommonMapper");
        Intrinsics.checkNotNullParameter(investOrdersCommonMapper, "investOrdersCommonMapper");
        return new u(investOrdersCommonMapper, factory.f137736a);
    }

    public static f1h.a s(f1h.c factory, f1h.f screen, f1h.b controllerModelExtension) {
        g1h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        f1h.a aVarB = factory.b(screen, controllerModelExtension);
        s.k(aVarB);
        return aVarB;
    }

    public static f1h.b t(f1h.c factory) {
        g1h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        f1h.b bVarA = factory.a();
        s.k(bVarA);
        return bVarA;
    }

    public static LocationManager u(Context context) {
        g49.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }

    public static sri.m v(Context context) {
        fw2.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static cy9.b w(RecipientSettingsDatabase database) {
        fy9.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        cy9.b bVarG = database.g();
        s.k(bVarG);
        return bVarG;
    }

    public static RecipientPaymentsSettingsService x(ik0.b retrofitFactory, gy9.c recipientPaymentsSettingsNetworkConfiguration) {
        fy9.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(recipientPaymentsSettingsNetworkConfiguration, "recipientPaymentsSettingsNetworkConfiguration");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, null, null, 29).create(RecipientPaymentsSettingsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RecipientPaymentsSettingsService recipientPaymentsSettingsService = (RecipientPaymentsSettingsService) objCreate;
        s.k(recipientPaymentsSettingsService);
        return recipientPaymentsSettingsService;
    }

    public static xe0.e y(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        fuh.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_rfi_screening", mapper, 0, null, 56);
    }

    public static iqk.d z(iqk.e provider) {
        fqk.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        Object obj2 = provider.f167887a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        iqk.d dVar = (iqk.d) obj2;
        s.k(dVar);
        return dVar;
    }
}
