package yeg;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f312925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsSortingOption f312926b;

    public b() {
        this(0);
    }

    public static b a(b bVar, Data availableSortingOptions, TravelHotelsSortingOption travelHotelsSortingOption, int i) {
        if ((i & 1) != 0) {
            availableSortingOptions = bVar.f312925a;
        }
        if ((i & 2) != 0) {
            travelHotelsSortingOption = bVar.f312926b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(availableSortingOptions, "availableSortingOptions");
        return new b(availableSortingOptions, travelHotelsSortingOption);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f312925a, bVar.f312925a) && Intrinsics.f(this.f312926b, bVar.f312926b);
    }

    public final int hashCode() {
        int iHashCode = this.f312925a.hashCode() * 31;
        TravelHotelsSortingOption travelHotelsSortingOption = this.f312926b;
        return iHashCode + (travelHotelsSortingOption == null ? 0 : travelHotelsSortingOption.hashCode());
    }

    public b(Data availableSortingOptions, TravelHotelsSortingOption travelHotelsSortingOption) {
        Intrinsics.checkNotNullParameter(availableSortingOptions, "availableSortingOptions");
        this.f312925a = availableSortingOptions;
        this.f312926b = travelHotelsSortingOption;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, false, 7, null), null);
    }
}
