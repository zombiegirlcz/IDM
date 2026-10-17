package ueg;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.search.EmptyLocation;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.property.search.LocationMapBoundaries;
import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import com.revolut.feature_travel_hotels_models.property.search.PropertyType;
import com.revolut.feature_travel_hotels_models.property.search.SimplifiedLocationType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b1 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final weg.n f279367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final weg.i f279368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final weg.g f279369c;
    public final weg.f d;

    public b1(weg.n searchResultsItemMapper, weg.i quickFiltersMapper, weg.g mapStateMapper, weg.f horizontalItemsMapper, weg.q menuItemsMapper) {
        Intrinsics.checkNotNullParameter(searchResultsItemMapper, "searchResultsItemMapper");
        Intrinsics.checkNotNullParameter(quickFiltersMapper, "quickFiltersMapper");
        Intrinsics.checkNotNullParameter(mapStateMapper, "mapStateMapper");
        Intrinsics.checkNotNullParameter(horizontalItemsMapper, "horizontalItemsMapper");
        Intrinsics.checkNotNullParameter(menuItemsMapper, "menuItemsMapper");
        this.f279367a = searchResultsItemMapper;
        this.f279368b = quickFiltersMapper;
        this.f279369c = mapStateMapper;
        this.d = horizontalItemsMapper;
    }

    public static Clause a(LocationData locationData) {
        if (locationData instanceof LocationType) {
            return new TextClause(((LocationType) locationData).d, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        }
        if (locationData instanceof SimplifiedLocationType) {
            return new TextClause(((SimplifiedLocationType) locationData).d, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        }
        if (locationData instanceof PropertyType) {
            return new TextClause(((PropertyType) locationData).f98138c, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        }
        if (locationData instanceof LocationMapBoundaries) {
            return new TextLocalisedClause(R$string.hotels_search_selected_area, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        }
        if (locationData instanceof EmptyLocation) {
            return new TextLocalisedClause(R$string.hotels_stays_smart_search_empty_state_title, null, null, 14);
        }
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x06ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x08ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08fd  */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v25 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r72) {
        /*
            Method dump skipped, instruction units count: 2328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ueg.b1.c(cli.j):cli.o");
    }
}
