package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/TravelFlightsAirlineLegalReference;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsAirlineLegalReference implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsAirlineLegalReference> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93473c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f93474g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsAirlineLegalReference(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsAirlineLegalReference[i];
        }
    }

    public TravelFlightsAirlineLegalReference(String carrierCode, String carrierName, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(carrierCode, "carrierCode");
        Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        this.f93471a = carrierCode;
        this.f93472b = carrierName;
        this.f93473c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f93474g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsAirlineLegalReference)) {
            return false;
        }
        TravelFlightsAirlineLegalReference travelFlightsAirlineLegalReference = (TravelFlightsAirlineLegalReference) obj2;
        return Intrinsics.f(this.f93471a, travelFlightsAirlineLegalReference.f93471a) && Intrinsics.f(this.f93472b, travelFlightsAirlineLegalReference.f93472b) && Intrinsics.f(this.f93473c, travelFlightsAirlineLegalReference.f93473c) && Intrinsics.f(this.d, travelFlightsAirlineLegalReference.d) && Intrinsics.f(this.e, travelFlightsAirlineLegalReference.e) && Intrinsics.f(this.f, travelFlightsAirlineLegalReference.f) && Intrinsics.f(this.f93474g, travelFlightsAirlineLegalReference.f93474g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f93471a.hashCode() * 31, 31, this.f93472b);
        String str = this.f93473c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f93474g;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93471a);
        dest.writeString(this.f93472b);
        dest.writeString(this.f93473c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f93474g);
    }
}
