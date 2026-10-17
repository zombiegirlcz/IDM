package com.revolut.feature.travel.flights.impl.ui.screen.dates_selection;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreenContract$Trip", "Landroid/os/Parcelable;", "<init>", "()V", "OneWayTrip", "RoundTrip", "Lcom/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreenContract$Trip$OneWayTrip;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreenContract$Trip$RoundTrip;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsDatesSelectionScreenContract$Trip implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreenContract$Trip$OneWayTrip;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreenContract$Trip;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneWayTrip extends TravelFlightsDatesSelectionScreenContract$Trip {

        @NotNull
        public static final Parcelable.Creator<OneWayTrip> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f93322a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneWayTrip((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneWayTrip[i];
            }
        }

        public OneWayTrip(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f93322a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OneWayTrip) && Intrinsics.f(this.f93322a, ((OneWayTrip) obj2).f93322a);
        }

        public final int hashCode() {
            return this.f93322a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93322a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreenContract$Trip$RoundTrip;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreenContract$Trip;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoundTrip extends TravelFlightsDatesSelectionScreenContract$Trip {

        @NotNull
        public static final Parcelable.Creator<RoundTrip> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f93323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93324b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoundTrip((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoundTrip[i];
            }
        }

        public RoundTrip(LocalDate departureDate, LocalDate returnDate) {
            Intrinsics.checkNotNullParameter(departureDate, "departureDate");
            Intrinsics.checkNotNullParameter(returnDate, "returnDate");
            this.f93323a = departureDate;
            this.f93324b = returnDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RoundTrip)) {
                return false;
            }
            RoundTrip roundTrip = (RoundTrip) obj2;
            return Intrinsics.f(this.f93323a, roundTrip.f93323a) && Intrinsics.f(this.f93324b, roundTrip.f93324b);
        }

        public final int hashCode() {
            return this.f93324b.hashCode() + (this.f93323a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93323a);
            dest.writeSerializable(this.f93324b);
        }
    }

    private TravelFlightsDatesSelectionScreenContract$Trip() {
    }
}
