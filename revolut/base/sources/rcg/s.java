package rcg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavoriteProperty;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavorites;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements cli.n {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsFavoritesGridScreenContract$InputData f253266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qcg.c f253267b;

    public s(TravelHotelsFavoritesGridScreenContract$InputData inputData, qcg.c propertyCardMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(propertyCardMapper, "propertyCardMapper");
        this.f253266a = inputData;
        this.f253267b = propertyCardMapper;
    }

    public final List a(HotelsFavorites hotelsFavorites) {
        TravelHotelsFavoritesGridScreenContract$InputData travelHotelsFavoritesGridScreenContract$InputData = this.f253266a;
        if (travelHotelsFavoritesGridScreenContract$InputData.f93932b == null) {
            return hotelsFavorites.f97946a;
        }
        ArrayList arrayList = hotelsFavorites.f97946a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (Intrinsics.f(((HotelsFavoriteProperty) obj2).f97945b, travelHotelsFavoritesGridScreenContract$InputData.f93932b)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = this.f253266a.f93931a;
        HotelsFavorites hotelsFavorites = (HotelsFavorites) domainState.f253255a.getContent();
        return new m((List) iii.c.f(domainState.f253255a, new rbj.g(6), new rbh.j(12), new qbg.j(this, 22)), new h(clause, hotelsFavorites != null ? new TextLocalisedQuantityClause(R$plurals.hotels_stays_section_favourites_by_location_saved_subtitle, Integer.valueOf(((ArrayList) a(hotelsFavorites)).size()), (List) null, (Style) null, 28) : null));
    }
}
