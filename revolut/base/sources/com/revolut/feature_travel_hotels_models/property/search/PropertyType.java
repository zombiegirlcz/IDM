package com.revolut.feature_travel_hotels_models.property.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/search/PropertyType;", "Lcom/revolut/feature_travel_hotels_models/property/search/LocationData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PropertyType extends LocationData {

    @NotNull
    public static final Parcelable.Creator<PropertyType> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98138c;
    public final Coordinates d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PropertyType(parcel.readString(), parcel.readString(), Coordinates.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PropertyType[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyType(String id10, String name, Coordinates coordinates) {
        super(name);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f98137b = id10;
        this.f98138c = name;
        this.d = coordinates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PropertyType)) {
            return false;
        }
        PropertyType propertyType = (PropertyType) obj2;
        return Intrinsics.f(this.f98137b, propertyType.f98137b) && Intrinsics.f(this.f98138c, propertyType.f98138c) && Intrinsics.f(this.d, propertyType.d);
    }

    @Override // com.revolut.feature_travel_hotels_models.property.search.LocationData
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF98138c() {
        return this.f98138c;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(this.f98137b.hashCode() * 31, 31, this.f98138c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98137b);
        dest.writeString(this.f98138c);
        this.d.writeToParcel(dest, i);
    }
}
