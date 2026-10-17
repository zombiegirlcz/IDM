package rhg;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import ip0.iq;
import ip0.qd0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements cli.n {

    @NotNull
    public static final r Companion = new r();

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("CABIN_SECTION_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_search_filters_cabin_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static ListSubheaderDelegate.Model b(int i, int i2, int i3, String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new CompositeClause(zhm.v.k(new TextLocalisedClause(i, null, null, 14), i2 == 0 ? new TextClause(String.valueOf(i3), (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122) : new TextLocalisedClause(R$string.miles_search_filters_selected_options_label, zhm.v.k(new TextClause(String.valueOf(i2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(String.valueOf(i3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), new DotDividerClause(Integer.valueOf(R$attr.uikit_colorGreyTone50)), null, null, 12), (ResourceImage) null, false, false, (Clause) (i2 > 0 ? new TextLocalisedClause(R$string.miles_search_filters_reset_cta, null, null, 14) : null), i2 > 0, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
    }

    public static ListSubheaderDelegate.Model d() {
        return new ListSubheaderDelegate.Model("STOPS_SECTION_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_search_filters_number_of_stops_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static TextLocalisedClause e(Clause clause) {
        return new TextLocalisedClause(R$string.miles_search_filters_filter_option_label, zhm.u.c(clause), null, 12);
    }

    public static InputChecklistDelegate.Model f(TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption, String str, boolean z, Object obj2) {
        return new InputChecklistDelegate.Model(str, new TextClause(travelMilesFlightFilters$FilterOption.f94097b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z, false, null, iq.CHECK_BUTTON, null, null, obj2, null, 0, 0, 0, 523992);
    }

    public static MoneyClause g(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
    }

    public static NumberClause h(double d) {
        return nub.a.h(d, new nub.c(new NumberClause.Format.Compact(true)), o9.NON_SENSITIVE, 1);
    }

    public static SelectableDelegate.Model i(TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption, String str, String str2, boolean z, Object obj2) {
        qd0 qd0Var = z ? qd0.SELECTED : qd0.UNSELECTED;
        TextClause textClause = new TextClause(travelMilesFlightFilters$FilterOption.f94097b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str3 = travelMilesFlightFilters$FilterOption.f94098c;
        TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str4 = travelMilesFlightFilters$FilterOption.d;
        return new SelectableDelegate.Model(str, new RowDelegate.Model(str2, str4 != null ? new RowDelegate.Model.MainImage.Image40(new UrlImage(str4, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60) : null, textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), qd0Var, null, null, false, null, obj2, null, false, 32504);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f254452a, new rg3.d(this, 18), new rd3.k(29), new qbg.j(this, domainState, 28));
        Data data = domainState.f254452a;
        hfg.j jVar2 = (hfg.j) data.getContent();
        TravelMilesSearchAppliedFilters appliedFilters = domainState.f254453b;
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        TextNavBarMenuItem textNavBarMenuItem = new TextNavBarMenuItem("RESET_MENU_ITEM_ID", new TextLocalisedClause(R$string.miles_search_filters_reset_cta, null, null, 14), null, null, 12);
        if (jVar2 == null || !ce9.m.i(jVar2, appliedFilters)) {
            textNavBarMenuItem = null;
        }
        return new m(list, data.getContent() != null, zhm.v.l(textNavBarMenuItem));
    }
}
