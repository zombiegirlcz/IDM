package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/api/model/TravelMilesSearchFlightDetails$NextConnection", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesSearchFlightDetails$NextConnection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesSearchFlightDetails$NextConnection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f94137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94138b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesSearchFlightDetails$NextConnection(parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesSearchFlightDetails$NextConnection[i];
        }
    }

    public TravelMilesSearchFlightDetails$NextConnection(boolean z, int i) {
        this.f94137a = z;
        this.f94138b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesSearchFlightDetails$NextConnection)) {
            return false;
        }
        TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = (TravelMilesSearchFlightDetails$NextConnection) obj2;
        return this.f94137a == travelMilesSearchFlightDetails$NextConnection.f94137a && this.f94138b == travelMilesSearchFlightDetails$NextConnection.f94138b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94138b) + (Boolean.hashCode(this.f94137a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f94137a ? 1 : 0);
        dest.writeInt(this.f94138b);
    }
}
