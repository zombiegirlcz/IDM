package xhi;

import afj.u3;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.room.migration.Migration;
import byc.j;
import byc.k;
import com.revolut.core.backend_flow.repository.service.BackendFlowCardsService;
import com.revolut.core.backend_flow.repository.service.BackendFlowEntitiesService;
import com.revolut.core.backend_flow.repository.service.BackendFlowEntitiesSummaryService;
import com.revolut.core.backend_flow.repository.service.BackendFlowTicketsService;
import com.revolut.core.backend_flow.repository.service.BackendFlowTransactionsService;
import com.revolut.feature.atm.impl.network.service.AtmsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCurrencyService;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreenContract$InputData;
import com.revolut.feature.robo.impl.data.storage.migration.h;
import com.revolut.feature.trading.transfer.investments.impl.data.database.TransferInvestmentsDatabase;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.trading.orders.data.network.services.NbboService;
import ecm.q;
import et6.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kg.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import od0.l;
import qr0.i;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rr1.g;
import sri.m;
import vc.s;
import xsl.u;
import xsl.v;
import yji.n;
import zhm.d0;
import zxb.j0;
import zxb.v0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f implements e4m.e {
    public static xe0.e A(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        xmg.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "user_company", mapper, 0, null, 56);
    }

    public static afj.b B(u3 u3Var) {
        afj.b bVar = (afj.b) u3Var.b();
        s.k(bVar);
        return bVar;
    }

    public static NbboService C(v vVar, Retrofit retrofit) {
        NbboService nbboService = (NbboService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", NbboService.class, "create(...)");
        s.k(nbboService);
        return nbboService;
    }

    public static j0 D(v0 v0Var) {
        j0 j0Var = (j0) v0Var.b();
        s.k(j0Var);
        return j0Var;
    }

    public static s8c.e a(i provider) {
        yec.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new s8c.e((q7c.s) provider.f248595b);
    }

    public static ae9.d b(r5a.b bVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new ae9.d(bVar, aVar, aVar2, aVar3, aVar4, 9);
    }

    public static g c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, q qVar) {
        return new g(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, qVar);
    }

    public static vdf.d d(w80.b formatter, qd0.b languageProvider) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        vdf.b.Companion.getClass();
        return vdf.a.a(formatter, languageProvider);
    }

    public static xy.a e(xy.b bVar, com.revolut.kompot.navigable.a controller, yy.c cameraKitCameraScreenAnalyticsControllerModelExtension) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(cameraKitCameraScreenAnalyticsControllerModelExtension, "cameraKitCameraScreenAnalyticsControllerModelExtension");
        return new xy.a(controller, cameraKitCameraScreenAnalyticsControllerModelExtension);
    }

    public static BackendFlowCardsService f(Retrofit retrofit) {
        y90.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BackendFlowCardsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BackendFlowCardsService backendFlowCardsService = (BackendFlowCardsService) objCreate;
        s.k(backendFlowCardsService);
        return backendFlowCardsService;
    }

    public static yx6.e g(p1 freelancerInvoiceInteractor, InvoiceEmailMessageScreenContract$InputData inputData) {
        xx6.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (Intrinsics.f(inputData, InvoiceEmailMessageScreenContract$InputData.DefaultEmailMessage.f73889a)) {
            return new yx6.b(freelancerInvoiceInteractor);
        }
        if (inputData instanceof InvoiceEmailMessageScreenContract$InputData.SingleInvoiceEmailMessage) {
            return new yx6.g(freelancerInvoiceInteractor, (InvoiceEmailMessageScreenContract$InputData.SingleInvoiceEmailMessage) inputData);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TransferInvestmentsDatabase h(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        y8f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        TransferInvestmentsDatabase.Companion companion = TransferInvestmentsDatabase.INSTANCE;
        companion.getClass();
        TransferInvestmentsDatabase transferInvestmentsDatabase = (TransferInvestmentsDatabase) companion.a(context, databaseSessionProvider, new Migration[]{z8f.b.f320081c}, databaseEncryptionMigratorFactory);
        s.k(transferInvestmentsDatabase);
        return transferInvestmentsDatabase;
    }

    public static j i(k factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a();
    }

    public static n j(y9l.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static void k(xs6.d dVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
    }

    public static Retrofit l(xs6.d dVar, Retrofit retrofit, o oVar) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "gson");
        builderX.converterFactories().clear();
        Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static Retrofit m(v vVar, Retrofit retrofit, o oVar) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "gson");
        builderX.converterFactories().clear();
        builderX.converterFactories().add(GsonConverterFactory.create(oVar));
        Retrofit retrofitBuild = builderX.build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static FreelancerCurrencyService n(xs6.d dVar, Retrofit retrofit) {
        FreelancerCurrencyService freelancerCurrencyService = (FreelancerCurrencyService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerCurrencyService.class, "create(...)");
        s.k(freelancerCurrencyService);
        return freelancerCurrencyService;
    }

    public static xza.e o(Activity activity, uc.d factory, m navigator) {
        xoi.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return new xza.e(activity, navigator, (v60.g) factory.f278953b, (mli.e) factory.f278952a, (asi.d) factory.f278954c);
    }

    public static Set p(BaseFlow flow, Set kompotFlowModelExtensionsFactories) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(kompotFlowModelExtensionsFactories, "kompotFlowModelExtensionsFactories");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = kompotFlowModelExtensionsFactories.iterator();
        while (it8.hasNext()) {
            ee6.a aVar = (ee6.a) it8.next();
            ComponentCallbacks2 activity = flow.m2();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            n nVar = (!(activity instanceof dri.a) || ((dri.a) activity).D0()) ? (n) aVar.f125077a.get() : null;
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        Set setI1 = d0.i1(arrayList);
        s.k(setI1);
        return setI1;
    }

    public static m q(Context context) {
        y77.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static xx8.e r(xx8.f fVar, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        od0.a aVar = od0.a.f224253a;
        if (od0.a.c() == l.MOCK) {
            return xx8.g.f309410a;
        }
        PackageManager packageManager = contextProvider.getContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return new ugc.a(new n80.e(packageManager));
    }

    public static xe0.e s(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        xlc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "robo_storage", mapper, 17, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5), new exa.a(4, 5, 5), new exa.a(5, 6, 5), new com.revolut.feature.robo.impl.data.storage.migration.e(), new exa.a(7, 8, 5), new exa.a(8, 9, 5), new com.revolut.feature.robo.impl.data.storage.migration.a(), new exa.a(10, 11, 5), new com.revolut.feature.robo.impl.data.storage.migration.f(), new com.revolut.feature.robo.impl.data.storage.migration.g(), new h(), new com.revolut.feature.robo.impl.data.storage.migration.b(), new com.revolut.feature.robo.impl.data.storage.migration.d(), new com.revolut.feature.robo.impl.data.storage.migration.c()), 32);
    }

    public static BackendFlowEntitiesService t(Retrofit retrofit) {
        y90.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BackendFlowEntitiesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BackendFlowEntitiesService backendFlowEntitiesService = (BackendFlowEntitiesService) objCreate;
        s.k(backendFlowEntitiesService);
        return backendFlowEntitiesService;
    }

    public static BackendFlowEntitiesSummaryService u(Retrofit retrofit) {
        y90.j.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BackendFlowEntitiesSummaryService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BackendFlowEntitiesSummaryService backendFlowEntitiesSummaryService = (BackendFlowEntitiesSummaryService) objCreate;
        s.k(backendFlowEntitiesSummaryService);
        return backendFlowEntitiesSummaryService;
    }

    public static BackendFlowTicketsService v(Retrofit retrofit) {
        y90.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BackendFlowTicketsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BackendFlowTicketsService backendFlowTicketsService = (BackendFlowTicketsService) objCreate;
        s.k(backendFlowTicketsService);
        return backendFlowTicketsService;
    }

    public static BackendFlowTransactionsService w(Retrofit retrofit) {
        y90.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BackendFlowTransactionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BackendFlowTransactionsService backendFlowTransactionsService = (BackendFlowTransactionsService) objCreate;
        s.k(backendFlowTransactionsService);
        return backendFlowTransactionsService;
    }

    public static AtmsService x(xj2.d dVar, Retrofit retrofit) {
        AtmsService atmsService = (AtmsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", AtmsService.class, "create(...)");
        s.k(atmsService);
        return atmsService;
    }

    public static xe0.e y(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        y90.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_backend_flow_items", mapper, 0, null, 56);
    }

    public static x8f.a z(TransferInvestmentsDatabase db8) {
        y8f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        x8f.a aVarG = db8.g();
        s.k(aVarG);
        return aVarG;
    }
}
