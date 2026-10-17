package t2d;

import android.content.Context;
import androidx.credentials.CredentialManager;
import androidx.room.migration.Migration;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.junior_transfer_request.impl.db.JuniorTransferRequestDatabase;
import com.revolut.feature.junior_transfer_request.impl.service.JuniorTransferRequestService;
import com.revolut.trading.orders.data.network.services.MonthlyInvestmentsService;
import dsh.g;
import dsh.h;
import e4m.e;
import ish.z;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import ph0.f;
import retrofit2.Retrofit;
import sri.m;
import ta9.b0;
import ta9.o0;
import ta9.r0;
import tc7.k;
import th0.d;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c implements e {
    public static kgm.c A(Context context) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        oc.b bVarC = hx7.a.c(context);
        Intrinsics.checkNotNullExpressionValue(bVarC, "create(...)");
        return new kgm.c(bVarC);
    }

    public static h B(k initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        g gVar = initializer.f269739a;
        gVar.a(HomeFeedWidgetContext.Personal.class, initializer.e.f193303a);
        gVar.a(HomeFeedWidgetContext.PersonalPocket.class, initializer.f269742g.f193303a);
        gVar.a(HomeFeedWidgetContext.GroupPocket.class, initializer.f269743h.f193303a);
        gVar.a(HomeFeedWidgetContext.JointCurrency.class, initializer.f.f193303a);
        gVar.a(HomeFeedWidgetContext.JointSavings.class, initializer.f269752t.f193303a);
        gVar.a(HomeFeedWidgetContext.JointPocket.class, initializer.i.f193303a);
        gVar.a(HomeFeedWidgetContext.Pro.class, initializer.f269744j.f193303a);
        gVar.a(HomeFeedWidgetContext.ProPocket.class, initializer.k.f193303a);
        gVar.a(HomeFeedWidgetContext.ProTaxPocket.class, initializer.f269745l.f193303a);
        gVar.a(HomeFeedWidgetContext.JuniorPocket.class, initializer.f269746m.f193303a);
        gVar.a(HomeFeedWidgetContext.Loan.class, initializer.f269740b.f193303a);
        gVar.a(HomeFeedWidgetContext.CreditCard.class, initializer.d.f193303a);
        gVar.a(HomeFeedWidgetContext.Collateral.class, initializer.f269741c.f193303a);
        gVar.a(HomeFeedWidgetContext.Junior.class, initializer.f269747n.f193303a);
        gVar.a(HomeFeedWidgetContext.Savings.class, initializer.o.f193303a);
        gVar.a(HomeFeedWidgetContext.JuniorSavings.class, initializer.f269748p.f193303a);
        gVar.a(HomeFeedWidgetContext.TeenSavings.class, initializer.f269749q.f193303a);
        gVar.a(HomeFeedWidgetContext.TeenPocket.class, initializer.f269750r.f193303a);
        gVar.a(HomeFeedWidgetContext.Linked.class, initializer.f269751s.f193303a);
        gVar.a(HomeFeedWidgetContext.TotalWealth.class, initializer.u.f193303a);
        return new h(gVar.f117321a);
    }

    public static b0 C(o0 o0Var) {
        b0 b0Var = (b0) o0Var.b();
        s.k(b0Var);
        return b0Var;
    }

    public static smd.s D(d0 factory, hsh.h widgetsExpandableDialogExtensionFactory, he2.b dialogHostFinder) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsExpandableDialogExtensionFactory, "widgetsExpandableDialogExtensionFactory");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        smd.s sVar = new smd.s();
        sVar.f264432a = dialogHostFinder;
        sVar.f264433b = factory;
        return sVar;
    }

    public static ph0.d a(Context context) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new ph0.d(CredentialManager.INSTANCE.create(context));
    }

    public static f b(Context context, sg0.c mobileServicesConfiguration) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobileServicesConfiguration, "mobileServicesConfiguration");
        return new f(new ph0.h(context, (String) mobileServicesConfiguration.d().invoke()));
    }

    public static li0.b c(Context context) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return li0.c.a(context);
    }

    public static ur5.c d(ppk.f ratesInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        return new ur5.c(ratesInteractor, walletInteractor);
    }

    public static ic7.b e(gte.a featureToggleInteractor, j30.c chatFeatureToggles, n8b.a countryInteractor, r57.a freelancerFeedWidgetCatalogueOrderFactory, yc7.a juniorWidgetCatalogueOrderProvider) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(freelancerFeedWidgetCatalogueOrderFactory, "freelancerFeedWidgetCatalogueOrderFactory");
        Intrinsics.checkNotNullParameter(juniorWidgetCatalogueOrderProvider, "juniorWidgetCatalogueOrderProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        return new ic7.b(featureToggleInteractor, chatFeatureToggles, countryInteractor, freelancerFeedWidgetCatalogueOrderFactory, juniorWidgetCatalogueOrderProvider);
    }

    public static n8j.a f(a31.a aVar) {
        return new n8j.a(aVar, 15);
    }

    public static qd2.b g(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, mva.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13) {
        return new qd2.b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13);
    }

    public static tf5.b h(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new tf5.b(aVar, aVar2, aVar3, aVar4);
    }

    public static o i(trl.e eVar) {
        o oVarA = nrl.d.a();
        s.k(oVarA);
        return oVarA;
    }

    public static Retrofit j(trl.e eVar, Retrofit retrofit, o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static ve0.c k(je0.d mapper, xe0.f storageFactory) {
        trl.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "trading_orders.extended_hours_dialog", mapper, 12);
    }

    public static z l(f4h.a widgetsInteractorFactory, csh.k widgetsDependenciesApi) {
        Intrinsics.checkNotNullParameter(widgetsInteractorFactory, "widgetsInteractorFactory");
        Intrinsics.checkNotNullParameter(widgetsDependenciesApi, "widgetsDependenciesApi");
        return widgetsInteractorFactory.i(widgetsDependenciesApi);
    }

    public static pr8.a m(JuniorTransferRequestDatabase database) {
        tr8.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        pr8.a aVarG = database.g();
        s.k(aVarG);
        return aVarG;
    }

    public static JuniorTransferRequestDatabase n(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        tr8.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        JuniorTransferRequestDatabase.Companion aVar = JuniorTransferRequestDatabase.INSTANCE;
        aVar.getClass();
        JuniorTransferRequestDatabase juniorTransferRequestDatabase = (JuniorTransferRequestDatabase) aVar.a(context, databaseSessionProvider, new Migration[]{qr8.a.f248666c, qr8.b.f248667c}, databaseEncryptionMigratorFactory);
        s.k(juniorTransferRequestDatabase);
        return juniorTransferRequestDatabase;
    }

    public static JuniorTransferRequestService o(tr8.d dVar, Retrofit retrofit) {
        JuniorTransferRequestService juniorTransferRequestService = (JuniorTransferRequestService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorTransferRequestService.class, "create(...)");
        s.k(juniorTransferRequestService);
        return juniorTransferRequestService;
    }

    public static z85.a p(z85.f factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new z85.a();
    }

    public static z85.d q(z85.f factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new z85.d(factory.f320044a, factory.f320045b);
    }

    public static z85.e r(z85.f factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new z85.e(factory.f320046c);
    }

    public static a95.a s(a95.f factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new a95.a();
    }

    public static a95.c t(a95.f factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new a95.c(factory.f2335a, factory.f2336b);
    }

    public static a95.e u(a95.f factory, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        return new a95.e(homeFeedWidgetsEventDispatcher);
    }

    public static MonthlyInvestmentsService v(trl.e eVar, Retrofit retrofit) {
        MonthlyInvestmentsService monthlyInvestmentsService = (MonthlyInvestmentsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", MonthlyInvestmentsService.class, "create(...)");
        s.k(monthlyInvestmentsService);
        return monthlyInvestmentsService;
    }

    public static m w(Context context) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static m x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static xe0.e y(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        r0.Companion.getClass();
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_onboarding_countries", mapper, 0, null, 56);
    }

    public static ij0.d z(ij0.a networkConfiguration, x60.a accountRegionProvider) {
        tql.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(accountRegionProvider, "accountRegionProvider");
        return new ij0.d(networkConfiguration.getBaseUrl(), networkConfiguration.getRevolutHosts(), accountRegionProvider);
    }
}
