package com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/flow/flight_search_results/TravelMilesFlightSearchResultsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SearchResults", "FlightDetails", "Lcom/revolut/feature/travel/miles/impl/ui/flow/flight_search_results/TravelMilesFlightSearchResultsFlowContract$Step$FlightDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/flight_search_results/TravelMilesFlightSearchResultsFlowContract$Step$SearchResults;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesFlightSearchResultsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/flight_search_results/TravelMilesFlightSearchResultsFlowContract$Step$FlightDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/flight_search_results/TravelMilesFlightSearchResultsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FlightDetails extends TravelMilesFlightSearchResultsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FlightDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94218c;
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
                return new FlightDetails(string, string2, linkedHashSet, string3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlightDetails[i];
            }
        }

        public FlightDetails(String flightId, String str, Set selectedCabinClasses, String str2) {
            Intrinsics.checkNotNullParameter(flightId, "flightId");
            Intrinsics.checkNotNullParameter(selectedCabinClasses, "selectedCabinClasses");
            this.f94216a = flightId;
            this.f94217b = str;
            this.f94218c = str2;
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
            if (!(obj2 instanceof FlightDetails)) {
                return false;
            }
            FlightDetails flightDetails = (FlightDetails) obj2;
            return Intrinsics.f(this.f94216a, flightDetails.f94216a) && Intrinsics.f(this.f94217b, flightDetails.f94217b) && Intrinsics.f(this.f94218c, flightDetails.f94218c) && Intrinsics.f(this.d, flightDetails.d);
        }

        public final int hashCode() {
            int iHashCode = this.f94216a.hashCode() * 31;
            String str = this.f94217b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f94218c;
            return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94216a);
            dest.writeString(this.f94217b);
            dest.writeString(this.f94218c);
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/flight_search_results/TravelMilesFlightSearchResultsFlowContract$Step$SearchResults;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/flight_search_results/TravelMilesFlightSearchResultsFlowContract$Step;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SearchResults extends TravelMilesFlightSearchResultsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SearchResults f94219a = new SearchResults();

        @NotNull
        public static final Parcelable.Creator<SearchResults> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SearchResults.f94219a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchResults[i];
            }
        }

        private SearchResults() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private TravelMilesFlightSearchResultsFlowContract$Step() {
    }
}
