package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.feature_travel_hotels_models.location.Country;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Coordinates f98039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Country f98040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f98041c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyLocation(Coordinates.CREATOR.createFromParcel(parcel), Country.CREATOR.createFromParcel(parcel), Address.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyLocation[i];
        }
    }

    public HotelsPropertyLocation(Coordinates coordinates, Country country, Address address) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f98039a = coordinates;
        this.f98040b = country;
        this.f98041c = address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyLocation)) {
            return false;
        }
        HotelsPropertyLocation hotelsPropertyLocation = (HotelsPropertyLocation) obj2;
        return Intrinsics.f(this.f98039a, hotelsPropertyLocation.f98039a) && Intrinsics.f(this.f98040b, hotelsPropertyLocation.f98040b) && Intrinsics.f(this.f98041c, hotelsPropertyLocation.f98041c);
    }

    public final int hashCode() {
        return this.f98041c.hashCode() + ((this.f98040b.hashCode() + (this.f98039a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98039a.writeToParcel(dest, i);
        this.f98040b.writeToParcel(dest, i);
        this.f98041c.writeToParcel(dest, i);
    }
}
