package com.revolut.feature.retail.restaurants.impl.ui.confirmreservation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/retail/restaurants/impl/ui/confirmreservation/ConfirmReservationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CustomerDetails", "RevPayPocketSelection", "Lcom/revolut/feature/retail/restaurants/impl/ui/confirmreservation/ConfirmReservationScreenContract$ModalStep$CustomerDetails;", "Lcom/revolut/feature/retail/restaurants/impl/ui/confirmreservation/ConfirmReservationScreenContract$ModalStep$RevPayPocketSelection;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConfirmReservationScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/confirmreservation/ConfirmReservationScreenContract$ModalStep$CustomerDetails;", "Lcom/revolut/feature/retail/restaurants/impl/ui/confirmreservation/ConfirmReservationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomerDetails extends ConfirmReservationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CustomerDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomerDetailsScreenContract$InputData f82834a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomerDetails(CustomerDetailsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomerDetails[i];
            }
        }

        public CustomerDetails(CustomerDetailsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f82834a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomerDetails) && Intrinsics.f(this.f82834a, ((CustomerDetails) obj2).f82834a);
        }

        public final int hashCode() {
            return this.f82834a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f82834a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/confirmreservation/ConfirmReservationScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/feature/retail/restaurants/impl/ui/confirmreservation/ConfirmReservationScreenContract$ModalStep;", "<init>", "()V", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPayPocketSelection extends ConfirmReservationScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPayPocketSelection f82835a = new RevPayPocketSelection();

        @NotNull
        public static final Parcelable.Creator<RevPayPocketSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPayPocketSelection.f82835a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPayPocketSelection[i];
            }
        }

        private RevPayPocketSelection() {
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

    private ConfirmReservationScreenContract$ModalStep() {
    }
}
