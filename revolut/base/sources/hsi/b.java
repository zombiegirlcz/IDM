package hsi;

import aah.g;
import android.app.Activity;
import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.revolut.feature.transport.impl.data.TransportService;
import com.revolut.feature.transport.impl.data.database.TransportDatabase;
import com.revolut.retail.feature.impl.budgeting_cycle.network.AnalyticsCycleService;
import cvf.d;
import cvf.f;
import cvf.i;
import e4m.e;
import f01.c;
import he0.m;
import hvf.b0;
import hvf.g0;
import hvf.h0;
import hy1.c0;
import hy1.l;
import hy1.p;
import hy1.v;
import hy1.y;
import java.util.Arrays;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import lo0.k;
import retrofit2.Retrofit;
import uo.q0;
import vc.s;
import vuf.h;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements e {
    public static c A(Activity activity) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.bumptech.glide.c.k(activity).getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new c(activity);
    }

    public static k B(Activity activity) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        return com.bumptech.glide.c.k(activity).f(activity);
    }

    public static h C(TransportDatabase database) {
        b0.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        h hVarG = database.g();
        s.k(hVarG);
        return hVarG;
    }

    public static TransportDatabase D(Context context) {
        b0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(context, TransportDatabase.class, "transport_db");
        TransportDatabase.INSTANCE.getClass();
        TransportDatabase transportDatabase = (TransportDatabase) builderDatabaseBuilder.addMigrations((Migration[]) Arrays.copyOf(new Migration[]{uuf.a.f283229c}, 1)).fallbackToDestructiveMigration().build();
        s.k(transportDatabase);
        return transportDatabase;
    }

    public static ky1.a a(hy1.c provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a b(hy1.c provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static AnalyticsCycleService c(Retrofit retrofit) {
        hsj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AnalyticsCycleService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AnalyticsCycleService analyticsCycleService = (AnalyticsCycleService) objCreate;
        s.k(analyticsCycleService);
        return analyticsCycleService;
    }

    public static ky1.a d(l provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a e(l provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a f(p provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a g(p provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a h(hy1.s provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a i(hy1.s provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static g j(com.revolut.kompot.navigable.a controller, gti.h brightnessObserver, q0 screenNameFinder, uo.b activeScreenHolder, gti.b brightnessAnalyticsTracker) {
        hti.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(brightnessObserver, "brightnessObserver");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(brightnessAnalyticsTracker, "brightnessAnalyticsTracker");
        return new g(brightnessObserver, new gti.c(controller, screenNameFinder, activeScreenHolder, brightnessAnalyticsTracker));
    }

    public static o k(h0 h0Var, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        m mVarB = m.b(i.class, "state");
        mVarB.c(cvf.h.class, "TO_BE_ACTIVATED");
        mVarB.c(d.class, "ACTIVATED");
        mVarB.c(f.class, "NOT_PURCHASED");
        mVarB.c(cvf.g.class, "PENDING");
        mVarB.c(cvf.e.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVarB, "registerFallbackSubtype(...)");
        pVar.e.add(mVarB);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static ky1.a l(v provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a m(v provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a n(y provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a o(y provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static sri.m p(Context context) {
        htc.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m q(Context context) {
        g0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static ky1.a r(c0 provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a s(c0 provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a t(ky1.c provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static ky1.a u(ky1.c provider) {
        hy1.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        s.k(provider);
        return provider;
    }

    public static com.revolut.core.ui_kit_core.displayers.sound.a v(Activity context) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "activity");
        com.bumptech.glide.c.k(context).getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new com.revolut.core.ui_kit_core.displayers.sound.a(context);
    }

    public static xe0.e w(je0.d mapper, xe0.f storageFactory, yk0.a dbSessionProvider) {
        b0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        return xe0.f.f(storageFactory, dbSessionProvider, "localisation_transport_storage", mapper, 1, null, 48);
    }

    public static xe0.e x(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        hsj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "budgeting_cycle", mapper, 2, u.c(new nsj.a()), 32);
    }

    public static lo0.h y(Activity context) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "activity");
        com.bumptech.glide.c.k(context).getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new lo0.h(new lo0.a(context));
    }

    public static TransportService z(h0 h0Var, Retrofit retrofit) {
        TransportService transportService = (TransportService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TransportService.class, "create(...)");
        s.k(transportService);
        return transportService;
    }
}
