package com.revolut.feature.travel.miles.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.x0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Home", "AirlineDetails", "Transfer", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData$AirlineDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData$Home;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData$Transfer;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesFlowContract$InputData implements IOData$Input {
    private TravelMilesFlowContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract x0 getF94173c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData$Home;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "FlightSearchParams", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends TravelMilesFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f94167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FlightSearchParams f94168b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readInt() == 0 ? null : x0.valueOf(parcel.readString()), parcel.readInt() != 0 ? FlightSearchParams.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(x0 x0Var, FlightSearchParams flightSearchParams) {
            this.f94167a = x0Var;
            this.f94168b = flightSearchParams;
        }

        @Override // com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final x0 getF94173c() {
            return this.f94167a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Home)) {
                return false;
            }
            Home home = (Home) obj2;
            return this.f94167a == home.f94167a && Intrinsics.f(this.f94168b, home.f94168b);
        }

        public final int hashCode() {
            x0 x0Var = this.f94167a;
            int iHashCode = (x0Var == null ? 0 : x0Var.hashCode()) * 31;
            FlightSearchParams flightSearchParams = this.f94168b;
            return iHashCode + (flightSearchParams != null ? flightSearchParams.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            x0 x0Var = this.f94167a;
            if (x0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(x0Var.name());
            }
            FlightSearchParams flightSearchParams = this.f94168b;
            if (flightSearchParams == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                flightSearchParams.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData$Home$FlightSearchParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FlightSearchParams implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<FlightSearchParams> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TravelMilesSearchLocation f94169a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TravelMilesSearchLocation f94170b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FlightSearchParams((TravelMilesSearchLocation) parcel.readParcelable(FlightSearchParams.class.getClassLoader()), (TravelMilesSearchLocation) parcel.readParcelable(FlightSearchParams.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FlightSearchParams[i];
                }
            }

            public FlightSearchParams(TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2) {
                this.f94169a = travelMilesSearchLocation;
                this.f94170b = travelMilesSearchLocation2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof FlightSearchParams)) {
                    return false;
                }
                FlightSearchParams flightSearchParams = (FlightSearchParams) obj2;
                return Intrinsics.f(this.f94169a, flightSearchParams.f94169a) && Intrinsics.f(this.f94170b, flightSearchParams.f94170b);
            }

            public final int hashCode() {
                TravelMilesSearchLocation travelMilesSearchLocation = this.f94169a;
                int iHashCode = (travelMilesSearchLocation == null ? 0 : travelMilesSearchLocation.hashCode()) * 31;
                TravelMilesSearchLocation travelMilesSearchLocation2 = this.f94170b;
                return iHashCode + (travelMilesSearchLocation2 != null ? travelMilesSearchLocation2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f94169a, i);
                dest.writeParcelable(this.f94170b, i);
            }

            public FlightSearchParams() {
                this(null, null);
            }
        }

        public /* synthetic */ Home(x0 x0Var) {
            this(x0Var, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData$AirlineDetails;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AirlineDetails extends TravelMilesFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AirlineDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x0 f94166b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AirlineDetails(parcel.readString(), parcel.readInt() == 0 ? null : x0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirlineDetails[i];
            }
        }

        public AirlineDetails(String airlineRef, x0 x0Var) {
            Intrinsics.checkNotNullParameter(airlineRef, "airlineRef");
            this.f94165a = airlineRef;
            this.f94166b = x0Var;
        }

        @Override // com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final x0 getF94173c() {
            return this.f94166b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AirlineDetails)) {
                return false;
            }
            AirlineDetails airlineDetails = (AirlineDetails) obj2;
            return Intrinsics.f(this.f94165a, airlineDetails.f94165a) && this.f94166b == airlineDetails.f94166b;
        }

        public final int hashCode() {
            int iHashCode = this.f94165a.hashCode() * 31;
            x0 x0Var = this.f94166b;
            return iHashCode + (x0Var == null ? 0 : x0Var.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94165a);
            x0 x0Var = this.f94166b;
            if (x0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(x0Var.name());
            }
        }

        public /* synthetic */ AirlineDetails(String str) {
            this(str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData$Transfer;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/TravelMilesFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer extends TravelMilesFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f94172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x0 f94173c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? x0.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(String airlineRef, Integer num, x0 x0Var) {
            Intrinsics.checkNotNullParameter(airlineRef, "airlineRef");
            this.f94171a = airlineRef;
            this.f94172b = num;
            this.f94173c = x0Var;
        }

        @Override // com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final x0 getF94173c() {
            return this.f94173c;
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
            return Intrinsics.f(this.f94171a, transfer.f94171a) && Intrinsics.f(this.f94172b, transfer.f94172b) && this.f94173c == transfer.f94173c;
        }

        public final int hashCode() {
            int iHashCode = this.f94171a.hashCode() * 31;
            Integer num = this.f94172b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            x0 x0Var = this.f94173c;
            return iHashCode2 + (x0Var != null ? x0Var.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94171a);
            Integer num = this.f94172b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            x0 x0Var = this.f94173c;
            if (x0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(x0Var.name());
            }
        }

        public /* synthetic */ Transfer(String str, Integer num) {
            this(str, num, null);
        }
    }
}
