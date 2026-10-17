package com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
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
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RecommendedFlights", "FlightSearchResultDetails", "AccountRegistration", "TopUp", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step$AccountRegistration;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step$FlightSearchResultDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step$RecommendedFlights;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step$TopUp;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesRecommendedFlightsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step$AccountRegistration;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountRegistration extends TravelMilesRecommendedFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountRegistration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelMilesProvider f94232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94234c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRegistration((TravelMilesProvider) parcel.readParcelable(AccountRegistration.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRegistration[i];
            }
        }

        public AccountRegistration(TravelMilesProvider provider, String str, String str2) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f94232a = provider;
            this.f94233b = str;
            this.f94234c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountRegistration)) {
                return false;
            }
            AccountRegistration accountRegistration = (AccountRegistration) obj2;
            return Intrinsics.f(this.f94232a, accountRegistration.f94232a) && Intrinsics.f(this.f94233b, accountRegistration.f94233b) && Intrinsics.f(this.f94234c, accountRegistration.f94234c);
        }

        public final int hashCode() {
            int iHashCode = this.f94232a.hashCode() * 31;
            String str = this.f94233b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f94234c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94232a, i);
            dest.writeString(this.f94233b);
            dest.writeString(this.f94234c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step$FlightSearchResultDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FlightSearchResultDetails extends TravelMilesRecommendedFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FlightSearchResultDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94237c;
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
            this.f94235a = flightId;
            this.f94236b = str;
            this.f94237c = str2;
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
            return Intrinsics.f(this.f94235a, flightSearchResultDetails.f94235a) && Intrinsics.f(this.f94236b, flightSearchResultDetails.f94236b) && Intrinsics.f(this.f94237c, flightSearchResultDetails.f94237c) && Intrinsics.f(this.d, flightSearchResultDetails.d);
        }

        public final int hashCode() {
            int iHashCode = this.f94235a.hashCode() * 31;
            String str = this.f94236b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f94237c;
            return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94235a);
            dest.writeString(this.f94236b);
            dest.writeString(this.f94237c);
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step$RecommendedFlights;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecommendedFlights extends TravelMilesRecommendedFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RecommendedFlights> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94240c;
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
            this.f94238a = departureIataCode;
            this.f94239b = arrivalIataCode;
            this.f94240c = provider;
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
            return Intrinsics.f(this.f94238a, recommendedFlights.f94238a) && Intrinsics.f(this.f94239b, recommendedFlights.f94239b) && Intrinsics.f(this.f94240c, recommendedFlights.f94240c) && Intrinsics.f(this.d, recommendedFlights.d);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f94238a.hashCode() * 31, 31, this.f94239b), 31, this.f94240c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94238a);
            dest.writeString(this.f94239b);
            dest.writeString(this.f94240c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step$TopUp;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/recommended_flights/TravelMilesRecommendedFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUp extends TravelMilesRecommendedFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94242b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUp(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUp[i];
            }
        }

        public TopUp(String accountId, String str) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f94241a = accountId;
            this.f94242b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUp)) {
                return false;
            }
            TopUp topUp = (TopUp) obj2;
            return Intrinsics.f(this.f94241a, topUp.f94241a) && Intrinsics.f(this.f94242b, topUp.f94242b);
        }

        public final int hashCode() {
            int iHashCode = this.f94241a.hashCode() * 31;
            String str = this.f94242b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94241a);
            dest.writeString(this.f94242b);
        }
    }

    private TravelMilesRecommendedFlightsFlowContract$Step() {
    }
}
