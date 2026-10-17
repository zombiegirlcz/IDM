package trl;

import aah.m;
import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.referrals.promo.impl.invitation.data.db.model.ReferralsInvitationDatabase;
import com.revolut.feature.referrals.promo.impl.invitation.service.ReferralsInvitationService;
import com.revolut.feature.rev_pro.network_authentication.impl.data.network.AccessTokenService;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.trading.orders.data.network.services.TradingOrdersService;
import ish.a0;
import je6.g;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import mae.p;
import retrofit2.Retrofit;
import u45.e1;
import u7i.x;
import ubf.i;
import vc.s;
import vtc.k0;
import vtc.r0;
import xf6.l3;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f implements e4m.e {
    public static yf6.e A(yf6.a aVar) {
        yf6.e eVar = (yf6.e) aVar.b();
        s.k(eVar);
        return eVar;
    }

    public static g B(l3 l3Var) {
        g gVar = (g) l3Var.b();
        s.k(gVar);
        return gVar;
    }

    public static k0 C(r0 r0Var) {
        k0 k0Var = (k0) r0Var.b();
        s.k(k0Var);
        return k0Var;
    }

    public static ReferralsInvitationService D(Retrofit retrofit) {
        txa.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ReferralsInvitationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ReferralsInvitationService referralsInvitationService = (ReferralsInvitationService) objCreate;
        s.k(referralsInvitationService);
        return referralsInvitationService;
    }

    public static ava.d a(a31.a aVar, a31.a aVar2, r5a.b bVar) {
        return new ava.d(bVar, aVar, aVar2, 4);
    }

    public static AccessTokenService b(Retrofit retrofit) {
        u2c.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AccessTokenService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AccessTokenService accessTokenService = (AccessTokenService) objCreate;
        s.k(accessTokenService);
        return accessTokenService;
    }

    public static d8b.c c(e8b.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new d8b.c();
    }

    public static d8b.g d(e8b.a factory, ash.d widgetsCommonEventDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        return new d8b.g(widgetsCommonEventDispatcher, widgetsUiInteractor);
    }

    public static d8b.f e(e8b.a factory, t5b.a cobrandsWidgetItemsProvider, q5b.c cobrandsProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(cobrandsWidgetItemsProvider, "cobrandsWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(cobrandsWidgetItemsProvider, "cobrandsWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        return new d8b.f(cobrandsWidgetItemsProvider, cobrandsProductAvailabilityInteractor);
    }

    public static d8b.g f(e8b.a factory, ash.d widgetsCommonEventDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        return new d8b.g(widgetsCommonEventDispatcher, widgetsUiInteractor);
    }

    public static d8b.f g(e8b.a factory, t5b.a cobrandsWidgetItemsProvider, q5b.c cobrandsProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(cobrandsWidgetItemsProvider, "cobrandsWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(cobrandsWidgetItemsProvider, "cobrandsWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        return new d8b.f(cobrandsWidgetItemsProvider, cobrandsProductAvailabilityInteractor);
    }

    public static Retrofit h(o gson, Retrofit retrofit) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d i(t60.b extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d j(t60.b extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    public static xe0.e k(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        u5c.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "crypto_exchange_eligibility", mapper, 1, f0.f322471a, 32);
    }

    public static ReferralsInvitationDatabase l(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        txa.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        ReferralsInvitationDatabase referralsInvitationDatabase = (ReferralsInvitationDatabase) ReferralsInvitationDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[0], databaseEncryptionMigratorFactory);
        s.k(referralsInvitationDatabase);
        return referralsInvitationDatabase;
    }

    public static m m(aah.i factory) {
        x.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.b();
    }

    public static n n(LoanRepaymentAccountModelExtension extension) {
        u75.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static sri.m o(Context context) {
        u15.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m p(Context context) {
        e1.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static she.g q(Context context) {
        u15.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        zfe.g.Companion.getClass();
        return zfe.f.a(context);
    }

    public static t60.g r(ScreenContentRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        return new t60.g(recyclerView);
    }

    public static t60.g s(ScreenContentRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        return new t60.g(recyclerView);
    }

    public static sxa.d t(ReferralsInvitationDatabase database) {
        txa.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        sxa.d dVarG = database.g();
        s.k(dVarG);
        return dVarG;
    }

    public static xe0.e u(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        txa.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "REFERRALS_INVITATION_STORAGE_FILE", mapper, 0, null, 56);
    }

    public static gah.g v(gah.f factory) {
        x.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new gah.g();
    }

    public static xe0.e w(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory, y80.a permissionProvider) {
        u7i.a0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        return xe0.f.f(storageFactory, databaseSessionProvider, "payments_move_money", mapper, 1, null, 48);
    }

    public static xe0.e x(yk0.a databaseSessionProvider, je0.d mapper, xe0.f storageFactory) {
        u8h.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "wealth_disclaimers", mapper, 1, f0.f322471a, 32);
    }

    public static mae.o y(p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        tz2.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.d(uiKitResources, currenciesLocalization);
    }

    public static TradingOrdersService z(e eVar, Retrofit retrofit) {
        TradingOrdersService tradingOrdersService = (TradingOrdersService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TradingOrdersService.class, "create(...)");
        s.k(tradingOrdersService);
        return tradingOrdersService;
    }
}
