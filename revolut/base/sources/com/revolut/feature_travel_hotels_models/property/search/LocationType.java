package com.revolut.feature_travel_hotels_models.property.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/search/LocationType;", "Lcom/revolut/feature_travel_hotels_models/property/search/LocationData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationType extends LocationData {

    @NotNull
    public static final Parcelable.Creator<LocationType> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffi.a f98135c;
    public final String d;
    public final String e;
    public final Coordinates f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f98136g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocationType(parcel.readString(), ffi.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Coordinates.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocationType[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationType(String id10, ffi.a type, String name, String description, Coordinates coordinates, String countryCode) {
        super(name);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f98134b = id10;
        this.f98135c = type;
        this.d = name;
        this.e = description;
        this.f = coordinates;
        this.f98136g = countryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LocationType)) {
            return false;
        }
        LocationType locationType = (LocationType) obj2;
        return Intrinsics.f(this.f98134b, locationType.f98134b) && this.f98135c == locationType.f98135c && Intrinsics.f(this.d, locationType.d) && Intrinsics.f(this.e, locationType.e) && Intrinsics.f(this.f, locationType.f) && Intrinsics.f(this.f98136g, locationType.f98136g);
    }

    @Override // com.revolut.feature_travel_hotels_models.property.search.LocationData
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        return this.f98136g.hashCode() + ((this.f.hashCode() + p.a.c(p.a.c((this.f98135c.hashCode() + (this.f98134b.hashCode() * 31)) * 31, 31, this.d), 31, this.e)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98134b);
        dest.writeString(this.f98135c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f98136g);
    }
}
