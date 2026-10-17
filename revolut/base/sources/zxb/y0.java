package zxb;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.rev_points.impl.data.network.RevPointsBenefitsService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsOptInPlacementsService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationTargetingOnboardingService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsProductArticleService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsProductEligibilityService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsService;
import com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase;
import com.revolut.feature.travel.common.impl.database.TravelDatabase;
import com.revolut.retail.feature.trading_onboarding.impl.data.database.TradingOnboardingDatabase;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import mxb.b;
import mxb.c;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vxb.e;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y0 implements e4m.e {
    public static a51.d a(xs6.a aVar) {
        return new a51.d(aVar, 21);
    }

    public static f1 b(a31.a aVar) {
        return new f1(aVar, 0);
    }

    public static f1 c(a31.a aVar) {
        return new f1(aVar, 1);
    }

    public static wxf.a d(TravelDatabase database) {
        zxf.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        wxf.a aVarG = database.g();
        vc.s.k(aVarG);
        return aVarG;
    }

    public static RevPointsDatabase e(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        b1.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        RevPointsDatabase.Companion companion = RevPointsDatabase.INSTANCE;
        companion.getClass();
        RevPointsDatabase revPointsDatabase = (RevPointsDatabase) companion.a(context, databaseSessionProvider, new Migration[]{uxb.e.f283960c, uxb.f.f283961c, uxb.g.f283962c, uxb.h.f283963c, uxb.i.f283964c, uxb.j.f283965c, uxb.k.f283966c, uxb.l.f283967c, uxb.a.f283956c, uxb.b.f283957c, uxb.c.f283958c, uxb.d.f283959c}, databaseEncryptionMigratorFactory);
        vc.s.k(revPointsDatabase);
        return revPointsDatabase;
    }

    public static TravelDatabase f(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        zxf.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        TravelDatabase travelDatabase = (TravelDatabase) TravelDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{xxf.a.f309511c, xxf.b.f309512c, xxf.c.f309513c, xxf.d.f309514c}, databaseEncryptionMigratorFactory);
        vc.s.k(travelDatabase);
        return travelDatabase;
    }

    public static TradingOnboardingDatabase g(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        zxk.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        TradingOnboardingDatabase.Companion companion = TradingOnboardingDatabase.INSTANCE;
        companion.getClass();
        TradingOnboardingDatabase tradingOnboardingDatabase = (TradingOnboardingDatabase) companion.a(context, databaseSessionProvider, new Migration[]{new ayk.a()}, databaseEncryptionMigratorFactory);
        vc.s.k(tradingOnboardingDatabase);
        return tradingOnboardingDatabase;
    }

    public static wxf.d h(TravelDatabase database) {
        zxf.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        wxf.d dVarH = database.h();
        vc.s.k(dVarH);
        return dVarH;
    }

    public static wxf.f i(TravelDatabase database) {
        zxf.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        wxf.f fVarI = database.i();
        vc.s.k(fVarI);
        return fVarI;
    }

    public static kg.o j(e1 e1Var, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        he0.m mVar = new he0.m("type", vxb.e.class, false, false);
        mVar.c(e.a.class, "REV_POINTS_STATUS_ACTIVE");
        mVar.c(e.b.class, "REV_POINTS_STATUS_INACTIVE");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        ArrayList arrayList = pVar.e;
        arrayList.add(mVar);
        he0.m mVar2 = new he0.m("type", b.a.class, false, false);
        mVar2.c(b.a.C1185a.class, "REV_POINTS_STATUS_ACTIVE");
        mVar2.c(b.a.C1186b.class, "REV_POINTS_STATUS_INACTIVE");
        Intrinsics.checkNotNullExpressionValue(mVar2, "registerSubtype(...)");
        arrayList.add(mVar2);
        he0.m mVar3 = new he0.m("type", c.a.class, false, false);
        mVar3.c(c.a.C1187a.class, "REV_POINTS_STATUS_ACTIVE");
        mVar3.c(c.a.b.class, "REV_POINTS_STATUS_INACTIVE");
        Intrinsics.checkNotNullExpressionValue(mVar3, "registerSubtype(...)");
        arrayList.add(mVar3);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit k(e1 e1Var, Retrofit retrofit, kg.o oVar) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "gson");
        builderX.converterFactories().clear();
        Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        vc.s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static le0.a l(kg.o gson, le0.b factory) {
        x0.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(gson);
    }

    public static RevPointsBenefitsService m(e1 e1Var, Retrofit retrofit) {
        RevPointsBenefitsService revPointsBenefitsService = (RevPointsBenefitsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsBenefitsService.class, "create(...)");
        vc.s.k(revPointsBenefitsService);
        return revPointsBenefitsService;
    }

    public static RevPointsOptInPlacementsService n(e1 e1Var, Retrofit retrofit) {
        RevPointsOptInPlacementsService revPointsOptInPlacementsService = (RevPointsOptInPlacementsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsOptInPlacementsService.class, "create(...)");
        vc.s.k(revPointsOptInPlacementsService);
        return revPointsOptInPlacementsService;
    }

    public static RevPointsPersonalisationService o(e1 e1Var, Retrofit retrofit) {
        RevPointsPersonalisationService revPointsPersonalisationService = (RevPointsPersonalisationService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsPersonalisationService.class, "create(...)");
        vc.s.k(revPointsPersonalisationService);
        return revPointsPersonalisationService;
    }

    public static RevPointsPersonalisationTargetingOnboardingService p(e1 e1Var, Retrofit retrofit) {
        RevPointsPersonalisationTargetingOnboardingService revPointsPersonalisationTargetingOnboardingService = (RevPointsPersonalisationTargetingOnboardingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsPersonalisationTargetingOnboardingService.class, "create(...)");
        vc.s.k(revPointsPersonalisationTargetingOnboardingService);
        return revPointsPersonalisationTargetingOnboardingService;
    }

    public static RevPointsProductArticleService q(e1 e1Var, Retrofit retrofit) {
        RevPointsProductArticleService revPointsProductArticleService = (RevPointsProductArticleService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsProductArticleService.class, "create(...)");
        vc.s.k(revPointsProductArticleService);
        return revPointsProductArticleService;
    }

    public static RevPointsProductEligibilityService r(e1 e1Var, Retrofit retrofit) {
        RevPointsProductEligibilityService revPointsProductEligibilityService = (RevPointsProductEligibilityService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsProductEligibilityService.class, "create(...)");
        vc.s.k(revPointsProductEligibilityService);
        return revPointsProductEligibilityService;
    }

    public static RevPointsService s(e1 e1Var, Retrofit retrofit) {
        RevPointsService revPointsService = (RevPointsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevPointsService.class, "create(...)");
        vc.s.k(revPointsService);
        return revPointsService;
    }

    public static xe0.e t(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        x0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "rev_points", mapper, 8, zhm.v.k(mxb.a.d, mxb.b.d, mxb.c.d, mxb.d.d, mxb.e.d, mxb.f.d, mxb.g.d), 32);
    }

    public static yxk.a u(TradingOnboardingDatabase db8) {
        zxk.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        yxk.a aVarG = db8.g();
        vc.s.k(aVarG);
        return aVarG;
    }

    public static wxf.j v(TravelDatabase database) {
        zxf.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        wxf.j jVarJ = database.j();
        vc.s.k(jVarJ);
        return jVarJ;
    }

    public static f01.c w(Context context) {
        d1.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }
}
