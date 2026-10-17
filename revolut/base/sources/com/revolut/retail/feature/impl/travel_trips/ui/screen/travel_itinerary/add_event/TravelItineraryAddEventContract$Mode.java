package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode", "Landroid/os/Parcelable;", "Add", "AddProposal", "Edit", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode$Add;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode$AddProposal;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode$Edit;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelItineraryAddEventContract$Mode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode$Add;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode;", "<init>", "()V", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Add implements TravelItineraryAddEventContract$Mode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Add f101624a = new Add();

        @NotNull
        public static final Parcelable.Creator<Add> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Add.f101624a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Add[i];
            }
        }

        private Add() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode$AddProposal;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddProposal implements TravelItineraryAddEventContract$Mode {

        @NotNull
        public static final Parcelable.Creator<AddProposal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f101627c;
        public final LocalTime d;
        public final Address e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddProposal(parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable(), (Address) parcel.readParcelable(AddProposal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddProposal[i];
            }
        }

        public AddProposal(String proposalId, String name, LocalDate date, LocalTime time, Address address) {
            Intrinsics.checkNotNullParameter(proposalId, "proposalId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            this.f101625a = proposalId;
            this.f101626b = name;
            this.f101627c = date;
            this.d = time;
            this.e = address;
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
            return Intrinsics.f(this.f101625a, addProposal.f101625a) && Intrinsics.f(this.f101626b, addProposal.f101626b) && Intrinsics.f(this.f101627c, addProposal.f101627c) && Intrinsics.f(this.d, addProposal.d) && Intrinsics.f(this.e, addProposal.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + y.a(p.a.c(this.f101625a.hashCode() * 31, 31, this.f101626b), 31, this.f101627c)) * 31;
            Address address = this.e;
            return iHashCode + (address == null ? 0 : address.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101625a);
            dest.writeString(this.f101626b);
            dest.writeSerializable(this.f101627c);
            dest.writeSerializable(this.d);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode$Edit;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements TravelItineraryAddEventContract$Mode {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f101630c;
        public final LocalTime d;
        public final Address e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit(parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable(), (Address) parcel.readParcelable(Edit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(String eventId, String name, LocalDate date, LocalTime time, Address address) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            this.f101628a = eventId;
            this.f101629b = name;
            this.f101630c = date;
            this.d = time;
            this.e = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj2;
            return Intrinsics.f(this.f101628a, edit.f101628a) && Intrinsics.f(this.f101629b, edit.f101629b) && Intrinsics.f(this.f101630c, edit.f101630c) && Intrinsics.f(this.d, edit.d) && Intrinsics.f(this.e, edit.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + y.a(p.a.c(this.f101628a.hashCode() * 31, 31, this.f101629b), 31, this.f101630c)) * 31;
            Address address = this.e;
            return iHashCode + (address == null ? 0 : address.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101628a);
            dest.writeString(this.f101629b);
            dest.writeSerializable(this.f101630c);
            dest.writeSerializable(this.d);
            dest.writeParcelable(this.e, i);
        }
    }
}
