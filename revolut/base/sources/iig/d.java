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
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
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
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final ArrayList a(TravelMilesProvider milesProvider, int i, int i2) {
        Intrinsics.checkNotNullParameter(milesProvider, "milesProvider");
        TravelMilesAccount travelMilesAccount = milesProvider.f;
        return yp0.b.g(travelMilesAccount != null ? u.c(new RowDelegate.Model("RECOMMENDED_FLIGHT_ACCOUNT_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new UrlImage(milesProvider.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60), new TextLocalisedClause(i2, u.c(new TextClause(milesProvider.f94104b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextClause(travelMilesAccount.f94083b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, new b(travelMilesAccount.f94082a), null, 0, 0, 0, 0, 532676568)) : v.k(new RowDelegate.Model("RECOMMENDED_FLIGHT_ACCOUNT_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.miles_recommended_flights_account_link_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.miles_recommended_flights_account_link_subtitle, u.c(new TextClause(milesProvider.f94104b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new z("RECOMMENDED_FLIGHT_ACCOUNT_ACTIONS_ID", u.c(u.c(new ActionsView.Item("RECOMMENDED_FLIGHT_ACCOUNT_ACTION_ID", null, false, null, null, new TextLocalisedClause(i, null, null, 14), null, null, null, null, false, "LINK_ACCOUNT_ACTION_TAG", null, new iig.a(milesProvider), null, 22430))), null, null, false, false, R$attr.uikit_dp0, 0, R$attr.uikit_dp32, null, 55292)), new ListSubheaderDelegate.Model("RECOMMENDED_FLIGHT_SUB_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_recommended_flights_account_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public final List b() {
        return yp0.b.i(nb0.a(pb0.Companion, "RECOMMENDED_FLIGHT_ACCOUNT_ITEM_ID", false, 6), new ListSubheaderDelegate.Model("RECOMMENDED_FLIGHT_SUB_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_recommended_flights_account_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }
}
