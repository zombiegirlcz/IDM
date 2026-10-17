package com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddTracking", "OpenTracking", "FlightDetailsDisclaimer", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep$AddTracking;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep$FlightDetailsDisclaimer;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep$OpenTracking;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep$AddTracking;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddTracking implements OrderDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddTracking f84620a = new AddTracking();

        @NotNull
        public static final Parcelable.Creator<AddTracking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddTracking.f84620a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTracking[i];
            }
        }

        private AddTracking() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep$FlightDetailsDisclaimer;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FlightDetailsDisclaimer implements OrderDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FlightDetailsDisclaimer f84621a = new FlightDetailsDisclaimer();

        @NotNull
        public static final Parcelable.Creator<FlightDetailsDisclaimer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FlightDetailsDisclaimer.f84621a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlightDetailsDisclaimer[i];
            }
        }

        private FlightDetailsDisclaimer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep$OpenTracking;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenTracking implements OrderDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OpenTracking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Delivery f84622a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenTracking((Delivery) parcel.readParcelable(OpenTracking.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenTracking[i];
            }
        }

        public OpenTracking(Delivery delivery) {
            Intrinsics.checkNotNullParameter(delivery, "delivery");
            this.f84622a = delivery;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenTracking) && Intrinsics.f(this.f84622a, ((OpenTracking) obj2).f84622a);
        }

        public final int hashCode() {
            return this.f84622a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84622a, i);
        }
    }
}
