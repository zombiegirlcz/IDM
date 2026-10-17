package ewg;

import android.content.Context;
import com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService;
import com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase;
import com.revolut.feature.insurance_pet.impl.network.service.PetService;
import com.revolut.feature.statements.impl.services.StatementsService;
import com.revolut.retail.feature.marketnews.impl.data.network.services.ScopedSymbolsService;
import eyd.l0;
import eyd.o0;
import eyd.q0;
import eyd.s0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w implements e4m.e {
    public static f01.c A(Context context) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }

    public static dy1.a B(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        dy1.a aVarP = database.p();
        vc.s.k(aVarP);
        return aVarP;
    }

    public static yji.n C(cya.f extension) {
        eya.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    public static StatementsService D(Retrofit retrofit) {
        o0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(StatementsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        StatementsService statementsService = (StatementsService) objCreate;
        vc.s.k(statementsService);
        return statementsService;
    }

    public static ezj.h a(ecm.q qVar, a31.a aVar, c63.b bVar, a31.a aVar2) {
        return new ezj.h(qVar, aVar, bVar, aVar2, 0);
    }

    public static sx1.a b(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        sx1.a aVarG = database.g();
        vc.s.k(aVarG);
        return aVarG;
    }

    public static ApmContactsDiscoveryService c(Retrofit retrofit) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ApmContactsDiscoveryService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ApmContactsDiscoveryService apmContactsDiscoveryService = (ApmContactsDiscoveryService) objCreate;
        vc.s.k(apmContactsDiscoveryService);
        return apmContactsDiscoveryService;
    }

    public static tx1.a d(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        tx1.a aVarH = database.h();
        vc.s.k(aVarH);
        return aVarH;
    }

    public static ux1.a e(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        ux1.a aVarI = database.i();
        vc.s.k(aVarI);
        return aVarI;
    }

    public static vx1.a f(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        vx1.a aVarJ = database.j();
        vc.s.k(aVarJ);
        return aVarJ;
    }

    public static xe0.e g(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "complex_analytics_storage", mapper, 1, f0.f322471a, 32);
    }

    public static void h(ex7.e eVar, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
    }

    public static Retrofit i(ex7.e eVar, Retrofit retrofit, kg.o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static xx1.a j(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        xx1.a aVarK = database.k();
        vc.s.k(aVarK);
        return aVarK;
    }

    public static xe0.e k(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        ex7.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "insurance_pet_issues_storage", mapper, 0, null, 56);
    }

    public static nzd.c l(nzd.d localesProvider) {
        s0.Companion.getClass();
        Intrinsics.checkNotNullParameter(localesProvider, "localesProvider");
        return new nzd.c(localesProvider, false);
    }

    public static zx1.a m(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        zx1.a aVarL = database.l();
        vc.s.k(aVarL);
        return aVarL;
    }

    public static sri.m n(Context context) {
        ex7.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m o(Context context) {
        l0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static xe0.e p(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        ex7.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "insurance_pet_notification_storage", mapper, 0, null, 56);
    }

    public static PetService q(ex7.e eVar, Retrofit retrofit) {
        PetService petService = (PetService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PetService.class, "create(...)");
        vc.s.k(petService);
        return petService;
    }

    public static xe0.e r(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        ex7.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "insurance_pet_storage", mapper, 0, null, 56);
    }

    public static ay1.a s(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        ay1.a aVarM = database.m();
        vc.s.k(aVarM);
        return aVarM;
    }

    public static xe0.e t(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        ex7.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "insurance_pet_policy_document_storage", mapper, 0, null, 56);
    }

    public static xe0.e u(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "WEALTH_ANALYTICS_STORAGE", mapper, 3, zhm.v.k(yvg.a.d, yvg.b.d), 32);
    }

    public static xe0.e v(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        ex7.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "insurance_pet_promotion_storage", mapper, 0, null, 56);
    }

    public static by1.a w(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        by1.a aVarN = database.n();
        vc.s.k(aVarN);
        return aVarN;
    }

    public static ScopedSymbolsService x(Retrofit retrofit) {
        f0k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ScopedSymbolsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ScopedSymbolsService scopedSymbolsService = (ScopedSymbolsService) objCreate;
        vc.s.k(scopedSymbolsService);
        return scopedSymbolsService;
    }

    public static cy1.a y(ApmContactsDatabase database) {
        ey1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        cy1.a aVarO = database.o();
        vc.s.k(aVarO);
        return aVarO;
    }

    public static xe0.e z(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        q0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "statements", mapper, 0, null, 56);
    }
}
