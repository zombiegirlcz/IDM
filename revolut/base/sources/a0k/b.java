package a0k;

import a1e.h;
import a2d.p;
import a51.d;
import aah.i;
import aah.m;
import ad3.c;
import afj.x3;
import android.content.Context;
import androidx.room.migration.Migration;
import b0k.k;
import b0k.l;
import com.revolut.feature.cashback.impl.network.CashbackBoxService;
import com.revolut.feature.cashback.impl.network.CashbackService;
import com.revolut.feature.cashback.impl.network.CashbackStatusService;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.network.EsimCheckoutService;
import com.revolut.retail.feature.esim.impl.network.EsimConfigurationService;
import com.revolut.retail.feature.esim.impl.network.EsimConnectEligibilityService;
import com.revolut.retail.feature.esim.impl.network.EsimDataPlanService;
import com.revolut.retail.feature.esim.impl.network.EsimEventsService;
import com.revolut.retail.feature.esim.impl.network.EsimFeedbackService;
import com.revolut.retail.feature.esim.impl.network.EsimGiftingService;
import com.revolut.retail.feature.esim.impl.network.EsimHelpService;
import com.revolut.retail.feature.marketnews.impl.data.database.MarketNewsDatabase;
import e4m.e;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import retrofit2.Retrofit;
import vc.s;
import yc0.j;
import yji.n;
import z0h.s1;
import za0.g;
import zzj.f;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b implements e {
    public static m A(i factory) {
        p.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.b();
    }

    public static f B(MarketNewsDatabase db8) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        f fVarH = db8.h();
        s.k(fVarH);
        return fVarH;
    }

    public static c4f.b C(c4f.m mVar) {
        c4f.b bVar = (c4f.b) mVar.b();
        s.k(bVar);
        return bVar;
    }

    public static xpb.a D(qjb.i factory, zc7.i delegate) {
        ad7.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new xpb.a(((ppb.a) factory).o, delegate);
    }

    public static h a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, q qVar) {
        return new h(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, 0);
    }

    public static a2d.m b(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new a2d.m(aVar, aVar2, aVar3, 3);
    }

    public static d c(xs6.a aVar) {
        return new d(aVar, 1);
    }

    public static a7d.a d(a31.a aVar) {
        return new a7d.a(aVar, 0);
    }

    public static g e(j60.a bottomExpandableDialogControllerExtension, j mapper, qa0.b externalNavigationExtension, ViewController viewController, ua0.a itemsScreenControllerModelExtension, c70.a clipboard) {
        ab0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(itemsScreenControllerModelExtension, "itemsScreenControllerModelExtension");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        return new g(bottomExpandableDialogControllerExtension, mapper, externalNavigationExtension, jh.d.f(viewController.m2()).Q(), itemsScreenControllerModelExtension, clipboard);
    }

    public static CashbackBoxService f(c cVar, Retrofit retrofit) {
        CashbackBoxService cashbackBoxService = (CashbackBoxService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CashbackBoxService.class, "create(...)");
        s.k(cashbackBoxService);
        return cashbackBoxService;
    }

    public static CashbackService g(c cVar, Retrofit retrofit) {
        CashbackService cashbackService = (CashbackService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CashbackService.class, "create(...)");
        s.k(cashbackService);
        return cashbackService;
    }

    public static CashbackStatusService h(c cVar, Retrofit retrofit) {
        CashbackStatusService cashbackStatusService = (CashbackStatusService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CashbackStatusService.class, "create(...)");
        s.k(cashbackStatusService);
        return cashbackStatusService;
    }

    public static xe0.e i(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        ad3.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "cashback_storage", mapper, 0, null, 56);
    }

    public static MarketNewsDatabase j(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        MarketNewsDatabase.Companion aVar = MarketNewsDatabase.INSTANCE;
        aVar.getClass();
        MarketNewsDatabase marketNewsDatabase = (MarketNewsDatabase) aVar.a(context, databaseSessionProvider, new Migration[]{b0k.d.f11682c, b0k.e.f11683c, b0k.f.f11684c, b0k.g.f11685c, b0k.h.f11686c, b0k.i.f11687c, b0k.j.f11688c, k.f11689c, l.f11690c, b0k.a.f11679c, b0k.b.f11680c, b0k.c.f11681c}, databaseEncryptionMigratorFactory);
        s.k(marketNewsDatabase);
        return marketNewsDatabase;
    }

    public static aah.g k(i factory, s1 view, aah.h modelExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        return new aah.g(view, modelExtension);
    }

    public static aah.g l(i factory, s1 view, aah.h modelExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        factory.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        return new aah.g(view, modelExtension);
    }

    public static n m(aah.h ext) {
        Intrinsics.checkNotNullParameter(ext, "ext");
        s.k(ext);
        return ext;
    }

    public static n n(aah.h ext) {
        Intrinsics.checkNotNullParameter(ext, "ext");
        s.k(ext);
        return ext;
    }

    public static EsimCheckoutService o(x3 x3Var, Retrofit retrofit) {
        EsimCheckoutService esimCheckoutService = (EsimCheckoutService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimCheckoutService.class, "create(...)");
        s.k(esimCheckoutService);
        return esimCheckoutService;
    }

    public static EsimConfigurationService p(x3 x3Var, Retrofit retrofit) {
        EsimConfigurationService esimConfigurationService = (EsimConfigurationService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimConfigurationService.class, "create(...)");
        s.k(esimConfigurationService);
        return esimConfigurationService;
    }

    public static EsimConnectEligibilityService q(x3 x3Var, Retrofit retrofit) {
        EsimConnectEligibilityService esimConnectEligibilityService = (EsimConnectEligibilityService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimConnectEligibilityService.class, "create(...)");
        s.k(esimConnectEligibilityService);
        return esimConnectEligibilityService;
    }

    public static EsimDataPlanService r(x3 x3Var, Retrofit retrofit) {
        EsimDataPlanService esimDataPlanService = (EsimDataPlanService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimDataPlanService.class, "create(...)");
        s.k(esimDataPlanService);
        return esimDataPlanService;
    }

    public static EsimEventsService s(x3 x3Var, Retrofit retrofit) {
        EsimEventsService esimEventsService = (EsimEventsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimEventsService.class, "create(...)");
        s.k(esimEventsService);
        return esimEventsService;
    }

    public static EsimFeedbackService t(x3 x3Var, Retrofit retrofit) {
        EsimFeedbackService esimFeedbackService = (EsimFeedbackService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimFeedbackService.class, "create(...)");
        s.k(esimFeedbackService);
        return esimFeedbackService;
    }

    public static EsimGiftingService u(x3 x3Var, Retrofit retrofit) {
        EsimGiftingService esimGiftingService = (EsimGiftingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimGiftingService.class, "create(...)");
        s.k(esimGiftingService);
        return esimGiftingService;
    }

    public static EsimHelpService v(x3 x3Var, Retrofit retrofit) {
        EsimHelpService esimHelpService = (EsimHelpService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", EsimHelpService.class, "create(...)");
        s.k(esimHelpService);
        return esimHelpService;
    }

    public static r18.c w(prl.e factory, a18.g view, a18.c controllerModelExtension) {
        a18.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new r18.c(view, controllerModelExtension);
    }

    public static r18.m x(prl.e factory, a18.e inputData) {
        a18.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new r18.m((jt0.b) factory.f239326c, inputData, (oih.j) factory.d, (h0) factory.e);
    }

    public static zzj.b y(MarketNewsDatabase db8) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        zzj.b bVarG = db8.g();
        s.k(bVarG);
        return bVarG;
    }

    public static aah.h z(i factory) {
        p.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a();
    }
}
