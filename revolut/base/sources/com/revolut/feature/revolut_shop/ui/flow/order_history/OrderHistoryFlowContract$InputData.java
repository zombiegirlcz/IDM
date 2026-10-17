package com.revolut.feature.revolut_shop.ui.flow.order_history;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "OrderHistory", "OrderConfirmation", "Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$InputData$OrderConfirmation;", "Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$InputData$OrderHistory;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OrderHistoryFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$InputData$OrderConfirmation;", "Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderConfirmation extends OrderHistoryFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OrderConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84218a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderConfirmation[i];
            }
        }

        public OrderConfirmation(String orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            this.f84218a = orderId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderConfirmation) && Intrinsics.f(this.f84218a, ((OrderConfirmation) obj2).f84218a);
        }

        public final int hashCode() {
            return this.f84218a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84218a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$InputData$OrderHistory;", "Lcom/revolut/feature/revolut_shop/ui/flow/order_history/OrderHistoryFlowContract$InputData;", "<init>", "()V", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderHistory extends OrderHistoryFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderHistory f84219a = new OrderHistory();

        @NotNull
        public static final Parcelable.Creator<OrderHistory> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderHistory.f84219a;
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

    private OrderHistoryFlowContract$InputData() {
    }
}
