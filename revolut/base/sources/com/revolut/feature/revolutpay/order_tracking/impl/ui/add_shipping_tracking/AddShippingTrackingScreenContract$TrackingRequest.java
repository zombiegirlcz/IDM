package com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$TrackingRequest", "Landroid/os/Parcelable;", "Add", "Edit", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$TrackingRequest$Add;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$TrackingRequest$Edit;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddShippingTrackingScreenContract$TrackingRequest extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$TrackingRequest$Add;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$TrackingRequest;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Add implements AddShippingTrackingScreenContract$TrackingRequest {

        @NotNull
        public static final Parcelable.Creator<Add> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84604a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Add(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Add[i];
            }
        }

        public Add(String orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            this.f84604a = orderId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Add) && Intrinsics.f(this.f84604a, ((Add) obj2).f84604a);
        }

        public final int hashCode() {
            return this.f84604a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84604a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$TrackingRequest$Edit;", "Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$TrackingRequest;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements AddShippingTrackingScreenContract$TrackingRequest {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Delivery f84606b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit(parcel.readString(), (Delivery) parcel.readParcelable(Edit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(String orderId, Delivery previousTracking) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(previousTracking, "previousTracking");
            this.f84605a = orderId;
            this.f84606b = previousTracking;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj2;
            return Intrinsics.f(this.f84605a, edit.f84605a) && Intrinsics.f(this.f84606b, edit.f84606b);
        }

        public final int hashCode() {
            return this.f84606b.hashCode() + (this.f84605a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84605a);
            dest.writeParcelable(this.f84606b, i);
        }
    }
}
