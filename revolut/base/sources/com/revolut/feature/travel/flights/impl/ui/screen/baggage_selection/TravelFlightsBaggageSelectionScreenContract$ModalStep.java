package com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/baggage_selection/TravelFlightsBaggageSelectionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BaggageInfo", "PriceBreakdown", "Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_selection/TravelFlightsBaggageSelectionScreenContract$ModalStep$BaggageInfo;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_selection/TravelFlightsBaggageSelectionScreenContract$ModalStep$PriceBreakdown;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsBaggageSelectionScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_selection/TravelFlightsBaggageSelectionScreenContract$ModalStep$BaggageInfo;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_selection/TravelFlightsBaggageSelectionScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BaggageInfo extends TravelFlightsBaggageSelectionScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BaggageInfo f93246a = new BaggageInfo();

        @NotNull
        public static final Parcelable.Creator<BaggageInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BaggageInfo.f93246a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BaggageInfo[i];
            }
        }

        private BaggageInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_selection/TravelFlightsBaggageSelectionScreenContract$ModalStep$PriceBreakdown;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_selection/TravelFlightsBaggageSelectionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceBreakdown extends TravelFlightsBaggageSelectionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Payment f93247a;

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
            this.f93247a = payment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PriceBreakdown) && Intrinsics.f(this.f93247a, ((PriceBreakdown) obj2).f93247a);
        }

        public final int hashCode() {
            return this.f93247a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93247a, i);
        }
    }

    private TravelFlightsBaggageSelectionScreenContract$ModalStep() {
    }
}
