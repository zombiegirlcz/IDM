package com.revolut.feature.freelancer.impl.ui.sales.refund.screen;

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
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/sales/refund/screen/FreelancerRefundScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Order", "OrderPayment", "Lcom/revolut/feature/freelancer/impl/ui/sales/refund/screen/FreelancerRefundScreenContract$InputData$Order;", "Lcom/revolut/feature/freelancer/impl/ui/sales/refund/screen/FreelancerRefundScreenContract$InputData$OrderPayment;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerRefundScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/refund/screen/FreelancerRefundScreenContract$InputData$Order;", "Lcom/revolut/feature/freelancer/impl/ui/sales/refund/screen/FreelancerRefundScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Order implements FreelancerRefundScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f74207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FreelancerOrder f74208b;

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
            Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
            Intrinsics.checkNotNullParameter(order, "order");
            this.f74207a = amountToRefund;
            this.f74208b = order;
        }

        @Override // com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData
        /* JADX INFO: renamed from: R7, reason: from getter */
        public final d getF74209a() {
            return this.f74207a;
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
            return Intrinsics.f(this.f74207a, order.f74207a) && Intrinsics.f(this.f74208b, order.f74208b);
        }

        public final int hashCode() {
            return this.f74208b.hashCode() + (this.f74207a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74207a);
            dest.writeParcelable(this.f74208b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/refund/screen/FreelancerRefundScreenContract$InputData$OrderPayment;", "Lcom/revolut/feature/freelancer/impl/ui/sales/refund/screen/FreelancerRefundScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderPayment implements FreelancerRefundScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OrderPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f74209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AcquiringOrderPayment f74210b;

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
            Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
            Intrinsics.checkNotNullParameter(orderPayment, "orderPayment");
            this.f74209a = amountToRefund;
            this.f74210b = orderPayment;
        }

        @Override // com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData
        /* JADX INFO: renamed from: R7, reason: from getter */
        public final d getF74209a() {
            return this.f74209a;
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
            return Intrinsics.f(this.f74209a, orderPayment.f74209a) && Intrinsics.f(this.f74210b, orderPayment.f74210b);
        }

        public final int hashCode() {
            return this.f74210b.hashCode() + (this.f74209a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74209a);
            dest.writeParcelable(this.f74210b, i);
        }
    }

    /* JADX INFO: renamed from: R7 */
    d getF74209a();
}
