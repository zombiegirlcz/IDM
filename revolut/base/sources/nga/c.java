package nga;

import aah.m;
import android.content.Context;
import az0.w1;
import com.revolut.feature.kyc.core.impl.docs.KycDocsService;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase;
import com.revolut.retail.feature.ratedetails.impl.network.alert.RatesAlertsService;
import cu8.r0;
import java.util.concurrent.TimeUnit;
import kbh.h;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import mga.i0;
import mga.l0;
import n5k.q;
import npk.k;
import retrofit2.Retrofit;
import rga.i;
import rga.r;
import sri.o;
import tpi.j;
import vc.s;
import ybl.l;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c implements e4m.e {
    public static o9h.a A(o0h.b bVar, ou5.b factory) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new o9h.a((h) factory.f229820b, (kbh.a) factory.f229821c, (m) factory.d);
    }

    public static b0 B(o0h.a aVar, ou5.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new b0((l) factory.f229819a);
    }

    public static o9h.e C(o0h.b bVar, ou5.b factory, b0 presentationModel, o9h.a mapper, o9h.g router) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        return new o9h.e(presentationModel, mapper, router);
    }

    public static o9h.g D(o0h.a aVar, ou5.b factory, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        return new o9h.g(navigationCommandsDispatcher, (z0h.a) factory.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n a(q extension) {
        o5k.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        n nVar = (n) extension;
        s.k(nVar);
        return nVar;
    }

    public static c3d.d b(a31.a aVar, a31.a aVar2) {
        return new c3d.d(aVar, aVar2, 20);
    }

    public static dg6.b c(ecm.q qVar, a31.a aVar, a31.a aVar2, c63.b bVar, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6) {
        return new dg6.b(qVar, aVar, aVar2, bVar, aVar3, aVar4, aVar5, aVar6);
    }

    public static ee6.f d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, ecm.q qVar) {
        return new ee6.f(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, 8);
    }

    public static i9l.b e(a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar, jqa.m mVar) {
        return new i9l.b(qVar, aVar, aVar2, mVar, aVar3);
    }

    public static n8j.a f(a31.a aVar) {
        return new n8j.a(aVar, 6);
    }

    public static nge.e g(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new nge.e(aVar, aVar2, aVar3, aVar4);
    }

    public static nm4.a h(ecm.q qVar, a31.a aVar, a31.a aVar2, ibh.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new nm4.a(aVar, aVar2, aVar4, aVar5, qVar, aVar3);
    }

    public static o5a.b i(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, r5a.b bVar, a31.a aVar22, a31.a aVar23, a31.a aVar24) {
        return new o5a.b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, bVar, aVar22, aVar23, aVar24);
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "rate_details_chart_storage", mapper, 1, f0.f322471a, 32);
    }

    public static qe0.s k(ze0.a forceReloadStrategyFactory, ue0.c storage) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ((ze0.c) forceReloadStrategyFactory).a(storage, TimeUnit.MINUTES.toMillis(5L));
    }

    public static i l(k18.c factory, ViewController viewController, wn.a adsTrackingControllerModelExtension) {
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        return factory.l(viewController, adsTrackingControllerModelExtension);
    }

    public static cu8.a m(o7.d defaultProvider, sri.m navigator, f9b.f errorView, j progressView) {
        o1i.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        return new cu8.a((r0) defaultProvider.f222642b, errorView, progressView, navigator);
    }

    public static KycDocsService n(Retrofit retrofit) {
        nt8.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(KycDocsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        KycDocsService kycDocsService = (KycDocsService) objCreate;
        s.k(kycDocsService);
        return kycDocsService;
    }

    public static sri.m o(Context context) {
        nq3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static sri.m p(z70.a contextProvider) {
        nl5.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return o.c(contextProvider.getContext(), null, null, 14);
    }

    public static gpk.c q(RatesRoomDatabase db8) {
        npk.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        gpk.c cVarK = db8.k();
        s.k(cVarK);
        return cVarK;
    }

    public static RatesAlertsService r(Retrofit retrofit) {
        RatesAlertsService ratesAlertsService = (RatesAlertsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RatesAlertsService.class, "create(...)");
        s.k(ratesAlertsService);
        return ratesAlertsService;
    }

    public static rga.h s(k18.c factory, i0 screen, mga.f0 controllerModelExtension, on.a viewableRecordItemCollector) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        return new rga.h(screen, controllerModelExtension, viewableRecordItemCollector, (gte.a) factory.f180141c);
    }

    public static i t(BaseScreen screen, k18.c factory, wn.a adsTrackingControllerModelExtension) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        return factory.l(screen, adsTrackingControllerModelExtension);
    }

    public static i u(k18.c factory, ViewController viewController, wn.a adsTrackingControllerModelExtension) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        return factory.l(viewController, adsTrackingControllerModelExtension);
    }

    public static qz0.n v(Context context, bk0.e revolutHeadersProvider) {
        nm2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revolutHeadersProvider, "revolutHeadersProvider");
        return new qz0.n(context, revolutHeadersProvider, revolutHeadersProvider);
    }

    public static r w(k18.c factory, l0 screen, mga.f0 controllerModelExtension, on.a viewableRecordItemCollector) {
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        return new r(screen, controllerModelExtension, viewableRecordItemCollector, (gte.a) factory.f180141c);
    }

    public static w1 x(Context context, bk0.e revolutHeadersProvider) {
        nm2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revolutHeadersProvider, "revolutHeadersProvider");
        return new w1(context, revolutHeadersProvider, revolutHeadersProvider);
    }

    public static o9h.f y(o0h.b bVar, ou5.b factory, o9h.e footerDisclosureDelegate, en.c navigationDelegate, n0h.a view) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(footerDisclosureDelegate, "footerDisclosureDelegate");
        Intrinsics.checkNotNullParameter(navigationDelegate, "navigationDelegate");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(footerDisclosureDelegate, "footerDisclosureDelegate");
        Intrinsics.checkNotNullParameter(navigationDelegate, "navigationDelegate");
        Intrinsics.checkNotNullParameter(view, "view");
        return new o9h.f(footerDisclosureDelegate, navigationDelegate, view);
    }

    public static jq8.a z(oq8.g gVar) {
        jq8.a aVar = (jq8.a) gVar.b();
        s.k(aVar);
        return aVar;
    }
}
