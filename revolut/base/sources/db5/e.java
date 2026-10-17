package db5;

import android.content.Context;
import androidx.room.migration.Migration;
import bp0.y;
import com.revolut.feature.shops.impl.db.ShopsDatabase;
import com.revolut.retail.feature.impl.analytics_cycle.air_tip.network.AnalyticsAirTipService;
import com.revolut.retail.feature.impl.analytics_cycle.budget_suggestion.network.BudgetSuggestionConfigService;
import com.revolut.retail.feature.impl.analytics_cycle.network.AnalyticsSpendingCycleService;
import com.revolut.retail.feature.impl.budget.network.BudgetService;
import com.revolut.retail.feature.pod_nominees.impl.data.network.PodNomineesService;
import did.b0;
import did.u;
import dmc.f0;
import dmc.g0;
import dmc.j0;
import dmc.o;
import dmc.p;
import dmc.r;
import ecm.q;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lik.g;
import mid.x;
import oid.i0;
import phk.k;
import qgk.g3;
import retrofit2.Retrofit;
import sri.m;
import vc.s;
import yji.n;
import zjh.i;
import zjh.j;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e implements e4m.e {
    public static by5.a A(r39.a componentFactory) {
        j0.Companion.getClass();
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        return new by5.a(9);
    }

    public static ej7.a B(ej7.c cVar) {
        ej7.a aVar = (ej7.a) cVar.b();
        s.k(aVar);
        return aVar;
    }

    public static o C(i componentFactory) {
        j0.Companion.getClass();
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        return new o((r) componentFactory.f322838b);
    }

    public static p D(j componentFactory) {
        j0.Companion.getClass();
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        return new p((r) componentFactory.f322839a);
    }

    public static a51.d a(a1j.a aVar) {
        return new a51.d(aVar, 6);
    }

    public static b6b.f b(a1j.a aVar, a31.a aVar2) {
        return new b6b.f(aVar2, aVar, 2);
    }

    public static dg6.b c(q qVar, sse.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7) {
        return new dg6.b(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, 0);
    }

    public static b0 d(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new b0(aVar, aVar2, aVar3);
    }

    public static f0 e(q qVar, a1j.a aVar, a1j.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8) {
        return new f0(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static g0 f(a1j.a aVar, a31.a aVar2) {
        return new g0(aVar2, aVar);
    }

    public static AnalyticsAirTipService g(Retrofit retrofit) {
        dqj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AnalyticsAirTipService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AnalyticsAirTipService analyticsAirTipService = (AnalyticsAirTipService) objCreate;
        s.k(analyticsAirTipService);
        return analyticsAirTipService;
    }

    public static xe0.e h(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        dqj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "analytics_air_tip_storage", mapper, 1, null, 48);
    }

    public static AnalyticsSpendingCycleService i(Retrofit retrofit) {
        dqj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AnalyticsSpendingCycleService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AnalyticsSpendingCycleService analyticsSpendingCycleService = (AnalyticsSpendingCycleService) objCreate;
        s.k(analyticsSpendingCycleService);
        return analyticsSpendingCycleService;
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        dqj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "analytics_cycle", mapper, 1, null, 48);
    }

    public static xe0.e k(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        dqj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "balanceHistory", mapper, 1, null, 48);
    }

    public static BudgetService l(Retrofit retrofit) {
        dqj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BudgetService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BudgetService budgetService = (BudgetService) objCreate;
        s.k(budgetService);
        return budgetService;
    }

    public static xe0.e m(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        dqj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "budget_storage", mapper, 1, null, 48);
    }

    public static BudgetSuggestionConfigService n(Retrofit retrofit) {
        dqj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BudgetSuggestionConfigService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BudgetSuggestionConfigService budgetSuggestionConfigService = (BudgetSuggestionConfigService) objCreate;
        s.k(budgetSuggestionConfigService);
        return budgetSuggestionConfigService;
    }

    public static y o(Context context) {
        dmh.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return com.bumptech.glide.c.k(context).a(context);
    }

    public static ShopsDatabase p(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        ShopsDatabase.Companion companion = ShopsDatabase.INSTANCE;
        companion.getClass();
        ShopsDatabase shopsDatabase = (ShopsDatabase) companion.a(context, databaseSessionProvider, new Migration[0], databaseEncryptionMigratorFactory);
        s.k(shopsDatabase);
        return shopsDatabase;
    }

    public static kg.o q(kg.o gson) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        pVar.c(new i0(), x.class);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static m r(z70.a contextProvider) {
        dm5.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return sri.o.c(contextProvider.getContext(), null, null, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n s(col.c extension) {
        dol.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        n nVar = (n) extension;
        s.k(nVar);
        return nVar;
    }

    public static lik.a t(lik.b factory) {
        dj4.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        zfk.c cVar = (zfk.c) factory.f195539a.get();
        k kVar = (k) factory.f195540b.get();
        bgk.a aVar = (bgk.a) factory.d.get();
        xfk.b bVar = (xfk.b) factory.f195541c.get();
        wfk.a aVar2 = (wfk.a) factory.e.get();
        Intrinsics.h(cVar);
        Intrinsics.h(kVar);
        g3 g3Var = (g3) factory.f.f245957a.f239302c;
        egk.e eVarE = g3Var.f.e();
        s.j(eVarE);
        g gVar = new g(eVarE, (yik.d) g3Var.f245990w.get(), cVar, kVar);
        Intrinsics.h(aVar);
        Intrinsics.h(bVar);
        Intrinsics.h(aVar2);
        return new lik.a(gVar, cVar, kVar, bVar, aVar, aVar2);
    }

    public static Set u(lik.a binder) {
        dj4.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(binder, "binder");
        n[] elements = {binder.f195536a, binder.f195537b, binder.f195538c, binder.d, binder.e, binder.f};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static PodNomineesService v(Retrofit retrofit) {
        dek.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(PodNomineesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PodNomineesService podNomineesService = (PodNomineesService) objCreate;
        s.k(podNomineesService);
        return podNomineesService;
    }

    public static ve0.c w(le0.a mapper, xe0.f storageFactory) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "CREDIT_TILES_STORAGE", mapper, 12);
    }

    public static xe0.e x(kg.o gson, le0.b gsonObjectMapperFactory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "retail_shops", gsonObjectMapperFactory.a(gson), qid.a.f246696b, qid.a.f246695a, 32);
    }

    public static mae.o y(mae.p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        dd7.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.d(uiKitResources, currenciesLocalization);
    }

    public static zhd.b z(ShopsDatabase database) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        zhd.b bVarG = database.g();
        s.k(bVarG);
        return bVarG;
    }
}
