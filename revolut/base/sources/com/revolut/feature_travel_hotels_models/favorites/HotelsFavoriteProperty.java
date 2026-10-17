package com.revolut.feature_travel_hotels_models.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/favorites/HotelsFavoriteProperty;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsFavoriteProperty implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsFavoriteProperty> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsProperty f97944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97945b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsFavoriteProperty(HotelsProperty.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsFavoriteProperty[i];
        }
    }

    public HotelsFavoriteProperty(HotelsProperty property, String str) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f97944a = property;
        this.f97945b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsFavoriteProperty)) {
            return false;
        }
        HotelsFavoriteProperty hotelsFavoriteProperty = (HotelsFavoriteProperty) obj2;
        return Intrinsics.f(this.f97944a, hotelsFavoriteProperty.f97944a) && Intrinsics.f(this.f97945b, hotelsFavoriteProperty.f97945b);
    }

    public final int hashCode() {
        int iHashCode = this.f97944a.hashCode() * 31;
        String str = this.f97945b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97944a.writeToParcel(dest, i);
        dest.writeString(this.f97945b);
    }
}
