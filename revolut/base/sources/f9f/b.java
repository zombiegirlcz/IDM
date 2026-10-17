package f9f;

import android.app.Activity;
import android.content.Context;
import androidx.room.migration.Migration;
import ash.j;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.address.impl.data.network.AddressFieldSuggestionService;
import com.revolut.feature.cards_core.impl.data.db.CardsDatabase;
import com.revolut.feature.individual_flags.data.network.IndividualFlagsService;
import com.revolut.feature.shared.order_initiation.impl.data.database.OrderInitiationPageDatabase;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferOutFlowService;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferProgressService;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferService;
import e4m.e;
import ecm.q;
import fc7.h;
import fc7.i;
import fma.h0;
import fma.i0;
import fnb.k;
import j60.c;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import jie.f;
import kotlin.jvm.internal.Intrinsics;
import nsh.p;
import om4.d0;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.k1;
import rp0.m;
import rp0.x0;
import skm.p0;
import smd.s;
import sri.o;
import t0b.l;
import tc7.d;
import yji.n;
import yud.g;
import zhm.f0;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b implements e {
    public static h A(i iVar, j widgetsView, com.revolut.kompot.navigable.a controller, s factory) {
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        k39.b bVar = new k39.b(o.c(controller.m2(), null, null, 14), 3);
        c bottomDialogExtension = new c(controller, new m(), (he2.b) factory.f264432a);
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        p pVar = new p(bottomDialogExtension);
        k1 shotDialogDisplayer = x0.a(g1.Companion, controller.D2());
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        uc7.c cVar = new uc7.c();
        d homeFeedWidgetApi = (d) ((d0) factory.f264433b).f226551b;
        tc7.e eVar = new tc7.e(homeFeedWidgetApi, new tc7.i(), pVar, bVar, pVar);
        hsh.b widgetsApi = homeFeedWidgetApi.f269585b;
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(81);
        builderBuilderWithExpectedSize.put("CobrandsSmall", homeFeedWidgetApi.V2);
        builderBuilderWithExpectedSize.put("CobrandsMedium", homeFeedWidgetApi.W2);
        builderBuilderWithExpectedSize.put("P2PInternationalWidgetSmall", homeFeedWidgetApi.X2);
        builderBuilderWithExpectedSize.put("LoanProgressMedium", homeFeedWidgetApi.Y2);
        builderBuilderWithExpectedSize.put("LoanInterestRateSmall", homeFeedWidgetApi.Z2);
        builderBuilderWithExpectedSize.put("AlertsMedium", eVar.e);
        builderBuilderWithExpectedSize.put("AlertsList", eVar.f);
        builderBuilderWithExpectedSize.put("EsimHomeSmall", eVar.f269655g);
        builderBuilderWithExpectedSize.put("EsimHomeMedium", eVar.f269656h);
        builderBuilderWithExpectedSize.put("WatchlistMedium", eVar.i);
        builderBuilderWithExpectedSize.put("WatchlistLarge", eVar.f269658j);
        builderBuilderWithExpectedSize.put("WatchlistSymbol", eVar.k);
        builderBuilderWithExpectedSize.put("WatchlistItems", eVar.f269660l);
        builderBuilderWithExpectedSize.put("NearbyRewardsMedium", eVar.f269661m);
        builderBuilderWithExpectedSize.put("RewardsHubMedium", eVar.f269662n);
        builderBuilderWithExpectedSize.put("RevPointsRimMedium", eVar.o);
        builderBuilderWithExpectedSize.put("CreditCardRewards", eVar.f269665p);
        builderBuilderWithExpectedSize.put("CreditCardAdditionalCardholders", eVar.f269666q);
        builderBuilderWithExpectedSize.put("CreditCardMsiShops", eVar.f269667r);
        builderBuilderWithExpectedSize.put("CreditCardInstalment", eVar.f269669s);
        builderBuilderWithExpectedSize.put("CreditCardStatement", eVar.f269671t);
        builderBuilderWithExpectedSize.put("CreditCardRevPoints", eVar.u);
        builderBuilderWithExpectedSize.put("CreditCardFeeWaiver", eVar.v);
        builderBuilderWithExpectedSize.put("CollateralAvailableToWithdraw", eVar.f269673w);
        builderBuilderWithExpectedSize.put("CreditHealthSmall", eVar.f269674x);
        builderBuilderWithExpectedSize.put("ProCashback", eVar.f269675y);
        builderBuilderWithExpectedSize.put("ProPockets", eVar.z);
        builderBuilderWithExpectedSize.put("ProPocketsSmall", eVar.A);
        builderBuilderWithExpectedSize.put("ProSales", eVar.B);
        builderBuilderWithExpectedSize.put("ProSalesAnalytics", eVar.C);
        builderBuilderWithExpectedSize.put("ProSalesAnalyticsSmall", eVar.D);
        builderBuilderWithExpectedSize.put("ProToolbox", eVar.E);
        builderBuilderWithExpectedSize.put("ProVATReminder", eVar.F);
        builderBuilderWithExpectedSize.put("ProTaxHub", eVar.G);
        builderBuilderWithExpectedSize.put("ProPerks", eVar.H);
        builderBuilderWithExpectedSize.put("AutomationsList", eVar.I);
        builderBuilderWithExpectedSize.put("TotalWealthList", eVar.J);
        builderBuilderWithExpectedSize.put("TotalWealthListSmall", eVar.K);
        builderBuilderWithExpectedSize.put("ChallengesSmall", eVar.L);
        builderBuilderWithExpectedSize.put("JuniorCardsSmall", eVar.M);
        builderBuilderWithExpectedSize.put("JuniorPartnershipsMedium", eVar.N);
        builderBuilderWithExpectedSize.put("JuniorPaymentLink", eVar.O);
        builderBuilderWithExpectedSize.put("JuniorAppAccess", eVar.P);
        builderBuilderWithExpectedSize.put("LinkedCard", eVar.Q);
        builderBuilderWithExpectedSize.put("GroupPocketMembersList", eVar.R);
        builderBuilderWithExpectedSize.put("BillsList", eVar.S);
        builderBuilderWithExpectedSize.put("PocketLinkQR", eVar.T);
        builderBuilderWithExpectedSize.put("Goals", eVar.U);
        builderBuilderWithExpectedSize.put("VaultAutomationsList", eVar.V);
        builderBuilderWithExpectedSize.put("SavingsSmall", eVar.W);
        builderBuilderWithExpectedSize.put("TotalSavingsSmall", eVar.X);
        builderBuilderWithExpectedSize.put("EarnedInterestSmall", eVar.Y);
        builderBuilderWithExpectedSize.put("SavingsCashflowSmall", eVar.Z);
        builderBuilderWithExpectedSize.put("SavingsSavedThisMonthSmall", eVar.f269649a0);
        builderBuilderWithExpectedSize.put("SavingsChallengeGoal", eVar.f269651b0);
        builderBuilderWithExpectedSize.put("SavingsFixedTermAccountProgressWidget", eVar.c0);
        builderBuilderWithExpectedSize.put("SavingsFixedTermAccountInterestEarnedWidget", eVar.f269653d0);
        builderBuilderWithExpectedSize.put("AssistantLarge", eVar.f269654e0);
        builderBuilderWithExpectedSize.put("OrderTrackingMedium", eVar.f0);
        builderBuilderWithExpectedSize.put("AddNewProductDynamic", eVar.g0);
        l lVar = eVar.f269657h0;
        builderBuilderWithExpectedSize.put("AnalyticsSmall", lVar);
        builderBuilderWithExpectedSize.put("AnalyticsMedium", lVar);
        builderBuilderWithExpectedSize.put("CashflowSmall", eVar.i0);
        l lVar2 = eVar.j0;
        builderBuilderWithExpectedSize.put("TotalWealthLarge", lVar2);
        builderBuilderWithExpectedSize.put("TotalWealthItems", lVar2);
        builderBuilderWithExpectedSize.put("TotalWealthSmall", lVar2);
        l lVar3 = eVar.f269659k0;
        builderBuilderWithExpectedSize.put("TransfersMedium", lVar3);
        builderBuilderWithExpectedSize.put("TransfersSmall", lVar3);
        builderBuilderWithExpectedSize.put("DonationsList", eVar.l0);
        builderBuilderWithExpectedSize.put("JuniorAccountSmall", eVar.m0);
        l lVar4 = eVar.f269663n0;
        builderBuilderWithExpectedSize.put("UpcomingPaymentsMedium", lVar4);
        builderBuilderWithExpectedSize.put("UpcomingPaymentsLarge", lVar4);
        builderBuilderWithExpectedSize.put("UpcomingPaymentsList", lVar4);
        l lVar5 = eVar.f269664o0;
        builderBuilderWithExpectedSize.put("ATMMedium", lVar5);
        builderBuilderWithExpectedSize.put("ATMSmall", lVar5);
        builderBuilderWithExpectedSize.put("CashbackLarge", eVar.p0);
        l lVar6 = eVar.q0;
        builderBuilderWithExpectedSize.put("CardsMedium", lVar6);
        builderBuilderWithExpectedSize.put("CardsSmall", lVar6);
        builderBuilderWithExpectedSize.put("RevPointsSmall", eVar.f269668r0);
        builderBuilderWithExpectedSize.put("TravelLarge", eVar.f269670s0);
        builderBuilderWithExpectedSize.put("InsuranceMedium", eVar.f269672t0);
        ImmutableMap eventHandlers = builderBuilderWithExpectedSize.build();
        Intrinsics.checkNotNullParameter(widgetsApi, "widgetsApi");
        Intrinsics.checkNotNullParameter(homeFeedWidgetApi, "homeFeedWidgetApi");
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        nsh.o oVarJ = widgetsApi.a().J(widgetsView, homeFeedWidgetApi, eventHandlers, homeFeedWidgetApi.i());
        Set setB = y0.b(bottomDialogExtension);
        n[] elements = {oVarJ, pVar, cVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new h(oVarJ, setB, kotlin.collections.d.y0(elements));
    }

    public static List B(f coBankFooterCoordinator, pfe.i fscsFooterCoordinator, q55.b loanFooterCoordinator, pfe.i creditFooterCoordinator) {
        fie.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(coBankFooterCoordinator, "coBankFooterCoordinator");
        Intrinsics.checkNotNullParameter(fscsFooterCoordinator, "fscsFooterCoordinator");
        Intrinsics.checkNotNullParameter(loanFooterCoordinator, "loanFooterCoordinator");
        Intrinsics.checkNotNullParameter(creditFooterCoordinator, "creditFooterCoordinator");
        List listK = v.k(fscsFooterCoordinator, coBankFooterCoordinator, loanFooterCoordinator, creditFooterCoordinator);
        vc.s.k(listK);
        return listK;
    }

    public static fma.h C(h0 h0Var) {
        fma.h hVar = (fma.h) h0Var.b();
        vc.s.k(hVar);
        return hVar;
    }

    public static fma.l D(i0 i0Var) {
        fma.l lVar = (fma.l) i0Var.b();
        vc.s.k(lVar);
        return lVar;
    }

    public static ajf.d a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new ajf.d(aVar, aVar2, aVar3, aVar4, aVar5, 3);
    }

    public static fnb.j b(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, xs6.a aVar5, xs6.a aVar6, a31.a aVar7) {
        return new fnb.j(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static k c(xs6.a aVar, a31.a aVar2, xs6.a aVar3, a31.a aVar4) {
        return new k(aVar, aVar2, aVar3, aVar4);
    }

    public static fob.b d(q qVar, xs6.a aVar, xs6.a aVar2, xs6.a aVar3, xs6.a aVar4, xs6.a aVar5, xs6.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, xs6.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34) {
        return new fob.b(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34);
    }

    public static n e(gdh.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    public static n f(gdh.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    public static CardsDatabase g(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        fa3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        CardsDatabase cardsDatabase = (CardsDatabase) CardsDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{ga3.a.f142058c}, databaseEncryptionMigratorFactory);
        vc.s.k(cardsDatabase);
        return cardsDatabase;
    }

    public static AddressFieldSuggestionService h(Retrofit retrofit) {
        fj1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AddressFieldSuggestionService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AddressFieldSuggestionService addressFieldSuggestionService = (AddressFieldSuggestionService) objCreate;
        vc.s.k(addressFieldSuggestionService);
        return addressFieldSuggestionService;
    }

    public static gq6.f i(fq6.a api2) {
        fke.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(api2, "api");
        gte.a aVarB = api2.d.b();
        vc.s.j(aVarB);
        rtd.a aVar = api2.f137191c;
        avd.b bVarC = aVar.c();
        vc.s.j(bVarC);
        g gVarD = aVar.d();
        vc.s.j(gVarD);
        return new gq6.f(aVarB, bVarC, gVarD, new iq6.a(), api2.f.a());
    }

    public static Set j(gdh.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Set setZ2 = extension.Z2();
        vc.s.k(setZ2);
        return setZ2;
    }

    public static Set k(gdh.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Set setZ2 = extension.Z2();
        vc.s.k(setZ2);
        return setZ2;
    }

    public static sri.m l(Context context) {
        fi5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static rxl.b m(Activity activity, rxl.a nudgeDisplayerFactory) {
        fie.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(nudgeDisplayerFactory, "nudgeDisplayerFactory");
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new rxl.b(activity, nudgeDisplayerFactory.f258186a, nudgeDisplayerFactory.f258187b, nudgeDisplayerFactory.f258188c, nudgeDisplayerFactory.d);
    }

    public static le0.a n(kg.o gson, le0.b gsonObjectMapperFactory) {
        fbd.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return gsonObjectMapperFactory.a(new kg.p(gson).b());
    }

    public static xad.a o(OrderInitiationPageDatabase db8) {
        fbd.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        xad.a aVarG = db8.g();
        vc.s.k(aVarG);
        return aVarG;
    }

    public static OrderInitiationPageDatabase p(z70.a contextProvider, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        Set typeConverters = Collections.EMPTY_SET;
        fbd.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        OrderInitiationPageDatabase.Companion aVar = OrderInitiationPageDatabase.INSTANCE;
        String token = databaseSessionProvider.getToken();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        OrderInitiationPageDatabase orderInitiationPageDatabase = (OrderInitiationPageDatabase) ce0.a.b(new qg7.k(contextProvider, databaseEncryptionMigratorFactory, token, 19));
        OrderInitiationPageDatabase.f = orderInitiationPageDatabase;
        Intrinsics.h(orderInitiationPageDatabase);
        return orderInitiationPageDatabase;
    }

    public static s93.c q(CardsDatabase db8) {
        fa3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        s93.c cVarG = db8.g();
        vc.s.k(cVarG);
        return cVarG;
    }

    public static void r(Retrofit retrofit) {
        ff3.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
    }

    public static IndividualFlagsService s(Retrofit retrofit) {
        fh7.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(IndividualFlagsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        IndividualFlagsService individualFlagsService = (IndividualFlagsService) objCreate;
        vc.s.k(individualFlagsService);
        return individualFlagsService;
    }

    public static xe0.b t(xe0.f storageFactory, yk0.a dbSessionProvider, ke0.d parcelableObjectMapperFactory, ke0.b compositeBinaryObjectMapperFactory, ke0.f primitiveBinaryObjectMapperFactory) {
        fa0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(parcelableObjectMapperFactory, "parcelableObjectMapperFactory");
        Intrinsics.checkNotNullParameter(compositeBinaryObjectMapperFactory, "compositeBinaryObjectMapperFactory");
        Intrinsics.checkNotNullParameter(primitiveBinaryObjectMapperFactory, "primitiveBinaryObjectMapperFactory");
        List mappers = v.k(new ke0.c(), new ke0.e());
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        return xe0.f.a(storageFactory, dbSessionProvider, "BACKEND_FLOW_SESSIONS_STORAGE", new ke0.a(mappers));
    }

    public static xe0.e u(kg.o gson, le0.b factory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        fh7.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        pVar.c(new dh7.a(), ch7.c.class);
        return xe0.f.f(storageFactory, databaseSessionProvider, "storage_individual_flag.pref", factory.a(pVar.b()), 1, f0.f322471a, 32);
    }

    public static xe0.e v(yk0.a databaseSessionProvider, je0.d objectMapper, xe0.f storageFactory) {
        fbd.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "storage_order_initiation.pref", objectMapper, 0, null, 56);
    }

    public static ye0.b w(Context context) {
        fe0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        p0 p0Var = p0.f264001a;
        return new ye0.b(context, rd0.e.a(elm.f.f127540b));
    }

    public static TransferOutFlowService x(a aVar, Retrofit retrofit) {
        TransferOutFlowService transferOutFlowService = (TransferOutFlowService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TransferOutFlowService.class, "create(...)");
        vc.s.k(transferOutFlowService);
        return transferOutFlowService;
    }

    public static TransferProgressService y(a aVar, Retrofit retrofit) {
        TransferProgressService transferProgressService = (TransferProgressService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TransferProgressService.class, "create(...)");
        vc.s.k(transferProgressService);
        return transferProgressService;
    }

    public static TransferService z(a aVar, Retrofit retrofit) {
        TransferService transferService = (TransferService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TransferService.class, "create(...)");
        vc.s.k(transferService);
        return transferService;
    }
}
