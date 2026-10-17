package olc;

import android.content.Context;
import com.revolut.feature.junior_transfer.impl.service.JuniorDetailedTransferSettingsService;
import com.revolut.feature.payments.messaging.data.impl.data.database.SocialPaymentsDatabase;
import com.revolut.feature.topup_screen.impl.data.network.service.CardTopUpRevampedService;
import com.revolut.feature.topup_screen.impl.data.network.service.ExternalCardVerificationService;
import com.revolut.feature.topup_screen.impl.data.network.service.RevertTransferService;
import com.revolut.feature.topup_screen.impl.data.network.service.StoredMethodService;
import com.revolut.feature.topup_screen.impl.data.network.service.TopUpLimitsService;
import csh.k;
import e4m.e;
import ecm.q;
import i9e.a0;
import ish.h;
import ish.z;
import je0.d;
import k1c.g;
import kotlin.jvm.internal.Intrinsics;
import kxa.m;
import nyb.k0;
import ov9.j;
import ove.f0;
import ove.i0;
import ove.q0;
import ove.w0;
import plc.n;
import plc.r;
import prk.m0;
import q06.l;
import retrofit2.Retrofit;
import sri.o;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements e {
    public static xe0.e A(ore.e eVar, d mapper, yk0.a databaseSessionProvider, f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "user_documents", mapper, 0, null, 56);
    }

    public static h B(osh.a aVar, k widgetsDependenciesApi) {
        Intrinsics.checkNotNullParameter(widgetsDependenciesApi, "widgetsDependenciesApi");
        return new h(widgetsDependenciesApi.e(), new r10.f(widgetsDependenciesApi.c()));
    }

    public static z C(osh.a aVar, hsh.b widgetsApi, k widgetsDependenciesApi) {
        Intrinsics.checkNotNullParameter(widgetsApi, "widgetsApi");
        Intrinsics.checkNotNullParameter(widgetsDependenciesApi, "widgetsDependenciesApi");
        return widgetsApi.b().i(widgetsDependenciesApi);
    }

    public static sqk.a D(m0 m0Var) {
        sqk.a aVar = (sqk.a) m0Var.b();
        s.k(aVar);
        return aVar;
    }

    public static k1c.b a(l1c.a factory, k0 revPointsRimWidgetAvailabilityInteractor, g revPointsRimWidgetItemsProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(revPointsRimWidgetAvailabilityInteractor, "revPointsRimWidgetAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsRimWidgetItemsProvider, "revPointsRimWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(revPointsRimWidgetAvailabilityInteractor, "revPointsRimWidgetAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsRimWidgetItemsProvider, "revPointsRimWidgetItemsProvider");
        return new k1c.b(revPointsRimWidgetAvailabilityInteractor, revPointsRimWidgetItemsProvider);
    }

    public static oy.a b(oy.b bVar, com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new oy.a(controller);
    }

    public static a51.d c(xs6.a aVar) {
        return new a51.d(aVar, 13);
    }

    public static a0 d(q qVar, q qVar2, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, mva.a aVar20, a31.a aVar21, a31.a aVar22, mva.a aVar23, a31.a aVar24, a31.a aVar25, q qVar3, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30) {
        return new a0(qVar, qVar2, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, qVar3, aVar26, aVar27, aVar28, aVar29, aVar30);
    }

    public static m e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, mva.a aVar12) {
        return new m(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, 1);
    }

    public static i0 f(a31.a aVar) {
        return new i0(aVar);
    }

    public static xe0.e g(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        otg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "account_closure_storage", mapper, 0, null, 56);
    }

    public static xe0.e h(d mapper, f storageFactory, yk0.a dbSessionProvider) {
        q0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, dbSessionProvider, "country_limits_storage", mapper, 0, null, 56);
    }

    public static xe0.e i(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        ov9.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "p2p_encryption", mapper, 0, null, 56);
    }

    public static ExternalCardVerificationService j(Retrofit retrofit) {
        f0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ExternalCardVerificationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ExternalCardVerificationService externalCardVerificationService = (ExternalCardVerificationService) objCreate;
        s.k(externalCardVerificationService);
        return externalCardVerificationService;
    }

    public static xe0.e k(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        ove.k0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "india_stored_method_detail_storage", mapper, 0, null, 56);
    }

    public static JuniorDetailedTransferSettingsService l(oq8.h hVar, Retrofit retrofit) {
        JuniorDetailedTransferSettingsService juniorDetailedTransferSettingsService = (JuniorDetailedTransferSettingsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorDetailedTransferSettingsService.class, "create(...)");
        s.k(juniorDetailedTransferSettingsService);
        return juniorDetailedTransferSettingsService;
    }

    public static k1c.d m(l1c.a factory, fub.a challengeClaimDialogMapper, nyb.k revPointsInteractor, ish.a0 widgetsUiInteractor, ash.d widgetsCommonEventDispatcher, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(challengeClaimDialogMapper, "challengeClaimDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(challengeClaimDialogMapper, "challengeClaimDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        return new k1c.d(challengeClaimDialogMapper, revPointsInteractor, widgetsUiInteractor, widgetsCommonEventDispatcher, deeplinkRouter);
    }

    public static xe0.e n(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "social_payments_messages", mapper, 0, null, 56);
    }

    public static sri.m o(Context context) {
        ou2.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static sri.m p(ore.e eVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static gv9.k q(SocialPaymentsDatabase database) {
        ov9.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        gv9.k kVarH = database.h();
        s.k(kVarH);
        return kVarH;
    }

    public static RevertTransferService r(w0 w0Var, Retrofit retrofit) {
        RevertTransferService revertTransferService = (RevertTransferService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RevertTransferService.class, "create(...)");
        s.k(revertTransferService);
        return revertTransferService;
    }

    public static CardTopUpRevampedService s(Retrofit retrofit) {
        ove.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CardTopUpRevampedService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CardTopUpRevampedService cardTopUpRevampedService = (CardTopUpRevampedService) objCreate;
        s.k(cardTopUpRevampedService);
        return cardTopUpRevampedService;
    }

    public static StoredMethodService t(Retrofit retrofit) {
        ove.k0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(StoredMethodService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        StoredMethodService storedMethodService = (StoredMethodService) objCreate;
        s.k(storedMethodService);
        return storedMethodService;
    }

    public static TopUpLimitsService u(Retrofit retrofit) {
        q0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TopUpLimitsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TopUpLimitsService topUpLimitsService = (TopUpLimitsService) objCreate;
        s.k(topUpLimitsService);
        return topUpLimitsService;
    }

    public static xe0.e v(d mapper, yk0.a databaseSessionProvider, f storageFactory) {
        oq8.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "JuniorTransferSettingsStorage", mapper, 1, zhm.f0.f322471a, 32);
    }

    public static w4l.f w(plc.l provider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = provider.e;
        s.k(fVar);
        return fVar;
    }

    public static w4l.f x(n provider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = provider.f;
        s.k(fVar);
        return fVar;
    }

    public static w4l.f y(r provider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = provider.e;
        s.k(fVar);
        return fVar;
    }

    public static f01.c z(z70.a contextProvider) {
        ong.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return new f01.c(contextProvider.getContext());
    }
}
