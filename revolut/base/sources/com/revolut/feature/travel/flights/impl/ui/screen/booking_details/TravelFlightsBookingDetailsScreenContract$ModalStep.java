package com.revolut.feature.travel.flights.impl.ui.screen.booking_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7g.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TicketRules", "BookingContact", "ItineraryPreview", "BookingStatusDetails", "ChatRedirect", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$BookingContact;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$BookingStatusDetails;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$ChatRedirect;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$ItineraryPreview;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$TicketRules;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsBookingDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$BookingContact;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingContact extends TravelFlightsBookingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BookingContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PhoneNumber f93272c;
        public final q d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingContact(parcel.readString(), parcel.readString(), (PhoneNumber) parcel.readParcelable(BookingContact.class.getClassLoader()), q.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingContact[i];
            }
        }

        public BookingContact(String bookingId, String email, PhoneNumber phoneNumber, q bookingStatus) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(bookingStatus, "bookingStatus");
            this.f93270a = bookingId;
            this.f93271b = email;
            this.f93272c = phoneNumber;
            this.d = bookingStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookingContact)) {
                return false;
            }
            BookingContact bookingContact = (BookingContact) obj2;
            return Intrinsics.f(this.f93270a, bookingContact.f93270a) && Intrinsics.f(this.f93271b, bookingContact.f93271b) && Intrinsics.f(this.f93272c, bookingContact.f93272c) && this.d == bookingContact.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f93272c.hashCode() + p.a.c(this.f93270a.hashCode() * 31, 31, this.f93271b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93270a);
            dest.writeString(this.f93271b);
            dest.writeParcelable(this.f93272c, i);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$BookingStatusDetails;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingStatusDetails extends TravelFlightsBookingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BookingStatusDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93273a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingStatusDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingStatusDetails[i];
            }
        }

        public BookingStatusDetails(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93273a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BookingStatusDetails) && Intrinsics.f(this.f93273a, ((BookingStatusDetails) obj2).f93273a);
        }

        public final int hashCode() {
            return this.f93273a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93273a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$ChatRedirect;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatRedirect extends TravelFlightsBookingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChatRedirect> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93274a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatRedirect(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatRedirect[i];
            }
        }

        public ChatRedirect(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93274a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChatRedirect) && Intrinsics.f(this.f93274a, ((ChatRedirect) obj2).f93274a);
        }

        public final int hashCode() {
            return this.f93274a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93274a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$ItineraryPreview;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItineraryPreview extends TravelFlightsBookingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ItineraryPreview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f93275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f93277c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ItineraryPreview.class, parcel, arrayList, iE, 1);
                }
                return new ItineraryPreview(arrayList, parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItineraryPreview[i];
            }
        }

        public ItineraryPreview(ArrayList bounds, int i, boolean z) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            this.f93275a = bounds;
            this.f93276b = i;
            this.f93277c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ItineraryPreview)) {
                return false;
            }
            ItineraryPreview itineraryPreview = (ItineraryPreview) obj2;
            return this.f93275a.equals(itineraryPreview.f93275a) && this.f93276b == itineraryPreview.f93276b && this.f93277c == itineraryPreview.f93277c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93277c) + j6.a.b(this.f93276b, this.f93275a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f93275a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeInt(this.f93276b);
            dest.writeInt(this.f93277c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep$TicketRules;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TicketRules extends TravelFlightsBookingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TicketRules> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93278a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TicketRules(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TicketRules[i];
            }
        }

        public TicketRules(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93278a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TicketRules) && Intrinsics.f(this.f93278a, ((TicketRules) obj2).f93278a);
        }

        public final int hashCode() {
            return this.f93278a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93278a);
        }
    }

    private TravelFlightsBookingDetailsScreenContract$ModalStep() {
    }
}
