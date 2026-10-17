package com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "RecommendedFlights", "FlightSearchResultDetails", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$InputData$FlightSearchResultDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$InputData$RecommendedFlights;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesRecommendedFlightsFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$InputData$FlightSearchResultDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FlightSearchResultDetails extends TravelMilesRecommendedFlightsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<FlightSearchResultDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94228c;
        public final Set d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new FlightSearchResultDetails(string, string2, linkedHashSet, string3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlightSearchResultDetails[i];
            }
        }

        public FlightSearchResultDetails(String flightId, String str, Set selectedCabinClasses, String str2) {
            Intrinsics.checkNotNullParameter(flightId, "flightId");
            Intrinsics.checkNotNullParameter(selectedCabinClasses, "selectedCabinClasses");
            this.f94226a = flightId;
            this.f94227b = str;
            this.f94228c = str2;
            this.d = selectedCabinClasses;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FlightSearchResultDetails)) {
                return false;
            }
            FlightSearchResultDetails flightSearchResultDetails = (FlightSearchResultDetails) obj2;
            return Intrinsics.f(this.f94226a, flightSearchResultDetails.f94226a) && Intrinsics.f(this.f94227b, flightSearchResultDetails.f94227b) && Intrinsics.f(this.f94228c, flightSearchResultDetails.f94228c) && Intrinsics.f(this.d, flightSearchResultDetails.d);
        }

        public final int hashCode() {
            int iHashCode = this.f94226a.hashCode() * 31;
            String str = this.f94227b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f94228c;
            return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94226a);
            dest.writeString(this.f94227b);
            dest.writeString(this.f94228c);
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$InputData$RecommendedFlights;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecommendedFlights extends TravelMilesRecommendedFlightsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RecommendedFlights> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94231c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecommendedFlights(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecommendedFlights[i];
            }
        }

        public RecommendedFlights(String departureIataCode, String arrivalIataCode, String provider, String str) {
            Intrinsics.checkNotNullParameter(departureIataCode, "departureIataCode");
            Intrinsics.checkNotNullParameter(arrivalIataCode, "arrivalIataCode");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f94229a = departureIataCode;
            this.f94230b = arrivalIataCode;
            this.f94231c = provider;
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
            if (!(obj2 instanceof RecommendedFlights)) {
                return false;
            }
            RecommendedFlights recommendedFlights = (RecommendedFlights) obj2;
            return Intrinsics.f(this.f94229a, recommendedFlights.f94229a) && Intrinsics.f(this.f94230b, recommendedFlights.f94230b) && Intrinsics.f(this.f94231c, recommendedFlights.f94231c) && Intrinsics.f(this.d, recommendedFlights.d);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f94229a.hashCode() * 31, 31, this.f94230b), 31, this.f94231c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94229a);
            dest.writeString(this.f94230b);
            dest.writeString(this.f94231c);
            dest.writeString(this.d);
        }
    }

    private TravelMilesRecommendedFlightsFlowContract$InputData() {
    }
}
