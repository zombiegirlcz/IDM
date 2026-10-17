package dqj;

import bjl.p0;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.network.TicketorService;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import com.revolut.retail.feature.impl.analytics_cycle.network.TransactionAnalyticsService;
import com.revolut.retail.feature.impl.budget.database.BudgetHistoryDatabase;
import d14.h;
import g14.c;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o14.d;
import p14.b;
import q14.e;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import st3.v;
import st3.w;
import st3.x;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d implements e4m.e {
    public static xe0.e A(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "trips_storage", mapper, 1, null, 48);
    }

    public static xx4.d B(ne0.d hashMapCache) {
        dw3.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
        return new xx4.d(hashMapCache);
    }

    public static xx4.e C(ve0.c storage) {
        dw3.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xx4.e(storage);
    }

    public static xe0.e D(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "analytics_wallet_cycle", mapper, 1, null, 48);
    }

    public static xe0.e a(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        du5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "auto_earn_eligible_storage", mapper, 0, null, 56);
    }

    public static lqj.a b(AnalyticsDatabase db8) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        lqj.a aVarG = db8.g();
        vc.s.k(aVarG);
        return aVarG;
    }

    public static rqj.h c(BudgetHistoryDatabase database) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        rqj.h hVarG = database.g();
        vc.s.k(hVarG);
        return hVarG;
    }

    public static BudgetHistoryDatabase d(z70.a contextProvider, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory, sqj.a categoryListTypeConverter) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(categoryListTypeConverter, "categoryListTypeConverter");
        BudgetHistoryDatabase.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(categoryListTypeConverter, "categoryListTypeConverter");
        BudgetHistoryDatabase budgetHistoryDatabase = (BudgetHistoryDatabase) ce0.a.b(new r5.c(contextProvider, categoryListTypeConverter, databaseEncryptionMigratorFactory, databaseSessionProvider, 1));
        vc.s.k(budgetHistoryDatabase);
        return budgetHistoryDatabase;
    }

    public static xe0.e e(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "budget_suggestion_config_storage", mapper, 1, null, 48);
    }

    public static vw3.f f(vw3.d creditCardOfferInteractor, xx4.d typedMemoryCache) {
        dw3.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(creditCardOfferInteractor, "creditCardOfferInteractor");
        Intrinsics.checkNotNullParameter(typedMemoryCache, "typedMemoryCache");
        return new vw3.f(creditCardOfferInteractor, typedMemoryCache);
    }

    public static CreditPluginsService g(dw3.a aVar, Retrofit retrofit) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CreditPluginsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CreditPluginsService creditPluginsService = (CreditPluginsService) objCreate;
        vc.s.k(creditPluginsService);
        return creditPluginsService;
    }

    public static xe0.e h(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        du5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "crypto_tax_storage", mapper, 0, null, 56);
    }

    public static psj.a i(AnalyticsDatabase db8) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        psj.a aVarH = db8.h();
        vc.s.k(aVarH);
        return aVarH;
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "custom_assets_storage", mapper, 1, null, 48);
    }

    public static AnalyticsDatabase k(z70.a contextProvider, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory, ImmutableSet typeConverters) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        AnalyticsDatabase.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        AnalyticsDatabase analyticsDatabase = (AnalyticsDatabase) ce0.a.b(new qpj.a(contextProvider, databaseEncryptionMigratorFactory, databaseSessionProvider, typeConverters, 0));
        vc.s.k(analyticsDatabase);
        return analyticsDatabase;
    }

    public static xe0.e l(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return xe0.f.f(storageFactory, databaseSessionProvider, "excluded_transactions_upd", mapper, 0, null, 56);
    }

    public static Retrofit m(dw3.a aVar, Retrofit retrofit, kg.o gson, py3.b creditApplicationErrorHandlerChecker) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        List<CallAdapter.Factory> listCallAdapterFactories = retrofit.callAdapterFactories();
        builderNewBuilder.converterFactories().clear();
        builderNewBuilder.addConverterFactory(GsonConverterFactory.create(gson));
        builderNewBuilder.callAdapterFactories().clear();
        sz3.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        builderNewBuilder.addCallAdapterFactory(new sz3.c(creditApplicationErrorHandlerChecker));
        sz3.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        builderNewBuilder.addCallAdapterFactory(new sz3.f(creditApplicationErrorHandlerChecker));
        Intrinsics.h(listCallAdapterFactories);
        Iterator<T> it8 = listCallAdapterFactories.iterator();
        while (it8.hasNext()) {
            builderNewBuilder.addCallAdapterFactory((CallAdapter.Factory) it8.next());
        }
        Retrofit retrofitBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        vc.s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static psj.b n(AnalyticsDatabase db8) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        psj.b bVarI = db8.i();
        vc.s.k(bVarI);
        return bVarI;
    }

    public static kg.o o(kg.o gson) {
        dw3.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p builder = new kg.p(gson);
        he0.m mVar = new he0.m("type", e04.e.class, true, false);
        mVar.c(e04.c.class, "DEEPLINK");
        mVar.c(e04.d.class, "POST_REQUEST");
        mVar.c(e04.b.class, "CLOSE");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        ArrayList arrayList = builder.e;
        arrayList.add(mVar);
        Intrinsics.checkNotNullExpressionValue(builder, "registerTypeAdapterFactory(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        kt3.a.a(builder);
        he0.m mVar2 = new he0.m("type", q04.h.class, true, false);
        mVar2.c(q04.e.class, "RESUME");
        mVar2.c(q04.c.class, "CANCEL");
        mVar2.c(q04.d.class, "DEEPLINK");
        mVar2.c(q04.f.class, "POPUP");
        mVar2.c(q04.g.class, "PROMPT");
        Intrinsics.checkNotNullExpressionValue(mVar2, "registerSubtype(...)");
        arrayList.add(mVar2);
        he0.m mVar3 = new he0.m("type", a14.d.class, true, false);
        mVar3.c(a14.c.class, "START_APPLICATION");
        mVar3.c(a14.b.class, "DEEPLINK");
        Intrinsics.checkNotNullExpressionValue(mVar3, "registerSubtype(...)");
        arrayList.add(mVar3);
        arrayList.add(f24.c.a());
        arrayList.add(f24.l.a());
        he0.m mVar4 = new he0.m("type", q14.i.class, true, false);
        mVar4.c(q14.h.class, "POPUP");
        mVar4.c(q14.g.class, "DOWNLOAD_APP");
        Intrinsics.checkNotNullExpressionValue(mVar4, "registerSubtype(...)");
        arrayList.add(mVar4);
        he0.m mVar5 = new he0.m("status", q14.e.class, true, false);
        mVar5.c(e.b.class, "GENERATED");
        mVar5.c(e.c.class, "GENERATING");
        mVar5.c(e.d.class, "SIGNING_METHOD_NOT_FOUND");
        mVar5.c(e.a.class, "FAILED");
        Intrinsics.checkNotNullExpressionValue(mVar5, "registerSubtype(...)");
        arrayList.add(mVar5);
        he0.m mVar6 = new he0.m("type", q14.d.class, true, false);
        mVar6.c(q14.c.class, "SKIP");
        mVar6.c(q14.b.class, "CONFIRMATION");
        Intrinsics.checkNotNullExpressionValue(mVar6, "registerSubtype(...)");
        arrayList.add(mVar6);
        arrayList.add(pt3.d.a());
        arrayList.add(pt3.f.a());
        arrayList.add(pt3.g.a());
        arrayList.add(v.a());
        arrayList.add(x.a());
        arrayList.add(w.a());
        he0.m mVar7 = new he0.m("type", t14.g.class, true, false);
        mVar7.c(t14.e.class, "PROMPT");
        mVar7.c(t14.f.class, "SELECTION");
        mVar7.c(t14.d.class, "PRODUCT_ARTICLE");
        Intrinsics.checkNotNullExpressionValue(mVar7, "registerSubtype(...)");
        arrayList.add(mVar7);
        he0.m mVar8 = new he0.m("type", uz3.g.class, true, false);
        mVar8.c(uz3.c.class, "DEEPLINK");
        mVar8.c(uz3.d.class, "POST_REQUEST");
        mVar8.c(uz3.b.class, "CLOSE");
        mVar8.c(uz3.e.class, "PROCEED_APPLICATION");
        mVar8.c(uz3.a.class, "ACCEPT");
        mVar8.c(uz3.f.class, "UPGRADE");
        Intrinsics.checkNotNullExpressionValue(mVar8, "registerSubtype(...)");
        arrayList.add(mVar8);
        he0.m mVar9 = new he0.m("type", d14.f.class, true, false);
        mVar9.c(d14.c.class, "LINK_ACCOUNT");
        mVar9.c(d14.e.class, "UPLOAD_DOCUMENT");
        mVar9.c(d14.d.class, "SELECT_REVOLUT_TRANSACTIONS");
        Intrinsics.checkNotNullExpressionValue(mVar9, "registerSubtype(...)");
        arrayList.add(mVar9);
        he0.m mVar10 = new he0.m("type", d14.l.class, true, false);
        mVar10.c(d14.i.class, "LINK_ACCOUNT");
        mVar10.c(d14.k.class, "UPLOAD_DOCUMENT");
        mVar10.c(d14.j.class, "SELECT_REVOLUT_TRANSACTIONS");
        Intrinsics.checkNotNullExpressionValue(mVar10, "registerSubtype(...)");
        arrayList.add(mVar10);
        he0.m mVar11 = new he0.m("type", h.a.class, true, false);
        mVar11.c(h.a.b.class, "SINGLE");
        mVar11.c(h.a.C0655a.class, "MULTIPLE");
        Intrinsics.checkNotNullExpressionValue(mVar11, "registerSubtype(...)");
        arrayList.add(mVar11);
        he0.m mVar12 = new he0.m("type", x04.g.class, true, false);
        mVar12.c(x04.d.class, "SINGLE");
        mVar12.c(x04.c.class, "MULTIPLE");
        Intrinsics.checkNotNullExpressionValue(mVar12, "registerSubtype(...)");
        arrayList.add(mVar12);
        he0.m mVar13 = new he0.m("type", g14.c.class, true, false);
        mVar13.c(c.b.class, "WEB_VIEW");
        mVar13.c(c.a.class, "POPUP");
        Intrinsics.checkNotNullExpressionValue(mVar13, "registerSubtype(...)");
        arrayList.add(mVar13);
        he0.m mVar14 = new he0.m("status", o14.g.class, true, false);
        mVar14.c(o14.f.class, "PASSED");
        mVar14.c(o14.e.class, "FAILED");
        Intrinsics.checkNotNullExpressionValue(mVar14, "registerSubtype(...)");
        arrayList.add(mVar14);
        he0.m mVar15 = new he0.m("type", o14.d.class, false, true);
        mVar15.c(d.a.class, "CALCULATOR");
        mVar15.c(d.b.class, "CONFIRMATION_BOTTOM_SHEET");
        mVar15.c(d.c.class, "CREDIT_ADDON");
        mVar15.c(d.e.class, "SINGLE_SELECTION_BOTTOM_SHEET");
        mVar15.c(d.C1230d.class, "OFFER");
        Intrinsics.checkNotNullExpressionValue(mVar15, "registerSubtype(...)");
        arrayList.add(mVar15);
        he0.m mVar16 = new he0.m("status", p14.b.class, true, false);
        mVar16.c(b.a.class, "COMPLETED");
        mVar16.c(b.C1272b.class, "PENDING");
        Intrinsics.checkNotNullExpressionValue(mVar16, "registerSubtype(...)");
        arrayList.add(mVar16);
        he0.m mVar17 = new he0.m("type", b.c.class, true, false);
        mVar17.c(b.c.d.class, "PROMPT");
        mVar17.c(b.c.e.class, "SINGLE_SELECTION");
        mVar17.c(b.c.C1275b.class, "LOAN_SELECTOR");
        mVar17.c(b.c.a.class, "ADDRESS");
        mVar17.c(b.c.C1276c.class, "MONEY_INPUT");
        Intrinsics.checkNotNullExpressionValue(mVar17, "registerSubtype(...)");
        arrayList.add(mVar17);
        he0.m mVar18 = new he0.m("type", p14.e.class, true, false);
        mVar18.c(p14.c.class, "SELECT");
        mVar18.c(p14.d.class, "DECLINE_POPUP");
        Intrinsics.checkNotNullExpressionValue(mVar18, "registerSubtype(...)");
        arrayList.add(mVar18);
        he0.m mVar19 = new he0.m("type", p14.h.class, true, false);
        mVar19.c(p14.f.class, "CELL");
        mVar19.c(p14.g.class, "DISCLOSURE");
        Intrinsics.checkNotNullExpressionValue(mVar19, "registerSubtype(...)");
        arrayList.add(mVar19);
        he0.m mVar20 = new he0.m("type", c24.d.class, true, false);
        mVar20.c(c24.c.class, "SELECT_PARTNER");
        mVar20.c(c24.b.class, "SELECT_CUSTOM");
        Intrinsics.checkNotNullExpressionValue(mVar20, "registerSubtype(...)");
        arrayList.add(mVar20);
        he0.m mVar21 = new he0.m("type", c24.h.class, true, false);
        mVar21.c(c24.e.class, "CALL");
        mVar21.c(c24.f.class, "EMAIL");
        mVar21.c(c24.g.class, "WEBSITE");
        Intrinsics.checkNotNullExpressionValue(mVar21, "registerSubtype(...)");
        arrayList.add(mVar21);
        he0.m mVar22 = new he0.m("type", b14.c.class, true, false);
        mVar22.c(b14.a.class, "PDF");
        mVar22.c(b14.b.class, "PROMPT");
        Intrinsics.checkNotNullExpressionValue(mVar22, "registerSubtype(...)");
        arrayList.add(mVar22);
        he0.m mVar23 = new he0.m("type", t04.f.class, true, false);
        mVar23.c(t04.c.class, "AMOUNT");
        mVar23.c(t04.e.class, "DROPDOWN");
        mVar23.c(t04.d.class, "DATE");
        Intrinsics.checkNotNullExpressionValue(mVar23, "registerSubtype(...)");
        arrayList.add(mVar23);
        he0.m mVar24 = new he0.m("type", r14.b.class, true, false);
        mVar24.c(r14.a.class, "DOWNLOAD_PDF");
        Intrinsics.checkNotNullExpressionValue(mVar24, "registerSubtype(...)");
        arrayList.add(mVar24);
        builder.c(new he0.f(), LocalDate.class);
        Intrinsics.checkNotNullExpressionValue(builder, "registerTypeAdapter(...)");
        kg.o oVarB = builder.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static String p(dql.a aVar, p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        String str = ((rqk.k) revolutSsoDependenciesProvider).f256594q;
        vc.s.k(str);
        return str;
    }

    public static xe0.e q(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "income_sorter", mapper, 1, null, 48);
    }

    public static void r(Json baseJson) {
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
    }

    public static fl0.a s(Json json, me0.a factory) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(json);
    }

    public static le0.a t(kg.o gson, le0.b factory) {
        dw3.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return factory.a(gson);
    }

    public static tx3.d u(tx3.b overdraftOfferInteractor, xx4.d typedMemoryCache) {
        dw3.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(overdraftOfferInteractor, "overdraftOfferInteractor");
        Intrinsics.checkNotNullParameter(typedMemoryCache, "typedMemoryCache");
        return new tx3.d(overdraftOfferInteractor, typedMemoryCache);
    }

    public static ve0.c v(le0.a mapper, xe0.f storageFactory) {
        dw3.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "CREDIT_APPLICATION_PLUGINS_STORAGE", mapper, 12);
    }

    public static TicketorService w(dw3.a aVar, Retrofit retrofit) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TicketorService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TicketorService ticketorService = (TicketorService) objCreate;
        vc.s.k(ticketorService);
        return ticketorService;
    }

    public static TransactionAnalyticsService x(Retrofit retrofit) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TransactionAnalyticsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TransactionAnalyticsService transactionAnalyticsService = (TransactionAnalyticsService) objCreate;
        vc.s.k(transactionAnalyticsService);
        return transactionAnalyticsService;
    }

    public static xe0.e y(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "travel", mapper, 1, null, 48);
    }

    public static qvj.a z(AnalyticsDatabase db8) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        qvj.a aVarL = db8.l();
        vc.s.k(aVarL);
        return aVarL;
    }
}
