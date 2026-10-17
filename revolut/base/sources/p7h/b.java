package p7h;

import a51.d;
import aah.i;
import aah.m;
import b6b.f;
import com.revolut.feature.credit_card.autopay.impl.network.ApiService;
import com.revolut.feature.credit_card.autopay.impl.v3.network.CreditCardAutopayService;
import com.revolut.feature.donations.impl.database.DonationsDatabase;
import com.revolut.feature.wealth.impl.data.network.collections.CollectionsService;
import com.revolut.feature.wealth.impl.data.network.margin_borrowing.WealthMarginBorrowingService;
import com.revolut.feature.wealth.impl.data.network.mostowned.MostOwnedAssetsService;
import com.revolut.feature.wealth.impl.data.network.mosttraded.MostTradedAssetsService;
import com.revolut.feature.wealth.impl.data.network.popularfirstbuy.PopularFirstBuyService;
import com.revolut.feature.wealth.impl.data.network.portfolio_metrics.PortfolioMetricsService;
import com.revolut.feature.wealth.impl.data.network.portfolio_performance.PortfolioPerformanceService;
import com.revolut.feature.wealth.impl.data.network.recurring_buy_hub_collection.RecurringBuyHubCollectionService;
import com.revolut.feature.wealth.impl.data.network.topmovers.TopMoversService;
import com.revolut.feature.wealth.impl.data.network.trader_profile.TraderProfileService;
import e4m.e;
import ecm.q;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import lal.j;
import p8a.q1;
import pa6.b0;
import pa6.w;
import pa6.y;
import pb5.g;
import pbk.h;
import retrofit2.Retrofit;
import ue0.c;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b implements e {
    public static PortfolioMetricsService A(a aVar, Retrofit retrofit) {
        PortfolioMetricsService portfolioMetricsService = (PortfolioMetricsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PortfolioMetricsService.class, "create(...)");
        s.k(portfolioMetricsService);
        return portfolioMetricsService;
    }

    public static PortfolioPerformanceService B(a aVar, Retrofit retrofit) {
        PortfolioPerformanceService portfolioPerformanceService = (PortfolioPerformanceService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PortfolioPerformanceService.class, "create(...)");
        s.k(portfolioPerformanceService);
        return portfolioPerformanceService;
    }

    public static RecurringBuyHubCollectionService C(a aVar, Retrofit retrofit) {
        RecurringBuyHubCollectionService recurringBuyHubCollectionService = (RecurringBuyHubCollectionService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RecurringBuyHubCollectionService.class, "create(...)");
        s.k(recurringBuyHubCollectionService);
        return recurringBuyHubCollectionService;
    }

    public static TopMoversService D(a aVar, Retrofit retrofit) {
        TopMoversService topMoversService = (TopMoversService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TopMoversService.class, "create(...)");
        s.k(topMoversService);
        return topMoversService;
    }

    public static d a(mva.a aVar) {
        return new d(aVar, 14);
    }

    public static ava.d b(a31.a aVar, a31.a aVar2, r5a.b bVar) {
        return new ava.d(aVar, aVar2, bVar, 2);
    }

    public static f c(a31.a aVar, r5a.b bVar) {
        return new f(bVar, aVar, 5);
    }

    public static f d(mva.a aVar, a31.a aVar2) {
        return new f(aVar, aVar2, 4);
    }

    public static p8a.a e(a31.a aVar, q qVar) {
        return new p8a.a(aVar, qVar);
    }

    public static q1 f(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, q qVar) {
        return new q1(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, qVar);
    }

    public static w g(a31.a aVar) {
        return new w(aVar);
    }

    public static h h(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, q qVar, j jVar) {
        return new h(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, qVar, jVar);
    }

    public static ApiService i(g gVar, Retrofit retrofit) {
        ApiService apiService = (ApiService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApiService.class, "create(...)");
        s.k(apiService);
        return apiService;
    }

    public static CreditCardAutopayService j(g gVar, Retrofit retrofit) {
        CreditCardAutopayService creditCardAutopayService = (CreditCardAutopayService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditCardAutopayService.class, "create(...)");
        s.k(creditCardAutopayService);
        return creditCardAutopayService;
    }

    public static ja6.b k(DonationsDatabase database) {
        y.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        ja6.b bVarG = database.g();
        s.k(bVarG);
        return bVarG;
    }

    public static xe0.e l(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        b0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "donations", mapper, 0, null, 56);
    }

    public static Retrofit m(g gVar, Retrofit retrofit, o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static o n(g gVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        return sb5.a.a(gson);
    }

    public static xe0.e o(o baseGson, le0.b gsonObjectMapperFactory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        pb5.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "credit_card_autopay", gsonObjectMapperFactory.a(sb5.a.a(baseGson)), 3, v.k(new cc5.a(), new cc5.b()), 32);
    }

    public static TraderProfileService p(a aVar, Retrofit retrofit) {
        TraderProfileService traderProfileService = (TraderProfileService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TraderProfileService.class, "create(...)");
        s.k(traderProfileService);
        return traderProfileService;
    }

    public static xx4.d q(ne0.d hashMapCache) {
        pb5.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
        return new xx4.d(hashMapCache);
    }

    public static xx4.e r(c storage) {
        pb5.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xx4.e(storage);
    }

    public static m s(i factory) {
        p9h.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.b();
    }

    public static WealthMarginBorrowingService t(a aVar, Retrofit retrofit) {
        WealthMarginBorrowingService wealthMarginBorrowingService = (WealthMarginBorrowingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", WealthMarginBorrowingService.class, "create(...)");
        s.k(wealthMarginBorrowingService);
        return wealthMarginBorrowingService;
    }

    public static CollectionsService u(a aVar, Retrofit retrofit) {
        CollectionsService collectionsService = (CollectionsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CollectionsService.class, "create(...)");
        s.k(collectionsService);
        return collectionsService;
    }

    public static ebj.b v(qbj.a aVar) {
        ebj.b bVar = (ebj.b) aVar.b();
        s.k(bVar);
        return bVar;
    }

    public static MostOwnedAssetsService w(a aVar, Retrofit retrofit) {
        MostOwnedAssetsService mostOwnedAssetsService = (MostOwnedAssetsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", MostOwnedAssetsService.class, "create(...)");
        s.k(mostOwnedAssetsService);
        return mostOwnedAssetsService;
    }

    public static MostTradedAssetsService x(a aVar, Retrofit retrofit) {
        MostTradedAssetsService mostTradedAssetsService = (MostTradedAssetsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", MostTradedAssetsService.class, "create(...)");
        s.k(mostTradedAssetsService);
        return mostTradedAssetsService;
    }

    public static q7k.c y(q7k.m mVar) {
        q7k.c cVar = (q7k.c) mVar.b();
        s.k(cVar);
        return cVar;
    }

    public static PopularFirstBuyService z(a aVar, Retrofit retrofit) {
        PopularFirstBuyService popularFirstBuyService = (PopularFirstBuyService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PopularFirstBuyService.class, "create(...)");
        s.k(popularFirstBuyService);
        return popularFirstBuyService;
    }
}
