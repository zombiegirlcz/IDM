package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/TravelHotelsBookingDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CheckInInstructions", "AdditionalInformation", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/TravelHotelsBookingDetailsScreenContract$ModalStep$AdditionalInformation;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/TravelHotelsBookingDetailsScreenContract$ModalStep$CheckInInstructions;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsBookingDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/TravelHotelsBookingDetailsScreenContract$ModalStep$AdditionalInformation;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/TravelHotelsBookingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalInformation implements TravelHotelsBookingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AdditionalInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f93843c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalInformation(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInformation[i];
            }
        }

        public AdditionalInformation(String propertyId, LocalDate checkIn, LocalDate checkOut) {
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            Intrinsics.checkNotNullParameter(checkIn, "checkIn");
            Intrinsics.checkNotNullParameter(checkOut, "checkOut");
            this.f93841a = propertyId;
            this.f93842b = checkIn;
            this.f93843c = checkOut;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalInformation)) {
                return false;
            }
            AdditionalInformation additionalInformation = (AdditionalInformation) obj2;
            return Intrinsics.f(this.f93841a, additionalInformation.f93841a) && Intrinsics.f(this.f93842b, additionalInformation.f93842b) && Intrinsics.f(this.f93843c, additionalInformation.f93843c);
        }

        public final int hashCode() {
            return this.f93843c.hashCode() + y.a(this.f93841a.hashCode() * 31, 31, this.f93842b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93841a);
            dest.writeSerializable(this.f93842b);
            dest.writeSerializable(this.f93843c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/TravelHotelsBookingDetailsScreenContract$ModalStep$CheckInInstructions;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/TravelHotelsBookingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckInInstructions implements TravelHotelsBookingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CheckInInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93844a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckInInstructions(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckInInstructions[i];
            }
        }

        public CheckInInstructions(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93844a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CheckInInstructions) && Intrinsics.f(this.f93844a, ((CheckInInstructions) obj2).f93844a);
        }

        public final int hashCode() {
            return this.f93844a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93844a);
        }
    }
}
