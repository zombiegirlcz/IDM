package qlc;

import android.content.Context;
import com.revolut.feature.insurance_common.data.network.InsuranceCommonService;
import com.revolut.feature.robo.impl.data.network.RoboAccountService;
import com.revolut.feature.robo.impl.data.network.TemplateService;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import e4m.e;
import ecm.q;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import nvg.e0;
import nvg.h0;
import nvg.k0;
import nvg.n;
import nvg.n0;
import nvg.q0;
import nvg.t0;
import nvg.u;
import pgf.i;
import qud.l;
import qve.a0;
import qvg.d;
import qw7.r;
import retrofit2.Retrofit;
import sri.m;
import uo.x;
import uo.y;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements e {
    public static WealthAnalyticsDatabase A(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        WealthAnalyticsDatabase.Companion companion = WealthAnalyticsDatabase.INSTANCE;
        companion.getClass();
        WealthAnalyticsDatabase wealthAnalyticsDatabase = (WealthAnalyticsDatabase) companion.a(context, databaseSessionProvider, WealthAnalyticsDatabase.f, databaseEncryptionMigratorFactory);
        s.k(wealthAnalyticsDatabase);
        return wealthAnalyticsDatabase;
    }

    public static xe0.e B(je0.d mapper, yk0.a databaseSessionProvider, f storageFactory) {
        qr7.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "common_insurance", mapper, 0, null, 56);
    }

    public static RoboAccountService C(a aVar, Retrofit retrofit) {
        RoboAccountService roboAccountService = (RoboAccountService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RoboAccountService.class, "create(...)");
        s.k(roboAccountService);
        return roboAccountService;
    }

    public static TemplateService D(a aVar, Retrofit retrofit) {
        TemplateService templateService = (TemplateService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TemplateService.class, "create(...)");
        s.k(templateService);
        return templateService;
    }

    public static a16.b a(a31.a aVar, q qVar) {
        return new a16.b(qVar, aVar, 14);
    }

    public static a51.d b(of3.e eVar) {
        return new a51.d(eVar, 15);
    }

    public static i c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, a31.a aVar38, a31.a aVar39, mva.a aVar40, mva.a aVar41, mva.a aVar42, mva.a aVar43, a31.a aVar44, mva.a aVar45, a31.a aVar46, a31.a aVar47, a31.a aVar48, a31.a aVar49, a31.a aVar50) {
        return new i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, aVar48, aVar49, aVar50);
    }

    public static l d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, q qVar) {
        return new l(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, qVar);
    }

    public static a0 e(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, mva.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20) {
        return new a0(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20);
    }

    public static x f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new x(context);
    }

    public static y g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new y(context);
    }

    public static nvg.a h(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        nvg.a aVarG = db8.g();
        s.k(aVarG);
        return aVarG;
    }

    public static nvg.e i(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        nvg.e eVarH = db8.h();
        s.k(eVarH);
        return eVarH;
    }

    public static nvg.i j(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        nvg.i iVarI = db8.i();
        s.k(iVarI);
        return iVarI;
    }

    public static n k(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        n nVarJ = db8.j();
        s.k(nVarJ);
        return nVarJ;
    }

    public static nvg.q l(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        nvg.q qVarK = db8.k();
        s.k(qVarK);
        return qVarK;
    }

    public static nvg.s m(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        nvg.s sVarL = db8.l();
        s.k(sVarL);
        return sVarL;
    }

    public static u n(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        u uVarM = db8.m();
        s.k(uVarM);
        return uVarM;
    }

    public static nvg.x o(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        nvg.x xVarN = db8.n();
        s.k(xVarN);
        return xVarN;
    }

    public static nvg.a0 p(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        nvg.a0 a0VarO = db8.o();
        s.k(a0VarO);
        return a0VarO;
    }

    public static e0 q(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        e0 e0VarP = db8.p();
        s.k(e0VarP);
        return e0VarP;
    }

    public static h0 r(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        h0 h0VarQ = db8.q();
        s.k(h0VarQ);
        return h0VarQ;
    }

    public static k0 s(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        k0 k0VarR = db8.r();
        s.k(k0VarR);
        return k0VarR;
    }

    public static n0 t(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        n0 n0VarS = db8.s();
        s.k(n0VarS);
        return n0VarS;
    }

    public static q0 u(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        q0 q0VarT = db8.t();
        s.k(q0VarT);
        return q0VarT;
    }

    public static t0 v(WealthAnalyticsDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        t0 t0VarU = db8.u();
        s.k(t0VarU);
        return t0VarU;
    }

    public static Retrofit w(a aVar, Retrofit retrofit, o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static InsuranceCommonService x(Retrofit retrofit) {
        qr7.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(InsuranceCommonService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        InsuranceCommonService insuranceCommonService = (InsuranceCommonService) objCreate;
        s.k(insuranceCommonService);
        return insuranceCommonService;
    }

    public static m y(Context context) {
        qud.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static m z(Context context) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }
}
