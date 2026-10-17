package w40;

import a0b.g;
import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.confirmationcode.impl.network.retrofit.LoginService;
import com.revolut.feature.credit.loan.impl.database.LoanDatabase;
import com.revolut.feature.credit.loan.impl.network.LoanStatementsService;
import com.revolut.feature.vaults.impl.network.SavingsService;
import ecm.q;
import f4g.c1;
import ip0.qr;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import kwg.l;
import n45.f;
import p45.h;
import p45.i;
import p45.k;
import p45.n;
import p45.r;
import p45.t;
import p45.u;
import p45.v;
import p45.w;
import p45.x;
import p45.y;
import p45.z;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.m;
import vc.s;
import whc.a0;
import wi8.j;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c implements e4m.e {
    public static f01.c A(Context context) {
        w9i.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }

    public static f01.c B(Context context) {
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }

    public static f C(LoanDatabase database) {
        w45.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        f fVarJ = database.j();
        s.k(fVarJ);
        return fVarJ;
    }

    public static x9e.a D(x9e.b bVar) {
        x9e.a aVar = (x9e.a) bVar.b();
        s.k(aVar);
        return aVar;
    }

    public static g a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, q qVar) {
        return new g(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, 8);
    }

    public static a51.d b(uhc.a aVar) {
        return new a51.d(aVar, 18);
    }

    public static b6b.f c(a31.a aVar, r5a.b bVar) {
        return new b6b.f(aVar, bVar, 8);
    }

    public static deh.c d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9) {
        return new deh.c(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, 8);
    }

    public static c1 e(q qVar, a31.a aVar, uhc.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14) {
        return new c1(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14);
    }

    public static a0 f(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, q qVar) {
        return new a0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, qVar);
    }

    public static j60.c g(com.revolut.kompot.navigable.a controller, he2.b dialogHostFinder) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, new m(), dialogHostFinder);
    }

    public static l h(nwg.a factory) {
        wmc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(gwg.a.TRADING);
    }

    public static xe0.e i(o baseGson, le0.b gsonObjectMapperFactory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        w45.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "loan", gsonObjectMapperFactory.a(new p(baseGson).b()), m55.d.f202809b, m55.d.f202808a, 32);
    }

    public static ii5.g j(ii5.a factory) {
        wh5.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a();
    }

    public static LoanDatabase k(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        w45.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        LoanDatabase.Companion aVar = LoanDatabase.INSTANCE;
        aVar.getClass();
        LoanDatabase loanDatabase = (LoanDatabase) aVar.a(context, databaseSessionProvider, new Migration[]{h.f232819c, p45.o.f232826c, t.f232831c, u.f232832c, v.f232833c, w.f232834c, x.f232835c, y.f232836c, z.f232837c, p45.a.f232812c, p45.b.f232813c, p45.c.f232814c, p45.d.f232815c, p45.e.f232816c, p45.f.f232817c, p45.g.f232818c, i.f232820c, p45.j.f232821c, k.f232822c, p45.l.f232823c, p45.m.f232824c, n.f232825c, p45.p.f232827c, p45.q.f232828c, r.f232829c, p45.s.f232830c}, databaseEncryptionMigratorFactory);
        s.k(loanDatabase);
        return loanDatabase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n l(ep6.n extension) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        s.k(nVar);
        return nVar;
    }

    public static ep6.n m(i8d.f factory, j60.a bottomExpandableDialogControllerExtension, g1 shotDialogDisplayer) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        ep6.n nVarA = factory.a(bottomExpandableDialogControllerExtension, shotDialogDisplayer, qr.f166041a);
        s.k(nVarA);
        return nVarA;
    }

    public static i8d.f n(zo6.a newFeedbackExtensionFactory, j60.a bottomExpandableDialogControllerExtension, g1 shotDialogDisplayer) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(newFeedbackExtensionFactory, "newFeedbackExtensionFactory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        return new i8d.f(newFeedbackExtensionFactory);
    }

    public static n45.c o(LoanDatabase database) {
        w45.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        n45.c cVarG = database.g();
        s.k(cVarG);
        return cVarG;
    }

    public static n45.d p(LoanDatabase database) {
        w45.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        n45.d dVarH = database.h();
        s.k(dVarH);
        return dVarH;
    }

    public static LoanStatementsService q(w45.b bVar, Retrofit retrofit) {
        LoanStatementsService loanStatementsService = (LoanStatementsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", LoanStatementsService.class, "create(...)");
        s.k(loanStatementsService);
        return loanStatementsService;
    }

    public static LoginService r(Retrofit retrofit) {
        LoginService loginService = (LoginService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", LoginService.class, "create(...)");
        s.k(loginService);
        return loginService;
    }

    public static sri.m s(Context context) {
        w9k.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static emd.d t(wld.a aVar, fnc.s uiFactory) {
        Intrinsics.checkNotNullParameter(uiFactory, "uiFactory");
        return (dnd.b) uiFactory.f136657b;
    }

    public static SavingsService u(wpg.s sVar, Retrofit retrofit) {
        SavingsService savingsService = (SavingsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", SavingsService.class, "create(...)");
        s.k(savingsService);
        return savingsService;
    }

    public static xe0.e v(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        wpg.u.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "vaults_savings", mapper, 6, zhm.v.k(new eqg.a(), new eqg.b(), new eqg.c(), new eqg.d(), new eqg.e()), 32);
    }

    public static n45.e w(LoanDatabase database) {
        w45.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        n45.e eVarI = database.i();
        s.k(eVarI);
        return eVarI;
    }

    public static tse.i x(y9l.a actionControllerExtension, ep6.n feedbackExtension, rul.e factory) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(actionControllerExtension, "actionControllerExtension");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return rul.e.b(factory, feedbackExtension, actionControllerExtension, null, false, 28);
    }

    public static xx4.d y(w45.a aVar, ne0.d hashMapCache) {
        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
        return new xx4.d(hashMapCache);
    }

    public static xx4.e z(w45.a aVar, ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xx4.e(storage);
    }
}
