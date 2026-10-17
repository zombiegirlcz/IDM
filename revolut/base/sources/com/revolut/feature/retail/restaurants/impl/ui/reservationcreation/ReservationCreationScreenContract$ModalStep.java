package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker.ReservationDatePickerContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker.PartySizePickerContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker.ReservationTimePickerContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DatePicker", "TimePicker", "PartySizePicker", "Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep$DatePicker;", "Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep$PartySizePicker;", "Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep$TimePicker;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReservationCreationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep$DatePicker;", "Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatePicker implements ReservationCreationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReservationDatePickerContract$InputData f82856a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatePicker(ReservationDatePickerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatePicker[i];
            }
        }

        public DatePicker(ReservationDatePickerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f82856a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DatePicker) && Intrinsics.f(this.f82856a, ((DatePicker) obj2).f82856a);
        }

        public final int hashCode() {
            return this.f82856a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f82856a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep$PartySizePicker;", "Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartySizePicker implements ReservationCreationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PartySizePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PartySizePickerContract$InputData f82857a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PartySizePicker(PartySizePickerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartySizePicker[i];
            }
        }

        public PartySizePicker(PartySizePickerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f82857a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PartySizePicker) && Intrinsics.f(this.f82857a, ((PartySizePicker) obj2).f82857a);
        }

        public final int hashCode() {
            return this.f82857a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f82857a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep$TimePicker;", "Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimePicker implements ReservationCreationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TimePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReservationTimePickerContract$InputData f82858a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TimePicker(ReservationTimePickerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TimePicker[i];
            }
        }

        public TimePicker(ReservationTimePickerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f82858a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TimePicker) && Intrinsics.f(this.f82858a, ((TimePicker) obj2).f82858a);
        }

        public final int hashCode() {
            return this.f82858a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f82858a.writeToParcel(dest, i);
        }
    }
}
