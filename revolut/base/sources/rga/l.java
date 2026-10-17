package rga;

import ael.d0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.messaging.t;
import com.revolut.core.personalisation.data.network.PersonalisationService;
import com.revolut.feature.card_order_new.impl.pricing.api.network.PricingService;
import com.revolut.feature.slot_manager.impl.network.SlotManagerService;
import com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase;
import di3.w;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.x0;
import vc.s;
import zhm.f0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l implements e4m.e {
    public static s3h.g A(kbb.c factory, s2h.f screen, s2h.e model) {
        s2h.j.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(model, "model");
        return new s3h.g(screen, model);
    }

    public static s3h.k B(kbb.c factory, p3h.a mapper) {
        s2h.j.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new s3h.k((d0) factory.f182549b, (ybl.l) factory.f182550c, mapper, (r3h.a) factory.d);
    }

    public static p3h.a C(kbb.c factory, f01.c uiKitResources) {
        s2h.j.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        return new p3h.a(uiKitResources);
    }

    public static xe0.e D(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return xe0.f.f(storageFactory, databaseSessionProvider, "upgrade_banners.pref", mapper, 0, null, 56);
    }

    public static zh3.j a(ai3.c api2, t actionDelegateFactory, g3l.a statusDialogViewConfigurationDispatcher, ln.a navigationCommandsDispatcher, rh3.d checkoutDelegateState, sf0.h serverErrorParser, ym.d loadingDispatcher, v60.e serverErrorsProvider) {
        rh3.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(checkoutDelegateState, "checkoutDelegateState");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(loadingDispatcher, "loadingDispatcher");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        ai3.b bVar = (ai3.b) api2.f5179q.get();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(checkoutDelegateState, "checkoutDelegateState");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(loadingDispatcher, "loadingDispatcher");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        di3.k kVar = bVar.f5168n;
        q89.e eVar = bVar.f;
        ph3.b checkoutNavigationFactory = bVar.d;
        Intrinsics.checkNotNullParameter(checkoutNavigationFactory, "checkoutNavigationFactory");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        return new zh3.j(kVar, new w(eVar, new gi3.c(bVar.e, checkoutNavigationFactory, bVar.k, serverErrorsProvider, bVar.i), serverErrorParser, bVar.f5167m, bVar.f5163g, bVar.f5164h, bVar.f5165j, bVar.f5162c, bVar.f5161b, bVar.f5166l, bVar.o), statusDialogViewConfigurationDispatcher, navigationCommandsDispatcher, checkoutDelegateState, loadingDispatcher, actionDelegateFactory);
    }

    public static zh3.k b(ai3.c api2, ln.a navigationCommandsDispatcher, mm.d actionsDispatcher, t actionDelegateFactory) {
        rh3.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        ai3.b bVar = (ai3.b) api2.f5179q.get();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        return new zh3.k(navigationCommandsDispatcher, actionsDispatcher, bVar.f, bVar.f5160a, new ei3.p(), actionDelegateFactory);
    }

    public static vh3.d c(ai3.c api2, ln.a navigationCommandsDispatcher, zh3.g presentationModel) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        ((ai3.b) api2.f5179q.get()).getClass();
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        return new vh3.d(navigationCommandsDispatcher, presentationModel);
    }

    public static add.b d(ecm.q qVar) {
        return new add.b(qVar, 12);
    }

    public static b6b.f e(ibh.a aVar, a31.a aVar2) {
        return new b6b.f(aVar, aVar2, 6);
    }

    public static c3d.d f(a31.a aVar, a31.a aVar2) {
        return new c3d.d(aVar, aVar2, 29);
    }

    public static e39.b g(ecm.q qVar, a31.a aVar, a31.a aVar2, xs6.a aVar3, xs6.a aVar4, xs6.a aVar5, xs6.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, xs6.a aVar20) {
        return new e39.b(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20);
    }

    public static rhe.a h(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11) {
        return new rhe.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    public static rjb.b i(a31.a aVar, ecm.q qVar) {
        return new rjb.b(aVar, qVar);
    }

    public static rlb.m j(xs6.a aVar, a31.a aVar2) {
        return new rlb.m(aVar2, aVar);
    }

    public static PricingService k(s13.a aVar, Retrofit retrofit) {
        PricingService pricingService = (PricingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PricingService.class, "create(...)");
        s.k(pricingService);
        return pricingService;
    }

    public static qtg.a l(WealthAccountClosureDatabase db8) {
        rtg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        qtg.a aVarG = db8.g();
        s.k(aVarG);
        return aVarG;
    }

    public static qtg.c m(WealthAccountClosureDatabase db8) {
        rtg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        qtg.c cVarH = db8.h();
        s.k(cVarH);
        return cVarH;
    }

    public static xe0.e n(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        rkd.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "checklist_storage", mapper, 2, u.c(new pkd.a()), 32);
    }

    public static rkd.m o(rkd.c delegatedModelFactory, rkd.d delegatedExtensionFactory) {
        rkd.p.Companion.getClass();
        Intrinsics.checkNotNullParameter(delegatedModelFactory, "delegatedModelFactory");
        Intrinsics.checkNotNullParameter(delegatedExtensionFactory, "delegatedExtensionFactory");
        return new rkd.m(delegatedModelFactory, delegatedExtensionFactory);
    }

    public static rkd.n p(rkd.c delegatedModelFactory, rkd.e delegatedPresenterFactory) {
        rkd.p.Companion.getClass();
        Intrinsics.checkNotNullParameter(delegatedModelFactory, "delegatedModelFactory");
        Intrinsics.checkNotNullParameter(delegatedPresenterFactory, "delegatedPresenterFactory");
        return new rkd.n(delegatedModelFactory, delegatedPresenterFactory);
    }

    public static w9j.b q(w9j.a factory) {
        rkf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new w9j.b();
    }

    public static WealthAccountClosureDatabase r(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        rtg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        WealthAccountClosureDatabase.Companion companion = WealthAccountClosureDatabase.INSTANCE;
        companion.getClass();
        WealthAccountClosureDatabase wealthAccountClosureDatabase = (WealthAccountClosureDatabase) companion.a(context, databaseSessionProvider, new Migration[0], databaseEncryptionMigratorFactory);
        s.k(wealthAccountClosureDatabase);
        return wealthAccountClosureDatabase;
    }

    public static SlotManagerService s(Retrofit retrofit, Json json) {
        rkd.r.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(json, "json");
        SlotManagerService slotManagerServiceA = rkd.q.a(retrofit, json);
        s.k(slotManagerServiceA);
        return slotManagerServiceA;
    }

    public static SlotManagerService t(Retrofit retrofit, Json json) {
        rkd.r.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(json, "json");
        SlotManagerService slotManagerServiceA = rkd.q.a(retrofit, json);
        s.k(slotManagerServiceA);
        return slotManagerServiceA;
    }

    public static PersonalisationService u(Retrofit retrofit) {
        rk0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(PersonalisationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PersonalisationService personalisationService = (PersonalisationService) objCreate;
        s.k(personalisationService);
        return personalisationService;
    }

    public static xe0.e v(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        rkd.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "slot_manager_storage", mapper, 2, u.c(new pkd.g()), 32);
    }

    public static xe0.e w(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        rj1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "advised_components", mapper, 1, f0.f322471a, 32);
    }

    public static c90.c x(Context context) {
        rkd.p.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new c90.c(context);
    }

    public static f01.c y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }

    public static rr5.b z(rr5.c cVar, ash.j widgetsView, com.revolut.kompot.navigable.a controller, os2.g factory) {
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Activity activityM2 = controller.m2();
        k39.b bVar = new k39.b(sri.o.c(activityM2, null, null, 14), 2);
        p56.a aVar = (p56.a) factory.f229224b;
        x0 x0Var = g1.Companion;
        View decorView = activityM2.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        x0.a(x0Var, decorView);
        rs5.c cryptoFeedWidgetComponent = (rs5.c) aVar.f233024b;
        rs5.d dVar = new rs5.d(cryptoFeedWidgetComponent, new rs5.b(), bVar);
        hsh.b widgetsApi = cryptoFeedWidgetComponent.f256961a;
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(20);
        builderBuilderWithExpectedSize.put("CardsMedium", cryptoFeedWidgetComponent.f256977o0);
        builderBuilderWithExpectedSize.put("CardsSmall", cryptoFeedWidgetComponent.p0);
        builderBuilderWithExpectedSize.put("FeaturesLarge", cryptoFeedWidgetComponent.q0);
        builderBuilderWithExpectedSize.put("TransactionsDynamic", dVar.f256988c);
        builderBuilderWithExpectedSize.put("OrdersDynamic", dVar.d);
        builderBuilderWithExpectedSize.put("NewsDynamic", dVar.e);
        builderBuilderWithExpectedSize.put("WatchlistMedium", dVar.f);
        builderBuilderWithExpectedSize.put("WatchlistLarge", dVar.f256989g);
        builderBuilderWithExpectedSize.put("WatchlistSymbol", dVar.f256990h);
        builderBuilderWithExpectedSize.put("WatchlistItems", dVar.i);
        builderBuilderWithExpectedSize.put("ReceiveSmall", dVar.f256991j);
        builderBuilderWithExpectedSize.put("AlertsMedium", dVar.k);
        builderBuilderWithExpectedSize.put("AlertsList", dVar.f256992l);
        builderBuilderWithExpectedSize.put("AllCryptoDynamic", dVar.f256993m);
        builderBuilderWithExpectedSize.put("NewlyAddedMedium", dVar.f256994n);
        builderBuilderWithExpectedSize.put("TopMoversLarge", dVar.o);
        builderBuilderWithExpectedSize.put("TopMoversDynamic", dVar.f256995p);
        builderBuilderWithExpectedSize.put("MostTradedDynamic", dVar.f256996q);
        builderBuilderWithExpectedSize.put("SymbolStandalone", dVar.f256997r);
        builderBuilderWithExpectedSize.put("SymbolSmall", dVar.f256998s);
        ImmutableMap eventHandlers = builderBuilderWithExpectedSize.build();
        Intrinsics.checkNotNullParameter(widgetsApi, "widgetsApi");
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetComponent, "cryptoFeedWidgetComponent");
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        nsh.o oVarJ = widgetsApi.a().J(widgetsView, cryptoFeedWidgetComponent, eventHandlers, cryptoFeedWidgetComponent.i());
        return new rr5.b(oVarJ, y0.b(oVarJ));
    }
}
