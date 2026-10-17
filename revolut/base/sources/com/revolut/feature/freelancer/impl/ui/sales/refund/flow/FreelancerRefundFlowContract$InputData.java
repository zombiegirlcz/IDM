package com.revolut.feature.freelancer.impl.ui.sales.refund.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/sales/refund/flow/FreelancerRefundFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Order", "OrderPayment", "Lcom/revolut/feature/freelancer/impl/ui/sales/refund/flow/FreelancerRefundFlowContract$InputData$Order;", "Lcom/revolut/feature/freelancer/impl/ui/sales/refund/flow/FreelancerRefundFlowContract$InputData$OrderPayment;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerRefundFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/refund/flow/FreelancerRefundFlowContract$InputData$Order;", "Lcom/revolut/feature/freelancer/impl/ui/sales/refund/flow/FreelancerRefundFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Order implements FreelancerRefundFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerOrder f74201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f74202b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Order((FreelancerOrder) parcel.readParcelable(Order.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Order[i];
            }
        }

        public Order(FreelancerOrder order, d amountToRefund) {
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
            this.f74201a = order;
            this.f74202b = amountToRefund;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Order)) {
                return false;
            }
            Order order = (Order) obj2;
            return Intrinsics.f(this.f74201a, order.f74201a) && Intrinsics.f(this.f74202b, order.f74202b);
        }

        public final int hashCode() {
            return this.f74202b.hashCode() + (this.f74201a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74201a, i);
            dest.writeSerializable(this.f74202b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/refund/flow/FreelancerRefundFlowContract$InputData$OrderPayment;", "Lcom/revolut/feature/freelancer/impl/ui/sales/refund/flow/FreelancerRefundFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderPayment implements FreelancerRefundFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OrderPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AcquiringOrderPayment f74203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f74204b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderPayment((AcquiringOrderPayment) parcel.readParcelable(OrderPayment.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderPayment[i];
            }
        }

        public OrderPayment(AcquiringOrderPayment orderPayment, d amountToRefund) {
            Intrinsics.checkNotNullParameter(orderPayment, "orderPayment");
            Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
            this.f74203a = orderPayment;
            this.f74204b = amountToRefund;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderPayment)) {
                return false;
            }
            OrderPayment orderPayment = (OrderPayment) obj2;
            return Intrinsics.f(this.f74203a, orderPayment.f74203a) && Intrinsics.f(this.f74204b, orderPayment.f74204b);
        }

        public final int hashCode() {
            return this.f74204b.hashCode() + (this.f74203a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74203a, i);
            dest.writeSerializable(this.f74204b);
        }
    }
}
