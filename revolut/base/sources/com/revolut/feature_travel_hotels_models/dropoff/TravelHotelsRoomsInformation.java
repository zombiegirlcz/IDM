package com.revolut.feature_travel_hotels_models.dropoff;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/dropoff/TravelHotelsRoomsInformation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsRoomsInformation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsRoomsInformation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97940c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsRoomsInformation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsRoomsInformation[i];
        }
    }

    public TravelHotelsRoomsInformation(String roomId, String bedOptionId, String rateId, String occupancy) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(bedOptionId, "bedOptionId");
        Intrinsics.checkNotNullParameter(rateId, "rateId");
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        this.f97938a = roomId;
        this.f97939b = bedOptionId;
        this.f97940c = rateId;
        this.d = occupancy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsRoomsInformation)) {
            return false;
        }
        TravelHotelsRoomsInformation travelHotelsRoomsInformation = (TravelHotelsRoomsInformation) obj2;
        return Intrinsics.f(this.f97938a, travelHotelsRoomsInformation.f97938a) && Intrinsics.f(this.f97939b, travelHotelsRoomsInformation.f97939b) && Intrinsics.f(this.f97940c, travelHotelsRoomsInformation.f97940c) && Intrinsics.f(this.d, travelHotelsRoomsInformation.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f97938a.hashCode() * 31, 31, this.f97939b), 31, this.f97940c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97938a);
        dest.writeString(this.f97939b);
        dest.writeString(this.f97940c);
        dest.writeString(this.d);
    }
}
