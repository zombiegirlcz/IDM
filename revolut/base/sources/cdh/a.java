package cdh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nd.p;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements csh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23240a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23241b;

    public a(p widgetDataProvider) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        this.f23241b = widgetDataProvider;
    }

    @Override // csh.d
    public final Clause a() {
        int i;
        switch (this.f23240a) {
            case 0:
                return ((p) this.f23241b).e();
            case 1:
                return ((o1d.b) this.f23241b).b();
            case 2:
                return ((v1d.j) ((jpc.e) this.f23241b).d).b();
            default:
                int i2 = uh7.d.f280108a[((nh7.d) this.f23241b).ordinal()];
                if (i2 == 1) {
                    i = R$string.wealth_invest_widget_most_traded_widget_title;
                } else if (i2 == 2) {
                    i = com.revolut.feature.instruments.trend.collections.impl.R$string.wealth_invest_widget_popular_starter_header_title;
                } else if (i2 == 3) {
                    i = com.revolut.feature.instruments.trend.collections.impl.R$string.wealth_invest_widget_cfds_pnl_drivers_header_title;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_invest_widget_recommended_buys_header_title;
                }
                return new TextLocalisedClause(i, null, null, 14);
        }
    }

    @Override // csh.d
    public final List c() {
        switch (this.f23240a) {
            case 0:
                return u.c("TopMoversLarge");
            case 1:
                return u.c("AlertsList");
            case 2:
                return u.c("WatchlistItems");
            default:
                return ((nh7.d) this.f23241b).d();
        }
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        int i;
        switch (this.f23240a) {
            case 0:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(com.revolut.feature.crypto_feed.dependencies.R$string.crypto_home_dependencies_widget_catalog_top_movers_subtitle, null, null, 14);
            case 1:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return ((o1d.b) this.f23241b).a();
            case 2:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return ((v1d.j) ((jpc.e) this.f23241b).d).a();
            default:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                int i2 = uh7.d.f280108a[((nh7.d) this.f23241b).ordinal()];
                if (i2 == 1) {
                    i = R$string.wealth_invest_widget_most_traded_header_subtitle;
                } else if (i2 == 2) {
                    i = com.revolut.feature.instruments.trend.collections.impl.R$string.wealth_invest_widget_popular_starter_header_subtitle;
                } else if (i2 == 3) {
                    i = com.revolut.feature.instruments.trend.collections.impl.R$string.wealth_invest_widget_cfds_pnl_drivers_header_subtitle;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_invest_widget_recommended_buys_header_subtitle;
                }
                return new TextLocalisedClause(i, null, null, 14);
        }
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        switch (this.f23240a) {
            case 0:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                return "TopMoversLarge";
            case 1:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                return (String) d0.b0(availableWidgetTypes);
            case 2:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                String str = availableWidgetTypes.contains("WatchlistMedium") ? "WatchlistMedium" : null;
                return str == null ? (String) d0.b0(availableWidgetTypes) : str;
            default:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                return ((nh7.d) this.f23241b).b();
        }
    }

    public a(o1d.b widgetDataProvider) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        this.f23241b = widgetDataProvider;
    }

    public a(jpc.e widgetDataProvider) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        this.f23241b = widgetDataProvider;
    }

    public a(nh7.d widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f23241b = widget;
    }
}
