package h7d;

import android.app.Activity;
import android.view.Window;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.transactions.impl.data.network.RecallableService;
import com.revolut.feature.widgets.impl.network.WidgetService;
import com.revolut.feature_tiles_impl.repository.TilesService;
import com.revolut.kompot.navigable.screen.BaseScreen;
import fe9.h;
import gsh.b0;
import gsh.d0;
import hae.k;
import il8.n;
import ip0.pr;
import jd8.g;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import rp0.g1;
import vc.s;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements e4m.e {
    public static xe0.e A(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "wealth_margin_borrowing_storage", mapper, 1, f0.f322471a, 32);
    }

    public static jd8.b B(g gVar) {
        jd8.b bVar = (jd8.b) gVar.b();
        s.k(bVar);
        return bVar;
    }

    public static il8.b C(n nVar) {
        il8.b bVar = (il8.b) nVar.b();
        s.k(bVar);
        return bVar;
    }

    public static hak.a D(hak.c cVar) {
        hak.a aVar = (hak.a) cVar.b();
        s.k(aVar);
        return aVar;
    }

    public static f1i.d a(a31.a aVar, ede.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10) {
        return new f1i.d(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static fe9.a b(BaseScreen screen, he9.c factory) {
        he9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(new k(screen, 10), new f01.c(screen.m2()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d c(fe9.a extension) {
        he9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        return (yji.d) extension;
    }

    public static yji.n d(h extension) {
        he9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        return extension;
    }

    public static xe0.e e(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "collections", mapper, 1, f0.f322471a, 32);
    }

    public static WidgetService f(Retrofit retrofit) {
        hsh.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(WidgetService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        WidgetService widgetService = (WidgetService) objCreate;
        s.k(widgetService);
        return widgetService;
    }

    public static i01.b g(Activity activity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        return com.bumptech.glide.c.k(activity).e(activity);
    }

    public static xe0.e h(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "display_currency", mapper, 0, null, 56);
    }

    public static ep6.n i(i8d.f factory, j60.a bottomExpandableDialogControllerExtension, g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        ep6.n nVarA = factory.a(bottomExpandableDialogControllerExtension, shotDialogDisplayer, pr.f165860a);
        s.k(nVarA);
        return nVarA;
    }

    public static Retrofit j(Retrofit retrofit, o gson, csh.c networkConfiguration) {
        hsh.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        return j6.a.B(retrofit.newBuilder().baseUrl(networkConfiguration.getHostUrl()), gson, "build(...)");
    }

    public static xe0.e k(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "free_stocks", mapper, 0, null, 56);
    }

    public static com.revolut.core.ui_kit_core.displayers.haptic.b l(Activity context) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "activity");
        xoi.e eVarK = com.bumptech.glide.c.k(context);
        eVarK.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new com.revolut.core.ui_kit_core.displayers.haptic.b(eVarK.f307861c.A());
    }

    public static xe0.e m(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        h98.o.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "JuniorCardRequest", mapper, 5, v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5), new exa.a(4, 5, 5)), 32);
    }

    public static iz0.e n(Activity activity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.bumptech.glide.c.k(activity).getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        return new iz0.e(window);
    }

    public static xe0.e o(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "portfollio_metrics", mapper, 2, u.c(new exa.a(1, 2, 5)), 32);
    }

    public static xe0.e p(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "portfolio_performance", mapper, 0, null, 56);
    }

    public static xe0.e q(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "promotions", mapper, 0, null, 56);
    }

    public static hz0.e r(Activity activity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.bumptech.glide.c.k(activity).getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        return new hz0.e(window);
    }

    public static RecallableService s(Retrofit retrofit) {
        hjf.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(RecallableService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RecallableService recallableService = (RecallableService) objCreate;
        s.k(recallableService);
        return recallableService;
    }

    public static xe0.e t(TabAccountsMode mode, yk0.a databaseSessionProvider, je0.d mapper, xe0.f storageFactory) {
        hhe.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, mode.J1(), mapper, 6, v.k(new fge.a(), new fge.b(), new fge.c(), new fge.d(), new fge.e()), 32);
    }

    public static xe0.e u(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        hjf.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "transaction_recallable_storage", mapper, 0, null, 56);
    }

    public static xe0.e v(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        hsh.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "widgets_cache", mapper, 3, v.k(new b0(), new d0()), 32);
    }

    public static TilesService w(hei.b bVar, Retrofit retrofit) {
        TilesService tilesService = (TilesService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TilesService.class, "create(...)");
        s.k(tilesService);
        return tilesService;
    }

    public static xx4.d x(ne0.d hashMapCache) {
        hm4.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
        return new xx4.d(hashMapCache);
    }

    public static xx4.e y(ue0.c storage) {
        hm4.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xx4.e(storage);
    }

    public static xe0.e z(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        h8h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "wealth_margin_borrowing_interest_storage", mapper, 1, f0.f322471a, 32);
    }
}
