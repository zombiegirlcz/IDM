package ocg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsFavoritesGridScreenContract$InputData f224237a;

    public h(TravelHotelsFavoritesGridScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f224237a = input;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f224237a, ((h) obj2).f224237a);
    }

    public final int hashCode() {
        return this.f224237a.hashCode();
    }
}
