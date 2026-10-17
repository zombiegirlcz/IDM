package com.revolut.feature.retail.restaurants.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/LocationInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "GeoLocation", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82806c;
    public final Address d;
    public final String e;
    public final GeoLocation f;

    @NotNull
    public static final Parcelable.Creator<LocationInfo> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/LocationInfo$GeoLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GeoLocation implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f82807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f82808b;

        @NotNull
        public static final Parcelable.Creator<GeoLocation> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GeoLocation(parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GeoLocation[i];
            }
        }

        public GeoLocation(double d, double d5) {
            this.f82807a = d;
            this.f82808b = d5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GeoLocation)) {
                return false;
            }
            GeoLocation geoLocation = (GeoLocation) obj2;
            return Double.compare(this.f82807a, geoLocation.f82807a) == 0 && Double.compare(this.f82808b, geoLocation.f82808b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f82808b) + (Double.hashCode(this.f82807a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f82807a);
            dest.writeDouble(this.f82808b);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocationInfo(parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(LocationInfo.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GeoLocation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocationInfo[i];
        }
    }

    public LocationInfo(String id10, String locationId, String name, Address address, String str, GeoLocation geoLocation) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f82804a = id10;
        this.f82805b = locationId;
        this.f82806c = name;
        this.d = address;
        this.e = str;
        this.f = geoLocation;
    }

    public final ZoneId a() {
        Object objA;
        String str = this.e;
        if (str != null) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = ZoneId.of(str);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            ZoneId zoneId = (ZoneId) objA;
            if (zoneId != null) {
                return zoneId;
            }
        }
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return zoneIdSystemDefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LocationInfo)) {
            return false;
        }
        LocationInfo locationInfo = (LocationInfo) obj2;
        return Intrinsics.f(this.f82804a, locationInfo.f82804a) && Intrinsics.f(this.f82805b, locationInfo.f82805b) && Intrinsics.f(this.f82806c, locationInfo.f82806c) && Intrinsics.f(this.d, locationInfo.d) && Intrinsics.f(this.e, locationInfo.e) && Intrinsics.f(this.f, locationInfo.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f82804a.hashCode() * 31, 31, this.f82805b), 31, this.f82806c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GeoLocation geoLocation = this.f;
        return iHashCode2 + (geoLocation != null ? geoLocation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82804a);
        dest.writeString(this.f82805b);
        dest.writeString(this.f82806c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        GeoLocation geoLocation = this.f;
        if (geoLocation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            geoLocation.writeToParcel(dest, i);
        }
    }
}
