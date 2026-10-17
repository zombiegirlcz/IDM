package agk;

import a3h.h;
import ael.d0;
import anb.y;
import android.content.Context;
import androidx.room.migration.Migration;
import b7e.f;
import bi3.j;
import com.revolut.feature.crypto_investments.impl.data.database.CryptoInvestmentsDatabase;
import com.revolut.feature.rev_points.impl.data.network.RevPointsPlanService;
import com.revolut.feature.revpro.card_reader.impl.repository.service.RevProRequirementsService;
import com.revolut.feature.transactions.impl.data.network.DeFiTransactionsService;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import cwi.x;
import did.b0;
import did.q;
import e4m.e;
import ehk.g;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lhk.e0;
import mae.o;
import mae.p;
import retrofit2.Retrofit;
import sri.m;
import vc.s;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b implements e {
    public static x A(cwi.a aVar) {
        x xVar = (x) aVar.b();
        s.k(xVar);
        return xVar;
    }

    public static Set B(a aVar, zfk.c planSubscriberControllerModelExtension, xfk.b planDurableTermsControllerExtension, bgk.a planTermsWorkflowControllerExtension, wfk.a globalPlansControllerExtension, bgk.a planTermsWorkflowControllerExtensionNoQualifier) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(globalPlansControllerExtension, "globalPlansControllerExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtensionNoQualifier, "planTermsWorkflowControllerExtensionNoQualifier");
        n[] elements = {planSubscriberControllerModelExtension, planDurableTermsControllerExtension, planTermsWorkflowControllerExtension, globalPlansControllerExtension, planTermsWorkflowControllerExtensionNoQualifier};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static q C(b0 b0Var) {
        q qVar = (q) b0Var.b();
        s.k(qVar);
        return qVar;
    }

    public static Set D(c cVar, zfk.c planSubscriberControllerModelExtension, g planDurableTermsControllerExtension, ohk.g planTermsWorkflowControllerExtension, dhk.e globalPlansControllerExtension) {
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(globalPlansControllerExtension, "globalPlansControllerExtension");
        n[] elements = {planDurableTermsControllerExtension, planSubscriberControllerModelExtension, planTermsWorkflowControllerExtension, globalPlansControllerExtension};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static an0.d a(a31.a aVar, a1j.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a1j.a aVar6, a1j.a aVar7, a31.a aVar8) {
        return new an0.d(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static ap3.b b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7) {
        return new ap3.b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, 0);
    }

    public static at6.b c(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new at6.b(aVar, aVar2, aVar3);
    }

    public static ava.d d(a31.a aVar, a31.a aVar2, z58.c cVar) {
        return new ava.d(aVar, aVar2, cVar, 0);
    }

    public static j e(ecm.q qVar, a31.a aVar, xs6.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new j(aVar, aVar3, aVar4, aVar5, qVar, aVar2);
    }

    public static o f(p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.a(uiKitResources, currenciesLocalization);
    }

    public static e4h.b g(i4b.f factory, h view, a3h.c controllerModelExtension) {
        b3h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new e4h.b(view, controllerModelExtension);
    }

    public static e4h.c h(i4b.f factory, a3h.e inputData) {
        b3h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new e4h.c(inputData, (d0) factory.f158330b);
    }

    public static zt5.a i(CryptoInvestmentsDatabase database) {
        au5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        zt5.a aVarG = database.g();
        s.k(aVarG);
        return aVarG;
    }

    public static CryptoInvestmentsDatabase j(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        au5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        CryptoInvestmentsDatabase.Companion companion = CryptoInvestmentsDatabase.INSTANCE;
        companion.getClass();
        CryptoInvestmentsDatabase cryptoInvestmentsDatabase = (CryptoInvestmentsDatabase) companion.a(context, databaseSessionProvider, new Migration[]{bu5.a.f18688c}, databaseEncryptionMigratorFactory);
        s.k(cryptoInvestmentsDatabase);
        return cryptoInvestmentsDatabase;
    }

    public static DeFiTransactionsService k(Retrofit retrofit) {
        bjf.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(DeFiTransactionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        DeFiTransactionsService deFiTransactionsService = (DeFiTransactionsService) objCreate;
        s.k(deFiTransactionsService);
        return deFiTransactionsService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a84.b l(ViewController viewController) {
        b84.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        a84.b bVar = (a84.b) viewController;
        s.k(bVar);
        return bVar;
    }

    public static mif.f m(TransactionsDatabase database) {
        bjf.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        mif.f fVarH = database.h();
        s.k(fVarH);
        return fVarH;
    }

    public static vif.f n(aif.b transactionsConfigProvider, d4m.a lazyMainWalletRemoteTransactionsProviderImpl, d4m.a lazyCryptoExchangeRemoteTransactionsProviderImpl) {
        vif.f fVar;
        bjf.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(transactionsConfigProvider, "transactionsConfigProvider");
        Intrinsics.checkNotNullParameter(lazyMainWalletRemoteTransactionsProviderImpl, "lazyMainWalletRemoteTransactionsProviderImpl");
        Intrinsics.checkNotNullParameter(lazyCryptoExchangeRemoteTransactionsProviderImpl, "lazyCryptoExchangeRemoteTransactionsProviderImpl");
        int i = bjf.c.f15657a[lhf.a.RETAIL_TRANSACTIONS.ordinal()];
        if (i == 1) {
            Object obj2 = lazyMainWalletRemoteTransactionsProviderImpl.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            fVar = (vif.f) obj2;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj3 = lazyCryptoExchangeRemoteTransactionsProviderImpl.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            fVar = (vif.f) obj3;
        }
        s.k(fVar);
        return fVar;
    }

    public static cog.e o(gte.a featureToggleInteractor, NameControllerDescriptor$InputData inputData) {
        aog.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new cog.e(inputData.i);
    }

    public static m p(Context context) {
        y.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static xe0.e q(je0.d mapper, xe0.f storageFactory, yk0.a dbSessionProvider) {
        bg6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, dbSessionProvider, "pay_to_storage", mapper, 0, null, 56);
    }

    public static xe0.e r(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        ayb.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "rev_points_plan", mapper, 0, null, 56);
    }

    public static RevProRequirementsService s(Retrofit retrofit) {
        bfc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(RevProRequirementsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RevProRequirementsService revProRequirementsService = (RevProRequirementsService) objCreate;
        s.k(revProRequirementsService);
        return revProRequirementsService;
    }

    public static RevPointsPlanService t(ayb.e eVar, Retrofit retrofit) {
        RevPointsPlanService revPointsPlanService = (RevPointsPlanService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsPlanService.class, "create(...)");
        s.k(revPointsPlanService);
        return revPointsPlanService;
    }

    public static xe0.e u(je0.d mapper, yk0.a databaseSecurityProvider, xe0.f storageFactory) {
        b3j.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "beneficiary_suggestions_storage", mapper, 0, null, 56);
    }

    public static xe0.e v(je0.d objectMapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        b9f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "TRANSFER_OUT_STORAGE", objectMapper, 1, f0.f322471a, 32);
    }

    public static e0 w(c cVar, mhk.a factory, g planDurableTermsControllerExtension, ohk.g planTermsWorkflowControllerExtension, dhk.e globalPlansControllerExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(globalPlansControllerExtension, "globalPlansControllerExtension");
        return factory.a(planTermsWorkflowControllerExtension, planDurableTermsControllerExtension, globalPlansControllerExtension);
    }

    public static v6e.s x(iva.a recurringBuysNavigationProvider) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        return new v6e.s(recurringBuysNavigationProvider);
    }

    public static ohk.g y(a aVar, ohk.a factory) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a();
    }

    public static xe0.e z(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        axk.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "tradingHoursStorage", mapper, 1, null, 48);
    }
}
