package com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature_exchange/impl/ui/exchange/order_type_dialog/OrderTypeDialogContract$DialogParcel", "Landroid/os/Parcelable;", "OrderType", "TakeProfitStopLoss", "Lcom/revolut/feature_exchange/impl/ui/exchange/order_type_dialog/OrderTypeDialogContract$DialogParcel$OrderType;", "Lcom/revolut/feature_exchange/impl/ui/exchange/order_type_dialog/OrderTypeDialogContract$DialogParcel$TakeProfitStopLoss;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderTypeDialogContract$DialogParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/order_type_dialog/OrderTypeDialogContract$DialogParcel$OrderType;", "Lcom/revolut/feature_exchange/impl/ui/exchange/order_type_dialog/OrderTypeDialogContract$DialogParcel;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderType implements OrderTypeDialogContract$DialogParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderType f96925a = new OrderType();

        @NotNull
        public static final Parcelable.Creator<OrderType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderType.f96925a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderType[i];
            }
        }

        private OrderType() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/order_type_dialog/OrderTypeDialogContract$DialogParcel$TakeProfitStopLoss;", "Lcom/revolut/feature_exchange/impl/ui/exchange/order_type_dialog/OrderTypeDialogContract$DialogParcel;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TakeProfitStopLoss implements OrderTypeDialogContract$DialogParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TakeProfitStopLoss f96926a = new TakeProfitStopLoss();

        @NotNull
        public static final Parcelable.Creator<TakeProfitStopLoss> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TakeProfitStopLoss.f96926a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TakeProfitStopLoss[i];
            }
        }

        private TakeProfitStopLoss() {
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
