package tcg;

import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements a {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f269784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f269785b;

    public e0(gte.a featureToggleInteractor, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f269784a = countryInteractor;
        this.f269785b = featureToggleInteractor;
    }

    public static int a(HotelsLocation hotelsLocation) {
        switch (d0.f269783a[hotelsLocation.f97954b.ordinal()]) {
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
