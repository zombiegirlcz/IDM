package com.revolut.feature.location.api.domain.models.location;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/location/api/domain/models/location/LocationDomain;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_location_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationDomain implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocationDomain> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f78066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f78067b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocationDomain(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocationDomain[i];
        }
    }

    public LocationDomain(double d, double d5) {
        this.f78066a = d;
        this.f78067b = d5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getF78066a() {
        return this.f78066a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getF78067b() {
        return this.f78067b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LocationDomain)) {
            return false;
        }
        LocationDomain locationDomain = (LocationDomain) obj2;
        return Double.compare(this.f78066a, locationDomain.f78066a) == 0 && Double.compare(this.f78067b, locationDomain.f78067b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f78067b) + (Double.hashCode(this.f78066a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f78066a);
        dest.writeDouble(this.f78067b);
    }
}
