package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddBooking", "AddEvent", "AddProposal", "EditEvent", "EditDates", "ConfirmEditDates", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$AddBooking;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$AddEvent;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$AddProposal;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$ConfirmEditDates;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$EditDates;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$EditEvent;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelItineraryScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$AddBooking;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep;", "<init>", "()V", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddBooking implements TravelItineraryScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddBooking f101590a = new AddBooking();

        @NotNull
        public static final Parcelable.Creator<AddBooking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddBooking.f101590a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddBooking[i];
            }
        }

        private AddBooking() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$AddEvent;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddEvent implements TravelItineraryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddEvent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f101591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f101592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101593c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddEvent(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddEvent[i];
            }
        }

        public AddEvent(String countryCode, LocalDate startDate, LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f101591a = startDate;
            this.f101592b = endDate;
            this.f101593c = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddEvent)) {
                return false;
            }
            AddEvent addEvent = (AddEvent) obj2;
            return Intrinsics.f(this.f101591a, addEvent.f101591a) && Intrinsics.f(this.f101592b, addEvent.f101592b) && Intrinsics.f(this.f101593c, addEvent.f101593c);
        }

        public final int hashCode() {
            return this.f101593c.hashCode() + y.a(this.f101591a.hashCode() * 31, 31, this.f101592b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101591a);
            dest.writeSerializable(this.f101592b);
            dest.writeString(this.f101593c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$AddProposal;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddProposal implements TravelItineraryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddProposal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f101595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f101596c;
        public final String d;
        public final String e;
        public final LocalDate f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LocalTime f101597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Address f101598h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddProposal(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable(), (Address) parcel.readParcelable(AddProposal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddProposal[i];
            }
        }

        public AddProposal(String proposalId, LocalDate startDate, LocalDate endDate, String countryCode, String prefillName, LocalDate prefillDate, LocalTime prefillTime, Address address) {
            Intrinsics.checkNotNullParameter(proposalId, "proposalId");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(prefillName, "prefillName");
            Intrinsics.checkNotNullParameter(prefillDate, "prefillDate");
            Intrinsics.checkNotNullParameter(prefillTime, "prefillTime");
            this.f101594a = proposalId;
            this.f101595b = startDate;
            this.f101596c = endDate;
            this.d = countryCode;
            this.e = prefillName;
            this.f = prefillDate;
            this.f101597g = prefillTime;
            this.f101598h = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddProposal)) {
                return false;
            }
            AddProposal addProposal = (AddProposal) obj2;
            return Intrinsics.f(this.f101594a, addProposal.f101594a) && Intrinsics.f(this.f101595b, addProposal.f101595b) && Intrinsics.f(this.f101596c, addProposal.f101596c) && Intrinsics.f(this.d, addProposal.d) && Intrinsics.f(this.e, addProposal.e) && Intrinsics.f(this.f, addProposal.f) && Intrinsics.f(this.f101597g, addProposal.f101597g) && Intrinsics.f(this.f101598h, addProposal.f101598h);
        }

        public final int hashCode() {
            int iHashCode = (this.f101597g.hashCode() + y.a(p.a.c(p.a.c(y.a(y.a(this.f101594a.hashCode() * 31, 31, this.f101595b), 31, this.f101596c), 31, this.d), 31, this.e), 31, this.f)) * 31;
            Address address = this.f101598h;
            return iHashCode + (address == null ? 0 : address.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101594a);
            dest.writeSerializable(this.f101595b);
            dest.writeSerializable(this.f101596c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeSerializable(this.f);
            dest.writeSerializable(this.f101597g);
            dest.writeParcelable(this.f101598h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$ConfirmEditDates;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmEditDates implements TravelItineraryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ConfirmEditDates> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f101600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f101601c;
        public final LocalDate d;
        public final LocalDate e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmEditDates(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmEditDates[i];
            }
        }

        public ConfirmEditDates(String itineraryId, LocalDate prevStartDate, LocalDate prevEndDate, LocalDate newStartDate, LocalDate newEndDate) {
            Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
            Intrinsics.checkNotNullParameter(prevStartDate, "prevStartDate");
            Intrinsics.checkNotNullParameter(prevEndDate, "prevEndDate");
            Intrinsics.checkNotNullParameter(newStartDate, "newStartDate");
            Intrinsics.checkNotNullParameter(newEndDate, "newEndDate");
            this.f101599a = itineraryId;
            this.f101600b = prevStartDate;
            this.f101601c = prevEndDate;
            this.d = newStartDate;
            this.e = newEndDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmEditDates)) {
                return false;
            }
            ConfirmEditDates confirmEditDates = (ConfirmEditDates) obj2;
            return Intrinsics.f(this.f101599a, confirmEditDates.f101599a) && Intrinsics.f(this.f101600b, confirmEditDates.f101600b) && Intrinsics.f(this.f101601c, confirmEditDates.f101601c) && Intrinsics.f(this.d, confirmEditDates.d) && Intrinsics.f(this.e, confirmEditDates.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + y.a(y.a(y.a(this.f101599a.hashCode() * 31, 31, this.f101600b), 31, this.f101601c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101599a);
            dest.writeSerializable(this.f101600b);
            dest.writeSerializable(this.f101601c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$EditDates;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditDates implements TravelItineraryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditDates> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f101602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f101603b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditDates((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditDates[i];
            }
        }

        public EditDates(LocalDate startDate, LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.f101602a = startDate;
            this.f101603b = endDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditDates)) {
                return false;
            }
            EditDates editDates = (EditDates) obj2;
            return Intrinsics.f(this.f101602a, editDates.f101602a) && Intrinsics.f(this.f101603b, editDates.f101603b);
        }

        public final int hashCode() {
            return this.f101603b.hashCode() + (this.f101602a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101602a);
            dest.writeSerializable(this.f101603b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep$EditEvent;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditEvent implements TravelItineraryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditEvent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f101605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f101606c;
        public final String d;
        public final String e;
        public final LocalDate f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LocalTime f101607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Address f101608h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditEvent(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable(), (Address) parcel.readParcelable(EditEvent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditEvent[i];
            }
        }

        public EditEvent(String eventId, LocalDate startDate, LocalDate endDate, String countryCode, String prefillName, LocalDate prefillDate, LocalTime prefillTime, Address address) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(prefillName, "prefillName");
            Intrinsics.checkNotNullParameter(prefillDate, "prefillDate");
            Intrinsics.checkNotNullParameter(prefillTime, "prefillTime");
            this.f101604a = eventId;
            this.f101605b = startDate;
            this.f101606c = endDate;
            this.d = countryCode;
            this.e = prefillName;
            this.f = prefillDate;
            this.f101607g = prefillTime;
            this.f101608h = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditEvent)) {
                return false;
            }
            EditEvent editEvent = (EditEvent) obj2;
            return Intrinsics.f(this.f101604a, editEvent.f101604a) && Intrinsics.f(this.f101605b, editEvent.f101605b) && Intrinsics.f(this.f101606c, editEvent.f101606c) && Intrinsics.f(this.d, editEvent.d) && Intrinsics.f(this.e, editEvent.e) && Intrinsics.f(this.f, editEvent.f) && Intrinsics.f(this.f101607g, editEvent.f101607g) && Intrinsics.f(this.f101608h, editEvent.f101608h);
        }

        public final int hashCode() {
            int iHashCode = (this.f101607g.hashCode() + y.a(p.a.c(p.a.c(y.a(y.a(this.f101604a.hashCode() * 31, 31, this.f101605b), 31, this.f101606c), 31, this.d), 31, this.e), 31, this.f)) * 31;
            Address address = this.f101608h;
            return iHashCode + (address == null ? 0 : address.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101604a);
            dest.writeSerializable(this.f101605b);
            dest.writeSerializable(this.f101606c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeSerializable(this.f);
            dest.writeSerializable(this.f101607g);
            dest.writeParcelable(this.f101608h, i);
        }
    }
}
