package com.revolut.feature.travel.miles.impl.ui.screen.flight_finder;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OriginPicker", "DestinationPicker", "DatePicker", "RedeemOptionBottomSheet", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep$DatePicker;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep$DestinationPicker;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep$OriginPicker;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep$RedeemOptionBottomSheet;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesFlightFinderScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep$DatePicker;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DatePicker extends TravelMilesFlightFinderScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DatePicker f94284a = new DatePicker();

        @NotNull
        public static final Parcelable.Creator<DatePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DatePicker.f94284a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatePicker[i];
            }
        }

        private DatePicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep$DestinationPicker;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DestinationPicker extends TravelMilesFlightFinderScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DestinationPicker f94285a = new DestinationPicker();

        @NotNull
        public static final Parcelable.Creator<DestinationPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DestinationPicker.f94285a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DestinationPicker[i];
            }
        }

        private DestinationPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep$OriginPicker;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OriginPicker extends TravelMilesFlightFinderScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OriginPicker f94286a = new OriginPicker();

        @NotNull
        public static final Parcelable.Creator<OriginPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OriginPicker.f94286a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OriginPicker[i];
            }
        }

        private OriginPicker() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep$RedeemOptionBottomSheet;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedeemOptionBottomSheet extends TravelMilesFlightFinderScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RedeemOptionBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelMilesRedeemOption f94287a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedeemOptionBottomSheet((TravelMilesRedeemOption) parcel.readParcelable(RedeemOptionBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RedeemOptionBottomSheet[i];
            }
        }

        public RedeemOptionBottomSheet(TravelMilesRedeemOption redeemOption) {
            Intrinsics.checkNotNullParameter(redeemOption, "redeemOption");
            this.f94287a = redeemOption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RedeemOptionBottomSheet) && Intrinsics.f(this.f94287a, ((RedeemOptionBottomSheet) obj2).f94287a);
        }

        public final int hashCode() {
            return this.f94287a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94287a, i);
        }
    }

    private TravelMilesFlightFinderScreenContract$ModalStep() {
    }
}
