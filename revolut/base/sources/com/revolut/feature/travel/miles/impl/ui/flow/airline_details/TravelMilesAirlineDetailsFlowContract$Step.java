package com.revolut.feature.travel.miles.impl.ui.flow.airline_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AirlineDetails", "AccountRegistration", "TopUp", "SeeAllUserVouchers", "Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step$AccountRegistration;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step$AirlineDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step$SeeAllUserVouchers;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step$TopUp;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesAirlineDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step$AccountRegistration;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountRegistration extends TravelMilesAirlineDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountRegistration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelMilesAirline f94196a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRegistration((TravelMilesAirline) parcel.readParcelable(AccountRegistration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRegistration[i];
            }
        }

        public AccountRegistration(TravelMilesAirline airline) {
            Intrinsics.checkNotNullParameter(airline, "airline");
            this.f94196a = airline;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountRegistration) && Intrinsics.f(this.f94196a, ((AccountRegistration) obj2).f94196a);
        }

        public final int hashCode() {
            return this.f94196a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94196a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step$AirlineDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AirlineDetails extends TravelMilesAirlineDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AirlineDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94197a;

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
            this.f94197a = airlineId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AirlineDetails) && Intrinsics.f(this.f94197a, ((AirlineDetails) obj2).f94197a);
        }

        public final int hashCode() {
            return this.f94197a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94197a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step$SeeAllUserVouchers;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeeAllUserVouchers extends TravelMilesAirlineDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SeeAllUserVouchers> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94198a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SeeAllUserVouchers(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllUserVouchers[i];
            }
        }

        public SeeAllUserVouchers(String airlineId) {
            Intrinsics.checkNotNullParameter(airlineId, "airlineId");
            this.f94198a = airlineId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SeeAllUserVouchers) && Intrinsics.f(this.f94198a, ((SeeAllUserVouchers) obj2).f94198a);
        }

        public final int hashCode() {
            return this.f94198a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94198a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step$TopUp;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUp extends TravelMilesAirlineDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelMilesAccountV2 f94200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94201c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUp(parcel.readString(), (TravelMilesAccountV2) parcel.readParcelable(TopUp.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUp[i];
            }
        }

        public TopUp(String accountId, TravelMilesAccountV2 travelMilesAccountV2, String str) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f94199a = accountId;
            this.f94200b = travelMilesAccountV2;
            this.f94201c = str;
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
            return Intrinsics.f(this.f94199a, topUp.f94199a) && Intrinsics.f(this.f94200b, topUp.f94200b) && Intrinsics.f(this.f94201c, topUp.f94201c);
        }

        public final int hashCode() {
            int iHashCode = this.f94199a.hashCode() * 31;
            TravelMilesAccountV2 travelMilesAccountV2 = this.f94200b;
            int iHashCode2 = (iHashCode + (travelMilesAccountV2 == null ? 0 : travelMilesAccountV2.hashCode())) * 31;
            String str = this.f94201c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94199a);
            dest.writeParcelable(this.f94200b, i);
            dest.writeString(this.f94201c);
        }
    }

    private TravelMilesAirlineDetailsFlowContract$Step() {
    }
}
