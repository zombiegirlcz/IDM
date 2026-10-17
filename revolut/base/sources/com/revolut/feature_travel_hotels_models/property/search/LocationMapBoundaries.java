package com.revolut.feature_travel_hotels_models.property.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/search/LocationMapBoundaries;", "Lcom/revolut/feature_travel_hotels_models/property/search/LocationData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationMapBoundaries extends LocationData {

    @NotNull
    public static final Parcelable.Creator<LocationMapBoundaries> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Coordinates f98132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Coordinates f98133c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<Coordinates> creator = Coordinates.CREATOR;
            return new LocationMapBoundaries(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocationMapBoundaries[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationMapBoundaries(Coordinates neMapBoundariesCoordinates, Coordinates swMapBoundariesCoordinates) {
        super(null);
        Intrinsics.checkNotNullParameter(neMapBoundariesCoordinates, "neMapBoundariesCoordinates");
        Intrinsics.checkNotNullParameter(swMapBoundariesCoordinates, "swMapBoundariesCoordinates");
        this.f98132b = neMapBoundariesCoordinates;
        this.f98133c = swMapBoundariesCoordinates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LocationMapBoundaries)) {
            return false;
        }
        LocationMapBoundaries locationMapBoundaries = (LocationMapBoundaries) obj2;
        return Intrinsics.f(this.f98132b, locationMapBoundaries.f98132b) && Intrinsics.f(this.f98133c, locationMapBoundaries.f98133c);
    }

    public final int hashCode() {
        return this.f98133c.hashCode() + (this.f98132b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98132b.writeToParcel(dest, i);
        this.f98133c.writeToParcel(dest, i);
    }
}
