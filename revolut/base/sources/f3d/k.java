package f3d;

import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import f2i.o;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ash.d f131954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3d.j f131955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f131956c;

    public k(ash.d widgetsCommonEventDispatcher, m3d.j navigationDestinationProvider, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(navigationDestinationProvider, "navigationDestinationProvider");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f131954a = widgetsCommonEventDispatcher;
        this.f131955b = navigationDestinationProvider;
        this.f131956c = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return FavouritesWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, final BaseDraggableWidgetDelegate.a event) {
        final FavouritesWidgetContext widgetContext2 = (FavouritesWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        efm.b hVar = null;
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if (model instanceof LineChartTileWidgetDelegate.Model) {
                Object obj2 = ((LineChartTileWidgetDelegate.Model) model).f55188c.f52656t;
                if (obj2 instanceof WatchlistItem) {
                    hVar = rd0.e.c(this.f131955b.a((WatchlistItem) obj2), p0.f264003c).flatMapCompletable(new o(new f0m.c(this, 7), 8));
                }
            } else if (model instanceof ActionWidgetDelegate.Model) {
                final int i = 0;
                hVar = new pfm.h(new kfm.a(this) { // from class: f3d.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k f131952b;

                    {
                        this.f131952b = this;
                    }

                    @Override // kfm.a
                    public final void run() {
                        switch (i) {
                            case 0:
                                a0 a0Var = this.f131952b.f131956c;
                                dsh.o widgetIdAndContext = new dsh.o(widgetContext2, ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55374b);
                                Intrinsics.checkNotNullParameter(widgetIdAndContext, "widgetIdAndContext");
                                a0Var.f168254c.k(widgetIdAndContext);
                                break;
                            default:
                                this.f131952b.f131956c.a(new dsh.o(widgetContext2, ((q0) event).f55476b));
                                break;
                        }
                    }
                }, 2);
            }
        } else if (event instanceof q0) {
            final int i2 = 1;
            hVar = new pfm.h(new kfm.a(this) { // from class: f3d.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f131952b;

                {
                    this.f131952b = this;
                }

                @Override // kfm.a
                public final void run() {
                    switch (i2) {
                        case 0:
                            a0 a0Var = this.f131952b.f131956c;
                            dsh.o widgetIdAndContext = new dsh.o(widgetContext2, ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55374b);
                            Intrinsics.checkNotNullParameter(widgetIdAndContext, "widgetIdAndContext");
                            a0Var.f168254c.k(widgetIdAndContext);
                            break;
                        default:
                            this.f131952b.f131956c.a(new dsh.o(widgetContext2, ((q0) event).f55476b));
                            break;
                    }
                }
            }, 2);
        }
        if (hVar != null) {
            return hVar;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
