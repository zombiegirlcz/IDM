package com.revolut.feature.travel.flights.models.domain.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/common/FlightTechnicalStop;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightTechnicalStop implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightTechnicalStop> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f93495c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlightTechnicalStop(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightTechnicalStop[i];
        }
    }

    public FlightTechnicalStop(Integer num, String iataCode, String str, String str2) {
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        this.f93493a = iataCode;
        this.f93494b = str;
        this.f93495c = num;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightTechnicalStop)) {
            return false;
        }
        FlightTechnicalStop flightTechnicalStop = (FlightTechnicalStop) obj2;
        return Intrinsics.f(this.f93493a, flightTechnicalStop.f93493a) && Intrinsics.f(this.f93494b, flightTechnicalStop.f93494b) && Intrinsics.f(this.f93495c, flightTechnicalStop.f93495c) && Intrinsics.f(this.d, flightTechnicalStop.d);
    }

    public final int hashCode() {
        int iHashCode = this.f93493a.hashCode() * 31;
        String str = this.f93494b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f93495c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93493a);
        dest.writeString(this.f93494b);
        Integer num = this.f93495c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.d);
    }
}
