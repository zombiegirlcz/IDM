package com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectCarrier", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$ModalStep$SelectCarrier;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddShippingTrackingScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$ModalStep$SelectCarrier;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectCarrier implements AddShippingTrackingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectCarrier f84603a = new SelectCarrier();

        @NotNull
        public static final Parcelable.Creator<SelectCarrier> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectCarrier.f84603a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectCarrier[i];
            }
        }

        private SelectCarrier() {
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
