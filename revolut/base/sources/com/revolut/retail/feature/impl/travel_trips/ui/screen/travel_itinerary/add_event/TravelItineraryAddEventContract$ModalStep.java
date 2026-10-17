package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DatePicker", "TimePicker", "RemoveItem", "LocationPicker", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep$DatePicker;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep$LocationPicker;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep$RemoveItem;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep$TimePicker;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelItineraryAddEventContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep$DatePicker;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep;", "<init>", "()V", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DatePicker implements TravelItineraryAddEventContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DatePicker f101620a = new DatePicker();

        @NotNull
        public static final Parcelable.Creator<DatePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DatePicker.f101620a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep$LocationPicker;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep;", "<init>", "()V", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LocationPicker implements TravelItineraryAddEventContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationPicker f101621a = new LocationPicker();

        @NotNull
        public static final Parcelable.Creator<LocationPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LocationPicker.f101621a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationPicker[i];
            }
        }

        private LocationPicker() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep$RemoveItem;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveItem implements TravelItineraryAddEventContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RemoveItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelItineraryAddEventContract$RemoveTarget f101622a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveItem((TravelItineraryAddEventContract$RemoveTarget) parcel.readParcelable(RemoveItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveItem[i];
            }
        }

        public RemoveItem(TravelItineraryAddEventContract$RemoveTarget target) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.f101622a = target;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemoveItem) && Intrinsics.f(this.f101622a, ((RemoveItem) obj2).f101622a);
        }

        public final int hashCode() {
            return this.f101622a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101622a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep$TimePicker;", "Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$ModalStep;", "<init>", "()V", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TimePicker implements TravelItineraryAddEventContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimePicker f101623a = new TimePicker();

        @NotNull
        public static final Parcelable.Creator<TimePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TimePicker.f101623a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TimePicker[i];
            }
        }

        private TimePicker() {
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
