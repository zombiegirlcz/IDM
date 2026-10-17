package com.revolut.feature.travel.flights.impl.ui.screen.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PocketSelection", "ItineraryPreview", "BookingContact", "PriceChanged", "PriceBreakdown", "SelfTransfer", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$BookingContact;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$ItineraryPreview;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$PocketSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$PriceBreakdown;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$PriceChanged;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$SelfTransfer;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelFlightsCheckoutScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$BookingContact;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingContact implements TravelFlightsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BookingContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PhoneNumber f93300b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingContact(parcel.readString(), (PhoneNumber) parcel.readParcelable(BookingContact.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingContact[i];
            }
        }

        public BookingContact(String email, PhoneNumber phoneNumber) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f93299a = email;
            this.f93300b = phoneNumber;
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
            return Intrinsics.f(this.f93299a, bookingContact.f93299a) && Intrinsics.f(this.f93300b, bookingContact.f93300b);
        }

        public final int hashCode() {
            return this.f93300b.hashCode() + (this.f93299a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93299a);
            dest.writeParcelable(this.f93300b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$ItineraryPreview;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItineraryPreview implements TravelFlightsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ItineraryPreview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f93301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f93303c;

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
            this.f93301a = bounds;
            this.f93302b = i;
            this.f93303c = z;
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
            return this.f93301a.equals(itineraryPreview.f93301a) && this.f93302b == itineraryPreview.f93302b && this.f93303c == itineraryPreview.f93303c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93303c) + j6.a.b(this.f93302b, this.f93301a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f93301a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeInt(this.f93302b);
            dest.writeInt(this.f93303c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$PocketSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketSelection implements TravelFlightsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PocketSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f93304a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketSelection((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketSelection[i];
            }
        }

        public PocketSelection(d price) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.f93304a = price;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PocketSelection) && Intrinsics.f(this.f93304a, ((PocketSelection) obj2).f93304a);
        }

        public final int hashCode() {
            return this.f93304a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93304a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$PriceBreakdown;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceBreakdown implements TravelFlightsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Payment f93305a;

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
            this.f93305a = payment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PriceBreakdown) && Intrinsics.f(this.f93305a, ((PriceBreakdown) obj2).f93305a);
        }

        public final int hashCode() {
            return this.f93305a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93305a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$PriceChanged;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceChanged implements TravelFlightsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PriceChanged> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93306a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PriceChanged(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceChanged[i];
            }
        }

        public PriceChanged(boolean z) {
            this.f93306a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PriceChanged) && this.f93306a == ((PriceChanged) obj2).f93306a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93306a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93306a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep$SelfTransfer;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelfTransfer implements TravelFlightsCheckoutScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelfTransfer f93307a = new SelfTransfer();

        @NotNull
        public static final Parcelable.Creator<SelfTransfer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelfTransfer.f93307a;
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
}
