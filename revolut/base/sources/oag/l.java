package oag;

import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static String a(c cVar) {
        switch (m.f223632b[cVar.ordinal()]) {
            case 1:
                return "LOCATION_ITEM_ID_SEARCHED";
            case 2:
                return "LOCATION_ITEM_ID_POPULAR";
            case 3:
                return "LOCATION_RECENT_ITEM_ID";
            case 4:
                return "PROPERTIES_SEARCHED_ITEM_ID";
            case 5:
                return "PROPERTIES_RECENT_ITEM_ID";
            case 6:
                return "SMART_SEARCH_RECENT_ITEM_ID";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static int b(HotelsLocation hotelsLocation) {
        switch (m.f223631a[hotelsLocation.f97954b.ordinal()]) {
            case 1:
                return R$string.hotels_search_location_location_type_country_title;
            case 2:
                return R$string.hotels_search_location_location_type_region_title;
            case 3:
                return R$string.hotels_search_location_location_type_city_title;
            case 4:
                return R$string.hotels_search_location_location_type_neighbourhood_title;
            case 5:
                return R$string.hotels_search_location_location_type_airport_title;
            case 6:
                return R$string.hotels_search_location_location_type_place_title;
            case 7:
                return R$string.hotels_search_location_location_type_place_title;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
