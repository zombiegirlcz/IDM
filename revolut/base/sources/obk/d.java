package obk;

import android.app.ActivityManager;
import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.backend_driven_limits.impl.v2.network.RestrictionsService;
import com.revolut.feature.pay_later.impl.database.PayLaterDatabase;
import com.revolut.feature.pay_later.impl.network.PayLaterApiService;
import com.revolut.feature.transaction.troubleshooter.impl.network.TransactionTroubleshooterService;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingSenderService;
import ecm.q;
import fmc.z;
import ji9.j;
import ji9.l;
import ji9.m;
import ji9.n;
import ji9.o;
import ji9.p;
import ji9.r;
import ji9.t;
import ji9.u;
import ji9.w;
import ji9.x;
import ji9.y;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import oda.v;
import oi9.c0;
import oje.i;
import oje.k;
import qgk.g3;
import qgk.h3;
import qgk.m3;
import qgk.q3;
import ql7.e2;
import ql7.h2;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rp0.l0;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d implements e4m.e {
    public static h3 A(q3 q3Var) {
        h3 h3Var = (h3) q3Var.b();
        s.k(h3Var);
        return h3Var;
    }

    public static aah.g B(z factory, qr5.b view, qr5.a controllerModel) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        return new aah.g(view, controllerModel);
    }

    public static aah.g C(fn2.c factory, pr5.c view, pr5.a controllerModel) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        return new aah.g(view, controllerModel);
    }

    public static TransactionTroubleshooterService D(Retrofit retrofit) {
        off.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TransactionTroubleshooterService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TransactionTroubleshooterService transactionTroubleshooterService = (TransactionTroubleshooterService) objCreate;
        s.k(transactionTroubleshooterService);
        return transactionTroubleshooterService;
    }

    public static v a(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, r5a.b bVar, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, a31.a aVar38) {
        return new v(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, bVar, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38);
    }

    public static ActivityManager b(Context context) {
        of0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
        ActivityManager activityManager = (ActivityManager) systemService;
        s.k(activityManager);
        return activityManager;
    }

    public static PayLaterApiService c(Retrofit retrofit) {
        PayLaterApiService payLaterApiService = (PayLaterApiService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PayLaterApiService.class, "create(...)");
        s.k(payLaterApiService);
        return payLaterApiService;
    }

    public static x4l.c d(plc.b provider) {
        olc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider.get();
    }

    public static PayLaterDatabase e(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        c0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        PayLaterDatabase.Companion companion = PayLaterDatabase.INSTANCE;
        companion.getClass();
        PayLaterDatabase payLaterDatabase = (PayLaterDatabase) companion.a(context, databaseSessionProvider, new Migration[]{ji9.k.f174399c, r.f174406c, ji9.s.f174407c, t.f174408c, u.f174409c, ji9.v.f174410c, w.f174411c, x.f174412c, y.f174413c, ji9.a.f174389c, ji9.b.f174390c, ji9.c.f174391c, ji9.d.f174392c, ji9.e.f174393c, ji9.f.f174394c, ji9.g.f174395c, ji9.h.f174396c, ji9.i.f174397c, j.f174398c, l.f174400c, m.f174401c, n.f174402c, o.f174403c, p.f174404c, ji9.q.f174405c}, databaseEncryptionMigratorFactory);
        s.k(payLaterDatabase);
        return payLaterDatabase;
    }

    public static Retrofit f(kg.o oVar, Retrofit retrofit) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "gson");
        builderX.converterFactories().clear();
        Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static kg.o g(kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        return aj9.a.a(gson);
    }

    public static sri.m h(z70.a contextProvider) {
        oe5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return sri.o.c(contextProvider.getContext(), null, null, 14);
    }

    public static xe0.e i(kg.o baseGson, le0.b gsonObjectMapperFactory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        c0.Companion.getClass();
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "pay_later", gsonObjectMapperFactory.a(aj9.a.a(baseGson)), 10, fj9.a.f135549a, 32);
    }

    public static gi9.c j(PayLaterDatabase database) {
        c0.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        gi9.c cVarG = database.g();
        s.k(cVarG);
        return cVarG;
    }

    public static xe0.e k(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "plan_gifting_initial_enable_birthday_sharing", mapper, 0, null, 56);
    }

    public static PlanGiftingSenderService l(c cVar, Retrofit retrofit) {
        PlanGiftingSenderService planGiftingSenderService = (PlanGiftingSenderService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PlanGiftingSenderService.class, "create(...)");
        s.k(planGiftingSenderService);
        return planGiftingSenderService;
    }

    public static xe0.e m(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "plan_gifting_receiver", mapper, 0, null, 56);
    }

    public static w4l.f n(plc.e provider) {
        olc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = provider.e;
        s.k(fVar);
        return fVar;
    }

    public static RestrictionsService o(Retrofit retrofit) {
        ol2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(RestrictionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RestrictionsService restrictionsService = (RestrictionsService) objCreate;
        s.k(restrictionsService);
        return restrictionsService;
    }

    public static x4l.c p(frk.b provider) {
        olc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        x4l.c cVar = provider.f137490c;
        s.k(cVar);
        return cVar;
    }

    public static w4l.f q(mlc.b provider) {
        olc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider.get();
    }

    public static x4l.c r(plc.f provider) {
        olc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider.get();
    }

    public static ku5.j s(hd.r factory, ut5.l view, nw5.j cryptoStatsInteractor, l0 popupMenuDialogDisplayer, j60.a bottomExpandableDialogControllerExtension, jx0.a cryptoPortfolioFiatItemsDataProvider) {
        oje.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(cryptoPortfolioFiatItemsDataProvider, "cryptoPortfolioFiatItemsDataProvider");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        return factory.s(view, popupMenuDialogDisplayer, bottomExpandableDialogControllerExtension, new t1(cryptoStatsInteractor), null, cryptoPortfolioFiatItemsDataProvider, null, null);
    }

    public static x4l.c t(plc.g provider) {
        olc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        x4l.c cVar = provider.f237336b;
        s.k(cVar);
        return cVar;
    }

    public static xe0.e u(je0.d mapper, yk0.a databaseSessionProvider, xe0.f fVar) {
        oda.r.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "pocket_details_storage", mapper, 3, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new wea.a()), 32);
    }

    public static w4l.f v(plc.j provider) {
        olc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = provider.e;
        s.k(fVar);
        return fVar;
    }

    public static xe0.e w(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        off.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_transaction_troubleshooter", mapper, 0, null, 56);
    }

    public static ql7.a x(e2 e2Var) {
        ql7.a aVar = (ql7.a) e2Var.b();
        s.k(aVar);
        return aVar;
    }

    public static ql7.c y(h2 h2Var) {
        ql7.c cVar = (ql7.c) h2Var.b();
        s.k(cVar);
        return cVar;
    }

    public static g3 z(m3 m3Var) {
        g3 g3Var = (g3) m3Var.b();
        s.k(g3Var);
        return g3Var;
    }
}
