package com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/recommended_flight/TravelMilesRecommendedFlightsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesRecommendedFlightsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelMilesRecommendedFlightsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94380c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesRecommendedFlightsScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesRecommendedFlightsScreenContract$InputData[i];
        }
    }

    public TravelMilesRecommendedFlightsScreenContract$InputData(String departureIataCode, String arrivalIataCode, String provider, String str) {
        Intrinsics.checkNotNullParameter(departureIataCode, "departureIataCode");
        Intrinsics.checkNotNullParameter(arrivalIataCode, "arrivalIataCode");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f94378a = departureIataCode;
        this.f94379b = arrivalIataCode;
        this.f94380c = provider;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesRecommendedFlightsScreenContract$InputData)) {
            return false;
        }
        TravelMilesRecommendedFlightsScreenContract$InputData travelMilesRecommendedFlightsScreenContract$InputData = (TravelMilesRecommendedFlightsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94378a, travelMilesRecommendedFlightsScreenContract$InputData.f94378a) && Intrinsics.f(this.f94379b, travelMilesRecommendedFlightsScreenContract$InputData.f94379b) && Intrinsics.f(this.f94380c, travelMilesRecommendedFlightsScreenContract$InputData.f94380c) && Intrinsics.f(this.d, travelMilesRecommendedFlightsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f94378a.hashCode() * 31, 31, this.f94379b), 31, this.f94380c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94378a);
        dest.writeString(this.f94379b);
        dest.writeString(this.f94380c);
        dest.writeString(this.d);
    }
}
