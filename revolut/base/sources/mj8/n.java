package mj8;

import al4.p;
import com.revolut.feature.credit.card.impl.network.CreditCardEntryPointDetailsService;
import com.revolut.feature.junior_settings.impl.services.JuniorSettingsService;
import com.revolut.feature.us_send_checks.impl.service.SendChecksTransferService;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import mkf.s;
import mkh.x;
import mkh.z;
import mn8.a0;
import mn8.b0;
import mn8.v;
import om4.k4;
import retrofit2.Retrofit;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements e4m.e {
    public static okh.a A(aah.i factory) {
        x.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new okh.a(factory.b());
    }

    public static q B(mp.f fVar) {
        fVar.getClass();
        return new q(new s(27));
    }

    public static k4 C(k4 interactor) {
        mm4.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        vc.s.k(interactor);
        return interactor;
    }

    public static void D(k4 interactor) {
        mm4.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(interactor, "interactor");
    }

    public static al4.j a(p interactor) {
        mm4.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        vc.s.k(interactor);
        return interactor;
    }

    public static ae9.d b(a31.a aVar, a31.a aVar2, lal.j jVar, a31.a aVar3, a31.a aVar4) {
        return new ae9.d(aVar, aVar2, jVar, aVar3, aVar4);
    }

    public static b0 c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, lal.j jVar, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21) {
        return new b0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, jVar, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21);
    }

    public static q d(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(5));
    }

    public static q e(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(2));
    }

    public static CreditCardEntryPointDetailsService f(mm4.c cVar, Retrofit retrofit) {
        CreditCardEntryPointDetailsService creditCardEntryPointDetailsService = (CreditCardEntryPointDetailsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditCardEntryPointDetailsService.class, "create(...)");
        vc.s.k(creditCardEntryPointDetailsService);
        return creditCardEntryPointDetailsService;
    }

    public static xe0.e g(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        m.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_workflow_based_profile_storage", mapper, 1, f0.f322471a, 32);
    }

    public static q h(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(7));
    }

    public static q i(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(1));
    }

    public static q j(mp.f fVar) {
        fVar.getClass();
        return new q(new s(29));
    }

    public static q k(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(6));
    }

    public static q l(mp.f fVar) {
        fVar.getClass();
        return new q(new s(25));
    }

    public static q m(mp.f fVar) {
        fVar.getClass();
        return new q(new s(28));
    }

    public static q n(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(10));
    }

    public static JuniorSettingsService o(v vVar, Retrofit retrofit) {
        JuniorSettingsService juniorSettingsService = (JuniorSettingsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorSettingsService.class, "create(...)");
        vc.s.k(juniorSettingsService);
        return juniorSettingsService;
    }

    public static xe0.e p(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_settings", mapper, 0, null, 56);
    }

    public static q q(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(4));
    }

    public static q r(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(11));
    }

    public static q s(mp.f fVar) {
        fVar.getClass();
        return new q(new s(26));
    }

    public static q t(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(9));
    }

    public static q u(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(8));
    }

    public static q v(mp.f fVar) {
        fVar.getClass();
        return new q(new mp.e(3));
    }

    public static xe0.e w(je0.d objectMapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        z.Companion.getClass();
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "TAB_INVEST_STORAGE", objectMapper, 1, f0.f322471a, 32);
    }

    public static xe0.e x(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        mn8.s.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_devices", mapper, 2, u.c(new exa.a(1, 2, 5)), 32);
    }

    public static xe0.e y(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        mn8.x.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_settings_sign_in", mapper, 0, null, 56);
    }

    public static SendChecksTransferService z(mlg.e eVar, Retrofit retrofit) {
        SendChecksTransferService sendChecksTransferService = (SendChecksTransferService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", SendChecksTransferService.class, "create(...)");
        vc.s.k(sendChecksTransferService);
        return sendChecksTransferService;
    }
}
