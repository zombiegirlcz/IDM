package iig;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import ip0.nb0;
import ip0.pb0;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    public m(agg.d travelMilesFormatter) {
        Intrinsics.checkNotNullParameter(travelMilesFormatter, "travelMilesFormatter");
    }

    public final ArrayList a(TravelMilesProvider milesProvider) {
        Intrinsics.checkNotNullParameter(milesProvider, "milesProvider");
        TravelMilesRate travelMilesRate = milesProvider.f94106g;
        RowDelegate.Model model = travelMilesRate != null ? new RowDelegate.Model("ENOUGH_MILES_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points_mono, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.miles_recommended_flights_how_to_book_enough_miles_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.miles_recommended_flights_how_to_book_enough_miles_subtitle, v.k(new TextClause(milesProvider.f94104b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), agg.d.c(travelMilesRate)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824) : null;
        TravelMilesAccount travelMilesAccount = milesProvider.f;
        Object[] elements = {model, travelMilesAccount != null ? new z("TRANSFER_POINTS_ACTIONS_ID", u.c(u.c(new ActionsView.Item("TRANSFER_POINTS_ACTION_ID", null, false, null, null, new TextLocalisedClause(R$string.miles_recommended_flights_how_to_book_transfer_points, null, null, 14), null, null, null, null, false, null, null, new j(travelMilesAccount.f94082a), null, 24478))), null, null, false, false, R$attr.uikit_dp0, 0, R$attr.uikit_dp32, null, 55292) : null, new RowDelegate.Model("BOOK_ON_WEBSITE_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_travel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.miles_recommended_flights_how_to_book_airline_website_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.miles_recommended_flights_how_to_book_airline_website_subtitle, u.c(new TextClause(milesProvider.f94104b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("HOW_TO_BOOK_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_recommended_flights_how_to_book_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public final ArrayList b() {
        nb0 nb0Var = pb0.Companion;
        return yp0.b.g(v.k(nb0.a(nb0Var, "ENOUGH_MILES_ITEM_ID", false, 6), nb0.a(nb0Var, "BOOK_ON_WEBSITE_ITEM_ID", false, 6)), new ListSubheaderDelegate.Model("HOW_TO_BOOK_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_recommended_flights_how_to_book_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }
}
