package com.revolut.feature.travel.miles.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.x0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "MainScreen", "FlightSearch", "RevPointsOptIn", "Onboarding", "SearchAirline", "SearchAirlineHome", "Transactions", "OpenRevPointsTransactionPager", "AirlineDetails", "AgentDetails", "Transfer", "AgentTransfer", "FlightSearchResults", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$AgentDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$AgentTransfer;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$AirlineDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$FlightSearch;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$FlightSearchResults;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$MainScreen;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$Onboarding;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$OpenRevPointsTransactionPager;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$SearchAirline;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$SearchAirlineHome;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$Transactions;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$Transfer;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$AgentDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AgentDetails extends TravelMilesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AgentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94174a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AgentDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AgentDetails[i];
            }
        }

        public AgentDetails(String agentId) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            this.f94174a = agentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AgentDetails) && Intrinsics.f(this.f94174a, ((AgentDetails) obj2).f94174a);
        }

        public final int hashCode() {
            return this.f94174a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94174a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$AgentTransfer;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AgentTransfer extends TravelMilesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AgentTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f94176b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AgentTransfer(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AgentTransfer[i];
            }
        }

        public AgentTransfer(String agentId, Integer num) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            this.f94175a = agentId;
            this.f94176b = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AgentTransfer)) {
                return false;
            }
            AgentTransfer agentTransfer = (AgentTransfer) obj2;
            return Intrinsics.f(this.f94175a, agentTransfer.f94175a) && Intrinsics.f(this.f94176b, agentTransfer.f94176b);
        }

        public final int hashCode() {
            int iHashCode = this.f94175a.hashCode() * 31;
            Integer num = this.f94176b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94175a);
            Integer num = this.f94176b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$AirlineDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AirlineDetails extends TravelMilesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AirlineDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94177a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AirlineDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirlineDetails[i];
            }
        }

        public AirlineDetails(String airlineId) {
            Intrinsics.checkNotNullParameter(airlineId, "airlineId");
            this.f94177a = airlineId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AirlineDetails) && Intrinsics.f(this.f94177a, ((AirlineDetails) obj2).f94177a);
        }

        public final int hashCode() {
            return this.f94177a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94177a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$FlightSearchResults;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FlightSearchResults extends TravelMilesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FlightSearchResults> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelMilesSearchLocation f94181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelMilesSearchLocation f94182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f94183c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FlightSearchResults((TravelMilesSearchLocation) parcel.readParcelable(FlightSearchResults.class.getClassLoader()), (TravelMilesSearchLocation) parcel.readParcelable(FlightSearchResults.class.getClassLoader()), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlightSearchResults[i];
            }
        }

        public FlightSearchResults(TravelMilesSearchLocation origin, TravelMilesSearchLocation destination, LocalDate date) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(date, "date");
            this.f94181a = origin;
            this.f94182b = destination;
            this.f94183c = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FlightSearchResults)) {
                return false;
            }
            FlightSearchResults flightSearchResults = (FlightSearchResults) obj2;
            return Intrinsics.f(this.f94181a, flightSearchResults.f94181a) && Intrinsics.f(this.f94182b, flightSearchResults.f94182b) && Intrinsics.f(this.f94183c, flightSearchResults.f94183c);
        }

        public final int hashCode() {
            return this.f94183c.hashCode() + ((this.f94182b.hashCode() + (this.f94181a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94181a, i);
            dest.writeParcelable(this.f94182b, i);
            dest.writeSerializable(this.f94183c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$MainScreen;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MainScreen extends TravelMilesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MainScreen f94184a = new MainScreen();

        @NotNull
        public static final Parcelable.Creator<MainScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MainScreen.f94184a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MainScreen[i];
            }
        }

        private MainScreen() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$Onboarding;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarding extends TravelMilesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f94185a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onboarding(x0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        public Onboarding(x0 revPointsOptInState) {
            Intrinsics.checkNotNullParameter(revPointsOptInState, "revPointsOptInState");
            this.f94185a = revPointsOptInState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Onboarding) && this.f94185a == ((Onboarding) obj2).f94185a;
        }

        public final int hashCode() {
            return this.f94185a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94185a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$OpenRevPointsTransactionPager;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenRevPointsTransactionPager extends TravelMilesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenRevPointsTransactionPager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f94187b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenRevPointsTransactionPager(parcel.readString(), f0.f322471a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenRevPointsTransactionPager[i];
            }
        }

        public OpenRevPointsTransactionPager(String selectedTransactionId, List transactionsList) {
            Intrinsics.checkNotNullParameter(selectedTransactionId, "selectedTransactionId");
            Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
            this.f94186a = selectedTransactionId;
            this.f94187b = transactionsList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenRevPointsTransactionPager)) {
                return false;
            }
            OpenRevPointsTransactionPager openRevPointsTransactionPager = (OpenRevPointsTransactionPager) obj2;
            return Intrinsics.f(this.f94186a, openRevPointsTransactionPager.f94186a) && Intrinsics.f(this.f94187b, openRevPointsTransactionPager.f94187b);
        }

        public final int hashCode() {
            return this.f94187b.hashCode() + (this.f94186a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94186a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsOptIn extends TravelMilesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsOptIn f94188a = new RevPointsOptIn();

        @NotNull
        public static final Parcelable.Creator<RevPointsOptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsOptIn.f94188a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsOptIn[i];
            }
        }

        private RevPointsOptIn() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$SearchAirline;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SearchAirline extends TravelMilesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SearchAirline f94189a = new SearchAirline();

        @NotNull
        public static final Parcelable.Creator<SearchAirline> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SearchAirline.f94189a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchAirline[i];
            }
        }

        private SearchAirline() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$SearchAirlineHome;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SearchAirlineHome extends TravelMilesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SearchAirlineHome f94190a = new SearchAirlineHome();

        @NotNull
        public static final Parcelable.Creator<SearchAirlineHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SearchAirlineHome.f94190a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchAirlineHome[i];
            }
        }

        private SearchAirlineHome() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$Transactions;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Transactions extends TravelMilesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Transactions f94191a = new Transactions();

        @NotNull
        public static final Parcelable.Creator<Transactions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Transactions.f94191a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transactions[i];
            }
        }

        private Transactions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$Transfer;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer extends TravelMilesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f94193b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(String airlineId, Integer num) {
            Intrinsics.checkNotNullParameter(airlineId, "airlineId");
            this.f94192a = airlineId;
            this.f94193b = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj2;
            return Intrinsics.f(this.f94192a, transfer.f94192a) && Intrinsics.f(this.f94193b, transfer.f94193b);
        }

        public final int hashCode() {
            int iHashCode = this.f94192a.hashCode() * 31;
            Integer num = this.f94193b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94192a);
            Integer num = this.f94193b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    private TravelMilesFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step$FlightSearch;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FlightSearch extends TravelMilesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FlightSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelMilesSearchLocation f94178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelMilesSearchLocation f94179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f94180c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FlightSearch((TravelMilesSearchLocation) parcel.readParcelable(FlightSearch.class.getClassLoader()), (TravelMilesSearchLocation) parcel.readParcelable(FlightSearch.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlightSearch[i];
            }
        }

        public FlightSearch(TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2, boolean z) {
            this.f94178a = travelMilesSearchLocation;
            this.f94179b = travelMilesSearchLocation2;
            this.f94180c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FlightSearch)) {
                return false;
            }
            FlightSearch flightSearch = (FlightSearch) obj2;
            return Intrinsics.f(this.f94178a, flightSearch.f94178a) && Intrinsics.f(this.f94179b, flightSearch.f94179b) && this.f94180c == flightSearch.f94180c;
        }

        public final int hashCode() {
            TravelMilesSearchLocation travelMilesSearchLocation = this.f94178a;
            int iHashCode = (travelMilesSearchLocation == null ? 0 : travelMilesSearchLocation.hashCode()) * 31;
            TravelMilesSearchLocation travelMilesSearchLocation2 = this.f94179b;
            return Boolean.hashCode(this.f94180c) + ((iHashCode + (travelMilesSearchLocation2 != null ? travelMilesSearchLocation2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94178a, i);
            dest.writeParcelable(this.f94179b, i);
            dest.writeInt(this.f94180c ? 1 : 0);
        }

        public FlightSearch() {
            this(null, null, false);
        }
    }
}
