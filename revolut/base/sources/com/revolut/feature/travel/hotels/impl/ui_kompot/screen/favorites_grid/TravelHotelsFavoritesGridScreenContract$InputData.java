package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/favorites_grid/TravelHotelsFavoritesGridScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsFavoritesGridScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsFavoritesGridScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f93931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93932b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsFavoritesGridScreenContract$InputData((Clause) parcel.readParcelable(TravelHotelsFavoritesGridScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsFavoritesGridScreenContract$InputData[i];
        }
    }

    public TravelHotelsFavoritesGridScreenContract$InputData(Clause title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f93931a = title;
        this.f93932b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsFavoritesGridScreenContract$InputData)) {
            return false;
        }
        TravelHotelsFavoritesGridScreenContract$InputData travelHotelsFavoritesGridScreenContract$InputData = (TravelHotelsFavoritesGridScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93931a, travelHotelsFavoritesGridScreenContract$InputData.f93931a) && Intrinsics.f(this.f93932b, travelHotelsFavoritesGridScreenContract$InputData.f93932b);
    }

    public final int hashCode() {
        int iHashCode = this.f93931a.hashCode() * 31;
        String str = this.f93932b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93931a, i);
        dest.writeString(this.f93932b);
    }
}
