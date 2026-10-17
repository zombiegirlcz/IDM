package com.revolut.feature_travel_hotels_models.location;

import android.os.Parcel;
import android.os.Parcelable;
import ffi.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/location/HotelsLocation;", "Landroid/os/Parcelable;", "Lffi/e;", "", "toString", "()Ljava/lang/String;", "ffi/a", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsLocation implements Parcelable, e {

    @NotNull
    public static final Parcelable.Creator<HotelsLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffi.a f97954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97955c;
    public final String d;
    public final String e;
    public final Country f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f97956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Coordinates f97957h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsLocation(parcel.readString(), ffi.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), Country.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), Coordinates.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsLocation[i];
        }
    }

    public HotelsLocation(String id10, ffi.a type, String name, String description, String str, Country country, Integer num, Coordinates coordinates, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f97953a = id10;
        this.f97954b = type;
        this.f97955c = name;
        this.d = description;
        this.e = str;
        this.f = country;
        this.f97956g = num;
        this.f97957h = coordinates;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsLocation)) {
            return false;
        }
        HotelsLocation hotelsLocation = (HotelsLocation) obj2;
        return Intrinsics.f(this.f97953a, hotelsLocation.f97953a) && this.f97954b == hotelsLocation.f97954b && Intrinsics.f(this.f97955c, hotelsLocation.f97955c) && Intrinsics.f(this.d, hotelsLocation.d) && Intrinsics.f(this.e, hotelsLocation.e) && Intrinsics.f(this.f, hotelsLocation.f) && Intrinsics.f(this.f97956g, hotelsLocation.f97956g) && Intrinsics.f(this.f97957h, hotelsLocation.f97957h) && this.i == hotelsLocation.i;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f97954b.hashCode() + (this.f97953a.hashCode() * 31)) * 31, 31, this.f97955c), 31, this.d);
        String str = this.e;
        int iHashCode = (this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.f97956g;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        return Boolean.hashCode(this.i) + ((this.f97957h.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97953a);
        dest.writeString(this.f97954b.name());
        dest.writeString(this.f97955c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        this.f.writeToParcel(dest, i);
        Integer num = this.f97956g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        this.f97957h.writeToParcel(dest, i);
        dest.writeInt(this.i ? 1 : 0);
    }
}
