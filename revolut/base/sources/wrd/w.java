package wrd;

import aw0.c7;
import aw0.ka;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f299573a;

    public w(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f299573a = dateProvider;
    }

    public static RowDelegate.Model a(ValueHistoryEntry valueHistoryEntry, boolean z, g gVar, boolean z3) {
        int i;
        LocalDate localDate = valueHistoryEntry.f99233a;
        vzi.i iVar = valueHistoryEntry.f99235c;
        if (z) {
            i = R$drawable.uikit_icn_24_minus_circle;
        } else {
            int i2 = u.f299572a[iVar.ordinal()];
            if (i2 == 1) {
                i = R$drawable.uikit_icn_24_market_order;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_bar_chart;
            }
        }
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(z ? R$attr.uikit_colorRed : R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, false, 4);
        tf tfVar = z ? null : new tf(new yy0.h(new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_history_edit, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246)));
        String string = localDate.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        MoneyClause moneyClause = new MoneyClause(valueHistoryEntry.f99234b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        Clause textLocalisedClause = z3 ? new TextLocalisedClause(R$string.analytics_dashboard_period_today, null, null, 14) : com.revolut.core.ui_kit.models.j.b(c7.Companion, localDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT));
        return new RowDelegate.Model(string, image24, moneyClause, null, 0, iVar == vzi.i.SMART_ESTIMATION ? new CompositeClause(zhm.v.k(textLocalisedClause, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_estimated_value, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12) : textLocalisedClause, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 532673496);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r43) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wrd.w.c(cli.j):cli.o");
    }
}
