package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperiencePickupLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "myf/w", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencePickupLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencePickupLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f92838b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencePickupLocation(parcel.readString(), w.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencePickupLocation[i];
        }
    }

    public TravelExperiencePickupLocation(String locationId, w type) {
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f92837a = locationId;
        this.f92838b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencePickupLocation)) {
            return false;
        }
        TravelExperiencePickupLocation travelExperiencePickupLocation = (TravelExperiencePickupLocation) obj2;
        return Intrinsics.f(this.f92837a, travelExperiencePickupLocation.f92837a) && this.f92838b == travelExperiencePickupLocation.f92838b;
    }

    public final int hashCode() {
        return this.f92838b.hashCode() + (this.f92837a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92837a);
        dest.writeString(this.f92838b.name());
    }
}
