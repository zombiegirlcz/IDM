package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$SegmentsBreakdown;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "FlightSegments", "TopUp", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreenContract$ModalStep$FlightSegments;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreenContract$ModalStep$TopUp;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesFlightSearchResultDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreenContract$ModalStep$FlightSegments;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FlightSegments extends TravelMilesFlightSearchResultDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FlightSegments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelMilesSearchFlightDetails$SegmentsBreakdown f94297a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FlightSegments((TravelMilesSearchFlightDetails$SegmentsBreakdown) parcel.readParcelable(FlightSegments.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlightSegments[i];
            }
        }

        public FlightSegments(TravelMilesSearchFlightDetails$SegmentsBreakdown segmentsBreakdown) {
            Intrinsics.checkNotNullParameter(segmentsBreakdown, "segmentsBreakdown");
            this.f94297a = segmentsBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FlightSegments) && Intrinsics.f(this.f94297a, ((FlightSegments) obj2).f94297a);
        }

        public final int hashCode() {
            return this.f94297a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94297a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreenContract$ModalStep$TopUp;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUp extends TravelMilesFlightSearchResultDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94300c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUp[i];
            }
        }

        public TopUp(String accountId, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f94298a = accountId;
            this.f94299b = str;
            this.f94300c = str2;
            this.d = str3;
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
            return Intrinsics.f(this.f94298a, topUp.f94298a) && Intrinsics.f(this.f94299b, topUp.f94299b) && Intrinsics.f(this.f94300c, topUp.f94300c) && Intrinsics.f(this.d, topUp.d);
        }

        public final int hashCode() {
            int iHashCode = this.f94298a.hashCode() * 31;
            String str = this.f94299b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f94300c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94298a);
            dest.writeString(this.f94299b);
            dest.writeString(this.f94300c);
            dest.writeString(this.d);
        }
    }

    private TravelMilesFlightSearchResultDetailsScreenContract$ModalStep() {
    }
}
