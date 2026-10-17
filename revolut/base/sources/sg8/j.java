package sg8;

import a2d.m;
import com.revolut.feature.apm.core.impl.money_requests.data.network.ApmMoneyRequestsActionsService;
import com.revolut.feature.apm.core.impl.money_requests.data.network.ApmMoneyRequestsService;
import com.revolut.feature.junior_graduation.impl.service.JuniorGraduationService;
import com.revolut.feature.tickets.api.declaration.DetailedTicketsApi$Toggles$TicketorRevamp;
import com.revolut.feature.tickets.impl.TicketsService;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.youTransactor.uCube.rpc.Constants;
import ecm.q;
import fnb.k;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import rlm.o;
import t29.r;
import tb4.t;
import us6.e3;
import vc.s;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j implements e4m.e {
    public static Iterable A(srk.a aVar) {
        aVar.getClass();
        StatsSection[] elements = {StatsSection.Dividends.f103763b, StatsSection.ExpenseRatios.f103768b, StatsSection.ManagementFees.f103770b, StatsSection.RiskRating.f103777b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static Iterable B(srk.a aVar) {
        aVar.getClass();
        StatsSection[] elements = {StatsSection.PerShareData.f103772b, StatsSection.DividendInformation.f103762b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static Iterable C(srk.a aVar) {
        aVar.getClass();
        StatsSection[] elements = {StatsSection.Price.f103773b, StatsSection.Volume.f103779b, StatsSection.MarketCapitalisation.f103771b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static Iterable D(srk.a aVar) {
        aVar.getClass();
        StatsSection[] elements = {StatsSection.Valuation.f103778b, StatsSection.ProfitabilityRatios.f103775b, StatsSection.ManagementEfectiveness.f103769b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static m a(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new m(aVar, aVar2, aVar3, 26);
    }

    public static k b(a1j.a aVar, a1j.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new k(aVar, aVar2, aVar3, aVar4);
    }

    public static ske.e c(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, a31.a aVar38, a31.a aVar39, a31.a aVar40, a31.a aVar41, a31.a aVar42, a31.a aVar43, a31.a aVar44, a31.a aVar45, a31.a aVar46, a31.a aVar47, a31.a aVar48, a31.a aVar49, a31.a aVar50, a31.a aVar51) {
        return new ske.e(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, aVar48, aVar49, aVar50, aVar51);
    }

    public static nd.k d(t advancedChartsHistoryInteractor, v0b.d settingsInteractor) {
        t0b.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(advancedChartsHistoryInteractor, "advancedChartsHistoryInteractor");
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        return new nd.k(13);
    }

    public static ApmMoneyRequestsActionsService e(Retrofit retrofit) {
        sz1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ApmMoneyRequestsActionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ApmMoneyRequestsActionsService apmMoneyRequestsActionsService = (ApmMoneyRequestsActionsService) objCreate;
        s.k(apmMoneyRequestsActionsService);
        return apmMoneyRequestsActionsService;
    }

    public static ApmMoneyRequestsService f(Retrofit retrofit) {
        sz1.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ApmMoneyRequestsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ApmMoneyRequestsService apmMoneyRequestsService = (ApmMoneyRequestsService) objCreate;
        s.k(apmMoneyRequestsService);
        return apmMoneyRequestsService;
    }

    public static ose.e g(uc.d factory, ff3.a deps) {
        sse.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(deps, "deps");
        boolean zC = ((jte.d) deps.a().f125269a).c(DetailedTicketsApi$Toggles$TicketorRevamp.f90443c);
        bp6.b bVar = (bp6.b) factory.f278954c;
        z9l.i iVar = (z9l.i) factory.f278952a;
        if (zC) {
            return new vse.e(iVar, bVar);
        }
        if (zC) {
            throw new NoWhenBranchMatchedException();
        }
        return new vse.d(iVar, (z9l.j) factory.f278953b, bVar);
    }

    public static o h(w29.b jsonProvider) {
        Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
        o oVar = jsonProvider.f293981a;
        s.k(oVar);
        return oVar;
    }

    public static JuniorGraduationService i(Retrofit retrofit) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(JuniorGraduationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorGraduationService juniorGraduationService = (JuniorGraduationService) objCreate;
        s.k(juniorGraduationService);
        return juniorGraduationService;
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.c(storageFactory, databaseSessionProvider, "junior_migration_asset", mapper, 3, 16);
    }

    public static ve0.c k(je0.d mapper, xe0.f storageFactory) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "lifestyle_onboarding", mapper, 12);
    }

    public static Iterable l(srk.a aVar) {
        aVar.getClass();
        StatsSection[] elements = {StatsSection.PriceRange.f103774b, StatsSection.Price.f103773b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static Iterable m(srk.a aVar) {
        aVar.getClass();
        StatsSection[] elements = {StatsSection.YieldRange.f103781b, StatsSection.Yield.f103780b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static xe0.e n(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t0b.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "advanced_charts_settings_storage", mapper, 1, f0.f322471a, 32);
    }

    public static xe0.e o(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        sse.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_tickets", mapper, 0, null, 56);
    }

    public static TicketsService p(ff3.a deps) {
        sse.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(deps, "deps");
        Object objCreate = ((Retrofit) deps.f134704c.get()).create(TicketsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TicketsService ticketsService = (TicketsService) objCreate;
        s.k(ticketsService);
        return ticketsService;
    }

    public static OkHttpClient q(xj0.i okHttpClientFactory, nz5.e networkExceptionDiagnosticsInterceptor, nz5.a accessTokenInterceptor, ulm.d authenticator) {
        sz5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        Intrinsics.checkNotNullParameter(networkExceptionDiagnosticsInterceptor, "networkExceptionDiagnosticsInterceptor");
        Intrinsics.checkNotNullParameter(accessTokenInterceptor, "accessTokenInterceptor");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        OkHttpClient.a aVarA = xj0.i.a(okHttpClientFactory, null, true, false, v.k(new nz5.a(v.k(new pz5.a(), new pz5.h())), accessTokenInterceptor), null, null, Constants.TAG_F5).a();
        nz5.f.a(aVarA, networkExceptionDiagnosticsInterceptor);
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        aVarA.f226074h = authenticator;
        return new OkHttpClient(aVarA);
    }

    public static OkHttpClient r(xj0.i okHttpClientFactory, ulm.d authenticator, qz5.b authenticationInteractor, x80.a packageNameProvider, nz5.a accessTokenInterceptor, nz5.e networkExceptionDiagnosticsInterceptor, bk0.e revolutHeadersProvider) {
        sz5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(accessTokenInterceptor, "accessTokenInterceptor");
        Intrinsics.checkNotNullParameter(networkExceptionDiagnosticsInterceptor, "networkExceptionDiagnosticsInterceptor");
        Intrinsics.checkNotNullParameter(revolutHeadersProvider, "revolutHeadersProvider");
        OkHttpClient.a aVarA = xj0.i.a(okHttpClientFactory, null, false, false, v.k(new nz5.a(v.k(new pz5.c(authenticationInteractor), new pz5.d(packageNameProvider), new pz5.f(), new pz5.g(), new pz5.e(), new pz5.a(), new pz5.d(revolutHeadersProvider), new pz5.h())), accessTokenInterceptor), null, null, Constants.TAG_F5).a();
        nz5.f.a(aVarA, networkExceptionDiagnosticsInterceptor);
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        aVarA.f226074h = authenticator;
        return new OkHttpClient(aVarA);
    }

    public static Retrofit s(ik0.b retrofitFactory, OkHttpClient okHttpClient) {
        sz5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, okHttpClient, "https://merchant.revolut.com/", null, null, 28);
        s.k(retrofitA);
        return retrofitA;
    }

    public static Retrofit t(ik0.b retrofitFactory, OkHttpClient okHttpClient) {
        sz5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, okHttpClient, "https://merchant.revolut.com/", null, null, 28);
        s.k(retrofitA);
        return retrofitA;
    }

    public static re0.d u(ne0.j memoryCache, ue0.c storage) {
        sse.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new re0.d(memoryCache, storage);
    }

    public static us6.q v(e3 e3Var) {
        us6.q qVar = (us6.q) e3Var.b();
        s.k(qVar);
        return qVar;
    }

    public static at6.a w(at6.b bVar) {
        at6.a aVar = (at6.a) bVar.b();
        s.k(aVar);
        return aVar;
    }

    public static bt6.b x(bt6.f0 f0Var) {
        bt6.b bVar = (bt6.b) f0Var.b();
        s.k(bVar);
        return bVar;
    }

    public static Iterable y(srk.a aVar) {
        aVar.getClass();
        StatsSection[] elements = {StatsSection.EeaPrice.f103766b, StatsSection.Volume.f103779b, StatsSection.EeaMarketCapitalisation.f103765b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static Iterable z(srk.a aVar) {
        aVar.getClass();
        StatsSection[] elements = {StatsSection.DividendsAndCharges.f103764b, StatsSection.EeaRiskRating.f103767b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }
}
