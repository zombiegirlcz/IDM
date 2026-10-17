package com.revolut.feature.travel.flights.impl.ui.screen.search_results;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.d;
import org.jetbrains.annotations.NotNull;
import r7g.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SortBy", "OriginSelection", "DestinationSelection", "DatesSelection", "TravelersSelection", "PriceBreakdown", "SelfTransfer", "Filters", "BaggageDescription", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$BaggageDescription;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$DatesSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$DestinationSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$Filters;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$OriginSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$PriceBreakdown;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$SelfTransfer;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$SortBy;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$TravelersSelection;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsSearchScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$BaggageDescription;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BaggageDescription extends TravelFlightsSearchScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BaggageDescription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f93407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93408b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BaggageDescription.class, parcel, arrayList, iE, 1);
                }
                return new BaggageDescription(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BaggageDescription[i];
            }
        }

        public BaggageDescription(ArrayList baggageItems, boolean z) {
            Intrinsics.checkNotNullParameter(baggageItems, "baggageItems");
            this.f93407a = baggageItems;
            this.f93408b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BaggageDescription)) {
                return false;
            }
            BaggageDescription baggageDescription = (BaggageDescription) obj2;
            return this.f93407a.equals(baggageDescription.f93407a) && this.f93408b == baggageDescription.f93408b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93408b) + (this.f93407a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f93407a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeInt(this.f93408b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$DatesSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatesSelection extends TravelFlightsSearchScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DatesSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f93409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93410b;

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
            this.f93409a = localDate;
            this.f93410b = localDate2;
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
            return Intrinsics.f(this.f93409a, datesSelection.f93409a) && Intrinsics.f(this.f93410b, datesSelection.f93410b);
        }

        public final int hashCode() {
            LocalDate localDate = this.f93409a;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.f93410b;
            return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93409a);
            dest.writeSerializable(this.f93410b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$DestinationSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DestinationSelection extends TravelFlightsSearchScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DestinationSelection f93411a = new DestinationSelection();

        @NotNull
        public static final Parcelable.Creator<DestinationSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DestinationSelection.f93411a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$Filters;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Filters extends TravelFlightsSearchScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Filters> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlightSearchFilterOptions f93412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FlightSearchRequestFilters f93413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f93414c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Filters((FlightSearchFilterOptions) parcel.readParcelable(Filters.class.getClassLoader()), (FlightSearchRequestFilters) parcel.readParcelable(Filters.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Filters[i];
            }
        }

        public Filters(FlightSearchFilterOptions filterOptions, FlightSearchRequestFilters flightSearchRequestFilters, int i) {
            Intrinsics.checkNotNullParameter(filterOptions, "filterOptions");
            this.f93412a = filterOptions;
            this.f93413b = flightSearchRequestFilters;
            this.f93414c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Filters)) {
                return false;
            }
            Filters filters = (Filters) obj2;
            return Intrinsics.f(this.f93412a, filters.f93412a) && Intrinsics.f(this.f93413b, filters.f93413b) && this.f93414c == filters.f93414c;
        }

        public final int hashCode() {
            int iHashCode = this.f93412a.hashCode() * 31;
            FlightSearchRequestFilters flightSearchRequestFilters = this.f93413b;
            return Integer.hashCode(this.f93414c) + ((iHashCode + (flightSearchRequestFilters == null ? 0 : flightSearchRequestFilters.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93412a, i);
            dest.writeParcelable(this.f93413b, i);
            dest.writeInt(this.f93414c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$OriginSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OriginSelection extends TravelFlightsSearchScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OriginSelection f93415a = new OriginSelection();

        @NotNull
        public static final Parcelable.Creator<OriginSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OriginSelection.f93415a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$PriceBreakdown;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceBreakdown extends TravelFlightsSearchScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Payment f93416a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PriceBreakdown((Payment) parcel.readParcelable(PriceBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceBreakdown[i];
            }
        }

        public PriceBreakdown(Payment payment) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            this.f93416a = payment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PriceBreakdown) && Intrinsics.f(this.f93416a, ((PriceBreakdown) obj2).f93416a);
        }

        public final int hashCode() {
            return this.f93416a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93416a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$SelfTransfer;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelfTransfer extends TravelFlightsSearchScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelfTransfer f93417a = new SelfTransfer();

        @NotNull
        public static final Parcelable.Creator<SelfTransfer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelfTransfer.f93417a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfTransfer[i];
            }
        }

        private SelfTransfer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$SortBy;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SortBy extends TravelFlightsSearchScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SortBy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f93418a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SortBy(g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SortBy[i];
            }
        }

        public SortBy(g selectedSort) {
            Intrinsics.checkNotNullParameter(selectedSort, "selectedSort");
            this.f93418a = selectedSort;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SortBy) && this.f93418a == ((SortBy) obj2).f93418a;
        }

        public final int hashCode() {
            return this.f93418a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93418a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep$TravelersSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TravelersSelection extends TravelFlightsSearchScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TravelersSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Passengers f93419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f93420b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TravelersSelection((Passengers) parcel.readParcelable(TravelersSelection.class.getClassLoader()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TravelersSelection[i];
            }
        }

        public TravelersSelection(Passengers passengers, d cabinClass) {
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
            this.f93419a = passengers;
            this.f93420b = cabinClass;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TravelersSelection)) {
                return false;
            }
            TravelersSelection travelersSelection = (TravelersSelection) obj2;
            return Intrinsics.f(this.f93419a, travelersSelection.f93419a) && this.f93420b == travelersSelection.f93420b;
        }

        public final int hashCode() {
            return this.f93420b.hashCode() + (this.f93419a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93419a, i);
            dest.writeString(this.f93420b.name());
        }
    }

    private TravelFlightsSearchScreenContract$ModalStep() {
    }
}
