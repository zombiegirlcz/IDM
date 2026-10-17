package jr9;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.room.migration.Migration;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaSize;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.data.otp.DebugOtpService;
import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsSuggestionsService;
import com.revolut.feature.selfserve.sot.impl.services.SotService;
import com.revolut.trading.orders.data.db.OrdersDatabase;
import ecm.q;
import fr9.a;
import jyc.p;
import kotlin.jvm.internal.Intrinsics;
import lrl.o;
import lrl.r;
import lrl.t;
import lrl.u;
import lrl.v;
import lrl.w;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h implements e4m.e {
    public static c90.c A(com.revolut.kompot.navigable.a controller) {
        jx4.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new c90.c(controller.m2());
    }

    public static uw1.b B(lz1.d dVar) {
        uw1.b bVar = (uw1.b) dVar.b();
        s.k(bVar);
        return bVar;
    }

    public static SotService C(Retrofit retrofit) {
        p.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SotService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SotService sotService = (SotService) objCreate;
        s.k(sotService);
        return sotService;
    }

    public static a7d.a a(a31.a aVar) {
        return new a7d.a(aVar, 22);
    }

    public static jxa.m b(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new jxa.m(aVar, aVar2, aVar3);
    }

    public static k4i.a c(a31.a aVar, ede.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11) {
        return new k4i.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    public static k78.j d(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, a31.a aVar38, a31.a aVar39, a31.a aVar40, a31.a aVar41, a31.a aVar42, a31.a aVar43) {
        return new k78.j(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43);
    }

    public static Activity e(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Activity activityM2 = controller.m2();
        s.k(activityM2);
        return activityM2;
    }

    public static k40.a f(f61.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new k40.a();
    }

    public static k40.d g(f61.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj2 = ((phm.a) factory.f132372b).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return new k40.d((l30.b) obj2);
    }

    public static yji.d h(gu2.e extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static OrdersDatabase i(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        jrl.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        OrdersDatabase.Companion aVar = OrdersDatabase.INSTANCE;
        aVar.getClass();
        OrdersDatabase ordersDatabase = (OrdersDatabase) aVar.a(context, databaseSessionProvider, new Migration[]{lrl.k.f199560c, lrl.p.f199565c, lrl.q.f199566c, r.f199567c, lrl.s.f199568c, t.f199569c, u.f199570c, v.f199571c, w.f199572c, lrl.a.f199550c, lrl.b.f199551c, lrl.c.f199552c, lrl.d.f199553c, lrl.e.f199554c, lrl.f.f199555c, lrl.g.f199556c, lrl.h.f199557c, lrl.i.f199558c, lrl.j.f199559c, lrl.l.f199561c, lrl.m.f199562c, lrl.n.f199563c, o.f199564c}, databaseEncryptionMigratorFactory);
        s.k(ordersDatabase);
        return ordersDatabase;
    }

    public static yji.n j(j4g.a extension) {
        k4g.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static kg.o k(kg.o gson) {
        n.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        he0.m mVar = new he0.m("type", fr9.a.class, false, true);
        mVar.c(a.b.class, "DEBT");
        mVar.c(a.c.class, "INVITE");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        pVar.e.add(mVar);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static com.hcaptcha.sdk.a l(Activity activity) {
        ju2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        dl.a aVar = new dl.a();
        ii.e eVar = new ii.e();
        eVar.f161494a = aVar;
        com.hcaptcha.sdk.a aVar2 = new com.hcaptcha.sdk.a(activity, eVar);
        Intrinsics.checkNotNullExpressionValue(aVar2, "getClient(...)");
        return aVar2;
    }

    public static HCaptchaConfig m(String siteKey) {
        ju2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(siteKey, "siteKey");
        ii.b bVarBuilder = HCaptchaConfig.builder();
        bVarBuilder.e = Boolean.FALSE;
        bVarBuilder.d = true;
        if (siteKey == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        bVarBuilder.f161472a = siteKey;
        od0.a aVar = od0.a.f224253a;
        bVarBuilder.H = Boolean.valueOf(od0.a.e());
        bVarBuilder.G = true;
        bVarBuilder.f161483r = HCaptchaSize.INVISIBLE;
        bVarBuilder.f161482q = true;
        HCaptchaConfig hCaptchaConfigA = bVarBuilder.a();
        Intrinsics.checkNotNullExpressionValue(hCaptchaConfigA, "build(...)");
        return hCaptchaConfigA;
    }

    public static krl.l n(OrdersDatabase db8) {
        jrl.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        krl.l lVarG = db8.g();
        s.k(lVarG);
        return lVarG;
    }

    public static xe0.e o(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        jrl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "invest_orders_storage", mapper, 2, zhm.u.c(new qrl.a()), 32);
    }

    public static xe0.e p(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        jrl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "monthly_investments_storage", mapper, 0, null, 56);
    }

    public static sri.m q(Context context) {
        jyk.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static le0.a r(kg.o gson, le0.b gsonObjectMapperFactory) {
        n.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return gsonObjectMapperFactory.a(gson);
    }

    public static xe0.e s(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        jrl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "trading_orders_storage", mapper, 0, null, 56);
    }

    public static DebugOtpService t(Retrofit retrofit) {
        k21.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(DebugOtpService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        DebugOtpService debugOtpService = (DebugOtpService) objCreate;
        s.k(debugOtpService);
        return debugOtpService;
    }

    public static n80.e u(Context context) {
        k1b.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return new n80.e(packageManager);
    }

    public static PaymentsGroupsSuggestionsService v(Retrofit retrofit) {
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(PaymentsGroupsSuggestionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PaymentsGroupsSuggestionsService paymentsGroupsSuggestionsService = (PaymentsGroupsSuggestionsService) objCreate;
        s.k(paymentsGroupsSuggestionsService);
        return paymentsGroupsSuggestionsService;
    }

    public static j9i.d w(r9i.e reactionsKeyboardViewModel, ReactionsKeyboardView reactionsKeyboardView, j9i.a configuration) {
        Intrinsics.checkNotNullParameter(reactionsKeyboardViewModel, "reactionsKeyboardViewModel");
        Intrinsics.checkNotNullParameter(reactionsKeyboardView, "reactionsKeyboardView");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new j9i.d(reactionsKeyboardViewModel, reactionsKeyboardView, configuration);
    }

    public static gu2.e x(hu2.a captchaAvailabilityProvider, ku2.h captchaResolver) {
        Intrinsics.checkNotNullParameter(captchaAvailabilityProvider, "captchaAvailabilityProvider");
        Intrinsics.checkNotNullParameter(captchaResolver, "captchaResolver");
        return new gu2.e(captchaAvailabilityProvider, captchaResolver);
    }

    public static xe0.e y(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        n.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "payments_groups", mapper, 0, null, 56);
    }

    public static f01.c z(ContextThemeWrapper context) {
        k3d.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }
}
