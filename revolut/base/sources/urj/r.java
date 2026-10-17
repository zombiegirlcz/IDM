package urj;

import aw0.e1;
import aw0.h1;
import aw0.j1;
import aw0.o9;
import aw0.s6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import ip0.dt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;
import urd.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MoneyClause.Format.Defaults f282350c = new MoneyClause.Format.Defaults(null, null, false, false, 15);
    public static final MoneyClause.Format.Headers d = new MoneyClause.Format.Headers(null, null, null, false, false, 31);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srj.b f282351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mzi.b f282352b;

    public r(srj.b budgetBannerMapper, mzi.b intervalMapper) {
        Intrinsics.checkNotNullParameter(budgetBannerMapper, "budgetBannerMapper");
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        this.f282351a = budgetBannerMapper;
        this.f282352b = intervalMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RowDelegate.Model a(uzi.c cVar, dj0.d dVar, Integer num) {
        int i;
        int i2 = q.f282349b[cVar.ordinal()];
        if (i2 == 1) {
            i = R$string.analytics_banner_spent;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.analytics_banner_spent_weekly;
        }
        return new RowDelegate.Model("SPENDINGS_BANNER_ID", new RowDelegate.Model.MainImage.Image40(b(R$drawable.uikit_icn_24_coins), 0 == true ? 1 : 0, null, false, null, false, 62), new TextLocalisedClause(i, null, null, 14), null, 0, num != null ? new TextLocalisedQuantityClause(R$plurals.analytics_banner_spent_tx, num, (List) null, (Style) null, 28) : null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, f282350c, null, null, 12), null, null, false, 126), num != null, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    public static LayeredImage b(int i) {
        return LayeredImage.Companion.c(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccentNeutral), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f), 8.0f, Float.valueOf(24.0f), 32);
    }

    public static dt d(dj0.d dVar, long j2) {
        return new dt("main_budget", new j1(new h1(new TextLocalisedClause(R$string.analytics_chart_title_left_to_spend, null, null, 14)), new MoneyClause(dVar, d, null, null, 12), new e1(new CompositeClause(v.k(new PercentageClause(0.0d, (PercentageClause.Format) null, (Custom) null, 6), new TextLocalisedQuantityClause(R$plurals.analytics_budgeting_overview_days_left, Long.valueOf(j2), u.c(new TextClause(String.valueOf(j2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), (Style) null, 24)), new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12))), new s6(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, false, 376), null, null, null, 1016);
    }

    public static o e(qzi.g gVar) {
        int i = q.f282348a[gVar.ordinal()];
        if (i == 1) {
            return new o(R$string.analytics_budgeting_overview_on_track, R$drawable.uikit_icn_16_check_circle, R$attr.uikit_colorPerformancePositive);
        }
        if (i == 2) {
            return new o(R$string.analytics_budgeting_overview_not_on_track, R$drawable.uikit_icn_24_exclamation_triangle, R$attr.uikit_colorOrange);
        }
        if (i == 3) {
            return new o(R$string.analytics_budgeting_overview_overspent, R$drawable.uikit_icn_16_exclamation_mark, R$attr.uikit_colorPerformanceNegative);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(domainState.f282313a, new y(this, 4), new up5.k(24), new w(this, 12));
    }
}
