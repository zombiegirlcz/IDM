package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r7g.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/FlightSearchRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightSearchRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightSearchRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchQuery f93580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93582c;
    public final FlightSearchRequestFilters d;
    public final g e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlightSearchRequest(parcel.readInt() == 0 ? null : FlightSearchQuery.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FlightSearchRequestFilters.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? g.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightSearchRequest[i];
        }
    }

    public FlightSearchRequest() {
        this(null, null, null, null, null, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightSearchRequest)) {
            return false;
        }
        FlightSearchRequest flightSearchRequest = (FlightSearchRequest) obj2;
        return Intrinsics.f(this.f93580a, flightSearchRequest.f93580a) && Intrinsics.f(this.f93581b, flightSearchRequest.f93581b) && Intrinsics.f(this.f93582c, flightSearchRequest.f93582c) && Intrinsics.f(this.d, flightSearchRequest.d) && this.e == flightSearchRequest.e;
    }

    public final int hashCode() {
        FlightSearchQuery flightSearchQuery = this.f93580a;
        int iHashCode = (flightSearchQuery == null ? 0 : flightSearchQuery.hashCode()) * 31;
        String str = this.f93581b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93582c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FlightSearchRequestFilters flightSearchRequestFilters = this.d;
        int iHashCode4 = (iHashCode3 + (flightSearchRequestFilters == null ? 0 : flightSearchRequestFilters.hashCode())) * 31;
        g gVar = this.e;
        return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        FlightSearchQuery flightSearchQuery = this.f93580a;
        if (flightSearchQuery == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flightSearchQuery.writeToParcel(dest, i);
        }
        dest.writeString(this.f93581b);
        dest.writeString(this.f93582c);
        FlightSearchRequestFilters flightSearchRequestFilters = this.d;
        if (flightSearchRequestFilters == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flightSearchRequestFilters.writeToParcel(dest, i);
        }
        g gVar = this.e;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
    }

    public FlightSearchRequest(FlightSearchQuery flightSearchQuery, String str, String str2, FlightSearchRequestFilters flightSearchRequestFilters, g gVar) {
        this.f93580a = flightSearchQuery;
        this.f93581b = str;
        this.f93582c = str2;
        this.d = flightSearchRequestFilters;
        this.e = gVar;
    }

    public /* synthetic */ FlightSearchRequest(FlightSearchQuery flightSearchQuery, String str, String str2, FlightSearchRequestFilters flightSearchRequestFilters, g gVar, int i) {
        this((i & 1) != 0 ? null : flightSearchQuery, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : flightSearchRequestFilters, (i & 16) != 0 ? null : gVar);
    }
}
