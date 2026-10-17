package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceAddress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceAddress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceAddress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92782c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceAddress[i];
        }
    }

    public TravelExperienceAddress(String streetLine1, String streetLine2, String region, String city, String country, String postcode) {
        Intrinsics.checkNotNullParameter(streetLine1, "streetLine1");
        Intrinsics.checkNotNullParameter(streetLine2, "streetLine2");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        this.f92780a = streetLine1;
        this.f92781b = streetLine2;
        this.f92782c = region;
        this.d = city;
        this.e = country;
        this.f = postcode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceAddress)) {
            return false;
        }
        TravelExperienceAddress travelExperienceAddress = (TravelExperienceAddress) obj2;
        return Intrinsics.f(this.f92780a, travelExperienceAddress.f92780a) && Intrinsics.f(this.f92781b, travelExperienceAddress.f92781b) && Intrinsics.f(this.f92782c, travelExperienceAddress.f92782c) && Intrinsics.f(this.d, travelExperienceAddress.d) && Intrinsics.f(this.e, travelExperienceAddress.e) && Intrinsics.f(this.f, travelExperienceAddress.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f92780a.hashCode() * 31, 31, this.f92781b), 31, this.f92782c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92780a);
        dest.writeString(this.f92781b);
        dest.writeString(this.f92782c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
