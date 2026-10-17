package iz8;

import ae9.d;
import anb.c0;
import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.gambling.impl.services.GamblingBlockService;
import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentPromptService;
import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentRequestService;
import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentService;
import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase;
import com.revolut.feature_market_data_impl.data.network.OrderQuoteService;
import e4m.e;
import fw2.l;
import hz8.h;
import i0e.g;
import i4b.f;
import i4b.i0;
import i4b.q;
import i4b.s0;
import j1a.n;
import java.util.Arrays;
import jd8.k;
import jdi.r;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import l4b.d0;
import l4b.m;
import retrofit2.Retrofit;
import vc.s;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements e {
    public static s0 A(f binder, q modelApi, i0 delegates, j60.a dialogView, l4b.a breakdownDescriptionDialogMapper, l4b.c cfdExpiryOrderDialogMapper, m feeBreakdownDialogMapper, l4b.q overnightFeeDialogMapper, d0 underlyingAssetRateDialogMapper) {
        j4b.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(modelApi, "modelApi");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(overnightFeeDialogMapper, "overnightFeeDialogMapper");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(underlyingAssetRateDialogMapper, "underlyingAssetRateDialogMapper");
        Intrinsics.checkNotNullParameter(feeBreakdownDialogMapper, "feeBreakdownDialogMapper");
        Intrinsics.checkNotNullParameter(breakdownDescriptionDialogMapper, "breakdownDescriptionDialogMapper");
        Intrinsics.checkNotNullParameter(cfdExpiryOrderDialogMapper, "cfdExpiryOrderDialogMapper");
        return new s0(binder, modelApi, delegates, dialogView, breakdownDescriptionDialogMapper, cfdExpiryOrderDialogMapper, feeBreakdownDialogMapper, overnightFeeDialogMapper, underlyingAssetRateDialogMapper);
    }

    public static j60.c B(com.revolut.kompot.navigable.a controller, he2.b dialogHostFinder) {
        j0e.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, new rp0.m(), dialogHostFinder);
    }

    public static OrderQuoteService C(j4i.e eVar, Retrofit retrofit) {
        OrderQuoteService orderQuoteService = (OrderQuoteService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", OrderQuoteService.class, "create(...)");
        s.k(orderQuoteService);
        return orderQuoteService;
    }

    public static j1a.a D(n nVar) {
        j1a.a aVar = (j1a.a) nVar.b();
        s.k(aVar);
        return aVar;
    }

    public static a7d.a a(a31.a aVar) {
        return new a7d.a(aVar, 17);
    }

    public static d b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, l lVar) {
        return new d(lVar, aVar, aVar2, aVar3, aVar4, 3);
    }

    public static c0 c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new c0(aVar, aVar2, aVar3, aVar4, 13);
    }

    public static jge.c d(a31.a aVar) {
        return new jge.c(aVar);
    }

    public static jge.q e(a31.a aVar) {
        return new jge.q(aVar);
    }

    public static a7d.a f(a31.a aVar) {
        return new a7d.a(aVar, 18);
    }

    public static xe0.e g(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_track", mapper, 0, null, 56);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d h(j60.a impl) {
        j0e.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(impl, "impl");
        yji.d dVar = (yji.d) impl;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d i(i0e.f impl) {
        j0e.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(impl, "impl");
        yji.d dVar = (yji.d) impl;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n j(g impl) {
        j0e.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(impl, "impl");
        yji.n nVar = (yji.n) impl;
        s.k(nVar);
        return nVar;
    }

    public static h k(LearnDatabase database) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        h hVarH = database.h();
        s.k(hVarH);
        return hVarH;
    }

    public static LearnDatabase l(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(context, LearnDatabase.class, "learn_db");
        LearnDatabase.INSTANCE.getClass();
        LearnDatabase learnDatabase = (LearnDatabase) builderDatabaseBuilder.addMigrations((Migration[]) Arrays.copyOf(new Migration[]{kz8.a.f191067c, kz8.b.f191068c, kz8.c.f191069c, kz8.d.f191070c, kz8.e.f191071c, kz8.f.f191072c, kz8.g.f191073c, kz8.h.f191074c}, 8)).fallbackToDestructiveMigration().openHelperFactory(new ce0.d(((bl0.g) databaseEncryptionMigratorFactory).a("learn_db", databaseSessionProvider.getToken()))).build();
        s.k(learnDatabase);
        return learnDatabase;
    }

    public static o m(j4i.e eVar) {
        o oVarA = GsonHolder.a();
        oVarA.getClass();
        p pVar = new p(oVarA);
        pVar.e.add(c8l.a.a());
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit n(j4i.e eVar, Retrofit retrofit, o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static ve0.c o(je0.d mapper, xe0.f storageFactory) {
        je9.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "passcode_tip_attempts.pref", mapper, 12);
    }

    public static GamblingBlockService p(j67.e eVar, Retrofit retrofit) {
        GamblingBlockService gamblingBlockService = (GamblingBlockService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", GamblingBlockService.class, "create(...)");
        s.k(gamblingBlockService);
        return gamblingBlockService;
    }

    public static xe0.e q(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        j67.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "gambling_block", mapper, 0, null, 56);
    }

    public static hz8.k r(LearnDatabase database) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        hz8.k kVarI = database.i();
        s.k(kVarI);
        return kVarI;
    }

    public static JuniorConsentPromptService s(jd8.h hVar, Retrofit retrofit) {
        JuniorConsentPromptService juniorConsentPromptService = (JuniorConsentPromptService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorConsentPromptService.class, "create(...)");
        s.k(juniorConsentPromptService);
        return juniorConsentPromptService;
    }

    public static JuniorConsentRequestService t(jd8.h hVar, Retrofit retrofit) {
        JuniorConsentRequestService juniorConsentRequestService = (JuniorConsentRequestService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorConsentRequestService.class, "create(...)");
        s.k(juniorConsentRequestService);
        return juniorConsentRequestService;
    }

    public static JuniorConsentService u(jd8.h hVar, Retrofit retrofit) {
        JuniorConsentService juniorConsentService = (JuniorConsentService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorConsentService.class, "create(...)");
        s.k(juniorConsentService);
        return juniorConsentService;
    }

    public static xe0.e v(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "JuniorConsent", mapper, 4, v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5)), 32);
    }

    public static xe0.e w(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        j4i.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "market_data_storage", mapper, 2, u.c(new exa.a(1, 2, 5)), 32);
    }

    public static ydf.b x(fxk.a tradingHoursInteractor, ybl.b instrumentTickerInteractor, df0.b syncedDateProvider) {
        j4b.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(tradingHoursInteractor, "tradingHoursInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        return new ydf.b(tradingHoursInteractor, instrumentTickerInteractor, syncedDateProvider, new ydf.c());
    }

    public static xe0.e y(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "rev_points_pocket", mapper, 1, f0.f322471a, 32);
    }

    public static hz8.l z(LearnDatabase database) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        hz8.l lVarJ = database.j();
        s.k(lVarJ);
        return lVarJ;
    }
}
