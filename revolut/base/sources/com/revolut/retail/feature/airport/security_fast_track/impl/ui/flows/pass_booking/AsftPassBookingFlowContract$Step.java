package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTermsAndConditions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AirportSelection", "AirportSearch", "TerminalSelection", "TimeSlotBooking", "TravellerDetails", "Checkout", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$AirportSearch;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$AirportSelection;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$TerminalSelection;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$TimeSlotBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$TravellerDetails;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AsftPassBookingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$AirportSearch;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirportSearch extends AsftPassBookingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AirportSearch f98776a = new AirportSearch();

        @NotNull
        public static final Parcelable.Creator<AirportSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirportSearch.f98776a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportSearch[i];
            }
        }

        private AirportSearch() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$AirportSelection;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirportSelection extends AsftPassBookingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AirportSelection f98777a = new AirportSelection();

        @NotNull
        public static final Parcelable.Creator<AirportSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirportSelection.f98777a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportSelection[i];
            }
        }

        private AirportSelection() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends AsftPassBookingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AsftPassBookingFlowContract$UserBookingDetails f98780c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(AsftPassBookingFlowContract$UserBookingDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(AsftPassBookingFlowContract$UserBookingDetails userInputData, String airportIataCode, String airportTerminalId, String prebookedSlotId) {
            Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
            Intrinsics.checkNotNullParameter(airportTerminalId, "airportTerminalId");
            Intrinsics.checkNotNullParameter(userInputData, "userInputData");
            Intrinsics.checkNotNullParameter(prebookedSlotId, "prebookedSlotId");
            this.f98778a = airportIataCode;
            this.f98779b = airportTerminalId;
            this.f98780c = userInputData;
            this.d = prebookedSlotId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Checkout)) {
                return false;
            }
            Checkout checkout = (Checkout) obj2;
            return Intrinsics.f(this.f98778a, checkout.f98778a) && Intrinsics.f(this.f98779b, checkout.f98779b) && Intrinsics.f(this.f98780c, checkout.f98780c) && Intrinsics.f(this.d, checkout.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f98780c.hashCode() + p.a.c(this.f98778a.hashCode() * 31, 31, this.f98779b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98778a);
            dest.writeString(this.f98779b);
            this.f98780c.writeToParcel(dest, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$TerminalSelection;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TerminalSelection extends AsftPassBookingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TerminalSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98781a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TerminalSelection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TerminalSelection[i];
            }
        }

        public TerminalSelection(String airportIataCode) {
            Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
            this.f98781a = airportIataCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TerminalSelection) && Intrinsics.f(this.f98781a, ((TerminalSelection) obj2).f98781a);
        }

        public final int hashCode() {
            return this.f98781a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98781a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$TimeSlotBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimeSlotBooking extends AsftPassBookingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TimeSlotBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98783b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TimeSlotBooking(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TimeSlotBooking[i];
            }
        }

        public TimeSlotBooking(String airportIataCode, String airportTerminalId) {
            Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
            Intrinsics.checkNotNullParameter(airportTerminalId, "airportTerminalId");
            this.f98782a = airportIataCode;
            this.f98783b = airportTerminalId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TimeSlotBooking)) {
                return false;
            }
            TimeSlotBooking timeSlotBooking = (TimeSlotBooking) obj2;
            return Intrinsics.f(this.f98782a, timeSlotBooking.f98782a) && Intrinsics.f(this.f98783b, timeSlotBooking.f98783b);
        }

        public final int hashCode() {
            return this.f98783b.hashCode() + (this.f98782a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98782a);
            dest.writeString(this.f98783b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step$TravellerDetails;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TravellerDetails extends AsftPassBookingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TravellerDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f98786c;
        public final boolean d;
        public final AsftTermsAndConditions e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TravellerDetails(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (AsftTermsAndConditions) parcel.readParcelable(TravellerDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TravellerDetails[i];
            }
        }

        public TravellerDetails(int i, String prebookedSlotId, String str, boolean z, AsftTermsAndConditions asftTermsAndConditions) {
            Intrinsics.checkNotNullParameter(prebookedSlotId, "prebookedSlotId");
            this.f98784a = i;
            this.f98785b = prebookedSlotId;
            this.f98786c = str;
            this.d = z;
            this.e = asftTermsAndConditions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TravellerDetails)) {
                return false;
            }
            TravellerDetails travellerDetails = (TravellerDetails) obj2;
            return this.f98784a == travellerDetails.f98784a && Intrinsics.f(this.f98785b, travellerDetails.f98785b) && Intrinsics.f(this.f98786c, travellerDetails.f98786c) && this.d == travellerDetails.d && Intrinsics.f(this.e, travellerDetails.e);
        }

        public final int hashCode() {
            int iC = p.a.c(Integer.hashCode(this.f98784a) * 31, 31, this.f98785b);
            String str = this.f98786c;
            int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            AsftTermsAndConditions asftTermsAndConditions = this.e;
            return iC2 + (asftTermsAndConditions != null ? asftTermsAndConditions.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98784a);
            dest.writeString(this.f98785b);
            dest.writeString(this.f98786c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
        }
    }

    private AsftPassBookingFlowContract$Step() {
    }
}
