package s3d;

import ahe.y0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.r;
import ihd.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mle.x;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jpc.e f259643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f259644c;
    public final v1d.b d;

    public d(jpc.e widgetDataProvider, xoj.a featuresInteractor, w customisationScreenProvider, ugd.b multipleWatchlistCustomisationScreenProvider, v1d.b configProvider) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(customisationScreenProvider, "customisationScreenProvider");
        Intrinsics.checkNotNullParameter(multipleWatchlistCustomisationScreenProvider, "multipleWatchlistCustomisationScreenProvider");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f259643b = widgetDataProvider;
        this.f259644c = featuresInteractor;
        this.d = configProvider;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int i(String str, dsh.e eVar) {
        switch (str.hashCode()) {
            case -1287666782:
                if (str.equals("WatchlistMedium")) {
                    r.Companion.getClass();
                    return r.a.b(eVar, 2);
                }
                break;
            case -1097160251:
                if (str.equals("WatchlistSymbol")) {
                    return 1;
                }
                break;
            case 647952883:
                if (str.equals("WatchlistItems")) {
                    return r.a.c(r.Companion, eVar);
                }
                break;
            case 650169710:
                if (str.equals("WatchlistLarge")) {
                    r.Companion.getClass();
                    return r.a.b(eVar, 5);
                }
                break;
        }
        throw new IllegalArgumentException(p.a.p("Widget ", str, " type not supported"));
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        int iHashCode = widgetType.hashCode();
        return (iHashCode == -1287666782 ? widgetType.equals("WatchlistMedium") : iHashCode == 647952883 ? widgetType.equals("WatchlistItems") : iHashCode == 650169710 && widgetType.equals("WatchlistLarge")) ? u.c(r.a.a(r.Companion, inputConfig, null, String.valueOf(i(widgetType, inputConfig)), 6)) : f0.f322471a;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(j(str), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return Intrinsics.f(widgetType, "WatchlistSymbol") ? LineChartLoadingTileWidgetDelegate.Model.Companion.b(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, id10) : RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, ((v1d.j) this.f259643b.d).b(), r.a.c(r.Companion, eVar), null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(q.Q(j(str2), new y0(24, this, str2, eVar, str, (Continuation) null)), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        FavouritesWidgetContext widgetContext2 = (FavouritesWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return q.Q(j(widgetType), new y0(24, this, widgetType, config, id10, (Continuation) null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r9.equals("WatchlistMedium") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        r8 = s3d.b.f259639a[r3.a().ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r8 == 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        if (r8 != 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_widget_customisation_screen_title, null, null, 14);
        r10 = r10.a("watchlistID");
        r0 = r3.c().f86890b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "assetTypeKeys");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        return new dsh.j(r8, new dsh.n(new com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector.WidgetSelectorScreen(new com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector.WidgetSelectorScreenContract$InputData(r10, r0)), new s1c.a(27)), com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0110, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r9.equals("WatchlistLarge") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r9.equals("WatchlistItems") == false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dsh.j h(com.revolut.feature.widgets.api.dependencies.WidgetContext r8, java.lang.String r9, dsh.e r10) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3d.d.h(com.revolut.feature.widgets.api.dependencies.WidgetContext, java.lang.String, dsh.e):dsh.j");
    }

    public final x j(String str) {
        yoj.c cVar = yoj.c.FAVOURITES;
        cpj.b bVar = (cpj.b) this.f259644c;
        efm.r rVarDistinctUntilChanged = te0.w.v(bVar.l(cVar), bVar.l(yoj.c.FAVOURITES_HOME_WATCHLIST_WIDGET), new s20.c(9)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return new x(rd0.e.b(rVarDistinctUntilChanged), this, str, 24);
    }
}
