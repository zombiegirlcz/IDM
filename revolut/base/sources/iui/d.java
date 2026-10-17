package iui;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import gui.k;
import k7i.i;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvi.b f168621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f168622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f168623c;

    public d(jvi.b airportItemsMapper, i countryNameProvider, e dateProvider, k revPointsMenuItemMapper) {
        Intrinsics.checkNotNullParameter(airportItemsMapper, "airportItemsMapper");
        Intrinsics.checkNotNullParameter(countryNameProvider, "countryNameProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(revPointsMenuItemMapper, "revPointsMenuItemMapper");
        this.f168621a = airportItemsMapper;
        this.f168622b = countryNameProvider;
        this.f168623c = dateProvider;
    }

    public static ListSubheaderDelegate.Model a(int i) {
        return new ListSubheaderDelegate.Model("item_id_header_active_passes", (Image) null, (Clause) new TextLocalisedClause(R$string.asft_home_section_passes_count, u.c(Integer.valueOf(i)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("item_id_header_nearby_airports", (Image) null, (Clause) new TextLocalisedClause(R$string.asft_home_section_nearby_airports_header, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.asft_home_section_nearby_airports_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
    }
}
