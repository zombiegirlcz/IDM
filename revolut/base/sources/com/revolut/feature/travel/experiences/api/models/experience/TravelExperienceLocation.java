package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceAddress f92828c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceLocation(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TravelExperienceAddress.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceLocation[i];
        }
    }

    public TravelExperienceLocation(String id10, String name, TravelExperienceAddress travelExperienceAddress) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f92826a = id10;
        this.f92827b = name;
        this.f92828c = travelExperienceAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceLocation)) {
            return false;
        }
        TravelExperienceLocation travelExperienceLocation = (TravelExperienceLocation) obj2;
        return Intrinsics.f(this.f92826a, travelExperienceLocation.f92826a) && Intrinsics.f(this.f92827b, travelExperienceLocation.f92827b) && Intrinsics.f(this.f92828c, travelExperienceLocation.f92828c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f92826a.hashCode() * 31, 31, this.f92827b);
        TravelExperienceAddress travelExperienceAddress = this.f92828c;
        return iC + (travelExperienceAddress == null ? 0 : travelExperienceAddress.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92826a);
        dest.writeString(this.f92827b);
        TravelExperienceAddress travelExperienceAddress = this.f92828c;
        if (travelExperienceAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperienceAddress.writeToParcel(dest, i);
        }
    }
}
