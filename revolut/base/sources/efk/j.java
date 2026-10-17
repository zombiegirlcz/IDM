package efk;

import android.content.Context;
import androidx.room.migration.Migration;
import anf.r;
import anf.w;
import com.revolut.feature.insurance.impl.network.InsuranceService;
import com.revolut.feature.junior_wallet.impl.services.JuniorWalletService;
import com.revolut.feature.tab.accounts.impl.data.AccountsDatabase;
import com.revolut.feature.trusted_merchants.impl.data.network.TrustedMerchantsService;
import com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase;
import com.revolut.retail.feature.impl.budgeting.network.services.BudgetingService;
import ecm.q;
import he0.m;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;
import yji.n;
import zig.a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j implements e4m.e {
    public static xe0.e A(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        erj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "budgeting", mapper, 1, null, 48);
    }

    public static n B(dmf.d extension) {
        emf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static xe0.e C(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        ejg.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "trusted_merchants", mapper, 0, null, 56);
    }

    public static f01.c D(Context context) {
        ejf.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }

    public static a16.b a(a31.a aVar, q qVar) {
        return new a16.b(qVar, aVar, 4);
    }

    public static c3d.a b(a31.a aVar, a31.a aVar2, q qVar) {
        return new c3d.a(qVar, aVar, aVar2, 5);
    }

    public static BudgetingService c(Retrofit retrofit) {
        erj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BudgetingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BudgetingService budgetingService = (BudgetingService) objCreate;
        s.k(budgetingService);
        return budgetingService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d d(dtl.a controllerExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        yji.d dVar = (yji.d) controllerExtension;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n e(dtl.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        n nVar = (n) controllerModelExtension;
        s.k(nVar);
        return nVar;
    }

    public static AccountsDatabase f(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        ege.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        AccountsDatabase.Companion aVar = AccountsDatabase.INSTANCE;
        aVar.getClass();
        AccountsDatabase accountsDatabase = (AccountsDatabase) aVar.a(context, databaseSessionProvider, new Migration[]{fge.f.f135060c, fge.g.f135061c}, databaseEncryptionMigratorFactory);
        s.k(accountsDatabase);
        return accountsDatabase;
    }

    public static BudgetingDatabase g(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        erj.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        BudgetingDatabase budgetingDatabase = (BudgetingDatabase) BudgetingDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{zqj.a.f324497c, zqj.b.f324498c, zqj.c.f324499c, zqj.d.f324500c}, databaseEncryptionMigratorFactory);
        s.k(budgetingDatabase);
        return budgetingDatabase;
    }

    public static r h(anf.s factory, anf.b sumCalculator) {
        ejf.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(sumCalculator, "sumCalculator");
        factory.getClass();
        Intrinsics.checkNotNullParameter(sumCalculator, "sumCalculator");
        return new r(factory.f7752a, factory.f7753b, sumCalculator, factory.e, factory.f, factory.f7755g);
    }

    public static w i(anf.s factory, anf.b sumCalculator) {
        ejf.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(sumCalculator, "sumCalculator");
        factory.getClass();
        Intrinsics.checkNotNullParameter(sumCalculator, "sumCalculator");
        return new w(sumCalculator, factory.f7754c, factory.d);
    }

    public static o j(ejg.h hVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        m mVar = new m("state", zig.a.class, true, false);
        mVar.c(a.C1789a.class, "ACTIVE");
        mVar.c(a.c.class, "PENDING");
        mVar.c(a.b.class, "DISABLED");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        pVar.e.add(mVar);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static void k(ej7.d dVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
    }

    public static Retrofit l(ej7.d dVar, Retrofit retrofit, o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static Retrofit m(ejg.h hVar, Retrofit retrofit, o oVar) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "gson");
        builderX.converterFactories().clear();
        Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static dge.b n(AccountsDatabase db8) {
        ege.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        dge.b bVarG = db8.g();
        s.k(bVarG);
        return bVarG;
    }

    public static xe0.e o(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        ej7.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "insurances", mapper, 0, null, 56);
    }

    public static InsuranceService p(ej7.d dVar, Retrofit retrofit) {
        InsuranceService insuranceService = (InsuranceService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", InsuranceService.class, "create(...)");
        s.k(insuranceService);
        return insuranceService;
    }

    public static dtl.g q(a61.a factory, dtl.d view, dtl.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new dtl.g(view, controllerModelExtension);
    }

    public static dtl.m r(a61.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new dtl.m((vrl.g) factory.f1531b, (dtl.o) factory.f1532c);
    }

    public static JuniorWalletService s(es8.c cVar, Retrofit retrofit) {
        JuniorWalletService juniorWalletService = (JuniorWalletService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorWalletService.class, "create(...)");
        s.k(juniorWalletService);
        return juniorWalletService;
    }

    public static sri.m t(Context context) {
        eg8.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m u(Context context) {
        ejf.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m v(Context context) {
        erj.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static xe0.e w(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "pricing_plan_limits", mapper, 0, null, 56);
    }

    public static xe0.e x(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "pricing_plan_partner_subscriptions", mapper, 0, null, 56);
    }

    public static xe0.e y(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "pricing_plan_workflow", mapper, 0, null, 56);
    }

    public static TrustedMerchantsService z(ejg.h hVar, Retrofit retrofit) {
        TrustedMerchantsService trustedMerchantsService = (TrustedMerchantsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TrustedMerchantsService.class, "create(...)");
        s.k(trustedMerchantsService);
        return trustedMerchantsService;
    }
}
