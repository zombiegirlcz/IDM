package jge;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.WorkManager;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import com.revolut.feature.credit.card.impl.network.CreditCardUiService;
import com.revolut.feature.spending_analytics.impl.network.SpendingAnalyticsService;
import jqa.u;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import zhm.f0;
import zhm.v;
import zo4.a0;
import zo4.b0;
import zo4.c0;
import zo4.d0;
import zo4.e0;
import zo4.g0;
import zo4.h0;
import zo4.i0;
import zo4.j0;
import zo4.k0;
import zo4.l0;
import zo4.m0;
import zo4.n0;
import zo4.o0;
import zo4.p0;
import zo4.q0;
import zo4.r0;
import zo4.s0;
import zo4.t0;
import zo4.w;
import zo4.x;
import zo4.y;
import zo4.z;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r implements e4m.e {
    public static xx4.e A(ue0.c storage) {
        jm4.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xx4.e(storage);
    }

    public static WorkManager B(z70.a contextProvider) {
        jk8.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        WorkManager companion = WorkManager.INSTANCE.getInstance(contextProvider.getContext());
        vc.s.k(companion);
        return companion;
    }

    public static nm4.f C(nm4.a aVar) {
        nm4.f fVar = (nm4.f) aVar.b();
        vc.s.k(fVar);
        return fVar;
    }

    public static jqa.o D(u uVar) {
        jqa.o oVar = (jqa.o) uVar.b();
        vc.s.k(oVar);
        return oVar;
    }

    public static a51.d a(ibh.a aVar) {
        return new a51.d(aVar, 11);
    }

    public static jje.j b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, ecm.q qVar, a31.a aVar38, a31.a aVar39, a31.a aVar40, a31.a aVar41, a31.a aVar42, a31.a aVar43, a31.a aVar44, a31.a aVar45) {
        return new jje.j(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45);
    }

    public static jmd.e c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23) {
        return new jmd.e(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23);
    }

    public static ve0.c d(je0.d mapper, xe0.f storageFactory) {
        jk3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return storageFactory.d(1, "address_config_storage.pref", f0.f322471a, mapper);
    }

    public static w80.b e(qd0.b languageProvider) {
        jpf.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    public static CreditCardUiService f(Retrofit retrofit) {
        CreditCardUiService creditCardUiService = (CreditCardUiService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditCardUiService.class, "create(...)");
        vc.s.k(creditCardUiService);
        return creditCardUiService;
    }

    public static CreditCardService g(jm4.e eVar, Retrofit retrofit) {
        CreditCardService creditCardService = (CreditCardService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditCardService.class, "create(...)");
        vc.s.k(creditCardService);
        return creditCardService;
    }

    public static xe0.e h(kg.o baseGson, le0.b gsonObjectMapperFactory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        jm4.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "credit", gsonObjectMapperFactory.a(cn4.a.a(baseGson)), 47, v.k(new zo4.k(), new zo4.v(), new g0(), new o0(), new p0(), new q0(), new r0(), new s0(), new t0(), new zo4.a(), new zo4.b(), new zo4.c(), new zo4.d(), new zo4.e(), new zo4.f(), new zo4.g(), new zo4.h(), new zo4.i(), new zo4.j(), new zo4.l(), new zo4.m(), new zo4.n(), new zo4.o(), new zo4.p(), new zo4.q(), new zo4.r(), new zo4.s(), new zo4.t(), new zo4.u(), new w(), new x(), new y(), new z(), new a0(), new b0(), new c0(), new d0(), new e0(), new zo4.f0(), new h0(), new i0(), new j0(), new k0(), new l0(), new m0(), new n0()), 32);
    }

    public static Retrofit i(jm4.e eVar, Retrofit retrofit, kg.o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static Retrofit j(kg.o oVar, Retrofit retrofit) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static kg.o k(kg.o gson) {
        jm4.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        return cn4.a.a(gson);
    }

    public static kg.o l(kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        return cn4.a.a(gson);
    }

    public static rlm.o m(hqa.c jsonProvider) {
        Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
        rlm.o oVar = jsonProvider.f154654a;
        vc.s.k(oVar);
        return oVar;
    }

    public static xe0.e n(fl0.a mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        jk8.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_progression", mapper, 1, f0.f322471a, 32);
    }

    public static sri.m o(Context context) {
        jm4.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m p(z70.a contextProvider) {
        jk8.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return sri.o.c(contextProvider.getContext(), null, null, 14);
    }

    public static sri.m q(Context context) {
        jmd.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static dnd.b r(jmd.i iVar, fsd.c totalWealthGroupMapper, ipd.h performanceMapper, dsd.f totalWealthBalanceSourceMapper) {
        Intrinsics.checkNotNullParameter(totalWealthGroupMapper, "totalWealthGroupMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(totalWealthBalanceSourceMapper, "totalWealthBalanceSourceMapper");
        return new dnd.b(totalWealthGroupMapper, performanceMapper, totalWealthBalanceSourceMapper);
    }

    public static fnc.s s(jmd.i iVar, dnd.b netWorthMapper) {
        Intrinsics.checkNotNullParameter(netWorthMapper, "netWorthMapper");
        return new fnc.s(netWorthMapper, 19);
    }

    public static fl0.a t(Json json, me0.a factory) {
        jk8.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(json);
    }

    public static n80.e u(Context context) {
        jq2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return new n80.e(packageManager);
    }

    public static SpendingAnalyticsService v(Retrofit retrofit) {
        jmd.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SpendingAnalyticsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SpendingAnalyticsService spendingAnalyticsService = (SpendingAnalyticsService) objCreate;
        vc.s.k(spendingAnalyticsService);
        return spendingAnalyticsService;
    }

    public static ve0.c w(je0.d mapper, xe0.f storageFactory) {
        jmd.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "analytics_shared_pref", mapper, 8);
    }

    public static xe0.e x(kg.o baseGson, le0.b gsonObjectMapperFactory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        jm4.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "credit_card_ui_storage", gsonObjectMapperFactory.a(cn4.a.a(baseGson)), 1, f0.f322471a, 32);
    }

    public static xe0.e y(kg.o baseGson, le0.b gsonObjectMapperFactory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        jmd.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "spending_analytics", gsonObjectMapperFactory.a(new kg.p(baseGson).b()), 0, null, 56);
    }

    public static xx4.d z(ne0.d hashMapCache) {
        jm4.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
        return new xx4.d(hashMapCache);
    }
}
