package com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DeleteTracking", "EditTracking", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreenContract$ModalStep$DeleteTracking;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreenContract$ModalStep$EditTracking;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ShippingTrackingScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreenContract$ModalStep$DeleteTracking;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreenContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeleteTracking implements ShippingTrackingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteTracking f84633a = new DeleteTracking();

        @NotNull
        public static final Parcelable.Creator<DeleteTracking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeleteTracking.f84633a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteTracking[i];
            }
        }

        private DeleteTracking() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreenContract$ModalStep$EditTracking;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreenContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditTracking implements ShippingTrackingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditTracking f84634a = new EditTracking();

        @NotNull
        public static final Parcelable.Creator<EditTracking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditTracking.f84634a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditTracking[i];
            }
        }

        private EditTracking() {
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
