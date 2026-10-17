package s3d;

import aii.u;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.j3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.separate_favourites.api.combined_watchlist.CombinedWatchlistAddAssetFeatureConfig;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import l3d.r;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f259652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1d.b f259653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ash.d f259654c;
    public final m3d.j d;
    public final boolean e;
    public final csh.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f259655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f259656h;

    public k(a0 widgetsUiInteractor, v1d.b configProvider, ash.d widgetsCommonEventDispatcher, m3d.j navigationProvider, boolean z, csh.f fVar, h0 singleWatchlistInteractor, r multipleWatchlistInteractor) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(singleWatchlistInteractor, "singleWatchlistInteractor");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        this.f259652a = widgetsUiInteractor;
        this.f259653b = configProvider;
        this.f259654c = widgetsCommonEventDispatcher;
        this.d = navigationProvider;
        this.e = z;
        this.f = fVar;
        this.f259655g = singleWatchlistInteractor;
        this.f259656h = multipleWatchlistInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pfm.h b(com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a r5) {
        /*
            r4 = this;
            v1d.b r0 = r4.f259653b
            v1d.a r1 = r0.a()
            int[] r2 = s3d.h.f259649a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L74
            r2 = 2
            if (r1 != r2) goto L6e
            boolean r1 = r5 instanceof com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.b
            r2 = 0
            if (r1 == 0) goto L1d
            r1 = r5
            com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate$b r1 = (com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.b) r1
            goto L1e
        L1d:
            r1 = r2
        L1e:
            boolean r3 = r1 instanceof com.revolut.core.ui_kit.delegates.widgets.g3
            if (r3 == 0) goto L33
            com.revolut.core.ui_kit.delegates.widgets.g3 r1 = (com.revolut.core.ui_kit.delegates.widgets.g3) r1
            java.lang.Object r1 = r1.f55360c
            boolean r3 = r1 instanceof s3d.e
            if (r3 == 0) goto L2d
            s3d.e r1 = (s3d.e) r1
            goto L2e
        L2d:
            r1 = r2
        L2e:
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.f259645a
            goto L34
        L33:
            r1 = r2
        L34:
            if (r1 != 0) goto L5f
            boolean r1 = r5 instanceof com.revolut.core.ui_kit.delegates.widgets.i
            if (r1 == 0) goto L3d
            com.revolut.core.ui_kit.delegates.widgets.i r5 = (com.revolut.core.ui_kit.delegates.widgets.i) r5
            goto L3e
        L3d:
            r5 = r2
        L3e:
            if (r5 == 0) goto L43
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r5 = r5.f55375c
            goto L44
        L43:
            r5 = r2
        L44:
            boolean r1 = r5 instanceof com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model
            if (r1 == 0) goto L4b
            com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate$Model r5 = (com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model) r5
            goto L4c
        L4b:
            r5 = r2
        L4c:
            if (r5 == 0) goto L60
            java.lang.Object r5 = r5.f55231n
            if (r5 == 0) goto L60
            boolean r1 = r5 instanceof s3d.e
            if (r1 == 0) goto L59
            s3d.e r5 = (s3d.e) r5
            goto L5a
        L59:
            r5 = r2
        L5a:
            if (r5 == 0) goto L60
            java.lang.String r2 = r5.f259645a
            goto L60
        L5f:
            r2 = r1
        L60:
            com.revolut.feature.shared_separate_favourites.multiple_watchlists.declaration.MultipleWatchlistsDestination r5 = new com.revolut.feature.shared_separate_favourites.multiple_watchlists.declaration.MultipleWatchlistsDestination
            com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext r0 = r0.c()
            r5.<init>(r0, r2)
            pfm.h r5 = r4.c(r5)
            return r5
        L6e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L74:
            com.revolut.feature.separate_favourites.api.combined_watchlist.CombinedWatchlistFeatureConfig r5 = new com.revolut.feature.separate_favourites.api.combined_watchlist.CombinedWatchlistFeatureConfig
            com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext r0 = r0.c()
            r5.<init>(r0)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.c(r5)
            pfm.h r5 = r4.c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s3d.k.b(com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$a):pfm.h");
    }

    public final pfm.h c(u uVar) {
        pfm.h hVar = new pfm.h(new rzc.b(this, uVar, 4), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // csh.f
    public final Class j() {
        return FavouritesWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        FavouritesWidgetContext widgetContext2 = (FavouritesWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i3;
        m3d.j jVar = this.d;
        v1d.b bVar = this.f259653b;
        efm.b bVarW = null;
        if (z) {
            RowDelegate.Model model = ((i3) event).f55382c;
            if (Intrinsics.f(model.f53228a, "WATCHLIST_WIDGET_EMPTY_STATE")) {
                bVarW = c(u0.c(new CombinedWatchlistAddAssetFeatureConfig(bVar.c())));
            } else {
                Object obj2 = model.u;
                if (obj2 instanceof ifd.g) {
                    bVarW = rd0.e.c(jVar.a(((ifd.g) obj2).a()), kotlin.coroutines.g.f186406a).flatMapCompletable(new s08.g(29, new ryd.i(this, 22)));
                }
            }
        } else if (event instanceof q0) {
            bVarW = new pfm.h(new r2d.e(this, 4, event, widgetContext2), 2);
        } else if (event instanceof g3) {
            bVarW = b(event);
        } else if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            BaseDraggableWidgetDelegate.Model model2 = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if (model2 instanceof LineChartTileWidgetDelegate.Model) {
                Object obj3 = ((LineChartTileWidgetDelegate.Model) model2).f55188c.f52656t;
                if (obj3 instanceof WatchlistItem) {
                    bVarW = rd0.e.c(jVar.a((WatchlistItem) obj3), kotlin.coroutines.g.f186406a).flatMapCompletable(new s08.g(29, new ryd.i(this, 22)));
                }
            } else if (model2 instanceof ActionWidgetDelegate.Model) {
                bVarW = c(u0.c(new CombinedWatchlistAddAssetFeatureConfig(bVar.c())));
            } else if (!(model2 instanceof ErrorWidgetDelegate.Model)) {
                bVarW = b(event);
            }
        } else if (event instanceof j3) {
            Object obj4 = ((j3) event).f55396c.f54883a.f;
            if (obj4 instanceof g) {
                bVarW = pd.b.n(p0.f264003c, new i(this, obj4, null));
            } else if (obj4 instanceof f) {
                bVarW = pd.b.n(p0.f264003c, new j(this, obj4, null));
            } else {
                csh.f fVar = this.f;
                if (fVar != null) {
                    bVarW = fVar.w(widgetContext2, event);
                }
            }
        }
        if (bVarW != null) {
            return bVarW;
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
