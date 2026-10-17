package com.revolut.feature.travel.flights.impl.ui.screen.booking_contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7g.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/booking_contact/TravelFlightsBookingContactScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "ForCheckout", "ForBookingDetails", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_contact/TravelFlightsBookingContactScreenContract$InputData$ForBookingDetails;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_contact/TravelFlightsBookingContactScreenContract$InputData$ForCheckout;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsBookingContactScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_contact/TravelFlightsBookingContactScreenContract$InputData$ForBookingDetails;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_contact/TravelFlightsBookingContactScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForBookingDetails extends TravelFlightsBookingContactScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ForBookingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PhoneNumber f93258c;
        public final q d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForBookingDetails(parcel.readString(), parcel.readString(), (PhoneNumber) parcel.readParcelable(ForBookingDetails.class.getClassLoader()), q.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForBookingDetails[i];
            }
        }

        public ForBookingDetails(String bookingId, String email, PhoneNumber phoneNumber, q bookingStatus) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(bookingStatus, "bookingStatus");
            this.f93256a = bookingId;
            this.f93257b = email;
            this.f93258c = phoneNumber;
            this.d = bookingStatus;
        }

        @Override // com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PhoneNumber getF93260b() {
            return this.f93258c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForBookingDetails)) {
                return false;
            }
            ForBookingDetails forBookingDetails = (ForBookingDetails) obj2;
            return Intrinsics.f(this.f93256a, forBookingDetails.f93256a) && Intrinsics.f(this.f93257b, forBookingDetails.f93257b) && Intrinsics.f(this.f93258c, forBookingDetails.f93258c) && this.d == forBookingDetails.d;
        }

        @Override // com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF93259a() {
            return this.f93257b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f93258c.hashCode() + p.a.c(this.f93256a.hashCode() * 31, 31, this.f93257b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93256a);
            dest.writeString(this.f93257b);
            dest.writeParcelable(this.f93258c, i);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_contact/TravelFlightsBookingContactScreenContract$InputData$ForCheckout;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_contact/TravelFlightsBookingContactScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForCheckout extends TravelFlightsBookingContactScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ForCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PhoneNumber f93260b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForCheckout(parcel.readString(), (PhoneNumber) parcel.readParcelable(ForCheckout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForCheckout[i];
            }
        }

        public ForCheckout(String email, PhoneNumber phoneNumber) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f93259a = email;
            this.f93260b = phoneNumber;
        }

        @Override // com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PhoneNumber getF93260b() {
            return this.f93260b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForCheckout)) {
                return false;
            }
            ForCheckout forCheckout = (ForCheckout) obj2;
            return Intrinsics.f(this.f93259a, forCheckout.f93259a) && Intrinsics.f(this.f93260b, forCheckout.f93260b);
        }

        @Override // com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF93259a() {
            return this.f93259a;
        }

        public final int hashCode() {
            return this.f93260b.hashCode() + (this.f93259a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93259a);
            dest.writeParcelable(this.f93260b, i);
        }
    }

    private TravelFlightsBookingContactScreenContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract PhoneNumber getF93260b();

    /* JADX INFO: renamed from: getEmail */
    public abstract String getF93259a();
}
