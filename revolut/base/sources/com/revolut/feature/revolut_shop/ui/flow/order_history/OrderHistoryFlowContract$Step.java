package com.revolut.feature.revolut_shop.ui.flow.order_history;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OrderHistory", "OrderConfirmation", "Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$Step$OrderConfirmation;", "Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$Step$OrderHistory;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OrderHistoryFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$Step$OrderConfirmation;", "Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderConfirmation extends OrderHistoryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OrderConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84221b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderConfirmation(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderConfirmation[i];
            }
        }

        public OrderConfirmation(String orderId, boolean z) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            this.f84220a = orderId;
            this.f84221b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderConfirmation)) {
                return false;
            }
            OrderConfirmation orderConfirmation = (OrderConfirmation) obj2;
            return Intrinsics.f(this.f84220a, orderConfirmation.f84220a) && this.f84221b == orderConfirmation.f84221b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84221b) + (this.f84220a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84220a);
            dest.writeInt(this.f84221b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$Step$OrderHistory;", "Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$Step;", "<init>", "()V", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderHistory extends OrderHistoryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderHistory f84222a = new OrderHistory();

        @NotNull
        public static final Parcelable.Creator<OrderHistory> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderHistory.f84222a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderHistory[i];
            }
        }

        private OrderHistory() {
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

    private OrderHistoryFlowContract$Step() {
    }
}
