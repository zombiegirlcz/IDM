package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FlightDatePicker", "TravelersNumberPicker", "TimeSlotPicker", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep$FlightDatePicker;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep$TimeSlotPicker;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep$TravelersNumberPicker;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AsftTimeSlotBookingScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep$FlightDatePicker;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FlightDatePicker implements AsftTimeSlotBookingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FlightDatePicker f98884a = new FlightDatePicker();

        @NotNull
        public static final Parcelable.Creator<FlightDatePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FlightDatePicker.f98884a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlightDatePicker[i];
            }
        }

        private FlightDatePicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep$TimeSlotPicker;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TimeSlotPicker implements AsftTimeSlotBookingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeSlotPicker f98885a = new TimeSlotPicker();

        @NotNull
        public static final Parcelable.Creator<TimeSlotPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TimeSlotPicker.f98885a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TimeSlotPicker[i];
            }
        }

        private TimeSlotPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep$TravelersNumberPicker;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TravelersNumberPicker implements AsftTimeSlotBookingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TravelersNumberPicker f98886a = new TravelersNumberPicker();

        @NotNull
        public static final Parcelable.Creator<TravelersNumberPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TravelersNumberPicker.f98886a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TravelersNumberPicker[i];
            }
        }

        private TravelersNumberPicker() {
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
}
