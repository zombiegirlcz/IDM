package com.revolut.feature.travel.flights.impl.ui.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$PagerItem;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewParams;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import com.revolut.feature.travel.flights.models.domain.search.TravelFlightsItinerary;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.d;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Home", "PastAndCancelledBookings", "SearchResults", "Itinerary", "FareSelection", "BaggageSelection", "PassengerDetails", "Checkout", "PostBooking", "Documents", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$BaggageSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$Checkout;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$Documents;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$FareSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$Home;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$Itinerary;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$PassengerDetails;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$PastAndCancelledBookings;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$PostBooking;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$SearchResults;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$BaggageSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BaggageSelection extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BaggageSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelFlightsFare f93216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelFlightsItinerary f93217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Passengers f93218c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BaggageSelection((TravelFlightsFare) parcel.readParcelable(BaggageSelection.class.getClassLoader()), (TravelFlightsItinerary) parcel.readParcelable(BaggageSelection.class.getClassLoader()), (Passengers) parcel.readParcelable(BaggageSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BaggageSelection[i];
            }
        }

        public BaggageSelection(TravelFlightsFare fare, TravelFlightsItinerary itinerary, Passengers passengers) {
            Intrinsics.checkNotNullParameter(fare, "fare");
            Intrinsics.checkNotNullParameter(itinerary, "itinerary");
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            this.f93216a = fare;
            this.f93217b = itinerary;
            this.f93218c = passengers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BaggageSelection)) {
                return false;
            }
            BaggageSelection baggageSelection = (BaggageSelection) obj2;
            return Intrinsics.f(this.f93216a, baggageSelection.f93216a) && Intrinsics.f(this.f93217b, baggageSelection.f93217b) && Intrinsics.f(this.f93218c, baggageSelection.f93218c);
        }

        public final int hashCode() {
            return this.f93218c.hashCode() + ((this.f93217b.hashCode() + (this.f93216a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93216a, i);
            dest.writeParcelable(this.f93217b, i);
            dest.writeParcelable(this.f93218c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$Checkout;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookingPreviewParams f93219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelFlightsItinerary f93220b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout((BookingPreviewParams) parcel.readParcelable(Checkout.class.getClassLoader()), (TravelFlightsItinerary) parcel.readParcelable(Checkout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(BookingPreviewParams bookingPreviewParams, TravelFlightsItinerary itinerary) {
            Intrinsics.checkNotNullParameter(bookingPreviewParams, "bookingPreviewParams");
            Intrinsics.checkNotNullParameter(itinerary, "itinerary");
            this.f93219a = bookingPreviewParams;
            this.f93220b = itinerary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Checkout)) {
                return false;
            }
            Checkout checkout = (Checkout) obj2;
            return Intrinsics.f(this.f93219a, checkout.f93219a) && Intrinsics.f(this.f93220b, checkout.f93220b);
        }

        public final int hashCode() {
            return this.f93220b.hashCode() + (this.f93219a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93219a, i);
            dest.writeParcelable(this.f93220b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$Documents;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93221a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Documents(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        public Documents(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93221a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Documents) && Intrinsics.f(this.f93221a, ((Documents) obj2).f93221a);
        }

        public final int hashCode() {
            return this.f93221a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93221a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$FareSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FareSelection extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FareSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f93222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelFlightsItinerary f93223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Passengers f93224c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(FareSelection.class, parcel, arrayList, iE, 1);
                }
                return new FareSelection(arrayList, (TravelFlightsItinerary) parcel.readParcelable(FareSelection.class.getClassLoader()), (Passengers) parcel.readParcelable(FareSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FareSelection[i];
            }
        }

        public FareSelection(List fareOptions, TravelFlightsItinerary itinerary, Passengers passengers) {
            Intrinsics.checkNotNullParameter(fareOptions, "fareOptions");
            Intrinsics.checkNotNullParameter(itinerary, "itinerary");
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            this.f93222a = fareOptions;
            this.f93223b = itinerary;
            this.f93224c = passengers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FareSelection)) {
                return false;
            }
            FareSelection fareSelection = (FareSelection) obj2;
            return Intrinsics.f(this.f93222a, fareSelection.f93222a) && Intrinsics.f(this.f93223b, fareSelection.f93223b) && Intrinsics.f(this.f93224c, fareSelection.f93224c);
        }

        public final int hashCode() {
            return this.f93224c.hashCode() + ((this.f93223b.hashCode() + (this.f93222a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f93222a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f93223b, i);
            dest.writeParcelable(this.f93224c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$Home;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelFlightsHomeFlowContract$PagerItem f93225a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(TravelFlightsHomeFlowContract$PagerItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && this.f93225a == ((Home) obj2).f93225a;
        }

        public final int hashCode() {
            return this.f93225a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93225a.writeToParcel(dest, i);
        }

        public Home(TravelFlightsHomeFlowContract$PagerItem initialPagerItem) {
            Intrinsics.checkNotNullParameter(initialPagerItem, "initialPagerItem");
            this.f93225a = initialPagerItem;
        }

        public /* synthetic */ Home(int i) {
            this(TravelFlightsHomeFlowContract$PagerItem.DISCOVER);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$Itinerary;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Itinerary extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Itinerary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelFlightsItinerary f93226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f93227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Passengers f93228c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Itinerary((TravelFlightsItinerary) parcel.readParcelable(Itinerary.class.getClassLoader()), d.valueOf(parcel.readString()), (Passengers) parcel.readParcelable(Itinerary.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Itinerary[i];
            }
        }

        public Itinerary(TravelFlightsItinerary itinerary, d cabinClass, Passengers passengers) {
            Intrinsics.checkNotNullParameter(itinerary, "itinerary");
            Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            this.f93226a = itinerary;
            this.f93227b = cabinClass;
            this.f93228c = passengers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Itinerary)) {
                return false;
            }
            Itinerary itinerary = (Itinerary) obj2;
            return Intrinsics.f(this.f93226a, itinerary.f93226a) && this.f93227b == itinerary.f93227b && Intrinsics.f(this.f93228c, itinerary.f93228c);
        }

        public final int hashCode() {
            return this.f93228c.hashCode() + ((this.f93227b.hashCode() + (this.f93226a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93226a, i);
            dest.writeString(this.f93227b.name());
            dest.writeParcelable(this.f93228c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$PastAndCancelledBookings;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PastAndCancelledBookings extends TravelFlightsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PastAndCancelledBookings f93232a = new PastAndCancelledBookings();

        @NotNull
        public static final Parcelable.Creator<PastAndCancelledBookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PastAndCancelledBookings.f93232a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PastAndCancelledBookings[i];
            }
        }

        private PastAndCancelledBookings() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$PostBooking;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostBooking extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PostBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93234b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostBooking(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostBooking[i];
            }
        }

        public PostBooking(String bookingId, String str) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93233a = bookingId;
            this.f93234b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PostBooking)) {
                return false;
            }
            PostBooking postBooking = (PostBooking) obj2;
            return Intrinsics.f(this.f93233a, postBooking.f93233a) && Intrinsics.f(this.f93234b, postBooking.f93234b);
        }

        public final int hashCode() {
            int iHashCode = this.f93233a.hashCode() * 31;
            String str = this.f93234b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93233a);
            dest.writeString(this.f93234b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$SearchResults;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchResults extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SearchResults> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlightSearchQuery f93235a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SearchResults((FlightSearchQuery) parcel.readParcelable(SearchResults.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchResults[i];
            }
        }

        public SearchResults(FlightSearchQuery query) {
            Intrinsics.checkNotNullParameter(query, "query");
            this.f93235a = query;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SearchResults) && Intrinsics.f(this.f93235a, ((SearchResults) obj2).f93235a);
        }

        public final int hashCode() {
            return this.f93235a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93235a, i);
        }
    }

    private TravelFlightsFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step$PassengerDetails;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassengerDetails extends TravelFlightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PassengerDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelFlightsItinerary f93230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Passengers f93231c;
        public final Set d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                TravelFlightsItinerary travelFlightsItinerary = (TravelFlightsItinerary) parcel.readParcelable(PassengerDetails.class.getClassLoader());
                Passengers passengers = (Passengers) parcel.readParcelable(PassengerDetails.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new PassengerDetails(string, travelFlightsItinerary, passengers, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassengerDetails[i];
            }
        }

        public PassengerDetails(String offerId, TravelFlightsItinerary itinerary, Passengers passengers, Set selectedBaggageTokens) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            Intrinsics.checkNotNullParameter(itinerary, "itinerary");
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            Intrinsics.checkNotNullParameter(selectedBaggageTokens, "selectedBaggageTokens");
            this.f93229a = offerId;
            this.f93230b = itinerary;
            this.f93231c = passengers;
            this.d = selectedBaggageTokens;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PassengerDetails)) {
                return false;
            }
            PassengerDetails passengerDetails = (PassengerDetails) obj2;
            return Intrinsics.f(this.f93229a, passengerDetails.f93229a) && Intrinsics.f(this.f93230b, passengerDetails.f93230b) && Intrinsics.f(this.f93231c, passengerDetails.f93231c) && Intrinsics.f(this.d, passengerDetails.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f93231c.hashCode() + ((this.f93230b.hashCode() + (this.f93229a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93229a);
            dest.writeParcelable(this.f93230b, i);
            dest.writeParcelable(this.f93231c, i);
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }

        public PassengerDetails(String str, TravelFlightsItinerary travelFlightsItinerary, Passengers passengers) {
            this(str, travelFlightsItinerary, passengers, h0.f322473a);
        }
    }
}
