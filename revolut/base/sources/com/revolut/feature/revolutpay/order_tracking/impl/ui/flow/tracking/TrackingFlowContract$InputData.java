package com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/order_tracking/impl/ui/flow/tracking/TrackingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "OrderDetails", "TrackingDetails", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/flow/tracking/TrackingFlowContract$InputData$OrderDetails;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/flow/tracking/TrackingFlowContract$InputData$TrackingDetails;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrackingFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/flow/tracking/TrackingFlowContract$InputData$OrderDetails;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/flow/tracking/TrackingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderDetails implements TrackingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OrderDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84613a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderDetails[i];
            }
        }

        public OrderDetails(String orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            this.f84613a = orderId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderDetails) && Intrinsics.f(this.f84613a, ((OrderDetails) obj2).f84613a);
        }

        public final int hashCode() {
            return this.f84613a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84613a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/flow/tracking/TrackingFlowContract$InputData$TrackingDetails;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/flow/tracking/TrackingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackingDetails implements TrackingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TrackingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Delivery f84615b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TrackingDetails(parcel.readString(), (Delivery) parcel.readParcelable(TrackingDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackingDetails[i];
            }
        }

        public TrackingDetails(String orderId, Delivery delivery) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(delivery, "delivery");
            this.f84614a = orderId;
            this.f84615b = delivery;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TrackingDetails)) {
                return false;
            }
            TrackingDetails trackingDetails = (TrackingDetails) obj2;
            return Intrinsics.f(this.f84614a, trackingDetails.f84614a) && Intrinsics.f(this.f84615b, trackingDetails.f84615b);
        }

        public final int hashCode() {
            return this.f84615b.hashCode() + (this.f84614a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84614a);
            dest.writeParcelable(this.f84615b, i);
        }
    }
}
