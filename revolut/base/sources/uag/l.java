package uag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsFavoritesGridScreenContract$InputData f278645a;

    public l(TravelHotelsFavoritesGridScreenContract$InputData favoritesInputData) {
        Intrinsics.checkNotNullParameter(favoritesInputData, "favoritesInputData");
        this.f278645a = favoritesInputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f278645a, ((l) obj2).f278645a);
    }

    public final int hashCode() {
        return this.f278645a.hashCode();
    }
}
