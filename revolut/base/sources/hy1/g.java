package hy1;

import com.revolut.feature.credit.help.impl.network.CreditHelpService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes20.dex */
public abstract class g implements e4m.e {
    public static rhe.b A(rhe.a aVar) {
        rhe.b bVar = (rhe.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static j60.c B(com.revolut.kompot.navigable.a controller, he2.b dialogHostFinder) {
        i7k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, new rp0.m(), dialogHostFinder);
    }

    public static nge.a C(nge.e eVar) {
        nge.a aVar = (nge.a) eVar.b();
        vc.s.k(aVar);
        return aVar;
    }

    public static jge.h D(jge.q qVar) {
        jge.h hVar = (jge.h) qVar.b();
        vc.s.k(hVar);
        return hVar;
    }

    public static coj.b a(doj.a factory, oej.a esimCoreInteractor, hej.a esimWidgetItemsProvider, cej.a esimFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(esimWidgetItemsProvider, "esimWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(esimWidgetItemsProvider, "esimWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        return new coj.b(esimCoreInteractor, esimWidgetItemsProvider, esimFeatureAvailabilityInteractor);
    }

    public static coj.b b(doj.a factory, oej.a esimCoreInteractor, hej.a esimWidgetItemsProvider, cej.a esimFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(esimWidgetItemsProvider, "esimWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(esimWidgetItemsProvider, "esimWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        return new coj.b(esimCoreInteractor, esimWidgetItemsProvider, esimFeatureAvailabilityInteractor);
    }

    public static q4h.b c(prl.e factory, h3h.c delegates, h3h.b controllerModelExtension) {
        i3h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new q4h.b(delegates, controllerModelExtension);
    }

    public static q4h.d d(prl.e factory, h3h.e inputData) {
        i3h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new q4h.d(inputData, (c4h.b) factory.f239325b, (c4h.c) factory.f239326c);
    }

    public static e15.e e(e15.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new e15.e(factory.f121875a, factory.f121876b, factory.f121877c);
    }

    public static CreditHelpService f(i15.a aVar, Retrofit retrofit) {
        CreditHelpService creditHelpService = (CreditHelpService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditHelpService.class, "create(...)");
        vc.s.k(creditHelpService);
        return creditHelpService;
    }

    public static xe0.e g(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        i15.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "credit_help", mapper, 0, null, 56);
    }

    public static h87.e h(h87.d delegates, g2e.t factory) {
        i87.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        h87.c cVar = (h87.c) factory.f140031b;
        return new h87.e(new h87.p(delegates, cVar), cVar);
    }

    public static Retrofit i(i15.a aVar, Retrofit retrofit, kg.o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static kg.o j(i15.a aVar, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.o oVarB = new kg.p(gson).b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static hbh.b k(hbh.j factory, h1h.f screen, h1h.b investTransactionsWidgetControllerModelExtension) {
        i1h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(investTransactionsWidgetControllerModelExtension, "investTransactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(investTransactionsWidgetControllerModelExtension, "investTransactionsWidgetControllerModelExtension");
        return new hbh.b(screen, investTransactionsWidgetControllerModelExtension);
    }

    public static hbh.i l(hbh.j factory) {
        i1h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new hbh.i(factory.f150739b, factory.f150740c, factory.d);
    }

    public static xe0.e m(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        ib8.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "JuniorPendingGraduation", mapper, 4, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5)), 32);
    }

    public static xe0.e n(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        iab.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "juniorPricingPlansStorage", mapper, 1, zhm.f0.f322471a, 32);
    }

    public static coj.g o(doj.a factory, ish.a0 widgetsUiInteractor, fej.b esimHomeFlowCommandProvider, ln.a navigationCommandsDispatcher, ash.d widgetsCommonEventDispatcher) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProvider, "esimHomeFlowCommandProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProvider, "esimHomeFlowCommandProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        return new coj.g(widgetsUiInteractor, esimHomeFlowCommandProvider, navigationCommandsDispatcher, widgetsCommonEventDispatcher);
    }

    public static a67.a p(doj.a factory, ioj.a esimWidgetCatalogueHeaderProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(esimWidgetCatalogueHeaderProvider, "esimWidgetCatalogueHeaderProvider");
        Intrinsics.checkNotNullParameter(esimWidgetCatalogueHeaderProvider, "esimWidgetCatalogueHeaderProvider");
        return new a67.a(esimWidgetCatalogueHeaderProvider, 1);
    }

    public static coj.g q(doj.a factory, ish.a0 widgetsUiInteractor, fej.b esimHomeFlowCommandProvider, ln.a navigationCommandsDispatcher, ash.d widgetsCommonEventDispatcher) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProvider, "esimHomeFlowCommandProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProvider, "esimHomeFlowCommandProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        return new coj.g(widgetsUiInteractor, esimHomeFlowCommandProvider, navigationCommandsDispatcher, widgetsCommonEventDispatcher);
    }

    public static ky1.a r(j0 provider) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        vc.s.k(provider);
        return provider;
    }

    public static ky1.a s(j0 provider) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        vc.s.k(provider);
        return provider;
    }

    public static xe0.e t(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        i9f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "transfer_investments_storage", mapper, 4, zhm.v.k(new j9f.c(), new j9f.a(), new j9f.b()), 32);
    }

    public static f01.c u(com.revolut.kompot.navigable.a controller) {
        i7k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new f01.c(controller.m2());
    }

    public static c90.c v(com.revolut.kompot.navigable.a controller) {
        hyi.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new c90.c(controller.m2());
    }

    public static ky1.a w(m0 provider) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        vc.s.k(provider);
        return provider;
    }

    public static ky1.a x(m0 provider) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        vc.s.k(provider);
        return provider;
    }

    public static q4h.g y(prl.e factory) {
        i3h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new q4h.g((kpj.f) factory.d, (ufl.b) factory.e);
    }

    public static jge.g z(jge.c cVar) {
        jge.g gVar = (jge.g) cVar.b();
        vc.s.k(gVar);
        return gVar;
    }
}
