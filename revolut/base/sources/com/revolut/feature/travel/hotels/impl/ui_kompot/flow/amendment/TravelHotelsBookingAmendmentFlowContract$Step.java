package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DatesPicker", "RoomsSelection", "Confirmation", "RoomDetails", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step$Confirmation;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step$DatesPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step$RoomDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step$RoomsSelection;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsBookingAmendmentFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step$Confirmation;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements TravelHotelsBookingAmendmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f93684c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Confirmation.class, parcel, arrayList, iE, 1);
                }
                return new Confirmation(string, localDate, localDate2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(String bookingId, LocalDate newCheckIn, LocalDate newCheckOut, List selectedBeds) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            Intrinsics.checkNotNullParameter(newCheckIn, "newCheckIn");
            Intrinsics.checkNotNullParameter(newCheckOut, "newCheckOut");
            Intrinsics.checkNotNullParameter(selectedBeds, "selectedBeds");
            this.f93682a = bookingId;
            this.f93683b = newCheckIn;
            this.f93684c = newCheckOut;
            this.d = selectedBeds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f93682a, confirmation.f93682a) && Intrinsics.f(this.f93683b, confirmation.f93683b) && Intrinsics.f(this.f93684c, confirmation.f93684c) && Intrinsics.f(this.d, confirmation.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + y.a(y.a(this.f93682a.hashCode() * 31, 31, this.f93683b), 31, this.f93684c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93682a);
            dest.writeSerializable(this.f93683b);
            dest.writeSerializable(this.f93684c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step$DatesPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatesPicker implements TravelHotelsBookingAmendmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DatesPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93685a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatesPicker(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatesPicker[i];
            }
        }

        public DatesPicker(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93685a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DatesPicker) && Intrinsics.f(this.f93685a, ((DatesPicker) obj2).f93685a);
        }

        public final int hashCode() {
            return this.f93685a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93685a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step$RoomDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomDetails implements TravelHotelsBookingAmendmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RoomDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f93688c;
        public final TravelHotelsRoomsInformation d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomDetails(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (TravelHotelsRoomsInformation) parcel.readParcelable(RoomDetails.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomDetails[i];
            }
        }

        public RoomDetails(String bookingId, LocalDate newCheckIn, LocalDate newCheckOut, TravelHotelsRoomsInformation selectedBed, boolean z) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            Intrinsics.checkNotNullParameter(newCheckIn, "newCheckIn");
            Intrinsics.checkNotNullParameter(newCheckOut, "newCheckOut");
            Intrinsics.checkNotNullParameter(selectedBed, "selectedBed");
            this.f93686a = bookingId;
            this.f93687b = newCheckIn;
            this.f93688c = newCheckOut;
            this.d = selectedBed;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RoomDetails)) {
                return false;
            }
            RoomDetails roomDetails = (RoomDetails) obj2;
            return Intrinsics.f(this.f93686a, roomDetails.f93686a) && Intrinsics.f(this.f93687b, roomDetails.f93687b) && Intrinsics.f(this.f93688c, roomDetails.f93688c) && Intrinsics.f(this.d, roomDetails.d) && this.e == roomDetails.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + y.a(y.a(this.f93686a.hashCode() * 31, 31, this.f93687b), 31, this.f93688c)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93686a);
            dest.writeSerializable(this.f93687b);
            dest.writeSerializable(this.f93688c);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step$RoomsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/amendment/TravelHotelsBookingAmendmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomsSelection implements TravelHotelsBookingAmendmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RoomsSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f93691c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomsSelection(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomsSelection[i];
            }
        }

        public RoomsSelection(String bookingId, LocalDate newCheckIn, LocalDate newCheckOut) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            Intrinsics.checkNotNullParameter(newCheckIn, "newCheckIn");
            Intrinsics.checkNotNullParameter(newCheckOut, "newCheckOut");
            this.f93689a = bookingId;
            this.f93690b = newCheckIn;
            this.f93691c = newCheckOut;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RoomsSelection)) {
                return false;
            }
            RoomsSelection roomsSelection = (RoomsSelection) obj2;
            return Intrinsics.f(this.f93689a, roomsSelection.f93689a) && Intrinsics.f(this.f93690b, roomsSelection.f93690b) && Intrinsics.f(this.f93691c, roomsSelection.f93691c);
        }

        public final int hashCode() {
            return this.f93691c.hashCode() + y.a(this.f93689a.hashCode() * 31, 31, this.f93690b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93689a);
            dest.writeSerializable(this.f93690b);
            dest.writeSerializable(this.f93691c);
        }
    }
}
