package com.revolut.retail.feature.airportlounges.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/AirportLoungesUnlimitedCountryProfile;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungesUnlimitedCountryProfile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesUnlimitedCountryProfile> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98930b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungesUnlimitedCountryProfile(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesUnlimitedCountryProfile[i];
        }
    }

    public AirportLoungesUnlimitedCountryProfile(String country, String planName) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(planName, "planName");
        this.f98929a = country;
        this.f98930b = planName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungesUnlimitedCountryProfile)) {
            return false;
        }
        AirportLoungesUnlimitedCountryProfile airportLoungesUnlimitedCountryProfile = (AirportLoungesUnlimitedCountryProfile) obj2;
        return Intrinsics.f(this.f98929a, airportLoungesUnlimitedCountryProfile.f98929a) && Intrinsics.f(this.f98930b, airportLoungesUnlimitedCountryProfile.f98930b);
    }

    public final int hashCode() {
        return this.f98930b.hashCode() + (this.f98929a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98929a);
        dest.writeString(this.f98930b);
    }
}
