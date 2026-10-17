package com.revolut.feature.travel.flights.impl.ui.screen.discover;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DatesSelection", "PassengersSelection", "OriginSelection", "DestinationSelection", "Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep$DatesSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep$DestinationSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep$OriginSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep$PassengersSelection;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelFlightsDiscoverScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep$DatesSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatesSelection implements TravelFlightsDiscoverScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DatesSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f93326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93327b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatesSelection((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatesSelection[i];
            }
        }

        public DatesSelection(LocalDate localDate, LocalDate localDate2) {
            this.f93326a = localDate;
            this.f93327b = localDate2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DatesSelection)) {
                return false;
            }
            DatesSelection datesSelection = (DatesSelection) obj2;
            return Intrinsics.f(this.f93326a, datesSelection.f93326a) && Intrinsics.f(this.f93327b, datesSelection.f93327b);
        }

        public final int hashCode() {
            LocalDate localDate = this.f93326a;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.f93327b;
            return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93326a);
            dest.writeSerializable(this.f93327b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep$DestinationSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DestinationSelection implements TravelFlightsDiscoverScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DestinationSelection f93328a = new DestinationSelection();

        @NotNull
        public static final Parcelable.Creator<DestinationSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DestinationSelection.f93328a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DestinationSelection[i];
            }
        }

        private DestinationSelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep$OriginSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OriginSelection implements TravelFlightsDiscoverScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OriginSelection f93329a = new OriginSelection();

        @NotNull
        public static final Parcelable.Creator<OriginSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OriginSelection.f93329a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OriginSelection[i];
            }
        }

        private OriginSelection() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep$PassengersSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassengersSelection implements TravelFlightsDiscoverScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PassengersSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Passengers f93330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f93331b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassengersSelection((Passengers) parcel.readParcelable(PassengersSelection.class.getClassLoader()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassengersSelection[i];
            }
        }

        public PassengersSelection(Passengers passengers, d cabinClass) {
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
            this.f93330a = passengers;
            this.f93331b = cabinClass;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PassengersSelection)) {
                return false;
            }
            PassengersSelection passengersSelection = (PassengersSelection) obj2;
            return Intrinsics.f(this.f93330a, passengersSelection.f93330a) && this.f93331b == passengersSelection.f93331b;
        }

        public final int hashCode() {
            return this.f93331b.hashCode() + (this.f93330a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93330a, i);
            dest.writeString(this.f93331b.name());
        }
    }
}
